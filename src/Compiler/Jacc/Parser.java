// Output created by jacc on Fri Jul 17 21:33:13 CST 2020

package Compiler.Jacc;

import Compiler.Lex.Lexer;
import java.io.*;
import Logic.MessageType;
import Logic.jsonAction;
import java.util.ArrayList;

class Parser implements ParserTokens {
    private int yyss = 100;
    private int yytok;
    private int yysp = 0;
    private int[] yyst;
    protected int yyerrno = (-1);
    private Object[] yysv;
    private Object yyrv;

    public boolean parse() {
        int yyn = 0;
        yysp = 0;
        yyst = new int[yyss];
        yysv = new Object[yyss];
        yytok = (lexer.getCurrentToken()
                 );
    loop:
        for (;;) {
            switch (yyn) {
                case 0:
                    yyst[yysp] = 0;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 230:
                    yyn = yys0();
                    continue;

                case 1:
                    yyst[yysp] = 1;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 231:
                    switch (yytok) {
                        case ENDINPUT:
                            yyn = 460;
                            continue;
                    }
                    yyn = 463;
                    continue;

                case 2:
                    yyst[yysp] = 2;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 232:
                    yyn = yys2();
                    continue;

                case 3:
                    yyst[yysp] = 3;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 233:
                    yyn = yys3();
                    continue;

                case 4:
                    yyst[yysp] = 4;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 234:
                    switch (yytok) {
                        case ';':
                            yyn = 81;
                            continue;
                        case ENDINPUT:
                            yyn = yyr2();
                            continue;
                    }
                    yyn = 463;
                    continue;

                case 5:
                    yyst[yysp] = 5;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 235:
                    yyn = yys5();
                    continue;

                case 6:
                    yyst[yysp] = 6;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 236:
                    yyn = yys6();
                    continue;

                case 7:
                    yyst[yysp] = 7;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 237:
                    yyn = yys7();
                    continue;

                case 8:
                    yyst[yysp] = 8;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 238:
                    yyn = yys8();
                    continue;

                case 9:
                    yyst[yysp] = 9;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 239:
                    yyn = yys9();
                    continue;

                case 10:
                    yyst[yysp] = 10;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 240:
                    yyn = yys10();
                    continue;

                case 11:
                    yyst[yysp] = 11;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 241:
                    yyn = yys11();
                    continue;

                case 12:
                    yyst[yysp] = 12;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 242:
                    yyn = yys12();
                    continue;

                case 13:
                    yyst[yysp] = 13;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 243:
                    yyn = yys13();
                    continue;

                case 14:
                    yyst[yysp] = 14;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 244:
                    yyn = yys14();
                    continue;

                case 15:
                    yyst[yysp] = 15;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 245:
                    yyn = yys15();
                    continue;

                case 16:
                    yyst[yysp] = 16;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 246:
                    yyn = yys16();
                    continue;

                case 17:
                    yyst[yysp] = 17;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 247:
                    yyn = yys17();
                    continue;

                case 18:
                    yyst[yysp] = 18;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 248:
                    yyn = yys18();
                    continue;

                case 19:
                    yyst[yysp] = 19;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 249:
                    yyn = yys19();
                    continue;

                case 20:
                    yyst[yysp] = 20;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.getNextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 250:
                    yyn = yys20();
                    continue;

                case 21:
                    yyst[yysp] = 21;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.getNextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 251:
                    yyn = yys21();
                    continue;

                case 22:
                    yyst[yysp] = 22;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.getNextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 252:
                    yyn = yys22();
                    continue;

                case 23:
                    yyst[yysp] = 23;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.getNextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 253:
                    yyn = yys23();
                    continue;

                case 24:
                    yyst[yysp] = 24;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.getNextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 254:
                    yyn = yys24();
                    continue;

                case 25:
                    yyst[yysp] = 25;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.getNextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 255:
                    yyn = yys25();
                    continue;

                case 26:
                    yyst[yysp] = 26;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.getNextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 256:
                    yyn = yys26();
                    continue;

                case 27:
                    yyst[yysp] = 27;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.getNextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 257:
                    yyn = yys27();
                    continue;

                case 28:
                    yyst[yysp] = 28;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.getNextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 258:
                    yyn = yys28();
                    continue;

                case 29:
                    yyst[yysp] = 29;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.getNextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 259:
                    yyn = yys29();
                    continue;

                case 30:
                    yyst[yysp] = 30;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.getNextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 260:
                    switch (yytok) {
                        case '[':
                            yyn = 99;
                            continue;
                    }
                    yyn = 463;
                    continue;

                case 31:
                    yyst[yysp] = 31;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.getNextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 261:
                    yyn = yys31();
                    continue;

                case 32:
                    yyst[yysp] = 32;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.getNextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 262:
                    yyn = yys32();
                    continue;

                case 33:
                    yyst[yysp] = 33;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.getNextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 263:
                    switch (yytok) {
                        case '[':
                            yyn = 103;
                            continue;
                    }
                    yyn = 463;
                    continue;

                case 34:
                    yyst[yysp] = 34;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.getNextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 264:
                    switch (yytok) {
                        case '[':
                            yyn = 104;
                            continue;
                    }
                    yyn = 463;
                    continue;

                case 35:
                    yyst[yysp] = 35;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.getNextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 265:
                    switch (yytok) {
                        case IDENTIFIER:
                            yyn = 105;
                            continue;
                        case INTEGER:
                            yyn = 106;
                            continue;
                    }
                    yyn = 463;
                    continue;

                case 36:
                    yyst[yysp] = 36;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.getNextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 266:
                    yyn = yys36();
                    continue;

                case 37:
                    yyst[yysp] = 37;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.getNextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 267:
                    yyn = yys37();
                    continue;

                case 38:
                    yyst[yysp] = 38;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.getNextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 268:
                    yyn = yys38();
                    continue;

                case 39:
                    yyst[yysp] = 39;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.getNextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 269:
                    yyn = yys39();
                    continue;

                case 40:
                    yyst[yysp] = 40;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.getNextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 270:
                    yyn = yys40();
                    continue;

                case 41:
                    yyst[yysp] = 41;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.getNextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 271:
                    yyn = yys41();
                    continue;

                case 42:
                    yyst[yysp] = 42;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.getNextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 272:
                    yyn = yys42();
                    continue;

                case 43:
                    yyst[yysp] = 43;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.getNextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 273:
                    yyn = yys43();
                    continue;

                case 44:
                    yyst[yysp] = 44;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.getNextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 274:
                    switch (yytok) {
                        case '[':
                            yyn = 113;
                            continue;
                    }
                    yyn = 463;
                    continue;

                case 45:
                    yyst[yysp] = 45;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.getNextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 275:
                    switch (yytok) {
                        case IDENTIFIER:
                            yyn = 114;
                            continue;
                    }
                    yyn = 463;
                    continue;

                case 46:
                    yyst[yysp] = 46;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.getNextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 276:
                    yyn = yys46();
                    continue;

                case 47:
                    yyst[yysp] = 47;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.getNextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 277:
                    yyn = yys47();
                    continue;

                case 48:
                    yyst[yysp] = 48;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.getNextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 278:
                    yyn = yys48();
                    continue;

                case 49:
                    yyst[yysp] = 49;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.getNextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 279:
                    yyn = yys49();
                    continue;

                case 50:
                    yyst[yysp] = 50;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.getNextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 280:
                    yyn = yys50();
                    continue;

                case 51:
                    yyst[yysp] = 51;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.getNextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 281:
                    yyn = yys51();
                    continue;

                case 52:
                    yyst[yysp] = 52;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.getNextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 282:
                    yyn = yys52();
                    continue;

                case 53:
                    yyst[yysp] = 53;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.getNextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 283:
                    yyn = yys53();
                    continue;

                case 54:
                    yyst[yysp] = 54;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.getNextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 284:
                    yyn = yys54();
                    continue;

                case 55:
                    yyst[yysp] = 55;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.getNextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 285:
                    switch (yytok) {
                        case '[':
                            yyn = 130;
                            continue;
                    }
                    yyn = 463;
                    continue;

                case 56:
                    yyst[yysp] = 56;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.getNextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 286:
                    yyn = yys56();
                    continue;

                case 57:
                    yyst[yysp] = 57;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.getNextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 287:
                    yyn = yys57();
                    continue;

                case 58:
                    yyst[yysp] = 58;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.getNextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 288:
                    yyn = yys58();
                    continue;

                case 59:
                    yyst[yysp] = 59;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.getNextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 289:
                    yyn = yys59();
                    continue;

                case 60:
                    yyst[yysp] = 60;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.getNextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 290:
                    yyn = yys60();
                    continue;

                case 61:
                    yyst[yysp] = 61;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.getNextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 291:
                    switch (yytok) {
                        case '[':
                            yyn = 136;
                            continue;
                    }
                    yyn = 463;
                    continue;

                case 62:
                    yyst[yysp] = 62;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.getNextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 292:
                    yyn = yys62();
                    continue;

                case 63:
                    yyst[yysp] = 63;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.getNextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 293:
                    yyn = yys63();
                    continue;

                case 64:
                    yyst[yysp] = 64;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.getNextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 294:
                    yyn = yys64();
                    continue;

                case 65:
                    yyst[yysp] = 65;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.getNextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 295:
                    yyn = yys65();
                    continue;

                case 66:
                    yyst[yysp] = 66;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.getNextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 296:
                    yyn = yys66();
                    continue;

                case 67:
                    yyst[yysp] = 67;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.getNextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 297:
                    switch (yytok) {
                        case IDENTIFIER:
                            yyn = 142;
                            continue;
                        case INTEGER:
                            yyn = 143;
                            continue;
                    }
                    yyn = 463;
                    continue;

                case 68:
                    yyst[yysp] = 68;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.getNextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 298:
                    yyn = yys68();
                    continue;

                case 69:
                    yyst[yysp] = 69;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.getNextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 299:
                    yyn = yys69();
                    continue;

                case 70:
                    yyst[yysp] = 70;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.getNextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 300:
                    yyn = yys70();
                    continue;

                case 71:
                    yyst[yysp] = 71;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.getNextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 301:
                    yyn = yys71();
                    continue;

                case 72:
                    yyst[yysp] = 72;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.getNextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 302:
                    yyn = yys72();
                    continue;

                case 73:
                    yyst[yysp] = 73;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.getNextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 303:
                    yyn = yys73();
                    continue;

                case 74:
                    yyst[yysp] = 74;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.getNextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 304:
                    yyn = yys74();
                    continue;

                case 75:
                    yyst[yysp] = 75;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.getNextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 305:
                    yyn = yys75();
                    continue;

                case 76:
                    yyst[yysp] = 76;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.getNextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 306:
                    yyn = yys76();
                    continue;

                case 77:
                    yyst[yysp] = 77;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.getNextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 307:
                    switch (yytok) {
                        case '[':
                            yyn = 150;
                            continue;
                    }
                    yyn = 463;
                    continue;

                case 78:
                    yyst[yysp] = 78;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.getNextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 308:
                    switch (yytok) {
                        case '[':
                            yyn = 151;
                            continue;
                    }
                    yyn = 463;
                    continue;

                case 79:
                    yyst[yysp] = 79;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.getNextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 309:
                    switch (yytok) {
                        case IDENTIFIER:
                            yyn = 152;
                            continue;
                    }
                    yyn = 463;
                    continue;

                case 80:
                    yyst[yysp] = 80;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.getNextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 310:
                    yyn = yys80();
                    continue;

                case 81:
                    yyst[yysp] = 81;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.getNextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 311:
                    yyn = yys81();
                    continue;

                case 82:
                    yyst[yysp] = 82;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.getNextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 312:
                    yyn = yys82();
                    continue;

                case 83:
                    yyst[yysp] = 83;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.getNextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 313:
                    yyn = yys83();
                    continue;

                case 84:
                    yyst[yysp] = 84;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.getNextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 314:
                    yyn = yys84();
                    continue;

                case 85:
                    yyst[yysp] = 85;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.getNextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 315:
                    yyn = yys85();
                    continue;

                case 86:
                    yyst[yysp] = 86;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.getNextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 316:
                    yyn = yys86();
                    continue;

                case 87:
                    yyst[yysp] = 87;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.getNextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 317:
                    yyn = yys87();
                    continue;

                case 88:
                    yyst[yysp] = 88;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 318:
                    yyn = yys88();
                    continue;

                case 89:
                    yyst[yysp] = 89;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 319:
                    yyn = yys89();
                    continue;

                case 90:
                    yyst[yysp] = 90;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 320:
                    yyn = yys90();
                    continue;

                case 91:
                    yyst[yysp] = 91;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 321:
                    yyn = yys91();
                    continue;

                case 92:
                    yyst[yysp] = 92;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 322:
                    yyn = yys92();
                    continue;

                case 93:
                    yyst[yysp] = 93;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 323:
                    yyn = yys93();
                    continue;

                case 94:
                    yyst[yysp] = 94;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 324:
                    yyn = yys94();
                    continue;

                case 95:
                    yyst[yysp] = 95;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 325:
                    yyn = yys95();
                    continue;

                case 96:
                    yyst[yysp] = 96;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 326:
                    yyn = yys96();
                    continue;

                case 97:
                    yyst[yysp] = 97;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 327:
                    yyn = yys97();
                    continue;

                case 98:
                    yyst[yysp] = 98;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 328:
                    yyn = yys98();
                    continue;

                case 99:
                    yyst[yysp] = 99;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.getNextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 329:
                    switch (yytok) {
                        case FLOAT:
                            yyn = 163;
                            continue;
                        case INTEGER:
                            yyn = 164;
                            continue;
                    }
                    yyn = 463;
                    continue;

                case 100:
                    yyst[yysp] = 100;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 330:
                    yyn = yys100();
                    continue;

                case 101:
                    yyst[yysp] = 101;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 331:
                    yyn = yys101();
                    continue;

                case 102:
                    yyst[yysp] = 102;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 332:
                    yyn = yys102();
                    continue;

                case 103:
                    yyst[yysp] = 103;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.getNextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 333:
                    yyn = yys103();
                    continue;

                case 104:
                    yyst[yysp] = 104;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.getNextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 334:
                    switch (yytok) {
                        case FLOAT:
                            yyn = 163;
                            continue;
                        case INTEGER:
                            yyn = 164;
                            continue;
                    }
                    yyn = 463;
                    continue;

                case 105:
                    yyst[yysp] = 105;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.getNextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 335:
                    switch (yytok) {
                        case '[':
                            yyn = 171;
                            continue;
                    }
                    yyn = 463;
                    continue;

                case 106:
                    yyst[yysp] = 106;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.getNextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 336:
                    switch (yytok) {
                        case '[':
                            yyn = 172;
                            continue;
                    }
                    yyn = 463;
                    continue;

                case 107:
                    yyst[yysp] = 107;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 337:
                    yyn = yys107();
                    continue;

                case 108:
                    yyst[yysp] = 108;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 338:
                    yyn = yys108();
                    continue;

                case 109:
                    yyst[yysp] = 109;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 339:
                    yyn = yys109();
                    continue;

                case 110:
                    yyst[yysp] = 110;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 340:
                    yyn = yys110();
                    continue;

                case 111:
                    yyst[yysp] = 111;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 341:
                    yyn = yys111();
                    continue;

                case 112:
                    yyst[yysp] = 112;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 342:
                    yyn = yys112();
                    continue;

                case 113:
                    yyst[yysp] = 113;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.getNextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 343:
                    switch (yytok) {
                        case IDENTIFIER:
                            yyn = 174;
                            continue;
                    }
                    yyn = 463;
                    continue;

                case 114:
                    yyst[yysp] = 114;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.getNextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 344:
                    switch (yytok) {
                        case '=':
                            yyn = 175;
                            continue;
                    }
                    yyn = 463;
                    continue;

                case 115:
                    yyst[yysp] = 115;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 345:
                    yyn = yys115();
                    continue;

                case 116:
                    yyst[yysp] = 116;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 346:
                    yyn = yys116();
                    continue;

                case 117:
                    yyst[yysp] = 117;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 347:
                    yyn = yys117();
                    continue;

                case 118:
                    yyst[yysp] = 118;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 348:
                    yyn = yys118();
                    continue;

                case 119:
                    yyst[yysp] = 119;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 349:
                    yyn = yys119();
                    continue;

                case 120:
                    yyst[yysp] = 120;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.getNextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 350:
                    yyn = yys120();
                    continue;

                case 121:
                    yyst[yysp] = 121;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.getNextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 351:
                    yyn = yys121();
                    continue;

                case 122:
                    yyst[yysp] = 122;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.getNextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 352:
                    yyn = yys122();
                    continue;

                case 123:
                    yyst[yysp] = 123;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.getNextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 353:
                    yyn = yys123();
                    continue;

                case 124:
                    yyst[yysp] = 124;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.getNextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 354:
                    yyn = yys124();
                    continue;

                case 125:
                    yyst[yysp] = 125;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.getNextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 355:
                    yyn = yys125();
                    continue;

                case 126:
                    yyst[yysp] = 126;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.getNextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 356:
                    yyn = yys126();
                    continue;

                case 127:
                    yyst[yysp] = 127;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.getNextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 357:
                    yyn = yys127();
                    continue;

                case 128:
                    yyst[yysp] = 128;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.getNextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 358:
                    yyn = yys128();
                    continue;

                case 129:
                    yyst[yysp] = 129;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 359:
                    yyn = yys129();
                    continue;

                case 130:
                    yyst[yysp] = 130;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.getNextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 360:
                    yyn = yys130();
                    continue;

                case 131:
                    yyst[yysp] = 131;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 361:
                    yyn = yys131();
                    continue;

                case 132:
                    yyst[yysp] = 132;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 362:
                    yyn = yys132();
                    continue;

                case 133:
                    yyst[yysp] = 133;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 363:
                    yyn = yys133();
                    continue;

                case 134:
                    yyst[yysp] = 134;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 364:
                    yyn = yys134();
                    continue;

                case 135:
                    yyst[yysp] = 135;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 365:
                    yyn = yys135();
                    continue;

                case 136:
                    yyst[yysp] = 136;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.getNextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 366:
                    switch (yytok) {
                        case FLOAT:
                            yyn = 163;
                            continue;
                        case INTEGER:
                            yyn = 164;
                            continue;
                    }
                    yyn = 463;
                    continue;

                case 137:
                    yyst[yysp] = 137;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 367:
                    yyn = yys137();
                    continue;

                case 138:
                    yyst[yysp] = 138;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 368:
                    yyn = yys138();
                    continue;

                case 139:
                    yyst[yysp] = 139;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 369:
                    yyn = yys139();
                    continue;

                case 140:
                    yyst[yysp] = 140;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 370:
                    yyn = yys140();
                    continue;

                case 141:
                    yyst[yysp] = 141;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 371:
                    yyn = yys141();
                    continue;

                case 142:
                    yyst[yysp] = 142;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.getNextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 372:
                    switch (yytok) {
                        case '[':
                            yyn = 184;
                            continue;
                    }
                    yyn = 463;
                    continue;

                case 143:
                    yyst[yysp] = 143;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.getNextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 373:
                    switch (yytok) {
                        case '[':
                            yyn = 185;
                            continue;
                    }
                    yyn = 463;
                    continue;

                case 144:
                    yyst[yysp] = 144;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 374:
                    yyn = yys144();
                    continue;

                case 145:
                    yyst[yysp] = 145;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 375:
                    yyn = yys145();
                    continue;

                case 146:
                    yyst[yysp] = 146;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 376:
                    yyn = yys146();
                    continue;

                case 147:
                    yyst[yysp] = 147;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 377:
                    yyn = yys147();
                    continue;

                case 148:
                    yyst[yysp] = 148;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 378:
                    switch (yytok) {
                        case '[':
                            yyn = 187;
                            continue;
                    }
                    yyn = 463;
                    continue;

                case 149:
                    yyst[yysp] = 149;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 379:
                    yyn = yys149();
                    continue;

                case 150:
                    yyst[yysp] = 150;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.getNextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 380:
                    switch (yytok) {
                        case FLOAT:
                            yyn = 163;
                            continue;
                        case INTEGER:
                            yyn = 164;
                            continue;
                    }
                    yyn = 463;
                    continue;

                case 151:
                    yyst[yysp] = 151;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.getNextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 381:
                    switch (yytok) {
                        case FLOAT:
                            yyn = 163;
                            continue;
                        case INTEGER:
                            yyn = 164;
                            continue;
                    }
                    yyn = 463;
                    continue;

                case 152:
                    yyst[yysp] = 152;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.getNextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 382:
                    yyn = yys152();
                    continue;

                case 153:
                    yyst[yysp] = 153;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 383:
                    yyn = yys153();
                    continue;

                case 154:
                    yyst[yysp] = 154;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 384:
                    switch (yytok) {
                        case ';':
                            yyn = 194;
                            continue;
                    }
                    yyn = 463;
                    continue;

                case 155:
                    yyst[yysp] = 155;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 385:
                    yyn = yys155();
                    continue;

                case 156:
                    yyst[yysp] = 156;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 386:
                    yyn = yys156();
                    continue;

                case 157:
                    yyst[yysp] = 157;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 387:
                    yyn = yys157();
                    continue;

                case 158:
                    yyst[yysp] = 158;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 388:
                    yyn = yys158();
                    continue;

                case 159:
                    yyst[yysp] = 159;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 389:
                    yyn = yys159();
                    continue;

                case 160:
                    yyst[yysp] = 160;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 390:
                    yyn = yys160();
                    continue;

                case 161:
                    yyst[yysp] = 161;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 391:
                    switch (yytok) {
                        case ']':
                            yyn = 195;
                            continue;
                    }
                    yyn = 463;
                    continue;

                case 162:
                    yyst[yysp] = 162;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 392:
                    switch (yytok) {
                        case ']':
                            yyn = 196;
                            continue;
                    }
                    yyn = 463;
                    continue;

                case 163:
                    yyst[yysp] = 163;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.getNextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 393:
                    switch (yytok) {
                        case FLOAT:
                            yyn = 163;
                            continue;
                        case ']':
                            yyn = yyr99();
                            continue;
                    }
                    yyn = 463;
                    continue;

                case 164:
                    yyst[yysp] = 164;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.getNextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 394:
                    switch (yytok) {
                        case INTEGER:
                            yyn = 164;
                            continue;
                        case ']':
                            yyn = yyr97();
                            continue;
                    }
                    yyn = 463;
                    continue;

                case 165:
                    yyst[yysp] = 165;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 395:
                    yyn = yys165();
                    continue;

                case 166:
                    yyst[yysp] = 166;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 396:
                    yyn = yys166();
                    continue;

                case 167:
                    yyst[yysp] = 167;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 397:
                    switch (yytok) {
                        case ']':
                            yyn = 199;
                            continue;
                    }
                    yyn = 463;
                    continue;

                case 168:
                    yyst[yysp] = 168;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 398:
                    yyn = yys168();
                    continue;

                case 169:
                    yyst[yysp] = 169;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 399:
                    switch (yytok) {
                        case ']':
                            yyn = 201;
                            continue;
                    }
                    yyn = 463;
                    continue;

                case 170:
                    yyst[yysp] = 170;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 400:
                    switch (yytok) {
                        case ']':
                            yyn = 202;
                            continue;
                    }
                    yyn = 463;
                    continue;

                case 171:
                    yyst[yysp] = 171;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.getNextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 401:
                    switch (yytok) {
                        case FLOAT:
                            yyn = 163;
                            continue;
                        case INTEGER:
                            yyn = 164;
                            continue;
                    }
                    yyn = 463;
                    continue;

                case 172:
                    yyst[yysp] = 172;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.getNextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 402:
                    switch (yytok) {
                        case FLOAT:
                            yyn = 163;
                            continue;
                        case INTEGER:
                            yyn = 164;
                            continue;
                    }
                    yyn = 463;
                    continue;

                case 173:
                    yyst[yysp] = 173;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 403:
                    yyn = yys173();
                    continue;

                case 174:
                    yyst[yysp] = 174;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.getNextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 404:
                    yyn = yys174();
                    continue;

                case 175:
                    yyst[yysp] = 175;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.getNextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 405:
                    yyn = yys175();
                    continue;

                case 176:
                    yyst[yysp] = 176;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 406:
                    yyn = yys176();
                    continue;

                case 177:
                    yyst[yysp] = 177;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 407:
                    yyn = yys177();
                    continue;

                case 178:
                    yyst[yysp] = 178;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 408:
                    yyn = yys178();
                    continue;

                case 179:
                    yyst[yysp] = 179;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 409:
                    yyn = yys179();
                    continue;

                case 180:
                    yyst[yysp] = 180;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 410:
                    yyn = yys180();
                    continue;

                case 181:
                    yyst[yysp] = 181;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 411:
                    yyn = yys181();
                    continue;

                case 182:
                    yyst[yysp] = 182;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 412:
                    switch (yytok) {
                        case ']':
                            yyn = 211;
                            continue;
                    }
                    yyn = 463;
                    continue;

                case 183:
                    yyst[yysp] = 183;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 413:
                    switch (yytok) {
                        case ']':
                            yyn = 212;
                            continue;
                    }
                    yyn = 463;
                    continue;

                case 184:
                    yyst[yysp] = 184;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.getNextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 414:
                    yyn = yys184();
                    continue;

                case 185:
                    yyst[yysp] = 185;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.getNextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 415:
                    yyn = yys185();
                    continue;

                case 186:
                    yyst[yysp] = 186;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 416:
                    yyn = yys186();
                    continue;

                case 187:
                    yyst[yysp] = 187;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.getNextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 417:
                    yyn = yys187();
                    continue;

                case 188:
                    yyst[yysp] = 188;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 418:
                    switch (yytok) {
                        case ']':
                            yyn = 216;
                            continue;
                    }
                    yyn = 463;
                    continue;

                case 189:
                    yyst[yysp] = 189;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 419:
                    switch (yytok) {
                        case ']':
                            yyn = 217;
                            continue;
                    }
                    yyn = 463;
                    continue;

                case 190:
                    yyst[yysp] = 190;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 420:
                    switch (yytok) {
                        case ']':
                            yyn = 218;
                            continue;
                    }
                    yyn = 463;
                    continue;

                case 191:
                    yyst[yysp] = 191;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 421:
                    switch (yytok) {
                        case ']':
                            yyn = 219;
                            continue;
                    }
                    yyn = 463;
                    continue;

                case 192:
                    yyst[yysp] = 192;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.getNextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 422:
                    yyn = yys192();
                    continue;

                case 193:
                    yyst[yysp] = 193;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 423:
                    yyn = yys193();
                    continue;

                case 194:
                    yyst[yysp] = 194;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.getNextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 424:
                    switch (yytok) {
                        case ENDINPUT:
                        case ';':
                            yyn = yyr1();
                            continue;
                    }
                    yyn = 463;
                    continue;

                case 195:
                    yyst[yysp] = 195;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.getNextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 425:
                    yyn = yys195();
                    continue;

                case 196:
                    yyst[yysp] = 196;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.getNextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 426:
                    yyn = yys196();
                    continue;

                case 197:
                    yyst[yysp] = 197;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 427:
                    switch (yytok) {
                        case ']':
                            yyn = yyr98();
                            continue;
                    }
                    yyn = 463;
                    continue;

                case 198:
                    yyst[yysp] = 198;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 428:
                    switch (yytok) {
                        case ']':
                            yyn = yyr96();
                            continue;
                    }
                    yyn = 463;
                    continue;

                case 199:
                    yyst[yysp] = 199;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.getNextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 429:
                    yyn = yys199();
                    continue;

                case 200:
                    yyst[yysp] = 200;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 430:
                    switch (yytok) {
                        case ']':
                            yyn = yyr94();
                            continue;
                    }
                    yyn = 463;
                    continue;

                case 201:
                    yyst[yysp] = 201;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.getNextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 431:
                    yyn = yys201();
                    continue;

                case 202:
                    yyst[yysp] = 202;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.getNextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 432:
                    yyn = yys202();
                    continue;

                case 203:
                    yyst[yysp] = 203;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 433:
                    switch (yytok) {
                        case ']':
                            yyn = 221;
                            continue;
                    }
                    yyn = 463;
                    continue;

                case 204:
                    yyst[yysp] = 204;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 434:
                    switch (yytok) {
                        case ']':
                            yyn = 222;
                            continue;
                    }
                    yyn = 463;
                    continue;

                case 205:
                    yyst[yysp] = 205;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 435:
                    switch (yytok) {
                        case ']':
                            yyn = 223;
                            continue;
                    }
                    yyn = 463;
                    continue;

                case 206:
                    yyst[yysp] = 206;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 436:
                    switch (yytok) {
                        case ']':
                            yyn = 224;
                            continue;
                    }
                    yyn = 463;
                    continue;

                case 207:
                    yyst[yysp] = 207;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 437:
                    switch (yytok) {
                        case '*':
                            yyn = 82;
                            continue;
                        case '+':
                            yyn = 83;
                            continue;
                        case '-':
                            yyn = 84;
                            continue;
                        case '/':
                            yyn = 85;
                            continue;
                        case ']':
                            yyn = 225;
                            continue;
                    }
                    yyn = 463;
                    continue;

                case 208:
                    yyst[yysp] = 208;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.getNextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 438:
                    yyn = yys208();
                    continue;

                case 209:
                    yyst[yysp] = 209;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 439:
                    yyn = yys209();
                    continue;

                case 210:
                    yyst[yysp] = 210;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 440:
                    switch (yytok) {
                        case '*':
                            yyn = 82;
                            continue;
                        case '+':
                            yyn = 83;
                            continue;
                        case '-':
                            yyn = 84;
                            continue;
                        case '/':
                            yyn = 85;
                            continue;
                        case ']':
                            yyn = 226;
                            continue;
                    }
                    yyn = 463;
                    continue;

                case 211:
                    yyst[yysp] = 211;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.getNextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 441:
                    yyn = yys211();
                    continue;

                case 212:
                    yyst[yysp] = 212;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.getNextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 442:
                    yyn = yys212();
                    continue;

                case 213:
                    yyst[yysp] = 213;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 443:
                    switch (yytok) {
                        case ']':
                            yyn = 227;
                            continue;
                    }
                    yyn = 463;
                    continue;

                case 214:
                    yyst[yysp] = 214;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 444:
                    switch (yytok) {
                        case ']':
                            yyn = 228;
                            continue;
                    }
                    yyn = 463;
                    continue;

                case 215:
                    yyst[yysp] = 215;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 445:
                    switch (yytok) {
                        case ']':
                            yyn = 229;
                            continue;
                    }
                    yyn = 463;
                    continue;

                case 216:
                    yyst[yysp] = 216;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.getNextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 446:
                    yyn = yys216();
                    continue;

                case 217:
                    yyst[yysp] = 217;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.getNextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 447:
                    yyn = yys217();
                    continue;

                case 218:
                    yyst[yysp] = 218;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.getNextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 448:
                    yyn = yys218();
                    continue;

                case 219:
                    yyst[yysp] = 219;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.getNextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 449:
                    yyn = yys219();
                    continue;

                case 220:
                    yyst[yysp] = 220;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 450:
                    yyn = yys220();
                    continue;

                case 221:
                    yyst[yysp] = 221;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.getNextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 451:
                    yyn = yys221();
                    continue;

                case 222:
                    yyst[yysp] = 222;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.getNextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 452:
                    yyn = yys222();
                    continue;

                case 223:
                    yyst[yysp] = 223;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.getNextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 453:
                    yyn = yys223();
                    continue;

                case 224:
                    yyst[yysp] = 224;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.getNextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 454:
                    yyn = yys224();
                    continue;

                case 225:
                    yyst[yysp] = 225;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.getNextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 455:
                    yyn = yys225();
                    continue;

                case 226:
                    yyst[yysp] = 226;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.getNextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 456:
                    yyn = yys226();
                    continue;

                case 227:
                    yyst[yysp] = 227;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.getNextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 457:
                    yyn = yys227();
                    continue;

                case 228:
                    yyst[yysp] = 228;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.getNextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 458:
                    yyn = yys228();
                    continue;

                case 229:
                    yyst[yysp] = 229;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.getNextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 459:
                    yyn = yys229();
                    continue;

                case 460:
                    return true;
                case 461:
                    yyerror("stack overflow");
                case 462:
                    return false;
                case 463:
                    yyerror("syntax error");
                    return false;
            }
        }
    }

