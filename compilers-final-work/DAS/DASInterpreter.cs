using Antlr4.Runtime.Misc;
using Antlr4.Runtime.Tree;
using Grammar;

namespace Interpreter.DAS
{
    public class Simbolo
    {
        public string Type { get; set; }
        public string Id { get; set; }
        public object Value { get; set; }

        public Simbolo(string type, string id, object value = null)
        {
            Type = type;
            Id = id;
            Value = value;
        }
    }

    public class DASInterpreter : DASBaseVisitor<object?>
    {
        public Boolean HasErrors { get; private set; } = false;
        public List<string> ErrorMessages { get; private set; } = new List<string>();
        private Dictionary<string, IParseTree> _functions;

        public DASInterpreter(Dictionary<string, IParseTree> functions)
        {
            this._functions = functions;
        }

        public Dictionary<string, Simbolo> Variables { get; protected set; } = new Dictionary<string, Simbolo>();

        #region I/O Statements

        public override object? VisitInputRead([NotNull] DASParser.InputReadContext context)
        {
            var input = Console.ReadLine();
            
            if (!String.IsNullOrEmpty(input))
            {
                string varName = context.VAR().GetText();
                string varType = context.tipo().GetText();
                if (varType == "numero")
                {
                    if (!double.TryParse(input, out double doubleValue))
                    {   
                        HasErrors = true;
                        while(HasErrors == true){
                             ErrorMessages.Add($"O input '{input}' não é um número válido");
                             Console.WriteLine(ErrorMessages[ErrorMessages.Count - 1]);
                             Console.WriteLine("Variável " + "'" + varName + "'" + " só aceita inputs do tipo " + "'" + varType + "'");
                             Console.WriteLine("Por favor, digite um "+varType+ " válido");
                            input = Console.ReadLine();
                            if(double.TryParse(input, out doubleValue)){
                                HasErrors = false;
                            }
                            double.TryParse(input, out doubleValue);
                            Variables[varName] = new Simbolo(context.tipo().GetText(), varName, doubleValue);
                        }
                    }else{
                        Variables[varName] = new Simbolo(context.tipo().GetText(), varName, doubleValue);
                    }

                }else if(varType == "texto")
                {
                    if(double.TryParse(input, out double doubleValue))
                    {
                        HasErrors = true;
                        while(HasErrors == true){
                             ErrorMessages.Add($"O input '{input}' não é um texto válido");
                             Console.WriteLine(ErrorMessages[ErrorMessages.Count - 1]);
                             Console.WriteLine("Variável " + "'" + varName + "'" + " só aceita inputs do tipo " + "'" + varType + "'");
                             Console.WriteLine("Por favor, digite um "+varType+ " válido");
                            input = Console.ReadLine();
                            if(!double.TryParse(input, out doubleValue)){
                                HasErrors = false;
                            }
                            Variables[varName] = new Simbolo(context.tipo().GetText(), varName, input);
                        }
                    }else{
                        Variables[varName] = new Simbolo(context.tipo().GetText(), varName, input);
                    }
                    
                }
            }
            
            

            return null;
        }


        public override object? VisitOutputWriteVar([NotNull] DASParser.OutputWriteVarContext context)
        {
            //Console.WriteLine("VisitOutputWriteVar");
            var varName = context.VAR().GetText();
            if (Variables.ContainsKey(varName))
                Console.WriteLine(Variables[varName].Value);
            else
                Console.WriteLine("Variable " + varName + " is not defined");
            return null;
        }

        public override object? VisitOutputWriteStr([NotNull] DASParser.OutputWriteStrContext context)
        {
            //Console.WriteLine("VisitOutputWriteStr");
            var varName = context.STR().GetText();
            Console.WriteLine(varName.Replace("\"", ""));
            return null;
        }

        public override object? VisitOutputWriteExpr([NotNull] DASParser.OutputWriteExprContext context)
        {
            //Console.WriteLine("VisitOutputWriteExpr");
            object? v = Visit(context.expr());
            if (v != null)
                Console.WriteLine(v);
            return null;
        }
        #endregion

