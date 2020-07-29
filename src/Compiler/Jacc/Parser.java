// Output created by jacc on Wed Jul 29 13:13:36 CST 2020

package Compiler.Jacc;

import Compiler.Lex.Lexer;
import Logic.MessageType;
import Logic.jsonAction;

import java.io.*;
import java.util.ArrayList;
import java.util.Random;

public class Parser implements ParserTokens {
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
                case 331:
                    yyn = yys0();
                    continue;

                case 1:
                    yyst[yysp] = 1;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 332:
                    switch (yytok) {
                        case ENDINPUT:
                            yyn = 662;
                            continue;
                    }
                    yyn = 665;
                    continue;

                case 2:
                    yyst[yysp] = 2;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 333:
                    yyn = yys2();
                    continue;

                case 3:
                    yyst[yysp] = 3;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 334:
                    switch (yytok) {
                        case ';':
                            yyn = 89;
                            continue;
                        case ENDINPUT:
                            yyn = yyr2();
                            continue;
                    }
                    yyn = 665;
                    continue;

                case 4:
                    yyst[yysp] = 4;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 335:
                    yyn = yys4();
                    continue;

                case 5:
                    yyst[yysp] = 5;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 336:
                    yyn = yys5();
                    continue;

                case 6:
                    yyst[yysp] = 6;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 337:
                    yyn = yys6();
                    continue;

                case 7:
                    yyst[yysp] = 7;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 338:
                    yyn = yys7();
                    continue;

                case 8:
                    yyst[yysp] = 8;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 339:
                    yyn = yys8();
                    continue;

                case 9:
                    yyst[yysp] = 9;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 340:
                    yyn = yys9();
                    continue;

                case 10:
                    yyst[yysp] = 10;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 341:
                    yyn = yys10();
                    continue;

                case 11:
                    yyst[yysp] = 11;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 342:
                    yyn = yys11();
                    continue;

                case 12:
                    yyst[yysp] = 12;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 343:
                    yyn = yys12();
                    continue;

                case 13:
                    yyst[yysp] = 13;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 344:
                    yyn = yys13();
                    continue;

                case 14:
                    yyst[yysp] = 14;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 345:
                    yyn = yys14();
                    continue;

                case 15:
                    yyst[yysp] = 15;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 346:
                    yyn = yys15();
                    continue;

                case 16:
                    yyst[yysp] = 16;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 347:
                    yyn = yys16();
                    continue;

                case 17:
                    yyst[yysp] = 17;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 348:
                    yyn = yys17();
                    continue;

                case 18:
                    yyst[yysp] = 18;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 349:
                    yyn = yys18();
                    continue;

                case 19:
                    yyst[yysp] = 19;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 350:
                    yyn = yys19();
                    continue;

                case 20:
                    yyst[yysp] = 20;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 351:
                    yyn = yys20();
                    continue;

                case 21:
                    yyst[yysp] = 21;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 352:
                    yyn = yys21();
                    continue;

                case 22:
                    yyst[yysp] = 22;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 353:
                    yyn = yys22();
                    continue;

                case 23:
                    yyst[yysp] = 23;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 354:
                    yyn = yys23();
                    continue;

                case 24:
                    yyst[yysp] = 24;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 355:
                    yyn = yys24();
                    continue;

                case 25:
                    yyst[yysp] = 25;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 356:
                    yyn = yys25();
                    continue;

                case 26:
                    yyst[yysp] = 26;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 357:
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
                case 358:
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
                case 359:
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
                case 360:
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
                case 361:
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
                case 362:
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
                case 363:
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
                case 364:
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
                case 365:
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
                case 366:
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
                case 367:
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
                case 368:
                    switch (yytok) {
                        case '[':
                            yyn = 132;
                            continue;
                    }
                    yyn = 665;
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
                case 369:
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
                case 370:
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
                case 371:
                    switch (yytok) {
                        case '[':
                            yyn = 139;
                            continue;
                    }
                    yyn = 665;
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
                case 372:
                    switch (yytok) {
                        case '[':
                            yyn = 140;
                            continue;
                    }
                    yyn = 665;
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
                case 373:
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
                case 374:
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
                case 375:
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
                case 376:
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
                case 377:
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
                case 378:
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
                case 379:
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
                case 380:
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
                case 381:
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
                case 382:
                    switch (yytok) {
                        case '[':
                            yyn = 154;
                            continue;
                    }
                    yyn = 665;
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
                case 383:
                    switch (yytok) {
                        case IDENTIFIER:
                            yyn = 155;
                            continue;
                    }
                    yyn = 665;
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
                case 384:
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
                case 385:
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
                case 386:
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
                case 387:
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
                case 388:
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
                case 389:
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
                case 390:
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
                case 391:
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
                case 392:
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
                case 393:
                    switch (yytok) {
                        case '[':
                            yyn = 175;
                            continue;
                    }
                    yyn = 665;
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
                case 394:
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
                case 395:
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
                case 396:
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
                case 397:
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
                case 398:
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
                case 399:
                    switch (yytok) {
                        case '[':
                            yyn = 183;
                            continue;
                    }
                    yyn = 665;
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
                case 400:
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
                case 401:
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
                case 402:
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
                case 403:
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
                case 404:
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
                case 405:
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
                case 406:
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
                case 407:
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
                case 408:
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
                case 409:
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
                case 410:
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
                case 411:
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
                case 412:
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
                case 413:
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
                case 414:
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
                case 415:
                    switch (yytok) {
                        case '[':
                            yyn = 203;
                            continue;
                    }
                    yyn = 665;
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
                case 416:
                    switch (yytok) {
                        case '[':
                            yyn = 204;
                            continue;
                    }
                    yyn = 665;
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
                case 417:
                    switch (yytok) {
                        case IDENTIFIER:
                            yyn = 205;
                            continue;
                    }
                    yyn = 665;
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
                case 418:
                    yyn = yys87();
                    continue;

                case 88:
                    yyst[yysp] = 88;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.getNextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 419:
                    yyn = yys88();
                    continue;

                case 89:
                    yyst[yysp] = 89;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.getNextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 420:
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
                case 421:
                    yyn = yys90();
                    continue;

                case 91:
                    yyst[yysp] = 91;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.getNextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 422:
                    yyn = yys91();
                    continue;

                case 92:
                    yyst[yysp] = 92;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.getNextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 423:
                    yyn = yys92();
                    continue;

                case 93:
                    yyst[yysp] = 93;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.getNextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 424:
                    yyn = yys93();
                    continue;

                case 94:
                    yyst[yysp] = 94;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.getNextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 425:
                    yyn = yys94();
                    continue;

                case 95:
                    yyst[yysp] = 95;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.getNextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 426:
                    yyn = yys95();
                    continue;

                case 96:
                    yyst[yysp] = 96;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.getNextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 427:
                    yyn = yys96();
                    continue;

                case 97:
                    yyst[yysp] = 97;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.getNextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 428:
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
                case 429:
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
                case 430:
                    yyn = yys99();
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
                case 431:
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
                case 432:
                    yyn = yys101();
                    continue;

                case 102:
                    yyst[yysp] = 102;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 433:
                    yyn = yys102();
                    continue;

                case 103:
                    yyst[yysp] = 103;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 434:
                    yyn = yys103();
                    continue;

                case 104:
                    yyst[yysp] = 104;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 435:
                    yyn = yys104();
                    continue;

                case 105:
                    yyst[yysp] = 105;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 436:
                    yyn = yys105();
                    continue;

                case 106:
                    yyst[yysp] = 106;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 437:
                    yyn = yys106();
                    continue;

                case 107:
                    yyst[yysp] = 107;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 438:
                    yyn = yys107();
                    continue;

                case 108:
                    yyst[yysp] = 108;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 439:
                    yyn = yys108();
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
                case 440:
                    yyn = yys109();
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
                case 441:
                    switch (yytok) {
                        case '[':
                            yyn = 239;
                            continue;
                    }
                    yyn = 665;
                    continue;

                case 111:
                    yyst[yysp] = 111;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.getNextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 442:
                    yyn = yys111();
                    continue;

                case 112:
                    yyst[yysp] = 112;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.getNextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 443:
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
                case 444:
                    yyn = yys113();
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
                case 445:
                    yyn = yys114();
                    continue;

                case 115:
                    yyst[yysp] = 115;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.getNextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 446:
                    switch (yytok) {
                        case '[':
                            yyn = 243;
                            continue;
                    }
                    yyn = 665;
                    continue;

                case 116:
                    yyst[yysp] = 116;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.getNextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 447:
                    yyn = yys116();
                    continue;

                case 117:
                    yyst[yysp] = 117;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.getNextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 448:
                    yyn = yys117();
                    continue;

                case 118:
                    yyst[yysp] = 118;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.getNextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 449:
                    switch (yytok) {
                        case '[':
                            yyn = 244;
                            continue;
                    }
                    yyn = 665;
                    continue;

                case 119:
                    yyst[yysp] = 119;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.getNextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 450:
                    switch (yytok) {
                        case '[':
                            yyn = 245;
                            continue;
                    }
                    yyn = 665;
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
                case 451:
                    yyn = yys120();
                    continue;

                case 121:
                    yyst[yysp] = 121;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 452:
                    yyn = yys121();
                    continue;

                case 122:
                    yyst[yysp] = 122;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 453:
                    yyn = yys122();
                    continue;

                case 123:
                    yyst[yysp] = 123;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 454:
                    yyn = yys123();
                    continue;

                case 124:
                    yyst[yysp] = 124;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 455:
                    yyn = yys124();
                    continue;

                case 125:
                    yyst[yysp] = 125;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 456:
                    yyn = yys125();
                    continue;

                case 126:
                    yyst[yysp] = 126;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 457:
                    yyn = yys126();
                    continue;

                case 127:
                    yyst[yysp] = 127;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 458:
                    yyn = yys127();
                    continue;

                case 128:
                    yyst[yysp] = 128;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 459:
                    yyn = yys128();
                    continue;

                case 129:
                    yyst[yysp] = 129;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 460:
                    yyn = yys129();
                    continue;

                case 130:
                    yyst[yysp] = 130;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 461:
                    yyn = yys130();
                    continue;

                case 131:
                    yyst[yysp] = 131;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 462:
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
                case 463:
                    yyn = yys132();
                    continue;

                case 133:
                    yyst[yysp] = 133;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 464:
                    yyn = yys133();
                    continue;

                case 134:
                    yyst[yysp] = 134;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 465:
                    yyn = yys134();
                    continue;

                case 135:
                    yyst[yysp] = 135;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 466:
                    yyn = yys135();
                    continue;

                case 136:
                    yyst[yysp] = 136;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 467:
                    yyn = yys136();
                    continue;

                case 137:
                    yyst[yysp] = 137;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 468:
                    yyn = yys137();
                    continue;

                case 138:
                    yyst[yysp] = 138;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 469:
                    yyn = yys138();
                    continue;

                case 139:
                    yyst[yysp] = 139;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.getNextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 470:
                    yyn = yys139();
                    continue;

                case 140:
                    yyst[yysp] = 140;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.getNextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 471:
                    yyn = yys140();
                    continue;

                case 141:
                    yyst[yysp] = 141;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 472:
                    switch (yytok) {
                        case '*':
                            yyn = 235;
                            continue;
                        case '+':
                            yyn = 236;
                            continue;
                        case '-':
                            yyn = 237;
                            continue;
                        case '[':
                            yyn = 259;
                            continue;
                    }
                    yyn = 665;
                    continue;

                case 142:
                    yyst[yysp] = 142;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 473:
                    yyn = yys142();
                    continue;

                case 143:
                    yyst[yysp] = 143;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 474:
                    yyn = yys143();
                    continue;

                case 144:
                    yyst[yysp] = 144;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 475:
                    yyn = yys144();
                    continue;

                case 145:
                    yyst[yysp] = 145;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 476:
                    yyn = yys145();
                    continue;

                case 146:
                    yyst[yysp] = 146;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 477:
                    yyn = yys146();
                    continue;

                case 147:
                    yyst[yysp] = 147;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 478:
                    yyn = yys147();
                    continue;

                case 148:
                    yyst[yysp] = 148;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 479:
                    yyn = yys148();
                    continue;

                case 149:
                    yyst[yysp] = 149;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 480:
                    yyn = yys149();
                    continue;

                case 150:
                    yyst[yysp] = 150;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 481:
                    yyn = yys150();
                    continue;

                case 151:
                    yyst[yysp] = 151;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 482:
                    yyn = yys151();
                    continue;

                case 152:
                    yyst[yysp] = 152;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 483:
                    yyn = yys152();
                    continue;

                case 153:
                    yyst[yysp] = 153;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 484:
                    yyn = yys153();
                    continue;

                case 154:
                    yyst[yysp] = 154;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.getNextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 485:
                    switch (yytok) {
                        case IDENTIFIER:
                            yyn = 264;
                            continue;
                    }
                    yyn = 665;
                    continue;

                case 155:
                    yyst[yysp] = 155;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.getNextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 486:
                    switch (yytok) {
                        case '=':
                            yyn = 265;
                            continue;
                    }
                    yyn = 665;
                    continue;

                case 156:
                    yyst[yysp] = 156;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 487:
                    yyn = yys156();
                    continue;

                case 157:
                    yyst[yysp] = 157;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 488:
                    yyn = yys157();
                    continue;

                case 158:
                    yyst[yysp] = 158;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 489:
                    yyn = yys158();
                    continue;

                case 159:
                    yyst[yysp] = 159;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 490:
                    yyn = yys159();
                    continue;

                case 160:
                    yyst[yysp] = 160;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 491:
                    yyn = yys160();
                    continue;

                case 161:
                    yyst[yysp] = 161;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 492:
                    yyn = yys161();
                    continue;

                case 162:
                    yyst[yysp] = 162;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 493:
                    yyn = yys162();
                    continue;

                case 163:
                    yyst[yysp] = 163;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 494:
                    yyn = yys163();
                    continue;

                case 164:
                    yyst[yysp] = 164;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 495:
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
                case 496:
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
                case 497:
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
                case 498:
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
                case 499:
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
                case 500:
                    yyn = yys169();
                    continue;

                case 170:
                    yyst[yysp] = 170;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.getNextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 501:
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
                case 502:
                    yyn = yys171();
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
                case 503:
                    yyn = yys172();
                    continue;

                case 173:
                    yyst[yysp] = 173;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.getNextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 504:
                    yyn = yys173();
                    continue;

                case 174:
                    yyst[yysp] = 174;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 505:
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
                case 506:
                    yyn = yys175();
                    continue;

                case 176:
                    yyst[yysp] = 176;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 507:
                    yyn = yys176();
                    continue;

                case 177:
                    yyst[yysp] = 177;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 508:
                    yyn = yys177();
                    continue;

                case 178:
                    yyst[yysp] = 178;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 509:
                    yyn = yys178();
                    continue;

                case 179:
                    yyst[yysp] = 179;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 510:
                    yyn = yys179();
                    continue;

                case 180:
                    yyst[yysp] = 180;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 511:
                    yyn = yys180();
                    continue;

                case 181:
                    yyst[yysp] = 181;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 512:
                    yyn = yys181();
                    continue;

                case 182:
                    yyst[yysp] = 182;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 513:
                    yyn = yys182();
                    continue;

                case 183:
                    yyst[yysp] = 183;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.getNextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 514:
                    yyn = yys183();
                    continue;

                case 184:
                    yyst[yysp] = 184;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 515:
                    yyn = yys184();
                    continue;

                case 185:
                    yyst[yysp] = 185;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 516:
                    yyn = yys185();
                    continue;

                case 186:
                    yyst[yysp] = 186;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 517:
                    yyn = yys186();
                    continue;

                case 187:
                    yyst[yysp] = 187;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 518:
                    yyn = yys187();
                    continue;

                case 188:
                    yyst[yysp] = 188;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 519:
                    yyn = yys188();
                    continue;

                case 189:
                    yyst[yysp] = 189;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 520:
                    yyn = yys189();
                    continue;

                case 190:
                    yyst[yysp] = 190;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 521:
                    yyn = yys190();
                    continue;

                case 191:
                    yyst[yysp] = 191;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 522:
                    yyn = yys191();
                    continue;

                case 192:
                    yyst[yysp] = 192;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 523:
                    switch (yytok) {
                        case '*':
                            yyn = 96;
                            continue;
                        case '+':
                            yyn = 97;
                            continue;
                        case '-':
                            yyn = 98;
                            continue;
                        case '/':
                            yyn = 99;
                            continue;
                    }
                    yyn = 665;
                    continue;

                case 193:
                    yyst[yysp] = 193;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 524:
                    switch (yytok) {
                        case '*':
                            yyn = 235;
                            continue;
                        case '+':
                            yyn = 236;
                            continue;
                        case '-':
                            yyn = 237;
                            continue;
                        case '[':
                            yyn = 283;
                            continue;
                    }
                    yyn = 665;
                    continue;

                case 194:
                    yyst[yysp] = 194;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 525:
                    yyn = yys194();
                    continue;

                case 195:
                    yyst[yysp] = 195;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 526:
                    yyn = yys195();
                    continue;

                case 196:
                    yyst[yysp] = 196;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 527:
                    yyn = yys196();
                    continue;

                case 197:
                    yyst[yysp] = 197;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 528:
                    yyn = yys197();
                    continue;

                case 198:
                    yyst[yysp] = 198;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 529:
                    yyn = yys198();
                    continue;

                case 199:
                    yyst[yysp] = 199;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 530:
                    yyn = yys199();
                    continue;

                case 200:
                    yyst[yysp] = 200;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 531:
                    switch (yytok) {
                        case '[':
                            yyn = 285;
                            continue;
                    }
                    yyn = 665;
                    continue;

                case 201:
                    yyst[yysp] = 201;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 532:
                    yyn = yys201();
                    continue;

                case 202:
                    yyst[yysp] = 202;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 533:
                    yyn = yys202();
                    continue;

                case 203:
                    yyst[yysp] = 203;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.getNextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 534:
                    yyn = yys203();
                    continue;

                case 204:
                    yyst[yysp] = 204;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.getNextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 535:
                    yyn = yys204();
                    continue;

                case 205:
                    yyst[yysp] = 205;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.getNextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 536:
                    yyn = yys205();
                    continue;

                case 206:
                    yyst[yysp] = 206;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 537:
                    yyn = yys206();
                    continue;

                case 207:
                    yyst[yysp] = 207;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 538:
                    switch (yytok) {
                        case ')':
                            yyn = 292;
                            continue;
                        case '/':
                        case '-':
                        case '+':
                        case '*':
                            yyn = yyr35();
                            continue;
                    }
                    yyn = 665;
                    continue;

                case 208:
                    yyst[yysp] = 208;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 539:
                    switch (yytok) {
                        case '*':
                            yyn = 90;
                            continue;
                        case '+':
                            yyn = 91;
                            continue;
                        case '-':
                            yyn = 92;
                            continue;
                        case '/':
                            yyn = 93;
                            continue;
                    }
                    yyn = 665;
                    continue;

                case 209:
                    yyst[yysp] = 209;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 540:
                    switch (yytok) {
                        case ')':
                            yyn = 293;
                            continue;
                        case '/':
                        case '-':
                        case '+':
                        case '*':
                            yyn = yyr27();
                            continue;
                    }
                    yyn = 665;
                    continue;

                case 210:
                    yyst[yysp] = 210;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 541:
                    switch (yytok) {
                        case ';':
                            yyn = 294;
                            continue;
                    }
                    yyn = 665;
                    continue;

                case 211:
                    yyst[yysp] = 211;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 542:
                    yyn = yys211();
                    continue;

                case 212:
                    yyst[yysp] = 212;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 543:
                    yyn = yys212();
                    continue;

                case 213:
                    yyst[yysp] = 213;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 544:
                    yyn = yys213();
                    continue;

                case 214:
                    yyst[yysp] = 214;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 545:
                    yyn = yys214();
                    continue;

                case 215:
                    yyst[yysp] = 215;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 546:
                    yyn = yys215();
                    continue;

                case 216:
                    yyst[yysp] = 216;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 547:
                    yyn = yys216();
                    continue;

                case 217:
                    yyst[yysp] = 217;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 548:
                    yyn = yys217();
                    continue;

                case 218:
                    yyst[yysp] = 218;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 549:
                    yyn = yys218();
                    continue;

                case 219:
                    yyst[yysp] = 219;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 550:
                    yyn = yys219();
                    continue;

                case 220:
                    yyst[yysp] = 220;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 551:
                    yyn = yys220();
                    continue;

                case 221:
                    yyst[yysp] = 221;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 552:
                    yyn = yys221();
                    continue;

                case 222:
                    yyst[yysp] = 222;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 553:
                    yyn = yys222();
                    continue;

                case 223:
                    yyst[yysp] = 223;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 554:
                    yyn = yys223();
                    continue;

                case 224:
                    yyst[yysp] = 224;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 555:
                    yyn = yys224();
                    continue;

                case 225:
                    yyst[yysp] = 225;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 556:
                    yyn = yys225();
                    continue;

                case 226:
                    yyst[yysp] = 226;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 557:
                    yyn = yys226();
                    continue;

                case 227:
                    yyst[yysp] = 227;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 558:
                    yyn = yys227();
                    continue;

                case 228:
                    yyst[yysp] = 228;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 559:
                    yyn = yys228();
                    continue;

                case 229:
                    yyst[yysp] = 229;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 560:
                    yyn = yys229();
                    continue;

                case 230:
                    yyst[yysp] = 230;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 561:
                    yyn = yys230();
                    continue;

                case 231:
                    yyst[yysp] = 231;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 562:
                    yyn = yys231();
                    continue;

                case 232:
                    yyst[yysp] = 232;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 563:
                    yyn = yys232();
                    continue;

                case 233:
                    yyst[yysp] = 233;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 564:
                    yyn = yys233();
                    continue;

                case 234:
                    yyst[yysp] = 234;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 565:
                    yyn = yys234();
                    continue;

                case 235:
                    yyst[yysp] = 235;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.getNextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 566:
                    yyn = yys235();
                    continue;

                case 236:
                    yyst[yysp] = 236;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.getNextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 567:
                    yyn = yys236();
                    continue;

                case 237:
                    yyst[yysp] = 237;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.getNextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 568:
                    yyn = yys237();
                    continue;

                case 238:
                    yyst[yysp] = 238;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 569:
                    yyn = yys238();
                    continue;

                case 239:
                    yyst[yysp] = 239;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.getNextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 570:
                    yyn = yys239();
                    continue;

                case 240:
                    yyst[yysp] = 240;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 571:
                    switch (yytok) {
                        case '*':
                            yyn = 235;
                            continue;
                        case '+':
                            yyn = 236;
                            continue;
                        case '-':
                            yyn = 237;
                            continue;
                        case '[':
                            yyn = 298;
                            continue;
                    }
                    yyn = 665;
                    continue;

                case 241:
                    yyst[yysp] = 241;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 572:
                    yyn = yys241();
                    continue;

                case 242:
                    yyst[yysp] = 242;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 573:
                    yyn = yys242();
                    continue;

                case 243:
                    yyst[yysp] = 243;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.getNextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 574:
                    yyn = yys243();
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
                case 575:
                    yyn = yys244();
                    continue;

                case 245:
                    yyst[yysp] = 245;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.getNextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 576:
                    yyn = yys245();
                    continue;

                case 246:
                    yyst[yysp] = 246;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 577:
                    switch (yytok) {
                        case '*':
                            yyn = 235;
                            continue;
                        case '+':
                            yyn = 236;
                            continue;
                        case '-':
                            yyn = 237;
                            continue;
                    }
                    yyn = 665;
                    continue;

                case 247:
                    yyst[yysp] = 247;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 578:
                    switch (yytok) {
                        case ']':
                            yyn = 300;
                            continue;
                    }
                    yyn = 665;
                    continue;

                case 248:
                    yyst[yysp] = 248;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 579:
                    switch (yytok) {
                        case ']':
                            yyn = 301;
                            continue;
                    }
                    yyn = 665;
                    continue;

                case 249:
                    yyst[yysp] = 249;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 580:
                    yyn = yys249();
                    continue;

                case 250:
                    yyst[yysp] = 250;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 581:
                    yyn = yys250();
                    continue;

                case 251:
                    yyst[yysp] = 251;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 582:
                    yyn = yys251();
                    continue;

                case 252:
                    yyst[yysp] = 252;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 583:
                    yyn = yys252();
                    continue;

                case 253:
                    yyst[yysp] = 253;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 584:
                    yyn = yys253();
                    continue;

                case 254:
                    yyst[yysp] = 254;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 585:
                    yyn = yys254();
                    continue;

                case 255:
                    yyst[yysp] = 255;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 586:
                    switch (yytok) {
                        case ']':
                            yyn = 302;
                            continue;
                    }
                    yyn = 665;
                    continue;

                case 256:
                    yyst[yysp] = 256;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 587:
                    yyn = yys256();
                    continue;

                case 257:
                    yyst[yysp] = 257;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 588:
                    switch (yytok) {
                        case ']':
                            yyn = 304;
                            continue;
                    }
                    yyn = 665;
                    continue;

                case 258:
                    yyst[yysp] = 258;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 589:
                    switch (yytok) {
                        case ']':
                            yyn = 305;
                            continue;
                    }
                    yyn = 665;
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
                case 590:
                    yyn = yys259();
                    continue;

                case 260:
                    yyst[yysp] = 260;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 591:
                    yyn = yys260();
                    continue;

                case 261:
                    yyst[yysp] = 261;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 592:
                    yyn = yys261();
                    continue;

                case 262:
                    yyst[yysp] = 262;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 593:
                    yyn = yys262();
                    continue;

                case 263:
                    yyst[yysp] = 263;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 594:
                    yyn = yys263();
                    continue;

                case 264:
                    yyst[yysp] = 264;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.getNextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 595:
                    yyn = yys264();
                    continue;

                case 265:
                    yyst[yysp] = 265;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.getNextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 596:
                    yyn = yys265();
                    continue;

                case 266:
                    yyst[yysp] = 266;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 597:
                    yyn = yys266();
                    continue;

                case 267:
                    yyst[yysp] = 267;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 598:
                    yyn = yys267();
                    continue;

                case 268:
                    yyst[yysp] = 268;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 599:
                    yyn = yys268();
                    continue;

                case 269:
                    yyst[yysp] = 269;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 600:
                    yyn = yys269();
                    continue;

                case 270:
                    yyst[yysp] = 270;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 601:
                    yyn = yys270();
                    continue;

                case 271:
                    yyst[yysp] = 271;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 602:
                    yyn = yys271();
                    continue;

                case 272:
                    yyst[yysp] = 272;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 603:
                    yyn = yys272();
                    continue;

                case 273:
                    yyst[yysp] = 273;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 604:
                    yyn = yys273();
                    continue;

                case 274:
                    yyst[yysp] = 274;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 605:
                    yyn = yys274();
                    continue;

                case 275:
                    yyst[yysp] = 275;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 606:
                    yyn = yys275();
                    continue;

                case 276:
                    yyst[yysp] = 276;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 607:
                    yyn = yys276();
                    continue;

                case 277:
                    yyst[yysp] = 277;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 608:
                    yyn = yys277();
                    continue;

                case 278:
                    yyst[yysp] = 278;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 609:
                    yyn = yys278();
                    continue;

                case 279:
                    yyst[yysp] = 279;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 610:
                    yyn = yys279();
                    continue;

                case 280:
                    yyst[yysp] = 280;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 611:
                    yyn = yys280();
                    continue;

                case 281:
                    yyst[yysp] = 281;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 612:
                    switch (yytok) {
                        case ']':
                            yyn = 314;
                            continue;
                    }
                    yyn = 665;
                    continue;

                case 282:
                    yyst[yysp] = 282;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 613:
                    switch (yytok) {
                        case ']':
                            yyn = 315;
                            continue;
                    }
                    yyn = 665;
                    continue;

                case 283:
                    yyst[yysp] = 283;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.getNextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 614:
                    yyn = yys283();
                    continue;

                case 284:
                    yyst[yysp] = 284;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 615:
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
                case 616:
                    yyn = yys285();
                    continue;

                case 286:
                    yyst[yysp] = 286;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 617:
                    switch (yytok) {
                        case ']':
                            yyn = 318;
                            continue;
                    }
                    yyn = 665;
                    continue;

                case 287:
                    yyst[yysp] = 287;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 618:
                    switch (yytok) {
                        case ']':
                            yyn = 319;
                            continue;
                    }
                    yyn = 665;
                    continue;

                case 288:
                    yyst[yysp] = 288;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 619:
                    switch (yytok) {
                        case ']':
                            yyn = 320;
                            continue;
                    }
                    yyn = 665;
                    continue;

                case 289:
                    yyst[yysp] = 289;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 620:
                    switch (yytok) {
                        case ']':
                            yyn = 321;
                            continue;
                    }
                    yyn = 665;
                    continue;

                case 290:
                    yyst[yysp] = 290;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.getNextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 621:
                    yyn = yys290();
                    continue;

                case 291:
                    yyst[yysp] = 291;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 622:
                    yyn = yys291();
                    continue;

                case 292:
                    yyst[yysp] = 292;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.getNextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 623:
                    yyn = yys292();
                    continue;

                case 293:
                    yyst[yysp] = 293;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.getNextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 624:
                    yyn = yys293();
                    continue;

                case 294:
                    yyst[yysp] = 294;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.getNextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 625:
                    switch (yytok) {
                        case ENDINPUT:
                        case ';':
                            yyn = yyr1();
                            continue;
                    }
                    yyn = 665;
                    continue;

                case 295:
                    yyst[yysp] = 295;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 626:
                    yyn = yys295();
                    continue;

                case 296:
                    yyst[yysp] = 296;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 627:
                    yyn = yys296();
                    continue;

                case 297:
                    yyst[yysp] = 297;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 628:
                    yyn = yys297();
                    continue;

                case 298:
                    yyst[yysp] = 298;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.getNextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 629:
                    yyn = yys298();
                    continue;

                case 299:
                    yyst[yysp] = 299;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 630:
                    yyn = yys299();
                    continue;

                case 300:
                    yyst[yysp] = 300;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.getNextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 631:
                    yyn = yys300();
                    continue;

                case 301:
                    yyst[yysp] = 301;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.getNextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 632:
                    yyn = yys301();
                    continue;

                case 302:
                    yyst[yysp] = 302;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.getNextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 633:
                    yyn = yys302();
                    continue;

                case 303:
                    yyst[yysp] = 303;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 634:
                    switch (yytok) {
                        case ']':
                            yyn = yyr162();
                            continue;
                    }
                    yyn = 665;
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
                case 635:
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
                case 636:
                    yyn = yys305();
                    continue;

                case 306:
                    yyst[yysp] = 306;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 637:
                    switch (yytok) {
                        case ']':
                            yyn = 324;
                            continue;
                    }
                    yyn = 665;
                    continue;

