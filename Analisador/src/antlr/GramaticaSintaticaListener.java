// Generated from D:/Users/jonat/Documents/UFLA/5-semestre/compiladores/analise-lexica/CompiladorExemplo/Trabalho-de-Compiladores/Analisador/src/antlr\GramaticaSintatica.g4 by ANTLR 4.10.1
package antlr;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link GramaticaSintatica}.
 */
public interface GramaticaSintaticaListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link GramaticaSintatica#inicio}.
	 * @param ctx the parse tree
	 */
	void enterInicio(GramaticaSintatica.InicioContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaSintatica#inicio}.
	 * @param ctx the parse tree
	 */
	void exitInicio(GramaticaSintatica.InicioContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaSintatica#programa}.
	 * @param ctx the parse tree
	 */
	void enterPrograma(GramaticaSintatica.ProgramaContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaSintatica#programa}.
	 * @param ctx the parse tree
	 */
	void exitPrograma(GramaticaSintatica.ProgramaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LDeclaracao}
	 * labeled alternative in {@link GramaticaSintatica#declaracao}.
	 * @param ctx the parse tree
	 */
	void enterLDeclaracao(GramaticaSintatica.LDeclaracaoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LDeclaracao}
	 * labeled alternative in {@link GramaticaSintatica#declaracao}.
	 * @param ctx the parse tree
	 */
	void exitLDeclaracao(GramaticaSintatica.LDeclaracaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaSintatica#metodo}.
	 * @param ctx the parse tree
	 */
	void enterMetodo(GramaticaSintatica.MetodoContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaSintatica#metodo}.
	 * @param ctx the parse tree
	 */
	void exitMetodo(GramaticaSintatica.MetodoContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaSintatica#retorno}.
	 * @param ctx the parse tree
	 */
	void enterRetorno(GramaticaSintatica.RetornoContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaSintatica#retorno}.
	 * @param ctx the parse tree
	 */
	void exitRetorno(GramaticaSintatica.RetornoContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaSintatica#parametrosFunc}.
	 * @param ctx the parse tree
	 */
	void enterParametrosFunc(GramaticaSintatica.ParametrosFuncContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaSintatica#parametrosFunc}.
	 * @param ctx the parse tree
	 */
	void exitParametrosFunc(GramaticaSintatica.ParametrosFuncContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaSintatica#variavel}.
	 * @param ctx the parse tree
	 */
	void enterVariavel(GramaticaSintatica.VariavelContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaSintatica#variavel}.
	 * @param ctx the parse tree
	 */
	void exitVariavel(GramaticaSintatica.VariavelContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaSintatica#qualquerCoisa}.
	 * @param ctx the parse tree
	 */
	void enterQualquerCoisa(GramaticaSintatica.QualquerCoisaContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaSintatica#qualquerCoisa}.
	 * @param ctx the parse tree
	 */
	void exitQualquerCoisa(GramaticaSintatica.QualquerCoisaContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaSintatica#for}.
	 * @param ctx the parse tree
	 */
	void enterFor(GramaticaSintatica.ForContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaSintatica#for}.
	 * @param ctx the parse tree
	 */
	void exitFor(GramaticaSintatica.ForContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaSintatica#while}.
	 * @param ctx the parse tree
	 */
	void enterWhile(GramaticaSintatica.WhileContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaSintatica#while}.
	 * @param ctx the parse tree
	 */
	void exitWhile(GramaticaSintatica.WhileContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaSintatica#condicao}.
	 * @param ctx the parse tree
	 */
	void enterCondicao(GramaticaSintatica.CondicaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaSintatica#condicao}.
	 * @param ctx the parse tree
	 */
	void exitCondicao(GramaticaSintatica.CondicaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaSintatica#else}.
	 * @param ctx the parse tree
	 */
	void enterElse(GramaticaSintatica.ElseContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaSintatica#else}.
	 * @param ctx the parse tree
	 */
	void exitElse(GramaticaSintatica.ElseContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaSintatica#exprRelacional}.
	 * @param ctx the parse tree
	 */
	void enterExprRelacional(GramaticaSintatica.ExprRelacionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaSintatica#exprRelacional}.
	 * @param ctx the parse tree
	 */
	void exitExprRelacional(GramaticaSintatica.ExprRelacionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaSintatica#exprCondicional}.
	 * @param ctx the parse tree
	 */
	void enterExprCondicional(GramaticaSintatica.ExprCondicionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaSintatica#exprCondicional}.
	 * @param ctx the parse tree
	 */
	void exitExprCondicional(GramaticaSintatica.ExprCondicionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaSintatica#exprAt}.
	 * @param ctx the parse tree
	 */
	void enterExprAt(GramaticaSintatica.ExprAtContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaSintatica#exprAt}.
	 * @param ctx the parse tree
	 */
	void exitExprAt(GramaticaSintatica.ExprAtContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaSintatica#exprAr}.
	 * @param ctx the parse tree
	 */
	void enterExprAr(GramaticaSintatica.ExprArContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaSintatica#exprAr}.
	 * @param ctx the parse tree
	 */
	void exitExprAr(GramaticaSintatica.ExprArContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaSintatica#input}.
	 * @param ctx the parse tree
	 */
	void enterInput(GramaticaSintatica.InputContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaSintatica#input}.
	 * @param ctx the parse tree
	 */
	void exitInput(GramaticaSintatica.InputContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaSintatica#output}.
	 * @param ctx the parse tree
	 */
	void enterOutput(GramaticaSintatica.OutputContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaSintatica#output}.
	 * @param ctx the parse tree
	 */
	void exitOutput(GramaticaSintatica.OutputContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaSintatica#callFunc}.
	 * @param ctx the parse tree
	 */
	void enterCallFunc(GramaticaSintatica.CallFuncContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaSintatica#callFunc}.
	 * @param ctx the parse tree
	 */
	void exitCallFunc(GramaticaSintatica.CallFuncContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaSintatica#elementoCall}.
	 * @param ctx the parse tree
	 */
	void enterElementoCall(GramaticaSintatica.ElementoCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaSintatica#elementoCall}.
	 * @param ctx the parse tree
	 */
	void exitElementoCall(GramaticaSintatica.ElementoCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaSintatica#elemento}.
	 * @param ctx the parse tree
	 */
	void enterElemento(GramaticaSintatica.ElementoContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaSintatica#elemento}.
	 * @param ctx the parse tree
	 */
	void exitElemento(GramaticaSintatica.ElementoContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramaticaSintatica#expressao}.
	 * @param ctx the parse tree
	 */
	void enterExpressao(GramaticaSintatica.ExpressaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramaticaSintatica#expressao}.
	 * @param ctx the parse tree
	 */
	void exitExpressao(GramaticaSintatica.ExpressaoContext ctx);
}