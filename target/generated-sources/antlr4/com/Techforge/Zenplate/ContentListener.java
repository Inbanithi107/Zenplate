// Generated from com/Techforge/Zenplate/Content.g4 by ANTLR 4.13.2
package com.Techforge.Zenplate;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ContentParser}.
 */
public interface ContentListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ContentParser#content}.
	 * @param ctx the parse tree
	 */
	void enterContent(ContentParser.ContentContext ctx);
	/**
	 * Exit a parse tree produced by {@link ContentParser#content}.
	 * @param ctx the parse tree
	 */
	void exitContent(ContentParser.ContentContext ctx);
	/**
	 * Enter a parse tree produced by {@link ContentParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(ContentParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ContentParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(ContentParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code variableExpression}
	 * labeled alternative in {@link ContentParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterVariableExpression(ContentParser.VariableExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code variableExpression}
	 * labeled alternative in {@link ContentParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitVariableExpression(ContentParser.VariableExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code methodCallExpression}
	 * labeled alternative in {@link ContentParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterMethodCallExpression(ContentParser.MethodCallExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code methodCallExpression}
	 * labeled alternative in {@link ContentParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitMethodCallExpression(ContentParser.MethodCallExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ifstatementExpression}
	 * labeled alternative in {@link ContentParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterIfstatementExpression(ContentParser.IfstatementExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ifstatementExpression}
	 * labeled alternative in {@link ContentParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitIfstatementExpression(ContentParser.IfstatementExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code interpolationExpression}
	 * labeled alternative in {@link ContentParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterInterpolationExpression(ContentParser.InterpolationExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code interpolationExpression}
	 * labeled alternative in {@link ContentParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitInterpolationExpression(ContentParser.InterpolationExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ContentParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(ContentParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link ContentParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(ContentParser.IdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link ContentParser#methodCall}.
	 * @param ctx the parse tree
	 */
	void enterMethodCall(ContentParser.MethodCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link ContentParser#methodCall}.
	 * @param ctx the parse tree
	 */
	void exitMethodCall(ContentParser.MethodCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link ContentParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(ContentParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ContentParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(ContentParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ContentParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(ContentParser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ContentParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(ContentParser.ConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ContentParser#interpolation}.
	 * @param ctx the parse tree
	 */
	void enterInterpolation(ContentParser.InterpolationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ContentParser#interpolation}.
	 * @param ctx the parse tree
	 */
	void exitInterpolation(ContentParser.InterpolationContext ctx);
}