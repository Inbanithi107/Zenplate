// Generated from com/Techforge/Zenplate/Zenplate.g4 by ANTLR 4.13.2
package com.Techforge.Zenplate;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ZenplateParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ZenplateVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ZenplateParser#template}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTemplate(ZenplateParser.TemplateContext ctx);
	/**
	 * Visit a parse tree produced by {@link ZenplateParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(ZenplateParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ZenplateParser#text}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitText(ZenplateParser.TextContext ctx);
	/**
	 * Visit a parse tree produced by {@link ZenplateParser#placeholder}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPlaceholder(ZenplateParser.PlaceholderContext ctx);
}