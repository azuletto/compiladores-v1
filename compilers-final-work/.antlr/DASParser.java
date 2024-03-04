// Generated from c:/Users/andre/Downloads/BLG-Compiler-main/C#-Aula/compilers-final-work/DAS.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class DASParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, OE=5, CE=6, OB=7, CB=8, AT=9, SEP=10, 
		PLUS=11, MINUS=12, MULT=13, DIV=14, AND=15, OR=16, NOT=17, EQ=18, LT=19, 
		GT=20, LE=21, GE=22, NE=23, BOOL_TRUE=24, BOL_FALSE=25, IF=26, WHILE=27, 
		DO=28, FOR=29, FUNCTION=30, RETURN=31, THEN=32, ELSE=33, WRITE=34, READ=35, 
		STR=36, EOL=37, NUM=38, VAR=39, COMMENT=40, WS=41;
	public static final int
		RULE_prog = 0, RULE_functions = 1, RULE_function = 2, RULE_fnBlock = 3, 
		RULE_fnBody = 4, RULE_params = 5, RULE_line = 6, RULE_funcInvoc = 7, RULE_stmt = 8, 
		RULE_input = 9, RULE_output = 10, RULE_tipo = 11, RULE_ifst = 12, RULE_whilest = 13, 
		RULE_forst = 14, RULE_block = 15, RULE_cond = 16, RULE_atrib = 17, RULE_expr = 18, 
		RULE_term = 19, RULE_factor = 20;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "functions", "function", "fnBlock", "fnBody", "params", "line", 
			"funcInvoc", "stmt", "input", "output", "tipo", "ifst", "whilest", "forst", 
			"block", "cond", "atrib", "expr", "term", "factor"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'{'", "'}'", "'numero'", "'texto'", "'('", "')'", "'START'", "'END'", 
			"'='", "','", "'+'", "'-'", "'*'", "'/'", "'&&'", "'||'", "'!'", "'=='", 
			"'<'", "'>'", "'<='", "'>='", "'!='", "'true'", "'false'", null, null, 
			null, null, null, null, null, null, null, null, null, "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, "OE", "CE", "OB", "CB", "AT", "SEP", "PLUS", 
			"MINUS", "MULT", "DIV", "AND", "OR", "NOT", "EQ", "LT", "GT", "LE", "GE", 
			"NE", "BOOL_TRUE", "BOL_FALSE", "IF", "WHILE", "DO", "FOR", "FUNCTION", 
			"RETURN", "THEN", "ELSE", "WRITE", "READ", "STR", "EOL", "NUM", "VAR", 
			"COMMENT", "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "DAS.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public DASParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgContext extends ParserRuleContext {
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
	 
		public ProgContext() { }
		public void copyFrom(ProgContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ProgLineContext extends ProgContext {
		public FunctionsContext functions() {
			return getRuleContext(FunctionsContext.class,0);
		}
		public List<LineContext> line() {
			return getRuleContexts(LineContext.class);
		}
		public LineContext line(int i) {
			return getRuleContext(LineContext.class,i);
		}
		public ProgLineContext(ProgContext ctx) { copyFrom(ctx); }
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		int _la;
		try {
			_localctx = new ProgLineContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(42);
			functions();
			setState(44); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(43);
				line();
				}
				}
				setState(46); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 705381269528L) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionsContext extends ParserRuleContext {
		public FunctionContext function() {
			return getRuleContext(FunctionContext.class,0);
		}
		public FunctionsContext functions() {
			return getRuleContext(FunctionsContext.class,0);
		}
		public FunctionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functions; }
	}

	public final FunctionsContext functions() throws RecognitionException {
		FunctionsContext _localctx = new FunctionsContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_functions);
		try {
			setState(52);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FUNCTION:
				enterOuterAlt(_localctx, 1);
				{
				setState(48);
				function();
				setState(49);
				functions();
				}
				break;
			case T__2:
			case T__3:
			case IF:
			case WHILE:
			case DO:
			case FOR:
			case WRITE:
			case EOL:
			case VAR:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionContext extends ParserRuleContext {
		public TerminalNode FUNCTION() { return getToken(DASParser.FUNCTION, 0); }
		public TerminalNode VAR() { return getToken(DASParser.VAR, 0); }
		public TerminalNode OE() { return getToken(DASParser.OE, 0); }
		public ParamsContext params() {
			return getRuleContext(ParamsContext.class,0);
		}
		public TerminalNode CE() { return getToken(DASParser.CE, 0); }
		public FnBlockContext fnBlock() {
			return getRuleContext(FnBlockContext.class,0);
		}
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_function);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(54);
			match(FUNCTION);
			setState(55);
			match(VAR);
			setState(56);
			match(OE);
			setState(57);
			params();
			setState(58);
			match(CE);
			setState(59);
			fnBlock();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FnBlockContext extends ParserRuleContext {
		public FnBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fnBlock; }
	 
		public FnBlockContext() { }
		public void copyFrom(FnBlockContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FnBlockLineContext extends FnBlockContext {
		public FnBodyContext fnBody() {
			return getRuleContext(FnBodyContext.class,0);
		}
		public FnBlockLineContext(FnBlockContext ctx) { copyFrom(ctx); }
	}

	public final FnBlockContext fnBlock() throws RecognitionException {
		FnBlockContext _localctx = new FnBlockContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_fnBlock);
		try {
			_localctx = new FnBlockLineContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(61);
			match(T__0);
			setState(62);
			fnBody();
			setState(63);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FnBodyContext extends ParserRuleContext {
		public FnBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fnBody; }
	 
		public FnBodyContext() { }
		public void copyFrom(FnBodyContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FnReturnLineContext extends FnBodyContext {
		public TerminalNode RETURN() { return getToken(DASParser.RETURN, 0); }
		public TerminalNode EOL() { return getToken(DASParser.EOL, 0); }
		public FnReturnLineContext(FnBodyContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FnBodyLineContext extends FnBodyContext {
		public LineContext line() {
			return getRuleContext(LineContext.class,0);
		}
		public FnBodyLineContext(FnBodyContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FnReturnExprLineContext extends FnBodyContext {
		public TerminalNode RETURN() { return getToken(DASParser.RETURN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode EOL() { return getToken(DASParser.EOL, 0); }
		public FnReturnExprLineContext(FnBodyContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FnBodyLineMoreContext extends FnBodyContext {
		public LineContext line() {
			return getRuleContext(LineContext.class,0);
		}
		public FnBodyContext fnBody() {
			return getRuleContext(FnBodyContext.class,0);
		}
		public FnBodyLineMoreContext(FnBodyContext ctx) { copyFrom(ctx); }
	}

	public final FnBodyContext fnBody() throws RecognitionException {
		FnBodyContext _localctx = new FnBodyContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_fnBody);
		try {
			setState(75);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				_localctx = new FnBodyLineContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(65);
				line();
				}
				break;
			case 2:
				_localctx = new FnBodyLineMoreContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(66);
				line();
				setState(67);
				fnBody();
				}
				break;
			case 3:
				_localctx = new FnReturnExprLineContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(69);
				match(RETURN);
				setState(70);
				expr();
				setState(71);
				match(EOL);
				}
				break;
			case 4:
				_localctx = new FnReturnLineContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(73);
				match(RETURN);
				setState(74);
				match(EOL);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ParamsContext extends ParserRuleContext {
		public TerminalNode VAR() { return getToken(DASParser.VAR, 0); }
		public TerminalNode SEP() { return getToken(DASParser.SEP, 0); }
		public ParamsContext params() {
			return getRuleContext(ParamsContext.class,0);
		}
		public ParamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_params; }
	}

	public final ParamsContext params() throws RecognitionException {
		ParamsContext _localctx = new ParamsContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_params);
		try {
			setState(82);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(77);
				match(VAR);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(78);
				match(VAR);
				setState(79);
				match(SEP);
				setState(80);
				params();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LineContext extends ParserRuleContext {
		public LineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_line; }
	 
		public LineContext() { }
		public void copyFrom(LineContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LineWhileContext extends LineContext {
		public WhilestContext whilest() {
			return getRuleContext(WhilestContext.class,0);
		}
		public LineWhileContext(LineContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LineEOLContext extends LineContext {
		public TerminalNode EOL() { return getToken(DASParser.EOL, 0); }
		public LineEOLContext(LineContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LineStmtContext extends LineContext {
		public StmtContext stmt() {
			return getRuleContext(StmtContext.class,0);
		}
		public TerminalNode EOL() { return getToken(DASParser.EOL, 0); }
		public LineStmtContext(LineContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LineIfContext extends LineContext {
		public IfstContext ifst() {
			return getRuleContext(IfstContext.class,0);
		}
		public LineIfContext(LineContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LineForContext extends LineContext {
		public ForstContext forst() {
			return getRuleContext(ForstContext.class,0);
		}
		public LineForContext(LineContext ctx) { copyFrom(ctx); }
	}

	public final LineContext line() throws RecognitionException {
		LineContext _localctx = new LineContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_line);
		try {
			setState(91);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
			case T__3:
			case WRITE:
			case VAR:
				_localctx = new LineStmtContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(84);
				stmt();
				setState(85);
				match(EOL);
				}
				break;
			case IF:
				_localctx = new LineIfContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(87);
				ifst();
				}
				break;
			case WHILE:
			case DO:
				_localctx = new LineWhileContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(88);
				whilest();
				}
				break;
			case FOR:
				_localctx = new LineForContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(89);
				forst();
				}
				break;
			case EOL:
				_localctx = new LineEOLContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(90);
				match(EOL);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FuncInvocContext extends ParserRuleContext {
		public FuncInvocContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcInvoc; }
	 
		public FuncInvocContext() { }
		public void copyFrom(FuncInvocContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FuncInvocLineContext extends FuncInvocContext {
		public TerminalNode VAR() { return getToken(DASParser.VAR, 0); }
		public TerminalNode OE() { return getToken(DASParser.OE, 0); }
		public ParamsContext params() {
			return getRuleContext(ParamsContext.class,0);
		}
		public TerminalNode CE() { return getToken(DASParser.CE, 0); }
		public FuncInvocLineContext(FuncInvocContext ctx) { copyFrom(ctx); }
	}

	public final FuncInvocContext funcInvoc() throws RecognitionException {
		FuncInvocContext _localctx = new FuncInvocContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_funcInvoc);
		try {
			_localctx = new FuncInvocLineContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(93);
			match(VAR);
			setState(94);
			match(OE);
			setState(95);
			params();
			setState(96);
			match(CE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StmtContext extends ParserRuleContext {
		public StmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt; }
	 
		public StmtContext() { }
		public void copyFrom(StmtContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StmtOutputContext extends StmtContext {
		public OutputContext output() {
			return getRuleContext(OutputContext.class,0);
		}
		public StmtOutputContext(StmtContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StmtInputContext extends StmtContext {
		public InputContext input() {
			return getRuleContext(InputContext.class,0);
		}
		public StmtInputContext(StmtContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StmtAtribContext extends StmtContext {
		public AtribContext atrib() {
			return getRuleContext(AtribContext.class,0);
		}
		public StmtAtribContext(StmtContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LineFuncInvocContext extends StmtContext {
		public FuncInvocContext funcInvoc() {
			return getRuleContext(FuncInvocContext.class,0);
		}
		public LineFuncInvocContext(StmtContext ctx) { copyFrom(ctx); }
	}

	public final StmtContext stmt() throws RecognitionException {
		StmtContext _localctx = new StmtContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_stmt);
		try {
			setState(102);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				_localctx = new StmtAtribContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(98);
				atrib();
				}
				break;
			case 2:
				_localctx = new StmtInputContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(99);
				input();
				}
				break;
			case 3:
				_localctx = new StmtOutputContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(100);
				output();
				}
				break;
			case 4:
				_localctx = new LineFuncInvocContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(101);
				funcInvoc();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class InputContext extends ParserRuleContext {
		public InputContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_input; }
	 
		public InputContext() { }
		public void copyFrom(InputContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class InputReadContext extends InputContext {
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public TerminalNode READ() { return getToken(DASParser.READ, 0); }
		public TerminalNode VAR() { return getToken(DASParser.VAR, 0); }
		public InputReadContext(InputContext ctx) { copyFrom(ctx); }
	}

	public final InputContext input() throws RecognitionException {
		InputContext _localctx = new InputContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_input);
		try {
			_localctx = new InputReadContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(104);
			tipo();
			setState(105);
			match(READ);
			setState(106);
			match(VAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class OutputContext extends ParserRuleContext {
		public OutputContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_output; }
	 
		public OutputContext() { }
		public void copyFrom(OutputContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class OutputWriteStrContext extends OutputContext {
		public TerminalNode WRITE() { return getToken(DASParser.WRITE, 0); }
		public TerminalNode STR() { return getToken(DASParser.STR, 0); }
		public OutputWriteStrContext(OutputContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class OutputWriteVarContext extends OutputContext {
		public TerminalNode WRITE() { return getToken(DASParser.WRITE, 0); }
		public TerminalNode VAR() { return getToken(DASParser.VAR, 0); }
		public OutputWriteVarContext(OutputContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class OutputWriteExprContext extends OutputContext {
		public TerminalNode WRITE() { return getToken(DASParser.WRITE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public OutputWriteExprContext(OutputContext ctx) { copyFrom(ctx); }
	}

	public final OutputContext output() throws RecognitionException {
		OutputContext _localctx = new OutputContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_output);
		try {
			setState(114);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				_localctx = new OutputWriteVarContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(108);
				match(WRITE);
				setState(109);
				match(VAR);
				}
				break;
			case 2:
				_localctx = new OutputWriteStrContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(110);
				match(WRITE);
				setState(111);
				match(STR);
				}
				break;
			case 3:
				_localctx = new OutputWriteExprContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(112);
				match(WRITE);
				setState(113);
				expr();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TipoContext extends ParserRuleContext {
		public TipoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo; }
	 
		public TipoContext() { }
		public void copyFrom(TipoContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TipoNumeroContext extends TipoContext {
		public TipoNumeroContext(TipoContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TipoTextoContext extends TipoContext {
		public TipoTextoContext(TipoContext ctx) { copyFrom(ctx); }
	}

	public final TipoContext tipo() throws RecognitionException {
		TipoContext _localctx = new TipoContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_tipo);
		try {
			setState(118);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
				_localctx = new TipoNumeroContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(116);
				match(T__2);
				}
				break;
			case T__3:
				_localctx = new TipoTextoContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(117);
				match(T__3);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IfstContext extends ParserRuleContext {
		public IfstContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifst; }
	 
		public IfstContext() { }
		public void copyFrom(IfstContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IfstIfElseContext extends IfstContext {
		public BlockContext b1;
		public BlockContext b2;
		public TerminalNode IF() { return getToken(DASParser.IF, 0); }
		public TerminalNode OE() { return getToken(DASParser.OE, 0); }
		public CondContext cond() {
			return getRuleContext(CondContext.class,0);
		}
		public TerminalNode CE() { return getToken(DASParser.CE, 0); }
		public TerminalNode THEN() { return getToken(DASParser.THEN, 0); }
		public TerminalNode ELSE() { return getToken(DASParser.ELSE, 0); }
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public IfstIfElseContext(IfstContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IfstIfContext extends IfstContext {
		public TerminalNode IF() { return getToken(DASParser.IF, 0); }
		public TerminalNode OE() { return getToken(DASParser.OE, 0); }
		public CondContext cond() {
			return getRuleContext(CondContext.class,0);
		}
		public TerminalNode CE() { return getToken(DASParser.CE, 0); }
		public TerminalNode THEN() { return getToken(DASParser.THEN, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public IfstIfContext(IfstContext ctx) { copyFrom(ctx); }
	}

	public final IfstContext ifst() throws RecognitionException {
		IfstContext _localctx = new IfstContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_ifst);
		try {
			setState(136);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				_localctx = new IfstIfContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(120);
				match(IF);
				setState(121);
				match(OE);
				setState(122);
				cond(0);
				setState(123);
				match(CE);
				setState(124);
				match(THEN);
				setState(125);
				block();
				}
				break;
			case 2:
				_localctx = new IfstIfElseContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(127);
				match(IF);
				setState(128);
				match(OE);
				setState(129);
				cond(0);
				setState(130);
				match(CE);
				setState(131);
				match(THEN);
				setState(132);
				((IfstIfElseContext)_localctx).b1 = block();
				setState(133);
				match(ELSE);
				setState(134);
				((IfstIfElseContext)_localctx).b2 = block();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class WhilestContext extends ParserRuleContext {
		public WhilestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whilest; }
	 
		public WhilestContext() { }
		public void copyFrom(WhilestContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class WhilestDoWhileContext extends WhilestContext {
		public TerminalNode DO() { return getToken(DASParser.DO, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode WHILE() { return getToken(DASParser.WHILE, 0); }
		public TerminalNode OE() { return getToken(DASParser.OE, 0); }
		public CondContext cond() {
			return getRuleContext(CondContext.class,0);
		}
		public TerminalNode CE() { return getToken(DASParser.CE, 0); }
		public WhilestDoWhileContext(WhilestContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class WhilestWhileContext extends WhilestContext {
		public TerminalNode WHILE() { return getToken(DASParser.WHILE, 0); }
		public TerminalNode OE() { return getToken(DASParser.OE, 0); }
		public CondContext cond() {
			return getRuleContext(CondContext.class,0);
		}
		public TerminalNode CE() { return getToken(DASParser.CE, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public WhilestWhileContext(WhilestContext ctx) { copyFrom(ctx); }
	}

	public final WhilestContext whilest() throws RecognitionException {
		WhilestContext _localctx = new WhilestContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_whilest);
		try {
			setState(151);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case WHILE:
				_localctx = new WhilestWhileContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(138);
				match(WHILE);
				setState(139);
				match(OE);
				setState(140);
				cond(0);
				setState(141);
				match(CE);
				setState(142);
				block();
				}
				break;
			case DO:
				_localctx = new WhilestDoWhileContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(144);
				match(DO);
				setState(145);
				block();
				setState(146);
				match(WHILE);
				setState(147);
				match(OE);
				setState(148);
				cond(0);
				setState(149);
				match(CE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ForstContext extends ParserRuleContext {
		public ForstContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forst; }
	 
		public ForstContext() { }
		public void copyFrom(ForstContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ForstForContext extends ForstContext {
		public TerminalNode FOR() { return getToken(DASParser.FOR, 0); }
		public TerminalNode OE() { return getToken(DASParser.OE, 0); }
		public List<TerminalNode> EOL() { return getTokens(DASParser.EOL); }
		public TerminalNode EOL(int i) {
			return getToken(DASParser.EOL, i);
		}
		public TerminalNode CE() { return getToken(DASParser.CE, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public List<AtribContext> atrib() {
			return getRuleContexts(AtribContext.class);
		}
		public AtribContext atrib(int i) {
			return getRuleContext(AtribContext.class,i);
		}
		public CondContext cond() {
			return getRuleContext(CondContext.class,0);
		}
		public ForstForContext(ForstContext ctx) { copyFrom(ctx); }
	}

	public final ForstContext forst() throws RecognitionException {
		ForstContext _localctx = new ForstContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_forst);
		int _la;
		try {
			_localctx = new ForstForContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(153);
			match(FOR);
			setState(154);
			match(OE);
			setState(156);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__2 || _la==T__3) {
				{
				setState(155);
				atrib();
				}
			}

			setState(158);
			match(EOL);
			setState(160);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 824633851936L) != 0)) {
				{
				setState(159);
				cond(0);
				}
			}

			setState(162);
			match(EOL);
			setState(164);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__2 || _la==T__3) {
				{
				setState(163);
				atrib();
				}
			}

			setState(166);
			match(CE);
			setState(167);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BlockContext extends ParserRuleContext {
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
	 
		public BlockContext() { }
		public void copyFrom(BlockContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BlockLineContext extends BlockContext {
		public List<LineContext> line() {
			return getRuleContexts(LineContext.class);
		}
		public LineContext line(int i) {
			return getRuleContext(LineContext.class,i);
		}
		public BlockLineContext(BlockContext ctx) { copyFrom(ctx); }
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_block);
		int _la;
		try {
			_localctx = new BlockLineContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(169);
			match(T__0);
			setState(171); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(170);
				line();
				}
				}
				setState(173); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 705381269528L) != 0) );
			setState(175);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CondContext extends ParserRuleContext {
		public CondContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cond; }
	 
		public CondContext() { }
		public void copyFrom(CondContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CondRelopContext extends CondContext {
		public ExprContext e1;
		public Token RELOP;
		public ExprContext e2;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode EQ() { return getToken(DASParser.EQ, 0); }
		public TerminalNode NE() { return getToken(DASParser.NE, 0); }
		public TerminalNode LT() { return getToken(DASParser.LT, 0); }
		public TerminalNode GT() { return getToken(DASParser.GT, 0); }
		public TerminalNode LE() { return getToken(DASParser.LE, 0); }
		public TerminalNode GE() { return getToken(DASParser.GE, 0); }
		public CondRelopContext(CondContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CondExprContext extends CondContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public CondExprContext(CondContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CondAndContext extends CondContext {
		public CondContext c1;
		public CondContext c2;
		public TerminalNode AND() { return getToken(DASParser.AND, 0); }
		public List<CondContext> cond() {
			return getRuleContexts(CondContext.class);
		}
		public CondContext cond(int i) {
			return getRuleContext(CondContext.class,i);
		}
		public CondAndContext(CondContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CondOrContext extends CondContext {
		public CondContext c1;
		public CondContext c2;
		public TerminalNode OR() { return getToken(DASParser.OR, 0); }
		public List<CondContext> cond() {
			return getRuleContexts(CondContext.class);
		}
		public CondContext cond(int i) {
			return getRuleContext(CondContext.class,i);
		}
		public CondOrContext(CondContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CondNotContext extends CondContext {
		public TerminalNode NOT() { return getToken(DASParser.NOT, 0); }
		public CondContext cond() {
			return getRuleContext(CondContext.class,0);
		}
		public CondNotContext(CondContext ctx) { copyFrom(ctx); }
	}

	public final CondContext cond() throws RecognitionException {
		return cond(0);
	}

	private CondContext cond(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		CondContext _localctx = new CondContext(_ctx, _parentState);
		CondContext _prevctx = _localctx;
		int _startState = 32;
		enterRecursionRule(_localctx, 32, RULE_cond, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(185);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				_localctx = new CondExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(178);
				expr();
				}
				break;
			case 2:
				{
				_localctx = new CondRelopContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(179);
				((CondRelopContext)_localctx).e1 = expr();
				setState(180);
				((CondRelopContext)_localctx).RELOP = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 16515072L) != 0)) ) {
					((CondRelopContext)_localctx).RELOP = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(181);
				((CondRelopContext)_localctx).e2 = expr();
				}
				break;
			case 3:
				{
				_localctx = new CondNotContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(183);
				match(NOT);
				setState(184);
				cond(1);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(195);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(193);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
					case 1:
						{
						_localctx = new CondAndContext(new CondContext(_parentctx, _parentState));
						((CondAndContext)_localctx).c1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_cond);
						setState(187);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(188);
						match(AND);
						setState(189);
						((CondAndContext)_localctx).c2 = cond(4);
						}
						break;
					case 2:
						{
						_localctx = new CondOrContext(new CondContext(_parentctx, _parentState));
						((CondOrContext)_localctx).c1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_cond);
						setState(190);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(191);
						match(OR);
						setState(192);
						((CondOrContext)_localctx).c2 = cond(3);
						}
						break;
					}
					} 
				}
				setState(197);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AtribContext extends ParserRuleContext {
		public AtribContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atrib; }
	 
		public AtribContext() { }
		public void copyFrom(AtribContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AtribVarStrContext extends AtribContext {
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public TerminalNode VAR() { return getToken(DASParser.VAR, 0); }
		public TerminalNode AT() { return getToken(DASParser.AT, 0); }
		public TerminalNode STR() { return getToken(DASParser.STR, 0); }
		public AtribVarStrContext(AtribContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AtribVarContext extends AtribContext {
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public TerminalNode VAR() { return getToken(DASParser.VAR, 0); }
		public TerminalNode AT() { return getToken(DASParser.AT, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public AtribVarContext(AtribContext ctx) { copyFrom(ctx); }
	}

	public final AtribContext atrib() throws RecognitionException {
		AtribContext _localctx = new AtribContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_atrib);
		try {
			setState(208);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				_localctx = new AtribVarContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(198);
				tipo();
				setState(199);
				match(VAR);
				setState(200);
				match(AT);
				setState(201);
				expr();
				}
				break;
			case 2:
				_localctx = new AtribVarStrContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(203);
				tipo();
				setState(204);
				match(VAR);
				setState(205);
				match(AT);
				setState(206);
				match(STR);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExprContext extends ParserRuleContext {
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprPlusContext extends ExprContext {
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public TerminalNode PLUS() { return getToken(DASParser.PLUS, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ExprPlusContext(ExprContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprMinusContext extends ExprContext {
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public TerminalNode MINUS() { return getToken(DASParser.MINUS, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ExprMinusContext(ExprContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprTermContext extends ExprContext {
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public ExprTermContext(ExprContext ctx) { copyFrom(ctx); }
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_expr);
		try {
			setState(219);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				_localctx = new ExprPlusContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(210);
				term();
				setState(211);
				match(PLUS);
				setState(212);
				expr();
				}
				break;
			case 2:
				_localctx = new ExprMinusContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(214);
				term();
				setState(215);
				match(MINUS);
				setState(216);
				expr();
				}
				break;
			case 3:
				_localctx = new ExprTermContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(218);
				term();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TermContext extends ParserRuleContext {
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
	 
		public TermContext() { }
		public void copyFrom(TermContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TermDivContext extends TermContext {
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public TerminalNode DIV() { return getToken(DASParser.DIV, 0); }
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public TermDivContext(TermContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TermMultContext extends TermContext {
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public TerminalNode MULT() { return getToken(DASParser.MULT, 0); }
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public TermMultContext(TermContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TermFactorContext extends TermContext {
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public TermFactorContext(TermContext ctx) { copyFrom(ctx); }
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_term);
		try {
			setState(230);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				_localctx = new TermMultContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(221);
				factor();
				setState(222);
				match(MULT);
				setState(223);
				term();
				}
				break;
			case 2:
				_localctx = new TermDivContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(225);
				factor();
				setState(226);
				match(DIV);
				setState(227);
				term();
				}
				break;
			case 3:
				_localctx = new TermFactorContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(229);
				factor();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FactorContext extends ParserRuleContext {
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
	 
		public FactorContext() { }
		public void copyFrom(FactorContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FactorNumContext extends FactorContext {
		public TerminalNode NUM() { return getToken(DASParser.NUM, 0); }
		public FactorNumContext(FactorContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FactorVarContext extends FactorContext {
		public TerminalNode VAR() { return getToken(DASParser.VAR, 0); }
		public FactorVarContext(FactorContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FactorExprContext extends FactorContext {
		public TerminalNode OE() { return getToken(DASParser.OE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode CE() { return getToken(DASParser.CE, 0); }
		public FactorExprContext(FactorContext ctx) { copyFrom(ctx); }
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_factor);
		try {
			setState(238);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OE:
				_localctx = new FactorExprContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(232);
				match(OE);
				setState(233);
				expr();
				setState(234);
				match(CE);
				}
				break;
			case VAR:
				_localctx = new FactorVarContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(236);
				match(VAR);
				}
				break;
			case NUM:
				_localctx = new FactorNumContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(237);
				match(NUM);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 16:
			return cond_sempred((CondContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean cond_sempred(CondContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 3);
		case 1:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001)\u00f1\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0001\u0000\u0001\u0000"+
		"\u0004\u0000-\b\u0000\u000b\u0000\f\u0000.\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0003\u00015\b\u0001\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0003\u0004L\b\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0003\u0005S\b\u0005\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006\\\b"+
		"\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0003\bg\b\b\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0003\ns\b\n\u0001"+
		"\u000b\u0001\u000b\u0003\u000bw\b\u000b\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0003\f\u0089\b\f\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0003\r\u0098\b\r\u0001\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u009d"+
		"\b\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u00a1\b\u000e\u0001\u000e"+
		"\u0001\u000e\u0003\u000e\u00a5\b\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000f\u0001\u000f\u0004\u000f\u00ac\b\u000f\u000b\u000f\f\u000f"+
		"\u00ad\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0003\u0010\u00ba"+
		"\b\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0005\u0010\u00c2\b\u0010\n\u0010\f\u0010\u00c5\t\u0010\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0003\u0011\u00d1\b\u0011\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0003\u0012\u00dc\b\u0012\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0003\u0013\u00e7\b\u0013\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0003\u0014\u00ef\b\u0014\u0001\u0014"+
		"\u0000\u0001 \u0015\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014"+
		"\u0016\u0018\u001a\u001c\u001e \"$&(\u0000\u0001\u0001\u0000\u0012\u0017"+
		"\u00fd\u0000*\u0001\u0000\u0000\u0000\u00024\u0001\u0000\u0000\u0000\u0004"+
		"6\u0001\u0000\u0000\u0000\u0006=\u0001\u0000\u0000\u0000\bK\u0001\u0000"+
		"\u0000\u0000\nR\u0001\u0000\u0000\u0000\f[\u0001\u0000\u0000\u0000\u000e"+
		"]\u0001\u0000\u0000\u0000\u0010f\u0001\u0000\u0000\u0000\u0012h\u0001"+
		"\u0000\u0000\u0000\u0014r\u0001\u0000\u0000\u0000\u0016v\u0001\u0000\u0000"+
		"\u0000\u0018\u0088\u0001\u0000\u0000\u0000\u001a\u0097\u0001\u0000\u0000"+
		"\u0000\u001c\u0099\u0001\u0000\u0000\u0000\u001e\u00a9\u0001\u0000\u0000"+
		"\u0000 \u00b9\u0001\u0000\u0000\u0000\"\u00d0\u0001\u0000\u0000\u0000"+
		"$\u00db\u0001\u0000\u0000\u0000&\u00e6\u0001\u0000\u0000\u0000(\u00ee"+
		"\u0001\u0000\u0000\u0000*,\u0003\u0002\u0001\u0000+-\u0003\f\u0006\u0000"+
		",+\u0001\u0000\u0000\u0000-.\u0001\u0000\u0000\u0000.,\u0001\u0000\u0000"+
		"\u0000./\u0001\u0000\u0000\u0000/\u0001\u0001\u0000\u0000\u000001\u0003"+
		"\u0004\u0002\u000012\u0003\u0002\u0001\u000025\u0001\u0000\u0000\u0000"+
		"35\u0001\u0000\u0000\u000040\u0001\u0000\u0000\u000043\u0001\u0000\u0000"+
		"\u00005\u0003\u0001\u0000\u0000\u000067\u0005\u001e\u0000\u000078\u0005"+
		"\'\u0000\u000089\u0005\u0005\u0000\u00009:\u0003\n\u0005\u0000:;\u0005"+
		"\u0006\u0000\u0000;<\u0003\u0006\u0003\u0000<\u0005\u0001\u0000\u0000"+
		"\u0000=>\u0005\u0001\u0000\u0000>?\u0003\b\u0004\u0000?@\u0005\u0002\u0000"+
		"\u0000@\u0007\u0001\u0000\u0000\u0000AL\u0003\f\u0006\u0000BC\u0003\f"+
		"\u0006\u0000CD\u0003\b\u0004\u0000DL\u0001\u0000\u0000\u0000EF\u0005\u001f"+
		"\u0000\u0000FG\u0003$\u0012\u0000GH\u0005%\u0000\u0000HL\u0001\u0000\u0000"+
		"\u0000IJ\u0005\u001f\u0000\u0000JL\u0005%\u0000\u0000KA\u0001\u0000\u0000"+
		"\u0000KB\u0001\u0000\u0000\u0000KE\u0001\u0000\u0000\u0000KI\u0001\u0000"+
		"\u0000\u0000L\t\u0001\u0000\u0000\u0000MS\u0005\'\u0000\u0000NO\u0005"+
		"\'\u0000\u0000OP\u0005\n\u0000\u0000PS\u0003\n\u0005\u0000QS\u0001\u0000"+
		"\u0000\u0000RM\u0001\u0000\u0000\u0000RN\u0001\u0000\u0000\u0000RQ\u0001"+
		"\u0000\u0000\u0000S\u000b\u0001\u0000\u0000\u0000TU\u0003\u0010\b\u0000"+
		"UV\u0005%\u0000\u0000V\\\u0001\u0000\u0000\u0000W\\\u0003\u0018\f\u0000"+
		"X\\\u0003\u001a\r\u0000Y\\\u0003\u001c\u000e\u0000Z\\\u0005%\u0000\u0000"+
		"[T\u0001\u0000\u0000\u0000[W\u0001\u0000\u0000\u0000[X\u0001\u0000\u0000"+
		"\u0000[Y\u0001\u0000\u0000\u0000[Z\u0001\u0000\u0000\u0000\\\r\u0001\u0000"+
		"\u0000\u0000]^\u0005\'\u0000\u0000^_\u0005\u0005\u0000\u0000_`\u0003\n"+
		"\u0005\u0000`a\u0005\u0006\u0000\u0000a\u000f\u0001\u0000\u0000\u0000"+
		"bg\u0003\"\u0011\u0000cg\u0003\u0012\t\u0000dg\u0003\u0014\n\u0000eg\u0003"+
		"\u000e\u0007\u0000fb\u0001\u0000\u0000\u0000fc\u0001\u0000\u0000\u0000"+
		"fd\u0001\u0000\u0000\u0000fe\u0001\u0000\u0000\u0000g\u0011\u0001\u0000"+
		"\u0000\u0000hi\u0003\u0016\u000b\u0000ij\u0005#\u0000\u0000jk\u0005\'"+
		"\u0000\u0000k\u0013\u0001\u0000\u0000\u0000lm\u0005\"\u0000\u0000ms\u0005"+
		"\'\u0000\u0000no\u0005\"\u0000\u0000os\u0005$\u0000\u0000pq\u0005\"\u0000"+
		"\u0000qs\u0003$\u0012\u0000rl\u0001\u0000\u0000\u0000rn\u0001\u0000\u0000"+
		"\u0000rp\u0001\u0000\u0000\u0000s\u0015\u0001\u0000\u0000\u0000tw\u0005"+
		"\u0003\u0000\u0000uw\u0005\u0004\u0000\u0000vt\u0001\u0000\u0000\u0000"+
		"vu\u0001\u0000\u0000\u0000w\u0017\u0001\u0000\u0000\u0000xy\u0005\u001a"+
		"\u0000\u0000yz\u0005\u0005\u0000\u0000z{\u0003 \u0010\u0000{|\u0005\u0006"+
		"\u0000\u0000|}\u0005 \u0000\u0000}~\u0003\u001e\u000f\u0000~\u0089\u0001"+
		"\u0000\u0000\u0000\u007f\u0080\u0005\u001a\u0000\u0000\u0080\u0081\u0005"+
		"\u0005\u0000\u0000\u0081\u0082\u0003 \u0010\u0000\u0082\u0083\u0005\u0006"+
		"\u0000\u0000\u0083\u0084\u0005 \u0000\u0000\u0084\u0085\u0003\u001e\u000f"+
		"\u0000\u0085\u0086\u0005!\u0000\u0000\u0086\u0087\u0003\u001e\u000f\u0000"+
		"\u0087\u0089\u0001\u0000\u0000\u0000\u0088x\u0001\u0000\u0000\u0000\u0088"+
		"\u007f\u0001\u0000\u0000\u0000\u0089\u0019\u0001\u0000\u0000\u0000\u008a"+
		"\u008b\u0005\u001b\u0000\u0000\u008b\u008c\u0005\u0005\u0000\u0000\u008c"+
		"\u008d\u0003 \u0010\u0000\u008d\u008e\u0005\u0006\u0000\u0000\u008e\u008f"+
		"\u0003\u001e\u000f\u0000\u008f\u0098\u0001\u0000\u0000\u0000\u0090\u0091"+
		"\u0005\u001c\u0000\u0000\u0091\u0092\u0003\u001e\u000f\u0000\u0092\u0093"+
		"\u0005\u001b\u0000\u0000\u0093\u0094\u0005\u0005\u0000\u0000\u0094\u0095"+
		"\u0003 \u0010\u0000\u0095\u0096\u0005\u0006\u0000\u0000\u0096\u0098\u0001"+
		"\u0000\u0000\u0000\u0097\u008a\u0001\u0000\u0000\u0000\u0097\u0090\u0001"+
		"\u0000\u0000\u0000\u0098\u001b\u0001\u0000\u0000\u0000\u0099\u009a\u0005"+
		"\u001d\u0000\u0000\u009a\u009c\u0005\u0005\u0000\u0000\u009b\u009d\u0003"+
		"\"\u0011\u0000\u009c\u009b\u0001\u0000\u0000\u0000\u009c\u009d\u0001\u0000"+
		"\u0000\u0000\u009d\u009e\u0001\u0000\u0000\u0000\u009e\u00a0\u0005%\u0000"+
		"\u0000\u009f\u00a1\u0003 \u0010\u0000\u00a0\u009f\u0001\u0000\u0000\u0000"+
		"\u00a0\u00a1\u0001\u0000\u0000\u0000\u00a1\u00a2\u0001\u0000\u0000\u0000"+
		"\u00a2\u00a4\u0005%\u0000\u0000\u00a3\u00a5\u0003\"\u0011\u0000\u00a4"+
		"\u00a3\u0001\u0000\u0000\u0000\u00a4\u00a5\u0001\u0000\u0000\u0000\u00a5"+
		"\u00a6\u0001\u0000\u0000\u0000\u00a6\u00a7\u0005\u0006\u0000\u0000\u00a7"+
		"\u00a8\u0003\u001e\u000f\u0000\u00a8\u001d\u0001\u0000\u0000\u0000\u00a9"+
		"\u00ab\u0005\u0001\u0000\u0000\u00aa\u00ac\u0003\f\u0006\u0000\u00ab\u00aa"+
		"\u0001\u0000\u0000\u0000\u00ac\u00ad\u0001\u0000\u0000\u0000\u00ad\u00ab"+
		"\u0001\u0000\u0000\u0000\u00ad\u00ae\u0001\u0000\u0000\u0000\u00ae\u00af"+
		"\u0001\u0000\u0000\u0000\u00af\u00b0\u0005\u0002\u0000\u0000\u00b0\u001f"+
		"\u0001\u0000\u0000\u0000\u00b1\u00b2\u0006\u0010\uffff\uffff\u0000\u00b2"+
		"\u00ba\u0003$\u0012\u0000\u00b3\u00b4\u0003$\u0012\u0000\u00b4\u00b5\u0007"+
		"\u0000\u0000\u0000\u00b5\u00b6\u0003$\u0012\u0000\u00b6\u00ba\u0001\u0000"+
		"\u0000\u0000\u00b7\u00b8\u0005\u0011\u0000\u0000\u00b8\u00ba\u0003 \u0010"+
		"\u0001\u00b9\u00b1\u0001\u0000\u0000\u0000\u00b9\u00b3\u0001\u0000\u0000"+
		"\u0000\u00b9\u00b7\u0001\u0000\u0000\u0000\u00ba\u00c3\u0001\u0000\u0000"+
		"\u0000\u00bb\u00bc\n\u0003\u0000\u0000\u00bc\u00bd\u0005\u000f\u0000\u0000"+
		"\u00bd\u00c2\u0003 \u0010\u0004\u00be\u00bf\n\u0002\u0000\u0000\u00bf"+
		"\u00c0\u0005\u0010\u0000\u0000\u00c0\u00c2\u0003 \u0010\u0003\u00c1\u00bb"+
		"\u0001\u0000\u0000\u0000\u00c1\u00be\u0001\u0000\u0000\u0000\u00c2\u00c5"+
		"\u0001\u0000\u0000\u0000\u00c3\u00c1\u0001\u0000\u0000\u0000\u00c3\u00c4"+
		"\u0001\u0000\u0000\u0000\u00c4!\u0001\u0000\u0000\u0000\u00c5\u00c3\u0001"+
		"\u0000\u0000\u0000\u00c6\u00c7\u0003\u0016\u000b\u0000\u00c7\u00c8\u0005"+
		"\'\u0000\u0000\u00c8\u00c9\u0005\t\u0000\u0000\u00c9\u00ca\u0003$\u0012"+
		"\u0000\u00ca\u00d1\u0001\u0000\u0000\u0000\u00cb\u00cc\u0003\u0016\u000b"+
		"\u0000\u00cc\u00cd\u0005\'\u0000\u0000\u00cd\u00ce\u0005\t\u0000\u0000"+
		"\u00ce\u00cf\u0005$\u0000\u0000\u00cf\u00d1\u0001\u0000\u0000\u0000\u00d0"+
		"\u00c6\u0001\u0000\u0000\u0000\u00d0\u00cb\u0001\u0000\u0000\u0000\u00d1"+
		"#\u0001\u0000\u0000\u0000\u00d2\u00d3\u0003&\u0013\u0000\u00d3\u00d4\u0005"+
		"\u000b\u0000\u0000\u00d4\u00d5\u0003$\u0012\u0000\u00d5\u00dc\u0001\u0000"+
		"\u0000\u0000\u00d6\u00d7\u0003&\u0013\u0000\u00d7\u00d8\u0005\f\u0000"+
		"\u0000\u00d8\u00d9\u0003$\u0012\u0000\u00d9\u00dc\u0001\u0000\u0000\u0000"+
		"\u00da\u00dc\u0003&\u0013\u0000\u00db\u00d2\u0001\u0000\u0000\u0000\u00db"+
		"\u00d6\u0001\u0000\u0000\u0000\u00db\u00da\u0001\u0000\u0000\u0000\u00dc"+
		"%\u0001\u0000\u0000\u0000\u00dd\u00de\u0003(\u0014\u0000\u00de\u00df\u0005"+
		"\r\u0000\u0000\u00df\u00e0\u0003&\u0013\u0000\u00e0\u00e7\u0001\u0000"+
		"\u0000\u0000\u00e1\u00e2\u0003(\u0014\u0000\u00e2\u00e3\u0005\u000e\u0000"+
		"\u0000\u00e3\u00e4\u0003&\u0013\u0000\u00e4\u00e7\u0001\u0000\u0000\u0000"+
		"\u00e5\u00e7\u0003(\u0014\u0000\u00e6\u00dd\u0001\u0000\u0000\u0000\u00e6"+
		"\u00e1\u0001\u0000\u0000\u0000\u00e6\u00e5\u0001\u0000\u0000\u0000\u00e7"+
		"\'\u0001\u0000\u0000\u0000\u00e8\u00e9\u0005\u0005\u0000\u0000\u00e9\u00ea"+
		"\u0003$\u0012\u0000\u00ea\u00eb\u0005\u0006\u0000\u0000\u00eb\u00ef\u0001"+
		"\u0000\u0000\u0000\u00ec\u00ef\u0005\'\u0000\u0000\u00ed\u00ef\u0005&"+
		"\u0000\u0000\u00ee\u00e8\u0001\u0000\u0000\u0000\u00ee\u00ec\u0001\u0000"+
		"\u0000\u0000\u00ee\u00ed\u0001\u0000\u0000\u0000\u00ef)\u0001\u0000\u0000"+
		"\u0000\u0015.4KR[frv\u0088\u0097\u009c\u00a0\u00a4\u00ad\u00b9\u00c1\u00c3"+
		"\u00d0\u00db\u00e6\u00ee";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}