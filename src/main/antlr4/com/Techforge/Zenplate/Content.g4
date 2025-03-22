grammar Content;

content : (statement)+;

statement : expression;

expression : identifier #variableExpression
            | methodCall #methodCallExpression
            | ifStatement #ifstatementExpression
            | interpolation #interpolationExpression
            ;

identifier : ID;
methodCall : identifier ('.' ID)*;
ifStatement : IF '(' condition ')' '{' expression '}' (ELSE '{' expression '}')?;
condition : expression OP expression;
interpolation : STRING ('+' expression)*? ;

IF : 'if';
ELSE : 'else';
OP : '<' | '>' | '==' | '!=';
STRING : '"' .*? '"';
ID : [a-zA-Z_] [a-zA-Z0-9_]*;
WS : [ \t\r\n]+ -> skip;