    protected void yyexpand() {
        int[] newyyst = new int[2*yyst.length];
        Object[] newyysv = new Object[2*yyst.length];
        for (int i=0; i<yyst.length; i++) {
            newyyst[i] = yyst[i];
            newyysv[i] = yysv[i];
        }
        yyst = newyyst;
        yysv = newyysv;
    }

    private int yys0() {
        switch (yytok) {
            case APARECETORTUGA:
                return 20;
            case AT:
                return 21;
            case AV:
                return 22;
            case AVANZA:
                return 23;
            case AZAR:
                return 24;
            case BAJALAPIZ:
                return 25;
            case BL:
                return 26;
            case BORRAPANTALLA:
                return 27;
            case CENTRO:
                return 28;
            case COS:
                return 29;
            case CUENTA:
                return 30;
            case DIFERENCIA:
                return 31;
            case DIVISION:
                return 32;
            case EJECUTA:
                return 33;
            case ELEGIR:
                return 34;
            case ELEMENTO:
                return 35;
            case ESPERA:
                return 36;
            case FLOAT:
                return 37;
            case GD:
                return 38;
            case GI:
                return 39;
            case GIRADERECHA:
                return 40;
            case GIRAIZQUIERDA:
                return 41;
            case IDENTIFIER:
                return 42;
            case IGUALES:
                return 43;
            case INC:
                return 44;
            case INIC:
                return 45;
            case INTEGER:
                return 46;
            case MAYORQUE:
                return 47;
            case MENORQUE:
                return 48;
            case MENOS:
                return 49;
            case O:
                return 50;
            case OCULTATORTUGA:
                return 51;
            case OT:
                return 52;
            case PONCL:
                return 53;
            case PONCOLORLAPIZ:
                return 54;
            case PONPOS:
                return 55;
            case PONRUMBO:
                return 56;
            case PONX:
                return 57;
            case PONXY:
                return 58;
            case PONY:
                return 59;
            case POTENCIA:
                return 60;
            case PRIMERO:
                return 61;
            case PRODUCTO:
                return 62;
            case RAIZCUADRADA:
                return 63;
            case RC:
                return 64;
            case RE:
                return 65;
            case REDONDEA:
                return 66;
            case REPITE:
                return 67;
            case RESTO:
                return 68;
            case RETROCEDE:
                return 69;
            case RUMBO:
                return 70;
            case SB:
                return 71;
            case SEN:
                return 72;
            case SENO:
                return 73;
            case SI:
                return 74;
            case SUBELAPIZ:
                return 75;
            case SUMA:
                return 76;
            case UL:
                return 77;
            case ULTIMO:
                return 78;
            case VAR:
                return 79;
            case Y:
                return 80;
        }
        return 463;
    }

    private int yys2() {
        switch (yytok) {
            case VERDE:
            case '(':
            case GRIS:
            case AMARILLO:
            case AZUL:
            case NEGRO:
            case MARRON:
            case BLANCO:
            case '=':
            case ')':
            case error:
            case '[':
            case CIAN:
            case ROJO:
                return 463;
            case '>':
            case '<':
            case '/':
            case '-':
            case '+':
            case '*':
                return yyr21();
        }
        return yyr6();
    }

    private int yys3() {
        switch (yytok) {
            case NEGRO:
            case ROJO:
            case AMARILLO:
            case '-':
            case '<':
            case BLANCO:
            case error:
            case '[':
            case GRIS:
            case '=':
            case '+':
            case '>':
            case ')':
            case '*':
            case '/':
            case '(':
            case VERDE:
            case MARRON:
            case AZUL:
            case CIAN:
                return 463;
        }
        return yyr3();
    }

    private int yys5() {
        switch (yytok) {
            case NEGRO:
            case ROJO:
            case AMARILLO:
            case '-':
            case '<':
            case BLANCO:
            case error:
            case '[':
            case GRIS:
            case '=':
            case '+':
            case '>':
            case ')':
            case '*':
            case '/':
            case '(':
            case VERDE:
            case MARRON:
            case AZUL:
            case CIAN:
                return 463;
        }
        return yyr5();
    }

    private int yys6() {
        switch (yytok) {
            case '*':
                return 82;
            case '+':
                return 83;
            case '-':
                return 84;
            case '/':
                return 85;
            case '<':
                return 86;
            case '>':
                return 87;
        }
        return 463;
    }

    private int yys7() {
        switch (yytok) {
            case NEGRO:
            case ROJO:
            case AMARILLO:
            case '-':
            case '<':
            case BLANCO:
            case error:
            case '[':
            case GRIS:
            case '=':
            case '+':
            case '>':
            case ')':
            case '*':
            case '/':
            case '(':
            case VERDE:
            case MARRON:
            case AZUL:
            case CIAN:
                return 463;
        }
        return yyr17();
    }

    private int yys8() {
        switch (yytok) {
            case VERDE:
            case '(':
            case GRIS:
            case AMARILLO:
            case AZUL:
            case NEGRO:
            case MARRON:
            case BLANCO:
            case '=':
            case ')':
            case error:
            case '[':
            case CIAN:
            case ROJO:
                return 463;
            case '>':
            case '<':
            case '/':
            case '-':
            case '+':
            case '*':
                return yyr27();
        }
        return yyr12();
    }

    private int yys9() {
        switch (yytok) {
            case NEGRO:
            case ROJO:
            case AMARILLO:
            case '-':
            case '<':
            case BLANCO:
            case error:
            case '[':
            case GRIS:
            case '=':
            case '+':
            case '>':
            case ')':
            case '*':
            case '/':
            case '(':
            case VERDE:
            case MARRON:
            case AZUL:
            case CIAN:
                return 463;
        }
        return yyr14();
    }

    private int yys10() {
        switch (yytok) {
            case VERDE:
            case '(':
            case GRIS:
            case AMARILLO:
            case AZUL:
            case NEGRO:
            case MARRON:
            case BLANCO:
            case '=':
            case ')':
            case error:
            case '[':
            case CIAN:
            case ROJO:
                return 463;
            case '>':
            case '<':
            case '/':
            case '-':
            case '+':
            case '*':
                return yyr23();
        }
        return yyr8();
    }

    private int yys11() {
        switch (yytok) {
            case VERDE:
            case CIAN:
            case ROJO:
            case NEGRO:
            case '*':
            case BLANCO:
            case ')':
            case AMARILLO:
            case AZUL:
            case '<':
            case '/':
            case '=':
            case '(':
            case MARRON:
            case '-':
            case error:
            case '+':
            case '>':
            case GRIS:
                return 463;
        }
        return yyr33();
    }

    private int yys12() {
        switch (yytok) {
            case NEGRO:
            case ROJO:
            case AMARILLO:
            case '-':
            case '<':
            case BLANCO:
            case error:
            case '[':
            case GRIS:
            case '=':
            case '+':
            case '>':
            case ')':
            case '*':
            case '/':
            case '(':
            case VERDE:
            case MARRON:
            case AZUL:
            case CIAN:
                return 463;
        }
        return yyr15();
    }

    private int yys13() {
        switch (yytok) {
            case VERDE:
            case '(':
            case GRIS:
            case AMARILLO:
            case AZUL:
            case NEGRO:
            case MARRON:
            case BLANCO:
            case '=':
            case ')':
            case error:
            case '[':
            case CIAN:
            case ROJO:
                return 463;
            case '>':
            case '<':
            case '/':
            case '-':
            case '+':
            case '*':
                return yyr24();
        }
        return yyr9();
    }

    private int yys14() {
        switch (yytok) {
            case VERDE:
            case '(':
            case GRIS:
            case AMARILLO:
            case AZUL:
            case NEGRO:
            case MARRON:
            case BLANCO:
            case '=':
            case ')':
            case error:
            case '[':
            case CIAN:
            case ROJO:
                return 463;
            case '>':
            case '<':
            case '/':
            case '-':
            case '+':
            case '*':
                return yyr25();
        }
        return yyr10();
    }

    private int yys15() {
        switch (yytok) {
            case NEGRO:
            case ROJO:
            case AMARILLO:
            case '-':
            case '<':
            case BLANCO:
            case error:
            case '[':
            case GRIS:
            case '=':
            case '+':
            case '>':
            case ')':
            case '*':
            case '/':
            case '(':
            case VERDE:
            case MARRON:
            case AZUL:
            case CIAN:
                return 463;
        }
        return yyr16();
    }

    private int yys16() {
        switch (yytok) {
            case VERDE:
            case '(':
            case GRIS:
            case AMARILLO:
            case AZUL:
            case NEGRO:
            case MARRON:
            case BLANCO:
            case '=':
            case ')':
            case error:
            case '[':
            case CIAN:
            case ROJO:
                return 463;
            case '>':
            case '<':
            case '/':
            case '-':
            case '+':
            case '*':
                return yyr26();
        }
        return yyr11();
    }

    private int yys17() {
        switch (yytok) {
            case NEGRO:
            case ROJO:
            case AMARILLO:
            case '-':
            case '<':
            case BLANCO:
            case error:
            case '[':
            case GRIS:
            case '=':
            case '+':
            case '>':
            case ')':
            case '*':
            case '/':
            case '(':
            case VERDE:
            case MARRON:
            case AZUL:
            case CIAN:
                return 463;
        }
        return yyr13();
    }

    private int yys18() {
        switch (yytok) {
            case VERDE:
            case '(':
            case GRIS:
            case AMARILLO:
            case AZUL:
            case NEGRO:
            case MARRON:
            case BLANCO:
            case '=':
            case ')':
            case error:
            case '[':
            case CIAN:
            case ROJO:
                return 463;
            case '>':
            case '<':
            case '/':
            case '-':
            case '+':
            case '*':
                return yyr22();
        }
        return yyr7();
    }

    private int yys19() {
        switch (yytok) {
            case NEGRO:
            case ROJO:
            case AMARILLO:
            case '-':
            case '<':
            case BLANCO:
            case error:
            case '[':
            case GRIS:
            case '=':
            case '+':
            case '>':
            case ')':
            case '*':
            case '/':
            case '(':
            case VERDE:
            case MARRON:
            case AZUL:
            case CIAN:
                return 463;
        }
        return yyr4();
    }

    private int yys20() {
        switch (yytok) {
            case NEGRO:
            case ROJO:
            case AMARILLO:
            case '-':
            case '<':
            case BLANCO:
            case error:
            case '[':
            case GRIS:
            case '=':
            case '+':
            case '>':
            case ')':
            case '*':
            case '/':
            case '(':
            case VERDE:
            case MARRON:
            case AZUL:
            case CIAN:
                return 463;
        }
        return yyr50();
    }

