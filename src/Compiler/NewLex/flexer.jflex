package Compiler.NewLex;
import Compiler.Jacc.ParserTokens;

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

    public int getCurrentLine() {
        return this.line;
    }

    public int getCurrentColumn() {
        return this.column;
    }

    public int prepare(int token) {
        lexeme = yytext();
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
Space = {LineTerminator} | [\t\f]
InputCharacter = [^\r\n]

Comment = {TraditionalComment} //| {EndOfLineComment}
//TraditionalComment = "/*" [^*] ~"*/" | "/*" "*"+ "/"
EndOfLineComment = "//" {InputCharacter}* {LineTerminator}?

Identifier = [A-Z][a-z|A-Z|_|&|@|0-9]*
Digit = 0 | [1-9][0-9]*
Float = [0+9]+ "." [0-9]+
TerminalChars = "=" | "*" | "+" | "-" | "/" | "-" | ">" | "<" | ";" | "[" | "]" | "(" | ")"

%%

{Identifier} { return prepare(IDENTIFIER); }

{Digit} { 
    lexeme = yytext();
    intValue = Integer.parseInt(lexeme);
    currentToken = INTEGER;
    return currentToken; 
}

{Float} {
    lexeme = yytext();
    floatValue = Float.parseFloat(lexeme);
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
ocultatortuga { return prepare(OCULTARTORTUGA); }
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
giraizquierda { return prepare(GIRAIZQUIERZA); } /* TODO: REEMPLAZAR POR GIRAIZQUIERDA */
gi { return prepare(GI); }
ponrumbo { return prepare(PONRUMBO); }
ponx { return prepare(PONX); }
pony { return prepare(PONY); }

/* Error Fallback */
[^] { /* TODO: manejar errores */ }
