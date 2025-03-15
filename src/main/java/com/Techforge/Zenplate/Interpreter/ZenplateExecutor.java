package com.Techforge.Zenplate.Interpreter;

import java.nio.file.Files;
import java.nio.file.Paths;
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
	
	public static void main(String[] args) {
		
		String input = "";
		
		try {
			 input = new String(Files.readAllBytes(Paths.get("/Zenplate/src/main/resources/simple.jastra")));
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		CharStream charStream = CharStreams.fromString(input);
		
		ZenplateLexer lexer = new ZenplateLexer(charStream);
		
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		
		ZenplateParser parser = new ZenplateParser(tokens);
		 ParseTree tree = parser.template();
		
		Map<String, Object> map = new HashMap<>();
		map.put("username", "inbanithi");
		map.put("worker", "some");
		map.put("hello", true);
		
		ZenplateEngine engine = new ZenplateEngine(map);
		engine.visit(tree);
		System.out.println(engine.getTemplate());
		
	}

}
class User{
	String usenrame;
	String password;
	public User(String username, String password) {
		this.usenrame = username;
		this.password = password;
	}
}
