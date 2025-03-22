// Generated from com/Techforge/Zenplate/Content.g4 by ANTLR 4.13.2
package com.Techforge.Zenplate;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ContentParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ContentVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ContentParser#content}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContent(ContentParser.ContentContext ctx);
	/**
	 * Visit a parse tree produced by {@link ContentParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(ContentParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code variableExpression}
	 * labeled alternative in {@link ContentParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableExpression(ContentParser.VariableExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code methodCallExpression}
	 * labeled alternative in {@link ContentParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodCallExpression(ContentParser.MethodCallExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ifstatementExpression}
	 * labeled alternative in {@link ContentParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfstatementExpression(ContentParser.IfstatementExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code interpolationExpression}
	 * labeled alternative in {@link ContentParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterpolationExpression(ContentParser.InterpolationExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ContentParser#identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier(ContentParser.IdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link ContentParser#methodCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodCall(ContentParser.MethodCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link ContentParser#ifStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatement(ContentParser.IfStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ContentParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition(ContentParser.ConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ContentParser#interpolation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterpolation(ContentParser.InterpolationContext ctx);
}