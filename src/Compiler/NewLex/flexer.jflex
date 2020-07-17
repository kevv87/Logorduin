package Compiler.NewLex;

import Compiler.Jacc.ParserTokens;
import java.io.*;

%%

%public
%class NewLexer
%line
%column
%type Integer
%implements ParserTokens

%{
    public String lexeme;
    public int line;
    public int column;
    public int intValue;
    public float floatValue;
    public int currentToken; //Para obtener el token actual sin avanzar el parseo

    public int getCurrentToken() {
        return this.currentToken;
    }

    public String getSemantic() {
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

    public int getCurrentLine() {
        return this.line;
    }

    public int getCurrentColumn() {
        return this.column;
    }

    public int prepare(int token) {
        lexeme = yytext();
        line = yyline;
        column = yycolumn;
        currentToken = token;
        return token;
    }

    public int getIntValue() {
        return this.intValue;
    }

    public float getFloatValue() {
        return this.floatValue;
    }

%}

LineTerminator = \r|\n|\r\n
Space = {LineTerminator} | [\t\f] | [ ]
InputCharacter = [^\r\n]

Comment = {EndOfLineComment} //| {TraditionalComment}
//TraditionalComment = "/*" [^*] ~"*/" | "/*" "*"+ "/"
EndOfLineComment = "//" {InputCharacter}* {LineTerminator}?

Identifier = [a-z][a-z|A-Z|_|&|@|0-9]{1,9}
IdeError = [A-Za-z_&@0-9]* //TODO agregar error cuando hay mas de 10 caracteres en el identificador
Digit = 0 | [1-9][0-9]*
Float = [0-9]+ "." [0-9]+
TerminalChars = "=" | "*" | "+" | "-" | "/" | "-" | ">" | "<" | ";" | "[" | "]" | "(" | ")"

%%


{Digit} { 
    lexeme = yytext();
    line = yyline;
    column = yycolumn;
    intValue = Integer.parseInt(lexeme);
    currentToken = INTEGER;
    return currentToken; 
}

{Float} {
    lexeme = yytext();
    line = yyline;
    column = yycolumn;
    floatValue = Float.parseFloat(lexeme);
    currentToken = FLOAT;
    return currentToken;
}

{Comment} { /* Ignore */ }
{Space} { /* Ignore */ }

{TerminalChars} {
    String token = yytext();
    lexeme = token;
    line = yyline;
    column = yycolumn;
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


{Identifier} { return prepare(IDENTIFIER); }

{IdeError} {
    lexeme = yytext();
    line = yyline;
    column = yycolumn;
    return error;} //TODO CAMBIAR POR ERROR DE IDENTIFICADOR MAL DEFINIDO

[^] {// token desconocido
    lexeme = yytext();
    line = yyline;
    column = yycolumn;
    return error;} //TODO CAMBIAR POR ERROR DE SIMBOLO NO DEFINIDO EN LA GRAMATICA

/* Error Fallback */
//[^] { /* TODO: manejar errores */ }
