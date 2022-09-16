// Generated from D:/Users/jonat/Documents/UFLA/5-semestre/compiladores/analise-lexica/CompiladorExemplo/Trabalho-de-Compiladores/Analisador/src/antlr\GramaticaSintatica.g4 by ANTLR 4.10.1
package antlr;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GramaticaSintatica extends Parser {
	static { RuntimeMetaData.checkVersion("4.10.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ID=1, OPAT=2, OPAR=3, OPRE=4, OPBO=5, TIPO=6, VALBO=7, IF=8, ELSE=9, THEN=10, 
		FOR=11, WHILE=12, AP=13, FP=14, ACH=15, FCH=16, AC=17, FC=18, DELIMITADOR=19, 
		SEPARADOR=20, RETORNO=21, INPUT=22, OUTPUT=23, MODACESSO=24, TEXTO=25, 
		NUM=26, COMENT=27, WS=28, ErrorChar=29;
	public static final int
		RULE_inicio = 0, RULE_programa = 1, RULE_declaracao = 2, RULE_metodo = 3, 
		RULE_retorno = 4, RULE_parametrosFunc = 5, RULE_variavel = 6, RULE_qualquerCoisa = 7, 
		RULE_for = 8, RULE_while = 9, RULE_condicao = 10, RULE_else = 11, RULE_exprRelacional = 12, 
		RULE_exprCondicional = 13, RULE_exprAt = 14, RULE_exprAr = 15, RULE_input = 16, 
		RULE_output = 17, RULE_callFunc = 18, RULE_elementoCall = 19, RULE_elemento = 20, 
		RULE_expressao = 21;
	private static String[] makeRuleNames() {
		return new String[] {
			"inicio", "programa", "declaracao", "metodo", "retorno", "parametrosFunc", 
			"variavel", "qualquerCoisa", "for", "while", "condicao", "else", "exprRelacional", 
			"exprCondicional", "exprAt", "exprAr", "input", "output", "callFunc", 
			"elementoCall", "elemento", "expressao"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, "'='", null, null, null, null, null, "'SE'", "'SENAO'", "'ENTAO'", 
			"'PARA'", "'ENQUANTO'", "'('", "')'", "'{'", "'}'", "'['", "']'", "';'", 
			"','", "'RETORNO'", "'LER'", "'ESCREVER'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "ID", "OPAT", "OPAR", "OPRE", "OPBO", "TIPO", "VALBO", "IF", "ELSE", 
			"THEN", "FOR", "WHILE", "AP", "FP", "ACH", "FCH", "AC", "FC", "DELIMITADOR", 
			"SEPARADOR", "RETORNO", "INPUT", "OUTPUT", "MODACESSO", "TEXTO", "NUM", 
			"COMENT", "WS", "ErrorChar"
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
	public String getGrammarFileName() { return "GramaticaSintatica.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public GramaticaSintatica(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class InicioContext extends ParserRuleContext {
		public ProgramaContext programa() {
			return getRuleContext(ProgramaContext.class,0);
		}
		public TerminalNode EOF() { return getToken(GramaticaSintatica.EOF, 0); }
		public InicioContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inicio; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSintaticaListener ) ((GramaticaSintaticaListener)listener).enterInicio(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSintaticaListener ) ((GramaticaSintaticaListener)listener).exitInicio(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaSintaticaVisitor ) return ((GramaticaSintaticaVisitor<? extends T>)visitor).visitInicio(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InicioContext inicio() throws RecognitionException {
		InicioContext _localctx = new InicioContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_inicio);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(44);
			programa();
			setState(45);
			match(EOF);
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

	public static class ProgramaContext extends ParserRuleContext {
		public List<DeclaracaoContext> declaracao() {
			return getRuleContexts(DeclaracaoContext.class);
		}
		public DeclaracaoContext declaracao(int i) {
			return getRuleContext(DeclaracaoContext.class,i);
		}
		public List<MetodoContext> metodo() {
			return getRuleContexts(MetodoContext.class);
		}
		public MetodoContext metodo(int i) {
			return getRuleContext(MetodoContext.class,i);
		}
		public ProgramaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programa; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSintaticaListener ) ((GramaticaSintaticaListener)listener).enterPrograma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSintaticaListener ) ((GramaticaSintaticaListener)listener).exitPrograma(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaSintaticaVisitor ) return ((GramaticaSintaticaVisitor<? extends T>)visitor).visitPrograma(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramaContext programa() throws RecognitionException {
		ProgramaContext _localctx = new ProgramaContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_programa);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(50);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(47);
					declaracao();
					}
					} 
				}
				setState(52);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			setState(56);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TIPO || _la==MODACESSO) {
				{
				{
				setState(53);
				metodo();
				}
				}
				setState(58);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
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

	public static class DeclaracaoContext extends ParserRuleContext {
		public DeclaracaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracao; }
	 
		public DeclaracaoContext() { }
		public void copyFrom(DeclaracaoContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class LDeclaracaoContext extends DeclaracaoContext {
		public VariavelContext variavel() {
			return getRuleContext(VariavelContext.class,0);
		}
		public TerminalNode DELIMITADOR() { return getToken(GramaticaSintatica.DELIMITADOR, 0); }
		public TerminalNode MODACESSO() { return getToken(GramaticaSintatica.MODACESSO, 0); }
		public LDeclaracaoContext(DeclaracaoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSintaticaListener ) ((GramaticaSintaticaListener)listener).enterLDeclaracao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSintaticaListener ) ((GramaticaSintaticaListener)listener).exitLDeclaracao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaSintaticaVisitor ) return ((GramaticaSintaticaVisitor<? extends T>)visitor).visitLDeclaracao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclaracaoContext declaracao() throws RecognitionException {
		DeclaracaoContext _localctx = new DeclaracaoContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_declaracao);
		int _la;
		try {
			_localctx = new LDeclaracaoContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(60);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==MODACESSO) {
				{
				setState(59);
				match(MODACESSO);
				}
			}

			setState(62);
			variavel();
			setState(63);
			match(DELIMITADOR);
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

	public static class MetodoContext extends ParserRuleContext {
		public VariavelContext variavel() {
			return getRuleContext(VariavelContext.class,0);
		}
		public TerminalNode AP() { return getToken(GramaticaSintatica.AP, 0); }
		public ParametrosFuncContext parametrosFunc() {
			return getRuleContext(ParametrosFuncContext.class,0);
		}
		public TerminalNode FP() { return getToken(GramaticaSintatica.FP, 0); }
		public TerminalNode ACH() { return getToken(GramaticaSintatica.ACH, 0); }
		public QualquerCoisaContext qualquerCoisa() {
			return getRuleContext(QualquerCoisaContext.class,0);
		}
		public RetornoContext retorno() {
			return getRuleContext(RetornoContext.class,0);
		}
		public TerminalNode FCH() { return getToken(GramaticaSintatica.FCH, 0); }
		public TerminalNode MODACESSO() { return getToken(GramaticaSintatica.MODACESSO, 0); }
		public MetodoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_metodo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSintaticaListener ) ((GramaticaSintaticaListener)listener).enterMetodo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSintaticaListener ) ((GramaticaSintaticaListener)listener).exitMetodo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaSintaticaVisitor ) return ((GramaticaSintaticaVisitor<? extends T>)visitor).visitMetodo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MetodoContext metodo() throws RecognitionException {
		MetodoContext _localctx = new MetodoContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_metodo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(66);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==MODACESSO) {
				{
				setState(65);
				match(MODACESSO);
				}
			}

			setState(68);
			variavel();
			setState(69);
			match(AP);
			setState(70);
			parametrosFunc();
			setState(71);
			match(FP);
			setState(72);
			match(ACH);
			setState(73);
			qualquerCoisa();
			setState(74);
			retorno();
			setState(75);
			match(FCH);
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

	public static class RetornoContext extends ParserRuleContext {
		public TerminalNode RETORNO() { return getToken(GramaticaSintatica.RETORNO, 0); }
		public ElementoContext elemento() {
			return getRuleContext(ElementoContext.class,0);
		}
		public TerminalNode DELIMITADOR() { return getToken(GramaticaSintatica.DELIMITADOR, 0); }
		public RetornoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_retorno; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSintaticaListener ) ((GramaticaSintaticaListener)listener).enterRetorno(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSintaticaListener ) ((GramaticaSintaticaListener)listener).exitRetorno(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaSintaticaVisitor ) return ((GramaticaSintaticaVisitor<? extends T>)visitor).visitRetorno(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RetornoContext retorno() throws RecognitionException {
		RetornoContext _localctx = new RetornoContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_retorno);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(77);
			match(RETORNO);
			setState(78);
			elemento();
			setState(79);
			match(DELIMITADOR);
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

	public static class ParametrosFuncContext extends ParserRuleContext {
		public List<VariavelContext> variavel() {
			return getRuleContexts(VariavelContext.class);
		}
		public VariavelContext variavel(int i) {
			return getRuleContext(VariavelContext.class,i);
		}
		public List<TerminalNode> SEPARADOR() { return getTokens(GramaticaSintatica.SEPARADOR); }
		public TerminalNode SEPARADOR(int i) {
			return getToken(GramaticaSintatica.SEPARADOR, i);
		}
		public ParametrosFuncContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametrosFunc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSintaticaListener ) ((GramaticaSintaticaListener)listener).enterParametrosFunc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSintaticaListener ) ((GramaticaSintaticaListener)listener).exitParametrosFunc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaSintaticaVisitor ) return ((GramaticaSintaticaVisitor<? extends T>)visitor).visitParametrosFunc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParametrosFuncContext parametrosFunc() throws RecognitionException {
		ParametrosFuncContext _localctx = new ParametrosFuncContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_parametrosFunc);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(89);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TIPO) {
				{
				setState(81);
				variavel();
				setState(86);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SEPARADOR) {
					{
					{
					setState(82);
					match(SEPARADOR);
					setState(83);
					variavel();
					}
					}
					setState(88);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

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

	public static class VariavelContext extends ParserRuleContext {
		public TerminalNode TIPO() { return getToken(GramaticaSintatica.TIPO, 0); }
		public TerminalNode ID() { return getToken(GramaticaSintatica.ID, 0); }
		public VariavelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variavel; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSintaticaListener ) ((GramaticaSintaticaListener)listener).enterVariavel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSintaticaListener ) ((GramaticaSintaticaListener)listener).exitVariavel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaSintaticaVisitor ) return ((GramaticaSintaticaVisitor<? extends T>)visitor).visitVariavel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariavelContext variavel() throws RecognitionException {
		VariavelContext _localctx = new VariavelContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_variavel);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(91);
			match(TIPO);
			setState(92);
			match(ID);
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

	public static class QualquerCoisaContext extends ParserRuleContext {
		public List<DeclaracaoContext> declaracao() {
			return getRuleContexts(DeclaracaoContext.class);
		}
		public DeclaracaoContext declaracao(int i) {
			return getRuleContext(DeclaracaoContext.class,i);
		}
		public List<ForContext> for_() {
			return getRuleContexts(ForContext.class);
		}
		public ForContext for_(int i) {
			return getRuleContext(ForContext.class,i);
		}
		public List<WhileContext> while_() {
			return getRuleContexts(WhileContext.class);
		}
		public WhileContext while_(int i) {
			return getRuleContext(WhileContext.class,i);
		}
		public List<CondicaoContext> condicao() {
			return getRuleContexts(CondicaoContext.class);
		}
		public CondicaoContext condicao(int i) {
			return getRuleContext(CondicaoContext.class,i);
		}
		public List<ExprAtContext> exprAt() {
			return getRuleContexts(ExprAtContext.class);
		}
		public ExprAtContext exprAt(int i) {
			return getRuleContext(ExprAtContext.class,i);
		}
		public List<TerminalNode> DELIMITADOR() { return getTokens(GramaticaSintatica.DELIMITADOR); }
		public TerminalNode DELIMITADOR(int i) {
			return getToken(GramaticaSintatica.DELIMITADOR, i);
		}
		public List<ExprArContext> exprAr() {
			return getRuleContexts(ExprArContext.class);
		}
		public ExprArContext exprAr(int i) {
			return getRuleContext(ExprArContext.class,i);
		}
		public List<InputContext> input() {
			return getRuleContexts(InputContext.class);
		}
		public InputContext input(int i) {
			return getRuleContext(InputContext.class,i);
		}
		public List<OutputContext> output() {
			return getRuleContexts(OutputContext.class);
		}
		public OutputContext output(int i) {
			return getRuleContext(OutputContext.class,i);
		}
		public List<CallFuncContext> callFunc() {
			return getRuleContexts(CallFuncContext.class);
		}
		public CallFuncContext callFunc(int i) {
			return getRuleContext(CallFuncContext.class,i);
		}
		public QualquerCoisaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualquerCoisa; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSintaticaListener ) ((GramaticaSintaticaListener)listener).enterQualquerCoisa(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSintaticaListener ) ((GramaticaSintaticaListener)listener).exitQualquerCoisa(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaSintaticaVisitor ) return ((GramaticaSintaticaVisitor<? extends T>)visitor).visitQualquerCoisa(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QualquerCoisaContext qualquerCoisa() throws RecognitionException {
		QualquerCoisaContext _localctx = new QualquerCoisaContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_qualquerCoisa);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(115);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ID) | (1L << TIPO) | (1L << VALBO) | (1L << IF) | (1L << FOR) | (1L << WHILE) | (1L << INPUT) | (1L << OUTPUT) | (1L << MODACESSO) | (1L << TEXTO) | (1L << NUM))) != 0)) {
				{
				setState(113);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
				case 1:
					{
					setState(94);
					declaracao();
					}
					break;
				case 2:
					{
					setState(95);
					for_();
					}
					break;
				case 3:
					{
					setState(96);
					while_();
					}
					break;
				case 4:
					{
					setState(97);
					condicao();
					}
					break;
				case 5:
					{
					setState(98);
					exprAt();
					setState(99);
					match(DELIMITADOR);
					}
					break;
				case 6:
					{
					setState(101);
					exprAr();
					setState(102);
					match(DELIMITADOR);
					}
					break;
				case 7:
					{
					setState(104);
					input();
					setState(105);
					match(DELIMITADOR);
					}
					break;
				case 8:
					{
					setState(107);
					output();
					setState(108);
					match(DELIMITADOR);
					}
					break;
				case 9:
					{
					setState(110);
					callFunc();
					setState(111);
					match(DELIMITADOR);
					}
					break;
				}
				}
				setState(117);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
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

	public static class ForContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(GramaticaSintatica.FOR, 0); }
		public TerminalNode AP() { return getToken(GramaticaSintatica.AP, 0); }
		public List<TerminalNode> ID() { return getTokens(GramaticaSintatica.ID); }
		public TerminalNode ID(int i) {
			return getToken(GramaticaSintatica.ID, i);
		}
		public List<TerminalNode> SEPARADOR() { return getTokens(GramaticaSintatica.SEPARADOR); }
		public TerminalNode SEPARADOR(int i) {
			return getToken(GramaticaSintatica.SEPARADOR, i);
		}
		public List<TerminalNode> NUM() { return getTokens(GramaticaSintatica.NUM); }
		public TerminalNode NUM(int i) {
			return getToken(GramaticaSintatica.NUM, i);
		}
		public TerminalNode FP() { return getToken(GramaticaSintatica.FP, 0); }
		public TerminalNode ACH() { return getToken(GramaticaSintatica.ACH, 0); }
		public QualquerCoisaContext qualquerCoisa() {
			return getRuleContext(QualquerCoisaContext.class,0);
		}
		public TerminalNode FCH() { return getToken(GramaticaSintatica.FCH, 0); }
		public ForContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSintaticaListener ) ((GramaticaSintaticaListener)listener).enterFor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSintaticaListener ) ((GramaticaSintaticaListener)listener).exitFor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaSintaticaVisitor ) return ((GramaticaSintaticaVisitor<? extends T>)visitor).visitFor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForContext for_() throws RecognitionException {
		ForContext _localctx = new ForContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_for);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(118);
			match(FOR);
			setState(119);
			match(AP);
			setState(120);
			match(ID);
			setState(121);
			match(SEPARADOR);
			setState(122);
			_la = _input.LA(1);
			if ( !(_la==ID || _la==NUM) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(123);
			match(SEPARADOR);
			setState(124);
			_la = _input.LA(1);
			if ( !(_la==ID || _la==NUM) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(125);
			match(SEPARADOR);
			setState(126);
			match(NUM);
			setState(127);
			match(FP);
			setState(128);
			match(ACH);
			setState(129);
			qualquerCoisa();
			setState(130);
			match(FCH);
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

	public static class WhileContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(GramaticaSintatica.WHILE, 0); }
		public TerminalNode AP() { return getToken(GramaticaSintatica.AP, 0); }
		public ExprCondicionalContext exprCondicional() {
			return getRuleContext(ExprCondicionalContext.class,0);
		}
		public TerminalNode FP() { return getToken(GramaticaSintatica.FP, 0); }
		public TerminalNode ACH() { return getToken(GramaticaSintatica.ACH, 0); }
		public QualquerCoisaContext qualquerCoisa() {
			return getRuleContext(QualquerCoisaContext.class,0);
		}
		public TerminalNode FCH() { return getToken(GramaticaSintatica.FCH, 0); }
		public WhileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSintaticaListener ) ((GramaticaSintaticaListener)listener).enterWhile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSintaticaListener ) ((GramaticaSintaticaListener)listener).exitWhile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaSintaticaVisitor ) return ((GramaticaSintaticaVisitor<? extends T>)visitor).visitWhile(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileContext while_() throws RecognitionException {
		WhileContext _localctx = new WhileContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_while);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(132);
			match(WHILE);
			setState(133);
			match(AP);
			setState(134);
			exprCondicional();
			setState(135);
			match(FP);
			setState(136);
			match(ACH);
			setState(137);
			qualquerCoisa();
			setState(138);
			match(FCH);
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

	public static class CondicaoContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(GramaticaSintatica.IF, 0); }
		public TerminalNode AP() { return getToken(GramaticaSintatica.AP, 0); }
		public ExprCondicionalContext exprCondicional() {
			return getRuleContext(ExprCondicionalContext.class,0);
		}
		public TerminalNode FP() { return getToken(GramaticaSintatica.FP, 0); }
		public TerminalNode THEN() { return getToken(GramaticaSintatica.THEN, 0); }
		public TerminalNode ACH() { return getToken(GramaticaSintatica.ACH, 0); }
		public QualquerCoisaContext qualquerCoisa() {
			return getRuleContext(QualquerCoisaContext.class,0);
		}
		public TerminalNode FCH() { return getToken(GramaticaSintatica.FCH, 0); }
		public ElseContext else_() {
			return getRuleContext(ElseContext.class,0);
		}
		public CondicaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condicao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSintaticaListener ) ((GramaticaSintaticaListener)listener).enterCondicao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSintaticaListener ) ((GramaticaSintaticaListener)listener).exitCondicao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaSintaticaVisitor ) return ((GramaticaSintaticaVisitor<? extends T>)visitor).visitCondicao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CondicaoContext condicao() throws RecognitionException {
		CondicaoContext _localctx = new CondicaoContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_condicao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(140);
			match(IF);
			setState(141);
			match(AP);
			setState(142);
			exprCondicional();
			setState(143);
			match(FP);
			setState(144);
			match(THEN);
			setState(145);
			match(ACH);
			setState(146);
			qualquerCoisa();
			setState(147);
			match(FCH);
			setState(149);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(148);
				else_();
				}
			}

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

	public static class ElseContext extends ParserRuleContext {
		public TerminalNode ELSE() { return getToken(GramaticaSintatica.ELSE, 0); }
		public CondicaoContext condicao() {
			return getRuleContext(CondicaoContext.class,0);
		}
		public TerminalNode ACH() { return getToken(GramaticaSintatica.ACH, 0); }
		public QualquerCoisaContext qualquerCoisa() {
			return getRuleContext(QualquerCoisaContext.class,0);
		}
		public TerminalNode FCH() { return getToken(GramaticaSintatica.FCH, 0); }
		public ElseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_else; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSintaticaListener ) ((GramaticaSintaticaListener)listener).enterElse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSintaticaListener ) ((GramaticaSintaticaListener)listener).exitElse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaSintaticaVisitor ) return ((GramaticaSintaticaVisitor<? extends T>)visitor).visitElse(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElseContext else_() throws RecognitionException {
		ElseContext _localctx = new ElseContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_else);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(151);
			match(ELSE);
			setState(157);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IF:
				{
				setState(152);
				condicao();
				}
				break;
			case ACH:
				{
				{
				setState(153);
				match(ACH);
				setState(154);
				qualquerCoisa();
				setState(155);
				match(FCH);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
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

	public static class ExprRelacionalContext extends ParserRuleContext {
		public List<ElementoContext> elemento() {
			return getRuleContexts(ElementoContext.class);
		}
		public ElementoContext elemento(int i) {
			return getRuleContext(ElementoContext.class,i);
		}
		public TerminalNode OPRE() { return getToken(GramaticaSintatica.OPRE, 0); }
		public ExprRelacionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprRelacional; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSintaticaListener ) ((GramaticaSintaticaListener)listener).enterExprRelacional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSintaticaListener ) ((GramaticaSintaticaListener)listener).exitExprRelacional(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaSintaticaVisitor ) return ((GramaticaSintaticaVisitor<? extends T>)visitor).visitExprRelacional(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprRelacionalContext exprRelacional() throws RecognitionException {
		ExprRelacionalContext _localctx = new ExprRelacionalContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_exprRelacional);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(159);
			elemento();
			setState(160);
			match(OPRE);
			setState(161);
			elemento();
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

	public static class ExprCondicionalContext extends ParserRuleContext {
		public List<ExprRelacionalContext> exprRelacional() {
			return getRuleContexts(ExprRelacionalContext.class);
		}
		public ExprRelacionalContext exprRelacional(int i) {
			return getRuleContext(ExprRelacionalContext.class,i);
		}
		public List<TerminalNode> OPBO() { return getTokens(GramaticaSintatica.OPBO); }
		public TerminalNode OPBO(int i) {
			return getToken(GramaticaSintatica.OPBO, i);
		}
		public ExprCondicionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprCondicional; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSintaticaListener ) ((GramaticaSintaticaListener)listener).enterExprCondicional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSintaticaListener ) ((GramaticaSintaticaListener)listener).exitExprCondicional(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaSintaticaVisitor ) return ((GramaticaSintaticaVisitor<? extends T>)visitor).visitExprCondicional(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprCondicionalContext exprCondicional() throws RecognitionException {
		ExprCondicionalContext _localctx = new ExprCondicionalContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_exprCondicional);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(163);
			exprRelacional();
			setState(168);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OPBO) {
				{
				{
				setState(164);
				match(OPBO);
				setState(165);
				exprRelacional();
				}
				}
				setState(170);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
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

	public static class ExprAtContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(GramaticaSintatica.ID, 0); }
		public TerminalNode OPAT() { return getToken(GramaticaSintatica.OPAT, 0); }
		public ExprArContext exprAr() {
			return getRuleContext(ExprArContext.class,0);
		}
		public ElementoContext elemento() {
			return getRuleContext(ElementoContext.class,0);
		}
		public ExprCondicionalContext exprCondicional() {
			return getRuleContext(ExprCondicionalContext.class,0);
		}
		public ExprAtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprAt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSintaticaListener ) ((GramaticaSintaticaListener)listener).enterExprAt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSintaticaListener ) ((GramaticaSintaticaListener)listener).exitExprAt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaSintaticaVisitor ) return ((GramaticaSintaticaVisitor<? extends T>)visitor).visitExprAt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprAtContext exprAt() throws RecognitionException {
		ExprAtContext _localctx = new ExprAtContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_exprAt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(171);
			match(ID);
			setState(172);
			match(OPAT);
			setState(176);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				setState(173);
				exprAr();
				}
				break;
			case 2:
				{
				setState(174);
				elemento();
				}
				break;
			case 3:
				{
				setState(175);
				exprCondicional();
				}
				break;
			}
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

	public static class ExprArContext extends ParserRuleContext {
		public List<ElementoContext> elemento() {
			return getRuleContexts(ElementoContext.class);
		}
		public ElementoContext elemento(int i) {
			return getRuleContext(ElementoContext.class,i);
		}
		public TerminalNode OPAR() { return getToken(GramaticaSintatica.OPAR, 0); }
		public ExprArContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprAr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSintaticaListener ) ((GramaticaSintaticaListener)listener).enterExprAr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSintaticaListener ) ((GramaticaSintaticaListener)listener).exitExprAr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaSintaticaVisitor ) return ((GramaticaSintaticaVisitor<? extends T>)visitor).visitExprAr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprArContext exprAr() throws RecognitionException {
		ExprArContext _localctx = new ExprArContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_exprAr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(178);
			elemento();
			setState(179);
			match(OPAR);
			setState(180);
			elemento();
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

	public static class InputContext extends ParserRuleContext {
		public TerminalNode INPUT() { return getToken(GramaticaSintatica.INPUT, 0); }
		public TerminalNode AP() { return getToken(GramaticaSintatica.AP, 0); }
		public TerminalNode FP() { return getToken(GramaticaSintatica.FP, 0); }
		public TerminalNode TEXTO() { return getToken(GramaticaSintatica.TEXTO, 0); }
		public InputContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_input; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSintaticaListener ) ((GramaticaSintaticaListener)listener).enterInput(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSintaticaListener ) ((GramaticaSintaticaListener)listener).exitInput(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaSintaticaVisitor ) return ((GramaticaSintaticaVisitor<? extends T>)visitor).visitInput(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InputContext input() throws RecognitionException {
		InputContext _localctx = new InputContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_input);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(182);
			match(INPUT);
			setState(183);
			match(AP);
			setState(185);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TEXTO) {
				{
				setState(184);
				match(TEXTO);
				}
			}

			setState(187);
			match(FP);
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

	public static class OutputContext extends ParserRuleContext {
		public TerminalNode OUTPUT() { return getToken(GramaticaSintatica.OUTPUT, 0); }
		public TerminalNode AP() { return getToken(GramaticaSintatica.AP, 0); }
		public TerminalNode TEXTO() { return getToken(GramaticaSintatica.TEXTO, 0); }
		public TerminalNode FP() { return getToken(GramaticaSintatica.FP, 0); }
		public OutputContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_output; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSintaticaListener ) ((GramaticaSintaticaListener)listener).enterOutput(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSintaticaListener ) ((GramaticaSintaticaListener)listener).exitOutput(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaSintaticaVisitor ) return ((GramaticaSintaticaVisitor<? extends T>)visitor).visitOutput(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OutputContext output() throws RecognitionException {
		OutputContext _localctx = new OutputContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_output);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(189);
			match(OUTPUT);
			setState(190);
			match(AP);
			setState(191);
			match(TEXTO);
			setState(192);
			match(FP);
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

	public static class CallFuncContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(GramaticaSintatica.ID, 0); }
		public TerminalNode AP() { return getToken(GramaticaSintatica.AP, 0); }
		public TerminalNode FP() { return getToken(GramaticaSintatica.FP, 0); }
		public ElementoCallContext elementoCall() {
			return getRuleContext(ElementoCallContext.class,0);
		}
		public CallFuncContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_callFunc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSintaticaListener ) ((GramaticaSintaticaListener)listener).enterCallFunc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSintaticaListener ) ((GramaticaSintaticaListener)listener).exitCallFunc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaSintaticaVisitor ) return ((GramaticaSintaticaVisitor<? extends T>)visitor).visitCallFunc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CallFuncContext callFunc() throws RecognitionException {
		CallFuncContext _localctx = new CallFuncContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_callFunc);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(194);
			match(ID);
			setState(195);
			match(AP);
			setState(197);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ID) | (1L << VALBO) | (1L << AP) | (1L << INPUT) | (1L << TEXTO) | (1L << NUM))) != 0)) {
				{
				setState(196);
				elementoCall();
				}
			}

			setState(199);
			match(FP);
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

	public static class ElementoCallContext extends ParserRuleContext {
		public List<ExpressaoContext> expressao() {
			return getRuleContexts(ExpressaoContext.class);
		}
		public ExpressaoContext expressao(int i) {
			return getRuleContext(ExpressaoContext.class,i);
		}
		public List<ElementoContext> elemento() {
			return getRuleContexts(ElementoContext.class);
		}
		public ElementoContext elemento(int i) {
			return getRuleContext(ElementoContext.class,i);
		}
		public List<TerminalNode> SEPARADOR() { return getTokens(GramaticaSintatica.SEPARADOR); }
		public TerminalNode SEPARADOR(int i) {
			return getToken(GramaticaSintatica.SEPARADOR, i);
		}
		public ElementoCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementoCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSintaticaListener ) ((GramaticaSintaticaListener)listener).enterElementoCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSintaticaListener ) ((GramaticaSintaticaListener)listener).exitElementoCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaSintaticaVisitor ) return ((GramaticaSintaticaVisitor<? extends T>)visitor).visitElementoCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementoCallContext elementoCall() throws RecognitionException {
		ElementoCallContext _localctx = new ElementoCallContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_elementoCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(203);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				setState(201);
				expressao();
				}
				break;
			case 2:
				{
				setState(202);
				elemento();
				}
				break;
			}
			setState(212);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SEPARADOR) {
				{
				{
				setState(205);
				match(SEPARADOR);
				setState(208);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
				case 1:
					{
					setState(206);
					expressao();
					}
					break;
				case 2:
					{
					setState(207);
					elemento();
					}
					break;
				}
				}
				}
				setState(214);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
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

	public static class ElementoContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(GramaticaSintatica.ID, 0); }
		public InputContext input() {
			return getRuleContext(InputContext.class,0);
		}
		public TerminalNode NUM() { return getToken(GramaticaSintatica.NUM, 0); }
		public TerminalNode TEXTO() { return getToken(GramaticaSintatica.TEXTO, 0); }
		public CallFuncContext callFunc() {
			return getRuleContext(CallFuncContext.class,0);
		}
		public TerminalNode VALBO() { return getToken(GramaticaSintatica.VALBO, 0); }
		public ElementoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elemento; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSintaticaListener ) ((GramaticaSintaticaListener)listener).enterElemento(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSintaticaListener ) ((GramaticaSintaticaListener)listener).exitElemento(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaSintaticaVisitor ) return ((GramaticaSintaticaVisitor<? extends T>)visitor).visitElemento(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementoContext elemento() throws RecognitionException {
		ElementoContext _localctx = new ElementoContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_elemento);
		try {
			setState(221);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(215);
				match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(216);
				input();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(217);
				match(NUM);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(218);
				match(TEXTO);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(219);
				callFunc();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(220);
				match(VALBO);
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

	public static class ExpressaoContext extends ParserRuleContext {
		public CallFuncContext callFunc() {
			return getRuleContext(CallFuncContext.class,0);
		}
		public ExprArContext exprAr() {
			return getRuleContext(ExprArContext.class,0);
		}
		public ExprCondicionalContext exprCondicional() {
			return getRuleContext(ExprCondicionalContext.class,0);
		}
		public TerminalNode AP() { return getToken(GramaticaSintatica.AP, 0); }
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public TerminalNode FP() { return getToken(GramaticaSintatica.FP, 0); }
		public ExpressaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSintaticaListener ) ((GramaticaSintaticaListener)listener).enterExpressao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaSintaticaListener ) ((GramaticaSintaticaListener)listener).exitExpressao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaSintaticaVisitor ) return ((GramaticaSintaticaVisitor<? extends T>)visitor).visitExpressao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressaoContext expressao() throws RecognitionException {
		ExpressaoContext _localctx = new ExpressaoContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_expressao);
		try {
			setState(230);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(223);
				callFunc();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(224);
				exprAr();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(225);
				exprCondicional();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(226);
				match(AP);
				setState(227);
				expressao();
				setState(228);
				match(FP);
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

	public static final String _serializedATN =
		"\u0004\u0001\u001d\u00e9\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007"+
		"\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007"+
		"\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007"+
		"\u0015\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0005\u00011\b"+
		"\u0001\n\u0001\f\u00014\t\u0001\u0001\u0001\u0005\u00017\b\u0001\n\u0001"+
		"\f\u0001:\t\u0001\u0001\u0002\u0003\u0002=\b\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0003\u0003\u0003C\b\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0005\u0005U\b\u0005\n\u0005\f\u0005X\t\u0005"+
		"\u0003\u0005Z\b\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0005\u0007r\b\u0007\n\u0007\f\u0007u\t\u0007\u0001\b\u0001\b\u0001\b"+
		"\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0003\n\u0096\b\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0003\u000b\u009e\b\u000b\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0005\r\u00a7\b\r\n\r\f\r\u00aa"+
		"\t\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0003"+
		"\u000e\u00b1\b\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0003\u0010\u00ba\b\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0003\u0012\u00c6\b\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0013\u0001\u0013\u0003\u0013\u00cc\b\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0003\u0013\u00d1\b\u0013\u0005\u0013\u00d3\b\u0013"+
		"\n\u0013\f\u0013\u00d6\t\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0003\u0014\u00de\b\u0014\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0003"+
		"\u0015\u00e7\b\u0015\u0001\u0015\u0000\u0000\u0016\u0000\u0002\u0004\u0006"+
		"\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*\u0000"+
		"\u0001\u0002\u0000\u0001\u0001\u001a\u001a\u00f3\u0000,\u0001\u0000\u0000"+
		"\u0000\u00022\u0001\u0000\u0000\u0000\u0004<\u0001\u0000\u0000\u0000\u0006"+
		"B\u0001\u0000\u0000\u0000\bM\u0001\u0000\u0000\u0000\nY\u0001\u0000\u0000"+
		"\u0000\f[\u0001\u0000\u0000\u0000\u000es\u0001\u0000\u0000\u0000\u0010"+
		"v\u0001\u0000\u0000\u0000\u0012\u0084\u0001\u0000\u0000\u0000\u0014\u008c"+
		"\u0001\u0000\u0000\u0000\u0016\u0097\u0001\u0000\u0000\u0000\u0018\u009f"+
		"\u0001\u0000\u0000\u0000\u001a\u00a3\u0001\u0000\u0000\u0000\u001c\u00ab"+
		"\u0001\u0000\u0000\u0000\u001e\u00b2\u0001\u0000\u0000\u0000 \u00b6\u0001"+
		"\u0000\u0000\u0000\"\u00bd\u0001\u0000\u0000\u0000$\u00c2\u0001\u0000"+
		"\u0000\u0000&\u00cb\u0001\u0000\u0000\u0000(\u00dd\u0001\u0000\u0000\u0000"+
		"*\u00e6\u0001\u0000\u0000\u0000,-\u0003\u0002\u0001\u0000-.\u0005\u0000"+
		"\u0000\u0001.\u0001\u0001\u0000\u0000\u0000/1\u0003\u0004\u0002\u0000"+
		"0/\u0001\u0000\u0000\u000014\u0001\u0000\u0000\u000020\u0001\u0000\u0000"+
		"\u000023\u0001\u0000\u0000\u000038\u0001\u0000\u0000\u000042\u0001\u0000"+
		"\u0000\u000057\u0003\u0006\u0003\u000065\u0001\u0000\u0000\u00007:\u0001"+
		"\u0000\u0000\u000086\u0001\u0000\u0000\u000089\u0001\u0000\u0000\u0000"+
		"9\u0003\u0001\u0000\u0000\u0000:8\u0001\u0000\u0000\u0000;=\u0005\u0018"+
		"\u0000\u0000<;\u0001\u0000\u0000\u0000<=\u0001\u0000\u0000\u0000=>\u0001"+
		"\u0000\u0000\u0000>?\u0003\f\u0006\u0000?@\u0005\u0013\u0000\u0000@\u0005"+
		"\u0001\u0000\u0000\u0000AC\u0005\u0018\u0000\u0000BA\u0001\u0000\u0000"+
		"\u0000BC\u0001\u0000\u0000\u0000CD\u0001\u0000\u0000\u0000DE\u0003\f\u0006"+
		"\u0000EF\u0005\r\u0000\u0000FG\u0003\n\u0005\u0000GH\u0005\u000e\u0000"+
		"\u0000HI\u0005\u000f\u0000\u0000IJ\u0003\u000e\u0007\u0000JK\u0003\b\u0004"+
		"\u0000KL\u0005\u0010\u0000\u0000L\u0007\u0001\u0000\u0000\u0000MN\u0005"+
		"\u0015\u0000\u0000NO\u0003(\u0014\u0000OP\u0005\u0013\u0000\u0000P\t\u0001"+
		"\u0000\u0000\u0000QV\u0003\f\u0006\u0000RS\u0005\u0014\u0000\u0000SU\u0003"+
		"\f\u0006\u0000TR\u0001\u0000\u0000\u0000UX\u0001\u0000\u0000\u0000VT\u0001"+
		"\u0000\u0000\u0000VW\u0001\u0000\u0000\u0000WZ\u0001\u0000\u0000\u0000"+
		"XV\u0001\u0000\u0000\u0000YQ\u0001\u0000\u0000\u0000YZ\u0001\u0000\u0000"+
		"\u0000Z\u000b\u0001\u0000\u0000\u0000[\\\u0005\u0006\u0000\u0000\\]\u0005"+
		"\u0001\u0000\u0000]\r\u0001\u0000\u0000\u0000^r\u0003\u0004\u0002\u0000"+
		"_r\u0003\u0010\b\u0000`r\u0003\u0012\t\u0000ar\u0003\u0014\n\u0000bc\u0003"+
		"\u001c\u000e\u0000cd\u0005\u0013\u0000\u0000dr\u0001\u0000\u0000\u0000"+
		"ef\u0003\u001e\u000f\u0000fg\u0005\u0013\u0000\u0000gr\u0001\u0000\u0000"+
		"\u0000hi\u0003 \u0010\u0000ij\u0005\u0013\u0000\u0000jr\u0001\u0000\u0000"+
		"\u0000kl\u0003\"\u0011\u0000lm\u0005\u0013\u0000\u0000mr\u0001\u0000\u0000"+
		"\u0000no\u0003$\u0012\u0000op\u0005\u0013\u0000\u0000pr\u0001\u0000\u0000"+
		"\u0000q^\u0001\u0000\u0000\u0000q_\u0001\u0000\u0000\u0000q`\u0001\u0000"+
		"\u0000\u0000qa\u0001\u0000\u0000\u0000qb\u0001\u0000\u0000\u0000qe\u0001"+
		"\u0000\u0000\u0000qh\u0001\u0000\u0000\u0000qk\u0001\u0000\u0000\u0000"+
		"qn\u0001\u0000\u0000\u0000ru\u0001\u0000\u0000\u0000sq\u0001\u0000\u0000"+
		"\u0000st\u0001\u0000\u0000\u0000t\u000f\u0001\u0000\u0000\u0000us\u0001"+
		"\u0000\u0000\u0000vw\u0005\u000b\u0000\u0000wx\u0005\r\u0000\u0000xy\u0005"+
		"\u0001\u0000\u0000yz\u0005\u0014\u0000\u0000z{\u0007\u0000\u0000\u0000"+
		"{|\u0005\u0014\u0000\u0000|}\u0007\u0000\u0000\u0000}~\u0005\u0014\u0000"+
		"\u0000~\u007f\u0005\u001a\u0000\u0000\u007f\u0080\u0005\u000e\u0000\u0000"+
		"\u0080\u0081\u0005\u000f\u0000\u0000\u0081\u0082\u0003\u000e\u0007\u0000"+
		"\u0082\u0083\u0005\u0010\u0000\u0000\u0083\u0011\u0001\u0000\u0000\u0000"+
		"\u0084\u0085\u0005\f\u0000\u0000\u0085\u0086\u0005\r\u0000\u0000\u0086"+
		"\u0087\u0003\u001a\r\u0000\u0087\u0088\u0005\u000e\u0000\u0000\u0088\u0089"+
		"\u0005\u000f\u0000\u0000\u0089\u008a\u0003\u000e\u0007\u0000\u008a\u008b"+
		"\u0005\u0010\u0000\u0000\u008b\u0013\u0001\u0000\u0000\u0000\u008c\u008d"+
		"\u0005\b\u0000\u0000\u008d\u008e\u0005\r\u0000\u0000\u008e\u008f\u0003"+
		"\u001a\r\u0000\u008f\u0090\u0005\u000e\u0000\u0000\u0090\u0091\u0005\n"+
		"\u0000\u0000\u0091\u0092\u0005\u000f\u0000\u0000\u0092\u0093\u0003\u000e"+
		"\u0007\u0000\u0093\u0095\u0005\u0010\u0000\u0000\u0094\u0096\u0003\u0016"+
		"\u000b\u0000\u0095\u0094\u0001\u0000\u0000\u0000\u0095\u0096\u0001\u0000"+
		"\u0000\u0000\u0096\u0015\u0001\u0000\u0000\u0000\u0097\u009d\u0005\t\u0000"+
		"\u0000\u0098\u009e\u0003\u0014\n\u0000\u0099\u009a\u0005\u000f\u0000\u0000"+
		"\u009a\u009b\u0003\u000e\u0007\u0000\u009b\u009c\u0005\u0010\u0000\u0000"+
		"\u009c\u009e\u0001\u0000\u0000\u0000\u009d\u0098\u0001\u0000\u0000\u0000"+
		"\u009d\u0099\u0001\u0000\u0000\u0000\u009e\u0017\u0001\u0000\u0000\u0000"+
		"\u009f\u00a0\u0003(\u0014\u0000\u00a0\u00a1\u0005\u0004\u0000\u0000\u00a1"+
		"\u00a2\u0003(\u0014\u0000\u00a2\u0019\u0001\u0000\u0000\u0000\u00a3\u00a8"+
		"\u0003\u0018\f\u0000\u00a4\u00a5\u0005\u0005\u0000\u0000\u00a5\u00a7\u0003"+
		"\u0018\f\u0000\u00a6\u00a4\u0001\u0000\u0000\u0000\u00a7\u00aa\u0001\u0000"+
		"\u0000\u0000\u00a8\u00a6\u0001\u0000\u0000\u0000\u00a8\u00a9\u0001\u0000"+
		"\u0000\u0000\u00a9\u001b\u0001\u0000\u0000\u0000\u00aa\u00a8\u0001\u0000"+
		"\u0000\u0000\u00ab\u00ac\u0005\u0001\u0000\u0000\u00ac\u00b0\u0005\u0002"+
		"\u0000\u0000\u00ad\u00b1\u0003\u001e\u000f\u0000\u00ae\u00b1\u0003(\u0014"+
		"\u0000\u00af\u00b1\u0003\u001a\r\u0000\u00b0\u00ad\u0001\u0000\u0000\u0000"+
		"\u00b0\u00ae\u0001\u0000\u0000\u0000\u00b0\u00af\u0001\u0000\u0000\u0000"+
		"\u00b1\u001d\u0001\u0000\u0000\u0000\u00b2\u00b3\u0003(\u0014\u0000\u00b3"+
		"\u00b4\u0005\u0003\u0000\u0000\u00b4\u00b5\u0003(\u0014\u0000\u00b5\u001f"+
		"\u0001\u0000\u0000\u0000\u00b6\u00b7\u0005\u0016\u0000\u0000\u00b7\u00b9"+
		"\u0005\r\u0000\u0000\u00b8\u00ba\u0005\u0019\u0000\u0000\u00b9\u00b8\u0001"+
		"\u0000\u0000\u0000\u00b9\u00ba\u0001\u0000\u0000\u0000\u00ba\u00bb\u0001"+
		"\u0000\u0000\u0000\u00bb\u00bc\u0005\u000e\u0000\u0000\u00bc!\u0001\u0000"+
		"\u0000\u0000\u00bd\u00be\u0005\u0017\u0000\u0000\u00be\u00bf\u0005\r\u0000"+
		"\u0000\u00bf\u00c0\u0005\u0019\u0000\u0000\u00c0\u00c1\u0005\u000e\u0000"+
		"\u0000\u00c1#\u0001\u0000\u0000\u0000\u00c2\u00c3\u0005\u0001\u0000\u0000"+
		"\u00c3\u00c5\u0005\r\u0000\u0000\u00c4\u00c6\u0003&\u0013\u0000\u00c5"+
		"\u00c4\u0001\u0000\u0000\u0000\u00c5\u00c6\u0001\u0000\u0000\u0000\u00c6"+
		"\u00c7\u0001\u0000\u0000\u0000\u00c7\u00c8\u0005\u000e\u0000\u0000\u00c8"+
		"%\u0001\u0000\u0000\u0000\u00c9\u00cc\u0003*\u0015\u0000\u00ca\u00cc\u0003"+
		"(\u0014\u0000\u00cb\u00c9\u0001\u0000\u0000\u0000\u00cb\u00ca\u0001\u0000"+
		"\u0000\u0000\u00cc\u00d4\u0001\u0000\u0000\u0000\u00cd\u00d0\u0005\u0014"+
		"\u0000\u0000\u00ce\u00d1\u0003*\u0015\u0000\u00cf\u00d1\u0003(\u0014\u0000"+
		"\u00d0\u00ce\u0001\u0000\u0000\u0000\u00d0\u00cf\u0001\u0000\u0000\u0000"+
		"\u00d1\u00d3\u0001\u0000\u0000\u0000\u00d2\u00cd\u0001\u0000\u0000\u0000"+
		"\u00d3\u00d6\u0001\u0000\u0000\u0000\u00d4\u00d2\u0001\u0000\u0000\u0000"+
		"\u00d4\u00d5\u0001\u0000\u0000\u0000\u00d5\'\u0001\u0000\u0000\u0000\u00d6"+
		"\u00d4\u0001\u0000\u0000\u0000\u00d7\u00de\u0005\u0001\u0000\u0000\u00d8"+
		"\u00de\u0003 \u0010\u0000\u00d9\u00de\u0005\u001a\u0000\u0000\u00da\u00de"+
		"\u0005\u0019\u0000\u0000\u00db\u00de\u0003$\u0012\u0000\u00dc\u00de\u0005"+
		"\u0007\u0000\u0000\u00dd\u00d7\u0001\u0000\u0000\u0000\u00dd\u00d8\u0001"+
		"\u0000\u0000\u0000\u00dd\u00d9\u0001\u0000\u0000\u0000\u00dd\u00da\u0001"+
		"\u0000\u0000\u0000\u00dd\u00db\u0001\u0000\u0000\u0000\u00dd\u00dc\u0001"+
		"\u0000\u0000\u0000\u00de)\u0001\u0000\u0000\u0000\u00df\u00e7\u0003$\u0012"+
		"\u0000\u00e0\u00e7\u0003\u001e\u000f\u0000\u00e1\u00e7\u0003\u001a\r\u0000"+
		"\u00e2\u00e3\u0005\r\u0000\u0000\u00e3\u00e4\u0003*\u0015\u0000\u00e4"+
		"\u00e5\u0005\u000e\u0000\u0000\u00e5\u00e7\u0001\u0000\u0000\u0000\u00e6"+
		"\u00df\u0001\u0000\u0000\u0000\u00e6\u00e0\u0001\u0000\u0000\u0000\u00e6"+
		"\u00e1\u0001\u0000\u0000\u0000\u00e6\u00e2\u0001\u0000\u0000\u0000\u00e7"+
		"+\u0001\u0000\u0000\u0000\u001328<BVYqs\u0095\u009d\u00a8\u00b0\u00b9"+
		"\u00c5\u00cb\u00d0\u00d4\u00dd\u00e6";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}