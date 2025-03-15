package com.Techforge.Zenplate.Interpreter.Supporter;

import java.util.List;
import java.util.Map;

import com.Techforge.Zenplate.ContentBaseVisitor;
import com.Techforge.Zenplate.ContentParser.IfStatementExpressionContext;
import com.Techforge.Zenplate.ContentParser.MethodCallExpressionContext;
import com.Techforge.Zenplate.ContentParser.StatementContext;
import com.Techforge.Zenplate.ContentParser.VariableExpressionContext;

public class ContentEngine extends ContentBaseVisitor<String>{
	
	private final StringBuilder builder;
	
	private Map<String, Object> context;
	
	public ContentEngine(Map<String, Object> map) {
		this.builder = new StringBuilder();
		this.context = map;		
	}

	@Override
	public String visitIfStatementExpression(IfStatementExpressionContext arg0) {
		// TODO Auto-generated method stub
		return super.visitIfStatementExpression(arg0);
	}

	@Override
	public String visitMethodCallExpression(MethodCallExpressionContext arg0) {
		// TODO Auto-generated method stub
		return super.visitMethodCallExpression(arg0);
	}

	@Override
	public String visitStatement(StatementContext ctx) {
		String result = visit(ctx.expression());
		builder.append(result);
		return null;
	}

	@Override
	public String visitVariableExpression(VariableExpressionContext ctx) {
		String reference = ctx.identifier().getText();
		return context.getOrDefault(reference, "unable to find").toString();
	}
	
	public String getOutput() {
		return builder.toString();
	}

}
