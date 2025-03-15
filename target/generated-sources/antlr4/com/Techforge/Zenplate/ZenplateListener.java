// Generated from com/Techforge/Zenplate/Zenplate.g4 by ANTLR 4.13.2
package com.Techforge.Zenplate;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ZenplateParser}.
 */
public interface ZenplateListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ZenplateParser#template}.
	 * @param ctx the parse tree
	 */
	void enterTemplate(ZenplateParser.TemplateContext ctx);
	/**
	 * Exit a parse tree produced by {@link ZenplateParser#template}.
	 * @param ctx the parse tree
	 */
	void exitTemplate(ZenplateParser.TemplateContext ctx);
	/**
	 * Enter a parse tree produced by {@link ZenplateParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(ZenplateParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ZenplateParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(ZenplateParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ZenplateParser#text}.
	 * @param ctx the parse tree
	 */
	void enterText(ZenplateParser.TextContext ctx);
	/**
	 * Exit a parse tree produced by {@link ZenplateParser#text}.
	 * @param ctx the parse tree
	 */
	void exitText(ZenplateParser.TextContext ctx);
	/**
	 * Enter a parse tree produced by {@link ZenplateParser#placeholder}.
	 * @param ctx the parse tree
	 */
	void enterPlaceholder(ZenplateParser.PlaceholderContext ctx);
	/**
	 * Exit a parse tree produced by {@link ZenplateParser#placeholder}.
	 * @param ctx the parse tree
	 */
	void exitPlaceholder(ZenplateParser.PlaceholderContext ctx);
}