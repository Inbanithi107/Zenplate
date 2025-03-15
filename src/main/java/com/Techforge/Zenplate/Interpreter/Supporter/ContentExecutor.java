package com.Techforge.Zenplate.Interpreter.Supporter;

import java.util.Map;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import com.Techforge.Zenplate.ContentLexer;
import com.Techforge.Zenplate.ContentParser;

public class ContentExecutor {
	
	public String renderContent(String content, Map<String, Object> context) {
		
		CharStream stream = CharStreams.fromString(content);
		
		ContentLexer lexer = new ContentLexer(stream);
		
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		
		ContentParser parser = new ContentParser(tokens);
		
		ParseTree tree = parser.content();
		
		ContentEngine engine = new ContentEngine(context);
		engine.visit(tree);
		return engine.getOutput();
	}

}
