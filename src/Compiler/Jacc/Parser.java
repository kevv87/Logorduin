// Output created by jacc on Wed Jul 29 17:25:49 CST 2020

package Compiler.Jacc;

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
                case 340:
                    yyn = yys0();
                    continue;

                case 1:
                    yyst[yysp] = 1;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 341:
                    switch (yytok) {
                        case ENDINPUT:
                            yyn = 680;
                            continue;
                    }
                    yyn = 683;
                    continue;

                case 2:
                    yyst[yysp] = 2;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 342:
                    yyn = yys2();
                    continue;

                case 3:
                    yyst[yysp] = 3;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 343:
                    switch (yytok) {
                        case ';':
                            yyn = 95;
                            continue;
                    }
                    yyn = 683;
                    continue;

                case 4:
                    yyst[yysp] = 4;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 344:
                    yyn = yys4();
                    continue;

                case 5:
                    yyst[yysp] = 5;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 345:
                    yyn = yys5();
                    continue;

                case 6:
                    yyst[yysp] = 6;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 346:
                    yyn = yys6();
                    continue;

                case 7:
                    yyst[yysp] = 7;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 347:
                    yyn = yys7();
                    continue;

                case 8:
                    yyst[yysp] = 8;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 348:
                    yyn = yys8();
                    continue;

                case 9:
                    yyst[yysp] = 9;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 349:
                    yyn = yys9();
                    continue;

                case 10:
                    yyst[yysp] = 10;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 350:
                    yyn = yys10();
                    continue;

                case 11:
                    yyst[yysp] = 11;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 351:
                    yyn = yys11();
                    continue;

                case 12:
                    yyst[yysp] = 12;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 352:
                    yyn = yys12();
                    continue;

                case 13:
                    yyst[yysp] = 13;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 353:
                    yyn = yys13();
                    continue;

                case 14:
                    yyst[yysp] = 14;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 354:
                    yyn = yys14();
                    continue;

                case 15:
                    yyst[yysp] = 15;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 355:
                    yyn = yys15();
                    continue;

                case 16:
                    yyst[yysp] = 16;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 356:
                    yyn = yys16();
                    continue;

                case 17:
                    yyst[yysp] = 17;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 357:
                    yyn = yys17();
                    continue;

                case 18:
                    yyst[yysp] = 18;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 358:
                    yyn = yys18();
                    continue;

                case 19:
                    yyst[yysp] = 19;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 359:
                    yyn = yys19();
                    continue;

                case 20:
                    yyst[yysp] = 20;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 360:
                    switch (yytok) {
                        case '[':
                            yyn = 108;
                            continue;
                    }
                    yyn = 683;
                    continue;

                case 21:
                    yyst[yysp] = 21;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 361:
                    switch (yytok) {
                        case ENDINPUT:
                            yyn = yyr1();
                            continue;
                    }
                    yyn = 683;
                    continue;

                case 22:
                    yyst[yysp] = 22;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 362:
                    yyn = yys22();
                    continue;

                case 23:
                    yyst[yysp] = 23;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 363:
                    yyn = yys23();
                    continue;

                case 24:
                    yyst[yysp] = 24;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 364:
                    yyn = yys24();
                    continue;

                case 25:
                    yyst[yysp] = 25;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 365:
                    yyn = yys25();
                    continue;

                case 26:
                    yyst[yysp] = 26;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 366:
                    yyn = yys26();
                    continue;

                case 27:
                    yyst[yysp] = 27;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 367:
                    yyn = yys27();
                    continue;

                case 28:
                    yyst[yysp] = 28;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 368:
                    yyn = yys28();
                    continue;

                case 29:
                    yyst[yysp] = 29;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 369:
                    yyn = yys29();
                    continue;

                case 30:
                    yyst[yysp] = 30;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 370:
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
                case 371:
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
                case 372:
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
                case 373:
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
                case 374:
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
                case 375:
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
                case 376:
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
                case 377:
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
                case 378:
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
                case 379:
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
                case 380:
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
                case 381:
                    switch (yytok) {
                        case '[':
                            yyn = 143;
                            continue;
                    }
                    yyn = 683;
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
                case 382:
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
                case 383:
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
                case 384:
                    switch (yytok) {
                        case '[':
                            yyn = yyr194();
                            continue;
                    }
                    yyn = 683;
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
                case 385:
                    switch (yytok) {
                        case '[':
                            yyn = 150;
                            continue;
                    }
                    yyn = 683;
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
                case 386:
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
                case 387:
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
                case 388:
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
                case 389:
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
                case 390:
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
                case 391:
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
                case 392:
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
                case 393:
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
                case 394:
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
                case 395:
                    switch (yytok) {
                        case '[':
                            yyn = 164;
                            continue;
                    }
                    yyn = 683;
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
                case 396:
                    switch (yytok) {
                        case IDENTIFIER:
                            yyn = 165;
                            continue;
                    }
                    yyn = 683;
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
                case 397:
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
                case 398:
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
                case 399:
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
                case 400:
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
                case 401:
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
                case 402:
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
                case 403:
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
                case 404:
                    switch (yytok) {
                        case PROCEDURE_NAME:
                            yyn = 174;
                            continue;
                    }
                    yyn = 683;
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
                case 405:
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
                case 406:
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
                case 407:
                    switch (yytok) {
                        case '[':
                            yyn = 186;
                            continue;
                    }
                    yyn = 683;
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
                case 408:
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
                case 409:
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
                case 410:
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
                case 411:
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
                case 412:
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
                case 413:
                    switch (yytok) {
                        case '[':
                            yyn = 194;
                            continue;
                    }
                    yyn = 683;
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
                case 414:
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
                case 415:
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
                case 416:
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
                case 417:
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
                case 418:
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
                case 419:
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
                case 420:
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
                case 421:
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
                case 422:
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
                case 423:
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
                case 424:
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
                case 425:
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
                case 426:
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
                case 427:
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
                case 428:
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
                case 429:
                    switch (yytok) {
                        case '[':
                            yyn = 214;
                            continue;
                    }
                    yyn = 683;
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
                case 430:
                    switch (yytok) {
                        case '[':
                            yyn = 215;
                            continue;
                    }
                    yyn = 683;
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
                case 431:
                    switch (yytok) {
                        case IDENTIFIER:
                            yyn = 216;
                            continue;
                    }
                    yyn = 683;
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
                case 432:
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
                case 433:
                    yyn = yys93();
                    continue;

                case 94:
                    yyst[yysp] = 94;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 434:
                    switch (yytok) {
                        case ENDINPUT:
                            yyn = yyr3();
                            continue;
                    }
                    yyn = 683;
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
                case 435:
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
                case 436:
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
                case 437:
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
                case 438:
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
                case 439:
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
                case 440:
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
                case 441:
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
                case 442:
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
                case 443:
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
                case 444:
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
                case 445:
                    yyn = yys105();
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
                case 446:
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
                case 447:
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
                case 448:
                    yyn = yys108();
                    continue;

                case 109:
                    yyst[yysp] = 109;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 449:
                    yyn = yys109();
                    continue;

                case 110:
                    yyst[yysp] = 110;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 450:
                    switch (yytok) {
                        case FIN:
                            yyn = 249;
                            continue;
                    }
                    yyn = 683;
                    continue;

                case 111:
                    yyst[yysp] = 111;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 451:
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
                case 452:
                    yyn = yys112();
                    continue;

                case 113:
                    yyst[yysp] = 113;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 453:
                    yyn = yys113();
                    continue;

                case 114:
                    yyst[yysp] = 114;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 454:
                    yyn = yys114();
                    continue;

                case 115:
                    yyst[yysp] = 115;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 455:
                    yyn = yys115();
                    continue;

                case 116:
                    yyst[yysp] = 116;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 456:
                    yyn = yys116();
                    continue;

                case 117:
                    yyst[yysp] = 117;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 457:
                    yyn = yys117();
                    continue;

                case 118:
                    yyst[yysp] = 118;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 458:
                    yyn = yys118();
                    continue;

                case 119:
                    yyst[yysp] = 119;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 459:
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
                case 460:
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
                case 461:
                    switch (yytok) {
                        case '[':
                            yyn = 256;
                            continue;
                    }
                    yyn = 683;
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
                case 462:
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
                case 463:
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
                case 464:
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
                case 465:
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
                case 466:
                    switch (yytok) {
                        case '[':
                            yyn = 260;
                            continue;
                    }
                    yyn = 683;
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
                case 467:
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
                case 468:
                    yyn = yys128();
                    continue;

                case 129:
                    yyst[yysp] = 129;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.getNextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 469:
                    switch (yytok) {
                        case '[':
                            yyn = 261;
                            continue;
                    }
                    yyn = 683;
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
                case 470:
                    switch (yytok) {
                        case '[':
                            yyn = 262;
                            continue;
                    }
                    yyn = 683;
                    continue;

                case 131:
                    yyst[yysp] = 131;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.getNextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 471:
                    yyn = yys131();
                    continue;

                case 132:
                    yyst[yysp] = 132;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 472:
                    yyn = yys132();
                    continue;

                case 133:
                    yyst[yysp] = 133;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 473:
                    yyn = yys133();
                    continue;

                case 134:
                    yyst[yysp] = 134;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 474:
                    yyn = yys134();
                    continue;

                case 135:
                    yyst[yysp] = 135;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 475:
                    yyn = yys135();
                    continue;

                case 136:
                    yyst[yysp] = 136;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 476:
                    yyn = yys136();
                    continue;

                case 137:
                    yyst[yysp] = 137;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 477:
                    yyn = yys137();
                    continue;

                case 138:
                    yyst[yysp] = 138;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 478:
                    yyn = yys138();
                    continue;

                case 139:
                    yyst[yysp] = 139;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 479:
                    yyn = yys139();
                    continue;

                case 140:
                    yyst[yysp] = 140;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 480:
                    yyn = yys140();
                    continue;

                case 141:
                    yyst[yysp] = 141;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 481:
                    yyn = yys141();
                    continue;

                case 142:
                    yyst[yysp] = 142;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 482:
                    yyn = yys142();
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
                case 483:
                    yyn = yys143();
                    continue;

                case 144:
                    yyst[yysp] = 144;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 484:
                    yyn = yys144();
                    continue;

                case 145:
                    yyst[yysp] = 145;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 485:
                    yyn = yys145();
                    continue;

                case 146:
                    yyst[yysp] = 146;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 486:
                    yyn = yys146();
                    continue;

                case 147:
                    yyst[yysp] = 147;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 487:
                    yyn = yys147();
                    continue;

                case 148:
                    yyst[yysp] = 148;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 488:
                    yyn = yys148();
                    continue;

                case 149:
                    yyst[yysp] = 149;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 489:
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
                case 490:
                    yyn = yys150();
                    continue;

                case 151:
                    yyst[yysp] = 151;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 491:
                    switch (yytok) {
                        case '*':
                            yyn = 252;
                            continue;
                        case '+':
                            yyn = 253;
                            continue;
                        case '-':
                            yyn = 254;
                            continue;
                        case '[':
                            yyn = 274;
                            continue;
                    }
                    yyn = 683;
                    continue;

                case 152:
                    yyst[yysp] = 152;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 492:
                    yyn = yys152();
                    continue;

                case 153:
                    yyst[yysp] = 153;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 493:
                    yyn = yys153();
                    continue;

                case 154:
                    yyst[yysp] = 154;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 494:
                    yyn = yys154();
                    continue;

                case 155:
                    yyst[yysp] = 155;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 495:
                    yyn = yys155();
                    continue;

                case 156:
                    yyst[yysp] = 156;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 496:
                    yyn = yys156();
                    continue;

                case 157:
                    yyst[yysp] = 157;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 497:
                    yyn = yys157();
                    continue;

                case 158:
                    yyst[yysp] = 158;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 498:
                    yyn = yys158();
                    continue;

                case 159:
                    yyst[yysp] = 159;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 499:
                    yyn = yys159();
                    continue;

                case 160:
                    yyst[yysp] = 160;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 500:
                    yyn = yys160();
                    continue;

                case 161:
                    yyst[yysp] = 161;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 501:
                    yyn = yys161();
                    continue;

                case 162:
                    yyst[yysp] = 162;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 502:
                    yyn = yys162();
                    continue;

                case 163:
                    yyst[yysp] = 163;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 503:
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
                case 504:
                    switch (yytok) {
                        case IDENTIFIER:
                            yyn = 279;
                            continue;
                    }
                    yyn = 683;
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
                case 505:
                    switch (yytok) {
                        case '=':
                            yyn = 280;
                            continue;
                    }
                    yyn = 683;
                    continue;

                case 166:
                    yyst[yysp] = 166;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 506:
                    yyn = yys166();
                    continue;

                case 167:
                    yyst[yysp] = 167;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 507:
                    yyn = yys167();
                    continue;

                case 168:
                    yyst[yysp] = 168;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 508:
                    yyn = yys168();
                    continue;

                case 169:
                    yyst[yysp] = 169;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 509:
                    yyn = yys169();
                    continue;

                case 170:
                    yyst[yysp] = 170;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 510:
                    yyn = yys170();
                    continue;

                case 171:
                    yyst[yysp] = 171;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 511:
                    yyn = yys171();
                    continue;

                case 172:
                    yyst[yysp] = 172;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 512:
                    yyn = yys172();
                    continue;

                case 173:
                    yyst[yysp] = 173;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 513:
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
                case 514:
                    yyn = yys174();
                    continue;

                case 175:
                    yyst[yysp] = 175;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 515:
                    yyn = yys175();
                    continue;

                case 176:
                    yyst[yysp] = 176;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.getNextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 516:
                    yyn = yys176();
                    continue;

                case 177:
                    yyst[yysp] = 177;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.getNextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 517:
                    yyn = yys177();
                    continue;

                case 178:
                    yyst[yysp] = 178;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.getNextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 518:
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
                case 519:
                    yyn = yys179();
                    continue;

                case 180:
                    yyst[yysp] = 180;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.getNextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 520:
                    yyn = yys180();
                    continue;

                case 181:
                    yyst[yysp] = 181;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.getNextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 521:
                    yyn = yys181();
                    continue;

                case 182:
                    yyst[yysp] = 182;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.getNextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 522:
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
                case 523:
                    yyn = yys183();
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
                case 524:
                    yyn = yys184();
                    continue;

                case 185:
                    yyst[yysp] = 185;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 525:
                    yyn = yys185();
                    continue;

                case 186:
                    yyst[yysp] = 186;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.getNextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 526:
                    yyn = yys186();
                    continue;

                case 187:
                    yyst[yysp] = 187;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 527:
                    yyn = yys187();
                    continue;

                case 188:
                    yyst[yysp] = 188;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 528:
                    yyn = yys188();
                    continue;

                case 189:
                    yyst[yysp] = 189;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 529:
                    yyn = yys189();
                    continue;

                case 190:
                    yyst[yysp] = 190;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 530:
                    yyn = yys190();
                    continue;

                case 191:
                    yyst[yysp] = 191;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 531:
                    yyn = yys191();
                    continue;

                case 192:
                    yyst[yysp] = 192;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 532:
                    yyn = yys192();
                    continue;

                case 193:
                    yyst[yysp] = 193;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 533:
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
                case 534:
                    yyn = yys194();
                    continue;

                case 195:
                    yyst[yysp] = 195;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 535:
                    yyn = yys195();
                    continue;

                case 196:
                    yyst[yysp] = 196;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 536:
                    yyn = yys196();
                    continue;

                case 197:
                    yyst[yysp] = 197;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 537:
                    yyn = yys197();
                    continue;

                case 198:
                    yyst[yysp] = 198;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 538:
                    yyn = yys198();
                    continue;

                case 199:
                    yyst[yysp] = 199;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 539:
                    yyn = yys199();
                    continue;

                case 200:
                    yyst[yysp] = 200;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 540:
                    yyn = yys200();
                    continue;

                case 201:
                    yyst[yysp] = 201;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 541:
                    yyn = yys201();
                    continue;

                case 202:
                    yyst[yysp] = 202;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 542:
                    yyn = yys202();
                    continue;

                case 203:
                    yyst[yysp] = 203;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 543:
                    switch (yytok) {
                        case '*':
                            yyn = 102;
                            continue;
                        case '+':
                            yyn = 103;
                            continue;
                        case '-':
                            yyn = 104;
                            continue;
                        case '/':
                            yyn = 105;
                            continue;
                    }
                    yyn = 683;
                    continue;

                case 204:
                    yyst[yysp] = 204;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 544:
                    switch (yytok) {
                        case '*':
                            yyn = 252;
                            continue;
                        case '+':
                            yyn = 253;
                            continue;
                        case '-':
                            yyn = 254;
                            continue;
                        case '[':
                            yyn = yyr192();
                            continue;
                    }
                    yyn = 683;
                    continue;

                case 205:
                    yyst[yysp] = 205;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 545:
                    yyn = yys205();
                    continue;

                case 206:
                    yyst[yysp] = 206;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 546:
                    yyn = yys206();
                    continue;

                case 207:
                    yyst[yysp] = 207;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 547:
                    yyn = yys207();
                    continue;

                case 208:
                    yyst[yysp] = 208;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 548:
                    yyn = yys208();
                    continue;

                case 209:
                    yyst[yysp] = 209;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 549:
                    yyn = yys209();
                    continue;

                case 210:
                    yyst[yysp] = 210;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 550:
                    yyn = yys210();
                    continue;

                case 211:
                    yyst[yysp] = 211;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 551:
                    switch (yytok) {
                        case '[':
                            yyn = yyr193();
                            continue;
                    }
                    yyn = 683;
                    continue;

                case 212:
                    yyst[yysp] = 212;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 552:
                    yyn = yys212();
                    continue;

                case 213:
                    yyst[yysp] = 213;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 553:
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
                case 554:
                    yyn = yys214();
                    continue;

                case 215:
                    yyst[yysp] = 215;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.getNextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 555:
                    yyn = yys215();
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
                case 556:
                    yyn = yys216();
                    continue;

                case 217:
                    yyst[yysp] = 217;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 557:
                    yyn = yys217();
                    continue;

                case 218:
                    yyst[yysp] = 218;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 558:
                    switch (yytok) {
                        case ')':
                            yyn = 305;
                            continue;
                        case '/':
                        case '-':
                        case '+':
                        case '*':
                            yyn = yyr45();
                            continue;
                    }
                    yyn = 683;
                    continue;

                case 219:
                    yyst[yysp] = 219;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 559:
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
                    yyn = 683;
                    continue;

                case 220:
                    yyst[yysp] = 220;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 560:
                    switch (yytok) {
                        case ')':
                            yyn = 306;
                            continue;
                        case '/':
                        case '-':
                        case '+':
                        case '*':
                            yyn = yyr37();
                            continue;
                    }
                    yyn = 683;
                    continue;

                case 221:
                    yyst[yysp] = 221;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 561:
                    switch (yytok) {
                        case ENDINPUT:
                            yyn = yyr2();
                            continue;
                    }
                    yyn = 683;
                    continue;

                case 222:
                    yyst[yysp] = 222;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 562:
                    yyn = yys222();
                    continue;

                case 223:
                    yyst[yysp] = 223;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 563:
                    yyn = yys223();
                    continue;

                case 224:
                    yyst[yysp] = 224;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 564:
                    yyn = yys224();
                    continue;

                case 225:
                    yyst[yysp] = 225;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 565:
                    yyn = yys225();
                    continue;

                case 226:
                    yyst[yysp] = 226;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 566:
                    yyn = yys226();
                    continue;

                case 227:
                    yyst[yysp] = 227;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 567:
                    yyn = yys227();
                    continue;

                case 228:
                    yyst[yysp] = 228;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 568:
                    yyn = yys228();
                    continue;

                case 229:
                    yyst[yysp] = 229;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 569:
                    yyn = yys229();
                    continue;

                case 230:
                    yyst[yysp] = 230;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 570:
                    yyn = yys230();
                    continue;

                case 231:
                    yyst[yysp] = 231;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 571:
                    yyn = yys231();
                    continue;

                case 232:
                    yyst[yysp] = 232;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 572:
                    yyn = yys232();
                    continue;

                case 233:
                    yyst[yysp] = 233;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 573:
                    yyn = yys233();
                    continue;

                case 234:
                    yyst[yysp] = 234;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 574:
                    yyn = yys234();
                    continue;

                case 235:
                    yyst[yysp] = 235;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 575:
                    yyn = yys235();
                    continue;

                case 236:
                    yyst[yysp] = 236;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 576:
                    yyn = yys236();
                    continue;

                case 237:
                    yyst[yysp] = 237;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 577:
                    yyn = yys237();
                    continue;

                case 238:
                    yyst[yysp] = 238;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 578:
                    yyn = yys238();
                    continue;

                case 239:
                    yyst[yysp] = 239;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 579:
                    yyn = yys239();
                    continue;

                case 240:
                    yyst[yysp] = 240;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 580:
                    yyn = yys240();
                    continue;

                case 241:
                    yyst[yysp] = 241;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 581:
                    yyn = yys241();
                    continue;

                case 242:
                    yyst[yysp] = 242;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 582:
                    yyn = yys242();
                    continue;

                case 243:
                    yyst[yysp] = 243;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 583:
                    yyn = yys243();
                    continue;

                case 244:
                    yyst[yysp] = 244;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 584:
                    yyn = yys244();
                    continue;

                case 245:
                    yyst[yysp] = 245;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 585:
                    yyn = yys245();
                    continue;

                case 246:
                    yyst[yysp] = 246;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 586:
                    switch (yytok) {
                        case ']':
                            yyn = 307;
                            continue;
                    }
                    yyn = 683;
                    continue;

                case 247:
                    yyst[yysp] = 247;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 587:
                    yyn = yys247();
                    continue;

                case 248:
                    yyst[yysp] = 248;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 588:
                    switch (yytok) {
                        case FIN:
                            yyn = yyr30();
                            continue;
                    }
                    yyn = 683;
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
                case 589:
                    yyn = yys249();
                    continue;

                case 250:
                    yyst[yysp] = 250;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 590:
                    switch (yytok) {
                        case FIN:
                            yyn = 309;
                            continue;
                    }
                    yyn = 683;
                    continue;

                case 251:
                    yyst[yysp] = 251;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 591:
                    yyn = yys251();
                    continue;

                case 252:
                    yyst[yysp] = 252;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.getNextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 592:
                    yyn = yys252();
                    continue;

                case 253:
                    yyst[yysp] = 253;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.getNextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 593:
                    yyn = yys253();
                    continue;

                case 254:
                    yyst[yysp] = 254;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.getNextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 594:
                    yyn = yys254();
                    continue;

                case 255:
                    yyst[yysp] = 255;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 595:
                    yyn = yys255();
                    continue;

                case 256:
                    yyst[yysp] = 256;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.getNextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 596:
                    yyn = yys256();
                    continue;

                case 257:
                    yyst[yysp] = 257;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 597:
                    switch (yytok) {
                        case '*':
                            yyn = 252;
                            continue;
                        case '+':
                            yyn = 253;
                            continue;
                        case '-':
                            yyn = 254;
                            continue;
                        case '[':
                            yyn = 313;
                            continue;
                    }
                    yyn = 683;
                    continue;

                case 258:
                    yyst[yysp] = 258;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 598:
                    yyn = yys258();
                    continue;

                case 259:
                    yyst[yysp] = 259;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 599:
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
                case 600:
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
                case 601:
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
                case 602:
                    yyn = yys262();
                    continue;

                case 263:
                    yyst[yysp] = 263;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 603:
                    switch (yytok) {
                        case '*':
                            yyn = 252;
                            continue;
                        case '+':
                            yyn = 253;
                            continue;
                        case '-':
                            yyn = 254;
                            continue;
                    }
                    yyn = 683;
                    continue;

                case 264:
                    yyst[yysp] = 264;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 604:
                    switch (yytok) {
                        case ']':
                            yyn = 315;
                            continue;
                    }
                    yyn = 683;
                    continue;

                case 265:
                    yyst[yysp] = 265;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 605:
                    switch (yytok) {
                        case ']':
                            yyn = 316;
                            continue;
                    }
                    yyn = 683;
                    continue;

                case 266:
                    yyst[yysp] = 266;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 606:
                    yyn = yys266();
                    continue;

                case 267:
                    yyst[yysp] = 267;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 607:
                    yyn = yys267();
                    continue;

                case 268:
                    yyst[yysp] = 268;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 608:
                    yyn = yys268();
                    continue;

                case 269:
                    yyst[yysp] = 269;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 609:
                    yyn = yys269();
                    continue;

                case 270:
                    yyst[yysp] = 270;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 610:
                    yyn = yys270();
                    continue;

                case 271:
                    yyst[yysp] = 271;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 611:
                    yyn = yys271();
                    continue;

                case 272:
                    yyst[yysp] = 272;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 612:
                    switch (yytok) {
                        case ']':
                            yyn = 317;
                            continue;
                    }
                    yyn = 683;
                    continue;

                case 273:
                    yyst[yysp] = 273;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 613:
                    switch (yytok) {
                        case ']':
                            yyn = 318;
                            continue;
                    }
                    yyn = 683;
                    continue;

                case 274:
                    yyst[yysp] = 274;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.getNextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 614:
                    yyn = yys274();
                    continue;

                case 275:
                    yyst[yysp] = 275;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 615:
                    yyn = yys275();
                    continue;

                case 276:
                    yyst[yysp] = 276;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 616:
                    yyn = yys276();
                    continue;

                case 277:
                    yyst[yysp] = 277;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 617:
                    yyn = yys277();
                    continue;

                case 278:
                    yyst[yysp] = 278;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 618:
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
                case 619:
                    yyn = yys279();
                    continue;

                case 280:
                    yyst[yysp] = 280;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.getNextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 620:
                    yyn = yys280();
                    continue;

                case 281:
                    yyst[yysp] = 281;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 621:
                    yyn = yys281();
                    continue;

                case 282:
                    yyst[yysp] = 282;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 622:
                    yyn = yys282();
                    continue;

                case 283:
                    yyst[yysp] = 283;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 623:
                    yyn = yys283();
                    continue;

                case 284:
                    yyst[yysp] = 284;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 624:
                    yyn = yys284();
                    continue;

                case 285:
                    yyst[yysp] = 285;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 625:
                    yyn = yys285();
                    continue;

                case 286:
                    yyst[yysp] = 286;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 626:
                    yyn = yys286();
                    continue;

                case 287:
                    yyst[yysp] = 287;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 627:
                    yyn = yys287();
                    continue;

                case 288:
                    yyst[yysp] = 288;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 628:
                    yyn = yys288();
                    continue;

                case 289:
                    yyst[yysp] = 289;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 629:
                    yyn = yys289();
                    continue;

                case 290:
                    yyst[yysp] = 290;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 630:
                    yyn = yys290();
                    continue;

                case 291:
                    yyst[yysp] = 291;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 631:
                    yyn = yys291();
                    continue;

                case 292:
                    yyst[yysp] = 292;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 632:
                    yyn = yys292();
                    continue;

                case 293:
                    yyst[yysp] = 293;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 633:
                    yyn = yys293();
                    continue;

                case 294:
                    yyst[yysp] = 294;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 634:
                    yyn = yys294();
                    continue;

                case 295:
                    yyst[yysp] = 295;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 635:
                    yyn = yys295();
                    continue;

                case 296:
                    yyst[yysp] = 296;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 636:
                    switch (yytok) {
                        case ']':
                            yyn = 327;
                            continue;
                    }
                    yyn = 683;
                    continue;

                case 297:
                    yyst[yysp] = 297;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 637:
                    switch (yytok) {
                        case ']':
                            yyn = 328;
                            continue;
                    }
                    yyn = 683;
                    continue;

                case 298:
                    yyst[yysp] = 298;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 638:
                    yyn = yys298();
                    continue;

                case 299:
                    yyst[yysp] = 299;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 639:
                    switch (yytok) {
                        case ']':
                            yyn = 329;
                            continue;
                    }
                    yyn = 683;
                    continue;

                case 300:
                    yyst[yysp] = 300;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 640:
                    switch (yytok) {
                        case ']':
                            yyn = 330;
                            continue;
                    }
                    yyn = 683;
                    continue;

                case 301:
                    yyst[yysp] = 301;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 641:
                    switch (yytok) {
                        case ']':
                            yyn = 331;
                            continue;
                    }
                    yyn = 683;
                    continue;

                case 302:
                    yyst[yysp] = 302;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 642:
                    switch (yytok) {
                        case ']':
                            yyn = 332;
                            continue;
                    }
                    yyn = 683;
                    continue;

                case 303:
                    yyst[yysp] = 303;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.getNextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 643:
                    yyn = yys303();
                    continue;

                case 304:
                    yyst[yysp] = 304;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 644:
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
                case 645:
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
                case 646:
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
                case 647:
                    yyn = yys307();
                    continue;

                case 308:
                    yyst[yysp] = 308;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 648:
                    switch (yytok) {
                        case ']':
                            yyn = yyr172();
                            continue;
                    }
                    yyn = 683;
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
                case 649:
                    yyn = yys309();
                    continue;

                case 310:
                    yyst[yysp] = 310;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 650:
                    yyn = yys310();
                    continue;

                case 311:
                    yyst[yysp] = 311;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 651:
                    yyn = yys311();
                    continue;

                case 312:
                    yyst[yysp] = 312;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 652:
                    yyn = yys312();
                    continue;

                case 313:
                    yyst[yysp] = 313;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.getNextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 653:
                    yyn = yys313();
                    continue;

                case 314:
                    yyst[yysp] = 314;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 654:
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
                case 655:
                    yyn = yys315();
                    continue;

                case 316:
                    yyst[yysp] = 316;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.getNextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 656:
                    yyn = yys316();
                    continue;

                case 317:
                    yyst[yysp] = 317;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.getNextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 657:
                    yyn = yys317();
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
                case 658:
                    yyn = yys318();
                    continue;

                case 319:
                    yyst[yysp] = 319;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 659:
                    switch (yytok) {
                        case ']':
                            yyn = 335;
                            continue;
                    }
                    yyn = 683;
                    continue;

                case 320:
                    yyst[yysp] = 320;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 660:
                    switch (yytok) {
                        case ']':
                            yyn = 336;
                            continue;
                    }
                    yyn = 683;
                    continue;

                case 321:
                    yyst[yysp] = 321;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 661:
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
                            yyn = 337;
                            continue;
                    }
                    yyn = 683;
                    continue;

                case 322:
                    yyst[yysp] = 322;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 662:
                    switch (yytok) {
                        case '*':
                            yyn = 102;
                            continue;
                        case '+':
                            yyn = 103;
                            continue;
                        case '-':
                            yyn = 104;
                            continue;
                        case '/':
                            yyn = 105;
                            continue;
                        case ']':
                            yyn = 338;
                            continue;
                    }
                    yyn = 683;
                    continue;

                case 323:
                    yyst[yysp] = 323;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.getNextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 663:
                    yyn = yys323();
                    continue;

                case 324:
                    yyst[yysp] = 324;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 664:
                    yyn = yys324();
                    continue;

                case 325:
                    yyst[yysp] = 325;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 665:
                    yyn = yys325();
                    continue;

                case 326:
                    yyst[yysp] = 326;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 666:
                    switch (yytok) {
                        case '*':
                            yyn = 252;
                            continue;
                        case '+':
                            yyn = 253;
                            continue;
                        case '-':
                            yyn = 254;
                            continue;
                        case ']':
                            yyn = 339;
                            continue;
                    }
                    yyn = 683;
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
                case 667:
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
                case 668:
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
                case 669:
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
                case 670:
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
                case 671:
                    yyn = yys331();
                    continue;

                case 332:
                    yyst[yysp] = 332;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.getNextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 672:
                    yyn = yys332();
                    continue;

                case 333:
                    yyst[yysp] = 333;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 673:
                    yyn = yys333();
                    continue;

                case 334:
                    yyst[yysp] = 334;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 674:
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
                case 675:
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
                case 676:
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
                case 677:
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
                case 678:
                    yyn = yys338();
                    continue;

                case 339:
                    yyst[yysp] = 339;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.getNextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 679:
                    yyn = yys339();
                    continue;

                case 680:
                    return true;
                case 681:
                    yyerror("stack overflow");
                case 682:
                    return false;
                case 683:
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
                return 31;
            case AT:
                return 32;
            case AV:
                return 33;
            case AVANZA:
                return 34;
            case AZAR:
                return 35;
            case BAJALAPIZ:
                return 36;
            case BL:
                return 37;
            case BORRAPANTALLA:
                return 38;
            case CENTRO:
                return 39;
            case COS:
                return 40;
            case CUENTA:
                return 41;
            case DIFERENCIA:
                return 42;
            case DIVISION:
                return 43;
            case EJECUTA:
                return 44;
            case ELEGIR:
                return 45;
            case ELEMENTO:
                return 46;
            case ESPERA:
                return 47;
            case FLOAT:
                return 48;
            case GD:
                return 49;
            case GI:
                return 50;
            case GIRADERECHA:
                return 51;
            case GIRAIZQUIERDA:
                return 52;
            case IDENTIFIER:
                return 53;
            case IGUALES:
                return 54;
            case INC:
                return 55;
            case INIC:
                return 56;
            case INTEGER:
                return 57;
            case MAYORQUE:
                return 58;
            case MENORQUE:
                return 59;
            case MENOS:
                return 60;
            case O:
                return 61;
            case OCULTATORTUGA:
                return 62;
            case OT:
                return 63;
            case PARA:
                return 64;
            case PONCL:
                return 65;
            case PONCOLORLAPIZ:
                return 66;
            case PONPOS:
                return 67;
            case PONRUMBO:
                return 68;
            case PONX:
                return 69;
            case PONXY:
                return 70;
            case PONY:
                return 71;
            case POTENCIA:
                return 72;
            case PRIMERO:
                return 73;
            case PRODUCTO:
                return 74;
            case RAIZCUADRADA:
                return 75;
            case RC:
                return 76;
            case RE:
                return 77;
            case REDONDEA:
                return 78;
            case REPITE:
                return 79;
            case RESTO:
                return 80;
            case RETROCEDE:
                return 81;
            case RUMBO:
                return 82;
            case SB:
                return 83;
            case SEN:
                return 84;
            case SENO:
                return 85;
            case SI:
                return 86;
            case SUBELAPIZ:
                return 87;
            case SUMA:
                return 88;
            case UL:
                return 89;
            case ULTIMO:
                return 90;
            case VAR:
                return 91;
            case Y:
                return 92;
            case '(':
                return 93;
        }
        return 683;
    }

    private int yys2() {
        switch (yytok) {
            case MARRON:
            case '/':
            case ENDINPUT:
            case BLANCO:
            case PARAMETER:
            case '*':
            case error:
            case '[':
            case CIAN:
            case AMARILLO:
            case VERDE:
            case '=':
            case '-':
            case ')':
            case '<':
            case NEGRO:
            case '+':
            case '>':
            case ROJO:
            case PROCEDURE_NAME:
            case GRIS:
            case AZUL:
                return 683;
        }
        return yyr5();
    }

    private int yys4() {
        switch (yytok) {
            case ')':
            case AMARILLO:
            case CIAN:
            case VERDE:
            case '=':
            case GRIS:
            case BLANCO:
            case PROCEDURE_NAME:
            case ROJO:
            case error:
            case PARAMETER:
            case ENDINPUT:
            case AZUL:
            case '[':
            case NEGRO:
            case MARRON:
                return 683;
            case '>':
            case '<':
            case '/':
            case '-':
            case '+':
            case '*':
                return yyr45();
        }
        return yyr9();
    }

    private int yys5() {
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
        return 683;
    }

    private int yys6() {
        switch (yytok) {
            case ')':
            case AMARILLO:
            case CIAN:
            case VERDE:
            case '=':
            case GRIS:
            case BLANCO:
            case PROCEDURE_NAME:
            case ROJO:
            case error:
            case PARAMETER:
            case ENDINPUT:
            case AZUL:
            case '[':
            case NEGRO:
            case MARRON:
                return 683;
            case '>':
            case '<':
            case '/':
            case '-':
            case '+':
            case '*':
                return yyr46();
        }
        return yyr15();
    }

    private int yys7() {
        switch (yytok) {
            case ')':
            case AMARILLO:
            case CIAN:
            case VERDE:
            case '=':
            case GRIS:
            case BLANCO:
            case PROCEDURE_NAME:
            case ROJO:
            case error:
            case PARAMETER:
            case ENDINPUT:
            case AZUL:
            case '[':
            case NEGRO:
            case MARRON:
                return 683;
            case '>':
            case '<':
            case '/':
            case '-':
            case '+':
            case '*':
                return yyr47();
        }
        return yyr16();
    }

    private int yys8() {
        switch (yytok) {
            case ')':
            case AMARILLO:
            case CIAN:
            case VERDE:
            case '=':
            case GRIS:
            case BLANCO:
            case PROCEDURE_NAME:
            case ROJO:
            case error:
            case PARAMETER:
            case ENDINPUT:
            case AZUL:
            case '[':
            case NEGRO:
            case MARRON:
                return 683;
            case '>':
            case '<':
            case '/':
            case '-':
            case '+':
            case '*':
                return yyr48();
        }
        return yyr17();
    }

    private int yys9() {
        switch (yytok) {
            case ')':
            case AMARILLO:
            case CIAN:
            case VERDE:
            case '=':
            case GRIS:
            case BLANCO:
            case PROCEDURE_NAME:
            case ROJO:
            case error:
            case PARAMETER:
            case ENDINPUT:
            case AZUL:
            case '[':
            case NEGRO:
            case MARRON:
                return 683;
            case '>':
            case '<':
            case '/':
            case '-':
            case '+':
            case '*':
                return yyr50();
        }
        return yyr19();
    }

    private int yys10() {
        switch (yytok) {
            case ')':
            case AMARILLO:
            case CIAN:
            case VERDE:
            case '=':
            case GRIS:
            case BLANCO:
            case PROCEDURE_NAME:
            case ROJO:
            case error:
            case PARAMETER:
            case ENDINPUT:
            case AZUL:
            case '[':
            case NEGRO:
            case MARRON:
                return 683;
            case '>':
            case '<':
            case '/':
            case '-':
            case '+':
            case '*':
                return yyr51();
        }
        return yyr20();
    }

    private int yys11() {
        switch (yytok) {
            case ')':
            case AMARILLO:
            case CIAN:
            case VERDE:
            case '=':
            case GRIS:
            case BLANCO:
            case PROCEDURE_NAME:
            case ROJO:
            case error:
            case PARAMETER:
            case ENDINPUT:
            case AZUL:
            case '[':
            case NEGRO:
            case MARRON:
                return 683;
            case '>':
            case '<':
            case '/':
            case '-':
            case '+':
            case '*':
                return yyr49();
        }
        return yyr18();
    }

    private int yys12() {
        switch (yytok) {
            case ')':
            case AMARILLO:
            case CIAN:
            case VERDE:
            case '=':
            case GRIS:
            case BLANCO:
            case PROCEDURE_NAME:
            case ROJO:
            case error:
            case PARAMETER:
            case ENDINPUT:
            case AZUL:
            case '[':
            case NEGRO:
            case MARRON:
                return 683;
            case '>':
            case '<':
            case '/':
            case '-':
            case '+':
            case '*':
                return yyr37();
        }
        return yyr8();
    }

    private int yys13() {
        switch (yytok) {
            case '*':
                return 102;
            case '+':
                return 103;
            case '-':
                return 104;
            case '/':
                return 105;
            case '<':
                return 106;
            case '>':
                return 107;
        }
        return 683;
    }

    private int yys14() {
        switch (yytok) {
            case ')':
            case AMARILLO:
            case CIAN:
            case VERDE:
            case '=':
            case GRIS:
            case BLANCO:
            case PROCEDURE_NAME:
            case ROJO:
            case error:
            case PARAMETER:
            case ENDINPUT:
            case AZUL:
            case '[':
            case NEGRO:
            case MARRON:
                return 683;
            case '>':
            case '<':
            case '/':
            case '-':
            case '+':
            case '*':
                return yyr38();
        }
        return yyr10();
    }

    private int yys15() {
        switch (yytok) {
            case ')':
            case AMARILLO:
            case CIAN:
            case VERDE:
            case '=':
            case GRIS:
            case BLANCO:
            case PROCEDURE_NAME:
            case ROJO:
            case error:
            case PARAMETER:
            case ENDINPUT:
            case AZUL:
            case '[':
            case NEGRO:
            case MARRON:
                return 683;
            case '>':
            case '<':
            case '/':
            case '-':
            case '+':
            case '*':
                return yyr39();
        }
        return yyr11();
    }

    private int yys16() {
        switch (yytok) {
            case ')':
            case AMARILLO:
            case CIAN:
            case VERDE:
            case '=':
            case GRIS:
            case BLANCO:
            case PROCEDURE_NAME:
            case ROJO:
            case error:
            case PARAMETER:
            case ENDINPUT:
            case AZUL:
            case '[':
            case NEGRO:
            case MARRON:
                return 683;
            case '>':
            case '<':
            case '/':
            case '-':
            case '+':
            case '*':
                return yyr41();
        }
        return yyr13();
    }

    private int yys17() {
        switch (yytok) {
            case ')':
            case AMARILLO:
            case CIAN:
            case VERDE:
            case '=':
            case GRIS:
            case BLANCO:
            case PROCEDURE_NAME:
            case ROJO:
            case error:
            case PARAMETER:
            case ENDINPUT:
            case AZUL:
            case '[':
            case NEGRO:
            case MARRON:
                return 683;
            case '>':
            case '<':
            case '/':
            case '-':
            case '+':
            case '*':
                return yyr42();
        }
        return yyr14();
    }

    private int yys18() {
        switch (yytok) {
            case ')':
            case AMARILLO:
            case CIAN:
            case VERDE:
            case '=':
            case GRIS:
            case BLANCO:
            case PROCEDURE_NAME:
            case ROJO:
            case error:
            case PARAMETER:
            case ENDINPUT:
            case AZUL:
            case '[':
            case NEGRO:
            case MARRON:
                return 683;
            case '>':
            case '<':
            case '/':
            case '-':
            case '+':
            case '*':
                return yyr40();
        }
        return yyr12();
    }

    private int yys19() {
        switch (yytok) {
            case MARRON:
            case '/':
            case ENDINPUT:
            case BLANCO:
            case PARAMETER:
            case '*':
            case error:
            case '[':
            case CIAN:
            case AMARILLO:
            case VERDE:
            case '=':
            case '-':
            case ')':
            case '<':
            case NEGRO:
            case '+':
            case '>':
            case ROJO:
            case PROCEDURE_NAME:
            case GRIS:
            case AZUL:
                return 683;
        }
        return yyr7();
    }

    private int yys22() {
        switch (yytok) {
            case MARRON:
            case '/':
            case ENDINPUT:
            case BLANCO:
            case PARAMETER:
            case '*':
            case error:
            case '[':
            case CIAN:
            case AMARILLO:
            case VERDE:
            case '=':
            case '-':
            case ')':
            case '<':
            case NEGRO:
            case '+':
            case '>':
            case ROJO:
            case PROCEDURE_NAME:
            case GRIS:
            case AZUL:
                return 683;
        }
        return yyr21();
    }

    private int yys23() {
        switch (yytok) {
            case MARRON:
            case '/':
            case ENDINPUT:
            case BLANCO:
            case PARAMETER:
            case '*':
            case error:
            case '[':
            case CIAN:
            case AMARILLO:
            case VERDE:
            case '=':
            case '-':
            case ')':
            case '<':
            case NEGRO:
            case '+':
            case '>':
            case ROJO:
            case PROCEDURE_NAME:
            case GRIS:
            case AZUL:
                return 683;
        }
        return yyr6();
    }

    private int yys24() {
        switch (yytok) {
            case MARRON:
            case '/':
            case ENDINPUT:
            case BLANCO:
            case PARAMETER:
            case '*':
            case error:
            case '[':
            case CIAN:
            case AMARILLO:
            case VERDE:
            case '=':
            case '-':
            case ')':
            case '<':
            case NEGRO:
            case '+':
            case '>':
            case ROJO:
            case PROCEDURE_NAME:
            case GRIS:
            case AZUL:
                return 683;
        }
        return yyr27();
    }

    private int yys25() {
        switch (yytok) {
            case APARECETORTUGA:
                return 31;
            case AT:
                return 32;
            case AV:
                return 33;
            case AVANZA:
                return 34;
            case AZAR:
                return 35;
            case BAJALAPIZ:
                return 36;
            case BL:
                return 37;
            case BORRAPANTALLA:
                return 38;
            case CENTRO:
                return 39;
            case COS:
                return 40;
            case CUENTA:
                return 41;
            case DIFERENCIA:
                return 42;
            case DIVISION:
                return 43;
            case EJECUTA:
                return 44;
            case ELEGIR:
                return 45;
            case ELEMENTO:
                return 46;
            case ESPERA:
                return 47;
            case FLOAT:
                return 48;
            case GD:
                return 49;
            case GI:
                return 50;
            case GIRADERECHA:
                return 51;
            case GIRAIZQUIERDA:
                return 52;
            case IDENTIFIER:
                return 53;
            case IGUALES:
                return 54;
            case INC:
                return 55;
            case INIC:
                return 56;
            case INTEGER:
                return 57;
            case MAYORQUE:
                return 58;
            case MENORQUE:
                return 59;
            case MENOS:
                return 60;
            case O:
                return 61;
            case OCULTATORTUGA:
                return 62;
            case OT:
                return 63;
            case PARA:
                return 64;
            case PONCL:
                return 65;
            case PONCOLORLAPIZ:
                return 66;
            case PONPOS:
                return 67;
            case PONRUMBO:
                return 68;
            case PONX:
                return 69;
            case PONXY:
                return 70;
            case PONY:
                return 71;
            case POTENCIA:
                return 72;
            case PRIMERO:
                return 73;
            case PRODUCTO:
                return 74;
            case RAIZCUADRADA:
                return 75;
            case RC:
                return 76;
            case RE:
                return 77;
            case REDONDEA:
                return 78;
            case REPITE:
                return 79;
            case RESTO:
                return 80;
            case RETROCEDE:
                return 81;
            case RUMBO:
                return 82;
            case SB:
                return 83;
            case SEN:
                return 84;
            case SENO:
                return 85;
            case SI:
                return 86;
            case SUBELAPIZ:
                return 87;
            case SUMA:
                return 88;
            case UL:
                return 89;
            case ULTIMO:
                return 90;
            case VAR:
                return 91;
            case Y:
                return 92;
            case '(':
                return 93;
            case PARAMETER:
                return 112;
        }
        return 683;
    }

    private int yys26() {
        switch (yytok) {
            case MARRON:
            case '/':
            case ENDINPUT:
            case BLANCO:
            case PARAMETER:
            case '*':
            case error:
            case '[':
            case CIAN:
            case AMARILLO:
            case VERDE:
            case '=':
            case '-':
            case ')':
            case '<':
            case NEGRO:
            case '+':
            case '>':
            case ROJO:
            case PROCEDURE_NAME:
            case GRIS:
            case AZUL:
                return 683;
        }
        return yyr22();
    }

    private int yys27() {
        switch (yytok) {
            case MARRON:
            case '/':
            case ENDINPUT:
            case BLANCO:
            case PARAMETER:
            case '*':
            case error:
            case '[':
            case CIAN:
            case AMARILLO:
            case VERDE:
            case '=':
            case '-':
            case ')':
            case '<':
            case NEGRO:
            case '+':
            case '>':
            case ROJO:
            case PROCEDURE_NAME:
            case GRIS:
            case AZUL:
                return 683;
        }
        return yyr23();
    }

    private int yys28() {
        switch (yytok) {
            case MARRON:
            case '/':
            case ENDINPUT:
            case BLANCO:
            case PARAMETER:
            case '*':
            case error:
            case '[':
            case CIAN:
            case AMARILLO:
            case VERDE:
            case '=':
            case '-':
            case ')':
            case '<':
            case NEGRO:
            case '+':
            case '>':
            case ROJO:
            case PROCEDURE_NAME:
            case GRIS:
            case AZUL:
                return 683;
        }
        return yyr24();
    }

    private int yys29() {
        switch (yytok) {
            case MARRON:
            case '/':
            case ENDINPUT:
            case BLANCO:
            case PARAMETER:
            case '*':
            case error:
            case '[':
            case CIAN:
            case AMARILLO:
            case VERDE:
            case '=':
            case '-':
            case ')':
            case '<':
            case NEGRO:
            case '+':
            case '>':
            case ROJO:
            case PROCEDURE_NAME:
            case GRIS:
            case AZUL:
                return 683;
        }
        return yyr26();
    }

    private int yys30() {
        switch (yytok) {
            case MARRON:
            case '/':
            case ENDINPUT:
            case BLANCO:
            case PARAMETER:
            case '*':
            case error:
            case '[':
            case CIAN:
            case AMARILLO:
            case VERDE:
            case '=':
            case '-':
            case ')':
            case '<':
            case NEGRO:
            case '+':
            case '>':
            case ROJO:
            case PROCEDURE_NAME:
            case GRIS:
            case AZUL:
                return 683;
        }
        return yyr25();
    }

    private int yys31() {
        switch (yytok) {
            case MARRON:
            case '/':
            case ENDINPUT:
            case BLANCO:
            case PARAMETER:
            case '*':
            case error:
            case '[':
            case CIAN:
            case AMARILLO:
            case VERDE:
            case '=':
            case '-':
            case ')':
            case '<':
            case NEGRO:
            case '+':
            case '>':
            case ROJO:
            case PROCEDURE_NAME:
            case GRIS:
            case AZUL:
                return 683;
        }
        return yyr96();
    }

    private int yys32() {
        switch (yytok) {
            case MARRON:
            case '/':
            case ENDINPUT:
            case BLANCO:
            case PARAMETER:
            case '*':
            case error:
            case '[':
            case CIAN:
            case AMARILLO:
            case VERDE:
            case '=':
            case '-':
            case ')':
            case '<':
            case NEGRO:
            case '+':
            case '>':
            case ROJO:
            case PROCEDURE_NAME:
            case GRIS:
            case AZUL:
                return 683;
        }
        return yyr97();
    }

    private int yys33() {
        switch (yytok) {
            case AZAR:
                return 35;
            case CUENTA:
                return 41;
            case INTEGER:
                return 57;
            case REDONDEA:
                return 78;
            case RESTO:
                return 80;
            case DIFERENCIA:
                return 120;
            case ELEGIR:
                return 121;
            case ELEMENTO:
                return 122;
            case IDENTIFIER:
                return 123;
            case MENOS:
                return 124;
            case POTENCIA:
                return 125;
            case PRIMERO:
                return 126;
            case PRODUCTO:
                return 127;
            case SUMA:
                return 128;
            case UL:
                return 129;
            case ULTIMO:
                return 130;
            case '(':
                return 131;
        }
        return 683;
    }

    private int yys34() {
        switch (yytok) {
            case AZAR:
                return 35;
            case CUENTA:
                return 41;
            case INTEGER:
                return 57;
            case REDONDEA:
                return 78;
            case RESTO:
                return 80;
            case DIFERENCIA:
                return 120;
            case ELEGIR:
                return 121;
            case ELEMENTO:
                return 122;
            case IDENTIFIER:
                return 123;
            case MENOS:
                return 124;
            case POTENCIA:
                return 125;
            case PRIMERO:
                return 126;
            case PRODUCTO:
                return 127;
            case SUMA:
                return 128;
            case UL:
                return 129;
            case ULTIMO:
                return 130;
            case '(':
                return 131;
        }
        return 683;
    }

    private int yys35() {
        switch (yytok) {
            case AZAR:
                return 35;
            case CUENTA:
                return 41;
            case INTEGER:
                return 57;
            case REDONDEA:
                return 78;
            case RESTO:
                return 80;
            case DIFERENCIA:
                return 120;
            case ELEGIR:
                return 121;
            case ELEMENTO:
                return 122;
            case IDENTIFIER:
                return 123;
            case MENOS:
                return 124;
            case POTENCIA:
                return 125;
            case PRIMERO:
                return 126;
            case PRODUCTO:
                return 127;
            case SUMA:
                return 128;
            case UL:
                return 129;
            case ULTIMO:
                return 130;
            case '(':
                return 131;
        }
        return 683;
    }

    private int yys36() {
        switch (yytok) {
            case MARRON:
            case '/':
            case ENDINPUT:
            case BLANCO:
            case PARAMETER:
            case '*':
            case error:
            case '[':
            case CIAN:
            case AMARILLO:
            case VERDE:
            case '=':
            case '-':
            case ')':
            case '<':
            case NEGRO:
            case '+':
            case '>':
            case ROJO:
            case PROCEDURE_NAME:
            case GRIS:
            case AZUL:
                return 683;
        }
        return yyr98();
    }

    private int yys37() {
        switch (yytok) {
            case MARRON:
            case '/':
            case ENDINPUT:
            case BLANCO:
            case PARAMETER:
            case '*':
            case error:
            case '[':
            case CIAN:
            case AMARILLO:
            case VERDE:
            case '=':
            case '-':
            case ')':
            case '<':
            case NEGRO:
            case '+':
            case '>':
            case ROJO:
            case PROCEDURE_NAME:
            case GRIS:
            case AZUL:
                return 683;
        }
        return yyr99();
    }

    private int yys38() {
        switch (yytok) {
            case MARRON:
            case '/':
            case ENDINPUT:
            case BLANCO:
            case PARAMETER:
            case '*':
            case error:
            case '[':
            case CIAN:
            case AMARILLO:
            case VERDE:
            case '=':
            case '-':
            case ')':
            case '<':
            case NEGRO:
            case '+':
            case '>':
            case ROJO:
            case PROCEDURE_NAME:
            case GRIS:
            case AZUL:
                return 683;
        }
        return yyr103();
    }

    private int yys39() {
        switch (yytok) {
            case MARRON:
            case '/':
            case ENDINPUT:
            case BLANCO:
            case PARAMETER:
            case '*':
            case error:
            case '[':
            case CIAN:
            case AMARILLO:
            case VERDE:
            case '=':
            case '-':
            case ')':
            case '<':
            case NEGRO:
            case '+':
            case '>':
            case ROJO:
            case PROCEDURE_NAME:
            case GRIS:
            case AZUL:
                return 683;
        }
        return yyr102();
    }

    private int yys40() {
        switch (yytok) {
            case AZAR:
                return 35;
            case COS:
                return 40;
            case CUENTA:
                return 41;
            case DIFERENCIA:
                return 42;
            case DIVISION:
                return 43;
            case ELEGIR:
                return 45;
            case ELEMENTO:
                return 46;
            case FLOAT:
                return 48;
            case IDENTIFIER:
                return 53;
            case INTEGER:
                return 57;
            case MENOS:
                return 60;
            case POTENCIA:
                return 72;
            case PRIMERO:
                return 73;
            case PRODUCTO:
                return 74;
            case RAIZCUADRADA:
                return 75;
            case RC:
                return 76;
            case REDONDEA:
                return 78;
            case RESTO:
                return 80;
            case RUMBO:
                return 82;
            case SEN:
                return 84;
            case SENO:
                return 85;
            case SUMA:
                return 88;
            case UL:
                return 89;
            case ULTIMO:
                return 90;
            case '(':
                return 93;
        }
        return 683;
    }

    private int yys42() {
        switch (yytok) {
            case AZAR:
                return 35;
            case COS:
                return 40;
            case CUENTA:
                return 41;
            case DIFERENCIA:
                return 42;
            case DIVISION:
                return 43;
            case ELEGIR:
                return 45;
            case ELEMENTO:
                return 46;
            case FLOAT:
                return 48;
            case IDENTIFIER:
                return 53;
            case INTEGER:
                return 57;
            case MENOS:
                return 60;
            case POTENCIA:
                return 72;
            case PRIMERO:
                return 73;
            case PRODUCTO:
                return 74;
            case RAIZCUADRADA:
                return 75;
            case RC:
                return 76;
            case REDONDEA:
                return 78;
            case RESTO:
                return 80;
            case RUMBO:
                return 82;
            case SEN:
                return 84;
            case SENO:
                return 85;
            case SUMA:
                return 88;
            case UL:
                return 89;
            case ULTIMO:
                return 90;
            case '(':
                return 93;
        }
        return 683;
    }

    private int yys43() {
        switch (yytok) {
            case AZAR:
                return 35;
            case COS:
                return 40;
            case CUENTA:
                return 41;
            case DIFERENCIA:
                return 42;
            case DIVISION:
                return 43;
            case ELEGIR:
                return 45;
            case ELEMENTO:
                return 46;
            case FLOAT:
                return 48;
            case IDENTIFIER:
                return 53;
            case INTEGER:
                return 57;
            case MENOS:
                return 60;
            case POTENCIA:
                return 72;
            case PRIMERO:
                return 73;
            case PRODUCTO:
                return 74;
            case RAIZCUADRADA:
                return 75;
            case RC:
                return 76;
            case REDONDEA:
                return 78;
            case RESTO:
                return 80;
            case RUMBO:
                return 82;
            case SEN:
                return 84;
            case SENO:
                return 85;
            case SUMA:
                return 88;
            case UL:
                return 89;
            case ULTIMO:
                return 90;
            case '(':
                return 93;
        }
        return 683;
    }

    private int yys46() {
        switch (yytok) {
            case AZAR:
                return 35;
            case CUENTA:
                return 41;
            case INTEGER:
                return 57;
            case REDONDEA:
                return 78;
            case RESTO:
                return 80;
            case DIFERENCIA:
                return 120;
            case ELEGIR:
                return 121;
            case ELEMENTO:
                return 122;
            case IDENTIFIER:
                return 123;
            case MENOS:
                return 124;
            case POTENCIA:
                return 125;
            case PRIMERO:
                return 126;
            case PRODUCTO:
                return 127;
            case SUMA:
                return 128;
            case UL:
                return 129;
            case ULTIMO:
                return 130;
            case '(':
                return 131;
        }
        return 683;
    }

    private int yys47() {
        switch (yytok) {
            case AZAR:
                return 35;
            case COS:
                return 40;
            case CUENTA:
                return 41;
            case DIFERENCIA:
                return 42;
            case DIVISION:
                return 43;
            case ELEGIR:
                return 45;
            case ELEMENTO:
                return 46;
            case FLOAT:
                return 48;
            case IDENTIFIER:
                return 53;
            case INTEGER:
                return 57;
            case MENOS:
                return 60;
            case POTENCIA:
                return 72;
            case PRIMERO:
                return 73;
            case PRODUCTO:
                return 74;
            case RAIZCUADRADA:
                return 75;
            case RC:
                return 76;
            case REDONDEA:
                return 78;
            case RESTO:
                return 80;
            case RUMBO:
                return 82;
            case SEN:
                return 84;
            case SENO:
                return 85;
            case SUMA:
                return 88;
            case UL:
                return 89;
            case ULTIMO:
                return 90;
            case '(':
                return 93;
        }
        return 683;
    }

    private int yys48() {
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
                return 683;
        }
        return yyr43();
    }

    private int yys49() {
        switch (yytok) {
            case AZAR:
                return 35;
            case COS:
                return 40;
            case CUENTA:
                return 41;
            case DIFERENCIA:
                return 42;
            case DIVISION:
                return 43;
            case ELEGIR:
                return 45;
            case ELEMENTO:
                return 46;
            case FLOAT:
                return 48;
            case IDENTIFIER:
                return 53;
            case INTEGER:
                return 57;
            case MENOS:
                return 60;
            case POTENCIA:
                return 72;
            case PRIMERO:
                return 73;
            case PRODUCTO:
                return 74;
            case RAIZCUADRADA:
                return 75;
            case RC:
                return 76;
            case REDONDEA:
                return 78;
            case RESTO:
                return 80;
            case RUMBO:
                return 82;
            case SEN:
                return 84;
            case SENO:
                return 85;
            case SUMA:
                return 88;
            case UL:
                return 89;
            case ULTIMO:
                return 90;
            case '(':
                return 93;
        }
        return 683;
    }

    private int yys50() {
        switch (yytok) {
            case AZAR:
                return 35;
            case COS:
                return 40;
            case CUENTA:
                return 41;
            case DIFERENCIA:
                return 42;
            case DIVISION:
                return 43;
            case ELEGIR:
                return 45;
            case ELEMENTO:
                return 46;
            case FLOAT:
                return 48;
            case IDENTIFIER:
                return 53;
            case INTEGER:
                return 57;
            case MENOS:
                return 60;
            case POTENCIA:
                return 72;
            case PRIMERO:
                return 73;
            case PRODUCTO:
                return 74;
            case RAIZCUADRADA:
                return 75;
            case RC:
                return 76;
            case REDONDEA:
                return 78;
            case RESTO:
                return 80;
            case RUMBO:
                return 82;
            case SEN:
                return 84;
            case SENO:
                return 85;
            case SUMA:
                return 88;
            case UL:
                return 89;
            case ULTIMO:
                return 90;
            case '(':
                return 93;
        }
        return 683;
    }

    private int yys51() {
        switch (yytok) {
            case AZAR:
                return 35;
            case COS:
                return 40;
            case CUENTA:
                return 41;
            case DIFERENCIA:
                return 42;
            case DIVISION:
                return 43;
            case ELEGIR:
                return 45;
            case ELEMENTO:
                return 46;
            case FLOAT:
                return 48;
            case IDENTIFIER:
                return 53;
            case INTEGER:
                return 57;
            case MENOS:
                return 60;
            case POTENCIA:
                return 72;
            case PRIMERO:
                return 73;
            case PRODUCTO:
                return 74;
            case RAIZCUADRADA:
                return 75;
            case RC:
                return 76;
            case REDONDEA:
                return 78;
            case RESTO:
                return 80;
            case RUMBO:
                return 82;
            case SEN:
                return 84;
            case SENO:
                return 85;
            case SUMA:
                return 88;
            case UL:
                return 89;
            case ULTIMO:
                return 90;
            case '(':
                return 93;
        }
        return 683;
    }

    private int yys52() {
        switch (yytok) {
            case AZAR:
                return 35;
            case COS:
                return 40;
            case CUENTA:
                return 41;
            case DIFERENCIA:
                return 42;
            case DIVISION:
                return 43;
            case ELEGIR:
                return 45;
            case ELEMENTO:
                return 46;
            case FLOAT:
                return 48;
            case IDENTIFIER:
                return 53;
            case INTEGER:
                return 57;
            case MENOS:
                return 60;
            case POTENCIA:
                return 72;
            case PRIMERO:
                return 73;
            case PRODUCTO:
                return 74;
            case RAIZCUADRADA:
                return 75;
            case RC:
                return 76;
            case REDONDEA:
                return 78;
            case RESTO:
                return 80;
            case RUMBO:
                return 82;
            case SEN:
                return 84;
            case SENO:
                return 85;
            case SUMA:
                return 88;
            case UL:
                return 89;
            case ULTIMO:
                return 90;
            case '(':
                return 93;
        }
        return 683;
    }

    private int yys53() {
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
                return 683;
        }
        return yyr36();
    }

    private int yys54() {
        switch (yytok) {
            case AZAR:
                return 35;
            case COS:
                return 40;
            case CUENTA:
                return 41;
            case DIFERENCIA:
                return 42;
            case DIVISION:
                return 43;
            case ELEGIR:
                return 45;
            case ELEMENTO:
                return 46;
            case FLOAT:
                return 48;
            case IDENTIFIER:
                return 53;
            case INTEGER:
                return 57;
            case MENOS:
                return 60;
            case POTENCIA:
                return 72;
            case PRIMERO:
                return 73;
            case PRODUCTO:
                return 74;
            case RAIZCUADRADA:
                return 75;
            case RC:
                return 76;
            case REDONDEA:
                return 78;
            case RESTO:
                return 80;
            case RUMBO:
                return 82;
            case SEN:
                return 84;
            case SENO:
                return 85;
            case SUMA:
                return 88;
            case UL:
                return 89;
            case ULTIMO:
                return 90;
            case '(':
                return 93;
        }
        return 683;
    }

    private int yys57() {
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
                return 683;
        }
        return yyr35();
    }

    private int yys58() {
        switch (yytok) {
            case AZAR:
                return 35;
            case COS:
                return 40;
            case CUENTA:
                return 41;
            case DIFERENCIA:
                return 42;
            case DIVISION:
                return 43;
            case ELEGIR:
                return 45;
            case ELEMENTO:
                return 46;
            case FLOAT:
                return 48;
            case IDENTIFIER:
                return 53;
            case INTEGER:
                return 57;
            case MENOS:
                return 60;
            case POTENCIA:
                return 72;
            case PRIMERO:
                return 73;
            case PRODUCTO:
                return 74;
            case RAIZCUADRADA:
                return 75;
            case RC:
                return 76;
            case REDONDEA:
                return 78;
            case RESTO:
                return 80;
            case RUMBO:
                return 82;
            case SEN:
                return 84;
            case SENO:
                return 85;
            case SUMA:
                return 88;
            case UL:
                return 89;
            case ULTIMO:
                return 90;
            case '(':
                return 93;
        }
        return 683;
    }

    private int yys59() {
        switch (yytok) {
            case AZAR:
                return 35;
            case COS:
                return 40;
            case CUENTA:
                return 41;
            case DIFERENCIA:
                return 42;
            case DIVISION:
                return 43;
            case ELEGIR:
                return 45;
            case ELEMENTO:
                return 46;
            case FLOAT:
                return 48;
            case IDENTIFIER:
                return 53;
            case INTEGER:
                return 57;
            case MENOS:
                return 60;
            case POTENCIA:
                return 72;
            case PRIMERO:
                return 73;
            case PRODUCTO:
                return 74;
            case RAIZCUADRADA:
                return 75;
            case RC:
                return 76;
            case REDONDEA:
                return 78;
            case RESTO:
                return 80;
            case RUMBO:
                return 82;
            case SEN:
                return 84;
            case SENO:
                return 85;
            case SUMA:
                return 88;
            case UL:
                return 89;
            case ULTIMO:
                return 90;
            case '(':
                return 93;
        }
        return 683;
    }

    private int yys60() {
        switch (yytok) {
            case AZAR:
                return 35;
            case COS:
                return 40;
            case CUENTA:
                return 41;
            case DIFERENCIA:
                return 42;
            case DIVISION:
                return 43;
            case ELEGIR:
                return 45;
            case ELEMENTO:
                return 46;
            case FLOAT:
                return 48;
            case IDENTIFIER:
                return 53;
            case INTEGER:
                return 57;
            case MENOS:
                return 60;
            case POTENCIA:
                return 72;
            case PRIMERO:
                return 73;
            case PRODUCTO:
                return 74;
            case RAIZCUADRADA:
                return 75;
            case RC:
                return 76;
            case REDONDEA:
                return 78;
            case RESTO:
                return 80;
            case RUMBO:
                return 82;
            case SEN:
                return 84;
            case SENO:
                return 85;
            case SUMA:
                return 88;
            case UL:
                return 89;
            case ULTIMO:
                return 90;
            case '(':
                return 93;
        }
        return 683;
    }

    private int yys61() {
        switch (yytok) {
            case AZAR:
                return 35;
            case COS:
                return 40;
            case CUENTA:
                return 41;
            case DIFERENCIA:
                return 42;
            case DIVISION:
                return 43;
            case ELEGIR:
                return 45;
            case ELEMENTO:
                return 46;
            case FLOAT:
                return 48;
            case IDENTIFIER:
                return 53;
            case IGUALES:
                return 54;
            case INTEGER:
                return 57;
            case MAYORQUE:
                return 58;
            case MENORQUE:
                return 59;
            case MENOS:
                return 60;
            case O:
                return 61;
            case POTENCIA:
                return 72;
            case PRIMERO:
                return 73;
            case PRODUCTO:
                return 74;
            case RAIZCUADRADA:
                return 75;
            case RC:
                return 76;
            case REDONDEA:
                return 78;
            case RESTO:
                return 80;
            case RUMBO:
                return 82;
            case SEN:
                return 84;
            case SENO:
                return 85;
            case SUMA:
                return 88;
            case UL:
                return 89;
            case ULTIMO:
                return 90;
            case Y:
                return 92;
            case '(':
                return 93;
        }
        return 683;
    }

    private int yys62() {
        switch (yytok) {
            case MARRON:
            case '/':
            case ENDINPUT:
            case BLANCO:
            case PARAMETER:
            case '*':
            case error:
            case '[':
            case CIAN:
            case AMARILLO:
            case VERDE:
            case '=':
            case '-':
            case ')':
            case '<':
            case NEGRO:
            case '+':
            case '>':
            case ROJO:
            case PROCEDURE_NAME:
            case GRIS:
            case AZUL:
                return 683;
        }
        return yyr94();
    }

    private int yys63() {
        switch (yytok) {
            case MARRON:
            case '/':
            case ENDINPUT:
            case BLANCO:
            case PARAMETER:
            case '*':
            case error:
            case '[':
            case CIAN:
            case AMARILLO:
            case VERDE:
            case '=':
            case '-':
            case ')':
            case '<':
            case NEGRO:
            case '+':
            case '>':
            case ROJO:
            case PROCEDURE_NAME:
            case GRIS:
            case AZUL:
                return 683;
        }
        return yyr95();
    }

    private int yys65() {
        switch (yytok) {
            case AMARILLO:
                return 176;
            case AZUL:
                return 177;
            case BLANCO:
                return 178;
            case CIAN:
                return 179;
            case GRIS:
                return 180;
            case MARRON:
                return 181;
            case NEGRO:
                return 182;
            case ROJO:
                return 183;
            case VERDE:
                return 184;
        }
        return 683;
    }

    private int yys66() {
        switch (yytok) {
            case AMARILLO:
                return 176;
            case AZUL:
                return 177;
            case BLANCO:
                return 178;
            case CIAN:
                return 179;
            case GRIS:
                return 180;
            case MARRON:
                return 181;
            case NEGRO:
                return 182;
            case ROJO:
                return 183;
            case VERDE:
                return 184;
        }
        return 683;
    }

    private int yys68() {
        switch (yytok) {
            case AZAR:
                return 35;
            case COS:
                return 40;
            case CUENTA:
                return 41;
            case DIFERENCIA:
                return 42;
            case DIVISION:
                return 43;
            case ELEGIR:
                return 45;
            case ELEMENTO:
                return 46;
            case FLOAT:
                return 48;
            case IDENTIFIER:
                return 53;
            case INTEGER:
                return 57;
            case MENOS:
                return 60;
            case POTENCIA:
                return 72;
            case PRIMERO:
                return 73;
            case PRODUCTO:
                return 74;
            case RAIZCUADRADA:
                return 75;
            case RC:
                return 76;
            case REDONDEA:
                return 78;
            case RESTO:
                return 80;
            case RUMBO:
                return 82;
            case SEN:
                return 84;
            case SENO:
                return 85;
            case SUMA:
                return 88;
            case UL:
                return 89;
            case ULTIMO:
                return 90;
            case '(':
                return 93;
        }
        return 683;
    }

    private int yys69() {
        switch (yytok) {
            case AZAR:
                return 35;
            case CUENTA:
                return 41;
            case INTEGER:
                return 57;
            case REDONDEA:
                return 78;
            case RESTO:
                return 80;
            case DIFERENCIA:
                return 120;
            case ELEGIR:
                return 121;
            case ELEMENTO:
                return 122;
            case IDENTIFIER:
                return 123;
            case MENOS:
                return 124;
            case POTENCIA:
                return 125;
            case PRIMERO:
                return 126;
            case PRODUCTO:
                return 127;
            case SUMA:
                return 128;
            case UL:
                return 129;
            case ULTIMO:
                return 130;
            case '(':
                return 131;
        }
        return 683;
    }

    private int yys70() {
        switch (yytok) {
            case AZAR:
                return 35;
            case CUENTA:
                return 41;
            case INTEGER:
                return 57;
            case REDONDEA:
                return 78;
            case RESTO:
                return 80;
            case DIFERENCIA:
                return 120;
            case ELEGIR:
                return 121;
            case ELEMENTO:
                return 122;
            case IDENTIFIER:
                return 123;
            case MENOS:
                return 124;
            case POTENCIA:
                return 125;
            case PRIMERO:
                return 126;
            case PRODUCTO:
                return 127;
            case SUMA:
                return 128;
            case UL:
                return 129;
            case ULTIMO:
                return 130;
            case '(':
                return 131;
        }
        return 683;
    }

    private int yys71() {
        switch (yytok) {
            case AZAR:
                return 35;
            case CUENTA:
                return 41;
            case INTEGER:
                return 57;
            case REDONDEA:
                return 78;
            case RESTO:
                return 80;
            case DIFERENCIA:
                return 120;
            case ELEGIR:
                return 121;
            case ELEMENTO:
                return 122;
            case IDENTIFIER:
                return 123;
            case MENOS:
                return 124;
            case POTENCIA:
                return 125;
            case PRIMERO:
                return 126;
            case PRODUCTO:
                return 127;
            case SUMA:
                return 128;
            case UL:
                return 129;
            case ULTIMO:
                return 130;
            case '(':
                return 131;
        }
        return 683;
    }

    private int yys72() {
        switch (yytok) {
            case AZAR:
                return 35;
            case COS:
                return 40;
            case CUENTA:
                return 41;
            case DIFERENCIA:
                return 42;
            case DIVISION:
                return 43;
            case ELEGIR:
                return 45;
            case ELEMENTO:
                return 46;
            case FLOAT:
                return 48;
            case IDENTIFIER:
                return 53;
            case INTEGER:
                return 57;
            case MENOS:
                return 60;
            case POTENCIA:
                return 72;
            case PRIMERO:
                return 73;
            case PRODUCTO:
                return 74;
            case RAIZCUADRADA:
                return 75;
            case RC:
                return 76;
            case REDONDEA:
                return 78;
            case RESTO:
                return 80;
            case RUMBO:
                return 82;
            case SEN:
                return 84;
            case SENO:
                return 85;
            case SUMA:
                return 88;
            case UL:
                return 89;
            case ULTIMO:
                return 90;
            case '(':
                return 93;
        }
        return 683;
    }

    private int yys74() {
        switch (yytok) {
            case AZAR:
                return 35;
            case COS:
                return 40;
            case CUENTA:
                return 41;
            case DIFERENCIA:
                return 42;
            case DIVISION:
                return 43;
            case ELEGIR:
                return 45;
            case ELEMENTO:
                return 46;
            case FLOAT:
                return 48;
            case IDENTIFIER:
                return 53;
            case INTEGER:
                return 57;
            case MENOS:
                return 60;
            case POTENCIA:
                return 72;
            case PRIMERO:
                return 73;
            case PRODUCTO:
                return 74;
            case RAIZCUADRADA:
                return 75;
            case RC:
                return 76;
            case REDONDEA:
                return 78;
            case RESTO:
                return 80;
            case RUMBO:
                return 82;
            case SEN:
                return 84;
            case SENO:
                return 85;
            case SUMA:
                return 88;
            case UL:
                return 89;
            case ULTIMO:
                return 90;
            case '(':
                return 93;
        }
        return 683;
    }

    private int yys75() {
        switch (yytok) {
            case AZAR:
                return 35;
            case COS:
                return 40;
            case CUENTA:
                return 41;
            case DIFERENCIA:
                return 42;
            case DIVISION:
                return 43;
            case ELEGIR:
                return 45;
            case ELEMENTO:
                return 46;
            case FLOAT:
                return 48;
            case IDENTIFIER:
                return 53;
            case INTEGER:
                return 57;
            case MENOS:
                return 60;
            case POTENCIA:
                return 72;
            case PRIMERO:
                return 73;
            case PRODUCTO:
                return 74;
            case RAIZCUADRADA:
                return 75;
            case RC:
                return 76;
            case REDONDEA:
                return 78;
            case RESTO:
                return 80;
            case RUMBO:
                return 82;
            case SEN:
                return 84;
            case SENO:
                return 85;
            case SUMA:
                return 88;
            case UL:
                return 89;
            case ULTIMO:
                return 90;
            case '(':
                return 93;
        }
        return 683;
    }

    private int yys76() {
        switch (yytok) {
            case AZAR:
                return 35;
            case COS:
                return 40;
            case CUENTA:
                return 41;
            case DIFERENCIA:
                return 42;
            case DIVISION:
                return 43;
            case ELEGIR:
                return 45;
            case ELEMENTO:
                return 46;
            case FLOAT:
                return 48;
            case IDENTIFIER:
                return 53;
            case INTEGER:
                return 57;
            case MENOS:
                return 60;
            case POTENCIA:
                return 72;
            case PRIMERO:
                return 73;
            case PRODUCTO:
                return 74;
            case RAIZCUADRADA:
                return 75;
            case RC:
                return 76;
            case REDONDEA:
                return 78;
            case RESTO:
                return 80;
            case RUMBO:
                return 82;
            case SEN:
                return 84;
            case SENO:
                return 85;
            case SUMA:
                return 88;
            case UL:
                return 89;
            case ULTIMO:
                return 90;
            case '(':
                return 93;
        }
        return 683;
    }

    private int yys77() {
        switch (yytok) {
            case AZAR:
                return 35;
            case CUENTA:
                return 41;
            case INTEGER:
                return 57;
            case REDONDEA:
                return 78;
            case RESTO:
                return 80;
            case DIFERENCIA:
                return 120;
            case ELEGIR:
                return 121;
            case ELEMENTO:
                return 122;
            case IDENTIFIER:
                return 123;
            case MENOS:
                return 124;
            case POTENCIA:
                return 125;
            case PRIMERO:
                return 126;
            case PRODUCTO:
                return 127;
            case SUMA:
                return 128;
            case UL:
                return 129;
            case ULTIMO:
                return 130;
            case '(':
                return 131;
        }
        return 683;
    }

    private int yys78() {
        switch (yytok) {
            case AZAR:
                return 35;
            case COS:
                return 40;
            case CUENTA:
                return 41;
            case DIFERENCIA:
                return 42;
            case DIVISION:
                return 43;
            case ELEGIR:
                return 45;
            case ELEMENTO:
                return 46;
            case FLOAT:
                return 48;
            case IDENTIFIER:
                return 53;
            case INTEGER:
                return 57;
            case MENOS:
                return 60;
            case POTENCIA:
                return 72;
            case PRIMERO:
                return 73;
            case PRODUCTO:
                return 74;
            case RAIZCUADRADA:
                return 75;
            case RC:
                return 76;
            case REDONDEA:
                return 78;
            case RESTO:
                return 80;
            case RUMBO:
                return 82;
            case SEN:
                return 84;
            case SENO:
                return 85;
            case SUMA:
                return 88;
            case UL:
                return 89;
            case ULTIMO:
                return 90;
            case '(':
                return 93;
        }
        return 683;
    }

    private int yys79() {
        switch (yytok) {
            case AZAR:
                return 35;
            case CUENTA:
                return 41;
            case INTEGER:
                return 57;
            case REDONDEA:
                return 78;
            case RESTO:
                return 80;
            case DIFERENCIA:
                return 120;
            case ELEGIR:
                return 121;
            case ELEMENTO:
                return 122;
            case IDENTIFIER:
                return 123;
            case MENOS:
                return 124;
            case POTENCIA:
                return 125;
            case PRIMERO:
                return 126;
            case PRODUCTO:
                return 127;
            case SUMA:
                return 128;
            case UL:
                return 129;
            case ULTIMO:
                return 130;
            case '(':
                return 131;
        }
        return 683;
    }

    private int yys80() {
        switch (yytok) {
            case AZAR:
                return 35;
            case CUENTA:
                return 41;
            case INTEGER:
                return 57;
            case REDONDEA:
                return 78;
            case RESTO:
                return 80;
            case DIFERENCIA:
                return 120;
            case ELEGIR:
                return 121;
            case ELEMENTO:
                return 122;
            case IDENTIFIER:
                return 123;
            case MENOS:
                return 124;
            case POTENCIA:
                return 125;
            case PRIMERO:
                return 126;
            case PRODUCTO:
                return 127;
            case SUMA:
                return 128;
            case UL:
                return 129;
            case ULTIMO:
                return 130;
            case '(':
                return 131;
        }
        return 683;
    }

    private int yys81() {
        switch (yytok) {
            case AZAR:
                return 35;
            case CUENTA:
                return 41;
            case INTEGER:
                return 57;
            case REDONDEA:
                return 78;
            case RESTO:
                return 80;
            case DIFERENCIA:
                return 120;
            case ELEGIR:
                return 121;
            case ELEMENTO:
                return 122;
            case IDENTIFIER:
                return 123;
            case MENOS:
                return 124;
            case POTENCIA:
                return 125;
            case PRIMERO:
                return 126;
            case PRODUCTO:
                return 127;
            case SUMA:
                return 128;
            case UL:
                return 129;
            case ULTIMO:
                return 130;
            case '(':
                return 131;
        }
        return 683;
    }

    private int yys82() {
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
                return 683;
        }
        return yyr93();
    }

    private int yys83() {
        switch (yytok) {
            case MARRON:
            case '/':
            case ENDINPUT:
            case BLANCO:
            case PARAMETER:
            case '*':
            case error:
            case '[':
            case CIAN:
            case AMARILLO:
            case VERDE:
            case '=':
            case '-':
            case ')':
            case '<':
            case NEGRO:
            case '+':
            case '>':
            case ROJO:
            case PROCEDURE_NAME:
            case GRIS:
            case AZUL:
                return 683;
        }
        return yyr101();
    }

    private int yys84() {
        switch (yytok) {
            case AZAR:
                return 35;
            case COS:
                return 40;
            case CUENTA:
                return 41;
            case DIFERENCIA:
                return 42;
            case DIVISION:
                return 43;
            case ELEGIR:
                return 45;
            case ELEMENTO:
                return 46;
            case FLOAT:
                return 48;
            case IDENTIFIER:
                return 53;
            case INTEGER:
                return 57;
            case MENOS:
                return 60;
            case POTENCIA:
                return 72;
            case PRIMERO:
                return 73;
            case PRODUCTO:
                return 74;
            case RAIZCUADRADA:
                return 75;
            case RC:
                return 76;
            case REDONDEA:
                return 78;
            case RESTO:
                return 80;
            case RUMBO:
                return 82;
            case SEN:
                return 84;
            case SENO:
                return 85;
            case SUMA:
                return 88;
            case UL:
                return 89;
            case ULTIMO:
                return 90;
            case '(':
                return 93;
        }
        return 683;
    }

    private int yys85() {
        switch (yytok) {
            case AZAR:
                return 35;
            case COS:
                return 40;
            case CUENTA:
                return 41;
            case DIFERENCIA:
                return 42;
            case DIVISION:
                return 43;
            case ELEGIR:
                return 45;
            case ELEMENTO:
                return 46;
            case FLOAT:
                return 48;
            case IDENTIFIER:
                return 53;
            case INTEGER:
                return 57;
            case MENOS:
                return 60;
            case POTENCIA:
                return 72;
            case PRIMERO:
                return 73;
            case PRODUCTO:
                return 74;
            case RAIZCUADRADA:
                return 75;
            case RC:
                return 76;
            case REDONDEA:
                return 78;
            case RESTO:
                return 80;
            case RUMBO:
                return 82;
            case SEN:
                return 84;
            case SENO:
                return 85;
            case SUMA:
                return 88;
            case UL:
                return 89;
            case ULTIMO:
                return 90;
            case '(':
                return 93;
        }
        return 683;
    }

    private int yys86() {
        switch (yytok) {
            case AZAR:
                return 35;
            case COS:
                return 40;
            case CUENTA:
                return 41;
            case DIFERENCIA:
                return 42;
            case DIVISION:
                return 43;
            case ELEGIR:
                return 45;
            case ELEMENTO:
                return 46;
            case FLOAT:
                return 48;
            case IDENTIFIER:
                return 53;
            case IGUALES:
                return 54;
            case INTEGER:
                return 57;
            case MAYORQUE:
                return 58;
            case MENORQUE:
                return 59;
            case MENOS:
                return 60;
            case O:
                return 61;
            case POTENCIA:
                return 72;
            case PRIMERO:
                return 73;
            case PRODUCTO:
                return 74;
            case RAIZCUADRADA:
                return 75;
            case RC:
                return 76;
            case REDONDEA:
                return 78;
            case RESTO:
                return 80;
            case RUMBO:
                return 82;
            case SEN:
                return 84;
            case SENO:
                return 85;
            case SUMA:
                return 88;
            case UL:
                return 89;
            case ULTIMO:
                return 90;
            case Y:
                return 92;
            case '(':
                return 93;
        }
        return 683;
    }

    private int yys87() {
        switch (yytok) {
            case MARRON:
            case '/':
            case ENDINPUT:
            case BLANCO:
            case PARAMETER:
            case '*':
            case error:
            case '[':
            case CIAN:
            case AMARILLO:
            case VERDE:
            case '=':
            case '-':
            case ')':
            case '<':
            case NEGRO:
            case '+':
            case '>':
            case ROJO:
            case PROCEDURE_NAME:
            case GRIS:
            case AZUL:
                return 683;
        }
        return yyr100();
    }

    private int yys88() {
        switch (yytok) {
            case AZAR:
                return 35;
            case COS:
                return 40;
            case CUENTA:
                return 41;
            case DIFERENCIA:
                return 42;
            case DIVISION:
                return 43;
            case ELEGIR:
                return 45;
            case ELEMENTO:
                return 46;
            case FLOAT:
                return 48;
            case IDENTIFIER:
                return 53;
            case INTEGER:
                return 57;
            case MENOS:
                return 60;
            case POTENCIA:
                return 72;
            case PRIMERO:
                return 73;
            case PRODUCTO:
                return 74;
            case RAIZCUADRADA:
                return 75;
            case RC:
                return 76;
            case REDONDEA:
                return 78;
            case RESTO:
                return 80;
            case RUMBO:
                return 82;
            case SEN:
                return 84;
            case SENO:
                return 85;
            case SUMA:
                return 88;
            case UL:
                return 89;
            case ULTIMO:
                return 90;
            case '(':
                return 93;
        }
        return 683;
    }

    private int yys92() {
        switch (yytok) {
            case AZAR:
                return 35;
            case COS:
                return 40;
            case CUENTA:
                return 41;
            case DIFERENCIA:
                return 42;
            case DIVISION:
                return 43;
            case ELEGIR:
                return 45;
            case ELEMENTO:
                return 46;
            case FLOAT:
                return 48;
            case IDENTIFIER:
                return 53;
            case IGUALES:
                return 54;
            case INTEGER:
                return 57;
            case MAYORQUE:
                return 58;
            case MENORQUE:
                return 59;
            case MENOS:
                return 60;
            case O:
                return 61;
            case POTENCIA:
                return 72;
            case PRIMERO:
                return 73;
            case PRODUCTO:
                return 74;
            case RAIZCUADRADA:
                return 75;
            case RC:
                return 76;
            case REDONDEA:
                return 78;
            case RESTO:
                return 80;
            case RUMBO:
                return 82;
            case SEN:
                return 84;
            case SENO:
                return 85;
            case SUMA:
                return 88;
            case UL:
                return 89;
            case ULTIMO:
                return 90;
            case Y:
                return 92;
            case '(':
                return 93;
        }
        return 683;
    }

    private int yys93() {
        switch (yytok) {
            case AZAR:
                return 35;
            case COS:
                return 40;
            case CUENTA:
                return 41;
            case DIFERENCIA:
                return 42;
            case DIVISION:
                return 43;
            case ELEGIR:
                return 45;
            case ELEMENTO:
                return 46;
            case FLOAT:
                return 48;
            case IDENTIFIER:
                return 53;
            case INTEGER:
                return 57;
            case MENOS:
                return 60;
            case POTENCIA:
                return 72;
            case PRIMERO:
                return 73;
            case PRODUCTO:
                return 74;
            case RAIZCUADRADA:
                return 75;
            case RC:
                return 76;
            case REDONDEA:
                return 78;
            case RESTO:
                return 80;
            case RUMBO:
                return 82;
            case SEN:
                return 84;
            case SENO:
                return 85;
            case SUMA:
                return 88;
            case UL:
                return 89;
            case ULTIMO:
                return 90;
            case '(':
                return 93;
        }
        return 683;
    }

    private int yys95() {
        switch (yytok) {
            case APARECETORTUGA:
                return 31;
            case AT:
                return 32;
            case AV:
                return 33;
            case AVANZA:
                return 34;
            case AZAR:
                return 35;
            case BAJALAPIZ:
                return 36;
            case BL:
                return 37;
            case BORRAPANTALLA:
                return 38;
            case CENTRO:
                return 39;
            case COS:
                return 40;
            case CUENTA:
                return 41;
            case DIFERENCIA:
                return 42;
            case DIVISION:
                return 43;
            case EJECUTA:
                return 44;
            case ELEGIR:
                return 45;
            case ELEMENTO:
                return 46;
            case ESPERA:
                return 47;
            case FLOAT:
                return 48;
            case GD:
                return 49;
            case GI:
                return 50;
            case GIRADERECHA:
                return 51;
            case GIRAIZQUIERDA:
                return 52;
            case IDENTIFIER:
                return 53;
            case IGUALES:
                return 54;
            case INC:
                return 55;
            case INIC:
                return 56;
            case INTEGER:
                return 57;
            case MAYORQUE:
                return 58;
            case MENORQUE:
                return 59;
            case MENOS:
                return 60;
            case O:
                return 61;
            case OCULTATORTUGA:
                return 62;
            case OT:
                return 63;
            case PARA:
                return 64;
            case PONCL:
                return 65;
            case PONCOLORLAPIZ:
                return 66;
            case PONPOS:
                return 67;
            case PONRUMBO:
                return 68;
            case PONX:
                return 69;
            case PONXY:
                return 70;
            case PONY:
                return 71;
            case POTENCIA:
                return 72;
            case PRIMERO:
                return 73;
            case PRODUCTO:
                return 74;
            case RAIZCUADRADA:
                return 75;
            case RC:
                return 76;
            case RE:
                return 77;
            case REDONDEA:
                return 78;
            case REPITE:
                return 79;
            case RESTO:
                return 80;
            case RETROCEDE:
                return 81;
            case RUMBO:
                return 82;
            case SB:
                return 83;
            case SEN:
                return 84;
            case SENO:
                return 85;
            case SI:
                return 86;
            case SUBELAPIZ:
                return 87;
            case SUMA:
                return 88;
            case UL:
                return 89;
            case ULTIMO:
                return 90;
            case VAR:
                return 91;
            case Y:
                return 92;
            case '(':
                return 93;
            case ENDINPUT:
                return yyr4();
        }
        return 683;
    }

    private int yys96() {
        switch (yytok) {
            case AZAR:
                return 35;
            case COS:
                return 40;
            case CUENTA:
                return 41;
            case DIFERENCIA:
                return 42;
            case DIVISION:
                return 43;
            case ELEGIR:
                return 45;
            case ELEMENTO:
                return 46;
            case FLOAT:
                return 48;
            case IDENTIFIER:
                return 53;
            case INTEGER:
                return 57;
            case MENOS:
                return 60;
            case POTENCIA:
                return 72;
            case PRIMERO:
                return 73;
            case PRODUCTO:
                return 74;
            case RAIZCUADRADA:
                return 75;
            case RC:
                return 76;
            case REDONDEA:
                return 78;
            case RESTO:
                return 80;
            case RUMBO:
                return 82;
            case SEN:
                return 84;
            case SENO:
                return 85;
            case SUMA:
                return 88;
            case UL:
                return 89;
            case ULTIMO:
                return 90;
            case '(':
                return 93;
        }
        return 683;
    }

    private int yys97() {
        switch (yytok) {
            case AZAR:
                return 35;
            case COS:
                return 40;
            case CUENTA:
                return 41;
            case DIFERENCIA:
                return 42;
            case DIVISION:
                return 43;
            case ELEGIR:
                return 45;
            case ELEMENTO:
                return 46;
            case FLOAT:
                return 48;
            case IDENTIFIER:
                return 53;
            case INTEGER:
                return 57;
            case MENOS:
                return 60;
            case POTENCIA:
                return 72;
            case PRIMERO:
                return 73;
            case PRODUCTO:
                return 74;
            case RAIZCUADRADA:
                return 75;
            case RC:
                return 76;
            case REDONDEA:
                return 78;
            case RESTO:
                return 80;
            case RUMBO:
                return 82;
            case SEN:
                return 84;
            case SENO:
                return 85;
            case SUMA:
                return 88;
            case UL:
                return 89;
            case ULTIMO:
                return 90;
            case '(':
                return 93;
        }
        return 683;
    }

    private int yys98() {
        switch (yytok) {
            case AZAR:
                return 35;
            case COS:
                return 40;
            case CUENTA:
                return 41;
            case DIFERENCIA:
                return 42;
            case DIVISION:
                return 43;
            case ELEGIR:
                return 45;
            case ELEMENTO:
                return 46;
            case FLOAT:
                return 48;
            case IDENTIFIER:
                return 53;
            case INTEGER:
                return 57;
            case MENOS:
                return 60;
            case POTENCIA:
                return 72;
            case PRIMERO:
                return 73;
            case PRODUCTO:
                return 74;
            case RAIZCUADRADA:
                return 75;
            case RC:
                return 76;
            case REDONDEA:
                return 78;
            case RESTO:
                return 80;
            case RUMBO:
                return 82;
            case SEN:
                return 84;
            case SENO:
                return 85;
            case SUMA:
                return 88;
            case UL:
                return 89;
            case ULTIMO:
                return 90;
            case '(':
                return 93;
        }
        return 683;
    }

    private int yys99() {
        switch (yytok) {
            case AZAR:
                return 35;
            case COS:
                return 40;
            case CUENTA:
                return 41;
            case DIFERENCIA:
                return 42;
            case DIVISION:
                return 43;
            case ELEGIR:
                return 45;
            case ELEMENTO:
                return 46;
            case FLOAT:
                return 48;
            case IDENTIFIER:
                return 53;
            case INTEGER:
                return 57;
            case MENOS:
                return 60;
            case POTENCIA:
                return 72;
            case PRIMERO:
                return 73;
            case PRODUCTO:
                return 74;
            case RAIZCUADRADA:
                return 75;
            case RC:
                return 76;
            case REDONDEA:
                return 78;
            case RESTO:
                return 80;
            case RUMBO:
                return 82;
            case SEN:
                return 84;
            case SENO:
                return 85;
            case SUMA:
                return 88;
            case UL:
                return 89;
            case ULTIMO:
                return 90;
            case '(':
                return 93;
        }
        return 683;
    }

    private int yys100() {
        switch (yytok) {
            case AZAR:
                return 35;
            case COS:
                return 40;
            case CUENTA:
                return 41;
            case DIFERENCIA:
                return 42;
            case DIVISION:
                return 43;
            case ELEGIR:
                return 45;
            case ELEMENTO:
                return 46;
            case FLOAT:
                return 48;
            case IDENTIFIER:
                return 53;
            case INTEGER:
                return 57;
            case MENOS:
                return 60;
            case POTENCIA:
                return 72;
            case PRIMERO:
                return 73;
            case PRODUCTO:
                return 74;
            case RAIZCUADRADA:
                return 75;
            case RC:
                return 76;
            case REDONDEA:
                return 78;
            case RESTO:
                return 80;
            case RUMBO:
                return 82;
            case SEN:
                return 84;
            case SENO:
                return 85;
            case SUMA:
                return 88;
            case UL:
                return 89;
            case ULTIMO:
                return 90;
            case '(':
                return 93;
        }
        return 683;
    }

    private int yys101() {
        switch (yytok) {
            case AZAR:
                return 35;
            case COS:
                return 40;
            case CUENTA:
                return 41;
            case DIFERENCIA:
                return 42;
            case DIVISION:
                return 43;
            case ELEGIR:
                return 45;
            case ELEMENTO:
                return 46;
            case FLOAT:
                return 48;
            case IDENTIFIER:
                return 53;
            case INTEGER:
                return 57;
            case MENOS:
                return 60;
            case POTENCIA:
                return 72;
            case PRIMERO:
                return 73;
            case PRODUCTO:
                return 74;
            case RAIZCUADRADA:
                return 75;
            case RC:
                return 76;
            case REDONDEA:
                return 78;
            case RESTO:
                return 80;
            case RUMBO:
                return 82;
            case SEN:
                return 84;
            case SENO:
                return 85;
            case SUMA:
                return 88;
            case UL:
                return 89;
            case ULTIMO:
                return 90;
            case '(':
                return 93;
        }
        return 683;
    }

    private int yys102() {
        switch (yytok) {
            case AZAR:
                return 35;
            case COS:
                return 40;
            case CUENTA:
                return 41;
            case DIFERENCIA:
                return 42;
            case DIVISION:
                return 43;
            case ELEGIR:
                return 45;
            case ELEMENTO:
                return 46;
            case FLOAT:
                return 48;
            case IDENTIFIER:
                return 53;
            case INTEGER:
                return 57;
            case MENOS:
                return 60;
            case POTENCIA:
                return 72;
            case PRIMERO:
                return 73;
            case PRODUCTO:
                return 74;
            case RAIZCUADRADA:
                return 75;
            case RC:
                return 76;
            case REDONDEA:
                return 78;
            case RESTO:
                return 80;
            case RUMBO:
                return 82;
            case SEN:
                return 84;
            case SENO:
                return 85;
            case SUMA:
                return 88;
            case UL:
                return 89;
            case ULTIMO:
                return 90;
            case '(':
                return 93;
        }
        return 683;
    }

    private int yys103() {
        switch (yytok) {
            case AZAR:
                return 35;
            case COS:
                return 40;
            case CUENTA:
                return 41;
            case DIFERENCIA:
                return 42;
            case DIVISION:
                return 43;
            case ELEGIR:
                return 45;
            case ELEMENTO:
                return 46;
            case FLOAT:
                return 48;
            case IDENTIFIER:
                return 53;
            case INTEGER:
                return 57;
            case MENOS:
                return 60;
            case POTENCIA:
                return 72;
            case PRIMERO:
                return 73;
            case PRODUCTO:
                return 74;
            case RAIZCUADRADA:
                return 75;
            case RC:
                return 76;
            case REDONDEA:
                return 78;
            case RESTO:
                return 80;
            case RUMBO:
                return 82;
            case SEN:
                return 84;
            case SENO:
                return 85;
            case SUMA:
                return 88;
            case UL:
                return 89;
            case ULTIMO:
                return 90;
            case '(':
                return 93;
        }
        return 683;
    }

    private int yys104() {
        switch (yytok) {
            case AZAR:
                return 35;
            case COS:
                return 40;
            case CUENTA:
                return 41;
            case DIFERENCIA:
                return 42;
            case DIVISION:
                return 43;
            case ELEGIR:
                return 45;
            case ELEMENTO:
                return 46;
            case FLOAT:
                return 48;
            case IDENTIFIER:
                return 53;
            case INTEGER:
                return 57;
            case MENOS:
                return 60;
            case POTENCIA:
                return 72;
            case PRIMERO:
                return 73;
            case PRODUCTO:
                return 74;
            case RAIZCUADRADA:
                return 75;
            case RC:
                return 76;
            case REDONDEA:
                return 78;
            case RESTO:
                return 80;
            case RUMBO:
                return 82;
            case SEN:
                return 84;
            case SENO:
                return 85;
            case SUMA:
                return 88;
            case UL:
                return 89;
            case ULTIMO:
                return 90;
            case '(':
                return 93;
        }
        return 683;
    }

    private int yys105() {
        switch (yytok) {
            case AZAR:
                return 35;
            case COS:
                return 40;
            case CUENTA:
                return 41;
            case DIFERENCIA:
                return 42;
            case DIVISION:
                return 43;
            case ELEGIR:
                return 45;
            case ELEMENTO:
                return 46;
            case FLOAT:
                return 48;
            case IDENTIFIER:
                return 53;
            case INTEGER:
                return 57;
            case MENOS:
                return 60;
            case POTENCIA:
                return 72;
            case PRIMERO:
                return 73;
            case PRODUCTO:
                return 74;
            case RAIZCUADRADA:
                return 75;
            case RC:
                return 76;
            case REDONDEA:
                return 78;
            case RESTO:
                return 80;
            case RUMBO:
                return 82;
            case SEN:
                return 84;
            case SENO:
                return 85;
            case SUMA:
                return 88;
            case UL:
                return 89;
            case ULTIMO:
                return 90;
            case '(':
                return 93;
        }
        return 683;
    }

    private int yys106() {
        switch (yytok) {
            case AZAR:
                return 35;
            case COS:
                return 40;
            case CUENTA:
                return 41;
            case DIFERENCIA:
                return 42;
            case DIVISION:
                return 43;
            case ELEGIR:
                return 45;
            case ELEMENTO:
                return 46;
            case FLOAT:
                return 48;
            case IDENTIFIER:
                return 53;
            case INTEGER:
                return 57;
            case MENOS:
                return 60;
            case POTENCIA:
                return 72;
            case PRIMERO:
                return 73;
            case PRODUCTO:
                return 74;
            case RAIZCUADRADA:
                return 75;
            case RC:
                return 76;
            case REDONDEA:
                return 78;
            case RESTO:
                return 80;
            case RUMBO:
                return 82;
            case SEN:
                return 84;
            case SENO:
                return 85;
            case SUMA:
                return 88;
            case UL:
                return 89;
            case ULTIMO:
                return 90;
            case '(':
                return 93;
        }
        return 683;
    }

    private int yys107() {
        switch (yytok) {
            case AZAR:
                return 35;
            case COS:
                return 40;
            case CUENTA:
                return 41;
            case DIFERENCIA:
                return 42;
            case DIVISION:
                return 43;
            case ELEGIR:
                return 45;
            case ELEMENTO:
                return 46;
            case FLOAT:
                return 48;
            case IDENTIFIER:
                return 53;
            case INTEGER:
                return 57;
            case MENOS:
                return 60;
            case POTENCIA:
                return 72;
            case PRIMERO:
                return 73;
            case PRODUCTO:
                return 74;
            case RAIZCUADRADA:
                return 75;
            case RC:
                return 76;
            case REDONDEA:
                return 78;
            case RESTO:
                return 80;
            case RUMBO:
                return 82;
            case SEN:
                return 84;
            case SENO:
                return 85;
            case SUMA:
                return 88;
            case UL:
                return 89;
            case ULTIMO:
                return 90;
            case '(':
                return 93;
        }
        return 683;
    }

    private int yys108() {
        switch (yytok) {
            case APARECETORTUGA:
                return 31;
            case AT:
                return 32;
            case AV:
                return 33;
            case AVANZA:
                return 34;
            case AZAR:
                return 35;
            case BAJALAPIZ:
                return 36;
            case BL:
                return 37;
            case BORRAPANTALLA:
                return 38;
            case CENTRO:
                return 39;
            case COS:
                return 40;
            case CUENTA:
                return 41;
            case DIFERENCIA:
                return 42;
            case DIVISION:
                return 43;
            case EJECUTA:
                return 44;
            case ELEGIR:
                return 45;
            case ELEMENTO:
                return 46;
            case ESPERA:
                return 47;
            case FLOAT:
                return 48;
            case GD:
                return 49;
            case GI:
                return 50;
            case GIRADERECHA:
                return 51;
            case GIRAIZQUIERDA:
                return 52;
            case IDENTIFIER:
                return 53;
            case IGUALES:
                return 54;
            case INC:
                return 55;
            case INIC:
                return 56;
            case INTEGER:
                return 57;
            case MAYORQUE:
                return 58;
            case MENORQUE:
                return 59;
            case MENOS:
                return 60;
            case O:
                return 61;
            case OCULTATORTUGA:
                return 62;
            case OT:
                return 63;
            case PARA:
                return 64;
            case PONCL:
                return 65;
            case PONCOLORLAPIZ:
                return 66;
            case PONPOS:
                return 67;
            case PONRUMBO:
                return 68;
            case PONX:
                return 69;
            case PONXY:
                return 70;
            case PONY:
                return 71;
            case POTENCIA:
                return 72;
            case PRIMERO:
                return 73;
            case PRODUCTO:
                return 74;
            case RAIZCUADRADA:
                return 75;
            case RC:
                return 76;
            case RE:
                return 77;
            case REDONDEA:
                return 78;
            case REPITE:
                return 79;
            case RESTO:
                return 80;
            case RETROCEDE:
                return 81;
            case RUMBO:
                return 82;
            case SB:
                return 83;
            case SEN:
                return 84;
            case SENO:
                return 85;
            case SI:
                return 86;
            case SUBELAPIZ:
                return 87;
            case SUMA:
                return 88;
            case UL:
                return 89;
            case ULTIMO:
                return 90;
            case VAR:
                return 91;
            case Y:
                return 92;
            case '(':
                return 93;
        }
        return 683;
    }

    private int yys109() {
        switch (yytok) {
            case APARECETORTUGA:
                return 31;
            case AT:
                return 32;
            case AV:
                return 33;
            case AVANZA:
                return 34;
            case AZAR:
                return 35;
            case BAJALAPIZ:
                return 36;
            case BL:
                return 37;
            case BORRAPANTALLA:
                return 38;
            case CENTRO:
                return 39;
            case COS:
                return 40;
            case CUENTA:
                return 41;
            case DIFERENCIA:
                return 42;
            case DIVISION:
                return 43;
            case EJECUTA:
                return 44;
            case ELEGIR:
                return 45;
            case ELEMENTO:
                return 46;
            case ESPERA:
                return 47;
            case FLOAT:
                return 48;
            case GD:
                return 49;
            case GI:
                return 50;
            case GIRADERECHA:
                return 51;
            case GIRAIZQUIERDA:
                return 52;
            case IDENTIFIER:
                return 53;
            case IGUALES:
                return 54;
            case INC:
                return 55;
            case INIC:
                return 56;
            case INTEGER:
                return 57;
            case MAYORQUE:
                return 58;
            case MENORQUE:
                return 59;
            case MENOS:
                return 60;
            case O:
                return 61;
            case OCULTATORTUGA:
                return 62;
            case OT:
                return 63;
            case PARA:
                return 64;
            case PONCL:
                return 65;
            case PONCOLORLAPIZ:
                return 66;
            case PONPOS:
                return 67;
            case PONRUMBO:
                return 68;
            case PONX:
                return 69;
            case PONXY:
                return 70;
            case PONY:
                return 71;
            case POTENCIA:
                return 72;
            case PRIMERO:
                return 73;
            case PRODUCTO:
                return 74;
            case RAIZCUADRADA:
                return 75;
            case RC:
                return 76;
            case RE:
                return 77;
            case REDONDEA:
                return 78;
            case REPITE:
                return 79;
            case RESTO:
                return 80;
            case RETROCEDE:
                return 81;
            case RUMBO:
                return 82;
            case SB:
                return 83;
            case SEN:
                return 84;
            case SENO:
                return 85;
            case SI:
                return 86;
            case SUBELAPIZ:
                return 87;
            case SUMA:
                return 88;
            case UL:
                return 89;
            case ULTIMO:
                return 90;
            case VAR:
                return 91;
            case Y:
                return 92;
            case '(':
                return 93;
            case FIN:
                return yyr31();
        }
        return 683;
    }

    private int yys111() {
        switch (yytok) {
            case APARECETORTUGA:
                return 31;
            case AT:
                return 32;
            case AV:
                return 33;
            case AVANZA:
                return 34;
            case AZAR:
                return 35;
            case BAJALAPIZ:
                return 36;
            case BL:
                return 37;
            case BORRAPANTALLA:
                return 38;
            case CENTRO:
                return 39;
            case COS:
                return 40;
            case CUENTA:
                return 41;
            case DIFERENCIA:
                return 42;
            case DIVISION:
                return 43;
            case EJECUTA:
                return 44;
            case ELEGIR:
                return 45;
            case ELEMENTO:
                return 46;
            case ESPERA:
                return 47;
            case FLOAT:
                return 48;
            case GD:
                return 49;
            case GI:
                return 50;
            case GIRADERECHA:
                return 51;
            case GIRAIZQUIERDA:
                return 52;
            case IDENTIFIER:
                return 53;
            case IGUALES:
                return 54;
            case INC:
                return 55;
            case INIC:
                return 56;
            case INTEGER:
                return 57;
            case MAYORQUE:
                return 58;
            case MENORQUE:
                return 59;
            case MENOS:
                return 60;
            case O:
                return 61;
            case OCULTATORTUGA:
                return 62;
            case OT:
                return 63;
            case PARA:
                return 64;
            case PONCL:
                return 65;
            case PONCOLORLAPIZ:
                return 66;
            case PONPOS:
                return 67;
            case PONRUMBO:
                return 68;
            case PONX:
                return 69;
            case PONXY:
                return 70;
            case PONY:
                return 71;
            case POTENCIA:
                return 72;
            case PRIMERO:
                return 73;
            case PRODUCTO:
                return 74;
            case RAIZCUADRADA:
                return 75;
            case RC:
                return 76;
            case RE:
                return 77;
            case REDONDEA:
                return 78;
            case REPITE:
                return 79;
            case RESTO:
                return 80;
            case RETROCEDE:
                return 81;
            case RUMBO:
                return 82;
            case SB:
                return 83;
            case SEN:
                return 84;
            case SENO:
                return 85;
            case SI:
                return 86;
            case SUBELAPIZ:
                return 87;
            case SUMA:
                return 88;
            case UL:
                return 89;
            case ULTIMO:
                return 90;
            case VAR:
                return 91;
            case Y:
                return 92;
            case '(':
                return 93;
        }
        return 683;
    }

    private int yys112() {
        switch (yytok) {
            case '-':
            case error:
            case '[':
            case ROJO:
            case '*':
            case '/':
            case NEGRO:
            case '>':
            case AZUL:
            case FIN:
            case ';':
            case VERDE:
            case ']':
            case '=':
            case '<':
            case ')':
            case '+':
            case MARRON:
            case AMARILLO:
            case GRIS:
            case CIAN:
            case PROCEDURE_NAME:
            case ENDINPUT:
            case BLANCO:
                return 683;
            case PARAMETER:
                return 112;
        }
        return yyr29();
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
                return 683;
        }
        return yyr37();
    }

    private int yys114() {
        switch (yytok) {
            case PROCEDURE_NAME:
            case '/':
            case GRIS:
            case MARRON:
            case PARAMETER:
            case NEGRO:
            case AZUL:
            case '[':
            case ROJO:
            case AMARILLO:
            case VERDE:
            case '=':
            case BLANCO:
            case error:
            case '<':
            case ENDINPUT:
            case ')':
            case '>':
            case CIAN:
                return 683;
            case '*':
                return 252;
            case '+':
                return 253;
            case '-':
                return 254;
        }
        return yyr119();
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
                return 683;
        }
        return yyr38();
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
                return 683;
        }
        return yyr39();
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
                return 683;
        }
        return yyr41();
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
                return 683;
        }
        return yyr42();
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
                return 683;
        }
        return yyr40();
    }

    private int yys120() {
        switch (yytok) {
            case AZAR:
                return 35;
            case CUENTA:
                return 41;
            case INTEGER:
                return 57;
            case REDONDEA:
                return 78;
            case RESTO:
                return 80;
            case DIFERENCIA:
                return 120;
            case ELEGIR:
                return 121;
            case ELEMENTO:
                return 122;
            case IDENTIFIER:
                return 123;
            case MENOS:
                return 124;
            case POTENCIA:
                return 125;
            case PRIMERO:
                return 126;
            case PRODUCTO:
                return 127;
            case SUMA:
                return 128;
            case UL:
                return 129;
            case ULTIMO:
                return 130;
            case '(':
                return 131;
        }
        return 683;
    }

    private int yys122() {
        switch (yytok) {
            case AZAR:
                return 35;
            case CUENTA:
                return 41;
            case INTEGER:
                return 57;
            case REDONDEA:
                return 78;
            case RESTO:
                return 80;
            case DIFERENCIA:
                return 120;
            case ELEGIR:
                return 121;
            case ELEMENTO:
                return 122;
            case IDENTIFIER:
                return 123;
            case MENOS:
                return 124;
            case POTENCIA:
                return 125;
            case PRIMERO:
                return 126;
            case PRODUCTO:
                return 127;
            case SUMA:
                return 128;
            case UL:
                return 129;
            case ULTIMO:
                return 130;
            case '(':
                return 131;
        }
        return 683;
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
                return 683;
        }
        return yyr36();
    }

    private int yys124() {
        switch (yytok) {
            case AZAR:
                return 35;
            case CUENTA:
                return 41;
            case INTEGER:
                return 57;
            case REDONDEA:
                return 78;
            case RESTO:
                return 80;
            case DIFERENCIA:
                return 120;
            case ELEGIR:
                return 121;
            case ELEMENTO:
                return 122;
            case IDENTIFIER:
                return 123;
            case MENOS:
                return 124;
            case POTENCIA:
                return 125;
            case PRIMERO:
                return 126;
            case PRODUCTO:
                return 127;
            case SUMA:
                return 128;
            case UL:
                return 129;
            case ULTIMO:
                return 130;
            case '(':
                return 131;
        }
        return 683;
    }

    private int yys125() {
        switch (yytok) {
            case AZAR:
                return 35;
            case CUENTA:
                return 41;
            case INTEGER:
                return 57;
            case REDONDEA:
                return 78;
            case RESTO:
                return 80;
            case DIFERENCIA:
                return 120;
            case ELEGIR:
                return 121;
            case ELEMENTO:
                return 122;
            case IDENTIFIER:
                return 123;
            case MENOS:
                return 124;
            case POTENCIA:
                return 125;
            case PRIMERO:
                return 126;
            case PRODUCTO:
                return 127;
            case SUMA:
                return 128;
            case UL:
                return 129;
            case ULTIMO:
                return 130;
            case '(':
                return 131;
        }
        return 683;
    }

    private int yys127() {
        switch (yytok) {
            case AZAR:
                return 35;
            case CUENTA:
                return 41;
            case INTEGER:
                return 57;
            case REDONDEA:
                return 78;
            case RESTO:
                return 80;
            case DIFERENCIA:
                return 120;
            case ELEGIR:
                return 121;
            case ELEMENTO:
                return 122;
            case IDENTIFIER:
                return 123;
            case MENOS:
                return 124;
            case POTENCIA:
                return 125;
            case PRIMERO:
                return 126;
            case PRODUCTO:
                return 127;
            case SUMA:
                return 128;
            case UL:
                return 129;
            case ULTIMO:
                return 130;
            case '(':
                return 131;
        }
        return 683;
    }

    private int yys128() {
        switch (yytok) {
            case AZAR:
                return 35;
            case CUENTA:
                return 41;
            case INTEGER:
                return 57;
            case REDONDEA:
                return 78;
            case RESTO:
                return 80;
            case DIFERENCIA:
                return 120;
            case ELEGIR:
                return 121;
            case ELEMENTO:
                return 122;
            case IDENTIFIER:
                return 123;
            case MENOS:
                return 124;
            case POTENCIA:
                return 125;
            case PRIMERO:
                return 126;
            case PRODUCTO:
                return 127;
            case SUMA:
                return 128;
            case UL:
                return 129;
            case ULTIMO:
                return 130;
            case '(':
                return 131;
        }
        return 683;
    }

    private int yys131() {
        switch (yytok) {
            case AZAR:
                return 35;
            case CUENTA:
                return 41;
            case INTEGER:
                return 57;
            case REDONDEA:
                return 78;
            case RESTO:
                return 80;
            case DIFERENCIA:
                return 120;
            case ELEGIR:
                return 121;
            case ELEMENTO:
                return 122;
            case IDENTIFIER:
                return 123;
            case MENOS:
                return 124;
            case POTENCIA:
                return 125;
            case PRIMERO:
                return 126;
            case PRODUCTO:
                return 127;
            case SUMA:
                return 128;
            case UL:
                return 129;
            case ULTIMO:
                return 130;
            case '(':
                return 131;
        }
        return 683;
    }

    private int yys132() {
        switch (yytok) {
            case PROCEDURE_NAME:
            case '/':
            case GRIS:
            case MARRON:
            case PARAMETER:
            case NEGRO:
            case AZUL:
            case '[':
            case ROJO:
            case AMARILLO:
            case VERDE:
            case '=':
            case BLANCO:
            case error:
            case '<':
            case ENDINPUT:
            case ')':
            case '>':
            case CIAN:
                return 683;
            case '*':
                return 252;
            case '+':
                return 253;
            case '-':
                return 254;
        }
        return yyr118();
    }

    private int yys133() {
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
                return 683;
            case '*':
                return 252;
            case '+':
                return 253;
            case '-':
                return 254;
        }
        return yyr105();
    }

    private int yys134() {
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
                return 683;
        }
        return yyr45();
    }

    private int yys135() {
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
                return 683;
            case '*':
                return 96;
            case '+':
                return 97;
            case '-':
                return 98;
            case '/':
                return 99;
        }
        return yyr108();
    }

    private int yys136() {
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
                return 683;
        }
        return yyr46();
    }

    private int yys137() {
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
                return 683;
        }
        return yyr47();
    }

    private int yys138() {
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
                return 683;
        }
        return yyr48();
    }

    private int yys139() {
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
                return 683;
        }
        return yyr50();
    }

    private int yys140() {
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
                return 683;
        }
        return yyr51();
    }

    private int yys141() {
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
                return 683;
        }
        return yyr49();
    }

    private int yys142() {
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
                return 683;
            case '*':
                return 102;
            case '+':
                return 103;
            case '-':
                return 104;
            case '/':
                return 105;
        }
        return yyr107();
    }

    private int yys143() {
        switch (yytok) {
            case AZAR:
                return 35;
            case COS:
                return 40;
            case CUENTA:
                return 41;
            case DIFERENCIA:
                return 42;
            case DIVISION:
                return 43;
            case ELEGIR:
                return 45;
            case ELEMENTO:
                return 46;
            case FLOAT:
                return 48;
            case IDENTIFIER:
                return 53;
            case INTEGER:
                return 57;
            case MENOS:
                return 60;
            case POTENCIA:
                return 72;
            case PRIMERO:
                return 73;
            case PRODUCTO:
                return 74;
            case RAIZCUADRADA:
                return 75;
            case RC:
                return 76;
            case REDONDEA:
                return 78;
            case RESTO:
                return 80;
            case RUMBO:
                return 82;
            case SEN:
                return 84;
            case SENO:
                return 85;
            case SUMA:
                return 88;
            case UL:
                return 89;
            case ULTIMO:
                return 90;
            case '(':
                return 93;
        }
        return 683;
    }

    private int yys144() {
        switch (yytok) {
            case ENDINPUT:
            case VERDE:
            case GRIS:
            case PARAMETER:
            case error:
            case BLANCO:
            case CIAN:
            case NEGRO:
            case MARRON:
            case '=':
            case AMARILLO:
            case AZUL:
            case PROCEDURE_NAME:
            case ROJO:
                return 683;
            case AZAR:
                return 35;
            case COS:
                return 40;
            case CUENTA:
                return 41;
            case DIFERENCIA:
                return 42;
            case DIVISION:
                return 43;
            case ELEGIR:
                return 45;
            case ELEMENTO:
                return 46;
            case FLOAT:
                return 48;
            case IDENTIFIER:
                return 53;
            case INTEGER:
                return 57;
            case MENOS:
                return 60;
            case POTENCIA:
                return 72;
            case PRIMERO:
                return 73;
            case PRODUCTO:
                return 74;
            case RAIZCUADRADA:
                return 75;
            case RC:
                return 76;
            case REDONDEA:
                return 78;
            case RESTO:
                return 80;
            case RUMBO:
                return 82;
            case SEN:
                return 84;
            case SENO:
                return 85;
            case SUMA:
                return 88;
            case UL:
                return 89;
            case ULTIMO:
                return 90;
            case '(':
                return 93;
            case '*':
                return 96;
            case '+':
                return 97;
            case '-':
                return 98;
            case '/':
                return 99;
        }
        return yyr165();
    }

    private int yys145() {
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
                return 683;
        }
        return yyr169();
    }

    private int yys146() {
        switch (yytok) {
            case PROCEDURE_NAME:
            case AZUL:
            case BLANCO:
            case '=':
            case GRIS:
            case NEGRO:
            case error:
            case CIAN:
            case ROJO:
            case AMARILLO:
            case ENDINPUT:
            case MARRON:
            case PARAMETER:
            case VERDE:
                return 683;
            case AZAR:
                return 35;
            case CUENTA:
                return 41;
            case INTEGER:
                return 57;
            case REDONDEA:
                return 78;
            case RESTO:
                return 80;
            case '*':
                return 102;
            case '+':
                return 103;
            case '-':
                return 104;
            case '/':
                return 105;
            case DIFERENCIA:
                return 120;
            case ELEGIR:
                return 121;
            case ELEMENTO:
                return 122;
            case IDENTIFIER:
                return 123;
            case MENOS:
                return 124;
            case POTENCIA:
                return 125;
            case PRIMERO:
                return 126;
            case PRODUCTO:
                return 127;
            case SUMA:
                return 128;
            case UL:
                return 129;
            case ULTIMO:
                return 130;
            case '(':
                return 131;
        }
        return yyr163();
    }

    private int yys147() {
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
                return 683;
        }
        return yyr166();
    }

    private int yys148() {
        switch (yytok) {
            case AZAR:
                return 35;
            case COS:
                return 40;
            case CUENTA:
                return 41;
            case DIFERENCIA:
                return 42;
            case DIVISION:
                return 43;
            case ELEGIR:
                return 45;
            case ELEMENTO:
                return 46;
            case FLOAT:
                return 48;
            case IDENTIFIER:
                return 53;
            case INTEGER:
                return 57;
            case MENOS:
                return 60;
            case POTENCIA:
                return 72;
            case PRIMERO:
                return 73;
            case PRODUCTO:
                return 74;
            case RAIZCUADRADA:
                return 75;
            case RC:
                return 76;
            case REDONDEA:
                return 78;
            case RESTO:
                return 80;
            case RUMBO:
                return 82;
            case SEN:
                return 84;
            case SENO:
                return 85;
            case SUMA:
                return 88;
            case UL:
                return 89;
            case ULTIMO:
                return 90;
            case '(':
                return 93;
            case '*':
                return 96;
            case '+':
                return 97;
            case '-':
                return 98;
            case '/':
                return 99;
        }
        return 683;
    }

    private int yys149() {
        switch (yytok) {
            case AZAR:
                return 35;
            case COS:
                return 40;
            case CUENTA:
                return 41;
            case DIFERENCIA:
                return 42;
            case DIVISION:
                return 43;
            case ELEGIR:
                return 45;
            case ELEMENTO:
                return 46;
            case FLOAT:
                return 48;
            case IDENTIFIER:
                return 53;
            case INTEGER:
                return 57;
            case MENOS:
                return 60;
            case POTENCIA:
                return 72;
            case PRIMERO:
                return 73;
            case PRODUCTO:
                return 74;
            case RAIZCUADRADA:
                return 75;
            case RC:
                return 76;
            case REDONDEA:
                return 78;
            case RESTO:
                return 80;
            case RUMBO:
                return 82;
            case SEN:
                return 84;
            case SENO:
                return 85;
            case SUMA:
                return 88;
            case UL:
                return 89;
            case ULTIMO:
                return 90;
            case '(':
                return 93;
            case '*':
                return 102;
            case '+':
                return 103;
            case '-':
                return 104;
            case '/':
                return 105;
        }
        return 683;
    }

    private int yys150() {
        switch (yytok) {
            case AZAR:
                return 35;
            case COS:
                return 40;
            case CUENTA:
                return 41;
            case DIFERENCIA:
                return 42;
            case DIVISION:
                return 43;
            case ELEGIR:
                return 45;
            case ELEMENTO:
                return 46;
            case FLOAT:
                return 48;
            case IDENTIFIER:
                return 53;
            case INTEGER:
                return 57;
            case MENOS:
                return 60;
            case POTENCIA:
                return 72;
            case PRIMERO:
                return 73;
            case PRODUCTO:
                return 74;
            case RAIZCUADRADA:
                return 75;
            case RC:
                return 76;
            case REDONDEA:
                return 78;
            case RESTO:
                return 80;
            case RUMBO:
                return 82;
            case SEN:
                return 84;
            case SENO:
                return 85;
            case SUMA:
                return 88;
            case UL:
                return 89;
            case ULTIMO:
                return 90;
            case '(':
                return 93;
        }
        return 683;
    }

    private int yys152() {
        switch (yytok) {
            case CIAN:
            case BLANCO:
            case PROCEDURE_NAME:
            case MARRON:
            case PARAMETER:
            case error:
            case GRIS:
            case '[':
            case ROJO:
            case AMARILLO:
            case VERDE:
            case '=':
            case NEGRO:
            case ENDINPUT:
            case '<':
            case AZUL:
            case ')':
            case '>':
                return 683;
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

    private int yys153() {
        switch (yytok) {
            case CIAN:
            case BLANCO:
            case PROCEDURE_NAME:
            case MARRON:
            case PARAMETER:
            case error:
            case GRIS:
            case '[':
            case ROJO:
            case AMARILLO:
            case VERDE:
            case '=':
            case NEGRO:
            case ENDINPUT:
            case '<':
            case AZUL:
            case ')':
            case '>':
                return 683;
            case '*':
                return 102;
            case '+':
                return 103;
            case '-':
                return 104;
            case '/':
                return 105;
        }
        return yyr136();
    }

    private int yys154() {
        switch (yytok) {
            case CIAN:
            case BLANCO:
            case PROCEDURE_NAME:
            case MARRON:
            case PARAMETER:
            case error:
            case GRIS:
            case '[':
            case ROJO:
            case AMARILLO:
            case VERDE:
            case '=':
            case NEGRO:
            case ENDINPUT:
            case '<':
            case AZUL:
            case ')':
            case '>':
                return 683;
            case '*':
                return 96;
            case '+':
                return 97;
            case '-':
                return 98;
            case '/':
                return 99;
        }
        return yyr125();
    }

    private int yys155() {
        switch (yytok) {
            case CIAN:
            case BLANCO:
            case PROCEDURE_NAME:
            case MARRON:
            case PARAMETER:
            case error:
            case GRIS:
            case '[':
            case ROJO:
            case AMARILLO:
            case VERDE:
            case '=':
            case NEGRO:
            case ENDINPUT:
            case '<':
            case AZUL:
            case ')':
            case '>':
                return 683;
            case '*':
                return 102;
            case '+':
                return 103;
            case '-':
                return 104;
            case '/':
                return 105;
        }
        return yyr124();
    }

    private int yys156() {
        switch (yytok) {
            case CIAN:
            case BLANCO:
            case PROCEDURE_NAME:
            case MARRON:
            case PARAMETER:
            case error:
            case GRIS:
            case '[':
            case ROJO:
            case AMARILLO:
            case VERDE:
            case '=':
            case NEGRO:
            case ENDINPUT:
            case '<':
            case AZUL:
            case ')':
            case '>':
                return 683;
            case '*':
                return 96;
            case '+':
                return 97;
            case '-':
                return 98;
            case '/':
                return 99;
        }
        return yyr129();
    }

    private int yys157() {
        switch (yytok) {
            case CIAN:
            case BLANCO:
            case PROCEDURE_NAME:
            case MARRON:
            case PARAMETER:
            case error:
            case GRIS:
            case '[':
            case ROJO:
            case AMARILLO:
            case VERDE:
            case '=':
            case NEGRO:
            case ENDINPUT:
            case '<':
            case AZUL:
            case ')':
            case '>':
                return 683;
            case '*':
                return 102;
            case '+':
                return 103;
            case '-':
                return 104;
            case '/':
                return 105;
        }
        return yyr128();
    }

    private int yys158() {
        switch (yytok) {
            case CIAN:
            case BLANCO:
            case PROCEDURE_NAME:
            case MARRON:
            case PARAMETER:
            case error:
            case GRIS:
            case '[':
            case ROJO:
            case AMARILLO:
            case VERDE:
            case '=':
            case NEGRO:
            case ENDINPUT:
            case '<':
            case AZUL:
            case ')':
            case '>':
                return 683;
            case '*':
                return 96;
            case '+':
                return 97;
            case '-':
                return 98;
            case '/':
                return 99;
        }
        return yyr123();
    }

    private int yys159() {
        switch (yytok) {
            case CIAN:
            case BLANCO:
            case PROCEDURE_NAME:
            case MARRON:
            case PARAMETER:
            case error:
            case GRIS:
            case '[':
            case ROJO:
            case AMARILLO:
            case VERDE:
            case '=':
            case NEGRO:
            case ENDINPUT:
            case '<':
            case AZUL:
            case ')':
            case '>':
                return 683;
            case '*':
                return 102;
            case '+':
                return 103;
            case '-':
                return 104;
            case '/':
                return 105;
        }
        return yyr122();
    }

    private int yys160() {
        switch (yytok) {
            case CIAN:
            case BLANCO:
            case PROCEDURE_NAME:
            case MARRON:
            case PARAMETER:
            case error:
            case GRIS:
            case '[':
            case ROJO:
            case AMARILLO:
            case VERDE:
            case '=':
            case NEGRO:
            case ENDINPUT:
            case '<':
            case AZUL:
            case ')':
            case '>':
                return 683;
            case '*':
                return 96;
            case '+':
                return 97;
            case '-':
                return 98;
            case '/':
                return 99;
        }
        return yyr127();
    }

    private int yys161() {
        switch (yytok) {
            case CIAN:
            case BLANCO:
            case PROCEDURE_NAME:
            case MARRON:
            case PARAMETER:
            case error:
            case GRIS:
            case '[':
            case ROJO:
            case AMARILLO:
            case VERDE:
            case '=':
            case NEGRO:
            case ENDINPUT:
            case '<':
            case AZUL:
            case ')':
            case '>':
                return 683;
            case '*':
                return 102;
            case '+':
                return 103;
            case '-':
                return 104;
            case '/':
                return 105;
        }
        return yyr126();
    }

    private int yys162() {
        switch (yytok) {
            case AZAR:
                return 35;
            case COS:
                return 40;
            case CUENTA:
                return 41;
            case DIFERENCIA:
                return 42;
            case DIVISION:
                return 43;
            case ELEGIR:
                return 45;
            case ELEMENTO:
                return 46;
            case FLOAT:
                return 48;
            case IDENTIFIER:
                return 53;
            case INTEGER:
                return 57;
            case MENOS:
                return 60;
            case POTENCIA:
                return 72;
            case PRIMERO:
                return 73;
            case PRODUCTO:
                return 74;
            case RAIZCUADRADA:
                return 75;
            case RC:
                return 76;
            case REDONDEA:
                return 78;
            case RESTO:
                return 80;
            case RUMBO:
                return 82;
            case SEN:
                return 84;
            case SENO:
                return 85;
            case SUMA:
                return 88;
            case UL:
                return 89;
            case ULTIMO:
                return 90;
            case '(':
                return 93;
            case '*':
                return 96;
            case '+':
                return 97;
            case '-':
                return 98;
            case '/':
                return 99;
        }
        return 683;
    }

    private int yys163() {
        switch (yytok) {
            case AZAR:
                return 35;
            case COS:
                return 40;
            case CUENTA:
                return 41;
            case DIFERENCIA:
                return 42;
            case DIVISION:
                return 43;
            case ELEGIR:
                return 45;
            case ELEMENTO:
                return 46;
            case FLOAT:
                return 48;
            case IDENTIFIER:
                return 53;
            case INTEGER:
                return 57;
            case MENOS:
                return 60;
            case POTENCIA:
                return 72;
            case PRIMERO:
                return 73;
            case PRODUCTO:
                return 74;
            case RAIZCUADRADA:
                return 75;
            case RC:
                return 76;
            case REDONDEA:
                return 78;
            case RESTO:
                return 80;
            case RUMBO:
                return 82;
            case SEN:
                return 84;
            case SENO:
                return 85;
            case SUMA:
                return 88;
            case UL:
                return 89;
            case ULTIMO:
                return 90;
            case '(':
                return 93;
            case '*':
                return 102;
            case '+':
                return 103;
            case '-':
                return 104;
            case '/':
                return 105;
        }
        return 683;
    }

    private int yys166() {
        switch (yytok) {
            case AZAR:
                return 35;
            case COS:
                return 40;
            case CUENTA:
                return 41;
            case DIFERENCIA:
                return 42;
            case DIVISION:
                return 43;
            case ELEGIR:
                return 45;
            case ELEMENTO:
                return 46;
            case FLOAT:
                return 48;
            case IDENTIFIER:
                return 53;
            case INTEGER:
                return 57;
            case MENOS:
                return 60;
            case POTENCIA:
                return 72;
            case PRIMERO:
                return 73;
            case PRODUCTO:
                return 74;
            case RAIZCUADRADA:
                return 75;
            case RC:
                return 76;
            case REDONDEA:
                return 78;
            case RESTO:
                return 80;
            case RUMBO:
                return 82;
            case SEN:
                return 84;
            case SENO:
                return 85;
            case SUMA:
                return 88;
            case UL:
                return 89;
            case ULTIMO:
                return 90;
            case '(':
                return 93;
            case '*':
                return 96;
            case '+':
                return 97;
            case '-':
                return 98;
            case '/':
                return 99;
        }
        return 683;
    }

    private int yys167() {
        switch (yytok) {
            case AZAR:
                return 35;
            case COS:
                return 40;
            case CUENTA:
                return 41;
            case DIFERENCIA:
                return 42;
            case DIVISION:
                return 43;
            case ELEGIR:
                return 45;
            case ELEMENTO:
                return 46;
            case FLOAT:
                return 48;
            case IDENTIFIER:
                return 53;
            case INTEGER:
                return 57;
            case MENOS:
                return 60;
            case POTENCIA:
                return 72;
            case PRIMERO:
                return 73;
            case PRODUCTO:
                return 74;
            case RAIZCUADRADA:
                return 75;
            case RC:
                return 76;
            case REDONDEA:
                return 78;
            case RESTO:
                return 80;
            case RUMBO:
                return 82;
            case SEN:
                return 84;
            case SENO:
                return 85;
            case SUMA:
                return 88;
            case UL:
                return 89;
            case ULTIMO:
                return 90;
            case '(':
                return 93;
            case '*':
                return 102;
            case '+':
                return 103;
            case '-':
                return 104;
            case '/':
                return 105;
        }
        return 683;
    }

    private int yys168() {
        switch (yytok) {
            case AZAR:
                return 35;
            case COS:
                return 40;
            case CUENTA:
                return 41;
            case DIFERENCIA:
                return 42;
            case DIVISION:
                return 43;
            case ELEGIR:
                return 45;
            case ELEMENTO:
                return 46;
            case FLOAT:
                return 48;
            case IDENTIFIER:
                return 53;
            case INTEGER:
                return 57;
            case MENOS:
                return 60;
            case POTENCIA:
                return 72;
            case PRIMERO:
                return 73;
            case PRODUCTO:
                return 74;
            case RAIZCUADRADA:
                return 75;
            case RC:
                return 76;
            case REDONDEA:
                return 78;
            case RESTO:
                return 80;
            case RUMBO:
                return 82;
            case SEN:
                return 84;
            case SENO:
                return 85;
            case SUMA:
                return 88;
            case UL:
                return 89;
            case ULTIMO:
                return 90;
            case '(':
                return 93;
            case '*':
                return 96;
            case '+':
                return 97;
            case '-':
                return 98;
            case '/':
                return 99;
        }
        return 683;
    }

    private int yys169() {
        switch (yytok) {
            case AZAR:
                return 35;
            case COS:
                return 40;
            case CUENTA:
                return 41;
            case DIFERENCIA:
                return 42;
            case DIVISION:
                return 43;
            case ELEGIR:
                return 45;
            case ELEMENTO:
                return 46;
            case FLOAT:
                return 48;
            case IDENTIFIER:
                return 53;
            case INTEGER:
                return 57;
            case MENOS:
                return 60;
            case POTENCIA:
                return 72;
            case PRIMERO:
                return 73;
            case PRODUCTO:
                return 74;
            case RAIZCUADRADA:
                return 75;
            case RC:
                return 76;
            case REDONDEA:
                return 78;
            case RESTO:
                return 80;
            case RUMBO:
                return 82;
            case SEN:
                return 84;
            case SENO:
                return 85;
            case SUMA:
                return 88;
            case UL:
                return 89;
            case ULTIMO:
                return 90;
            case '(':
                return 93;
            case '*':
                return 102;
            case '+':
                return 103;
            case '-':
                return 104;
            case '/':
                return 105;
        }
        return 683;
    }

    private int yys170() {
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
                return 683;
            case '*':
                return 96;
            case '+':
                return 97;
            case '-':
                return 98;
            case '/':
                return 99;
        }
        return yyr109();
    }

    private int yys171() {
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
                return 683;
            case '*':
                return 102;
            case '+':
                return 103;
            case '-':
                return 104;
            case '/':
                return 105;
        }
        return yyr106();
    }

    private int yys172() {
        switch (yytok) {
            case AZAR:
                return 35;
            case COS:
                return 40;
            case CUENTA:
                return 41;
            case DIFERENCIA:
                return 42;
            case DIVISION:
                return 43;
            case ELEGIR:
                return 45;
            case ELEMENTO:
                return 46;
            case FLOAT:
                return 48;
            case IDENTIFIER:
                return 53;
            case IGUALES:
                return 54;
            case INTEGER:
                return 57;
            case MAYORQUE:
                return 58;
            case MENORQUE:
                return 59;
            case MENOS:
                return 60;
            case O:
                return 61;
            case POTENCIA:
                return 72;
            case PRIMERO:
                return 73;
            case PRODUCTO:
                return 74;
            case RAIZCUADRADA:
                return 75;
            case RC:
                return 76;
            case REDONDEA:
                return 78;
            case RESTO:
                return 80;
            case RUMBO:
                return 82;
            case SEN:
                return 84;
            case SENO:
                return 85;
            case SUMA:
                return 88;
            case UL:
                return 89;
            case ULTIMO:
                return 90;
            case Y:
                return 92;
            case '(':
                return 93;
        }
        return 683;
    }

    private int yys173() {
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
                return 683;
        }
        return yyr65();
    }

    private int yys174() {
        switch (yytok) {
            case ENDINPUT:
            case error:
            case '[':
            case ROJO:
            case '/':
            case VERDE:
            case NEGRO:
            case '>':
            case PROCEDURE_NAME:
            case AZUL:
            case '-':
            case '*':
            case ']':
            case '=':
            case '<':
            case ')':
            case '+':
            case MARRON:
            case AMARILLO:
            case GRIS:
            case CIAN:
            case FIN:
            case BLANCO:
            case ';':
                return 683;
        }
        return yyr34();
    }

    private int yys175() {
        switch (yytok) {
            case MARRON:
            case '/':
            case ENDINPUT:
            case BLANCO:
            case PARAMETER:
            case '*':
            case error:
            case '[':
            case CIAN:
            case AMARILLO:
            case VERDE:
            case '=':
            case '-':
            case ')':
            case '<':
            case NEGRO:
            case '+':
            case '>':
            case ROJO:
            case PROCEDURE_NAME:
            case GRIS:
            case AZUL:
                return 683;
        }
        return yyr135();
    }

    private int yys176() {
        switch (yytok) {
            case MARRON:
            case '/':
            case ENDINPUT:
            case BLANCO:
            case PARAMETER:
            case '*':
            case error:
            case '[':
            case CIAN:
            case AMARILLO:
            case VERDE:
            case '=':
            case '-':
            case ')':
            case '<':
            case NEGRO:
            case '+':
            case '>':
            case ROJO:
            case PROCEDURE_NAME:
            case GRIS:
            case AZUL:
                return 683;
        }
        return yyr89();
    }

    private int yys177() {
        switch (yytok) {
            case MARRON:
            case '/':
            case ENDINPUT:
            case BLANCO:
            case PARAMETER:
            case '*':
            case error:
            case '[':
            case CIAN:
            case AMARILLO:
            case VERDE:
            case '=':
            case '-':
            case ')':
            case '<':
            case NEGRO:
            case '+':
            case '>':
            case ROJO:
            case PROCEDURE_NAME:
            case GRIS:
            case AZUL:
                return 683;
        }
        return yyr85();
    }

    private int yys178() {
        switch (yytok) {
            case MARRON:
            case '/':
            case ENDINPUT:
            case BLANCO:
            case PARAMETER:
            case '*':
            case error:
            case '[':
            case CIAN:
            case AMARILLO:
            case VERDE:
            case '=':
            case '-':
            case ')':
            case '<':
            case NEGRO:
            case '+':
            case '>':
            case ROJO:
            case PROCEDURE_NAME:
            case GRIS:
            case AZUL:
                return 683;
        }
        return yyr84();
    }

    private int yys179() {
        switch (yytok) {
            case MARRON:
            case '/':
            case ENDINPUT:
            case BLANCO:
            case PARAMETER:
            case '*':
            case error:
            case '[':
            case CIAN:
            case AMARILLO:
            case VERDE:
            case '=':
            case '-':
            case ')':
            case '<':
            case NEGRO:
            case '+':
            case '>':
            case ROJO:
            case PROCEDURE_NAME:
            case GRIS:
            case AZUL:
                return 683;
        }
        return yyr87();
    }

    private int yys180() {
        switch (yytok) {
            case MARRON:
            case '/':
            case ENDINPUT:
            case BLANCO:
            case PARAMETER:
            case '*':
            case error:
            case '[':
            case CIAN:
            case AMARILLO:
            case VERDE:
            case '=':
            case '-':
            case ')':
            case '<':
            case NEGRO:
            case '+':
            case '>':
            case ROJO:
            case PROCEDURE_NAME:
            case GRIS:
            case AZUL:
                return 683;
        }
        return yyr88();
    }

    private int yys181() {
        switch (yytok) {
            case MARRON:
            case '/':
            case ENDINPUT:
            case BLANCO:
            case PARAMETER:
            case '*':
            case error:
            case '[':
            case CIAN:
            case AMARILLO:
            case VERDE:
            case '=':
            case '-':
            case ')':
            case '<':
            case NEGRO:
            case '+':
            case '>':
            case ROJO:
            case PROCEDURE_NAME:
            case GRIS:
            case AZUL:
                return 683;
        }
        return yyr86();
    }

    private int yys182() {
        switch (yytok) {
            case MARRON:
            case '/':
            case ENDINPUT:
            case BLANCO:
            case PARAMETER:
            case '*':
            case error:
            case '[':
            case CIAN:
            case AMARILLO:
            case VERDE:
            case '=':
            case '-':
            case ')':
            case '<':
            case NEGRO:
            case '+':
            case '>':
            case ROJO:
            case PROCEDURE_NAME:
            case GRIS:
            case AZUL:
                return 683;
        }
        return yyr90();
    }

    private int yys183() {
        switch (yytok) {
            case MARRON:
            case '/':
            case ENDINPUT:
            case BLANCO:
            case PARAMETER:
            case '*':
            case error:
            case '[':
            case CIAN:
            case AMARILLO:
            case VERDE:
            case '=':
            case '-':
            case ')':
            case '<':
            case NEGRO:
            case '+':
            case '>':
            case ROJO:
            case PROCEDURE_NAME:
            case GRIS:
            case AZUL:
                return 683;
        }
        return yyr91();
    }

    private int yys184() {
        switch (yytok) {
            case MARRON:
            case '/':
            case ENDINPUT:
            case BLANCO:
            case PARAMETER:
            case '*':
            case error:
            case '[':
            case CIAN:
            case AMARILLO:
            case VERDE:
            case '=':
            case '-':
            case ')':
            case '<':
            case NEGRO:
            case '+':
            case '>':
            case ROJO:
            case PROCEDURE_NAME:
            case GRIS:
            case AZUL:
                return 683;
        }
        return yyr92();
    }

    private int yys185() {
        switch (yytok) {
            case MARRON:
            case '/':
            case ENDINPUT:
            case BLANCO:
            case PARAMETER:
            case '*':
            case error:
            case '[':
            case CIAN:
            case AMARILLO:
            case VERDE:
            case '=':
            case '-':
            case ')':
            case '<':
            case NEGRO:
            case '+':
            case '>':
            case ROJO:
            case PROCEDURE_NAME:
            case GRIS:
            case AZUL:
                return 683;
        }
        return yyr134();
    }

    private int yys186() {
        switch (yytok) {
            case AZAR:
                return 35;
            case CUENTA:
                return 41;
            case INTEGER:
                return 57;
            case REDONDEA:
                return 78;
            case RESTO:
                return 80;
            case DIFERENCIA:
                return 120;
            case ELEGIR:
                return 121;
            case ELEMENTO:
                return 122;
            case IDENTIFIER:
                return 123;
            case MENOS:
                return 124;
            case POTENCIA:
                return 125;
            case PRIMERO:
                return 126;
            case PRODUCTO:
                return 127;
            case SUMA:
                return 128;
            case UL:
                return 129;
            case ULTIMO:
                return 130;
            case '(':
                return 131;
        }
        return 683;
    }

    private int yys187() {
        switch (yytok) {
            case CIAN:
            case BLANCO:
            case PROCEDURE_NAME:
            case MARRON:
            case PARAMETER:
            case error:
            case GRIS:
            case '[':
            case ROJO:
            case AMARILLO:
            case VERDE:
            case '=':
            case NEGRO:
            case ENDINPUT:
            case '<':
            case AZUL:
            case ')':
            case '>':
                return 683;
            case '*':
                return 96;
            case '+':
                return 97;
            case '-':
                return 98;
            case '/':
                return 99;
        }
        return yyr131();
    }

    private int yys188() {
        switch (yytok) {
            case CIAN:
            case BLANCO:
            case PROCEDURE_NAME:
            case MARRON:
            case PARAMETER:
            case error:
            case GRIS:
            case '[':
            case ROJO:
            case AMARILLO:
            case VERDE:
            case '=':
            case NEGRO:
            case ENDINPUT:
            case '<':
            case AZUL:
            case ')':
            case '>':
                return 683;
            case '*':
                return 102;
            case '+':
                return 103;
            case '-':
                return 104;
            case '/':
                return 105;
        }
        return yyr130();
    }

    private int yys189() {
        switch (yytok) {
            case PROCEDURE_NAME:
            case '/':
            case GRIS:
            case MARRON:
            case PARAMETER:
            case NEGRO:
            case AZUL:
            case '[':
            case ROJO:
            case AMARILLO:
            case VERDE:
            case '=':
            case BLANCO:
            case error:
            case '<':
            case ENDINPUT:
            case ')':
            case '>':
            case CIAN:
                return 683;
            case '*':
                return 252;
            case '+':
                return 253;
            case '-':
                return 254;
        }
        return yyr132();
    }

    private int yys190() {
        switch (yytok) {
            case AZAR:
                return 35;
            case CUENTA:
                return 41;
            case INTEGER:
                return 57;
            case REDONDEA:
                return 78;
            case RESTO:
                return 80;
            case DIFERENCIA:
                return 120;
            case ELEGIR:
                return 121;
            case ELEMENTO:
                return 122;
            case IDENTIFIER:
                return 123;
            case MENOS:
                return 124;
            case POTENCIA:
                return 125;
            case PRIMERO:
                return 126;
            case PRODUCTO:
                return 127;
            case SUMA:
                return 128;
            case UL:
                return 129;
            case ULTIMO:
                return 130;
            case '(':
                return 131;
            case '*':
                return 252;
            case '+':
                return 253;
            case '-':
                return 254;
        }
        return 683;
    }

    private int yys191() {
        switch (yytok) {
            case PROCEDURE_NAME:
            case '/':
            case GRIS:
            case MARRON:
            case PARAMETER:
            case NEGRO:
            case AZUL:
            case '[':
            case ROJO:
            case AMARILLO:
            case VERDE:
            case '=':
            case BLANCO:
            case error:
            case '<':
            case ENDINPUT:
            case ')':
            case '>':
            case CIAN:
                return 683;
            case '*':
                return 252;
            case '+':
                return 253;
            case '-':
                return 254;
        }
        return yyr133();
    }

    private int yys192() {
        switch (yytok) {
            case AZAR:
                return 35;
            case COS:
                return 40;
            case CUENTA:
                return 41;
            case DIFERENCIA:
                return 42;
            case DIVISION:
                return 43;
            case ELEGIR:
                return 45;
            case ELEMENTO:
                return 46;
            case FLOAT:
                return 48;
            case IDENTIFIER:
                return 53;
            case INTEGER:
                return 57;
            case MENOS:
                return 60;
            case POTENCIA:
                return 72;
            case PRIMERO:
                return 73;
            case PRODUCTO:
                return 74;
            case RAIZCUADRADA:
                return 75;
            case RC:
                return 76;
            case REDONDEA:
                return 78;
            case RESTO:
                return 80;
            case RUMBO:
                return 82;
            case SEN:
                return 84;
            case SENO:
                return 85;
            case SUMA:
                return 88;
            case UL:
                return 89;
            case ULTIMO:
                return 90;
            case '(':
                return 93;
            case '*':
                return 96;
            case '+':
                return 97;
            case '-':
                return 98;
            case '/':
                return 99;
        }
        return 683;
    }

    private int yys193() {
        switch (yytok) {
            case AZAR:
                return 35;
            case COS:
                return 40;
            case CUENTA:
                return 41;
            case DIFERENCIA:
                return 42;
            case DIVISION:
                return 43;
            case ELEGIR:
                return 45;
            case ELEMENTO:
                return 46;
            case FLOAT:
                return 48;
            case IDENTIFIER:
                return 53;
            case INTEGER:
                return 57;
            case MENOS:
                return 60;
            case POTENCIA:
                return 72;
            case PRIMERO:
                return 73;
            case PRODUCTO:
                return 74;
            case RAIZCUADRADA:
                return 75;
            case RC:
                return 76;
            case REDONDEA:
                return 78;
            case RESTO:
                return 80;
            case RUMBO:
                return 82;
            case SEN:
                return 84;
            case SENO:
                return 85;
            case SUMA:
                return 88;
            case UL:
                return 89;
            case ULTIMO:
                return 90;
            case '(':
                return 93;
            case '*':
                return 102;
            case '+':
                return 103;
            case '-':
                return 104;
            case '/':
                return 105;
        }
        return 683;
    }

    private int yys194() {
        switch (yytok) {
            case AZAR:
                return 35;
            case COS:
                return 40;
            case CUENTA:
                return 41;
            case DIFERENCIA:
                return 42;
            case DIVISION:
                return 43;
            case ELEGIR:
                return 45;
            case ELEMENTO:
                return 46;
            case FLOAT:
                return 48;
            case IDENTIFIER:
                return 53;
            case INTEGER:
                return 57;
            case MENOS:
                return 60;
            case POTENCIA:
                return 72;
            case PRIMERO:
                return 73;
            case PRODUCTO:
                return 74;
            case RAIZCUADRADA:
                return 75;
            case RC:
                return 76;
            case REDONDEA:
                return 78;
            case RESTO:
                return 80;
            case RUMBO:
                return 82;
            case SEN:
                return 84;
            case SENO:
                return 85;
            case SUMA:
                return 88;
            case UL:
                return 89;
            case ULTIMO:
                return 90;
            case '(':
                return 93;
        }
        return 683;
    }

    private int yys195() {
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
                return 683;
        }
        return yyr170();
    }

    private int yys196() {
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
                return 683;
        }
        return yyr167();
    }

    private int yys197() {
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
                return 683;
            case '*':
                return 96;
            case '+':
                return 97;
            case '-':
                return 98;
            case '/':
                return 99;
        }
        return yyr111();
    }

    private int yys198() {
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
                return 683;
            case '*':
                return 102;
            case '+':
                return 103;
            case '-':
                return 104;
            case '/':
                return 105;
        }
        return yyr110();
    }

    private int yys199() {
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
                return 683;
            case '*':
                return 96;
            case '+':
                return 97;
            case '-':
                return 98;
            case '/':
                return 99;
        }
        return yyr113();
    }

    private int yys200() {
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
                return 683;
            case '*':
                return 102;
            case '+':
                return 103;
            case '-':
                return 104;
            case '/':
                return 105;
        }
        return yyr112();
    }

    private int yys201() {
        switch (yytok) {
            case PROCEDURE_NAME:
            case '/':
            case GRIS:
            case MARRON:
            case PARAMETER:
            case NEGRO:
            case AZUL:
            case '[':
            case ROJO:
            case AMARILLO:
            case VERDE:
            case '=':
            case BLANCO:
            case error:
            case '<':
            case ENDINPUT:
            case ')':
            case '>':
            case CIAN:
                return 683;
            case '*':
                return 252;
            case '+':
                return 253;
            case '-':
                return 254;
        }
        return yyr121();
    }

    private int yys202() {
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
                return 683;
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

    private int yys205() {
        switch (yytok) {
            case AZAR:
                return 35;
            case CUENTA:
                return 41;
            case INTEGER:
                return 57;
            case REDONDEA:
                return 78;
            case RESTO:
                return 80;
            case DIFERENCIA:
                return 120;
            case ELEGIR:
                return 121;
            case ELEMENTO:
                return 122;
            case IDENTIFIER:
                return 123;
            case MENOS:
                return 124;
            case POTENCIA:
                return 125;
            case PRIMERO:
                return 126;
            case PRODUCTO:
                return 127;
            case SUMA:
                return 128;
            case UL:
                return 129;
            case ULTIMO:
                return 130;
            case '(':
                return 131;
            case '*':
                return 252;
            case '+':
                return 253;
            case '-':
                return 254;
        }
        return 683;
    }

    private int yys206() {
        switch (yytok) {
            case PROCEDURE_NAME:
            case '/':
            case GRIS:
            case MARRON:
            case PARAMETER:
            case NEGRO:
            case AZUL:
            case '[':
            case ROJO:
            case AMARILLO:
            case VERDE:
            case '=':
            case BLANCO:
            case error:
            case '<':
            case ENDINPUT:
            case ')':
            case '>':
            case CIAN:
                return 683;
            case '*':
                return 252;
            case '+':
                return 253;
            case '-':
                return 254;
        }
        return yyr120();
    }

    private int yys207() {
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
                return 683;
            case '*':
                return 96;
            case '+':
                return 97;
            case '-':
                return 98;
            case '/':
                return 99;
        }
        return yyr117();
    }

    private int yys208() {
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
                return 683;
            case '*':
                return 102;
            case '+':
                return 103;
            case '-':
                return 104;
            case '/':
                return 105;
        }
        return yyr116();
    }

    private int yys209() {
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
                return 683;
            case '*':
                return 96;
            case '+':
                return 97;
            case '-':
                return 98;
            case '/':
                return 99;
        }
        return yyr115();
    }

    private int yys210() {
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
                return 683;
            case '*':
                return 102;
            case '+':
                return 103;
            case '-':
                return 104;
            case '/':
                return 105;
        }
        return yyr114();
    }

    private int yys212() {
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
                return 683;
        }
        return yyr171();
    }

    private int yys213() {
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
                return 683;
        }
        return yyr168();
    }

    private int yys214() {
        switch (yytok) {
            case AZAR:
                return 35;
            case COS:
                return 40;
            case CUENTA:
                return 41;
            case DIFERENCIA:
                return 42;
            case DIVISION:
                return 43;
            case ELEGIR:
                return 45;
            case ELEMENTO:
                return 46;
            case FLOAT:
                return 48;
            case IDENTIFIER:
                return 53;
            case INTEGER:
                return 57;
            case MENOS:
                return 60;
            case POTENCIA:
                return 72;
            case PRIMERO:
                return 73;
            case PRODUCTO:
                return 74;
            case RAIZCUADRADA:
                return 75;
            case RC:
                return 76;
            case REDONDEA:
                return 78;
            case RESTO:
                return 80;
            case RUMBO:
                return 82;
            case SEN:
                return 84;
            case SENO:
                return 85;
            case SUMA:
                return 88;
            case UL:
                return 89;
            case ULTIMO:
                return 90;
            case '(':
                return 93;
        }
        return 683;
    }

    private int yys215() {
        switch (yytok) {
            case AZAR:
                return 35;
            case COS:
                return 40;
            case CUENTA:
                return 41;
            case DIFERENCIA:
                return 42;
            case DIVISION:
                return 43;
            case ELEGIR:
                return 45;
            case ELEMENTO:
                return 46;
            case FLOAT:
                return 48;
            case IDENTIFIER:
                return 53;
            case INTEGER:
                return 57;
            case MENOS:
                return 60;
            case POTENCIA:
                return 72;
            case PRIMERO:
                return 73;
            case PRODUCTO:
                return 74;
            case RAIZCUADRADA:
                return 75;
            case RC:
                return 76;
            case REDONDEA:
                return 78;
            case RESTO:
                return 80;
            case RUMBO:
                return 82;
            case SEN:
                return 84;
            case SENO:
                return 85;
            case SUMA:
                return 88;
            case UL:
                return 89;
            case ULTIMO:
                return 90;
            case '(':
                return 93;
        }
        return 683;
    }

    private int yys216() {
        switch (yytok) {
            case AZUL:
            case '/':
            case MARRON:
            case BLANCO:
            case PARAMETER:
            case '*':
            case ENDINPUT:
            case '[':
            case CIAN:
            case AMARILLO:
            case VERDE:
            case '<':
            case '-':
            case ')':
            case error:
            case NEGRO:
            case '+':
            case '>':
            case ROJO:
            case PROCEDURE_NAME:
            case GRIS:
                return 683;
            case '=':
                return 303;
        }
        return yyr54();
    }

    private int yys217() {
        switch (yytok) {
            case AZAR:
                return 35;
            case COS:
                return 40;
            case CUENTA:
                return 41;
            case DIFERENCIA:
                return 42;
            case DIVISION:
                return 43;
            case ELEGIR:
                return 45;
            case ELEMENTO:
                return 46;
            case FLOAT:
                return 48;
            case IDENTIFIER:
                return 53;
            case IGUALES:
                return 54;
            case INTEGER:
                return 57;
            case MAYORQUE:
                return 58;
            case MENORQUE:
                return 59;
            case MENOS:
                return 60;
            case O:
                return 61;
            case POTENCIA:
                return 72;
            case PRIMERO:
                return 73;
            case PRODUCTO:
                return 74;
            case RAIZCUADRADA:
                return 75;
            case RC:
                return 76;
            case REDONDEA:
                return 78;
            case RESTO:
                return 80;
            case RUMBO:
                return 82;
            case SEN:
                return 84;
            case SENO:
                return 85;
            case SUMA:
                return 88;
            case UL:
                return 89;
            case ULTIMO:
                return 90;
            case Y:
                return 92;
            case '(':
                return 93;
        }
        return 683;
    }

    private int yys222() {
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
                return 683;
        }
        return yyr78();
    }

    private int yys223() {
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
                return 683;
        }
        return yyr76();
    }

    private int yys224() {
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
                return 683;
            case '*':
                return 96;
            case '/':
                return 99;
        }
        return yyr72();
    }

    private int yys225() {
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
                return 683;
            case '*':
                return 102;
            case '/':
                return 105;
        }
        return yyr70();
    }

    private int yys226() {
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
                return 683;
            case '*':
                return 96;
            case '/':
                return 99;
        }
        return yyr75();
    }

    private int yys227() {
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
                return 683;
            case '*':
                return 102;
            case '/':
                return 105;
        }
        return yyr73();
    }

    private int yys228() {
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
                return 683;
        }
        return yyr82();
    }

    private int yys229() {
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
                return 683;
        }
        return yyr80();
    }

    private int yys230() {
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
                return 683;
            case '*':
                return 96;
            case '+':
                return 97;
            case '-':
                return 98;
            case '/':
                return 99;
        }
        return yyr60();
    }

    private int yys231() {
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
                return 683;
            case '*':
                return 102;
            case '+':
                return 103;
            case '-':
                return 104;
            case '/':
                return 105;
        }
        return yyr58();
    }

    private int yys232() {
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
                return 683;
            case '*':
                return 96;
            case '+':
                return 97;
            case '-':
                return 98;
            case '/':
                return 99;
        }
        return yyr64();
    }

    private int yys233() {
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
                return 683;
            case '*':
                return 102;
            case '+':
                return 103;
            case '-':
                return 104;
            case '/':
                return 105;
        }
        return yyr62();
    }

    private int yys234() {
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
                return 683;
        }
        return yyr77();
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
                return 683;
        }
        return yyr68();
    }

    private int yys236() {
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
                return 683;
            case '*':
                return 96;
            case '/':
                return 99;
        }
        return yyr71();
    }

    private int yys237() {
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
                return 683;
            case '*':
                return 102;
            case '/':
                return 105;
        }
        return yyr66();
    }

    private int yys238() {
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
                return 683;
            case '*':
                return 96;
            case '/':
                return 99;
        }
        return yyr74();
    }

    private int yys239() {
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
                return 683;
            case '*':
                return 102;
            case '/':
                return 105;
        }
        return yyr67();
    }

    private int yys240() {
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
                return 683;
        }
        return yyr81();
    }

    private int yys241() {
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
                return 683;
        }
        return yyr79();
    }

    private int yys242() {
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
                return 683;
            case '*':
                return 96;
            case '+':
                return 97;
            case '-':
                return 98;
            case '/':
                return 99;
        }
        return yyr59();
    }

    private int yys243() {
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
                return 683;
            case '*':
                return 102;
            case '+':
                return 103;
            case '-':
                return 104;
            case '/':
                return 105;
        }
        return yyr57();
    }

    private int yys244() {
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
                return 683;
            case '*':
                return 96;
            case '+':
                return 97;
            case '-':
                return 98;
            case '/':
                return 99;
        }
        return yyr63();
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
                return 683;
            case '*':
                return 102;
            case '+':
                return 103;
            case '-':
                return 104;
            case '/':
                return 105;
        }
        return yyr61();
    }

    private int yys247() {
        switch (yytok) {
            case APARECETORTUGA:
                return 31;
            case AT:
                return 32;
            case AV:
                return 33;
            case AVANZA:
                return 34;
            case AZAR:
                return 35;
            case BAJALAPIZ:
                return 36;
            case BL:
                return 37;
            case BORRAPANTALLA:
                return 38;
            case CENTRO:
                return 39;
            case COS:
                return 40;
            case CUENTA:
                return 41;
            case DIFERENCIA:
                return 42;
            case DIVISION:
                return 43;
            case EJECUTA:
                return 44;
            case ELEGIR:
                return 45;
            case ELEMENTO:
                return 46;
            case ESPERA:
                return 47;
            case FLOAT:
                return 48;
            case GD:
                return 49;
            case GI:
                return 50;
            case GIRADERECHA:
                return 51;
            case GIRAIZQUIERDA:
                return 52;
            case IDENTIFIER:
                return 53;
            case IGUALES:
                return 54;
            case INC:
                return 55;
            case INIC:
                return 56;
            case INTEGER:
                return 57;
            case MAYORQUE:
                return 58;
            case MENORQUE:
                return 59;
            case MENOS:
                return 60;
            case O:
                return 61;
            case OCULTATORTUGA:
                return 62;
            case OT:
                return 63;
            case PARA:
                return 64;
            case PONCL:
                return 65;
            case PONCOLORLAPIZ:
                return 66;
            case PONPOS:
                return 67;
            case PONRUMBO:
                return 68;
            case PONX:
                return 69;
            case PONXY:
                return 70;
            case PONY:
                return 71;
            case POTENCIA:
                return 72;
            case PRIMERO:
                return 73;
            case PRODUCTO:
                return 74;
            case RAIZCUADRADA:
                return 75;
            case RC:
                return 76;
            case RE:
                return 77;
            case REDONDEA:
                return 78;
            case REPITE:
                return 79;
            case RESTO:
                return 80;
            case RETROCEDE:
                return 81;
            case RUMBO:
                return 82;
            case SB:
                return 83;
            case SEN:
                return 84;
            case SENO:
                return 85;
            case SI:
                return 86;
            case SUBELAPIZ:
                return 87;
            case SUMA:
                return 88;
            case UL:
                return 89;
            case ULTIMO:
                return 90;
            case VAR:
                return 91;
            case Y:
                return 92;
            case '(':
                return 93;
            case ']':
                return yyr173();
        }
        return 683;
    }

    private int yys249() {
        switch (yytok) {
            case MARRON:
            case '/':
            case ENDINPUT:
            case BLANCO:
            case PARAMETER:
            case '*':
            case error:
            case '[':
            case CIAN:
            case AMARILLO:
            case VERDE:
            case '=':
            case '-':
            case ')':
            case '<':
            case NEGRO:
            case '+':
            case '>':
            case ROJO:
            case PROCEDURE_NAME:
            case GRIS:
            case AZUL:
                return 683;
        }
        return yyr32();
    }

    private int yys251() {
        switch (yytok) {
            case ROJO:
            case error:
            case '[':
            case PARAMETER:
            case '*':
            case '/':
            case NEGRO:
            case '>':
            case GRIS:
            case FIN:
            case ';':
            case VERDE:
            case ']':
            case '=':
            case '<':
            case ')':
            case '+':
            case MARRON:
            case AMARILLO:
            case AZUL:
            case CIAN:
            case PROCEDURE_NAME:
            case ENDINPUT:
            case BLANCO:
            case '-':
                return 683;
        }
        return yyr28();
    }

    private int yys252() {
        switch (yytok) {
            case AZAR:
                return 35;
            case CUENTA:
                return 41;
            case INTEGER:
                return 57;
            case REDONDEA:
                return 78;
            case RESTO:
                return 80;
            case DIFERENCIA:
                return 120;
            case ELEGIR:
                return 121;
            case ELEMENTO:
                return 122;
            case IDENTIFIER:
                return 123;
            case MENOS:
                return 124;
            case POTENCIA:
                return 125;
            case PRIMERO:
                return 126;
            case PRODUCTO:
                return 127;
            case SUMA:
                return 128;
            case UL:
                return 129;
            case ULTIMO:
                return 130;
            case '(':
                return 131;
        }
        return 683;
    }

    private int yys253() {
        switch (yytok) {
            case AZAR:
                return 35;
            case CUENTA:
                return 41;
            case INTEGER:
                return 57;
            case REDONDEA:
                return 78;
            case RESTO:
                return 80;
            case DIFERENCIA:
                return 120;
            case ELEGIR:
                return 121;
            case ELEMENTO:
                return 122;
            case IDENTIFIER:
                return 123;
            case MENOS:
                return 124;
            case POTENCIA:
                return 125;
            case PRIMERO:
                return 126;
            case PRODUCTO:
                return 127;
            case SUMA:
                return 128;
            case UL:
                return 129;
            case ULTIMO:
                return 130;
            case '(':
                return 131;
        }
        return 683;
    }

    private int yys254() {
        switch (yytok) {
            case AZAR:
                return 35;
            case CUENTA:
                return 41;
            case INTEGER:
                return 57;
            case REDONDEA:
                return 78;
            case RESTO:
                return 80;
            case DIFERENCIA:
                return 120;
            case ELEGIR:
                return 121;
            case ELEMENTO:
                return 122;
            case IDENTIFIER:
                return 123;
            case MENOS:
                return 124;
            case POTENCIA:
                return 125;
            case PRIMERO:
                return 126;
            case PRODUCTO:
                return 127;
            case SUMA:
                return 128;
            case UL:
                return 129;
            case ULTIMO:
                return 130;
            case '(':
                return 131;
        }
        return 683;
    }

    private int yys255() {
        switch (yytok) {
            case PARAMETER:
            case error:
            case BLANCO:
            case ROJO:
            case AMARILLO:
            case VERDE:
            case GRIS:
            case AZUL:
            case PROCEDURE_NAME:
            case ENDINPUT:
            case '=':
            case CIAN:
            case MARRON:
            case NEGRO:
                return 683;
            case AZAR:
                return 35;
            case CUENTA:
                return 41;
            case INTEGER:
                return 57;
            case REDONDEA:
                return 78;
            case RESTO:
                return 80;
            case DIFERENCIA:
                return 120;
            case ELEGIR:
                return 121;
            case ELEMENTO:
                return 122;
            case IDENTIFIER:
                return 123;
            case MENOS:
                return 124;
            case POTENCIA:
                return 125;
            case PRIMERO:
                return 126;
            case PRODUCTO:
                return 127;
            case SUMA:
                return 128;
            case UL:
                return 129;
            case ULTIMO:
                return 130;
            case '(':
                return 131;
            case '*':
                return 252;
            case '+':
                return 253;
            case '-':
                return 254;
        }
        return yyr163();
    }

    private int yys256() {
        switch (yytok) {
            case AZAR:
                return 35;
            case CUENTA:
                return 41;
            case INTEGER:
                return 57;
            case REDONDEA:
                return 78;
            case RESTO:
                return 80;
            case DIFERENCIA:
                return 120;
            case ELEGIR:
                return 121;
            case ELEMENTO:
                return 122;
            case IDENTIFIER:
                return 123;
            case MENOS:
                return 124;
            case POTENCIA:
                return 125;
            case PRIMERO:
                return 126;
            case PRODUCTO:
                return 127;
            case SUMA:
                return 128;
            case UL:
                return 129;
            case ULTIMO:
                return 130;
            case '(':
                return 131;
        }
        return 683;
    }

    private int yys258() {
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
                return 683;
            case '*':
                return 252;
            case '+':
                return 253;
            case '-':
                return 254;
        }
        return yyr106();
    }

    private int yys259() {
        switch (yytok) {
            case AZAR:
                return 35;
            case CUENTA:
                return 41;
            case INTEGER:
                return 57;
            case REDONDEA:
                return 78;
            case RESTO:
                return 80;
            case DIFERENCIA:
                return 120;
            case ELEGIR:
                return 121;
            case ELEMENTO:
                return 122;
            case IDENTIFIER:
                return 123;
            case MENOS:
                return 124;
            case POTENCIA:
                return 125;
            case PRIMERO:
                return 126;
            case PRODUCTO:
                return 127;
            case SUMA:
                return 128;
            case UL:
                return 129;
            case ULTIMO:
                return 130;
            case '(':
                return 131;
            case '*':
                return 252;
            case '+':
                return 253;
            case '-':
                return 254;
        }
        return 683;
    }

    private int yys260() {
        switch (yytok) {
            case AZAR:
                return 35;
            case CUENTA:
                return 41;
            case INTEGER:
                return 57;
            case REDONDEA:
                return 78;
            case RESTO:
                return 80;
            case DIFERENCIA:
                return 120;
            case ELEGIR:
                return 121;
            case ELEMENTO:
                return 122;
            case IDENTIFIER:
                return 123;
            case MENOS:
                return 124;
            case POTENCIA:
                return 125;
            case PRIMERO:
                return 126;
            case PRODUCTO:
                return 127;
            case SUMA:
                return 128;
            case UL:
                return 129;
            case ULTIMO:
                return 130;
            case '(':
                return 131;
        }
        return 683;
    }

    private int yys261() {
        switch (yytok) {
            case AZAR:
                return 35;
            case CUENTA:
                return 41;
            case INTEGER:
                return 57;
            case REDONDEA:
                return 78;
            case RESTO:
                return 80;
            case DIFERENCIA:
                return 120;
            case ELEGIR:
                return 121;
            case ELEMENTO:
                return 122;
            case IDENTIFIER:
                return 123;
            case MENOS:
                return 124;
            case POTENCIA:
                return 125;
            case PRIMERO:
                return 126;
            case PRODUCTO:
                return 127;
            case SUMA:
                return 128;
            case UL:
                return 129;
            case ULTIMO:
                return 130;
            case '(':
                return 131;
        }
        return 683;
    }

    private int yys262() {
        switch (yytok) {
            case AZAR:
                return 35;
            case CUENTA:
                return 41;
            case INTEGER:
                return 57;
            case REDONDEA:
                return 78;
            case RESTO:
                return 80;
            case DIFERENCIA:
                return 120;
            case ELEGIR:
                return 121;
            case ELEMENTO:
                return 122;
            case IDENTIFIER:
                return 123;
            case MENOS:
                return 124;
            case POTENCIA:
                return 125;
            case PRIMERO:
                return 126;
            case PRODUCTO:
                return 127;
            case SUMA:
                return 128;
            case UL:
                return 129;
            case ULTIMO:
                return 130;
            case '(':
                return 131;
        }
        return 683;
    }

    private int yys266() {
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
                return 683;
        }
        return yyr164();
    }

    private int yys267() {
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
                return 683;
        }
        return yyr162();
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
                return 683;
            case '*':
                return 96;
            case '+':
                return 97;
            case '-':
                return 98;
            case '/':
                return 99;
        }
        return yyr146();
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
                return 683;
            case '*':
                return 102;
            case '+':
                return 103;
            case '-':
                return 104;
            case '/':
                return 105;
        }
        return yyr144();
    }

    private int yys270() {
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
                return 683;
            case '*':
                return 96;
            case '+':
                return 97;
            case '-':
                return 98;
            case '/':
                return 99;
        }
        return yyr145();
    }

    private int yys271() {
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
                return 683;
            case '*':
                return 102;
            case '+':
                return 103;
            case '-':
                return 104;
            case '/':
                return 105;
        }
        return yyr143();
    }

    private int yys274() {
        switch (yytok) {
            case AZAR:
                return 35;
            case COS:
                return 40;
            case CUENTA:
                return 41;
            case DIFERENCIA:
                return 42;
            case DIVISION:
                return 43;
            case ELEGIR:
                return 45;
            case ELEMENTO:
                return 46;
            case FLOAT:
                return 48;
            case IDENTIFIER:
                return 53;
            case INTEGER:
                return 57;
            case MENOS:
                return 60;
            case POTENCIA:
                return 72;
            case PRIMERO:
                return 73;
            case PRODUCTO:
                return 74;
            case RAIZCUADRADA:
                return 75;
            case RC:
                return 76;
            case REDONDEA:
                return 78;
            case RESTO:
                return 80;
            case RUMBO:
                return 82;
            case SEN:
                return 84;
            case SENO:
                return 85;
            case SUMA:
                return 88;
            case UL:
                return 89;
            case ULTIMO:
                return 90;
            case '(':
                return 93;
        }
        return 683;
    }

    private int yys275() {
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
                return 683;
            case '*':
                return 96;
            case '+':
                return 97;
            case '-':
                return 98;
            case '/':
                return 99;
        }
        return yyr150();
    }

    private int yys276() {
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
                return 683;
            case '*':
                return 102;
            case '+':
                return 103;
            case '-':
                return 104;
            case '/':
                return 105;
        }
        return yyr148();
    }

    private int yys277() {
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
                return 683;
            case '*':
                return 96;
            case '+':
                return 97;
            case '-':
                return 98;
            case '/':
                return 99;
        }
        return yyr149();
    }

    private int yys278() {
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
                return 683;
            case '*':
                return 102;
            case '+':
                return 103;
            case '-':
                return 104;
            case '/':
                return 105;
        }
        return yyr147();
    }

    private int yys279() {
        switch (yytok) {
            case AZAR:
                return 35;
            case COS:
                return 40;
            case CUENTA:
                return 41;
            case DIFERENCIA:
                return 42;
            case DIVISION:
                return 43;
            case ELEGIR:
                return 45;
            case ELEMENTO:
                return 46;
            case FLOAT:
                return 48;
            case IDENTIFIER:
                return 53;
            case INTEGER:
                return 57;
            case MENOS:
                return 60;
            case POTENCIA:
                return 72;
            case PRIMERO:
                return 73;
            case PRODUCTO:
                return 74;
            case RAIZCUADRADA:
                return 75;
            case RC:
                return 76;
            case REDONDEA:
                return 78;
            case RESTO:
                return 80;
            case RUMBO:
                return 82;
            case SEN:
                return 84;
            case SENO:
                return 85;
            case SUMA:
                return 88;
            case UL:
                return 89;
            case ULTIMO:
                return 90;
            case '(':
                return 93;
            case ']':
                return 323;
        }
        return 683;
    }

    private int yys280() {
        switch (yytok) {
            case AZAR:
                return 35;
            case COS:
                return 40;
            case CUENTA:
                return 41;
            case DIFERENCIA:
                return 42;
            case DIVISION:
                return 43;
            case ELEGIR:
                return 45;
            case ELEMENTO:
                return 46;
            case FLOAT:
                return 48;
            case IDENTIFIER:
                return 53;
            case INTEGER:
                return 57;
            case MENOS:
                return 60;
            case POTENCIA:
                return 72;
            case PRIMERO:
                return 73;
            case PRODUCTO:
                return 74;
            case RAIZCUADRADA:
                return 75;
            case RC:
                return 76;
            case REDONDEA:
                return 78;
            case RESTO:
                return 80;
            case RUMBO:
                return 82;
            case SEN:
                return 84;
            case SENO:
                return 85;
            case SUMA:
                return 88;
            case UL:
                return 89;
            case ULTIMO:
                return 90;
            case '(':
                return 93;
        }
        return 683;
    }

    private int yys281() {
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
                return 683;
            case '*':
                return 96;
            case '+':
                return 97;
            case '-':
                return 98;
            case '/':
                return 99;
        }
        return yyr156();
    }

    private int yys282() {
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
                return 683;
            case '*':
                return 102;
            case '+':
                return 103;
            case '-':
                return 104;
            case '/':
                return 105;
        }
        return yyr154();
    }

    private int yys283() {
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
                return 683;
            case '*':
                return 96;
            case '+':
                return 97;
            case '-':
                return 98;
            case '/':
                return 99;
        }
        return yyr155();
    }

    private int yys284() {
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
                return 683;
            case '*':
                return 102;
            case '+':
                return 103;
            case '-':
                return 104;
            case '/':
                return 105;
        }
        return yyr153();
    }

    private int yys285() {
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
                return 683;
            case '*':
                return 96;
            case '+':
                return 97;
            case '-':
                return 98;
            case '/':
                return 99;
        }
        return yyr160();
    }

    private int yys286() {
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
                return 683;
            case '*':
                return 102;
            case '+':
                return 103;
            case '-':
                return 104;
            case '/':
                return 105;
        }
        return yyr158();
    }

    private int yys287() {
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
                return 683;
            case '*':
                return 96;
            case '+':
                return 97;
            case '-':
                return 98;
            case '/':
                return 99;
        }
        return yyr159();
    }

    private int yys288() {
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
                return 683;
            case '*':
                return 102;
            case '+':
                return 103;
            case '-':
                return 104;
            case '/':
                return 105;
        }
        return yyr157();
    }

    private int yys289() {
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
                return 683;
        }
        return yyr152();
    }

    private int yys290() {
        switch (yytok) {
            case AZAR:
                return 35;
            case CUENTA:
                return 41;
            case INTEGER:
                return 57;
            case REDONDEA:
                return 78;
            case RESTO:
                return 80;
            case DIFERENCIA:
                return 120;
            case ELEGIR:
                return 121;
            case ELEMENTO:
                return 122;
            case IDENTIFIER:
                return 123;
            case MENOS:
                return 124;
            case POTENCIA:
                return 125;
            case PRIMERO:
                return 126;
            case PRODUCTO:
                return 127;
            case SUMA:
                return 128;
            case UL:
                return 129;
            case ULTIMO:
                return 130;
            case '(':
                return 131;
            case '*':
                return 252;
            case '+':
                return 253;
            case '-':
                return 254;
        }
        return 683;
    }

    private int yys291() {
        switch (yytok) {
            case PROCEDURE_NAME:
            case '/':
            case GRIS:
            case MARRON:
            case PARAMETER:
            case NEGRO:
            case AZUL:
            case '[':
            case ROJO:
            case AMARILLO:
            case VERDE:
            case '=':
            case BLANCO:
            case error:
            case '<':
            case ENDINPUT:
            case ')':
            case '>':
            case CIAN:
                return 683;
            case '*':
                return 252;
            case '+':
                return 253;
            case '-':
                return 254;
        }
        return yyr161();
    }

    private int yys292() {
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
                return 683;
            case '*':
                return 96;
            case '+':
                return 97;
            case '-':
                return 98;
            case '/':
                return 99;
        }
        return yyr142();
    }

    private int yys293() {
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
                return 683;
            case '*':
                return 102;
            case '+':
                return 103;
            case '-':
                return 104;
            case '/':
                return 105;
        }
        return yyr140();
    }

    private int yys294() {
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
                return 683;
            case '*':
                return 96;
            case '+':
                return 97;
            case '-':
                return 98;
            case '/':
                return 99;
        }
        return yyr141();
    }

    private int yys295() {
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
                return 683;
            case '*':
                return 102;
            case '+':
                return 103;
            case '-':
                return 104;
            case '/':
                return 105;
        }
        return yyr138();
    }

    private int yys298() {
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
                return 683;
            case '*':
                return 252;
            case '+':
                return 253;
            case '-':
                return 254;
        }
        return yyr139();
    }

    private int yys303() {
        switch (yytok) {
            case AZAR:
                return 35;
            case COS:
                return 40;
            case CUENTA:
                return 41;
            case DIFERENCIA:
                return 42;
            case DIVISION:
                return 43;
            case ELEGIR:
                return 45;
            case ELEMENTO:
                return 46;
            case FLOAT:
                return 48;
            case IDENTIFIER:
                return 53;
            case INTEGER:
                return 57;
            case MENOS:
                return 60;
            case POTENCIA:
                return 72;
            case PRIMERO:
                return 73;
            case PRODUCTO:
                return 74;
            case RAIZCUADRADA:
                return 75;
            case RC:
                return 76;
            case REDONDEA:
                return 78;
            case RESTO:
                return 80;
            case RUMBO:
                return 82;
            case SEN:
                return 84;
            case SENO:
                return 85;
            case SUMA:
                return 88;
            case UL:
                return 89;
            case ULTIMO:
                return 90;
            case '(':
                return 93;
        }
        return 683;
    }

    private int yys304() {
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
                return 683;
        }
        return yyr151();
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
                return 683;
        }
        return yyr83();
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
                return 683;
        }
        return yyr69();
    }

    private int yys307() {
        switch (yytok) {
            case MARRON:
            case '/':
            case ENDINPUT:
            case BLANCO:
            case PARAMETER:
            case '*':
            case error:
            case '[':
            case CIAN:
            case AMARILLO:
            case VERDE:
            case '=':
            case '-':
            case ')':
            case '<':
            case NEGRO:
            case '+':
            case '>':
            case ROJO:
            case PROCEDURE_NAME:
            case GRIS:
            case AZUL:
                return 683;
        }
        return yyr188();
    }

    private int yys309() {
        switch (yytok) {
            case MARRON:
            case '/':
            case ENDINPUT:
            case BLANCO:
            case PARAMETER:
            case '*':
            case error:
            case '[':
            case CIAN:
            case AMARILLO:
            case VERDE:
            case '=':
            case '-':
            case ')':
            case '<':
            case NEGRO:
            case '+':
            case '>':
            case ROJO:
            case PROCEDURE_NAME:
            case GRIS:
            case AZUL:
                return 683;
        }
        return yyr33();
    }

    private int yys310() {
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
                return 683;
        }
        return yyr68();
    }

    private int yys311() {
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
                return 683;
            case '*':
                return 252;
        }
        return yyr66();
    }

    private int yys312() {
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
                return 683;
            case '*':
                return 252;
        }
        return yyr67();
    }

    private int yys313() {
        switch (yytok) {
            case AZAR:
                return 35;
            case CUENTA:
                return 41;
            case INTEGER:
                return 57;
            case REDONDEA:
                return 78;
            case RESTO:
                return 80;
            case DIFERENCIA:
                return 120;
            case ELEGIR:
                return 121;
            case ELEMENTO:
                return 122;
            case IDENTIFIER:
                return 123;
            case MENOS:
                return 124;
            case POTENCIA:
                return 125;
            case PRIMERO:
                return 126;
            case PRODUCTO:
                return 127;
            case SUMA:
                return 128;
            case UL:
                return 129;
            case ULTIMO:
                return 130;
            case '(':
                return 131;
        }
        return 683;
    }

    private int yys314() {
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
                return 683;
            case '*':
                return 252;
            case '+':
                return 253;
            case '-':
                return 254;
        }
        return yyr138();
    }

    private int yys315() {
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
                return 683;
        }
        return yyr176();
    }

    private int yys316() {
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
                return 683;
        }
        return yyr175();
    }

    private int yys317() {
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
                return 683;
        }
        return yyr180();
    }

    private int yys318() {
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
                return 683;
        }
        return yyr174();
    }

    private int yys323() {
        switch (yytok) {
            case MARRON:
            case '/':
            case ENDINPUT:
            case BLANCO:
            case PARAMETER:
            case '*':
            case error:
            case '[':
            case CIAN:
            case AMARILLO:
            case VERDE:
            case '=':
            case '-':
            case ')':
            case '<':
            case NEGRO:
            case '+':
            case '>':
            case ROJO:
            case PROCEDURE_NAME:
            case GRIS:
            case AZUL:
                return 683;
        }
        return yyr184();
    }

    private int yys324() {
        switch (yytok) {
            case CIAN:
            case BLANCO:
            case PROCEDURE_NAME:
            case MARRON:
            case PARAMETER:
            case error:
            case GRIS:
            case '[':
            case ROJO:
            case AMARILLO:
            case VERDE:
            case '=':
            case NEGRO:
            case ENDINPUT:
            case '<':
            case AZUL:
            case ')':
            case '>':
                return 683;
            case '*':
                return 96;
            case '+':
                return 97;
            case '-':
                return 98;
            case '/':
                return 99;
        }
        return yyr53();
    }

    private int yys325() {
        switch (yytok) {
            case CIAN:
            case BLANCO:
            case PROCEDURE_NAME:
            case MARRON:
            case PARAMETER:
            case error:
            case GRIS:
            case '[':
            case ROJO:
            case AMARILLO:
            case VERDE:
            case '=':
            case NEGRO:
            case ENDINPUT:
            case '<':
            case AZUL:
            case ')':
            case '>':
                return 683;
            case '*':
                return 102;
            case '+':
                return 103;
            case '-':
                return 104;
            case '/':
                return 105;
        }
        return yyr52();
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
                return 683;
        }
        return yyr183();
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
                return 683;
        }
        return yyr179();
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
                return 683;
        }
        return yyr182();
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
                return 683;
        }
        return yyr178();
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
                return 683;
        }
        return yyr181();
    }

    private int yys332() {
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
                return 683;
        }
        return yyr177();
    }

    private int yys333() {
        switch (yytok) {
            case CIAN:
            case BLANCO:
            case PROCEDURE_NAME:
            case MARRON:
            case PARAMETER:
            case error:
            case GRIS:
            case '[':
            case ROJO:
            case AMARILLO:
            case VERDE:
            case '=':
            case NEGRO:
            case ENDINPUT:
            case '<':
            case AZUL:
            case ')':
            case '>':
                return 683;
            case '*':
                return 96;
            case '+':
                return 97;
            case '-':
                return 98;
            case '/':
                return 99;
        }
        return yyr56();
    }

    private int yys334() {
        switch (yytok) {
            case CIAN:
            case BLANCO:
            case PROCEDURE_NAME:
            case MARRON:
            case PARAMETER:
            case error:
            case GRIS:
            case '[':
            case ROJO:
            case AMARILLO:
            case VERDE:
            case '=':
            case NEGRO:
            case ENDINPUT:
            case '<':
            case AZUL:
            case ')':
            case '>':
                return 683;
            case '*':
                return 102;
            case '+':
                return 103;
            case '-':
                return 104;
            case '/':
                return 105;
        }
        return yyr55();
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
                return 683;
        }
        return yyr190();
    }

    private int yys336() {
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
                return 683;
        }
        return yyr189();
    }

    private int yys337() {
        switch (yytok) {
            case MARRON:
            case '/':
            case ENDINPUT:
            case BLANCO:
            case PARAMETER:
            case '*':
            case error:
            case '[':
            case CIAN:
            case AMARILLO:
            case VERDE:
            case '=':
            case '-':
            case ')':
            case '<':
            case NEGRO:
            case '+':
            case '>':
            case ROJO:
            case PROCEDURE_NAME:
            case GRIS:
            case AZUL:
                return 683;
        }
        return yyr186();
    }

    private int yys338() {
        switch (yytok) {
            case MARRON:
            case '/':
            case ENDINPUT:
            case BLANCO:
            case PARAMETER:
            case '*':
            case error:
            case '[':
            case CIAN:
            case AMARILLO:
            case VERDE:
            case '=':
            case '-':
            case ')':
            case '<':
            case NEGRO:
            case '+':
            case '>':
            case ROJO:
            case PROCEDURE_NAME:
            case GRIS:
            case AZUL:
                return 683;
        }
        return yyr185();
    }

    private int yys339() {
        switch (yytok) {
            case MARRON:
            case '/':
            case ENDINPUT:
            case BLANCO:
            case PARAMETER:
            case '*':
            case error:
            case '[':
            case CIAN:
            case AMARILLO:
            case VERDE:
            case '=':
            case '-':
            case ')':
            case '<':
            case NEGRO:
            case '+':
            case '>':
            case ROJO:
            case PROCEDURE_NAME:
            case GRIS:
            case AZUL:
                return 683;
        }
        return yyr187();
    }

    private int yyr1() { // progl : prog
        { acciones.add(anidados.pop());parseFinished(); }
        yysv[yysp-=1] = yyrv;
        return 1;
    }

    private int yyr84() { // color : BLANCO
        {yyrv="blanco";}
        yysv[yysp-=1] = yyrv;
        return yypcolor();
    }

    private int yyr85() { // color : AZUL
        {yyrv="azul";}
        yysv[yysp-=1] = yyrv;
        return yypcolor();
    }

    private int yyr86() { // color : MARRON
        {yyrv="marron";}
        yysv[yysp-=1] = yyrv;
        return yypcolor();
    }

    private int yyr87() { // color : CIAN
        {yyrv="cian";}
        yysv[yysp-=1] = yyrv;
        return yypcolor();
    }

    private int yyr88() { // color : GRIS
        {yyrv="gris";}
        yysv[yysp-=1] = yyrv;
        return yypcolor();
    }

    private int yyr89() { // color : AMARILLO
        {yyrv="amarillo";}
        yysv[yysp-=1] = yyrv;
        return yypcolor();
    }

    private int yyr90() { // color : NEGRO
        {yyrv="negro";}
        yysv[yysp-=1] = yyrv;
        return yypcolor();
    }

    private int yyr91() { // color : ROJO
        {yyrv="rojo";}
        yysv[yysp-=1] = yyrv;
        return yypcolor();
    }

    private int yyr92() { // color : VERDE
        {yyrv="verde";}
        yysv[yysp-=1] = yyrv;
        return yypcolor();
    }

    private int yypcolor() {
        switch (yyst[yysp-1]) {
            case 65: return 175;
            default: return 185;
        }
    }

    private int yyr54() { // declaration_expr : VAR IDENTIFIER
        {if(!varHandler.isIgnore()){varHandler.add(((String)yysv[yysp-1]));}}
        yysv[yysp-=2] = yyrv;
        return 2;
    }

    private int yyr55() { // declaration_expr : VAR IDENTIFIER '=' int_number
        {if(!varHandler.isIgnore()){varHandler.add(((String)yysv[yysp-3]),((Integer)yysv[yysp-1]));}}
        yysv[yysp-=4] = yyrv;
        return 2;
    }

    private int yyr56() { // declaration_expr : VAR IDENTIFIER '=' float_number
        {if(!varHandler.isIgnore()){varHandler.add(((String)yysv[yysp-3]),((Float)yysv[yysp-1]));}}
        yysv[yysp-=4] = yyrv;
        return 2;
    }

    private int yyr172() { // expr_procs_n : expression expr_procs_n
        yysp -= 2;
        return yypexpr_procs_n();
    }

    private int yyr173() { // expr_procs_n : expression
        yysp -= 1;
        return yypexpr_procs_n();
    }

    private int yypexpr_procs_n() {
        switch (yyst[yysp-1]) {
            case 108: return 246;
            default: return 308;
        }
    }

    private int yyr5() { // expression : declaration_expr
        yysp -= 1;
        return yypexpression();
    }

    private int yyr6() { // expression : redeclaration_expr
        yysp -= 1;
        return yypexpression();
    }

    private int yyr7() { // expression : logic_expr
        yysp -= 1;
        return yypexpression();
    }

    private int yyr8() { // expression : int_arithmetic_expr
        yysp -= 1;
        return yypexpression();
    }

    private int yyr9() { // expression : float_arithmetic_expr
        yysp -= 1;
        return yypexpression();
    }

    private int yyr10() { // expression : int_proc1
        yysp -= 1;
        return yypexpression();
    }

    private int yyr11() { // expression : int_proc2
        yysp -= 1;
        return yypexpression();
    }

    private int yyr12() { // expression : int_proc_p
        yysp -= 1;
        return yypexpression();
    }

    private int yyr13() { // expression : int_proc_1p
        yysp -= 1;
        return yypexpression();
    }

    private int yyr14() { // expression : int_proc_n
        yysp -= 1;
        return yypexpression();
    }

    private int yyr15() { // expression : float_proc
        yysp -= 1;
        return yypexpression();
    }

    private int yyr16() { // expression : float_proc1
        yysp -= 1;
        return yypexpression();
    }

    private int yyr17() { // expression : float_proc2
        yysp -= 1;
        return yypexpression();
    }

    private int yyr18() { // expression : float_proc_p
        yysp -= 1;
        return yypexpression();
    }

    private int yyr19() { // expression : float_proc_1p
        yysp -= 1;
        return yypexpression();
    }

    private int yyr20() { // expression : float_proc_n
        yysp -= 1;
        return yypexpression();
    }

    private int yyr21() { // expression : bool_proc2
        yysp -= 1;
        return yypexpression();
    }

    private int yyr22() { // expression : void_proc
        yysp -= 1;
        return yypexpression();
    }

    private int yyr23() { // expression : void_proc1
        yysp -= 1;
        return yypexpression();
    }

    private int yyr24() { // expression : void_proc2
        yysp -= 1;
        return yypexpression();
    }

    private int yyr25() { // expression : void_proc_p
        yysp -= 1;
        return yypexpression();
    }

    private int yyr26() { // expression : void_proc_1p
        yysp -= 1;
        return yypexpression();
    }

    private int yyr27() { // expression : user_procedure
        yysp -= 1;
        return yypexpression();
    }

    private int yypexpression() {
        switch (yyst[yysp-1]) {
            case 247: return 247;
            case 108: return 247;
            case 95: return 3;
            case 0: return 3;
            default: return 109;
        }
    }

    private int yyr70() { // float_arithmetic_expr : float_number '+' int_number
        { yyrv = ((Float)yysv[yysp-3]) + ((Integer)yysv[yysp-1]); }
        yysv[yysp-=3] = yyrv;
        return yypfloat_arithmetic_expr();
    }

    private int yyr71() { // float_arithmetic_expr : int_number '+' float_number
        { yyrv = ((Integer)yysv[yysp-3]) + ((Float)yysv[yysp-1]); }
        yysv[yysp-=3] = yyrv;
        return yypfloat_arithmetic_expr();
    }

    private int yyr72() { // float_arithmetic_expr : float_number '+' float_number
        { yyrv = ((Float)yysv[yysp-3]) + ((Float)yysv[yysp-1]); }
        yysv[yysp-=3] = yyrv;
        return yypfloat_arithmetic_expr();
    }

    private int yyr73() { // float_arithmetic_expr : float_number '-' int_number
        { yyrv = ((Float)yysv[yysp-3]) - ((Integer)yysv[yysp-1]); }
        yysv[yysp-=3] = yyrv;
        return yypfloat_arithmetic_expr();
    }

    private int yyr74() { // float_arithmetic_expr : int_number '-' float_number
        { yyrv = ((Integer)yysv[yysp-3]) - ((Float)yysv[yysp-1]); }
        yysv[yysp-=3] = yyrv;
        return yypfloat_arithmetic_expr();
    }

    private int yyr75() { // float_arithmetic_expr : float_number '-' float_number
        { yyrv = ((Float)yysv[yysp-3]) - ((Float)yysv[yysp-1]); }
        yysv[yysp-=3] = yyrv;
        return yypfloat_arithmetic_expr();
    }

    private int yyr76() { // float_arithmetic_expr : float_number '*' int_number
        { yyrv = ((Float)yysv[yysp-3]) * ((Integer)yysv[yysp-1]); }
        yysv[yysp-=3] = yyrv;
        return yypfloat_arithmetic_expr();
    }

    private int yyr77() { // float_arithmetic_expr : int_number '*' float_number
        { yyrv = ((Integer)yysv[yysp-3]) * ((Float)yysv[yysp-1]); }
        yysv[yysp-=3] = yyrv;
        return yypfloat_arithmetic_expr();
    }

    private int yyr78() { // float_arithmetic_expr : float_number '*' float_number
        { yyrv = ((Float)yysv[yysp-3]) * ((Float)yysv[yysp-1]); }
        yysv[yysp-=3] = yyrv;
        return yypfloat_arithmetic_expr();
    }

    private int yyr79() { // float_arithmetic_expr : int_number '/' int_number
        { yyrv = ((Integer)yysv[yysp-3]) / ((Integer)yysv[yysp-1]); }
        yysv[yysp-=3] = yyrv;
        return yypfloat_arithmetic_expr();
    }

    private int yyr80() { // float_arithmetic_expr : float_number '/' int_number
        { yyrv = ((Float)yysv[yysp-3]) / ((Integer)yysv[yysp-1]); }
        yysv[yysp-=3] = yyrv;
        return yypfloat_arithmetic_expr();
    }

    private int yyr81() { // float_arithmetic_expr : int_number '/' float_number
        { yyrv = ((Integer)yysv[yysp-3]) / ((Float)yysv[yysp-1]); }
        yysv[yysp-=3] = yyrv;
        return yypfloat_arithmetic_expr();
    }

    private int yyr82() { // float_arithmetic_expr : float_number '/' float_number
        { yyrv = ((Float)yysv[yysp-3]) / ((Float)yysv[yysp-1]); }
        yysv[yysp-=3] = yyrv;
        return yypfloat_arithmetic_expr();
    }

    private int yyr83() { // float_arithmetic_expr : '(' float_arithmetic_expr ')'
        { yyrv = ((Float)yysv[yysp-2]); }
        yysv[yysp-=3] = yyrv;
        return yypfloat_arithmetic_expr();
    }

    private int yypfloat_arithmetic_expr() {
        switch (yyst[yysp-1]) {
            case 247: return 4;
            case 111: return 4;
            case 109: return 4;
            case 108: return 4;
            case 95: return 4;
            case 93: return 218;
            case 25: return 4;
            case 0: return 4;
            default: return 134;
        }
    }

    private int yyr43() { // float_number : FLOAT
        {yyrv=((Float)yysv[yysp-1]);}
        yysv[yysp-=1] = yyrv;
        return yypfloat_number();
    }

    private int yyr44() { // float_number : IDENTIFIER
        { yyrv=(Float)varHandler.getFloat(((String)yysv[yysp-1])); }
        yysv[yysp-=1] = yyrv;
        return yypfloat_number();
    }

    private int yyr45() { // float_number : float_arithmetic_expr
        yysp -= 1;
        return yypfloat_number();
    }

    private int yyr46() { // float_number : float_proc
        yysp -= 1;
        return yypfloat_number();
    }

    private int yyr47() { // float_number : float_proc1
        yysp -= 1;
        return yypfloat_number();
    }

    private int yyr48() { // float_number : float_proc2
        yysp -= 1;
        return yypfloat_number();
    }

    private int yyr49() { // float_number : float_proc_p
        yysp -= 1;
        return yypfloat_number();
    }

    private int yyr50() { // float_number : float_proc_1p
        yysp -= 1;
        return yypfloat_number();
    }

    private int yyr51() { // float_number : float_proc_n
        yysp -= 1;
        return yypfloat_number();
    }

    private int yypfloat_number() {
        switch (yyst[yysp-1]) {
            case 303: return 333;
            case 280: return 324;
            case 279: return 321;
            case 274: return 144;
            case 215: return 144;
            case 214: return 144;
            case 194: return 144;
            case 193: return 294;
            case 192: return 292;
            case 169: return 287;
            case 168: return 285;
            case 167: return 283;
            case 166: return 281;
            case 163: return 277;
            case 162: return 275;
            case 150: return 144;
            case 149: return 270;
            case 148: return 268;
            case 144: return 144;
            case 143: return 144;
            case 107: return 244;
            case 106: return 242;
            case 105: return 240;
            case 104: return 238;
            case 103: return 236;
            case 102: return 234;
            case 101: return 232;
            case 100: return 230;
            case 99: return 228;
            case 98: return 226;
            case 97: return 224;
            case 96: return 222;
            case 93: return 219;
            case 88: return 144;
            case 85: return 209;
            case 84: return 207;
            case 78: return 202;
            case 76: return 199;
            case 75: return 197;
            case 74: return 144;
            case 72: return 192;
            case 68: return 187;
            case 60: return 170;
            case 59: return 168;
            case 58: return 166;
            case 54: return 162;
            case 52: return 160;
            case 51: return 158;
            case 50: return 156;
            case 49: return 154;
            case 47: return 152;
            case 43: return 148;
            case 42: return 144;
            case 40: return 135;
            default: return 5;
        }
    }

    private int yyr164() { // float_params_n : float_number float_params_n
        {n_params.peek().add(((Float)yysv[yysp-2]));}
        yysv[yysp-=2] = yyrv;
        return yypfloat_params_n();
    }

    private int yyr165() { // float_params_n : float_number
        {n_params.push(new ArrayList<Object>());n_params.peek().add(((Float)yysv[yysp-1]));}
        yysv[yysp-=1] = yyrv;
        return yypfloat_params_n();
    }

    private int yypfloat_params_n() {
        switch (yyst[yysp-1]) {
            case 215: return 301;
            case 214: return 299;
            case 194: return 296;
            case 150: return 272;
            case 144: return 266;
            case 143: return 264;
            case 88: return 212;
            case 74: return 195;
            case 42: return 145;
            default: return 319;
        }
    }

    private int yyr93() { // float_proc : RUMBO
        {yyrv=varHandler.getInt("rumbo");}
        yysv[yysp-=1] = yyrv;
        switch (yyst[yysp-1]) {
            case 247: return 6;
            case 111: return 6;
            case 109: return 6;
            case 108: return 6;
            case 95: return 6;
            case 25: return 6;
            case 0: return 6;
            default: return 136;
        }
    }

    private int yyr107() { // float_proc1 : COS int_number
        { yyrv = Math.cos(((Integer)yysv[yysp-1])); }
        yysv[yysp-=2] = yyrv;
        return yypfloat_proc1();
    }

    private int yyr108() { // float_proc1 : COS float_number
        { yyrv = Math.cos(((Float)yysv[yysp-1])); }
        yysv[yysp-=2] = yyrv;
        return yypfloat_proc1();
    }

    private int yyr109() { // float_proc1 : MENOS float_number
        { yyrv = ((Float)yysv[yysp-1]) * -1; }
        yysv[yysp-=2] = yyrv;
        return yypfloat_proc1();
    }

    private int yyr110() { // float_proc1 : RAIZCUADRADA int_number
        { yyrv = Math.sqrt(((Integer)yysv[yysp-1])); }
        yysv[yysp-=2] = yyrv;
        return yypfloat_proc1();
    }

    private int yyr111() { // float_proc1 : RAIZCUADRADA float_number
        { yyrv = Math.sqrt(((Float)yysv[yysp-1])); }
        yysv[yysp-=2] = yyrv;
        return yypfloat_proc1();
    }

    private int yyr112() { // float_proc1 : RC int_number
        { yyrv = Math.sqrt(((Integer)yysv[yysp-1])); }
        yysv[yysp-=2] = yyrv;
        return yypfloat_proc1();
    }

    private int yyr113() { // float_proc1 : RC float_number
        { yyrv = Math.sqrt(((Float)yysv[yysp-1])); }
        yysv[yysp-=2] = yyrv;
        return yypfloat_proc1();
    }

    private int yyr114() { // float_proc1 : SENO int_number
        { yyrv = Math.sin(((Integer)yysv[yysp-1])); }
        yysv[yysp-=2] = yyrv;
        return yypfloat_proc1();
    }

    private int yyr115() { // float_proc1 : SENO float_number
        { yyrv = Math.sin(((Float)yysv[yysp-1])); }
        yysv[yysp-=2] = yyrv;
        return yypfloat_proc1();
    }

    private int yyr116() { // float_proc1 : SEN int_number
        { yyrv = Math.sin(((Integer)yysv[yysp-1])); }
        yysv[yysp-=2] = yyrv;
        return yypfloat_proc1();
    }

    private int yyr117() { // float_proc1 : SEN float_number
        { yyrv = Math.sin(((Float)yysv[yysp-1])); }
        yysv[yysp-=2] = yyrv;
        return yypfloat_proc1();
    }

    private int yypfloat_proc1() {
        switch (yyst[yysp-1]) {
            case 247: return 7;
            case 111: return 7;
            case 109: return 7;
            case 108: return 7;
            case 95: return 7;
            case 25: return 7;
            case 0: return 7;
            default: return 137;
        }
    }

    private int yyr140() { // float_proc2 : POTENCIA float_number int_number
        { yyrv = Math.pow(((Float)yysv[yysp-2]), ((Integer)yysv[yysp-1])); }
        yysv[yysp-=3] = yyrv;
        return yypfloat_proc2();
    }

    private int yyr141() { // float_proc2 : POTENCIA int_number float_number
        { yyrv = Math.pow(((Integer)yysv[yysp-2]), ((Float)yysv[yysp-1])); }
        yysv[yysp-=3] = yyrv;
        return yypfloat_proc2();
    }

    private int yyr142() { // float_proc2 : POTENCIA float_number float_number
        { yyrv = Math.pow(((Float)yysv[yysp-2]), ((Float)yysv[yysp-1])); }
        yysv[yysp-=3] = yyrv;
        return yypfloat_proc2();
    }

    private int yyr143() { // float_proc2 : DIVISION int_number int_number
        { yyrv = ((Integer)yysv[yysp-2]) / ((Integer)yysv[yysp-1]); }
        yysv[yysp-=3] = yyrv;
        return yypfloat_proc2();
    }

    private int yyr144() { // float_proc2 : DIVISION float_number int_number
        { yyrv = ((Float)yysv[yysp-2]) / ((Integer)yysv[yysp-1]); }
        yysv[yysp-=3] = yyrv;
        return yypfloat_proc2();
    }

    private int yyr145() { // float_proc2 : DIVISION int_number float_number
        { yyrv = ((Integer)yysv[yysp-2]) / ((Float)yysv[yysp-1]); }
        yysv[yysp-=3] = yyrv;
        return yypfloat_proc2();
    }

    private int yyr146() { // float_proc2 : DIVISION float_number float_number
        { yyrv = ((Float)yysv[yysp-2]) / ((Float)yysv[yysp-1]); }
        yysv[yysp-=3] = yyrv;
        return yypfloat_proc2();
    }

    private int yypfloat_proc2() {
        switch (yyst[yysp-1]) {
            case 247: return 8;
            case 111: return 8;
            case 109: return 8;
            case 108: return 8;
            case 95: return 8;
            case 25: return 8;
            case 0: return 8;
            default: return 138;
        }
    }

    private int yyr190() { // float_proc_1p : ELEMENTO int_number '[' float_params_n ']'
        {yyrv=elemento_float(((Integer)yysv[yysp-4]));n_params.pop();}
        yysv[yysp-=5] = yyrv;
        switch (yyst[yysp-1]) {
            case 247: return 9;
            case 111: return 9;
            case 109: return 9;
            case 108: return 9;
            case 95: return 9;
            case 25: return 9;
            case 0: return 9;
            default: return 139;
        }
    }

    private int yyr169() { // float_proc_n : DIFERENCIA float_params_n
        {yyrv=(Float)proc_diferencia_Float();n_params.pop();}
        yysv[yysp-=2] = yyrv;
        return yypfloat_proc_n();
    }

    private int yyr170() { // float_proc_n : PRODUCTO float_params_n
        {yyrv=(Float)proc_producto_Float();n_params.pop();}
        yysv[yysp-=2] = yyrv;
        return yypfloat_proc_n();
    }

    private int yyr171() { // float_proc_n : SUMA float_params_n
        {yyrv=(Float)proc_suma_Float();n_params.pop();}
        yysv[yysp-=2] = yyrv;
        return yypfloat_proc_n();
    }

    private int yypfloat_proc_n() {
        switch (yyst[yysp-1]) {
            case 247: return 10;
            case 111: return 10;
            case 109: return 10;
            case 108: return 10;
            case 95: return 10;
            case 25: return 10;
            case 0: return 10;
            default: return 140;
        }
    }

    private int yyr180() { // float_proc_p : ELEGIR '[' float_params_n ']'
        {yyrv = elegir_float();n_params.pop();}
        yysv[yysp-=4] = yyrv;
        return yypfloat_proc_p();
    }

    private int yyr181() { // float_proc_p : ULTIMO '[' float_params_n ']'
        {yyrv = ultimo_float();n_params.pop();}
        yysv[yysp-=4] = yyrv;
        return yypfloat_proc_p();
    }

    private int yyr182() { // float_proc_p : UL '[' float_params_n ']'
        {yyrv = ultimo_float();n_params.pop();}
        yysv[yysp-=4] = yyrv;
        return yypfloat_proc_p();
    }

    private int yyr183() { // float_proc_p : PRIMERO '[' float_params_n ']'
        {yyrv = primero_float();n_params.pop();}
        yysv[yysp-=4] = yyrv;
        return yypfloat_proc_p();
    }

    private int yypfloat_proc_p() {
        switch (yyst[yysp-1]) {
            case 247: return 11;
            case 111: return 11;
            case 109: return 11;
            case 108: return 11;
            case 95: return 11;
            case 25: return 11;
            case 0: return 11;
            default: return 141;
        }
    }

    private int yyr30() { // instructions : expression instructions
        { procInstructions.add((String)yysv[yysp-2]); }
        yysv[yysp-=2] = yyrv;
        return yypinstructions();
    }

    private int yyr31() { // instructions : expression
        { procInstructions.add((String)yysv[yysp-1]); }
        yysv[yysp-=1] = yyrv;
        return yypinstructions();
    }

    private int yypinstructions() {
        switch (yyst[yysp-1]) {
            case 109: return 248;
            case 25: return 110;
            default: return 250;
        }
    }

    private int yyr66() { // int_arithmetic_expr : int_number '+' int_number
        { yyrv = ((Integer)yysv[yysp-3]) + ((Integer)yysv[yysp-1]); }
        yysv[yysp-=3] = yyrv;
        return yypint_arithmetic_expr();
    }

    private int yyr67() { // int_arithmetic_expr : int_number '-' int_number
        { yyrv = ((Integer)yysv[yysp-3]) - ((Integer)yysv[yysp-1]); }
        yysv[yysp-=3] = yyrv;
        return yypint_arithmetic_expr();
    }

    private int yyr68() { // int_arithmetic_expr : int_number '*' int_number
        { yyrv = ((Integer)yysv[yysp-3]) * ((Integer)yysv[yysp-1]); }
        yysv[yysp-=3] = yyrv;
        return yypint_arithmetic_expr();
    }

    private int yyr69() { // int_arithmetic_expr : '(' int_arithmetic_expr ')'
        { yyrv = ((Integer)yysv[yysp-2]); }
        yysv[yysp-=3] = yyrv;
        return yypint_arithmetic_expr();
    }

    private int yypint_arithmetic_expr() {
        switch (yyst[yysp-1]) {
            case 247: return 12;
            case 131: return 220;
            case 111: return 12;
            case 109: return 12;
            case 108: return 12;
            case 95: return 12;
            case 93: return 220;
            case 25: return 12;
            case 0: return 12;
            default: return 113;
        }
    }

    private int yyr35() { // int_number : INTEGER
        {yyrv = ((Integer)yysv[yysp-1]);}
        yysv[yysp-=1] = yyrv;
        return yypint_number();
    }

    private int yyr36() { // int_number : IDENTIFIER
        {yyrv=(Integer)varHandler.getInt(((String)yysv[yysp-1]));}
        yysv[yysp-=1] = yyrv;
        return yypint_number();
    }

    private int yyr37() { // int_number : int_arithmetic_expr
        yysp -= 1;
        return yypint_number();
    }

    private int yyr38() { // int_number : int_proc1
        yysp -= 1;
        return yypint_number();
    }

    private int yyr39() { // int_number : int_proc2
        yysp -= 1;
        return yypint_number();
    }

    private int yyr40() { // int_number : int_proc_p
        yysp -= 1;
        return yypint_number();
    }

    private int yyr41() { // int_number : int_proc_1p
        yysp -= 1;
        return yypint_number();
    }

    private int yyr42() { // int_number : int_proc_n
        yysp -= 1;
        return yypint_number();
    }

    private int yypint_number() {
        switch (yyst[yysp-1]) {
            case 313: return 255;
            case 303: return 334;
            case 290: return 326;
            case 280: return 325;
            case 279: return 322;
            case 274: return 146;
            case 262: return 255;
            case 261: return 255;
            case 260: return 255;
            case 259: return 314;
            case 256: return 255;
            case 255: return 255;
            case 254: return 312;
            case 253: return 311;
            case 252: return 310;
            case 215: return 146;
            case 214: return 146;
            case 205: return 298;
            case 194: return 146;
            case 193: return 295;
            case 192: return 293;
            case 190: return 291;
            case 186: return 290;
            case 169: return 288;
            case 168: return 286;
            case 167: return 284;
            case 166: return 282;
            case 163: return 278;
            case 162: return 276;
            case 150: return 146;
            case 149: return 271;
            case 148: return 269;
            case 146: return 255;
            case 144: return 203;
            case 143: return 146;
            case 131: return 263;
            case 128: return 255;
            case 127: return 255;
            case 125: return 259;
            case 124: return 258;
            case 122: return 257;
            case 120: return 255;
            case 107: return 245;
            case 106: return 243;
            case 105: return 241;
            case 104: return 239;
            case 103: return 237;
            case 102: return 235;
            case 101: return 233;
            case 100: return 231;
            case 99: return 229;
            case 98: return 227;
            case 97: return 225;
            case 96: return 223;
            case 93: return 203;
            case 88: return 146;
            case 85: return 210;
            case 84: return 208;
            case 81: return 206;
            case 80: return 205;
            case 79: return 204;
            case 78: return 203;
            case 77: return 201;
            case 76: return 200;
            case 75: return 198;
            case 74: return 146;
            case 72: return 193;
            case 71: return 191;
            case 70: return 190;
            case 69: return 189;
            case 68: return 188;
            case 60: return 171;
            case 59: return 169;
            case 58: return 167;
            case 54: return 163;
            case 52: return 161;
            case 51: return 159;
            case 50: return 157;
            case 49: return 155;
            case 47: return 153;
            case 46: return 151;
            case 43: return 149;
            case 42: return 146;
            case 40: return 142;
            case 35: return 133;
            case 34: return 132;
            case 33: return 114;
            default: return 13;
        }
    }

    private int yyr162() { // int_params_n : int_number int_params_n
        {n_params.peek().add(((Integer)yysv[yysp-2]));}
        yysv[yysp-=2] = yyrv;
        return yypint_params_n();
    }

    private int yyr163() { // int_params_n : int_number
        {n_params.push(new ArrayList<Object>());n_params.peek().add(((Integer)yysv[yysp-1]));}
        yysv[yysp-=1] = yyrv;
        return yypint_params_n();
    }

    private int yypint_params_n() {
        switch (yyst[yysp-1]) {
            case 262: return 302;
            case 261: return 300;
            case 260: return 297;
            case 256: return 273;
            case 255: return 267;
            case 215: return 302;
            case 214: return 300;
            case 194: return 297;
            case 150: return 273;
            case 146: return 267;
            case 143: return 265;
            case 128: return 213;
            case 127: return 196;
            case 120: return 147;
            case 88: return 213;
            case 74: return 196;
            case 42: return 147;
            default: return 320;
        }
    }

    private int yyr104() { // int_proc1 : REDONDEA float_number
        { yyrv = Math.rint(((Float)yysv[yysp-1])); }
        yysv[yysp-=2] = yyrv;
        return yypint_proc1();
    }

    private int yyr105() { // int_proc1 : AZAR int_number
        { Random ran = new Random(); yyrv = ran.nextInt(((Integer)yysv[yysp-1])); }
        yysv[yysp-=2] = yyrv;
        return yypint_proc1();
    }

    private int yyr106() { // int_proc1 : MENOS int_number
        { yyrv = ((Integer)yysv[yysp-1]) * -1; }
        yysv[yysp-=2] = yyrv;
        return yypint_proc1();
    }

    private int yypint_proc1() {
        switch (yyst[yysp-1]) {
            case 247: return 14;
            case 111: return 14;
            case 109: return 14;
            case 108: return 14;
            case 95: return 14;
            case 25: return 14;
            case 0: return 14;
            default: return 115;
        }
    }

    private int yyr138() { // int_proc2 : POTENCIA int_number int_number
        { yyrv = Math.pow(((Integer)yysv[yysp-2]), ((Integer)yysv[yysp-1])); }
        yysv[yysp-=3] = yyrv;
        return yypint_proc2();
    }

    private int yyr139() { // int_proc2 : RESTO int_number int_number
        { yyrv = ((Integer)yysv[yysp-2]) % ((Integer)yysv[yysp-1]); }
        yysv[yysp-=3] = yyrv;
        return yypint_proc2();
    }

    private int yypint_proc2() {
        switch (yyst[yysp-1]) {
            case 247: return 15;
            case 111: return 15;
            case 109: return 15;
            case 108: return 15;
            case 95: return 15;
            case 25: return 15;
            case 0: return 15;
            default: return 116;
        }
    }

    private int yyr189() { // int_proc_1p : ELEMENTO int_number '[' int_params_n ']'
        {yyrv=elemento_int(((Integer)yysv[yysp-4]));n_params.pop();}
        yysv[yysp-=5] = yyrv;
        switch (yyst[yysp-1]) {
            case 247: return 16;
            case 111: return 16;
            case 109: return 16;
            case 108: return 16;
            case 95: return 16;
            case 25: return 16;
            case 0: return 16;
            default: return 117;
        }
    }

    private int yyr166() { // int_proc_n : DIFERENCIA int_params_n
        {yyrv=(Integer)proc_diferencia_int();n_params.pop();}
        yysv[yysp-=2] = yyrv;
        return yypint_proc_n();
    }

    private int yyr167() { // int_proc_n : PRODUCTO int_params_n
        {yyrv=(Integer)proc_producto_int();n_params.pop();}
        yysv[yysp-=2] = yyrv;
        return yypint_proc_n();
    }

    private int yyr168() { // int_proc_n : SUMA int_params_n
        {yyrv=(Integer)proc_suma_int();n_params.pop();}
        yysv[yysp-=2] = yyrv;
        return yypint_proc_n();
    }

    private int yypint_proc_n() {
        switch (yyst[yysp-1]) {
            case 247: return 17;
            case 111: return 17;
            case 109: return 17;
            case 108: return 17;
            case 95: return 17;
            case 25: return 17;
            case 0: return 17;
            default: return 118;
        }
    }

    private int yyr174() { // int_proc_p : ELEGIR '[' int_params_n ']'
        {yyrv = elegir_int();n_params.pop();}
        yysv[yysp-=4] = yyrv;
        return yypint_proc_p();
    }

    private int yyr175() { // int_proc_p : CUENTA '[' int_params_n ']'
        {yyrv = cuenta();n_params.pop();}
        yysv[yysp-=4] = yyrv;
        return yypint_proc_p();
    }

    private int yyr176() { // int_proc_p : CUENTA '[' float_params_n ']'
        {yyrv = cuenta();n_params.pop();}
        yysv[yysp-=4] = yyrv;
        return yypint_proc_p();
    }

    private int yyr177() { // int_proc_p : ULTIMO '[' int_params_n ']'
        {yyrv = ultimo_int();n_params.pop();}
        yysv[yysp-=4] = yyrv;
        return yypint_proc_p();
    }

    private int yyr178() { // int_proc_p : UL '[' int_params_n ']'
        {yyrv = ultimo_int();n_params.pop();}
        yysv[yysp-=4] = yyrv;
        return yypint_proc_p();
    }

    private int yyr179() { // int_proc_p : PRIMERO '[' int_params_n ']'
        {yyrv = primero_int();n_params.pop();}
        yysv[yysp-=4] = yyrv;
        return yypint_proc_p();
    }

    private int yypint_proc_p() {
        switch (yyst[yysp-1]) {
            case 247: return 18;
            case 111: return 18;
            case 109: return 18;
            case 108: return 18;
            case 95: return 18;
            case 25: return 18;
            case 0: return 18;
            default: return 119;
        }
    }

    private int yyr57() { // logic_expr : int_number '<' int_number
        { yyrv = ((Integer)yysv[yysp-3]) < ((Integer)yysv[yysp-1]); }
        yysv[yysp-=3] = yyrv;
        return yyplogic_expr();
    }

    private int yyr58() { // logic_expr : float_number '<' int_number
        { yyrv = ((Float)yysv[yysp-3]) < ((Integer)yysv[yysp-1]); }
        yysv[yysp-=3] = yyrv;
        return yyplogic_expr();
    }

    private int yyr59() { // logic_expr : int_number '<' float_number
        { yyrv = ((Integer)yysv[yysp-3]) < ((Float)yysv[yysp-1]); }
        yysv[yysp-=3] = yyrv;
        return yyplogic_expr();
    }

    private int yyr60() { // logic_expr : float_number '<' float_number
        { yyrv = ((Float)yysv[yysp-3]) < ((Float)yysv[yysp-1]); }
        yysv[yysp-=3] = yyrv;
        return yyplogic_expr();
    }

    private int yyr61() { // logic_expr : int_number '>' int_number
        { yyrv = ((Integer)yysv[yysp-3]) > ((Integer)yysv[yysp-1]); }
        yysv[yysp-=3] = yyrv;
        return yyplogic_expr();
    }

    private int yyr62() { // logic_expr : float_number '>' int_number
        { yyrv = ((Float)yysv[yysp-3]) > ((Integer)yysv[yysp-1]); }
        yysv[yysp-=3] = yyrv;
        return yyplogic_expr();
    }

    private int yyr63() { // logic_expr : int_number '>' float_number
        { yyrv = ((Integer)yysv[yysp-3]) > ((Float)yysv[yysp-1]); }
        yysv[yysp-=3] = yyrv;
        return yyplogic_expr();
    }

    private int yyr64() { // logic_expr : float_number '>' float_number
        { yyrv = ((Float)yysv[yysp-3]) > ((Float)yysv[yysp-1]); }
        yysv[yysp-=3] = yyrv;
        return yyplogic_expr();
    }

    private int yyr65() { // logic_expr : bool_proc2
        {yyrv = ((Boolean)yysv[yysp-1]);}
        yysv[yysp-=1] = yyrv;
        return yyplogic_expr();
    }

    private int yyplogic_expr() {
        switch (yyst[yysp-1]) {
            case 217: return 304;
            case 172: return 289;
            case 92: return 217;
            case 86: return 211;
            case 61: return 172;
            default: return 19;
        }
    }

    private int yyr28() { // parameters : PARAMETER parameters
        { procParameters.add(((String)yysv[yysp-2])); }
        yysv[yysp-=2] = yyrv;
        return yypparameters();
    }

    private int yyr29() { // parameters : PARAMETER
        { procParameters.add(((String)yysv[yysp-1])); }
        yysv[yysp-=1] = yyrv;
        return yypparameters();
    }

    private int yypparameters() {
        switch (yyst[yysp-1]) {
            case 25: return 111;
            default: return 251;
        }
    }

    private int yyr192() { // proc_head : REPITE int_number
        {anidados.push(new jsonAction("repite", (int)((Integer)yysv[yysp-1])));}
        yysv[yysp-=2] = yyrv;
        return 20;
    }

    private int yyr193() { // proc_head : SI logic_expr
        {anidados.push(new jsonAction("si", 1));}
        yysv[yysp-=2] = yyrv;
        return 20;
    }

    private int yyr194() { // proc_head : EJECUTA
        {anidados.push(new jsonAction("ejecuta",1));}
        yysv[yysp-=1] = yyrv;
        return 20;
    }

    private int yyr2() { // prog : expression ';' prog
        yysp -= 3;
        return yypprog();
    }

    private int yyr3() { // prog : expression puntocoma
        yysp -= 2;
        return yypprog();
    }

    private int yypprog() {
        switch (yyst[yysp-1]) {
            case 0: return 21;
            default: return 221;
        }
    }

    private int yyr147() { // bool_proc2 : IGUALES int_number int_number
        { yyrv = ((Integer)yysv[yysp-2]).equals(((Integer)yysv[yysp-1])); }
        yysv[yysp-=3] = yyrv;
        return yypbool_proc2();
    }

    private int yyr148() { // bool_proc2 : IGUALES float_number int_number
        { yyrv = ((Float)yysv[yysp-2]).equals(((Integer)yysv[yysp-1])); }
        yysv[yysp-=3] = yyrv;
        return yypbool_proc2();
    }

    private int yyr149() { // bool_proc2 : IGUALES int_number float_number
        { yyrv = ((Integer)yysv[yysp-2]).equals(((Float)yysv[yysp-1])); }
        yysv[yysp-=3] = yyrv;
        return yypbool_proc2();
    }

    private int yyr150() { // bool_proc2 : IGUALES float_number float_number
        { yyrv = ((Float)yysv[yysp-2]).equals(((Float)yysv[yysp-1])); }
        yysv[yysp-=3] = yyrv;
        return yypbool_proc2();
    }

    private int yyr151() { // bool_proc2 : Y logic_expr logic_expr
        { yyrv = ((Boolean)yysv[yysp-2]) && ((Boolean)yysv[yysp-1]); }
        yysv[yysp-=3] = yyrv;
        return yypbool_proc2();
    }

    private int yyr152() { // bool_proc2 : O logic_expr logic_expr
        { yyrv = ((Boolean)yysv[yysp-2]) || ((Boolean)yysv[yysp-1]); }
        yysv[yysp-=3] = yyrv;
        return yypbool_proc2();
    }

    private int yyr153() { // bool_proc2 : MAYORQUE int_number int_number
        { yyrv = ((Integer)yysv[yysp-2]) > ((Integer)yysv[yysp-1]); }
        yysv[yysp-=3] = yyrv;
        return yypbool_proc2();
    }

    private int yyr154() { // bool_proc2 : MAYORQUE float_number int_number
        { yyrv = ((Float)yysv[yysp-2]) > ((Integer)yysv[yysp-1]); }
        yysv[yysp-=3] = yyrv;
        return yypbool_proc2();
    }

    private int yyr155() { // bool_proc2 : MAYORQUE int_number float_number
        { yyrv = ((Integer)yysv[yysp-2]) > ((Float)yysv[yysp-1]); }
        yysv[yysp-=3] = yyrv;
        return yypbool_proc2();
    }

    private int yyr156() { // bool_proc2 : MAYORQUE float_number float_number
        { yyrv = ((Float)yysv[yysp-2]) > ((Float)yysv[yysp-1]); }
        yysv[yysp-=3] = yyrv;
        return yypbool_proc2();
    }

    private int yyr157() { // bool_proc2 : MENORQUE int_number int_number
        { yyrv = ((Integer)yysv[yysp-2]) < ((Integer)yysv[yysp-1]); }
        yysv[yysp-=3] = yyrv;
        return yypbool_proc2();
    }

    private int yyr158() { // bool_proc2 : MENORQUE float_number int_number
        { yyrv = ((Float)yysv[yysp-2]) < ((Integer)yysv[yysp-1]); }
        yysv[yysp-=3] = yyrv;
        return yypbool_proc2();
    }

    private int yyr159() { // bool_proc2 : MENORQUE int_number float_number
        { yyrv = ((Integer)yysv[yysp-2]) < ((Float)yysv[yysp-1]); }
        yysv[yysp-=3] = yyrv;
        return yypbool_proc2();
    }

    private int yyr160() { // bool_proc2 : MENORQUE float_number float_number
        { yyrv = ((Float)yysv[yysp-2]) < ((Float)yysv[yysp-1]); }
        yysv[yysp-=3] = yyrv;
        return yypbool_proc2();
    }

    private int yypbool_proc2() {
        switch (yyst[yysp-1]) {
            case 217: return 173;
            case 172: return 173;
            case 92: return 173;
            case 86: return 173;
            case 61: return 173;
            default: return 22;
        }
    }

    private int yyr4() { // puntocoma : ';'
        {anidados.push(new jsonAction());}
        yysv[yysp-=1] = yyrv;
        return 94;
    }

    private int yyr52() { // redeclaration_expr : INIC IDENTIFIER '=' int_number
        { if(!varHandler.isIgnore()){varHandler.modify(((String)yysv[yysp-3]),((Integer)yysv[yysp-1]));} }
        yysv[yysp-=4] = yyrv;
        return 23;
    }

    private int yyr53() { // redeclaration_expr : INIC IDENTIFIER '=' float_number
        { if(!varHandler.isIgnore()){varHandler.modify(((String)yysv[yysp-3]),((Float)yysv[yysp-1]));} }
        yysv[yysp-=4] = yyrv;
        return 23;
    }

    private int yyr32() { // user_procedure : user_procedure_head instructions FIN
        { 
        procHandler.add(varHandler.getScope(), procInstructions);
        varHandler.resetScope();
        procInstructions.clear(); }
        yysv[yysp-=3] = yyrv;
        return 24;
    }

    private int yyr33() { // user_procedure : user_procedure_head parameters instructions FIN
        { 
        procHandler.add(varHandler.getScope(), procParameters, procInstructions);
        varHandler.resetScope();
        procParameters.clear();
        procInstructions.clear(); }
        yysv[yysp-=4] = yyrv;
        return 24;
    }

    private int yyr34() { // user_procedure_head : PARA PROCEDURE_NAME
        { varHandler.setScope(((String)yysv[yysp-1])); }
        yysv[yysp-=2] = yyrv;
        return 25;
    }

    private int yyr94() { // void_proc : OCULTATORTUGA
        {jsonAction result=new jsonAction("ocultatortuga",1,null);
                     if(anidados.empty()){yyrv = result;}
                     else{anidados.peek().addComplejo(result);}}
        yysv[yysp-=1] = yyrv;
        return 26;
    }

    private int yyr95() { // void_proc : OT
        {jsonAction result=new jsonAction("ocultatortuga",1,null);
         if(anidados.empty()){yyrv = result;}
         else{anidados.peek().addComplejo(result);}}
        yysv[yysp-=1] = yyrv;
        return 26;
    }

    private int yyr96() { // void_proc : APARECETORTUGA
        {jsonAction result=new jsonAction("aparecetortuga",1,null);
                     if(anidados.empty()){yyrv = result;}
                     else{anidados.peek().addComplejo(result);}}
        yysv[yysp-=1] = yyrv;
        return 26;
    }

    private int yyr97() { // void_proc : AT
        {jsonAction result=new jsonAction("aparecetortuga",1,null);
         if(anidados.empty()){yyrv = result;}
         else{anidados.peek().addComplejo(result);}}
        yysv[yysp-=1] = yyrv;
        return 26;
    }

    private int yyr98() { // void_proc : BAJALAPIZ
        {jsonAction result=new jsonAction("bajalapiz",1,null);
                if(anidados.empty()){yyrv = result;}
                else{anidados.peek().addComplejo(result);}}
        yysv[yysp-=1] = yyrv;
        return 26;
    }

    private int yyr99() { // void_proc : BL
        {jsonAction result=new jsonAction("bajalapiz",1,null);
         if(anidados.empty()){yyrv = result;}
         else{anidados.peek().addComplejo(result);}}
        yysv[yysp-=1] = yyrv;
        return 26;
    }

    private int yyr100() { // void_proc : SUBELAPIZ
        {jsonAction result=new jsonAction("subelapiz",1,null);
         if(anidados.empty()){yyrv = result;}
         else{anidados.peek().addComplejo(result);}}
        yysv[yysp-=1] = yyrv;
        return 26;
    }

    private int yyr101() { // void_proc : SB
        {jsonAction result=new jsonAction("subelapiz",1,null);
         if(anidados.empty()){yyrv = result;}
         else{anidados.peek().addComplejo(result);}}
        yysv[yysp-=1] = yyrv;
        return 26;
    }

    private int yyr102() { // void_proc : CENTRO
        {jsonAction result=new jsonAction("centro",1,null);
             if(anidados.empty()){yyrv = result;}
             else{anidados.peek().addComplejo(result);}}
        yysv[yysp-=1] = yyrv;
        return 26;
    }

    private int yyr103() { // void_proc : BORRAPANTALLA
        {jsonAction result=new jsonAction("borrapantalla",1,null);
                    if(anidados.empty()){yyrv = result;}
                    else{anidados.peek().addComplejo(result);}}
        yysv[yysp-=1] = yyrv;
        return 26;
    }

    private int yyr118() { // void_proc1 : AVANZA int_number
        {ArrayList<Object> argumentos = new ArrayList<Object>();
                                argumentos.add(((Integer)yysv[yysp-1]));
                                jsonAction result = new jsonAction("avanza",1,(ArrayList<Object>)argumentos);
                                if(anidados.empty()){yyrv = result;}
                                else{anidados.peek().addComplejo(result);}
                                }
        yysv[yysp-=2] = yyrv;
        return 27;
    }

    private int yyr119() { // void_proc1 : AV int_number
        {ArrayList<Object> argumentos = new ArrayList<Object>();
                                argumentos.add(((Integer)yysv[yysp-1]));
                                jsonAction result = new jsonAction("avanza",1,(ArrayList<Object>)argumentos);
                                if(anidados.empty()){yyrv = result;}
                                else{anidados.peek().addComplejo(result);}
                                }
        yysv[yysp-=2] = yyrv;
        return 27;
    }

    private int yyr120() { // void_proc1 : RETROCEDE int_number
        {ArrayList<Object> argumentos = new ArrayList<Object>();
                                argumentos.add(((Integer)yysv[yysp-1]));
                                jsonAction result = new jsonAction("avanza",1,(ArrayList<Object>)argumentos);
                                if(anidados.empty()){yyrv = result;}
                                else{anidados.peek().addComplejo(result);}
                                }
        yysv[yysp-=2] = yyrv;
        return 27;
    }

    private int yyr121() { // void_proc1 : RE int_number
        {ArrayList<Object> argumentos = new ArrayList<Object>();
                                argumentos.add(((Integer)yysv[yysp-1]));
                                jsonAction result = new jsonAction("avanza",1,(ArrayList<Object>)argumentos);
                                if(anidados.empty()){yyrv = result;}
                                else{anidados.peek().addComplejo(result);}
                                }
        yysv[yysp-=2] = yyrv;
        return 27;
    }

    private int yyr122() { // void_proc1 : GIRADERECHA int_number
        {ArrayList<Object> argumentos = new ArrayList<Object>();
                                argumentos.add(((Integer)yysv[yysp-1]));
                                jsonAction result = new jsonAction("avanza",1,(ArrayList<Object>)argumentos);
                                if(anidados.empty()){yyrv = result;}
                                else{anidados.peek().addComplejo(result);}
                                }
        yysv[yysp-=2] = yyrv;
        return 27;
    }

    private int yyr123() { // void_proc1 : GIRADERECHA float_number
        {ArrayList<Object> argumentos = new ArrayList<Object>();
                                  argumentos.add(((Float)yysv[yysp-1]));
                                  jsonAction result = new jsonAction("avanza",1,(ArrayList<Object>)argumentos);
                                  if(anidados.empty()){yyrv = result;}
                                  else{anidados.peek().addComplejo(result);}
                                  }
        yysv[yysp-=2] = yyrv;
        return 27;
    }

    private int yyr124() { // void_proc1 : GD int_number
        {ArrayList<Object> argumentos = new ArrayList<Object>();
                                argumentos.add(((Integer)yysv[yysp-1]));
                                jsonAction result = new jsonAction("avanza",1,(ArrayList<Object>)argumentos);
                                if(anidados.empty()){yyrv = result;}
                                else{anidados.peek().addComplejo(result);}
                                }
        yysv[yysp-=2] = yyrv;
        return 27;
    }

    private int yyr125() { // void_proc1 : GD float_number
        {ArrayList<Object> argumentos = new ArrayList<Object>();
                                  argumentos.add(((Float)yysv[yysp-1]));
                                  jsonAction result = new jsonAction("avanza",1,(ArrayList<Object>)argumentos);
                                  if(anidados.empty()){yyrv = result;}
                                  else{anidados.peek().addComplejo(result);}
                                  }
        yysv[yysp-=2] = yyrv;
        return 27;
    }

    private int yyr126() { // void_proc1 : GIRAIZQUIERDA int_number
        {ArrayList<Object> argumentos = new ArrayList<Object>();
                                argumentos.add(((Integer)yysv[yysp-1]));
                                jsonAction result = new jsonAction("avanza",1,(ArrayList<Object>)argumentos);
                                if(anidados.empty()){yyrv = result;}
                                else{anidados.peek().addComplejo(result);}
                                }
        yysv[yysp-=2] = yyrv;
        return 27;
    }

    private int yyr127() { // void_proc1 : GIRAIZQUIERDA float_number
        {ArrayList<Object> argumentos = new ArrayList<Object>();
                                  argumentos.add(((Float)yysv[yysp-1]));
                                  jsonAction result = new jsonAction("avanza",1,(ArrayList<Object>)argumentos);
                                  if(anidados.empty()){yyrv = result;}
                                  else{anidados.peek().addComplejo(result);}
                                  }
        yysv[yysp-=2] = yyrv;
        return 27;
    }

    private int yyr128() { // void_proc1 : GI int_number
        {ArrayList<Object> argumentos = new ArrayList<Object>();
                                argumentos.add(((Integer)yysv[yysp-1]));
                                jsonAction result = new jsonAction("avanza",1,(ArrayList<Object>)argumentos);
                                if(anidados.empty()){yyrv = result;}
                                else{anidados.peek().addComplejo(result);}
                                }
        yysv[yysp-=2] = yyrv;
        return 27;
    }

    private int yyr129() { // void_proc1 : GI float_number
        {ArrayList<Object> argumentos = new ArrayList<Object>();
                                  argumentos.add(((Float)yysv[yysp-1]));
                                  jsonAction result = new jsonAction("avanza",1,(ArrayList<Object>)argumentos);
                                  if(anidados.empty()){yyrv = result;}
                                  else{anidados.peek().addComplejo(result);}
                                  }
        yysv[yysp-=2] = yyrv;
        return 27;
    }

    private int yyr130() { // void_proc1 : PONRUMBO int_number
        {ArrayList<Object> argumentos = new ArrayList<Object>();
                                argumentos.add(((Integer)yysv[yysp-1]));
                                jsonAction result = new jsonAction("avanza",1,(ArrayList<Object>)argumentos);
                                if(anidados.empty()){yyrv = result;}
                                else{anidados.peek().addComplejo(result);}

                                variables.replace("rumbo",(Integer)((Integer)yysv[yysp-1]));}
        yysv[yysp-=2] = yyrv;
        return 27;
    }

    private int yyr131() { // void_proc1 : PONRUMBO float_number
        {ArrayList<Object> argumentos = new ArrayList<Object>();
                                  argumentos.add(((Float)yysv[yysp-1]));
                                  jsonAction result = new jsonAction("avanza",1,(ArrayList<Object>)argumentos);
                                  if(anidados.empty()){yyrv = result;}
                                  else{anidados.peek().addComplejo(result);}
                                  variables.replace("rumbo",((Float)yysv[yysp-1]));}
        yysv[yysp-=2] = yyrv;
        return 27;
    }

    private int yyr132() { // void_proc1 : PONX int_number
        {ArrayList<Object> argumentos = new ArrayList<Object>();
                                argumentos.add(((Integer)yysv[yysp-1]));
                                jsonAction result = new jsonAction("avanza",1,(ArrayList<Object>)argumentos);
                                if(anidados.empty()){yyrv = result;}
                                else{anidados.peek().addComplejo(result);}
                                variables.replace("x",(Integer)((Integer)yysv[yysp-1]));}
        yysv[yysp-=2] = yyrv;
        return 27;
    }

    private int yyr133() { // void_proc1 : PONY int_number
        {ArrayList<Object> argumentos = new ArrayList<Object>();
                                argumentos.add(((Integer)yysv[yysp-1]));
                                jsonAction result = new jsonAction("avanza",1,(ArrayList<Object>)argumentos);
                                if(anidados.empty()){yyrv = result;}
                                else{anidados.peek().addComplejo(result);}
                                variables.replace("y",((Integer)yysv[yysp-1]));}
        yysv[yysp-=2] = yyrv;
        return 27;
    }

    private int yyr134() { // void_proc1 : PONCOLORLAPIZ color
        {ArrayList<Object> argumentos = new ArrayList<Object>();
                           argumentos.add(((String)yysv[yysp-1]));
                           jsonAction result = new jsonAction("avanza",1,(ArrayList<Object>)argumentos);
                           if(anidados.empty()){yyrv = result;}
                           else{anidados.peek().addComplejo(result);}
                           variables.replace("colorlapiz",((String)yysv[yysp-1]));}
        yysv[yysp-=2] = yyrv;
        return 27;
    }

    private int yyr135() { // void_proc1 : PONCL color
        {ArrayList<Object> argumentos = new ArrayList<Object>();
                           argumentos.add(((String)yysv[yysp-1]));
                           jsonAction result = new jsonAction("avanza",1,(ArrayList<Object>)argumentos);
                           if(anidados.empty()){yyrv = result;}
                           else{anidados.peek().addComplejo(result);}
                           variables.replace("colorlapiz",((String)yysv[yysp-1]));}
        yysv[yysp-=2] = yyrv;
        return 27;
    }

    private int yyr136() { // void_proc1 : ESPERA int_number
        {ArrayList<Object> argumentos = new ArrayList<Object>();
                                argumentos.add(((Integer)yysv[yysp-1]));
                                jsonAction result = new jsonAction("avanza",1,(ArrayList<Object>)argumentos);
                                if(anidados.empty()){yyrv = result;}
                                else{anidados.peek().addComplejo(result);}}
        yysv[yysp-=2] = yyrv;
        return 27;
    }

    private int yyr137() { // void_proc1 : ESPERA float_number
        {ArrayList<Object> argumentos = new ArrayList<Object>();
                                  argumentos.add(((Float)yysv[yysp-1]));
                                  jsonAction result = new jsonAction("avanza",1,(ArrayList<Object>)argumentos);
                                  if(anidados.empty()){yyrv = result;}
                                  else{anidados.peek().addComplejo(result);}}
        yysv[yysp-=2] = yyrv;
        return 27;
    }

    private int yyr161() { // void_proc2 : PONXY int_number int_number
        {ArrayList<Object> argumentos = new ArrayList<Object>();
                                   argumentos.add(((Integer)yysv[yysp-2]));
                                   argumentos.add(((Integer)yysv[yysp-1]));
                                   jsonAction result = new jsonAction("ponxy",1,(ArrayList<Object>)argumentos);
                                   if(anidados.empty()){yyrv = result;}
                                   else{anidados.peek().addComplejo(result);}
                                   //TODO: Cambiar estas variables globales de ser posible
                                   variables.replace("x",((Integer)yysv[yysp-2]));
                                   variables.replace("y",((Integer)yysv[yysp-1]));}
        yysv[yysp-=3] = yyrv;
        return 28;
    }

    private int yyr191() { // void_proc_1p : proc_head '[' expr_procs_n ']'
        {jsonAction result = anidados.pop();
                                      if(anidados.empty()){yyrv = result;}
                                      else{anidados.peek().addComplejo(result);}}
        yysv[yysp-=4] = yyrv;
        return 29;
    }

    private int yyr184() { // void_proc_p : INC '[' IDENTIFIER ']'
        {variables.replace(((String)yysv[yysp-2]), (Integer)variables.get(((String)yysv[yysp-2]))+1);}
        yysv[yysp-=4] = yyrv;
        return 30;
    }

    private int yyr185() { // void_proc_p : INC '[' IDENTIFIER int_number ']'
        {variables.replace(((String)yysv[yysp-3]), (Integer)variables.get(((String)yysv[yysp-3]))+((Integer)yysv[yysp-2]));}
        yysv[yysp-=5] = yyrv;
        return 30;
    }

    private int yyr186() { // void_proc_p : INC '[' IDENTIFIER float_number ']'
        {variables.replace(((String)yysv[yysp-3]), (Float)variables.get(((String)yysv[yysp-3]))+((Float)yysv[yysp-2]));}
        yysv[yysp-=5] = yyrv;
        return 30;
    }

    private int yyr187() { // void_proc_p : PONPOS '[' int_number int_number ']'
        {ArrayList<Object> argumentos = new ArrayList<Object>();
                                               argumentos.add(yysv[yysp-4]);
                                               argumentos.add(((Integer)yysv[yysp-3]));
                                               yyrv = new jsonAction("espera",1,(ArrayList<Object>)argumentos);
                                               variables.replace("x",((Integer)yysv[yysp-3]));
                                               variables.replace("y",((Integer)yysv[yysp-2]));}
        yysv[yysp-=5] = yyrv;
        return 30;
    }

    private int yyr188() { // void_proc_p : proc_head '[' expr_procs_n ']'
        {jsonAction result = anidados.pop();
                                                                           if(anidados.empty()){yyrv = result;}
                                                                           else{anidados.peek().addComplejo(result);}}
        yysv[yysp-=4] = yyrv;
        return 30;
    }

    protected String[] yyerrmsgs = {
    };


    public Lexer lexer;
    
    public VariableHandler varHandler;
    public ProcedureHandler procHandler;
    public ArrayList<String> procParameters; //Para almacenar par??metros de un procedimiento temporalmente
    public ArrayList<String> procInstructions; //Para almacenar instrucciones de un procedimineto temporalmente

        private ArrayList<jsonAction> acciones; // Aqui se guardan las acciones definitivas a ejecutar en la interfaz, TODO: Guardar una version en texto plano de este array list en un documento
        private Stack<jsonAction> anidados; // Stack para manejar procesos anidados
        private HashMap<String, Object> variables; // Aqui se guardan las variables en tiempo de compilacion

        // Variables para la ejecucion de procedimientos con n params
        private Stack<ArrayList<Object>> n_params; // Aqui se guardan los parametros de los procedimientos que tienen multiples parametros
        private String proc; // Procedimiento a ejecutar

    public void yyerror(String msg) {
        int lastToken = lexer.getCurrentToken(); //Para verificar si se lleg?? al final de l??nea.
        if (lastToken == 0) {
            parseFinished();
            return;
        }

        System.out.println(msg);
        System.out.println("En " + lexer.getSemantic() + ", l??nea " + (lexer.getCurrentLine() + 1) + ". columna " + (lexer.getCurrentColumn() + 1));
    }

    public Parser(String ruta) {
        anidados = new Stack<jsonAction>();
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
     * Funci??n para mostrar un mensaje del compilador en la interfaz.
     */
    public void showMessage(String msg, MessageType type) {
        //TODO: mostrar mensaje del tipo correspondiente en la interfaz.
    }

    public void parseFinished() {
        System.out.println("Compilaci??n finalizada correctamente.");
        //TODO: notificar interfaz que finaliz?? la compilaci??n.

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