        #region Variable and Expression Statements
        protected (Double, Double) GetDoubles(IParseTree tree1, IParseTree tree2)
        {
            //Console.WriteLine("GetDoubles");
            var t1 = Visit(tree1);
            var t2 = Visit(tree2);
            Double.TryParse(t1?.ToString(), out var d1);
            Double.TryParse(t2?.ToString(), out var d2);
            return (d1, d2);
        }

        public override object? VisitAtribVar([NotNull] DASParser.AtribVarContext context)
        {
            //Console.WriteLine("VisitAtribVar");
            var varName = context.VAR().GetText();
            var value = Visit(context.expr());
            if (value != null)
            {
                if (Variables.ContainsKey(varName))
                    Variables[varName].Value = value;
                else
                    Variables[varName] = new Simbolo("numero", varName, value);
            }
            return null;
        }

        public override object VisitExprPlus([NotNull] DASParser.ExprPlusContext context)
        {
            //Console.WriteLine("VisitExprPlus");
            var d = GetDoubles(context.term(), context.expr());
            return d.Item1 + d.Item2;
        }

        public override object VisitExprMinus([NotNull] DASParser.ExprMinusContext context)
        {
            //Console.WriteLine("VisitExprMinus");
            var d = GetDoubles(context.term(), context.expr());
            return d.Item1 - d.Item2;
        }

        public override object? VisitExprTerm([NotNull] DASParser.ExprTermContext context)
        {
            //Console.WriteLine("VisitExprTerm");
            return Visit(context.term());
        }

        public override object? VisitTermMult([NotNull] DASParser.TermMultContext context)
        {
            //Console.WriteLine("VisitTermMult");
            var d = GetDoubles(context.factor(), context.term());
            return d.Item1 * d.Item2;
        }

        public override object? VisitTermDiv([NotNull] DASParser.TermDivContext context)
        {
            //Console.WriteLine("VisitTermDiv");
            var d = GetDoubles(context.factor(), context.term());
            return d.Item1 / d.Item2;
        }

        public override object? VisitTermFactor([NotNull] DASParser.TermFactorContext context)
        {
            //Console.WriteLine("VisitTermFactor");
            return Visit(context.factor());
        }

        public override object? VisitFactorVar([NotNull] DASParser.FactorVarContext context)
        {
            //Console.WriteLine("VisitFactorVar");
            var varName = context.VAR().GetText();
            if (Variables.ContainsKey(varName))
                return Variables[varName].Value;

            //Console.WriteLine("Variable " + varName + " is not defined");
            return null;
        }

        public override object? VisitFactorNum([NotNull] DASParser.FactorNumContext context)
        {
            //Console.WriteLine("VisitFactorNum");
            var txtNum = context.NUM().GetText();
            return Double.Parse(txtNum);
        }

        public override object? VisitFactorExpr([NotNull] DASParser.FactorExprContext context)
        {
            //Console.WriteLine("VisitFactorExpr");
            return Visit(context.expr());
        }
        #endregion

        #region Control Statements
        public override object? VisitIfstIf([NotNull] DASParser.IfstIfContext context)
        {
            //Console.WriteLine("VisitIfstIf");
            var cond = Visit(context.cond());
            if (cond != null && (bool)cond)
                Visit(context.block());
            return null;
        }

        public override object? VisitIfstIfElse([NotNull] DASParser.IfstIfElseContext context)
        {
            //Console.WriteLine("VisitIfstIfElse");
            var cond = Visit(context.cond());
            if (cond != null && (bool)cond)
                Visit(context.b1);
            else
                Visit(context.b2);
            return null;
        }

