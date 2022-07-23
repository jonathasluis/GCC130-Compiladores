// Generated from D:/Users/jonat/Documents/UFLA/5-semestre/compiladores/analise-lexica/CompiladorExemplo/Trabalho-de-Compiladores/AnalisadorLexico/src\MinhaGramatica.g4 by ANTLR 4.10.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MinhaGramaticaLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.10.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ID=1, OPAT=2, OPAR=3, OPRE=4, OPBO=5, AP=6, FP=7, NUM=8, WS=9, ErrorChar=10;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"ID", "OPAT", "OPAR", "OPRE", "OPBO", "AP", "FP", "NUM", "LETRA", "DIGITO", 
			"WS", "ErrorChar"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, "'='", null, null, null, "'('", "')'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "ID", "OPAT", "OPAR", "OPRE", "OPBO", "AP", "FP", "NUM", "WS", 
			"ErrorChar"
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


	public MinhaGramaticaLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "MinhaGramatica.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\u0004\u0000\n[\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0001\u0000\u0001\u0000\u0001\u0000\u0005\u0000\u001d\b\u0000"+
		"\n\u0000\f\u0000 \t\u0000\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u00030\b\u0003"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004;\b\u0004\u0001\u0005"+
		"\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0007\u0004\u0007B\b\u0007"+
		"\u000b\u0007\f\u0007C\u0001\u0007\u0001\u0007\u0004\u0007H\b\u0007\u000b"+
		"\u0007\f\u0007I\u0003\u0007L\b\u0007\u0001\b\u0001\b\u0001\t\u0001\t\u0001"+
		"\n\u0005\nS\b\n\n\n\f\nV\t\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0000"+
		"\u0000\f\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b"+
		"\u0006\r\u0007\u000f\b\u0011\u0000\u0013\u0000\u0015\t\u0017\n\u0001\u0000"+
		"\u0005\u0001\u0000az\u0005\u0000%%*+--//||\u0002\u0000AZaz\u0001\u0000"+
		"09\u0003\u0000\t\n\r\r  f\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003"+
		"\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007"+
		"\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001"+
		"\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000"+
		"\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000"+
		"\u0000\u0000\u0001\u0019\u0001\u0000\u0000\u0000\u0003!\u0001\u0000\u0000"+
		"\u0000\u0005#\u0001\u0000\u0000\u0000\u0007/\u0001\u0000\u0000\u0000\t"+
		":\u0001\u0000\u0000\u0000\u000b<\u0001\u0000\u0000\u0000\r>\u0001\u0000"+
		"\u0000\u0000\u000fA\u0001\u0000\u0000\u0000\u0011M\u0001\u0000\u0000\u0000"+
		"\u0013O\u0001\u0000\u0000\u0000\u0015T\u0001\u0000\u0000\u0000\u0017Y"+
		"\u0001\u0000\u0000\u0000\u0019\u001e\u0007\u0000\u0000\u0000\u001a\u001d"+
		"\u0003\u0013\t\u0000\u001b\u001d\u0003\u0011\b\u0000\u001c\u001a\u0001"+
		"\u0000\u0000\u0000\u001c\u001b\u0001\u0000\u0000\u0000\u001d \u0001\u0000"+
		"\u0000\u0000\u001e\u001c\u0001\u0000\u0000\u0000\u001e\u001f\u0001\u0000"+
		"\u0000\u0000\u001f\u0002\u0001\u0000\u0000\u0000 \u001e\u0001\u0000\u0000"+
		"\u0000!\"\u0005=\u0000\u0000\"\u0004\u0001\u0000\u0000\u0000#$\u0007\u0001"+
		"\u0000\u0000$\u0006\u0001\u0000\u0000\u0000%&\u0005=\u0000\u0000&0\u0005"+
		"=\u0000\u0000\'0\u0005>\u0000\u0000()\u0005>\u0000\u0000)0\u0005=\u0000"+
		"\u0000*0\u0005<\u0000\u0000+,\u0005<\u0000\u0000,0\u0005=\u0000\u0000"+
		"-.\u0005!\u0000\u0000.0\u0005=\u0000\u0000/%\u0001\u0000\u0000\u0000/"+
		"\'\u0001\u0000\u0000\u0000/(\u0001\u0000\u0000\u0000/*\u0001\u0000\u0000"+
		"\u0000/+\u0001\u0000\u0000\u0000/-\u0001\u0000\u0000\u00000\b\u0001\u0000"+
		"\u0000\u00001;\u0005E\u0000\u000023\u0005O\u0000\u00003;\u0005U\u0000"+
		"\u000045\u0005N\u0000\u000056\u0005A\u0000\u00006;\u0005O\u0000\u0000"+
		"78\u0005O\u0000\u000089\u0005U\u0000\u00009;\u0005X\u0000\u0000:1\u0001"+
		"\u0000\u0000\u0000:2\u0001\u0000\u0000\u0000:4\u0001\u0000\u0000\u0000"+
		":7\u0001\u0000\u0000\u0000;\n\u0001\u0000\u0000\u0000<=\u0005(\u0000\u0000"+
		"=\f\u0001\u0000\u0000\u0000>?\u0005)\u0000\u0000?\u000e\u0001\u0000\u0000"+
		"\u0000@B\u0003\u0013\t\u0000A@\u0001\u0000\u0000\u0000BC\u0001\u0000\u0000"+
		"\u0000CA\u0001\u0000\u0000\u0000CD\u0001\u0000\u0000\u0000DK\u0001\u0000"+
		"\u0000\u0000EG\u0005.\u0000\u0000FH\u0003\u0013\t\u0000GF\u0001\u0000"+
		"\u0000\u0000HI\u0001\u0000\u0000\u0000IG\u0001\u0000\u0000\u0000IJ\u0001"+
		"\u0000\u0000\u0000JL\u0001\u0000\u0000\u0000KE\u0001\u0000\u0000\u0000"+
		"KL\u0001\u0000\u0000\u0000L\u0010\u0001\u0000\u0000\u0000MN\u0007\u0002"+
		"\u0000\u0000N\u0012\u0001\u0000\u0000\u0000OP\u0007\u0003\u0000\u0000"+
		"P\u0014\u0001\u0000\u0000\u0000QS\u0007\u0004\u0000\u0000RQ\u0001\u0000"+
		"\u0000\u0000SV\u0001\u0000\u0000\u0000TR\u0001\u0000\u0000\u0000TU\u0001"+
		"\u0000\u0000\u0000UW\u0001\u0000\u0000\u0000VT\u0001\u0000\u0000\u0000"+
		"WX\u0006\n\u0000\u0000X\u0016\u0001\u0000\u0000\u0000YZ\t\u0000\u0000"+
		"\u0000Z\u0018\u0001\u0000\u0000\u0000\t\u0000\u001c\u001e/:CIKT\u0001"+
		"\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}