                case 307:
                    yyst[yysp] = 307;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 638:
                    switch (yytok) {
                        case ']':
                            yyn = 325;
                            continue;
                    }
                    yyn = 665;
                    continue;

                case 308:
                    yyst[yysp] = 308;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 639:
                    switch (yytok) {
                        case '*':
                            yyn = 90;
                            continue;
                        case '+':
                            yyn = 91;
                            continue;
                        case '-':
                            yyn = 92;
                            continue;
                        case '/':
                            yyn = 93;
                            continue;
                        case ']':
                            yyn = 326;
                            continue;
                    }
                    yyn = 665;
                    continue;

                case 309:
                    yyst[yysp] = 309;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 640:
                    switch (yytok) {
                        case '*':
                            yyn = 96;
                            continue;
                        case '+':
                            yyn = 97;
                            continue;
                        case '-':
                            yyn = 98;
                            continue;
                        case '/':
                            yyn = 99;
                            continue;
                        case ']':
                            yyn = 327;
                            continue;
                    }
                    yyn = 665;
                    continue;

                case 310:
                    yyst[yysp] = 310;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.getNextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 641:
                    yyn = yys310();
                    continue;

                case 311:
                    yyst[yysp] = 311;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 642:
                    yyn = yys311();
                    continue;

                case 312:
                    yyst[yysp] = 312;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 643:
                    yyn = yys312();
                    continue;

                case 313:
                    yyst[yysp] = 313;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 644:
                    switch (yytok) {
                        case '*':
                            yyn = 235;
                            continue;
                        case '+':
                            yyn = 236;
                            continue;
                        case '-':
                            yyn = 237;
                            continue;
                        case ']':
                            yyn = 328;
                            continue;
                    }
                    yyn = 665;
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
                case 645:
                    yyn = yys314();
                    continue;

                case 315:
                    yyst[yysp] = 315;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.getNextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 646:
                    yyn = yys315();
                    continue;

                case 316:
                    yyst[yysp] = 316;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 647:
                    switch (yytok) {
                        case ']':
                            yyn = 329;
                            continue;
                    }
                    yyn = 665;
                    continue;

                case 317:
                    yyst[yysp] = 317;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 648:
                    switch (yytok) {
                        case ']':
                            yyn = 330;
                            continue;
                    }
                    yyn = 665;
                    continue;

                case 318:
                    yyst[yysp] = 318;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.getNextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 649:
                    yyn = yys318();
                    continue;

                case 319:
                    yyst[yysp] = 319;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.getNextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 650:
                    yyn = yys319();
                    continue;

                case 320:
                    yyst[yysp] = 320;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.getNextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 651:
                    yyn = yys320();
                    continue;

                case 321:
                    yyst[yysp] = 321;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.getNextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 652:
                    yyn = yys321();
                    continue;

                case 322:
                    yyst[yysp] = 322;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 653:
                    yyn = yys322();
                    continue;

                case 323:
                    yyst[yysp] = 323;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 654:
                    yyn = yys323();
                    continue;

                case 324:
                    yyst[yysp] = 324;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.getNextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 655:
                    yyn = yys324();
                    continue;

                case 325:
                    yyst[yysp] = 325;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.getNextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 656:
                    yyn = yys325();
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
                case 657:
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
                case 658:
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
                case 659:
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
                case 660:
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
                case 661:
                    yyn = yys330();
                    continue;