        public override object? VisitWhilestWhile([NotNull] DASParser.WhilestWhileContext context)
        {
            //Console.WriteLine("VisitWhilestWhile");
            var cond = Visit(context.cond());
            while (cond != null && (bool)cond)
            {
                Visit(context.block());
                cond = Visit(context.cond());
            }
            return null;
        }
        public override object? VisitWhilestDoWhile([NotNull] DASParser.WhilestDoWhileContext context)
        {
            //Console.WriteLine("VisitWhilestDoWhile");
            var cond = Visit(context.cond());
            do
            {
                Visit(context.block());
                cond = Visit(context.cond());
            } while (cond != null && (bool)cond);
            return null;
        }

        public override object? VisitForstFor([NotNull] DASParser.ForstForContext context)
        {
            foreach (var atrib in context.atrib())
            {
                Visit(atrib);
            }

            var cond = Visit(context.cond());
            //quando acabar o for, o cond é null
            while (cond != null && (bool)cond)
            {
                Visit(context.block());
                Visit(context.atrib(1));
                cond = Visit(context.cond());
            }
            return null;
        }

        // public override object? VisitForstFor(DASParser.ForstForContext context)
        // {
        //     // Extrair as informações do contexto
        //     var atrib1 = context.atrib(0);
        //     var cond = context.cond();
        //     var atrib2 = context.atrib(1);
        //     var block = context.block();

        //     // Visitar as expressões correspondentes
        //     var start = Visit(atrib1);
        //     var end = Visit(cond);
        //     var step = Visit(atrib2);

        //     if (start != null && end != null && step != null)
        //     {

        //         double startValue = (double)start;
        //         double endValue = (double)end;
        //         double stepValue = (double)step;

        //         for (var i = startValue; i < endValue; i += stepValue)
        //         {
        //             // Executar o bloco do for
        //              Visit(context.block());
        //         }
        //     }else if (start == null || end == null || step == null){
        //         Console.WriteLine("Erro no for");
        //     }

        //     // Passar para o próximo bloco de código
        //     return null;
        // }





        public override object? VisitCondExpr([NotNull] DASParser.CondExprContext context)
        {
            //Console.WriteLine("VisitCondExpr");
            object? v = Visit(context.expr());
            return v != null && (Double)v != 0;
        }

        public override object? VisitCondRelop([NotNull] DASParser.CondRelopContext context)
        {
            //Console.WriteLine("VisitCondRelop");
            var d = GetDoubles(context.e1, context.e2);
            switch (context.RELOP.Type)
            {
                case DASLexer.EQ:
                    return d.Item1 == d.Item2;
                case DASLexer.NE:
                    return d.Item1 != d.Item2;
                case DASLexer.LT:
                    return d.Item1 < d.Item2;
                case DASLexer.LE:
                    return d.Item1 <= d.Item2;
                case DASLexer.GT:
                    return d.Item1 > d.Item2;
                case DASLexer.GE:
                    return d.Item1 >= d.Item2;
            }
            return null;
        }

        public override object? VisitCondAnd([NotNull] DASParser.CondAndContext context)
        {
            //Console.WriteLine("VisitCondAnd");
            object? v1 = Visit(context.c1);
            object? v2 = Visit(context.c2);
            return v1 != null && v2 != null && (bool)v1 && (bool)v2;
        }

        public override object? VisitCondOr([NotNull] DASParser.CondOrContext context)
        {
            //Console.WriteLine("VisitCondOr");
            object? v1 = Visit(context.c1);
            object? v2 = Visit(context.c2);
            return v1 != null && (bool)v1 || v2 != null && (bool)v2;
        }

        public override object? VisitCondNot([NotNull] DASParser.CondNotContext context)
        {
            object? v = Visit(context.cond());
            return v != null && !(bool)v;
        }
        #endregion

        #region Functions

        public override object? VisitFuncInvocLine([NotNull] DASParser.FuncInvocLineContext context)
        {
            //Console.WriteLine("VisitFuncInvocLine");
            var funcName = context.VAR().GetText();
            var function = _functions[funcName];

            if (function != null)
            {
                return Visit(function);
            }

            return null;
        }

        #endregion

    }
}