    private int yys21() {
        switch (yytok) {
            case NEGRO:
            case ROJO:
            case AMARILLO:
            case '-':
            case '<':
            case BLANCO:
            case error:
            case '[':
            case GRIS:
            case '=':
            case '+':
            case '>':
            case ')':
            case '*':
            case '/':
            case '(':
            case VERDE:
            case MARRON:
            case AZUL:
            case CIAN:
                return 463;
        }
        return yyr51();
    }

    private int yys22() {
        switch (yytok) {
            case AZAR:
                return 24;
            case COS:
                return 29;
            case CUENTA:
                return 30;
            case DIFERENCIA:
                return 31;
            case DIVISION:
                return 32;
            case ELEGIR:
                return 34;
            case ELEMENTO:
                return 35;
            case FLOAT:
                return 37;
            case IDENTIFIER:
                return 42;
            case INTEGER:
                return 46;
            case MENOS:
                return 49;
            case POTENCIA:
                return 60;
            case PRIMERO:
                return 61;
            case PRODUCTO:
                return 62;
            case RAIZCUADRADA:
                return 63;
            case RC:
                return 64;
            case REDONDEA:
                return 66;
            case RESTO:
                return 68;
            case RUMBO:
                return 70;
            case SEN:
                return 72;
            case SENO:
                return 73;
            case SUMA:
                return 76;
            case UL:
                return 77;
            case ULTIMO:
                return 78;
        }
        return 463;
    }

    private int yys23() {
        switch (yytok) {
            case AZAR:
                return 24;
            case COS:
                return 29;
            case CUENTA:
                return 30;
            case DIFERENCIA:
                return 31;
            case DIVISION:
                return 32;
            case ELEGIR:
                return 34;
            case ELEMENTO:
                return 35;
            case FLOAT:
                return 37;
            case IDENTIFIER:
                return 42;
            case INTEGER:
                return 46;
            case MENOS:
                return 49;
            case POTENCIA:
                return 60;
            case PRIMERO:
                return 61;
            case PRODUCTO:
                return 62;
            case RAIZCUADRADA:
                return 63;
            case RC:
                return 64;
            case REDONDEA:
                return 66;
            case RESTO:
                return 68;
            case RUMBO:
                return 70;
            case SEN:
                return 72;
            case SENO:
                return 73;
            case SUMA:
                return 76;
            case UL:
                return 77;
            case ULTIMO:
                return 78;
        }
        return 463;
    }

    private int yys24() {
        switch (yytok) {
            case AZAR:
                return 24;
            case COS:
                return 29;
            case CUENTA:
                return 30;
            case DIFERENCIA:
                return 31;
            case DIVISION:
                return 32;
            case ELEGIR:
                return 34;
            case ELEMENTO:
                return 35;
            case FLOAT:
                return 37;
            case IDENTIFIER:
                return 42;
            case INTEGER:
                return 46;
            case MENOS:
                return 49;
            case POTENCIA:
                return 60;
            case PRIMERO:
                return 61;
            case PRODUCTO:
                return 62;
            case RAIZCUADRADA:
                return 63;
            case RC:
                return 64;
            case REDONDEA:
                return 66;
            case RESTO:
                return 68;
            case RUMBO:
                return 70;
            case SEN:
                return 72;
            case SENO:
                return 73;
            case SUMA:
                return 76;
            case UL:
                return 77;
            case ULTIMO:
                return 78;
        }
        return 463;
    }

    private int yys25() {
        switch (yytok) {
            case NEGRO:
            case ROJO:
            case AMARILLO:
            case '-':
            case '<':
            case BLANCO:
            case error:
            case '[':
            case GRIS:
            case '=':
            case '+':
            case '>':
            case ')':
            case '*':
            case '/':
            case '(':
            case VERDE:
            case MARRON:
            case AZUL:
            case CIAN:
                return 463;
        }
        return yyr52();
    }

    private int yys26() {
        switch (yytok) {
            case NEGRO:
            case ROJO:
            case AMARILLO:
            case '-':
            case '<':
            case BLANCO:
            case error:
            case '[':
            case GRIS:
            case '=':
            case '+':
            case '>':
            case ')':
            case '*':
            case '/':
            case '(':
            case VERDE:
            case MARRON:
            case AZUL:
            case CIAN:
                return 463;
        }
        return yyr53();
    }

    private int yys27() {
        switch (yytok) {
            case NEGRO:
            case ROJO:
            case AMARILLO:
            case '-':
            case '<':
            case BLANCO:
            case error:
            case '[':
            case GRIS:
            case '=':
            case '+':
            case '>':
            case ')':
            case '*':
            case '/':
            case '(':
            case VERDE:
            case MARRON:
            case AZUL:
            case CIAN:
                return 463;
        }
        return yyr57();
    }

    private int yys28() {
        switch (yytok) {
            case NEGRO:
            case ROJO:
            case AMARILLO:
            case '-':
            case '<':
            case BLANCO:
            case error:
            case '[':
            case GRIS:
            case '=':
            case '+':
            case '>':
            case ')':
            case '*':
            case '/':
            case '(':
            case VERDE:
            case MARRON:
            case AZUL:
            case CIAN:
                return 463;
        }
        return yyr56();
    }

    private int yys29() {
        switch (yytok) {
            case AZAR:
                return 24;
            case COS:
                return 29;
            case CUENTA:
                return 30;
            case DIFERENCIA:
                return 31;
            case DIVISION:
                return 32;
            case ELEGIR:
                return 34;
            case ELEMENTO:
                return 35;
            case FLOAT:
                return 37;
            case IDENTIFIER:
                return 42;
            case INTEGER:
                return 46;
            case MENOS:
                return 49;
            case POTENCIA:
                return 60;
            case PRIMERO:
                return 61;
            case PRODUCTO:
                return 62;
            case RAIZCUADRADA:
                return 63;
            case RC:
                return 64;
            case REDONDEA:
                return 66;
            case RESTO:
                return 68;
            case RUMBO:
                return 70;
            case SEN:
                return 72;
            case SENO:
                return 73;
            case SUMA:
                return 76;
            case UL:
                return 77;
            case ULTIMO:
                return 78;
        }
        return 463;
    }

    private int yys31() {
        switch (yytok) {
            case AZAR:
                return 24;
            case COS:
                return 29;
            case CUENTA:
                return 30;
            case DIFERENCIA:
                return 31;
            case DIVISION:
                return 32;
            case ELEGIR:
                return 34;
            case ELEMENTO:
                return 35;
            case FLOAT:
                return 37;
            case IDENTIFIER:
                return 42;
            case INTEGER:
                return 46;
            case MENOS:
                return 49;
            case POTENCIA:
                return 60;
            case PRIMERO:
                return 61;
            case PRODUCTO:
                return 62;
            case RAIZCUADRADA:
                return 63;
            case RC:
                return 64;
            case REDONDEA:
                return 66;
            case RESTO:
                return 68;
            case RUMBO:
                return 70;
            case SEN:
                return 72;
            case SENO:
                return 73;
            case SUMA:
                return 76;
            case UL:
                return 77;
            case ULTIMO:
                return 78;
        }
        return 463;
    }

    private int yys32() {
        switch (yytok) {
            case AZAR:
                return 24;
            case COS:
                return 29;
            case CUENTA:
                return 30;
            case DIFERENCIA:
                return 31;
            case DIVISION:
                return 32;
            case ELEGIR:
                return 34;
            case ELEMENTO:
                return 35;
            case FLOAT:
                return 37;
            case IDENTIFIER:
                return 42;
            case INTEGER:
                return 46;
            case MENOS:
                return 49;
            case POTENCIA:
                return 60;
            case PRIMERO:
                return 61;
            case PRODUCTO:
                return 62;
            case RAIZCUADRADA:
                return 63;
            case RC:
                return 64;
            case REDONDEA:
                return 66;
            case RESTO:
                return 68;
            case RUMBO:
                return 70;
            case SEN:
                return 72;
            case SENO:
                return 73;
            case SUMA:
                return 76;
            case UL:
                return 77;
            case ULTIMO:
                return 78;
        }
        return 463;
    }

    private int yys36() {
        switch (yytok) {
            case AZAR:
                return 24;
            case COS:
                return 29;
            case CUENTA:
                return 30;
            case DIFERENCIA:
                return 31;
            case DIVISION:
                return 32;
            case ELEGIR:
                return 34;
            case ELEMENTO:
                return 35;
            case FLOAT:
                return 37;
            case IDENTIFIER:
                return 42;
            case INTEGER:
                return 46;
            case MENOS:
                return 49;
            case POTENCIA:
                return 60;
            case PRIMERO:
                return 61;
            case PRODUCTO:
                return 62;
            case RAIZCUADRADA:
                return 63;
            case RC:
                return 64;
            case REDONDEA:
                return 66;
            case RESTO:
                return 68;
            case RUMBO:
                return 70;
            case SEN:
                return 72;
            case SENO:
                return 73;
            case SUMA:
                return 76;
            case UL:
                return 77;
            case ULTIMO:
                return 78;
        }
        return 463;
    }

    private int yys37() {
        switch (yytok) {
            case VERDE:
            case NEGRO:
            case AZUL:
            case ')':
            case CIAN:
            case '(':
            case MARRON:
            case GRIS:
            case error:
            case '=':
            case BLANCO:
            case AMARILLO:
            case ROJO:
                return 463;
        }
        return yyr19();
    }

    private int yys38() {
        switch (yytok) {
            case AZAR:
                return 24;
            case COS:
                return 29;
            case CUENTA:
                return 30;
            case DIFERENCIA:
                return 31;
            case DIVISION:
                return 32;
            case ELEGIR:
                return 34;
            case ELEMENTO:
                return 35;
            case FLOAT:
                return 37;
            case IDENTIFIER:
                return 42;
            case INTEGER:
                return 46;
            case MENOS:
                return 49;
            case POTENCIA:
                return 60;
            case PRIMERO:
                return 61;
            case PRODUCTO:
                return 62;
            case RAIZCUADRADA:
                return 63;
            case RC:
                return 64;
            case REDONDEA:
                return 66;
            case RESTO:
                return 68;
            case RUMBO:
                return 70;
            case SEN:
                return 72;
            case SENO:
                return 73;
            case SUMA:
                return 76;
            case UL:
                return 77;
            case ULTIMO:
                return 78;
        }
        return 463;
    }

    private int yys39() {
        switch (yytok) {
            case AZAR:
                return 24;
            case COS:
                return 29;
            case CUENTA:
                return 30;
            case DIFERENCIA:
                return 31;
            case DIVISION:
                return 32;
            case ELEGIR:
                return 34;
            case ELEMENTO:
                return 35;
            case FLOAT:
                return 37;
            case IDENTIFIER:
                return 42;
            case INTEGER:
                return 46;
            case MENOS:
                return 49;
            case POTENCIA:
                return 60;
            case PRIMERO:
                return 61;
            case PRODUCTO:
                return 62;
            case RAIZCUADRADA:
                return 63;
            case RC:
                return 64;
            case REDONDEA:
                return 66;
            case RESTO:
                return 68;
            case RUMBO:
                return 70;
            case SEN:
                return 72;
            case SENO:
                return 73;
            case SUMA:
                return 76;
            case UL:
                return 77;
            case ULTIMO:
                return 78;
        }
        return 463;
    }

    private int yys40() {
        switch (yytok) {
            case AZAR:
                return 24;
            case COS:
                return 29;
            case CUENTA:
                return 30;
            case DIFERENCIA:
                return 31;
            case DIVISION:
                return 32;
            case ELEGIR:
                return 34;
            case ELEMENTO:
                return 35;
            case FLOAT:
                return 37;
            case IDENTIFIER:
                return 42;
            case INTEGER:
                return 46;
            case MENOS:
                return 49;
            case POTENCIA:
                return 60;
            case PRIMERO:
                return 61;
            case PRODUCTO:
                return 62;
            case RAIZCUADRADA:
                return 63;
            case RC:
                return 64;
            case REDONDEA:
                return 66;
            case RESTO:
                return 68;
            case RUMBO:
                return 70;
            case SEN:
                return 72;
            case SENO:
                return 73;
            case SUMA:
                return 76;
            case UL:
                return 77;
            case ULTIMO:
                return 78;
        }
        return 463;
    }

    private int yys41() {
        switch (yytok) {
            case AZAR:
                return 24;
            case COS:
                return 29;
            case CUENTA:
                return 30;
            case DIFERENCIA:
                return 31;
            case DIVISION:
                return 32;
            case ELEGIR:
                return 34;
            case ELEMENTO:
                return 35;
            case FLOAT:
                return 37;
            case IDENTIFIER:
                return 42;
            case INTEGER:
                return 46;
            case MENOS:
                return 49;
            case POTENCIA:
                return 60;
            case PRIMERO:
                return 61;
            case PRODUCTO:
                return 62;
            case RAIZCUADRADA:
                return 63;
            case RC:
                return 64;
            case REDONDEA:
                return 66;
            case RESTO:
                return 68;
            case RUMBO:
                return 70;
            case SEN:
                return 72;
            case SENO:
                return 73;
            case SUMA:
                return 76;
            case UL:
                return 77;
            case ULTIMO:
                return 78;
        }
        return 463;
    }

    private int yys42() {
        switch (yytok) {
            case VERDE:
            case NEGRO:
            case AZUL:
            case ')':
            case CIAN:
            case '(':
            case MARRON:
            case GRIS:
            case error:
            case '=':
            case BLANCO:
            case AMARILLO:
            case ROJO:
                return 463;
        }
        return yyr20();
    }

    private int yys43() {
        switch (yytok) {
            case AZAR:
                return 24;
            case COS:
                return 29;
            case CUENTA:
                return 30;
            case DIFERENCIA:
                return 31;
            case DIVISION:
                return 32;
            case ELEGIR:
                return 34;
            case ELEMENTO:
                return 35;
            case FLOAT:
                return 37;
            case IDENTIFIER:
                return 42;
            case INTEGER:
                return 46;
            case MENOS:
                return 49;
            case POTENCIA:
                return 60;
            case PRIMERO:
                return 61;
            case PRODUCTO:
                return 62;
            case RAIZCUADRADA:
                return 63;
            case RC:
                return 64;
            case REDONDEA:
                return 66;
            case RESTO:
                return 68;
            case RUMBO:
                return 70;
            case SEN:
                return 72;
            case SENO:
                return 73;
            case SUMA:
                return 76;
            case UL:
                return 77;
            case ULTIMO:
                return 78;
        }
        return 463;
    }

    private int yys46() {
        switch (yytok) {
            case VERDE:
            case NEGRO:
            case AZUL:
            case ')':
            case CIAN:
            case '(':
            case MARRON:
            case GRIS:
            case error:
            case '=':
            case BLANCO:
            case AMARILLO:
            case ROJO:
                return 463;
        }
        return yyr18();
    }

    private int yys47() {
        switch (yytok) {
            case AZAR:
                return 24;
            case COS:
                return 29;
            case CUENTA:
                return 30;
            case DIFERENCIA:
                return 31;
            case DIVISION:
                return 32;
            case ELEGIR:
                return 34;
            case ELEMENTO:
                return 35;
            case FLOAT:
                return 37;
            case IDENTIFIER:
                return 42;
            case INTEGER:
                return 46;
            case MENOS:
                return 49;
            case POTENCIA:
                return 60;
            case PRIMERO:
                return 61;
            case PRODUCTO:
                return 62;
            case RAIZCUADRADA:
                return 63;
            case RC:
                return 64;
            case REDONDEA:
                return 66;
            case RESTO:
                return 68;
            case RUMBO:
                return 70;
            case SEN:
                return 72;
            case SENO:
                return 73;
            case SUMA:
                return 76;
            case UL:
                return 77;
            case ULTIMO:
                return 78;
        }
        return 463;
    }

    private int yys48() {
        switch (yytok) {
            case AZAR:
                return 24;
            case COS:
                return 29;
            case CUENTA:
                return 30;
            case DIFERENCIA:
                return 31;
            case DIVISION:
                return 32;
            case ELEGIR:
                return 34;
            case ELEMENTO:
                return 35;
            case FLOAT:
                return 37;
            case IDENTIFIER:
                return 42;
            case INTEGER:
                return 46;
            case MENOS:
                return 49;
            case POTENCIA:
                return 60;
            case PRIMERO:
                return 61;
            case PRODUCTO:
                return 62;
            case RAIZCUADRADA:
                return 63;
            case RC:
                return 64;
            case REDONDEA:
                return 66;
            case RESTO:
                return 68;
            case RUMBO:
                return 70;
            case SEN:
                return 72;
            case SENO:
                return 73;
            case SUMA:
                return 76;
            case UL:
                return 77;
            case ULTIMO:
                return 78;
        }
        return 463;
    }

    private int yys49() {
        switch (yytok) {
            case AZAR:
                return 24;
            case COS:
                return 29;
            case CUENTA:
                return 30;
            case DIFERENCIA:
                return 31;
            case DIVISION:
                return 32;
            case ELEGIR:
                return 34;
            case ELEMENTO:
                return 35;
            case FLOAT:
                return 37;
            case IDENTIFIER:
                return 42;
            case INTEGER:
                return 46;
            case MENOS:
                return 49;
            case POTENCIA:
                return 60;
            case PRIMERO:
                return 61;
            case PRODUCTO:
                return 62;
            case RAIZCUADRADA:
                return 63;
            case RC:
                return 64;
            case REDONDEA:
                return 66;
            case RESTO:
                return 68;
            case RUMBO:
                return 70;
            case SEN:
                return 72;
            case SENO:
                return 73;
            case SUMA:
                return 76;
            case UL:
                return 77;
            case ULTIMO:
                return 78;
        }
        return 463;
    }

    private int yys50() {
        switch (yytok) {
            case AZAR:
                return 24;
            case COS:
                return 29;
            case CUENTA:
                return 30;
            case DIFERENCIA:
                return 31;
            case DIVISION:
                return 32;
            case ELEGIR:
                return 34;
            case ELEMENTO:
                return 35;
            case FLOAT:
                return 37;
            case IDENTIFIER:
                return 42;
            case INTEGER:
                return 46;
            case MENOS:
                return 49;
            case POTENCIA:
                return 60;
            case PRIMERO:
                return 61;
            case PRODUCTO:
                return 62;
            case RAIZCUADRADA:
                return 63;
            case RC:
                return 64;
            case REDONDEA:
                return 66;
            case RESTO:
                return 68;
            case RUMBO:
                return 70;
            case SEN:
                return 72;
            case SENO:
                return 73;
            case SUMA:
                return 76;
            case UL:
                return 77;
            case ULTIMO:
                return 78;
        }
        return 463;
    }

    private int yys51() {
        switch (yytok) {
            case NEGRO:
            case ROJO:
            case AMARILLO:
            case '-':
            case '<':
            case BLANCO:
            case error:
            case '[':
            case GRIS:
            case '=':
            case '+':
            case '>':
            case ')':
            case '*':
            case '/':
            case '(':
            case VERDE:
            case MARRON:
            case AZUL:
            case CIAN:
                return 463;
        }
        return yyr48();
    }

    private int yys52() {
        switch (yytok) {
            case NEGRO:
            case ROJO:
            case AMARILLO:
            case '-':
            case '<':
            case BLANCO:
            case error:
            case '[':
            case GRIS:
            case '=':
            case '+':
            case '>':
            case ')':
            case '*':
            case '/':
            case '(':
            case VERDE:
            case MARRON:
            case AZUL:
            case CIAN:
                return 463;
        }
        return yyr49();
    }

    private int yys53() {
        switch (yytok) {
            case AMARILLO:
                return 120;
            case AZUL:
                return 121;
            case BLANCO:
                return 122;
            case CIAN:
                return 123;
            case GRIS:
                return 124;
            case MARRON:
                return 125;
            case NEGRO:
                return 126;
            case ROJO:
                return 127;
            case VERDE:
                return 128;
        }
        return 463;
    }

    private int yys54() {
        switch (yytok) {
            case AMARILLO:
                return 120;
            case AZUL:
                return 121;
            case BLANCO:
                return 122;
            case CIAN:
                return 123;
            case GRIS:
                return 124;
            case MARRON:
                return 125;
            case NEGRO:
                return 126;
            case ROJO:
                return 127;
            case VERDE:
                return 128;
        }
        return 463;
    }

    private int yys56() {
        switch (yytok) {
            case AZAR:
                return 24;
            case COS:
                return 29;
            case CUENTA:
                return 30;
            case DIFERENCIA:
                return 31;
            case DIVISION:
                return 32;
            case ELEGIR:
                return 34;
            case ELEMENTO:
                return 35;
            case FLOAT:
                return 37;
            case IDENTIFIER:
                return 42;
            case INTEGER:
                return 46;
            case MENOS:
                return 49;
            case POTENCIA:
                return 60;
            case PRIMERO:
                return 61;
            case PRODUCTO:
                return 62;
            case RAIZCUADRADA:
                return 63;
            case RC:
                return 64;
            case REDONDEA:
                return 66;
            case RESTO:
                return 68;
            case RUMBO:
                return 70;
            case SEN:
                return 72;
            case SENO:
                return 73;
            case SUMA:
                return 76;
            case UL:
                return 77;
            case ULTIMO:
                return 78;
        }
        return 463;
    }

