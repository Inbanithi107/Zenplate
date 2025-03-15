grammar Zenplate;

template : (statement)*;
statement : text | placeholder;
text : TEXT;
placeholder : '{' .*? '}' ;

TEXT : ~[{}]+ ;  // Matches anything except `{}`

LPRACE : '{'; // Enter ID mode on `{`
RPRACE : '}';         // Exit ID mode on `}`

WS           : [ \t\r\n]+ -> skip;