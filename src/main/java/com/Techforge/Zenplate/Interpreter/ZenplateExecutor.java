package com.Techforge.Zenplate.Interpreter;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ParseTree;

import com.Techforge.Zenplate.ZenplateLexer;
import com.Techforge.Zenplate.ZenplateParser;

public class ZenplateExecutor {
	
	public String  template(String filename, Map<String, Object> context) {
		
		String input = new ResourceReader().readResource(filename);
		
		CharStream charStream = CharStreams.fromString(input);
		
		ZenplateLexer lexer = new ZenplateLexer(charStream);
		
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		
		ZenplateParser parser = new ZenplateParser(tokens);
		 ParseTree tree = parser.template();
		
		ZenplateEngine engine = new ZenplateEngine(context);
		engine.visit(tree);

		return engine.getTemplate();
	}

}


