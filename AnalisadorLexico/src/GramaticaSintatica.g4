parser grammar GramaticaSintatica;

options
{
  tokenVocab=MinhaGramatica;
}

// ? -> zero ou uma vez
// * -> zero ou mais vezes
// + -> uma ou mais vezes

inicio : programa EOF;
programa : (declaracao)* (metodo)*;
declaracao : (MODACESSO)? variavel DELIMITADOR;
metodo : (MODACESSO)? variavel AP parametrosFunc FP ACH qualquerCoisa retorno FCH;
retorno : RETORNO ID DELIMITADOR;
parametrosFunc : (variavel (SEPARADOR variavel)*)?;
variavel : TIPO ID;
qualquerCoisa : ( declaracao
    | for
    | while
    | condicao
    | exprAt DELIMITADOR
    | exprAr DELIMITADOR
    | input DELIMITADOR
    | output DELIMITADOR
    | callFunc DELIMITADOR)*;
for : FOR AP ID SEPARADOR (NUM | ID) SEPARADOR (NUM | ID) SEPARADOR NUM FP ACH qualquerCoisa FCH;
while : WHILE AP exprCondicional FP ACH qualquerCoisa FCH;
condicao : IF AP exprCondicional FP THEN  ACH qualquerCoisa FCH else?;
else : ELSE (condicao | (ACH qualquerCoisa FCH));
exprRelacional : ID OPRE (ID | NUM | TEXTO);
exprCondicional : exprRelacional (OPBO exprRelacional)*;
exprAt : ID OPAT (exprAr | ID | input | NUM | TEXTO | callFunc);
exprAr : (ID | NUM | TEXTO) OPAR (ID | NUM | TEXTO);
input : INPUT AP (TEXTO)? FP;
output : OUTPUT AP TEXTO FP;
callFunc : ID AP elementoCall FP;
elementoCall : expressao (SEPARADOR expressao)*;
expressao : callFunc
    | exprAr
    | exprCondicional
    | AP expressao FP;