    private int yys57() {
        switch (yytok) {
            case AZAR:
                return 24;
            case COS:
                return 29;
            case CUENTA:
                return 30;
            case DIFERENCIA:
                return 31;
            case DIVISION:
                return 32;
            case ELEGIR:
                return 34;
            case ELEMENTO:
                return 35;
            case FLOAT:
                return 37;
            case IDENTIFIER:
                return 42;
            case INTEGER:
                return 46;
            case MENOS:
                return 49;
            case POTENCIA:
                return 60;
            case PRIMERO:
                return 61;
            case PRODUCTO:
                return 62;
            case RAIZCUADRADA:
                return 63;
            case RC:
                return 64;
            case REDONDEA:
                return 66;
            case RESTO:
                return 68;
            case RUMBO:
                return 70;
            case SEN:
                return 72;
            case SENO:
                return 73;
            case SUMA:
                return 76;
            case UL:
                return 77;
            case ULTIMO:
                return 78;
        }
        return 463;
    }

    private int yys58() {
        switch (yytok) {
            case AZAR:
                return 24;
            case COS:
                return 29;
            case CUENTA:
                return 30;
            case DIFERENCIA:
                return 31;
            case DIVISION:
                return 32;
            case ELEGIR:
                return 34;
            case ELEMENTO:
                return 35;
            case FLOAT:
                return 37;
            case IDENTIFIER:
                return 42;
            case INTEGER:
                return 46;
            case MENOS:
                return 49;
            case POTENCIA:
                return 60;
            case PRIMERO:
                return 61;
            case PRODUCTO:
                return 62;
            case RAIZCUADRADA:
                return 63;
            case RC:
                return 64;
            case REDONDEA:
                return 66;
            case RESTO:
                return 68;
            case RUMBO:
                return 70;
            case SEN:
                return 72;
            case SENO:
                return 73;
            case SUMA:
                return 76;
            case UL:
                return 77;
            case ULTIMO:
                return 78;
        }
        return 463;
    }

    private int yys59() {
        switch (yytok) {
            case AZAR:
                return 24;
            case COS:
                return 29;
            case CUENTA:
                return 30;
            case DIFERENCIA:
                return 31;
            case DIVISION:
                return 32;
            case ELEGIR:
                return 34;
            case ELEMENTO:
                return 35;
            case FLOAT:
                return 37;
            case IDENTIFIER:
                return 42;
            case INTEGER:
                return 46;
            case MENOS:
                return 49;
            case POTENCIA:
                return 60;
            case PRIMERO:
                return 61;
            case PRODUCTO:
                return 62;
            case RAIZCUADRADA:
                return 63;
            case RC:
                return 64;
            case REDONDEA:
                return 66;
            case RESTO:
                return 68;
            case RUMBO:
                return 70;
            case SEN:
                return 72;
            case SENO:
                return 73;
            case SUMA:
                return 76;
            case UL:
                return 77;
            case ULTIMO:
                return 78;
        }
        return 463;
    }

    private int yys60() {
        switch (yytok) {
            case AZAR:
                return 24;
            case COS:
                return 29;
            case CUENTA:
                return 30;
            case DIFERENCIA:
                return 31;
            case DIVISION:
                return 32;
            case ELEGIR:
                return 34;
            case ELEMENTO:
                return 35;
            case FLOAT:
                return 37;
            case IDENTIFIER:
                return 42;
            case INTEGER:
                return 46;
            case MENOS:
                return 49;
            case POTENCIA:
                return 60;
            case PRIMERO:
                return 61;
            case PRODUCTO:
                return 62;
            case RAIZCUADRADA:
                return 63;
            case RC:
                return 64;
            case REDONDEA:
                return 66;
            case RESTO:
                return 68;
            case RUMBO:
                return 70;
            case SEN:
                return 72;
            case SENO:
                return 73;
            case SUMA:
                return 76;
            case UL:
                return 77;
            case ULTIMO:
                return 78;
        }
        return 463;
    }

    private int yys62() {
        switch (yytok) {
            case AZAR:
                return 24;
            case COS:
                return 29;
            case CUENTA:
                return 30;
            case DIFERENCIA:
                return 31;
            case DIVISION:
                return 32;
            case ELEGIR:
                return 34;
            case ELEMENTO:
                return 35;
            case FLOAT:
                return 37;
            case IDENTIFIER:
                return 42;
            case INTEGER:
                return 46;
            case MENOS:
                return 49;
            case POTENCIA:
                return 60;
            case PRIMERO:
                return 61;
            case PRODUCTO:
                return 62;
            case RAIZCUADRADA:
                return 63;
            case RC:
                return 64;
            case REDONDEA:
                return 66;
            case RESTO:
                return 68;
            case RUMBO:
                return 70;
            case SEN:
                return 72;
            case SENO:
                return 73;
            case SUMA:
                return 76;
            case UL:
                return 77;
            case ULTIMO:
                return 78;
        }
        return 463;
    }

    private int yys63() {
        switch (yytok) {
            case AZAR:
                return 24;
            case COS:
                return 29;
            case CUENTA:
                return 30;
            case DIFERENCIA:
                return 31;
            case DIVISION:
                return 32;
            case ELEGIR:
                return 34;
            case ELEMENTO:
                return 35;
            case FLOAT:
                return 37;
            case IDENTIFIER:
                return 42;
            case INTEGER:
                return 46;
            case MENOS:
                return 49;
            case POTENCIA:
                return 60;
            case PRIMERO:
                return 61;
            case PRODUCTO:
                return 62;
            case RAIZCUADRADA:
                return 63;
            case RC:
                return 64;
            case REDONDEA:
                return 66;
            case RESTO:
                return 68;
            case RUMBO:
                return 70;
            case SEN:
                return 72;
            case SENO:
                return 73;
            case SUMA:
                return 76;
            case UL:
                return 77;
            case ULTIMO:
                return 78;
        }
        return 463;
    }

    private int yys64() {
        switch (yytok) {
            case AZAR:
                return 24;
            case COS:
                return 29;
            case CUENTA:
                return 30;
            case DIFERENCIA:
                return 31;
            case DIVISION:
                return 32;
            case ELEGIR:
                return 34;
            case ELEMENTO:
                return 35;
            case FLOAT:
                return 37;
            case IDENTIFIER:
                return 42;
            case INTEGER:
                return 46;
            case MENOS:
                return 49;
            case POTENCIA:
                return 60;
            case PRIMERO:
                return 61;
            case PRODUCTO:
                return 62;
            case RAIZCUADRADA:
                return 63;
            case RC:
                return 64;
            case REDONDEA:
                return 66;
            case RESTO:
                return 68;
            case RUMBO:
                return 70;
            case SEN:
                return 72;
            case SENO:
                return 73;
            case SUMA:
                return 76;
            case UL:
                return 77;
            case ULTIMO:
                return 78;
        }
        return 463;
    }

    private int yys65() {
        switch (yytok) {
            case AZAR:
                return 24;
            case COS:
                return 29;
            case CUENTA:
                return 30;
            case DIFERENCIA:
                return 31;
            case DIVISION:
                return 32;
            case ELEGIR:
                return 34;
            case ELEMENTO:
                return 35;
            case FLOAT:
                return 37;
            case IDENTIFIER:
                return 42;
            case INTEGER:
                return 46;
            case MENOS:
                return 49;
            case POTENCIA:
                return 60;
            case PRIMERO:
                return 61;
            case PRODUCTO:
                return 62;
            case RAIZCUADRADA:
                return 63;
            case RC:
                return 64;
            case REDONDEA:
                return 66;
            case RESTO:
                return 68;
            case RUMBO:
                return 70;
            case SEN:
                return 72;
            case SENO:
                return 73;
            case SUMA:
                return 76;
            case UL:
                return 77;
            case ULTIMO:
                return 78;
        }
        return 463;
    }

    private int yys66() {
        switch (yytok) {
            case AZAR:
                return 24;
            case COS:
                return 29;
            case CUENTA:
                return 30;
            case DIFERENCIA:
                return 31;
            case DIVISION:
                return 32;
            case ELEGIR:
                return 34;
            case ELEMENTO:
                return 35;
            case FLOAT:
                return 37;
            case IDENTIFIER:
                return 42;
            case INTEGER:
                return 46;
            case MENOS:
                return 49;
            case POTENCIA:
                return 60;
            case PRIMERO:
                return 61;
            case PRODUCTO:
                return 62;
            case RAIZCUADRADA:
                return 63;
            case RC:
                return 64;
            case REDONDEA:
                return 66;
            case RESTO:
                return 68;
            case RUMBO:
                return 70;
            case SEN:
                return 72;
            case SENO:
                return 73;
            case SUMA:
                return 76;
            case UL:
                return 77;
            case ULTIMO:
                return 78;
        }
        return 463;
    }

    private int yys68() {
        switch (yytok) {
            case AZAR:
                return 24;
            case COS:
                return 29;
            case CUENTA:
                return 30;
            case DIFERENCIA:
                return 31;
            case DIVISION:
                return 32;
            case ELEGIR:
                return 34;
            case ELEMENTO:
                return 35;
            case FLOAT:
                return 37;
            case IDENTIFIER:
                return 42;
            case INTEGER:
                return 46;
            case MENOS:
                return 49;
            case POTENCIA:
                return 60;
            case PRIMERO:
                return 61;
            case PRODUCTO:
                return 62;
            case RAIZCUADRADA:
                return 63;
            case RC:
                return 64;
            case REDONDEA:
                return 66;
            case RESTO:
                return 68;
            case RUMBO:
                return 70;
            case SEN:
                return 72;
            case SENO:
                return 73;
            case SUMA:
                return 76;
            case UL:
                return 77;
            case ULTIMO:
                return 78;
        }
        return 463;
    }

    private int yys69() {
        switch (yytok) {
            case AZAR:
                return 24;
            case COS:
                return 29;
            case CUENTA:
                return 30;
            case DIFERENCIA:
                return 31;
            case DIVISION:
                return 32;
            case ELEGIR:
                return 34;
            case ELEMENTO:
                return 35;
            case FLOAT:
                return 37;
            case IDENTIFIER:
                return 42;
            case INTEGER:
                return 46;
            case MENOS:
                return 49;
            case POTENCIA:
                return 60;
            case PRIMERO:
                return 61;
            case PRODUCTO:
                return 62;
            case RAIZCUADRADA:
                return 63;
            case RC:
                return 64;
            case REDONDEA:
                return 66;
            case RESTO:
                return 68;
            case RUMBO:
                return 70;
            case SEN:
                return 72;
            case SENO:
                return 73;
            case SUMA:
                return 76;
            case UL:
                return 77;
            case ULTIMO:
                return 78;
        }
        return 463;
    }

    private int yys70() {
        switch (yytok) {
            case VERDE:
            case NEGRO:
            case AZUL:
            case ')':
            case CIAN:
            case '(':
            case MARRON:
            case GRIS:
            case error:
            case '=':
            case BLANCO:
            case AMARILLO:
            case ROJO:
                return 463;
        }
        return yyr47();
    }

    private int yys71() {
        switch (yytok) {
            case NEGRO:
            case ROJO:
            case AMARILLO:
            case '-':
            case '<':
            case BLANCO:
            case error:
            case '[':
            case GRIS:
            case '=':
            case '+':
            case '>':
            case ')':
            case '*':
            case '/':
            case '(':
            case VERDE:
            case MARRON:
            case AZUL:
            case CIAN:
                return 463;
        }
        return yyr55();
    }

    private int yys72() {
        switch (yytok) {
            case AZAR:
                return 24;
            case COS:
                return 29;
            case CUENTA:
                return 30;
            case DIFERENCIA:
                return 31;
            case DIVISION:
                return 32;
            case ELEGIR:
                return 34;
            case ELEMENTO:
                return 35;
            case FLOAT:
                return 37;
            case IDENTIFIER:
                return 42;
            case INTEGER:
                return 46;
            case MENOS:
                return 49;
            case POTENCIA:
                return 60;
            case PRIMERO:
                return 61;
            case PRODUCTO:
                return 62;
            case RAIZCUADRADA:
                return 63;
            case RC:
                return 64;
            case REDONDEA:
                return 66;
            case RESTO:
                return 68;
            case RUMBO:
                return 70;
            case SEN:
                return 72;
            case SENO:
                return 73;
            case SUMA:
                return 76;
            case UL:
                return 77;
            case ULTIMO:
                return 78;
        }
        return 463;
    }

    private int yys73() {
        switch (yytok) {
            case AZAR:
                return 24;
            case COS:
                return 29;
            case CUENTA:
                return 30;
            case DIFERENCIA:
                return 31;
            case DIVISION:
                return 32;
            case ELEGIR:
                return 34;
            case ELEMENTO:
                return 35;
            case FLOAT:
                return 37;
            case IDENTIFIER:
                return 42;
            case INTEGER:
                return 46;
            case MENOS:
                return 49;
            case POTENCIA:
                return 60;
            case PRIMERO:
                return 61;
            case PRODUCTO:
                return 62;
            case RAIZCUADRADA:
                return 63;
            case RC:
                return 64;
            case REDONDEA:
                return 66;
            case RESTO:
                return 68;
            case RUMBO:
                return 70;
            case SEN:
                return 72;
            case SENO:
                return 73;
            case SUMA:
                return 76;
            case UL:
                return 77;
            case ULTIMO:
                return 78;
        }
        return 463;
    }

    private int yys74() {
        switch (yytok) {
            case AZAR:
                return 24;
            case COS:
                return 29;
            case CUENTA:
                return 30;
            case DIFERENCIA:
                return 31;
            case DIVISION:
                return 32;
            case ELEGIR:
                return 34;
            case ELEMENTO:
                return 35;
            case FLOAT:
                return 37;
            case IDENTIFIER:
                return 42;
            case IGUALES:
                return 43;
            case INTEGER:
                return 46;
            case MAYORQUE:
                return 47;
            case MENORQUE:
                return 48;
            case MENOS:
                return 49;
            case O:
                return 50;
            case POTENCIA:
                return 60;
            case PRIMERO:
                return 61;
            case PRODUCTO:
                return 62;
            case RAIZCUADRADA:
                return 63;
            case RC:
                return 64;
            case REDONDEA:
                return 66;
            case RESTO:
                return 68;
            case RUMBO:
                return 70;
            case SEN:
                return 72;
            case SENO:
                return 73;
            case SUMA:
                return 76;
            case UL:
                return 77;
            case ULTIMO:
                return 78;
            case Y:
                return 80;
        }
        return 463;
    }

    private int yys75() {
        switch (yytok) {
            case NEGRO:
            case ROJO:
            case AMARILLO:
            case '-':
            case '<':
            case BLANCO:
            case error:
            case '[':
            case GRIS:
            case '=':
            case '+':
            case '>':
            case ')':
            case '*':
            case '/':
            case '(':
            case VERDE:
            case MARRON:
            case AZUL:
            case CIAN:
                return 463;
        }
        return yyr54();
    }

    private int yys76() {
        switch (yytok) {
            case AZAR:
                return 24;
            case COS:
                return 29;
            case CUENTA:
                return 30;
            case DIFERENCIA:
                return 31;
            case DIVISION:
                return 32;
            case ELEGIR:
                return 34;
            case ELEMENTO:
                return 35;
            case FLOAT:
                return 37;
            case IDENTIFIER:
                return 42;
            case INTEGER:
                return 46;
            case MENOS:
                return 49;
            case POTENCIA:
                return 60;
            case PRIMERO:
                return 61;
            case PRODUCTO:
                return 62;
            case RAIZCUADRADA:
                return 63;
            case RC:
                return 64;
            case REDONDEA:
                return 66;
            case RESTO:
                return 68;
            case RUMBO:
                return 70;
            case SEN:
                return 72;
            case SENO:
                return 73;
            case SUMA:
                return 76;
            case UL:
                return 77;
            case ULTIMO:
                return 78;
        }
        return 463;
    }

    private int yys80() {
        switch (yytok) {
            case AZAR:
                return 24;
            case COS:
                return 29;
            case CUENTA:
                return 30;
            case DIFERENCIA:
                return 31;
            case DIVISION:
                return 32;
            case ELEGIR:
                return 34;
            case ELEMENTO:
                return 35;
            case FLOAT:
                return 37;
            case IDENTIFIER:
                return 42;
            case INTEGER:
                return 46;
            case MENOS:
                return 49;
            case POTENCIA:
                return 60;
            case PRIMERO:
                return 61;
            case PRODUCTO:
                return 62;
            case RAIZCUADRADA:
                return 63;
            case RC:
                return 64;
            case REDONDEA:
                return 66;
            case RESTO:
                return 68;
            case RUMBO:
                return 70;
            case SEN:
                return 72;
            case SENO:
                return 73;
            case SUMA:
                return 76;
            case UL:
                return 77;
            case ULTIMO:
                return 78;
        }
        return 463;
    }

    private int yys81() {
        switch (yytok) {
            case APARECETORTUGA:
                return 20;
            case AT:
                return 21;
            case AV:
                return 22;
            case AVANZA:
                return 23;
            case AZAR:
                return 24;
            case BAJALAPIZ:
                return 25;
            case BL:
                return 26;
            case BORRAPANTALLA:
                return 27;
            case CENTRO:
                return 28;
            case COS:
                return 29;
            case CUENTA:
                return 30;
            case DIFERENCIA:
                return 31;
            case DIVISION:
                return 32;
            case EJECUTA:
                return 33;
            case ELEGIR:
                return 34;
            case ELEMENTO:
                return 35;
            case ESPERA:
                return 36;
            case FLOAT:
                return 37;
            case GD:
                return 38;
            case GI:
                return 39;
            case GIRADERECHA:
                return 40;
            case GIRAIZQUIERDA:
                return 41;
            case IDENTIFIER:
                return 42;
            case IGUALES:
                return 43;
            case INC:
                return 44;
            case INIC:
                return 45;
            case INTEGER:
                return 46;
            case MAYORQUE:
                return 47;
            case MENORQUE:
                return 48;
            case MENOS:
                return 49;
            case O:
                return 50;
            case OCULTATORTUGA:
                return 51;
            case OT:
                return 52;
            case PONCL:
                return 53;
            case PONCOLORLAPIZ:
                return 54;
            case PONPOS:
                return 55;
            case PONRUMBO:
                return 56;
            case PONX:
                return 57;
            case PONXY:
                return 58;
            case PONY:
                return 59;
            case POTENCIA:
                return 60;
            case PRIMERO:
                return 61;
            case PRODUCTO:
                return 62;
            case RAIZCUADRADA:
                return 63;
            case RC:
                return 64;
            case RE:
                return 65;
            case REDONDEA:
                return 66;
            case REPITE:
                return 67;
            case RESTO:
                return 68;
            case RETROCEDE:
                return 69;
            case RUMBO:
                return 70;
            case SB:
                return 71;
            case SEN:
                return 72;
            case SENO:
                return 73;
            case SI:
                return 74;
            case SUBELAPIZ:
                return 75;
            case SUMA:
                return 76;
            case UL:
                return 77;
            case ULTIMO:
                return 78;
            case VAR:
                return 79;
            case Y:
                return 80;
        }
        return 463;
    }

    private int yys82() {
        switch (yytok) {
            case AZAR:
                return 24;
            case COS:
                return 29;
            case CUENTA:
                return 30;
            case DIFERENCIA:
                return 31;
            case DIVISION:
                return 32;
            case ELEGIR:
                return 34;
            case ELEMENTO:
                return 35;
            case FLOAT:
                return 37;
            case IDENTIFIER:
                return 42;
            case INTEGER:
                return 46;
            case MENOS:
                return 49;
            case POTENCIA:
                return 60;
            case PRIMERO:
                return 61;
            case PRODUCTO:
                return 62;
            case RAIZCUADRADA:
                return 63;
            case RC:
                return 64;
            case REDONDEA:
                return 66;
            case RESTO:
                return 68;
            case RUMBO:
                return 70;
            case SEN:
                return 72;
            case SENO:
                return 73;
            case SUMA:
                return 76;
            case UL:
                return 77;
            case ULTIMO:
                return 78;
        }
        return 463;
    }

    private int yys83() {
        switch (yytok) {
            case AZAR:
                return 24;
            case COS:
                return 29;
            case CUENTA:
                return 30;
            case DIFERENCIA:
                return 31;
            case DIVISION:
                return 32;
            case ELEGIR:
                return 34;
            case ELEMENTO:
                return 35;
            case FLOAT:
                return 37;
            case IDENTIFIER:
                return 42;
            case INTEGER:
                return 46;
            case MENOS:
                return 49;
            case POTENCIA:
                return 60;
            case PRIMERO:
                return 61;
            case PRODUCTO:
                return 62;
            case RAIZCUADRADA:
                return 63;
            case RC:
                return 64;
            case REDONDEA:
                return 66;
            case RESTO:
                return 68;
            case RUMBO:
                return 70;
            case SEN:
                return 72;
            case SENO:
                return 73;
            case SUMA:
                return 76;
            case UL:
                return 77;
            case ULTIMO:
                return 78;
        }
        return 463;
    }

    private int yys84() {
        switch (yytok) {
            case AZAR:
                return 24;
            case COS:
                return 29;
            case CUENTA:
                return 30;
            case DIFERENCIA:
                return 31;
            case DIVISION:
                return 32;
            case ELEGIR:
                return 34;
            case ELEMENTO:
                return 35;
            case FLOAT:
                return 37;
            case IDENTIFIER:
                return 42;
            case INTEGER:
                return 46;
            case MENOS:
                return 49;
            case POTENCIA:
                return 60;
            case PRIMERO:
                return 61;
            case PRODUCTO:
                return 62;
            case RAIZCUADRADA:
                return 63;
            case RC:
                return 64;
            case REDONDEA:
                return 66;
            case RESTO:
                return 68;
            case RUMBO:
                return 70;
            case SEN:
                return 72;
            case SENO:
                return 73;
            case SUMA:
                return 76;
            case UL:
                return 77;
            case ULTIMO:
                return 78;
        }
        return 463;
    }

