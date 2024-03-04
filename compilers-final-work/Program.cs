using Antlr4.Runtime;
using Antlr4.Runtime.Tree;
using Interpreter.DAS;
using Grammar;

internal class Program
{
    private static void Main(string[] args)
    {
        //LEXER
        //### input        
        var inputStream = new AntlrFileStream("input.DAS");
        //var inputStream = new AntlrFileStream(args[0]);
        //### lexer
        var lexer = new DASLexer(inputStream);

        //PARSER
        //### tokens
        var tokenStream = new BufferedTokenStream(lexer);
        //### parser
        var parser = new DASParser(tokenStream);

        //### error listener
        var errorListener = new DASErrorListener();
        parser.RemoveErrorListeners();
        parser.AddErrorListener(errorListener);
        //### error handling
        //parser.ErrorHandler = new BailErrorStrategy();
        parser.ErrorHandler = new DefaultErrorStrategy();


        //### semantic listener
        var semanticListener = new SemanticDASListener();
        parser.RemoveParseListeners();
        parser.AddParseListener(semanticListener);

        

        //### parse
        IParseTree? tree = null;
        try
        {
            tree = parser.prog();
            // se der certo printa
            Console.WriteLine("Compilado com sucesso!!");
            if (errorListener.HasErrors){
                Console.WriteLine("Errors!");
                errorListener.ErrorMessages.ForEach(e => Console.WriteLine(e));
                tree = null;
            }
            if (semanticListener.HasErrors){
                Console.WriteLine("Semantic Errors!");
                semanticListener.ErrorMessages.ForEach(e => Console.WriteLine(e));
                tree = null;
            }
            
        }
        catch (Exception e)
        {
            Console.WriteLine(e);
        }

       // Console.WriteLine("##### FUNCTIONS");
       // semanticListener.Functions.Keys.ToList().ForEach(f => Console.WriteLine(f));

        //### execute
        if (tree != null)
        {
            var interpreter = new DASInterpreter(semanticListener.Functions);
            interpreter.Visit(tree);
        }

    }
}