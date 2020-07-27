// Output created by jacc on Mon Jul 27 11:10:36 CST 2020

package Tests.Jacc;

import Compiler.Lex.Lexer;
import java.io.*;
import Logic.MessageType;
import Logic.jsonAction;
import java.util.ArrayList;
import java.util.Random;
import java.util.HashMap;
import java.util.Stack;

import Compiler.Helpers.VariableHandler;
import Compiler.Helpers.ProcedureHandler;
import Compiler.Helpers.NumberType;

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
                case 339:
                    yyn = yys0();
                    continue;

                case 1:
                    yyst[yysp] = 1;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 340:
                    switch (yytok) {
                        case ENDINPUT:
                            yyn = 678;
                            continue;
                    }
                    yyn = 681;
                    continue;

                case 2:
                    yyst[yysp] = 2;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 341:
                    yyn = yys2();
                    continue;

                case 3:
                    yyst[yysp] = 3;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 342:
                    switch (yytok) {
                        case ';':
                            yyn = 85;
                            continue;
                    }
                    yyn = 681;
                    continue;

                case 4:
                    yyst[yysp] = 4;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 343:
                    yyn = yys4();
                    continue;

                case 5:
                    yyst[yysp] = 5;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 344:
                    yyn = yys5();
                    continue;

                case 6:
                    yyst[yysp] = 6;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 345:
                    yyn = yys6();
                    continue;

                case 7:
                    yyst[yysp] = 7;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 346:
                    yyn = yys7();
                    continue;

                case 8:
                    yyst[yysp] = 8;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 347:
                    yyn = yys8();
                    continue;

                case 9:
                    yyst[yysp] = 9;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 348:
                    yyn = yys9();
                    continue;

                case 10:
                    yyst[yysp] = 10;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 349:
                    yyn = yys10();
                    continue;

                case 11:
                    yyst[yysp] = 11;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 350:
                    yyn = yys11();
                    continue;

                case 12:
                    yyst[yysp] = 12;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 351:
                    yyn = yys12();
                    continue;

                case 13:
                    yyst[yysp] = 13;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 352:
                    yyn = yys13();
                    continue;

                case 14:
                    yyst[yysp] = 14;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 353:
                    yyn = yys14();
                    continue;

                case 15:
                    yyst[yysp] = 15;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 354:
                    switch (yytok) {
                        case '[':
                            yyn = 86;
                            continue;
                    }
                    yyn = 681;
                    continue;

                case 16:
                    yyst[yysp] = 16;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 355:
                    switch (yytok) {
                        case ENDINPUT:
                            yyn = yyr1();
                            continue;
                    }
                    yyn = 681;
                    continue;

                case 17:
                    yyst[yysp] = 17;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 356:
                    yyn = yys17();
                    continue;

                case 18:
                    yyst[yysp] = 18;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 357:
                    yyn = yys18();
                    continue;

                case 19:
                    yyst[yysp] = 19;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 358:
                    yyn = yys19();
                    continue;

                case 20:
                    yyst[yysp] = 20;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 359:
                    yyn = yys20();
                    continue;

                case 21:
                    yyst[yysp] = 21;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 360:
                    yyn = yys21();
                    continue;

                case 22:
                    yyst[yysp] = 22;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 361:
                    yyn = yys22();
                    continue;

                case 23:
                    yyst[yysp] = 23;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 362:
                    yyn = yys23();
                    continue;

                case 24:
                    yyst[yysp] = 24;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 363:
                    yyn = yys24();
                    continue;

                case 25:
                    yyst[yysp] = 25;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 364:
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
                case 365:
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
                case 366:
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
                case 367:
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
                case 368:
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
                case 369:
                    yyn = yys30();
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
                case 370:
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
                case 371:
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
                case 372:
                    yyn = yys33();
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
                case 373:
                    yyn = yys34();
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
                case 374:
                    yyn = yys35();
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
                case 375:
                    switch (yytok) {
                        case '[':
                            yyn = 125;
                            continue;
                    }
                    yyn = 681;
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
                case 376:
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
                case 377:
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
                case 378:
                    switch (yytok) {
                        case '[':
                            yyn = 132;
                            continue;
                    }
                    yyn = 681;
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
                case 379:
                    switch (yytok) {
                        case '[':
                            yyn = 133;
                            continue;
                    }
                    yyn = 681;
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
                case 380:
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
                case 381:
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
                case 382:
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
                case 383:
                    yyn = yys44();
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
                case 384:
                    yyn = yys45();
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
                case 385:
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
                case 386:
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
                case 387:
                    switch (yytok) {
                        case '[':
                            yyn = 147;
                            continue;
                    }
                    yyn = 681;
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
                case 388:
                    switch (yytok) {
                        case IDENTIFIER:
                            yyn = 148;
                            continue;
                    }
                    yyn = 681;
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
                case 389:
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
                case 390:
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
                case 391:
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
                case 392:
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
                case 393:
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
                case 394:
                    yyn = yys55();
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
                case 395:
                    switch (yytok) {
                        case PROCEDURE_NAME:
                            yyn = 159;
                            continue;
                    }
                    yyn = 681;
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
                case 396:
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
                case 397:
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
                case 398:
                    switch (yytok) {
                        case '[':
                            yyn = 171;
                            continue;
                    }
                    yyn = 681;
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
                case 399:
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
                case 400:
                    yyn = yys61();
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
                case 401:
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
                case 402:
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
                case 403:
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
                case 404:
                    switch (yytok) {
                        case '[':
                            yyn = 179;
                            continue;
                    }
                    yyn = 681;
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
                case 405:
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
                case 406:
                    yyn = yys67();
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
                case 407:
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
                case 408:
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
                case 409:
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
                case 410:
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
                case 411:
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
                case 412:
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
                case 413:
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
                case 414:
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
                case 415:
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
                case 416:
                    yyn = yys77();
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
                case 417:
                    yyn = yys78();
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
                case 418:
                    yyn = yys79();
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
                case 419:
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
                case 420:
                    switch (yytok) {
                        case '[':
                            yyn = 199;
                            continue;
                    }
                    yyn = 681;
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
                case 421:
                    switch (yytok) {
                        case '[':
                            yyn = 200;
                            continue;
                    }
                    yyn = 681;
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
                case 422:
                    switch (yytok) {
                        case IDENTIFIER:
                            yyn = 201;
                            continue;
                    }
                    yyn = 681;
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
                case 423:
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
                case 424:
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
                case 425:
                    yyn = yys86();
                    continue;

                case 87:
                    yyst[yysp] = 87;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 426:
                    yyn = yys87();
                    continue;

                case 88:
                    yyst[yysp] = 88;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 427:
                    switch (yytok) {
                        case FIN:
                            yyn = 207;
                            continue;
                    }
                    yyn = 681;
                    continue;

                case 89:
                    yyst[yysp] = 89;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 428:
                    yyn = yys89();
                    continue;

                case 90:
                    yyst[yysp] = 90;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.getNextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 429:
                    yyn = yys90();
                    continue;

                case 91:
                    yyst[yysp] = 91;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 430:
                    yyn = yys91();
                    continue;

                case 92:
                    yyst[yysp] = 92;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 431:
                    yyn = yys92();
                    continue;

                case 93:
                    yyst[yysp] = 93;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 432:
                    yyn = yys93();
                    continue;

                case 94:
                    yyst[yysp] = 94;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 433:
                    yyn = yys94();
                    continue;

                case 95:
                    yyst[yysp] = 95;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 434:
                    yyn = yys95();
                    continue;

                case 96:
                    yyst[yysp] = 96;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 435:
                    yyn = yys96();
                    continue;

                case 97:
                    yyst[yysp] = 97;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 436:
                    yyn = yys97();
                    continue;

                case 98:
                    yyst[yysp] = 98;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.getNextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 437:
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
                case 438:
                    switch (yytok) {
                        case '[':
                            yyn = 214;
                            continue;
                    }
                    yyn = 681;
                    continue;

                case 100:
                    yyst[yysp] = 100;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.getNextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 439:
                    yyn = yys100();
                    continue;

                case 101:
                    yyst[yysp] = 101;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.getNextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 440:
                    yyn = yys101();
                    continue;

                case 102:
                    yyst[yysp] = 102;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.getNextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 441:
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
                case 442:
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
                case 443:
                    yyn = yys104();
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
                case 444:
                    switch (yytok) {
                        case '[':
                            yyn = 218;
                            continue;
                    }
                    yyn = 681;
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
                case 445:
                    yyn = yys106();
                    continue;

                case 107:
                    yyst[yysp] = 107;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.getNextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 446:
                    yyn = yys107();
                    continue;

                case 108:
                    yyst[yysp] = 108;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.getNextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 447:
                    switch (yytok) {
                        case '[':
                            yyn = 219;
                            continue;
                    }
                    yyn = 681;
                    continue;

                case 109:
                    yyst[yysp] = 109;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.getNextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 448:
                    switch (yytok) {
                        case '[':
                            yyn = 220;
                            continue;
                    }
                    yyn = 681;
                    continue;

                case 110:
                    yyst[yysp] = 110;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.getNextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 449:
                    yyn = yys110();
                    continue;

                case 111:
                    yyst[yysp] = 111;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 450:
                    yyn = yys111();
                    continue;

                case 112:
                    yyst[yysp] = 112;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 451:
                    yyn = yys112();
                    continue;

                case 113:
                    yyst[yysp] = 113;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 452:
                    yyn = yys113();
                    continue;

                case 114:
                    yyst[yysp] = 114;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 453:
                    yyn = yys114();
                    continue;

                case 115:
                    yyst[yysp] = 115;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 454:
                    yyn = yys115();
                    continue;

                case 116:
                    yyst[yysp] = 116;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 455:
                    yyn = yys116();
                    continue;

                case 117:
                    yyst[yysp] = 117;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 456:
                    yyn = yys117();
                    continue;

                case 118:
                    yyst[yysp] = 118;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 457:
                    yyn = yys118();
                    continue;

                case 119:
                    yyst[yysp] = 119;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 458:
                    yyn = yys119();
                    continue;

                case 120:
                    yyst[yysp] = 120;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 459:
                    yyn = yys120();
                    continue;

                case 121:
                    yyst[yysp] = 121;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 460:
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
                case 461:
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
                case 462:
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
                case 463:
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
                case 464:
                    yyn = yys125();
                    continue;

                case 126:
                    yyst[yysp] = 126;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 465:
                    yyn = yys126();
                    continue;

                case 127:
                    yyst[yysp] = 127;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 466:
                    yyn = yys127();
                    continue;

                case 128:
                    yyst[yysp] = 128;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 467:
                    yyn = yys128();
                    continue;

                case 129:
                    yyst[yysp] = 129;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 468:
                    yyn = yys129();
                    continue;

                case 130:
                    yyst[yysp] = 130;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 469:
                    yyn = yys130();
                    continue;

                case 131:
                    yyst[yysp] = 131;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 470:
                    yyn = yys131();
                    continue;

                case 132:
                    yyst[yysp] = 132;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.getNextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 471:
                    yyn = yys132();
                    continue;

                case 133:
                    yyst[yysp] = 133;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.getNextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 472:
                    yyn = yys133();
                    continue;

                case 134:
                    yyst[yysp] = 134;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 473:
                    switch (yytok) {
                        case '*':
                            yyn = 210;
                            continue;
                        case '+':
                            yyn = 211;
                            continue;
                        case '-':
                            yyn = 212;
                            continue;
                        case '[':
                            yyn = 244;
                            continue;
                    }
                    yyn = 681;
                    continue;

                case 135:
                    yyst[yysp] = 135;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 474:
                    yyn = yys135();
                    continue;

                case 136:
                    yyst[yysp] = 136;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 475:
                    yyn = yys136();
                    continue;

                case 137:
                    yyst[yysp] = 137;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 476:
                    yyn = yys137();
                    continue;

                case 138:
                    yyst[yysp] = 138;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 477:
                    yyn = yys138();
                    continue;

                case 139:
                    yyst[yysp] = 139;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 478:
                    yyn = yys139();
                    continue;

                case 140:
                    yyst[yysp] = 140;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 479:
                    yyn = yys140();
                    continue;

                case 141:
                    yyst[yysp] = 141;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 480:
                    yyn = yys141();
                    continue;

                case 142:
                    yyst[yysp] = 142;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 481:
                    yyn = yys142();
                    continue;

                case 143:
                    yyst[yysp] = 143;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 482:
                    yyn = yys143();
                    continue;

                case 144:
                    yyst[yysp] = 144;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 483:
                    yyn = yys144();
                    continue;

                case 145:
                    yyst[yysp] = 145;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 484:
                    yyn = yys145();
                    continue;

                case 146:
                    yyst[yysp] = 146;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 485:
                    yyn = yys146();
                    continue;

                case 147:
                    yyst[yysp] = 147;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.getNextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 486:
                    switch (yytok) {
                        case IDENTIFIER:
                            yyn = 249;
                            continue;
                    }
                    yyn = 681;
                    continue;

                case 148:
                    yyst[yysp] = 148;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.getNextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 487:
                    switch (yytok) {
                        case '=':
                            yyn = 250;
                            continue;
                    }
                    yyn = 681;
                    continue;

                case 149:
                    yyst[yysp] = 149;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 488:
                    yyn = yys149();
                    continue;

                case 150:
                    yyst[yysp] = 150;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 489:
                    yyn = yys150();
                    continue;

                case 151:
                    yyst[yysp] = 151;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 490:
                    yyn = yys151();
                    continue;

                case 152:
                    yyst[yysp] = 152;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 491:
                    yyn = yys152();
                    continue;

                case 153:
                    yyst[yysp] = 153;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 492:
                    yyn = yys153();
                    continue;

                case 154:
                    yyst[yysp] = 154;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 493:
                    yyn = yys154();
                    continue;

                case 155:
                    yyst[yysp] = 155;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 494:
                    yyn = yys155();
                    continue;

                case 156:
                    yyst[yysp] = 156;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 495:
                    yyn = yys156();
                    continue;

                case 157:
                    yyst[yysp] = 157;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 496:
                    yyn = yys157();
                    continue;

                case 158:
                    yyst[yysp] = 158;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 497:
                    yyn = yys158();
                    continue;

                case 159:
                    yyst[yysp] = 159;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.getNextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 498:
                    yyn = yys159();
                    continue;

                case 160:
                    yyst[yysp] = 160;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 499:
                    yyn = yys160();
                    continue;

                case 161:
                    yyst[yysp] = 161;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.getNextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 500:
                    yyn = yys161();
                    continue;

                case 162:
                    yyst[yysp] = 162;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.getNextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 501:
                    yyn = yys162();
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
                case 502:
                    yyn = yys163();
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
                case 503:
                    yyn = yys164();
                    continue;

                case 165:
                    yyst[yysp] = 165;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.getNextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 504:
                    yyn = yys165();
                    continue;

                case 166:
                    yyst[yysp] = 166;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.getNextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 505:
                    yyn = yys166();
                    continue;

                case 167:
                    yyst[yysp] = 167;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.getNextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 506:
                    yyn = yys167();
                    continue;

                case 168:
                    yyst[yysp] = 168;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.getNextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 507:
                    yyn = yys168();
                    continue;

                case 169:
                    yyst[yysp] = 169;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.getNextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 508:
                    yyn = yys169();
                    continue;

                case 170:
                    yyst[yysp] = 170;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 509:
                    yyn = yys170();
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
                case 510:
                    yyn = yys171();
                    continue;

                case 172:
                    yyst[yysp] = 172;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 511:
                    yyn = yys172();
                    continue;

                case 173:
                    yyst[yysp] = 173;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 512:
                    yyn = yys173();
                    continue;

                case 174:
                    yyst[yysp] = 174;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 513:
                    yyn = yys174();
                    continue;

                case 175:
                    yyst[yysp] = 175;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 514:
                    yyn = yys175();
                    continue;

                case 176:
                    yyst[yysp] = 176;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 515:
                    yyn = yys176();
                    continue;

                case 177:
                    yyst[yysp] = 177;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 516:
                    yyn = yys177();
                    continue;

                case 178:
                    yyst[yysp] = 178;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 517:
                    yyn = yys178();
                    continue;

                case 179:
                    yyst[yysp] = 179;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.getNextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 518:
                    yyn = yys179();
                    continue;

                case 180:
                    yyst[yysp] = 180;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 519:
                    yyn = yys180();
                    continue;

                case 181:
                    yyst[yysp] = 181;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 520:
                    yyn = yys181();
                    continue;

                case 182:
                    yyst[yysp] = 182;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 521:
                    yyn = yys182();
                    continue;

                case 183:
                    yyst[yysp] = 183;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 522:
                    yyn = yys183();
                    continue;

                case 184:
                    yyst[yysp] = 184;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 523:
                    yyn = yys184();
                    continue;

                case 185:
                    yyst[yysp] = 185;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 524:
                    yyn = yys185();
                    continue;

                case 186:
                    yyst[yysp] = 186;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 525:
                    yyn = yys186();
                    continue;

                case 187:
                    yyst[yysp] = 187;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 526:
                    yyn = yys187();
                    continue;

                case 188:
                    yyst[yysp] = 188;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 527:
                    switch (yytok) {
                        case '*':
                            yyn = 227;
                            continue;
                        case '+':
                            yyn = 228;
                            continue;
                        case '-':
                            yyn = 229;
                            continue;
                        case '/':
                            yyn = 230;
                            continue;
                    }
                    yyn = 681;
                    continue;

                case 189:
                    yyst[yysp] = 189;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 528:
                    switch (yytok) {
                        case '*':
                            yyn = 210;
                            continue;
                        case '+':
                            yyn = 211;
                            continue;
                        case '-':
                            yyn = 212;
                            continue;
                        case '[':
                            yyn = yyr189();
                            continue;
                    }
                    yyn = 681;
                    continue;

                case 190:
                    yyst[yysp] = 190;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 529:
                    yyn = yys190();
                    continue;

                case 191:
                    yyst[yysp] = 191;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 530:
                    yyn = yys191();
                    continue;

                case 192:
                    yyst[yysp] = 192;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 531:
                    yyn = yys192();
                    continue;

                case 193:
                    yyst[yysp] = 193;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 532:
                    yyn = yys193();
                    continue;

                case 194:
                    yyst[yysp] = 194;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 533:
                    yyn = yys194();
                    continue;

                case 195:
                    yyst[yysp] = 195;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 534:
                    yyn = yys195();
                    continue;

                case 196:
                    yyst[yysp] = 196;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 535:
                    switch (yytok) {
                        case '[':
                            yyn = yyr190();
                            continue;
                    }
                    yyn = 681;
                    continue;

                case 197:
                    yyst[yysp] = 197;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 536:
                    yyn = yys197();
                    continue;

                case 198:
                    yyst[yysp] = 198;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 537:
                    yyn = yys198();
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
                case 538:
                    yyn = yys199();
                    continue;

                case 200:
                    yyst[yysp] = 200;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.getNextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 539:
                    yyn = yys200();
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
                case 540:
                    yyn = yys201();
                    continue;

                case 202:
                    yyst[yysp] = 202;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 541:
                    yyn = yys202();
                    continue;

                case 203:
                    yyst[yysp] = 203;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 542:
                    switch (yytok) {
                        case ENDINPUT:
                            yyn = yyr2();
                            continue;
                    }
                    yyn = 681;
                    continue;

                case 204:
                    yyst[yysp] = 204;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 543:
                    switch (yytok) {
                        case ']':
                            yyn = 279;
                            continue;
                    }
                    yyn = 681;
                    continue;

                case 205:
                    yyst[yysp] = 205;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 544:
                    yyn = yys205();
                    continue;

                case 206:
                    yyst[yysp] = 206;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 545:
                    switch (yytok) {
                        case FIN:
                            yyn = yyr26();
                            continue;
                    }
                    yyn = 681;
                    continue;

                case 207:
                    yyst[yysp] = 207;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.getNextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 546:
                    yyn = yys207();
                    continue;

                case 208:
                    yyst[yysp] = 208;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 547:
                    switch (yytok) {
                        case FIN:
                            yyn = 281;
                            continue;
                    }
                    yyn = 681;
                    continue;

                case 209:
                    yyst[yysp] = 209;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 548:
                    yyn = yys209();
                    continue;

                case 210:
                    yyst[yysp] = 210;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.getNextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 549:
                    yyn = yys210();
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
                case 550:
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
                case 551:
                    yyn = yys212();
                    continue;

                case 213:
                    yyst[yysp] = 213;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 552:
                    yyn = yys213();
                    continue;

                case 214:
                    yyst[yysp] = 214;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.getNextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 553:
                    yyn = yys214();
                    continue;

                case 215:
                    yyst[yysp] = 215;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 554:
                    switch (yytok) {
                        case '*':
                            yyn = 210;
                            continue;
                        case '+':
                            yyn = 211;
                            continue;
                        case '-':
                            yyn = 212;
                            continue;
                        case '[':
                            yyn = 285;
                            continue;
                    }
                    yyn = 681;
                    continue;

                case 216:
                    yyst[yysp] = 216;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 555:
                    yyn = yys216();
                    continue;

                case 217:
                    yyst[yysp] = 217;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 556:
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
                case 557:
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
                case 558:
                    yyn = yys219();
                    continue;

                case 220:
                    yyst[yysp] = 220;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.getNextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 559:
                    yyn = yys220();
                    continue;

                case 221:
                    yyst[yysp] = 221;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 560:
                    switch (yytok) {
                        case ')':
                            yyn = 287;
                            continue;
                        case '/':
                        case '-':
                        case '+':
                        case '*':
                            yyn = yyr33();
                            continue;
                    }
                    yyn = 681;
                    continue;

                case 222:
                    yyst[yysp] = 222;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 561:
                    switch (yytok) {
                        case '*':
                            yyn = 210;
                            continue;
                        case '+':
                            yyn = 211;
                            continue;
                        case '-':
                            yyn = 212;
                            continue;
                    }
                    yyn = 681;
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
                case 562:
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
                case 563:
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
                case 564:
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
                case 565:
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
                case 566:
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
                case 567:
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
                case 568:
                    yyn = yys229();
                    continue;

                case 230:
                    yyst[yysp] = 230;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.getNextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 569:
                    yyn = yys230();
                    continue;

                case 231:
                    yyst[yysp] = 231;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 570:
                    switch (yytok) {
                        case ')':
                            yyn = 304;
                            continue;
                        case '/':
                        case '-':
                        case '+':
                        case '*':
                            yyn = yyr41();
                            continue;
                    }
                    yyn = 681;
                    continue;

                case 232:
                    yyst[yysp] = 232;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 571:
                    switch (yytok) {
                        case '*':
                            yyn = 223;
                            continue;
                        case '+':
                            yyn = 224;
                            continue;
                        case '-':
                            yyn = 225;
                            continue;
                        case '/':
                            yyn = 226;
                            continue;
                    }
                    yyn = 681;
                    continue;

                case 233:
                    yyst[yysp] = 233;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 572:
                    switch (yytok) {
                        case ']':
                            yyn = 305;
                            continue;
                    }
                    yyn = 681;
                    continue;

                case 234:
                    yyst[yysp] = 234;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 573:
                    switch (yytok) {
                        case ']':
                            yyn = 306;
                            continue;
                    }
                    yyn = 681;
                    continue;

                case 235:
                    yyst[yysp] = 235;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 574:
                    yyn = yys235();
                    continue;

                case 236:
                    yyst[yysp] = 236;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 575:
                    yyn = yys236();
                    continue;

                case 237:
                    yyst[yysp] = 237;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 576:
                    yyn = yys237();
                    continue;

                case 238:
                    yyst[yysp] = 238;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 577:
                    yyn = yys238();
                    continue;

                case 239:
                    yyst[yysp] = 239;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 578:
                    yyn = yys239();
                    continue;

                case 240:
                    yyst[yysp] = 240;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 579:
                    yyn = yys240();
                    continue;

                case 241:
                    yyst[yysp] = 241;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 580:
                    switch (yytok) {
                        case ']':
                            yyn = 307;
                            continue;
                    }
                    yyn = 681;
                    continue;

                case 242:
                    yyst[yysp] = 242;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 581:
                    switch (yytok) {
                        case ']':
                            yyn = 308;
                            continue;
                    }
                    yyn = 681;
                    continue;

                case 243:
                    yyst[yysp] = 243;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 582:
                    switch (yytok) {
                        case ']':
                            yyn = 309;
                            continue;
                    }
                    yyn = 681;
                    continue;

                case 244:
                    yyst[yysp] = 244;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.getNextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 583:
                    yyn = yys244();
                    continue;

                case 245:
                    yyst[yysp] = 245;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 584:
                    yyn = yys245();
                    continue;

                case 246:
                    yyst[yysp] = 246;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 585:
                    yyn = yys246();
                    continue;

                case 247:
                    yyst[yysp] = 247;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 586:
                    yyn = yys247();
                    continue;

                case 248:
                    yyst[yysp] = 248;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 587:
                    yyn = yys248();
                    continue;

                case 249:
                    yyst[yysp] = 249;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.getNextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 588:
                    yyn = yys249();
                    continue;

                case 250:
                    yyst[yysp] = 250;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.getNextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 589:
                    yyn = yys250();
                    continue;

                case 251:
                    yyst[yysp] = 251;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 590:
                    yyn = yys251();
                    continue;

                case 252:
                    yyst[yysp] = 252;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 591:
                    yyn = yys252();
                    continue;

                case 253:
                    yyst[yysp] = 253;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 592:
                    yyn = yys253();
                    continue;

                case 254:
                    yyst[yysp] = 254;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 593:
                    yyn = yys254();
                    continue;

                case 255:
                    yyst[yysp] = 255;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 594:
                    yyn = yys255();
                    continue;

                case 256:
                    yyst[yysp] = 256;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 595:
                    yyn = yys256();
                    continue;

                case 257:
                    yyst[yysp] = 257;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 596:
                    yyn = yys257();
                    continue;

                case 258:
                    yyst[yysp] = 258;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 597:
                    yyn = yys258();
                    continue;

                case 259:
                    yyst[yysp] = 259;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.getNextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 598:
                    yyn = yys259();
                    continue;

                case 260:
                    yyst[yysp] = 260;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.getNextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 599:
                    yyn = yys260();
                    continue;

                case 261:
                    yyst[yysp] = 261;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.getNextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 600:
                    yyn = yys261();
                    continue;

                case 262:
                    yyst[yysp] = 262;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.getNextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 601:
                    yyn = yys262();
                    continue;

                case 263:
                    yyst[yysp] = 263;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 602:
                    yyn = yys263();
                    continue;

                case 264:
                    yyst[yysp] = 264;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 603:
                    yyn = yys264();
                    continue;

                case 265:
                    yyst[yysp] = 265;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 604:
                    yyn = yys265();
                    continue;

                case 266:
                    yyst[yysp] = 266;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 605:
                    yyn = yys266();
                    continue;

                case 267:
                    yyst[yysp] = 267;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 606:
                    yyn = yys267();
                    continue;

                case 268:
                    yyst[yysp] = 268;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 607:
                    yyn = yys268();
                    continue;

                case 269:
                    yyst[yysp] = 269;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 608:
                    yyn = yys269();
                    continue;

                case 270:
                    yyst[yysp] = 270;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 609:
                    switch (yytok) {
                        case ']':
                            yyn = 326;
                            continue;
                    }
                    yyn = 681;
                    continue;

                case 271:
                    yyst[yysp] = 271;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 610:
                    switch (yytok) {
                        case ']':
                            yyn = 327;
                            continue;
                    }
                    yyn = 681;
                    continue;

                case 272:
                    yyst[yysp] = 272;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 611:
                    yyn = yys272();
                    continue;

                case 273:
                    yyst[yysp] = 273;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 612:
                    switch (yytok) {
                        case ']':
                            yyn = 328;
                            continue;
                    }
                    yyn = 681;
                    continue;

                case 274:
                    yyst[yysp] = 274;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 613:
                    switch (yytok) {
                        case ']':
                            yyn = 329;
                            continue;
                    }
                    yyn = 681;
                    continue;

                case 275:
                    yyst[yysp] = 275;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 614:
                    switch (yytok) {
                        case ']':
                            yyn = 330;
                            continue;
                    }
                    yyn = 681;
                    continue;

                case 276:
                    yyst[yysp] = 276;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 615:
                    switch (yytok) {
                        case ']':
                            yyn = 331;
                            continue;
                    }
                    yyn = 681;
                    continue;

                case 277:
                    yyst[yysp] = 277;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.getNextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 616:
                    yyn = yys277();
                    continue;

                case 278:
                    yyst[yysp] = 278;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 617:
                    yyn = yys278();
                    continue;

                case 279:
                    yyst[yysp] = 279;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.getNextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 618:
                    yyn = yys279();
                    continue;

                case 280:
                    yyst[yysp] = 280;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 619:
                    switch (yytok) {
                        case ']':
                            yyn = yyr168();
                            continue;
                    }
                    yyn = 681;
                    continue;

                case 281:
                    yyst[yysp] = 281;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.getNextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 620:
                    yyn = yys281();
                    continue;

                case 282:
                    yyst[yysp] = 282;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 621:
                    yyn = yys282();
                    continue;

                case 283:
                    yyst[yysp] = 283;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 622:
                    yyn = yys283();
                    continue;

                case 284:
                    yyst[yysp] = 284;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 623:
                    yyn = yys284();
                    continue;

                case 285:
                    yyst[yysp] = 285;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.getNextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 624:
                    yyn = yys285();
                    continue;

                case 286:
                    yyst[yysp] = 286;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 625:
                    yyn = yys286();
                    continue;

                case 287:
                    yyst[yysp] = 287;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.getNextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 626:
                    yyn = yys287();
                    continue;

                case 288:
                    yyst[yysp] = 288;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 627:
                    yyn = yys288();
                    continue;

                case 289:
                    yyst[yysp] = 289;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 628:
                    yyn = yys289();
                    continue;

                case 290:
                    yyst[yysp] = 290;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 629:
                    yyn = yys290();
                    continue;

                case 291:
                    yyst[yysp] = 291;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 630:
                    yyn = yys291();
                    continue;

                case 292:
                    yyst[yysp] = 292;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 631:
                    yyn = yys292();
                    continue;

                case 293:
                    yyst[yysp] = 293;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 632:
                    yyn = yys293();
                    continue;

                case 294:
                    yyst[yysp] = 294;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 633:
                    yyn = yys294();
                    continue;

                case 295:
                    yyst[yysp] = 295;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 634:
                    yyn = yys295();
                    continue;

                case 296:
                    yyst[yysp] = 296;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 635:
                    yyn = yys296();
                    continue;

                case 297:
                    yyst[yysp] = 297;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 636:
                    yyn = yys297();
                    continue;

                case 298:
                    yyst[yysp] = 298;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 637:
                    yyn = yys298();
                    continue;

                case 299:
                    yyst[yysp] = 299;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 638:
                    yyn = yys299();
                    continue;

                case 300:
                    yyst[yysp] = 300;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 639:
                    yyn = yys300();
                    continue;

                case 301:
                    yyst[yysp] = 301;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 640:
                    yyn = yys301();
                    continue;

                case 302:
                    yyst[yysp] = 302;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 641:
                    yyn = yys302();
                    continue;

                case 303:
                    yyst[yysp] = 303;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 642:
                    yyn = yys303();
                    continue;

                case 304:
                    yyst[yysp] = 304;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.getNextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 643:
                    yyn = yys304();
                    continue;

                case 305:
                    yyst[yysp] = 305;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.getNextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 644:
                    yyn = yys305();
                    continue;

                case 306:
                    yyst[yysp] = 306;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.getNextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 645:
                    yyn = yys306();
                    continue;

                case 307:
                    yyst[yysp] = 307;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.getNextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 646:
                    yyn = yys307();
                    continue;

                case 308:
                    yyst[yysp] = 308;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.getNextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 647:
                    yyn = yys308();
                    continue;

                case 309:
                    yyst[yysp] = 309;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.getNextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 648:
                    yyn = yys309();
                    continue;

                case 310:
                    yyst[yysp] = 310;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 649:
                    switch (yytok) {
                        case ']':
                            yyn = 334;
                            continue;
                    }
                    yyn = 681;
                    continue;

                case 311:
                    yyst[yysp] = 311;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 650:
                    switch (yytok) {
                        case ']':
                            yyn = 335;
                            continue;
                    }
                    yyn = 681;
                    continue;

                case 312:
                    yyst[yysp] = 312;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 651:
                    switch (yytok) {
                        case '*':
                            yyn = 223;
                            continue;
                        case '+':
                            yyn = 224;
                            continue;
                        case '-':
                            yyn = 225;
                            continue;
                        case '/':
                            yyn = 226;
                            continue;
                        case ']':
                            yyn = 336;
                            continue;
                    }
                    yyn = 681;
                    continue;

                case 313:
                    yyst[yysp] = 313;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 652:
                    switch (yytok) {
                        case '*':
                            yyn = 227;
                            continue;
                        case '+':
                            yyn = 228;
                            continue;
                        case '-':
                            yyn = 229;
                            continue;
                        case '/':
                            yyn = 230;
                            continue;
                        case ']':
                            yyn = 337;
                            continue;
                    }
                    yyn = 681;
                    continue;

                case 314:
                    yyst[yysp] = 314;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.getNextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 653:
                    yyn = yys314();
                    continue;

                case 315:
                    yyst[yysp] = 315;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 654:
                    yyn = yys315();
                    continue;

                case 316:
                    yyst[yysp] = 316;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 655:
                    yyn = yys316();
                    continue;

                case 317:
                    yyst[yysp] = 317;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 656:
                    yyn = yys317();
                    continue;

                case 318:
                    yyst[yysp] = 318;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 657:
                    yyn = yys318();
                    continue;

                case 319:
                    yyst[yysp] = 319;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 658:
                    yyn = yys319();
                    continue;

                case 320:
                    yyst[yysp] = 320;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 659:
                    yyn = yys320();
                    continue;

                case 321:
                    yyst[yysp] = 321;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 660:
                    yyn = yys321();
                    continue;

                case 322:
                    yyst[yysp] = 322;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 661:
                    yyn = yys322();
                    continue;

                case 323:
                    yyst[yysp] = 323;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 662:
                    yyn = yys323();
                    continue;

                case 324:
                    yyst[yysp] = 324;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 663:
                    yyn = yys324();
                    continue;

                case 325:
                    yyst[yysp] = 325;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 664:
                    switch (yytok) {
                        case '*':
                            yyn = 210;
                            continue;
                        case '+':
                            yyn = 211;
                            continue;
                        case '-':
                            yyn = 212;
                            continue;
                        case ']':
                            yyn = 338;
                            continue;
                    }
                    yyn = 681;
                    continue;

                case 326:
                    yyst[yysp] = 326;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.getNextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 665:
                    yyn = yys326();
                    continue;

                case 327:
                    yyst[yysp] = 327;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.getNextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 666:
                    yyn = yys327();
                    continue;

                case 328:
                    yyst[yysp] = 328;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.getNextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 667:
                    yyn = yys328();
                    continue;

                case 329:
                    yyst[yysp] = 329;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.getNextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 668:
                    yyn = yys329();
                    continue;

                case 330:
                    yyst[yysp] = 330;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.getNextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 669:
                    yyn = yys330();
                    continue;

                case 331:
                    yyst[yysp] = 331;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.getNextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 670:
                    yyn = yys331();
                    continue;

                case 332:
                    yyst[yysp] = 332;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 671:
                    yyn = yys332();
                    continue;

                case 333:
                    yyst[yysp] = 333;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 672:
                    yyn = yys333();
                    continue;

                case 334:
                    yyst[yysp] = 334;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.getNextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 673:
                    yyn = yys334();
                    continue;

                case 335:
                    yyst[yysp] = 335;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.getNextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 674:
                    yyn = yys335();
                    continue;

                case 336:
                    yyst[yysp] = 336;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.getNextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 675:
                    yyn = yys336();
                    continue;

                case 337:
                    yyst[yysp] = 337;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.getNextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 676:
                    yyn = yys337();
                    continue;

                case 338:
                    yyst[yysp] = 338;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.getNextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 677:
                    yyn = yys338();
                    continue;

                case 678:
                    return true;
                case 679:
                    yyerror("stack overflow");
                case 680:
                    return false;
                case 681:
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
                return 26;
            case AT:
                return 27;
            case AV:
                return 28;
            case AVANZA:
                return 29;
            case AZAR:
                return 30;
            case BAJALAPIZ:
                return 31;
            case BL:
                return 32;
            case BORRAPANTALLA:
                return 33;
            case CENTRO:
                return 34;
            case COS:
                return 35;
            case CUENTA:
                return 36;
            case DIFERENCIA:
                return 37;
            case DIVISION:
                return 38;
            case EJECUTA:
                return 39;
            case ELEGIR:
                return 40;
            case ELEMENTO:
                return 41;
            case ESPERA:
                return 42;
            case GD:
                return 43;
            case GI:
                return 44;
            case GIRADERECHA:
                return 45;
            case GIRAIZQUIERDA:
                return 46;
            case IGUALES:
                return 47;
            case INC:
                return 48;
            case INIC:
                return 49;
            case MAYORQUE:
                return 50;
            case MENORQUE:
                return 51;
            case MENOS:
                return 52;
            case O:
                return 53;
            case OCULTATORTUGA:
                return 54;
            case OT:
                return 55;
            case PARA:
                return 56;
            case PONCL:
                return 57;
            case PONCOLORLAPIZ:
                return 58;
            case PONPOS:
                return 59;
            case PONRUMBO:
                return 60;
            case PONX:
                return 61;
            case PONXY:
                return 62;
            case PONY:
                return 63;
            case POTENCIA:
                return 64;
            case PRIMERO:
                return 65;
            case PRODUCTO:
                return 66;
            case RAIZCUADRADA:
                return 67;
            case RC:
                return 68;
            case RE:
                return 69;
            case REDONDEA:
                return 70;
            case REPITE:
                return 71;
            case RESTO:
                return 72;
            case RETROCEDE:
                return 73;
            case RUMBO:
                return 74;
            case SB:
                return 75;
            case SEN:
                return 76;
            case SENO:
                return 77;
            case SI:
                return 78;
            case SUBELAPIZ:
                return 79;
            case SUMA:
                return 80;
            case UL:
                return 81;
            case ULTIMO:
                return 82;
            case VAR:
                return 83;
            case Y:
                return 84;
        }
        return 681;
    }

    private int yys2() {
        switch (yytok) {
            case ROJO:
            case '*':
            case '[':
            case GRIS:
            case VERDE:
            case '/':
            case '(':
            case MARRON:
            case AZUL:
            case PROCEDURE_NAME:
            case BLANCO:
            case error:
            case '>':
            case PARAMETER:
            case '=':
            case ')':
            case '+':
            case '<':
            case ENDINPUT:
            case IDENTIFIER:
            case CIAN:
            case FLOAT:
            case AMARILLO:
            case INTEGER:
            case '-':
            case NEGRO:
                return 681;
        }
        return yyr4();
    }

    private int yys4() {
        switch (yytok) {
            case ROJO:
            case '*':
            case '[':
            case GRIS:
            case VERDE:
            case '/':
            case '(':
            case MARRON:
            case AZUL:
            case PROCEDURE_NAME:
            case BLANCO:
            case error:
            case '>':
            case PARAMETER:
            case '=':
            case ')':
            case '+':
            case '<':
            case ENDINPUT:
            case IDENTIFIER:
            case CIAN:
            case FLOAT:
            case AMARILLO:
            case INTEGER:
            case '-':
            case NEGRO:
                return 681;
        }
        return yyr11();
    }

    private int yys5() {
        switch (yytok) {
            case ROJO:
            case '*':
            case '[':
            case GRIS:
            case VERDE:
            case '/':
            case '(':
            case MARRON:
            case AZUL:
            case PROCEDURE_NAME:
            case BLANCO:
            case error:
            case '>':
            case PARAMETER:
            case '=':
            case ')':
            case '+':
            case '<':
            case ENDINPUT:
            case IDENTIFIER:
            case CIAN:
            case FLOAT:
            case AMARILLO:
            case INTEGER:
            case '-':
            case NEGRO:
                return 681;
        }
        return yyr12();
    }

    private int yys6() {
        switch (yytok) {
            case ROJO:
            case '*':
            case '[':
            case GRIS:
            case VERDE:
            case '/':
            case '(':
            case MARRON:
            case AZUL:
            case PROCEDURE_NAME:
            case BLANCO:
            case error:
            case '>':
            case PARAMETER:
            case '=':
            case ')':
            case '+':
            case '<':
            case ENDINPUT:
            case IDENTIFIER:
            case CIAN:
            case FLOAT:
            case AMARILLO:
            case INTEGER:
            case '-':
            case NEGRO:
                return 681;
        }
        return yyr13();
    }

    private int yys7() {
        switch (yytok) {
            case ROJO:
            case '*':
            case '[':
            case GRIS:
            case VERDE:
            case '/':
            case '(':
            case MARRON:
            case AZUL:
            case PROCEDURE_NAME:
            case BLANCO:
            case error:
            case '>':
            case PARAMETER:
            case '=':
            case ')':
            case '+':
            case '<':
            case ENDINPUT:
            case IDENTIFIER:
            case CIAN:
            case FLOAT:
            case AMARILLO:
            case INTEGER:
            case '-':
            case NEGRO:
                return 681;
        }
        return yyr15();
    }

    private int yys8() {
        switch (yytok) {
            case ROJO:
            case '*':
            case '[':
            case GRIS:
            case VERDE:
            case '/':
            case '(':
            case MARRON:
            case AZUL:
            case PROCEDURE_NAME:
            case BLANCO:
            case error:
            case '>':
            case PARAMETER:
            case '=':
            case ')':
            case '+':
            case '<':
            case ENDINPUT:
            case IDENTIFIER:
            case CIAN:
            case FLOAT:
            case AMARILLO:
            case INTEGER:
            case '-':
            case NEGRO:
                return 681;
        }
        return yyr16();
    }

    private int yys9() {
        switch (yytok) {
            case ROJO:
            case '*':
            case '[':
            case GRIS:
            case VERDE:
            case '/':
            case '(':
            case MARRON:
            case AZUL:
            case PROCEDURE_NAME:
            case BLANCO:
            case error:
            case '>':
            case PARAMETER:
            case '=':
            case ')':
            case '+':
            case '<':
            case ENDINPUT:
            case IDENTIFIER:
            case CIAN:
            case FLOAT:
            case AMARILLO:
            case INTEGER:
            case '-':
            case NEGRO:
                return 681;
        }
        return yyr14();
    }

    private int yys10() {
        switch (yytok) {
            case ROJO:
            case '*':
            case '[':
            case GRIS:
            case VERDE:
            case '/':
            case '(':
            case MARRON:
            case AZUL:
            case PROCEDURE_NAME:
            case BLANCO:
            case error:
            case '>':
            case PARAMETER:
            case '=':
            case ')':
            case '+':
            case '<':
            case ENDINPUT:
            case IDENTIFIER:
            case CIAN:
            case FLOAT:
            case AMARILLO:
            case INTEGER:
            case '-':
            case NEGRO:
                return 681;
        }
        return yyr6();
    }

    private int yys11() {
        switch (yytok) {
            case ROJO:
            case '*':
            case '[':
            case GRIS:
            case VERDE:
            case '/':
            case '(':
            case MARRON:
            case AZUL:
            case PROCEDURE_NAME:
            case BLANCO:
            case error:
            case '>':
            case PARAMETER:
            case '=':
            case ')':
            case '+':
            case '<':
            case ENDINPUT:
            case IDENTIFIER:
            case CIAN:
            case FLOAT:
            case AMARILLO:
            case INTEGER:
            case '-':
            case NEGRO:
                return 681;
        }
        return yyr7();
    }

    private int yys12() {
        switch (yytok) {
            case ROJO:
            case '*':
            case '[':
            case GRIS:
            case VERDE:
            case '/':
            case '(':
            case MARRON:
            case AZUL:
            case PROCEDURE_NAME:
            case BLANCO:
            case error:
            case '>':
            case PARAMETER:
            case '=':
            case ')':
            case '+':
            case '<':
            case ENDINPUT:
            case IDENTIFIER:
            case CIAN:
            case FLOAT:
            case AMARILLO:
            case INTEGER:
            case '-':
            case NEGRO:
                return 681;
        }
        return yyr9();
    }

    private int yys13() {
        switch (yytok) {
            case ROJO:
            case '*':
            case '[':
            case GRIS:
            case VERDE:
            case '/':
            case '(':
            case MARRON:
            case AZUL:
            case PROCEDURE_NAME:
            case BLANCO:
            case error:
            case '>':
            case PARAMETER:
            case '=':
            case ')':
            case '+':
            case '<':
            case ENDINPUT:
            case IDENTIFIER:
            case CIAN:
            case FLOAT:
            case AMARILLO:
            case INTEGER:
            case '-':
            case NEGRO:
                return 681;
        }
        return yyr10();
    }

    private int yys14() {
        switch (yytok) {
            case ROJO:
            case '*':
            case '[':
            case GRIS:
            case VERDE:
            case '/':
            case '(':
            case MARRON:
            case AZUL:
            case PROCEDURE_NAME:
            case BLANCO:
            case error:
            case '>':
            case PARAMETER:
            case '=':
            case ')':
            case '+':
            case '<':
            case ENDINPUT:
            case IDENTIFIER:
            case CIAN:
            case FLOAT:
            case AMARILLO:
            case INTEGER:
            case '-':
            case NEGRO:
                return 681;
        }
        return yyr8();
    }

    private int yys17() {
        switch (yytok) {
            case ROJO:
            case '*':
            case '[':
            case GRIS:
            case VERDE:
            case '/':
            case '(':
            case MARRON:
            case AZUL:
            case PROCEDURE_NAME:
            case BLANCO:
            case error:
            case '>':
            case PARAMETER:
            case '=':
            case ')':
            case '+':
            case '<':
            case ENDINPUT:
            case IDENTIFIER:
            case CIAN:
            case FLOAT:
            case AMARILLO:
            case INTEGER:
            case '-':
            case NEGRO:
                return 681;
        }
        return yyr17();
    }

    private int yys18() {
        switch (yytok) {
            case ROJO:
            case '*':
            case '[':
            case GRIS:
            case VERDE:
            case '/':
            case '(':
            case MARRON:
            case AZUL:
            case PROCEDURE_NAME:
            case BLANCO:
            case error:
            case '>':
            case PARAMETER:
            case '=':
            case ')':
            case '+':
            case '<':
            case ENDINPUT:
            case IDENTIFIER:
            case CIAN:
            case FLOAT:
            case AMARILLO:
            case INTEGER:
            case '-':
            case NEGRO:
                return 681;
        }
        return yyr5();
    }

    private int yys19() {
        switch (yytok) {
            case ROJO:
            case '*':
            case '[':
            case GRIS:
            case VERDE:
            case '/':
            case '(':
            case MARRON:
            case AZUL:
            case PROCEDURE_NAME:
            case BLANCO:
            case error:
            case '>':
            case PARAMETER:
            case '=':
            case ')':
            case '+':
            case '<':
            case ENDINPUT:
            case IDENTIFIER:
            case CIAN:
            case FLOAT:
            case AMARILLO:
            case INTEGER:
            case '-':
            case NEGRO:
                return 681;
        }
        return yyr23();
    }

    private int yys20() {
        switch (yytok) {
            case APARECETORTUGA:
                return 26;
            case AT:
                return 27;
            case AV:
                return 28;
            case AVANZA:
                return 29;
            case AZAR:
                return 30;
            case BAJALAPIZ:
                return 31;
            case BL:
                return 32;
            case BORRAPANTALLA:
                return 33;
            case CENTRO:
                return 34;
            case COS:
                return 35;
            case CUENTA:
                return 36;
            case DIFERENCIA:
                return 37;
            case DIVISION:
                return 38;
            case EJECUTA:
                return 39;
            case ELEGIR:
                return 40;
            case ELEMENTO:
                return 41;
            case ESPERA:
                return 42;
            case GD:
                return 43;
            case GI:
                return 44;
            case GIRADERECHA:
                return 45;
            case GIRAIZQUIERDA:
                return 46;
            case IGUALES:
                return 47;
            case INC:
                return 48;
            case INIC:
                return 49;
            case MAYORQUE:
                return 50;
            case MENORQUE:
                return 51;
            case MENOS:
                return 52;
            case O:
                return 53;
            case OCULTATORTUGA:
                return 54;
            case OT:
                return 55;
            case PARA:
                return 56;
            case PONCL:
                return 57;
            case PONCOLORLAPIZ:
                return 58;
            case PONPOS:
                return 59;
            case PONRUMBO:
                return 60;
            case PONX:
                return 61;
            case PONXY:
                return 62;
            case PONY:
                return 63;
            case POTENCIA:
                return 64;
            case PRIMERO:
                return 65;
            case PRODUCTO:
                return 66;
            case RAIZCUADRADA:
                return 67;
            case RC:
                return 68;
            case RE:
                return 69;
            case REDONDEA:
                return 70;
            case REPITE:
                return 71;
            case RESTO:
                return 72;
            case RETROCEDE:
                return 73;
            case RUMBO:
                return 74;
            case SB:
                return 75;
            case SEN:
                return 76;
            case SENO:
                return 77;
            case SI:
                return 78;
            case SUBELAPIZ:
                return 79;
            case SUMA:
                return 80;
            case UL:
                return 81;
            case ULTIMO:
                return 82;
            case VAR:
                return 83;
            case Y:
                return 84;
            case PARAMETER:
                return 90;
        }
        return 681;
    }

    private int yys21() {
        switch (yytok) {
            case ROJO:
            case '*':
            case '[':
            case GRIS:
            case VERDE:
            case '/':
            case '(':
            case MARRON:
            case AZUL:
            case PROCEDURE_NAME:
            case BLANCO:
            case error:
            case '>':
            case PARAMETER:
            case '=':
            case ')':
            case '+':
            case '<':
            case ENDINPUT:
            case IDENTIFIER:
            case CIAN:
            case FLOAT:
            case AMARILLO:
            case INTEGER:
            case '-':
            case NEGRO:
                return 681;
        }
        return yyr18();
    }

    private int yys22() {
        switch (yytok) {
            case ROJO:
            case '*':
            case '[':
            case GRIS:
            case VERDE:
            case '/':
            case '(':
            case MARRON:
            case AZUL:
            case PROCEDURE_NAME:
            case BLANCO:
            case error:
            case '>':
            case PARAMETER:
            case '=':
            case ')':
            case '+':
            case '<':
            case ENDINPUT:
            case IDENTIFIER:
            case CIAN:
            case FLOAT:
            case AMARILLO:
            case INTEGER:
            case '-':
            case NEGRO:
                return 681;
        }
        return yyr19();
    }

    private int yys23() {
        switch (yytok) {
            case ROJO:
            case '*':
            case '[':
            case GRIS:
            case VERDE:
            case '/':
            case '(':
            case MARRON:
            case AZUL:
            case PROCEDURE_NAME:
            case BLANCO:
            case error:
            case '>':
            case PARAMETER:
            case '=':
            case ')':
            case '+':
            case '<':
            case ENDINPUT:
            case IDENTIFIER:
            case CIAN:
            case FLOAT:
            case AMARILLO:
            case INTEGER:
            case '-':
            case NEGRO:
                return 681;
        }
        return yyr20();
    }

    private int yys24() {
        switch (yytok) {
            case ROJO:
            case '*':
            case '[':
            case GRIS:
            case VERDE:
            case '/':
            case '(':
            case MARRON:
            case AZUL:
            case PROCEDURE_NAME:
            case BLANCO:
            case error:
            case '>':
            case PARAMETER:
            case '=':
            case ')':
            case '+':
            case '<':
            case ENDINPUT:
            case IDENTIFIER:
            case CIAN:
            case FLOAT:
            case AMARILLO:
            case INTEGER:
            case '-':
            case NEGRO:
                return 681;
        }
        return yyr22();
    }

    private int yys25() {
        switch (yytok) {
            case ROJO:
            case '*':
            case '[':
            case GRIS:
            case VERDE:
            case '/':
            case '(':
            case MARRON:
            case AZUL:
            case PROCEDURE_NAME:
            case BLANCO:
            case error:
            case '>':
            case PARAMETER:
            case '=':
            case ')':
            case '+':
            case '<':
            case ENDINPUT:
            case IDENTIFIER:
            case CIAN:
            case FLOAT:
            case AMARILLO:
            case INTEGER:
            case '-':
            case NEGRO:
                return 681;
        }
        return yyr21();
    }

    private int yys26() {
        switch (yytok) {
            case ROJO:
            case '*':
            case '[':
            case GRIS:
            case VERDE:
            case '/':
            case '(':
            case MARRON:
            case AZUL:
            case PROCEDURE_NAME:
            case BLANCO:
            case error:
            case '>':
            case PARAMETER:
            case '=':
            case ')':
            case '+':
            case '<':
            case ENDINPUT:
            case IDENTIFIER:
            case CIAN:
            case FLOAT:
            case AMARILLO:
            case INTEGER:
            case '-':
            case NEGRO:
                return 681;
        }
        return yyr92();
    }

    private int yys27() {
        switch (yytok) {
            case ROJO:
            case '*':
            case '[':
            case GRIS:
            case VERDE:
            case '/':
            case '(':
            case MARRON:
            case AZUL:
            case PROCEDURE_NAME:
            case BLANCO:
            case error:
            case '>':
            case PARAMETER:
            case '=':
            case ')':
            case '+':
            case '<':
            case ENDINPUT:
            case IDENTIFIER:
            case CIAN:
            case FLOAT:
            case AMARILLO:
            case INTEGER:
            case '-':
            case NEGRO:
                return 681;
        }
        return yyr93();
    }

    private int yys28() {
        switch (yytok) {
            case AZAR:
                return 30;
            case CUENTA:
                return 36;
            case REDONDEA:
                return 70;
            case RESTO:
                return 72;
            case DIFERENCIA:
                return 98;
            case ELEGIR:
                return 99;
            case ELEMENTO:
                return 100;
            case IDENTIFIER:
                return 101;
            case INTEGER:
                return 102;
            case MENOS:
                return 103;
            case POTENCIA:
                return 104;
            case PRIMERO:
                return 105;
            case PRODUCTO:
                return 106;
            case SUMA:
                return 107;
            case UL:
                return 108;
            case ULTIMO:
                return 109;
            case '(':
                return 110;
        }
        return 681;
    }

    private int yys29() {
        switch (yytok) {
            case AZAR:
                return 30;
            case CUENTA:
                return 36;
            case REDONDEA:
                return 70;
            case RESTO:
                return 72;
            case DIFERENCIA:
                return 98;
            case ELEGIR:
                return 99;
            case ELEMENTO:
                return 100;
            case IDENTIFIER:
                return 101;
            case INTEGER:
                return 102;
            case MENOS:
                return 103;
            case POTENCIA:
                return 104;
            case PRIMERO:
                return 105;
            case PRODUCTO:
                return 106;
            case SUMA:
                return 107;
            case UL:
                return 108;
            case ULTIMO:
                return 109;
            case '(':
                return 110;
        }
        return 681;
    }

    private int yys30() {
        switch (yytok) {
            case AZAR:
                return 30;
            case CUENTA:
                return 36;
            case REDONDEA:
                return 70;
            case RESTO:
                return 72;
            case DIFERENCIA:
                return 98;
            case ELEGIR:
                return 99;
            case ELEMENTO:
                return 100;
            case IDENTIFIER:
                return 101;
            case INTEGER:
                return 102;
            case MENOS:
                return 103;
            case POTENCIA:
                return 104;
            case PRIMERO:
                return 105;
            case PRODUCTO:
                return 106;
            case SUMA:
                return 107;
            case UL:
                return 108;
            case ULTIMO:
                return 109;
            case '(':
                return 110;
        }
        return 681;
    }

    private int yys31() {
        switch (yytok) {
            case ROJO:
            case '*':
            case '[':
            case GRIS:
            case VERDE:
            case '/':
            case '(':
            case MARRON:
            case AZUL:
            case PROCEDURE_NAME:
            case BLANCO:
            case error:
            case '>':
            case PARAMETER:
            case '=':
            case ')':
            case '+':
            case '<':
            case ENDINPUT:
            case IDENTIFIER:
            case CIAN:
            case FLOAT:
            case AMARILLO:
            case INTEGER:
            case '-':
            case NEGRO:
                return 681;
        }
        return yyr94();
    }

    private int yys32() {
        switch (yytok) {
            case ROJO:
            case '*':
            case '[':
            case GRIS:
            case VERDE:
            case '/':
            case '(':
            case MARRON:
            case AZUL:
            case PROCEDURE_NAME:
            case BLANCO:
            case error:
            case '>':
            case PARAMETER:
            case '=':
            case ')':
            case '+':
            case '<':
            case ENDINPUT:
            case IDENTIFIER:
            case CIAN:
            case FLOAT:
            case AMARILLO:
            case INTEGER:
            case '-':
            case NEGRO:
                return 681;
        }
        return yyr95();
    }

    private int yys33() {
        switch (yytok) {
            case ROJO:
            case '*':
            case '[':
            case GRIS:
            case VERDE:
            case '/':
            case '(':
            case MARRON:
            case AZUL:
            case PROCEDURE_NAME:
            case BLANCO:
            case error:
            case '>':
            case PARAMETER:
            case '=':
            case ')':
            case '+':
            case '<':
            case ENDINPUT:
            case IDENTIFIER:
            case CIAN:
            case FLOAT:
            case AMARILLO:
            case INTEGER:
            case '-':
            case NEGRO:
                return 681;
        }
        return yyr99();
    }

    private int yys34() {
        switch (yytok) {
            case ROJO:
            case '*':
            case '[':
            case GRIS:
            case VERDE:
            case '/':
            case '(':
            case MARRON:
            case AZUL:
            case PROCEDURE_NAME:
            case BLANCO:
            case error:
            case '>':
            case PARAMETER:
            case '=':
            case ')':
            case '+':
            case '<':
            case ENDINPUT:
            case IDENTIFIER:
            case CIAN:
            case FLOAT:
            case AMARILLO:
            case INTEGER:
            case '-':
            case NEGRO:
                return 681;
        }
        return yyr98();
    }

    private int yys35() {
        switch (yytok) {
            case AZAR:
                return 30;
            case COS:
                return 35;
            case CUENTA:
                return 36;
            case DIFERENCIA:
                return 37;
            case DIVISION:
                return 38;
            case ELEGIR:
                return 40;
            case ELEMENTO:
                return 41;
            case MENOS:
                return 52;
            case POTENCIA:
                return 64;
            case PRIMERO:
                return 65;
            case PRODUCTO:
                return 66;
            case RAIZCUADRADA:
                return 67;
            case RC:
                return 68;
            case REDONDEA:
                return 70;
            case RESTO:
                return 72;
            case RUMBO:
                return 74;
            case SEN:
                return 76;
            case SENO:
                return 77;
            case SUMA:
                return 80;
            case UL:
                return 81;
            case ULTIMO:
                return 82;
            case INTEGER:
                return 102;
            case FLOAT:
                return 122;
            case IDENTIFIER:
                return 123;
            case '(':
                return 124;
        }
        return 681;
    }

    private int yys37() {
        switch (yytok) {
            case AZAR:
                return 30;
            case COS:
                return 35;
            case CUENTA:
                return 36;
            case DIFERENCIA:
                return 37;
            case DIVISION:
                return 38;
            case ELEGIR:
                return 40;
            case ELEMENTO:
                return 41;
            case MENOS:
                return 52;
            case POTENCIA:
                return 64;
            case PRIMERO:
                return 65;
            case PRODUCTO:
                return 66;
            case RAIZCUADRADA:
                return 67;
            case RC:
                return 68;
            case REDONDEA:
                return 70;
            case RESTO:
                return 72;
            case RUMBO:
                return 74;
            case SEN:
                return 76;
            case SENO:
                return 77;
            case SUMA:
                return 80;
            case UL:
                return 81;
            case ULTIMO:
                return 82;
            case INTEGER:
                return 102;
            case FLOAT:
                return 122;
            case IDENTIFIER:
                return 123;
            case '(':
                return 124;
        }
        return 681;
    }

    private int yys38() {
        switch (yytok) {
            case AZAR:
                return 30;
            case COS:
                return 35;
            case CUENTA:
                return 36;
            case DIFERENCIA:
                return 37;
            case DIVISION:
                return 38;
            case ELEGIR:
                return 40;
            case ELEMENTO:
                return 41;
            case MENOS:
                return 52;
            case POTENCIA:
                return 64;
            case PRIMERO:
                return 65;
            case PRODUCTO:
                return 66;
            case RAIZCUADRADA:
                return 67;
            case RC:
                return 68;
            case REDONDEA:
                return 70;
            case RESTO:
                return 72;
            case RUMBO:
                return 74;
            case SEN:
                return 76;
            case SENO:
                return 77;
            case SUMA:
                return 80;
            case UL:
                return 81;
            case ULTIMO:
                return 82;
            case INTEGER:
                return 102;
            case FLOAT:
                return 122;
            case IDENTIFIER:
                return 123;
            case '(':
                return 124;
        }
        return 681;
    }

    private int yys41() {
        switch (yytok) {
            case AZAR:
                return 30;
            case CUENTA:
                return 36;
            case REDONDEA:
                return 70;
            case RESTO:
                return 72;
            case DIFERENCIA:
                return 98;
            case ELEGIR:
                return 99;
            case ELEMENTO:
                return 100;
            case IDENTIFIER:
                return 101;
            case INTEGER:
                return 102;
            case MENOS:
                return 103;
            case POTENCIA:
                return 104;
            case PRIMERO:
                return 105;
            case PRODUCTO:
                return 106;
            case SUMA:
                return 107;
            case UL:
                return 108;
            case ULTIMO:
                return 109;
            case '(':
                return 110;
        }
        return 681;
    }

    private int yys42() {
        switch (yytok) {
            case AZAR:
                return 30;
            case COS:
                return 35;
            case CUENTA:
                return 36;
            case DIFERENCIA:
                return 37;
            case DIVISION:
                return 38;
            case ELEGIR:
                return 40;
            case ELEMENTO:
                return 41;
            case MENOS:
                return 52;
            case POTENCIA:
                return 64;
            case PRIMERO:
                return 65;
            case PRODUCTO:
                return 66;
            case RAIZCUADRADA:
                return 67;
            case RC:
                return 68;
            case REDONDEA:
                return 70;
            case RESTO:
                return 72;
            case RUMBO:
                return 74;
            case SEN:
                return 76;
            case SENO:
                return 77;
            case SUMA:
                return 80;
            case UL:
                return 81;
            case ULTIMO:
                return 82;
            case INTEGER:
                return 102;
            case FLOAT:
                return 122;
            case IDENTIFIER:
                return 123;
            case '(':
                return 124;
        }
        return 681;
    }

    private int yys43() {
        switch (yytok) {
            case AZAR:
                return 30;
            case COS:
                return 35;
            case CUENTA:
                return 36;
            case DIFERENCIA:
                return 37;
            case DIVISION:
                return 38;
            case ELEGIR:
                return 40;
            case ELEMENTO:
                return 41;
            case MENOS:
                return 52;
            case POTENCIA:
                return 64;
            case PRIMERO:
                return 65;
            case PRODUCTO:
                return 66;
            case RAIZCUADRADA:
                return 67;
            case RC:
                return 68;
            case REDONDEA:
                return 70;
            case RESTO:
                return 72;
            case RUMBO:
                return 74;
            case SEN:
                return 76;
            case SENO:
                return 77;
            case SUMA:
                return 80;
            case UL:
                return 81;
            case ULTIMO:
                return 82;
            case INTEGER:
                return 102;
            case FLOAT:
                return 122;
            case IDENTIFIER:
                return 123;
            case '(':
                return 124;
        }
        return 681;
    }

    private int yys44() {
        switch (yytok) {
            case AZAR:
                return 30;
            case COS:
                return 35;
            case CUENTA:
                return 36;
            case DIFERENCIA:
                return 37;
            case DIVISION:
                return 38;
            case ELEGIR:
                return 40;
            case ELEMENTO:
                return 41;
            case MENOS:
                return 52;
            case POTENCIA:
                return 64;
            case PRIMERO:
                return 65;
            case PRODUCTO:
                return 66;
            case RAIZCUADRADA:
                return 67;
            case RC:
                return 68;
            case REDONDEA:
                return 70;
            case RESTO:
                return 72;
            case RUMBO:
                return 74;
            case SEN:
                return 76;
            case SENO:
                return 77;
            case SUMA:
                return 80;
            case UL:
                return 81;
            case ULTIMO:
                return 82;
            case INTEGER:
                return 102;
            case FLOAT:
                return 122;
            case IDENTIFIER:
                return 123;
            case '(':
                return 124;
        }
        return 681;
    }

    private int yys45() {
        switch (yytok) {
            case AZAR:
                return 30;
            case COS:
                return 35;
            case CUENTA:
                return 36;
            case DIFERENCIA:
                return 37;
            case DIVISION:
                return 38;
            case ELEGIR:
                return 40;
            case ELEMENTO:
                return 41;
            case MENOS:
                return 52;
            case POTENCIA:
                return 64;
            case PRIMERO:
                return 65;
            case PRODUCTO:
                return 66;
            case RAIZCUADRADA:
                return 67;
            case RC:
                return 68;
            case REDONDEA:
                return 70;
            case RESTO:
                return 72;
            case RUMBO:
                return 74;
            case SEN:
                return 76;
            case SENO:
                return 77;
            case SUMA:
                return 80;
            case UL:
                return 81;
            case ULTIMO:
                return 82;
            case INTEGER:
                return 102;
            case FLOAT:
                return 122;
            case IDENTIFIER:
                return 123;
            case '(':
                return 124;
        }
        return 681;
    }

    private int yys46() {
        switch (yytok) {
            case AZAR:
                return 30;
            case COS:
                return 35;
            case CUENTA:
                return 36;
            case DIFERENCIA:
                return 37;
            case DIVISION:
                return 38;
            case ELEGIR:
                return 40;
            case ELEMENTO:
                return 41;
            case MENOS:
                return 52;
            case POTENCIA:
                return 64;
            case PRIMERO:
                return 65;
            case PRODUCTO:
                return 66;
            case RAIZCUADRADA:
                return 67;
            case RC:
                return 68;
            case REDONDEA:
                return 70;
            case RESTO:
                return 72;
            case RUMBO:
                return 74;
            case SEN:
                return 76;
            case SENO:
                return 77;
            case SUMA:
                return 80;
            case UL:
                return 81;
            case ULTIMO:
                return 82;
            case INTEGER:
                return 102;
            case FLOAT:
                return 122;
            case IDENTIFIER:
                return 123;
            case '(':
                return 124;
        }
        return 681;
    }

    private int yys47() {
        switch (yytok) {
            case AZAR:
                return 30;
            case COS:
                return 35;
            case CUENTA:
                return 36;
            case DIFERENCIA:
                return 37;
            case DIVISION:
                return 38;
            case ELEGIR:
                return 40;
            case ELEMENTO:
                return 41;
            case MENOS:
                return 52;
            case POTENCIA:
                return 64;
            case PRIMERO:
                return 65;
            case PRODUCTO:
                return 66;
            case RAIZCUADRADA:
                return 67;
            case RC:
                return 68;
            case REDONDEA:
                return 70;
            case RESTO:
                return 72;
            case RUMBO:
                return 74;
            case SEN:
                return 76;
            case SENO:
                return 77;
            case SUMA:
                return 80;
            case UL:
                return 81;
            case ULTIMO:
                return 82;
            case INTEGER:
                return 102;
            case FLOAT:
                return 122;
            case IDENTIFIER:
                return 123;
            case '(':
                return 124;
        }
        return 681;
    }

    private int yys50() {
        switch (yytok) {
            case AZAR:
                return 30;
            case COS:
                return 35;
            case CUENTA:
                return 36;
            case DIFERENCIA:
                return 37;
            case DIVISION:
                return 38;
            case ELEGIR:
                return 40;
            case ELEMENTO:
                return 41;
            case MENOS:
                return 52;
            case POTENCIA:
                return 64;
            case PRIMERO:
                return 65;
            case PRODUCTO:
                return 66;
            case RAIZCUADRADA:
                return 67;
            case RC:
                return 68;
            case REDONDEA:
                return 70;
            case RESTO:
                return 72;
            case RUMBO:
                return 74;
            case SEN:
                return 76;
            case SENO:
                return 77;
            case SUMA:
                return 80;
            case UL:
                return 81;
            case ULTIMO:
                return 82;
            case INTEGER:
                return 102;
            case FLOAT:
                return 122;
            case IDENTIFIER:
                return 123;
            case '(':
                return 124;
        }
        return 681;
    }

    private int yys51() {
        switch (yytok) {
            case AZAR:
                return 30;
            case COS:
                return 35;
            case CUENTA:
                return 36;
            case DIFERENCIA:
                return 37;
            case DIVISION:
                return 38;
            case ELEGIR:
                return 40;
            case ELEMENTO:
                return 41;
            case MENOS:
                return 52;
            case POTENCIA:
                return 64;
            case PRIMERO:
                return 65;
            case PRODUCTO:
                return 66;
            case RAIZCUADRADA:
                return 67;
            case RC:
                return 68;
            case REDONDEA:
                return 70;
            case RESTO:
                return 72;
            case RUMBO:
                return 74;
            case SEN:
                return 76;
            case SENO:
                return 77;
            case SUMA:
                return 80;
            case UL:
                return 81;
            case ULTIMO:
                return 82;
            case INTEGER:
                return 102;
            case FLOAT:
                return 122;
            case IDENTIFIER:
                return 123;
            case '(':
                return 124;
        }
        return 681;
    }

    private int yys52() {
        switch (yytok) {
            case AZAR:
                return 30;
            case COS:
                return 35;
            case CUENTA:
                return 36;
            case DIFERENCIA:
                return 37;
            case DIVISION:
                return 38;
            case ELEGIR:
                return 40;
            case ELEMENTO:
                return 41;
            case MENOS:
                return 52;
            case POTENCIA:
                return 64;
            case PRIMERO:
                return 65;
            case PRODUCTO:
                return 66;
            case RAIZCUADRADA:
                return 67;
            case RC:
                return 68;
            case REDONDEA:
                return 70;
            case RESTO:
                return 72;
            case RUMBO:
                return 74;
            case SEN:
                return 76;
            case SENO:
                return 77;
            case SUMA:
                return 80;
            case UL:
                return 81;
            case ULTIMO:
                return 82;
            case INTEGER:
                return 102;
            case FLOAT:
                return 122;
            case IDENTIFIER:
                return 123;
            case '(':
                return 124;
        }
        return 681;
    }

    private int yys53() {
        switch (yytok) {
            case AZAR:
                return 30;
            case COS:
                return 35;
            case CUENTA:
                return 36;
            case DIFERENCIA:
                return 37;
            case DIVISION:
                return 38;
            case ELEGIR:
                return 40;
            case ELEMENTO:
                return 41;
            case IGUALES:
                return 47;
            case MAYORQUE:
                return 50;
            case MENORQUE:
                return 51;
            case MENOS:
                return 52;
            case O:
                return 53;
            case POTENCIA:
                return 64;
            case PRIMERO:
                return 65;
            case PRODUCTO:
                return 66;
            case RAIZCUADRADA:
                return 67;
            case RC:
                return 68;
            case REDONDEA:
                return 70;
            case RESTO:
                return 72;
            case RUMBO:
                return 74;
            case SEN:
                return 76;
            case SENO:
                return 77;
            case SUMA:
                return 80;
            case UL:
                return 81;
            case ULTIMO:
                return 82;
            case Y:
                return 84;
            case INTEGER:
                return 102;
            case FLOAT:
                return 122;
            case IDENTIFIER:
                return 123;
            case '(':
                return 124;
        }
        return 681;
    }

    private int yys54() {
        switch (yytok) {
            case ROJO:
            case '*':
            case '[':
            case GRIS:
            case VERDE:
            case '/':
            case '(':
            case MARRON:
            case AZUL:
            case PROCEDURE_NAME:
            case BLANCO:
            case error:
            case '>':
            case PARAMETER:
            case '=':
            case ')':
            case '+':
            case '<':
            case ENDINPUT:
            case IDENTIFIER:
            case CIAN:
            case FLOAT:
            case AMARILLO:
            case INTEGER:
            case '-':
            case NEGRO:
                return 681;
        }
        return yyr90();
    }

    private int yys55() {
        switch (yytok) {
            case ROJO:
            case '*':
            case '[':
            case GRIS:
            case VERDE:
            case '/':
            case '(':
            case MARRON:
            case AZUL:
            case PROCEDURE_NAME:
            case BLANCO:
            case error:
            case '>':
            case PARAMETER:
            case '=':
            case ')':
            case '+':
            case '<':
            case ENDINPUT:
            case IDENTIFIER:
            case CIAN:
            case FLOAT:
            case AMARILLO:
            case INTEGER:
            case '-':
            case NEGRO:
                return 681;
        }
        return yyr91();
    }

    private int yys57() {
        switch (yytok) {
            case AMARILLO:
                return 161;
            case AZUL:
                return 162;
            case BLANCO:
                return 163;
            case CIAN:
                return 164;
            case GRIS:
                return 165;
            case MARRON:
                return 166;
            case NEGRO:
                return 167;
            case ROJO:
                return 168;
            case VERDE:
                return 169;
        }
        return 681;
    }

    private int yys58() {
        switch (yytok) {
            case AMARILLO:
                return 161;
            case AZUL:
                return 162;
            case BLANCO:
                return 163;
            case CIAN:
                return 164;
            case GRIS:
                return 165;
            case MARRON:
                return 166;
            case NEGRO:
                return 167;
            case ROJO:
                return 168;
            case VERDE:
                return 169;
        }
        return 681;
    }

    private int yys60() {
        switch (yytok) {
            case AZAR:
                return 30;
            case COS:
                return 35;
            case CUENTA:
                return 36;
            case DIFERENCIA:
                return 37;
            case DIVISION:
                return 38;
            case ELEGIR:
                return 40;
            case ELEMENTO:
                return 41;
            case MENOS:
                return 52;
            case POTENCIA:
                return 64;
            case PRIMERO:
                return 65;
            case PRODUCTO:
                return 66;
            case RAIZCUADRADA:
                return 67;
            case RC:
                return 68;
            case REDONDEA:
                return 70;
            case RESTO:
                return 72;
            case RUMBO:
                return 74;
            case SEN:
                return 76;
            case SENO:
                return 77;
            case SUMA:
                return 80;
            case UL:
                return 81;
            case ULTIMO:
                return 82;
            case INTEGER:
                return 102;
            case FLOAT:
                return 122;
            case IDENTIFIER:
                return 123;
            case '(':
                return 124;
        }
        return 681;
    }

    private int yys61() {
        switch (yytok) {
            case AZAR:
                return 30;
            case CUENTA:
                return 36;
            case REDONDEA:
                return 70;
            case RESTO:
                return 72;
            case DIFERENCIA:
                return 98;
            case ELEGIR:
                return 99;
            case ELEMENTO:
                return 100;
            case IDENTIFIER:
                return 101;
            case INTEGER:
                return 102;
            case MENOS:
                return 103;
            case POTENCIA:
                return 104;
            case PRIMERO:
                return 105;
            case PRODUCTO:
                return 106;
            case SUMA:
                return 107;
            case UL:
                return 108;
            case ULTIMO:
                return 109;
            case '(':
                return 110;
        }
        return 681;
    }

    private int yys62() {
        switch (yytok) {
            case AZAR:
                return 30;
            case CUENTA:
                return 36;
            case REDONDEA:
                return 70;
            case RESTO:
                return 72;
            case DIFERENCIA:
                return 98;
            case ELEGIR:
                return 99;
            case ELEMENTO:
                return 100;
            case IDENTIFIER:
                return 101;
            case INTEGER:
                return 102;
            case MENOS:
                return 103;
            case POTENCIA:
                return 104;
            case PRIMERO:
                return 105;
            case PRODUCTO:
                return 106;
            case SUMA:
                return 107;
            case UL:
                return 108;
            case ULTIMO:
                return 109;
            case '(':
                return 110;
        }
        return 681;
    }

    private int yys63() {
        switch (yytok) {
            case AZAR:
                return 30;
            case CUENTA:
                return 36;
            case REDONDEA:
                return 70;
            case RESTO:
                return 72;
            case DIFERENCIA:
                return 98;
            case ELEGIR:
                return 99;
            case ELEMENTO:
                return 100;
            case IDENTIFIER:
                return 101;
            case INTEGER:
                return 102;
            case MENOS:
                return 103;
            case POTENCIA:
                return 104;
            case PRIMERO:
                return 105;
            case PRODUCTO:
                return 106;
            case SUMA:
                return 107;
            case UL:
                return 108;
            case ULTIMO:
                return 109;
            case '(':
                return 110;
        }
        return 681;
    }

    private int yys64() {
        switch (yytok) {
            case AZAR:
                return 30;
            case COS:
                return 35;
            case CUENTA:
                return 36;
            case DIFERENCIA:
                return 37;
            case DIVISION:
                return 38;
            case ELEGIR:
                return 40;
            case ELEMENTO:
                return 41;
            case MENOS:
                return 52;
            case POTENCIA:
                return 64;
            case PRIMERO:
                return 65;
            case PRODUCTO:
                return 66;
            case RAIZCUADRADA:
                return 67;
            case RC:
                return 68;
            case REDONDEA:
                return 70;
            case RESTO:
                return 72;
            case RUMBO:
                return 74;
            case SEN:
                return 76;
            case SENO:
                return 77;
            case SUMA:
                return 80;
            case UL:
                return 81;
            case ULTIMO:
                return 82;
            case INTEGER:
                return 102;
            case FLOAT:
                return 122;
            case IDENTIFIER:
                return 123;
            case '(':
                return 124;
        }
        return 681;
    }

    private int yys66() {
        switch (yytok) {
            case AZAR:
                return 30;
            case COS:
                return 35;
            case CUENTA:
                return 36;
            case DIFERENCIA:
                return 37;
            case DIVISION:
                return 38;
            case ELEGIR:
                return 40;
            case ELEMENTO:
                return 41;
            case MENOS:
                return 52;
            case POTENCIA:
                return 64;
            case PRIMERO:
                return 65;
            case PRODUCTO:
                return 66;
            case RAIZCUADRADA:
                return 67;
            case RC:
                return 68;
            case REDONDEA:
                return 70;
            case RESTO:
                return 72;
            case RUMBO:
                return 74;
            case SEN:
                return 76;
            case SENO:
                return 77;
            case SUMA:
                return 80;
            case UL:
                return 81;
            case ULTIMO:
                return 82;
            case INTEGER:
                return 102;
            case FLOAT:
                return 122;
            case IDENTIFIER:
                return 123;
            case '(':
                return 124;
        }
        return 681;
    }

    private int yys67() {
        switch (yytok) {
            case AZAR:
                return 30;
            case COS:
                return 35;
            case CUENTA:
                return 36;
            case DIFERENCIA:
                return 37;
            case DIVISION:
                return 38;
            case ELEGIR:
                return 40;
            case ELEMENTO:
                return 41;
            case MENOS:
                return 52;
            case POTENCIA:
                return 64;
            case PRIMERO:
                return 65;
            case PRODUCTO:
                return 66;
            case RAIZCUADRADA:
                return 67;
            case RC:
                return 68;
            case REDONDEA:
                return 70;
            case RESTO:
                return 72;
            case RUMBO:
                return 74;
            case SEN:
                return 76;
            case SENO:
                return 77;
            case SUMA:
                return 80;
            case UL:
                return 81;
            case ULTIMO:
                return 82;
            case INTEGER:
                return 102;
            case FLOAT:
                return 122;
            case IDENTIFIER:
                return 123;
            case '(':
                return 124;
        }
        return 681;
    }

    private int yys68() {
        switch (yytok) {
            case AZAR:
                return 30;
            case COS:
                return 35;
            case CUENTA:
                return 36;
            case DIFERENCIA:
                return 37;
            case DIVISION:
                return 38;
            case ELEGIR:
                return 40;
            case ELEMENTO:
                return 41;
            case MENOS:
                return 52;
            case POTENCIA:
                return 64;
            case PRIMERO:
                return 65;
            case PRODUCTO:
                return 66;
            case RAIZCUADRADA:
                return 67;
            case RC:
                return 68;
            case REDONDEA:
                return 70;
            case RESTO:
                return 72;
            case RUMBO:
                return 74;
            case SEN:
                return 76;
            case SENO:
                return 77;
            case SUMA:
                return 80;
            case UL:
                return 81;
            case ULTIMO:
                return 82;
            case INTEGER:
                return 102;
            case FLOAT:
                return 122;
            case IDENTIFIER:
                return 123;
            case '(':
                return 124;
        }
        return 681;
    }

    private int yys69() {
        switch (yytok) {
            case AZAR:
                return 30;
            case CUENTA:
                return 36;
            case REDONDEA:
                return 70;
            case RESTO:
                return 72;
            case DIFERENCIA:
                return 98;
            case ELEGIR:
                return 99;
            case ELEMENTO:
                return 100;
            case IDENTIFIER:
                return 101;
            case INTEGER:
                return 102;
            case MENOS:
                return 103;
            case POTENCIA:
                return 104;
            case PRIMERO:
                return 105;
            case PRODUCTO:
                return 106;
            case SUMA:
                return 107;
            case UL:
                return 108;
            case ULTIMO:
                return 109;
            case '(':
                return 110;
        }
        return 681;
    }

    private int yys70() {
        switch (yytok) {
            case AZAR:
                return 30;
            case COS:
                return 35;
            case CUENTA:
                return 36;
            case DIFERENCIA:
                return 37;
            case DIVISION:
                return 38;
            case ELEGIR:
                return 40;
            case ELEMENTO:
                return 41;
            case MENOS:
                return 52;
            case POTENCIA:
                return 64;
            case PRIMERO:
                return 65;
            case PRODUCTO:
                return 66;
            case RAIZCUADRADA:
                return 67;
            case RC:
                return 68;
            case REDONDEA:
                return 70;
            case RESTO:
                return 72;
            case RUMBO:
                return 74;
            case SEN:
                return 76;
            case SENO:
                return 77;
            case SUMA:
                return 80;
            case UL:
                return 81;
            case ULTIMO:
                return 82;
            case INTEGER:
                return 102;
            case FLOAT:
                return 122;
            case IDENTIFIER:
                return 123;
            case '(':
                return 124;
        }
        return 681;
    }

    private int yys71() {
        switch (yytok) {
            case AZAR:
                return 30;
            case CUENTA:
                return 36;
            case REDONDEA:
                return 70;
            case RESTO:
                return 72;
            case DIFERENCIA:
                return 98;
            case ELEGIR:
                return 99;
            case ELEMENTO:
                return 100;
            case IDENTIFIER:
                return 101;
            case INTEGER:
                return 102;
            case MENOS:
                return 103;
            case POTENCIA:
                return 104;
            case PRIMERO:
                return 105;
            case PRODUCTO:
                return 106;
            case SUMA:
                return 107;
            case UL:
                return 108;
            case ULTIMO:
                return 109;
            case '(':
                return 110;
        }
        return 681;
    }

    private int yys72() {
        switch (yytok) {
            case AZAR:
                return 30;
            case CUENTA:
                return 36;
            case REDONDEA:
                return 70;
            case RESTO:
                return 72;
            case DIFERENCIA:
                return 98;
            case ELEGIR:
                return 99;
            case ELEMENTO:
                return 100;
            case IDENTIFIER:
                return 101;
            case INTEGER:
                return 102;
            case MENOS:
                return 103;
            case POTENCIA:
                return 104;
            case PRIMERO:
                return 105;
            case PRODUCTO:
                return 106;
            case SUMA:
                return 107;
            case UL:
                return 108;
            case ULTIMO:
                return 109;
            case '(':
                return 110;
        }
        return 681;
    }

    private int yys73() {
        switch (yytok) {
            case AZAR:
                return 30;
            case CUENTA:
                return 36;
            case REDONDEA:
                return 70;
            case RESTO:
                return 72;
            case DIFERENCIA:
                return 98;
            case ELEGIR:
                return 99;
            case ELEMENTO:
                return 100;
            case IDENTIFIER:
                return 101;
            case INTEGER:
                return 102;
            case MENOS:
                return 103;
            case POTENCIA:
                return 104;
            case PRIMERO:
                return 105;
            case PRODUCTO:
                return 106;
            case SUMA:
                return 107;
            case UL:
                return 108;
            case ULTIMO:
                return 109;
            case '(':
                return 110;
        }
        return 681;
    }

    private int yys74() {
        switch (yytok) {
            case VERDE:
            case error:
            case GRIS:
            case PARAMETER:
            case AZUL:
            case BLANCO:
            case '=':
            case CIAN:
            case ENDINPUT:
            case NEGRO:
            case MARRON:
            case AMARILLO:
            case PROCEDURE_NAME:
            case ROJO:
                return 681;
        }
        return yyr89();
    }

    private int yys75() {
        switch (yytok) {
            case ROJO:
            case '*':
            case '[':
            case GRIS:
            case VERDE:
            case '/':
            case '(':
            case MARRON:
            case AZUL:
            case PROCEDURE_NAME:
            case BLANCO:
            case error:
            case '>':
            case PARAMETER:
            case '=':
            case ')':
            case '+':
            case '<':
            case ENDINPUT:
            case IDENTIFIER:
            case CIAN:
            case FLOAT:
            case AMARILLO:
            case INTEGER:
            case '-':
            case NEGRO:
                return 681;
        }
        return yyr97();
    }

    private int yys76() {
        switch (yytok) {
            case AZAR:
                return 30;
            case COS:
                return 35;
            case CUENTA:
                return 36;
            case DIFERENCIA:
                return 37;
            case DIVISION:
                return 38;
            case ELEGIR:
                return 40;
            case ELEMENTO:
                return 41;
            case MENOS:
                return 52;
            case POTENCIA:
                return 64;
            case PRIMERO:
                return 65;
            case PRODUCTO:
                return 66;
            case RAIZCUADRADA:
                return 67;
            case RC:
                return 68;
            case REDONDEA:
                return 70;
            case RESTO:
                return 72;
            case RUMBO:
                return 74;
            case SEN:
                return 76;
            case SENO:
                return 77;
            case SUMA:
                return 80;
            case UL:
                return 81;
            case ULTIMO:
                return 82;
            case INTEGER:
                return 102;
            case FLOAT:
                return 122;
            case IDENTIFIER:
                return 123;
            case '(':
                return 124;
        }
        return 681;
    }

    private int yys77() {
        switch (yytok) {
            case AZAR:
                return 30;
            case COS:
                return 35;
            case CUENTA:
                return 36;
            case DIFERENCIA:
                return 37;
            case DIVISION:
                return 38;
            case ELEGIR:
                return 40;
            case ELEMENTO:
                return 41;
            case MENOS:
                return 52;
            case POTENCIA:
                return 64;
            case PRIMERO:
                return 65;
            case PRODUCTO:
                return 66;
            case RAIZCUADRADA:
                return 67;
            case RC:
                return 68;
            case REDONDEA:
                return 70;
            case RESTO:
                return 72;
            case RUMBO:
                return 74;
            case SEN:
                return 76;
            case SENO:
                return 77;
            case SUMA:
                return 80;
            case UL:
                return 81;
            case ULTIMO:
                return 82;
            case INTEGER:
                return 102;
            case FLOAT:
                return 122;
            case IDENTIFIER:
                return 123;
            case '(':
                return 124;
        }
        return 681;
    }

    private int yys78() {
        switch (yytok) {
            case AZAR:
                return 30;
            case COS:
                return 35;
            case CUENTA:
                return 36;
            case DIFERENCIA:
                return 37;
            case DIVISION:
                return 38;
            case ELEGIR:
                return 40;
            case ELEMENTO:
                return 41;
            case IGUALES:
                return 47;
            case MAYORQUE:
                return 50;
            case MENORQUE:
                return 51;
            case MENOS:
                return 52;
            case O:
                return 53;
            case POTENCIA:
                return 64;
            case PRIMERO:
                return 65;
            case PRODUCTO:
                return 66;
            case RAIZCUADRADA:
                return 67;
            case RC:
                return 68;
            case REDONDEA:
                return 70;
            case RESTO:
                return 72;
            case RUMBO:
                return 74;
            case SEN:
                return 76;
            case SENO:
                return 77;
            case SUMA:
                return 80;
            case UL:
                return 81;
            case ULTIMO:
                return 82;
            case Y:
                return 84;
            case INTEGER:
                return 102;
            case FLOAT:
                return 122;
            case IDENTIFIER:
                return 123;
            case '(':
                return 124;
        }
        return 681;
    }

    private int yys79() {
        switch (yytok) {
            case ROJO:
            case '*':
            case '[':
            case GRIS:
            case VERDE:
            case '/':
            case '(':
            case MARRON:
            case AZUL:
            case PROCEDURE_NAME:
            case BLANCO:
            case error:
            case '>':
            case PARAMETER:
            case '=':
            case ')':
            case '+':
            case '<':
            case ENDINPUT:
            case IDENTIFIER:
            case CIAN:
            case FLOAT:
            case AMARILLO:
            case INTEGER:
            case '-':
            case NEGRO:
                return 681;
        }
        return yyr96();
    }

    private int yys80() {
        switch (yytok) {
            case AZAR:
                return 30;
            case COS:
                return 35;
            case CUENTA:
                return 36;
            case DIFERENCIA:
                return 37;
            case DIVISION:
                return 38;
            case ELEGIR:
                return 40;
            case ELEMENTO:
                return 41;
            case MENOS:
                return 52;
            case POTENCIA:
                return 64;
            case PRIMERO:
                return 65;
            case PRODUCTO:
                return 66;
            case RAIZCUADRADA:
                return 67;
            case RC:
                return 68;
            case REDONDEA:
                return 70;
            case RESTO:
                return 72;
            case RUMBO:
                return 74;
            case SEN:
                return 76;
            case SENO:
                return 77;
            case SUMA:
                return 80;
            case UL:
                return 81;
            case ULTIMO:
                return 82;
            case INTEGER:
                return 102;
            case FLOAT:
                return 122;
            case IDENTIFIER:
                return 123;
            case '(':
                return 124;
        }
        return 681;
    }

    private int yys84() {
        switch (yytok) {
            case AZAR:
                return 30;
            case COS:
                return 35;
            case CUENTA:
                return 36;
            case DIFERENCIA:
                return 37;
            case DIVISION:
                return 38;
            case ELEGIR:
                return 40;
            case ELEMENTO:
                return 41;
            case IGUALES:
                return 47;
            case MAYORQUE:
                return 50;
            case MENORQUE:
                return 51;
            case MENOS:
                return 52;
            case O:
                return 53;
            case POTENCIA:
                return 64;
            case PRIMERO:
                return 65;
            case PRODUCTO:
                return 66;
            case RAIZCUADRADA:
                return 67;
            case RC:
                return 68;
            case REDONDEA:
                return 70;
            case RESTO:
                return 72;
            case RUMBO:
                return 74;
            case SEN:
                return 76;
            case SENO:
                return 77;
            case SUMA:
                return 80;
            case UL:
                return 81;
            case ULTIMO:
                return 82;
            case Y:
                return 84;
            case INTEGER:
                return 102;
            case FLOAT:
                return 122;
            case IDENTIFIER:
                return 123;
            case '(':
                return 124;
        }
        return 681;
    }

    private int yys85() {
        switch (yytok) {
            case APARECETORTUGA:
                return 26;
            case AT:
                return 27;
            case AV:
                return 28;
            case AVANZA:
                return 29;
            case AZAR:
                return 30;
            case BAJALAPIZ:
                return 31;
            case BL:
                return 32;
            case BORRAPANTALLA:
                return 33;
            case CENTRO:
                return 34;
            case COS:
                return 35;
            case CUENTA:
                return 36;
            case DIFERENCIA:
                return 37;
            case DIVISION:
                return 38;
            case EJECUTA:
                return 39;
            case ELEGIR:
                return 40;
            case ELEMENTO:
                return 41;
            case ESPERA:
                return 42;
            case GD:
                return 43;
            case GI:
                return 44;
            case GIRADERECHA:
                return 45;
            case GIRAIZQUIERDA:
                return 46;
            case IGUALES:
                return 47;
            case INC:
                return 48;
            case INIC:
                return 49;
            case MAYORQUE:
                return 50;
            case MENORQUE:
                return 51;
            case MENOS:
                return 52;
            case O:
                return 53;
            case OCULTATORTUGA:
                return 54;
            case OT:
                return 55;
            case PARA:
                return 56;
            case PONCL:
                return 57;
            case PONCOLORLAPIZ:
                return 58;
            case PONPOS:
                return 59;
            case PONRUMBO:
                return 60;
            case PONX:
                return 61;
            case PONXY:
                return 62;
            case PONY:
                return 63;
            case POTENCIA:
                return 64;
            case PRIMERO:
                return 65;
            case PRODUCTO:
                return 66;
            case RAIZCUADRADA:
                return 67;
            case RC:
                return 68;
            case RE:
                return 69;
            case REDONDEA:
                return 70;
            case REPITE:
                return 71;
            case RESTO:
                return 72;
            case RETROCEDE:
                return 73;
            case RUMBO:
                return 74;
            case SB:
                return 75;
            case SEN:
                return 76;
            case SENO:
                return 77;
            case SI:
                return 78;
            case SUBELAPIZ:
                return 79;
            case SUMA:
                return 80;
            case UL:
                return 81;
            case ULTIMO:
                return 82;
            case VAR:
                return 83;
            case Y:
                return 84;
            case ENDINPUT:
                return yyr3();
        }
        return 681;
    }

    private int yys86() {
        switch (yytok) {
            case APARECETORTUGA:
                return 26;
            case AT:
                return 27;
            case AV:
                return 28;
            case AVANZA:
                return 29;
            case AZAR:
                return 30;
            case BAJALAPIZ:
                return 31;
            case BL:
                return 32;
            case BORRAPANTALLA:
                return 33;
            case CENTRO:
                return 34;
            case COS:
                return 35;
            case CUENTA:
                return 36;
            case DIFERENCIA:
                return 37;
            case DIVISION:
                return 38;
            case EJECUTA:
                return 39;
            case ELEGIR:
                return 40;
            case ELEMENTO:
                return 41;
            case ESPERA:
                return 42;
            case GD:
                return 43;
            case GI:
                return 44;
            case GIRADERECHA:
                return 45;
            case GIRAIZQUIERDA:
                return 46;
            case IGUALES:
                return 47;
            case INC:
                return 48;
            case INIC:
                return 49;
            case MAYORQUE:
                return 50;
            case MENORQUE:
                return 51;
            case MENOS:
                return 52;
            case O:
                return 53;
            case OCULTATORTUGA:
                return 54;
            case OT:
                return 55;
            case PARA:
                return 56;
            case PONCL:
                return 57;
            case PONCOLORLAPIZ:
                return 58;
            case PONPOS:
                return 59;
            case PONRUMBO:
                return 60;
            case PONX:
                return 61;
            case PONXY:
                return 62;
            case PONY:
                return 63;
            case POTENCIA:
                return 64;
            case PRIMERO:
                return 65;
            case PRODUCTO:
                return 66;
            case RAIZCUADRADA:
                return 67;
            case RC:
                return 68;
            case RE:
                return 69;
            case REDONDEA:
                return 70;
            case REPITE:
                return 71;
            case RESTO:
                return 72;
            case RETROCEDE:
                return 73;
            case RUMBO:
                return 74;
            case SB:
                return 75;
            case SEN:
                return 76;
            case SENO:
                return 77;
            case SI:
                return 78;
            case SUBELAPIZ:
                return 79;
            case SUMA:
                return 80;
            case UL:
                return 81;
            case ULTIMO:
                return 82;
            case VAR:
                return 83;
            case Y:
                return 84;
        }
        return 681;
    }

    private int yys87() {
        switch (yytok) {
            case APARECETORTUGA:
                return 26;
            case AT:
                return 27;
            case AV:
                return 28;
            case AVANZA:
                return 29;
            case AZAR:
                return 30;
            case BAJALAPIZ:
                return 31;
            case BL:
                return 32;
            case BORRAPANTALLA:
                return 33;
            case CENTRO:
                return 34;
            case COS:
                return 35;
            case CUENTA:
                return 36;
            case DIFERENCIA:
                return 37;
            case DIVISION:
                return 38;
            case EJECUTA:
                return 39;
            case ELEGIR:
                return 40;
            case ELEMENTO:
                return 41;
            case ESPERA:
                return 42;
            case GD:
                return 43;
            case GI:
                return 44;
            case GIRADERECHA:
                return 45;
            case GIRAIZQUIERDA:
                return 46;
            case IGUALES:
                return 47;
            case INC:
                return 48;
            case INIC:
                return 49;
            case MAYORQUE:
                return 50;
            case MENORQUE:
                return 51;
            case MENOS:
                return 52;
            case O:
                return 53;
            case OCULTATORTUGA:
                return 54;
            case OT:
                return 55;
            case PARA:
                return 56;
            case PONCL:
                return 57;
            case PONCOLORLAPIZ:
                return 58;
            case PONPOS:
                return 59;
            case PONRUMBO:
                return 60;
            case PONX:
                return 61;
            case PONXY:
                return 62;
            case PONY:
                return 63;
            case POTENCIA:
                return 64;
            case PRIMERO:
                return 65;
            case PRODUCTO:
                return 66;
            case RAIZCUADRADA:
                return 67;
            case RC:
                return 68;
            case RE:
                return 69;
            case REDONDEA:
                return 70;
            case REPITE:
                return 71;
            case RESTO:
                return 72;
            case RETROCEDE:
                return 73;
            case RUMBO:
                return 74;
            case SB:
                return 75;
            case SEN:
                return 76;
            case SENO:
                return 77;
            case SI:
                return 78;
            case SUBELAPIZ:
                return 79;
            case SUMA:
                return 80;
            case UL:
                return 81;
            case ULTIMO:
                return 82;
            case VAR:
                return 83;
            case Y:
                return 84;
            case FIN:
                return yyr27();
        }
        return 681;
    }

    private int yys89() {
        switch (yytok) {
            case APARECETORTUGA:
                return 26;
            case AT:
                return 27;
            case AV:
                return 28;
            case AVANZA:
                return 29;
            case AZAR:
                return 30;
            case BAJALAPIZ:
                return 31;
            case BL:
                return 32;
            case BORRAPANTALLA:
                return 33;
            case CENTRO:
                return 34;
            case COS:
                return 35;
            case CUENTA:
                return 36;
            case DIFERENCIA:
                return 37;
            case DIVISION:
                return 38;
            case EJECUTA:
                return 39;
            case ELEGIR:
                return 40;
            case ELEMENTO:
                return 41;
            case ESPERA:
                return 42;
            case GD:
                return 43;
            case GI:
                return 44;
            case GIRADERECHA:
                return 45;
            case GIRAIZQUIERDA:
                return 46;
            case IGUALES:
                return 47;
            case INC:
                return 48;
            case INIC:
                return 49;
            case MAYORQUE:
                return 50;
            case MENORQUE:
                return 51;
            case MENOS:
                return 52;
            case O:
                return 53;
            case OCULTATORTUGA:
                return 54;
            case OT:
                return 55;
            case PARA:
                return 56;
            case PONCL:
                return 57;
            case PONCOLORLAPIZ:
                return 58;
            case PONPOS:
                return 59;
            case PONRUMBO:
                return 60;
            case PONX:
                return 61;
            case PONXY:
                return 62;
            case PONY:
                return 63;
            case POTENCIA:
                return 64;
            case PRIMERO:
                return 65;
            case PRODUCTO:
                return 66;
            case RAIZCUADRADA:
                return 67;
            case RC:
                return 68;
            case RE:
                return 69;
            case REDONDEA:
                return 70;
            case REPITE:
                return 71;
            case RESTO:
                return 72;
            case RETROCEDE:
                return 73;
            case RUMBO:
                return 74;
            case SB:
                return 75;
            case SEN:
                return 76;
            case SENO:
                return 77;
            case SI:
                return 78;
            case SUBELAPIZ:
                return 79;
            case SUMA:
                return 80;
            case UL:
                return 81;
            case ULTIMO:
                return 82;
            case VAR:
                return 83;
            case Y:
                return 84;
        }
        return 681;
    }

    private int yys90() {
        switch (yytok) {
            case '+':
            case ';':
            case MARRON:
            case FLOAT:
            case '-':
            case ']':
            case ')':
            case '<':
            case GRIS:
            case CIAN:
            case AMARILLO:
            case BLANCO:
            case error:
            case '>':
            case '=':
            case '*':
            case '(':
            case '/':
            case INTEGER:
            case ROJO:
            case AZUL:
            case PROCEDURE_NAME:
            case IDENTIFIER:
            case FIN:
            case ENDINPUT:
            case '[':
            case NEGRO:
            case VERDE:
                return 681;
            case PARAMETER:
                return 90;
        }
        return yyr25();
    }

    private int yys91() {
        switch (yytok) {
            case VERDE:
            case error:
            case GRIS:
            case PARAMETER:
            case AZUL:
            case BLANCO:
            case '=':
            case CIAN:
            case ENDINPUT:
            case NEGRO:
            case MARRON:
            case AMARILLO:
            case PROCEDURE_NAME:
            case ROJO:
                return 681;
        }
        return yyr33();
    }

    private int yys92() {
        switch (yytok) {
            case INTEGER:
            case '(':
            case BLANCO:
            case ROJO:
            case VERDE:
            case '/':
            case NEGRO:
            case MARRON:
            case GRIS:
            case PROCEDURE_NAME:
            case ENDINPUT:
            case error:
            case '>':
            case PARAMETER:
            case '=':
            case '[':
            case ')':
            case '<':
            case AZUL:
            case IDENTIFIER:
            case CIAN:
            case FLOAT:
            case AMARILLO:
                return 681;
            case '*':
                return 210;
            case '+':
                return 211;
            case '-':
                return 212;
        }
        return yyr115();
    }

    private int yys93() {
        switch (yytok) {
            case VERDE:
            case error:
            case GRIS:
            case PARAMETER:
            case AZUL:
            case BLANCO:
            case '=':
            case CIAN:
            case ENDINPUT:
            case NEGRO:
            case MARRON:
            case AMARILLO:
            case PROCEDURE_NAME:
            case ROJO:
                return 681;
        }
        return yyr34();
    }

    private int yys94() {
        switch (yytok) {
            case VERDE:
            case error:
            case GRIS:
            case PARAMETER:
            case AZUL:
            case BLANCO:
            case '=':
            case CIAN:
            case ENDINPUT:
            case NEGRO:
            case MARRON:
            case AMARILLO:
            case PROCEDURE_NAME:
            case ROJO:
                return 681;
        }
        return yyr35();
    }

    private int yys95() {
        switch (yytok) {
            case VERDE:
            case error:
            case GRIS:
            case PARAMETER:
            case AZUL:
            case BLANCO:
            case '=':
            case CIAN:
            case ENDINPUT:
            case NEGRO:
            case MARRON:
            case AMARILLO:
            case PROCEDURE_NAME:
            case ROJO:
                return 681;
        }
        return yyr37();
    }

    private int yys96() {
        switch (yytok) {
            case VERDE:
            case error:
            case GRIS:
            case PARAMETER:
            case AZUL:
            case BLANCO:
            case '=':
            case CIAN:
            case ENDINPUT:
            case NEGRO:
            case MARRON:
            case AMARILLO:
            case PROCEDURE_NAME:
            case ROJO:
                return 681;
        }
        return yyr38();
    }

    private int yys97() {
        switch (yytok) {
            case VERDE:
            case error:
            case GRIS:
            case PARAMETER:
            case AZUL:
            case BLANCO:
            case '=':
            case CIAN:
            case ENDINPUT:
            case NEGRO:
            case MARRON:
            case AMARILLO:
            case PROCEDURE_NAME:
            case ROJO:
                return 681;
        }
        return yyr36();
    }

    private int yys98() {
        switch (yytok) {
            case AZAR:
                return 30;
            case CUENTA:
                return 36;
            case REDONDEA:
                return 70;
            case RESTO:
                return 72;
            case DIFERENCIA:
                return 98;
            case ELEGIR:
                return 99;
            case ELEMENTO:
                return 100;
            case IDENTIFIER:
                return 101;
            case INTEGER:
                return 102;
            case MENOS:
                return 103;
            case POTENCIA:
                return 104;
            case PRIMERO:
                return 105;
            case PRODUCTO:
                return 106;
            case SUMA:
                return 107;
            case UL:
                return 108;
            case ULTIMO:
                return 109;
            case '(':
                return 110;
        }
        return 681;
    }

    private int yys100() {
        switch (yytok) {
            case AZAR:
                return 30;
            case CUENTA:
                return 36;
            case REDONDEA:
                return 70;
            case RESTO:
                return 72;
            case DIFERENCIA:
                return 98;
            case ELEGIR:
                return 99;
            case ELEMENTO:
                return 100;
            case IDENTIFIER:
                return 101;
            case INTEGER:
                return 102;
            case MENOS:
                return 103;
            case POTENCIA:
                return 104;
            case PRIMERO:
                return 105;
            case PRODUCTO:
                return 106;
            case SUMA:
                return 107;
            case UL:
                return 108;
            case ULTIMO:
                return 109;
            case '(':
                return 110;
        }
        return 681;
    }

    private int yys101() {
        switch (yytok) {
            case VERDE:
            case error:
            case GRIS:
            case PARAMETER:
            case AZUL:
            case BLANCO:
            case '=':
            case CIAN:
            case ENDINPUT:
            case NEGRO:
            case MARRON:
            case AMARILLO:
            case PROCEDURE_NAME:
            case ROJO:
                return 681;
        }
        return yyr32();
    }

    private int yys102() {
        switch (yytok) {
            case VERDE:
            case error:
            case GRIS:
            case PARAMETER:
            case AZUL:
            case BLANCO:
            case '=':
            case CIAN:
            case ENDINPUT:
            case NEGRO:
            case MARRON:
            case AMARILLO:
            case PROCEDURE_NAME:
            case ROJO:
                return 681;
        }
        return yyr31();
    }

    private int yys103() {
        switch (yytok) {
            case AZAR:
                return 30;
            case CUENTA:
                return 36;
            case REDONDEA:
                return 70;
            case RESTO:
                return 72;
            case DIFERENCIA:
                return 98;
            case ELEGIR:
                return 99;
            case ELEMENTO:
                return 100;
            case IDENTIFIER:
                return 101;
            case INTEGER:
                return 102;
            case MENOS:
                return 103;
            case POTENCIA:
                return 104;
            case PRIMERO:
                return 105;
            case PRODUCTO:
                return 106;
            case SUMA:
                return 107;
            case UL:
                return 108;
            case ULTIMO:
                return 109;
            case '(':
                return 110;
        }
        return 681;
    }

    private int yys104() {
        switch (yytok) {
            case AZAR:
                return 30;
            case CUENTA:
                return 36;
            case REDONDEA:
                return 70;
            case RESTO:
                return 72;
            case DIFERENCIA:
                return 98;
            case ELEGIR:
                return 99;
            case ELEMENTO:
                return 100;
            case IDENTIFIER:
                return 101;
            case INTEGER:
                return 102;
            case MENOS:
                return 103;
            case POTENCIA:
                return 104;
            case PRIMERO:
                return 105;
            case PRODUCTO:
                return 106;
            case SUMA:
                return 107;
            case UL:
                return 108;
            case ULTIMO:
                return 109;
            case '(':
                return 110;
        }
        return 681;
    }

    private int yys106() {
        switch (yytok) {
            case AZAR:
                return 30;
            case CUENTA:
                return 36;
            case REDONDEA:
                return 70;
            case RESTO:
                return 72;
            case DIFERENCIA:
                return 98;
            case ELEGIR:
                return 99;
            case ELEMENTO:
                return 100;
            case IDENTIFIER:
                return 101;
            case INTEGER:
                return 102;
            case MENOS:
                return 103;
            case POTENCIA:
                return 104;
            case PRIMERO:
                return 105;
            case PRODUCTO:
                return 106;
            case SUMA:
                return 107;
            case UL:
                return 108;
            case ULTIMO:
                return 109;
            case '(':
                return 110;
        }
        return 681;
    }

    private int yys107() {
        switch (yytok) {
            case AZAR:
                return 30;
            case CUENTA:
                return 36;
            case REDONDEA:
                return 70;
            case RESTO:
                return 72;
            case DIFERENCIA:
                return 98;
            case ELEGIR:
                return 99;
            case ELEMENTO:
                return 100;
            case IDENTIFIER:
                return 101;
            case INTEGER:
                return 102;
            case MENOS:
                return 103;
            case POTENCIA:
                return 104;
            case PRIMERO:
                return 105;
            case PRODUCTO:
                return 106;
            case SUMA:
                return 107;
            case UL:
                return 108;
            case ULTIMO:
                return 109;
            case '(':
                return 110;
        }
        return 681;
    }

    private int yys110() {
        switch (yytok) {
            case AZAR:
                return 30;
            case CUENTA:
                return 36;
            case REDONDEA:
                return 70;
            case RESTO:
                return 72;
            case DIFERENCIA:
                return 98;
            case ELEGIR:
                return 99;
            case ELEMENTO:
                return 100;
            case IDENTIFIER:
                return 101;
            case INTEGER:
                return 102;
            case MENOS:
                return 103;
            case POTENCIA:
                return 104;
            case PRIMERO:
                return 105;
            case PRODUCTO:
                return 106;
            case SUMA:
                return 107;
            case UL:
                return 108;
            case ULTIMO:
                return 109;
            case '(':
                return 110;
        }
        return 681;
    }

    private int yys111() {
        switch (yytok) {
            case INTEGER:
            case '(':
            case BLANCO:
            case ROJO:
            case VERDE:
            case '/':
            case NEGRO:
            case MARRON:
            case GRIS:
            case PROCEDURE_NAME:
            case ENDINPUT:
            case error:
            case '>':
            case PARAMETER:
            case '=':
            case '[':
            case ')':
            case '<':
            case AZUL:
            case IDENTIFIER:
            case CIAN:
            case FLOAT:
            case AMARILLO:
                return 681;
            case '*':
                return 210;
            case '+':
                return 211;
            case '-':
                return 212;
        }
        return yyr114();
    }

    private int yys112() {
        switch (yytok) {
            case GRIS:
            case ROJO:
            case error:
            case VERDE:
            case BLANCO:
            case CIAN:
            case '=':
            case AZUL:
            case AMARILLO:
            case MARRON:
            case PARAMETER:
            case NEGRO:
            case ENDINPUT:
            case PROCEDURE_NAME:
                return 681;
            case '*':
                return 210;
            case '+':
                return 211;
            case '-':
                return 212;
        }
        return yyr101();
    }

    private int yys113() {
        switch (yytok) {
            case VERDE:
            case error:
            case GRIS:
            case PARAMETER:
            case AZUL:
            case BLANCO:
            case '=':
            case CIAN:
            case ENDINPUT:
            case NEGRO:
            case MARRON:
            case AMARILLO:
            case PROCEDURE_NAME:
            case ROJO:
                return 681;
        }
        return yyr41();
    }

    private int yys114() {
        switch (yytok) {
            case GRIS:
            case CIAN:
            case ROJO:
            case VERDE:
            case error:
            case PROCEDURE_NAME:
            case '=':
            case AZUL:
            case MARRON:
            case BLANCO:
            case PARAMETER:
            case NEGRO:
            case ENDINPUT:
            case AMARILLO:
                return 681;
            case '*':
                return 223;
            case '+':
                return 224;
            case '-':
                return 225;
            case '/':
                return 226;
        }
        return yyr104();
    }

    private int yys115() {
        switch (yytok) {
            case VERDE:
            case error:
            case GRIS:
            case PARAMETER:
            case AZUL:
            case BLANCO:
            case '=':
            case CIAN:
            case ENDINPUT:
            case NEGRO:
            case MARRON:
            case AMARILLO:
            case PROCEDURE_NAME:
            case ROJO:
                return 681;
        }
        return yyr42();
    }

    private int yys116() {
        switch (yytok) {
            case VERDE:
            case error:
            case GRIS:
            case PARAMETER:
            case AZUL:
            case BLANCO:
            case '=':
            case CIAN:
            case ENDINPUT:
            case NEGRO:
            case MARRON:
            case AMARILLO:
            case PROCEDURE_NAME:
            case ROJO:
                return 681;
        }
        return yyr43();
    }

    private int yys117() {
        switch (yytok) {
            case VERDE:
            case error:
            case GRIS:
            case PARAMETER:
            case AZUL:
            case BLANCO:
            case '=':
            case CIAN:
            case ENDINPUT:
            case NEGRO:
            case MARRON:
            case AMARILLO:
            case PROCEDURE_NAME:
            case ROJO:
                return 681;
        }
        return yyr44();
    }

    private int yys118() {
        switch (yytok) {
            case VERDE:
            case error:
            case GRIS:
            case PARAMETER:
            case AZUL:
            case BLANCO:
            case '=':
            case CIAN:
            case ENDINPUT:
            case NEGRO:
            case MARRON:
            case AMARILLO:
            case PROCEDURE_NAME:
            case ROJO:
                return 681;
        }
        return yyr46();
    }

    private int yys119() {
        switch (yytok) {
            case VERDE:
            case error:
            case GRIS:
            case PARAMETER:
            case AZUL:
            case BLANCO:
            case '=':
            case CIAN:
            case ENDINPUT:
            case NEGRO:
            case MARRON:
            case AMARILLO:
            case PROCEDURE_NAME:
            case ROJO:
                return 681;
        }
        return yyr47();
    }

    private int yys120() {
        switch (yytok) {
            case VERDE:
            case error:
            case GRIS:
            case PARAMETER:
            case AZUL:
            case BLANCO:
            case '=':
            case CIAN:
            case ENDINPUT:
            case NEGRO:
            case MARRON:
            case AMARILLO:
            case PROCEDURE_NAME:
            case ROJO:
                return 681;
        }
        return yyr45();
    }

    private int yys121() {
        switch (yytok) {
            case GRIS:
            case CIAN:
            case ROJO:
            case VERDE:
            case error:
            case PROCEDURE_NAME:
            case '=':
            case AZUL:
            case MARRON:
            case BLANCO:
            case PARAMETER:
            case NEGRO:
            case ENDINPUT:
            case AMARILLO:
                return 681;
            case '*':
                return 227;
            case '+':
                return 228;
            case '-':
                return 229;
            case '/':
                return 230;
        }
        return yyr103();
    }

    private int yys122() {
        switch (yytok) {
            case VERDE:
            case error:
            case GRIS:
            case PARAMETER:
            case AZUL:
            case BLANCO:
            case '=':
            case CIAN:
            case ENDINPUT:
            case NEGRO:
            case MARRON:
            case AMARILLO:
            case PROCEDURE_NAME:
            case ROJO:
                return 681;
        }
        return yyr39();
    }

    private int yys123() {
        switch (yytok) {
            case VERDE:
            case error:
            case GRIS:
            case PARAMETER:
            case AZUL:
            case BLANCO:
            case '=':
            case CIAN:
            case ENDINPUT:
            case NEGRO:
            case MARRON:
            case AMARILLO:
            case PROCEDURE_NAME:
            case ROJO:
                return 681;
        }
        return yyr32();
    }

    private int yys124() {
        switch (yytok) {
            case AZAR:
                return 30;
            case COS:
                return 35;
            case CUENTA:
                return 36;
            case DIFERENCIA:
                return 37;
            case DIVISION:
                return 38;
            case ELEGIR:
                return 40;
            case ELEMENTO:
                return 41;
            case MENOS:
                return 52;
            case POTENCIA:
                return 64;
            case PRIMERO:
                return 65;
            case PRODUCTO:
                return 66;
            case RAIZCUADRADA:
                return 67;
            case RC:
                return 68;
            case REDONDEA:
                return 70;
            case RESTO:
                return 72;
            case RUMBO:
                return 74;
            case SEN:
                return 76;
            case SENO:
                return 77;
            case SUMA:
                return 80;
            case UL:
                return 81;
            case ULTIMO:
                return 82;
            case INTEGER:
                return 102;
            case FLOAT:
                return 122;
            case IDENTIFIER:
                return 123;
            case '(':
                return 124;
        }
        return 681;
    }

    private int yys125() {
        switch (yytok) {
            case AZAR:
                return 30;
            case COS:
                return 35;
            case CUENTA:
                return 36;
            case DIFERENCIA:
                return 37;
            case DIVISION:
                return 38;
            case ELEGIR:
                return 40;
            case ELEMENTO:
                return 41;
            case MENOS:
                return 52;
            case POTENCIA:
                return 64;
            case PRIMERO:
                return 65;
            case PRODUCTO:
                return 66;
            case RAIZCUADRADA:
                return 67;
            case RC:
                return 68;
            case REDONDEA:
                return 70;
            case RESTO:
                return 72;
            case RUMBO:
                return 74;
            case SEN:
                return 76;
            case SENO:
                return 77;
            case SUMA:
                return 80;
            case UL:
                return 81;
            case ULTIMO:
                return 82;
            case INTEGER:
                return 102;
            case FLOAT:
                return 122;
            case IDENTIFIER:
                return 123;
            case '(':
                return 124;
        }
        return 681;
    }

    private int yys126() {
        switch (yytok) {
            case BLANCO:
            case error:
            case NEGRO:
            case ENDINPUT:
            case ROJO:
            case VERDE:
            case GRIS:
            case '=':
            case AZUL:
            case PARAMETER:
            case CIAN:
            case PROCEDURE_NAME:
            case AMARILLO:
            case MARRON:
                return 681;
            case AZAR:
                return 30;
            case COS:
                return 35;
            case CUENTA:
                return 36;
            case DIFERENCIA:
                return 37;
            case DIVISION:
                return 38;
            case ELEGIR:
                return 40;
            case ELEMENTO:
                return 41;
            case MENOS:
                return 52;
            case POTENCIA:
                return 64;
            case PRIMERO:
                return 65;
            case PRODUCTO:
                return 66;
            case RAIZCUADRADA:
                return 67;
            case RC:
                return 68;
            case REDONDEA:
                return 70;
            case RESTO:
                return 72;
            case RUMBO:
                return 74;
            case SEN:
                return 76;
            case SENO:
                return 77;
            case SUMA:
                return 80;
            case UL:
                return 81;
            case ULTIMO:
                return 82;
            case INTEGER:
                return 102;
            case FLOAT:
                return 122;
            case IDENTIFIER:
                return 123;
            case '(':
                return 124;
            case '*':
                return 223;
            case '+':
                return 224;
            case '-':
                return 225;
            case '/':
                return 226;
        }
        return yyr161();
    }

    private int yys127() {
        switch (yytok) {
            case VERDE:
            case error:
            case GRIS:
            case PARAMETER:
            case AZUL:
            case BLANCO:
            case '=':
            case CIAN:
            case ENDINPUT:
            case NEGRO:
            case MARRON:
            case AMARILLO:
            case PROCEDURE_NAME:
            case ROJO:
                return 681;
        }
        return yyr165();
    }

    private int yys128() {
        switch (yytok) {
            case BLANCO:
            case MARRON:
            case AMARILLO:
            case ENDINPUT:
            case ROJO:
            case NEGRO:
            case '=':
            case CIAN:
            case error:
            case PROCEDURE_NAME:
            case AZUL:
            case GRIS:
            case PARAMETER:
            case VERDE:
                return 681;
            case AZAR:
                return 30;
            case CUENTA:
                return 36;
            case REDONDEA:
                return 70;
            case RESTO:
                return 72;
            case DIFERENCIA:
                return 98;
            case ELEGIR:
                return 99;
            case ELEMENTO:
                return 100;
            case IDENTIFIER:
                return 101;
            case INTEGER:
                return 102;
            case MENOS:
                return 103;
            case POTENCIA:
                return 104;
            case PRIMERO:
                return 105;
            case PRODUCTO:
                return 106;
            case SUMA:
                return 107;
            case UL:
                return 108;
            case ULTIMO:
                return 109;
            case '(':
                return 110;
            case '*':
                return 227;
            case '+':
                return 228;
            case '-':
                return 229;
            case '/':
                return 230;
        }
        return yyr159();
    }

    private int yys129() {
        switch (yytok) {
            case VERDE:
            case error:
            case GRIS:
            case PARAMETER:
            case AZUL:
            case BLANCO:
            case '=':
            case CIAN:
            case ENDINPUT:
            case NEGRO:
            case MARRON:
            case AMARILLO:
            case PROCEDURE_NAME:
            case ROJO:
                return 681;
        }
        return yyr162();
    }

    private int yys130() {
        switch (yytok) {
            case AZAR:
                return 30;
            case COS:
                return 35;
            case CUENTA:
                return 36;
            case DIFERENCIA:
                return 37;
            case DIVISION:
                return 38;
            case ELEGIR:
                return 40;
            case ELEMENTO:
                return 41;
            case MENOS:
                return 52;
            case POTENCIA:
                return 64;
            case PRIMERO:
                return 65;
            case PRODUCTO:
                return 66;
            case RAIZCUADRADA:
                return 67;
            case RC:
                return 68;
            case REDONDEA:
                return 70;
            case RESTO:
                return 72;
            case RUMBO:
                return 74;
            case SEN:
                return 76;
            case SENO:
                return 77;
            case SUMA:
                return 80;
            case UL:
                return 81;
            case ULTIMO:
                return 82;
            case INTEGER:
                return 102;
            case FLOAT:
                return 122;
            case IDENTIFIER:
                return 123;
            case '(':
                return 124;
            case '*':
                return 223;
            case '+':
                return 224;
            case '-':
                return 225;
            case '/':
                return 226;
        }
        return 681;
    }

    private int yys131() {
        switch (yytok) {
            case AZAR:
                return 30;
            case COS:
                return 35;
            case CUENTA:
                return 36;
            case DIFERENCIA:
                return 37;
            case DIVISION:
                return 38;
            case ELEGIR:
                return 40;
            case ELEMENTO:
                return 41;
            case MENOS:
                return 52;
            case POTENCIA:
                return 64;
            case PRIMERO:
                return 65;
            case PRODUCTO:
                return 66;
            case RAIZCUADRADA:
                return 67;
            case RC:
                return 68;
            case REDONDEA:
                return 70;
            case RESTO:
                return 72;
            case RUMBO:
                return 74;
            case SEN:
                return 76;
            case SENO:
                return 77;
            case SUMA:
                return 80;
            case UL:
                return 81;
            case ULTIMO:
                return 82;
            case INTEGER:
                return 102;
            case FLOAT:
                return 122;
            case IDENTIFIER:
                return 123;
            case '(':
                return 124;
            case '*':
                return 227;
            case '+':
                return 228;
            case '-':
                return 229;
            case '/':
                return 230;
        }
        return 681;
    }

    private int yys132() {
        switch (yytok) {
            case APARECETORTUGA:
                return 26;
            case AT:
                return 27;
            case AV:
                return 28;
            case AVANZA:
                return 29;
            case AZAR:
                return 30;
            case BAJALAPIZ:
                return 31;
            case BL:
                return 32;
            case BORRAPANTALLA:
                return 33;
            case CENTRO:
                return 34;
            case COS:
                return 35;
            case CUENTA:
                return 36;
            case DIFERENCIA:
                return 37;
            case DIVISION:
                return 38;
            case EJECUTA:
                return 39;
            case ELEGIR:
                return 40;
            case ELEMENTO:
                return 41;
            case ESPERA:
                return 42;
            case GD:
                return 43;
            case GI:
                return 44;
            case GIRADERECHA:
                return 45;
            case GIRAIZQUIERDA:
                return 46;
            case IGUALES:
                return 47;
            case INC:
                return 48;
            case INIC:
                return 49;
            case MAYORQUE:
                return 50;
            case MENORQUE:
                return 51;
            case MENOS:
                return 52;
            case O:
                return 53;
            case OCULTATORTUGA:
                return 54;
            case OT:
                return 55;
            case PARA:
                return 56;
            case PONCL:
                return 57;
            case PONCOLORLAPIZ:
                return 58;
            case PONPOS:
                return 59;
            case PONRUMBO:
                return 60;
            case PONX:
                return 61;
            case PONXY:
                return 62;
            case PONY:
                return 63;
            case POTENCIA:
                return 64;
            case PRIMERO:
                return 65;
            case PRODUCTO:
                return 66;
            case RAIZCUADRADA:
                return 67;
            case RC:
                return 68;
            case RE:
                return 69;
            case REDONDEA:
                return 70;
            case REPITE:
                return 71;
            case RESTO:
                return 72;
            case RETROCEDE:
                return 73;
            case RUMBO:
                return 74;
            case SB:
                return 75;
            case SEN:
                return 76;
            case SENO:
                return 77;
            case SI:
                return 78;
            case SUBELAPIZ:
                return 79;
            case SUMA:
                return 80;
            case UL:
                return 81;
            case ULTIMO:
                return 82;
            case VAR:
                return 83;
            case Y:
                return 84;
        }
        return 681;
    }

    private int yys133() {
        switch (yytok) {
            case AZAR:
                return 30;
            case COS:
                return 35;
            case CUENTA:
                return 36;
            case DIFERENCIA:
                return 37;
            case DIVISION:
                return 38;
            case ELEGIR:
                return 40;
            case ELEMENTO:
                return 41;
            case MENOS:
                return 52;
            case POTENCIA:
                return 64;
            case PRIMERO:
                return 65;
            case PRODUCTO:
                return 66;
            case RAIZCUADRADA:
                return 67;
            case RC:
                return 68;
            case REDONDEA:
                return 70;
            case RESTO:
                return 72;
            case RUMBO:
                return 74;
            case SEN:
                return 76;
            case SENO:
                return 77;
            case SUMA:
                return 80;
            case UL:
                return 81;
            case ULTIMO:
                return 82;
            case INTEGER:
                return 102;
            case FLOAT:
                return 122;
            case IDENTIFIER:
                return 123;
            case '(':
                return 124;
        }
        return 681;
    }

    private int yys135() {
        switch (yytok) {
            case AMARILLO:
            case '[':
            case INTEGER:
            case ROJO:
            case VERDE:
            case BLANCO:
            case '(':
            case MARRON:
            case GRIS:
            case PROCEDURE_NAME:
            case ENDINPUT:
            case error:
            case '>':
            case PARAMETER:
            case '=':
            case NEGRO:
            case ')':
            case '<':
            case AZUL:
            case IDENTIFIER:
            case CIAN:
            case FLOAT:
                return 681;
            case '*':
                return 223;
            case '+':
                return 224;
            case '-':
                return 225;
            case '/':
                return 226;
        }
        return yyr133();
    }

    private int yys136() {
        switch (yytok) {
            case AMARILLO:
            case '[':
            case INTEGER:
            case ROJO:
            case VERDE:
            case BLANCO:
            case '(':
            case MARRON:
            case GRIS:
            case PROCEDURE_NAME:
            case ENDINPUT:
            case error:
            case '>':
            case PARAMETER:
            case '=':
            case NEGRO:
            case ')':
            case '<':
            case AZUL:
            case IDENTIFIER:
            case CIAN:
            case FLOAT:
                return 681;
            case '*':
                return 227;
            case '+':
                return 228;
            case '-':
                return 229;
            case '/':
                return 230;
        }
        return yyr132();
    }

    private int yys137() {
        switch (yytok) {
            case AMARILLO:
            case '[':
            case INTEGER:
            case ROJO:
            case VERDE:
            case BLANCO:
            case '(':
            case MARRON:
            case GRIS:
            case PROCEDURE_NAME:
            case ENDINPUT:
            case error:
            case '>':
            case PARAMETER:
            case '=':
            case NEGRO:
            case ')':
            case '<':
            case AZUL:
            case IDENTIFIER:
            case CIAN:
            case FLOAT:
                return 681;
            case '*':
                return 223;
            case '+':
                return 224;
            case '-':
                return 225;
            case '/':
                return 226;
        }
        return yyr121();
    }

    private int yys138() {
        switch (yytok) {
            case AMARILLO:
            case '[':
            case INTEGER:
            case ROJO:
            case VERDE:
            case BLANCO:
            case '(':
            case MARRON:
            case GRIS:
            case PROCEDURE_NAME:
            case ENDINPUT:
            case error:
            case '>':
            case PARAMETER:
            case '=':
            case NEGRO:
            case ')':
            case '<':
            case AZUL:
            case IDENTIFIER:
            case CIAN:
            case FLOAT:
                return 681;
            case '*':
                return 227;
            case '+':
                return 228;
            case '-':
                return 229;
            case '/':
                return 230;
        }
        return yyr120();
    }

    private int yys139() {
        switch (yytok) {
            case AMARILLO:
            case '[':
            case INTEGER:
            case ROJO:
            case VERDE:
            case BLANCO:
            case '(':
            case MARRON:
            case GRIS:
            case PROCEDURE_NAME:
            case ENDINPUT:
            case error:
            case '>':
            case PARAMETER:
            case '=':
            case NEGRO:
            case ')':
            case '<':
            case AZUL:
            case IDENTIFIER:
            case CIAN:
            case FLOAT:
                return 681;
            case '*':
                return 223;
            case '+':
                return 224;
            case '-':
                return 225;
            case '/':
                return 226;
        }
        return yyr125();
    }

    private int yys140() {
        switch (yytok) {
            case AMARILLO:
            case '[':
            case INTEGER:
            case ROJO:
            case VERDE:
            case BLANCO:
            case '(':
            case MARRON:
            case GRIS:
            case PROCEDURE_NAME:
            case ENDINPUT:
            case error:
            case '>':
            case PARAMETER:
            case '=':
            case NEGRO:
            case ')':
            case '<':
            case AZUL:
            case IDENTIFIER:
            case CIAN:
            case FLOAT:
                return 681;
            case '*':
                return 227;
            case '+':
                return 228;
            case '-':
                return 229;
            case '/':
                return 230;
        }
        return yyr124();
    }

    private int yys141() {
        switch (yytok) {
            case AMARILLO:
            case '[':
            case INTEGER:
            case ROJO:
            case VERDE:
            case BLANCO:
            case '(':
            case MARRON:
            case GRIS:
            case PROCEDURE_NAME:
            case ENDINPUT:
            case error:
            case '>':
            case PARAMETER:
            case '=':
            case NEGRO:
            case ')':
            case '<':
            case AZUL:
            case IDENTIFIER:
            case CIAN:
            case FLOAT:
                return 681;
            case '*':
                return 223;
            case '+':
                return 224;
            case '-':
                return 225;
            case '/':
                return 226;
        }
        return yyr119();
    }

    private int yys142() {
        switch (yytok) {
            case AMARILLO:
            case '[':
            case INTEGER:
            case ROJO:
            case VERDE:
            case BLANCO:
            case '(':
            case MARRON:
            case GRIS:
            case PROCEDURE_NAME:
            case ENDINPUT:
            case error:
            case '>':
            case PARAMETER:
            case '=':
            case NEGRO:
            case ')':
            case '<':
            case AZUL:
            case IDENTIFIER:
            case CIAN:
            case FLOAT:
                return 681;
            case '*':
                return 227;
            case '+':
                return 228;
            case '-':
                return 229;
            case '/':
                return 230;
        }
        return yyr118();
    }

    private int yys143() {
        switch (yytok) {
            case AMARILLO:
            case '[':
            case INTEGER:
            case ROJO:
            case VERDE:
            case BLANCO:
            case '(':
            case MARRON:
            case GRIS:
            case PROCEDURE_NAME:
            case ENDINPUT:
            case error:
            case '>':
            case PARAMETER:
            case '=':
            case NEGRO:
            case ')':
            case '<':
            case AZUL:
            case IDENTIFIER:
            case CIAN:
            case FLOAT:
                return 681;
            case '*':
                return 223;
            case '+':
                return 224;
            case '-':
                return 225;
            case '/':
                return 226;
        }
        return yyr123();
    }

    private int yys144() {
        switch (yytok) {
            case AMARILLO:
            case '[':
            case INTEGER:
            case ROJO:
            case VERDE:
            case BLANCO:
            case '(':
            case MARRON:
            case GRIS:
            case PROCEDURE_NAME:
            case ENDINPUT:
            case error:
            case '>':
            case PARAMETER:
            case '=':
            case NEGRO:
            case ')':
            case '<':
            case AZUL:
            case IDENTIFIER:
            case CIAN:
            case FLOAT:
                return 681;
            case '*':
                return 227;
            case '+':
                return 228;
            case '-':
                return 229;
            case '/':
                return 230;
        }
        return yyr122();
    }

    private int yys145() {
        switch (yytok) {
            case AZAR:
                return 30;
            case COS:
                return 35;
            case CUENTA:
                return 36;
            case DIFERENCIA:
                return 37;
            case DIVISION:
                return 38;
            case ELEGIR:
                return 40;
            case ELEMENTO:
                return 41;
            case MENOS:
                return 52;
            case POTENCIA:
                return 64;
            case PRIMERO:
                return 65;
            case PRODUCTO:
                return 66;
            case RAIZCUADRADA:
                return 67;
            case RC:
                return 68;
            case REDONDEA:
                return 70;
            case RESTO:
                return 72;
            case RUMBO:
                return 74;
            case SEN:
                return 76;
            case SENO:
                return 77;
            case SUMA:
                return 80;
            case UL:
                return 81;
            case ULTIMO:
                return 82;
            case INTEGER:
                return 102;
            case FLOAT:
                return 122;
            case IDENTIFIER:
                return 123;
            case '(':
                return 124;
            case '*':
                return 223;
            case '+':
                return 224;
            case '-':
                return 225;
            case '/':
                return 226;
        }
        return 681;
    }

    private int yys146() {
        switch (yytok) {
            case AZAR:
                return 30;
            case COS:
                return 35;
            case CUENTA:
                return 36;
            case DIFERENCIA:
                return 37;
            case DIVISION:
                return 38;
            case ELEGIR:
                return 40;
            case ELEMENTO:
                return 41;
            case MENOS:
                return 52;
            case POTENCIA:
                return 64;
            case PRIMERO:
                return 65;
            case PRODUCTO:
                return 66;
            case RAIZCUADRADA:
                return 67;
            case RC:
                return 68;
            case REDONDEA:
                return 70;
            case RESTO:
                return 72;
            case RUMBO:
                return 74;
            case SEN:
                return 76;
            case SENO:
                return 77;
            case SUMA:
                return 80;
            case UL:
                return 81;
            case ULTIMO:
                return 82;
            case INTEGER:
                return 102;
            case FLOAT:
                return 122;
            case IDENTIFIER:
                return 123;
            case '(':
                return 124;
            case '*':
                return 227;
            case '+':
                return 228;
            case '-':
                return 229;
            case '/':
                return 230;
        }
        return 681;
    }

    private int yys149() {
        switch (yytok) {
            case AZAR:
                return 30;
            case COS:
                return 35;
            case CUENTA:
                return 36;
            case DIFERENCIA:
                return 37;
            case DIVISION:
                return 38;
            case ELEGIR:
                return 40;
            case ELEMENTO:
                return 41;
            case MENOS:
                return 52;
            case POTENCIA:
                return 64;
            case PRIMERO:
                return 65;
            case PRODUCTO:
                return 66;
            case RAIZCUADRADA:
                return 67;
            case RC:
                return 68;
            case REDONDEA:
                return 70;
            case RESTO:
                return 72;
            case RUMBO:
                return 74;
            case SEN:
                return 76;
            case SENO:
                return 77;
            case SUMA:
                return 80;
            case UL:
                return 81;
            case ULTIMO:
                return 82;
            case INTEGER:
                return 102;
            case FLOAT:
                return 122;
            case IDENTIFIER:
                return 123;
            case '(':
                return 124;
            case '*':
                return 223;
            case '+':
                return 224;
            case '-':
                return 225;
            case '/':
                return 226;
        }
        return 681;
    }

    private int yys150() {
        switch (yytok) {
            case AZAR:
                return 30;
            case COS:
                return 35;
            case CUENTA:
                return 36;
            case DIFERENCIA:
                return 37;
            case DIVISION:
                return 38;
            case ELEGIR:
                return 40;
            case ELEMENTO:
                return 41;
            case MENOS:
                return 52;
            case POTENCIA:
                return 64;
            case PRIMERO:
                return 65;
            case PRODUCTO:
                return 66;
            case RAIZCUADRADA:
                return 67;
            case RC:
                return 68;
            case REDONDEA:
                return 70;
            case RESTO:
                return 72;
            case RUMBO:
                return 74;
            case SEN:
                return 76;
            case SENO:
                return 77;
            case SUMA:
                return 80;
            case UL:
                return 81;
            case ULTIMO:
                return 82;
            case INTEGER:
                return 102;
            case FLOAT:
                return 122;
            case IDENTIFIER:
                return 123;
            case '(':
                return 124;
            case '*':
                return 227;
            case '+':
                return 228;
            case '-':
                return 229;
            case '/':
                return 230;
        }
        return 681;
    }

    private int yys151() {
        switch (yytok) {
            case AZAR:
                return 30;
            case COS:
                return 35;
            case CUENTA:
                return 36;
            case DIFERENCIA:
                return 37;
            case DIVISION:
                return 38;
            case ELEGIR:
                return 40;
            case ELEMENTO:
                return 41;
            case MENOS:
                return 52;
            case POTENCIA:
                return 64;
            case PRIMERO:
                return 65;
            case PRODUCTO:
                return 66;
            case RAIZCUADRADA:
                return 67;
            case RC:
                return 68;
            case REDONDEA:
                return 70;
            case RESTO:
                return 72;
            case RUMBO:
                return 74;
            case SEN:
                return 76;
            case SENO:
                return 77;
            case SUMA:
                return 80;
            case UL:
                return 81;
            case ULTIMO:
                return 82;
            case INTEGER:
                return 102;
            case FLOAT:
                return 122;
            case IDENTIFIER:
                return 123;
            case '(':
                return 124;
            case '*':
                return 223;
            case '+':
                return 224;
            case '-':
                return 225;
            case '/':
                return 226;
        }
        return 681;
    }

    private int yys152() {
        switch (yytok) {
            case AZAR:
                return 30;
            case COS:
                return 35;
            case CUENTA:
                return 36;
            case DIFERENCIA:
                return 37;
            case DIVISION:
                return 38;
            case ELEGIR:
                return 40;
            case ELEMENTO:
                return 41;
            case MENOS:
                return 52;
            case POTENCIA:
                return 64;
            case PRIMERO:
                return 65;
            case PRODUCTO:
                return 66;
            case RAIZCUADRADA:
                return 67;
            case RC:
                return 68;
            case REDONDEA:
                return 70;
            case RESTO:
                return 72;
            case RUMBO:
                return 74;
            case SEN:
                return 76;
            case SENO:
                return 77;
            case SUMA:
                return 80;
            case UL:
                return 81;
            case ULTIMO:
                return 82;
            case INTEGER:
                return 102;
            case FLOAT:
                return 122;
            case IDENTIFIER:
                return 123;
            case '(':
                return 124;
            case '*':
                return 227;
            case '+':
                return 228;
            case '-':
                return 229;
            case '/':
                return 230;
        }
        return 681;
    }

    private int yys153() {
        switch (yytok) {
            case GRIS:
            case CIAN:
            case ROJO:
            case VERDE:
            case error:
            case PROCEDURE_NAME:
            case '=':
            case AZUL:
            case MARRON:
            case BLANCO:
            case PARAMETER:
            case NEGRO:
            case ENDINPUT:
            case AMARILLO:
                return 681;
            case '*':
                return 223;
            case '+':
                return 224;
            case '-':
                return 225;
            case '/':
                return 226;
        }
        return yyr105();
    }

    private int yys154() {
        switch (yytok) {
            case GRIS:
            case CIAN:
            case ROJO:
            case VERDE:
            case error:
            case PROCEDURE_NAME:
            case '=':
            case AZUL:
            case MARRON:
            case BLANCO:
            case PARAMETER:
            case NEGRO:
            case ENDINPUT:
            case AMARILLO:
                return 681;
            case '*':
                return 227;
            case '+':
                return 228;
            case '-':
                return 229;
            case '/':
                return 230;
        }
        return yyr102();
    }

    private int yys155() {
        switch (yytok) {
            case '*':
                return 223;
            case '+':
                return 224;
            case '-':
                return 225;
            case '/':
                return 226;
            case '<':
                return 259;
            case '>':
                return 260;
        }
        return 681;
    }

    private int yys156() {
        switch (yytok) {
            case '*':
                return 227;
            case '+':
                return 228;
            case '-':
                return 229;
            case '/':
                return 230;
            case '<':
                return 261;
            case '>':
                return 262;
        }
        return 681;
    }

    private int yys157() {
        switch (yytok) {
            case AZAR:
                return 30;
            case COS:
                return 35;
            case CUENTA:
                return 36;
            case DIFERENCIA:
                return 37;
            case DIVISION:
                return 38;
            case ELEGIR:
                return 40;
            case ELEMENTO:
                return 41;
            case IGUALES:
                return 47;
            case MAYORQUE:
                return 50;
            case MENORQUE:
                return 51;
            case MENOS:
                return 52;
            case O:
                return 53;
            case POTENCIA:
                return 64;
            case PRIMERO:
                return 65;
            case PRODUCTO:
                return 66;
            case RAIZCUADRADA:
                return 67;
            case RC:
                return 68;
            case REDONDEA:
                return 70;
            case RESTO:
                return 72;
            case RUMBO:
                return 74;
            case SEN:
                return 76;
            case SENO:
                return 77;
            case SUMA:
                return 80;
            case UL:
                return 81;
            case ULTIMO:
                return 82;
            case Y:
                return 84;
            case INTEGER:
                return 102;
            case FLOAT:
                return 122;
            case IDENTIFIER:
                return 123;
            case '(':
                return 124;
        }
        return 681;
    }

    private int yys158() {
        switch (yytok) {
            case MARRON:
            case ROJO:
            case AMARILLO:
            case '=':
            case '<':
            case '*':
            case VERDE:
            case ENDINPUT:
            case PROCEDURE_NAME:
            case BLANCO:
            case NEGRO:
            case PARAMETER:
            case '+':
            case ')':
            case '/':
            case error:
            case '-':
            case '>':
            case AZUL:
            case CIAN:
            case GRIS:
                return 681;
        }
        return yyr61();
    }

    private int yys159() {
        switch (yytok) {
            case AZUL:
            case ';':
            case MARRON:
            case FLOAT:
            case NEGRO:
            case '>':
            case ')':
            case '<':
            case IDENTIFIER:
            case PROCEDURE_NAME:
            case ENDINPUT:
            case '-':
            case '+':
            case ']':
            case '=':
            case '*':
            case '(':
            case '/':
            case INTEGER:
            case ROJO:
            case GRIS:
            case CIAN:
            case FIN:
            case AMARILLO:
            case '[':
            case BLANCO:
            case VERDE:
            case error:
                return 681;
        }
        return yyr30();
    }

    private int yys160() {
        switch (yytok) {
            case ROJO:
            case '*':
            case '[':
            case GRIS:
            case VERDE:
            case '/':
            case '(':
            case MARRON:
            case AZUL:
            case PROCEDURE_NAME:
            case BLANCO:
            case error:
            case '>':
            case PARAMETER:
            case '=':
            case ')':
            case '+':
            case '<':
            case ENDINPUT:
            case IDENTIFIER:
            case CIAN:
            case FLOAT:
            case AMARILLO:
            case INTEGER:
            case '-':
            case NEGRO:
                return 681;
        }
        return yyr131();
    }

    private int yys161() {
        switch (yytok) {
            case ROJO:
            case '*':
            case '[':
            case GRIS:
            case VERDE:
            case '/':
            case '(':
            case MARRON:
            case AZUL:
            case PROCEDURE_NAME:
            case BLANCO:
            case error:
            case '>':
            case PARAMETER:
            case '=':
            case ')':
            case '+':
            case '<':
            case ENDINPUT:
            case IDENTIFIER:
            case CIAN:
            case FLOAT:
            case AMARILLO:
            case INTEGER:
            case '-':
            case NEGRO:
                return 681;
        }
        return yyr85();
    }

    private int yys162() {
        switch (yytok) {
            case ROJO:
            case '*':
            case '[':
            case GRIS:
            case VERDE:
            case '/':
            case '(':
            case MARRON:
            case AZUL:
            case PROCEDURE_NAME:
            case BLANCO:
            case error:
            case '>':
            case PARAMETER:
            case '=':
            case ')':
            case '+':
            case '<':
            case ENDINPUT:
            case IDENTIFIER:
            case CIAN:
            case FLOAT:
            case AMARILLO:
            case INTEGER:
            case '-':
            case NEGRO:
                return 681;
        }
        return yyr81();
    }

    private int yys163() {
        switch (yytok) {
            case ROJO:
            case '*':
            case '[':
            case GRIS:
            case VERDE:
            case '/':
            case '(':
            case MARRON:
            case AZUL:
            case PROCEDURE_NAME:
            case BLANCO:
            case error:
            case '>':
            case PARAMETER:
            case '=':
            case ')':
            case '+':
            case '<':
            case ENDINPUT:
            case IDENTIFIER:
            case CIAN:
            case FLOAT:
            case AMARILLO:
            case INTEGER:
            case '-':
            case NEGRO:
                return 681;
        }
        return yyr80();
    }

    private int yys164() {
        switch (yytok) {
            case ROJO:
            case '*':
            case '[':
            case GRIS:
            case VERDE:
            case '/':
            case '(':
            case MARRON:
            case AZUL:
            case PROCEDURE_NAME:
            case BLANCO:
            case error:
            case '>':
            case PARAMETER:
            case '=':
            case ')':
            case '+':
            case '<':
            case ENDINPUT:
            case IDENTIFIER:
            case CIAN:
            case FLOAT:
            case AMARILLO:
            case INTEGER:
            case '-':
            case NEGRO:
                return 681;
        }
        return yyr83();
    }

    private int yys165() {
        switch (yytok) {
            case ROJO:
            case '*':
            case '[':
            case GRIS:
            case VERDE:
            case '/':
            case '(':
            case MARRON:
            case AZUL:
            case PROCEDURE_NAME:
            case BLANCO:
            case error:
            case '>':
            case PARAMETER:
            case '=':
            case ')':
            case '+':
            case '<':
            case ENDINPUT:
            case IDENTIFIER:
            case CIAN:
            case FLOAT:
            case AMARILLO:
            case INTEGER:
            case '-':
            case NEGRO:
                return 681;
        }
        return yyr84();
    }

    private int yys166() {
        switch (yytok) {
            case ROJO:
            case '*':
            case '[':
            case GRIS:
            case VERDE:
            case '/':
            case '(':
            case MARRON:
            case AZUL:
            case PROCEDURE_NAME:
            case BLANCO:
            case error:
            case '>':
            case PARAMETER:
            case '=':
            case ')':
            case '+':
            case '<':
            case ENDINPUT:
            case IDENTIFIER:
            case CIAN:
            case FLOAT:
            case AMARILLO:
            case INTEGER:
            case '-':
            case NEGRO:
                return 681;
        }
        return yyr82();
    }

    private int yys167() {
        switch (yytok) {
            case ROJO:
            case '*':
            case '[':
            case GRIS:
            case VERDE:
            case '/':
            case '(':
            case MARRON:
            case AZUL:
            case PROCEDURE_NAME:
            case BLANCO:
            case error:
            case '>':
            case PARAMETER:
            case '=':
            case ')':
            case '+':
            case '<':
            case ENDINPUT:
            case IDENTIFIER:
            case CIAN:
            case FLOAT:
            case AMARILLO:
            case INTEGER:
            case '-':
            case NEGRO:
                return 681;
        }
        return yyr86();
    }

    private int yys168() {
        switch (yytok) {
            case ROJO:
            case '*':
            case '[':
            case GRIS:
            case VERDE:
            case '/':
            case '(':
            case MARRON:
            case AZUL:
            case PROCEDURE_NAME:
            case BLANCO:
            case error:
            case '>':
            case PARAMETER:
            case '=':
            case ')':
            case '+':
            case '<':
            case ENDINPUT:
            case IDENTIFIER:
            case CIAN:
            case FLOAT:
            case AMARILLO:
            case INTEGER:
            case '-':
            case NEGRO:
                return 681;
        }
        return yyr87();
    }

    private int yys169() {
        switch (yytok) {
            case ROJO:
            case '*':
            case '[':
            case GRIS:
            case VERDE:
            case '/':
            case '(':
            case MARRON:
            case AZUL:
            case PROCEDURE_NAME:
            case BLANCO:
            case error:
            case '>':
            case PARAMETER:
            case '=':
            case ')':
            case '+':
            case '<':
            case ENDINPUT:
            case IDENTIFIER:
            case CIAN:
            case FLOAT:
            case AMARILLO:
            case INTEGER:
            case '-':
            case NEGRO:
                return 681;
        }
        return yyr88();
    }

    private int yys170() {
        switch (yytok) {
            case ROJO:
            case '*':
            case '[':
            case GRIS:
            case VERDE:
            case '/':
            case '(':
            case MARRON:
            case AZUL:
            case PROCEDURE_NAME:
            case BLANCO:
            case error:
            case '>':
            case PARAMETER:
            case '=':
            case ')':
            case '+':
            case '<':
            case ENDINPUT:
            case IDENTIFIER:
            case CIAN:
            case FLOAT:
            case AMARILLO:
            case INTEGER:
            case '-':
            case NEGRO:
                return 681;
        }
        return yyr130();
    }

    private int yys171() {
        switch (yytok) {
            case AZAR:
                return 30;
            case CUENTA:
                return 36;
            case REDONDEA:
                return 70;
            case RESTO:
                return 72;
            case DIFERENCIA:
                return 98;
            case ELEGIR:
                return 99;
            case ELEMENTO:
                return 100;
            case IDENTIFIER:
                return 101;
            case INTEGER:
                return 102;
            case MENOS:
                return 103;
            case POTENCIA:
                return 104;
            case PRIMERO:
                return 105;
            case PRODUCTO:
                return 106;
            case SUMA:
                return 107;
            case UL:
                return 108;
            case ULTIMO:
                return 109;
            case '(':
                return 110;
        }
        return 681;
    }

    private int yys172() {
        switch (yytok) {
            case AMARILLO:
            case '[':
            case INTEGER:
            case ROJO:
            case VERDE:
            case BLANCO:
            case '(':
            case MARRON:
            case GRIS:
            case PROCEDURE_NAME:
            case ENDINPUT:
            case error:
            case '>':
            case PARAMETER:
            case '=':
            case NEGRO:
            case ')':
            case '<':
            case AZUL:
            case IDENTIFIER:
            case CIAN:
            case FLOAT:
                return 681;
            case '*':
                return 223;
            case '+':
                return 224;
            case '-':
                return 225;
            case '/':
                return 226;
        }
        return yyr127();
    }

    private int yys173() {
        switch (yytok) {
            case AMARILLO:
            case '[':
            case INTEGER:
            case ROJO:
            case VERDE:
            case BLANCO:
            case '(':
            case MARRON:
            case GRIS:
            case PROCEDURE_NAME:
            case ENDINPUT:
            case error:
            case '>':
            case PARAMETER:
            case '=':
            case NEGRO:
            case ')':
            case '<':
            case AZUL:
            case IDENTIFIER:
            case CIAN:
            case FLOAT:
                return 681;
            case '*':
                return 227;
            case '+':
                return 228;
            case '-':
                return 229;
            case '/':
                return 230;
        }
        return yyr126();
    }

    private int yys174() {
        switch (yytok) {
            case INTEGER:
            case '(':
            case BLANCO:
            case ROJO:
            case VERDE:
            case '/':
            case NEGRO:
            case MARRON:
            case GRIS:
            case PROCEDURE_NAME:
            case ENDINPUT:
            case error:
            case '>':
            case PARAMETER:
            case '=':
            case '[':
            case ')':
            case '<':
            case AZUL:
            case IDENTIFIER:
            case CIAN:
            case FLOAT:
            case AMARILLO:
                return 681;
            case '*':
                return 210;
            case '+':
                return 211;
            case '-':
                return 212;
        }
        return yyr128();
    }

    private int yys175() {
        switch (yytok) {
            case AZAR:
                return 30;
            case CUENTA:
                return 36;
            case REDONDEA:
                return 70;
            case RESTO:
                return 72;
            case DIFERENCIA:
                return 98;
            case ELEGIR:
                return 99;
            case ELEMENTO:
                return 100;
            case IDENTIFIER:
                return 101;
            case INTEGER:
                return 102;
            case MENOS:
                return 103;
            case POTENCIA:
                return 104;
            case PRIMERO:
                return 105;
            case PRODUCTO:
                return 106;
            case SUMA:
                return 107;
            case UL:
                return 108;
            case ULTIMO:
                return 109;
            case '(':
                return 110;
            case '*':
                return 210;
            case '+':
                return 211;
            case '-':
                return 212;
        }
        return 681;
    }

    private int yys176() {
        switch (yytok) {
            case INTEGER:
            case '(':
            case BLANCO:
            case ROJO:
            case VERDE:
            case '/':
            case NEGRO:
            case MARRON:
            case GRIS:
            case PROCEDURE_NAME:
            case ENDINPUT:
            case error:
            case '>':
            case PARAMETER:
            case '=':
            case '[':
            case ')':
            case '<':
            case AZUL:
            case IDENTIFIER:
            case CIAN:
            case FLOAT:
            case AMARILLO:
                return 681;
            case '*':
                return 210;
            case '+':
                return 211;
            case '-':
                return 212;
        }
        return yyr129();
    }

    private int yys177() {
        switch (yytok) {
            case AZAR:
                return 30;
            case COS:
                return 35;
            case CUENTA:
                return 36;
            case DIFERENCIA:
                return 37;
            case DIVISION:
                return 38;
            case ELEGIR:
                return 40;
            case ELEMENTO:
                return 41;
            case MENOS:
                return 52;
            case POTENCIA:
                return 64;
            case PRIMERO:
                return 65;
            case PRODUCTO:
                return 66;
            case RAIZCUADRADA:
                return 67;
            case RC:
                return 68;
            case REDONDEA:
                return 70;
            case RESTO:
                return 72;
            case RUMBO:
                return 74;
            case SEN:
                return 76;
            case SENO:
                return 77;
            case SUMA:
                return 80;
            case UL:
                return 81;
            case ULTIMO:
                return 82;
            case INTEGER:
                return 102;
            case FLOAT:
                return 122;
            case IDENTIFIER:
                return 123;
            case '(':
                return 124;
            case '*':
                return 223;
            case '+':
                return 224;
            case '-':
                return 225;
            case '/':
                return 226;
        }
        return 681;
    }

    private int yys178() {
        switch (yytok) {
            case AZAR:
                return 30;
            case COS:
                return 35;
            case CUENTA:
                return 36;
            case DIFERENCIA:
                return 37;
            case DIVISION:
                return 38;
            case ELEGIR:
                return 40;
            case ELEMENTO:
                return 41;
            case MENOS:
                return 52;
            case POTENCIA:
                return 64;
            case PRIMERO:
                return 65;
            case PRODUCTO:
                return 66;
            case RAIZCUADRADA:
                return 67;
            case RC:
                return 68;
            case REDONDEA:
                return 70;
            case RESTO:
                return 72;
            case RUMBO:
                return 74;
            case SEN:
                return 76;
            case SENO:
                return 77;
            case SUMA:
                return 80;
            case UL:
                return 81;
            case ULTIMO:
                return 82;
            case INTEGER:
                return 102;
            case FLOAT:
                return 122;
            case IDENTIFIER:
                return 123;
            case '(':
                return 124;
            case '*':
                return 227;
            case '+':
                return 228;
            case '-':
                return 229;
            case '/':
                return 230;
        }
        return 681;
    }

    private int yys179() {
        switch (yytok) {
            case AZAR:
                return 30;
            case COS:
                return 35;
            case CUENTA:
                return 36;
            case DIFERENCIA:
                return 37;
            case DIVISION:
                return 38;
            case ELEGIR:
                return 40;
            case ELEMENTO:
                return 41;
            case MENOS:
                return 52;
            case POTENCIA:
                return 64;
            case PRIMERO:
                return 65;
            case PRODUCTO:
                return 66;
            case RAIZCUADRADA:
                return 67;
            case RC:
                return 68;
            case REDONDEA:
                return 70;
            case RESTO:
                return 72;
            case RUMBO:
                return 74;
            case SEN:
                return 76;
            case SENO:
                return 77;
            case SUMA:
                return 80;
            case UL:
                return 81;
            case ULTIMO:
                return 82;
            case INTEGER:
                return 102;
            case FLOAT:
                return 122;
            case IDENTIFIER:
                return 123;
            case '(':
                return 124;
        }
        return 681;
    }

    private int yys180() {
        switch (yytok) {
            case VERDE:
            case error:
            case GRIS:
            case PARAMETER:
            case AZUL:
            case BLANCO:
            case '=':
            case CIAN:
            case ENDINPUT:
            case NEGRO:
            case MARRON:
            case AMARILLO:
            case PROCEDURE_NAME:
            case ROJO:
                return 681;
        }
        return yyr166();
    }

    private int yys181() {
        switch (yytok) {
            case VERDE:
            case error:
            case GRIS:
            case PARAMETER:
            case AZUL:
            case BLANCO:
            case '=':
            case CIAN:
            case ENDINPUT:
            case NEGRO:
            case MARRON:
            case AMARILLO:
            case PROCEDURE_NAME:
            case ROJO:
                return 681;
        }
        return yyr163();
    }

    private int yys182() {
        switch (yytok) {
            case GRIS:
            case CIAN:
            case ROJO:
            case VERDE:
            case error:
            case PROCEDURE_NAME:
            case '=':
            case AZUL:
            case MARRON:
            case BLANCO:
            case PARAMETER:
            case NEGRO:
            case ENDINPUT:
            case AMARILLO:
                return 681;
            case '*':
                return 223;
            case '+':
                return 224;
            case '-':
                return 225;
            case '/':
                return 226;
        }
        return yyr107();
    }

    private int yys183() {
        switch (yytok) {
            case GRIS:
            case CIAN:
            case ROJO:
            case VERDE:
            case error:
            case PROCEDURE_NAME:
            case '=':
            case AZUL:
            case MARRON:
            case BLANCO:
            case PARAMETER:
            case NEGRO:
            case ENDINPUT:
            case AMARILLO:
                return 681;
            case '*':
                return 227;
            case '+':
                return 228;
            case '-':
                return 229;
            case '/':
                return 230;
        }
        return yyr106();
    }

    private int yys184() {
        switch (yytok) {
            case GRIS:
            case CIAN:
            case ROJO:
            case VERDE:
            case error:
            case PROCEDURE_NAME:
            case '=':
            case AZUL:
            case MARRON:
            case BLANCO:
            case PARAMETER:
            case NEGRO:
            case ENDINPUT:
            case AMARILLO:
                return 681;
            case '*':
                return 223;
            case '+':
                return 224;
            case '-':
                return 225;
            case '/':
                return 226;
        }
        return yyr109();
    }

    private int yys185() {
        switch (yytok) {
            case GRIS:
            case CIAN:
            case ROJO:
            case VERDE:
            case error:
            case PROCEDURE_NAME:
            case '=':
            case AZUL:
            case MARRON:
            case BLANCO:
            case PARAMETER:
            case NEGRO:
            case ENDINPUT:
            case AMARILLO:
                return 681;
            case '*':
                return 227;
            case '+':
                return 228;
            case '-':
                return 229;
            case '/':
                return 230;
        }
        return yyr108();
    }

    private int yys186() {
        switch (yytok) {
            case INTEGER:
            case '(':
            case BLANCO:
            case ROJO:
            case VERDE:
            case '/':
            case NEGRO:
            case MARRON:
            case GRIS:
            case PROCEDURE_NAME:
            case ENDINPUT:
            case error:
            case '>':
            case PARAMETER:
            case '=':
            case '[':
            case ')':
            case '<':
            case AZUL:
            case IDENTIFIER:
            case CIAN:
            case FLOAT:
            case AMARILLO:
                return 681;
            case '*':
                return 210;
            case '+':
                return 211;
            case '-':
                return 212;
        }
        return yyr117();
    }

    private int yys187() {
        switch (yytok) {
            case GRIS:
            case CIAN:
            case ROJO:
            case VERDE:
            case error:
            case PROCEDURE_NAME:
            case '=':
            case AZUL:
            case MARRON:
            case BLANCO:
            case PARAMETER:
            case NEGRO:
            case ENDINPUT:
            case AMARILLO:
                return 681;
            case '*':
                return 223;
            case '+':
                return 224;
            case '-':
                return 225;
            case '/':
                return 226;
        }
        return yyr100();
    }

    private int yys190() {
        switch (yytok) {
            case AZAR:
                return 30;
            case CUENTA:
                return 36;
            case REDONDEA:
                return 70;
            case RESTO:
                return 72;
            case DIFERENCIA:
                return 98;
            case ELEGIR:
                return 99;
            case ELEMENTO:
                return 100;
            case IDENTIFIER:
                return 101;
            case INTEGER:
                return 102;
            case MENOS:
                return 103;
            case POTENCIA:
                return 104;
            case PRIMERO:
                return 105;
            case PRODUCTO:
                return 106;
            case SUMA:
                return 107;
            case UL:
                return 108;
            case ULTIMO:
                return 109;
            case '(':
                return 110;
            case '*':
                return 210;
            case '+':
                return 211;
            case '-':
                return 212;
        }
        return 681;
    }

    private int yys191() {
        switch (yytok) {
            case INTEGER:
            case '(':
            case BLANCO:
            case ROJO:
            case VERDE:
            case '/':
            case NEGRO:
            case MARRON:
            case GRIS:
            case PROCEDURE_NAME:
            case ENDINPUT:
            case error:
            case '>':
            case PARAMETER:
            case '=':
            case '[':
            case ')':
            case '<':
            case AZUL:
            case IDENTIFIER:
            case CIAN:
            case FLOAT:
            case AMARILLO:
                return 681;
            case '*':
                return 210;
            case '+':
                return 211;
            case '-':
                return 212;
        }
        return yyr116();
    }

    private int yys192() {
        switch (yytok) {
            case GRIS:
            case CIAN:
            case ROJO:
            case VERDE:
            case error:
            case PROCEDURE_NAME:
            case '=':
            case AZUL:
            case MARRON:
            case BLANCO:
            case PARAMETER:
            case NEGRO:
            case ENDINPUT:
            case AMARILLO:
                return 681;
            case '*':
                return 223;
            case '+':
                return 224;
            case '-':
                return 225;
            case '/':
                return 226;
        }
        return yyr113();
    }

    private int yys193() {
        switch (yytok) {
            case GRIS:
            case CIAN:
            case ROJO:
            case VERDE:
            case error:
            case PROCEDURE_NAME:
            case '=':
            case AZUL:
            case MARRON:
            case BLANCO:
            case PARAMETER:
            case NEGRO:
            case ENDINPUT:
            case AMARILLO:
                return 681;
            case '*':
                return 227;
            case '+':
                return 228;
            case '-':
                return 229;
            case '/':
                return 230;
        }
        return yyr112();
    }

    private int yys194() {
        switch (yytok) {
            case GRIS:
            case CIAN:
            case ROJO:
            case VERDE:
            case error:
            case PROCEDURE_NAME:
            case '=':
            case AZUL:
            case MARRON:
            case BLANCO:
            case PARAMETER:
            case NEGRO:
            case ENDINPUT:
            case AMARILLO:
                return 681;
            case '*':
                return 223;
            case '+':
                return 224;
            case '-':
                return 225;
            case '/':
                return 226;
        }
        return yyr111();
    }

    private int yys195() {
        switch (yytok) {
            case GRIS:
            case CIAN:
            case ROJO:
            case VERDE:
            case error:
            case PROCEDURE_NAME:
            case '=':
            case AZUL:
            case MARRON:
            case BLANCO:
            case PARAMETER:
            case NEGRO:
            case ENDINPUT:
            case AMARILLO:
                return 681;
            case '*':
                return 227;
            case '+':
                return 228;
            case '-':
                return 229;
            case '/':
                return 230;
        }
        return yyr110();
    }

    private int yys197() {
        switch (yytok) {
            case VERDE:
            case error:
            case GRIS:
            case PARAMETER:
            case AZUL:
            case BLANCO:
            case '=':
            case CIAN:
            case ENDINPUT:
            case NEGRO:
            case MARRON:
            case AMARILLO:
            case PROCEDURE_NAME:
            case ROJO:
                return 681;
        }
        return yyr167();
    }

    private int yys198() {
        switch (yytok) {
            case VERDE:
            case error:
            case GRIS:
            case PARAMETER:
            case AZUL:
            case BLANCO:
            case '=':
            case CIAN:
            case ENDINPUT:
            case NEGRO:
            case MARRON:
            case AMARILLO:
            case PROCEDURE_NAME:
            case ROJO:
                return 681;
        }
        return yyr164();
    }

    private int yys199() {
        switch (yytok) {
            case AZAR:
                return 30;
            case COS:
                return 35;
            case CUENTA:
                return 36;
            case DIFERENCIA:
                return 37;
            case DIVISION:
                return 38;
            case ELEGIR:
                return 40;
            case ELEMENTO:
                return 41;
            case MENOS:
                return 52;
            case POTENCIA:
                return 64;
            case PRIMERO:
                return 65;
            case PRODUCTO:
                return 66;
            case RAIZCUADRADA:
                return 67;
            case RC:
                return 68;
            case REDONDEA:
                return 70;
            case RESTO:
                return 72;
            case RUMBO:
                return 74;
            case SEN:
                return 76;
            case SENO:
                return 77;
            case SUMA:
                return 80;
            case UL:
                return 81;
            case ULTIMO:
                return 82;
            case INTEGER:
                return 102;
            case FLOAT:
                return 122;
            case IDENTIFIER:
                return 123;
            case '(':
                return 124;
        }
        return 681;
    }

    private int yys200() {
        switch (yytok) {
            case AZAR:
                return 30;
            case COS:
                return 35;
            case CUENTA:
                return 36;
            case DIFERENCIA:
                return 37;
            case DIVISION:
                return 38;
            case ELEGIR:
                return 40;
            case ELEMENTO:
                return 41;
            case MENOS:
                return 52;
            case POTENCIA:
                return 64;
            case PRIMERO:
                return 65;
            case PRODUCTO:
                return 66;
            case RAIZCUADRADA:
                return 67;
            case RC:
                return 68;
            case REDONDEA:
                return 70;
            case RESTO:
                return 72;
            case RUMBO:
                return 74;
            case SEN:
                return 76;
            case SENO:
                return 77;
            case SUMA:
                return 80;
            case UL:
                return 81;
            case ULTIMO:
                return 82;
            case INTEGER:
                return 102;
            case FLOAT:
                return 122;
            case IDENTIFIER:
                return 123;
            case '(':
                return 124;
        }
        return 681;
    }

    private int yys201() {
        switch (yytok) {
            case NEGRO:
            case '*':
            case ROJO:
            case GRIS:
            case VERDE:
            case '/':
            case '[':
            case MARRON:
            case AZUL:
            case PROCEDURE_NAME:
            case BLANCO:
            case error:
            case '>':
            case PARAMETER:
            case '(':
            case ')':
            case '+':
            case '<':
            case ENDINPUT:
            case IDENTIFIER:
            case CIAN:
            case FLOAT:
            case AMARILLO:
            case INTEGER:
            case '-':
                return 681;
            case '=':
                return 277;
        }
        return yyr50();
    }

    private int yys202() {
        switch (yytok) {
            case AZAR:
                return 30;
            case COS:
                return 35;
            case CUENTA:
                return 36;
            case DIFERENCIA:
                return 37;
            case DIVISION:
                return 38;
            case ELEGIR:
                return 40;
            case ELEMENTO:
                return 41;
            case IGUALES:
                return 47;
            case MAYORQUE:
                return 50;
            case MENORQUE:
                return 51;
            case MENOS:
                return 52;
            case O:
                return 53;
            case POTENCIA:
                return 64;
            case PRIMERO:
                return 65;
            case PRODUCTO:
                return 66;
            case RAIZCUADRADA:
                return 67;
            case RC:
                return 68;
            case REDONDEA:
                return 70;
            case RESTO:
                return 72;
            case RUMBO:
                return 74;
            case SEN:
                return 76;
            case SENO:
                return 77;
            case SUMA:
                return 80;
            case UL:
                return 81;
            case ULTIMO:
                return 82;
            case Y:
                return 84;
            case INTEGER:
                return 102;
            case FLOAT:
                return 122;
            case IDENTIFIER:
                return 123;
            case '(':
                return 124;
        }
        return 681;
    }

    private int yys205() {
        switch (yytok) {
            case APARECETORTUGA:
                return 26;
            case AT:
                return 27;
            case AV:
                return 28;
            case AVANZA:
                return 29;
            case AZAR:
                return 30;
            case BAJALAPIZ:
                return 31;
            case BL:
                return 32;
            case BORRAPANTALLA:
                return 33;
            case CENTRO:
                return 34;
            case COS:
                return 35;
            case CUENTA:
                return 36;
            case DIFERENCIA:
                return 37;
            case DIVISION:
                return 38;
            case EJECUTA:
                return 39;
            case ELEGIR:
                return 40;
            case ELEMENTO:
                return 41;
            case ESPERA:
                return 42;
            case GD:
                return 43;
            case GI:
                return 44;
            case GIRADERECHA:
                return 45;
            case GIRAIZQUIERDA:
                return 46;
            case IGUALES:
                return 47;
            case INC:
                return 48;
            case INIC:
                return 49;
            case MAYORQUE:
                return 50;
            case MENORQUE:
                return 51;
            case MENOS:
                return 52;
            case O:
                return 53;
            case OCULTATORTUGA:
                return 54;
            case OT:
                return 55;
            case PARA:
                return 56;
            case PONCL:
                return 57;
            case PONCOLORLAPIZ:
                return 58;
            case PONPOS:
                return 59;
            case PONRUMBO:
                return 60;
            case PONX:
                return 61;
            case PONXY:
                return 62;
            case PONY:
                return 63;
            case POTENCIA:
                return 64;
            case PRIMERO:
                return 65;
            case PRODUCTO:
                return 66;
            case RAIZCUADRADA:
                return 67;
            case RC:
                return 68;
            case RE:
                return 69;
            case REDONDEA:
                return 70;
            case REPITE:
                return 71;
            case RESTO:
                return 72;
            case RETROCEDE:
                return 73;
            case RUMBO:
                return 74;
            case SB:
                return 75;
            case SEN:
                return 76;
            case SENO:
                return 77;
            case SI:
                return 78;
            case SUBELAPIZ:
                return 79;
            case SUMA:
                return 80;
            case UL:
                return 81;
            case ULTIMO:
                return 82;
            case VAR:
                return 83;
            case Y:
                return 84;
            case ']':
                return yyr169();
        }
        return 681;
    }

    private int yys207() {
        switch (yytok) {
            case ROJO:
            case '*':
            case '[':
            case GRIS:
            case VERDE:
            case '/':
            case '(':
            case MARRON:
            case AZUL:
            case PROCEDURE_NAME:
            case BLANCO:
            case error:
            case '>':
            case PARAMETER:
            case '=':
            case ')':
            case '+':
            case '<':
            case ENDINPUT:
            case IDENTIFIER:
            case CIAN:
            case FLOAT:
            case AMARILLO:
            case INTEGER:
            case '-':
            case NEGRO:
                return 681;
        }
        return yyr28();
    }

    private int yys209() {
        switch (yytok) {
            case FLOAT:
            case ';':
            case MARRON:
            case GRIS:
            case '-':
            case ']':
            case ')':
            case '<':
            case ROJO:
            case CIAN:
            case PARAMETER:
            case BLANCO:
            case error:
            case '>':
            case '=':
            case '*':
            case '(':
            case '/':
            case INTEGER:
            case AMARILLO:
            case AZUL:
            case PROCEDURE_NAME:
            case IDENTIFIER:
            case FIN:
            case ENDINPUT:
            case '[':
            case NEGRO:
            case VERDE:
            case '+':
                return 681;
        }
        return yyr24();
    }

    private int yys210() {
        switch (yytok) {
            case AZAR:
                return 30;
            case CUENTA:
                return 36;
            case REDONDEA:
                return 70;
            case RESTO:
                return 72;
            case DIFERENCIA:
                return 98;
            case ELEGIR:
                return 99;
            case ELEMENTO:
                return 100;
            case IDENTIFIER:
                return 101;
            case INTEGER:
                return 102;
            case MENOS:
                return 103;
            case POTENCIA:
                return 104;
            case PRIMERO:
                return 105;
            case PRODUCTO:
                return 106;
            case SUMA:
                return 107;
            case UL:
                return 108;
            case ULTIMO:
                return 109;
            case '(':
                return 110;
        }
        return 681;
    }

    private int yys211() {
        switch (yytok) {
            case AZAR:
                return 30;
            case CUENTA:
                return 36;
            case REDONDEA:
                return 70;
            case RESTO:
                return 72;
            case DIFERENCIA:
                return 98;
            case ELEGIR:
                return 99;
            case ELEMENTO:
                return 100;
            case IDENTIFIER:
                return 101;
            case INTEGER:
                return 102;
            case MENOS:
                return 103;
            case POTENCIA:
                return 104;
            case PRIMERO:
                return 105;
            case PRODUCTO:
                return 106;
            case SUMA:
                return 107;
            case UL:
                return 108;
            case ULTIMO:
                return 109;
            case '(':
                return 110;
        }
        return 681;
    }

    private int yys212() {
        switch (yytok) {
            case AZAR:
                return 30;
            case CUENTA:
                return 36;
            case REDONDEA:
                return 70;
            case RESTO:
                return 72;
            case DIFERENCIA:
                return 98;
            case ELEGIR:
                return 99;
            case ELEMENTO:
                return 100;
            case IDENTIFIER:
                return 101;
            case INTEGER:
                return 102;
            case MENOS:
                return 103;
            case POTENCIA:
                return 104;
            case PRIMERO:
                return 105;
            case PRODUCTO:
                return 106;
            case SUMA:
                return 107;
            case UL:
                return 108;
            case ULTIMO:
                return 109;
            case '(':
                return 110;
        }
        return 681;
    }

    private int yys213() {
        switch (yytok) {
            case PARAMETER:
            case error:
            case '=':
            case BLANCO:
            case AMARILLO:
            case VERDE:
            case GRIS:
            case AZUL:
            case PROCEDURE_NAME:
            case ROJO:
            case ENDINPUT:
            case CIAN:
            case MARRON:
            case NEGRO:
                return 681;
            case AZAR:
                return 30;
            case CUENTA:
                return 36;
            case REDONDEA:
                return 70;
            case RESTO:
                return 72;
            case DIFERENCIA:
                return 98;
            case ELEGIR:
                return 99;
            case ELEMENTO:
                return 100;
            case IDENTIFIER:
                return 101;
            case INTEGER:
                return 102;
            case MENOS:
                return 103;
            case POTENCIA:
                return 104;
            case PRIMERO:
                return 105;
            case PRODUCTO:
                return 106;
            case SUMA:
                return 107;
            case UL:
                return 108;
            case ULTIMO:
                return 109;
            case '(':
                return 110;
            case '*':
                return 210;
            case '+':
                return 211;
            case '-':
                return 212;
        }
        return yyr159();
    }

    private int yys214() {
        switch (yytok) {
            case AZAR:
                return 30;
            case CUENTA:
                return 36;
            case REDONDEA:
                return 70;
            case RESTO:
                return 72;
            case DIFERENCIA:
                return 98;
            case ELEGIR:
                return 99;
            case ELEMENTO:
                return 100;
            case IDENTIFIER:
                return 101;
            case INTEGER:
                return 102;
            case MENOS:
                return 103;
            case POTENCIA:
                return 104;
            case PRIMERO:
                return 105;
            case PRODUCTO:
                return 106;
            case SUMA:
                return 107;
            case UL:
                return 108;
            case ULTIMO:
                return 109;
            case '(':
                return 110;
        }
        return 681;
    }

    private int yys216() {
        switch (yytok) {
            case GRIS:
            case ROJO:
            case error:
            case VERDE:
            case BLANCO:
            case CIAN:
            case '=':
            case AZUL:
            case AMARILLO:
            case MARRON:
            case PARAMETER:
            case NEGRO:
            case ENDINPUT:
            case PROCEDURE_NAME:
                return 681;
            case '*':
                return 210;
            case '+':
                return 211;
            case '-':
                return 212;
        }
        return yyr102();
    }

    private int yys217() {
        switch (yytok) {
            case AZAR:
                return 30;
            case CUENTA:
                return 36;
            case REDONDEA:
                return 70;
            case RESTO:
                return 72;
            case DIFERENCIA:
                return 98;
            case ELEGIR:
                return 99;
            case ELEMENTO:
                return 100;
            case IDENTIFIER:
                return 101;
            case INTEGER:
                return 102;
            case MENOS:
                return 103;
            case POTENCIA:
                return 104;
            case PRIMERO:
                return 105;
            case PRODUCTO:
                return 106;
            case SUMA:
                return 107;
            case UL:
                return 108;
            case ULTIMO:
                return 109;
            case '(':
                return 110;
            case '*':
                return 210;
            case '+':
                return 211;
            case '-':
                return 212;
        }
        return 681;
    }

    private int yys218() {
        switch (yytok) {
            case AZAR:
                return 30;
            case CUENTA:
                return 36;
            case REDONDEA:
                return 70;
            case RESTO:
                return 72;
            case DIFERENCIA:
                return 98;
            case ELEGIR:
                return 99;
            case ELEMENTO:
                return 100;
            case IDENTIFIER:
                return 101;
            case INTEGER:
                return 102;
            case MENOS:
                return 103;
            case POTENCIA:
                return 104;
            case PRIMERO:
                return 105;
            case PRODUCTO:
                return 106;
            case SUMA:
                return 107;
            case UL:
                return 108;
            case ULTIMO:
                return 109;
            case '(':
                return 110;
        }
        return 681;
    }

    private int yys219() {
        switch (yytok) {
            case AZAR:
                return 30;
            case CUENTA:
                return 36;
            case REDONDEA:
                return 70;
            case RESTO:
                return 72;
            case DIFERENCIA:
                return 98;
            case ELEGIR:
                return 99;
            case ELEMENTO:
                return 100;
            case IDENTIFIER:
                return 101;
            case INTEGER:
                return 102;
            case MENOS:
                return 103;
            case POTENCIA:
                return 104;
            case PRIMERO:
                return 105;
            case PRODUCTO:
                return 106;
            case SUMA:
                return 107;
            case UL:
                return 108;
            case ULTIMO:
                return 109;
            case '(':
                return 110;
        }
        return 681;
    }

    private int yys220() {
        switch (yytok) {
            case AZAR:
                return 30;
            case CUENTA:
                return 36;
            case REDONDEA:
                return 70;
            case RESTO:
                return 72;
            case DIFERENCIA:
                return 98;
            case ELEGIR:
                return 99;
            case ELEMENTO:
                return 100;
            case IDENTIFIER:
                return 101;
            case INTEGER:
                return 102;
            case MENOS:
                return 103;
            case POTENCIA:
                return 104;
            case PRIMERO:
                return 105;
            case PRODUCTO:
                return 106;
            case SUMA:
                return 107;
            case UL:
                return 108;
            case ULTIMO:
                return 109;
            case '(':
                return 110;
        }
        return 681;
    }

    private int yys223() {
        switch (yytok) {
            case AZAR:
                return 30;
            case COS:
                return 35;
            case CUENTA:
                return 36;
            case DIFERENCIA:
                return 37;
            case DIVISION:
                return 38;
            case ELEGIR:
                return 40;
            case ELEMENTO:
                return 41;
            case MENOS:
                return 52;
            case POTENCIA:
                return 64;
            case PRIMERO:
                return 65;
            case PRODUCTO:
                return 66;
            case RAIZCUADRADA:
                return 67;
            case RC:
                return 68;
            case REDONDEA:
                return 70;
            case RESTO:
                return 72;
            case RUMBO:
                return 74;
            case SEN:
                return 76;
            case SENO:
                return 77;
            case SUMA:
                return 80;
            case UL:
                return 81;
            case ULTIMO:
                return 82;
            case INTEGER:
                return 102;
            case FLOAT:
                return 122;
            case IDENTIFIER:
                return 123;
            case '(':
                return 124;
        }
        return 681;
    }

    private int yys224() {
        switch (yytok) {
            case AZAR:
                return 30;
            case COS:
                return 35;
            case CUENTA:
                return 36;
            case DIFERENCIA:
                return 37;
            case DIVISION:
                return 38;
            case ELEGIR:
                return 40;
            case ELEMENTO:
                return 41;
            case MENOS:
                return 52;
            case POTENCIA:
                return 64;
            case PRIMERO:
                return 65;
            case PRODUCTO:
                return 66;
            case RAIZCUADRADA:
                return 67;
            case RC:
                return 68;
            case REDONDEA:
                return 70;
            case RESTO:
                return 72;
            case RUMBO:
                return 74;
            case SEN:
                return 76;
            case SENO:
                return 77;
            case SUMA:
                return 80;
            case UL:
                return 81;
            case ULTIMO:
                return 82;
            case INTEGER:
                return 102;
            case FLOAT:
                return 122;
            case IDENTIFIER:
                return 123;
            case '(':
                return 124;
        }
        return 681;
    }

    private int yys225() {
        switch (yytok) {
            case AZAR:
                return 30;
            case COS:
                return 35;
            case CUENTA:
                return 36;
            case DIFERENCIA:
                return 37;
            case DIVISION:
                return 38;
            case ELEGIR:
                return 40;
            case ELEMENTO:
                return 41;
            case MENOS:
                return 52;
            case POTENCIA:
                return 64;
            case PRIMERO:
                return 65;
            case PRODUCTO:
                return 66;
            case RAIZCUADRADA:
                return 67;
            case RC:
                return 68;
            case REDONDEA:
                return 70;
            case RESTO:
                return 72;
            case RUMBO:
                return 74;
            case SEN:
                return 76;
            case SENO:
                return 77;
            case SUMA:
                return 80;
            case UL:
                return 81;
            case ULTIMO:
                return 82;
            case INTEGER:
                return 102;
            case FLOAT:
                return 122;
            case IDENTIFIER:
                return 123;
            case '(':
                return 124;
        }
        return 681;
    }

    private int yys226() {
        switch (yytok) {
            case AZAR:
                return 30;
            case COS:
                return 35;
            case CUENTA:
                return 36;
            case DIFERENCIA:
                return 37;
            case DIVISION:
                return 38;
            case ELEGIR:
                return 40;
            case ELEMENTO:
                return 41;
            case MENOS:
                return 52;
            case POTENCIA:
                return 64;
            case PRIMERO:
                return 65;
            case PRODUCTO:
                return 66;
            case RAIZCUADRADA:
                return 67;
            case RC:
                return 68;
            case REDONDEA:
                return 70;
            case RESTO:
                return 72;
            case RUMBO:
                return 74;
            case SEN:
                return 76;
            case SENO:
                return 77;
            case SUMA:
                return 80;
            case UL:
                return 81;
            case ULTIMO:
                return 82;
            case INTEGER:
                return 102;
            case FLOAT:
                return 122;
            case IDENTIFIER:
                return 123;
            case '(':
                return 124;
        }
        return 681;
    }

    private int yys227() {
        switch (yytok) {
            case AZAR:
                return 30;
            case COS:
                return 35;
            case CUENTA:
                return 36;
            case DIFERENCIA:
                return 37;
            case DIVISION:
                return 38;
            case ELEGIR:
                return 40;
            case ELEMENTO:
                return 41;
            case MENOS:
                return 52;
            case POTENCIA:
                return 64;
            case PRIMERO:
                return 65;
            case PRODUCTO:
                return 66;
            case RAIZCUADRADA:
                return 67;
            case RC:
                return 68;
            case REDONDEA:
                return 70;
            case RESTO:
                return 72;
            case RUMBO:
                return 74;
            case SEN:
                return 76;
            case SENO:
                return 77;
            case SUMA:
                return 80;
            case UL:
                return 81;
            case ULTIMO:
                return 82;
            case INTEGER:
                return 102;
            case FLOAT:
                return 122;
            case IDENTIFIER:
                return 123;
            case '(':
                return 124;
        }
        return 681;
    }

    private int yys228() {
        switch (yytok) {
            case AZAR:
                return 30;
            case COS:
                return 35;
            case CUENTA:
                return 36;
            case DIFERENCIA:
                return 37;
            case DIVISION:
                return 38;
            case ELEGIR:
                return 40;
            case ELEMENTO:
                return 41;
            case MENOS:
                return 52;
            case POTENCIA:
                return 64;
            case PRIMERO:
                return 65;
            case PRODUCTO:
                return 66;
            case RAIZCUADRADA:
                return 67;
            case RC:
                return 68;
            case REDONDEA:
                return 70;
            case RESTO:
                return 72;
            case RUMBO:
                return 74;
            case SEN:
                return 76;
            case SENO:
                return 77;
            case SUMA:
                return 80;
            case UL:
                return 81;
            case ULTIMO:
                return 82;
            case INTEGER:
                return 102;
            case FLOAT:
                return 122;
            case IDENTIFIER:
                return 123;
            case '(':
                return 124;
        }
        return 681;
    }

    private int yys229() {
        switch (yytok) {
            case AZAR:
                return 30;
            case COS:
                return 35;
            case CUENTA:
                return 36;
            case DIFERENCIA:
                return 37;
            case DIVISION:
                return 38;
            case ELEGIR:
                return 40;
            case ELEMENTO:
                return 41;
            case MENOS:
                return 52;
            case POTENCIA:
                return 64;
            case PRIMERO:
                return 65;
            case PRODUCTO:
                return 66;
            case RAIZCUADRADA:
                return 67;
            case RC:
                return 68;
            case REDONDEA:
                return 70;
            case RESTO:
                return 72;
            case RUMBO:
                return 74;
            case SEN:
                return 76;
            case SENO:
                return 77;
            case SUMA:
                return 80;
            case UL:
                return 81;
            case ULTIMO:
                return 82;
            case INTEGER:
                return 102;
            case FLOAT:
                return 122;
            case IDENTIFIER:
                return 123;
            case '(':
                return 124;
        }
        return 681;
    }

    private int yys230() {
        switch (yytok) {
            case AZAR:
                return 30;
            case COS:
                return 35;
            case CUENTA:
                return 36;
            case DIFERENCIA:
                return 37;
            case DIVISION:
                return 38;
            case ELEGIR:
                return 40;
            case ELEMENTO:
                return 41;
            case MENOS:
                return 52;
            case POTENCIA:
                return 64;
            case PRIMERO:
                return 65;
            case PRODUCTO:
                return 66;
            case RAIZCUADRADA:
                return 67;
            case RC:
                return 68;
            case REDONDEA:
                return 70;
            case RESTO:
                return 72;
            case RUMBO:
                return 74;
            case SEN:
                return 76;
            case SENO:
                return 77;
            case SUMA:
                return 80;
            case UL:
                return 81;
            case ULTIMO:
                return 82;
            case INTEGER:
                return 102;
            case FLOAT:
                return 122;
            case IDENTIFIER:
                return 123;
            case '(':
                return 124;
        }
        return 681;
    }

    private int yys235() {
        switch (yytok) {
            case VERDE:
            case error:
            case GRIS:
            case PARAMETER:
            case AZUL:
            case BLANCO:
            case '=':
            case CIAN:
            case ENDINPUT:
            case NEGRO:
            case MARRON:
            case AMARILLO:
            case PROCEDURE_NAME:
            case ROJO:
                return 681;
        }
        return yyr160();
    }

    private int yys236() {
        switch (yytok) {
            case VERDE:
            case error:
            case GRIS:
            case PARAMETER:
            case AZUL:
            case BLANCO:
            case '=':
            case CIAN:
            case ENDINPUT:
            case NEGRO:
            case MARRON:
            case AMARILLO:
            case PROCEDURE_NAME:
            case ROJO:
                return 681;
        }
        return yyr158();
    }

    private int yys237() {
        switch (yytok) {
            case GRIS:
            case CIAN:
            case ROJO:
            case VERDE:
            case error:
            case PROCEDURE_NAME:
            case '=':
            case AZUL:
            case MARRON:
            case BLANCO:
            case PARAMETER:
            case NEGRO:
            case ENDINPUT:
            case AMARILLO:
                return 681;
            case '*':
                return 223;
            case '+':
                return 224;
            case '-':
                return 225;
            case '/':
                return 226;
        }
        return yyr142();
    }

    private int yys238() {
        switch (yytok) {
            case GRIS:
            case CIAN:
            case ROJO:
            case VERDE:
            case error:
            case PROCEDURE_NAME:
            case '=':
            case AZUL:
            case MARRON:
            case BLANCO:
            case PARAMETER:
            case NEGRO:
            case ENDINPUT:
            case AMARILLO:
                return 681;
            case '*':
                return 227;
            case '+':
                return 228;
            case '-':
                return 229;
            case '/':
                return 230;
        }
        return yyr140();
    }

    private int yys239() {
        switch (yytok) {
            case GRIS:
            case CIAN:
            case ROJO:
            case VERDE:
            case error:
            case PROCEDURE_NAME:
            case '=':
            case AZUL:
            case MARRON:
            case BLANCO:
            case PARAMETER:
            case NEGRO:
            case ENDINPUT:
            case AMARILLO:
                return 681;
            case '*':
                return 223;
            case '+':
                return 224;
            case '-':
                return 225;
            case '/':
                return 226;
        }
        return yyr141();
    }

    private int yys240() {
        switch (yytok) {
            case GRIS:
            case CIAN:
            case ROJO:
            case VERDE:
            case error:
            case PROCEDURE_NAME:
            case '=':
            case AZUL:
            case MARRON:
            case BLANCO:
            case PARAMETER:
            case NEGRO:
            case ENDINPUT:
            case AMARILLO:
                return 681;
            case '*':
                return 227;
            case '+':
                return 228;
            case '-':
                return 229;
            case '/':
                return 230;
        }
        return yyr139();
    }

    private int yys244() {
        switch (yytok) {
            case AZAR:
                return 30;
            case COS:
                return 35;
            case CUENTA:
                return 36;
            case DIFERENCIA:
                return 37;
            case DIVISION:
                return 38;
            case ELEGIR:
                return 40;
            case ELEMENTO:
                return 41;
            case MENOS:
                return 52;
            case POTENCIA:
                return 64;
            case PRIMERO:
                return 65;
            case PRODUCTO:
                return 66;
            case RAIZCUADRADA:
                return 67;
            case RC:
                return 68;
            case REDONDEA:
                return 70;
            case RESTO:
                return 72;
            case RUMBO:
                return 74;
            case SEN:
                return 76;
            case SENO:
                return 77;
            case SUMA:
                return 80;
            case UL:
                return 81;
            case ULTIMO:
                return 82;
            case INTEGER:
                return 102;
            case FLOAT:
                return 122;
            case IDENTIFIER:
                return 123;
            case '(':
                return 124;
        }
        return 681;
    }

    private int yys245() {
        switch (yytok) {
            case '>':
            case ROJO:
            case PROCEDURE_NAME:
            case MARRON:
            case '<':
            case NEGRO:
            case CIAN:
            case ENDINPUT:
            case '=':
            case AZUL:
            case AMARILLO:
            case PARAMETER:
            case VERDE:
            case ')':
            case BLANCO:
            case GRIS:
            case error:
                return 681;
            case '*':
                return 223;
            case '+':
                return 224;
            case '-':
                return 225;
            case '/':
                return 226;
        }
        return yyr146();
    }

    private int yys246() {
        switch (yytok) {
            case '>':
            case ROJO:
            case PROCEDURE_NAME:
            case MARRON:
            case '<':
            case NEGRO:
            case CIAN:
            case ENDINPUT:
            case '=':
            case AZUL:
            case AMARILLO:
            case PARAMETER:
            case VERDE:
            case ')':
            case BLANCO:
            case GRIS:
            case error:
                return 681;
            case '*':
                return 227;
            case '+':
                return 228;
            case '-':
                return 229;
            case '/':
                return 230;
        }
        return yyr144();
    }

    private int yys247() {
        switch (yytok) {
            case '>':
            case ROJO:
            case PROCEDURE_NAME:
            case MARRON:
            case '<':
            case NEGRO:
            case CIAN:
            case ENDINPUT:
            case '=':
            case AZUL:
            case AMARILLO:
            case PARAMETER:
            case VERDE:
            case ')':
            case BLANCO:
            case GRIS:
            case error:
                return 681;
            case '*':
                return 223;
            case '+':
                return 224;
            case '-':
                return 225;
            case '/':
                return 226;
        }
        return yyr145();
    }

    private int yys248() {
        switch (yytok) {
            case '>':
            case ROJO:
            case PROCEDURE_NAME:
            case MARRON:
            case '<':
            case NEGRO:
            case CIAN:
            case ENDINPUT:
            case '=':
            case AZUL:
            case AMARILLO:
            case PARAMETER:
            case VERDE:
            case ')':
            case BLANCO:
            case GRIS:
            case error:
                return 681;
            case '*':
                return 227;
            case '+':
                return 228;
            case '-':
                return 229;
            case '/':
                return 230;
        }
        return yyr143();
    }

    private int yys249() {
        switch (yytok) {
            case AZAR:
                return 30;
            case COS:
                return 35;
            case CUENTA:
                return 36;
            case DIFERENCIA:
                return 37;
            case DIVISION:
                return 38;
            case ELEGIR:
                return 40;
            case ELEMENTO:
                return 41;
            case MENOS:
                return 52;
            case POTENCIA:
                return 64;
            case PRIMERO:
                return 65;
            case PRODUCTO:
                return 66;
            case RAIZCUADRADA:
                return 67;
            case RC:
                return 68;
            case REDONDEA:
                return 70;
            case RESTO:
                return 72;
            case RUMBO:
                return 74;
            case SEN:
                return 76;
            case SENO:
                return 77;
            case SUMA:
                return 80;
            case UL:
                return 81;
            case ULTIMO:
                return 82;
            case INTEGER:
                return 102;
            case FLOAT:
                return 122;
            case IDENTIFIER:
                return 123;
            case '(':
                return 124;
            case ']':
                return 314;
        }
        return 681;
    }

    private int yys250() {
        switch (yytok) {
            case AZAR:
                return 30;
            case COS:
                return 35;
            case CUENTA:
                return 36;
            case DIFERENCIA:
                return 37;
            case DIVISION:
                return 38;
            case ELEGIR:
                return 40;
            case ELEMENTO:
                return 41;
            case MENOS:
                return 52;
            case POTENCIA:
                return 64;
            case PRIMERO:
                return 65;
            case PRODUCTO:
                return 66;
            case RAIZCUADRADA:
                return 67;
            case RC:
                return 68;
            case REDONDEA:
                return 70;
            case RESTO:
                return 72;
            case RUMBO:
                return 74;
            case SEN:
                return 76;
            case SENO:
                return 77;
            case SUMA:
                return 80;
            case UL:
                return 81;
            case ULTIMO:
                return 82;
            case INTEGER:
                return 102;
            case FLOAT:
                return 122;
            case IDENTIFIER:
                return 123;
            case '(':
                return 124;
        }
        return 681;
    }

    private int yys251() {
        switch (yytok) {
            case '>':
            case ROJO:
            case PROCEDURE_NAME:
            case MARRON:
            case '<':
            case NEGRO:
            case CIAN:
            case ENDINPUT:
            case '=':
            case AZUL:
            case AMARILLO:
            case PARAMETER:
            case VERDE:
            case ')':
            case BLANCO:
            case GRIS:
            case error:
                return 681;
            case '*':
                return 223;
            case '+':
                return 224;
            case '-':
                return 225;
            case '/':
                return 226;
        }
        return yyr152();
    }

    private int yys252() {
        switch (yytok) {
            case '>':
            case ROJO:
            case PROCEDURE_NAME:
            case MARRON:
            case '<':
            case NEGRO:
            case CIAN:
            case ENDINPUT:
            case '=':
            case AZUL:
            case AMARILLO:
            case PARAMETER:
            case VERDE:
            case ')':
            case BLANCO:
            case GRIS:
            case error:
                return 681;
            case '*':
                return 227;
            case '+':
                return 228;
            case '-':
                return 229;
            case '/':
                return 230;
        }
        return yyr150();
    }

    private int yys253() {
        switch (yytok) {
            case '>':
            case ROJO:
            case PROCEDURE_NAME:
            case MARRON:
            case '<':
            case NEGRO:
            case CIAN:
            case ENDINPUT:
            case '=':
            case AZUL:
            case AMARILLO:
            case PARAMETER:
            case VERDE:
            case ')':
            case BLANCO:
            case GRIS:
            case error:
                return 681;
            case '*':
                return 223;
            case '+':
                return 224;
            case '-':
                return 225;
            case '/':
                return 226;
        }
        return yyr151();
    }

    private int yys254() {
        switch (yytok) {
            case '>':
            case ROJO:
            case PROCEDURE_NAME:
            case MARRON:
            case '<':
            case NEGRO:
            case CIAN:
            case ENDINPUT:
            case '=':
            case AZUL:
            case AMARILLO:
            case PARAMETER:
            case VERDE:
            case ')':
            case BLANCO:
            case GRIS:
            case error:
                return 681;
            case '*':
                return 227;
            case '+':
                return 228;
            case '-':
                return 229;
            case '/':
                return 230;
        }
        return yyr149();
    }

    private int yys255() {
        switch (yytok) {
            case '>':
            case ROJO:
            case PROCEDURE_NAME:
            case MARRON:
            case '<':
            case NEGRO:
            case CIAN:
            case ENDINPUT:
            case '=':
            case AZUL:
            case AMARILLO:
            case PARAMETER:
            case VERDE:
            case ')':
            case BLANCO:
            case GRIS:
            case error:
                return 681;
            case '*':
                return 223;
            case '+':
                return 224;
            case '-':
                return 225;
            case '/':
                return 226;
        }
        return yyr156();
    }

    private int yys256() {
        switch (yytok) {
            case '>':
            case ROJO:
            case PROCEDURE_NAME:
            case MARRON:
            case '<':
            case NEGRO:
            case CIAN:
            case ENDINPUT:
            case '=':
            case AZUL:
            case AMARILLO:
            case PARAMETER:
            case VERDE:
            case ')':
            case BLANCO:
            case GRIS:
            case error:
                return 681;
            case '*':
                return 227;
            case '+':
                return 228;
            case '-':
                return 229;
            case '/':
                return 230;
        }
        return yyr154();
    }

    private int yys257() {
        switch (yytok) {
            case '>':
            case ROJO:
            case PROCEDURE_NAME:
            case MARRON:
            case '<':
            case NEGRO:
            case CIAN:
            case ENDINPUT:
            case '=':
            case AZUL:
            case AMARILLO:
            case PARAMETER:
            case VERDE:
            case ')':
            case BLANCO:
            case GRIS:
            case error:
                return 681;
            case '*':
                return 223;
            case '+':
                return 224;
            case '-':
                return 225;
            case '/':
                return 226;
        }
        return yyr155();
    }

    private int yys258() {
        switch (yytok) {
            case '>':
            case ROJO:
            case PROCEDURE_NAME:
            case MARRON:
            case '<':
            case NEGRO:
            case CIAN:
            case ENDINPUT:
            case '=':
            case AZUL:
            case AMARILLO:
            case PARAMETER:
            case VERDE:
            case ')':
            case BLANCO:
            case GRIS:
            case error:
                return 681;
            case '*':
                return 227;
            case '+':
                return 228;
            case '-':
                return 229;
            case '/':
                return 230;
        }
        return yyr153();
    }

    private int yys259() {
        switch (yytok) {
            case AZAR:
                return 30;
            case COS:
                return 35;
            case CUENTA:
                return 36;
            case DIFERENCIA:
                return 37;
            case DIVISION:
                return 38;
            case ELEGIR:
                return 40;
            case ELEMENTO:
                return 41;
            case MENOS:
                return 52;
            case POTENCIA:
                return 64;
            case PRIMERO:
                return 65;
            case PRODUCTO:
                return 66;
            case RAIZCUADRADA:
                return 67;
            case RC:
                return 68;
            case REDONDEA:
                return 70;
            case RESTO:
                return 72;
            case RUMBO:
                return 74;
            case SEN:
                return 76;
            case SENO:
                return 77;
            case SUMA:
                return 80;
            case UL:
                return 81;
            case ULTIMO:
                return 82;
            case INTEGER:
                return 102;
            case FLOAT:
                return 122;
            case IDENTIFIER:
                return 123;
            case '(':
                return 124;
        }
        return 681;
    }

    private int yys260() {
        switch (yytok) {
            case AZAR:
                return 30;
            case COS:
                return 35;
            case CUENTA:
                return 36;
            case DIFERENCIA:
                return 37;
            case DIVISION:
                return 38;
            case ELEGIR:
                return 40;
            case ELEMENTO:
                return 41;
            case MENOS:
                return 52;
            case POTENCIA:
                return 64;
            case PRIMERO:
                return 65;
            case PRODUCTO:
                return 66;
            case RAIZCUADRADA:
                return 67;
            case RC:
                return 68;
            case REDONDEA:
                return 70;
            case RESTO:
                return 72;
            case RUMBO:
                return 74;
            case SEN:
                return 76;
            case SENO:
                return 77;
            case SUMA:
                return 80;
            case UL:
                return 81;
            case ULTIMO:
                return 82;
            case INTEGER:
                return 102;
            case FLOAT:
                return 122;
            case IDENTIFIER:
                return 123;
            case '(':
                return 124;
        }
        return 681;
    }

    private int yys261() {
        switch (yytok) {
            case AZAR:
                return 30;
            case COS:
                return 35;
            case CUENTA:
                return 36;
            case DIFERENCIA:
                return 37;
            case DIVISION:
                return 38;
            case ELEGIR:
                return 40;
            case ELEMENTO:
                return 41;
            case MENOS:
                return 52;
            case POTENCIA:
                return 64;
            case PRIMERO:
                return 65;
            case PRODUCTO:
                return 66;
            case RAIZCUADRADA:
                return 67;
            case RC:
                return 68;
            case REDONDEA:
                return 70;
            case RESTO:
                return 72;
            case RUMBO:
                return 74;
            case SEN:
                return 76;
            case SENO:
                return 77;
            case SUMA:
                return 80;
            case UL:
                return 81;
            case ULTIMO:
                return 82;
            case INTEGER:
                return 102;
            case FLOAT:
                return 122;
            case IDENTIFIER:
                return 123;
            case '(':
                return 124;
        }
        return 681;
    }

    private int yys262() {
        switch (yytok) {
            case AZAR:
                return 30;
            case COS:
                return 35;
            case CUENTA:
                return 36;
            case DIFERENCIA:
                return 37;
            case DIVISION:
                return 38;
            case ELEGIR:
                return 40;
            case ELEMENTO:
                return 41;
            case MENOS:
                return 52;
            case POTENCIA:
                return 64;
            case PRIMERO:
                return 65;
            case PRODUCTO:
                return 66;
            case RAIZCUADRADA:
                return 67;
            case RC:
                return 68;
            case REDONDEA:
                return 70;
            case RESTO:
                return 72;
            case RUMBO:
                return 74;
            case SEN:
                return 76;
            case SENO:
                return 77;
            case SUMA:
                return 80;
            case UL:
                return 81;
            case ULTIMO:
                return 82;
            case INTEGER:
                return 102;
            case FLOAT:
                return 122;
            case IDENTIFIER:
                return 123;
            case '(':
                return 124;
        }
        return 681;
    }

    private int yys263() {
        switch (yytok) {
            case MARRON:
            case ROJO:
            case AMARILLO:
            case '=':
            case '<':
            case '*':
            case VERDE:
            case ENDINPUT:
            case PROCEDURE_NAME:
            case BLANCO:
            case NEGRO:
            case PARAMETER:
            case '+':
            case ')':
            case '/':
            case error:
            case '-':
            case '>':
            case AZUL:
            case CIAN:
            case GRIS:
                return 681;
        }
        return yyr148();
    }

    private int yys264() {
        switch (yytok) {
            case AZAR:
                return 30;
            case CUENTA:
                return 36;
            case REDONDEA:
                return 70;
            case RESTO:
                return 72;
            case DIFERENCIA:
                return 98;
            case ELEGIR:
                return 99;
            case ELEMENTO:
                return 100;
            case IDENTIFIER:
                return 101;
            case INTEGER:
                return 102;
            case MENOS:
                return 103;
            case POTENCIA:
                return 104;
            case PRIMERO:
                return 105;
            case PRODUCTO:
                return 106;
            case SUMA:
                return 107;
            case UL:
                return 108;
            case ULTIMO:
                return 109;
            case '(':
                return 110;
            case '*':
                return 210;
            case '+':
                return 211;
            case '-':
                return 212;
        }
        return 681;
    }

    private int yys265() {
        switch (yytok) {
            case INTEGER:
            case '(':
            case BLANCO:
            case ROJO:
            case VERDE:
            case '/':
            case NEGRO:
            case MARRON:
            case GRIS:
            case PROCEDURE_NAME:
            case ENDINPUT:
            case error:
            case '>':
            case PARAMETER:
            case '=':
            case '[':
            case ')':
            case '<':
            case AZUL:
            case IDENTIFIER:
            case CIAN:
            case FLOAT:
            case AMARILLO:
                return 681;
            case '*':
                return 210;
            case '+':
                return 211;
            case '-':
                return 212;
        }
        return yyr157();
    }

    private int yys266() {
        switch (yytok) {
            case GRIS:
            case CIAN:
            case ROJO:
            case VERDE:
            case error:
            case PROCEDURE_NAME:
            case '=':
            case AZUL:
            case MARRON:
            case BLANCO:
            case PARAMETER:
            case NEGRO:
            case ENDINPUT:
            case AMARILLO:
                return 681;
            case '*':
                return 223;
            case '+':
                return 224;
            case '-':
                return 225;
            case '/':
                return 226;
        }
        return yyr138();
    }

    private int yys267() {
        switch (yytok) {
            case GRIS:
            case CIAN:
            case ROJO:
            case VERDE:
            case error:
            case PROCEDURE_NAME:
            case '=':
            case AZUL:
            case MARRON:
            case BLANCO:
            case PARAMETER:
            case NEGRO:
            case ENDINPUT:
            case AMARILLO:
                return 681;
            case '*':
                return 227;
            case '+':
                return 228;
            case '-':
                return 229;
            case '/':
                return 230;
        }
        return yyr136();
    }

    private int yys268() {
        switch (yytok) {
            case GRIS:
            case CIAN:
            case ROJO:
            case VERDE:
            case error:
            case PROCEDURE_NAME:
            case '=':
            case AZUL:
            case MARRON:
            case BLANCO:
            case PARAMETER:
            case NEGRO:
            case ENDINPUT:
            case AMARILLO:
                return 681;
            case '*':
                return 223;
            case '+':
                return 224;
            case '-':
                return 225;
            case '/':
                return 226;
        }
        return yyr137();
    }

    private int yys269() {
        switch (yytok) {
            case GRIS:
            case CIAN:
            case ROJO:
            case VERDE:
            case error:
            case PROCEDURE_NAME:
            case '=':
            case AZUL:
            case MARRON:
            case BLANCO:
            case PARAMETER:
            case NEGRO:
            case ENDINPUT:
            case AMARILLO:
                return 681;
            case '*':
                return 227;
            case '+':
                return 228;
            case '-':
                return 229;
            case '/':
                return 230;
        }
        return yyr134();
    }

    private int yys272() {
        switch (yytok) {
            case GRIS:
            case ROJO:
            case error:
            case VERDE:
            case BLANCO:
            case CIAN:
            case '=':
            case AZUL:
            case AMARILLO:
            case MARRON:
            case PARAMETER:
            case NEGRO:
            case ENDINPUT:
            case PROCEDURE_NAME:
                return 681;
            case '*':
                return 210;
            case '+':
                return 211;
            case '-':
                return 212;
        }
        return yyr135();
    }

    private int yys277() {
        switch (yytok) {
            case AZAR:
                return 30;
            case COS:
                return 35;
            case CUENTA:
                return 36;
            case DIFERENCIA:
                return 37;
            case DIVISION:
                return 38;
            case ELEGIR:
                return 40;
            case ELEMENTO:
                return 41;
            case MENOS:
                return 52;
            case POTENCIA:
                return 64;
            case PRIMERO:
                return 65;
            case PRODUCTO:
                return 66;
            case RAIZCUADRADA:
                return 67;
            case RC:
                return 68;
            case REDONDEA:
                return 70;
            case RESTO:
                return 72;
            case RUMBO:
                return 74;
            case SEN:
                return 76;
            case SENO:
                return 77;
            case SUMA:
                return 80;
            case UL:
                return 81;
            case ULTIMO:
                return 82;
            case INTEGER:
                return 102;
            case FLOAT:
                return 122;
            case IDENTIFIER:
                return 123;
            case '(':
                return 124;
        }
        return 681;
    }

    private int yys278() {
        switch (yytok) {
            case MARRON:
            case ROJO:
            case AMARILLO:
            case '=':
            case '<':
            case '*':
            case VERDE:
            case ENDINPUT:
            case PROCEDURE_NAME:
            case BLANCO:
            case NEGRO:
            case PARAMETER:
            case '+':
            case ')':
            case '/':
            case error:
            case '-':
            case '>':
            case AZUL:
            case CIAN:
            case GRIS:
                return 681;
        }
        return yyr147();
    }

    private int yys279() {
        switch (yytok) {
            case ROJO:
            case '*':
            case '[':
            case GRIS:
            case VERDE:
            case '/':
            case '(':
            case MARRON:
            case AZUL:
            case PROCEDURE_NAME:
            case BLANCO:
            case error:
            case '>':
            case PARAMETER:
            case '=':
            case ')':
            case '+':
            case '<':
            case ENDINPUT:
            case IDENTIFIER:
            case CIAN:
            case FLOAT:
            case AMARILLO:
            case INTEGER:
            case '-':
            case NEGRO:
                return 681;
        }
        return yyr187();
    }

    private int yys281() {
        switch (yytok) {
            case ROJO:
            case '*':
            case '[':
            case GRIS:
            case VERDE:
            case '/':
            case '(':
            case MARRON:
            case AZUL:
            case PROCEDURE_NAME:
            case BLANCO:
            case error:
            case '>':
            case PARAMETER:
            case '=':
            case ')':
            case '+':
            case '<':
            case ENDINPUT:
            case IDENTIFIER:
            case CIAN:
            case FLOAT:
            case AMARILLO:
            case INTEGER:
            case '-':
            case NEGRO:
                return 681;
        }
        return yyr29();
    }

    private int yys282() {
        switch (yytok) {
            case VERDE:
            case error:
            case GRIS:
            case PARAMETER:
            case AZUL:
            case BLANCO:
            case '=':
            case CIAN:
            case ENDINPUT:
            case NEGRO:
            case MARRON:
            case AMARILLO:
            case PROCEDURE_NAME:
            case ROJO:
                return 681;
        }
        return yyr64();
    }

    private int yys283() {
        switch (yytok) {
            case BLANCO:
            case MARRON:
            case PARAMETER:
            case NEGRO:
            case ROJO:
            case AMARILLO:
            case CIAN:
            case PROCEDURE_NAME:
            case ENDINPUT:
            case VERDE:
            case error:
            case '=':
            case AZUL:
            case GRIS:
                return 681;
            case '*':
                return 210;
        }
        return yyr62();
    }

    private int yys284() {
        switch (yytok) {
            case BLANCO:
            case MARRON:
            case PARAMETER:
            case NEGRO:
            case ROJO:
            case AMARILLO:
            case CIAN:
            case PROCEDURE_NAME:
            case ENDINPUT:
            case VERDE:
            case error:
            case '=':
            case AZUL:
            case GRIS:
                return 681;
            case '*':
                return 210;
        }
        return yyr63();
    }

    private int yys285() {
        switch (yytok) {
            case AZAR:
                return 30;
            case CUENTA:
                return 36;
            case REDONDEA:
                return 70;
            case RESTO:
                return 72;
            case DIFERENCIA:
                return 98;
            case ELEGIR:
                return 99;
            case ELEMENTO:
                return 100;
            case IDENTIFIER:
                return 101;
            case INTEGER:
                return 102;
            case MENOS:
                return 103;
            case POTENCIA:
                return 104;
            case PRIMERO:
                return 105;
            case PRODUCTO:
                return 106;
            case SUMA:
                return 107;
            case UL:
                return 108;
            case ULTIMO:
                return 109;
            case '(':
                return 110;
        }
        return 681;
    }

    private int yys286() {
        switch (yytok) {
            case GRIS:
            case ROJO:
            case error:
            case VERDE:
            case BLANCO:
            case CIAN:
            case '=':
            case AZUL:
            case AMARILLO:
            case MARRON:
            case PARAMETER:
            case NEGRO:
            case ENDINPUT:
            case PROCEDURE_NAME:
                return 681;
            case '*':
                return 210;
            case '+':
                return 211;
            case '-':
                return 212;
        }
        return yyr134();
    }

    private int yys287() {
        switch (yytok) {
            case VERDE:
            case error:
            case GRIS:
            case PARAMETER:
            case AZUL:
            case BLANCO:
            case '=':
            case CIAN:
            case ENDINPUT:
            case NEGRO:
            case MARRON:
            case AMARILLO:
            case PROCEDURE_NAME:
            case ROJO:
                return 681;
        }
        return yyr65();
    }

    private int yys288() {
        switch (yytok) {
            case VERDE:
            case error:
            case GRIS:
            case PARAMETER:
            case AZUL:
            case BLANCO:
            case '=':
            case CIAN:
            case ENDINPUT:
            case NEGRO:
            case MARRON:
            case AMARILLO:
            case PROCEDURE_NAME:
            case ROJO:
                return 681;
        }
        return yyr74();
    }

    private int yys289() {
        switch (yytok) {
            case VERDE:
            case error:
            case GRIS:
            case PARAMETER:
            case AZUL:
            case BLANCO:
            case '=':
            case CIAN:
            case ENDINPUT:
            case NEGRO:
            case MARRON:
            case AMARILLO:
            case PROCEDURE_NAME:
            case ROJO:
                return 681;
        }
        return yyr72();
    }

    private int yys290() {
        switch (yytok) {
            case PROCEDURE_NAME:
            case ENDINPUT:
            case NEGRO:
            case error:
            case '=':
            case AZUL:
            case MARRON:
            case GRIS:
            case AMARILLO:
            case VERDE:
            case PARAMETER:
            case BLANCO:
            case ROJO:
            case CIAN:
                return 681;
            case '*':
                return 223;
            case '/':
                return 226;
        }
        return yyr68();
    }

    private int yys291() {
        switch (yytok) {
            case PROCEDURE_NAME:
            case ENDINPUT:
            case NEGRO:
            case error:
            case '=':
            case AZUL:
            case MARRON:
            case GRIS:
            case AMARILLO:
            case VERDE:
            case PARAMETER:
            case BLANCO:
            case ROJO:
            case CIAN:
                return 681;
            case '*':
                return 227;
            case '/':
                return 230;
        }
        return yyr66();
    }

    private int yys292() {
        switch (yytok) {
            case PROCEDURE_NAME:
            case ENDINPUT:
            case NEGRO:
            case error:
            case '=':
            case AZUL:
            case MARRON:
            case GRIS:
            case AMARILLO:
            case VERDE:
            case PARAMETER:
            case BLANCO:
            case ROJO:
            case CIAN:
                return 681;
            case '*':
                return 223;
            case '/':
                return 226;
        }
        return yyr71();
    }

    private int yys293() {
        switch (yytok) {
            case PROCEDURE_NAME:
            case ENDINPUT:
            case NEGRO:
            case error:
            case '=':
            case AZUL:
            case MARRON:
            case GRIS:
            case AMARILLO:
            case VERDE:
            case PARAMETER:
            case BLANCO:
            case ROJO:
            case CIAN:
                return 681;
            case '*':
                return 227;
            case '/':
                return 230;
        }
        return yyr69();
    }

    private int yys294() {
        switch (yytok) {
            case VERDE:
            case error:
            case GRIS:
            case PARAMETER:
            case AZUL:
            case BLANCO:
            case '=':
            case CIAN:
            case ENDINPUT:
            case NEGRO:
            case MARRON:
            case AMARILLO:
            case PROCEDURE_NAME:
            case ROJO:
                return 681;
        }
        return yyr78();
    }

    private int yys295() {
        switch (yytok) {
            case VERDE:
            case error:
            case GRIS:
            case PARAMETER:
            case AZUL:
            case BLANCO:
            case '=':
            case CIAN:
            case ENDINPUT:
            case NEGRO:
            case MARRON:
            case AMARILLO:
            case PROCEDURE_NAME:
            case ROJO:
                return 681;
        }
        return yyr76();
    }

    private int yys296() {
        switch (yytok) {
            case VERDE:
            case error:
            case GRIS:
            case PARAMETER:
            case AZUL:
            case BLANCO:
            case '=':
            case CIAN:
            case ENDINPUT:
            case NEGRO:
            case MARRON:
            case AMARILLO:
            case PROCEDURE_NAME:
            case ROJO:
                return 681;
        }
        return yyr73();
    }

    private int yys297() {
        switch (yytok) {
            case VERDE:
            case error:
            case GRIS:
            case PARAMETER:
            case AZUL:
            case BLANCO:
            case '=':
            case CIAN:
            case ENDINPUT:
            case NEGRO:
            case MARRON:
            case AMARILLO:
            case PROCEDURE_NAME:
            case ROJO:
                return 681;
        }
        return yyr64();
    }

    private int yys298() {
        switch (yytok) {
            case PROCEDURE_NAME:
            case ENDINPUT:
            case NEGRO:
            case error:
            case '=':
            case AZUL:
            case MARRON:
            case GRIS:
            case AMARILLO:
            case VERDE:
            case PARAMETER:
            case BLANCO:
            case ROJO:
            case CIAN:
                return 681;
            case '*':
                return 223;
            case '/':
                return 226;
        }
        return yyr67();
    }

    private int yys299() {
        switch (yytok) {
            case PROCEDURE_NAME:
            case ENDINPUT:
            case NEGRO:
            case error:
            case '=':
            case AZUL:
            case MARRON:
            case GRIS:
            case AMARILLO:
            case VERDE:
            case PARAMETER:
            case BLANCO:
            case ROJO:
            case CIAN:
                return 681;
            case '*':
                return 227;
            case '/':
                return 230;
        }
        return yyr62();
    }

    private int yys300() {
        switch (yytok) {
            case PROCEDURE_NAME:
            case ENDINPUT:
            case NEGRO:
            case error:
            case '=':
            case AZUL:
            case MARRON:
            case GRIS:
            case AMARILLO:
            case VERDE:
            case PARAMETER:
            case BLANCO:
            case ROJO:
            case CIAN:
                return 681;
            case '*':
                return 223;
            case '/':
                return 226;
        }
        return yyr70();
    }

    private int yys301() {
        switch (yytok) {
            case PROCEDURE_NAME:
            case ENDINPUT:
            case NEGRO:
            case error:
            case '=':
            case AZUL:
            case MARRON:
            case GRIS:
            case AMARILLO:
            case VERDE:
            case PARAMETER:
            case BLANCO:
            case ROJO:
            case CIAN:
                return 681;
            case '*':
                return 227;
            case '/':
                return 230;
        }
        return yyr63();
    }

    private int yys302() {
        switch (yytok) {
            case VERDE:
            case error:
            case GRIS:
            case PARAMETER:
            case AZUL:
            case BLANCO:
            case '=':
            case CIAN:
            case ENDINPUT:
            case NEGRO:
            case MARRON:
            case AMARILLO:
            case PROCEDURE_NAME:
            case ROJO:
                return 681;
        }
        return yyr77();
    }

    private int yys303() {
        switch (yytok) {
            case VERDE:
            case error:
            case GRIS:
            case PARAMETER:
            case AZUL:
            case BLANCO:
            case '=':
            case CIAN:
            case ENDINPUT:
            case NEGRO:
            case MARRON:
            case AMARILLO:
            case PROCEDURE_NAME:
            case ROJO:
                return 681;
        }
        return yyr75();
    }

    private int yys304() {
        switch (yytok) {
            case VERDE:
            case error:
            case GRIS:
            case PARAMETER:
            case AZUL:
            case BLANCO:
            case '=':
            case CIAN:
            case ENDINPUT:
            case NEGRO:
            case MARRON:
            case AMARILLO:
            case PROCEDURE_NAME:
            case ROJO:
                return 681;
        }
        return yyr79();
    }

    private int yys305() {
        switch (yytok) {
            case VERDE:
            case error:
            case GRIS:
            case PARAMETER:
            case AZUL:
            case BLANCO:
            case '=':
            case CIAN:
            case ENDINPUT:
            case NEGRO:
            case MARRON:
            case AMARILLO:
            case PROCEDURE_NAME:
            case ROJO:
                return 681;
        }
        return yyr172();
    }

    private int yys306() {
        switch (yytok) {
            case VERDE:
            case error:
            case GRIS:
            case PARAMETER:
            case AZUL:
            case BLANCO:
            case '=':
            case CIAN:
            case ENDINPUT:
            case NEGRO:
            case MARRON:
            case AMARILLO:
            case PROCEDURE_NAME:
            case ROJO:
                return 681;
        }
        return yyr171();
    }

    private int yys307() {
        switch (yytok) {
            case ROJO:
            case '*':
            case '[':
            case GRIS:
            case VERDE:
            case '/':
            case '(':
            case MARRON:
            case AZUL:
            case PROCEDURE_NAME:
            case BLANCO:
            case error:
            case '>':
            case PARAMETER:
            case '=':
            case ')':
            case '+':
            case '<':
            case ENDINPUT:
            case IDENTIFIER:
            case CIAN:
            case FLOAT:
            case AMARILLO:
            case INTEGER:
            case '-':
            case NEGRO:
                return 681;
        }
        return yyr184();
    }

    private int yys308() {
        switch (yytok) {
            case VERDE:
            case error:
            case GRIS:
            case PARAMETER:
            case AZUL:
            case BLANCO:
            case '=':
            case CIAN:
            case ENDINPUT:
            case NEGRO:
            case MARRON:
            case AMARILLO:
            case PROCEDURE_NAME:
            case ROJO:
                return 681;
        }
        return yyr176();
    }

    private int yys309() {
        switch (yytok) {
            case VERDE:
            case error:
            case GRIS:
            case PARAMETER:
            case AZUL:
            case BLANCO:
            case '=':
            case CIAN:
            case ENDINPUT:
            case NEGRO:
            case MARRON:
            case AMARILLO:
            case PROCEDURE_NAME:
            case ROJO:
                return 681;
        }
        return yyr170();
    }

    private int yys314() {
        switch (yytok) {
            case ROJO:
            case '*':
            case '[':
            case GRIS:
            case VERDE:
            case '/':
            case '(':
            case MARRON:
            case AZUL:
            case PROCEDURE_NAME:
            case BLANCO:
            case error:
            case '>':
            case PARAMETER:
            case '=':
            case ')':
            case '+':
            case '<':
            case ENDINPUT:
            case IDENTIFIER:
            case CIAN:
            case FLOAT:
            case AMARILLO:
            case INTEGER:
            case '-':
            case NEGRO:
                return 681;
        }
        return yyr180();
    }

    private int yys315() {
        switch (yytok) {
            case AMARILLO:
            case '[':
            case INTEGER:
            case ROJO:
            case VERDE:
            case BLANCO:
            case '(':
            case MARRON:
            case GRIS:
            case PROCEDURE_NAME:
            case ENDINPUT:
            case error:
            case '>':
            case PARAMETER:
            case '=':
            case NEGRO:
            case ')':
            case '<':
            case AZUL:
            case IDENTIFIER:
            case CIAN:
            case FLOAT:
                return 681;
            case '*':
                return 223;
            case '+':
                return 224;
            case '-':
                return 225;
            case '/':
                return 226;
        }
        return yyr49();
    }

    private int yys316() {
        switch (yytok) {
            case AMARILLO:
            case '[':
            case INTEGER:
            case ROJO:
            case VERDE:
            case BLANCO:
            case '(':
            case MARRON:
            case GRIS:
            case PROCEDURE_NAME:
            case ENDINPUT:
            case error:
            case '>':
            case PARAMETER:
            case '=':
            case NEGRO:
            case ')':
            case '<':
            case AZUL:
            case IDENTIFIER:
            case CIAN:
            case FLOAT:
                return 681;
            case '*':
                return 227;
            case '+':
                return 228;
            case '-':
                return 229;
            case '/':
                return 230;
        }
        return yyr48();
    }

    private int yys317() {
        switch (yytok) {
            case '>':
            case ROJO:
            case PROCEDURE_NAME:
            case MARRON:
            case '<':
            case NEGRO:
            case CIAN:
            case ENDINPUT:
            case '=':
            case AZUL:
            case AMARILLO:
            case PARAMETER:
            case VERDE:
            case ')':
            case BLANCO:
            case GRIS:
            case error:
                return 681;
            case '*':
                return 223;
            case '+':
                return 224;
            case '-':
                return 225;
            case '/':
                return 226;
        }
        return yyr56();
    }

    private int yys318() {
        switch (yytok) {
            case '>':
            case ROJO:
            case PROCEDURE_NAME:
            case MARRON:
            case '<':
            case NEGRO:
            case CIAN:
            case ENDINPUT:
            case '=':
            case AZUL:
            case AMARILLO:
            case PARAMETER:
            case VERDE:
            case ')':
            case BLANCO:
            case GRIS:
            case error:
                return 681;
            case '*':
                return 227;
            case '+':
                return 228;
            case '-':
                return 229;
            case '/':
                return 230;
        }
        return yyr54();
    }

    private int yys319() {
        switch (yytok) {
            case '>':
            case ROJO:
            case PROCEDURE_NAME:
            case MARRON:
            case '<':
            case NEGRO:
            case CIAN:
            case ENDINPUT:
            case '=':
            case AZUL:
            case AMARILLO:
            case PARAMETER:
            case VERDE:
            case ')':
            case BLANCO:
            case GRIS:
            case error:
                return 681;
            case '*':
                return 223;
            case '+':
                return 224;
            case '-':
                return 225;
            case '/':
                return 226;
        }
        return yyr60();
    }

    private int yys320() {
        switch (yytok) {
            case '>':
            case ROJO:
            case PROCEDURE_NAME:
            case MARRON:
            case '<':
            case NEGRO:
            case CIAN:
            case ENDINPUT:
            case '=':
            case AZUL:
            case AMARILLO:
            case PARAMETER:
            case VERDE:
            case ')':
            case BLANCO:
            case GRIS:
            case error:
                return 681;
            case '*':
                return 227;
            case '+':
                return 228;
            case '-':
                return 229;
            case '/':
                return 230;
        }
        return yyr58();
    }

    private int yys321() {
        switch (yytok) {
            case '>':
            case ROJO:
            case PROCEDURE_NAME:
            case MARRON:
            case '<':
            case NEGRO:
            case CIAN:
            case ENDINPUT:
            case '=':
            case AZUL:
            case AMARILLO:
            case PARAMETER:
            case VERDE:
            case ')':
            case BLANCO:
            case GRIS:
            case error:
                return 681;
            case '*':
                return 223;
            case '+':
                return 224;
            case '-':
                return 225;
            case '/':
                return 226;
        }
        return yyr55();
    }

    private int yys322() {
        switch (yytok) {
            case '>':
            case ROJO:
            case PROCEDURE_NAME:
            case MARRON:
            case '<':
            case NEGRO:
            case CIAN:
            case ENDINPUT:
            case '=':
            case AZUL:
            case AMARILLO:
            case PARAMETER:
            case VERDE:
            case ')':
            case BLANCO:
            case GRIS:
            case error:
                return 681;
            case '*':
                return 227;
            case '+':
                return 228;
            case '-':
                return 229;
            case '/':
                return 230;
        }
        return yyr53();
    }

    private int yys323() {
        switch (yytok) {
            case '>':
            case ROJO:
            case PROCEDURE_NAME:
            case MARRON:
            case '<':
            case NEGRO:
            case CIAN:
            case ENDINPUT:
            case '=':
            case AZUL:
            case AMARILLO:
            case PARAMETER:
            case VERDE:
            case ')':
            case BLANCO:
            case GRIS:
            case error:
                return 681;
            case '*':
                return 223;
            case '+':
                return 224;
            case '-':
                return 225;
            case '/':
                return 226;
        }
        return yyr59();
    }

    private int yys324() {
        switch (yytok) {
            case '>':
            case ROJO:
            case PROCEDURE_NAME:
            case MARRON:
            case '<':
            case NEGRO:
            case CIAN:
            case ENDINPUT:
            case '=':
            case AZUL:
            case AMARILLO:
            case PARAMETER:
            case VERDE:
            case ')':
            case BLANCO:
            case GRIS:
            case error:
                return 681;
            case '*':
                return 227;
            case '+':
                return 228;
            case '-':
                return 229;
            case '/':
                return 230;
        }
        return yyr57();
    }

    private int yys326() {
        switch (yytok) {
            case VERDE:
            case error:
            case GRIS:
            case PARAMETER:
            case AZUL:
            case BLANCO:
            case '=':
            case CIAN:
            case ENDINPUT:
            case NEGRO:
            case MARRON:
            case AMARILLO:
            case PROCEDURE_NAME:
            case ROJO:
                return 681;
        }
        return yyr179();
    }

    private int yys327() {
        switch (yytok) {
            case VERDE:
            case error:
            case GRIS:
            case PARAMETER:
            case AZUL:
            case BLANCO:
            case '=':
            case CIAN:
            case ENDINPUT:
            case NEGRO:
            case MARRON:
            case AMARILLO:
            case PROCEDURE_NAME:
            case ROJO:
                return 681;
        }
        return yyr175();
    }

    private int yys328() {
        switch (yytok) {
            case VERDE:
            case error:
            case GRIS:
            case PARAMETER:
            case AZUL:
            case BLANCO:
            case '=':
            case CIAN:
            case ENDINPUT:
            case NEGRO:
            case MARRON:
            case AMARILLO:
            case PROCEDURE_NAME:
            case ROJO:
                return 681;
        }
        return yyr178();
    }

    private int yys329() {
        switch (yytok) {
            case VERDE:
            case error:
            case GRIS:
            case PARAMETER:
            case AZUL:
            case BLANCO:
            case '=':
            case CIAN:
            case ENDINPUT:
            case NEGRO:
            case MARRON:
            case AMARILLO:
            case PROCEDURE_NAME:
            case ROJO:
                return 681;
        }
        return yyr174();
    }

    private int yys330() {
        switch (yytok) {
            case VERDE:
            case error:
            case GRIS:
            case PARAMETER:
            case AZUL:
            case BLANCO:
            case '=':
            case CIAN:
            case ENDINPUT:
            case NEGRO:
            case MARRON:
            case AMARILLO:
            case PROCEDURE_NAME:
            case ROJO:
                return 681;
        }
        return yyr177();
    }

    private int yys331() {
        switch (yytok) {
            case VERDE:
            case error:
            case GRIS:
            case PARAMETER:
            case AZUL:
            case BLANCO:
            case '=':
            case CIAN:
            case ENDINPUT:
            case NEGRO:
            case MARRON:
            case AMARILLO:
            case PROCEDURE_NAME:
            case ROJO:
                return 681;
        }
        return yyr173();
    }

    private int yys332() {
        switch (yytok) {
            case AMARILLO:
            case '[':
            case INTEGER:
            case ROJO:
            case VERDE:
            case BLANCO:
            case '(':
            case MARRON:
            case GRIS:
            case PROCEDURE_NAME:
            case ENDINPUT:
            case error:
            case '>':
            case PARAMETER:
            case '=':
            case NEGRO:
            case ')':
            case '<':
            case AZUL:
            case IDENTIFIER:
            case CIAN:
            case FLOAT:
                return 681;
            case '*':
                return 223;
            case '+':
                return 224;
            case '-':
                return 225;
            case '/':
                return 226;
        }
        return yyr52();
    }

    private int yys333() {
        switch (yytok) {
            case AMARILLO:
            case '[':
            case INTEGER:
            case ROJO:
            case VERDE:
            case BLANCO:
            case '(':
            case MARRON:
            case GRIS:
            case PROCEDURE_NAME:
            case ENDINPUT:
            case error:
            case '>':
            case PARAMETER:
            case '=':
            case NEGRO:
            case ')':
            case '<':
            case AZUL:
            case IDENTIFIER:
            case CIAN:
            case FLOAT:
                return 681;
            case '*':
                return 227;
            case '+':
                return 228;
            case '-':
                return 229;
            case '/':
                return 230;
        }
        return yyr51();
    }

    private int yys334() {
        switch (yytok) {
            case VERDE:
            case error:
            case GRIS:
            case PARAMETER:
            case AZUL:
            case BLANCO:
            case '=':
            case CIAN:
            case ENDINPUT:
            case NEGRO:
            case MARRON:
            case AMARILLO:
            case PROCEDURE_NAME:
            case ROJO:
                return 681;
        }
        return yyr186();
    }

    private int yys335() {
        switch (yytok) {
            case VERDE:
            case error:
            case GRIS:
            case PARAMETER:
            case AZUL:
            case BLANCO:
            case '=':
            case CIAN:
            case ENDINPUT:
            case NEGRO:
            case MARRON:
            case AMARILLO:
            case PROCEDURE_NAME:
            case ROJO:
                return 681;
        }
        return yyr185();
    }

    private int yys336() {
        switch (yytok) {
            case ROJO:
            case '*':
            case '[':
            case GRIS:
            case VERDE:
            case '/':
            case '(':
            case MARRON:
            case AZUL:
            case PROCEDURE_NAME:
            case BLANCO:
            case error:
            case '>':
            case PARAMETER:
            case '=':
            case ')':
            case '+':
            case '<':
            case ENDINPUT:
            case IDENTIFIER:
            case CIAN:
            case FLOAT:
            case AMARILLO:
            case INTEGER:
            case '-':
            case NEGRO:
                return 681;
        }
        return yyr182();
    }

    private int yys337() {
        switch (yytok) {
            case ROJO:
            case '*':
            case '[':
            case GRIS:
            case VERDE:
            case '/':
            case '(':
            case MARRON:
            case AZUL:
            case PROCEDURE_NAME:
            case BLANCO:
            case error:
            case '>':
            case PARAMETER:
            case '=':
            case ')':
            case '+':
            case '<':
            case ENDINPUT:
            case IDENTIFIER:
            case CIAN:
            case FLOAT:
            case AMARILLO:
            case INTEGER:
            case '-':
            case NEGRO:
                return 681;
        }
        return yyr181();
    }

    private int yys338() {
        switch (yytok) {
            case ROJO:
            case '*':
            case '[':
            case GRIS:
            case VERDE:
            case '/':
            case '(':
            case MARRON:
            case AZUL:
            case PROCEDURE_NAME:
            case BLANCO:
            case error:
            case '>':
            case PARAMETER:
            case '=':
            case ')':
            case '+':
            case '<':
            case ENDINPUT:
            case IDENTIFIER:
            case CIAN:
            case FLOAT:
            case AMARILLO:
            case INTEGER:
            case '-':
            case NEGRO:
                return 681;
        }
        return yyr183();
    }

    private int yyr1() { // progl : prog
        { parseFinished(); }
        yysv[yysp-=1] = yyrv;
        return 1;
    }

    private int yyr80() { // color : BLANCO
        {yyrv="blanco";}
        yysv[yysp-=1] = yyrv;
        return yypcolor();
    }

    private int yyr81() { // color : AZUL
        {yyrv="azul";}
        yysv[yysp-=1] = yyrv;
        return yypcolor();
    }

    private int yyr82() { // color : MARRON
        {yyrv="marron";}
        yysv[yysp-=1] = yyrv;
        return yypcolor();
    }

    private int yyr83() { // color : CIAN
        {yyrv="cian";}
        yysv[yysp-=1] = yyrv;
        return yypcolor();
    }

    private int yyr84() { // color : GRIS
        {yyrv="gris";}
        yysv[yysp-=1] = yyrv;
        return yypcolor();
    }

    private int yyr85() { // color : AMARILLO
        {yyrv="amarillo";}
        yysv[yysp-=1] = yyrv;
        return yypcolor();
    }

    private int yyr86() { // color : NEGRO
        {yyrv="negro";}
        yysv[yysp-=1] = yyrv;
        return yypcolor();
    }

    private int yyr87() { // color : ROJO
        {yyrv="rojo";}
        yysv[yysp-=1] = yyrv;
        return yypcolor();
    }

    private int yyr88() { // color : VERDE
        {yyrv="verde";}
        yysv[yysp-=1] = yyrv;
        return yypcolor();
    }

    private int yypcolor() {
        switch (yyst[yysp-1]) {
            case 57: return 160;
            default: return 170;
        }
    }

    private int yyr50() { // declaration_expr : VAR IDENTIFIER
        {if(variables.get(((String)yysv[yysp-1]))==null){variables.put(((String)yysv[yysp-1]),null);}}
        yysv[yysp-=2] = yyrv;
        return 2;
    }

    private int yyr51() { // declaration_expr : VAR IDENTIFIER '=' int_number
        {if(variables.get(((String)yysv[yysp-3]))==null){variables.put(((String)yysv[yysp-3]),((Integer)yysv[yysp-1]));}}
        yysv[yysp-=4] = yyrv;
        return 2;
    }

    private int yyr52() { // declaration_expr : VAR IDENTIFIER '=' float_number
        {if(variables.get(((String)yysv[yysp-3]))==null){variables.put(((String)yysv[yysp-3]),((Float)yysv[yysp-1]));}}
        yysv[yysp-=4] = yyrv;
        return 2;
    }

    private int yyr168() { // expr_procs_n : expression expr_procs_n
        {ArrayList<jsonAction> quase = (ArrayList<jsonAction>)yysv[yysp-1];quase.addAll((ArrayList<jsonAction>)yysv[yysp-2]);yyrv=quase;}
        yysv[yysp-=2] = yyrv;
        return yypexpr_procs_n();
    }

    private int yyr169() { // expr_procs_n : expression
        {ArrayList<jsonAction> quase = new ArrayList<jsonAction>(); quase.addAll((ArrayList<jsonAction>)yysv[yysp-1]);yyrv=quase;}
        yysv[yysp-=1] = yyrv;
        return yypexpr_procs_n();
    }

    private int yypexpr_procs_n() {
        switch (yyst[yysp-1]) {
            case 132: return 241;
            case 86: return 204;
            default: return 280;
        }
    }

    private int yyr4() { // expression : declaration_expr
        yysp -= 1;
        return yypexpression();
    }

    private int yyr5() { // expression : redeclaration_expr
        yysp -= 1;
        return yypexpression();
    }

    private int yyr6() { // expression : int_proc1
        yysp -= 1;
        return yypexpression();
    }

    private int yyr7() { // expression : int_proc2
        yysp -= 1;
        return yypexpression();
    }

    private int yyr8() { // expression : int_proc_p
        yysp -= 1;
        return yypexpression();
    }

    private int yyr9() { // expression : int_proc_1p
        yysp -= 1;
        return yypexpression();
    }

    private int yyr10() { // expression : int_proc_n
        yysp -= 1;
        return yypexpression();
    }

    private int yyr11() { // expression : float_proc
        yysp -= 1;
        return yypexpression();
    }

    private int yyr12() { // expression : float_proc1
        yysp -= 1;
        return yypexpression();
    }

    private int yyr13() { // expression : float_proc2
        yysp -= 1;
        return yypexpression();
    }

    private int yyr14() { // expression : float_proc_p
        yysp -= 1;
        return yypexpression();
    }

    private int yyr15() { // expression : float_proc_1p
        yysp -= 1;
        return yypexpression();
    }

    private int yyr16() { // expression : float_proc_n
        yysp -= 1;
        return yypexpression();
    }

    private int yyr17() { // expression : bool_proc2
        yysp -= 1;
        return yypexpression();
    }

    private int yyr18() { // expression : void_proc
        {if(!(yysv[yysp-1] instanceof ArrayList)){ArrayList<jsonAction> result = new ArrayList<jsonAction>();result.add((jsonAction)yysv[yysp-1]);yyrv=result;}}
        yysv[yysp-=1] = yyrv;
        return yypexpression();
    }

    private int yyr19() { // expression : void_proc1
        {if(!(yysv[yysp-1] instanceof ArrayList)){ArrayList<jsonAction> result = new ArrayList<jsonAction>();result.add((jsonAction)yysv[yysp-1]);yyrv=result;}}
        yysv[yysp-=1] = yyrv;
        return yypexpression();
    }

    private int yyr20() { // expression : void_proc2
        {if(!(yysv[yysp-1] instanceof ArrayList)){ArrayList<jsonAction> result = new ArrayList<jsonAction>();result.add((jsonAction)yysv[yysp-1]);yyrv=result;}}
        yysv[yysp-=1] = yyrv;
        return yypexpression();
    }

    private int yyr21() { // expression : void_proc_p
        {if(!(yysv[yysp-1] instanceof ArrayList)){ArrayList<jsonAction> result = new ArrayList<jsonAction>();result.add((jsonAction)yysv[yysp-1]);yyrv=result;}}
        yysv[yysp-=1] = yyrv;
        return yypexpression();
    }

    private int yyr22() { // expression : void_proc_1p
        {if(!(yysv[yysp-1] instanceof ArrayList)){ArrayList<jsonAction> result = new ArrayList<jsonAction>();result.add((jsonAction)yysv[yysp-1]);yyrv=result;}}
        yysv[yysp-=1] = yyrv;
        return yypexpression();
    }

    private int yyr23() { // expression : user_procedure
        yysp -= 1;
        return yypexpression();
    }

    private int yypexpression() {
        switch (yyst[yysp-1]) {
            case 89: return 87;
            case 87: return 87;
            case 85: return 3;
            case 20: return 87;
            case 0: return 3;
            default: return 205;
        }
    }

    private int yyr66() { // float_arithmetic_expr : float_number '+' int_number
        { yyrv = ((Float)yysv[yysp-3]) + ((Integer)yysv[yysp-1]); }
        yysv[yysp-=3] = yyrv;
        return yypfloat_arithmetic_expr();
    }

    private int yyr67() { // float_arithmetic_expr : int_number '+' float_number
        { yyrv = ((Integer)yysv[yysp-3]) + ((Float)yysv[yysp-1]); }
        yysv[yysp-=3] = yyrv;
        return yypfloat_arithmetic_expr();
    }

    private int yyr68() { // float_arithmetic_expr : float_number '+' float_number
        { yyrv = ((Float)yysv[yysp-3]) + ((Float)yysv[yysp-1]); }
        yysv[yysp-=3] = yyrv;
        return yypfloat_arithmetic_expr();
    }

    private int yyr69() { // float_arithmetic_expr : float_number '-' int_number
        { yyrv = ((Float)yysv[yysp-3]) - ((Integer)yysv[yysp-1]); }
        yysv[yysp-=3] = yyrv;
        return yypfloat_arithmetic_expr();
    }

    private int yyr70() { // float_arithmetic_expr : int_number '-' float_number
        { yyrv = ((Integer)yysv[yysp-3]) - ((Float)yysv[yysp-1]); }
        yysv[yysp-=3] = yyrv;
        return yypfloat_arithmetic_expr();
    }

    private int yyr71() { // float_arithmetic_expr : float_number '-' float_number
        { yyrv = ((Float)yysv[yysp-3]) - ((Float)yysv[yysp-1]); }
        yysv[yysp-=3] = yyrv;
        return yypfloat_arithmetic_expr();
    }

    private int yyr72() { // float_arithmetic_expr : float_number '*' int_number
        { yyrv = ((Float)yysv[yysp-3]) * ((Integer)yysv[yysp-1]); }
        yysv[yysp-=3] = yyrv;
        return yypfloat_arithmetic_expr();
    }

    private int yyr73() { // float_arithmetic_expr : int_number '*' float_number
        { yyrv = ((Integer)yysv[yysp-3]) * ((Float)yysv[yysp-1]); }
        yysv[yysp-=3] = yyrv;
        return yypfloat_arithmetic_expr();
    }

    private int yyr74() { // float_arithmetic_expr : float_number '*' float_number
        { yyrv = ((Float)yysv[yysp-3]) * ((Float)yysv[yysp-1]); }
        yysv[yysp-=3] = yyrv;
        return yypfloat_arithmetic_expr();
    }

    private int yyr75() { // float_arithmetic_expr : int_number '/' int_number
        { yyrv = ((Integer)yysv[yysp-3]) / ((Integer)yysv[yysp-1]); }
        yysv[yysp-=3] = yyrv;
        return yypfloat_arithmetic_expr();
    }

    private int yyr76() { // float_arithmetic_expr : float_number '/' int_number
        { yyrv = ((Float)yysv[yysp-3]) / ((Integer)yysv[yysp-1]); }
        yysv[yysp-=3] = yyrv;
        return yypfloat_arithmetic_expr();
    }

    private int yyr77() { // float_arithmetic_expr : int_number '/' float_number
        { yyrv = ((Integer)yysv[yysp-3]) / ((Float)yysv[yysp-1]); }
        yysv[yysp-=3] = yyrv;
        return yypfloat_arithmetic_expr();
    }

    private int yyr78() { // float_arithmetic_expr : float_number '/' float_number
        { yyrv = ((Float)yysv[yysp-3]) / ((Float)yysv[yysp-1]); }
        yysv[yysp-=3] = yyrv;
        return yypfloat_arithmetic_expr();
    }

    private int yyr79() { // float_arithmetic_expr : '(' float_arithmetic_expr ')'
        { yyrv = ((Float)yysv[yysp-2]); }
        yysv[yysp-=3] = yyrv;
        return yypfloat_arithmetic_expr();
    }

    private int yypfloat_arithmetic_expr() {
        switch (yyst[yysp-1]) {
            case 124: return 231;
            default: return 113;
        }
    }

    private int yyr39() { // float_number : FLOAT
        {yyrv=((Float)yysv[yysp-1]);}
        yysv[yysp-=1] = yyrv;
        return yypfloat_number();
    }

    private int yyr40() { // float_number : IDENTIFIER
        { yyrv=(Float)variables.get(((String)yysv[yysp-1])); }
        yysv[yysp-=1] = yyrv;
        return yypfloat_number();
    }

    private int yyr41() { // float_number : float_arithmetic_expr
        yysp -= 1;
        return yypfloat_number();
    }

    private int yyr42() { // float_number : float_proc
        yysp -= 1;
        return yypfloat_number();
    }

    private int yyr43() { // float_number : float_proc1
        yysp -= 1;
        return yypfloat_number();
    }

    private int yyr44() { // float_number : float_proc2
        yysp -= 1;
        return yypfloat_number();
    }

    private int yyr45() { // float_number : float_proc_p
        yysp -= 1;
        return yypfloat_number();
    }

    private int yyr46() { // float_number : float_proc_1p
        yysp -= 1;
        return yypfloat_number();
    }

    private int yyr47() { // float_number : float_proc_n
        yysp -= 1;
        return yypfloat_number();
    }

    private int yypfloat_number() {
        switch (yyst[yysp-1]) {
            case 277: return 332;
            case 262: return 323;
            case 261: return 321;
            case 260: return 319;
            case 259: return 317;
            case 250: return 315;
            case 249: return 312;
            case 230: return 302;
            case 229: return 300;
            case 228: return 298;
            case 227: return 296;
            case 226: return 294;
            case 225: return 292;
            case 224: return 290;
            case 223: return 288;
            case 202: return 155;
            case 178: return 268;
            case 177: return 266;
            case 157: return 155;
            case 152: return 257;
            case 151: return 255;
            case 150: return 253;
            case 149: return 251;
            case 146: return 247;
            case 145: return 245;
            case 131: return 239;
            case 130: return 237;
            case 124: return 232;
            case 84: return 155;
            case 78: return 155;
            case 77: return 194;
            case 76: return 192;
            case 70: return 187;
            case 68: return 184;
            case 67: return 182;
            case 64: return 177;
            case 60: return 172;
            case 53: return 155;
            case 52: return 153;
            case 51: return 151;
            case 50: return 149;
            case 47: return 145;
            case 46: return 143;
            case 45: return 141;
            case 44: return 139;
            case 43: return 137;
            case 42: return 135;
            case 38: return 130;
            case 35: return 114;
            default: return 126;
        }
    }

    private int yyr160() { // float_params_n : float_number float_params_n
        {n_params.peek().add(((Float)yysv[yysp-2]));}
        yysv[yysp-=2] = yyrv;
        return yypfloat_params_n();
    }

    private int yyr161() { // float_params_n : float_number
        {n_params.push(new ArrayList<Object>());n_params.peek().add(((Float)yysv[yysp-1]));}
        yysv[yysp-=1] = yyrv;
        return yypfloat_params_n();
    }

    private int yypfloat_params_n() {
        switch (yyst[yysp-1]) {
            case 200: return 275;
            case 199: return 273;
            case 179: return 270;
            case 133: return 242;
            case 126: return 235;
            case 125: return 233;
            case 80: return 197;
            case 66: return 180;
            case 37: return 127;
            default: return 310;
        }
    }

    private int yyr89() { // float_proc : RUMBO
        {yyrv=variables.get("rumbo");}
        yysv[yysp-=1] = yyrv;
        switch (yyst[yysp-1]) {
            case 205: return 4;
            case 132: return 4;
            case 89: return 4;
            case 87: return 4;
            case 86: return 4;
            case 85: return 4;
            case 20: return 4;
            case 0: return 4;
            default: return 115;
        }
    }

    private int yyr103() { // float_proc1 : COS int_number
        { yyrv = Math.cos(((Integer)yysv[yysp-1])); }
        yysv[yysp-=2] = yyrv;
        return yypfloat_proc1();
    }

    private int yyr104() { // float_proc1 : COS float_number
        { yyrv = Math.cos(((Float)yysv[yysp-1])); }
        yysv[yysp-=2] = yyrv;
        return yypfloat_proc1();
    }

    private int yyr105() { // float_proc1 : MENOS float_number
        { yyrv = ((Float)yysv[yysp-1]) * -1; }
        yysv[yysp-=2] = yyrv;
        return yypfloat_proc1();
    }

    private int yyr106() { // float_proc1 : RAIZCUADRADA int_number
        { yyrv = Math.sqrt(((Integer)yysv[yysp-1])); }
        yysv[yysp-=2] = yyrv;
        return yypfloat_proc1();
    }

    private int yyr107() { // float_proc1 : RAIZCUADRADA float_number
        { yyrv = Math.sqrt(((Float)yysv[yysp-1])); }
        yysv[yysp-=2] = yyrv;
        return yypfloat_proc1();
    }

    private int yyr108() { // float_proc1 : RC int_number
        { yyrv = Math.sqrt(((Integer)yysv[yysp-1])); }
        yysv[yysp-=2] = yyrv;
        return yypfloat_proc1();
    }

    private int yyr109() { // float_proc1 : RC float_number
        { yyrv = Math.sqrt(((Float)yysv[yysp-1])); }
        yysv[yysp-=2] = yyrv;
        return yypfloat_proc1();
    }

    private int yyr110() { // float_proc1 : SENO int_number
        { yyrv = Math.sin(((Integer)yysv[yysp-1])); }
        yysv[yysp-=2] = yyrv;
        return yypfloat_proc1();
    }

    private int yyr111() { // float_proc1 : SENO float_number
        { yyrv = Math.sin(((Float)yysv[yysp-1])); }
        yysv[yysp-=2] = yyrv;
        return yypfloat_proc1();
    }

    private int yyr112() { // float_proc1 : SEN int_number
        { yyrv = Math.sin(((Integer)yysv[yysp-1])); }
        yysv[yysp-=2] = yyrv;
        return yypfloat_proc1();
    }

    private int yyr113() { // float_proc1 : SEN float_number
        { yyrv = Math.sin(((Float)yysv[yysp-1])); }
        yysv[yysp-=2] = yyrv;
        return yypfloat_proc1();
    }

    private int yypfloat_proc1() {
        switch (yyst[yysp-1]) {
            case 205: return 5;
            case 132: return 5;
            case 89: return 5;
            case 87: return 5;
            case 86: return 5;
            case 85: return 5;
            case 20: return 5;
            case 0: return 5;
            default: return 116;
        }
    }

    private int yyr136() { // float_proc2 : POTENCIA float_number int_number
        { yyrv = Math.pow(((Float)yysv[yysp-2]), ((Integer)yysv[yysp-1])); }
        yysv[yysp-=3] = yyrv;
        return yypfloat_proc2();
    }

    private int yyr137() { // float_proc2 : POTENCIA int_number float_number
        { yyrv = Math.pow(((Integer)yysv[yysp-2]), ((Float)yysv[yysp-1])); }
        yysv[yysp-=3] = yyrv;
        return yypfloat_proc2();
    }

    private int yyr138() { // float_proc2 : POTENCIA float_number float_number
        { yyrv = Math.pow(((Float)yysv[yysp-2]), ((Float)yysv[yysp-1])); }
        yysv[yysp-=3] = yyrv;
        return yypfloat_proc2();
    }

    private int yyr139() { // float_proc2 : DIVISION int_number int_number
        { yyrv = ((Integer)yysv[yysp-2]) / ((Integer)yysv[yysp-1]); }
        yysv[yysp-=3] = yyrv;
        return yypfloat_proc2();
    }

    private int yyr140() { // float_proc2 : DIVISION float_number int_number
        { yyrv = ((Float)yysv[yysp-2]) / ((Integer)yysv[yysp-1]); }
        yysv[yysp-=3] = yyrv;
        return yypfloat_proc2();
    }

    private int yyr141() { // float_proc2 : DIVISION int_number float_number
        { yyrv = ((Integer)yysv[yysp-2]) / ((Float)yysv[yysp-1]); }
        yysv[yysp-=3] = yyrv;
        return yypfloat_proc2();
    }

    private int yyr142() { // float_proc2 : DIVISION float_number float_number
        { yyrv = ((Float)yysv[yysp-2]) / ((Float)yysv[yysp-1]); }
        yysv[yysp-=3] = yyrv;
        return yypfloat_proc2();
    }

    private int yypfloat_proc2() {
        switch (yyst[yysp-1]) {
            case 205: return 6;
            case 132: return 6;
            case 89: return 6;
            case 87: return 6;
            case 86: return 6;
            case 85: return 6;
            case 20: return 6;
            case 0: return 6;
            default: return 117;
        }
    }

    private int yyr186() { // float_proc_1p : ELEMENTO int_number '[' float_params_n ']'
        {yyrv=elemento_float(((Integer)yysv[yysp-4]));n_params.pop();}
        yysv[yysp-=5] = yyrv;
        switch (yyst[yysp-1]) {
            case 205: return 7;
            case 132: return 7;
            case 89: return 7;
            case 87: return 7;
            case 86: return 7;
            case 85: return 7;
            case 20: return 7;
            case 0: return 7;
            default: return 118;
        }
    }

    private int yyr165() { // float_proc_n : DIFERENCIA float_params_n
        {yyrv=(Float)proc_diferencia_Float();n_params.pop();}
        yysv[yysp-=2] = yyrv;
        return yypfloat_proc_n();
    }

    private int yyr166() { // float_proc_n : PRODUCTO float_params_n
        {yyrv=(Float)proc_producto_Float();n_params.pop();}
        yysv[yysp-=2] = yyrv;
        return yypfloat_proc_n();
    }

    private int yyr167() { // float_proc_n : SUMA float_params_n
        {yyrv=(Float)proc_suma_Float();n_params.pop();}
        yysv[yysp-=2] = yyrv;
        return yypfloat_proc_n();
    }

    private int yypfloat_proc_n() {
        switch (yyst[yysp-1]) {
            case 205: return 8;
            case 132: return 8;
            case 89: return 8;
            case 87: return 8;
            case 86: return 8;
            case 85: return 8;
            case 20: return 8;
            case 0: return 8;
            default: return 119;
        }
    }

    private int yyr176() { // float_proc_p : ELEGIR '[' float_params_n ']'
        {yyrv = elegir_float();n_params.pop();}
        yysv[yysp-=4] = yyrv;
        return yypfloat_proc_p();
    }

    private int yyr177() { // float_proc_p : ULTIMO '[' float_params_n ']'
        {yyrv = ultimo_float();n_params.pop();}
        yysv[yysp-=4] = yyrv;
        return yypfloat_proc_p();
    }

    private int yyr178() { // float_proc_p : UL '[' float_params_n ']'
        {yyrv = ultimo_float();n_params.pop();}
        yysv[yysp-=4] = yyrv;
        return yypfloat_proc_p();
    }

    private int yyr179() { // float_proc_p : PRIMERO '[' float_params_n ']'
        {yyrv = primero_float();n_params.pop();}
        yysv[yysp-=4] = yyrv;
        return yypfloat_proc_p();
    }

    private int yypfloat_proc_p() {
        switch (yyst[yysp-1]) {
            case 205: return 9;
            case 132: return 9;
            case 89: return 9;
            case 87: return 9;
            case 86: return 9;
            case 85: return 9;
            case 20: return 9;
            case 0: return 9;
            default: return 120;
        }
    }

    private int yyr26() { // instructions : expression instructions
        { procInstructions.add(yysv[yysp-2]); }
        yysv[yysp-=2] = yyrv;
        return yypinstructions();
    }

    private int yyr27() { // instructions : expression
        { procInstructions.add(yysv[yysp-1]); }
        yysv[yysp-=1] = yyrv;
        return yypinstructions();
    }

    private int yypinstructions() {
        switch (yyst[yysp-1]) {
            case 87: return 206;
            case 20: return 88;
            default: return 208;
        }
    }

    private int yyr62() { // int_arithmetic_expr : int_number '+' int_number
        { yyrv = ((Integer)yysv[yysp-3]) + ((Integer)yysv[yysp-1]); }
        yysv[yysp-=3] = yyrv;
        return yypint_arithmetic_expr();
    }

    private int yyr63() { // int_arithmetic_expr : int_number '-' int_number
        { yyrv = ((Integer)yysv[yysp-3]) - ((Integer)yysv[yysp-1]); }
        yysv[yysp-=3] = yyrv;
        return yypint_arithmetic_expr();
    }

    private int yyr64() { // int_arithmetic_expr : int_number '*' int_number
        { yyrv = ((Integer)yysv[yysp-3]) * ((Integer)yysv[yysp-1]); }
        yysv[yysp-=3] = yyrv;
        return yypint_arithmetic_expr();
    }

    private int yyr65() { // int_arithmetic_expr : '(' int_arithmetic_expr ')'
        { yyrv = ((Integer)yysv[yysp-2]); }
        yysv[yysp-=3] = yyrv;
        return yypint_arithmetic_expr();
    }

    private int yypint_arithmetic_expr() {
        switch (yyst[yysp-1]) {
            case 124: return 221;
            case 110: return 221;
            default: return 91;
        }
    }

    private int yyr31() { // int_number : INTEGER
        {yyrv = ((Integer)yysv[yysp-1]);}
        yysv[yysp-=1] = yyrv;
        return yypint_number();
    }

    private int yyr32() { // int_number : IDENTIFIER
        {yyrv=(Integer)variables.get(((String)yysv[yysp-1]));}
        yysv[yysp-=1] = yyrv;
        return yypint_number();
    }

    private int yyr33() { // int_number : int_arithmetic_expr
        yysp -= 1;
        return yypint_number();
    }

    private int yyr34() { // int_number : int_proc1
        yysp -= 1;
        return yypint_number();
    }

    private int yyr35() { // int_number : int_proc2
        yysp -= 1;
        return yypint_number();
    }

    private int yyr36() { // int_number : int_proc_p
        yysp -= 1;
        return yypint_number();
    }

    private int yyr37() { // int_number : int_proc_1p
        yysp -= 1;
        return yypint_number();
    }

    private int yyr38() { // int_number : int_proc_n
        yysp -= 1;
        return yypint_number();
    }

    private int yypint_number() {
        switch (yyst[yysp-1]) {
            case 277: return 333;
            case 264: return 325;
            case 262: return 324;
            case 261: return 322;
            case 260: return 320;
            case 259: return 318;
            case 250: return 316;
            case 249: return 313;
            case 244: return 128;
            case 230: return 303;
            case 229: return 301;
            case 228: return 299;
            case 227: return 297;
            case 226: return 295;
            case 225: return 293;
            case 224: return 291;
            case 223: return 289;
            case 217: return 286;
            case 212: return 284;
            case 211: return 283;
            case 210: return 282;
            case 202: return 156;
            case 200: return 128;
            case 199: return 128;
            case 190: return 272;
            case 179: return 128;
            case 178: return 269;
            case 177: return 267;
            case 175: return 265;
            case 171: return 264;
            case 157: return 156;
            case 152: return 258;
            case 151: return 256;
            case 150: return 254;
            case 149: return 252;
            case 146: return 248;
            case 145: return 246;
            case 133: return 128;
            case 131: return 240;
            case 130: return 238;
            case 126: return 188;
            case 125: return 128;
            case 124: return 188;
            case 110: return 222;
            case 104: return 217;
            case 103: return 216;
            case 100: return 215;
            case 84: return 156;
            case 80: return 128;
            case 78: return 156;
            case 77: return 195;
            case 76: return 193;
            case 73: return 191;
            case 72: return 190;
            case 71: return 189;
            case 70: return 188;
            case 69: return 186;
            case 68: return 185;
            case 67: return 183;
            case 66: return 128;
            case 64: return 178;
            case 63: return 176;
            case 62: return 175;
            case 61: return 174;
            case 60: return 173;
            case 53: return 156;
            case 52: return 154;
            case 51: return 152;
            case 50: return 150;
            case 47: return 146;
            case 46: return 144;
            case 45: return 142;
            case 44: return 140;
            case 43: return 138;
            case 42: return 136;
            case 41: return 134;
            case 38: return 131;
            case 37: return 128;
            case 35: return 121;
            case 30: return 112;
            case 29: return 111;
            case 28: return 92;
            default: return 213;
        }
    }

    private int yyr158() { // int_params_n : int_number int_params_n
        {n_params.peek().add(((Integer)yysv[yysp-2]));}
        yysv[yysp-=2] = yyrv;
        return yypint_params_n();
    }

    private int yyr159() { // int_params_n : int_number
        {n_params.push(new ArrayList<Object>());n_params.peek().add(((Integer)yysv[yysp-1]));}
        yysv[yysp-=1] = yyrv;
        return yypint_params_n();
    }

    private int yypint_params_n() {
        switch (yyst[yysp-1]) {
            case 220: return 276;
            case 219: return 274;
            case 218: return 271;
            case 214: return 243;
            case 213: return 236;
            case 200: return 276;
            case 199: return 274;
            case 179: return 271;
            case 133: return 243;
            case 128: return 236;
            case 125: return 234;
            case 107: return 198;
            case 106: return 181;
            case 98: return 129;
            case 80: return 198;
            case 66: return 181;
            case 37: return 129;
            default: return 311;
        }
    }

    private int yyr100() { // int_proc1 : REDONDEA float_number
        { yyrv = Math.rint(((Float)yysv[yysp-1])); }
        yysv[yysp-=2] = yyrv;
        return yypint_proc1();
    }

    private int yyr101() { // int_proc1 : AZAR int_number
        { Random ran = new Random(); yyrv = ran.nextInt(((Integer)yysv[yysp-1])); }
        yysv[yysp-=2] = yyrv;
        return yypint_proc1();
    }

    private int yyr102() { // int_proc1 : MENOS int_number
        { yyrv = ((Integer)yysv[yysp-1]) * -1; }
        yysv[yysp-=2] = yyrv;
        return yypint_proc1();
    }

    private int yypint_proc1() {
        switch (yyst[yysp-1]) {
            case 205: return 10;
            case 132: return 10;
            case 89: return 10;
            case 87: return 10;
            case 86: return 10;
            case 85: return 10;
            case 20: return 10;
            case 0: return 10;
            default: return 93;
        }
    }

    private int yyr134() { // int_proc2 : POTENCIA int_number int_number
        { yyrv = Math.pow(((Integer)yysv[yysp-2]), ((Integer)yysv[yysp-1])); }
        yysv[yysp-=3] = yyrv;
        return yypint_proc2();
    }

    private int yyr135() { // int_proc2 : RESTO int_number int_number
        { yyrv = ((Integer)yysv[yysp-2]) % ((Integer)yysv[yysp-1]); }
        yysv[yysp-=3] = yyrv;
        return yypint_proc2();
    }

    private int yypint_proc2() {
        switch (yyst[yysp-1]) {
            case 205: return 11;
            case 132: return 11;
            case 89: return 11;
            case 87: return 11;
            case 86: return 11;
            case 85: return 11;
            case 20: return 11;
            case 0: return 11;
            default: return 94;
        }
    }

    private int yyr185() { // int_proc_1p : ELEMENTO int_number '[' int_params_n ']'
        {yyrv=elemento_int(((Integer)yysv[yysp-4]));n_params.pop();}
        yysv[yysp-=5] = yyrv;
        switch (yyst[yysp-1]) {
            case 205: return 12;
            case 132: return 12;
            case 89: return 12;
            case 87: return 12;
            case 86: return 12;
            case 85: return 12;
            case 20: return 12;
            case 0: return 12;
            default: return 95;
        }
    }

    private int yyr162() { // int_proc_n : DIFERENCIA int_params_n
        {yyrv=(Integer)proc_diferencia_int();n_params.pop();}
        yysv[yysp-=2] = yyrv;
        return yypint_proc_n();
    }

    private int yyr163() { // int_proc_n : PRODUCTO int_params_n
        {yyrv=(Integer)proc_producto_int();n_params.pop();}
        yysv[yysp-=2] = yyrv;
        return yypint_proc_n();
    }

    private int yyr164() { // int_proc_n : SUMA int_params_n
        {yyrv=(Integer)proc_suma_int();n_params.pop();}
        yysv[yysp-=2] = yyrv;
        return yypint_proc_n();
    }

    private int yypint_proc_n() {
        switch (yyst[yysp-1]) {
            case 205: return 13;
            case 132: return 13;
            case 89: return 13;
            case 87: return 13;
            case 86: return 13;
            case 85: return 13;
            case 20: return 13;
            case 0: return 13;
            default: return 96;
        }
    }

    private int yyr170() { // int_proc_p : ELEGIR '[' int_params_n ']'
        {yyrv = elegir_int();n_params.pop();}
        yysv[yysp-=4] = yyrv;
        return yypint_proc_p();
    }

    private int yyr171() { // int_proc_p : CUENTA '[' int_params_n ']'
        {yyrv = cuenta();n_params.pop();}
        yysv[yysp-=4] = yyrv;
        return yypint_proc_p();
    }

    private int yyr172() { // int_proc_p : CUENTA '[' float_params_n ']'
        {yyrv = cuenta();n_params.pop();}
        yysv[yysp-=4] = yyrv;
        return yypint_proc_p();
    }

    private int yyr173() { // int_proc_p : ULTIMO '[' int_params_n ']'
        {yyrv = ultimo_int();n_params.pop();}
        yysv[yysp-=4] = yyrv;
        return yypint_proc_p();
    }

    private int yyr174() { // int_proc_p : UL '[' int_params_n ']'
        {yyrv = ultimo_int();n_params.pop();}
        yysv[yysp-=4] = yyrv;
        return yypint_proc_p();
    }

    private int yyr175() { // int_proc_p : PRIMERO '[' int_params_n ']'
        {yyrv = primero_int();n_params.pop();}
        yysv[yysp-=4] = yyrv;
        return yypint_proc_p();
    }

    private int yypint_proc_p() {
        switch (yyst[yysp-1]) {
            case 205: return 14;
            case 132: return 14;
            case 89: return 14;
            case 87: return 14;
            case 86: return 14;
            case 85: return 14;
            case 20: return 14;
            case 0: return 14;
            default: return 97;
        }
    }

    private int yyr53() { // logic_expr : int_number '<' int_number
        { yyrv = ((Integer)yysv[yysp-3]) < ((Integer)yysv[yysp-1]); }
        yysv[yysp-=3] = yyrv;
        return yyplogic_expr();
    }

    private int yyr54() { // logic_expr : float_number '<' int_number
        { yyrv = ((Float)yysv[yysp-3]) < ((Integer)yysv[yysp-1]); }
        yysv[yysp-=3] = yyrv;
        return yyplogic_expr();
    }

    private int yyr55() { // logic_expr : int_number '<' float_number
        { yyrv = ((Integer)yysv[yysp-3]) < ((Float)yysv[yysp-1]); }
        yysv[yysp-=3] = yyrv;
        return yyplogic_expr();
    }

    private int yyr56() { // logic_expr : float_number '<' float_number
        { yyrv = ((Float)yysv[yysp-3]) < ((Float)yysv[yysp-1]); }
        yysv[yysp-=3] = yyrv;
        return yyplogic_expr();
    }

    private int yyr57() { // logic_expr : int_number '>' int_number
        { yyrv = ((Integer)yysv[yysp-3]) > ((Integer)yysv[yysp-1]); }
        yysv[yysp-=3] = yyrv;
        return yyplogic_expr();
    }

    private int yyr58() { // logic_expr : float_number '>' int_number
        { yyrv = ((Float)yysv[yysp-3]) > ((Integer)yysv[yysp-1]); }
        yysv[yysp-=3] = yyrv;
        return yyplogic_expr();
    }

    private int yyr59() { // logic_expr : int_number '>' float_number
        { yyrv = ((Integer)yysv[yysp-3]) > ((Float)yysv[yysp-1]); }
        yysv[yysp-=3] = yyrv;
        return yyplogic_expr();
    }

    private int yyr60() { // logic_expr : float_number '>' float_number
        { yyrv = ((Float)yysv[yysp-3]) > ((Float)yysv[yysp-1]); }
        yysv[yysp-=3] = yyrv;
        return yyplogic_expr();
    }

    private int yyr61() { // logic_expr : bool_proc2
        {yyrv = ((Boolean)yysv[yysp-1]);}
        yysv[yysp-=1] = yyrv;
        return yyplogic_expr();
    }

    private int yyplogic_expr() {
        switch (yyst[yysp-1]) {
            case 157: return 263;
            case 84: return 202;
            case 78: return 196;
            case 53: return 157;
            default: return 278;
        }
    }

    private int yyr24() { // parameters : PARAMETER parameters
        { procParameters.add(((String)yysv[yysp-2])); }
        yysv[yysp-=2] = yyrv;
        return yypparameters();
    }

    private int yyr25() { // parameters : PARAMETER
        { procParameters.add(((String)yysv[yysp-1])); }
        yysv[yysp-=1] = yyrv;
        return yypparameters();
    }

    private int yypparameters() {
        switch (yyst[yysp-1]) {
            case 20: return 89;
            default: return 209;
        }
    }

    private int yyr189() { // proc_head : REPITE int_number
        { /* Cambiar el scope actual por REPITE */ }
        yysv[yysp-=2] = yyrv;
        return 15;
    }

    private int yyr190() { // proc_head : SI logic_expr
        { /* Verificar si se cumple la condición */ }
        yysv[yysp-=2] = yyrv;
        return 15;
    }

    private int yyr2() { // prog : expression ';' prog
        {if(yysv[yysp-3] instanceof ArrayList){
                                                 acciones.addAll((ArrayList<jsonAction>)yysv[yysp-3]);
                                             }else if(yysv[yysp-3] instanceof jsonAction){
                                                 acciones.add((jsonAction)yysv[yysp-3]);
                                             }else if(yysv[yysp-3] instanceof HashMap){
                                                 variables = mergeHash(variables,(HashMap<String,Object>)yysv[yysp-3]);
                                             }
                                            }
        yysv[yysp-=3] = yyrv;
        return yypprog();
    }

    private int yyr3() { // prog : expression ';'
        {if(yysv[yysp-2] instanceof ArrayList){
                       acciones.addAll((ArrayList<jsonAction>)yysv[yysp-2]);
                   }else if(yysv[yysp-2] instanceof jsonAction){
                       acciones.add((jsonAction)yysv[yysp-2]);
                   }else if(yysv[yysp-2] instanceof HashMap){
                       variables = mergeHash(variables,(HashMap<String,Object>)yysv[yysp-2]);
                   }
                  }
        yysv[yysp-=2] = yyrv;
        return yypprog();
    }

    private int yypprog() {
        switch (yyst[yysp-1]) {
            case 0: return 16;
            default: return 203;
        }
    }

    private int yyr143() { // bool_proc2 : IGUALES int_number int_number
        { yyrv = ((Integer)yysv[yysp-2]).equals(((Integer)yysv[yysp-1])); }
        yysv[yysp-=3] = yyrv;
        return yypbool_proc2();
    }

    private int yyr144() { // bool_proc2 : IGUALES float_number int_number
        { yyrv = ((Float)yysv[yysp-2]).equals(((Integer)yysv[yysp-1])); }
        yysv[yysp-=3] = yyrv;
        return yypbool_proc2();
    }

    private int yyr145() { // bool_proc2 : IGUALES int_number float_number
        { yyrv = ((Integer)yysv[yysp-2]).equals(((Float)yysv[yysp-1])); }
        yysv[yysp-=3] = yyrv;
        return yypbool_proc2();
    }

    private int yyr146() { // bool_proc2 : IGUALES float_number float_number
        { yyrv = ((Float)yysv[yysp-2]).equals(((Float)yysv[yysp-1])); }
        yysv[yysp-=3] = yyrv;
        return yypbool_proc2();
    }

    private int yyr147() { // bool_proc2 : Y logic_expr logic_expr
        { yyrv = ((Boolean)yysv[yysp-2]) && ((Boolean)yysv[yysp-1]); }
        yysv[yysp-=3] = yyrv;
        return yypbool_proc2();
    }

    private int yyr148() { // bool_proc2 : O logic_expr logic_expr
        { yyrv = ((Boolean)yysv[yysp-2]) || ((Boolean)yysv[yysp-1]); }
        yysv[yysp-=3] = yyrv;
        return yypbool_proc2();
    }

    private int yyr149() { // bool_proc2 : MAYORQUE int_number int_number
        { yyrv = ((Integer)yysv[yysp-2]) > ((Integer)yysv[yysp-1]); }
        yysv[yysp-=3] = yyrv;
        return yypbool_proc2();
    }

    private int yyr150() { // bool_proc2 : MAYORQUE float_number int_number
        { yyrv = ((Float)yysv[yysp-2]) > ((Integer)yysv[yysp-1]); }
        yysv[yysp-=3] = yyrv;
        return yypbool_proc2();
    }

    private int yyr151() { // bool_proc2 : MAYORQUE int_number float_number
        { yyrv = ((Integer)yysv[yysp-2]) > ((Float)yysv[yysp-1]); }
        yysv[yysp-=3] = yyrv;
        return yypbool_proc2();
    }

    private int yyr152() { // bool_proc2 : MAYORQUE float_number float_number
        { yyrv = ((Float)yysv[yysp-2]) > ((Float)yysv[yysp-1]); }
        yysv[yysp-=3] = yyrv;
        return yypbool_proc2();
    }

    private int yyr153() { // bool_proc2 : MENORQUE int_number int_number
        { yyrv = ((Integer)yysv[yysp-2]) < ((Integer)yysv[yysp-1]); }
        yysv[yysp-=3] = yyrv;
        return yypbool_proc2();
    }

    private int yyr154() { // bool_proc2 : MENORQUE float_number int_number
        { yyrv = ((Float)yysv[yysp-2]) < ((Integer)yysv[yysp-1]); }
        yysv[yysp-=3] = yyrv;
        return yypbool_proc2();
    }

    private int yyr155() { // bool_proc2 : MENORQUE int_number float_number
        { yyrv = ((Integer)yysv[yysp-2]) < ((Float)yysv[yysp-1]); }
        yysv[yysp-=3] = yyrv;
        return yypbool_proc2();
    }

    private int yyr156() { // bool_proc2 : MENORQUE float_number float_number
        { yyrv = ((Float)yysv[yysp-2]) < ((Float)yysv[yysp-1]); }
        yysv[yysp-=3] = yyrv;
        return yypbool_proc2();
    }

    private int yypbool_proc2() {
        switch (yyst[yysp-1]) {
            case 202: return 158;
            case 157: return 158;
            case 84: return 158;
            case 78: return 158;
            case 53: return 158;
            default: return 17;
        }
    }

    private int yyr48() { // redeclaration_expr : INIC IDENTIFIER '=' int_number
        { variables.replace(((String)yysv[yysp-3]),((Integer)yysv[yysp-1])); }
        yysv[yysp-=4] = yyrv;
        return 18;
    }

    private int yyr49() { // redeclaration_expr : INIC IDENTIFIER '=' float_number
        { variables.replace(((String)yysv[yysp-3]),((Float)yysv[yysp-1])); }
        yysv[yysp-=4] = yyrv;
        return 18;
    }

    private int yyr28() { // user_procedure : user_procedure_head instructions FIN
        { 
        procHandler.add(varHandler.getScope(), procInstructions);
        varHandler.resetScope();
        procInstructions.clear(); }
        yysv[yysp-=3] = yyrv;
        return 19;
    }

    private int yyr29() { // user_procedure : user_procedure_head parameters instructions FIN
        { 
        procHandler.add(varHandler.getScope(), procParameters, procInstructions);
        varHandler.resetScope();
        procParameters.clear();
        procInstructions.clear(); }
        yysv[yysp-=4] = yyrv;
        return 19;
    }

    private int yyr30() { // user_procedure_head : PARA PROCEDURE_NAME
        { varHandler.setScope(((String)yysv[yysp-1])); }
        yysv[yysp-=2] = yyrv;
        return 20;
    }

    private int yyr90() { // void_proc : OCULTATORTUGA
        {yyrv =new jsonAction("ocultatortuga",1,null);}
        yysv[yysp-=1] = yyrv;
        return 21;
    }

    private int yyr91() { // void_proc : OT
        {yyrv = new jsonAction("ocultatortuga",1,null);}
        yysv[yysp-=1] = yyrv;
        return 21;
    }

    private int yyr92() { // void_proc : APARECETORTUGA
        {yyrv = new jsonAction("aparecetortuga",1,null);}
        yysv[yysp-=1] = yyrv;
        return 21;
    }

    private int yyr93() { // void_proc : AT
        {yyrv = new jsonAction("aparecetortuga",1,null);}
        yysv[yysp-=1] = yyrv;
        return 21;
    }

    private int yyr94() { // void_proc : BAJALAPIZ
        {yyrv = new jsonAction("aparecetortuga",1,null);}
        yysv[yysp-=1] = yyrv;
        return 21;
    }

    private int yyr95() { // void_proc : BL
        { yyrv = new jsonAction("aparecetortuga",1,null);}
        yysv[yysp-=1] = yyrv;
        return 21;
    }

    private int yyr96() { // void_proc : SUBELAPIZ
        {yyrv = new jsonAction("aparecetortuga",1,null);}
        yysv[yysp-=1] = yyrv;
        return 21;
    }

    private int yyr97() { // void_proc : SB
        {yyrv = new jsonAction("aparecetortuga",1,null);}
        yysv[yysp-=1] = yyrv;
        return 21;
    }

    private int yyr98() { // void_proc : CENTRO
        { yyrv = new jsonAction("aparecetortuga",1,null);}
        yysv[yysp-=1] = yyrv;
        return 21;
    }

    private int yyr99() { // void_proc : BORRAPANTALLA
        { yyrv = new jsonAction("aparecetortuga",1,null);}
        yysv[yysp-=1] = yyrv;
        return 21;
    }

    private int yyr114() { // void_proc1 : AVANZA int_number
        {ArrayList<Object> argumentos = new ArrayList<Object>();
                                argumentos.add(((Integer)yysv[yysp-1]));
                                yyrv = new jsonAction("avanza",1,(ArrayList<Object>)argumentos);}
        yysv[yysp-=2] = yyrv;
        return 22;
    }

    private int yyr115() { // void_proc1 : AV int_number
        {ArrayList<Object> argumentos = new ArrayList<Object>();
                                argumentos.add(((Integer)yysv[yysp-1]));
                                yyrv = new jsonAction("avanza",1,(ArrayList<Object>)argumentos);}
        yysv[yysp-=2] = yyrv;
        return 22;
    }

    private int yyr116() { // void_proc1 : RETROCEDE int_number
        {ArrayList<Object> argumentos = new ArrayList<Object>();
                                argumentos.add(((Integer)yysv[yysp-1]));
                                yyrv = new jsonAction("retrocede",1,(ArrayList<Object>)argumentos);}
        yysv[yysp-=2] = yyrv;
        return 22;
    }

    private int yyr117() { // void_proc1 : RE int_number
        {ArrayList<Object> argumentos = new ArrayList<Object>();
                                argumentos.add(((Integer)yysv[yysp-1]));
                                yyrv = new jsonAction("retrocede",1,(ArrayList<Object>)argumentos);}
        yysv[yysp-=2] = yyrv;
        return 22;
    }

    private int yyr118() { // void_proc1 : GIRADERECHA int_number
        {ArrayList<Object> argumentos = new ArrayList<Object>();
                                argumentos.add(((Integer)yysv[yysp-1]));
                                yyrv = new jsonAction("giraderecha",1,(ArrayList<Object>)argumentos);}
        yysv[yysp-=2] = yyrv;
        return 22;
    }

    private int yyr119() { // void_proc1 : GIRADERECHA float_number
        {ArrayList<Object> argumentos = new ArrayList<Object>();
                                  argumentos.add(((Float)yysv[yysp-1]));
                                  yyrv = new jsonAction("giraderecha",1,(ArrayList<Object>)argumentos);}
        yysv[yysp-=2] = yyrv;
        return 22;
    }

    private int yyr120() { // void_proc1 : GD int_number
        {ArrayList<Object> argumentos = new ArrayList<Object>();
                                argumentos.add(((Integer)yysv[yysp-1]));
                                yyrv = new jsonAction("giraderecha",1,(ArrayList<Object>)argumentos);}
        yysv[yysp-=2] = yyrv;
        return 22;
    }

    private int yyr121() { // void_proc1 : GD float_number
        {ArrayList<Object> argumentos = new ArrayList<Object>();
                                  argumentos.add(((Float)yysv[yysp-1]));
                                  yyrv = new jsonAction("giraderecha",1,(ArrayList<Object>)argumentos);}
        yysv[yysp-=2] = yyrv;
        return 22;
    }

    private int yyr122() { // void_proc1 : GIRAIZQUIERDA int_number
        {ArrayList<Object> argumentos = new ArrayList<Object>();
                                argumentos.add(((Integer)yysv[yysp-1]));
                                yyrv = new jsonAction("giraizquierda",1,(ArrayList<Object>)argumentos);}
        yysv[yysp-=2] = yyrv;
        return 22;
    }

    private int yyr123() { // void_proc1 : GIRAIZQUIERDA float_number
        {ArrayList<Object> argumentos = new ArrayList<Object>();
                                  argumentos.add(((Float)yysv[yysp-1]));
                                  yyrv = new jsonAction("giraizquierda",1,(ArrayList<Object>)argumentos);}
        yysv[yysp-=2] = yyrv;
        return 22;
    }

    private int yyr124() { // void_proc1 : GI int_number
        {ArrayList<Object> argumentos = new ArrayList<Object>();
                                argumentos.add(((Integer)yysv[yysp-1]));
                                yyrv = new jsonAction("giraizquierda",1,(ArrayList<Object>)argumentos);}
        yysv[yysp-=2] = yyrv;
        return 22;
    }

    private int yyr125() { // void_proc1 : GI float_number
        {ArrayList<Object> argumentos = new ArrayList<Object>();
                                  argumentos.add(((Float)yysv[yysp-1]));
                                  yyrv = new jsonAction("giraizquierda",1,(ArrayList<Object>)argumentos);}
        yysv[yysp-=2] = yyrv;
        return 22;
    }

    private int yyr126() { // void_proc1 : PONRUMBO int_number
        {ArrayList<Object> argumentos = new ArrayList<Object>();
                                argumentos.add(((Integer)yysv[yysp-1]));
                                yyrv = new jsonAction("ponrumbo",1,(ArrayList<Object>)argumentos);
                                variables.replace("rumbo",(Integer)((Integer)yysv[yysp-1]));}
        yysv[yysp-=2] = yyrv;
        return 22;
    }

    private int yyr127() { // void_proc1 : PONRUMBO float_number
        {ArrayList<Object> argumentos = new ArrayList<Object>();
                                  argumentos.add(((Float)yysv[yysp-1]));
                                  yyrv = new jsonAction("ponrumbo",1,(ArrayList<Object>)argumentos);
                                  variables.replace("rumbo",((Float)yysv[yysp-1]));}
        yysv[yysp-=2] = yyrv;
        return 22;
    }

    private int yyr128() { // void_proc1 : PONX int_number
        {ArrayList<Object> argumentos = new ArrayList<Object>();
                                argumentos.add(((Integer)yysv[yysp-1]));
                                yyrv = new jsonAction("ponx",1,(ArrayList<Object>)argumentos);
                                variables.replace("x",(Integer)((Integer)yysv[yysp-1]));}
        yysv[yysp-=2] = yyrv;
        return 22;
    }

    private int yyr129() { // void_proc1 : PONY int_number
        {ArrayList<Object> argumentos = new ArrayList<Object>();
                                argumentos.add(((Integer)yysv[yysp-1]));
                                yyrv = new jsonAction("ponx",1,(ArrayList<Object>)argumentos);
                                variables.replace("y",((Integer)yysv[yysp-1]));}
        yysv[yysp-=2] = yyrv;
        return 22;
    }

    private int yyr130() { // void_proc1 : PONCOLORLAPIZ color
        {ArrayList<Object> argumentos = new ArrayList<Object>();
                           argumentos.add(((String)yysv[yysp-1]));
                           yyrv = new jsonAction("poncolorlapiz",1,(ArrayList<Object>)argumentos);
                           variables.replace("colorlapiz",((String)yysv[yysp-1]));}
        yysv[yysp-=2] = yyrv;
        return 22;
    }

    private int yyr131() { // void_proc1 : PONCL color
        {ArrayList<Object> argumentos = new ArrayList<Object>();
                           argumentos.add(((String)yysv[yysp-1]));
                           yyrv = new jsonAction("poncolorlapiz",1,(ArrayList<Object>)argumentos);
                           variables.replace("colorlapiz",((String)yysv[yysp-1]));}
        yysv[yysp-=2] = yyrv;
        return 22;
    }

    private int yyr132() { // void_proc1 : ESPERA int_number
        {ArrayList<Object> argumentos = new ArrayList<Object>();
                                argumentos.add(((Integer)yysv[yysp-1]));
                                yyrv = new jsonAction("espera",1,(ArrayList<Object>)argumentos);}
        yysv[yysp-=2] = yyrv;
        return 22;
    }

    private int yyr133() { // void_proc1 : ESPERA float_number
        {ArrayList<Object> argumentos = new ArrayList<Object>();
                                  argumentos.add(((Float)yysv[yysp-1]));
                                  yyrv = new jsonAction("espera",1,(ArrayList<Object>)argumentos);}
        yysv[yysp-=2] = yyrv;
        return 22;
    }

    private int yyr157() { // void_proc2 : PONXY int_number int_number
        {ArrayList<Object> argumentos = new ArrayList<Object>();
                                   argumentos.add(((Integer)yysv[yysp-2]));
                                   argumentos.add(((Integer)yysv[yysp-1]));
                                   yyrv = new jsonAction("espera",1,(ArrayList<Object>)argumentos);
                                   variables.replace("x",((Integer)yysv[yysp-2]));
                                   variables.replace("y",((Integer)yysv[yysp-1]));}
        yysv[yysp-=3] = yyrv;
        return 23;
    }

    private int yyr187() { // void_proc_1p : proc_head '[' expr_procs_n ']'
        {jsonAction result = new jsonAction();result.setAccion("complejo");result.setComplejo((ArrayList<jsonAction>)yysv[yysp-1]);result.setRepeticiones((Integer)yysv[yysp-3]);yyrv=result;}
        yysv[yysp-=4] = yyrv;
        return 24;
    }

    private int yyr188() { // void_proc_1p : proc_head '[' expr_procs_n ']'
        {if((boolean)yysv[yysp-3]){yyrv=yysv[yysp-1];}else{yyrv=null;}}
        yysv[yysp-=4] = yyrv;
        return 24;
    }

    private int yyr180() { // void_proc_p : INC '[' IDENTIFIER ']'
        {variables.replace(((String)yysv[yysp-2]), (Integer)variables.get(((String)yysv[yysp-2]))+1);}
        yysv[yysp-=4] = yyrv;
        return 25;
    }

    private int yyr181() { // void_proc_p : INC '[' IDENTIFIER int_number ']'
        {variables.replace(((String)yysv[yysp-3]), (Integer)variables.get(((String)yysv[yysp-3]))+((Integer)yysv[yysp-2]));}
        yysv[yysp-=5] = yyrv;
        return 25;
    }

    private int yyr182() { // void_proc_p : INC '[' IDENTIFIER float_number ']'
        {variables.replace(((String)yysv[yysp-3]), (Float)variables.get(((String)yysv[yysp-3]))+((Float)yysv[yysp-2]));}
        yysv[yysp-=5] = yyrv;
        return 25;
    }

    private int yyr183() { // void_proc_p : PONPOS '[' int_number int_number ']'
        {ArrayList<Object> argumentos = new ArrayList<Object>();
                                                                                 argumentos.add(yysv[yysp-4]);
                                                                                 argumentos.add(((Integer)yysv[yysp-3]));
                                                                                 yyrv = new jsonAction("espera",1,(ArrayList<Object>)argumentos);
                                                                                 variables.replace("x",((Integer)yysv[yysp-3]));
                                                                                 variables.replace("y",((Integer)yysv[yysp-2]));}
        yysv[yysp-=5] = yyrv;
        return 25;
    }

    private int yyr184() { // void_proc_p : EJECUTA '[' expr_procs_n ']'
        {yyrv=yysv[yysp-2];}
        yysv[yysp-=4] = yyrv;
        return 25;
    }

    protected String[] yyerrmsgs = {
    };


    public Lexer lexer;
    
    public VariableHandler varHandler;
    public ProcedureHandler procHandler;
    public ArrayList<String> procParameters; //Para almacenar parámetros de un procedimiento temporalmente
    public ArrayList<String> procInstructions; //Para almacenar instrucciones de un procedimineto temporalmente

        private ArrayList<jsonAction> acciones; // Aqui se guardan las acciones definitivas a ejecutar en la interfaz, TODO: Guardar una version en texto plano de este array list en un documento
        private Stack<ArrayList<jsonAction>> quaseAcciones; // Aqui se guardan las acciones que el compilador tiene por definir si se van a agregar al codigo de maquina
        private HashMap<String, Object> variables; // Aqui se guardan las variables en tiempo de compilacion

        // Variables para la ejecucion de procedimientos con n params
        private Stack<ArrayList<Object>> n_params; // Aqui se guardan los parametros de los procedimientos que tienen multiples parametros
        private String proc; // Procedimiento a ejecutar

    public void yyerror(String msg) {
        int lastToken = lexer.getCurrentToken(); //Para verificar si se llegó al final de línea.
        if (lastToken == 0) {
            parseFinished();
            return;
        }

        System.out.println(msg);
        System.out.println("En " + lexer.getSemantic() + ", línea " + (lexer.getCurrentLine() + 1) + ". columna " + (lexer.getCurrentColumn() + 1));
    }

    public Parser(String ruta) {
        quaseAcciones = new Stack<ArrayList<jsonAction>>();
            acciones = new ArrayList<jsonAction>();
            variables = new HashMap<String, Object>();
            n_params = new Stack<ArrayList<Object>>();

        varHandler = new VariableHandler();
        procHandler = new ProcedureHandler();
        procParameters = new ArrayList<>();
        procInstructions = new ArrayList<>();

            // Inicializacion de variables predefinidas
            variables.put("rumbo",new Float(0.0));
            variables.put("colorlapiz","negro");
            variables.put("x",300.0);
            variables.put("y",300.0);
        try {
            Reader reader = new BufferedReader(new FileReader(ruta));
            lexer = new Lexer(reader);
            lexer.getNextToken();
        } catch (IOException ex) {
            yyerror("Could not open file for parsing.");
        }
    }

    /**
    * Metodo que representa el procedimiento elemento
    * @return El elemento en la posicion n-esima de los parametros.
     */
    private Integer elemento_int(Integer n){
        return (Integer)n_params.peek().get(n);
    }

    private Float elemento_float(Integer n){
        return (Float)n_params.peek().get(n);
    }

    /**
    * Metodo que representa el proceso de suma con n parametros
    * @return La suma de los n parametros.
    */
    private Float proc_suma_Float(){
        if(n_params.peek().size()==0){
            return new Float(0.0);
        }else{
            return (Float)n_params.peek().remove(n_params.peek().size()-1) + proc_suma_Float();
        }
    }
    private Integer proc_suma_int(){
            if(n_params.peek().size()==0){
                return 0;
            }else{
                return (Integer)n_params.peek().remove(n_params.peek().size()-1) + proc_suma_int();
            }
        }
    /**
        * Metodo que representa el proceso de producto con n parametros
        * @return La suma de los n parametros.
        */
        private Float proc_diferencia_Float(){
            Float resultado = (Float)n_params.peek().get(n_params.peek().size()-1);
            for(int i=n_params.peek().size()-2;i>=0;i--){
                resultado -= (Float)n_params.peek().get(i);
            }
            return resultado;
        }
        private Integer proc_diferencia_int(){
                    Integer resultado = (Integer)n_params.peek().get(n_params.peek().size()-1);
                    for(int i=n_params.peek().size()-2;i>=0;i--){
                        resultado -= (Integer)n_params.peek().get(i);
                    }
                    return resultado;
                }
        /**
        * Metodo que representa el proceso de producto con n parametros
        * @return La suma de los n parametros.
        */
        private Float proc_producto_Float(){
            if(n_params.peek().size()==0){
                return new Float(1.0);
            }else{
                return (Float)n_params.peek().remove(n_params.peek().size()-1) * proc_producto_Float();
            }
        }
        private Integer proc_producto_int(){
            if(n_params.peek().size()==0){
                return 1;
            }else{
                return (Integer)n_params.peek().remove(n_params.peek().size()-1) * proc_producto_int();
            }
        }

    /**
     * Metodo que representa el procedimiento elegir.
     * @return Un numero al azar entre los numeros en los parametros.
     */
    private Integer elegir_int(){
        return (Integer)n_params.peek().get(new Random().nextInt(n_params.peek().size()));
    }

    private Float elegir_float(){
        return (Float)n_params.peek().get(new Random().nextInt(n_params.peek().size()));
    }

    /**
    * Metodo que representa el procedimiento cuenta
    * @return Numero de parametros
    */
    private Integer cuenta(){
        return n_params.peek().size();
    }

    /**
    * Metodo que representa el procedimiento ultimo.
    * @return Retorna el ultimo elemento de los parametros.
     */
    private Integer ultimo_int(){
        return (Integer)n_params.peek().get(0);
    }

    private Float ultimo_float(){
        return (Float)n_params.peek().get(0);
    }

    /**
    * Metodo que representa el procedimiento primero.
    * @return El primero de los parametros.
     */
    private Integer primero_int(){
        return (Integer) n_params.peek().get(n_params.peek().size()-1);
    }

    private Float primero_float(){
        return (Float) n_params.peek().get(n_params.peek().size()-1);
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

        //TEST
        varHandler.printVars();
        procHandler.printProcedures();
    }

    public static void main(String[] args) {
        //TODO: recibir ruta desde args.
        String path = "/src/Compiler/Lex/parse.txt";
        String ruta  = System.getProperty("user.dir").replaceAll("\\\\", "/") + path;
        Parser parser = new Parser(ruta);
        parser.parse();
    }

}