    private int yys85() {
        switch (yytok) {
            case AZAR:
                return 24;
            case COS:
                return 29;
            case CUENTA:
                return 30;
            case DIFERENCIA:
                return 31;
            case DIVISION:
                return 32;
            case ELEGIR:
                return 34;
            case ELEMENTO:
                return 35;
            case FLOAT:
                return 37;
            case IDENTIFIER:
                return 42;
            case INTEGER:
                return 46;
            case MENOS:
                return 49;
            case POTENCIA:
                return 60;
            case PRIMERO:
                return 61;
            case PRODUCTO:
                return 62;
            case RAIZCUADRADA:
                return 63;
            case RC:
                return 64;
            case REDONDEA:
                return 66;
            case RESTO:
                return 68;
            case RUMBO:
                return 70;
            case SEN:
                return 72;
            case SENO:
                return 73;
            case SUMA:
                return 76;
            case UL:
                return 77;
            case ULTIMO:
                return 78;
        }
        return 463;
    }

    private int yys86() {
        switch (yytok) {
            case AZAR:
                return 24;
            case COS:
                return 29;
            case CUENTA:
                return 30;
            case DIFERENCIA:
                return 31;
            case DIVISION:
                return 32;
            case ELEGIR:
                return 34;
            case ELEMENTO:
                return 35;
            case FLOAT:
                return 37;
            case IDENTIFIER:
                return 42;
            case INTEGER:
                return 46;
            case MENOS:
                return 49;
            case POTENCIA:
                return 60;
            case PRIMERO:
                return 61;
            case PRODUCTO:
                return 62;
            case RAIZCUADRADA:
                return 63;
            case RC:
                return 64;
            case REDONDEA:
                return 66;
            case RESTO:
                return 68;
            case RUMBO:
                return 70;
            case SEN:
                return 72;
            case SENO:
                return 73;
            case SUMA:
                return 76;
            case UL:
                return 77;
            case ULTIMO:
                return 78;
        }
        return 463;
    }

    private int yys87() {
        switch (yytok) {
            case AZAR:
                return 24;
            case COS:
                return 29;
            case CUENTA:
                return 30;
            case DIFERENCIA:
                return 31;
            case DIVISION:
                return 32;
            case ELEGIR:
                return 34;
            case ELEMENTO:
                return 35;
            case FLOAT:
                return 37;
            case IDENTIFIER:
                return 42;
            case INTEGER:
                return 46;
            case MENOS:
                return 49;
            case POTENCIA:
                return 60;
            case PRIMERO:
                return 61;
            case PRODUCTO:
                return 62;
            case RAIZCUADRADA:
                return 63;
            case RC:
                return 64;
            case REDONDEA:
                return 66;
            case RESTO:
                return 68;
            case RUMBO:
                return 70;
            case SEN:
                return 72;
            case SENO:
                return 73;
            case SUMA:
                return 76;
            case UL:
                return 77;
            case ULTIMO:
                return 78;
        }
        return 463;
    }

    private int yys88() {
        switch (yytok) {
            case VERDE:
            case NEGRO:
            case AZUL:
            case ')':
            case CIAN:
            case '(':
            case MARRON:
            case GRIS:
            case error:
            case '=':
            case BLANCO:
            case AMARILLO:
            case ROJO:
                return 463;
        }
        return yyr21();
    }

    private int yys89() {
        switch (yytok) {
            case '[':
            case ROJO:
            case MARRON:
            case NEGRO:
            case '<':
            case BLANCO:
            case AZUL:
            case CIAN:
            case GRIS:
            case '=':
            case '(':
            case '>':
            case AMARILLO:
            case ')':
            case error:
            case VERDE:
                return 463;
            case '*':
                return 82;
            case '+':
                return 83;
            case '-':
                return 84;
            case '/':
                return 85;
        }
        return yyr67();
    }

    private int yys90() {
        switch (yytok) {
            case VERDE:
            case NEGRO:
            case AZUL:
            case ')':
            case CIAN:
            case '(':
            case MARRON:
            case GRIS:
            case error:
            case '=':
            case BLANCO:
            case AMARILLO:
            case ROJO:
                return 463;
        }
        return yyr27();
    }

    private int yys91() {
        switch (yytok) {
            case VERDE:
            case NEGRO:
            case AZUL:
            case ')':
            case CIAN:
            case '(':
            case MARRON:
            case GRIS:
            case error:
            case '=':
            case BLANCO:
            case AMARILLO:
            case ROJO:
                return 463;
        }
        return yyr23();
    }

    private int yys92() {
        switch (yytok) {
            case VERDE:
            case NEGRO:
            case AZUL:
            case ')':
            case CIAN:
            case '(':
            case MARRON:
            case GRIS:
            case error:
            case '=':
            case BLANCO:
            case AMARILLO:
            case ROJO:
                return 463;
        }
        return yyr24();
    }

    private int yys93() {
        switch (yytok) {
            case VERDE:
            case NEGRO:
            case AZUL:
            case ')':
            case CIAN:
            case '(':
            case MARRON:
            case GRIS:
            case error:
            case '=':
            case BLANCO:
            case AMARILLO:
            case ROJO:
                return 463;
        }
        return yyr25();
    }

    private int yys94() {
        switch (yytok) {
            case VERDE:
            case NEGRO:
            case AZUL:
            case ')':
            case CIAN:
            case '(':
            case MARRON:
            case GRIS:
            case error:
            case '=':
            case BLANCO:
            case AMARILLO:
            case ROJO:
                return 463;
        }
        return yyr26();
    }

    private int yys95() {
        switch (yytok) {
            case VERDE:
            case NEGRO:
            case AZUL:
            case ')':
            case CIAN:
            case '(':
            case MARRON:
            case GRIS:
            case error:
            case '=':
            case BLANCO:
            case AMARILLO:
            case ROJO:
                return 463;
        }
        return yyr22();
    }

    private int yys96() {
        switch (yytok) {
            case '[':
            case ROJO:
            case MARRON:
            case NEGRO:
            case '<':
            case BLANCO:
            case AZUL:
            case CIAN:
            case GRIS:
            case '=':
            case '(':
            case '>':
            case AMARILLO:
            case ')':
            case error:
            case VERDE:
                return 463;
            case '*':
                return 82;
            case '+':
                return 83;
            case '-':
                return 84;
            case '/':
                return 85;
        }
        return yyr66();
    }

    private int yys97() {
        switch (yytok) {
            case GRIS:
            case AMARILLO:
            case AZUL:
            case error:
            case NEGRO:
            case CIAN:
            case '(':
            case ROJO:
            case BLANCO:
            case ')':
            case '=':
            case VERDE:
            case MARRON:
                return 463;
            case '*':
                return 82;
            case '+':
                return 83;
            case '-':
                return 84;
            case '/':
                return 85;
        }
        return yyr60();
    }

    private int yys98() {
        switch (yytok) {
            case GRIS:
            case AMARILLO:
            case AZUL:
            case error:
            case NEGRO:
            case CIAN:
            case '(':
            case ROJO:
            case BLANCO:
            case ')':
            case '=':
            case VERDE:
            case MARRON:
                return 463;
            case '*':
                return 82;
            case '+':
                return 83;
            case '-':
                return 84;
            case '/':
                return 85;
        }
        return yyr59();
    }

    private int yys100() {
        switch (yytok) {
            case VERDE:
            case NEGRO:
            case AZUL:
            case ')':
            case CIAN:
            case '(':
            case MARRON:
            case GRIS:
            case error:
            case '=':
            case BLANCO:
            case AMARILLO:
            case ROJO:
                return 463;
        }
        return yyr91();
    }

    private int yys101() {
        switch (yytok) {
            case '(':
            case BLANCO:
            case NEGRO:
            case VERDE:
            case ')':
            case MARRON:
            case ROJO:
            case '=':
            case AMARILLO:
            case error:
            case GRIS:
            case AZUL:
            case CIAN:
                return 463;
            case AZAR:
                return 24;
            case COS:
                return 29;
            case CUENTA:
                return 30;
            case DIFERENCIA:
                return 31;
            case DIVISION:
                return 32;
            case ELEGIR:
                return 34;
            case ELEMENTO:
                return 35;
            case FLOAT:
                return 37;
            case IDENTIFIER:
                return 42;
            case INTEGER:
                return 46;
            case MENOS:
                return 49;
            case POTENCIA:
                return 60;
            case PRIMERO:
                return 61;
            case PRODUCTO:
                return 62;
            case RAIZCUADRADA:
                return 63;
            case RC:
                return 64;
            case REDONDEA:
                return 66;
            case RESTO:
                return 68;
            case RUMBO:
                return 70;
            case SEN:
                return 72;
            case SENO:
                return 73;
            case SUMA:
                return 76;
            case UL:
                return 77;
            case ULTIMO:
                return 78;
            case '*':
                return 82;
            case '+':
                return 83;
            case '-':
                return 84;
            case '/':
                return 85;
        }
        return yyr90();
    }

    private int yys102() {
        switch (yytok) {
            case AZAR:
                return 24;
            case COS:
                return 29;
            case CUENTA:
                return 30;
            case DIFERENCIA:
                return 31;
            case DIVISION:
                return 32;
            case ELEGIR:
                return 34;
            case ELEMENTO:
                return 35;
            case FLOAT:
                return 37;
            case IDENTIFIER:
                return 42;
            case INTEGER:
                return 46;
            case MENOS:
                return 49;
            case POTENCIA:
                return 60;
            case PRIMERO:
                return 61;
            case PRODUCTO:
                return 62;
            case RAIZCUADRADA:
                return 63;
            case RC:
                return 64;
            case REDONDEA:
                return 66;
            case RESTO:
                return 68;
            case RUMBO:
                return 70;
            case SEN:
                return 72;
            case SENO:
                return 73;
            case SUMA:
                return 76;
            case UL:
                return 77;
            case ULTIMO:
                return 78;
            case '*':
                return 82;
            case '+':
                return 83;
            case '-':
                return 84;
            case '/':
                return 85;
        }
        return 463;
    }

    private int yys103() {
        switch (yytok) {
            case APARECETORTUGA:
                return 20;
            case AT:
                return 21;
            case AV:
                return 22;
            case AVANZA:
                return 23;
            case AZAR:
                return 24;
            case BAJALAPIZ:
                return 25;
            case BL:
                return 26;
            case BORRAPANTALLA:
                return 27;
            case CENTRO:
                return 28;
            case COS:
                return 29;
            case CUENTA:
                return 30;
            case DIFERENCIA:
                return 31;
            case DIVISION:
                return 32;
            case EJECUTA:
                return 33;
            case ELEGIR:
                return 34;
            case ELEMENTO:
                return 35;
            case ESPERA:
                return 36;
            case FLOAT:
                return 37;
            case GD:
                return 38;
            case GI:
                return 39;
            case GIRADERECHA:
                return 40;
            case GIRAIZQUIERDA:
                return 41;
            case IDENTIFIER:
                return 42;
            case IGUALES:
                return 43;
            case INC:
                return 44;
            case INIC:
                return 45;
            case INTEGER:
                return 46;
            case MAYORQUE:
                return 47;
            case MENORQUE:
                return 48;
            case MENOS:
                return 49;
            case O:
                return 50;
            case OCULTATORTUGA:
                return 51;
            case OT:
                return 52;
            case PONCL:
                return 53;
            case PONCOLORLAPIZ:
                return 54;
            case PONPOS:
                return 55;
            case PONRUMBO:
                return 56;
            case PONX:
                return 57;
            case PONXY:
                return 58;
            case PONY:
                return 59;
            case POTENCIA:
                return 60;
            case PRIMERO:
                return 61;
            case PRODUCTO:
                return 62;
            case RAIZCUADRADA:
                return 63;
            case RC:
                return 64;
            case RE:
                return 65;
            case REDONDEA:
                return 66;
            case REPITE:
                return 67;
            case RESTO:
                return 68;
            case RETROCEDE:
                return 69;
            case RUMBO:
                return 70;
            case SB:
                return 71;
            case SEN:
                return 72;
            case SENO:
                return 73;
            case SI:
                return 74;
            case SUBELAPIZ:
                return 75;
            case SUMA:
                return 76;
            case UL:
                return 77;
            case ULTIMO:
                return 78;
            case VAR:
                return 79;
            case Y:
                return 80;
        }
        return 463;
    }

    private int yys107() {
        switch (yytok) {
            case '[':
            case ROJO:
            case MARRON:
            case NEGRO:
            case '<':
            case BLANCO:
            case AZUL:
            case CIAN:
            case GRIS:
            case '=':
            case '(':
            case '>':
            case AMARILLO:
            case ')':
            case error:
            case VERDE:
                return 463;
            case '*':
                return 82;
            case '+':
                return 83;
            case '-':
                return 84;
            case '/':
                return 85;
        }
        return yyr79();
    }

    private int yys108() {
        switch (yytok) {
            case '[':
            case ROJO:
            case MARRON:
            case NEGRO:
            case '<':
            case BLANCO:
            case AZUL:
            case CIAN:
            case GRIS:
            case '=':
            case '(':
            case '>':
            case AMARILLO:
            case ')':
            case error:
            case VERDE:
                return 463;
            case '*':
                return 82;
            case '+':
                return 83;
            case '-':
                return 84;
            case '/':
                return 85;
        }
        return yyr71();
    }

    private int yys109() {
        switch (yytok) {
            case '[':
            case ROJO:
            case MARRON:
            case NEGRO:
            case '<':
            case BLANCO:
            case AZUL:
            case CIAN:
            case GRIS:
            case '=':
            case '(':
            case '>':
            case AMARILLO:
            case ')':
            case error:
            case VERDE:
                return 463;
            case '*':
                return 82;
            case '+':
                return 83;
            case '-':
                return 84;
            case '/':
                return 85;
        }
        return yyr73();
    }

    private int yys110() {
        switch (yytok) {
            case '[':
            case ROJO:
            case MARRON:
            case NEGRO:
            case '<':
            case BLANCO:
            case AZUL:
            case CIAN:
            case GRIS:
            case '=':
            case '(':
            case '>':
            case AMARILLO:
            case ')':
            case error:
            case VERDE:
                return 463;
            case '*':
                return 82;
            case '+':
                return 83;
            case '-':
                return 84;
            case '/':
                return 85;
        }
        return yyr70();
    }

    private int yys111() {
        switch (yytok) {
            case '[':
            case ROJO:
            case MARRON:
            case NEGRO:
            case '<':
            case BLANCO:
            case AZUL:
            case CIAN:
            case GRIS:
            case '=':
            case '(':
            case '>':
            case AMARILLO:
            case ')':
            case error:
            case VERDE:
                return 463;
            case '*':
                return 82;
            case '+':
                return 83;
            case '-':
                return 84;
            case '/':
                return 85;
        }
        return yyr72();
    }

    private int yys112() {
        switch (yytok) {
            case AZAR:
                return 24;
            case COS:
                return 29;
            case CUENTA:
                return 30;
            case DIFERENCIA:
                return 31;
            case DIVISION:
                return 32;
            case ELEGIR:
                return 34;
            case ELEMENTO:
                return 35;
            case FLOAT:
                return 37;
            case IDENTIFIER:
                return 42;
            case INTEGER:
                return 46;
            case MENOS:
                return 49;
            case POTENCIA:
                return 60;
            case PRIMERO:
                return 61;
            case PRODUCTO:
                return 62;
            case RAIZCUADRADA:
                return 63;
            case RC:
                return 64;
            case REDONDEA:
                return 66;
            case RESTO:
                return 68;
            case RUMBO:
                return 70;
            case SEN:
                return 72;
            case SENO:
                return 73;
            case SUMA:
                return 76;
            case UL:
                return 77;
            case ULTIMO:
                return 78;
            case '*':
                return 82;
            case '+':
                return 83;
            case '-':
                return 84;
            case '/':
                return 85;
        }
        return 463;
    }

    private int yys115() {
        switch (yytok) {
            case AZAR:
                return 24;
            case COS:
                return 29;
            case CUENTA:
                return 30;
            case DIFERENCIA:
                return 31;
            case DIVISION:
                return 32;
            case ELEGIR:
                return 34;
            case ELEMENTO:
                return 35;
            case FLOAT:
                return 37;
            case IDENTIFIER:
                return 42;
            case INTEGER:
                return 46;
            case MENOS:
                return 49;
            case POTENCIA:
                return 60;
            case PRIMERO:
                return 61;
            case PRODUCTO:
                return 62;
            case RAIZCUADRADA:
                return 63;
            case RC:
                return 64;
            case REDONDEA:
                return 66;
            case RESTO:
                return 68;
            case RUMBO:
                return 70;
            case SEN:
                return 72;
            case SENO:
                return 73;
            case SUMA:
                return 76;
            case UL:
                return 77;
            case ULTIMO:
                return 78;
            case '*':
                return 82;
            case '+':
                return 83;
            case '-':
                return 84;
            case '/':
                return 85;
        }
        return 463;
    }

    private int yys116() {
        switch (yytok) {
            case AZAR:
                return 24;
            case COS:
                return 29;
            case CUENTA:
                return 30;
            case DIFERENCIA:
                return 31;
            case DIVISION:
                return 32;
            case ELEGIR:
                return 34;
            case ELEMENTO:
                return 35;
            case FLOAT:
                return 37;
            case IDENTIFIER:
                return 42;
            case INTEGER:
                return 46;
            case MENOS:
                return 49;
            case POTENCIA:
                return 60;
            case PRIMERO:
                return 61;
            case PRODUCTO:
                return 62;
            case RAIZCUADRADA:
                return 63;
            case RC:
                return 64;
            case REDONDEA:
                return 66;
            case RESTO:
                return 68;
            case RUMBO:
                return 70;
            case SEN:
                return 72;
            case SENO:
                return 73;
            case SUMA:
                return 76;
            case UL:
                return 77;
            case ULTIMO:
                return 78;
            case '*':
                return 82;
            case '+':
                return 83;
            case '-':
                return 84;
            case '/':
                return 85;
        }
        return 463;
    }

    private int yys117() {
        switch (yytok) {
            case GRIS:
            case AMARILLO:
            case AZUL:
            case error:
            case NEGRO:
            case CIAN:
            case '(':
            case ROJO:
            case BLANCO:
            case ')':
            case '=':
            case VERDE:
            case MARRON:
                return 463;
            case '*':
                return 82;
            case '+':
                return 83;
            case '-':
                return 84;
            case '/':
                return 85;
        }
        return yyr61();
    }

    private int yys118() {
        switch (yytok) {
            case AZAR:
                return 24;
            case COS:
                return 29;
            case CUENTA:
                return 30;
            case DIFERENCIA:
                return 31;
            case DIVISION:
                return 32;
            case ELEGIR:
                return 34;
            case ELEMENTO:
                return 35;
            case FLOAT:
                return 37;
            case IDENTIFIER:
                return 42;
            case INTEGER:
                return 46;
            case MENOS:
                return 49;
            case POTENCIA:
                return 60;
            case PRIMERO:
                return 61;
            case PRODUCTO:
                return 62;
            case RAIZCUADRADA:
                return 63;
            case RC:
                return 64;
            case REDONDEA:
                return 66;
            case RESTO:
                return 68;
            case RUMBO:
                return 70;
            case SEN:
                return 72;
            case SENO:
                return 73;
            case SUMA:
                return 76;
            case UL:
                return 77;
            case ULTIMO:
                return 78;
            case '*':
                return 82;
            case '+':
                return 83;
            case '-':
                return 84;
            case '/':
                return 85;
        }
        return 463;
    }

    private int yys119() {
        switch (yytok) {
            case NEGRO:
            case ROJO:
            case AMARILLO:
            case '-':
            case '<':
            case BLANCO:
            case error:
            case '[':
            case GRIS:
            case '=':
            case '+':
            case '>':
            case ')':
            case '*':
            case '/':
            case '(':
            case VERDE:
            case MARRON:
            case AZUL:
            case CIAN:
                return 463;
        }
        return yyr78();
    }

    private int yys120() {
        switch (yytok) {
            case NEGRO:
            case ROJO:
            case AMARILLO:
            case '-':
            case '<':
            case BLANCO:
            case error:
            case '[':
            case GRIS:
            case '=':
            case '+':
            case '>':
            case ')':
            case '*':
            case '/':
            case '(':
            case VERDE:
            case MARRON:
            case AZUL:
            case CIAN:
                return 463;
        }
        return yyr43();
    }

    private int yys121() {
        switch (yytok) {
            case NEGRO:
            case ROJO:
            case AMARILLO:
            case '-':
            case '<':
            case BLANCO:
            case error:
            case '[':
            case GRIS:
            case '=':
            case '+':
            case '>':
            case ')':
            case '*':
            case '/':
            case '(':
            case VERDE:
            case MARRON:
            case AZUL:
            case CIAN:
                return 463;
        }
        return yyr39();
    }

    private int yys122() {
        switch (yytok) {
            case NEGRO:
            case ROJO:
            case AMARILLO:
            case '-':
            case '<':
            case BLANCO:
            case error:
            case '[':
            case GRIS:
            case '=':
            case '+':
            case '>':
            case ')':
            case '*':
            case '/':
            case '(':
            case VERDE:
            case MARRON:
            case AZUL:
            case CIAN:
                return 463;
        }
        return yyr38();
    }

