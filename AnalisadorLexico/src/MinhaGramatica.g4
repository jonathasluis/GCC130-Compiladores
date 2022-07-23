grammar MinhaGramatica;

ID: [a-z](DIGITO|LETRA)*;
OPAT: '=';
OPAR: '+'|'-'|'*'|'/'|'|'|'%';
OPRE: '=='|'>'|'>='|'<'|'<='|'!=';
OPBO: 'E'|'OU'|'NAO'|'OUX';
TIPO: 'INTEIRO' | 'REAL' | 'CARACTERER' | 'BOOLEANO';
COND: 'SE' | 'SENAO'| 'ENTAO';
LOOP: 'PARA' | 'ENQUANTO';
AP: '(';
FP: ')';
ACH: '{';
FCH: '}';
AC: '[';
FC: ']';
DELIMITADOR: ';';
RETORNO:'RETORNO';

NUM: DIGITO+('.'DIGITO+)?;
fragment LETRA: [a-zA-Z];
fragment DIGITO: [0-9];
WS: [ \r\t\n]* ->skip;
ErrorChar: . ;
