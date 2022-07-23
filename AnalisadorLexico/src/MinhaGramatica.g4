grammar MinhaGramatica;

ID: [a-z](DIGITO|LETRA)*;
OPAT: '=';
OPAR: '+'|'-'|'*'|'/'|'|'|'%';
OPRE: '=='|'>'|'>='|'<'|'<='|'!=';
OPBO: 'E'|'OU'|'NAO'|'OUX';
AP: '(';
FP: ')';
NUM: DIGITO+('.'DIGITO+)?;
fragment LETRA: [a-zA-Z];
fragment DIGITO: [0-9];
WS: [ \r\t\n]* ->skip;
ErrorChar: . ;