    private int yys123() {
        switch (yytok) {
            case NEGRO:
            case ROJO:
            case AMARILLO:
            case '-':
            case '<':
            case BLANCO:
            case error:
            case '[':
            case GRIS:
            case '=':
            case '+':
            case '>':
            case ')':
            case '*':
            case '/':
            case '(':
            case VERDE:
            case MARRON:
            case AZUL:
            case CIAN:
                return 463;
        }
        return yyr41();
    }

    private int yys124() {
        switch (yytok) {
            case NEGRO:
            case ROJO:
            case AMARILLO:
            case '-':
            case '<':
            case BLANCO:
            case error:
            case '[':
            case GRIS:
            case '=':
            case '+':
            case '>':
            case ')':
            case '*':
            case '/':
            case '(':
            case VERDE:
            case MARRON:
            case AZUL:
            case CIAN:
                return 463;
        }
        return yyr42();
    }

    private int yys125() {
        switch (yytok) {
            case NEGRO:
            case ROJO:
            case AMARILLO:
            case '-':
            case '<':
            case BLANCO:
            case error:
            case '[':
            case GRIS:
            case '=':
            case '+':
            case '>':
            case ')':
            case '*':
            case '/':
            case '(':
            case VERDE:
            case MARRON:
            case AZUL:
            case CIAN:
                return 463;
        }
        return yyr40();
    }

    private int yys126() {
        switch (yytok) {
            case NEGRO:
            case ROJO:
            case AMARILLO:
            case '-':
            case '<':
            case BLANCO:
            case error:
            case '[':
            case GRIS:
            case '=':
            case '+':
            case '>':
            case ')':
            case '*':
            case '/':
            case '(':
            case VERDE:
            case MARRON:
            case AZUL:
            case CIAN:
                return 463;
        }
        return yyr44();
    }

    private int yys127() {
        switch (yytok) {
            case NEGRO:
            case ROJO:
            case AMARILLO:
            case '-':
            case '<':
            case BLANCO:
            case error:
            case '[':
            case GRIS:
            case '=':
            case '+':
            case '>':
            case ')':
            case '*':
            case '/':
            case '(':
            case VERDE:
            case MARRON:
            case AZUL:
            case CIAN:
                return 463;
        }
        return yyr45();
    }

    private int yys128() {
        switch (yytok) {
            case NEGRO:
            case ROJO:
            case AMARILLO:
            case '-':
            case '<':
            case BLANCO:
            case error:
            case '[':
            case GRIS:
            case '=':
            case '+':
            case '>':
            case ')':
            case '*':
            case '/':
            case '(':
            case VERDE:
            case MARRON:
            case AZUL:
            case CIAN:
                return 463;
        }
        return yyr46();
    }

    private int yys129() {
        switch (yytok) {
            case NEGRO:
            case ROJO:
            case AMARILLO:
            case '-':
            case '<':
            case BLANCO:
            case error:
            case '[':
            case GRIS:
            case '=':
            case '+':
            case '>':
            case ')':
            case '*':
            case '/':
            case '(':
            case VERDE:
            case MARRON:
            case AZUL:
            case CIAN:
                return 463;
        }
        return yyr77();
    }

    private int yys130() {
        switch (yytok) {
            case AZAR:
                return 24;
            case COS:
                return 29;
            case CUENTA:
                return 30;
            case DIFERENCIA:
                return 31;
            case DIVISION:
                return 32;
            case ELEGIR:
                return 34;
            case ELEMENTO:
                return 35;
            case FLOAT:
                return 37;
            case IDENTIFIER:
                return 42;
            case INTEGER:
                return 46;
            case MENOS:
                return 49;
            case POTENCIA:
                return 60;
            case PRIMERO:
                return 61;
            case PRODUCTO:
                return 62;
            case RAIZCUADRADA:
                return 63;
            case RC:
                return 64;
            case REDONDEA:
                return 66;
            case RESTO:
                return 68;
            case RUMBO:
                return 70;
            case SEN:
                return 72;
            case SENO:
                return 73;
            case SUMA:
                return 76;
            case UL:
                return 77;
            case ULTIMO:
                return 78;
        }
        return 463;
    }

    private int yys131() {
        switch (yytok) {
            case '[':
            case ROJO:
            case MARRON:
            case NEGRO:
            case '<':
            case BLANCO:
            case AZUL:
            case CIAN:
            case GRIS:
            case '=':
            case '(':
            case '>':
            case AMARILLO:
            case ')':
            case error:
            case VERDE:
                return 463;
            case '*':
                return 82;
            case '+':
                return 83;
            case '-':
                return 84;
            case '/':
                return 85;
        }
        return yyr74();
    }

    private int yys132() {
        switch (yytok) {
            case '[':
            case ROJO:
            case MARRON:
            case NEGRO:
            case '<':
            case BLANCO:
            case AZUL:
            case CIAN:
            case GRIS:
            case '=':
            case '(':
            case '>':
            case AMARILLO:
            case ')':
            case error:
            case VERDE:
                return 463;
            case '*':
                return 82;
            case '+':
                return 83;
            case '-':
                return 84;
            case '/':
                return 85;
        }
        return yyr75();
    }

    private int yys133() {
        switch (yytok) {
            case AZAR:
                return 24;
            case COS:
                return 29;
            case CUENTA:
                return 30;
            case DIFERENCIA:
                return 31;
            case DIVISION:
                return 32;
            case ELEGIR:
                return 34;
            case ELEMENTO:
                return 35;
            case FLOAT:
                return 37;
            case IDENTIFIER:
                return 42;
            case INTEGER:
                return 46;
            case MENOS:
                return 49;
            case POTENCIA:
                return 60;
            case PRIMERO:
                return 61;
            case PRODUCTO:
                return 62;
            case RAIZCUADRADA:
                return 63;
            case RC:
                return 64;
            case REDONDEA:
                return 66;
            case RESTO:
                return 68;
            case RUMBO:
                return 70;
            case SEN:
                return 72;
            case SENO:
                return 73;
            case SUMA:
                return 76;
            case UL:
                return 77;
            case ULTIMO:
                return 78;
            case '*':
                return 82;
            case '+':
                return 83;
            case '-':
                return 84;
            case '/':
                return 85;
        }
        return 463;
    }

    private int yys134() {
        switch (yytok) {
            case '[':
            case ROJO:
            case MARRON:
            case NEGRO:
            case '<':
            case BLANCO:
            case AZUL:
            case CIAN:
            case GRIS:
            case '=':
            case '(':
            case '>':
            case AMARILLO:
            case ')':
            case error:
            case VERDE:
                return 463;
            case '*':
                return 82;
            case '+':
                return 83;
            case '-':
                return 84;
            case '/':
                return 85;
        }
        return yyr76();
    }

    private int yys135() {
        switch (yytok) {
            case AZAR:
                return 24;
            case COS:
                return 29;
            case CUENTA:
                return 30;
            case DIFERENCIA:
                return 31;
            case DIVISION:
                return 32;
            case ELEGIR:
                return 34;
            case ELEMENTO:
                return 35;
            case FLOAT:
                return 37;
            case IDENTIFIER:
                return 42;
            case INTEGER:
                return 46;
            case MENOS:
                return 49;
            case POTENCIA:
                return 60;
            case PRIMERO:
                return 61;
            case PRODUCTO:
                return 62;
            case RAIZCUADRADA:
                return 63;
            case RC:
                return 64;
            case REDONDEA:
                return 66;
            case RESTO:
                return 68;
            case RUMBO:
                return 70;
            case SEN:
                return 72;
            case SENO:
                return 73;
            case SUMA:
                return 76;
            case UL:
                return 77;
            case ULTIMO:
                return 78;
            case '*':
                return 82;
            case '+':
                return 83;
            case '-':
                return 84;
            case '/':
                return 85;
        }
        return 463;
    }

    private int yys137() {
        switch (yytok) {
            case VERDE:
            case NEGRO:
            case AZUL:
            case ')':
            case CIAN:
            case '(':
            case MARRON:
            case GRIS:
            case error:
            case '=':
            case BLANCO:
            case AMARILLO:
            case ROJO:
                return 463;
        }
        return yyr92();
    }

    private int yys138() {
        switch (yytok) {
            case GRIS:
            case AMARILLO:
            case AZUL:
            case error:
            case NEGRO:
            case CIAN:
            case '(':
            case ROJO:
            case BLANCO:
            case ')':
            case '=':
            case VERDE:
            case MARRON:
                return 463;
            case '*':
                return 82;
            case '+':
                return 83;
            case '-':
                return 84;
            case '/':
                return 85;
        }
        return yyr62();
    }

    private int yys139() {
        switch (yytok) {
            case GRIS:
            case AMARILLO:
            case AZUL:
            case error:
            case NEGRO:
            case CIAN:
            case '(':
            case ROJO:
            case BLANCO:
            case ')':
            case '=':
            case VERDE:
            case MARRON:
                return 463;
            case '*':
                return 82;
            case '+':
                return 83;
            case '-':
                return 84;
            case '/':
                return 85;
        }
        return yyr63();
    }

    private int yys140() {
        switch (yytok) {
            case '[':
            case ROJO:
            case MARRON:
            case NEGRO:
            case '<':
            case BLANCO:
            case AZUL:
            case CIAN:
            case GRIS:
            case '=':
            case '(':
            case '>':
            case AMARILLO:
            case ')':
            case error:
            case VERDE:
                return 463;
            case '*':
                return 82;
            case '+':
                return 83;
            case '-':
                return 84;
            case '/':
                return 85;
        }
        return yyr69();
    }

    private int yys141() {
        switch (yytok) {
            case GRIS:
            case AMARILLO:
            case AZUL:
            case error:
            case NEGRO:
            case CIAN:
            case '(':
            case ROJO:
            case BLANCO:
            case ')':
            case '=':
            case VERDE:
            case MARRON:
                return 463;
            case '*':
                return 82;
            case '+':
                return 83;
            case '-':
                return 84;
            case '/':
                return 85;
        }
        return yyr58();
    }

    private int yys144() {
        switch (yytok) {
            case AZAR:
                return 24;
            case COS:
                return 29;
            case CUENTA:
                return 30;
            case DIFERENCIA:
                return 31;
            case DIVISION:
                return 32;
            case ELEGIR:
                return 34;
            case ELEMENTO:
                return 35;
            case FLOAT:
                return 37;
            case IDENTIFIER:
                return 42;
            case INTEGER:
                return 46;
            case MENOS:
                return 49;
            case POTENCIA:
                return 60;
            case PRIMERO:
                return 61;
            case PRODUCTO:
                return 62;
            case RAIZCUADRADA:
                return 63;
            case RC:
                return 64;
            case REDONDEA:
                return 66;
            case RESTO:
                return 68;
            case RUMBO:
                return 70;
            case SEN:
                return 72;
            case SENO:
                return 73;
            case SUMA:
                return 76;
            case UL:
                return 77;
            case ULTIMO:
                return 78;
            case '*':
                return 82;
            case '+':
                return 83;
            case '-':
                return 84;
            case '/':
                return 85;
        }
        return 463;
    }

    private int yys145() {
        switch (yytok) {
            case '[':
            case ROJO:
            case MARRON:
            case NEGRO:
            case '<':
            case BLANCO:
            case AZUL:
            case CIAN:
            case GRIS:
            case '=':
            case '(':
            case '>':
            case AMARILLO:
            case ')':
            case error:
            case VERDE:
                return 463;
            case '*':
                return 82;
            case '+':
                return 83;
            case '-':
                return 84;
            case '/':
                return 85;
        }
        return yyr68();
    }

    private int yys146() {
        switch (yytok) {
            case GRIS:
            case AMARILLO:
            case AZUL:
            case error:
            case NEGRO:
            case CIAN:
            case '(':
            case ROJO:
            case BLANCO:
            case ')':
            case '=':
            case VERDE:
            case MARRON:
                return 463;
            case '*':
                return 82;
            case '+':
                return 83;
            case '-':
                return 84;
            case '/':
                return 85;
        }
        return yyr65();
    }

    private int yys147() {
        switch (yytok) {
            case GRIS:
            case AMARILLO:
            case AZUL:
            case error:
            case NEGRO:
            case CIAN:
            case '(':
            case ROJO:
            case BLANCO:
            case ')':
            case '=':
            case VERDE:
            case MARRON:
                return 463;
            case '*':
                return 82;
            case '+':
                return 83;
            case '-':
                return 84;
            case '/':
                return 85;
        }
        return yyr64();
    }

    private int yys149() {
        switch (yytok) {
            case VERDE:
            case NEGRO:
            case AZUL:
            case ')':
            case CIAN:
            case '(':
            case MARRON:
            case GRIS:
            case error:
            case '=':
            case BLANCO:
            case AMARILLO:
            case ROJO:
                return 463;
        }
        return yyr93();
    }

    private int yys152() {
        switch (yytok) {
            case CIAN:
            case ROJO:
            case AMARILLO:
            case NEGRO:
            case '<':
            case AZUL:
            case error:
            case '[':
            case '-':
            case BLANCO:
            case '+':
            case '>':
            case ')':
            case '*':
            case '/':
            case '(':
            case VERDE:
            case MARRON:
            case GRIS:
                return 463;
            case '=':
                return 192;
        }
        return yyr29();
    }

    private int yys153() {
        switch (yytok) {
            case AZAR:
                return 24;
            case COS:
                return 29;
            case CUENTA:
                return 30;
            case DIFERENCIA:
                return 31;
            case DIVISION:
                return 32;
            case ELEGIR:
                return 34;
            case ELEMENTO:
                return 35;
            case FLOAT:
                return 37;
            case IDENTIFIER:
                return 42;
            case INTEGER:
                return 46;
            case MENOS:
                return 49;
            case POTENCIA:
                return 60;
            case PRIMERO:
                return 61;
            case PRODUCTO:
                return 62;
            case RAIZCUADRADA:
                return 63;
            case RC:
                return 64;
            case REDONDEA:
                return 66;
            case RESTO:
                return 68;
            case RUMBO:
                return 70;
            case SEN:
                return 72;
            case SENO:
                return 73;
            case SUMA:
                return 76;
            case UL:
                return 77;
            case ULTIMO:
                return 78;
            case '*':
                return 82;
            case '+':
                return 83;
            case '-':
                return 84;
            case '/':
                return 85;
        }
        return 463;
    }

    private int yys155() {
        switch (yytok) {
            case VERDE:
            case NEGRO:
            case AZUL:
            case ')':
            case CIAN:
            case '(':
            case MARRON:
            case GRIS:
            case error:
            case '=':
            case BLANCO:
            case AMARILLO:
            case ROJO:
                return 463;
        }
        return yyr36();
    }

    private int yys156() {
        switch (yytok) {
            case AZUL:
            case VERDE:
            case CIAN:
            case ')':
            case AMARILLO:
            case BLANCO:
            case '=':
            case GRIS:
            case MARRON:
            case '(':
            case error:
            case NEGRO:
            case ROJO:
                return 463;
            case '*':
                return 82;
            case '/':
                return 85;
        }
        return yyr34();
    }

    private int yys157() {
        switch (yytok) {
            case AZUL:
            case VERDE:
            case CIAN:
            case ')':
            case AMARILLO:
            case BLANCO:
            case '=':
            case GRIS:
            case MARRON:
            case '(':
            case error:
            case NEGRO:
            case ROJO:
                return 463;
            case '*':
                return 82;
            case '/':
                return 85;
        }
        return yyr35();
    }

    private int yys158() {
        switch (yytok) {
            case VERDE:
            case NEGRO:
            case AZUL:
            case ')':
            case CIAN:
            case '(':
            case MARRON:
            case GRIS:
            case error:
            case '=':
            case BLANCO:
            case AMARILLO:
            case ROJO:
                return 463;
        }
        return yyr37();
    }

    private int yys159() {
        switch (yytok) {
            case VERDE:
            case CIAN:
            case AMARILLO:
            case NEGRO:
            case error:
            case BLANCO:
            case '>':
            case GRIS:
            case AZUL:
            case '<':
            case ')':
            case '=':
            case '(':
            case MARRON:
            case ROJO:
                return 463;
            case '*':
                return 82;
            case '+':
                return 83;
            case '-':
                return 84;
            case '/':
                return 85;
        }
        return yyr31();
    }

    private int yys160() {
        switch (yytok) {
            case VERDE:
            case CIAN:
            case AMARILLO:
            case NEGRO:
            case error:
            case BLANCO:
            case '>':
            case GRIS:
            case AZUL:
            case '<':
            case ')':
            case '=':
            case '(':
            case MARRON:
            case ROJO:
                return 463;
            case '*':
                return 82;
            case '+':
                return 83;
            case '-':
                return 84;
            case '/':
                return 85;
        }
        return yyr32();
    }

    private int yys165() {
        switch (yytok) {
            case VERDE:
            case NEGRO:
            case AZUL:
            case ')':
            case CIAN:
            case '(':
            case MARRON:
            case GRIS:
            case error:
            case '=':
            case BLANCO:
            case AMARILLO:
            case ROJO:
                return 463;
        }
        return yyr89();
    }

    private int yys166() {
        switch (yytok) {
            case GRIS:
            case AMARILLO:
            case AZUL:
            case error:
            case NEGRO:
            case CIAN:
            case '(':
            case ROJO:
            case BLANCO:
            case ')':
            case '=':
            case VERDE:
            case MARRON:
                return 463;
            case '*':
                return 82;
            case '+':
                return 83;
            case '-':
                return 84;
            case '/':
                return 85;
        }
        return yyr81();
    }

    private int yys168() {
        switch (yytok) {
            case APARECETORTUGA:
                return 20;
            case AT:
                return 21;
            case AV:
                return 22;
            case AVANZA:
                return 23;
            case AZAR:
                return 24;
            case BAJALAPIZ:
                return 25;
            case BL:
                return 26;
            case BORRAPANTALLA:
                return 27;
            case CENTRO:
                return 28;
            case COS:
                return 29;
            case CUENTA:
                return 30;
            case DIFERENCIA:
                return 31;
            case DIVISION:
                return 32;
            case EJECUTA:
                return 33;
            case ELEGIR:
                return 34;
            case ELEMENTO:
                return 35;
            case ESPERA:
                return 36;
            case FLOAT:
                return 37;
            case GD:
                return 38;
            case GI:
                return 39;
            case GIRADERECHA:
                return 40;
            case GIRAIZQUIERDA:
                return 41;
            case IDENTIFIER:
                return 42;
            case IGUALES:
                return 43;
            case INC:
                return 44;
            case INIC:
                return 45;
            case INTEGER:
                return 46;
            case MAYORQUE:
                return 47;
            case MENORQUE:
                return 48;
            case MENOS:
                return 49;
            case O:
                return 50;
            case OCULTATORTUGA:
                return 51;
            case OT:
                return 52;
            case PONCL:
                return 53;
            case PONCOLORLAPIZ:
                return 54;
            case PONPOS:
                return 55;
            case PONRUMBO:
                return 56;
            case PONX:
                return 57;
            case PONXY:
                return 58;
            case PONY:
                return 59;
            case POTENCIA:
                return 60;
            case PRIMERO:
                return 61;
            case PRODUCTO:
                return 62;
            case RAIZCUADRADA:
                return 63;
            case RC:
                return 64;
            case RE:
                return 65;
            case REDONDEA:
                return 66;
            case REPITE:
                return 67;
            case RESTO:
                return 68;
            case RETROCEDE:
                return 69;
            case RUMBO:
                return 70;
            case SB:
                return 71;
            case SEN:
                return 72;
            case SENO:
                return 73;
            case SI:
                return 74;
            case SUBELAPIZ:
                return 75;
            case SUMA:
                return 76;
            case UL:
                return 77;
            case ULTIMO:
                return 78;
            case VAR:
                return 79;
            case Y:
                return 80;
            case ']':
                return yyr95();
        }
        return 463;
    }

    private int yys173() {
        switch (yytok) {
            case VERDE:
            case CIAN:
            case AMARILLO:
            case NEGRO:
            case error:
            case BLANCO:
            case '>':
            case GRIS:
            case AZUL:
            case '<':
            case ')':
            case '=':
            case '(':
            case MARRON:
            case ROJO:
                return 463;
            case '*':
                return 82;
            case '+':
                return 83;
            case '-':
                return 84;
            case '/':
                return 85;
        }
        return yyr83();
    }

    private int yys174() {
        switch (yytok) {
            case AZAR:
                return 24;
            case COS:
                return 29;
            case CUENTA:
                return 30;
            case DIFERENCIA:
                return 31;
            case DIVISION:
                return 32;
            case ELEGIR:
                return 34;
            case ELEMENTO:
                return 35;
            case FLOAT:
                return 37;
            case IDENTIFIER:
                return 42;
            case INTEGER:
                return 46;
            case MENOS:
                return 49;
            case POTENCIA:
                return 60;
            case PRIMERO:
                return 61;
            case PRODUCTO:
                return 62;
            case RAIZCUADRADA:
                return 63;
            case RC:
                return 64;
            case REDONDEA:
                return 66;
            case RESTO:
                return 68;
            case RUMBO:
                return 70;
            case SEN:
                return 72;
            case SENO:
                return 73;
            case SUMA:
                return 76;
            case UL:
                return 77;
            case ULTIMO:
                return 78;
            case ']':
                return 208;
        }
        return 463;
    }

