grammar Content;

content : (statement)*;

statement : expression;

expression : identifier #variableExpression
			| methodCall # methodCallExpression
			| ifStatement # ifStatementExpression
			;
identifier : ID;
methodCall : identifier.ID'(' ')';
ifStatement : 'if' '(' expression ')' '{'
		expression | STRING '}';

ID : [a-zA-Z_] [a-zA-Z0-9_]*;
STRING : '"' .*? '"';
WS : [ \t\r\n]+ -> skip;