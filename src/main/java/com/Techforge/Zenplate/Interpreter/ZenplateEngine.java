package com.Techforge.Zenplate.Interpreter;

import java.util.HashMap;
import java.util.Map;

import com.Techforge.JastraScriptEngine.JastraScriptEngineExecutor;
import com.Techforge.Zenplate.ZenplateBaseVisitor;
import com.Techforge.Zenplate.ZenplateParser.PlaceholderContext;
import com.Techforge.Zenplate.ZenplateParser.StatementContext;
import com.Techforge.Zenplate.ZenplateParser.TemplateContext;
import com.Techforge.Zenplate.ZenplateParser.TextContext;


public class ZenplateEngine extends ZenplateBaseVisitor<String>{
	
	
	private final StringBuilder builder;
	
	private JastraScriptEngineExecutor excutor;
	
	public ZenplateEngine(Map<String, Object> context) {
		this.builder = new StringBuilder();
		this.excutor=new JastraScriptEngineExecutor(context);
	}
	
	public ZenplateEngine() {
		this.builder = new StringBuilder();
	}

	@Override
	public String visitPlaceholder(PlaceholderContext ctx) {
		String result = ctx.getText();
		String content =  result.substring(2, result.length()-2);
		String output = excutor.execute(content);
		return output;
	}

	@Override
	public String visitTemplate(TemplateContext ctx) {
		
		for(StatementContext stmt : ctx.statement()) {
			builder.append(visit(stmt));
		}
		return null;
	}

	@Override
	public String visitText(TextContext ctx) {
		return ctx.getText();
	}
	
	public String getTemplate() {
		return builder.toString();
	}

}