                case 662:
                    return true;
                case 663:
                    yyerror("stack overflow");
                case 664:
                    return false;
                case 665:
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
                return 27;
            case AT:
                return 28;
            case AV:
                return 29;
            case AVANZA:
                return 30;
            case AZAR:
                return 31;
            case BAJALAPIZ:
                return 32;
            case BL:
                return 33;
            case BORRAPANTALLA:
                return 34;
            case CENTRO:
                return 35;
            case COS:
                return 36;
            case CUENTA:
                return 37;
            case DIFERENCIA:
                return 38;
            case DIVISION:
                return 39;
            case EJECUTA:
                return 40;
            case ELEGIR:
                return 41;
            case ELEMENTO:
                return 42;
            case ESPERA:
                return 43;
            case FLOAT:
                return 44;
            case GD:
                return 45;
            case GI:
                return 46;
            case GIRADERECHA:
                return 47;
            case GIRAIZQUIERDA:
                return 48;
            case IDENTIFIER:
                return 49;
            case IGUALES:
                return 50;
            case INC:
                return 51;
            case INIC:
                return 52;
            case INTEGER:
                return 53;
            case MAYORQUE:
                return 54;
            case MENORQUE:
                return 55;
            case MENOS:
                return 56;
            case O:
                return 57;
            case OCULTATORTUGA:
                return 58;
            case OT:
                return 59;
            case PONCL:
                return 60;
            case PONCOLORLAPIZ:
                return 61;
            case PONPOS:
                return 62;
            case PONRUMBO:
                return 63;
            case PONX:
                return 64;
            case PONXY:
                return 65;
            case PONY:
                return 66;
            case POTENCIA:
                return 67;
            case PRIMERO:
                return 68;
            case PRODUCTO:
                return 69;
            case RAIZCUADRADA:
                return 70;
            case RC:
                return 71;
            case RE:
                return 72;
            case REDONDEA:
                return 73;
            case REPITE:
                return 74;
            case RESTO:
                return 75;
            case RETROCEDE:
                return 76;
            case RUMBO:
                return 77;
            case SB:
                return 78;
            case SEN:
                return 79;
            case SENO:
                return 80;
            case SI:
                return 81;
            case SUBELAPIZ:
                return 82;
            case SUMA:
                return 83;
            case UL:
                return 84;
            case ULTIMO:
                return 85;
            case VAR:
                return 86;
            case Y:
                return 87;
            case '(':
                return 88;
        }
        return 665;
    }

    private int yys2() {
        switch (yytok) {
            case VERDE:
            case CIAN:
            case ROJO:
            case NEGRO:
            case '+':
            case BLANCO:
            case '*':
            case AMARILLO:
            case AZUL:
            case '=':
            case '<':
            case '>':
            case ')':
            case MARRON:
            case '/':
            case error:
            case '-':
            case '[':
            case GRIS:
                return 665;
        }
        return yyr3();
    }

    private int yys4() {
        switch (yytok) {
            case VERDE:
            case MARRON:
            case GRIS:
            case ')':
            case BLANCO:
            case error:
            case '=':
            case CIAN:
            case NEGRO:
            case AMARILLO:
            case '[':
            case ROJO:
            case AZUL:
                return 665;
            case '>':
            case '<':
            case '/':
            case '-':
            case '+':
            case '*':
                return yyr35();
        }
        return yyr7();
    }

    private int yys5() {
        switch (yytok) {
            case '*':
                return 90;
            case '+':
                return 91;
            case '-':
                return 92;
            case '/':
                return 93;
            case '<':
                return 94;
            case '>':
                return 95;
        }
        return 665;
    }

    private int yys6() {
        switch (yytok) {
            case VERDE:
            case MARRON:
            case GRIS:
            case ')':
            case BLANCO:
            case error:
            case '=':
            case CIAN:
            case NEGRO:
            case AMARILLO:
            case '[':
            case ROJO:
            case AZUL:
                return 665;
            case '>':
            case '<':
            case '/':
            case '-':
            case '+':
            case '*':
                return yyr36();
        }
        return yyr13();
    }

    private int yys7() {
        switch (yytok) {
            case VERDE:
            case MARRON:
            case GRIS:
            case ')':
            case BLANCO:
            case error:
            case '=':
            case CIAN:
            case NEGRO:
            case AMARILLO:
            case '[':
            case ROJO:
            case AZUL:
                return 665;
            case '>':
            case '<':
            case '/':
            case '-':
            case '+':
            case '*':
                return yyr37();
        }
        return yyr14();
    }

    private int yys8() {
        switch (yytok) {
            case VERDE:
            case MARRON:
            case GRIS:
            case ')':
            case BLANCO:
            case error:
            case '=':
            case CIAN:
            case NEGRO:
            case AMARILLO:
            case '[':
            case ROJO:
            case AZUL:
                return 665;
            case '>':
            case '<':
            case '/':
            case '-':
            case '+':
            case '*':
                return yyr38();
        }
        return yyr15();
    }

    private int yys9() {
        switch (yytok) {
            case VERDE:
            case MARRON:
            case GRIS:
            case ')':
            case BLANCO:
            case error:
            case '=':
            case CIAN:
            case NEGRO:
            case AMARILLO:
            case '[':
            case ROJO:
            case AZUL:
                return 665;
            case '>':
            case '<':
            case '/':
            case '-':
            case '+':
            case '*':
                return yyr40();
        }
        return yyr17();
    }

    private int yys10() {
        switch (yytok) {
            case VERDE:
            case MARRON:
            case GRIS:
            case ')':
            case BLANCO:
            case error:
            case '=':
            case CIAN:
            case NEGRO:
            case AMARILLO:
            case '[':
            case ROJO:
            case AZUL:
                return 665;
            case '>':
            case '<':
            case '/':
            case '-':
            case '+':
            case '*':
                return yyr41();
        }
        return yyr18();
    }

    private int yys11() {
        switch (yytok) {
            case VERDE:
            case MARRON:
            case GRIS:
            case ')':
            case BLANCO:
            case error:
            case '=':
            case CIAN:
            case NEGRO:
            case AMARILLO:
            case '[':
            case ROJO:
            case AZUL:
                return 665;
            case '>':
            case '<':
            case '/':
            case '-':
            case '+':
            case '*':
                return yyr39();
        }
        return yyr16();
    }

    private int yys12() {
        switch (yytok) {
            case VERDE:
            case MARRON:
            case GRIS:
            case ')':
            case BLANCO:
            case error:
            case '=':
            case CIAN:
            case NEGRO:
            case AMARILLO:
            case '[':
            case ROJO:
            case AZUL:
                return 665;
            case '>':
            case '<':
            case '/':
            case '-':
            case '+':
            case '*':
                return yyr27();
        }
        return yyr6();
    }

    private int yys13() {
        switch (yytok) {
            case '*':
                return 96;
            case '+':
                return 97;
            case '-':
                return 98;
            case '/':
                return 99;
            case '<':
                return 100;
            case '>':
                return 101;
        }
        return 665;
    }

    private int yys14() {
        switch (yytok) {
            case VERDE:
            case MARRON:
            case GRIS:
            case ')':
            case BLANCO:
            case error:
            case '=':
            case CIAN:
            case NEGRO:
            case AMARILLO:
            case '[':
            case ROJO:
            case AZUL:
                return 665;
            case '>':
            case '<':
            case '/':
            case '-':
            case '+':
            case '*':
                return yyr28();
        }
        return yyr8();
    }

    private int yys15() {
        switch (yytok) {
            case VERDE:
            case MARRON:
            case GRIS:
            case ')':
            case BLANCO:
            case error:
            case '=':
            case CIAN:
            case NEGRO:
            case AMARILLO:
            case '[':
            case ROJO:
            case AZUL:
                return 665;
            case '>':
            case '<':
            case '/':
            case '-':
            case '+':
            case '*':
                return yyr29();
        }
        return yyr9();
    }

    private int yys16() {
        switch (yytok) {
            case VERDE:
            case MARRON:
            case GRIS:
            case ')':
            case BLANCO:
            case error:
            case '=':
            case CIAN:
            case NEGRO:
            case AMARILLO:
            case '[':
            case ROJO:
            case AZUL:
                return 665;
            case '>':
            case '<':
            case '/':
            case '-':
            case '+':
            case '*':
                return yyr31();
        }
        return yyr11();
    }

    private int yys17() {
        switch (yytok) {
            case VERDE:
            case MARRON:
            case GRIS:
            case ')':
            case BLANCO:
            case error:
            case '=':
            case CIAN:
            case NEGRO:
            case AMARILLO:
            case '[':
            case ROJO:
            case AZUL:
                return 665;
            case '>':
            case '<':
            case '/':
            case '-':
            case '+':
            case '*':
                return yyr32();
        }
        return yyr12();
    }

    private int yys18() {
        switch (yytok) {
            case VERDE:
            case MARRON:
            case GRIS:
            case ')':
            case BLANCO:
            case error:
            case '=':
            case CIAN:
            case NEGRO:
            case AMARILLO:
            case '[':
            case ROJO:
            case AZUL:
                return 665;
            case '>':
            case '<':
            case '/':
            case '-':
            case '+':
            case '*':
                return yyr30();
        }
        return yyr10();
    }

    private int yys19() {
        switch (yytok) {
            case VERDE:
            case CIAN:
            case ROJO:
            case NEGRO:
            case '+':
            case BLANCO:
            case '*':
            case AMARILLO:
            case AZUL:
            case '=':
            case '<':
            case '>':
            case ')':
            case MARRON:
            case '/':
            case error:
            case '-':
            case '[':
            case GRIS:
                return 665;
        }
        return yyr5();
    }

    private int yys20() {
        switch (yytok) {
            case VERDE:
            case CIAN:
            case ROJO:
            case NEGRO:
            case '+':
            case BLANCO:
            case '*':
            case AMARILLO:
            case AZUL:
            case '=':
            case '<':
            case '>':
            case ')':
            case MARRON:
            case '/':
            case error:
            case '-':
            case '[':
            case GRIS:
                return 665;
        }
        return yyr19();
    }

    private int yys21() {
        switch (yytok) {
            case VERDE:
            case CIAN:
            case ROJO:
            case NEGRO:
            case '+':
            case BLANCO:
            case '*':
            case AMARILLO:
            case AZUL:
            case '=':
            case '<':
            case '>':
            case ')':
            case MARRON:
            case '/':
            case error:
            case '-':
            case '[':
            case GRIS:
                return 665;
        }
        return yyr4();
    }

    private int yys22() {
        switch (yytok) {
            case VERDE:
            case CIAN:
            case ROJO:
            case NEGRO:
            case '+':
            case BLANCO:
            case '*':
            case AMARILLO:
            case AZUL:
            case '=':
            case '<':
            case '>':
            case ')':
            case MARRON:
            case '/':
            case error:
            case '-':
            case '[':
            case GRIS:
                return 665;
        }
        return yyr20();
    }

    private int yys23() {
        switch (yytok) {
            case VERDE:
            case CIAN:
            case ROJO:
            case NEGRO:
            case '+':
            case BLANCO:
            case '*':
            case AMARILLO:
            case AZUL:
            case '=':
            case '<':
            case '>':
            case ')':
            case MARRON:
            case '/':
            case error:
            case '-':
            case '[':
            case GRIS:
                return 665;
        }
        return yyr21();
    }

    private int yys24() {
        switch (yytok) {
            case VERDE:
            case CIAN:
            case ROJO:
            case NEGRO:
            case '+':
            case BLANCO:
            case '*':
            case AMARILLO:
            case AZUL:
            case '=':
            case '<':
            case '>':
            case ')':
            case MARRON:
            case '/':
            case error:
            case '-':
            case '[':
            case GRIS:
                return 665;
        }
        return yyr22();
    }

    private int yys25() {
        switch (yytok) {
            case VERDE:
            case CIAN:
            case ROJO:
            case NEGRO:
            case '+':
            case BLANCO:
            case '*':
            case AMARILLO:
            case AZUL:
            case '=':
            case '<':
            case '>':
            case ')':
            case MARRON:
            case '/':
            case error:
            case '-':
            case '[':
            case GRIS:
                return 665;
        }
        return yyr24();
    }

    private int yys26() {
        switch (yytok) {
            case VERDE:
            case CIAN:
            case ROJO:
            case NEGRO:
            case '+':
            case BLANCO:
            case '*':
            case AMARILLO:
            case AZUL:
            case '=':
            case '<':
            case '>':
            case ')':
            case MARRON:
            case '/':
            case error:
            case '-':
            case '[':
            case GRIS:
                return 665;
        }
        return yyr23();
    }

    private int yys27() {
        switch (yytok) {
            case VERDE:
            case CIAN:
            case ROJO:
            case NEGRO:
            case '+':
            case BLANCO:
            case '*':
            case AMARILLO:
            case AZUL:
            case '=':
            case '<':
            case '>':
            case ')':
            case MARRON:
            case '/':
            case error:
            case '-':
            case '[':
            case GRIS:
                return 665;
        }
        return yyr86();
    }

    private int yys28() {
        switch (yytok) {
            case VERDE:
            case CIAN:
            case ROJO:
            case NEGRO:
            case '+':
            case BLANCO:
            case '*':
            case AMARILLO:
            case AZUL:
            case '=':
            case '<':
            case '>':
            case ')':
            case MARRON:
            case '/':
            case error:
            case '-':
            case '[':
            case GRIS:
                return 665;
        }
        return yyr87();
    }

    private int yys29() {
        switch (yytok) {
            case AZAR:
                return 31;
            case CUENTA:
                return 37;
            case INTEGER:
                return 53;
            case REDONDEA:
                return 73;
            case RESTO:
                return 75;
            case DIFERENCIA:
                return 109;
            case ELEGIR:
                return 110;
            case ELEMENTO:
                return 111;
            case IDENTIFIER:
                return 112;
            case MENOS:
                return 113;
            case POTENCIA:
                return 114;
            case PRIMERO:
                return 115;
            case PRODUCTO:
                return 116;
            case SUMA:
                return 117;
            case UL:
                return 118;
            case ULTIMO:
                return 119;
            case '(':
                return 120;
        }
        return 665;
    }

    private int yys30() {
        switch (yytok) {
            case AZAR:
                return 31;
            case CUENTA:
                return 37;
            case INTEGER:
                return 53;
            case REDONDEA:
                return 73;
            case RESTO:
                return 75;
            case DIFERENCIA:
                return 109;
            case ELEGIR:
                return 110;
            case ELEMENTO:
                return 111;
            case IDENTIFIER:
                return 112;
            case MENOS:
                return 113;
            case POTENCIA:
                return 114;
            case PRIMERO:
                return 115;
            case PRODUCTO:
                return 116;
            case SUMA:
                return 117;
            case UL:
                return 118;
            case ULTIMO:
                return 119;
            case '(':
                return 120;
        }
        return 665;
    }

    private int yys31() {
        switch (yytok) {
            case AZAR:
                return 31;
            case CUENTA:
                return 37;
            case INTEGER:
                return 53;
            case REDONDEA:
                return 73;
            case RESTO:
                return 75;
            case DIFERENCIA:
                return 109;
            case ELEGIR:
                return 110;
            case ELEMENTO:
                return 111;
            case IDENTIFIER:
                return 112;
            case MENOS:
                return 113;
            case POTENCIA:
                return 114;
            case PRIMERO:
                return 115;
            case PRODUCTO:
                return 116;
            case SUMA:
                return 117;
            case UL:
                return 118;
            case ULTIMO:
                return 119;
            case '(':
                return 120;
        }
        return 665;
    }

    private int yys32() {
        switch (yytok) {
            case VERDE:
            case CIAN:
            case ROJO:
            case NEGRO:
            case '+':
            case BLANCO:
            case '*':
            case AMARILLO:
            case AZUL:
            case '=':
            case '<':
            case '>':
            case ')':
            case MARRON:
            case '/':
            case error:
            case '-':
            case '[':
            case GRIS:
                return 665;
        }
        return yyr88();
    }

    private int yys33() {
        switch (yytok) {
            case VERDE:
            case CIAN:
            case ROJO:
            case NEGRO:
            case '+':
            case BLANCO:
            case '*':
            case AMARILLO:
            case AZUL:
            case '=':
            case '<':
            case '>':
            case ')':
            case MARRON:
            case '/':
            case error:
            case '-':
            case '[':
            case GRIS:
                return 665;
        }
        return yyr89();
    }

    private int yys34() {
        switch (yytok) {
            case VERDE:
            case CIAN:
            case ROJO:
            case NEGRO:
            case '+':
            case BLANCO:
            case '*':
            case AMARILLO:
            case AZUL:
            case '=':
            case '<':
            case '>':
            case ')':
            case MARRON:
            case '/':
            case error:
            case '-':
            case '[':
            case GRIS:
                return 665;
        }
        return yyr93();
    }

    private int yys35() {
        switch (yytok) {
            case VERDE:
            case CIAN:
            case ROJO:
            case NEGRO:
            case '+':
            case BLANCO:
            case '*':
            case AMARILLO:
            case AZUL:
            case '=':
            case '<':
            case '>':
            case ')':
            case MARRON:
            case '/':
            case error:
            case '-':
            case '[':
            case GRIS:
                return 665;
        }
        return yyr92();
    }

    private int yys36() {
        switch (yytok) {
            case AZAR:
                return 31;
            case COS:
                return 36;
            case CUENTA:
                return 37;
            case DIFERENCIA:
                return 38;
            case DIVISION:
                return 39;
            case ELEGIR:
                return 41;
            case ELEMENTO:
                return 42;
            case FLOAT:
                return 44;
            case IDENTIFIER:
                return 49;
            case INTEGER:
                return 53;
            case MENOS:
                return 56;
            case POTENCIA:
                return 67;
            case PRIMERO:
                return 68;
            case PRODUCTO:
                return 69;
            case RAIZCUADRADA:
                return 70;
            case RC:
                return 71;
            case REDONDEA:
                return 73;
            case RESTO:
                return 75;
            case RUMBO:
                return 77;
            case SEN:
                return 79;
            case SENO:
                return 80;
            case SUMA:
                return 83;
            case UL:
                return 84;
            case ULTIMO:
                return 85;
            case '(':
                return 88;
        }
        return 665;
    }

    private int yys38() {
        switch (yytok) {
            case AZAR:
                return 31;
            case COS:
                return 36;
            case CUENTA:
                return 37;
            case DIFERENCIA:
                return 38;
            case DIVISION:
                return 39;
            case ELEGIR:
                return 41;
            case ELEMENTO:
                return 42;
            case FLOAT:
                return 44;
            case IDENTIFIER:
                return 49;
            case INTEGER:
                return 53;
            case MENOS:
                return 56;
            case POTENCIA:
                return 67;
            case PRIMERO:
                return 68;
            case PRODUCTO:
                return 69;
            case RAIZCUADRADA:
                return 70;
            case RC:
                return 71;
            case REDONDEA:
                return 73;
            case RESTO:
                return 75;
            case RUMBO:
                return 77;
            case SEN:
                return 79;
            case SENO:
                return 80;
            case SUMA:
                return 83;
            case UL:
                return 84;
            case ULTIMO:
                return 85;
            case '(':
                return 88;
        }
        return 665;
    }

    private int yys39() {
        switch (yytok) {
            case AZAR:
                return 31;
            case COS:
                return 36;
            case CUENTA:
                return 37;
            case DIFERENCIA:
                return 38;
            case DIVISION:
                return 39;
            case ELEGIR:
                return 41;
            case ELEMENTO:
                return 42;
            case FLOAT:
                return 44;
            case IDENTIFIER:
                return 49;
            case INTEGER:
                return 53;
            case MENOS:
                return 56;
            case POTENCIA:
                return 67;
            case PRIMERO:
                return 68;
            case PRODUCTO:
                return 69;
            case RAIZCUADRADA:
                return 70;
            case RC:
                return 71;
            case REDONDEA:
                return 73;
            case RESTO:
                return 75;
            case RUMBO:
                return 77;
            case SEN:
                return 79;
            case SENO:
                return 80;
            case SUMA:
                return 83;
            case UL:
                return 84;
            case ULTIMO:
                return 85;
            case '(':
                return 88;
        }
        return 665;
    }

    private int yys42() {
        switch (yytok) {
            case AZAR:
                return 31;
            case CUENTA:
                return 37;
            case INTEGER:
                return 53;
            case REDONDEA:
                return 73;
            case RESTO:
                return 75;
            case DIFERENCIA:
                return 109;
            case ELEGIR:
                return 110;
            case ELEMENTO:
                return 111;
            case IDENTIFIER:
                return 112;
            case MENOS:
                return 113;
            case POTENCIA:
                return 114;
            case PRIMERO:
                return 115;
            case PRODUCTO:
                return 116;
            case SUMA:
                return 117;
            case UL:
                return 118;
            case ULTIMO:
                return 119;
            case '(':
                return 120;
        }
        return 665;
    }

    private int yys43() {
        switch (yytok) {
            case AZAR:
                return 31;
            case COS:
                return 36;
            case CUENTA:
                return 37;
            case DIFERENCIA:
                return 38;
            case DIVISION:
                return 39;
            case ELEGIR:
                return 41;
            case ELEMENTO:
                return 42;
            case FLOAT:
                return 44;
            case IDENTIFIER:
                return 49;
            case INTEGER:
                return 53;
            case MENOS:
                return 56;
            case POTENCIA:
                return 67;
            case PRIMERO:
                return 68;
            case PRODUCTO:
                return 69;
            case RAIZCUADRADA:
                return 70;
            case RC:
                return 71;
            case REDONDEA:
                return 73;
            case RESTO:
                return 75;
            case RUMBO:
                return 77;
            case SEN:
                return 79;
            case SENO:
                return 80;
            case SUMA:
                return 83;
            case UL:
                return 84;
            case ULTIMO:
                return 85;
            case '(':
                return 88;
        }
        return 665;
    }

    private int yys44() {
        switch (yytok) {
            case MARRON:
            case GRIS:
            case ROJO:
            case NEGRO:
            case BLANCO:
            case VERDE:
            case AMARILLO:
            case AZUL:
            case error:
            case '=':
            case CIAN:
                return 665;
        }
        return yyr33();
    }

    private int yys45() {
        switch (yytok) {
            case AZAR:
                return 31;
            case COS:
                return 36;
            case CUENTA:
                return 37;
            case DIFERENCIA:
                return 38;
            case DIVISION:
                return 39;
            case ELEGIR:
                return 41;
            case ELEMENTO:
                return 42;
            case FLOAT:
                return 44;
            case IDENTIFIER:
                return 49;
            case INTEGER:
                return 53;
            case MENOS:
                return 56;
            case POTENCIA:
                return 67;
            case PRIMERO:
                return 68;
            case PRODUCTO:
                return 69;
            case RAIZCUADRADA:
                return 70;
            case RC:
                return 71;
            case REDONDEA:
                return 73;
            case RESTO:
                return 75;
            case RUMBO:
                return 77;
            case SEN:
                return 79;
            case SENO:
                return 80;
            case SUMA:
                return 83;
            case UL:
                return 84;
            case ULTIMO:
                return 85;
            case '(':
                return 88;
        }
        return 665;
    }

    private int yys46() {
        switch (yytok) {
            case AZAR:
                return 31;
            case COS:
                return 36;
            case CUENTA:
                return 37;
            case DIFERENCIA:
                return 38;
            case DIVISION:
                return 39;
            case ELEGIR:
                return 41;
            case ELEMENTO:
                return 42;
            case FLOAT:
                return 44;
            case IDENTIFIER:
                return 49;
            case INTEGER:
                return 53;
            case MENOS:
                return 56;
            case POTENCIA:
                return 67;
            case PRIMERO:
                return 68;
            case PRODUCTO:
                return 69;
            case RAIZCUADRADA:
                return 70;
            case RC:
                return 71;
            case REDONDEA:
                return 73;
            case RESTO:
                return 75;
            case RUMBO:
                return 77;
            case SEN:
                return 79;
            case SENO:
                return 80;
            case SUMA:
                return 83;
            case UL:
                return 84;
            case ULTIMO:
                return 85;
            case '(':
                return 88;
        }
        return 665;
    }

    private int yys47() {
        switch (yytok) {
            case AZAR:
                return 31;
            case COS:
                return 36;
            case CUENTA:
                return 37;
            case DIFERENCIA:
                return 38;
            case DIVISION:
                return 39;
            case ELEGIR:
                return 41;
            case ELEMENTO:
                return 42;
            case FLOAT:
                return 44;
            case IDENTIFIER:
                return 49;
            case INTEGER:
                return 53;
            case MENOS:
                return 56;
            case POTENCIA:
                return 67;
            case PRIMERO:
                return 68;
            case PRODUCTO:
                return 69;
            case RAIZCUADRADA:
                return 70;
            case RC:
                return 71;
            case REDONDEA:
                return 73;
            case RESTO:
                return 75;
            case RUMBO:
                return 77;
            case SEN:
                return 79;
            case SENO:
                return 80;
            case SUMA:
                return 83;
            case UL:
                return 84;
            case ULTIMO:
                return 85;
            case '(':
                return 88;
        }
        return 665;
    }

    private int yys48() {
        switch (yytok) {
            case AZAR:
                return 31;
            case COS:
                return 36;
            case CUENTA:
                return 37;
            case DIFERENCIA:
                return 38;
            case DIVISION:
                return 39;
            case ELEGIR:
                return 41;
            case ELEMENTO:
                return 42;
            case FLOAT:
                return 44;
            case IDENTIFIER:
                return 49;
            case INTEGER:
                return 53;
            case MENOS:
                return 56;
            case POTENCIA:
                return 67;
            case PRIMERO:
                return 68;
            case PRODUCTO:
                return 69;
            case RAIZCUADRADA:
                return 70;
            case RC:
                return 71;
            case REDONDEA:
                return 73;
            case RESTO:
                return 75;
            case RUMBO:
                return 77;
            case SEN:
                return 79;
            case SENO:
                return 80;
            case SUMA:
                return 83;
            case UL:
                return 84;
            case ULTIMO:
                return 85;
            case '(':
                return 88;
        }
        return 665;
    }

    private int yys49() {
        switch (yytok) {
            case MARRON:
            case GRIS:
            case ROJO:
            case NEGRO:
            case BLANCO:
            case VERDE:
            case AMARILLO:
            case AZUL:
            case error:
            case '=':
            case CIAN:
                return 665;
        }
        return yyr26();
    }

    private int yys50() {
        switch (yytok) {
            case AZAR:
                return 31;
            case COS:
                return 36;
            case CUENTA:
                return 37;
            case DIFERENCIA:
                return 38;
            case DIVISION:
                return 39;
            case ELEGIR:
                return 41;
            case ELEMENTO:
                return 42;
            case FLOAT:
                return 44;
            case IDENTIFIER:
                return 49;
            case INTEGER:
                return 53;
            case MENOS:
                return 56;
            case POTENCIA:
                return 67;
            case PRIMERO:
                return 68;
            case PRODUCTO:
                return 69;
            case RAIZCUADRADA:
                return 70;
            case RC:
                return 71;
            case REDONDEA:
                return 73;
            case RESTO:
                return 75;
            case RUMBO:
                return 77;
            case SEN:
                return 79;
            case SENO:
                return 80;
            case SUMA:
                return 83;
            case UL:
                return 84;
            case ULTIMO:
                return 85;
            case '(':
                return 88;
        }
        return 665;
    }

    private int yys53() {
        switch (yytok) {
            case MARRON:
            case GRIS:
            case ROJO:
            case NEGRO:
            case BLANCO:
            case VERDE:
            case AMARILLO:
            case AZUL:
            case error:
            case '=':
            case CIAN:
                return 665;
        }
        return yyr25();
    }

    private int yys54() {
        switch (yytok) {
            case AZAR:
                return 31;
            case COS:
                return 36;
            case CUENTA:
                return 37;
            case DIFERENCIA:
                return 38;
            case DIVISION:
                return 39;
            case ELEGIR:
                return 41;
            case ELEMENTO:
                return 42;
            case FLOAT:
                return 44;
            case IDENTIFIER:
                return 49;
            case INTEGER:
                return 53;
            case MENOS:
                return 56;
            case POTENCIA:
                return 67;
            case PRIMERO:
                return 68;
            case PRODUCTO:
                return 69;
            case RAIZCUADRADA:
                return 70;
            case RC:
                return 71;
            case REDONDEA:
                return 73;
            case RESTO:
                return 75;
            case RUMBO:
                return 77;
            case SEN:
                return 79;
            case SENO:
                return 80;
            case SUMA:
                return 83;
            case UL:
                return 84;
            case ULTIMO:
                return 85;
            case '(':
                return 88;
        }
        return 665;
    }

    private int yys55() {
        switch (yytok) {
            case AZAR:
                return 31;
            case COS:
                return 36;
            case CUENTA:
                return 37;
            case DIFERENCIA:
                return 38;
            case DIVISION:
                return 39;
            case ELEGIR:
                return 41;
            case ELEMENTO:
                return 42;
            case FLOAT:
                return 44;
            case IDENTIFIER:
                return 49;
            case INTEGER:
                return 53;
            case MENOS:
                return 56;
            case POTENCIA:
                return 67;
            case PRIMERO:
                return 68;
            case PRODUCTO:
                return 69;
            case RAIZCUADRADA:
                return 70;
            case RC:
                return 71;
            case REDONDEA:
                return 73;
            case RESTO:
                return 75;
            case RUMBO:
                return 77;
            case SEN:
                return 79;
            case SENO:
                return 80;
            case SUMA:
                return 83;
            case UL:
                return 84;
            case ULTIMO:
                return 85;
            case '(':
                return 88;
        }
        return 665;
    }

    private int yys56() {
        switch (yytok) {
            case AZAR:
                return 31;
            case COS:
                return 36;
            case CUENTA:
                return 37;
            case DIFERENCIA:
                return 38;
            case DIVISION:
                return 39;
            case ELEGIR:
                return 41;
            case ELEMENTO:
                return 42;
            case FLOAT:
                return 44;
            case IDENTIFIER:
                return 49;
            case INTEGER:
                return 53;
            case MENOS:
                return 56;
            case POTENCIA:
                return 67;
            case PRIMERO:
                return 68;
            case PRODUCTO:
                return 69;
            case RAIZCUADRADA:
                return 70;
            case RC:
                return 71;
            case REDONDEA:
                return 73;
            case RESTO:
                return 75;
            case RUMBO:
                return 77;
            case SEN:
                return 79;
            case SENO:
                return 80;
            case SUMA:
                return 83;
            case UL:
                return 84;
            case ULTIMO:
                return 85;
            case '(':
                return 88;
        }
        return 665;
    }

    private int yys57() {
        switch (yytok) {
            case AZAR:
                return 31;
            case COS:
                return 36;
            case CUENTA:
                return 37;
            case DIFERENCIA:
                return 38;
            case DIVISION:
                return 39;
            case ELEGIR:
                return 41;
            case ELEMENTO:
                return 42;
            case FLOAT:
                return 44;
            case IDENTIFIER:
                return 49;
            case IGUALES:
                return 50;
            case INTEGER:
                return 53;
            case MAYORQUE:
                return 54;
            case MENORQUE:
                return 55;
            case MENOS:
                return 56;
            case O:
                return 57;
            case POTENCIA:
                return 67;
            case PRIMERO:
                return 68;
            case PRODUCTO:
                return 69;
            case RAIZCUADRADA:
                return 70;
            case RC:
                return 71;
            case REDONDEA:
                return 73;
            case RESTO:
                return 75;
            case RUMBO:
                return 77;
            case SEN:
                return 79;
            case SENO:
                return 80;
            case SUMA:
                return 83;
            case UL:
                return 84;
            case ULTIMO:
                return 85;
            case Y:
                return 87;
            case '(':
                return 88;
        }
        return 665;
    }

    private int yys58() {
        switch (yytok) {
            case VERDE:
            case CIAN:
            case ROJO:
            case NEGRO:
            case '+':
            case BLANCO:
            case '*':
            case AMARILLO:
            case AZUL:
            case '=':
            case '<':
            case '>':
            case ')':
            case MARRON:
            case '/':
            case error:
            case '-':
            case '[':
            case GRIS:
                return 665;
        }
        return yyr84();
    }

    private int yys59() {
        switch (yytok) {
            case VERDE:
            case CIAN:
            case ROJO:
            case NEGRO:
            case '+':
            case BLANCO:
            case '*':
            case AMARILLO:
            case AZUL:
            case '=':
            case '<':
            case '>':
            case ')':
            case MARRON:
            case '/':
            case error:
            case '-':
            case '[':
            case GRIS:
                return 665;
        }
        return yyr85();
    }

    private int yys60() {
        switch (yytok) {
            case AMARILLO:
                return 165;
            case AZUL:
                return 166;
            case BLANCO:
                return 167;
            case CIAN:
                return 168;
            case GRIS:
                return 169;
            case MARRON:
                return 170;
            case NEGRO:
                return 171;
            case ROJO:
                return 172;
            case VERDE:
                return 173;
        }
        return 665;
    }

    private int yys61() {
        switch (yytok) {
            case AMARILLO:
                return 165;
            case AZUL:
                return 166;
            case BLANCO:
                return 167;
            case CIAN:
                return 168;
            case GRIS:
                return 169;
            case MARRON:
                return 170;
            case NEGRO:
                return 171;
            case ROJO:
                return 172;
            case VERDE:
                return 173;
        }
        return 665;
    }

    private int yys63() {
        switch (yytok) {
            case AZAR:
                return 31;
            case COS:
                return 36;
            case CUENTA:
                return 37;
            case DIFERENCIA:
                return 38;
            case DIVISION:
                return 39;
            case ELEGIR:
                return 41;
            case ELEMENTO:
                return 42;
            case FLOAT:
                return 44;
            case IDENTIFIER:
                return 49;
            case INTEGER:
                return 53;
            case MENOS:
                return 56;
            case POTENCIA:
                return 67;
            case PRIMERO:
                return 68;
            case PRODUCTO:
                return 69;
            case RAIZCUADRADA:
                return 70;
            case RC:
                return 71;
            case REDONDEA:
                return 73;
            case RESTO:
                return 75;
            case RUMBO:
                return 77;
            case SEN:
                return 79;
            case SENO:
                return 80;
            case SUMA:
                return 83;
            case UL:
                return 84;
            case ULTIMO:
                return 85;
            case '(':
                return 88;
        }
        return 665;
    }

    private int yys64() {
        switch (yytok) {
            case AZAR:
                return 31;
            case CUENTA:
                return 37;
            case INTEGER:
                return 53;
            case REDONDEA:
                return 73;
            case RESTO:
                return 75;
            case DIFERENCIA:
                return 109;
            case ELEGIR:
                return 110;
            case ELEMENTO:
                return 111;
            case IDENTIFIER:
                return 112;
            case MENOS:
                return 113;
            case POTENCIA:
                return 114;
            case PRIMERO:
                return 115;
            case PRODUCTO:
                return 116;
            case SUMA:
                return 117;
            case UL:
                return 118;
            case ULTIMO:
                return 119;
            case '(':
                return 120;
        }
        return 665;
    }

    private int yys65() {
        switch (yytok) {
            case AZAR:
                return 31;
            case CUENTA:
                return 37;
            case INTEGER:
                return 53;
            case REDONDEA:
                return 73;
            case RESTO:
                return 75;
            case DIFERENCIA:
                return 109;
            case ELEGIR:
                return 110;
            case ELEMENTO:
                return 111;
            case IDENTIFIER:
                return 112;
            case MENOS:
                return 113;
            case POTENCIA:
                return 114;
            case PRIMERO:
                return 115;
            case PRODUCTO:
                return 116;
            case SUMA:
                return 117;
            case UL:
                return 118;
            case ULTIMO:
                return 119;
            case '(':
                return 120;
        }
        return 665;
    }

    private int yys66() {
        switch (yytok) {
            case AZAR:
                return 31;
            case CUENTA:
                return 37;
            case INTEGER:
                return 53;
            case REDONDEA:
                return 73;
            case RESTO:
                return 75;
            case DIFERENCIA:
                return 109;
            case ELEGIR:
                return 110;
            case ELEMENTO:
                return 111;
            case IDENTIFIER:
                return 112;
            case MENOS:
                return 113;
            case POTENCIA:
                return 114;
            case PRIMERO:
                return 115;
            case PRODUCTO:
                return 116;
            case SUMA:
                return 117;
            case UL:
                return 118;
            case ULTIMO:
                return 119;
            case '(':
                return 120;
        }
        return 665;
    }

    private int yys67() {
        switch (yytok) {
            case AZAR:
                return 31;
            case COS:
                return 36;
            case CUENTA:
                return 37;
            case DIFERENCIA:
                return 38;
            case DIVISION:
                return 39;
            case ELEGIR:
                return 41;
            case ELEMENTO:
                return 42;
            case FLOAT:
                return 44;
            case IDENTIFIER:
                return 49;
            case INTEGER:
                return 53;
            case MENOS:
                return 56;
            case POTENCIA:
                return 67;
            case PRIMERO:
                return 68;
            case PRODUCTO:
                return 69;
            case RAIZCUADRADA:
                return 70;
            case RC:
                return 71;
            case REDONDEA:
                return 73;
            case RESTO:
                return 75;
            case RUMBO:
                return 77;
            case SEN:
                return 79;
            case SENO:
                return 80;
            case SUMA:
                return 83;
            case UL:
                return 84;
            case ULTIMO:
                return 85;
            case '(':
                return 88;
        }
        return 665;
    }

    private int yys69() {
        switch (yytok) {
            case AZAR:
                return 31;
            case COS:
                return 36;
            case CUENTA:
                return 37;
            case DIFERENCIA:
                return 38;
            case DIVISION:
                return 39;
            case ELEGIR:
                return 41;
            case ELEMENTO:
                return 42;
            case FLOAT:
                return 44;
            case IDENTIFIER:
                return 49;
            case INTEGER:
                return 53;
            case MENOS:
                return 56;
            case POTENCIA:
                return 67;
            case PRIMERO:
                return 68;
            case PRODUCTO:
                return 69;
            case RAIZCUADRADA:
                return 70;
            case RC:
                return 71;
            case REDONDEA:
                return 73;
            case RESTO:
                return 75;
            case RUMBO:
                return 77;
            case SEN:
                return 79;
            case SENO:
                return 80;
            case SUMA:
                return 83;
            case UL:
                return 84;
            case ULTIMO:
                return 85;
            case '(':
                return 88;
        }
        return 665;
    }

    private int yys70() {
        switch (yytok) {
            case AZAR:
                return 31;
            case COS:
                return 36;
            case CUENTA:
                return 37;
            case DIFERENCIA:
                return 38;
            case DIVISION:
                return 39;
            case ELEGIR:
                return 41;
            case ELEMENTO:
                return 42;
            case FLOAT:
                return 44;
            case IDENTIFIER:
                return 49;
            case INTEGER:
                return 53;
            case MENOS:
                return 56;
            case POTENCIA:
                return 67;
            case PRIMERO:
                return 68;
            case PRODUCTO:
                return 69;
            case RAIZCUADRADA:
                return 70;
            case RC:
                return 71;
            case REDONDEA:
                return 73;
            case RESTO:
                return 75;
            case RUMBO:
                return 77;
            case SEN:
                return 79;
            case SENO:
                return 80;
            case SUMA:
                return 83;
            case UL:
                return 84;
            case ULTIMO:
                return 85;
            case '(':
                return 88;
        }
        return 665;
    }

    private int yys71() {
        switch (yytok) {
            case AZAR:
                return 31;
            case COS:
                return 36;
            case CUENTA:
                return 37;
            case DIFERENCIA:
                return 38;
            case DIVISION:
                return 39;
            case ELEGIR:
                return 41;
            case ELEMENTO:
                return 42;
            case FLOAT:
                return 44;
            case IDENTIFIER:
                return 49;
            case INTEGER:
                return 53;
            case MENOS:
                return 56;
            case POTENCIA:
                return 67;
            case PRIMERO:
                return 68;
            case PRODUCTO:
                return 69;
            case RAIZCUADRADA:
                return 70;
            case RC:
                return 71;
            case REDONDEA:
                return 73;
            case RESTO:
                return 75;
            case RUMBO:
                return 77;
            case SEN:
                return 79;
            case SENO:
                return 80;
            case SUMA:
                return 83;
            case UL:
                return 84;
            case ULTIMO:
                return 85;
            case '(':
                return 88;
        }
        return 665;
    }

    private int yys72() {
        switch (yytok) {
            case AZAR:
                return 31;
            case CUENTA:
                return 37;
            case INTEGER:
                return 53;
            case REDONDEA:
                return 73;
            case RESTO:
                return 75;
            case DIFERENCIA:
                return 109;
            case ELEGIR:
                return 110;
            case ELEMENTO:
                return 111;
            case IDENTIFIER:
                return 112;
            case MENOS:
                return 113;
            case POTENCIA:
                return 114;
            case PRIMERO:
                return 115;
            case PRODUCTO:
                return 116;
            case SUMA:
                return 117;
            case UL:
                return 118;
            case ULTIMO:
                return 119;
            case '(':
                return 120;
        }
        return 665;
    }

    private int yys73() {
        switch (yytok) {
            case AZAR:
                return 31;
            case COS:
                return 36;
            case CUENTA:
                return 37;
            case DIFERENCIA:
                return 38;
            case DIVISION:
                return 39;
            case ELEGIR:
                return 41;
            case ELEMENTO:
                return 42;
            case FLOAT:
                return 44;
            case IDENTIFIER:
                return 49;
            case INTEGER:
                return 53;
            case MENOS:
                return 56;
            case POTENCIA:
                return 67;
            case PRIMERO:
                return 68;
            case PRODUCTO:
                return 69;
            case RAIZCUADRADA:
                return 70;
            case RC:
                return 71;
            case REDONDEA:
                return 73;
            case RESTO:
                return 75;
            case RUMBO:
                return 77;
            case SEN:
                return 79;
            case SENO:
                return 80;
            case SUMA:
                return 83;
            case UL:
                return 84;
            case ULTIMO:
                return 85;
            case '(':
                return 88;
        }
        return 665;
    }

    private int yys74() {
        switch (yytok) {
            case AZAR:
                return 31;
            case CUENTA:
                return 37;
            case INTEGER:
                return 53;
            case REDONDEA:
                return 73;
            case RESTO:
                return 75;
            case DIFERENCIA:
                return 109;
            case ELEGIR:
                return 110;
            case ELEMENTO:
                return 111;
            case IDENTIFIER:
                return 112;
            case MENOS:
                return 113;
            case POTENCIA:
                return 114;
            case PRIMERO:
                return 115;
            case PRODUCTO:
                return 116;
            case SUMA:
                return 117;
            case UL:
                return 118;
            case ULTIMO:
                return 119;
            case '(':
                return 120;
        }
        return 665;
    }

    private int yys75() {
        switch (yytok) {
            case AZAR:
                return 31;
            case CUENTA:
                return 37;
            case INTEGER:
                return 53;
            case REDONDEA:
                return 73;
            case RESTO:
                return 75;
            case DIFERENCIA:
                return 109;
            case ELEGIR:
                return 110;
            case ELEMENTO:
                return 111;
            case IDENTIFIER:
                return 112;
            case MENOS:
                return 113;
            case POTENCIA:
                return 114;
            case PRIMERO:
                return 115;
            case PRODUCTO:
                return 116;
            case SUMA:
                return 117;
            case UL:
                return 118;
            case ULTIMO:
                return 119;
            case '(':
                return 120;
        }
        return 665;
    }

    private int yys76() {
        switch (yytok) {
            case AZAR:
                return 31;
            case CUENTA:
                return 37;
            case INTEGER:
                return 53;
            case REDONDEA:
                return 73;
            case RESTO:
                return 75;
            case DIFERENCIA:
                return 109;
            case ELEGIR:
                return 110;
            case ELEMENTO:
                return 111;
            case IDENTIFIER:
                return 112;
            case MENOS:
                return 113;
            case POTENCIA:
                return 114;
            case PRIMERO:
                return 115;
            case PRODUCTO:
                return 116;
            case SUMA:
                return 117;
            case UL:
                return 118;
            case ULTIMO:
                return 119;
            case '(':
                return 120;
        }
        return 665;
    }

    private int yys77() {
        switch (yytok) {
            case MARRON:
            case GRIS:
            case ROJO:
            case NEGRO:
            case BLANCO:
            case VERDE:
            case AMARILLO:
            case AZUL:
            case error:
            case '=':
            case CIAN:
                return 665;
        }
        return yyr83();
    }

    private int yys78() {
        switch (yytok) {
            case VERDE:
            case CIAN:
            case ROJO:
            case NEGRO:
            case '+':
            case BLANCO:
            case '*':
            case AMARILLO:
            case AZUL:
            case '=':
            case '<':
            case '>':
            case ')':
            case MARRON:
            case '/':
            case error:
            case '-':
            case '[':
            case GRIS:
                return 665;
        }
        return yyr91();
    }

    private int yys79() {
        switch (yytok) {
            case AZAR:
                return 31;
            case COS:
                return 36;
            case CUENTA:
                return 37;
            case DIFERENCIA:
                return 38;
            case DIVISION:
                return 39;
            case ELEGIR:
                return 41;
            case ELEMENTO:
                return 42;
            case FLOAT:
                return 44;
            case IDENTIFIER:
                return 49;
            case INTEGER:
                return 53;
            case MENOS:
                return 56;
            case POTENCIA:
                return 67;
            case PRIMERO:
                return 68;
            case PRODUCTO:
                return 69;
            case RAIZCUADRADA:
                return 70;
            case RC:
                return 71;
            case REDONDEA:
                return 73;
            case RESTO:
                return 75;
            case RUMBO:
                return 77;
            case SEN:
                return 79;
            case SENO:
                return 80;
            case SUMA:
                return 83;
            case UL:
                return 84;
            case ULTIMO:
                return 85;
            case '(':
                return 88;
        }
        return 665;
    }

    private int yys80() {
        switch (yytok) {
            case AZAR:
                return 31;
            case COS:
                return 36;
            case CUENTA:
                return 37;
            case DIFERENCIA:
                return 38;
            case DIVISION:
                return 39;
            case ELEGIR:
                return 41;
            case ELEMENTO:
                return 42;
            case FLOAT:
                return 44;
            case IDENTIFIER:
                return 49;
            case INTEGER:
                return 53;
            case MENOS:
                return 56;
            case POTENCIA:
                return 67;
            case PRIMERO:
                return 68;
            case PRODUCTO:
                return 69;
            case RAIZCUADRADA:
                return 70;
            case RC:
                return 71;
            case REDONDEA:
                return 73;
            case RESTO:
                return 75;
            case RUMBO:
                return 77;
            case SEN:
                return 79;
            case SENO:
                return 80;
            case SUMA:
                return 83;
            case UL:
                return 84;
            case ULTIMO:
                return 85;
            case '(':
                return 88;
        }
        return 665;
    }

    private int yys81() {
        switch (yytok) {
            case AZAR:
                return 31;
            case COS:
                return 36;
            case CUENTA:
                return 37;
            case DIFERENCIA:
                return 38;
            case DIVISION:
                return 39;
            case ELEGIR:
                return 41;
            case ELEMENTO:
                return 42;
            case FLOAT:
                return 44;
            case IDENTIFIER:
                return 49;
            case IGUALES:
                return 50;
            case INTEGER:
                return 53;
            case MAYORQUE:
                return 54;
            case MENORQUE:
                return 55;
            case MENOS:
                return 56;
            case O:
                return 57;
            case POTENCIA:
                return 67;
            case PRIMERO:
                return 68;
            case PRODUCTO:
                return 69;
            case RAIZCUADRADA:
                return 70;
            case RC:
                return 71;
            case REDONDEA:
                return 73;
            case RESTO:
                return 75;
            case RUMBO:
                return 77;
            case SEN:
                return 79;
            case SENO:
                return 80;
            case SUMA:
                return 83;
            case UL:
                return 84;
            case ULTIMO:
                return 85;
            case Y:
                return 87;
            case '(':
                return 88;
        }
        return 665;
    }

    private int yys82() {
        switch (yytok) {
            case VERDE:
            case CIAN:
            case ROJO:
            case NEGRO:
            case '+':
            case BLANCO:
            case '*':
            case AMARILLO:
            case AZUL:
            case '=':
            case '<':
            case '>':
            case ')':
            case MARRON:
            case '/':
            case error:
            case '-':
            case '[':
            case GRIS:
                return 665;
        }
        return yyr90();
    }

    private int yys83() {
        switch (yytok) {
            case AZAR:
                return 31;
            case COS:
                return 36;
            case CUENTA:
                return 37;
            case DIFERENCIA:
                return 38;
            case DIVISION:
                return 39;
            case ELEGIR:
                return 41;
            case ELEMENTO:
                return 42;
            case FLOAT:
                return 44;
            case IDENTIFIER:
                return 49;
            case INTEGER:
                return 53;
            case MENOS:
                return 56;
            case POTENCIA:
                return 67;
            case PRIMERO:
                return 68;
            case PRODUCTO:
                return 69;
            case RAIZCUADRADA:
                return 70;
            case RC:
                return 71;
            case REDONDEA:
                return 73;
            case RESTO:
                return 75;
            case RUMBO:
                return 77;
            case SEN:
                return 79;
            case SENO:
                return 80;
            case SUMA:
                return 83;
            case UL:
                return 84;
            case ULTIMO:
                return 85;
            case '(':
                return 88;
        }
        return 665;
    }

    private int yys87() {
        switch (yytok) {
            case AZAR:
                return 31;
            case COS:
                return 36;
            case CUENTA:
                return 37;
            case DIFERENCIA:
                return 38;
            case DIVISION:
                return 39;
            case ELEGIR:
                return 41;
            case ELEMENTO:
                return 42;
            case FLOAT:
                return 44;
            case IDENTIFIER:
                return 49;
            case IGUALES:
                return 50;
            case INTEGER:
                return 53;
            case MAYORQUE:
                return 54;
            case MENORQUE:
                return 55;
            case MENOS:
                return 56;
            case O:
                return 57;
            case POTENCIA:
                return 67;
            case PRIMERO:
                return 68;
            case PRODUCTO:
                return 69;
            case RAIZCUADRADA:
                return 70;
            case RC:
                return 71;
            case REDONDEA:
                return 73;
            case RESTO:
                return 75;
            case RUMBO:
                return 77;
            case SEN:
                return 79;
            case SENO:
                return 80;
            case SUMA:
                return 83;
            case UL:
                return 84;
            case ULTIMO:
                return 85;
            case Y:
                return 87;
            case '(':
                return 88;
        }
        return 665;
    }

    private int yys88() {
        switch (yytok) {
            case AZAR:
                return 31;
            case COS:
                return 36;
            case CUENTA:
                return 37;
            case DIFERENCIA:
                return 38;
            case DIVISION:
                return 39;
            case ELEGIR:
                return 41;
            case ELEMENTO:
                return 42;
            case FLOAT:
                return 44;
            case IDENTIFIER:
                return 49;
            case INTEGER:
                return 53;
            case MENOS:
                return 56;
            case POTENCIA:
                return 67;
            case PRIMERO:
                return 68;
            case PRODUCTO:
                return 69;
            case RAIZCUADRADA:
                return 70;
            case RC:
                return 71;
            case REDONDEA:
                return 73;
            case RESTO:
                return 75;
            case RUMBO:
                return 77;
            case SEN:
                return 79;
            case SENO:
                return 80;
            case SUMA:
                return 83;
            case UL:
                return 84;
            case ULTIMO:
                return 85;
            case '(':
                return 88;
        }
        return 665;
    }

    private int yys89() {
        switch (yytok) {
            case APARECETORTUGA:
                return 27;
            case AT:
                return 28;
            case AV:
                return 29;
            case AVANZA:
                return 30;
            case AZAR:
                return 31;
            case BAJALAPIZ:
                return 32;
            case BL:
                return 33;
            case BORRAPANTALLA:
                return 34;
            case CENTRO:
                return 35;
            case COS:
                return 36;
            case CUENTA:
                return 37;
            case DIFERENCIA:
                return 38;
            case DIVISION:
                return 39;
            case EJECUTA:
                return 40;
            case ELEGIR:
                return 41;
            case ELEMENTO:
                return 42;
            case ESPERA:
                return 43;
            case FLOAT:
                return 44;
            case GD:
                return 45;
            case GI:
                return 46;
            case GIRADERECHA:
                return 47;
            case GIRAIZQUIERDA:
                return 48;
            case IDENTIFIER:
                return 49;
            case IGUALES:
                return 50;
            case INC:
                return 51;
            case INIC:
                return 52;
            case INTEGER:
                return 53;
            case MAYORQUE:
                return 54;
            case MENORQUE:
                return 55;
            case MENOS:
                return 56;
            case O:
                return 57;
            case OCULTATORTUGA:
                return 58;
            case OT:
                return 59;
            case PONCL:
                return 60;
            case PONCOLORLAPIZ:
                return 61;
            case PONPOS:
                return 62;
            case PONRUMBO:
                return 63;
            case PONX:
                return 64;
            case PONXY:
                return 65;
            case PONY:
                return 66;
            case POTENCIA:
                return 67;
            case PRIMERO:
                return 68;
            case PRODUCTO:
                return 69;
            case RAIZCUADRADA:
                return 70;
            case RC:
                return 71;
            case RE:
                return 72;
            case REDONDEA:
                return 73;
            case REPITE:
                return 74;
            case RESTO:
                return 75;
            case RETROCEDE:
                return 76;
            case RUMBO:
                return 77;
            case SB:
                return 78;
            case SEN:
                return 79;
            case SENO:
                return 80;
            case SI:
                return 81;
            case SUBELAPIZ:
                return 82;
            case SUMA:
                return 83;
            case UL:
                return 84;
            case ULTIMO:
                return 85;
            case VAR:
                return 86;
            case Y:
                return 87;
            case '(':
                return 88;
        }
        return 665;
    }

    private int yys90() {
        switch (yytok) {
            case AZAR:
                return 31;
            case COS:
                return 36;
            case CUENTA:
                return 37;
            case DIFERENCIA:
                return 38;
            case DIVISION:
                return 39;
            case ELEGIR:
                return 41;
            case ELEMENTO:
                return 42;
            case FLOAT:
                return 44;
            case IDENTIFIER:
                return 49;
            case INTEGER:
                return 53;
            case MENOS:
                return 56;
            case POTENCIA:
                return 67;
            case PRIMERO:
                return 68;
            case PRODUCTO:
                return 69;
            case RAIZCUADRADA:
                return 70;
            case RC:
                return 71;
            case REDONDEA:
                return 73;
            case RESTO:
                return 75;
            case RUMBO:
                return 77;
            case SEN:
                return 79;
            case SENO:
                return 80;
            case SUMA:
                return 83;
            case UL:
                return 84;
            case ULTIMO:
                return 85;
            case '(':
                return 88;
        }
        return 665;
    }

    private int yys91() {
        switch (yytok) {
            case AZAR:
                return 31;
            case COS:
                return 36;
            case CUENTA:
                return 37;
            case DIFERENCIA:
                return 38;
            case DIVISION:
                return 39;
            case ELEGIR:
                return 41;
            case ELEMENTO:
                return 42;
            case FLOAT:
                return 44;
            case IDENTIFIER:
                return 49;
            case INTEGER:
                return 53;
            case MENOS:
                return 56;
            case POTENCIA:
                return 67;
            case PRIMERO:
                return 68;
            case PRODUCTO:
                return 69;
            case RAIZCUADRADA:
                return 70;
            case RC:
                return 71;
            case REDONDEA:
                return 73;
            case RESTO:
                return 75;
            case RUMBO:
                return 77;
            case SEN:
                return 79;
            case SENO:
                return 80;
            case SUMA:
                return 83;
            case UL:
                return 84;
            case ULTIMO:
                return 85;
            case '(':
                return 88;
        }
        return 665;
    }

    private int yys92() {
        switch (yytok) {
            case AZAR:
                return 31;
            case COS:
                return 36;
            case CUENTA:
                return 37;
            case DIFERENCIA:
                return 38;
            case DIVISION:
                return 39;
            case ELEGIR:
                return 41;
            case ELEMENTO:
                return 42;
            case FLOAT:
                return 44;
            case IDENTIFIER:
                return 49;
            case INTEGER:
                return 53;
            case MENOS:
                return 56;
            case POTENCIA:
                return 67;
            case PRIMERO:
                return 68;
            case PRODUCTO:
                return 69;
            case RAIZCUADRADA:
                return 70;
            case RC:
                return 71;
            case REDONDEA:
                return 73;
            case RESTO:
                return 75;
            case RUMBO:
                return 77;
            case SEN:
                return 79;
            case SENO:
                return 80;
            case SUMA:
                return 83;
            case UL:
                return 84;
            case ULTIMO:
                return 85;
            case '(':
                return 88;
        }
        return 665;
    }

    private int yys93() {
        switch (yytok) {
            case AZAR:
                return 31;
            case COS:
                return 36;
            case CUENTA:
                return 37;
            case DIFERENCIA:
                return 38;
            case DIVISION:
                return 39;
            case ELEGIR:
                return 41;
            case ELEMENTO:
                return 42;
            case FLOAT:
                return 44;
            case IDENTIFIER:
                return 49;
            case INTEGER:
                return 53;
            case MENOS:
                return 56;
            case POTENCIA:
                return 67;
            case PRIMERO:
                return 68;
            case PRODUCTO:
                return 69;
            case RAIZCUADRADA:
                return 70;
            case RC:
                return 71;
            case REDONDEA:
                return 73;
            case RESTO:
                return 75;
            case RUMBO:
                return 77;
            case SEN:
                return 79;
            case SENO:
                return 80;
            case SUMA:
                return 83;
            case UL:
                return 84;
            case ULTIMO:
                return 85;
            case '(':
                return 88;
        }
        return 665;
    }

    private int yys94() {
        switch (yytok) {
            case AZAR:
                return 31;
            case COS:
                return 36;
            case CUENTA:
                return 37;
            case DIFERENCIA:
                return 38;
            case DIVISION:
                return 39;
            case ELEGIR:
                return 41;
            case ELEMENTO:
                return 42;
            case FLOAT:
                return 44;
            case IDENTIFIER:
                return 49;
            case INTEGER:
                return 53;
            case MENOS:
                return 56;
            case POTENCIA:
                return 67;
            case PRIMERO:
                return 68;
            case PRODUCTO:
                return 69;
            case RAIZCUADRADA:
                return 70;
            case RC:
                return 71;
            case REDONDEA:
                return 73;
            case RESTO:
                return 75;
            case RUMBO:
                return 77;
            case SEN:
                return 79;
            case SENO:
                return 80;
            case SUMA:
                return 83;
            case UL:
                return 84;
            case ULTIMO:
                return 85;
            case '(':
                return 88;
        }
        return 665;
    }

    private int yys95() {
        switch (yytok) {
            case AZAR:
                return 31;
            case COS:
                return 36;
            case CUENTA:
                return 37;
            case DIFERENCIA:
                return 38;
            case DIVISION:
                return 39;
            case ELEGIR:
                return 41;
            case ELEMENTO:
                return 42;
            case FLOAT:
                return 44;
            case IDENTIFIER:
                return 49;
            case INTEGER:
                return 53;
            case MENOS:
                return 56;
            case POTENCIA:
                return 67;
            case PRIMERO:
                return 68;
            case PRODUCTO:
                return 69;
            case RAIZCUADRADA:
                return 70;
            case RC:
                return 71;
            case REDONDEA:
                return 73;
            case RESTO:
                return 75;
            case RUMBO:
                return 77;
            case SEN:
                return 79;
            case SENO:
                return 80;
            case SUMA:
                return 83;
            case UL:
                return 84;
            case ULTIMO:
                return 85;
            case '(':
                return 88;
        }
        return 665;
    }

    private int yys96() {
        switch (yytok) {
            case AZAR:
                return 31;
            case COS:
                return 36;
            case CUENTA:
                return 37;
            case DIFERENCIA:
                return 38;
            case DIVISION:
                return 39;
            case ELEGIR:
                return 41;
            case ELEMENTO:
                return 42;
            case FLOAT:
                return 44;
            case IDENTIFIER:
                return 49;
            case INTEGER:
                return 53;
            case MENOS:
                return 56;
            case POTENCIA:
                return 67;
            case PRIMERO:
                return 68;
            case PRODUCTO:
                return 69;
            case RAIZCUADRADA:
                return 70;
            case RC:
                return 71;
            case REDONDEA:
                return 73;
            case RESTO:
                return 75;
            case RUMBO:
                return 77;
            case SEN:
                return 79;
            case SENO:
                return 80;
            case SUMA:
                return 83;
            case UL:
                return 84;
            case ULTIMO:
                return 85;
            case '(':
                return 88;
        }
        return 665;
    }

    private int yys97() {
        switch (yytok) {
            case AZAR:
                return 31;
            case COS:
                return 36;
            case CUENTA:
                return 37;
            case DIFERENCIA:
                return 38;
            case DIVISION:
                return 39;
            case ELEGIR:
                return 41;
            case ELEMENTO:
                return 42;
            case FLOAT:
                return 44;
            case IDENTIFIER:
                return 49;
            case INTEGER:
                return 53;
            case MENOS:
                return 56;
            case POTENCIA:
                return 67;
            case PRIMERO:
                return 68;
            case PRODUCTO:
                return 69;
            case RAIZCUADRADA:
                return 70;
            case RC:
                return 71;
            case REDONDEA:
                return 73;
            case RESTO:
                return 75;
            case RUMBO:
                return 77;
            case SEN:
                return 79;
            case SENO:
                return 80;
            case SUMA:
                return 83;
            case UL:
                return 84;
            case ULTIMO:
                return 85;
            case '(':
                return 88;
        }
        return 665;
    }

    private int yys98() {
        switch (yytok) {
            case AZAR:
                return 31;
            case COS:
                return 36;
            case CUENTA:
                return 37;
            case DIFERENCIA:
                return 38;
            case DIVISION:
                return 39;
            case ELEGIR:
                return 41;
            case ELEMENTO:
                return 42;
            case FLOAT:
                return 44;
            case IDENTIFIER:
                return 49;
            case INTEGER:
                return 53;
            case MENOS:
                return 56;
            case POTENCIA:
                return 67;
            case PRIMERO:
                return 68;
            case PRODUCTO:
                return 69;
            case RAIZCUADRADA:
                return 70;
            case RC:
                return 71;
            case REDONDEA:
                return 73;
            case RESTO:
                return 75;
            case RUMBO:
                return 77;
            case SEN:
                return 79;
            case SENO:
                return 80;
            case SUMA:
                return 83;
            case UL:
                return 84;
            case ULTIMO:
                return 85;
            case '(':
                return 88;
        }
        return 665;
    }

    private int yys99() {
        switch (yytok) {
            case AZAR:
                return 31;
            case COS:
                return 36;
            case CUENTA:
                return 37;
            case DIFERENCIA:
                return 38;
            case DIVISION:
                return 39;
            case ELEGIR:
                return 41;
            case ELEMENTO:
                return 42;
            case FLOAT:
                return 44;
            case IDENTIFIER:
                return 49;
            case INTEGER:
                return 53;
            case MENOS:
                return 56;
            case POTENCIA:
                return 67;
            case PRIMERO:
                return 68;
            case PRODUCTO:
                return 69;
            case RAIZCUADRADA:
                return 70;
            case RC:
                return 71;
            case REDONDEA:
                return 73;
            case RESTO:
                return 75;
            case RUMBO:
                return 77;
            case SEN:
                return 79;
            case SENO:
                return 80;
            case SUMA:
                return 83;
            case UL:
                return 84;
            case ULTIMO:
                return 85;
            case '(':
                return 88;
        }
        return 665;
    }

    private int yys100() {
        switch (yytok) {
            case AZAR:
                return 31;
            case COS:
                return 36;
            case CUENTA:
                return 37;
            case DIFERENCIA:
                return 38;
            case DIVISION:
                return 39;
            case ELEGIR:
                return 41;
            case ELEMENTO:
                return 42;
            case FLOAT:
                return 44;
            case IDENTIFIER:
                return 49;
            case INTEGER:
                return 53;
            case MENOS:
                return 56;
            case POTENCIA:
                return 67;
            case PRIMERO:
                return 68;
            case PRODUCTO:
                return 69;
            case RAIZCUADRADA:
                return 70;
            case RC:
                return 71;
            case REDONDEA:
                return 73;
            case RESTO:
                return 75;
            case RUMBO:
                return 77;
            case SEN:
                return 79;
            case SENO:
                return 80;
            case SUMA:
                return 83;
            case UL:
                return 84;
            case ULTIMO:
                return 85;
            case '(':
                return 88;
        }
        return 665;
    }

    private int yys101() {
        switch (yytok) {
            case AZAR:
                return 31;
            case COS:
                return 36;
            case CUENTA:
                return 37;
            case DIFERENCIA:
                return 38;
            case DIVISION:
                return 39;
            case ELEGIR:
                return 41;
            case ELEMENTO:
                return 42;
            case FLOAT:
                return 44;
            case IDENTIFIER:
                return 49;
            case INTEGER:
                return 53;
            case MENOS:
                return 56;
            case POTENCIA:
                return 67;
            case PRIMERO:
                return 68;
            case PRODUCTO:
                return 69;
            case RAIZCUADRADA:
                return 70;
            case RC:
                return 71;
            case REDONDEA:
                return 73;
            case RESTO:
                return 75;
            case RUMBO:
                return 77;
            case SEN:
                return 79;
            case SENO:
                return 80;
            case SUMA:
                return 83;
            case UL:
                return 84;
            case ULTIMO:
                return 85;
            case '(':
                return 88;
        }
        return 665;
    }

    private int yys102() {
        switch (yytok) {
            case MARRON:
            case GRIS:
            case ROJO:
            case NEGRO:
            case BLANCO:
            case VERDE:
            case AMARILLO:
            case AZUL:
            case error:
            case '=':
            case CIAN:
                return 665;
        }
        return yyr27();
    }

    private int yys103() {
        switch (yytok) {
            case AMARILLO:
            case CIAN:
            case '[':
            case NEGRO:
            case error:
            case BLANCO:
            case GRIS:
            case VERDE:
            case AZUL:
            case '=':
            case '<':
            case '>':
            case ')':
            case MARRON:
            case '/':
            case ROJO:
                return 665;
            case '*':
                return 235;
            case '+':
                return 236;
            case '-':
                return 237;
        }
        return yyr109();
    }

    private int yys104() {
        switch (yytok) {
            case MARRON:
            case GRIS:
            case ROJO:
            case NEGRO:
            case BLANCO:
            case VERDE:
            case AMARILLO:
            case AZUL:
            case error:
            case '=':
            case CIAN:
                return 665;
        }
        return yyr28();
    }

    private int yys105() {
        switch (yytok) {
            case MARRON:
            case GRIS:
            case ROJO:
            case NEGRO:
            case BLANCO:
            case VERDE:
            case AMARILLO:
            case AZUL:
            case error:
            case '=':
            case CIAN:
                return 665;
        }
        return yyr29();
    }

    private int yys106() {
        switch (yytok) {
            case MARRON:
            case GRIS:
            case ROJO:
            case NEGRO:
            case BLANCO:
            case VERDE:
            case AMARILLO:
            case AZUL:
            case error:
            case '=':
            case CIAN:
                return 665;
        }
        return yyr31();
    }

    private int yys107() {
        switch (yytok) {
            case MARRON:
            case GRIS:
            case ROJO:
            case NEGRO:
            case BLANCO:
            case VERDE:
            case AMARILLO:
            case AZUL:
            case error:
            case '=':
            case CIAN:
                return 665;
        }
        return yyr32();
    }

    private int yys108() {
        switch (yytok) {
            case MARRON:
            case GRIS:
            case ROJO:
            case NEGRO:
            case BLANCO:
            case VERDE:
            case AMARILLO:
            case AZUL:
            case error:
            case '=':
            case CIAN:
                return 665;
        }
        return yyr30();
    }

    private int yys109() {
        switch (yytok) {
            case AZAR:
                return 31;
            case CUENTA:
                return 37;
            case INTEGER:
                return 53;
            case REDONDEA:
                return 73;
            case RESTO:
                return 75;
            case DIFERENCIA:
                return 109;
            case ELEGIR:
                return 110;
            case ELEMENTO:
                return 111;
            case IDENTIFIER:
                return 112;
            case MENOS:
                return 113;
            case POTENCIA:
                return 114;
            case PRIMERO:
                return 115;
            case PRODUCTO:
                return 116;
            case SUMA:
                return 117;
            case UL:
                return 118;
            case ULTIMO:
                return 119;
            case '(':
                return 120;
        }
        return 665;
    }

    private int yys111() {
        switch (yytok) {
            case AZAR:
                return 31;
            case CUENTA:
                return 37;
            case INTEGER:
                return 53;
            case REDONDEA:
                return 73;
            case RESTO:
                return 75;
            case DIFERENCIA:
                return 109;
            case ELEGIR:
                return 110;
            case ELEMENTO:
                return 111;
            case IDENTIFIER:
                return 112;
            case MENOS:
                return 113;
            case POTENCIA:
                return 114;
            case PRIMERO:
                return 115;
            case PRODUCTO:
                return 116;
            case SUMA:
                return 117;
            case UL:
                return 118;
            case ULTIMO:
                return 119;
            case '(':
                return 120;
        }
        return 665;
    }

    private int yys112() {
        switch (yytok) {
            case MARRON:
            case GRIS:
            case ROJO:
            case NEGRO:
            case BLANCO:
            case VERDE:
            case AMARILLO:
            case AZUL:
            case error:
            case '=':
            case CIAN:
                return 665;
        }
        return yyr26();
    }

    private int yys113() {
        switch (yytok) {
            case AZAR:
                return 31;
            case CUENTA:
                return 37;
            case INTEGER:
                return 53;
            case REDONDEA:
                return 73;
            case RESTO:
                return 75;
            case DIFERENCIA:
                return 109;
            case ELEGIR:
                return 110;
            case ELEMENTO:
                return 111;
            case IDENTIFIER:
                return 112;
            case MENOS:
                return 113;
            case POTENCIA:
                return 114;
            case PRIMERO:
                return 115;
            case PRODUCTO:
                return 116;
            case SUMA:
                return 117;
            case UL:
                return 118;
            case ULTIMO:
                return 119;
            case '(':
                return 120;
        }
        return 665;
    }

    private int yys114() {
        switch (yytok) {
            case AZAR:
                return 31;
            case CUENTA:
                return 37;
            case INTEGER:
                return 53;
            case REDONDEA:
                return 73;
            case RESTO:
                return 75;
            case DIFERENCIA:
                return 109;
            case ELEGIR:
                return 110;
            case ELEMENTO:
                return 111;
            case IDENTIFIER:
                return 112;
            case MENOS:
                return 113;
            case POTENCIA:
                return 114;
            case PRIMERO:
                return 115;
            case PRODUCTO:
                return 116;
            case SUMA:
                return 117;
            case UL:
                return 118;
            case ULTIMO:
                return 119;
            case '(':
                return 120;
        }
        return 665;
    }

    private int yys116() {
        switch (yytok) {
            case AZAR:
                return 31;
            case CUENTA:
                return 37;
            case INTEGER:
                return 53;
            case REDONDEA:
                return 73;
            case RESTO:
                return 75;
            case DIFERENCIA:
                return 109;
            case ELEGIR:
                return 110;
            case ELEMENTO:
                return 111;
            case IDENTIFIER:
                return 112;
            case MENOS:
                return 113;
            case POTENCIA:
                return 114;
            case PRIMERO:
                return 115;
            case PRODUCTO:
                return 116;
            case SUMA:
                return 117;
            case UL:
                return 118;
            case ULTIMO:
                return 119;
            case '(':
                return 120;
        }
        return 665;
    }

    private int yys117() {
        switch (yytok) {
            case AZAR:
                return 31;
            case CUENTA:
                return 37;
            case INTEGER:
                return 53;
            case REDONDEA:
                return 73;
            case RESTO:
                return 75;
            case DIFERENCIA:
                return 109;
            case ELEGIR:
                return 110;
            case ELEMENTO:
                return 111;
            case IDENTIFIER:
                return 112;
            case MENOS:
                return 113;
            case POTENCIA:
                return 114;
            case PRIMERO:
                return 115;
            case PRODUCTO:
                return 116;
            case SUMA:
                return 117;
            case UL:
                return 118;
            case ULTIMO:
                return 119;
            case '(':
                return 120;
        }
        return 665;
    }

    private int yys120() {
        switch (yytok) {
            case AZAR:
                return 31;
            case CUENTA:
                return 37;
            case INTEGER:
                return 53;
            case REDONDEA:
                return 73;
            case RESTO:
                return 75;
            case DIFERENCIA:
                return 109;
            case ELEGIR:
                return 110;
            case ELEMENTO:
                return 111;
            case IDENTIFIER:
                return 112;
            case MENOS:
                return 113;
            case POTENCIA:
                return 114;
            case PRIMERO:
                return 115;
            case PRODUCTO:
                return 116;
            case SUMA:
                return 117;
            case UL:
                return 118;
            case ULTIMO:
                return 119;
            case '(':
                return 120;
        }
        return 665;
    }

    private int yys121() {
        switch (yytok) {
            case AMARILLO:
            case CIAN:
            case '[':
            case NEGRO:
            case error:
            case BLANCO:
            case GRIS:
            case VERDE:
            case AZUL:
            case '=':
            case '<':
            case '>':
            case ')':
            case MARRON:
            case '/':
            case ROJO:
                return 665;
            case '*':
                return 235;
            case '+':
                return 236;
            case '-':
                return 237;
        }
        return yyr108();
    }

    private int yys122() {
        switch (yytok) {
            case AMARILLO:
            case AZUL:
            case GRIS:
            case '=':
            case ROJO:
            case NEGRO:
            case CIAN:
            case VERDE:
            case BLANCO:
            case MARRON:
            case error:
                return 665;
            case '*':
                return 235;
            case '+':
                return 236;
            case '-':
                return 237;
        }
        return yyr95();
    }

    private int yys123() {
        switch (yytok) {
            case MARRON:
            case GRIS:
            case ROJO:
            case NEGRO:
            case BLANCO:
            case VERDE:
            case AMARILLO:
            case AZUL:
            case error:
            case '=':
            case CIAN:
                return 665;
        }
        return yyr35();
    }

    private int yys124() {
        switch (yytok) {
            case MARRON:
            case '=':
            case ROJO:
            case NEGRO:
            case AMARILLO:
            case GRIS:
            case AZUL:
            case CIAN:
            case BLANCO:
            case error:
            case VERDE:
                return 665;
            case '*':
                return 90;
            case '+':
                return 91;
            case '-':
                return 92;
            case '/':
                return 93;
        }
        return yyr98();
    }

    private int yys125() {
        switch (yytok) {
            case MARRON:
            case GRIS:
            case ROJO:
            case NEGRO:
            case BLANCO:
            case VERDE:
            case AMARILLO:
            case AZUL:
            case error:
            case '=':
            case CIAN:
                return 665;
        }
        return yyr36();
    }

    private int yys126() {
        switch (yytok) {
            case MARRON:
            case GRIS:
            case ROJO:
            case NEGRO:
            case BLANCO:
            case VERDE:
            case AMARILLO:
            case AZUL:
            case error:
            case '=':
            case CIAN:
                return 665;
        }
        return yyr37();
    }

    private int yys127() {
        switch (yytok) {
            case MARRON:
            case GRIS:
            case ROJO:
            case NEGRO:
            case BLANCO:
            case VERDE:
            case AMARILLO:
            case AZUL:
            case error:
            case '=':
            case CIAN:
                return 665;
        }
        return yyr38();
    }

    private int yys128() {
        switch (yytok) {
            case MARRON:
            case GRIS:
            case ROJO:
            case NEGRO:
            case BLANCO:
            case VERDE:
            case AMARILLO:
            case AZUL:
            case error:
            case '=':
            case CIAN:
                return 665;
        }
        return yyr40();
    }

    private int yys129() {
        switch (yytok) {
            case MARRON:
            case GRIS:
            case ROJO:
            case NEGRO:
            case BLANCO:
            case VERDE:
            case AMARILLO:
            case AZUL:
            case error:
            case '=':
            case CIAN:
                return 665;
        }
        return yyr41();
    }

    private int yys130() {
        switch (yytok) {
            case MARRON:
            case GRIS:
            case ROJO:
            case NEGRO:
            case BLANCO:
            case VERDE:
            case AMARILLO:
            case AZUL:
            case error:
            case '=':
            case CIAN:
                return 665;
        }
        return yyr39();
    }

    private int yys131() {
        switch (yytok) {
            case MARRON:
            case '=':
            case ROJO:
            case NEGRO:
            case AMARILLO:
            case GRIS:
            case AZUL:
            case CIAN:
            case BLANCO:
            case error:
            case VERDE:
                return 665;
            case '*':
                return 96;
            case '+':
                return 97;
            case '-':
                return 98;
            case '/':
                return 99;
        }
        return yyr97();
    }

    private int yys132() {
        switch (yytok) {
            case AZAR:
                return 31;
            case COS:
                return 36;
            case CUENTA:
                return 37;
            case DIFERENCIA:
                return 38;
            case DIVISION:
                return 39;
            case ELEGIR:
                return 41;
            case ELEMENTO:
                return 42;
            case FLOAT:
                return 44;
            case IDENTIFIER:
                return 49;
            case INTEGER:
                return 53;
            case MENOS:
                return 56;
            case POTENCIA:
                return 67;
            case PRIMERO:
                return 68;
            case PRODUCTO:
                return 69;
            case RAIZCUADRADA:
                return 70;
            case RC:
                return 71;
            case REDONDEA:
                return 73;
            case RESTO:
                return 75;
            case RUMBO:
                return 77;
            case SEN:
                return 79;
            case SENO:
                return 80;
            case SUMA:
                return 83;
            case UL:
                return 84;
            case ULTIMO:
                return 85;
            case '(':
                return 88;
        }
        return 665;
    }

    private int yys133() {
        switch (yytok) {
            case VERDE:
            case GRIS:
            case '=':
            case ROJO:
            case AMARILLO:
            case AZUL:
            case MARRON:
            case error:
            case BLANCO:
            case NEGRO:
            case CIAN:
                return 665;
            case AZAR:
                return 31;
            case COS:
                return 36;
            case CUENTA:
                return 37;
            case DIFERENCIA:
                return 38;
            case DIVISION:
                return 39;
            case ELEGIR:
                return 41;
            case ELEMENTO:
                return 42;
            case FLOAT:
                return 44;
            case IDENTIFIER:
                return 49;
            case INTEGER:
                return 53;
            case MENOS:
                return 56;
            case POTENCIA:
                return 67;
            case PRIMERO:
                return 68;
            case PRODUCTO:
                return 69;
            case RAIZCUADRADA:
                return 70;
            case RC:
                return 71;
            case REDONDEA:
                return 73;
            case RESTO:
                return 75;
            case RUMBO:
                return 77;
            case SEN:
                return 79;
            case SENO:
                return 80;
            case SUMA:
                return 83;
            case UL:
                return 84;
            case ULTIMO:
                return 85;
            case '(':
                return 88;
            case '*':
                return 90;
            case '+':
                return 91;
            case '-':
                return 92;
            case '/':
                return 93;
        }
        return yyr155();
    }

    private int yys134() {
        switch (yytok) {
            case MARRON:
            case GRIS:
            case ROJO:
            case NEGRO:
            case BLANCO:
            case VERDE:
            case AMARILLO:
            case AZUL:
            case error:
            case '=':
            case CIAN:
                return 665;
        }
        return yyr159();
    }

    private int yys135() {
        switch (yytok) {
            case GRIS:
            case ROJO:
            case BLANCO:
            case CIAN:
            case error:
            case MARRON:
            case AMARILLO:
            case NEGRO:
            case AZUL:
            case '=':
            case VERDE:
                return 665;
            case AZAR:
                return 31;
            case CUENTA:
                return 37;
            case INTEGER:
                return 53;
            case REDONDEA:
                return 73;
            case RESTO:
                return 75;
            case '*':
                return 96;
            case '+':
                return 97;
            case '-':
                return 98;
            case '/':
                return 99;
            case DIFERENCIA:
                return 109;
            case ELEGIR:
                return 110;
            case ELEMENTO:
                return 111;
            case IDENTIFIER:
                return 112;
            case MENOS:
                return 113;
            case POTENCIA:
                return 114;
            case PRIMERO:
                return 115;
            case PRODUCTO:
                return 116;
            case SUMA:
                return 117;
            case UL:
                return 118;
            case ULTIMO:
                return 119;
            case '(':
                return 120;
        }
        return yyr153();
    }

    private int yys136() {
        switch (yytok) {
            case MARRON:
            case GRIS:
            case ROJO:
            case NEGRO:
            case BLANCO:
            case VERDE:
            case AMARILLO:
            case AZUL:
            case error:
            case '=':
            case CIAN:
                return 665;
        }
        return yyr156();
    }

    private int yys137() {
        switch (yytok) {
            case AZAR:
                return 31;
            case COS:
                return 36;
            case CUENTA:
                return 37;
            case DIFERENCIA:
                return 38;
            case DIVISION:
                return 39;
            case ELEGIR:
                return 41;
            case ELEMENTO:
                return 42;
            case FLOAT:
                return 44;
            case IDENTIFIER:
                return 49;
            case INTEGER:
                return 53;
            case MENOS:
                return 56;
            case POTENCIA:
                return 67;
            case PRIMERO:
                return 68;
            case PRODUCTO:
                return 69;
            case RAIZCUADRADA:
                return 70;
            case RC:
                return 71;
            case REDONDEA:
                return 73;
            case RESTO:
                return 75;
            case RUMBO:
                return 77;
            case SEN:
                return 79;
            case SENO:
                return 80;
            case SUMA:
                return 83;
            case UL:
                return 84;
            case ULTIMO:
                return 85;
            case '(':
                return 88;
            case '*':
                return 90;
            case '+':
                return 91;
            case '-':
                return 92;
            case '/':
                return 93;
        }
        return 665;
    }

    private int yys138() {
        switch (yytok) {
            case AZAR:
                return 31;
            case COS:
                return 36;
            case CUENTA:
                return 37;
            case DIFERENCIA:
                return 38;
            case DIVISION:
                return 39;
            case ELEGIR:
                return 41;
            case ELEMENTO:
                return 42;
            case FLOAT:
                return 44;
            case IDENTIFIER:
                return 49;
            case INTEGER:
                return 53;
            case MENOS:
                return 56;
            case POTENCIA:
                return 67;
            case PRIMERO:
                return 68;
            case PRODUCTO:
                return 69;
            case RAIZCUADRADA:
                return 70;
            case RC:
                return 71;
            case REDONDEA:
                return 73;
            case RESTO:
                return 75;
            case RUMBO:
                return 77;
            case SEN:
                return 79;
            case SENO:
                return 80;
            case SUMA:
                return 83;
            case UL:
                return 84;
            case ULTIMO:
                return 85;
            case '(':
                return 88;
            case '*':
                return 96;
            case '+':
                return 97;
            case '-':
                return 98;
            case '/':
                return 99;
        }
        return 665;
    }

    private int yys139() {
        switch (yytok) {
            case APARECETORTUGA:
                return 27;
            case AT:
                return 28;
            case AV:
                return 29;
            case AVANZA:
                return 30;
            case AZAR:
                return 31;
            case BAJALAPIZ:
                return 32;
            case BL:
                return 33;
            case BORRAPANTALLA:
                return 34;
            case CENTRO:
                return 35;
            case COS:
                return 36;
            case CUENTA:
                return 37;
            case DIFERENCIA:
                return 38;
            case DIVISION:
                return 39;
            case EJECUTA:
                return 40;
            case ELEGIR:
                return 41;
            case ELEMENTO:
                return 42;
            case ESPERA:
                return 43;
            case FLOAT:
                return 44;
            case GD:
                return 45;
            case GI:
                return 46;
            case GIRADERECHA:
                return 47;
            case GIRAIZQUIERDA:
                return 48;
            case IDENTIFIER:
                return 49;
            case IGUALES:
                return 50;
            case INC:
                return 51;
            case INIC:
                return 52;
            case INTEGER:
                return 53;
            case MAYORQUE:
                return 54;
            case MENORQUE:
                return 55;
            case MENOS:
                return 56;
            case O:
                return 57;
            case OCULTATORTUGA:
                return 58;
            case OT:
                return 59;
            case PONCL:
                return 60;
            case PONCOLORLAPIZ:
                return 61;
            case PONPOS:
                return 62;
            case PONRUMBO:
                return 63;
            case PONX:
                return 64;
            case PONXY:
                return 65;
            case PONY:
                return 66;
            case POTENCIA:
                return 67;
            case PRIMERO:
                return 68;
            case PRODUCTO:
                return 69;
            case RAIZCUADRADA:
                return 70;
            case RC:
                return 71;
            case RE:
                return 72;
            case REDONDEA:
                return 73;
            case REPITE:
                return 74;
            case RESTO:
                return 75;
            case RETROCEDE:
                return 76;
            case RUMBO:
                return 77;
            case SB:
                return 78;
            case SEN:
                return 79;
            case SENO:
                return 80;
            case SI:
                return 81;
            case SUBELAPIZ:
                return 82;
            case SUMA:
                return 83;
            case UL:
                return 84;
            case ULTIMO:
                return 85;
            case VAR:
                return 86;
            case Y:
                return 87;
            case '(':
                return 88;
        }
        return 665;
    }

    private int yys140() {
        switch (yytok) {
            case AZAR:
                return 31;
            case COS:
                return 36;
            case CUENTA:
                return 37;
            case DIFERENCIA:
                return 38;
            case DIVISION:
                return 39;
            case ELEGIR:
                return 41;
            case ELEMENTO:
                return 42;
            case FLOAT:
                return 44;
            case IDENTIFIER:
                return 49;
            case INTEGER:
                return 53;
            case MENOS:
                return 56;
            case POTENCIA:
                return 67;
            case PRIMERO:
                return 68;
            case PRODUCTO:
                return 69;
            case RAIZCUADRADA:
                return 70;
            case RC:
                return 71;
            case REDONDEA:
                return 73;
            case RESTO:
                return 75;
            case RUMBO:
                return 77;
            case SEN:
                return 79;
            case SENO:
                return 80;
            case SUMA:
                return 83;
            case UL:
                return 84;
            case ULTIMO:
                return 85;
            case '(':
                return 88;
        }
        return 665;
    }

    private int yys142() {
        switch (yytok) {
            case VERDE:
            case CIAN:
            case AMARILLO:
            case NEGRO:
            case error:
            case BLANCO:
            case '[':
            case GRIS:
            case AZUL:
            case '=':
            case '<':
            case '>':
            case ROJO:
            case MARRON:
            case ')':
                return 665;
            case '*':
                return 90;
            case '+':
                return 91;
            case '-':
                return 92;
            case '/':
                return 93;
        }
        return yyr127();
    }

    private int yys143() {
        switch (yytok) {
            case VERDE:
            case CIAN:
            case AMARILLO:
            case NEGRO:
            case error:
            case BLANCO:
            case '[':
            case GRIS:
            case AZUL:
            case '=':
            case '<':
            case '>':
            case ROJO:
            case MARRON:
            case ')':
                return 665;
            case '*':
                return 96;
            case '+':
                return 97;
            case '-':
                return 98;
            case '/':
                return 99;
        }
        return yyr126();
    }

    private int yys144() {
        switch (yytok) {
            case VERDE:
            case CIAN:
            case AMARILLO:
            case NEGRO:
            case error:
            case BLANCO:
            case '[':
            case GRIS:
            case AZUL:
            case '=':
            case '<':
            case '>':
            case ROJO:
            case MARRON:
            case ')':
                return 665;
            case '*':
                return 90;
            case '+':
                return 91;
            case '-':
                return 92;
            case '/':
                return 93;
        }
        return yyr115();
    }

    private int yys145() {
        switch (yytok) {
            case VERDE:
            case CIAN:
            case AMARILLO:
            case NEGRO:
            case error:
            case BLANCO:
            case '[':
            case GRIS:
            case AZUL:
            case '=':
            case '<':
            case '>':
            case ROJO:
            case MARRON:
            case ')':
                return 665;
            case '*':
                return 96;
            case '+':
                return 97;
            case '-':
                return 98;
            case '/':
                return 99;
        }
        return yyr114();
    }

    private int yys146() {
        switch (yytok) {
            case VERDE:
            case CIAN:
            case AMARILLO:
            case NEGRO:
            case error:
            case BLANCO:
            case '[':
            case GRIS:
            case AZUL:
            case '=':
            case '<':
            case '>':
            case ROJO:
            case MARRON:
            case ')':
                return 665;
            case '*':
                return 90;
            case '+':
                return 91;
            case '-':
                return 92;
            case '/':
                return 93;
        }
        return yyr119();
    }

    private int yys147() {
        switch (yytok) {
            case VERDE:
            case CIAN:
            case AMARILLO:
            case NEGRO:
            case error:
            case BLANCO:
            case '[':
            case GRIS:
            case AZUL:
            case '=':
            case '<':
            case '>':
            case ROJO:
            case MARRON:
            case ')':
                return 665;
            case '*':
                return 96;
            case '+':
                return 97;
            case '-':
                return 98;
            case '/':
                return 99;
        }
        return yyr118();
    }

    private int yys148() {
        switch (yytok) {
            case VERDE:
            case CIAN:
            case AMARILLO:
            case NEGRO:
            case error:
            case BLANCO:
            case '[':
            case GRIS:
            case AZUL:
            case '=':
            case '<':
            case '>':
            case ROJO:
            case MARRON:
            case ')':
                return 665;
            case '*':
                return 90;
            case '+':
                return 91;
            case '-':
                return 92;
            case '/':
                return 93;
        }
        return yyr113();
    }

    private int yys149() {
        switch (yytok) {
            case VERDE:
            case CIAN:
            case AMARILLO:
            case NEGRO:
            case error:
            case BLANCO:
            case '[':
            case GRIS:
            case AZUL:
            case '=':
            case '<':
            case '>':
            case ROJO:
            case MARRON:
            case ')':
                return 665;
            case '*':
                return 96;
            case '+':
                return 97;
            case '-':
                return 98;
            case '/':
                return 99;
        }
        return yyr112();
    }

    private int yys150() {
        switch (yytok) {
            case VERDE:
            case CIAN:
            case AMARILLO:
            case NEGRO:
            case error:
            case BLANCO:
            case '[':
            case GRIS:
            case AZUL:
            case '=':
            case '<':
            case '>':
            case ROJO:
            case MARRON:
            case ')':
                return 665;
            case '*':
                return 90;
            case '+':
                return 91;
            case '-':
                return 92;
            case '/':
                return 93;
        }
        return yyr117();
    }

    private int yys151() {
        switch (yytok) {
            case VERDE:
            case CIAN:
            case AMARILLO:
            case NEGRO:
            case error:
            case BLANCO:
            case '[':
            case GRIS:
            case AZUL:
            case '=':
            case '<':
            case '>':
            case ROJO:
            case MARRON:
            case ')':
                return 665;
            case '*':
                return 96;
            case '+':
                return 97;
            case '-':
                return 98;
            case '/':
                return 99;
        }
        return yyr116();
    }

    private int yys152() {
        switch (yytok) {
            case AZAR:
                return 31;
            case COS:
                return 36;
            case CUENTA:
                return 37;
            case DIFERENCIA:
                return 38;
            case DIVISION:
                return 39;
            case ELEGIR:
                return 41;
            case ELEMENTO:
                return 42;
            case FLOAT:
                return 44;
            case IDENTIFIER:
                return 49;
            case INTEGER:
                return 53;
            case MENOS:
                return 56;
            case POTENCIA:
                return 67;
            case PRIMERO:
                return 68;
            case PRODUCTO:
                return 69;
            case RAIZCUADRADA:
                return 70;
            case RC:
                return 71;
            case REDONDEA:
                return 73;
            case RESTO:
                return 75;
            case RUMBO:
                return 77;
            case SEN:
                return 79;
            case SENO:
                return 80;
            case SUMA:
                return 83;
            case UL:
                return 84;
            case ULTIMO:
                return 85;
            case '(':
                return 88;
            case '*':
                return 90;
            case '+':
                return 91;
            case '-':
                return 92;
            case '/':
                return 93;
        }
        return 665;
    }

    private int yys153() {
        switch (yytok) {
            case AZAR:
                return 31;
            case COS:
                return 36;
            case CUENTA:
                return 37;
            case DIFERENCIA:
                return 38;
            case DIVISION:
                return 39;
            case ELEGIR:
                return 41;
            case ELEMENTO:
                return 42;
            case FLOAT:
                return 44;
            case IDENTIFIER:
                return 49;
            case INTEGER:
                return 53;
            case MENOS:
                return 56;
            case POTENCIA:
                return 67;
            case PRIMERO:
                return 68;
            case PRODUCTO:
                return 69;
            case RAIZCUADRADA:
                return 70;
            case RC:
                return 71;
            case REDONDEA:
                return 73;
            case RESTO:
                return 75;
            case RUMBO:
                return 77;
            case SEN:
                return 79;
            case SENO:
                return 80;
            case SUMA:
                return 83;
            case UL:
                return 84;
            case ULTIMO:
                return 85;
            case '(':
                return 88;
            case '*':
                return 96;
            case '+':
                return 97;
            case '-':
                return 98;
            case '/':
                return 99;
        }
        return 665;
    }

    private int yys156() {
        switch (yytok) {
            case AZAR:
                return 31;
            case COS:
                return 36;
            case CUENTA:
                return 37;
            case DIFERENCIA:
                return 38;
            case DIVISION:
                return 39;
            case ELEGIR:
                return 41;
            case ELEMENTO:
                return 42;
            case FLOAT:
                return 44;
            case IDENTIFIER:
                return 49;
            case INTEGER:
                return 53;
            case MENOS:
                return 56;
            case POTENCIA:
                return 67;
            case PRIMERO:
                return 68;
            case PRODUCTO:
                return 69;
            case RAIZCUADRADA:
                return 70;
            case RC:
                return 71;
            case REDONDEA:
                return 73;
            case RESTO:
                return 75;
            case RUMBO:
                return 77;
            case SEN:
                return 79;
            case SENO:
                return 80;
            case SUMA:
                return 83;
            case UL:
                return 84;
            case ULTIMO:
                return 85;
            case '(':
                return 88;
            case '*':
                return 90;
            case '+':
                return 91;
            case '-':
                return 92;
            case '/':
                return 93;
        }
        return 665;
    }

    private int yys157() {
        switch (yytok) {
            case AZAR:
                return 31;
            case COS:
                return 36;
            case CUENTA:
                return 37;
            case DIFERENCIA:
                return 38;
            case DIVISION:
                return 39;
            case ELEGIR:
                return 41;
            case ELEMENTO:
                return 42;
            case FLOAT:
                return 44;
            case IDENTIFIER:
                return 49;
            case INTEGER:
                return 53;
            case MENOS:
                return 56;
            case POTENCIA:
                return 67;
            case PRIMERO:
                return 68;
            case PRODUCTO:
                return 69;
            case RAIZCUADRADA:
                return 70;
            case RC:
                return 71;
            case REDONDEA:
                return 73;
            case RESTO:
                return 75;
            case RUMBO:
                return 77;
            case SEN:
                return 79;
            case SENO:
                return 80;
            case SUMA:
                return 83;
            case UL:
                return 84;
            case ULTIMO:
                return 85;
            case '(':
                return 88;
            case '*':
                return 96;
            case '+':
                return 97;
            case '-':
                return 98;
            case '/':
                return 99;
        }
        return 665;
    }

    private int yys158() {
        switch (yytok) {
            case AZAR:
                return 31;
            case COS:
                return 36;
            case CUENTA:
                return 37;
            case DIFERENCIA:
                return 38;
            case DIVISION:
                return 39;
            case ELEGIR:
                return 41;
            case ELEMENTO:
                return 42;
            case FLOAT:
                return 44;
            case IDENTIFIER:
                return 49;
            case INTEGER:
                return 53;
            case MENOS:
                return 56;
            case POTENCIA:
                return 67;
            case PRIMERO:
                return 68;
            case PRODUCTO:
                return 69;
            case RAIZCUADRADA:
                return 70;
            case RC:
                return 71;
            case REDONDEA:
                return 73;
            case RESTO:
                return 75;
            case RUMBO:
                return 77;
            case SEN:
                return 79;
            case SENO:
                return 80;
            case SUMA:
                return 83;
            case UL:
                return 84;
            case ULTIMO:
                return 85;
            case '(':
                return 88;
            case '*':
                return 90;
            case '+':
                return 91;
            case '-':
                return 92;
            case '/':
                return 93;
        }
        return 665;
    }

    private int yys159() {
        switch (yytok) {
            case AZAR:
                return 31;
            case COS:
                return 36;
            case CUENTA:
                return 37;
            case DIFERENCIA:
                return 38;
            case DIVISION:
                return 39;
            case ELEGIR:
                return 41;
            case ELEMENTO:
                return 42;
            case FLOAT:
                return 44;
            case IDENTIFIER:
                return 49;
            case INTEGER:
                return 53;
            case MENOS:
                return 56;
            case POTENCIA:
                return 67;
            case PRIMERO:
                return 68;
            case PRODUCTO:
                return 69;
            case RAIZCUADRADA:
                return 70;
            case RC:
                return 71;
            case REDONDEA:
                return 73;
            case RESTO:
                return 75;
            case RUMBO:
                return 77;
            case SEN:
                return 79;
            case SENO:
                return 80;
            case SUMA:
                return 83;
            case UL:
                return 84;
            case ULTIMO:
                return 85;
            case '(':
                return 88;
            case '*':
                return 96;
            case '+':
                return 97;
            case '-':
                return 98;
            case '/':
                return 99;
        }
        return 665;
    }

    private int yys160() {
        switch (yytok) {
            case MARRON:
            case '=':
            case ROJO:
            case NEGRO:
            case AMARILLO:
            case GRIS:
            case AZUL:
            case CIAN:
            case BLANCO:
            case error:
            case VERDE:
                return 665;
            case '*':
                return 90;
            case '+':
                return 91;
            case '-':
                return 92;
            case '/':
                return 93;
        }
        return yyr99();
    }

    private int yys161() {
        switch (yytok) {
            case MARRON:
            case '=':
            case ROJO:
            case NEGRO:
            case AMARILLO:
            case GRIS:
            case AZUL:
            case CIAN:
            case BLANCO:
            case error:
            case VERDE:
                return 665;
            case '*':
                return 96;
            case '+':
                return 97;
            case '-':
                return 98;
            case '/':
                return 99;
        }
        return yyr96();
    }

    private int yys162() {
        switch (yytok) {
            case AZAR:
                return 31;
            case COS:
                return 36;
            case CUENTA:
                return 37;
            case DIFERENCIA:
                return 38;
            case DIVISION:
                return 39;
            case ELEGIR:
                return 41;
            case ELEMENTO:
                return 42;
            case FLOAT:
                return 44;
            case IDENTIFIER:
                return 49;
            case IGUALES:
                return 50;
            case INTEGER:
                return 53;
            case MAYORQUE:
                return 54;
            case MENORQUE:
                return 55;
            case MENOS:
                return 56;
            case O:
                return 57;
            case POTENCIA:
                return 67;
            case PRIMERO:
                return 68;
            case PRODUCTO:
                return 69;
            case RAIZCUADRADA:
                return 70;
            case RC:
                return 71;
            case REDONDEA:
                return 73;
            case RESTO:
                return 75;
            case RUMBO:
                return 77;
            case SEN:
                return 79;
            case SENO:
                return 80;
            case SUMA:
                return 83;
            case UL:
                return 84;
            case ULTIMO:
                return 85;
            case Y:
                return 87;
            case '(':
                return 88;
        }
        return 665;
    }

    private int yys163() {
        switch (yytok) {
            case error:
            case CIAN:
            case AZUL:
            case '+':
            case '*':
            case GRIS:
            case VERDE:
            case ROJO:
            case BLANCO:
            case NEGRO:
            case '=':
            case '/':
            case MARRON:
            case '>':
            case '-':
            case ')':
            case '<':
            case AMARILLO:
                return 665;
        }
        return yyr55();
    }

    private int yys164() {
        switch (yytok) {
            case VERDE:
            case CIAN:
            case ROJO:
            case NEGRO:
            case '+':
            case BLANCO:
            case '*':
            case AMARILLO:
            case AZUL:
            case '=':
            case '<':
            case '>':
            case ')':
            case MARRON:
            case '/':
            case error:
            case '-':
            case '[':
            case GRIS:
                return 665;
        }
        return yyr125();
    }

    private int yys165() {
        switch (yytok) {
            case VERDE:
            case CIAN:
            case ROJO:
            case NEGRO:
            case '+':
            case BLANCO:
            case '*':
            case AMARILLO:
            case AZUL:
            case '=':
            case '<':
            case '>':
            case ')':
            case MARRON:
            case '/':
            case error:
            case '-':
            case '[':
            case GRIS:
                return 665;
        }
        return yyr79();
    }

    private int yys166() {
        switch (yytok) {
            case VERDE:
            case CIAN:
            case ROJO:
            case NEGRO:
            case '+':
            case BLANCO:
            case '*':
            case AMARILLO:
            case AZUL:
            case '=':
            case '<':
            case '>':
            case ')':
            case MARRON:
            case '/':
            case error:
            case '-':
            case '[':
            case GRIS:
                return 665;
        }
        return yyr75();
    }

    private int yys167() {
        switch (yytok) {
            case VERDE:
            case CIAN:
            case ROJO:
            case NEGRO:
            case '+':
            case BLANCO:
            case '*':
            case AMARILLO:
            case AZUL:
            case '=':
            case '<':
            case '>':
            case ')':
            case MARRON:
            case '/':
            case error:
            case '-':
            case '[':
            case GRIS:
                return 665;
        }
        return yyr74();
    }

    private int yys168() {
        switch (yytok) {
            case VERDE:
            case CIAN:
            case ROJO:
            case NEGRO:
            case '+':
            case BLANCO:
            case '*':
            case AMARILLO:
            case AZUL:
            case '=':
            case '<':
            case '>':
            case ')':
            case MARRON:
            case '/':
            case error:
            case '-':
            case '[':
            case GRIS:
                return 665;
        }
        return yyr77();
    }

    private int yys169() {
        switch (yytok) {
            case VERDE:
            case CIAN:
            case ROJO:
            case NEGRO:
            case '+':
            case BLANCO:
            case '*':
            case AMARILLO:
            case AZUL:
            case '=':
            case '<':
            case '>':
            case ')':
            case MARRON:
            case '/':
            case error:
            case '-':
            case '[':
            case GRIS:
                return 665;
        }
        return yyr78();
    }

    private int yys170() {
        switch (yytok) {
            case VERDE:
            case CIAN:
            case ROJO:
            case NEGRO:
            case '+':
            case BLANCO:
            case '*':
            case AMARILLO:
            case AZUL:
            case '=':
            case '<':
            case '>':
            case ')':
            case MARRON:
            case '/':
            case error:
            case '-':
            case '[':
            case GRIS:
                return 665;
        }
        return yyr76();
    }

    private int yys171() {
        switch (yytok) {
            case VERDE:
            case CIAN:
            case ROJO:
            case NEGRO:
            case '+':
            case BLANCO:
            case '*':
            case AMARILLO:
            case AZUL:
            case '=':
            case '<':
            case '>':
            case ')':
            case MARRON:
            case '/':
            case error:
            case '-':
            case '[':
            case GRIS:
                return 665;
        }
        return yyr80();
    }

    private int yys172() {
        switch (yytok) {
            case VERDE:
            case CIAN:
            case ROJO:
            case NEGRO:
            case '+':
            case BLANCO:
            case '*':
            case AMARILLO:
            case AZUL:
            case '=':
            case '<':
            case '>':
            case ')':
            case MARRON:
            case '/':
            case error:
            case '-':
            case '[':
            case GRIS:
                return 665;
        }
        return yyr81();
    }

    private int yys173() {
        switch (yytok) {
            case VERDE:
            case CIAN:
            case ROJO:
            case NEGRO:
            case '+':
            case BLANCO:
            case '*':
            case AMARILLO:
            case AZUL:
            case '=':
            case '<':
            case '>':
            case ')':
            case MARRON:
            case '/':
            case error:
            case '-':
            case '[':
            case GRIS:
                return 665;
        }
        return yyr82();
    }

    private int yys174() {
        switch (yytok) {
            case VERDE:
            case CIAN:
            case ROJO:
            case NEGRO:
            case '+':
            case BLANCO:
            case '*':
            case AMARILLO:
            case AZUL:
            case '=':
            case '<':
            case '>':
            case ')':
            case MARRON:
            case '/':
            case error:
            case '-':
            case '[':
            case GRIS:
                return 665;
        }
        return yyr124();
    }

    private int yys175() {
        switch (yytok) {
            case AZAR:
                return 31;
            case CUENTA:
                return 37;
            case INTEGER:
                return 53;
            case REDONDEA:
                return 73;
            case RESTO:
                return 75;
            case DIFERENCIA:
                return 109;
            case ELEGIR:
                return 110;
            case ELEMENTO:
                return 111;
            case IDENTIFIER:
                return 112;
            case MENOS:
                return 113;
            case POTENCIA:
                return 114;
            case PRIMERO:
                return 115;
            case PRODUCTO:
                return 116;
            case SUMA:
                return 117;
            case UL:
                return 118;
            case ULTIMO:
                return 119;
            case '(':
                return 120;
        }
        return 665;
    }

    private int yys176() {
        switch (yytok) {
            case VERDE:
            case CIAN:
            case AMARILLO:
            case NEGRO:
            case error:
            case BLANCO:
            case '[':
            case GRIS:
            case AZUL:
            case '=':
            case '<':
            case '>':
            case ROJO:
            case MARRON:
            case ')':
                return 665;
            case '*':
                return 90;
            case '+':
                return 91;
            case '-':
                return 92;
            case '/':
                return 93;
        }
        return yyr121();
    }

    private int yys177() {
        switch (yytok) {
            case VERDE:
            case CIAN:
            case AMARILLO:
            case NEGRO:
            case error:
            case BLANCO:
            case '[':
            case GRIS:
            case AZUL:
            case '=':
            case '<':
            case '>':
            case ROJO:
            case MARRON:
            case ')':
                return 665;
            case '*':
                return 96;
            case '+':
                return 97;
            case '-':
                return 98;
            case '/':
                return 99;
        }
        return yyr120();
    }

    private int yys178() {
        switch (yytok) {
            case AMARILLO:
            case CIAN:
            case '[':
            case NEGRO:
            case error:
            case BLANCO:
            case GRIS:
            case VERDE:
            case AZUL:
            case '=':
            case '<':
            case '>':
            case ')':
            case MARRON:
            case '/':
            case ROJO:
                return 665;
            case '*':
                return 235;
            case '+':
                return 236;
            case '-':
                return 237;
        }
        return yyr122();
    }

    private int yys179() {
        switch (yytok) {
            case AZAR:
                return 31;
            case CUENTA:
                return 37;
            case INTEGER:
                return 53;
            case REDONDEA:
                return 73;
            case RESTO:
                return 75;
            case DIFERENCIA:
                return 109;
            case ELEGIR:
                return 110;
            case ELEMENTO:
                return 111;
            case IDENTIFIER:
                return 112;
            case MENOS:
                return 113;
            case POTENCIA:
                return 114;
            case PRIMERO:
                return 115;
            case PRODUCTO:
                return 116;
            case SUMA:
                return 117;
            case UL:
                return 118;
            case ULTIMO:
                return 119;
            case '(':
                return 120;
            case '*':
                return 235;
            case '+':
                return 236;
            case '-':
                return 237;
        }
        return 665;
    }

    private int yys180() {
        switch (yytok) {
            case AMARILLO:
            case CIAN:
            case '[':
            case NEGRO:
            case error:
            case BLANCO:
            case GRIS:
            case VERDE:
            case AZUL:
            case '=':
            case '<':
            case '>':
            case ')':
            case MARRON:
            case '/':
            case ROJO:
                return 665;
            case '*':
                return 235;
            case '+':
                return 236;
            case '-':
                return 237;
        }
        return yyr123();
    }

    private int yys181() {
        switch (yytok) {
            case AZAR:
                return 31;
            case COS:
                return 36;
            case CUENTA:
                return 37;
            case DIFERENCIA:
                return 38;
            case DIVISION:
                return 39;
            case ELEGIR:
                return 41;
            case ELEMENTO:
                return 42;
            case FLOAT:
                return 44;
            case IDENTIFIER:
                return 49;
            case INTEGER:
                return 53;
            case MENOS:
                return 56;
            case POTENCIA:
                return 67;
            case PRIMERO:
                return 68;
            case PRODUCTO:
                return 69;
            case RAIZCUADRADA:
                return 70;
            case RC:
                return 71;
            case REDONDEA:
                return 73;
            case RESTO:
                return 75;
            case RUMBO:
                return 77;
            case SEN:
                return 79;
            case SENO:
                return 80;
            case SUMA:
                return 83;
            case UL:
                return 84;
            case ULTIMO:
                return 85;
            case '(':
                return 88;
            case '*':
                return 90;
            case '+':
                return 91;
            case '-':
                return 92;
            case '/':
                return 93;
        }
        return 665;
    }

    private int yys182() {
        switch (yytok) {
            case AZAR:
                return 31;
            case COS:
                return 36;
            case CUENTA:
                return 37;
            case DIFERENCIA:
                return 38;
            case DIVISION:
                return 39;
            case ELEGIR:
                return 41;
            case ELEMENTO:
                return 42;
            case FLOAT:
                return 44;
            case IDENTIFIER:
                return 49;
            case INTEGER:
                return 53;
            case MENOS:
                return 56;
            case POTENCIA:
                return 67;
            case PRIMERO:
                return 68;
            case PRODUCTO:
                return 69;
            case RAIZCUADRADA:
                return 70;
            case RC:
                return 71;
            case REDONDEA:
                return 73;
            case RESTO:
                return 75;
            case RUMBO:
                return 77;
            case SEN:
                return 79;
            case SENO:
                return 80;
            case SUMA:
                return 83;
            case UL:
                return 84;
            case ULTIMO:
                return 85;
            case '(':
                return 88;
            case '*':
                return 96;
            case '+':
                return 97;
            case '-':
                return 98;
            case '/':
                return 99;
        }
        return 665;
    }

    private int yys183() {
        switch (yytok) {
            case AZAR:
                return 31;
            case COS:
                return 36;
            case CUENTA:
                return 37;
            case DIFERENCIA:
                return 38;
            case DIVISION:
                return 39;
            case ELEGIR:
                return 41;
            case ELEMENTO:
                return 42;
            case FLOAT:
                return 44;
            case IDENTIFIER:
                return 49;
            case INTEGER:
                return 53;
            case MENOS:
                return 56;
            case POTENCIA:
                return 67;
            case PRIMERO:
                return 68;
            case PRODUCTO:
                return 69;
            case RAIZCUADRADA:
                return 70;
            case RC:
                return 71;
            case REDONDEA:
                return 73;
            case RESTO:
                return 75;
            case RUMBO:
                return 77;
            case SEN:
                return 79;
            case SENO:
                return 80;
            case SUMA:
                return 83;
            case UL:
                return 84;
            case ULTIMO:
                return 85;
            case '(':
                return 88;
        }
        return 665;
    }

    private int yys184() {
        switch (yytok) {
            case MARRON:
            case GRIS:
            case ROJO:
            case NEGRO:
            case BLANCO:
            case VERDE:
            case AMARILLO:
            case AZUL:
            case error:
            case '=':
            case CIAN:
                return 665;
        }
        return yyr160();
    }

    private int yys185() {
        switch (yytok) {
            case MARRON:
            case GRIS:
            case ROJO:
            case NEGRO:
            case BLANCO:
            case VERDE:
            case AMARILLO:
            case AZUL:
            case error:
            case '=':
            case CIAN:
                return 665;
        }
        return yyr157();
    }

    private int yys186() {
        switch (yytok) {
            case MARRON:
            case '=':
            case ROJO:
            case NEGRO:
            case AMARILLO:
            case GRIS:
            case AZUL:
            case CIAN:
            case BLANCO:
            case error:
            case VERDE:
                return 665;
            case '*':
                return 90;
            case '+':
                return 91;
            case '-':
                return 92;
            case '/':
                return 93;
        }
        return yyr101();
    }

    private int yys187() {
        switch (yytok) {
            case MARRON:
            case '=':
            case ROJO:
            case NEGRO:
            case AMARILLO:
            case GRIS:
            case AZUL:
            case CIAN:
            case BLANCO:
            case error:
            case VERDE:
                return 665;
            case '*':
                return 96;
            case '+':
                return 97;
            case '-':
                return 98;
            case '/':
                return 99;
        }
        return yyr100();
    }

    private int yys188() {
        switch (yytok) {
            case MARRON:
            case '=':
            case ROJO:
            case NEGRO:
            case AMARILLO:
            case GRIS:
            case AZUL:
            case CIAN:
            case BLANCO:
            case error:
            case VERDE:
                return 665;
            case '*':
                return 90;
            case '+':
                return 91;
            case '-':
                return 92;
            case '/':
                return 93;
        }
        return yyr103();
    }

    private int yys189() {
        switch (yytok) {
            case MARRON:
            case '=':
            case ROJO:
            case NEGRO:
            case AMARILLO:
            case GRIS:
            case AZUL:
            case CIAN:
            case BLANCO:
            case error:
            case VERDE:
                return 665;
            case '*':
                return 96;
            case '+':
                return 97;
            case '-':
                return 98;
            case '/':
                return 99;
        }
        return yyr102();
    }

    private int yys190() {
        switch (yytok) {
            case AMARILLO:
            case CIAN:
            case '[':
            case NEGRO:
            case error:
            case BLANCO:
            case GRIS:
            case VERDE:
            case AZUL:
            case '=':
            case '<':
            case '>':
            case ')':
            case MARRON:
            case '/':
            case ROJO:
                return 665;
            case '*':
                return 235;
            case '+':
                return 236;
            case '-':
                return 237;
        }
        return yyr111();
    }

    private int yys191() {
        switch (yytok) {
            case MARRON:
            case '=':
            case ROJO:
            case NEGRO:
            case AMARILLO:
            case GRIS:
            case AZUL:
            case CIAN:
            case BLANCO:
            case error:
            case VERDE:
                return 665;
            case '*':
                return 90;
            case '+':
                return 91;
            case '-':
                return 92;
            case '/':
                return 93;
        }
        return yyr94();
    }

    private int yys194() {
        switch (yytok) {
            case AZAR:
                return 31;
            case CUENTA:
                return 37;
            case INTEGER:
                return 53;
            case REDONDEA:
                return 73;
            case RESTO:
                return 75;
            case DIFERENCIA:
                return 109;
            case ELEGIR:
                return 110;
            case ELEMENTO:
                return 111;
            case IDENTIFIER:
                return 112;
            case MENOS:
                return 113;
            case POTENCIA:
                return 114;
            case PRIMERO:
                return 115;
            case PRODUCTO:
                return 116;
            case SUMA:
                return 117;
            case UL:
                return 118;
            case ULTIMO:
                return 119;
            case '(':
                return 120;
            case '*':
                return 235;
            case '+':
                return 236;
            case '-':
                return 237;
        }
        return 665;
    }

    private int yys195() {
        switch (yytok) {
            case AMARILLO:
            case CIAN:
            case '[':
            case NEGRO:
            case error:
            case BLANCO:
            case GRIS:
            case VERDE:
            case AZUL:
            case '=':
            case '<':
            case '>':
            case ')':
            case MARRON:
            case '/':
            case ROJO:
                return 665;
            case '*':
                return 235;
            case '+':
                return 236;
            case '-':
                return 237;
        }
        return yyr110();
    }

    private int yys196() {
        switch (yytok) {
            case MARRON:
            case '=':
            case ROJO:
            case NEGRO:
            case AMARILLO:
            case GRIS:
            case AZUL:
            case CIAN:
            case BLANCO:
            case error:
            case VERDE:
                return 665;
            case '*':
                return 90;
            case '+':
                return 91;
            case '-':
                return 92;
            case '/':
                return 93;
        }
        return yyr107();
    }

    private int yys197() {
        switch (yytok) {
            case MARRON:
            case '=':
            case ROJO:
            case NEGRO:
            case AMARILLO:
            case GRIS:
            case AZUL:
            case CIAN:
            case BLANCO:
            case error:
            case VERDE:
                return 665;
            case '*':
                return 96;
            case '+':
                return 97;
            case '-':
                return 98;
            case '/':
                return 99;
        }
        return yyr106();
    }

    private int yys198() {
        switch (yytok) {
            case MARRON:
            case '=':
            case ROJO:
            case NEGRO:
            case AMARILLO:
            case GRIS:
            case AZUL:
            case CIAN:
            case BLANCO:
            case error:
            case VERDE:
                return 665;
            case '*':
                return 90;
            case '+':
                return 91;
            case '-':
                return 92;
            case '/':
                return 93;
        }
        return yyr105();
    }

    private int yys199() {
        switch (yytok) {
            case MARRON:
            case '=':
            case ROJO:
            case NEGRO:
            case AMARILLO:
            case GRIS:
            case AZUL:
            case CIAN:
            case BLANCO:
            case error:
            case VERDE:
                return 665;
            case '*':
                return 96;
            case '+':
                return 97;
            case '-':
                return 98;
            case '/':
                return 99;
        }
        return yyr104();
    }

    private int yys201() {
        switch (yytok) {
            case MARRON:
            case GRIS:
            case ROJO:
            case NEGRO:
            case BLANCO:
            case VERDE:
            case AMARILLO:
            case AZUL:
            case error:
            case '=':
            case CIAN:
                return 665;
        }
        return yyr161();
    }

    private int yys202() {
        switch (yytok) {
            case MARRON:
            case GRIS:
            case ROJO:
            case NEGRO:
            case BLANCO:
            case VERDE:
            case AMARILLO:
            case AZUL:
            case error:
            case '=':
            case CIAN:
                return 665;
        }
        return yyr158();
    }

    private int yys203() {
        switch (yytok) {
            case AZAR:
                return 31;
            case COS:
                return 36;
            case CUENTA:
                return 37;
            case DIFERENCIA:
                return 38;
            case DIVISION:
                return 39;
            case ELEGIR:
                return 41;
            case ELEMENTO:
                return 42;
            case FLOAT:
                return 44;
            case IDENTIFIER:
                return 49;
            case INTEGER:
                return 53;
            case MENOS:
                return 56;
            case POTENCIA:
                return 67;
            case PRIMERO:
                return 68;
            case PRODUCTO:
                return 69;
            case RAIZCUADRADA:
                return 70;
            case RC:
                return 71;
            case REDONDEA:
                return 73;
            case RESTO:
                return 75;
            case RUMBO:
                return 77;
            case SEN:
                return 79;
            case SENO:
                return 80;
            case SUMA:
                return 83;
            case UL:
                return 84;
            case ULTIMO:
                return 85;
            case '(':
                return 88;
        }
        return 665;
    }

    private int yys204() {
        switch (yytok) {
            case AZAR:
                return 31;
            case COS:
                return 36;
            case CUENTA:
                return 37;
            case DIFERENCIA:
                return 38;
            case DIVISION:
                return 39;
            case ELEGIR:
                return 41;
            case ELEMENTO:
                return 42;
            case FLOAT:
                return 44;
            case IDENTIFIER:
                return 49;
            case INTEGER:
                return 53;
            case MENOS:
                return 56;
            case POTENCIA:
                return 67;
            case PRIMERO:
                return 68;
            case PRODUCTO:
                return 69;
            case RAIZCUADRADA:
                return 70;
            case RC:
                return 71;
            case REDONDEA:
                return 73;
            case RESTO:
                return 75;
            case RUMBO:
                return 77;
            case SEN:
                return 79;
            case SENO:
                return 80;
            case SUMA:
                return 83;
            case UL:
                return 84;
            case ULTIMO:
                return 85;
            case '(':
                return 88;
        }
        return 665;
    }

    private int yys205() {
        switch (yytok) {
            case AZUL:
            case CIAN:
            case ROJO:
            case VERDE:
            case '+':
            case GRIS:
            case '*':
            case AMARILLO:
            case NEGRO:
            case BLANCO:
            case '<':
            case '>':
            case ')':
            case MARRON:
            case '/':
            case error:
            case '-':
            case '[':
                return 665;
            case '=':
                return 290;
        }
        return yyr44();
    }

    private int yys206() {
        switch (yytok) {
            case AZAR:
                return 31;
            case COS:
                return 36;
            case CUENTA:
                return 37;
            case DIFERENCIA:
                return 38;
            case DIVISION:
                return 39;
            case ELEGIR:
                return 41;
            case ELEMENTO:
                return 42;
            case FLOAT:
                return 44;
            case IDENTIFIER:
                return 49;
            case IGUALES:
                return 50;
            case INTEGER:
                return 53;
            case MAYORQUE:
                return 54;
            case MENORQUE:
                return 55;
            case MENOS:
                return 56;
            case O:
                return 57;
            case POTENCIA:
                return 67;
            case PRIMERO:
                return 68;
            case PRODUCTO:
                return 69;
            case RAIZCUADRADA:
                return 70;
            case RC:
                return 71;
            case REDONDEA:
                return 73;
            case RESTO:
                return 75;
            case RUMBO:
                return 77;
            case SEN:
                return 79;
            case SENO:
                return 80;
            case SUMA:
                return 83;
            case UL:
                return 84;
            case ULTIMO:
                return 85;
            case Y:
                return 87;
            case '(':
                return 88;
        }
        return 665;
    }

    private int yys211() {
        switch (yytok) {
            case MARRON:
            case GRIS:
            case ROJO:
            case NEGRO:
            case BLANCO:
            case VERDE:
            case AMARILLO:
            case AZUL:
            case error:
            case '=':
            case CIAN:
                return 665;
        }
        return yyr68();
    }

    private int yys212() {
        switch (yytok) {
            case MARRON:
            case GRIS:
            case ROJO:
            case NEGRO:
            case BLANCO:
            case VERDE:
            case AMARILLO:
            case AZUL:
            case error:
            case '=':
            case CIAN:
                return 665;
        }
        return yyr66();
    }

    private int yys213() {
        switch (yytok) {
            case AMARILLO:
            case NEGRO:
            case ROJO:
            case MARRON:
            case CIAN:
            case AZUL:
            case VERDE:
            case GRIS:
            case error:
            case '=':
            case BLANCO:
                return 665;
            case '*':
                return 90;
            case '/':
                return 93;
        }
        return yyr62();
    }

    private int yys214() {
        switch (yytok) {
            case AMARILLO:
            case NEGRO:
            case ROJO:
            case MARRON:
            case CIAN:
            case AZUL:
            case VERDE:
            case GRIS:
            case error:
            case '=':
            case BLANCO:
                return 665;
            case '*':
                return 96;
            case '/':
                return 99;
        }
        return yyr60();
    }

    private int yys215() {
        switch (yytok) {
            case AMARILLO:
            case NEGRO:
            case ROJO:
            case MARRON:
            case CIAN:
            case AZUL:
            case VERDE:
            case GRIS:
            case error:
            case '=':
            case BLANCO:
                return 665;
            case '*':
                return 90;
            case '/':
                return 93;
        }
        return yyr65();
    }

    private int yys216() {
        switch (yytok) {
            case AMARILLO:
            case NEGRO:
            case ROJO:
            case MARRON:
            case CIAN:
            case AZUL:
            case VERDE:
            case GRIS:
            case error:
            case '=':
            case BLANCO:
                return 665;
            case '*':
                return 96;
            case '/':
                return 99;
        }
        return yyr63();
    }

    private int yys217() {
        switch (yytok) {
            case MARRON:
            case GRIS:
            case ROJO:
            case NEGRO:
            case BLANCO:
            case VERDE:
            case AMARILLO:
            case AZUL:
            case error:
            case '=':
            case CIAN:
                return 665;
        }
        return yyr72();
    }

    private int yys218() {
        switch (yytok) {
            case MARRON:
            case GRIS:
            case ROJO:
            case NEGRO:
            case BLANCO:
            case VERDE:
            case AMARILLO:
            case AZUL:
            case error:
            case '=':
            case CIAN:
                return 665;
        }
        return yyr70();
    }

    private int yys219() {
        switch (yytok) {
            case AZUL:
            case CIAN:
            case error:
            case NEGRO:
            case ')':
            case GRIS:
            case ROJO:
            case AMARILLO:
            case BLANCO:
            case '<':
            case '=':
            case VERDE:
            case MARRON:
            case '>':
                return 665;
            case '*':
                return 90;
            case '+':
                return 91;
            case '-':
                return 92;
            case '/':
                return 93;
        }
        return yyr50();
    }

    private int yys220() {
        switch (yytok) {
            case AZUL:
            case CIAN:
            case error:
            case NEGRO:
            case ')':
            case GRIS:
            case ROJO:
            case AMARILLO:
            case BLANCO:
            case '<':
            case '=':
            case VERDE:
            case MARRON:
            case '>':
                return 665;
            case '*':
                return 96;
            case '+':
                return 97;
            case '-':
                return 98;
            case '/':
                return 99;
        }
        return yyr48();
    }

    private int yys221() {
        switch (yytok) {
            case AZUL:
            case CIAN:
            case error:
            case NEGRO:
            case ')':
            case GRIS:
            case ROJO:
            case AMARILLO:
            case BLANCO:
            case '<':
            case '=':
            case VERDE:
            case MARRON:
            case '>':
                return 665;
            case '*':
                return 90;
            case '+':
                return 91;
            case '-':
                return 92;
            case '/':
                return 93;
        }
        return yyr54();
    }

    private int yys222() {
        switch (yytok) {
            case AZUL:
            case CIAN:
            case error:
            case NEGRO:
            case ')':
            case GRIS:
            case ROJO:
            case AMARILLO:
            case BLANCO:
            case '<':
            case '=':
            case VERDE:
            case MARRON:
            case '>':
                return 665;
            case '*':
                return 96;
            case '+':
                return 97;
            case '-':
                return 98;
            case '/':
                return 99;
        }
        return yyr52();
    }

    private int yys223() {
        switch (yytok) {
            case MARRON:
            case GRIS:
            case ROJO:
            case NEGRO:
            case BLANCO:
            case VERDE:
            case AMARILLO:
            case AZUL:
            case error:
            case '=':
            case CIAN:
                return 665;
        }
        return yyr67();
    }

    private int yys224() {
        switch (yytok) {
            case MARRON:
            case GRIS:
            case ROJO:
            case NEGRO:
            case BLANCO:
            case VERDE:
            case AMARILLO:
            case AZUL:
            case error:
            case '=':
            case CIAN:
                return 665;
        }
        return yyr58();
    }

    private int yys225() {
        switch (yytok) {
            case AMARILLO:
            case NEGRO:
            case ROJO:
            case MARRON:
            case CIAN:
            case AZUL:
            case VERDE:
            case GRIS:
            case error:
            case '=':
            case BLANCO:
                return 665;
            case '*':
                return 90;
            case '/':
                return 93;
        }
        return yyr61();
    }

    private int yys226() {
        switch (yytok) {
            case AMARILLO:
            case NEGRO:
            case ROJO:
            case MARRON:
            case CIAN:
            case AZUL:
            case VERDE:
            case GRIS:
            case error:
            case '=':
            case BLANCO:
                return 665;
            case '*':
                return 96;
            case '/':
                return 99;
        }
        return yyr56();
    }

    private int yys227() {
        switch (yytok) {
            case AMARILLO:
            case NEGRO:
            case ROJO:
            case MARRON:
            case CIAN:
            case AZUL:
            case VERDE:
            case GRIS:
            case error:
            case '=':
            case BLANCO:
                return 665;
            case '*':
                return 90;
            case '/':
                return 93;
        }
        return yyr64();
    }

    private int yys228() {
        switch (yytok) {
            case AMARILLO:
            case NEGRO:
            case ROJO:
            case MARRON:
            case CIAN:
            case AZUL:
            case VERDE:
            case GRIS:
            case error:
            case '=':
            case BLANCO:
                return 665;
            case '*':
                return 96;
            case '/':
                return 99;
        }
        return yyr57();
    }

    private int yys229() {
        switch (yytok) {
            case MARRON:
            case GRIS:
            case ROJO:
            case NEGRO:
            case BLANCO:
            case VERDE:
            case AMARILLO:
            case AZUL:
            case error:
            case '=':
            case CIAN:
                return 665;
        }
        return yyr71();
    }

    private int yys230() {
        switch (yytok) {
            case MARRON:
            case GRIS:
            case ROJO:
            case NEGRO:
            case BLANCO:
            case VERDE:
            case AMARILLO:
            case AZUL:
            case error:
            case '=':
            case CIAN:
                return 665;
        }
        return yyr69();
    }

    private int yys231() {
        switch (yytok) {
            case AZUL:
            case CIAN:
            case error:
            case NEGRO:
            case ')':
            case GRIS:
            case ROJO:
            case AMARILLO:
            case BLANCO:
            case '<':
            case '=':
            case VERDE:
            case MARRON:
            case '>':
                return 665;
            case '*':
                return 90;
            case '+':
                return 91;
            case '-':
                return 92;
            case '/':
                return 93;
        }
        return yyr49();
    }

    private int yys232() {
        switch (yytok) {
            case AZUL:
            case CIAN:
            case error:
            case NEGRO:
            case ')':
            case GRIS:
            case ROJO:
            case AMARILLO:
            case BLANCO:
            case '<':
            case '=':
            case VERDE:
            case MARRON:
            case '>':
                return 665;
            case '*':
                return 96;
            case '+':
                return 97;
            case '-':
                return 98;
            case '/':
                return 99;
        }
        return yyr47();
    }

    private int yys233() {
        switch (yytok) {
            case AZUL:
            case CIAN:
            case error:
            case NEGRO:
            case ')':
            case GRIS:
            case ROJO:
            case AMARILLO:
            case BLANCO:
            case '<':
            case '=':
            case VERDE:
            case MARRON:
            case '>':
                return 665;
            case '*':
                return 90;
            case '+':
                return 91;
            case '-':
                return 92;
            case '/':
                return 93;
        }
        return yyr53();
    }

    private int yys234() {
        switch (yytok) {
            case AZUL:
            case CIAN:
            case error:
            case NEGRO:
            case ')':
            case GRIS:
            case ROJO:
            case AMARILLO:
            case BLANCO:
            case '<':
            case '=':
            case VERDE:
            case MARRON:
            case '>':
                return 665;
            case '*':
                return 96;
            case '+':
                return 97;
            case '-':
                return 98;
            case '/':
                return 99;
        }
        return yyr51();
    }

    private int yys235() {
        switch (yytok) {
            case AZAR:
                return 31;
            case CUENTA:
                return 37;
            case INTEGER:
                return 53;
            case REDONDEA:
                return 73;
            case RESTO:
                return 75;
            case DIFERENCIA:
                return 109;
            case ELEGIR:
                return 110;
            case ELEMENTO:
                return 111;
            case IDENTIFIER:
                return 112;
            case MENOS:
                return 113;
            case POTENCIA:
                return 114;
            case PRIMERO:
                return 115;
            case PRODUCTO:
                return 116;
            case SUMA:
                return 117;
            case UL:
                return 118;
            case ULTIMO:
                return 119;
            case '(':
                return 120;
        }
        return 665;
    }

    private int yys236() {
        switch (yytok) {
            case AZAR:
                return 31;
            case CUENTA:
                return 37;
            case INTEGER:
                return 53;
            case REDONDEA:
                return 73;
            case RESTO:
                return 75;
            case DIFERENCIA:
                return 109;
            case ELEGIR:
                return 110;
            case ELEMENTO:
                return 111;
            case IDENTIFIER:
                return 112;
            case MENOS:
                return 113;
            case POTENCIA:
                return 114;
            case PRIMERO:
                return 115;
            case PRODUCTO:
                return 116;
            case SUMA:
                return 117;
            case UL:
                return 118;
            case ULTIMO:
                return 119;
            case '(':
                return 120;
        }
        return 665;
    }

    private int yys237() {
        switch (yytok) {
            case AZAR:
                return 31;
            case CUENTA:
                return 37;
            case INTEGER:
                return 53;
            case REDONDEA:
                return 73;
            case RESTO:
                return 75;
            case DIFERENCIA:
                return 109;
            case ELEGIR:
                return 110;
            case ELEMENTO:
                return 111;
            case IDENTIFIER:
                return 112;
            case MENOS:
                return 113;
            case POTENCIA:
                return 114;
            case PRIMERO:
                return 115;
            case PRODUCTO:
                return 116;
            case SUMA:
                return 117;
            case UL:
                return 118;
            case ULTIMO:
                return 119;
            case '(':
                return 120;
        }
        return 665;
    }

    private int yys238() {
        switch (yytok) {
            case AMARILLO:
            case '=':
            case MARRON:
            case NEGRO:
            case CIAN:
            case AZUL:
            case GRIS:
            case error:
            case BLANCO:
            case VERDE:
            case ROJO:
                return 665;
            case AZAR:
                return 31;
            case CUENTA:
                return 37;
            case INTEGER:
                return 53;
            case REDONDEA:
                return 73;
            case RESTO:
                return 75;
            case DIFERENCIA:
                return 109;
            case ELEGIR:
                return 110;
            case ELEMENTO:
                return 111;
            case IDENTIFIER:
                return 112;
            case MENOS:
                return 113;
            case POTENCIA:
                return 114;
            case PRIMERO:
                return 115;
            case PRODUCTO:
                return 116;
            case SUMA:
                return 117;
            case UL:
                return 118;
            case ULTIMO:
                return 119;
            case '(':
                return 120;
            case '*':
                return 235;
            case '+':
                return 236;
            case '-':
                return 237;
        }
        return yyr153();
    }

    private int yys239() {
        switch (yytok) {
            case AZAR:
                return 31;
            case CUENTA:
                return 37;
            case INTEGER:
                return 53;
            case REDONDEA:
                return 73;
            case RESTO:
                return 75;
            case DIFERENCIA:
                return 109;
            case ELEGIR:
                return 110;
            case ELEMENTO:
                return 111;
            case IDENTIFIER:
                return 112;
            case MENOS:
                return 113;
            case POTENCIA:
                return 114;
            case PRIMERO:
                return 115;
            case PRODUCTO:
                return 116;
            case SUMA:
                return 117;
            case UL:
                return 118;
            case ULTIMO:
                return 119;
            case '(':
                return 120;
        }
        return 665;
    }

    private int yys241() {
        switch (yytok) {
            case AMARILLO:
            case AZUL:
            case GRIS:
            case '=':
            case ROJO:
            case NEGRO:
            case CIAN:
            case VERDE:
            case BLANCO:
            case MARRON:
            case error:
                return 665;
            case '*':
                return 235;
            case '+':
                return 236;
            case '-':
                return 237;
        }
        return yyr96();
    }

    private int yys242() {
        switch (yytok) {
            case AZAR:
                return 31;
            case CUENTA:
                return 37;
            case INTEGER:
                return 53;
            case REDONDEA:
                return 73;
            case RESTO:
                return 75;
            case DIFERENCIA:
                return 109;
            case ELEGIR:
                return 110;
            case ELEMENTO:
                return 111;
            case IDENTIFIER:
                return 112;
            case MENOS:
                return 113;
            case POTENCIA:
                return 114;
            case PRIMERO:
                return 115;
            case PRODUCTO:
                return 116;
            case SUMA:
                return 117;
            case UL:
                return 118;
            case ULTIMO:
                return 119;
            case '(':
                return 120;
            case '*':
                return 235;
            case '+':
                return 236;
            case '-':
                return 237;
        }
        return 665;
    }

    private int yys243() {
        switch (yytok) {
            case AZAR:
                return 31;
            case CUENTA:
                return 37;
            case INTEGER:
                return 53;
            case REDONDEA:
                return 73;
            case RESTO:
                return 75;
            case DIFERENCIA:
                return 109;
            case ELEGIR:
                return 110;
            case ELEMENTO:
                return 111;
            case IDENTIFIER:
                return 112;
            case MENOS:
                return 113;
            case POTENCIA:
                return 114;
            case PRIMERO:
                return 115;
            case PRODUCTO:
                return 116;
            case SUMA:
                return 117;
            case UL:
                return 118;
            case ULTIMO:
                return 119;
            case '(':
                return 120;
        }
        return 665;
    }

    private int yys244() {
        switch (yytok) {
            case AZAR:
                return 31;
            case CUENTA:
                return 37;
            case INTEGER:
                return 53;
            case REDONDEA:
                return 73;
            case RESTO:
                return 75;
            case DIFERENCIA:
                return 109;
            case ELEGIR:
                return 110;
            case ELEMENTO:
                return 111;
            case IDENTIFIER:
                return 112;
            case MENOS:
                return 113;
            case POTENCIA:
                return 114;
            case PRIMERO:
                return 115;
            case PRODUCTO:
                return 116;
            case SUMA:
                return 117;
            case UL:
                return 118;
            case ULTIMO:
                return 119;
            case '(':
                return 120;
        }
        return 665;
    }

    private int yys245() {
        switch (yytok) {
            case AZAR:
                return 31;
            case CUENTA:
                return 37;
            case INTEGER:
                return 53;
            case REDONDEA:
                return 73;
            case RESTO:
                return 75;
            case DIFERENCIA:
                return 109;
            case ELEGIR:
                return 110;
            case ELEMENTO:
                return 111;
            case IDENTIFIER:
                return 112;
            case MENOS:
                return 113;
            case POTENCIA:
                return 114;
            case PRIMERO:
                return 115;
            case PRODUCTO:
                return 116;
            case SUMA:
                return 117;
            case UL:
                return 118;
            case ULTIMO:
                return 119;
            case '(':
                return 120;
        }
        return 665;
    }

    private int yys249() {
        switch (yytok) {
            case MARRON:
            case GRIS:
            case ROJO:
            case NEGRO:
            case BLANCO:
            case VERDE:
            case AMARILLO:
            case AZUL:
            case error:
            case '=':
            case CIAN:
                return 665;
        }
        return yyr154();
    }

    private int yys250() {
        switch (yytok) {
            case MARRON:
            case GRIS:
            case ROJO:
            case NEGRO:
            case BLANCO:
            case VERDE:
            case AMARILLO:
            case AZUL:
            case error:
            case '=':
            case CIAN:
                return 665;
        }
        return yyr152();
    }

    private int yys251() {
        switch (yytok) {
            case MARRON:
            case '=':
            case ROJO:
            case NEGRO:
            case AMARILLO:
            case GRIS:
            case AZUL:
            case CIAN:
            case BLANCO:
            case error:
            case VERDE:
                return 665;
            case '*':
                return 90;
            case '+':
                return 91;
            case '-':
                return 92;
            case '/':
                return 93;
        }
        return yyr136();
    }

    private int yys252() {
        switch (yytok) {
            case MARRON:
            case '=':
            case ROJO:
            case NEGRO:
            case AMARILLO:
            case GRIS:
            case AZUL:
            case CIAN:
            case BLANCO:
            case error:
            case VERDE:
                return 665;
            case '*':
                return 96;
            case '+':
                return 97;
            case '-':
                return 98;
            case '/':
                return 99;
        }
        return yyr134();
    }

    private int yys253() {
        switch (yytok) {
            case MARRON:
            case '=':
            case ROJO:
            case NEGRO:
            case AMARILLO:
            case GRIS:
            case AZUL:
            case CIAN:
            case BLANCO:
            case error:
            case VERDE:
                return 665;
            case '*':
                return 90;
            case '+':
                return 91;
            case '-':
                return 92;
            case '/':
                return 93;
        }
        return yyr135();
    }

    private int yys254() {
        switch (yytok) {
            case MARRON:
            case '=':
            case ROJO:
            case NEGRO:
            case AMARILLO:
            case GRIS:
            case AZUL:
            case CIAN:
            case BLANCO:
            case error:
            case VERDE:
                return 665;
            case '*':
                return 96;
            case '+':
                return 97;
            case '-':
                return 98;
            case '/':
                return 99;
        }
        return yyr133();
    }

    private int yys256() {
        switch (yytok) {
            case APARECETORTUGA:
                return 27;
            case AT:
                return 28;
            case AV:
                return 29;
            case AVANZA:
                return 30;
            case AZAR:
                return 31;
            case BAJALAPIZ:
                return 32;
            case BL:
                return 33;
            case BORRAPANTALLA:
                return 34;
            case CENTRO:
                return 35;
            case COS:
                return 36;
            case CUENTA:
                return 37;
            case DIFERENCIA:
                return 38;
            case DIVISION:
                return 39;
            case EJECUTA:
                return 40;
            case ELEGIR:
                return 41;
            case ELEMENTO:
                return 42;
            case ESPERA:
                return 43;
            case FLOAT:
                return 44;
            case GD:
                return 45;
            case GI:
                return 46;
            case GIRADERECHA:
                return 47;
            case GIRAIZQUIERDA:
                return 48;
            case IDENTIFIER:
                return 49;
            case IGUALES:
                return 50;
            case INC:
                return 51;
            case INIC:
                return 52;
            case INTEGER:
                return 53;
            case MAYORQUE:
                return 54;
            case MENORQUE:
                return 55;
            case MENOS:
                return 56;
            case O:
                return 57;
            case OCULTATORTUGA:
                return 58;
            case OT:
                return 59;
            case PONCL:
                return 60;
            case PONCOLORLAPIZ:
                return 61;
            case PONPOS:
                return 62;
            case PONRUMBO:
                return 63;
            case PONX:
                return 64;
            case PONXY:
                return 65;
            case PONY:
                return 66;
            case POTENCIA:
                return 67;
            case PRIMERO:
                return 68;
            case PRODUCTO:
                return 69;
            case RAIZCUADRADA:
                return 70;
            case RC:
                return 71;
            case RE:
                return 72;
            case REDONDEA:
                return 73;
            case REPITE:
                return 74;
            case RESTO:
                return 75;
            case RETROCEDE:
                return 76;
            case RUMBO:
                return 77;
            case SB:
                return 78;
            case SEN:
                return 79;
            case SENO:
                return 80;
            case SI:
                return 81;
            case SUBELAPIZ:
                return 82;
            case SUMA:
                return 83;
            case UL:
                return 84;
            case ULTIMO:
                return 85;
            case VAR:
                return 86;
            case Y:
                return 87;
            case '(':
                return 88;
            case ']':
                return yyr163();
        }
        return 665;
    }

    private int yys259() {
        switch (yytok) {
            case AZAR:
                return 31;
            case COS:
                return 36;
            case CUENTA:
                return 37;
            case DIFERENCIA:
                return 38;
            case DIVISION:
                return 39;
            case ELEGIR:
                return 41;
            case ELEMENTO:
                return 42;
            case FLOAT:
                return 44;
            case IDENTIFIER:
                return 49;
            case INTEGER:
                return 53;
            case MENOS:
                return 56;
            case POTENCIA:
                return 67;
            case PRIMERO:
                return 68;
            case PRODUCTO:
                return 69;
            case RAIZCUADRADA:
                return 70;
            case RC:
                return 71;
            case REDONDEA:
                return 73;
            case RESTO:
                return 75;
            case RUMBO:
                return 77;
            case SEN:
                return 79;
            case SENO:
                return 80;
            case SUMA:
                return 83;
            case UL:
                return 84;
            case ULTIMO:
                return 85;
            case '(':
                return 88;
        }
        return 665;
    }

    private int yys260() {
        switch (yytok) {
            case AZUL:
            case CIAN:
            case error:
            case NEGRO:
            case ')':
            case GRIS:
            case ROJO:
            case AMARILLO:
            case BLANCO:
            case '<':
            case '=':
            case VERDE:
            case MARRON:
            case '>':
                return 665;
            case '*':
                return 90;
            case '+':
                return 91;
            case '-':
                return 92;
            case '/':
                return 93;
        }
        return yyr140();
    }

    private int yys261() {
        switch (yytok) {
            case AZUL:
            case CIAN:
            case error:
            case NEGRO:
            case ')':
            case GRIS:
            case ROJO:
            case AMARILLO:
            case BLANCO:
            case '<':
            case '=':
            case VERDE:
            case MARRON:
            case '>':
                return 665;
            case '*':
                return 96;
            case '+':
                return 97;
            case '-':
                return 98;
            case '/':
                return 99;
        }
        return yyr138();
    }

    private int yys262() {
        switch (yytok) {
            case AZUL:
            case CIAN:
            case error:
            case NEGRO:
            case ')':
            case GRIS:
            case ROJO:
            case AMARILLO:
            case BLANCO:
            case '<':
            case '=':
            case VERDE:
            case MARRON:
            case '>':
                return 665;
            case '*':
                return 90;
            case '+':
                return 91;
            case '-':
                return 92;
            case '/':
                return 93;
        }
        return yyr139();
    }

    private int yys263() {
        switch (yytok) {
            case AZUL:
            case CIAN:
            case error:
            case NEGRO:
            case ')':
            case GRIS:
            case ROJO:
            case AMARILLO:
            case BLANCO:
            case '<':
            case '=':
            case VERDE:
            case MARRON:
            case '>':
                return 665;
            case '*':
                return 96;
            case '+':
                return 97;
            case '-':
                return 98;
            case '/':
                return 99;
        }
        return yyr137();
    }

    private int yys264() {
        switch (yytok) {
            case AZAR:
                return 31;
            case COS:
                return 36;
            case CUENTA:
                return 37;
            case DIFERENCIA:
                return 38;
            case DIVISION:
                return 39;
            case ELEGIR:
                return 41;
            case ELEMENTO:
                return 42;
            case FLOAT:
                return 44;
            case IDENTIFIER:
                return 49;
            case INTEGER:
                return 53;
            case MENOS:
                return 56;
            case POTENCIA:
                return 67;
            case PRIMERO:
                return 68;
            case PRODUCTO:
                return 69;
            case RAIZCUADRADA:
                return 70;
            case RC:
                return 71;
            case REDONDEA:
                return 73;
            case RESTO:
                return 75;
            case RUMBO:
                return 77;
            case SEN:
                return 79;
            case SENO:
                return 80;
            case SUMA:
                return 83;
            case UL:
                return 84;
            case ULTIMO:
                return 85;
            case '(':
                return 88;
            case ']':
                return 310;
        }
        return 665;
    }

    private int yys265() {
        switch (yytok) {
            case AZAR:
                return 31;
            case COS:
                return 36;
            case CUENTA:
                return 37;
            case DIFERENCIA:
                return 38;
            case DIVISION:
                return 39;
            case ELEGIR:
                return 41;
            case ELEMENTO:
                return 42;
            case FLOAT:
                return 44;
            case IDENTIFIER:
                return 49;
            case INTEGER:
                return 53;
            case MENOS:
                return 56;
            case POTENCIA:
                return 67;
            case PRIMERO:
                return 68;
            case PRODUCTO:
                return 69;
            case RAIZCUADRADA:
                return 70;
            case RC:
                return 71;
            case REDONDEA:
                return 73;
            case RESTO:
                return 75;
            case RUMBO:
                return 77;
            case SEN:
                return 79;
            case SENO:
                return 80;
            case SUMA:
                return 83;
            case UL:
                return 84;
            case ULTIMO:
                return 85;
            case '(':
                return 88;
        }
        return 665;
    }

    private int yys266() {
        switch (yytok) {
            case AZUL:
            case CIAN:
            case error:
            case NEGRO:
            case ')':
            case GRIS:
            case ROJO:
            case AMARILLO:
            case BLANCO:
            case '<':
            case '=':
            case VERDE:
            case MARRON:
            case '>':
                return 665;
            case '*':
                return 90;
            case '+':
                return 91;
            case '-':
                return 92;
            case '/':
                return 93;
        }
        return yyr146();
    }

    private int yys267() {
        switch (yytok) {
            case AZUL:
            case CIAN:
            case error:
            case NEGRO:
            case ')':
            case GRIS:
            case ROJO:
            case AMARILLO:
            case BLANCO:
            case '<':
            case '=':
            case VERDE:
            case MARRON:
            case '>':
                return 665;
            case '*':
                return 96;
            case '+':
                return 97;
            case '-':
                return 98;
            case '/':
                return 99;
        }
        return yyr144();
    }

    private int yys268() {
        switch (yytok) {
            case AZUL:
            case CIAN:
            case error:
            case NEGRO:
            case ')':
            case GRIS:
            case ROJO:
            case AMARILLO:
            case BLANCO:
            case '<':
            case '=':
            case VERDE:
            case MARRON:
            case '>':
                return 665;
            case '*':
                return 90;
            case '+':
                return 91;
            case '-':
                return 92;
            case '/':
                return 93;
        }
        return yyr145();
    }

    private int yys269() {
        switch (yytok) {
            case AZUL:
            case CIAN:
            case error:
            case NEGRO:
            case ')':
            case GRIS:
            case ROJO:
            case AMARILLO:
            case BLANCO:
            case '<':
            case '=':
            case VERDE:
            case MARRON:
            case '>':
                return 665;
            case '*':
                return 96;
            case '+':
                return 97;
            case '-':
                return 98;
            case '/':
                return 99;
        }
        return yyr143();
    }

    private int yys270() {
        switch (yytok) {
            case AZUL:
            case CIAN:
            case error:
            case NEGRO:
            case ')':
            case GRIS:
            case ROJO:
            case AMARILLO:
            case BLANCO:
            case '<':
            case '=':
            case VERDE:
            case MARRON:
            case '>':
                return 665;
            case '*':
                return 90;
            case '+':
                return 91;
            case '-':
                return 92;
            case '/':
                return 93;
        }
        return yyr150();
    }

    private int yys271() {
        switch (yytok) {
            case AZUL:
            case CIAN:
            case error:
            case NEGRO:
            case ')':
            case GRIS:
            case ROJO:
            case AMARILLO:
            case BLANCO:
            case '<':
            case '=':
            case VERDE:
            case MARRON:
            case '>':
                return 665;
            case '*':
                return 96;
            case '+':
                return 97;
            case '-':
                return 98;
            case '/':
                return 99;
        }
        return yyr148();
    }

    private int yys272() {
        switch (yytok) {
            case AZUL:
            case CIAN:
            case error:
            case NEGRO:
            case ')':
            case GRIS:
            case ROJO:
            case AMARILLO:
            case BLANCO:
            case '<':
            case '=':
            case VERDE:
            case MARRON:
            case '>':
                return 665;
            case '*':
                return 90;
            case '+':
                return 91;
            case '-':
                return 92;
            case '/':
                return 93;
        }
        return yyr149();
    }

    private int yys273() {
        switch (yytok) {
            case AZUL:
            case CIAN:
            case error:
            case NEGRO:
            case ')':
            case GRIS:
            case ROJO:
            case AMARILLO:
            case BLANCO:
            case '<':
            case '=':
            case VERDE:
            case MARRON:
            case '>':
                return 665;
            case '*':
                return 96;
            case '+':
                return 97;
            case '-':
                return 98;
            case '/':
                return 99;
        }
        return yyr147();
    }

    private int yys274() {
        switch (yytok) {
            case error:
            case CIAN:
            case AZUL:
            case '+':
            case '*':
            case GRIS:
            case VERDE:
            case ROJO:
            case BLANCO:
            case NEGRO:
            case '=':
            case '/':
            case MARRON:
            case '>':
            case '-':
            case ')':
            case '<':
            case AMARILLO:
                return 665;
        }
        return yyr142();
    }

    private int yys275() {
        switch (yytok) {
            case AZAR:
                return 31;
            case CUENTA:
                return 37;
            case INTEGER:
                return 53;
            case REDONDEA:
                return 73;
            case RESTO:
                return 75;
            case DIFERENCIA:
                return 109;
            case ELEGIR:
                return 110;
            case ELEMENTO:
                return 111;
            case IDENTIFIER:
                return 112;
            case MENOS:
                return 113;
            case POTENCIA:
                return 114;
            case PRIMERO:
                return 115;
            case PRODUCTO:
                return 116;
            case SUMA:
                return 117;
            case UL:
                return 118;
            case ULTIMO:
                return 119;
            case '(':
                return 120;
            case '*':
                return 235;
            case '+':
                return 236;
            case '-':
                return 237;
        }
        return 665;
    }

    private int yys276() {
        switch (yytok) {
            case AMARILLO:
            case CIAN:
            case '[':
            case NEGRO:
            case error:
            case BLANCO:
            case GRIS:
            case VERDE:
            case AZUL:
            case '=':
            case '<':
            case '>':
            case ')':
            case MARRON:
            case '/':
            case ROJO:
                return 665;
            case '*':
                return 235;
            case '+':
                return 236;
            case '-':
                return 237;
        }
        return yyr151();
    }

    private int yys277() {
        switch (yytok) {
            case MARRON:
            case '=':
            case ROJO:
            case NEGRO:
            case AMARILLO:
            case GRIS:
            case AZUL:
            case CIAN:
            case BLANCO:
            case error:
            case VERDE:
                return 665;
            case '*':
                return 90;
            case '+':
                return 91;
            case '-':
                return 92;
            case '/':
                return 93;
        }
        return yyr132();
    }

    private int yys278() {
        switch (yytok) {
            case MARRON:
            case '=':
            case ROJO:
            case NEGRO:
            case AMARILLO:
            case GRIS:
            case AZUL:
            case CIAN:
            case BLANCO:
            case error:
            case VERDE:
                return 665;
            case '*':
                return 96;
            case '+':
                return 97;
            case '-':
                return 98;
            case '/':
                return 99;
        }
        return yyr130();
    }

    private int yys279() {
        switch (yytok) {
            case MARRON:
            case '=':
            case ROJO:
            case NEGRO:
            case AMARILLO:
            case GRIS:
            case AZUL:
            case CIAN:
            case BLANCO:
            case error:
            case VERDE:
                return 665;
            case '*':
                return 90;
            case '+':
                return 91;
            case '-':
                return 92;
            case '/':
                return 93;
        }
        return yyr131();
    }

    private int yys280() {
        switch (yytok) {
            case MARRON:
            case '=':
            case ROJO:
            case NEGRO:
            case AMARILLO:
            case GRIS:
            case AZUL:
            case CIAN:
            case BLANCO:
            case error:
            case VERDE:
                return 665;
            case '*':
                return 96;
            case '+':
                return 97;
            case '-':
                return 98;
            case '/':
                return 99;
        }
        return yyr128();
    }

    private int yys283() {
        switch (yytok) {
            case APARECETORTUGA:
                return 27;
            case AT:
                return 28;
            case AV:
                return 29;
            case AVANZA:
                return 30;
            case AZAR:
                return 31;
            case BAJALAPIZ:
                return 32;
            case BL:
                return 33;
            case BORRAPANTALLA:
                return 34;
            case CENTRO:
                return 35;
            case COS:
                return 36;
            case CUENTA:
                return 37;
            case DIFERENCIA:
                return 38;
            case DIVISION:
                return 39;
            case EJECUTA:
                return 40;
            case ELEGIR:
                return 41;
            case ELEMENTO:
                return 42;
            case ESPERA:
                return 43;
            case FLOAT:
                return 44;
            case GD:
                return 45;
            case GI:
                return 46;
            case GIRADERECHA:
                return 47;
            case GIRAIZQUIERDA:
                return 48;
            case IDENTIFIER:
                return 49;
            case IGUALES:
                return 50;
            case INC:
                return 51;
            case INIC:
                return 52;
            case INTEGER:
                return 53;
            case MAYORQUE:
                return 54;
            case MENORQUE:
                return 55;
            case MENOS:
                return 56;
            case O:
                return 57;
            case OCULTATORTUGA:
                return 58;
            case OT:
                return 59;
            case PONCL:
                return 60;
            case PONCOLORLAPIZ:
                return 61;
            case PONPOS:
                return 62;
            case PONRUMBO:
                return 63;
            case PONX:
                return 64;
            case PONXY:
                return 65;
            case PONY:
                return 66;
            case POTENCIA:
                return 67;
            case PRIMERO:
                return 68;
            case PRODUCTO:
                return 69;
            case RAIZCUADRADA:
                return 70;
            case RC:
                return 71;
            case RE:
                return 72;
            case REDONDEA:
                return 73;
            case REPITE:
                return 74;
            case RESTO:
                return 75;
            case RETROCEDE:
                return 76;
            case RUMBO:
                return 77;
            case SB:
                return 78;
            case SEN:
                return 79;
            case SENO:
                return 80;
            case SI:
                return 81;
            case SUBELAPIZ:
                return 82;
            case SUMA:
                return 83;
            case UL:
                return 84;
            case ULTIMO:
                return 85;
            case VAR:
                return 86;
            case Y:
                return 87;
            case '(':
                return 88;
        }
        return 665;
    }

    private int yys284() {
        switch (yytok) {
            case AMARILLO:
            case AZUL:
            case GRIS:
            case '=':
            case ROJO:
            case NEGRO:
            case CIAN:
            case VERDE:
            case BLANCO:
            case MARRON:
            case error:
                return 665;
            case '*':
                return 235;
            case '+':
                return 236;
            case '-':
                return 237;
        }
        return yyr129();
    }

    private int yys285() {
        switch (yytok) {
            case APARECETORTUGA:
                return 27;
            case AT:
                return 28;
            case AV:
                return 29;
            case AVANZA:
                return 30;
            case AZAR:
                return 31;
            case BAJALAPIZ:
                return 32;
            case BL:
                return 33;
            case BORRAPANTALLA:
                return 34;
            case CENTRO:
                return 35;
            case COS:
                return 36;
            case CUENTA:
                return 37;
            case DIFERENCIA:
                return 38;
            case DIVISION:
                return 39;
            case EJECUTA:
                return 40;
            case ELEGIR:
                return 41;
            case ELEMENTO:
                return 42;
            case ESPERA:
                return 43;
            case FLOAT:
                return 44;
            case GD:
                return 45;
            case GI:
                return 46;
            case GIRADERECHA:
                return 47;
            case GIRAIZQUIERDA:
                return 48;
            case IDENTIFIER:
                return 49;
            case IGUALES:
                return 50;
            case INC:
                return 51;
            case INIC:
                return 52;
            case INTEGER:
                return 53;
            case MAYORQUE:
                return 54;
            case MENORQUE:
                return 55;
            case MENOS:
                return 56;
            case O:
                return 57;
            case OCULTATORTUGA:
                return 58;
            case OT:
                return 59;
            case PONCL:
                return 60;
            case PONCOLORLAPIZ:
                return 61;
            case PONPOS:
                return 62;
            case PONRUMBO:
                return 63;
            case PONX:
                return 64;
            case PONXY:
                return 65;
            case PONY:
                return 66;
            case POTENCIA:
                return 67;
            case PRIMERO:
                return 68;
            case PRODUCTO:
                return 69;
            case RAIZCUADRADA:
                return 70;
            case RC:
                return 71;
            case RE:
                return 72;
            case REDONDEA:
                return 73;
            case REPITE:
                return 74;
            case RESTO:
                return 75;
            case RETROCEDE:
                return 76;
            case RUMBO:
                return 77;
            case SB:
                return 78;
            case SEN:
                return 79;
            case SENO:
                return 80;
            case SI:
                return 81;
            case SUBELAPIZ:
                return 82;
            case SUMA:
                return 83;
            case UL:
                return 84;
            case ULTIMO:
                return 85;
            case VAR:
                return 86;
            case Y:
                return 87;
            case '(':
                return 88;
        }
        return 665;
    }

    private int yys290() {
        switch (yytok) {
            case AZAR:
                return 31;
            case COS:
                return 36;
            case CUENTA:
                return 37;
            case DIFERENCIA:
                return 38;
            case DIVISION:
                return 39;
            case ELEGIR:
                return 41;
            case ELEMENTO:
                return 42;
            case FLOAT:
                return 44;
            case IDENTIFIER:
                return 49;
            case INTEGER:
                return 53;
            case MENOS:
                return 56;
            case POTENCIA:
                return 67;
            case PRIMERO:
                return 68;
            case PRODUCTO:
                return 69;
            case RAIZCUADRADA:
                return 70;
            case RC:
                return 71;
            case REDONDEA:
                return 73;
            case RESTO:
                return 75;
            case RUMBO:
                return 77;
            case SEN:
                return 79;
            case SENO:
                return 80;
            case SUMA:
                return 83;
            case UL:
                return 84;
            case ULTIMO:
                return 85;
            case '(':
                return 88;
        }
        return 665;
    }

    private int yys291() {
        switch (yytok) {
            case error:
            case CIAN:
            case AZUL:
            case '+':
            case '*':
            case GRIS:
            case VERDE:
            case ROJO:
            case BLANCO:
            case NEGRO:
            case '=':
            case '/':
            case MARRON:
            case '>':
            case '-':
            case ')':
            case '<':
            case AMARILLO:
                return 665;
        }
        return yyr141();
    }

    private int yys292() {
        switch (yytok) {
            case MARRON:
            case GRIS:
            case ROJO:
            case NEGRO:
            case BLANCO:
            case VERDE:
            case AMARILLO:
            case AZUL:
            case error:
            case '=':
            case CIAN:
                return 665;
        }
        return yyr73();
    }

    private int yys293() {
        switch (yytok) {
            case MARRON:
            case GRIS:
            case ROJO:
            case NEGRO:
            case BLANCO:
            case VERDE:
            case AMARILLO:
            case AZUL:
            case error:
            case '=':
            case CIAN:
                return 665;
        }
        return yyr59();
    }

    private int yys295() {
        switch (yytok) {
            case MARRON:
            case GRIS:
            case ROJO:
            case NEGRO:
            case BLANCO:
            case VERDE:
            case AMARILLO:
            case AZUL:
            case error:
            case '=':
            case CIAN:
                return 665;
        }
        return yyr58();
    }

    private int yys296() {
        switch (yytok) {
            case CIAN:
            case MARRON:
            case NEGRO:
            case error:
            case AZUL:
            case BLANCO:
            case ROJO:
            case GRIS:
            case VERDE:
            case '=':
            case AMARILLO:
                return 665;
            case '*':
                return 235;
        }
        return yyr56();
    }

    private int yys297() {
        switch (yytok) {
            case CIAN:
            case MARRON:
            case NEGRO:
            case error:
            case AZUL:
            case BLANCO:
            case ROJO:
            case GRIS:
            case VERDE:
            case '=':
            case AMARILLO:
                return 665;
            case '*':
                return 235;
        }
        return yyr57();
    }

    private int yys298() {
        switch (yytok) {
            case AZAR:
                return 31;
            case CUENTA:
                return 37;
            case INTEGER:
                return 53;
            case REDONDEA:
                return 73;
            case RESTO:
                return 75;
            case DIFERENCIA:
                return 109;
            case ELEGIR:
                return 110;
            case ELEMENTO:
                return 111;
            case IDENTIFIER:
                return 112;
            case MENOS:
                return 113;
            case POTENCIA:
                return 114;
            case PRIMERO:
                return 115;
            case PRODUCTO:
                return 116;
            case SUMA:
                return 117;
            case UL:
                return 118;
            case ULTIMO:
                return 119;
            case '(':
                return 120;
        }
        return 665;
    }

    private int yys299() {
        switch (yytok) {
            case AMARILLO:
            case AZUL:
            case GRIS:
            case '=':
            case ROJO:
            case NEGRO:
            case CIAN:
            case VERDE:
            case BLANCO:
            case MARRON:
            case error:
                return 665;
            case '*':
                return 235;
            case '+':
                return 236;
            case '-':
                return 237;
        }
        return yyr128();
    }

    private int yys300() {
        switch (yytok) {
            case MARRON:
            case GRIS:
            case ROJO:
            case NEGRO:
            case BLANCO:
            case VERDE:
            case AMARILLO:
            case AZUL:
            case error:
            case '=':
            case CIAN:
                return 665;
        }
        return yyr166();
    }

    private int yys301() {
        switch (yytok) {
            case MARRON:
            case GRIS:
            case ROJO:
            case NEGRO:
            case BLANCO:
            case VERDE:
            case AMARILLO:
            case AZUL:
            case error:
            case '=':
            case CIAN:
                return 665;
        }
        return yyr165();
    }

    private int yys302() {
        switch (yytok) {
            case VERDE:
            case CIAN:
            case ROJO:
            case NEGRO:
            case '+':
            case BLANCO:
            case '*':
            case AMARILLO:
            case AZUL:
            case '=':
            case '<':
            case '>':
            case ')':
            case MARRON:
            case '/':
            case error:
            case '-':
            case '[':
            case GRIS:
                return 665;
        }
        return yyr178();
    }

    private int yys304() {
        switch (yytok) {
            case MARRON:
            case GRIS:
            case ROJO:
            case NEGRO:
            case BLANCO:
            case VERDE:
            case AMARILLO:
            case AZUL:
            case error:
            case '=':
            case CIAN:
                return 665;
        }
        return yyr170();
    }

    private int yys305() {
        switch (yytok) {
            case MARRON:
            case GRIS:
            case ROJO:
            case NEGRO:
            case BLANCO:
            case VERDE:
            case AMARILLO:
            case AZUL:
            case error:
            case '=':
            case CIAN:
                return 665;
        }
        return yyr164();
    }

    private int yys310() {
        switch (yytok) {
            case VERDE:
            case CIAN:
            case ROJO:
            case NEGRO:
            case '+':
            case BLANCO:
            case '*':
            case AMARILLO:
            case AZUL:
            case '=':
            case '<':
            case '>':
            case ')':
            case MARRON:
            case '/':
            case error:
            case '-':
            case '[':
            case GRIS:
                return 665;
        }
        return yyr174();
    }

    private int yys311() {
        switch (yytok) {
            case VERDE:
            case CIAN:
            case AMARILLO:
            case NEGRO:
            case error:
            case BLANCO:
            case '[':
            case GRIS:
            case AZUL:
            case '=':
            case '<':
            case '>':
            case ROJO:
            case MARRON:
            case ')':
                return 665;
            case '*':
                return 90;
            case '+':
                return 91;
            case '-':
                return 92;
            case '/':
                return 93;
        }
        return yyr43();
    }

    private int yys312() {
        switch (yytok) {
            case VERDE:
            case CIAN:
            case AMARILLO:
            case NEGRO:
            case error:
            case BLANCO:
            case '[':
            case GRIS:
            case AZUL:
            case '=':
            case '<':
            case '>':
            case ROJO:
            case MARRON:
            case ')':
                return 665;
            case '*':
                return 96;
            case '+':
                return 97;
            case '-':
                return 98;
            case '/':
                return 99;
        }
        return yyr42();
    }

    private int yys314() {
        switch (yytok) {
            case MARRON:
            case GRIS:
            case ROJO:
            case NEGRO:
            case BLANCO:
            case VERDE:
            case AMARILLO:
            case AZUL:
            case error:
            case '=':
            case CIAN:
                return 665;
        }
        return yyr173();
    }

    private int yys315() {
        switch (yytok) {
            case MARRON:
            case GRIS:
            case ROJO:
            case NEGRO:
            case BLANCO:
            case VERDE:
            case AMARILLO:
            case AZUL:
            case error:
            case '=':
            case CIAN:
                return 665;
        }
        return yyr169();
    }

    private int yys318() {
        switch (yytok) {
            case MARRON:
            case GRIS:
            case ROJO:
            case NEGRO:
            case BLANCO:
            case VERDE:
            case AMARILLO:
            case AZUL:
            case error:
            case '=':
            case CIAN:
                return 665;
        }
        return yyr172();
    }

    private int yys319() {
        switch (yytok) {
            case MARRON:
            case GRIS:
            case ROJO:
            case NEGRO:
            case BLANCO:
            case VERDE:
            case AMARILLO:
            case AZUL:
            case error:
            case '=':
            case CIAN:
                return 665;
        }
        return yyr168();
    }

    private int yys320() {
        switch (yytok) {
            case MARRON:
            case GRIS:
            case ROJO:
            case NEGRO:
            case BLANCO:
            case VERDE:
            case AMARILLO:
            case AZUL:
            case error:
            case '=':
            case CIAN:
                return 665;
        }
        return yyr171();
    }

    private int yys321() {
        switch (yytok) {
            case MARRON:
            case GRIS:
            case ROJO:
            case NEGRO:
            case BLANCO:
            case VERDE:
            case AMARILLO:
            case AZUL:
            case error:
            case '=':
            case CIAN:
                return 665;
        }
        return yyr167();
    }

    private int yys322() {
        switch (yytok) {
            case VERDE:
            case CIAN:
            case AMARILLO:
            case NEGRO:
            case error:
            case BLANCO:
            case '[':
            case GRIS:
            case AZUL:
            case '=':
            case '<':
            case '>':
            case ROJO:
            case MARRON:
            case ')':
                return 665;
            case '*':
                return 90;
            case '+':
                return 91;
            case '-':
                return 92;
            case '/':
                return 93;
        }
        return yyr46();
    }

    private int yys323() {
        switch (yytok) {
            case VERDE:
            case CIAN:
            case AMARILLO:
            case NEGRO:
            case error:
            case BLANCO:
            case '[':
            case GRIS:
            case AZUL:
            case '=':
            case '<':
            case '>':
            case ROJO:
            case MARRON:
            case ')':
                return 665;
            case '*':
                return 96;
            case '+':
                return 97;
            case '-':
                return 98;
            case '/':
                return 99;
        }
        return yyr45();
    }

    private int yys324() {
        switch (yytok) {
            case MARRON:
            case GRIS:
            case ROJO:
            case NEGRO:
            case BLANCO:
            case VERDE:
            case AMARILLO:
            case AZUL:
            case error:
            case '=':
            case CIAN:
                return 665;
        }
        return yyr180();
    }

    private int yys325() {
        switch (yytok) {
            case MARRON:
            case GRIS:
            case ROJO:
            case NEGRO:
            case BLANCO:
            case VERDE:
            case AMARILLO:
            case AZUL:
            case error:
            case '=':
            case CIAN:
                return 665;
        }
        return yyr179();
    }

    private int yys326() {
        switch (yytok) {
            case VERDE:
            case CIAN:
            case ROJO:
            case NEGRO:
            case '+':
            case BLANCO:
            case '*':
            case AMARILLO:
            case AZUL:
            case '=':
            case '<':
            case '>':
            case ')':
            case MARRON:
            case '/':
            case error:
            case '-':
            case '[':
            case GRIS:
                return 665;
        }
        return yyr176();
    }

    private int yys327() {
        switch (yytok) {
            case VERDE:
            case CIAN:
            case ROJO:
            case NEGRO:
            case '+':
            case BLANCO:
            case '*':
            case AMARILLO:
            case AZUL:
            case '=':
            case '<':
            case '>':
            case ')':
            case MARRON:
            case '/':
            case error:
            case '-':
            case '[':
            case GRIS:
                return 665;
        }
        return yyr175();
    }

    private int yys328() {
        switch (yytok) {
            case VERDE:
            case CIAN:
            case ROJO:
            case NEGRO:
            case '+':
            case BLANCO:
            case '*':
            case AMARILLO:
            case AZUL:
            case '=':
            case '<':
            case '>':
            case ')':
            case MARRON:
            case '/':
            case error:
            case '-':
            case '[':
            case GRIS:
                return 665;
        }
        return yyr177();
    }

    private int yys329() {
        switch (yytok) {
            case VERDE:
            case CIAN:
            case ROJO:
            case NEGRO:
            case '+':
            case BLANCO:
            case '*':
            case AMARILLO:
            case AZUL:
            case '=':
            case '<':
            case '>':
            case ')':
            case MARRON:
            case '/':
            case error:
            case '-':
            case '[':
            case GRIS:
                return 665;
        }
        return yyr181();
    }

    private int yys330() {
        switch (yytok) {
            case VERDE:
            case CIAN:
            case ROJO:
            case NEGRO:
            case '+':
            case BLANCO:
            case '*':
            case AMARILLO:
            case AZUL:
            case '=':
            case '<':
            case '>':
            case ')':
            case MARRON:
            case '/':
            case error:
            case '-':
            case '[':
            case GRIS:
                return 665;
        }
        return yyr182();
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
            default: return 210;
        }
    }

    private int yyr74() { // color : BLANCO
        yysp -= 1;
        return yypcolor();
    }

    private int yyr75() { // color : AZUL
        yysp -= 1;
        return yypcolor();
    }

    private int yyr76() { // color : MARRON
        yysp -= 1;
        return yypcolor();
    }

    private int yyr77() { // color : CIAN
        yysp -= 1;
        return yypcolor();
    }

    private int yyr78() { // color : GRIS
        yysp -= 1;
        return yypcolor();
    }

    private int yyr79() { // color : AMARILLO
        yysp -= 1;
        return yypcolor();
    }

    private int yyr80() { // color : NEGRO
        yysp -= 1;
        return yypcolor();
    }

    private int yyr81() { // color : ROJO
        yysp -= 1;
        return yypcolor();
    }

    private int yyr82() { // color : VERDE
        yysp -= 1;
        return yypcolor();
    }

    private int yypcolor() {
        switch (yyst[yysp-1]) {
            case 60: return 164;
            default: return 174;
        }
    }

    private int yyr44() { // declaration_expr : VAR IDENTIFIER
        { /* Almacenar identificador */ }
        yysv[yysp-=2] = yyrv;
        return 2;
    }

    private int yyr45() { // declaration_expr : VAR IDENTIFIER '=' int_number
        { /* Almacenar identificador con valor int dado, verificando que no exista */ }
        yysv[yysp-=4] = yyrv;
        return 2;
    }

    private int yyr46() { // declaration_expr : VAR IDENTIFIER '=' float_number
        { /* Almacenar identificador con valor float dado verificando que no exista */ }
        yysv[yysp-=4] = yyrv;
        return 2;
    }

    private int yyr162() { // expr_procs_n : expression expr_procs_n
        yysp -= 2;
        return yypexpr_procs_n();
    }

    private int yyr163() { // expr_procs_n : expression
        yysp -= 1;
        return yypexpr_procs_n();
    }

    private int yypexpr_procs_n() {
        switch (yyst[yysp-1]) {
            case 283: return 316;
            case 256: return 303;
            case 139: return 255;
            default: return 317;
        }
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

    private int yyr6() { // expression : int_arithmetic_expr
        yysp -= 1;
        return yypexpression();
    }

    private int yyr7() { // expression : float_arithmetic_expr
        yysp -= 1;
        return yypexpression();
    }

    private int yyr8() { // expression : int_proc1
        yysp -= 1;
        return yypexpression();
    }

    private int yyr9() { // expression : int_proc2
        yysp -= 1;
        return yypexpression();
    }

    private int yyr10() { // expression : int_proc_p
        yysp -= 1;
        return yypexpression();
    }

    private int yyr11() { // expression : int_proc_1p
        yysp -= 1;
        return yypexpression();
    }

    private int yyr12() { // expression : int_proc_n
        yysp -= 1;
        return yypexpression();
    }

    private int yyr13() { // expression : float_proc
        yysp -= 1;
        return yypexpression();
    }

    private int yyr14() { // expression : float_proc1
        yysp -= 1;
        return yypexpression();
    }

    private int yyr15() { // expression : float_proc2
        yysp -= 1;
        return yypexpression();
    }

    private int yyr16() { // expression : float_proc_p
        yysp -= 1;
        return yypexpression();
    }

    private int yyr17() { // expression : float_proc_1p
        yysp -= 1;
        return yypexpression();
    }

    private int yyr18() { // expression : float_proc_n
        yysp -= 1;
        return yypexpression();
    }

    private int yyr19() { // expression : bool_proc2
        yysp -= 1;
        return yypexpression();
    }

    private int yyr20() { // expression : void_proc
        yysp -= 1;
        return yypexpression();
    }

    private int yyr21() { // expression : void_proc1
        yysp -= 1;
        return yypexpression();
    }

    private int yyr22() { // expression : void_proc2
        yysp -= 1;
        return yypexpression();
    }

    private int yyr23() { // expression : void_proc_p
        yysp -= 1;
        return yypexpression();
    }

    private int yyr24() { // expression : void_proc_1p
        yysp -= 1;
        return yypexpression();
    }

    private int yypexpression() {
        switch (yyst[yysp-1]) {
            case 89: return 3;
            case 0: return 3;
            default: return 256;
        }
    }

    private int yyr60() { // float_arithmetic_expr : float_number '+' int_number
        { yyrv = ((Float)yysv[yysp-3]) + ((Integer)yysv[yysp-1]); System.out.println(yyrv); }
        yysv[yysp-=3] = yyrv;
        return yypfloat_arithmetic_expr();
    }

    private int yyr61() { // float_arithmetic_expr : int_number '+' float_number
        { yyrv = ((Integer)yysv[yysp-3]) + ((Float)yysv[yysp-1]); System.out.println(yyrv); }
        yysv[yysp-=3] = yyrv;
        return yypfloat_arithmetic_expr();
    }

    private int yyr62() { // float_arithmetic_expr : float_number '+' float_number
        { yyrv = ((Float)yysv[yysp-3]) + ((Float)yysv[yysp-1]); System.out.println(yyrv); }
        yysv[yysp-=3] = yyrv;
        return yypfloat_arithmetic_expr();
    }

    private int yyr63() { // float_arithmetic_expr : float_number '-' int_number
        { yyrv = ((Float)yysv[yysp-3]) - ((Integer)yysv[yysp-1]); System.out.println(yyrv); }
        yysv[yysp-=3] = yyrv;
        return yypfloat_arithmetic_expr();
    }

    private int yyr64() { // float_arithmetic_expr : int_number '-' float_number
        { yyrv = ((Integer)yysv[yysp-3]) - ((Float)yysv[yysp-1]); System.out.println(yyrv); }
        yysv[yysp-=3] = yyrv;
        return yypfloat_arithmetic_expr();
    }

    private int yyr65() { // float_arithmetic_expr : float_number '-' float_number
        { yyrv = ((Float)yysv[yysp-3]) - ((Float)yysv[yysp-1]); System.out.println(yyrv); }
        yysv[yysp-=3] = yyrv;
        return yypfloat_arithmetic_expr();
    }

    private int yyr66() { // float_arithmetic_expr : float_number '*' int_number
        { yyrv = ((Float)yysv[yysp-3]) * ((Integer)yysv[yysp-1]); System.out.println(yyrv); }
        yysv[yysp-=3] = yyrv;
        return yypfloat_arithmetic_expr();
    }

    private int yyr67() { // float_arithmetic_expr : int_number '*' float_number
        { yyrv = ((Integer)yysv[yysp-3]) * ((Float)yysv[yysp-1]); System.out.println(yyrv); }
        yysv[yysp-=3] = yyrv;
        return yypfloat_arithmetic_expr();
    }

    private int yyr68() { // float_arithmetic_expr : float_number '*' float_number
        { yyrv = ((Float)yysv[yysp-3]) * ((Float)yysv[yysp-1]); System.out.println(yyrv); }
        yysv[yysp-=3] = yyrv;
        return yypfloat_arithmetic_expr();
    }

    private int yyr69() { // float_arithmetic_expr : int_number '/' int_number
        { yyrv = ((Integer)yysv[yysp-3]) / ((Integer)yysv[yysp-1]); System.out.println(yyrv); }
        yysv[yysp-=3] = yyrv;
        return yypfloat_arithmetic_expr();
    }

    private int yyr70() { // float_arithmetic_expr : float_number '/' int_number
        { yyrv = ((Float)yysv[yysp-3]) / ((Integer)yysv[yysp-1]); System.out.println(yyrv); }
        yysv[yysp-=3] = yyrv;
        return yypfloat_arithmetic_expr();
    }

    private int yyr71() { // float_arithmetic_expr : int_number '/' float_number
        { yyrv = ((Integer)yysv[yysp-3]) / ((Float)yysv[yysp-1]); System.out.println(yyrv); }
        yysv[yysp-=3] = yyrv;
        return yypfloat_arithmetic_expr();
    }

    private int yyr72() { // float_arithmetic_expr : float_number '/' float_number
        { yyrv = ((Float)yysv[yysp-3]) / ((Float)yysv[yysp-1]); System.out.println(yyrv); }
        yysv[yysp-=3] = yyrv;
        return yypfloat_arithmetic_expr();
    }

    private int yyr73() { // float_arithmetic_expr : '(' float_arithmetic_expr ')'
        { yyrv = ((Float)yysv[yysp-2]); }
        yysv[yysp-=3] = yyrv;
        return yypfloat_arithmetic_expr();
    }

    private int yypfloat_arithmetic_expr() {
        switch (yyst[yysp-1]) {
            case 285: return 4;
            case 283: return 4;
            case 256: return 4;
            case 139: return 4;
            case 89: return 4;
            case 88: return 207;
            case 0: return 4;
            default: return 123;
        }
    }

    private int yyr33() { // float_number : FLOAT
        yysp -= 1;
        return yypfloat_number();
    }

    private int yyr34() { // float_number : IDENTIFIER
        { /* Obtener el valor de la variable */ }
        yysv[yysp-=1] = yyrv;
        return yypfloat_number();
    }

    private int yyr35() { // float_number : float_arithmetic_expr
        yysp -= 1;
        return yypfloat_number();
    }

    private int yyr36() { // float_number : float_proc
        yysp -= 1;
        return yypfloat_number();
    }

    private int yyr37() { // float_number : float_proc1
        yysp -= 1;
        return yypfloat_number();
    }

    private int yyr38() { // float_number : float_proc2
        yysp -= 1;
        return yypfloat_number();
    }

    private int yyr39() { // float_number : float_proc_p
        yysp -= 1;
        return yypfloat_number();
    }

    private int yyr40() { // float_number : float_proc_1p
        yysp -= 1;
        return yypfloat_number();
    }

    private int yyr41() { // float_number : float_proc_n
        yysp -= 1;
        return yypfloat_number();
    }

    private int yypfloat_number() {
        switch (yyst[yysp-1]) {
            case 290: return 322;
            case 265: return 311;
            case 264: return 308;
            case 259: return 133;
            case 204: return 133;
            case 203: return 133;
            case 183: return 133;
            case 182: return 279;
            case 181: return 277;
            case 159: return 272;
            case 158: return 270;
            case 157: return 268;
            case 156: return 266;
            case 153: return 262;
            case 152: return 260;
            case 140: return 133;
            case 138: return 253;
            case 137: return 251;
            case 133: return 133;
            case 132: return 133;
            case 101: return 233;
            case 100: return 231;
            case 99: return 229;
            case 98: return 227;
            case 97: return 225;
            case 96: return 223;
            case 95: return 221;
            case 94: return 219;
            case 93: return 217;
            case 92: return 215;
            case 91: return 213;
            case 90: return 211;
            case 88: return 208;
            case 83: return 133;
            case 80: return 198;
            case 79: return 196;
            case 73: return 191;
            case 71: return 188;
            case 70: return 186;
            case 69: return 133;
            case 67: return 181;
            case 63: return 176;
            case 56: return 160;
            case 55: return 158;
            case 54: return 156;
            case 50: return 152;
            case 48: return 150;
            case 47: return 148;
            case 46: return 146;
            case 45: return 144;
            case 43: return 142;
            case 39: return 137;
            case 38: return 133;
            case 36: return 124;
            default: return 5;
        }
    }

    private int yyr154() { // float_params_n : float_number float_params_n
        yysp -= 2;
        return yypfloat_params_n();
    }

    private int yyr155() { // float_params_n : float_number
        yysp -= 1;
        return yypfloat_params_n();
    }

    private int yypfloat_params_n() {
        switch (yyst[yysp-1]) {
            case 204: return 288;
            case 203: return 286;
            case 183: return 281;
            case 140: return 257;
            case 133: return 249;
            case 132: return 247;
            case 83: return 201;
            case 69: return 184;
            case 38: return 134;
            default: return 306;
        }
    }

    private int yyr83() { // float_proc : RUMBO
        yysp -= 1;
        switch (yyst[yysp-1]) {
            case 285: return 6;
            case 283: return 6;
            case 256: return 6;
            case 139: return 6;
            case 89: return 6;
            case 0: return 6;
            default: return 125;
        }
    }

    private int yyr97() { // float_proc1 : COS int_number
        { yyrv = Math.cos(((Integer)yysv[yysp-1])); }
        yysv[yysp-=2] = yyrv;
        return yypfloat_proc1();
    }

    private int yyr98() { // float_proc1 : COS float_number
        { yyrv = Math.cos(((Float)yysv[yysp-1])); }
        yysv[yysp-=2] = yyrv;
        return yypfloat_proc1();
    }

    private int yyr99() { // float_proc1 : MENOS float_number
        { yyrv = ((Float)yysv[yysp-1]) * -1; }
        yysv[yysp-=2] = yyrv;
        return yypfloat_proc1();
    }

    private int yyr100() { // float_proc1 : RAIZCUADRADA int_number
        { yyrv = Math.sqrt(((Integer)yysv[yysp-1])); }
        yysv[yysp-=2] = yyrv;
        return yypfloat_proc1();
    }

    private int yyr101() { // float_proc1 : RAIZCUADRADA float_number
        { yyrv = Math.sqrt(((Float)yysv[yysp-1])); }
        yysv[yysp-=2] = yyrv;
        return yypfloat_proc1();
    }

    private int yyr102() { // float_proc1 : RC int_number
        { yyrv = Math.sqrt(((Integer)yysv[yysp-1])); }
        yysv[yysp-=2] = yyrv;
        return yypfloat_proc1();
    }

    private int yyr103() { // float_proc1 : RC float_number
        { yyrv = Math.sqrt(((Float)yysv[yysp-1])); }
        yysv[yysp-=2] = yyrv;
        return yypfloat_proc1();
    }

    private int yyr104() { // float_proc1 : SENO int_number
        { yyrv = Math.sin(((Integer)yysv[yysp-1])); }
        yysv[yysp-=2] = yyrv;
        return yypfloat_proc1();
    }

    private int yyr105() { // float_proc1 : SENO float_number
        { yyrv = Math.sin(((Float)yysv[yysp-1])); }
        yysv[yysp-=2] = yyrv;
        return yypfloat_proc1();
    }

    private int yyr106() { // float_proc1 : SEN int_number
        { yyrv = Math.sin(((Integer)yysv[yysp-1])); }
        yysv[yysp-=2] = yyrv;
        return yypfloat_proc1();
    }

    private int yyr107() { // float_proc1 : SEN float_number
        { yyrv = Math.sin(((Float)yysv[yysp-1])); }
        yysv[yysp-=2] = yyrv;
        return yypfloat_proc1();
    }

    private int yypfloat_proc1() {
        switch (yyst[yysp-1]) {
            case 285: return 7;
            case 283: return 7;
            case 256: return 7;
            case 139: return 7;
            case 89: return 7;
            case 0: return 7;
            default: return 126;
        }
    }

    private int yyr130() { // float_proc2 : POTENCIA float_number int_number
        { yyrv = Math.pow(((Float)yysv[yysp-2]), ((Integer)yysv[yysp-1])); }
        yysv[yysp-=3] = yyrv;
        return yypfloat_proc2();
    }

    private int yyr131() { // float_proc2 : POTENCIA int_number float_number
        { yyrv = Math.pow(((Integer)yysv[yysp-2]), ((Float)yysv[yysp-1])); }
        yysv[yysp-=3] = yyrv;
        return yypfloat_proc2();
    }

    private int yyr132() { // float_proc2 : POTENCIA float_number float_number
        { yyrv = Math.pow(((Float)yysv[yysp-2]), ((Float)yysv[yysp-1])); }
        yysv[yysp-=3] = yyrv;
        return yypfloat_proc2();
    }

    private int yyr133() { // float_proc2 : DIVISION int_number int_number
        { yyrv = ((Integer)yysv[yysp-2]) / ((Integer)yysv[yysp-1]); }
        yysv[yysp-=3] = yyrv;
        return yypfloat_proc2();
    }

    private int yyr134() { // float_proc2 : DIVISION float_number int_number
        { yyrv = ((Float)yysv[yysp-2]) / ((Integer)yysv[yysp-1]); }
        yysv[yysp-=3] = yyrv;
        return yypfloat_proc2();
    }

    private int yyr135() { // float_proc2 : DIVISION int_number float_number
        { yyrv = ((Integer)yysv[yysp-2]) / ((Float)yysv[yysp-1]); }
        yysv[yysp-=3] = yyrv;
        return yypfloat_proc2();
    }

    private int yyr136() { // float_proc2 : DIVISION float_number float_number
        { yyrv = ((Float)yysv[yysp-2]) / ((Float)yysv[yysp-1]); }
        yysv[yysp-=3] = yyrv;
        return yypfloat_proc2();
    }

    private int yypfloat_proc2() {
        switch (yyst[yysp-1]) {
            case 285: return 8;
            case 283: return 8;
            case 256: return 8;
            case 139: return 8;
            case 89: return 8;
            case 0: return 8;
            default: return 127;
        }
    }

    private int yyr180() { // float_proc_1p : ELEMENTO int_number '[' float_params_n ']'
        yysp -= 5;
        switch (yyst[yysp-1]) {
            case 285: return 9;
            case 283: return 9;
            case 256: return 9;
            case 139: return 9;
            case 89: return 9;
            case 0: return 9;
            default: return 128;
        }
    }

    private int yyr159() { // float_proc_n : DIFERENCIA float_params_n
        yysp -= 2;
        return yypfloat_proc_n();
    }

    private int yyr160() { // float_proc_n : PRODUCTO float_params_n
        yysp -= 2;
        return yypfloat_proc_n();
    }

    private int yyr161() { // float_proc_n : SUMA float_params_n
        yysp -= 2;
        return yypfloat_proc_n();
    }

    private int yypfloat_proc_n() {
        switch (yyst[yysp-1]) {
            case 285: return 10;
            case 283: return 10;
            case 256: return 10;
            case 139: return 10;
            case 89: return 10;
            case 0: return 10;
            default: return 129;
        }
    }

    private int yyr170() { // float_proc_p : ELEGIR '[' float_params_n ']'
        yysp -= 4;
        return yypfloat_proc_p();
    }

    private int yyr171() { // float_proc_p : ULTIMO '[' float_params_n ']'
        yysp -= 4;
        return yypfloat_proc_p();
    }

    private int yyr172() { // float_proc_p : UL '[' float_params_n ']'
        yysp -= 4;
        return yypfloat_proc_p();
    }

    private int yyr173() { // float_proc_p : PRIMERO '[' float_params_n ']'
        yysp -= 4;
        return yypfloat_proc_p();
    }

    private int yypfloat_proc_p() {
        switch (yyst[yysp-1]) {
            case 285: return 11;
            case 283: return 11;
            case 256: return 11;
            case 139: return 11;
            case 89: return 11;
            case 0: return 11;
            default: return 130;
        }
    }

    private int yyr56() { // int_arithmetic_expr : int_number '+' int_number
        { yyrv = ((Integer)yysv[yysp-3]) + ((Integer)yysv[yysp-1]); System.out.println(yyrv); }
        yysv[yysp-=3] = yyrv;
        return yypint_arithmetic_expr();
    }

    private int yyr57() { // int_arithmetic_expr : int_number '-' int_number
        { yyrv = ((Integer)yysv[yysp-3]) - ((Integer)yysv[yysp-1]); System.out.println(yyrv); }
        yysv[yysp-=3] = yyrv;
        return yypint_arithmetic_expr();
    }

    private int yyr58() { // int_arithmetic_expr : int_number '*' int_number
        { yyrv = ((Integer)yysv[yysp-3]) * ((Integer)yysv[yysp-1]); System.out.println(yyrv); }
        yysv[yysp-=3] = yyrv;
        return yypint_arithmetic_expr();
    }

    private int yyr59() { // int_arithmetic_expr : '(' int_arithmetic_expr ')'
        { yyrv = ((Integer)yysv[yysp-2]); }
        yysv[yysp-=3] = yyrv;
        return yypint_arithmetic_expr();
    }

    private int yypint_arithmetic_expr() {
        switch (yyst[yysp-1]) {
            case 285: return 12;
            case 283: return 12;
            case 256: return 12;
            case 139: return 12;
            case 120: return 209;
            case 89: return 12;
            case 88: return 209;
            case 0: return 12;
            default: return 102;
        }
    }

    private int yyr25() { // int_number : INTEGER
        yysp -= 1;
        return yypint_number();
    }

    private int yyr26() { // int_number : IDENTIFIER
        { /* Obtener el valor de la variable */ }
        yysv[yysp-=1] = yyrv;
        return yypint_number();
    }

    private int yyr27() { // int_number : int_arithmetic_expr
        yysp -= 1;
        return yypint_number();
    }

    private int yyr28() { // int_number : int_proc1
        yysp -= 1;
        return yypint_number();
    }

    private int yyr29() { // int_number : int_proc2
        yysp -= 1;
        return yypint_number();
    }

    private int yyr30() { // int_number : int_proc_p
        yysp -= 1;
        return yypint_number();
    }

    private int yyr31() { // int_number : int_proc_1p
        yysp -= 1;
        return yypint_number();
    }

    private int yyr32() { // int_number : int_proc_n
        yysp -= 1;
        return yypint_number();
    }

    private int yypint_number() {
        switch (yyst[yysp-1]) {
            case 298: return 238;
            case 290: return 323;
            case 275: return 313;
            case 265: return 312;
            case 264: return 309;
            case 259: return 135;
            case 245: return 238;
            case 244: return 238;
            case 243: return 238;
            case 242: return 299;
            case 239: return 238;
            case 238: return 238;
            case 237: return 297;
            case 236: return 296;
            case 235: return 295;
            case 204: return 135;
            case 203: return 135;
            case 194: return 284;
            case 183: return 135;
            case 182: return 280;
            case 181: return 278;
            case 179: return 276;
            case 175: return 275;
            case 159: return 273;
            case 158: return 271;
            case 157: return 269;
            case 156: return 267;
            case 153: return 263;
            case 152: return 261;
            case 140: return 135;
            case 138: return 254;
            case 137: return 252;
            case 135: return 238;
            case 133: return 192;
            case 132: return 135;
            case 120: return 246;
            case 117: return 238;
            case 116: return 238;
            case 114: return 242;
            case 113: return 241;
            case 111: return 240;
            case 109: return 238;
            case 101: return 234;
            case 100: return 232;
            case 99: return 230;
            case 98: return 228;
            case 97: return 226;
            case 96: return 224;
            case 95: return 222;
            case 94: return 220;
            case 93: return 218;
            case 92: return 216;
            case 91: return 214;
            case 90: return 212;
            case 88: return 192;
            case 83: return 135;
            case 80: return 199;
            case 79: return 197;
            case 76: return 195;
            case 75: return 194;
            case 74: return 193;
            case 73: return 192;
            case 72: return 190;
            case 71: return 189;
            case 70: return 187;
            case 69: return 135;
            case 67: return 182;
            case 66: return 180;
            case 65: return 179;
            case 64: return 178;
            case 63: return 177;
            case 56: return 161;
            case 55: return 159;
            case 54: return 157;
            case 50: return 153;
            case 48: return 151;
            case 47: return 149;
            case 46: return 147;
            case 45: return 145;
            case 43: return 143;
            case 42: return 141;
            case 39: return 138;
            case 38: return 135;
            case 36: return 131;
            case 31: return 122;
            case 30: return 121;
            case 29: return 103;
            default: return 13;
        }
    }

    private int yyr152() { // int_params_n : int_number int_params_n
        yysp -= 2;
        return yypint_params_n();
    }

    private int yyr153() { // int_params_n : int_number
        yysp -= 1;
        return yypint_params_n();
    }

    private int yypint_params_n() {
        switch (yyst[yysp-1]) {
            case 245: return 289;
            case 244: return 287;
            case 243: return 282;
            case 239: return 258;
            case 238: return 250;
            case 204: return 289;
            case 203: return 287;
            case 183: return 282;
            case 140: return 258;
            case 135: return 250;
            case 132: return 248;
            case 117: return 202;
            case 116: return 185;
            case 109: return 136;
            case 83: return 202;
            case 69: return 185;
            case 38: return 136;
            default: return 307;
        }
    }

    private int yyr94() { // int_proc1 : REDONDEA float_number
        { yyrv = Math.rint(((Float)yysv[yysp-1])); }
        yysv[yysp-=2] = yyrv;
        return yypint_proc1();
    }

    private int yyr95() { // int_proc1 : AZAR int_number
        { Random ran = new Random(); yyrv = ran.nextInt(((Integer)yysv[yysp-1])); }
        yysv[yysp-=2] = yyrv;
        return yypint_proc1();
    }

    private int yyr96() { // int_proc1 : MENOS int_number
        { yyrv = ((Integer)yysv[yysp-1]) * -1; }
        yysv[yysp-=2] = yyrv;
        return yypint_proc1();
    }

    private int yypint_proc1() {
        switch (yyst[yysp-1]) {
            case 285: return 14;
            case 283: return 14;
            case 256: return 14;
            case 139: return 14;
            case 89: return 14;
            case 0: return 14;
            default: return 104;
        }
    }

    private int yyr128() { // int_proc2 : POTENCIA int_number int_number
        { yyrv = Math.pow(((Integer)yysv[yysp-2]), ((Integer)yysv[yysp-1])); }
        yysv[yysp-=3] = yyrv;
        return yypint_proc2();
    }

    private int yyr129() { // int_proc2 : RESTO int_number int_number
        { yyrv = ((Integer)yysv[yysp-2]) % ((Integer)yysv[yysp-1]); }
        yysv[yysp-=3] = yyrv;
        return yypint_proc2();
    }

    private int yypint_proc2() {
        switch (yyst[yysp-1]) {
            case 285: return 15;
            case 283: return 15;
            case 256: return 15;
            case 139: return 15;
            case 89: return 15;
            case 0: return 15;
            default: return 105;
        }
    }

    private int yyr179() { // int_proc_1p : ELEMENTO int_number '[' int_params_n ']'
        yysp -= 5;
        switch (yyst[yysp-1]) {
            case 285: return 16;
            case 283: return 16;
            case 256: return 16;
            case 139: return 16;
            case 89: return 16;
            case 0: return 16;
            default: return 106;
        }
    }

    private int yyr156() { // int_proc_n : DIFERENCIA int_params_n
        yysp -= 2;
        return yypint_proc_n();
    }

    private int yyr157() { // int_proc_n : PRODUCTO int_params_n
        yysp -= 2;
        return yypint_proc_n();
    }

    private int yyr158() { // int_proc_n : SUMA int_params_n
        yysp -= 2;
        return yypint_proc_n();
    }

    private int yypint_proc_n() {
        switch (yyst[yysp-1]) {
            case 285: return 17;
            case 283: return 17;
            case 256: return 17;
            case 139: return 17;
            case 89: return 17;
            case 0: return 17;
            default: return 107;
        }
    }

    private int yyr164() { // int_proc_p : ELEGIR '[' int_params_n ']'
        yysp -= 4;
        return yypint_proc_p();
    }

    private int yyr165() { // int_proc_p : CUENTA '[' int_params_n ']'
        yysp -= 4;
        return yypint_proc_p();
    }

    private int yyr166() { // int_proc_p : CUENTA '[' float_params_n ']'
        yysp -= 4;
        return yypint_proc_p();
    }

    private int yyr167() { // int_proc_p : ULTIMO '[' int_params_n ']'
        yysp -= 4;
        return yypint_proc_p();
    }

    private int yyr168() { // int_proc_p : UL '[' int_params_n ']'
        yysp -= 4;
        return yypint_proc_p();
    }

    private int yyr169() { // int_proc_p : PRIMERO '[' int_params_n ']'
        yysp -= 4;
        return yypint_proc_p();
    }

    private int yypint_proc_p() {
        switch (yyst[yysp-1]) {
            case 285: return 18;
            case 283: return 18;
            case 256: return 18;
            case 139: return 18;
            case 89: return 18;
            case 0: return 18;
            default: return 108;
        }
    }

    private int yyr47() { // logic_expr : int_number '<' int_number
        { yyrv = ((Integer)yysv[yysp-3]) < ((Integer)yysv[yysp-1]); }
        yysv[yysp-=3] = yyrv;
        return yyplogic_expr();
    }

    private int yyr48() { // logic_expr : float_number '<' int_number
        { yyrv = ((Float)yysv[yysp-3]) < ((Integer)yysv[yysp-1]); }
        yysv[yysp-=3] = yyrv;
        return yyplogic_expr();
    }

    private int yyr49() { // logic_expr : int_number '<' float_number
        { yyrv = ((Integer)yysv[yysp-3]) < ((Float)yysv[yysp-1]); }
        yysv[yysp-=3] = yyrv;
        return yyplogic_expr();
    }

    private int yyr50() { // logic_expr : float_number '<' float_number
        { yyrv = ((Float)yysv[yysp-3]) < ((Float)yysv[yysp-1]); }
        yysv[yysp-=3] = yyrv;
        return yyplogic_expr();
    }

    private int yyr51() { // logic_expr : int_number '>' int_number
        { yyrv = ((Integer)yysv[yysp-3]) > ((Integer)yysv[yysp-1]); }
        yysv[yysp-=3] = yyrv;
        return yyplogic_expr();
    }

    private int yyr52() { // logic_expr : float_number '>' int_number
        { yyrv = ((Float)yysv[yysp-3]) > ((Integer)yysv[yysp-1]); }
        yysv[yysp-=3] = yyrv;
        return yyplogic_expr();
    }

    private int yyr53() { // logic_expr : int_number '>' float_number
        { yyrv = ((Integer)yysv[yysp-3]) > ((Float)yysv[yysp-1]); }
        yysv[yysp-=3] = yyrv;
        return yyplogic_expr();
    }

    private int yyr54() { // logic_expr : float_number '>' float_number
        { yyrv = ((Float)yysv[yysp-3]) > ((Float)yysv[yysp-1]); }
        yysv[yysp-=3] = yyrv;
        return yyplogic_expr();
    }

    private int yyr55() { // logic_expr : bool_proc2
        yysp -= 1;
        return yyplogic_expr();
    }

    private int yyplogic_expr() {
        switch (yyst[yysp-1]) {
            case 206: return 291;
            case 162: return 274;
            case 87: return 206;
            case 81: return 200;
            case 57: return 162;
            default: return 19;
        }
    }

    private int yyr137() { // bool_proc2 : IGUALES int_number int_number
        { yyrv = ((Integer)yysv[yysp-2]).equals(((Integer)yysv[yysp-1])); }
        yysv[yysp-=3] = yyrv;
        return yypbool_proc2();
    }

    private int yyr138() { // bool_proc2 : IGUALES float_number int_number
        { yyrv = ((Float)yysv[yysp-2]).equals(((Integer)yysv[yysp-1])); }
        yysv[yysp-=3] = yyrv;
        return yypbool_proc2();
    }

    private int yyr139() { // bool_proc2 : IGUALES int_number float_number
        { yyrv = ((Integer)yysv[yysp-2]).equals(((Float)yysv[yysp-1])); }
        yysv[yysp-=3] = yyrv;
        return yypbool_proc2();
    }

    private int yyr140() { // bool_proc2 : IGUALES float_number float_number
        { yyrv = ((Float)yysv[yysp-2]).equals(((Float)yysv[yysp-1])); }
        yysv[yysp-=3] = yyrv;
        return yypbool_proc2();
    }

    private int yyr141() { // bool_proc2 : Y logic_expr logic_expr
        { yyrv = ((Boolean)yysv[yysp-2]) && ((Boolean)yysv[yysp-1]); }
        yysv[yysp-=3] = yyrv;
        return yypbool_proc2();
    }

    private int yyr142() { // bool_proc2 : O logic_expr logic_expr
        { yyrv = ((Boolean)yysv[yysp-2]) || ((Boolean)yysv[yysp-1]); }
        yysv[yysp-=3] = yyrv;
        return yypbool_proc2();
    }

    private int yyr143() { // bool_proc2 : MAYORQUE int_number int_number
        { yyrv = ((Integer)yysv[yysp-2]) > ((Integer)yysv[yysp-1]); }
        yysv[yysp-=3] = yyrv;
        return yypbool_proc2();
    }

    private int yyr144() { // bool_proc2 : MAYORQUE float_number int_number
        { yyrv = ((Float)yysv[yysp-2]) > ((Integer)yysv[yysp-1]); }
        yysv[yysp-=3] = yyrv;
        return yypbool_proc2();
    }

    private int yyr145() { // bool_proc2 : MAYORQUE int_number float_number
        { yyrv = ((Integer)yysv[yysp-2]) > ((Float)yysv[yysp-1]); }
        yysv[yysp-=3] = yyrv;
        return yypbool_proc2();
    }

    private int yyr146() { // bool_proc2 : MAYORQUE float_number float_number
        { yyrv = ((Float)yysv[yysp-2]) > ((Float)yysv[yysp-1]); }
        yysv[yysp-=3] = yyrv;
        return yypbool_proc2();
    }

    private int yyr147() { // bool_proc2 : MENORQUE int_number int_number
        { yyrv = ((Integer)yysv[yysp-2]) < ((Integer)yysv[yysp-1]); }
        yysv[yysp-=3] = yyrv;
        return yypbool_proc2();
    }

    private int yyr148() { // bool_proc2 : MENORQUE float_number int_number
        { yyrv = ((Float)yysv[yysp-2]) < ((Integer)yysv[yysp-1]); }
        yysv[yysp-=3] = yyrv;
        return yypbool_proc2();
    }

    private int yyr149() { // bool_proc2 : MENORQUE int_number float_number
        { yyrv = ((Integer)yysv[yysp-2]) < ((Float)yysv[yysp-1]); }
        yysv[yysp-=3] = yyrv;
        return yypbool_proc2();
    }

    private int yyr150() { // bool_proc2 : MENORQUE float_number float_number
        { yyrv = ((Float)yysv[yysp-2]) < ((Float)yysv[yysp-1]); }
        yysv[yysp-=3] = yyrv;
        return yypbool_proc2();
    }

    private int yypbool_proc2() {
        switch (yyst[yysp-1]) {
            case 206: return 163;
            case 162: return 163;
            case 87: return 163;
            case 81: return 163;
            case 57: return 163;
            default: return 20;
        }
    }

    private int yyr42() { // redeclaration_expr : INIC IDENTIFIER '=' int_number
        { /* Modificar el valor de la variable, verificando el tipo de dato */ }
        yysv[yysp-=4] = yyrv;
        return 21;
    }

    private int yyr43() { // redeclaration_expr : INIC IDENTIFIER '=' float_number
        { /* Modificar el valor de la variable, verificando el tipo de dato */ }
        yysv[yysp-=4] = yyrv;
        return 21;
    }

    private int yyr84() { // void_proc : OCULTATORTUGA
        yysp -= 1;
        return 22;
    }

    private int yyr85() { // void_proc : OT
        yysp -= 1;
        return 22;
    }

    private int yyr86() { // void_proc : APARECETORTUGA
        yysp -= 1;
        return 22;
    }

    private int yyr87() { // void_proc : AT
        yysp -= 1;
        return 22;
    }

    private int yyr88() { // void_proc : BAJALAPIZ
        yysp -= 1;
        return 22;
    }

    private int yyr89() { // void_proc : BL
        yysp -= 1;
        return 22;
    }

    private int yyr90() { // void_proc : SUBELAPIZ
        yysp -= 1;
        return 22;
    }

    private int yyr91() { // void_proc : SB
        yysp -= 1;
        return 22;
    }

    private int yyr92() { // void_proc : CENTRO
        yysp -= 1;
        return 22;
    }

    private int yyr93() { // void_proc : BORRAPANTALLA
        yysp -= 1;
        return 22;
    }

    private int yyr108() { // void_proc1 : AVANZA int_number
        yysp -= 2;
        return 23;
    }

    private int yyr109() { // void_proc1 : AV int_number
        yysp -= 2;
        return 23;
    }

    private int yyr110() { // void_proc1 : RETROCEDE int_number
        yysp -= 2;
        return 23;
    }

    private int yyr111() { // void_proc1 : RE int_number
        yysp -= 2;
        return 23;
    }

    private int yyr112() { // void_proc1 : GIRADERECHA int_number
        yysp -= 2;
        return 23;
    }

    private int yyr113() { // void_proc1 : GIRADERECHA float_number
        yysp -= 2;
        return 23;
    }

    private int yyr114() { // void_proc1 : GD int_number
        yysp -= 2;
        return 23;
    }

    private int yyr115() { // void_proc1 : GD float_number
        yysp -= 2;
        return 23;
    }

    private int yyr116() { // void_proc1 : GIRAIZQUIERDA int_number
        yysp -= 2;
        return 23;
    }

    private int yyr117() { // void_proc1 : GIRAIZQUIERDA float_number
        yysp -= 2;
        return 23;
    }

    private int yyr118() { // void_proc1 : GI int_number
        yysp -= 2;
        return 23;
    }

    private int yyr119() { // void_proc1 : GI float_number
        yysp -= 2;
        return 23;
    }

    private int yyr120() { // void_proc1 : PONRUMBO int_number
        yysp -= 2;
        return 23;
    }

    private int yyr121() { // void_proc1 : PONRUMBO float_number
        yysp -= 2;
        return 23;
    }

    private int yyr122() { // void_proc1 : PONX int_number
        yysp -= 2;
        return 23;
    }

    private int yyr123() { // void_proc1 : PONY int_number
        yysp -= 2;
        return 23;
    }

    private int yyr124() { // void_proc1 : PONCOLORLAPIZ color
        yysp -= 2;
        return 23;
    }

    private int yyr125() { // void_proc1 : PONCL color
        yysp -= 2;
        return 23;
    }

    private int yyr126() { // void_proc1 : ESPERA int_number
        yysp -= 2;
        return 23;
    }

    private int yyr127() { // void_proc1 : ESPERA float_number
        yysp -= 2;
        return 23;
    }

    private int yyr151() { // void_proc2 : PONXY int_number int_number
        yysp -= 3;
        return 24;
    }

    private int yyr181() { // void_proc_1p : REPITE int_number '[' expr_procs_n ']'
        yysp -= 5;
        return 25;
    }

    private int yyr182() { // void_proc_1p : SI logic_expr '[' expr_procs_n ']'
        yysp -= 5;
        return 25;
    }

    private int yyr174() { // void_proc_p : INC '[' IDENTIFIER ']'
        yysp -= 4;
        return 26;
    }

    private int yyr175() { // void_proc_p : INC '[' IDENTIFIER int_number ']'
        yysp -= 5;
        return 26;
    }

    private int yyr176() { // void_proc_p : INC '[' IDENTIFIER float_number ']'
        yysp -= 5;
        return 26;
    }

    private int yyr177() { // void_proc_p : PONPOS '[' int_number int_number ']'
        yysp -= 5;
        return 26;
    }

    private int yyr178() { // void_proc_p : EJECUTA '[' expr_procs_n ']'
        yysp -= 4;
        return 26;
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
        System.out.println("En " + lexer.getSemantic() + ", línea " + (lexer.getCurrentLine() + 1) + ". columna " + (lexer.getCurrentColumn() + 1));
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

    public String getRutaCompilado(String filePath) {

        String rutaCompilado = filePath.substring(0, filePath.lastIndexOf(".") + 1) + "cld";

        String compilado = "Compilado 1"; // TODO obtener el string con el json de las acciones
        try {
            File file = new File(rutaCompilado);
            file.createNewFile();
            System.out.println("File compiled created: " + file.getName());
            FileWriter writer = new FileWriter(rutaCompilado);
            writer.write(compilado);
            writer.close();
            return rutaCompilado;
        } catch (IOException ex) {
            System.out.println("An error ocurred");
        }

        return "";
    }

    public static String compile(String filePath) {
        String ruta = filePath.replaceAll("\\\\", "/");
        Parser parser = new Parser(ruta);
        parser.parse();
        String rutaCompilado = parser.getRutaCompilado(filePath);

        return rutaCompilado;
    }

    /*
    String nuevaRuta = Parser.compile("/home/villegas/archivo.ldr");
    */

    public static void main(String[] args) {
           //TODO: recibir ruta desde args.
           String path = "/src/Compiler/Lex/parse.txt";
           String ruta  = System.getProperty("user.dir").replaceAll("\\\\", "/") + path;
           //Parser parser = new Parser(ruta);
           //parser.parse();
        compile(System.getProperty("user.dir") + path);
       }

}
