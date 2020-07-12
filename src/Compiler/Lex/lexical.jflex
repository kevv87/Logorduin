
package Compiler.Lex;
import static Compiler.Lex.Tokens.*;
%%
%class Lexer
%line
%column
%type Tokens
L = [a-zA-Z]*
D = [0-9]+
espacio = [ ,\t,\r,\n]+
Identt = [a-z][A-Za-z_&@0-9]{1,9}
IdeError = [A-Za-z_&@0-9]*
%{
    public String lexeme;
    public int line;
    public int column;
%}
%%
para |
fin |
var |
inic {lexeme = yytext(); return Reservadas;}
{espacio} {/*Ignore*/}
"//".* {/*Ignore*/}
"=" |
"*" |
">" |
"<" |
"/" {lexeme = yytext(); return Operador;}
";" |
"[" |
"]" |
"(" |
")" {lexeme = yytext(); return SimboloEspecial;}
{D} | {L} {lexeme = yytext(); return Constante;}
{Identt} {lexeme = yytext(); return Identificador;}
{IdeError} {
    lexeme = yytext(); 
    line = yyline;
    column = yycolumn;
    return Error;}
 . {// token desconocido
    lexeme = yytext();
    line = yyline;
    column = yycolumn;
    return Error;}