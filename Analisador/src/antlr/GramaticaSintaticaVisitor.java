// Generated from D:/Users/jonat/Documents/UFLA/5-semestre/compiladores/analise-lexica/CompiladorExemplo/Trabalho-de-Compiladores/Analisador/src/antlr\GramaticaSintatica.g4 by ANTLR 4.10.1
package antlr;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link GramaticaSintatica}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface GramaticaSintaticaVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link GramaticaSintatica#inicio}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInicio(GramaticaSintatica.InicioContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaSintatica#programa}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrograma(GramaticaSintatica.ProgramaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LDeclaracao}
	 * labeled alternative in {@link GramaticaSintatica#declaracao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLDeclaracao(GramaticaSintatica.LDeclaracaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaSintatica#metodo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMetodo(GramaticaSintatica.MetodoContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaSintatica#retorno}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRetorno(GramaticaSintatica.RetornoContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaSintatica#parametrosFunc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParametrosFunc(GramaticaSintatica.ParametrosFuncContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaSintatica#variavel}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariavel(GramaticaSintatica.VariavelContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BlocoCodigo}
	 * labeled alternative in {@link GramaticaSintatica#qualquerCoisa}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlocoCodigo(GramaticaSintatica.BlocoCodigoContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaSintatica#for}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor(GramaticaSintatica.ForContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaSintatica#while}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile(GramaticaSintatica.WhileContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaSintatica#condicao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondicao(GramaticaSintatica.CondicaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaSintatica#else}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElse(GramaticaSintatica.ElseContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaSintatica#exprRelacional}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprRelacional(GramaticaSintatica.ExprRelacionalContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaSintatica#exprCondicional}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprCondicional(GramaticaSintatica.ExprCondicionalContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaSintatica#exprAt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprAt(GramaticaSintatica.ExprAtContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaSintatica#exprAr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprAr(GramaticaSintatica.ExprArContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaSintatica#input}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInput(GramaticaSintatica.InputContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaSintatica#output}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOutput(GramaticaSintatica.OutputContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaSintatica#callFunc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallFunc(GramaticaSintatica.CallFuncContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaSintatica#elementoCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementoCall(GramaticaSintatica.ElementoCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaSintatica#elemento}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElemento(GramaticaSintatica.ElementoContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaSintatica#expressao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressao(GramaticaSintatica.ExpressaoContext ctx);
}