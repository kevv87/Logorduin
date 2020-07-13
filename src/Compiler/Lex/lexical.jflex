package Compiler.Lex;
import static Compiler.Lex.Tokens.*;
%%
%class Lexer
%line
%column
%type Tokens
L = [a-zA-Z]+
Digit = [1-9][0-9]*
Zero = 0
Float = [0-9]+"."[0-9]+
espacio = [ ,\t,\r,\n]+
Ident = [a-z][A-Z|a-z|_|&|@|0-9]{1,9}
Identi = [a-z] [A-Za-z]{1,9}
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

ocultatortuga |
ot |
aparecetortuga |
at |
rumbo |
bajalapiz |
bl |
subelapiz |
sb |
centro | 
borrarpantalla {lexeme = yytext(); return Procedimiento;}

avanza |
av |
retrocede |
re |
giraderecha |
gd |
giraizquierda |
gi |
ponrumbo |
ponx |
pony |
poncolorlapiz |
poncl |
espera |
redondea |
cos |
azar |
menos |
raizcuadrada |
rc |
seno |
sen {lexeme = yytext(); return Procedimiento1;}

ponxy |
"iguales?" |
y |
o |
"mayorque?" |
"menorque?" |
potencia |
division |
resto {lexeme = yytext(); return Procedimiento2;}

diferencia |
producto |
suma {lexeme = yytext(); return ProcedimientoN;}

inc |
ponpos |
ejecuta |
elegir |
cuenta |
ultimo |
ul |
primero {lexeme = yytext(); return ProcedimientoP;}

repite |
si |
elemento {lexeme = yytext(); return Procedimiento1P;}


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
{Ident} | {Identi} {lexeme = yytext(); return Identificador;}
{Digit} | {L} | {Float} | {Zero} {lexeme = yytext(); return Constante;}
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