    private int yys175() {
        switch (yytok) {
            case AZAR:
                return 24;
            case COS:
                return 29;
            case CUENTA:
                return 30;
            case DIFERENCIA:
                return 31;
            case DIVISION:
                return 32;
            case ELEGIR:
                return 34;
            case ELEMENTO:
                return 35;
            case FLOAT:
                return 37;
            case IDENTIFIER:
                return 42;
            case INTEGER:
                return 46;
            case MENOS:
                return 49;
            case POTENCIA:
                return 60;
            case PRIMERO:
                return 61;
            case PRODUCTO:
                return 62;
            case RAIZCUADRADA:
                return 63;
            case RC:
                return 64;
            case REDONDEA:
                return 66;
            case RESTO:
                return 68;
            case RUMBO:
                return 70;
            case SEN:
                return 72;
            case SENO:
                return 73;
            case SUMA:
                return 76;
            case UL:
                return 77;
            case ULTIMO:
                return 78;
        }
        return 463;
    }

    private int yys176() {
        switch (yytok) {
            case VERDE:
            case CIAN:
            case AMARILLO:
            case NEGRO:
            case error:
            case BLANCO:
            case '>':
            case GRIS:
            case AZUL:
            case '<':
            case ')':
            case '=':
            case '(':
            case MARRON:
            case ROJO:
                return 463;
            case '*':
                return 82;
            case '+':
                return 83;
            case '-':
                return 84;
            case '/':
                return 85;
        }
        return yyr86();
    }

    private int yys177() {
        switch (yytok) {
            case VERDE:
            case CIAN:
            case AMARILLO:
            case NEGRO:
            case error:
            case BLANCO:
            case '>':
            case GRIS:
            case AZUL:
            case '<':
            case ')':
            case '=':
            case '(':
            case MARRON:
            case ROJO:
                return 463;
            case '*':
                return 82;
            case '+':
                return 83;
            case '-':
                return 84;
            case '/':
                return 85;
        }
        return yyr87();
    }

    private int yys178() {
        switch (yytok) {
            case VERDE:
            case CIAN:
            case AMARILLO:
            case NEGRO:
            case error:
            case BLANCO:
            case '>':
            case GRIS:
            case AZUL:
            case '<':
            case ')':
            case '=':
            case '(':
            case MARRON:
            case ROJO:
                return 463;
            case '*':
                return 82;
            case '+':
                return 83;
            case '-':
                return 84;
            case '/':
                return 85;
        }
        return yyr85();
    }

    private int yys179() {
        switch (yytok) {
            case AZAR:
                return 24;
            case COS:
                return 29;
            case CUENTA:
                return 30;
            case DIFERENCIA:
                return 31;
            case DIVISION:
                return 32;
            case ELEGIR:
                return 34;
            case ELEMENTO:
                return 35;
            case FLOAT:
                return 37;
            case IDENTIFIER:
                return 42;
            case INTEGER:
                return 46;
            case MENOS:
                return 49;
            case POTENCIA:
                return 60;
            case PRIMERO:
                return 61;
            case PRODUCTO:
                return 62;
            case RAIZCUADRADA:
                return 63;
            case RC:
                return 64;
            case REDONDEA:
                return 66;
            case RESTO:
                return 68;
            case RUMBO:
                return 70;
            case SEN:
                return 72;
            case SENO:
                return 73;
            case SUMA:
                return 76;
            case UL:
                return 77;
            case ULTIMO:
                return 78;
            case '*':
                return 82;
            case '+':
                return 83;
            case '-':
                return 84;
            case '/':
                return 85;
        }
        return 463;
    }

    private int yys180() {
        switch (yytok) {
            case '[':
            case ROJO:
            case MARRON:
            case NEGRO:
            case '<':
            case BLANCO:
            case AZUL:
            case CIAN:
            case GRIS:
            case '=':
            case '(':
            case '>':
            case AMARILLO:
            case ')':
            case error:
            case VERDE:
                return 463;
            case '*':
                return 82;
            case '+':
                return 83;
            case '-':
                return 84;
            case '/':
                return 85;
        }
        return yyr88();
    }

    private int yys181() {
        switch (yytok) {
            case GRIS:
            case AMARILLO:
            case AZUL:
            case error:
            case NEGRO:
            case CIAN:
            case '(':
            case ROJO:
            case BLANCO:
            case ')':
            case '=':
            case VERDE:
            case MARRON:
                return 463;
            case '*':
                return 82;
            case '+':
                return 83;
            case '-':
                return 84;
            case '/':
                return 85;
        }
        return yyr80();
    }

    private int yys184() {
        switch (yytok) {
            case APARECETORTUGA:
                return 20;
            case AT:
                return 21;
            case AV:
                return 22;
            case AVANZA:
                return 23;
            case AZAR:
                return 24;
            case BAJALAPIZ:
                return 25;
            case BL:
                return 26;
            case BORRAPANTALLA:
                return 27;
            case CENTRO:
                return 28;
            case COS:
                return 29;
            case CUENTA:
                return 30;
            case DIFERENCIA:
                return 31;
            case DIVISION:
                return 32;
            case EJECUTA:
                return 33;
            case ELEGIR:
                return 34;
            case ELEMENTO:
                return 35;
            case ESPERA:
                return 36;
            case FLOAT:
                return 37;
            case GD:
                return 38;
            case GI:
                return 39;
            case GIRADERECHA:
                return 40;
            case GIRAIZQUIERDA:
                return 41;
            case IDENTIFIER:
                return 42;
            case IGUALES:
                return 43;
            case INC:
                return 44;
            case INIC:
                return 45;
            case INTEGER:
                return 46;
            case MAYORQUE:
                return 47;
            case MENORQUE:
                return 48;
            case MENOS:
                return 49;
            case O:
                return 50;
            case OCULTATORTUGA:
                return 51;
            case OT:
                return 52;
            case PONCL:
                return 53;
            case PONCOLORLAPIZ:
                return 54;
            case PONPOS:
                return 55;
            case PONRUMBO:
                return 56;
            case PONX:
                return 57;
            case PONXY:
                return 58;
            case PONY:
                return 59;
            case POTENCIA:
                return 60;
            case PRIMERO:
                return 61;
            case PRODUCTO:
                return 62;
            case RAIZCUADRADA:
                return 63;
            case RC:
                return 64;
            case RE:
                return 65;
            case REDONDEA:
                return 66;
            case REPITE:
                return 67;
            case RESTO:
                return 68;
            case RETROCEDE:
                return 69;
            case RUMBO:
                return 70;
            case SB:
                return 71;
            case SEN:
                return 72;
            case SENO:
                return 73;
            case SI:
                return 74;
            case SUBELAPIZ:
                return 75;
            case SUMA:
                return 76;
            case UL:
                return 77;
            case ULTIMO:
                return 78;
            case VAR:
                return 79;
            case Y:
                return 80;
        }
        return 463;
    }

    private int yys185() {
        switch (yytok) {
            case APARECETORTUGA:
                return 20;
            case AT:
                return 21;
            case AV:
                return 22;
            case AVANZA:
                return 23;
            case AZAR:
                return 24;
            case BAJALAPIZ:
                return 25;
            case BL:
                return 26;
            case BORRAPANTALLA:
                return 27;
            case CENTRO:
                return 28;
            case COS:
                return 29;
            case CUENTA:
                return 30;
            case DIFERENCIA:
                return 31;
            case DIVISION:
                return 32;
            case EJECUTA:
                return 33;
            case ELEGIR:
                return 34;
            case ELEMENTO:
                return 35;
            case ESPERA:
                return 36;
            case FLOAT:
                return 37;
            case GD:
                return 38;
            case GI:
                return 39;
            case GIRADERECHA:
                return 40;
            case GIRAIZQUIERDA:
                return 41;
            case IDENTIFIER:
                return 42;
            case IGUALES:
                return 43;
            case INC:
                return 44;
            case INIC:
                return 45;
            case INTEGER:
                return 46;
            case MAYORQUE:
                return 47;
            case MENORQUE:
                return 48;
            case MENOS:
                return 49;
            case O:
                return 50;
            case OCULTATORTUGA:
                return 51;
            case OT:
                return 52;
            case PONCL:
                return 53;
            case PONCOLORLAPIZ:
                return 54;
            case PONPOS:
                return 55;
            case PONRUMBO:
                return 56;
            case PONX:
                return 57;
            case PONXY:
                return 58;
            case PONY:
                return 59;
            case POTENCIA:
                return 60;
            case PRIMERO:
                return 61;
            case PRODUCTO:
                return 62;
            case RAIZCUADRADA:
                return 63;
            case RC:
                return 64;
            case RE:
                return 65;
            case REDONDEA:
                return 66;
            case REPITE:
                return 67;
            case RESTO:
                return 68;
            case RETROCEDE:
                return 69;
            case RUMBO:
                return 70;
            case SB:
                return 71;
            case SEN:
                return 72;
            case SENO:
                return 73;
            case SI:
                return 74;
            case SUBELAPIZ:
                return 75;
            case SUMA:
                return 76;
            case UL:
                return 77;
            case ULTIMO:
                return 78;
            case VAR:
                return 79;
            case Y:
                return 80;
        }
        return 463;
    }

    private int yys186() {
        switch (yytok) {
            case GRIS:
            case AMARILLO:
            case AZUL:
            case error:
            case NEGRO:
            case CIAN:
            case '(':
            case ROJO:
            case BLANCO:
            case ')':
            case '=':
            case VERDE:
            case MARRON:
                return 463;
            case '*':
                return 82;
            case '+':
                return 83;
            case '-':
                return 84;
            case '/':
                return 85;
        }
        return yyr82();
    }

    private int yys187() {
        switch (yytok) {
            case APARECETORTUGA:
                return 20;
            case AT:
                return 21;
            case AV:
                return 22;
            case AVANZA:
                return 23;
            case AZAR:
                return 24;
            case BAJALAPIZ:
                return 25;
            case BL:
                return 26;
            case BORRAPANTALLA:
                return 27;
            case CENTRO:
                return 28;
            case COS:
                return 29;
            case CUENTA:
                return 30;
            case DIFERENCIA:
                return 31;
            case DIVISION:
                return 32;
            case EJECUTA:
                return 33;
            case ELEGIR:
                return 34;
            case ELEMENTO:
                return 35;
            case ESPERA:
                return 36;
            case FLOAT:
                return 37;
            case GD:
                return 38;
            case GI:
                return 39;
            case GIRADERECHA:
                return 40;
            case GIRAIZQUIERDA:
                return 41;
            case IDENTIFIER:
                return 42;
            case IGUALES:
                return 43;
            case INC:
                return 44;
            case INIC:
                return 45;
            case INTEGER:
                return 46;
            case MAYORQUE:
                return 47;
            case MENORQUE:
                return 48;
            case MENOS:
                return 49;
            case O:
                return 50;
            case OCULTATORTUGA:
                return 51;
            case OT:
                return 52;
            case PONCL:
                return 53;
            case PONCOLORLAPIZ:
                return 54;
            case PONPOS:
                return 55;
            case PONRUMBO:
                return 56;
            case PONX:
                return 57;
            case PONXY:
                return 58;
            case PONY:
                return 59;
            case POTENCIA:
                return 60;
            case PRIMERO:
                return 61;
            case PRODUCTO:
                return 62;
            case RAIZCUADRADA:
                return 63;
            case RC:
                return 64;
            case RE:
                return 65;
            case REDONDEA:
                return 66;
            case REPITE:
                return 67;
            case RESTO:
                return 68;
            case RETROCEDE:
                return 69;
            case RUMBO:
                return 70;
            case SB:
                return 71;
            case SEN:
                return 72;
            case SENO:
                return 73;
            case SI:
                return 74;
            case SUBELAPIZ:
                return 75;
            case SUMA:
                return 76;
            case UL:
                return 77;
            case ULTIMO:
                return 78;
            case VAR:
                return 79;
            case Y:
                return 80;
        }
        return 463;
    }

    private int yys192() {
        switch (yytok) {
            case AZAR:
                return 24;
            case COS:
                return 29;
            case CUENTA:
                return 30;
            case DIFERENCIA:
                return 31;
            case DIVISION:
                return 32;
            case ELEGIR:
                return 34;
            case ELEMENTO:
                return 35;
            case FLOAT:
                return 37;
            case IDENTIFIER:
                return 42;
            case INTEGER:
                return 46;
            case MENOS:
                return 49;
            case POTENCIA:
                return 60;
            case PRIMERO:
                return 61;
            case PRODUCTO:
                return 62;
            case RAIZCUADRADA:
                return 63;
            case RC:
                return 64;
            case REDONDEA:
                return 66;
            case RESTO:
                return 68;
            case RUMBO:
                return 70;
            case SEN:
                return 72;
            case SENO:
                return 73;
            case SUMA:
                return 76;
            case UL:
                return 77;
            case ULTIMO:
                return 78;
        }
        return 463;
    }

    private int yys193() {
        switch (yytok) {
            case VERDE:
            case CIAN:
            case AMARILLO:
            case NEGRO:
            case error:
            case BLANCO:
            case '>':
            case GRIS:
            case AZUL:
            case '<':
            case ')':
            case '=':
            case '(':
            case MARRON:
            case ROJO:
                return 463;
            case '*':
                return 82;
            case '+':
                return 83;
            case '-':
                return 84;
            case '/':
                return 85;
        }
        return yyr84();
    }

    private int yys195() {
        switch (yytok) {
            case VERDE:
            case NEGRO:
            case AZUL:
            case ')':
            case CIAN:
            case '(':
            case MARRON:
            case GRIS:
            case error:
            case '=':
            case BLANCO:
            case AMARILLO:
            case ROJO:
                return 463;
        }
        return yyr102();
    }

    private int yys196() {
        switch (yytok) {
            case VERDE:
            case NEGRO:
            case AZUL:
            case ')':
            case CIAN:
            case '(':
            case MARRON:
            case GRIS:
            case error:
            case '=':
            case BLANCO:
            case AMARILLO:
            case ROJO:
                return 463;
        }
        return yyr103();
    }

    private int yys199() {
        switch (yytok) {
            case NEGRO:
            case ROJO:
            case AMARILLO:
            case '-':
            case '<':
            case BLANCO:
            case error:
            case '[':
            case GRIS:
            case '=':
            case '+':
            case '>':
            case ')':
            case '*':
            case '/':
            case '(':
            case VERDE:
            case MARRON:
            case AZUL:
            case CIAN:
                return 463;
        }
        return yyr113();
    }

    private int yys201() {
        switch (yytok) {
            case VERDE:
            case NEGRO:
            case AZUL:
            case ')':
            case CIAN:
            case '(':
            case MARRON:
            case GRIS:
            case error:
            case '=':
            case BLANCO:
            case AMARILLO:
            case ROJO:
                return 463;
        }
        return yyr100();
    }

    private int yys202() {
        switch (yytok) {
            case VERDE:
            case NEGRO:
            case AZUL:
            case ')':
            case CIAN:
            case '(':
            case MARRON:
            case GRIS:
            case error:
            case '=':
            case BLANCO:
            case AMARILLO:
            case ROJO:
                return 463;
        }
        return yyr101();
    }

    private int yys208() {
        switch (yytok) {
            case NEGRO:
            case ROJO:
            case AMARILLO:
            case '-':
            case '<':
            case BLANCO:
            case error:
            case '[':
            case GRIS:
            case '=':
            case '+':
            case '>':
            case ')':
            case '*':
            case '/':
            case '(':
            case VERDE:
            case MARRON:
            case AZUL:
            case CIAN:
                return 463;
        }
        return yyr110();
    }

    private int yys209() {
        switch (yytok) {
            case '[':
            case ROJO:
            case MARRON:
            case NEGRO:
            case '<':
            case BLANCO:
            case AZUL:
            case CIAN:
            case GRIS:
            case '=':
            case '(':
            case '>':
            case AMARILLO:
            case ')':
            case error:
            case VERDE:
                return 463;
            case '*':
                return 82;
            case '+':
                return 83;
            case '-':
                return 84;
            case '/':
                return 85;
        }
        return yyr28();
    }

    private int yys211() {
        switch (yytok) {
            case VERDE:
            case NEGRO:
            case AZUL:
            case ')':
            case CIAN:
            case '(':
            case MARRON:
            case GRIS:
            case error:
            case '=':
            case BLANCO:
            case AMARILLO:
            case ROJO:
                return 463;
        }
        return yyr108();
    }

    private int yys212() {
        switch (yytok) {
            case VERDE:
            case NEGRO:
            case AZUL:
            case ')':
            case CIAN:
            case '(':
            case MARRON:
            case GRIS:
            case error:
            case '=':
            case BLANCO:
            case AMARILLO:
            case ROJO:
                return 463;
        }
        return yyr109();
    }

    private int yys216() {
        switch (yytok) {
            case VERDE:
            case NEGRO:
            case AZUL:
            case ')':
            case CIAN:
            case '(':
            case MARRON:
            case GRIS:
            case error:
            case '=':
            case BLANCO:
            case AMARILLO:
            case ROJO:
                return 463;
        }
        return yyr105();
    }

    private int yys217() {
        switch (yytok) {
            case VERDE:
            case NEGRO:
            case AZUL:
            case ')':
            case CIAN:
            case '(':
            case MARRON:
            case GRIS:
            case error:
            case '=':
            case BLANCO:
            case AMARILLO:
            case ROJO:
                return 463;
        }
        return yyr107();
    }

    private int yys218() {
        switch (yytok) {
            case VERDE:
            case NEGRO:
            case AZUL:
            case ')':
            case CIAN:
            case '(':
            case MARRON:
            case GRIS:
            case error:
            case '=':
            case BLANCO:
            case AMARILLO:
            case ROJO:
                return 463;
        }
        return yyr104();
    }

    private int yys219() {
        switch (yytok) {
            case VERDE:
            case NEGRO:
            case AZUL:
            case ')':
            case CIAN:
            case '(':
            case MARRON:
            case GRIS:
            case error:
            case '=':
            case BLANCO:
            case AMARILLO:
            case ROJO:
                return 463;
        }
        return yyr106();
    }

    private int yys220() {
        switch (yytok) {
            case '[':
            case ROJO:
            case MARRON:
            case NEGRO:
            case '<':
            case BLANCO:
            case AZUL:
            case CIAN:
            case GRIS:
            case '=':
            case '(':
            case '>':
            case AMARILLO:
            case ')':
            case error:
            case VERDE:
                return 463;
            case '*':
                return 82;
            case '+':
                return 83;
            case '-':
                return 84;
            case '/':
                return 85;
        }
        return yyr30();
    }

    private int yys221() {
        switch (yytok) {
            case VERDE:
            case NEGRO:
            case AZUL:
            case ')':
            case CIAN:
            case '(':
            case MARRON:
            case GRIS:
            case error:
            case '=':
            case BLANCO:
            case AMARILLO:
            case ROJO:
                return 463;
        }
        return yyr116();
    }

    private int yys222() {
        switch (yytok) {
            case VERDE:
            case NEGRO:
            case AZUL:
            case ')':
            case CIAN:
            case '(':
            case MARRON:
            case GRIS:
            case error:
            case '=':
            case BLANCO:
            case AMARILLO:
            case ROJO:
                return 463;
        }
        return yyr117();
    }

    private int yys223() {
        switch (yytok) {
            case VERDE:
            case NEGRO:
            case AZUL:
            case ')':
            case CIAN:
            case '(':
            case MARRON:
            case GRIS:
            case error:
            case '=':
            case BLANCO:
            case AMARILLO:
            case ROJO:
                return 463;
        }
        return yyr114();
    }

    private int yys224() {
        switch (yytok) {
            case VERDE:
            case NEGRO:
            case AZUL:
            case ')':
            case CIAN:
            case '(':
            case MARRON:
            case GRIS:
            case error:
            case '=':
            case BLANCO:
            case AMARILLO:
            case ROJO:
                return 463;
        }
        return yyr115();
    }

    private int yys225() {
        switch (yytok) {
            case NEGRO:
            case ROJO:
            case AMARILLO:
            case '-':
            case '<':
            case BLANCO:
            case error:
            case '[':
            case GRIS:
            case '=':
            case '+':
            case '>':
            case ')':
            case '*':
            case '/':
            case '(':
            case VERDE:
            case MARRON:
            case AZUL:
            case CIAN:
                return 463;
        }
        return yyr111();
    }

    private int yys226() {
        switch (yytok) {
            case NEGRO:
            case ROJO:
            case AMARILLO:
            case '-':
            case '<':
            case BLANCO:
            case error:
            case '[':
            case GRIS:
            case '=':
            case '+':
            case '>':
            case ')':
            case '*':
            case '/':
            case '(':
            case VERDE:
            case MARRON:
            case AZUL:
            case CIAN:
                return 463;
        }
        return yyr112();
    }

    private int yys227() {
        switch (yytok) {
            case NEGRO:
            case ROJO:
            case AMARILLO:
            case '-':
            case '<':
            case BLANCO:
            case error:
            case '[':
            case GRIS:
            case '=':
            case '+':
            case '>':
            case ')':
            case '*':
            case '/':
            case '(':
            case VERDE:
            case MARRON:
            case AZUL:
            case CIAN:
                return 463;
        }
        return yyr119();
    }

    private int yys228() {
        switch (yytok) {
            case NEGRO:
            case ROJO:
            case AMARILLO:
            case '-':
            case '<':
            case BLANCO:
            case error:
            case '[':
            case GRIS:
            case '=':
            case '+':
            case '>':
            case ')':
            case '*':
            case '/':
            case '(':
            case VERDE:
            case MARRON:
            case AZUL:
            case CIAN:
                return 463;
        }
        return yyr118();
    }

