package Compiler.Lex;

import Compiler.Jacc.ParserTokens;
import java.io.*;

%%

%public
%class Lexer
%line
%column
%type Integer
%implements ParserTokens

%{
    public Object lexeme; //Para almacenar tokens de tipo String, Boolean, Integer y Float
    public int currentToken; //Para obtener el token actual sin avanzar el parseo
    public String errorMessage; //Para obtener los errores
    public Boolean lexerError = false; //Para identificar si el error fue léxico

    public String getErrorMessage() {
        return this.errorMessage;
    }

    public Boolean isLexerError() {
        return lexerError;
    }

    public int getCurrentToken() {
        return this.currentToken;
    }

    public Object getSemantic() {
        return this.lexeme;
    }

    public int getNextToken() {
        try {
            Integer token = yylex();
            if (token == null) {
                currentToken = ENDINPUT;
                return currentToken;
            }
            return token;
        } catch(IOException ex) {
            ex.printStackTrace();
            return -1;
        }
    }

    public int getLine() {
        return yyline;
    }

    public int getColumn() {
        return yycolumn;
    }

    public int prepare(int token) {
        lexeme = yytext();
        currentToken = token;
        return token;
    }

%}

LineTerminator = \r|\n|\r\n
Space = {LineTerminator} | [\t\f] | [ ]
InputCharacter = [^\r\n]

Comment = {EndOfLineComment} //| {TraditionalComment}
//TraditionalComment = "/*" [^*] ~"*/" | "/*" "*"+ "/"
EndOfLineComment = "//" {InputCharacter}* {LineTerminator}?

Identifier = [a-z][a-z|A-Z|_|&|@|0-9|-]{1,9}

MayusError = [A-Z][a-z|A-Z|_|&|@|0-9|-]{1,9}
SymbolError = [_|&|@|-][a-z|A-Z|_|&|@|0-9|-]{1,9}
NumberError = [0-9][a-z|A-Z|_|&|@|0-9|-]{1,9}

IdentifierError = [A-Z|a-z|_|&|@|0-9|-|\^]{1,10}
LengthError = [a-z][a-z|A-Z|_|&|@|0-9|-]*

Digit = 0 | [1-9][0-9]*
Float = [0-9]+ "." [0-9]+
TerminalChars = "=" | "*" | "+" | "-" | "/" | "-" | ">" | "<" | ";" | "[" | "]" | "(" | ")"

%%


{Digit} { 
    String value = yytext();
    Integer intValue = Integer.parseInt(value);
    lexeme = intValue;
    currentToken = INTEGER;
    return currentToken; 
}

{Float} {
    String value = yytext();
    Float floatValue = Float.parseFloat(value);
    lexeme = floatValue;
    currentToken = FLOAT;
    return currentToken;
}

{Comment} { /* Ignore */ }
{Space} { /* Ignore */ }

{TerminalChars} {
    String token = yytext();
    lexeme = token;
    char tokenValue = token.charAt(0);
    currentToken = tokenValue;
    return currentToken;
}

var     { return prepare(VAR); }
inic    { return prepare(INIC); }
ocultatortuga { return prepare(OCULTATORTUGA); }
ot { return prepare(OT); }
aparecetortuga { return prepare(APARECETORTUGA); }
at { return prepare(AT); }
rumbo { return prepare(RUMBO); }
bajalapiz { return prepare(BAJALAPIZ); }
bl { return prepare(BL); }
subelapiz { return prepare(SUBELAPIZ); }
sb { return prepare(SB); }
centro { return prepare(CENTRO); }
borrapantalla { return prepare(BORRAPANTALLA); }
avanza { return prepare(AVANZA); }
av { return prepare(AV); }
retrocede { return prepare(RETROCEDE); }
re { return prepare(RE); }
giraderecha { return prepare(GIRADERECHA); }
gd { return prepare(GD); }
giraizquierda { return prepare(GIRAIZQUIERDA); }
gi { return prepare(GI); }
ponrumbo { return prepare(PONRUMBO); }
ponx { return prepare(PONX); }
pony { return prepare(PONY); }
poncolorlapiz {return prepare(PONCOLORLAPIZ); }
poncl {return prepare(PONCL); }
espera {return prepare(ESPERA); }
redondea {return prepare(REDONDEA); }
cos {return prepare(COS); }
azar {return prepare(AZAR); }
menos {return prepare(MENOS); }
raizcuadrada {return prepare(RAIZCUADRADA); }
rc {return prepare(RC); }
seno {return prepare(SENO); }
sen {return prepare(SEN); }
ponxy {return prepare(PONXY); }
"iguales?" {return prepare(IGUALES); }
y {return prepare(Y); }
o {return prepare(O); }
"mayorque?" {return prepare(MAYORQUE); }
"menorque?" {return prepare(MENORQUE); }
potencia {return prepare(POTENCIA); }
division {return prepare(DIVISION); }
resto {return prepare(RESTO); }
diferencia {return prepare(DIFERENCIA); }
producto {return prepare(PRODUCTO); }
suma {return prepare(SUMA); }
inc {return prepare(INC); }
ponpos {return prepare(PONPOS); }
ejecuta {return prepare(EJECUTA); }
elegir {return prepare(ELEGIR); }
cuenta {return prepare(CUENTA); }
ultimo {return prepare(ULTIMO); }
ul {return prepare(UL); }
primero {return prepare(PRIMERO); }
repite {return prepare(REPITE); }
si {return prepare(SI); }
elemento {return prepare(ELEMENTO); }
para {return prepare(PARA); }
fin {return prepare(FIN); }
blanco {return prepare(BLANCO); }
azul {return prepare(AZUL); }
marron {return prepare(MARRON); }
cian {return prepare(CIAN); }
gris {return prepare(GRIS); }
amarillo {return prepare(AMARILLO); }
negro {return prepare(NEGRO); }
rojo {return prepare(ROJO); }
verde {return prepare(VERDE); }


{Identifier} { return prepare(IDENTIFIER); }

{MayusError} {
    lexeme = yytext();
    errorMessage = "El identificador <" + lexeme + "> no puede iniciar con mayuscula, linea " + yyline + ", columna " + yycolumn;
    lexerError = true;
    return error;}

{SymbolError} {
    lexeme = yytext();
    errorMessage = "El identificador <" + lexeme + "> no puede iniciar con simbolos, linea " + yyline + ", columna " + yycolumn;
    lexerError = true;
    return error;}

{NumberError} {
    lexeme = yytext();
    errorMessage = "El identificador <" + lexeme + "> no puede iniciar con numeros, linea " + yyline + ", columna " + yycolumn;
    lexerError = true;
    return error;}

{LengthError} {
    lexeme = yytext();
    errorMessage = "El identificador <" + lexeme + "> supera el tamaño máximo de 10 carácteres, linea " + yyline + ", columna " + yycolumn;
    lexerError = true;
    return error;} 

{IdentifierError} {
    lexeme = yytext();
    errorMessage = "Identificador mal definido <" + lexeme + ">, linea " + yyline + ", columna " + yycolumn;
    lexerError = true;
    return error;} 

[^] {// token desconocido
    lexeme = yytext();
    errorMessage = "Simbolo desconocido <" + lexeme + ">, linea " + yyline + ", columna " + yycolumn;
    lexerError = true;
    return error;} 

/* Error Fallback */
//[^] { /* TODO: manejar errores */ }