    private int yys229() {
        switch (yytok) {
            case NEGRO:
            case ROJO:
            case AMARILLO:
            case '-':
            case '<':
            case BLANCO:
            case error:
            case '[':
            case GRIS:
            case '=':
            case '+':
            case '>':
            case ')':
            case '*':
            case '/':
            case '(':
            case VERDE:
            case MARRON:
            case AZUL:
            case CIAN:
                return 463;
        }
        return yyr120();
    }

    private int yyr1() { // prog : expression ';' prog ';'
        yysp -= 4;
        return yypprog();
    }

    private int yyr2() { // prog : expression
        yysp -= 1;
        return yypprog();
    }

    private int yypprog() {
        switch (yyst[yysp-1]) {
            case 0: return 1;
            default: return 154;
        }
    }

    private int yyr96() { // N_intvals : INTEGER N_intvals
        yysp -= 2;
        return yypN_intvals();
    }

    private int yyr97() { // N_intvals : INTEGER
        yysp -= 1;
        return yypN_intvals();
    }

    private int yypN_intvals() {
        switch (yyst[yysp-1]) {
            case 171: return 203;
            case 164: return 198;
            case 151: return 190;
            case 150: return 188;
            case 136: return 182;
            case 104: return 169;
            case 99: return 161;
            default: return 205;
        }
    }

    private int yyr94() { // N_ordenes : expression N_ordenes
        yysp -= 2;
        return yypN_ordenes();
    }

    private int yyr95() { // N_ordenes : expression
        yysp -= 1;
        return yypN_ordenes();
    }

    private int yypN_ordenes() {
        switch (yyst[yysp-1]) {
            case 185: return 214;
            case 184: return 213;
            case 168: return 200;
            case 103: return 167;
            default: return 215;
        }
    }

    private int yyr89() { // N_params : number N_params
        yysp -= 2;
        return yypN_params();
    }

    private int yyr90() { // N_params : number
        yysp -= 1;
        return yypN_params();
    }

    private int yypN_params() {
        switch (yyst[yysp-1]) {
            case 76: return 149;
            case 62: return 137;
            case 31: return 100;
            default: return 165;
        }
    }

    private int yyr34() { // arithmetic_expr : number '+' number
        {yyrv=(int)yysv[yysp-3]+(int)yysv[yysp-1];System.out.println(yyrv);}
        yysv[yysp-=3] = yyrv;
        return yyparithmetic_expr();
    }

    private int yyr35() { // arithmetic_expr : number '-' number
        yysp -= 3;
        return yyparithmetic_expr();
    }

    private int yyr36() { // arithmetic_expr : number '*' number
        yysp -= 3;
        return yyparithmetic_expr();
    }

    private int yyr37() { // arithmetic_expr : number '/' number
        yysp -= 3;
        return yyparithmetic_expr();
    }

    private int yyparithmetic_expr() {
        switch (yyst[yysp-1]) {
            case 187: return 2;
            case 185: return 2;
            case 184: return 2;
            case 168: return 2;
            case 103: return 2;
            case 81: return 2;
            case 0: return 2;
            default: return 88;
        }
    }

    private int yyr38() { // color : BLANCO
        yysp -= 1;
        return yypcolor();
    }

    private int yyr39() { // color : AZUL
        yysp -= 1;
        return yypcolor();
    }

    private int yyr40() { // color : MARRON
        yysp -= 1;
        return yypcolor();
    }

    private int yyr41() { // color : CIAN
        yysp -= 1;
        return yypcolor();
    }

    private int yyr42() { // color : GRIS
        yysp -= 1;
        return yypcolor();
    }

    private int yyr43() { // color : AMARILLO
        yysp -= 1;
        return yypcolor();
    }

    private int yyr44() { // color : NEGRO
        yysp -= 1;
        return yypcolor();
    }

    private int yyr45() { // color : ROJO
        yysp -= 1;
        return yypcolor();
    }

    private int yyr46() { // color : VERDE
        yysp -= 1;
        return yypcolor();
    }

    private int yypcolor() {
        switch (yyst[yysp-1]) {
            case 53: return 119;
            default: return 129;
        }
    }

    private int yyr29() { // declaration_expr : VAR IDENTIFIER
        { /* Almacenar identificador */ }
        yysv[yysp-=2] = yyrv;
        return 3;
    }

    private int yyr30() { // declaration_expr : VAR IDENTIFIER '=' number
        { System.out.println("Identificador " + yysv[yysp-3] + " creado."); }
        yysv[yysp-=4] = yyrv;
        return 3;
    }

    private int yyr3() { // expression : declaration_expr
        yysp -= 1;
        return yypexpression();
    }

    private int yyr4() { // expression : redeclaration_expr
        yysp -= 1;
        return yypexpression();
    }

    private int yyr5() { // expression : logic_expr
        yysp -= 1;
        return yypexpression();
    }

    private int yyr6() { // expression : arithmetic_expr
        yysp -= 1;
        return yypexpression();
    }

    private int yyr7() { // expression : procedure_val
        yysp -= 1;
        return yypexpression();
    }

    private int yyr8() { // expression : procedure1_val
        yysp -= 1;
        return yypexpression();
    }

    private int yyr9() { // expression : procedure2_val
        yysp -= 1;
        return yypexpression();
    }

    private int yyr10() { // expression : procedureN_val
        yysp -= 1;
        return yypexpression();
    }

    private int yyr11() { // expression : procedureP_val
        yysp -= 1;
        return yypexpression();
    }

    private int yyr12() { // expression : procedure1P_val
        yysp -= 1;
        return yypexpression();
    }

    private int yyr13() { // expression : procedure_noval
        yysp -= 1;
        return yypexpression();
    }

    private int yyr14() { // expression : procedure1_noval
        yysp -= 1;
        return yypexpression();
    }

    private int yyr15() { // expression : procedure2_noval
        yysp -= 1;
        return yypexpression();
    }

    private int yyr16() { // expression : procedureP_noval
        yysp -= 1;
        return yypexpression();
    }

    private int yyr17() { // expression : procedure1P_noval
        yysp -= 1;
        return yypexpression();
    }

    private int yypexpression() {
        switch (yyst[yysp-1]) {
            case 81: return 4;
            case 0: return 4;
            default: return 168;
        }
    }

    private int yyr31() { // logic_expr : number '<' number
        {System.out.println(yysv[yysp-3]);}
        yysv[yysp-=3] = yyrv;
        return yyplogic_expr();
    }

    private int yyr32() { // logic_expr : number '>' number
        yysp -= 3;
        return yyplogic_expr();
    }

    private int yyr33() { // logic_expr : procedure2_bool
        yysp -= 1;
        return yyplogic_expr();
    }

    private int yyplogic_expr() {
        switch (yyst[yysp-1]) {
            case 74: return 148;
            default: return 5;
        }
    }

    private int yyr18() { // number : INTEGER
        {yyrv=yysv[yysp-1];}
        yysv[yysp-=1] = yyrv;
        return yypnumber();
    }

    private int yyr19() { // number : FLOAT
        {yyrv=yysv[yysp-1];}
        yysv[yysp-=1] = yyrv;
        return yypnumber();
    }

    private int yyr20() { // number : IDENTIFIER
        {yyrv=yysv[yysp-1];}
        yysv[yysp-=1] = yyrv;
        return yypnumber();
    }

    private int yyr21() { // number : arithmetic_expr
        yysp -= 1;
        return yypnumber();
    }

    private int yyr22() { // number : procedure_val
        yysp -= 1;
        return yypnumber();
    }

    private int yyr23() { // number : procedure1_val
        yysp -= 1;
        return yypnumber();
    }

    private int yyr24() { // number : procedure2_val
        yysp -= 1;
        return yypnumber();
    }

    private int yyr25() { // number : procedureN_val
        yysp -= 1;
        return yypnumber();
    }

    private int yyr26() { // number : procedureP_val
        yysp -= 1;
        return yypnumber();
    }

    private int yyr27() { // number : procedure1P_val
        yysp -= 1;
        return yypnumber();
    }

    private int yypnumber() {
        switch (yyst[yysp-1]) {
            case 192: return 220;
            case 179: return 210;
            case 175: return 209;
            case 174: return 207;
            case 153: return 193;
            case 144: return 186;
            case 135: return 181;
            case 133: return 180;
            case 130: return 179;
            case 118: return 178;
            case 116: return 177;
            case 115: return 176;
            case 112: return 173;
            case 102: return 166;
            case 101: return 101;
            case 87: return 160;
            case 86: return 159;
            case 85: return 158;
            case 84: return 157;
            case 83: return 156;
            case 82: return 155;
            case 80: return 153;
            case 76: return 101;
            case 73: return 147;
            case 72: return 146;
            case 69: return 145;
            case 68: return 144;
            case 66: return 141;
            case 65: return 140;
            case 64: return 139;
            case 63: return 138;
            case 62: return 101;
            case 60: return 135;
            case 59: return 134;
            case 58: return 133;
            case 57: return 132;
            case 56: return 131;
            case 50: return 118;
            case 49: return 117;
            case 48: return 116;
            case 47: return 115;
            case 43: return 112;
            case 41: return 111;
            case 40: return 110;
            case 39: return 109;
            case 38: return 108;
            case 36: return 107;
            case 32: return 102;
            case 31: return 101;
            case 29: return 98;
            case 24: return 97;
            case 23: return 96;
            case 22: return 89;
            default: return 6;
        }
    }

    private int yyr118() { // procedure1P_noval : REPITE INTEGER '[' N_ordenes ']'
        yysp -= 5;
        return 7;
    }

    private int yyr119() { // procedure1P_noval : REPITE IDENTIFIER '[' N_ordenes ']'
        yysp -= 5;
        return 7;
    }

    private int yyr120() { // procedure1P_noval : SI logic_expr '[' N_ordenes ']'
        yysp -= 5;
        return 7;
    }

    private int yyr114() { // procedure1P_val : ELEMENTO INTEGER '[' N_intvals ']'
        yysp -= 5;
        return yypprocedure1P_val();
    }

    private int yyr115() { // procedure1P_val : ELEMENTO INTEGER '[' N_floatvals ']'
        yysp -= 5;
        return yypprocedure1P_val();
    }

    private int yyr116() { // procedure1P_val : ELEMENTO IDENTIFIER '[' N_intvals ']'
        yysp -= 5;
        return yypprocedure1P_val();
    }

    private int yyr117() { // procedure1P_val : ELEMENTO IDENTIFIER '[' N_floatvals ']'
        yysp -= 5;
        return yypprocedure1P_val();
    }

    private int yypprocedure1P_val() {
        switch (yyst[yysp-1]) {
            case 187: return 8;
            case 185: return 8;
            case 184: return 8;
            case 168: return 8;
            case 103: return 8;
            case 81: return 8;
            case 0: return 8;
            default: return 90;
        }
    }

    private int yyr66() { // procedure1_noval : AVANZA number
        yysp -= 2;
        return 9;
    }

    private int yyr67() { // procedure1_noval : AV number
        yysp -= 2;
        return 9;
    }

    private int yyr68() { // procedure1_noval : RETROCEDE number
        yysp -= 2;
        return 9;
    }

    private int yyr69() { // procedure1_noval : RE number
        yysp -= 2;
        return 9;
    }

    private int yyr70() { // procedure1_noval : GIRADERECHA number
        yysp -= 2;
        return 9;
    }

    private int yyr71() { // procedure1_noval : GD number
        yysp -= 2;
        return 9;
    }

    private int yyr72() { // procedure1_noval : GIRAIZQUIERDA number
        yysp -= 2;
        return 9;
    }

    private int yyr73() { // procedure1_noval : GI number
        yysp -= 2;
        return 9;
    }

    private int yyr74() { // procedure1_noval : PONRUMBO number
        yysp -= 2;
        return 9;
    }

    private int yyr75() { // procedure1_noval : PONX number
        yysp -= 2;
        return 9;
    }

    private int yyr76() { // procedure1_noval : PONY number
        yysp -= 2;
        return 9;
    }

    private int yyr77() { // procedure1_noval : PONCOLORLAPIZ color
        yysp -= 2;
        return 9;
    }

    private int yyr78() { // procedure1_noval : PONCL color
        yysp -= 2;
        return 9;
    }

    private int yyr79() { // procedure1_noval : ESPERA number
        yysp -= 2;
        return 9;
    }

    private int yyr58() { // procedure1_val : REDONDEA number
        yysp -= 2;
        return yypprocedure1_val();
    }

    private int yyr59() { // procedure1_val : COS number
        yysp -= 2;
        return yypprocedure1_val();
    }

    private int yyr60() { // procedure1_val : AZAR number
        yysp -= 2;
        return yypprocedure1_val();
    }

    private int yyr61() { // procedure1_val : MENOS number
        yysp -= 2;
        return yypprocedure1_val();
    }

    private int yyr62() { // procedure1_val : RAIZCUADRADA number
        yysp -= 2;
        return yypprocedure1_val();
    }

    private int yyr63() { // procedure1_val : RC number
        yysp -= 2;
        return yypprocedure1_val();
    }

    private int yyr64() { // procedure1_val : SENO number
        yysp -= 2;
        return yypprocedure1_val();
    }

    private int yyr65() { // procedure1_val : SEN number
        yysp -= 2;
        return yypprocedure1_val();
    }

    private int yypprocedure1_val() {
        switch (yyst[yysp-1]) {
            case 187: return 10;
            case 185: return 10;
            case 184: return 10;
            case 168: return 10;
            case 103: return 10;
            case 81: return 10;
            case 0: return 10;
            default: return 91;
        }
    }

    private int yyr83() { // procedure2_bool : IGUALES number number
        yysp -= 3;
        return 11;
    }

    private int yyr84() { // procedure2_bool : Y number number
        yysp -= 3;
        return 11;
    }

    private int yyr85() { // procedure2_bool : O number number
        yysp -= 3;
        return 11;
    }

    private int yyr86() { // procedure2_bool : MAYORQUE number number
        yysp -= 3;
        return 11;
    }

    private int yyr87() { // procedure2_bool : MENORQUE number number
        yysp -= 3;
        return 11;
    }

    private int yyr88() { // procedure2_noval : PONXY number number
        yysp -= 3;
        return 12;
    }

    private int yyr80() { // procedure2_val : POTENCIA number number
        yysp -= 3;
        return yypprocedure2_val();
    }

    private int yyr81() { // procedure2_val : DIVISION number number
        yysp -= 3;
        return yypprocedure2_val();
    }

    private int yyr82() { // procedure2_val : RESTO number number
        yysp -= 3;
        return yypprocedure2_val();
    }

    private int yypprocedure2_val() {
        switch (yyst[yysp-1]) {
            case 187: return 13;
            case 185: return 13;
            case 184: return 13;
            case 168: return 13;
            case 103: return 13;
            case 81: return 13;
            case 0: return 13;
            default: return 92;
        }
    }

    private int yyr91() { // procedureN_val : DIFERENCIA N_params
        yysp -= 2;
        return yypprocedureN_val();
    }

    private int yyr92() { // procedureN_val : PRODUCTO N_params
        yysp -= 2;
        return yypprocedureN_val();
    }

    private int yyr93() { // procedureN_val : SUMA N_params
        yysp -= 2;
        return yypprocedureN_val();
    }

    private int yypprocedureN_val() {
        switch (yyst[yysp-1]) {
            case 187: return 14;
            case 185: return 14;
            case 184: return 14;
            case 168: return 14;
            case 103: return 14;
            case 81: return 14;
            case 0: return 14;
            default: return 93;
        }
    }

    private int yyr110() { // procedureP_noval : INC '[' IDENTIFIER ']'
        yysp -= 4;
        return 15;
    }

    private int yyr111() { // procedureP_noval : INC '[' IDENTIFIER number ']'
        yysp -= 5;
        return 15;
    }

    private int yyr112() { // procedureP_noval : PONPOS '[' number number ']'
        yysp -= 5;
        return 15;
    }

    private int yyr113() { // procedureP_noval : EJECUTA '[' N_ordenes ']'
        { /* Similar a un procedimiento anónimo */ }
        yysv[yysp-=4] = yyrv;
        return 15;
    }

    private int yyr100() { // procedureP_val : ELEGIR '[' N_intvals ']'
        yysp -= 4;
        return yypprocedureP_val();
    }

    private int yyr101() { // procedureP_val : ELEGIR '[' N_floatvals ']'
        yysp -= 4;
        return yypprocedureP_val();
    }

    private int yyr102() { // procedureP_val : CUENTA '[' N_intvals ']'
        yysp -= 4;
        return yypprocedureP_val();
    }

    private int yyr103() { // procedureP_val : CUENTA '[' N_floatvals ']'
        yysp -= 4;
        return yypprocedureP_val();
    }

    private int yyr104() { // procedureP_val : ULTIMO '[' N_intvals ']'
        yysp -= 4;
        return yypprocedureP_val();
    }

    private int yyr105() { // procedureP_val : UL '[' N_intvals ']'
        yysp -= 4;
        return yypprocedureP_val();
    }

    private int yyr106() { // procedureP_val : ULTIMO '[' N_floatvals ']'
        yysp -= 4;
        return yypprocedureP_val();
    }

    private int yyr107() { // procedureP_val : UL '[' N_floatvals ']'
        yysp -= 4;
        return yypprocedureP_val();
    }

    private int yyr108() { // procedureP_val : PRIMERO '[' N_intvals ']'
        yysp -= 4;
        return yypprocedureP_val();
    }

    private int yyr109() { // procedureP_val : PRIMERO '[' N_floatvals ']'
        yysp -= 4;
        return yypprocedureP_val();
    }

    private int yypprocedureP_val() {
        switch (yyst[yysp-1]) {
            case 187: return 16;
            case 185: return 16;
            case 184: return 16;
            case 168: return 16;
            case 103: return 16;
            case 81: return 16;
            case 0: return 16;
            default: return 94;
        }
    }

    private int yyr48() { // procedure_noval : OCULTATORTUGA
        yysp -= 1;
        return 17;
    }

    private int yyr49() { // procedure_noval : OT
        yysp -= 1;
        return 17;
    }

    private int yyr50() { // procedure_noval : APARECETORTUGA
        yysp -= 1;
        return 17;
    }

    private int yyr51() { // procedure_noval : AT
        yysp -= 1;
        return 17;
    }

    private int yyr52() { // procedure_noval : BAJALAPIZ
        yysp -= 1;
        return 17;
    }

    private int yyr53() { // procedure_noval : BL
        yysp -= 1;
        return 17;
    }

    private int yyr54() { // procedure_noval : SUBELAPIZ
        yysp -= 1;
        return 17;
    }

    private int yyr55() { // procedure_noval : SB
        yysp -= 1;
        return 17;
    }

    private int yyr56() { // procedure_noval : CENTRO
        yysp -= 1;
        return 17;
    }

    private int yyr57() { // procedure_noval : BORRAPANTALLA
        yysp -= 1;
        return 17;
    }

    private int yyr47() { // procedure_val : RUMBO
        yysp -= 1;
        switch (yyst[yysp-1]) {
            case 187: return 18;
            case 185: return 18;
            case 184: return 18;
            case 168: return 18;
            case 103: return 18;
            case 81: return 18;
            case 0: return 18;
            default: return 95;
        }
    }

    private int yyr98() { // N_floatvals : FLOAT N_floatvals
        yysp -= 2;
        return yypN_floatvals();
    }

    private int yyr99() { // N_floatvals : FLOAT
        yysp -= 1;
        return yypN_floatvals();
    }

    private int yypN_floatvals() {
        switch (yyst[yysp-1]) {
            case 171: return 204;
            case 163: return 197;
            case 151: return 191;
            case 150: return 189;
            case 136: return 183;
            case 104: return 170;
            case 99: return 162;
            default: return 206;
        }
    }

    private int yyr28() { // redeclaration_expr : INIC IDENTIFIER '=' number
        yysp -= 4;
        return 19;
    }

    protected String[] yyerrmsgs = {
    };


    public Lexer lexer;
        private ArrayList<jsonAction> acciones; // Aqui se guardan las acciones a ejecutar en la interfaz
// TODO: Guardar una version en texto plano de este array list en un documento


    public void yyerror(String msg) {
        int lastToken = lexer.getCurrentToken(); //Para verificar si se llegó al final de línea.
        if (lastToken == 0) {
            parseFinished();
            return;
        }

        System.out.println(msg);
        System.out.println("En " + lexer.getSemantic() + ", línea " + (lexer.line + 1) + ". columna " + (lexer.column + 1));
    }

    public Parser(String ruta) {
            acciones = new ArrayList<jsonAction>();
        try {
            Reader reader = new BufferedReader(new FileReader(ruta));
            lexer = new Lexer(reader);
            lexer.getNextToken();
        } catch (IOException ex) {
            yyerror("Could not open file for parsing.");
        }
    }

    /**
     * Función para mostrar un mensaje del compilador en la interfaz.
     */
    public void showMessage(String msg, MessageType type) {
        //TODO: mostrar mensaje del tipo correspondiente en la interfaz.
    }

    public void parseFinished() {
        System.out.println("Compilación finalizada correctamente.");
        //TODO: notificar interfaz que finalizó la compilación.
    }

    public static void main(String[] args) {
        //TODO: recibir ruta desde args.
        String path = "/src/Compiler/NewLex/parse.txt";
        String ruta  = System.getProperty("user.dir").replaceAll("\\\\", "/") + path;
        Parser parser = new Parser(ruta);
        parser.parse();
    }

}
