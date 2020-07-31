// Output created by jacc on Thu Jul 30 23:12:54 CST 2020

package Compiler.Jacc;

import Compiler.Helpers.*;
import Compiler.Lex.Lexer;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Arrays;


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
                case 362:
                    yyn = yys0();
                    continue;

                case 1:
                    yyst[yysp] = 1;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 363:
                    switch (yytok) {
                        case ENDINPUT:
                            yyn = 724;
                            continue;
                    }
                    yyn = 727;
                    continue;

                case 2:
                    yyst[yysp] = 2;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 364:
                    yyn = yys2();
                    continue;

                case 3:
                    yyst[yysp] = 3;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 365:
                    switch (yytok) {
                        case ';':
                            yyn = 69;
                            continue;
                    }
                    yyn = 727;
                    continue;

                case 4:
                    yyst[yysp] = 4;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 366:
                    yyn = yys4();
                    continue;

                case 5:
                    yyst[yysp] = 5;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 367:
                    yyn = yys5();
                    continue;

                case 6:
                    yyst[yysp] = 6;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 368:
                    yyn = yys6();
                    continue;

                case 7:
                    yyst[yysp] = 7;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 369:
                    yyn = yys7();
                    continue;

                case 8:
                    yyst[yysp] = 8;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 370:
                    yyn = yys8();
                    continue;

                case 9:
                    yyst[yysp] = 9;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 371:
                    yyn = yys9();
                    continue;

                case 10:
                    yyst[yysp] = 10;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 372:
                    switch (yytok) {
                        case ENDINPUT:
                            yyn = yyr1();
                            continue;
                    }
                    yyn = 727;
                    continue;

                case 11:
                    yyst[yysp] = 11;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 373:
                    yyn = yys11();
                    continue;

                case 12:
                    yyst[yysp] = 12;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 374:
                    yyn = yys12();
                    continue;

                case 13:
                    yyst[yysp] = 13;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 375:
                    yyn = yys13();
                    continue;

                case 14:
                    yyst[yysp] = 14;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 376:
                    yyn = yys14();
                    continue;

                case 15:
                    yyst[yysp] = 15;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 377:
                    yyn = yys15();
                    continue;

                case 16:
                    yyst[yysp] = 16;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 378:
                    yyn = yys16();
                    continue;

                case 17:
                    yyst[yysp] = 17;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.getNextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 379:
                    yyn = yys17();
                    continue;

                case 18:
                    yyst[yysp] = 18;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.getNextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 380:
                    yyn = yys18();
                    continue;

                case 19:
                    yyst[yysp] = 19;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.getNextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 381:
                    switch (yytok) {
                        case IDENTIFIER:
                            yyn = 75;
                            continue;
                        case INTEGER:
                            yyn = 76;
                            continue;
                        case '(':
                            yyn = 77;
                            continue;
                    }
                    yyn = 727;
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
                case 382:
                    switch (yytok) {
                        case IDENTIFIER:
                            yyn = 75;
                            continue;
                        case INTEGER:
                            yyn = 76;
                            continue;
                        case '(':
                            yyn = 77;
                            continue;
                    }
                    yyn = 727;
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
                case 383:
                    switch (yytok) {
                        case IDENTIFIER:
                            yyn = 75;
                            continue;
                        case INTEGER:
                            yyn = 76;
                            continue;
                        case FLOAT:
                            yyn = 87;
                            continue;
                        case '(':
                            yyn = 88;
                            continue;
                    }
                    yyn = 727;
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
                case 384:
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
                case 385:
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
                case 386:
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
                case 387:
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
                case 388:
                    switch (yytok) {
                        case IDENTIFIER:
                            yyn = 75;
                            continue;
                        case INTEGER:
                            yyn = 76;
                            continue;
                        case FLOAT:
                            yyn = 87;
                            continue;
                        case '(':
                            yyn = 92;
                            continue;
                    }
                    yyn = 727;
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
                case 389:
                    switch (yytok) {
                        case '[':
                            yyn = 93;
                            continue;
                    }
                    yyn = 727;
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
                case 390:
                    switch (yytok) {
                        case IDENTIFIER:
                            yyn = 75;
                            continue;
                        case INTEGER:
                            yyn = 76;
                            continue;
                        case FLOAT:
                            yyn = 87;
                            continue;
                        case '(':
                            yyn = 92;
                            continue;
                    }
                    yyn = 727;
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
                case 391:
                    switch (yytok) {
                        case IDENTIFIER:
                            yyn = 75;
                            continue;
                        case INTEGER:
                            yyn = 76;
                            continue;
                        case FLOAT:
                            yyn = 87;
                            continue;
                        case '(':
                            yyn = 92;
                            continue;
                    }
                    yyn = 727;
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
                case 392:
                    switch (yytok) {
                        case '[':
                            yyn = 101;
                            continue;
                    }
                    yyn = 727;
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
                case 393:
                    switch (yytok) {
                        case IDENTIFIER:
                            yyn = 75;
                            continue;
                        case INTEGER:
                            yyn = 76;
                            continue;
                        case '(':
                            yyn = 77;
                            continue;
                    }
                    yyn = 727;
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
                case 394:
                    switch (yytok) {
                        case IDENTIFIER:
                            yyn = 75;
                            continue;
                        case INTEGER:
                            yyn = 76;
                            continue;
                        case FLOAT:
                            yyn = 87;
                            continue;
                        case '(':
                            yyn = 92;
                            continue;
                    }
                    yyn = 727;
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
                case 395:
                    switch (yytok) {
                        case IDENTIFIER:
                            yyn = 75;
                            continue;
                        case INTEGER:
                            yyn = 76;
                            continue;
                        case FLOAT:
                            yyn = 87;
                            continue;
                        case '(':
                            yyn = 92;
                            continue;
                    }
                    yyn = 727;
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
                case 396:
                    switch (yytok) {
                        case IDENTIFIER:
                            yyn = 75;
                            continue;
                        case INTEGER:
                            yyn = 76;
                            continue;
                        case FLOAT:
                            yyn = 87;
                            continue;
                        case '(':
                            yyn = 92;
                            continue;
                    }
                    yyn = 727;
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
                case 397:
                    switch (yytok) {
                        case IDENTIFIER:
                            yyn = 75;
                            continue;
                        case INTEGER:
                            yyn = 76;
                            continue;
                        case FLOAT:
                            yyn = 87;
                            continue;
                        case '(':
                            yyn = 92;
                            continue;
                    }
                    yyn = 727;
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
                case 398:
                    switch (yytok) {
                        case IDENTIFIER:
                            yyn = 75;
                            continue;
                        case INTEGER:
                            yyn = 76;
                            continue;
                        case FLOAT:
                            yyn = 87;
                            continue;
                        case '(':
                            yyn = 92;
                            continue;
                    }
                    yyn = 727;
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
                case 399:
                    switch (yytok) {
                        case '[':
                            yyn = 108;
                            continue;
                    }
                    yyn = 727;
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
                case 400:
                    switch (yytok) {
                        case IDENTIFIER:
                            yyn = 109;
                            continue;
                    }
                    yyn = 727;
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
                case 401:
                    switch (yytok) {
                        case IDENTIFIER:
                            yyn = 75;
                            continue;
                        case INTEGER:
                            yyn = 76;
                            continue;
                        case FLOAT:
                            yyn = 87;
                            continue;
                        case '(':
                            yyn = 88;
                            continue;
                    }
                    yyn = 727;
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
                case 402:
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
                case 403:
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
                case 404:
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
                case 405:
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
                case 406:
                    switch (yytok) {
                        case '[':
                            yyn = 123;
                            continue;
                    }
                    yyn = 727;
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
                case 407:
                    switch (yytok) {
                        case IDENTIFIER:
                            yyn = 75;
                            continue;
                        case INTEGER:
                            yyn = 76;
                            continue;
                        case FLOAT:
                            yyn = 87;
                            continue;
                        case '(':
                            yyn = 92;
                            continue;
                    }
                    yyn = 727;
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
                case 408:
                    switch (yytok) {
                        case IDENTIFIER:
                            yyn = 75;
                            continue;
                        case INTEGER:
                            yyn = 76;
                            continue;
                        case FLOAT:
                            yyn = 87;
                            continue;
                        case '(':
                            yyn = 92;
                            continue;
                    }
                    yyn = 727;
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
                case 409:
                    switch (yytok) {
                        case IDENTIFIER:
                            yyn = 75;
                            continue;
                        case INTEGER:
                            yyn = 76;
                            continue;
                        case '(':
                            yyn = 77;
                            continue;
                    }
                    yyn = 727;
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
                case 410:
                    switch (yytok) {
                        case IDENTIFIER:
                            yyn = 75;
                            continue;
                        case INTEGER:
                            yyn = 76;
                            continue;
                        case FLOAT:
                            yyn = 87;
                            continue;
                        case '(':
                            yyn = 92;
                            continue;
                    }
                    yyn = 727;
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
                case 411:
                    switch (yytok) {
                        case IDENTIFIER:
                            yyn = 75;
                            continue;
                        case INTEGER:
                            yyn = 76;
                            continue;
                        case FLOAT:
                            yyn = 87;
                            continue;
                        case '(':
                            yyn = 92;
                            continue;
                    }
                    yyn = 727;
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
                case 412:
                    switch (yytok) {
                        case '[':
                            yyn = 131;
                            continue;
                    }
                    yyn = 727;
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
                case 413:
                    switch (yytok) {
                        case IDENTIFIER:
                            yyn = 75;
                            continue;
                        case INTEGER:
                            yyn = 76;
                            continue;
                        case FLOAT:
                            yyn = 87;
                            continue;
                        case '(':
                            yyn = 92;
                            continue;
                    }
                    yyn = 727;
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
                case 414:
                    switch (yytok) {
                        case IDENTIFIER:
                            yyn = 75;
                            continue;
                        case INTEGER:
                            yyn = 76;
                            continue;
                        case FLOAT:
                            yyn = 87;
                            continue;
                        case '(':
                            yyn = 92;
                            continue;
                    }
                    yyn = 727;
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
                case 415:
                    switch (yytok) {
                        case IDENTIFIER:
                            yyn = 75;
                            continue;
                        case INTEGER:
                            yyn = 76;
                            continue;
                        case FLOAT:
                            yyn = 87;
                            continue;
                        case '(':
                            yyn = 92;
                            continue;
                    }
                    yyn = 727;
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
                case 416:
                    switch (yytok) {
                        case IDENTIFIER:
                            yyn = 75;
                            continue;
                        case INTEGER:
                            yyn = 76;
                            continue;
                        case '(':
                            yyn = 77;
                            continue;
                    }
                    yyn = 727;
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
                case 417:
                    switch (yytok) {
                        case IDENTIFIER:
                            yyn = 75;
                            continue;
                        case INTEGER:
                            yyn = 76;
                            continue;
                        case FLOAT:
                            yyn = 87;
                            continue;
                        case '(':
                            yyn = 141;
                            continue;
                    }
                    yyn = 727;
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
                case 418:
                    switch (yytok) {
                        case IDENTIFIER:
                            yyn = 75;
                            continue;
                        case INTEGER:
                            yyn = 76;
                            continue;
                        case '(':
                            yyn = 77;
                            continue;
                    }
                    yyn = 727;
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
                case 419:
                    switch (yytok) {
                        case IDENTIFIER:
                            yyn = 75;
                            continue;
                        case INTEGER:
                            yyn = 76;
                            continue;
                        case '(':
                            yyn = 77;
                            continue;
                    }
                    yyn = 727;
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
                case 420:
                    switch (yytok) {
                        case IDENTIFIER:
                            yyn = 75;
                            continue;
                        case INTEGER:
                            yyn = 76;
                            continue;
                        case '(':
                            yyn = 77;
                            continue;
                    }
                    yyn = 727;
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
                case 421:
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
                case 422:
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
                case 423:
                    switch (yytok) {
                        case IDENTIFIER:
                            yyn = 75;
                            continue;
                        case INTEGER:
                            yyn = 76;
                            continue;
                        case FLOAT:
                            yyn = 87;
                            continue;
                        case '(':
                            yyn = 92;
                            continue;
                    }
                    yyn = 727;
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
                case 424:
                    switch (yytok) {
                        case IDENTIFIER:
                            yyn = 75;
                            continue;
                        case INTEGER:
                            yyn = 76;
                            continue;
                        case FLOAT:
                            yyn = 87;
                            continue;
                        case '(':
                            yyn = 92;
                            continue;
                    }
                    yyn = 727;
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
                case 425:
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
                case 426:
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
                case 427:
                    switch (yytok) {
                        case IDENTIFIER:
                            yyn = 75;
                            continue;
                        case INTEGER:
                            yyn = 76;
                            continue;
                        case FLOAT:
                            yyn = 87;
                            continue;
                        case '(':
                            yyn = 92;
                            continue;
                    }
                    yyn = 727;
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
                case 428:
                    switch (yytok) {
                        case '[':
                            yyn = 159;
                            continue;
                    }
                    yyn = 727;
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
                case 429:
                    switch (yytok) {
                        case '[':
                            yyn = 160;
                            continue;
                    }
                    yyn = 727;
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
                case 430:
                    switch (yytok) {
                        case IDENTIFIER:
                            yyn = 161;
                            continue;
                    }
                    yyn = 727;
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
                case 431:
                    yyn = yys69();
                    continue;

                case 70:
                    yyst[yysp] = 70;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 432:
                    yyn = yys70();
                    continue;

                case 71:
                    yyst[yysp] = 71;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 433:
                    yyn = yys71();
                    continue;

                case 72:
                    yyst[yysp] = 72;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 434:
                    yyn = yys72();
                    continue;

                case 73:
                    yyst[yysp] = 73;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 435:
                    yyn = yys73();
                    continue;

                case 74:
                    yyst[yysp] = 74;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 436:
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
                case 437:
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
                case 438:
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
                case 439:
                    switch (yytok) {
                        case IDENTIFIER:
                            yyn = 75;
                            continue;
                        case INTEGER:
                            yyn = 76;
                            continue;
                        case '(':
                            yyn = 77;
                            continue;
                    }
                    yyn = 727;
                    continue;

                case 78:
                    yyst[yysp] = 78;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 440:
                    yyn = yys78();
                    continue;

                case 79:
                    yyst[yysp] = 79;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 441:
                    yyn = yys79();
                    continue;

                case 80:
                    yyst[yysp] = 80;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 442:
                    yyn = yys80();
                    continue;

                case 81:
                    yyst[yysp] = 81;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 443:
                    yyn = yys81();
                    continue;

                case 82:
                    yyst[yysp] = 82;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 444:
                    yyn = yys82();
                    continue;

                case 83:
                    yyst[yysp] = 83;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 445:
                    yyn = yys83();
                    continue;

                case 84:
                    yyst[yysp] = 84;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 446:
                    yyn = yys84();
                    continue;

                case 85:
                    yyst[yysp] = 85;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 447:
                    yyn = yys85();
                    continue;

                case 86:
                    yyst[yysp] = 86;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 448:
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
                case 449:
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
                case 450:
                    switch (yytok) {
                        case IDENTIFIER:
                            yyn = 75;
                            continue;
                        case INTEGER:
                            yyn = 76;
                            continue;
                        case FLOAT:
                            yyn = 87;
                            continue;
                        case '(':
                            yyn = 88;
                            continue;
                    }
                    yyn = 727;
                    continue;

                case 89:
                    yyst[yysp] = 89;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 451:
                    yyn = yys89();
                    continue;

                case 90:
                    yyst[yysp] = 90;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 452:
                    yyn = yys90();
                    continue;

                case 91:
                    yyst[yysp] = 91;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 453:
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
                case 454:
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
                case 455:
                    switch (yytok) {
                        case IDENTIFIER:
                            yyn = 75;
                            continue;
                        case INTEGER:
                            yyn = 76;
                            continue;
                        case FLOAT:
                            yyn = 87;
                            continue;
                        case '(':
                            yyn = 92;
                            continue;
                    }
                    yyn = 727;
                    continue;

                case 94:
                    yyst[yysp] = 94;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 456:
                    yyn = yys94();
                    continue;

                case 95:
                    yyst[yysp] = 95;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 457:
                    yyn = yys95();
                    continue;

                case 96:
                    yyst[yysp] = 96;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 458:
                    yyn = yys96();
                    continue;

                case 97:
                    yyst[yysp] = 97;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 459:
                    yyn = yys97();
                    continue;

                case 98:
                    yyst[yysp] = 98;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 460:
                    yyn = yys98();
                    continue;

                case 99:
                    yyst[yysp] = 99;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 461:
                    yyn = yys99();
                    continue;

                case 100:
                    yyst[yysp] = 100;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 462:
                    switch (yytok) {
                        case IDENTIFIER:
                            yyn = 75;
                            continue;
                        case INTEGER:
                            yyn = 76;
                            continue;
                        case FLOAT:
                            yyn = 87;
                            continue;
                        case '(':
                            yyn = 92;
                            continue;
                    }
                    yyn = 727;
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
                case 463:
                    switch (yytok) {
                        case IDENTIFIER:
                            yyn = 75;
                            continue;
                        case INTEGER:
                            yyn = 76;
                            continue;
                        case FLOAT:
                            yyn = 87;
                            continue;
                        case '(':
                            yyn = 88;
                            continue;
                    }
                    yyn = 727;
                    continue;

                case 102:
                    yyst[yysp] = 102;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 464:
                    switch (yytok) {
                        case '[':
                            yyn = 218;
                            continue;
                    }
                    yyn = 727;
                    continue;

                case 103:
                    yyst[yysp] = 103;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 465:
                    yyn = yys103();
                    continue;

                case 104:
                    yyst[yysp] = 104;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 466:
                    yyn = yys104();
                    continue;

                case 105:
                    yyst[yysp] = 105;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 467:
                    yyn = yys105();
                    continue;

                case 106:
                    yyst[yysp] = 106;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 468:
                    yyn = yys106();
                    continue;

                case 107:
                    yyst[yysp] = 107;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 469:
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
                case 470:
                    switch (yytok) {
                        case IDENTIFIER:
                            yyn = 75;
                            continue;
                    }
                    yyn = 727;
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
                case 471:
                    switch (yytok) {
                        case '=':
                            yyn = 220;
                            continue;
                    }
                    yyn = 727;
                    continue;

                case 110:
                    yyst[yysp] = 110;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 472:
                    yyn = yys110();
                    continue;

                case 111:
                    yyst[yysp] = 111;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 473:
                    yyn = yys111();
                    continue;

                case 112:
                    yyst[yysp] = 112;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 474:
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
                case 475:
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
                case 476:
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
                case 477:
                    yyn = yys115();
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
                case 478:
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
                case 479:
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
                case 480:
                    yyn = yys118();
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
                case 481:
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
                case 482:
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
                case 483:
                    yyn = yys121();
                    continue;

                case 122:
                    yyst[yysp] = 122;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 484:
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
                case 485:
                    switch (yytok) {
                        case IDENTIFIER:
                            yyn = 75;
                            continue;
                        case INTEGER:
                            yyn = 76;
                            continue;
                        case '(':
                            yyn = 77;
                            continue;
                    }
                    yyn = 727;
                    continue;

                case 124:
                    yyst[yysp] = 124;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 486:
                    yyn = yys124();
                    continue;

                case 125:
                    yyst[yysp] = 125;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 487:
                    yyn = yys125();
                    continue;

                case 126:
                    yyst[yysp] = 126;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 488:
                    switch (yytok) {
                        case IDENTIFIER:
                            yyn = 75;
                            continue;
                        case INTEGER:
                            yyn = 76;
                            continue;
                        case '(':
                            yyn = 77;
                            continue;
                    }
                    yyn = 727;
                    continue;

                case 127:
                    yyst[yysp] = 127;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 489:
                    yyn = yys127();
                    continue;

                case 128:
                    yyst[yysp] = 128;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 490:
                    switch (yytok) {
                        case IDENTIFIER:
                            yyn = 75;
                            continue;
                        case INTEGER:
                            yyn = 76;
                            continue;
                        case '(':
                            yyn = 77;
                            continue;
                        case FLOAT:
                            yyn = yyr108();
                            continue;
                    }
                    yyn = 727;
                    continue;

                case 129:
                    yyst[yysp] = 129;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 491:
                    switch (yytok) {
                        case IDENTIFIER:
                            yyn = 75;
                            continue;
                        case INTEGER:
                            yyn = 76;
                            continue;
                        case '(':
                            yyn = 77;
                            continue;
                        case FLOAT:
                            yyn = yyr107();
                            continue;
                    }
                    yyn = 727;
                    continue;

                case 130:
                    yyst[yysp] = 130;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 492:
                    switch (yytok) {
                        case IDENTIFIER:
                            yyn = 75;
                            continue;
                        case INTEGER:
                            yyn = 76;
                            continue;
                        case FLOAT:
                            yyn = 87;
                            continue;
                        case '(':
                            yyn = 141;
                            continue;
                    }
                    yyn = 727;
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
                case 493:
                    switch (yytok) {
                        case IDENTIFIER:
                            yyn = 75;
                            continue;
                        case INTEGER:
                            yyn = 76;
                            continue;
                        case FLOAT:
                            yyn = 87;
                            continue;
                        case '(':
                            yyn = 88;
                            continue;
                    }
                    yyn = 727;
                    continue;

                case 132:
                    yyst[yysp] = 132;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 494:
                    yyn = yys132();
                    continue;

                case 133:
                    yyst[yysp] = 133;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 495:
                    yyn = yys133();
                    continue;

                case 134:
                    yyst[yysp] = 134;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 496:
                    yyn = yys134();
                    continue;

                case 135:
                    yyst[yysp] = 135;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 497:
                    yyn = yys135();
                    continue;

                case 136:
                    yyst[yysp] = 136;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 498:
                    yyn = yys136();
                    continue;

                case 137:
                    yyst[yysp] = 137;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 499:
                    yyn = yys137();
                    continue;

                case 138:
                    yyst[yysp] = 138;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 500:
                    yyn = yys138();
                    continue;

                case 139:
                    yyst[yysp] = 139;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 501:
                    switch (yytok) {
                        case '*':
                            yyn = 228;
                            continue;
                        case '+':
                            yyn = 229;
                            continue;
                        case '-':
                            yyn = 230;
                            continue;
                        case '/':
                            yyn = 231;
                            continue;
                    }
                    yyn = 727;
                    continue;

                case 140:
                    yyst[yysp] = 140;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 502:
                    yyn = yys140();
                    continue;

                case 141:
                    yyst[yysp] = 141;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.getNextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 503:
                    switch (yytok) {
                        case IDENTIFIER:
                            yyn = 75;
                            continue;
                        case INTEGER:
                            yyn = 76;
                            continue;
                        case FLOAT:
                            yyn = 87;
                            continue;
                        case '(':
                            yyn = 141;
                            continue;
                    }
                    yyn = 727;
                    continue;

                case 142:
                    yyst[yysp] = 142;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 504:
                    switch (yytok) {
                        case '[':
                            yyn = 232;
                            continue;
                    }
                    yyn = 727;
                    continue;

                case 143:
                    yyst[yysp] = 143;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 505:
                    switch (yytok) {
                        case IDENTIFIER:
                            yyn = 75;
                            continue;
                        case INTEGER:
                            yyn = 76;
                            continue;
                        case '(':
                            yyn = 77;
                            continue;
                    }
                    yyn = 727;
                    continue;

                case 144:
                    yyst[yysp] = 144;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 506:
                    yyn = yys144();
                    continue;

                case 145:
                    yyst[yysp] = 145;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 507:
                    yyn = yys145();
                    continue;

                case 146:
                    yyst[yysp] = 146;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 508:
                    yyn = yys146();
                    continue;

                case 147:
                    yyst[yysp] = 147;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 509:
                    switch (yytok) {
                        case '[':
                            yyn = 234;
                            continue;
                    }
                    yyn = 727;
                    continue;

                case 148:
                    yyst[yysp] = 148;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 510:
                    yyn = yys148();
                    continue;

                case 149:
                    yyst[yysp] = 149;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 511:
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
                case 512:
                    switch (yytok) {
                        case INTEGER:
                            yyn = 76;
                            continue;
                        case FLOAT:
                            yyn = 87;
                            continue;
                        case '(':
                            yyn = 155;
                            continue;
                    }
                    yyn = 727;
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
                case 513:
                    switch (yytok) {
                        case INTEGER:
                            yyn = 76;
                            continue;
                        case FLOAT:
                            yyn = 87;
                            continue;
                        case '(':
                            yyn = 155;
                            continue;
                    }
                    yyn = 727;
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
                case 514:
                    switch (yytok) {
                        case INTEGER:
                            yyn = 76;
                            continue;
                        case FLOAT:
                            yyn = 87;
                            continue;
                        case '(':
                            yyn = 155;
                            continue;
                    }
                    yyn = 727;
                    continue;

                case 153:
                    yyst[yysp] = 153;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.getNextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 515:
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
                case 516:
                    yyn = yys154();
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
                case 517:
                    switch (yytok) {
                        case INTEGER:
                            yyn = 76;
                            continue;
                        case FLOAT:
                            yyn = 87;
                            continue;
                        case '(':
                            yyn = 155;
                            continue;
                    }
                    yyn = 727;
                    continue;

                case 156:
                    yyst[yysp] = 156;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 518:
                    yyn = yys156();
                    continue;

                case 157:
                    yyst[yysp] = 157;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 519:
                    yyn = yys157();
                    continue;

                case 158:
                    yyst[yysp] = 158;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 520:
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
                case 521:
                    switch (yytok) {
                        case IDENTIFIER:
                            yyn = 75;
                            continue;
                        case INTEGER:
                            yyn = 76;
                            continue;
                        case FLOAT:
                            yyn = 87;
                            continue;
                        case '(':
                            yyn = 88;
                            continue;
                    }
                    yyn = 727;
                    continue;

                case 160:
                    yyst[yysp] = 160;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.getNextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 522:
                    switch (yytok) {
                        case IDENTIFIER:
                            yyn = 75;
                            continue;
                        case INTEGER:
                            yyn = 76;
                            continue;
                        case FLOAT:
                            yyn = 87;
                            continue;
                        case '(':
                            yyn = 88;
                            continue;
                    }
                    yyn = 727;
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
                case 523:
                    yyn = yys161();
                    continue;

                case 162:
                    yyst[yysp] = 162;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 524:
                    switch (yytok) {
                        case ENDINPUT:
                            yyn = yyr2();
                            continue;
                    }
                    yyn = 727;
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
                case 525:
                    switch (yytok) {
                        case IDENTIFIER:
                            yyn = 75;
                            continue;
                        case INTEGER:
                            yyn = 76;
                            continue;
                        case '(':
                            yyn = 77;
                            continue;
                    }
                    yyn = 727;
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
                case 526:
                    switch (yytok) {
                        case IDENTIFIER:
                            yyn = 75;
                            continue;
                        case INTEGER:
                            yyn = 76;
                            continue;
                        case '(':
                            yyn = 77;
                            continue;
                    }
                    yyn = 727;
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
                case 527:
                    switch (yytok) {
                        case IDENTIFIER:
                            yyn = 75;
                            continue;
                        case INTEGER:
                            yyn = 76;
                            continue;
                        case '(':
                            yyn = 77;
                            continue;
                    }
                    yyn = 727;
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
                case 528:
                    switch (yytok) {
                        case IDENTIFIER:
                            yyn = 75;
                            continue;
                        case INTEGER:
                            yyn = 76;
                            continue;
                        case '(':
                            yyn = 77;
                            continue;
                    }
                    yyn = 727;
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
                case 529:
                    switch (yytok) {
                        case IDENTIFIER:
                            yyn = 75;
                            continue;
                        case INTEGER:
                            yyn = 76;
                            continue;
                        case '(':
                            yyn = 77;
                            continue;
                    }
                    yyn = 727;
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
                case 530:
                    switch (yytok) {
                        case IDENTIFIER:
                            yyn = 75;
                            continue;
                        case INTEGER:
                            yyn = 76;
                            continue;
                        case '(':
                            yyn = 77;
                            continue;
                    }
                    yyn = 727;
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
                case 531:
                    switch (yytok) {
                        case IDENTIFIER:
                            yyn = 75;
                            continue;
                        case INTEGER:
                            yyn = 76;
                            continue;
                        case '(':
                            yyn = 77;
                            continue;
                    }
                    yyn = 727;
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
                case 532:
                    switch (yytok) {
                        case IDENTIFIER:
                            yyn = 75;
                            continue;
                        case INTEGER:
                            yyn = 76;
                            continue;
                        case '(':
                            yyn = 77;
                            continue;
                    }
                    yyn = 727;
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
                case 533:
                    switch (yytok) {
                        case INTEGER:
                            yyn = 76;
                            continue;
                        case '(':
                            yyn = 267;
                            continue;
                    }
                    yyn = 727;
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
                case 534:
                    switch (yytok) {
                        case INTEGER:
                            yyn = 76;
                            continue;
                        case '(':
                            yyn = 267;
                            continue;
                    }
                    yyn = 727;
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
                case 535:
                    switch (yytok) {
                        case INTEGER:
                            yyn = 76;
                            continue;
                        case '(':
                            yyn = 267;
                            continue;
                    }
                    yyn = 727;
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
                case 536:
                    switch (yytok) {
                        case INTEGER:
                            yyn = 76;
                            continue;
                        case '(':
                            yyn = 267;
                            continue;
                    }
                    yyn = 727;
                    continue;

                case 175:
                    yyst[yysp] = 175;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 537:
                    switch (yytok) {
                        case '*':
                            yyn = 163;
                            continue;
                        case '+':
                            yyn = 164;
                            continue;
                        case '-':
                            yyn = 165;
                            continue;
                        case '/':
                            yyn = 166;
                            continue;
                    }
                    yyn = 727;
                    continue;

                case 176:
                    yyst[yysp] = 176;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 538:
                    switch (yytok) {
                        case '*':
                            yyn = 167;
                            continue;
                        case '+':
                            yyn = 168;
                            continue;
                        case '-':
                            yyn = 169;
                            continue;
                        case '/':
                            yyn = 170;
                            continue;
                        case ')':
                            yyn = 271;
                            continue;
                    }
                    yyn = 727;
                    continue;

                case 177:
                    yyst[yysp] = 177;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 539:
                    switch (yytok) {
                        case '*':
                            yyn = 171;
                            continue;
                        case '+':
                            yyn = 172;
                            continue;
                        case '-':
                            yyn = 173;
                            continue;
                        case '/':
                            yyn = 174;
                            continue;
                        case ')':
                            yyn = 272;
                            continue;
                    }
                    yyn = 727;
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
                case 540:
                    switch (yytok) {
                        case IDENTIFIER:
                            yyn = 75;
                            continue;
                        case INTEGER:
                            yyn = 76;
                            continue;
                        case FLOAT:
                            yyn = 87;
                            continue;
                        case '(':
                            yyn = 141;
                            continue;
                    }
                    yyn = 727;
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
                case 541:
                    switch (yytok) {
                        case IDENTIFIER:
                            yyn = 75;
                            continue;
                        case INTEGER:
                            yyn = 76;
                            continue;
                        case FLOAT:
                            yyn = 87;
                            continue;
                        case '(':
                            yyn = 141;
                            continue;
                    }
                    yyn = 727;
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
                case 542:
                    switch (yytok) {
                        case IDENTIFIER:
                            yyn = 75;
                            continue;
                        case INTEGER:
                            yyn = 76;
                            continue;
                        case FLOAT:
                            yyn = 87;
                            continue;
                        case '(':
                            yyn = 141;
                            continue;
                    }
                    yyn = 727;
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
                case 543:
                    switch (yytok) {
                        case IDENTIFIER:
                            yyn = 75;
                            continue;
                        case INTEGER:
                            yyn = 76;
                            continue;
                        case FLOAT:
                            yyn = 87;
                            continue;
                        case '(':
                            yyn = 141;
                            continue;
                    }
                    yyn = 727;
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
                case 544:
                    switch (yytok) {
                        case IDENTIFIER:
                            yyn = 75;
                            continue;
                        case INTEGER:
                            yyn = 76;
                            continue;
                        case FLOAT:
                            yyn = 87;
                            continue;
                        case '(':
                            yyn = 141;
                            continue;
                    }
                    yyn = 727;
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
                case 545:
                    switch (yytok) {
                        case IDENTIFIER:
                            yyn = 75;
                            continue;
                        case INTEGER:
                            yyn = 76;
                            continue;
                        case FLOAT:
                            yyn = 87;
                            continue;
                        case '(':
                            yyn = 141;
                            continue;
                    }
                    yyn = 727;
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
                case 546:
                    switch (yytok) {
                        case IDENTIFIER:
                            yyn = 75;
                            continue;
                        case INTEGER:
                            yyn = 76;
                            continue;
                        case FLOAT:
                            yyn = 87;
                            continue;
                        case '(':
                            yyn = 141;
                            continue;
                    }
                    yyn = 727;
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
                case 547:
                    switch (yytok) {
                        case IDENTIFIER:
                            yyn = 75;
                            continue;
                        case INTEGER:
                            yyn = 76;
                            continue;
                        case FLOAT:
                            yyn = 87;
                            continue;
                        case '(':
                            yyn = 141;
                            continue;
                    }
                    yyn = 727;
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
                case 548:
                    switch (yytok) {
                        case INTEGER:
                            yyn = 76;
                            continue;
                        case FLOAT:
                            yyn = 87;
                            continue;
                        case '(':
                            yyn = 155;
                            continue;
                    }
                    yyn = 727;
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
                case 549:
                    switch (yytok) {
                        case INTEGER:
                            yyn = 76;
                            continue;
                        case FLOAT:
                            yyn = 87;
                            continue;
                        case '(':
                            yyn = 155;
                            continue;
                    }
                    yyn = 727;
                    continue;

                case 188:
                    yyst[yysp] = 188;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.getNextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 550:
                    switch (yytok) {
                        case INTEGER:
                            yyn = 76;
                            continue;
                        case FLOAT:
                            yyn = 87;
                            continue;
                        case '(':
                            yyn = 155;
                            continue;
                    }
                    yyn = 727;
                    continue;

                case 189:
                    yyst[yysp] = 189;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.getNextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 551:
                    switch (yytok) {
                        case INTEGER:
                            yyn = 76;
                            continue;
                        case FLOAT:
                            yyn = 87;
                            continue;
                        case '(':
                            yyn = 155;
                            continue;
                    }
                    yyn = 727;
                    continue;

                case 190:
                    yyst[yysp] = 190;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.getNextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 552:
                    switch (yytok) {
                        case IDENTIFIER:
                            yyn = 75;
                            continue;
                        case INTEGER:
                            yyn = 76;
                            continue;
                        case FLOAT:
                            yyn = 87;
                            continue;
                        case '(':
                            yyn = 88;
                            continue;
                    }
                    yyn = 727;
                    continue;

                case 191:
                    yyst[yysp] = 191;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.getNextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 553:
                    switch (yytok) {
                        case IDENTIFIER:
                            yyn = 75;
                            continue;
                        case INTEGER:
                            yyn = 76;
                            continue;
                        case FLOAT:
                            yyn = 87;
                            continue;
                        case '(':
                            yyn = 88;
                            continue;
                    }
                    yyn = 727;
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
                case 554:
                    switch (yytok) {
                        case IDENTIFIER:
                            yyn = 75;
                            continue;
                        case INTEGER:
                            yyn = 76;
                            continue;
                        case FLOAT:
                            yyn = 87;
                            continue;
                        case '(':
                            yyn = 88;
                            continue;
                    }
                    yyn = 727;
                    continue;

                case 193:
                    yyst[yysp] = 193;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.getNextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 555:
                    switch (yytok) {
                        case IDENTIFIER:
                            yyn = 75;
                            continue;
                        case INTEGER:
                            yyn = 76;
                            continue;
                        case FLOAT:
                            yyn = 87;
                            continue;
                        case '(':
                            yyn = 88;
                            continue;
                    }
                    yyn = 727;
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
                case 556:
                    switch (yytok) {
                        case INTEGER:
                            yyn = 76;
                            continue;
                        case FLOAT:
                            yyn = 87;
                            continue;
                        case '(':
                            yyn = 155;
                            continue;
                    }
                    yyn = 727;
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
                case 557:
                    switch (yytok) {
                        case INTEGER:
                            yyn = 76;
                            continue;
                        case FLOAT:
                            yyn = 87;
                            continue;
                        case '(':
                            yyn = 155;
                            continue;
                    }
                    yyn = 727;
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
                case 558:
                    switch (yytok) {
                        case INTEGER:
                            yyn = 76;
                            continue;
                        case FLOAT:
                            yyn = 87;
                            continue;
                        case '(':
                            yyn = 155;
                            continue;
                    }
                    yyn = 727;
                    continue;

                case 197:
                    yyst[yysp] = 197;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.getNextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 559:
                    switch (yytok) {
                        case INTEGER:
                            yyn = 76;
                            continue;
                        case FLOAT:
                            yyn = 87;
                            continue;
                        case '(':
                            yyn = 155;
                            continue;
                    }
                    yyn = 727;
                    continue;

                case 198:
                    yyst[yysp] = 198;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 560:
                    switch (yytok) {
                        case '*':
                            yyn = 178;
                            continue;
                        case '+':
                            yyn = 179;
                            continue;
                        case '-':
                            yyn = 180;
                            continue;
                        case '/':
                            yyn = 181;
                            continue;
                    }
                    yyn = 727;
                    continue;

                case 199:
                    yyst[yysp] = 199;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 561:
                    switch (yytok) {
                        case '*':
                            yyn = 182;
                            continue;
                        case '+':
                            yyn = 183;
                            continue;
                        case '-':
                            yyn = 184;
                            continue;
                        case '/':
                            yyn = 185;
                            continue;
                        case ')':
                            yyn = 309;
                            continue;
                    }
                    yyn = 727;
                    continue;

                case 200:
                    yyst[yysp] = 200;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 562:
                    switch (yytok) {
                        case '*':
                            yyn = 186;
                            continue;
                        case '+':
                            yyn = 187;
                            continue;
                        case '-':
                            yyn = 188;
                            continue;
                        case '/':
                            yyn = 189;
                            continue;
                        case ')':
                            yyn = 310;
                            continue;
                    }
                    yyn = 727;
                    continue;

                case 201:
                    yyst[yysp] = 201;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 563:
                    switch (yytok) {
                        case '*':
                            yyn = 190;
                            continue;
                        case '+':
                            yyn = 191;
                            continue;
                        case '-':
                            yyn = 192;
                            continue;
                        case '/':
                            yyn = 193;
                            continue;
                    }
                    yyn = 727;
                    continue;

                case 202:
                    yyst[yysp] = 202;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 564:
                    switch (yytok) {
                        case '*':
                            yyn = 194;
                            continue;
                        case '+':
                            yyn = 195;
                            continue;
                        case '-':
                            yyn = 196;
                            continue;
                        case '/':
                            yyn = 197;
                            continue;
                        case ')':
                            yyn = 272;
                            continue;
                    }
                    yyn = 727;
                    continue;

                case 203:
                    yyst[yysp] = 203;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 565:
                    switch (yytok) {
                        case ')':
                            yyn = 311;
                            continue;
                    }
                    yyn = 727;
                    continue;

                case 204:
                    yyst[yysp] = 204;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 566:
                    switch (yytok) {
                        case ')':
                            yyn = yyr102();
                            continue;
                    }
                    yyn = 727;
                    continue;

                case 205:
                    yyst[yysp] = 205;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 567:
                    switch (yytok) {
                        case ')':
                            yyn = yyr103();
                            continue;
                    }
                    yyn = 727;
                    continue;

                case 206:
                    yyst[yysp] = 206;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 568:
                    switch (yytok) {
                        case ')':
                            yyn = yyr105();
                            continue;
                    }
                    yyn = 727;
                    continue;

                case 207:
                    yyst[yysp] = 207;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 569:
                    switch (yytok) {
                        case ')':
                            yyn = yyr106();
                            continue;
                    }
                    yyn = 727;
                    continue;

                case 208:
                    yyst[yysp] = 208;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 570:
                    switch (yytok) {
                        case ')':
                            yyn = yyr104();
                            continue;
                    }
                    yyn = 727;
                    continue;

                case 209:
                    yyst[yysp] = 209;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 571:
                    switch (yytok) {
                        case ']':
                            yyn = 312;
                            continue;
                    }
                    yyn = 727;
                    continue;

                case 210:
                    yyst[yysp] = 210;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 572:
                    yyn = yys210();
                    continue;

                case 211:
                    yyst[yysp] = 211;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 573:
                    yyn = yys211();
                    continue;

                case 212:
                    yyst[yysp] = 212;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 574:
                    yyn = yys212();
                    continue;

                case 213:
                    yyst[yysp] = 213;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 575:
                    yyn = yys213();
                    continue;

                case 214:
                    yyst[yysp] = 214;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 576:
                    yyn = yys214();
                    continue;

                case 215:
                    yyst[yysp] = 215;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 577:
                    yyn = yys215();
                    continue;

                case 216:
                    yyst[yysp] = 216;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 578:
                    switch (yytok) {
                        case ']':
                            yyn = 313;
                            continue;
                    }
                    yyn = 727;
                    continue;

                case 217:
                    yyst[yysp] = 217;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 579:
                    switch (yytok) {
                        case ']':
                            yyn = 314;
                            continue;
                    }
                    yyn = 727;
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
                case 580:
                    switch (yytok) {
                        case IDENTIFIER:
                            yyn = 75;
                            continue;
                        case INTEGER:
                            yyn = 76;
                            continue;
                        case FLOAT:
                            yyn = 87;
                            continue;
                        case '(':
                            yyn = 88;
                            continue;
                    }
                    yyn = 727;
                    continue;

                case 219:
                    yyst[yysp] = 219;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 581:
                    switch (yytok) {
                        case IDENTIFIER:
                            yyn = 75;
                            continue;
                        case INTEGER:
                            yyn = 76;
                            continue;
                        case FLOAT:
                            yyn = 87;
                            continue;
                        case '(':
                            yyn = 88;
                            continue;
                    }
                    yyn = 727;
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
                case 582:
                    switch (yytok) {
                        case IDENTIFIER:
                            yyn = 75;
                            continue;
                        case INTEGER:
                            yyn = 76;
                            continue;
                        case FLOAT:
                            yyn = 87;
                            continue;
                        case '(':
                            yyn = 92;
                            continue;
                    }
                    yyn = 727;
                    continue;

                case 221:
                    yyst[yysp] = 221;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 583:
                    switch (yytok) {
                        case IDENTIFIER:
                            yyn = 75;
                            continue;
                        case INTEGER:
                            yyn = 76;
                            continue;
                        case '(':
                            yyn = 77;
                            continue;
                    }
                    yyn = 727;
                    continue;

                case 222:
                    yyst[yysp] = 222;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 584:
                    yyn = yys222();
                    continue;

                case 223:
                    yyst[yysp] = 223;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 585:
                    yyn = yys223();
                    continue;

                case 224:
                    yyst[yysp] = 224;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 586:
                    yyn = yys224();
                    continue;

                case 225:
                    yyst[yysp] = 225;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 587:
                    yyn = yys225();
                    continue;

                case 226:
                    yyst[yysp] = 226;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 588:
                    switch (yytok) {
                        case ']':
                            yyn = 321;
                            continue;
                    }
                    yyn = 727;
                    continue;

                case 227:
                    yyst[yysp] = 227;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 589:
                    switch (yytok) {
                        case ']':
                            yyn = 322;
                            continue;
                    }
                    yyn = 727;
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
                case 590:
                    switch (yytok) {
                        case IDENTIFIER:
                            yyn = 75;
                            continue;
                        case INTEGER:
                            yyn = 76;
                            continue;
                        case FLOAT:
                            yyn = 87;
                            continue;
                        case '(':
                            yyn = 141;
                            continue;
                    }
                    yyn = 727;
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
                case 591:
                    switch (yytok) {
                        case IDENTIFIER:
                            yyn = 75;
                            continue;
                        case INTEGER:
                            yyn = 76;
                            continue;
                        case FLOAT:
                            yyn = 87;
                            continue;
                        case '(':
                            yyn = 141;
                            continue;
                    }
                    yyn = 727;
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
                case 592:
                    switch (yytok) {
                        case IDENTIFIER:
                            yyn = 75;
                            continue;
                        case INTEGER:
                            yyn = 76;
                            continue;
                        case FLOAT:
                            yyn = 87;
                            continue;
                        case '(':
                            yyn = 141;
                            continue;
                    }
                    yyn = 727;
                    continue;

                case 231:
                    yyst[yysp] = 231;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.getNextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 593:
                    switch (yytok) {
                        case IDENTIFIER:
                            yyn = 75;
                            continue;
                        case INTEGER:
                            yyn = 76;
                            continue;
                        case FLOAT:
                            yyn = 87;
                            continue;
                        case '(':
                            yyn = 141;
                            continue;
                    }
                    yyn = 727;
                    continue;

                case 232:
                    yyst[yysp] = 232;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.getNextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 594:
                    yyn = yys232();
                    continue;

                case 233:
                    yyst[yysp] = 233;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 595:
                    yyn = yys233();
                    continue;

                case 234:
                    yyst[yysp] = 234;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.getNextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 596:
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
                case 597:
                    switch (yytok) {
                        case INTEGER:
                            yyn = 76;
                            continue;
                        case FLOAT:
                            yyn = 87;
                            continue;
                        case '(':
                            yyn = 155;
                            continue;
                    }
                    yyn = 727;
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
                case 598:
                    switch (yytok) {
                        case INTEGER:
                            yyn = 76;
                            continue;
                        case FLOAT:
                            yyn = 87;
                            continue;
                        case '(':
                            yyn = 155;
                            continue;
                    }
                    yyn = 727;
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
                case 599:
                    switch (yytok) {
                        case INTEGER:
                            yyn = 76;
                            continue;
                        case FLOAT:
                            yyn = 87;
                            continue;
                        case '(':
                            yyn = 155;
                            continue;
                    }
                    yyn = 727;
                    continue;

                case 238:
                    yyst[yysp] = 238;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.getNextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 600:
                    switch (yytok) {
                        case INTEGER:
                            yyn = 76;
                            continue;
                        case FLOAT:
                            yyn = 87;
                            continue;
                        case '(':
                            yyn = 155;
                            continue;
                    }
                    yyn = 727;
                    continue;

                case 239:
                    yyst[yysp] = 239;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 601:
                    yyn = yys239();
                    continue;

                case 240:
                    yyst[yysp] = 240;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 602:
                    yyn = yys240();
                    continue;

                case 241:
                    yyst[yysp] = 241;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 603:
                    yyn = yys241();
                    continue;

                case 242:
                    yyst[yysp] = 242;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 604:
                    yyn = yys242();
                    continue;

                case 243:
                    yyst[yysp] = 243;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 605:
                    yyn = yys243();
                    continue;

                case 244:
                    yyst[yysp] = 244;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 606:
                    yyn = yys244();
                    continue;

                case 245:
                    yyst[yysp] = 245;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 607:
                    yyn = yys245();
                    continue;

                case 246:
                    yyst[yysp] = 246;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 608:
                    yyn = yys246();
                    continue;

                case 247:
                    yyst[yysp] = 247;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 609:
                    switch (yytok) {
                        case '*':
                            yyn = 186;
                            continue;
                        case '+':
                            yyn = 187;
                            continue;
                        case '-':
                            yyn = 188;
                            continue;
                        case '/':
                            yyn = 189;
                            continue;
                        case ')':
                            yyn = 310;
                            continue;
                    }
                    yyn = 727;
                    continue;

                case 248:
                    yyst[yysp] = 248;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 610:
                    switch (yytok) {
                        case '*':
                            yyn = 194;
                            continue;
                        case '+':
                            yyn = 195;
                            continue;
                        case '-':
                            yyn = 196;
                            continue;
                        case '/':
                            yyn = 197;
                            continue;
                        case ')':
                            yyn = 272;
                            continue;
                    }
                    yyn = 727;
                    continue;

                case 249:
                    yyst[yysp] = 249;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 611:
                    switch (yytok) {
                        case ']':
                            yyn = 348;
                            continue;
                    }
                    yyn = 727;
                    continue;

                case 250:
                    yyst[yysp] = 250;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 612:
                    switch (yytok) {
                        case ']':
                            yyn = 349;
                            continue;
                    }
                    yyn = 727;
                    continue;

                case 251:
                    yyst[yysp] = 251;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 613:
                    switch (yytok) {
                        case ']':
                            yyn = 350;
                            continue;
                    }
                    yyn = 727;
                    continue;

                case 252:
                    yyst[yysp] = 252;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 614:
                    switch (yytok) {
                        case ']':
                            yyn = 351;
                            continue;
                    }
                    yyn = 727;
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
                case 615:
                    switch (yytok) {
                        case IDENTIFIER:
                            yyn = 75;
                            continue;
                        case INTEGER:
                            yyn = 76;
                            continue;
                        case FLOAT:
                            yyn = 87;
                            continue;
                        case '(':
                            yyn = 92;
                            continue;
                    }
                    yyn = 727;
                    continue;

                case 254:
                    yyst[yysp] = 254;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 616:
                    yyn = yys254();
                    continue;

                case 255:
                    yyst[yysp] = 255;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 617:
                    yyn = yys255();
                    continue;

                case 256:
                    yyst[yysp] = 256;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 618:
                    yyn = yys256();
                    continue;

                case 257:
                    yyst[yysp] = 257;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 619:
                    yyn = yys257();
                    continue;

                case 258:
                    yyst[yysp] = 258;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 620:
                    yyn = yys258();
                    continue;

                case 259:
                    yyst[yysp] = 259;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 621:
                    yyn = yys259();
                    continue;

                case 260:
                    yyst[yysp] = 260;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 622:
                    yyn = yys260();
                    continue;

                case 261:
                    yyst[yysp] = 261;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 623:
                    yyn = yys261();
                    continue;

                case 262:
                    yyst[yysp] = 262;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 624:
                    yyn = yys262();
                    continue;

                case 263:
                    yyst[yysp] = 263;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 625:
                    yyn = yys263();
                    continue;

                case 264:
                    yyst[yysp] = 264;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 626:
                    yyn = yys264();
                    continue;

                case 265:
                    yyst[yysp] = 265;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 627:
                    yyn = yys265();
                    continue;

                case 266:
                    yyst[yysp] = 266;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 628:
                    yyn = yys266();
                    continue;

                case 267:
                    yyst[yysp] = 267;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.getNextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 629:
                    switch (yytok) {
                        case INTEGER:
                            yyn = 76;
                            continue;
                        case '(':
                            yyn = 267;
                            continue;
                    }
                    yyn = 727;
                    continue;

                case 268:
                    yyst[yysp] = 268;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 630:
                    yyn = yys268();
                    continue;

                case 269:
                    yyst[yysp] = 269;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 631:
                    yyn = yys269();
                    continue;

                case 270:
                    yyst[yysp] = 270;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 632:
                    yyn = yys270();
                    continue;

                case 271:
                    yyst[yysp] = 271;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.getNextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 633:
                    yyn = yys271();
                    continue;

                case 272:
                    yyst[yysp] = 272;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.getNextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 634:
                    yyn = yys272();
                    continue;

                case 273:
                    yyst[yysp] = 273;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 635:
                    yyn = yys273();
                    continue;

                case 274:
                    yyst[yysp] = 274;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 636:
                    yyn = yys274();
                    continue;

                case 275:
                    yyst[yysp] = 275;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 637:
                    yyn = yys275();
                    continue;

                case 276:
                    yyst[yysp] = 276;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 638:
                    yyn = yys276();
                    continue;

                case 277:
                    yyst[yysp] = 277;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 639:
                    yyn = yys277();
                    continue;

                case 278:
                    yyst[yysp] = 278;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 640:
                    yyn = yys278();
                    continue;

                case 279:
                    yyst[yysp] = 279;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 641:
                    yyn = yys279();
                    continue;

                case 280:
                    yyst[yysp] = 280;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 642:
                    yyn = yys280();
                    continue;

                case 281:
                    yyst[yysp] = 281;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 643:
                    yyn = yys281();
                    continue;

                case 282:
                    yyst[yysp] = 282;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 644:
                    yyn = yys282();
                    continue;

                case 283:
                    yyst[yysp] = 283;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 645:
                    yyn = yys283();
                    continue;

                case 284:
                    yyst[yysp] = 284;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 646:
                    yyn = yys284();
                    continue;

                case 285:
                    yyst[yysp] = 285;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 647:
                    yyn = yys285();
                    continue;

                case 286:
                    yyst[yysp] = 286;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 648:
                    yyn = yys286();
                    continue;

                case 287:
                    yyst[yysp] = 287;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 649:
                    yyn = yys287();
                    continue;

                case 288:
                    yyst[yysp] = 288;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 650:
                    yyn = yys288();
                    continue;

                case 289:
                    yyst[yysp] = 289;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 651:
                    yyn = yys289();
                    continue;

                case 290:
                    yyst[yysp] = 290;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 652:
                    yyn = yys290();
                    continue;

                case 291:
                    yyst[yysp] = 291;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 653:
                    yyn = yys291();
                    continue;

                case 292:
                    yyst[yysp] = 292;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 654:
                    yyn = yys292();
                    continue;

                case 293:
                    yyst[yysp] = 293;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 655:
                    yyn = yys293();
                    continue;

                case 294:
                    yyst[yysp] = 294;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 656:
                    yyn = yys294();
                    continue;

                case 295:
                    yyst[yysp] = 295;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 657:
                    yyn = yys295();
                    continue;

                case 296:
                    yyst[yysp] = 296;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 658:
                    yyn = yys296();
                    continue;

                case 297:
                    yyst[yysp] = 297;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 659:
                    yyn = yys297();
                    continue;

                case 298:
                    yyst[yysp] = 298;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 660:
                    yyn = yys298();
                    continue;

                case 299:
                    yyst[yysp] = 299;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 661:
                    yyn = yys299();
                    continue;

                case 300:
                    yyst[yysp] = 300;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 662:
                    yyn = yys300();
                    continue;

                case 301:
                    yyst[yysp] = 301;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 663:
                    yyn = yys301();
                    continue;

                case 302:
                    yyst[yysp] = 302;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 664:
                    yyn = yys302();
                    continue;

                case 303:
                    yyst[yysp] = 303;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 665:
                    yyn = yys303();
                    continue;

                case 304:
                    yyst[yysp] = 304;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 666:
                    yyn = yys304();
                    continue;

                case 305:
                    yyst[yysp] = 305;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 667:
                    yyn = yys305();
                    continue;

                case 306:
                    yyst[yysp] = 306;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 668:
                    yyn = yys306();
                    continue;

                case 307:
                    yyst[yysp] = 307;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 669:
                    yyn = yys307();
                    continue;

                case 308:
                    yyst[yysp] = 308;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 670:
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
                case 671:
                    yyn = yys309();
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
                case 672:
                    yyn = yys310();
                    continue;

                case 311:
                    yyst[yysp] = 311;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.getNextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 673:
                    yyn = yys311();
                    continue;

                case 312:
                    yyst[yysp] = 312;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.getNextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 674:
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
                case 675:
                    yyn = yys313();
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
                case 676:
                    yyn = yys314();
                    continue;

                case 315:
                    yyst[yysp] = 315;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 677:
                    switch (yytok) {
                        case ']':
                            yyn = 354;
                            continue;
                    }
                    yyn = 727;
                    continue;

                case 316:
                    yyst[yysp] = 316;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 678:
                    switch (yytok) {
                        case ']':
                            yyn = 355;
                            continue;
                    }
                    yyn = 727;
                    continue;

                case 317:
                    yyst[yysp] = 317;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 679:
                    switch (yytok) {
                        case ']':
                            yyn = 356;
                            continue;
                    }
                    yyn = 727;
                    continue;

                case 318:
                    yyst[yysp] = 318;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 680:
                    switch (yytok) {
                        case ']':
                            yyn = 357;
                            continue;
                    }
                    yyn = 727;
                    continue;

                case 319:
                    yyst[yysp] = 319;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 681:
                    yyn = yys319();
                    continue;

                case 320:
                    yyst[yysp] = 320;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 682:
                    switch (yytok) {
                        case ']':
                            yyn = 358;
                            continue;
                    }
                    yyn = 727;
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
                case 683:
                    yyn = yys321();
                    continue;

                case 322:
                    yyst[yysp] = 322;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.getNextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 684:
                    yyn = yys322();
                    continue;

                case 323:
                    yyst[yysp] = 323;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 685:
                    yyn = yys323();
                    continue;

                case 324:
                    yyst[yysp] = 324;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 686:
                    switch (yytok) {
                        case ']':
                            yyn = 360;
                            continue;
                    }
                    yyn = 727;
                    continue;

                case 325:
                    yyst[yysp] = 325;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 687:
                    switch (yytok) {
                        case ']':
                            yyn = 361;
                            continue;
                    }
                    yyn = 727;
                    continue;

                case 326:
                    yyst[yysp] = 326;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 688:
                    yyn = yys326();
                    continue;

                case 327:
                    yyst[yysp] = 327;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 689:
                    yyn = yys327();
                    continue;

                case 328:
                    yyst[yysp] = 328;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 690:
                    yyn = yys328();
                    continue;

                case 329:
                    yyst[yysp] = 329;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 691:
                    yyn = yys329();
                    continue;

                case 330:
                    yyst[yysp] = 330;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 692:
                    yyn = yys330();
                    continue;

                case 331:
                    yyst[yysp] = 331;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 693:
                    yyn = yys331();
                    continue;

                case 332:
                    yyst[yysp] = 332;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 694:
                    yyn = yys332();
                    continue;

                case 333:
                    yyst[yysp] = 333;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 695:
                    yyn = yys333();
                    continue;

                case 334:
                    yyst[yysp] = 334;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 696:
                    yyn = yys334();
                    continue;

                case 335:
                    yyst[yysp] = 335;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 697:
                    yyn = yys335();
                    continue;

                case 336:
                    yyst[yysp] = 336;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 698:
                    yyn = yys336();
                    continue;

                case 337:
                    yyst[yysp] = 337;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 699:
                    yyn = yys337();
                    continue;

                case 338:
                    yyst[yysp] = 338;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 700:
                    yyn = yys338();
                    continue;

                case 339:
                    yyst[yysp] = 339;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 701:
                    yyn = yys339();
                    continue;

                case 340:
                    yyst[yysp] = 340;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 702:
                    yyn = yys340();
                    continue;

                case 341:
                    yyst[yysp] = 341;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 703:
                    yyn = yys341();
                    continue;

                case 342:
                    yyst[yysp] = 342;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 704:
                    yyn = yys342();
                    continue;

                case 343:
                    yyst[yysp] = 343;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 705:
                    yyn = yys343();
                    continue;

                case 344:
                    yyst[yysp] = 344;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 706:
                    yyn = yys344();
                    continue;

                case 345:
                    yyst[yysp] = 345;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 707:
                    yyn = yys345();
                    continue;

                case 346:
                    yyst[yysp] = 346;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 708:
                    yyn = yys346();
                    continue;

                case 347:
                    yyst[yysp] = 347;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 709:
                    yyn = yys347();
                    continue;

                case 348:
                    yyst[yysp] = 348;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.getNextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 710:
                    yyn = yys348();
                    continue;

                case 349:
                    yyst[yysp] = 349;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.getNextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 711:
                    yyn = yys349();
                    continue;

                case 350:
                    yyst[yysp] = 350;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.getNextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 712:
                    yyn = yys350();
                    continue;

                case 351:
                    yyst[yysp] = 351;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.getNextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 713:
                    yyn = yys351();
                    continue;

                case 352:
                    yyst[yysp] = 352;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 714:
                    yyn = yys352();
                    continue;

                case 353:
                    yyst[yysp] = 353;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 715:
                    switch (yytok) {
                        case '*':
                            yyn = 171;
                            continue;
                        case '+':
                            yyn = 172;
                            continue;
                        case '-':
                            yyn = 173;
                            continue;
                        case '/':
                            yyn = 174;
                            continue;
                        case ')':
                            yyn = 272;
                            continue;
                    }
                    yyn = 727;
                    continue;

                case 354:
                    yyst[yysp] = 354;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.getNextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 716:
                    yyn = yys354();
                    continue;

                case 355:
                    yyst[yysp] = 355;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.getNextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 717:
                    yyn = yys355();
                    continue;

                case 356:
                    yyst[yysp] = 356;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.getNextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 718:
                    yyn = yys356();
                    continue;

                case 357:
                    yyst[yysp] = 357;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.getNextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 719:
                    yyn = yys357();
                    continue;

                case 358:
                    yyst[yysp] = 358;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.getNextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 720:
                    yyn = yys358();
                    continue;

                case 359:
                    yyst[yysp] = 359;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 721:
                    switch (yytok) {
                        case ']':
                            yyn = yyr169();
                            continue;
                    }
                    yyn = 727;
                    continue;

                case 360:
                    yyst[yysp] = 360;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.getNextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 722:
                    yyn = yys360();
                    continue;

                case 361:
                    yyst[yysp] = 361;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.getNextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 723:
                    yyn = yys361();
                    continue;

                case 724:
                    return true;
                case 725:
                    yyerror("stack overflow");
                case 726:
                    return false;
                case 727:
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
                return 17;
            case AT:
                return 18;
            case AV:
                return 19;
            case AVANZA:
                return 20;
            case AZAR:
                return 21;
            case BAJALAPIZ:
                return 22;
            case BL:
                return 23;
            case BORRAPANTALLA:
                return 24;
            case CENTRO:
                return 25;
            case COS:
                return 26;
            case CUENTA:
                return 27;
            case DIFERENCIA:
                return 28;
            case DIVISION:
                return 29;
            case ELEGIR:
                return 30;
            case ELEMENTO:
                return 31;
            case ESPERA:
                return 32;
            case GD:
                return 33;
            case GI:
                return 34;
            case GIRADERECHA:
                return 35;
            case GIRAIZQUIERDA:
                return 36;
            case INC:
                return 37;
            case INIC:
                return 38;
            case MENOS:
                return 39;
            case OCULTATORTUGA:
                return 40;
            case OT:
                return 41;
            case PONCL:
                return 42;
            case PONCOLORLAPIZ:
                return 43;
            case PONPOS:
                return 44;
            case PONRUMBO:
                return 45;
            case PONX:
                return 46;
            case PONXY:
                return 47;
            case PONY:
                return 48;
            case POTENCIA:
                return 49;
            case PRIMERO:
                return 50;
            case PRODUCTO:
                return 51;
            case RAIZCUADRADA:
                return 52;
            case RC:
                return 53;
            case RE:
                return 54;
            case REDONDEA:
                return 55;
            case REPITE:
                return 56;
            case RESTO:
                return 57;
            case RETROCEDE:
                return 58;
            case RUMBO:
                return 59;
            case SB:
                return 60;
            case SEN:
                return 61;
            case SENO:
                return 62;
            case SI:
                return 63;
            case SUBELAPIZ:
                return 64;
            case SUMA:
                return 65;
            case UL:
                return 66;
            case ULTIMO:
                return 67;
            case VAR:
                return 68;
        }
        return 727;
    }

    private int yys2() {
        switch (yytok) {
            case AZUL:
            case EJECUTA:
            case MENORQUE:
            case IDENTIFIER:
            case FIN:
            case '(':
            case ')':
            case VERDE:
            case '[':
            case IGUALES:
            case GRIS:
            case INTEGER:
            case '-':
            case NEGRO:
            case '=':
            case '*':
            case error:
            case Y:
            case MAYORQUE:
            case MARRON:
            case ENDINPUT:
            case ROJO:
            case CIAN:
            case PROCEDURE_NAME:
            case AMARILLO:
            case FLOAT:
            case '<':
            case PARA:
            case BLANCO:
            case O:
            case PARAMETER:
            case '>':
            case '/':
            case '+':
                return 727;
        }
        return yyr4();
    }

    private int yys4() {
        switch (yytok) {
            case AZUL:
            case EJECUTA:
            case MENORQUE:
            case IDENTIFIER:
            case FIN:
            case '(':
            case ')':
            case VERDE:
            case '[':
            case IGUALES:
            case GRIS:
            case INTEGER:
            case '-':
            case NEGRO:
            case '=':
            case '*':
            case error:
            case Y:
            case MAYORQUE:
            case MARRON:
            case ENDINPUT:
            case ROJO:
            case CIAN:
            case PROCEDURE_NAME:
            case AMARILLO:
            case FLOAT:
            case '<':
            case PARA:
            case BLANCO:
            case O:
            case PARAMETER:
            case '>':
            case '/':
            case '+':
                return 727;
        }
        return yyr6();
    }

    private int yys5() {
        switch (yytok) {
            case AZUL:
            case EJECUTA:
            case MENORQUE:
            case IDENTIFIER:
            case FIN:
            case '(':
            case ')':
            case VERDE:
            case '[':
            case IGUALES:
            case GRIS:
            case INTEGER:
            case '-':
            case NEGRO:
            case '=':
            case '*':
            case error:
            case Y:
            case MAYORQUE:
            case MARRON:
            case ENDINPUT:
            case ROJO:
            case CIAN:
            case PROCEDURE_NAME:
            case AMARILLO:
            case FLOAT:
            case '<':
            case PARA:
            case BLANCO:
            case O:
            case PARAMETER:
            case '>':
            case '/':
            case '+':
                return 727;
        }
        return yyr7();
    }

    private int yys6() {
        switch (yytok) {
            case AZUL:
            case EJECUTA:
            case MENORQUE:
            case IDENTIFIER:
            case FIN:
            case '(':
            case ')':
            case VERDE:
            case '[':
            case IGUALES:
            case GRIS:
            case INTEGER:
            case '-':
            case NEGRO:
            case '=':
            case '*':
            case error:
            case Y:
            case MAYORQUE:
            case MARRON:
            case ENDINPUT:
            case ROJO:
            case CIAN:
            case PROCEDURE_NAME:
            case AMARILLO:
            case FLOAT:
            case '<':
            case PARA:
            case BLANCO:
            case O:
            case PARAMETER:
            case '>':
            case '/':
            case '+':
                return 727;
        }
        return yyr9();
    }

    private int yys7() {
        switch (yytok) {
            case AZUL:
            case EJECUTA:
            case MENORQUE:
            case IDENTIFIER:
            case FIN:
            case '(':
            case ')':
            case VERDE:
            case '[':
            case IGUALES:
            case GRIS:
            case INTEGER:
            case '-':
            case NEGRO:
            case '=':
            case '*':
            case error:
            case Y:
            case MAYORQUE:
            case MARRON:
            case ENDINPUT:
            case ROJO:
            case CIAN:
            case PROCEDURE_NAME:
            case AMARILLO:
            case FLOAT:
            case '<':
            case PARA:
            case BLANCO:
            case O:
            case PARAMETER:
            case '>':
            case '/':
            case '+':
                return 727;
        }
        return yyr16();
    }

    private int yys8() {
        switch (yytok) {
            case AZUL:
            case EJECUTA:
            case MENORQUE:
            case IDENTIFIER:
            case FIN:
            case '(':
            case ')':
            case VERDE:
            case '[':
            case IGUALES:
            case GRIS:
            case INTEGER:
            case '-':
            case NEGRO:
            case '=':
            case '*':
            case error:
            case Y:
            case MAYORQUE:
            case MARRON:
            case ENDINPUT:
            case ROJO:
            case CIAN:
            case PROCEDURE_NAME:
            case AMARILLO:
            case FLOAT:
            case '<':
            case PARA:
            case BLANCO:
            case O:
            case PARAMETER:
            case '>':
            case '/':
            case '+':
                return 727;
        }
        return yyr15();
    }

    private int yys9() {
        switch (yytok) {
            case AZUL:
            case EJECUTA:
            case MENORQUE:
            case IDENTIFIER:
            case FIN:
            case '(':
            case ')':
            case VERDE:
            case '[':
            case IGUALES:
            case GRIS:
            case INTEGER:
            case '-':
            case NEGRO:
            case '=':
            case '*':
            case error:
            case Y:
            case MAYORQUE:
            case MARRON:
            case ENDINPUT:
            case ROJO:
            case CIAN:
            case PROCEDURE_NAME:
            case AMARILLO:
            case FLOAT:
            case '<':
            case PARA:
            case BLANCO:
            case O:
            case PARAMETER:
            case '>':
            case '/':
            case '+':
                return 727;
        }
        return yyr12();
    }

    private int yys11() {
        switch (yytok) {
            case AZUL:
            case EJECUTA:
            case MENORQUE:
            case IDENTIFIER:
            case FIN:
            case '(':
            case ')':
            case VERDE:
            case '[':
            case IGUALES:
            case GRIS:
            case INTEGER:
            case '-':
            case NEGRO:
            case '=':
            case '*':
            case error:
            case Y:
            case MAYORQUE:
            case MARRON:
            case ENDINPUT:
            case ROJO:
            case CIAN:
            case PROCEDURE_NAME:
            case AMARILLO:
            case FLOAT:
            case '<':
            case PARA:
            case BLANCO:
            case O:
            case PARAMETER:
            case '>':
            case '/':
            case '+':
                return 727;
        }
        return yyr5();
    }

    private int yys12() {
        switch (yytok) {
            case AZUL:
            case EJECUTA:
            case MENORQUE:
            case IDENTIFIER:
            case FIN:
            case '(':
            case ')':
            case VERDE:
            case '[':
            case IGUALES:
            case GRIS:
            case INTEGER:
            case '-':
            case NEGRO:
            case '=':
            case '*':
            case error:
            case Y:
            case MAYORQUE:
            case MARRON:
            case ENDINPUT:
            case ROJO:
            case CIAN:
            case PROCEDURE_NAME:
            case AMARILLO:
            case FLOAT:
            case '<':
            case PARA:
            case BLANCO:
            case O:
            case PARAMETER:
            case '>':
            case '/':
            case '+':
                return 727;
        }
        return yyr8();
    }

    private int yys13() {
        switch (yytok) {
            case AZUL:
            case EJECUTA:
            case MENORQUE:
            case IDENTIFIER:
            case FIN:
            case '(':
            case ')':
            case VERDE:
            case '[':
            case IGUALES:
            case GRIS:
            case INTEGER:
            case '-':
            case NEGRO:
            case '=':
            case '*':
            case error:
            case Y:
            case MAYORQUE:
            case MARRON:
            case ENDINPUT:
            case ROJO:
            case CIAN:
            case PROCEDURE_NAME:
            case AMARILLO:
            case FLOAT:
            case '<':
            case PARA:
            case BLANCO:
            case O:
            case PARAMETER:
            case '>':
            case '/':
            case '+':
                return 727;
        }
        return yyr10();
    }

    private int yys14() {
        switch (yytok) {
            case AZUL:
            case EJECUTA:
            case MENORQUE:
            case IDENTIFIER:
            case FIN:
            case '(':
            case ')':
            case VERDE:
            case '[':
            case IGUALES:
            case GRIS:
            case INTEGER:
            case '-':
            case NEGRO:
            case '=':
            case '*':
            case error:
            case Y:
            case MAYORQUE:
            case MARRON:
            case ENDINPUT:
            case ROJO:
            case CIAN:
            case PROCEDURE_NAME:
            case AMARILLO:
            case FLOAT:
            case '<':
            case PARA:
            case BLANCO:
            case O:
            case PARAMETER:
            case '>':
            case '/':
            case '+':
                return 727;
        }
        return yyr14();
    }

    private int yys15() {
        switch (yytok) {
            case AZUL:
            case EJECUTA:
            case MENORQUE:
            case IDENTIFIER:
            case FIN:
            case '(':
            case ')':
            case VERDE:
            case '[':
            case IGUALES:
            case GRIS:
            case INTEGER:
            case '-':
            case NEGRO:
            case '=':
            case '*':
            case error:
            case Y:
            case MAYORQUE:
            case MARRON:
            case ENDINPUT:
            case ROJO:
            case CIAN:
            case PROCEDURE_NAME:
            case AMARILLO:
            case FLOAT:
            case '<':
            case PARA:
            case BLANCO:
            case O:
            case PARAMETER:
            case '>':
            case '/':
            case '+':
                return 727;
        }
        return yyr11();
    }

    private int yys16() {
        switch (yytok) {
            case AZUL:
            case EJECUTA:
            case MENORQUE:
            case IDENTIFIER:
            case FIN:
            case '(':
            case ')':
            case VERDE:
            case '[':
            case IGUALES:
            case GRIS:
            case INTEGER:
            case '-':
            case NEGRO:
            case '=':
            case '*':
            case error:
            case Y:
            case MAYORQUE:
            case MARRON:
            case ENDINPUT:
            case ROJO:
            case CIAN:
            case PROCEDURE_NAME:
            case AMARILLO:
            case FLOAT:
            case '<':
            case PARA:
            case BLANCO:
            case O:
            case PARAMETER:
            case '>':
            case '/':
            case '+':
                return 727;
        }
        return yyr13();
    }

    private int yys17() {
        switch (yytok) {
            case AZUL:
            case EJECUTA:
            case MENORQUE:
            case IDENTIFIER:
            case FIN:
            case '(':
            case ')':
            case VERDE:
            case '[':
            case IGUALES:
            case GRIS:
            case INTEGER:
            case '-':
            case NEGRO:
            case '=':
            case '*':
            case error:
            case Y:
            case MAYORQUE:
            case MARRON:
            case ENDINPUT:
            case ROJO:
            case CIAN:
            case PROCEDURE_NAME:
            case AMARILLO:
            case FLOAT:
            case '<':
            case PARA:
            case BLANCO:
            case O:
            case PARAMETER:
            case '>':
            case '/':
            case '+':
                return 727;
        }
        return yyr124();
    }

    private int yys18() {
        switch (yytok) {
            case AZUL:
            case EJECUTA:
            case MENORQUE:
            case IDENTIFIER:
            case FIN:
            case '(':
            case ')':
            case VERDE:
            case '[':
            case IGUALES:
            case GRIS:
            case INTEGER:
            case '-':
            case NEGRO:
            case '=':
            case '*':
            case error:
            case Y:
            case MAYORQUE:
            case MARRON:
            case ENDINPUT:
            case ROJO:
            case CIAN:
            case PROCEDURE_NAME:
            case AMARILLO:
            case FLOAT:
            case '<':
            case PARA:
            case BLANCO:
            case O:
            case PARAMETER:
            case '>':
            case '/':
            case '+':
                return 727;
        }
        return yyr125();
    }

    private int yys22() {
        switch (yytok) {
            case AZUL:
            case EJECUTA:
            case MENORQUE:
            case IDENTIFIER:
            case FIN:
            case '(':
            case ')':
            case VERDE:
            case '[':
            case IGUALES:
            case GRIS:
            case INTEGER:
            case '-':
            case NEGRO:
            case '=':
            case '*':
            case error:
            case Y:
            case MAYORQUE:
            case MARRON:
            case ENDINPUT:
            case ROJO:
            case CIAN:
            case PROCEDURE_NAME:
            case AMARILLO:
            case FLOAT:
            case '<':
            case PARA:
            case BLANCO:
            case O:
            case PARAMETER:
            case '>':
            case '/':
            case '+':
                return 727;
        }
        return yyr126();
    }

    private int yys23() {
        switch (yytok) {
            case AZUL:
            case EJECUTA:
            case MENORQUE:
            case IDENTIFIER:
            case FIN:
            case '(':
            case ')':
            case VERDE:
            case '[':
            case IGUALES:
            case GRIS:
            case INTEGER:
            case '-':
            case NEGRO:
            case '=':
            case '*':
            case error:
            case Y:
            case MAYORQUE:
            case MARRON:
            case ENDINPUT:
            case ROJO:
            case CIAN:
            case PROCEDURE_NAME:
            case AMARILLO:
            case FLOAT:
            case '<':
            case PARA:
            case BLANCO:
            case O:
            case PARAMETER:
            case '>':
            case '/':
            case '+':
                return 727;
        }
        return yyr127();
    }

    private int yys24() {
        switch (yytok) {
            case AZUL:
            case EJECUTA:
            case MENORQUE:
            case IDENTIFIER:
            case FIN:
            case '(':
            case ')':
            case VERDE:
            case '[':
            case IGUALES:
            case GRIS:
            case INTEGER:
            case '-':
            case NEGRO:
            case '=':
            case '*':
            case error:
            case Y:
            case MAYORQUE:
            case MARRON:
            case ENDINPUT:
            case ROJO:
            case CIAN:
            case PROCEDURE_NAME:
            case AMARILLO:
            case FLOAT:
            case '<':
            case PARA:
            case BLANCO:
            case O:
            case PARAMETER:
            case '>':
            case '/':
            case '+':
                return 727;
        }
        return yyr131();
    }

    private int yys25() {
        switch (yytok) {
            case AZUL:
            case EJECUTA:
            case MENORQUE:
            case IDENTIFIER:
            case FIN:
            case '(':
            case ')':
            case VERDE:
            case '[':
            case IGUALES:
            case GRIS:
            case INTEGER:
            case '-':
            case NEGRO:
            case '=':
            case '*':
            case error:
            case Y:
            case MAYORQUE:
            case MARRON:
            case ENDINPUT:
            case ROJO:
            case CIAN:
            case PROCEDURE_NAME:
            case AMARILLO:
            case FLOAT:
            case '<':
            case PARA:
            case BLANCO:
            case O:
            case PARAMETER:
            case '>':
            case '/':
            case '+':
                return 727;
        }
        return yyr130();
    }

    private int yys40() {
        switch (yytok) {
            case AZUL:
            case EJECUTA:
            case MENORQUE:
            case IDENTIFIER:
            case FIN:
            case '(':
            case ')':
            case VERDE:
            case '[':
            case IGUALES:
            case GRIS:
            case INTEGER:
            case '-':
            case NEGRO:
            case '=':
            case '*':
            case error:
            case Y:
            case MAYORQUE:
            case MARRON:
            case ENDINPUT:
            case ROJO:
            case CIAN:
            case PROCEDURE_NAME:
            case AMARILLO:
            case FLOAT:
            case '<':
            case PARA:
            case BLANCO:
            case O:
            case PARAMETER:
            case '>':
            case '/':
            case '+':
                return 727;
        }
        return yyr122();
    }

    private int yys41() {
        switch (yytok) {
            case AZUL:
            case EJECUTA:
            case MENORQUE:
            case IDENTIFIER:
            case FIN:
            case '(':
            case ')':
            case VERDE:
            case '[':
            case IGUALES:
            case GRIS:
            case INTEGER:
            case '-':
            case NEGRO:
            case '=':
            case '*':
            case error:
            case Y:
            case MAYORQUE:
            case MARRON:
            case ENDINPUT:
            case ROJO:
            case CIAN:
            case PROCEDURE_NAME:
            case AMARILLO:
            case FLOAT:
            case '<':
            case PARA:
            case BLANCO:
            case O:
            case PARAMETER:
            case '>':
            case '/':
            case '+':
                return 727;
        }
        return yyr123();
    }

    private int yys42() {
        switch (yytok) {
            case AMARILLO:
                return 113;
            case AZUL:
                return 114;
            case BLANCO:
                return 115;
            case CIAN:
                return 116;
            case GRIS:
                return 117;
            case MARRON:
                return 118;
            case NEGRO:
                return 119;
            case ROJO:
                return 120;
            case VERDE:
                return 121;
        }
        return 727;
    }

    private int yys43() {
        switch (yytok) {
            case AMARILLO:
                return 113;
            case AZUL:
                return 114;
            case BLANCO:
                return 115;
            case CIAN:
                return 116;
            case GRIS:
                return 117;
            case MARRON:
                return 118;
            case NEGRO:
                return 119;
            case ROJO:
                return 120;
            case VERDE:
                return 121;
        }
        return 727;
    }

    private int yys59() {
        switch (yytok) {
            case AZUL:
            case EJECUTA:
            case MENORQUE:
            case IDENTIFIER:
            case FIN:
            case '(':
            case ')':
            case VERDE:
            case '[':
            case IGUALES:
            case GRIS:
            case INTEGER:
            case '-':
            case NEGRO:
            case '=':
            case '*':
            case error:
            case Y:
            case MAYORQUE:
            case MARRON:
            case ENDINPUT:
            case ROJO:
            case CIAN:
            case PROCEDURE_NAME:
            case AMARILLO:
            case FLOAT:
            case '<':
            case PARA:
            case BLANCO:
            case O:
            case PARAMETER:
            case '>':
            case '/':
            case '+':
                return 727;
        }
        return yyr132();
    }

    private int yys60() {
        switch (yytok) {
            case AZUL:
            case EJECUTA:
            case MENORQUE:
            case IDENTIFIER:
            case FIN:
            case '(':
            case ')':
            case VERDE:
            case '[':
            case IGUALES:
            case GRIS:
            case INTEGER:
            case '-':
            case NEGRO:
            case '=':
            case '*':
            case error:
            case Y:
            case MAYORQUE:
            case MARRON:
            case ENDINPUT:
            case ROJO:
            case CIAN:
            case PROCEDURE_NAME:
            case AMARILLO:
            case FLOAT:
            case '<':
            case PARA:
            case BLANCO:
            case O:
            case PARAMETER:
            case '>':
            case '/':
            case '+':
                return 727;
        }
        return yyr129();
    }

    private int yys63() {
        switch (yytok) {
            case INTEGER:
                return 76;
            case FLOAT:
                return 87;
            case IGUALES:
                return 150;
            case MAYORQUE:
                return 151;
            case MENORQUE:
                return 152;
            case O:
                return 153;
            case Y:
                return 154;
            case '(':
                return 155;
        }
        return 727;
    }

    private int yys64() {
        switch (yytok) {
            case AZUL:
            case EJECUTA:
            case MENORQUE:
            case IDENTIFIER:
            case FIN:
            case '(':
            case ')':
            case VERDE:
            case '[':
            case IGUALES:
            case GRIS:
            case INTEGER:
            case '-':
            case NEGRO:
            case '=':
            case '*':
            case error:
            case Y:
            case MAYORQUE:
            case MARRON:
            case ENDINPUT:
            case ROJO:
            case CIAN:
            case PROCEDURE_NAME:
            case AMARILLO:
            case FLOAT:
            case '<':
            case PARA:
            case BLANCO:
            case O:
            case PARAMETER:
            case '>':
            case '/':
            case '+':
                return 727;
        }
        return yyr128();
    }

    private int yys69() {
        switch (yytok) {
            case APARECETORTUGA:
                return 17;
            case AT:
                return 18;
            case AV:
                return 19;
            case AVANZA:
                return 20;
            case AZAR:
                return 21;
            case BAJALAPIZ:
                return 22;
            case BL:
                return 23;
            case BORRAPANTALLA:
                return 24;
            case CENTRO:
                return 25;
            case COS:
                return 26;
            case CUENTA:
                return 27;
            case DIFERENCIA:
                return 28;
            case DIVISION:
                return 29;
            case ELEGIR:
                return 30;
            case ELEMENTO:
                return 31;
            case ESPERA:
                return 32;
            case GD:
                return 33;
            case GI:
                return 34;
            case GIRADERECHA:
                return 35;
            case GIRAIZQUIERDA:
                return 36;
            case INC:
                return 37;
            case INIC:
                return 38;
            case MENOS:
                return 39;
            case OCULTATORTUGA:
                return 40;
            case OT:
                return 41;
            case PONCL:
                return 42;
            case PONCOLORLAPIZ:
                return 43;
            case PONPOS:
                return 44;
            case PONRUMBO:
                return 45;
            case PONX:
                return 46;
            case PONXY:
                return 47;
            case PONY:
                return 48;
            case POTENCIA:
                return 49;
            case PRIMERO:
                return 50;
            case PRODUCTO:
                return 51;
            case RAIZCUADRADA:
                return 52;
            case RC:
                return 53;
            case RE:
                return 54;
            case REDONDEA:
                return 55;
            case REPITE:
                return 56;
            case RESTO:
                return 57;
            case RETROCEDE:
                return 58;
            case RUMBO:
                return 59;
            case SB:
                return 60;
            case SEN:
                return 61;
            case SENO:
                return 62;
            case SI:
                return 63;
            case SUBELAPIZ:
                return 64;
            case SUMA:
                return 65;
            case UL:
                return 66;
            case ULTIMO:
                return 67;
            case VAR:
                return 68;
            case ENDINPUT:
                return yyr3();
        }
        return 727;
    }

    private int yys70() {
        switch (yytok) {
            case '=':
            case error:
            case NEGRO:
            case FLOAT:
            case MAYORQUE:
            case PARAMETER:
            case VERDE:
            case Y:
            case GRIS:
            case CIAN:
            case ENDINPUT:
            case '>':
            case EJECUTA:
            case '<':
            case BLANCO:
            case MARRON:
            case MENORQUE:
            case O:
            case ROJO:
            case AMARILLO:
            case AZUL:
            case PROCEDURE_NAME:
            case IGUALES:
            case FIN:
            case PARA:
                return 727;
            case '*':
                return 163;
            case '+':
                return 164;
            case '-':
                return 165;
            case '/':
                return 166;
        }
        return yyr19();
    }

    private int yys71() {
        switch (yytok) {
            case AZUL:
            case EJECUTA:
            case MENORQUE:
            case IDENTIFIER:
            case FIN:
            case '(':
            case ')':
            case VERDE:
            case '[':
            case IGUALES:
            case GRIS:
            case INTEGER:
            case '-':
            case NEGRO:
            case '=':
            case '*':
            case error:
            case Y:
            case MAYORQUE:
            case MARRON:
            case ENDINPUT:
            case ROJO:
            case CIAN:
            case PROCEDURE_NAME:
            case AMARILLO:
            case FLOAT:
            case '<':
            case PARA:
            case BLANCO:
            case O:
            case PARAMETER:
            case '>':
            case '/':
            case '+':
                return 727;
        }
        return yyr134();
    }

    private int yys72() {
        switch (yytok) {
            case '=':
            case error:
            case '>':
            case IGUALES:
            case NEGRO:
            case '<':
            case VERDE:
            case EJECUTA:
            case GRIS:
            case PROCEDURE_NAME:
            case PARA:
            case MAYORQUE:
            case Y:
            case PARAMETER:
            case BLANCO:
            case MARRON:
            case MENORQUE:
            case O:
            case ROJO:
            case AMARILLO:
            case AZUL:
            case CIAN:
            case FIN:
            case ENDINPUT:
                return 727;
            case '*':
                return 167;
            case '+':
                return 168;
            case '-':
                return 169;
            case '/':
                return 170;
        }
        return yyr20();
    }

    private int yys73() {
        switch (yytok) {
            case '=':
            case error:
            case '>':
            case IGUALES:
            case NEGRO:
            case '<':
            case VERDE:
            case EJECUTA:
            case GRIS:
            case PROCEDURE_NAME:
            case PARA:
            case MAYORQUE:
            case Y:
            case PARAMETER:
            case BLANCO:
            case MARRON:
            case MENORQUE:
            case O:
            case ROJO:
            case AMARILLO:
            case AZUL:
            case CIAN:
            case FIN:
            case ENDINPUT:
                return 727;
            case '*':
                return 171;
            case '+':
                return 172;
            case '-':
                return 173;
            case '/':
                return 174;
        }
        return yyr18();
    }

    private int yys74() {
        switch (yytok) {
            case ROJO:
            case error:
            case ENDINPUT:
            case PARA:
            case NEGRO:
            case EJECUTA:
            case MENORQUE:
            case '>':
            case PROCEDURE_NAME:
            case AZUL:
            case O:
            case Y:
            case PARAMETER:
            case '<':
            case BLANCO:
            case VERDE:
            case MAYORQUE:
            case '=':
            case IGUALES:
            case GRIS:
            case CIAN:
            case FIN:
            case AMARILLO:
            case MARRON:
                return 727;
        }
        return yyr40();
    }

    private int yys75() {
        switch (yytok) {
            case ROJO:
            case error:
            case ENDINPUT:
            case PARA:
            case NEGRO:
            case EJECUTA:
            case MENORQUE:
            case '>':
            case PROCEDURE_NAME:
            case AZUL:
            case O:
            case Y:
            case PARAMETER:
            case '<':
            case BLANCO:
            case VERDE:
            case MAYORQUE:
            case '=':
            case IGUALES:
            case GRIS:
            case CIAN:
            case FIN:
            case AMARILLO:
            case MARRON:
                return 727;
        }
        return yyr17();
    }

    private int yys76() {
        switch (yytok) {
            case VERDE:
            case AZUL:
            case PROCEDURE_NAME:
            case EJECUTA:
            case PARA:
            case FIN:
            case MARRON:
            case GRIS:
            case ROJO:
            case '=':
            case PARAMETER:
            case BLANCO:
            case AMARILLO:
            case CIAN:
            case NEGRO:
            case error:
            case ENDINPUT:
                return 727;
        }
        return yyr26();
    }

    private int yys78() {
        switch (yytok) {
            case AZUL:
            case EJECUTA:
            case MENORQUE:
            case IDENTIFIER:
            case FIN:
            case '(':
            case ')':
            case VERDE:
            case '[':
            case IGUALES:
            case GRIS:
            case INTEGER:
            case '-':
            case NEGRO:
            case '=':
            case '*':
            case error:
            case Y:
            case MAYORQUE:
            case MARRON:
            case ENDINPUT:
            case ROJO:
            case CIAN:
            case PROCEDURE_NAME:
            case AMARILLO:
            case FLOAT:
            case '<':
            case PARA:
            case BLANCO:
            case O:
            case PARAMETER:
            case '>':
            case '/':
            case '+':
                return 727;
        }
        return yyr133();
    }

    private int yys79() {
        switch (yytok) {
            case MARRON:
            case NEGRO:
            case MENORQUE:
            case AZUL:
            case O:
            case PARAMETER:
            case Y:
            case error:
            case GRIS:
            case CIAN:
            case '[':
            case '>':
            case EJECUTA:
            case '=':
            case '<':
            case BLANCO:
            case VERDE:
            case MAYORQUE:
            case AMARILLO:
            case ENDINPUT:
            case IGUALES:
            case PROCEDURE_NAME:
            case ROJO:
            case FIN:
            case PARA:
                return 727;
            case '*':
                return 178;
            case '+':
                return 179;
            case '-':
                return 180;
            case '/':
                return 181;
        }
        return yyr42();
    }

    private int yys80() {
        switch (yytok) {
            case GRIS:
            case '+':
            case '-':
            case AZUL:
            case MARRON:
            case EJECUTA:
            case NEGRO:
            case MENORQUE:
            case INTEGER:
            case IDENTIFIER:
            case ROJO:
            case FIN:
            case BLANCO:
            case '(':
            case '=':
            case '*':
            case error:
            case VERDE:
            case '<':
            case '[':
            case AMARILLO:
            case IGUALES:
            case CIAN:
            case PROCEDURE_NAME:
            case FLOAT:
            case ENDINPUT:
            case PARA:
            case MAYORQUE:
            case O:
            case Y:
            case PARAMETER:
            case '>':
            case '/':
                return 727;
        }
        return yyr149();
    }

    private int yys81() {
        switch (yytok) {
            case MARRON:
            case NEGRO:
            case MENORQUE:
            case AZUL:
            case O:
            case PARAMETER:
            case Y:
            case error:
            case GRIS:
            case CIAN:
            case '[':
            case '>':
            case EJECUTA:
            case '=':
            case '<':
            case BLANCO:
            case VERDE:
            case MAYORQUE:
            case AMARILLO:
            case ENDINPUT:
            case IGUALES:
            case PROCEDURE_NAME:
            case ROJO:
            case FIN:
            case PARA:
                return 727;
            case '*':
                return 182;
            case '+':
                return 183;
            case '-':
                return 184;
            case '/':
                return 185;
        }
        return yyr43();
    }

    private int yys82() {
        switch (yytok) {
            case MARRON:
            case NEGRO:
            case MENORQUE:
            case AZUL:
            case O:
            case PARAMETER:
            case Y:
            case error:
            case GRIS:
            case CIAN:
            case '[':
            case '>':
            case EJECUTA:
            case '=':
            case '<':
            case BLANCO:
            case VERDE:
            case MAYORQUE:
            case AMARILLO:
            case ENDINPUT:
            case IGUALES:
            case PROCEDURE_NAME:
            case ROJO:
            case FIN:
            case PARA:
                return 727;
            case '*':
                return 186;
            case '+':
                return 187;
            case '-':
                return 188;
            case '/':
                return 189;
        }
        return yyr41();
    }

    private int yys83() {
        switch (yytok) {
            case MARRON:
            case NEGRO:
            case MENORQUE:
            case AZUL:
            case O:
            case PARAMETER:
            case Y:
            case error:
            case GRIS:
            case CIAN:
            case '[':
            case '>':
            case EJECUTA:
            case '=':
            case '<':
            case BLANCO:
            case VERDE:
            case MAYORQUE:
            case AMARILLO:
            case ENDINPUT:
            case IGUALES:
            case PROCEDURE_NAME:
            case ROJO:
            case FIN:
            case PARA:
                return 727;
            case '*':
                return 190;
            case '+':
                return 191;
            case '-':
                return 192;
            case '/':
                return 193;
        }
        return yyr19();
    }

    private int yys84() {
        switch (yytok) {
            case GRIS:
            case '+':
            case '-':
            case AZUL:
            case MARRON:
            case EJECUTA:
            case NEGRO:
            case MENORQUE:
            case INTEGER:
            case IDENTIFIER:
            case ROJO:
            case FIN:
            case BLANCO:
            case '(':
            case '=':
            case '*':
            case error:
            case VERDE:
            case '<':
            case '[':
            case AMARILLO:
            case IGUALES:
            case CIAN:
            case PROCEDURE_NAME:
            case FLOAT:
            case ENDINPUT:
            case PARA:
            case MAYORQUE:
            case O:
            case Y:
            case PARAMETER:
            case '>':
            case '/':
                return 727;
        }
        return yyr148();
    }

    private int yys85() {
        switch (yytok) {
            case MARRON:
            case NEGRO:
            case MENORQUE:
            case AZUL:
            case O:
            case PARAMETER:
            case Y:
            case error:
            case GRIS:
            case CIAN:
            case '[':
            case '>':
            case EJECUTA:
            case '=':
            case '<':
            case BLANCO:
            case VERDE:
            case MAYORQUE:
            case AMARILLO:
            case ENDINPUT:
            case IGUALES:
            case PROCEDURE_NAME:
            case ROJO:
            case FIN:
            case PARA:
                return 727;
            case '*':
                return 194;
            case '+':
                return 195;
            case '-':
                return 196;
            case '/':
                return 197;
        }
        return yyr18();
    }

    private int yys86() {
        switch (yytok) {
            case PARA:
            case MENORQUE:
            case '[':
            case IGUALES:
            case error:
            case O:
            case VERDE:
            case '>':
            case GRIS:
            case FIN:
            case BLANCO:
            case EJECUTA:
            case PARAMETER:
            case '=':
            case '<':
            case Y:
            case NEGRO:
            case MARRON:
            case ROJO:
            case AZUL:
            case CIAN:
            case PROCEDURE_NAME:
            case AMARILLO:
            case ENDINPUT:
            case MAYORQUE:
                return 727;
        }
        return yyr40();
    }

    private int yys87() {
        switch (yytok) {
            case VERDE:
            case AZUL:
            case PROCEDURE_NAME:
            case EJECUTA:
            case PARA:
            case FIN:
            case MARRON:
            case GRIS:
            case ROJO:
            case '=':
            case PARAMETER:
            case BLANCO:
            case AMARILLO:
            case CIAN:
            case NEGRO:
            case error:
            case ENDINPUT:
                return 727;
        }
        return yyr57();
    }

    private int yys89() {
        switch (yytok) {
            case AZUL:
            case '-':
            case '/':
            case GRIS:
            case O:
            case PARAMETER:
            case error:
            case MAYORQUE:
            case AMARILLO:
            case CIAN:
            case '[':
            case BLANCO:
            case EJECUTA:
            case '=':
            case '<':
            case NEGRO:
            case VERDE:
            case '+':
            case '>':
            case ENDINPUT:
            case IGUALES:
            case PROCEDURE_NAME:
            case ROJO:
            case FIN:
            case PARA:
            case MARRON:
            case MENORQUE:
            case Y:
            case '*':
                return 727;
        }
        return yyr108();
    }

    private int yys90() {
        switch (yytok) {
            case AZUL:
            case '-':
            case '/':
            case GRIS:
            case O:
            case PARAMETER:
            case error:
            case MAYORQUE:
            case AMARILLO:
            case CIAN:
            case '[':
            case BLANCO:
            case EJECUTA:
            case '=':
            case '<':
            case NEGRO:
            case VERDE:
            case '+':
            case '>':
            case ENDINPUT:
            case IGUALES:
            case PROCEDURE_NAME:
            case ROJO:
            case FIN:
            case PARA:
            case MARRON:
            case MENORQUE:
            case Y:
            case '*':
                return 727;
        }
        return yyr107();
    }

    private int yys91() {
        switch (yytok) {
            case GRIS:
            case '+':
            case '-':
            case AZUL:
            case MARRON:
            case EJECUTA:
            case NEGRO:
            case MENORQUE:
            case INTEGER:
            case IDENTIFIER:
            case ROJO:
            case FIN:
            case BLANCO:
            case '(':
            case '=':
            case '*':
            case error:
            case VERDE:
            case '<':
            case '[':
            case AMARILLO:
            case IGUALES:
            case CIAN:
            case PROCEDURE_NAME:
            case FLOAT:
            case ENDINPUT:
            case PARA:
            case MAYORQUE:
            case O:
            case Y:
            case PARAMETER:
            case '>':
            case '/':
                return 727;
        }
        return yyr152();
    }

    private int yys92() {
        switch (yytok) {
            case AZAR:
                return 21;
            case COS:
                return 26;
            case CUENTA:
                return 27;
            case DIFERENCIA:
                return 28;
            case DIVISION:
                return 29;
            case ELEGIR:
                return 30;
            case ELEMENTO:
                return 31;
            case MENOS:
                return 39;
            case POTENCIA:
                return 49;
            case PRIMERO:
                return 50;
            case PRODUCTO:
                return 51;
            case RAIZCUADRADA:
                return 52;
            case RC:
                return 53;
            case REDONDEA:
                return 55;
            case RESTO:
                return 57;
            case SEN:
                return 61;
            case SENO:
                return 62;
            case SUMA:
                return 65;
            case UL:
                return 66;
            case ULTIMO:
                return 67;
            case IDENTIFIER:
                return 75;
            case INTEGER:
                return 76;
            case FLOAT:
                return 87;
            case '(':
                return 88;
        }
        return 727;
    }

    private int yys94() {
        switch (yytok) {
            case Y:
            case '+':
            case '=':
            case PARAMETER:
            case MARRON:
            case EJECUTA:
            case GRIS:
            case '-':
            case '>':
            case '/':
            case ROJO:
            case FIN:
            case BLANCO:
            case error:
            case NEGRO:
            case '*':
            case MENORQUE:
            case VERDE:
            case '<':
            case '[':
            case AMARILLO:
            case AZUL:
            case CIAN:
            case PROCEDURE_NAME:
            case IGUALES:
            case ENDINPUT:
            case PARA:
            case MAYORQUE:
            case O:
                return 727;
            case IDENTIFIER:
                return 75;
            case INTEGER:
                return 76;
            case FLOAT:
                return 87;
            case '(':
                return 141;
        }
        return yyr108();
    }

    private int yys95() {
        switch (yytok) {
            case error:
            case '/':
            case '=':
            case PARAMETER:
            case PARA:
            case '+':
            case PROCEDURE_NAME:
            case '-':
            case '>':
            case GRIS:
            case ROJO:
            case MARRON:
            case O:
            case EJECUTA:
            case NEGRO:
            case '*':
            case MENORQUE:
            case VERDE:
            case '<':
            case '[':
            case AMARILLO:
            case AZUL:
            case CIAN:
            case IGUALES:
            case ENDINPUT:
            case FIN:
            case MAYORQUE:
            case BLANCO:
            case Y:
                return 727;
            case IDENTIFIER:
                return 75;
            case INTEGER:
                return 76;
            case '(':
                return 77;
        }
        return yyr107();
    }

    private int yys96() {
        switch (yytok) {
            case GRIS:
            case '+':
            case '-':
            case AZUL:
            case MARRON:
            case EJECUTA:
            case NEGRO:
            case MENORQUE:
            case INTEGER:
            case IDENTIFIER:
            case ROJO:
            case FIN:
            case BLANCO:
            case '(':
            case '=':
            case '*':
            case error:
            case VERDE:
            case '<':
            case '[':
            case AMARILLO:
            case IGUALES:
            case CIAN:
            case PROCEDURE_NAME:
            case FLOAT:
            case ENDINPUT:
            case PARA:
            case MAYORQUE:
            case O:
            case Y:
            case PARAMETER:
            case '>':
            case '/':
                return 727;
        }
        return yyr173();
    }

    private int yys97() {
        switch (yytok) {
            case GRIS:
            case '+':
            case '-':
            case AZUL:
            case MARRON:
            case EJECUTA:
            case NEGRO:
            case MENORQUE:
            case INTEGER:
            case IDENTIFIER:
            case ROJO:
            case FIN:
            case BLANCO:
            case '(':
            case '=':
            case '*':
            case error:
            case VERDE:
            case '<':
            case '[':
            case AMARILLO:
            case IGUALES:
            case CIAN:
            case PROCEDURE_NAME:
            case FLOAT:
            case ENDINPUT:
            case PARA:
            case MAYORQUE:
            case O:
            case Y:
            case PARAMETER:
            case '>':
            case '/':
                return 727;
        }
        return yyr172();
    }

    private int yys98() {
        switch (yytok) {
            case GRIS:
            case '+':
            case '-':
            case AZUL:
            case MARRON:
            case EJECUTA:
            case NEGRO:
            case MENORQUE:
            case INTEGER:
            case IDENTIFIER:
            case ROJO:
            case FIN:
            case BLANCO:
            case '(':
            case '=':
            case '*':
            case error:
            case VERDE:
            case '<':
            case '[':
            case AMARILLO:
            case IGUALES:
            case CIAN:
            case PROCEDURE_NAME:
            case FLOAT:
            case ENDINPUT:
            case PARA:
            case MAYORQUE:
            case O:
            case Y:
            case PARAMETER:
            case '>':
            case '/':
                return 727;
        }
        return yyr171();
    }

    private int yys99() {
        switch (yytok) {
            case Y:
            case '+':
            case '=':
            case PARAMETER:
            case MARRON:
            case EJECUTA:
            case GRIS:
            case '-':
            case '>':
            case '/':
            case ROJO:
            case FIN:
            case BLANCO:
            case error:
            case NEGRO:
            case '*':
            case MENORQUE:
            case VERDE:
            case '<':
            case '[':
            case AMARILLO:
            case AZUL:
            case CIAN:
            case PROCEDURE_NAME:
            case IGUALES:
            case ENDINPUT:
            case PARA:
            case MAYORQUE:
            case O:
                return 727;
            case IDENTIFIER:
                return 75;
            case INTEGER:
                return 76;
            case FLOAT:
                return 87;
            case '(':
                return 92;
        }
        return yyr164();
    }

    private int yys103() {
        switch (yytok) {
            case AZUL:
            case EJECUTA:
            case MENORQUE:
            case IDENTIFIER:
            case FIN:
            case '(':
            case ')':
            case VERDE:
            case '[':
            case IGUALES:
            case GRIS:
            case INTEGER:
            case '-':
            case NEGRO:
            case '=':
            case '*':
            case error:
            case Y:
            case MAYORQUE:
            case MARRON:
            case ENDINPUT:
            case ROJO:
            case CIAN:
            case PROCEDURE_NAME:
            case AMARILLO:
            case FLOAT:
            case '<':
            case PARA:
            case BLANCO:
            case O:
            case PARAMETER:
            case '>':
            case '/':
            case '+':
                return 727;
        }
        return yyr146();
    }

    private int yys104() {
        switch (yytok) {
            case AZUL:
            case EJECUTA:
            case MENORQUE:
            case IDENTIFIER:
            case FIN:
            case '(':
            case ')':
            case VERDE:
            case '[':
            case IGUALES:
            case GRIS:
            case INTEGER:
            case '-':
            case NEGRO:
            case '=':
            case '*':
            case error:
            case Y:
            case MAYORQUE:
            case MARRON:
            case ENDINPUT:
            case ROJO:
            case CIAN:
            case PROCEDURE_NAME:
            case AMARILLO:
            case FLOAT:
            case '<':
            case PARA:
            case BLANCO:
            case O:
            case PARAMETER:
            case '>':
            case '/':
            case '+':
                return 727;
        }
        return yyr138();
    }

    private int yys105() {
        switch (yytok) {
            case AZUL:
            case EJECUTA:
            case MENORQUE:
            case IDENTIFIER:
            case FIN:
            case '(':
            case ')':
            case VERDE:
            case '[':
            case IGUALES:
            case GRIS:
            case INTEGER:
            case '-':
            case NEGRO:
            case '=':
            case '*':
            case error:
            case Y:
            case MAYORQUE:
            case MARRON:
            case ENDINPUT:
            case ROJO:
            case CIAN:
            case PROCEDURE_NAME:
            case AMARILLO:
            case FLOAT:
            case '<':
            case PARA:
            case BLANCO:
            case O:
            case PARAMETER:
            case '>':
            case '/':
            case '+':
                return 727;
        }
        return yyr140();
    }

    private int yys106() {
        switch (yytok) {
            case AZUL:
            case EJECUTA:
            case MENORQUE:
            case IDENTIFIER:
            case FIN:
            case '(':
            case ')':
            case VERDE:
            case '[':
            case IGUALES:
            case GRIS:
            case INTEGER:
            case '-':
            case NEGRO:
            case '=':
            case '*':
            case error:
            case Y:
            case MAYORQUE:
            case MARRON:
            case ENDINPUT:
            case ROJO:
            case CIAN:
            case PROCEDURE_NAME:
            case AMARILLO:
            case FLOAT:
            case '<':
            case PARA:
            case BLANCO:
            case O:
            case PARAMETER:
            case '>':
            case '/':
            case '+':
                return 727;
        }
        return yyr137();
    }

    private int yys107() {
        switch (yytok) {
            case AZUL:
            case EJECUTA:
            case MENORQUE:
            case IDENTIFIER:
            case FIN:
            case '(':
            case ')':
            case VERDE:
            case '[':
            case IGUALES:
            case GRIS:
            case INTEGER:
            case '-':
            case NEGRO:
            case '=':
            case '*':
            case error:
            case Y:
            case MAYORQUE:
            case MARRON:
            case ENDINPUT:
            case ROJO:
            case CIAN:
            case PROCEDURE_NAME:
            case AMARILLO:
            case FLOAT:
            case '<':
            case PARA:
            case BLANCO:
            case O:
            case PARAMETER:
            case '>':
            case '/':
            case '+':
                return 727;
        }
        return yyr139();
    }

    private int yys110() {
        switch (yytok) {
            case GRIS:
            case '+':
            case '-':
            case AZUL:
            case MARRON:
            case EJECUTA:
            case NEGRO:
            case MENORQUE:
            case INTEGER:
            case IDENTIFIER:
            case ROJO:
            case FIN:
            case BLANCO:
            case '(':
            case '=':
            case '*':
            case error:
            case VERDE:
            case '<':
            case '[':
            case AMARILLO:
            case IGUALES:
            case CIAN:
            case PROCEDURE_NAME:
            case FLOAT:
            case ENDINPUT:
            case PARA:
            case MAYORQUE:
            case O:
            case Y:
            case PARAMETER:
            case '>':
            case '/':
                return 727;
        }
        return yyr151();
    }

    private int yys111() {
        switch (yytok) {
            case GRIS:
            case '+':
            case '-':
            case AZUL:
            case MARRON:
            case EJECUTA:
            case NEGRO:
            case MENORQUE:
            case INTEGER:
            case IDENTIFIER:
            case ROJO:
            case FIN:
            case BLANCO:
            case '(':
            case '=':
            case '*':
            case error:
            case VERDE:
            case '<':
            case '[':
            case AMARILLO:
            case IGUALES:
            case CIAN:
            case PROCEDURE_NAME:
            case FLOAT:
            case ENDINPUT:
            case PARA:
            case MAYORQUE:
            case O:
            case Y:
            case PARAMETER:
            case '>':
            case '/':
                return 727;
        }
        return yyr150();
    }

    private int yys112() {
        switch (yytok) {
            case AZUL:
            case EJECUTA:
            case MENORQUE:
            case IDENTIFIER:
            case FIN:
            case '(':
            case ')':
            case VERDE:
            case '[':
            case IGUALES:
            case GRIS:
            case INTEGER:
            case '-':
            case NEGRO:
            case '=':
            case '*':
            case error:
            case Y:
            case MAYORQUE:
            case MARRON:
            case ENDINPUT:
            case ROJO:
            case CIAN:
            case PROCEDURE_NAME:
            case AMARILLO:
            case FLOAT:
            case '<':
            case PARA:
            case BLANCO:
            case O:
            case PARAMETER:
            case '>':
            case '/':
            case '+':
                return 727;
        }
        return yyr145();
    }

    private int yys113() {
        switch (yytok) {
            case AZUL:
            case EJECUTA:
            case MENORQUE:
            case IDENTIFIER:
            case FIN:
            case '(':
            case ')':
            case VERDE:
            case '[':
            case IGUALES:
            case GRIS:
            case INTEGER:
            case '-':
            case NEGRO:
            case '=':
            case '*':
            case error:
            case Y:
            case MAYORQUE:
            case MARRON:
            case ENDINPUT:
            case ROJO:
            case CIAN:
            case PROCEDURE_NAME:
            case AMARILLO:
            case FLOAT:
            case '<':
            case PARA:
            case BLANCO:
            case O:
            case PARAMETER:
            case '>':
            case '/':
            case '+':
                return 727;
        }
        return yyr118();
    }

    private int yys114() {
        switch (yytok) {
            case AZUL:
            case EJECUTA:
            case MENORQUE:
            case IDENTIFIER:
            case FIN:
            case '(':
            case ')':
            case VERDE:
            case '[':
            case IGUALES:
            case GRIS:
            case INTEGER:
            case '-':
            case NEGRO:
            case '=':
            case '*':
            case error:
            case Y:
            case MAYORQUE:
            case MARRON:
            case ENDINPUT:
            case ROJO:
            case CIAN:
            case PROCEDURE_NAME:
            case AMARILLO:
            case FLOAT:
            case '<':
            case PARA:
            case BLANCO:
            case O:
            case PARAMETER:
            case '>':
            case '/':
            case '+':
                return 727;
        }
        return yyr114();
    }

    private int yys115() {
        switch (yytok) {
            case AZUL:
            case EJECUTA:
            case MENORQUE:
            case IDENTIFIER:
            case FIN:
            case '(':
            case ')':
            case VERDE:
            case '[':
            case IGUALES:
            case GRIS:
            case INTEGER:
            case '-':
            case NEGRO:
            case '=':
            case '*':
            case error:
            case Y:
            case MAYORQUE:
            case MARRON:
            case ENDINPUT:
            case ROJO:
            case CIAN:
            case PROCEDURE_NAME:
            case AMARILLO:
            case FLOAT:
            case '<':
            case PARA:
            case BLANCO:
            case O:
            case PARAMETER:
            case '>':
            case '/':
            case '+':
                return 727;
        }
        return yyr113();
    }

    private int yys116() {
        switch (yytok) {
            case AZUL:
            case EJECUTA:
            case MENORQUE:
            case IDENTIFIER:
            case FIN:
            case '(':
            case ')':
            case VERDE:
            case '[':
            case IGUALES:
            case GRIS:
            case INTEGER:
            case '-':
            case NEGRO:
            case '=':
            case '*':
            case error:
            case Y:
            case MAYORQUE:
            case MARRON:
            case ENDINPUT:
            case ROJO:
            case CIAN:
            case PROCEDURE_NAME:
            case AMARILLO:
            case FLOAT:
            case '<':
            case PARA:
            case BLANCO:
            case O:
            case PARAMETER:
            case '>':
            case '/':
            case '+':
                return 727;
        }
        return yyr116();
    }

    private int yys117() {
        switch (yytok) {
            case AZUL:
            case EJECUTA:
            case MENORQUE:
            case IDENTIFIER:
            case FIN:
            case '(':
            case ')':
            case VERDE:
            case '[':
            case IGUALES:
            case GRIS:
            case INTEGER:
            case '-':
            case NEGRO:
            case '=':
            case '*':
            case error:
            case Y:
            case MAYORQUE:
            case MARRON:
            case ENDINPUT:
            case ROJO:
            case CIAN:
            case PROCEDURE_NAME:
            case AMARILLO:
            case FLOAT:
            case '<':
            case PARA:
            case BLANCO:
            case O:
            case PARAMETER:
            case '>':
            case '/':
            case '+':
                return 727;
        }
        return yyr117();
    }

    private int yys118() {
        switch (yytok) {
            case AZUL:
            case EJECUTA:
            case MENORQUE:
            case IDENTIFIER:
            case FIN:
            case '(':
            case ')':
            case VERDE:
            case '[':
            case IGUALES:
            case GRIS:
            case INTEGER:
            case '-':
            case NEGRO:
            case '=':
            case '*':
            case error:
            case Y:
            case MAYORQUE:
            case MARRON:
            case ENDINPUT:
            case ROJO:
            case CIAN:
            case PROCEDURE_NAME:
            case AMARILLO:
            case FLOAT:
            case '<':
            case PARA:
            case BLANCO:
            case O:
            case PARAMETER:
            case '>':
            case '/':
            case '+':
                return 727;
        }
        return yyr115();
    }

    private int yys119() {
        switch (yytok) {
            case AZUL:
            case EJECUTA:
            case MENORQUE:
            case IDENTIFIER:
            case FIN:
            case '(':
            case ')':
            case VERDE:
            case '[':
            case IGUALES:
            case GRIS:
            case INTEGER:
            case '-':
            case NEGRO:
            case '=':
            case '*':
            case error:
            case Y:
            case MAYORQUE:
            case MARRON:
            case ENDINPUT:
            case ROJO:
            case CIAN:
            case PROCEDURE_NAME:
            case AMARILLO:
            case FLOAT:
            case '<':
            case PARA:
            case BLANCO:
            case O:
            case PARAMETER:
            case '>':
            case '/':
            case '+':
                return 727;
        }
        return yyr119();
    }

    private int yys120() {
        switch (yytok) {
            case AZUL:
            case EJECUTA:
            case MENORQUE:
            case IDENTIFIER:
            case FIN:
            case '(':
            case ')':
            case VERDE:
            case '[':
            case IGUALES:
            case GRIS:
            case INTEGER:
            case '-':
            case NEGRO:
            case '=':
            case '*':
            case error:
            case Y:
            case MAYORQUE:
            case MARRON:
            case ENDINPUT:
            case ROJO:
            case CIAN:
            case PROCEDURE_NAME:
            case AMARILLO:
            case FLOAT:
            case '<':
            case PARA:
            case BLANCO:
            case O:
            case PARAMETER:
            case '>':
            case '/':
            case '+':
                return 727;
        }
        return yyr120();
    }

    private int yys121() {
        switch (yytok) {
            case AZUL:
            case EJECUTA:
            case MENORQUE:
            case IDENTIFIER:
            case FIN:
            case '(':
            case ')':
            case VERDE:
            case '[':
            case IGUALES:
            case GRIS:
            case INTEGER:
            case '-':
            case NEGRO:
            case '=':
            case '*':
            case error:
            case Y:
            case MAYORQUE:
            case MARRON:
            case ENDINPUT:
            case ROJO:
            case CIAN:
            case PROCEDURE_NAME:
            case AMARILLO:
            case FLOAT:
            case '<':
            case PARA:
            case BLANCO:
            case O:
            case PARAMETER:
            case '>':
            case '/':
            case '+':
                return 727;
        }
        return yyr121();
    }

    private int yys122() {
        switch (yytok) {
            case AZUL:
            case EJECUTA:
            case MENORQUE:
            case IDENTIFIER:
            case FIN:
            case '(':
            case ')':
            case VERDE:
            case '[':
            case IGUALES:
            case GRIS:
            case INTEGER:
            case '-':
            case NEGRO:
            case '=':
            case '*':
            case error:
            case Y:
            case MAYORQUE:
            case MARRON:
            case ENDINPUT:
            case ROJO:
            case CIAN:
            case PROCEDURE_NAME:
            case AMARILLO:
            case FLOAT:
            case '<':
            case PARA:
            case BLANCO:
            case O:
            case PARAMETER:
            case '>':
            case '/':
            case '+':
                return 727;
        }
        return yyr144();
    }

    private int yys124() {
        switch (yytok) {
            case AZUL:
            case EJECUTA:
            case MENORQUE:
            case IDENTIFIER:
            case FIN:
            case '(':
            case ')':
            case VERDE:
            case '[':
            case IGUALES:
            case GRIS:
            case INTEGER:
            case '-':
            case NEGRO:
            case '=':
            case '*':
            case error:
            case Y:
            case MAYORQUE:
            case MARRON:
            case ENDINPUT:
            case ROJO:
            case CIAN:
            case PROCEDURE_NAME:
            case AMARILLO:
            case FLOAT:
            case '<':
            case PARA:
            case BLANCO:
            case O:
            case PARAMETER:
            case '>':
            case '/':
            case '+':
                return 727;
        }
        return yyr141();
    }

    private int yys125() {
        switch (yytok) {
            case AZUL:
            case EJECUTA:
            case MENORQUE:
            case IDENTIFIER:
            case FIN:
            case '(':
            case ')':
            case VERDE:
            case '[':
            case IGUALES:
            case GRIS:
            case INTEGER:
            case '-':
            case NEGRO:
            case '=':
            case '*':
            case error:
            case Y:
            case MAYORQUE:
            case MARRON:
            case ENDINPUT:
            case ROJO:
            case CIAN:
            case PROCEDURE_NAME:
            case AMARILLO:
            case FLOAT:
            case '<':
            case PARA:
            case BLANCO:
            case O:
            case PARAMETER:
            case '>':
            case '/':
            case '+':
                return 727;
        }
        return yyr142();
    }

    private int yys127() {
        switch (yytok) {
            case AZUL:
            case EJECUTA:
            case MENORQUE:
            case IDENTIFIER:
            case FIN:
            case '(':
            case ')':
            case VERDE:
            case '[':
            case IGUALES:
            case GRIS:
            case INTEGER:
            case '-':
            case NEGRO:
            case '=':
            case '*':
            case error:
            case Y:
            case MAYORQUE:
            case MARRON:
            case ENDINPUT:
            case ROJO:
            case CIAN:
            case PROCEDURE_NAME:
            case AMARILLO:
            case FLOAT:
            case '<':
            case PARA:
            case BLANCO:
            case O:
            case PARAMETER:
            case '>':
            case '/':
            case '+':
                return 727;
        }
        return yyr143();
    }

    private int yys132() {
        switch (yytok) {
            case GRIS:
            case '+':
            case '-':
            case AZUL:
            case MARRON:
            case EJECUTA:
            case NEGRO:
            case MENORQUE:
            case INTEGER:
            case IDENTIFIER:
            case ROJO:
            case FIN:
            case BLANCO:
            case '(':
            case '=':
            case '*':
            case error:
            case VERDE:
            case '<':
            case '[':
            case AMARILLO:
            case IGUALES:
            case CIAN:
            case PROCEDURE_NAME:
            case FLOAT:
            case ENDINPUT:
            case PARA:
            case MAYORQUE:
            case O:
            case Y:
            case PARAMETER:
            case '>':
            case '/':
                return 727;
        }
        return yyr176();
    }

    private int yys133() {
        switch (yytok) {
            case GRIS:
            case '+':
            case '-':
            case AZUL:
            case MARRON:
            case EJECUTA:
            case NEGRO:
            case MENORQUE:
            case INTEGER:
            case IDENTIFIER:
            case ROJO:
            case FIN:
            case BLANCO:
            case '(':
            case '=':
            case '*':
            case error:
            case VERDE:
            case '<':
            case '[':
            case AMARILLO:
            case IGUALES:
            case CIAN:
            case PROCEDURE_NAME:
            case FLOAT:
            case ENDINPUT:
            case PARA:
            case MAYORQUE:
            case O:
            case Y:
            case PARAMETER:
            case '>':
            case '/':
                return 727;
        }
        return yyr175();
    }

    private int yys134() {
        switch (yytok) {
            case GRIS:
            case '+':
            case '-':
            case AZUL:
            case MARRON:
            case EJECUTA:
            case NEGRO:
            case MENORQUE:
            case INTEGER:
            case IDENTIFIER:
            case ROJO:
            case FIN:
            case BLANCO:
            case '(':
            case '=':
            case '*':
            case error:
            case VERDE:
            case '<':
            case '[':
            case AMARILLO:
            case IGUALES:
            case CIAN:
            case PROCEDURE_NAME:
            case FLOAT:
            case ENDINPUT:
            case PARA:
            case MAYORQUE:
            case O:
            case Y:
            case PARAMETER:
            case '>':
            case '/':
                return 727;
        }
        return yyr174();
    }

    private int yys135() {
        switch (yytok) {
            case GRIS:
            case '+':
            case '-':
            case AZUL:
            case MARRON:
            case EJECUTA:
            case NEGRO:
            case MENORQUE:
            case INTEGER:
            case IDENTIFIER:
            case ROJO:
            case FIN:
            case BLANCO:
            case '(':
            case '=':
            case '*':
            case error:
            case VERDE:
            case '<':
            case '[':
            case AMARILLO:
            case IGUALES:
            case CIAN:
            case PROCEDURE_NAME:
            case FLOAT:
            case ENDINPUT:
            case PARA:
            case MAYORQUE:
            case O:
            case Y:
            case PARAMETER:
            case '>':
            case '/':
                return 727;
        }
        return yyr153();
    }

    private int yys136() {
        switch (yytok) {
            case GRIS:
            case '+':
            case '-':
            case AZUL:
            case MARRON:
            case EJECUTA:
            case NEGRO:
            case MENORQUE:
            case INTEGER:
            case IDENTIFIER:
            case ROJO:
            case FIN:
            case BLANCO:
            case '(':
            case '=':
            case '*':
            case error:
            case VERDE:
            case '<':
            case '[':
            case AMARILLO:
            case IGUALES:
            case CIAN:
            case PROCEDURE_NAME:
            case FLOAT:
            case ENDINPUT:
            case PARA:
            case MAYORQUE:
            case O:
            case Y:
            case PARAMETER:
            case '>':
            case '/':
                return 727;
        }
        return yyr154();
    }

    private int yys137() {
        switch (yytok) {
            case AZUL:
            case EJECUTA:
            case MENORQUE:
            case IDENTIFIER:
            case FIN:
            case '(':
            case ')':
            case VERDE:
            case '[':
            case IGUALES:
            case GRIS:
            case INTEGER:
            case '-':
            case NEGRO:
            case '=':
            case '*':
            case error:
            case Y:
            case MAYORQUE:
            case MARRON:
            case ENDINPUT:
            case ROJO:
            case CIAN:
            case PROCEDURE_NAME:
            case AMARILLO:
            case FLOAT:
            case '<':
            case PARA:
            case BLANCO:
            case O:
            case PARAMETER:
            case '>':
            case '/':
            case '+':
                return 727;
        }
        return yyr136();
    }

    private int yys138() {
        switch (yytok) {
            case GRIS:
            case '+':
            case '-':
            case AZUL:
            case MARRON:
            case EJECUTA:
            case NEGRO:
            case MENORQUE:
            case INTEGER:
            case IDENTIFIER:
            case ROJO:
            case FIN:
            case BLANCO:
            case '(':
            case '=':
            case '*':
            case error:
            case VERDE:
            case '<':
            case '[':
            case AMARILLO:
            case IGUALES:
            case CIAN:
            case PROCEDURE_NAME:
            case FLOAT:
            case ENDINPUT:
            case PARA:
            case MAYORQUE:
            case O:
            case Y:
            case PARAMETER:
            case '>':
            case '/':
                return 727;
        }
        return yyr147();
    }

    private int yys140() {
        switch (yytok) {
            case PARA:
            case MENORQUE:
            case '[':
            case IGUALES:
            case error:
            case O:
            case VERDE:
            case '>':
            case GRIS:
            case FIN:
            case BLANCO:
            case EJECUTA:
            case PARAMETER:
            case '=':
            case '<':
            case Y:
            case NEGRO:
            case MARRON:
            case ROJO:
            case AZUL:
            case CIAN:
            case PROCEDURE_NAME:
            case AMARILLO:
            case ENDINPUT:
            case MAYORQUE:
                return 727;
        }
        return yyr79();
    }

    private int yys144() {
        switch (yytok) {
            case AZUL:
            case EJECUTA:
            case MENORQUE:
            case IDENTIFIER:
            case FIN:
            case '(':
            case ')':
            case VERDE:
            case '[':
            case IGUALES:
            case GRIS:
            case INTEGER:
            case '-':
            case NEGRO:
            case '=':
            case '*':
            case error:
            case Y:
            case MAYORQUE:
            case MARRON:
            case ENDINPUT:
            case ROJO:
            case CIAN:
            case PROCEDURE_NAME:
            case AMARILLO:
            case FLOAT:
            case '<':
            case PARA:
            case BLANCO:
            case O:
            case PARAMETER:
            case '>':
            case '/':
            case '+':
                return 727;
        }
        return yyr135();
    }

    private int yys145() {
        switch (yytok) {
            case GRIS:
            case '+':
            case '-':
            case AZUL:
            case MARRON:
            case EJECUTA:
            case NEGRO:
            case MENORQUE:
            case INTEGER:
            case IDENTIFIER:
            case ROJO:
            case FIN:
            case BLANCO:
            case '(':
            case '=':
            case '*':
            case error:
            case VERDE:
            case '<':
            case '[':
            case AMARILLO:
            case IGUALES:
            case CIAN:
            case PROCEDURE_NAME:
            case FLOAT:
            case ENDINPUT:
            case PARA:
            case MAYORQUE:
            case O:
            case Y:
            case PARAMETER:
            case '>':
            case '/':
                return 727;
        }
        return yyr156();
    }

    private int yys146() {
        switch (yytok) {
            case GRIS:
            case '+':
            case '-':
            case AZUL:
            case MARRON:
            case EJECUTA:
            case NEGRO:
            case MENORQUE:
            case INTEGER:
            case IDENTIFIER:
            case ROJO:
            case FIN:
            case BLANCO:
            case '(':
            case '=':
            case '*':
            case error:
            case VERDE:
            case '<':
            case '[':
            case AMARILLO:
            case IGUALES:
            case CIAN:
            case PROCEDURE_NAME:
            case FLOAT:
            case ENDINPUT:
            case PARA:
            case MAYORQUE:
            case O:
            case Y:
            case PARAMETER:
            case '>':
            case '/':
                return 727;
        }
        return yyr155();
    }

    private int yys148() {
        switch (yytok) {
            case '*':
                return 186;
            case '+':
                return 187;
            case '-':
                return 188;
            case '/':
                return 189;
            case '<':
                return 235;
            case '>':
                return 236;
        }
        return 727;
    }

    private int yys149() {
        switch (yytok) {
            case '*':
                return 194;
            case '+':
                return 195;
            case '-':
                return 196;
            case '/':
                return 197;
            case '<':
                return 237;
            case '>':
                return 238;
        }
        return 727;
    }

    private int yys153() {
        switch (yytok) {
            case INTEGER:
                return 76;
            case FLOAT:
                return 87;
            case IGUALES:
                return 150;
            case MAYORQUE:
                return 151;
            case MENORQUE:
                return 152;
            case O:
                return 153;
            case Y:
                return 154;
            case '(':
                return 155;
        }
        return 727;
    }

    private int yys154() {
        switch (yytok) {
            case INTEGER:
                return 76;
            case FLOAT:
                return 87;
            case IGUALES:
                return 150;
            case MAYORQUE:
                return 151;
            case MENORQUE:
                return 152;
            case O:
                return 153;
            case Y:
                return 154;
            case '(':
                return 155;
        }
        return 727;
    }

    private int yys156() {
        switch (yytok) {
            case GRIS:
            case '+':
            case '-':
            case AZUL:
            case MARRON:
            case EJECUTA:
            case NEGRO:
            case MENORQUE:
            case INTEGER:
            case IDENTIFIER:
            case ROJO:
            case FIN:
            case BLANCO:
            case '(':
            case '=':
            case '*':
            case error:
            case VERDE:
            case '<':
            case '[':
            case AMARILLO:
            case IGUALES:
            case CIAN:
            case PROCEDURE_NAME:
            case FLOAT:
            case ENDINPUT:
            case PARA:
            case MAYORQUE:
            case O:
            case Y:
            case PARAMETER:
            case '>':
            case '/':
                return 727;
        }
        return yyr179();
    }

    private int yys157() {
        switch (yytok) {
            case GRIS:
            case '+':
            case '-':
            case AZUL:
            case MARRON:
            case EJECUTA:
            case NEGRO:
            case MENORQUE:
            case INTEGER:
            case IDENTIFIER:
            case ROJO:
            case FIN:
            case BLANCO:
            case '(':
            case '=':
            case '*':
            case error:
            case VERDE:
            case '<':
            case '[':
            case AMARILLO:
            case IGUALES:
            case CIAN:
            case PROCEDURE_NAME:
            case FLOAT:
            case ENDINPUT:
            case PARA:
            case MAYORQUE:
            case O:
            case Y:
            case PARAMETER:
            case '>':
            case '/':
                return 727;
        }
        return yyr178();
    }

    private int yys158() {
        switch (yytok) {
            case GRIS:
            case '+':
            case '-':
            case AZUL:
            case MARRON:
            case EJECUTA:
            case NEGRO:
            case MENORQUE:
            case INTEGER:
            case IDENTIFIER:
            case ROJO:
            case FIN:
            case BLANCO:
            case '(':
            case '=':
            case '*':
            case error:
            case VERDE:
            case '<':
            case '[':
            case AMARILLO:
            case IGUALES:
            case CIAN:
            case PROCEDURE_NAME:
            case FLOAT:
            case ENDINPUT:
            case PARA:
            case MAYORQUE:
            case O:
            case Y:
            case PARAMETER:
            case '>':
            case '/':
                return 727;
        }
        return yyr177();
    }

    private int yys161() {
        switch (yytok) {
            case '+':
            case EJECUTA:
            case MENORQUE:
            case AZUL:
            case FIN:
            case '(':
            case ')':
            case VERDE:
            case IDENTIFIER:
            case IGUALES:
            case GRIS:
            case INTEGER:
            case '-':
            case NEGRO:
            case PARA:
            case '*':
            case error:
            case Y:
            case MAYORQUE:
            case '[':
            case ENDINPUT:
            case ROJO:
            case CIAN:
            case PROCEDURE_NAME:
            case AMARILLO:
            case FLOAT:
            case '<':
            case MARRON:
            case BLANCO:
            case O:
            case PARAMETER:
            case '>':
            case '/':
                return 727;
            case '=':
                return 253;
        }
        return yyr110();
    }

    private int yys210() {
        switch (yytok) {
            case Y:
            case '+':
            case '=':
            case PARAMETER:
            case MARRON:
            case EJECUTA:
            case GRIS:
            case '-':
            case '>':
            case '/':
            case ROJO:
            case FIN:
            case BLANCO:
            case error:
            case NEGRO:
            case '*':
            case MENORQUE:
            case VERDE:
            case '<':
            case '[':
            case AMARILLO:
            case AZUL:
            case CIAN:
            case PROCEDURE_NAME:
            case IGUALES:
            case ENDINPUT:
            case PARA:
            case MAYORQUE:
            case O:
                return 727;
            case IDENTIFIER:
                return 75;
            case INTEGER:
                return 76;
            case FLOAT:
                return 87;
            case '(':
                return 141;
        }
        return yyr168();
    }

    private int yys211() {
        switch (yytok) {
            case GRIS:
            case '+':
            case '-':
            case AZUL:
            case MARRON:
            case EJECUTA:
            case NEGRO:
            case MENORQUE:
            case INTEGER:
            case IDENTIFIER:
            case ROJO:
            case FIN:
            case BLANCO:
            case '(':
            case '=':
            case '*':
            case error:
            case VERDE:
            case '<':
            case '[':
            case AMARILLO:
            case IGUALES:
            case CIAN:
            case PROCEDURE_NAME:
            case FLOAT:
            case ENDINPUT:
            case PARA:
            case MAYORQUE:
            case O:
            case Y:
            case PARAMETER:
            case '>':
            case '/':
                return 727;
        }
        return yyr167();
    }

    private int yys212() {
        switch (yytok) {
            case PARAMETER:
            case '+':
            case '/':
            case '=':
            case MARRON:
            case EJECUTA:
            case GRIS:
            case '-':
            case '>':
            case AZUL:
            case ROJO:
            case FIN:
            case BLANCO:
            case error:
            case NEGRO:
            case '*':
            case MENORQUE:
            case VERDE:
            case '<':
            case '[':
            case AMARILLO:
            case IGUALES:
            case CIAN:
            case PROCEDURE_NAME:
            case FLOAT:
            case ENDINPUT:
            case PARA:
            case MAYORQUE:
            case O:
            case Y:
                return 727;
            case IDENTIFIER:
                return 75;
            case INTEGER:
                return 76;
            case '(':
                return 77;
        }
        return yyr166();
    }

    private int yys213() {
        switch (yytok) {
            case GRIS:
            case '+':
            case '-':
            case AZUL:
            case MARRON:
            case EJECUTA:
            case NEGRO:
            case MENORQUE:
            case INTEGER:
            case IDENTIFIER:
            case ROJO:
            case FIN:
            case BLANCO:
            case '(':
            case '=':
            case '*':
            case error:
            case VERDE:
            case '<':
            case '[':
            case AMARILLO:
            case IGUALES:
            case CIAN:
            case PROCEDURE_NAME:
            case FLOAT:
            case ENDINPUT:
            case PARA:
            case MAYORQUE:
            case O:
            case Y:
            case PARAMETER:
            case '>':
            case '/':
                return 727;
        }
        return yyr165();
    }

    private int yys214() {
        switch (yytok) {
            case GRIS:
            case '+':
            case '-':
            case AZUL:
            case MARRON:
            case EJECUTA:
            case NEGRO:
            case MENORQUE:
            case INTEGER:
            case IDENTIFIER:
            case ROJO:
            case FIN:
            case BLANCO:
            case '(':
            case '=':
            case '*':
            case error:
            case VERDE:
            case '<':
            case '[':
            case AMARILLO:
            case IGUALES:
            case CIAN:
            case PROCEDURE_NAME:
            case FLOAT:
            case ENDINPUT:
            case PARA:
            case MAYORQUE:
            case O:
            case Y:
            case PARAMETER:
            case '>':
            case '/':
                return 727;
        }
        return yyr163();
    }

    private int yys215() {
        switch (yytok) {
            case GRIS:
            case '+':
            case '-':
            case AZUL:
            case MARRON:
            case EJECUTA:
            case NEGRO:
            case MENORQUE:
            case INTEGER:
            case IDENTIFIER:
            case ROJO:
            case FIN:
            case BLANCO:
            case '(':
            case '=':
            case '*':
            case error:
            case VERDE:
            case '<':
            case '[':
            case AMARILLO:
            case IGUALES:
            case CIAN:
            case PROCEDURE_NAME:
            case FLOAT:
            case ENDINPUT:
            case PARA:
            case MAYORQUE:
            case O:
            case Y:
            case PARAMETER:
            case '>':
            case '/':
                return 727;
        }
        return yyr162();
    }

    private int yys222() {
        switch (yytok) {
            case AZUL:
            case EJECUTA:
            case MENORQUE:
            case IDENTIFIER:
            case FIN:
            case '(':
            case ')':
            case VERDE:
            case '[':
            case IGUALES:
            case GRIS:
            case INTEGER:
            case '-':
            case NEGRO:
            case '=':
            case '*':
            case error:
            case Y:
            case MAYORQUE:
            case MARRON:
            case ENDINPUT:
            case ROJO:
            case CIAN:
            case PROCEDURE_NAME:
            case AMARILLO:
            case FLOAT:
            case '<':
            case PARA:
            case BLANCO:
            case O:
            case PARAMETER:
            case '>':
            case '/':
            case '+':
                return 727;
        }
        return yyr157();
    }

    private int yys223() {
        switch (yytok) {
            case GRIS:
            case '+':
            case '-':
            case AZUL:
            case MARRON:
            case EJECUTA:
            case NEGRO:
            case MENORQUE:
            case INTEGER:
            case IDENTIFIER:
            case ROJO:
            case FIN:
            case BLANCO:
            case '(':
            case '=':
            case '*':
            case error:
            case VERDE:
            case '<':
            case '[':
            case AMARILLO:
            case IGUALES:
            case CIAN:
            case PROCEDURE_NAME:
            case FLOAT:
            case ENDINPUT:
            case PARA:
            case MAYORQUE:
            case O:
            case Y:
            case PARAMETER:
            case '>':
            case '/':
                return 727;
        }
        return yyr159();
    }

    private int yys224() {
        switch (yytok) {
            case GRIS:
            case '+':
            case '-':
            case AZUL:
            case MARRON:
            case EJECUTA:
            case NEGRO:
            case MENORQUE:
            case INTEGER:
            case IDENTIFIER:
            case ROJO:
            case FIN:
            case BLANCO:
            case '(':
            case '=':
            case '*':
            case error:
            case VERDE:
            case '<':
            case '[':
            case AMARILLO:
            case IGUALES:
            case CIAN:
            case PROCEDURE_NAME:
            case FLOAT:
            case ENDINPUT:
            case PARA:
            case MAYORQUE:
            case O:
            case Y:
            case PARAMETER:
            case '>':
            case '/':
                return 727;
        }
        return yyr158();
    }

    private int yys225() {
        switch (yytok) {
            case GRIS:
            case '+':
            case '-':
            case AZUL:
            case MARRON:
            case EJECUTA:
            case NEGRO:
            case MENORQUE:
            case INTEGER:
            case IDENTIFIER:
            case ROJO:
            case FIN:
            case BLANCO:
            case '(':
            case '=':
            case '*':
            case error:
            case VERDE:
            case '<':
            case '[':
            case AMARILLO:
            case IGUALES:
            case CIAN:
            case PROCEDURE_NAME:
            case FLOAT:
            case ENDINPUT:
            case PARA:
            case MAYORQUE:
            case O:
            case Y:
            case PARAMETER:
            case '>':
            case '/':
                return 727;
        }
        return yyr160();
    }

    private int yys232() {
        switch (yytok) {
            case APARECETORTUGA:
                return 17;
            case AT:
                return 18;
            case AV:
                return 19;
            case AVANZA:
                return 20;
            case AZAR:
                return 21;
            case BAJALAPIZ:
                return 22;
            case BL:
                return 23;
            case BORRAPANTALLA:
                return 24;
            case CENTRO:
                return 25;
            case COS:
                return 26;
            case CUENTA:
                return 27;
            case DIFERENCIA:
                return 28;
            case DIVISION:
                return 29;
            case ELEGIR:
                return 30;
            case ELEMENTO:
                return 31;
            case ESPERA:
                return 32;
            case GD:
                return 33;
            case GI:
                return 34;
            case GIRADERECHA:
                return 35;
            case GIRAIZQUIERDA:
                return 36;
            case INC:
                return 37;
            case INIC:
                return 38;
            case MENOS:
                return 39;
            case OCULTATORTUGA:
                return 40;
            case OT:
                return 41;
            case PONCL:
                return 42;
            case PONCOLORLAPIZ:
                return 43;
            case PONPOS:
                return 44;
            case PONRUMBO:
                return 45;
            case PONX:
                return 46;
            case PONXY:
                return 47;
            case PONY:
                return 48;
            case POTENCIA:
                return 49;
            case PRIMERO:
                return 50;
            case PRODUCTO:
                return 51;
            case RAIZCUADRADA:
                return 52;
            case RC:
                return 53;
            case RE:
                return 54;
            case REDONDEA:
                return 55;
            case REPITE:
                return 56;
            case RESTO:
                return 57;
            case RETROCEDE:
                return 58;
            case RUMBO:
                return 59;
            case SB:
                return 60;
            case SEN:
                return 61;
            case SENO:
                return 62;
            case SI:
                return 63;
            case SUBELAPIZ:
                return 64;
            case SUMA:
                return 65;
            case UL:
                return 66;
            case ULTIMO:
                return 67;
            case VAR:
                return 68;
        }
        return 727;
    }

    private int yys233() {
        switch (yytok) {
            case GRIS:
            case '+':
            case '-':
            case AZUL:
            case MARRON:
            case EJECUTA:
            case NEGRO:
            case MENORQUE:
            case INTEGER:
            case IDENTIFIER:
            case ROJO:
            case FIN:
            case BLANCO:
            case '(':
            case '=':
            case '*':
            case error:
            case VERDE:
            case '<':
            case '[':
            case AMARILLO:
            case IGUALES:
            case CIAN:
            case PROCEDURE_NAME:
            case FLOAT:
            case ENDINPUT:
            case PARA:
            case MAYORQUE:
            case O:
            case Y:
            case PARAMETER:
            case '>':
            case '/':
                return 727;
        }
        return yyr161();
    }

    private int yys234() {
        switch (yytok) {
            case APARECETORTUGA:
                return 17;
            case AT:
                return 18;
            case AV:
                return 19;
            case AVANZA:
                return 20;
            case AZAR:
                return 21;
            case BAJALAPIZ:
                return 22;
            case BL:
                return 23;
            case BORRAPANTALLA:
                return 24;
            case CENTRO:
                return 25;
            case COS:
                return 26;
            case CUENTA:
                return 27;
            case DIFERENCIA:
                return 28;
            case DIVISION:
                return 29;
            case ELEGIR:
                return 30;
            case ELEMENTO:
                return 31;
            case ESPERA:
                return 32;
            case GD:
                return 33;
            case GI:
                return 34;
            case GIRADERECHA:
                return 35;
            case GIRAIZQUIERDA:
                return 36;
            case INC:
                return 37;
            case INIC:
                return 38;
            case MENOS:
                return 39;
            case OCULTATORTUGA:
                return 40;
            case OT:
                return 41;
            case PONCL:
                return 42;
            case PONCOLORLAPIZ:
                return 43;
            case PONPOS:
                return 44;
            case PONRUMBO:
                return 45;
            case PONX:
                return 46;
            case PONXY:
                return 47;
            case PONY:
                return 48;
            case POTENCIA:
                return 49;
            case PRIMERO:
                return 50;
            case PRODUCTO:
                return 51;
            case RAIZCUADRADA:
                return 52;
            case RC:
                return 53;
            case RE:
                return 54;
            case REDONDEA:
                return 55;
            case REPITE:
                return 56;
            case RESTO:
                return 57;
            case RETROCEDE:
                return 58;
            case RUMBO:
                return 59;
            case SB:
                return 60;
            case SEN:
                return 61;
            case SENO:
                return 62;
            case SI:
                return 63;
            case SUBELAPIZ:
                return 64;
            case SUMA:
                return 65;
            case UL:
                return 66;
            case ULTIMO:
                return 67;
            case VAR:
                return 68;
        }
        return 727;
    }

    private int yys239() {
        switch (yytok) {
            case INTEGER:
                return 76;
            case FLOAT:
                return 87;
            case '(':
                return 155;
            case '*':
                return 186;
            case '+':
                return 187;
            case '-':
                return 188;
            case '/':
                return 189;
        }
        return 727;
    }

    private int yys240() {
        switch (yytok) {
            case INTEGER:
                return 76;
            case FLOAT:
                return 87;
            case '(':
                return 155;
            case '*':
                return 194;
            case '+':
                return 195;
            case '-':
                return 196;
            case '/':
                return 197;
        }
        return 727;
    }

    private int yys241() {
        switch (yytok) {
            case INTEGER:
                return 76;
            case FLOAT:
                return 87;
            case '(':
                return 155;
            case '*':
                return 186;
            case '+':
                return 187;
            case '-':
                return 188;
            case '/':
                return 189;
        }
        return 727;
    }

    private int yys242() {
        switch (yytok) {
            case INTEGER:
                return 76;
            case FLOAT:
                return 87;
            case '(':
                return 155;
            case '*':
                return 194;
            case '+':
                return 195;
            case '-':
                return 196;
            case '/':
                return 197;
        }
        return 727;
    }

    private int yys243() {
        switch (yytok) {
            case INTEGER:
                return 76;
            case FLOAT:
                return 87;
            case '(':
                return 155;
            case '*':
                return 186;
            case '+':
                return 187;
            case '-':
                return 188;
            case '/':
                return 189;
        }
        return 727;
    }

    private int yys244() {
        switch (yytok) {
            case INTEGER:
                return 76;
            case FLOAT:
                return 87;
            case '(':
                return 155;
            case '*':
                return 194;
            case '+':
                return 195;
            case '-':
                return 196;
            case '/':
                return 197;
        }
        return 727;
    }

    private int yys245() {
        switch (yytok) {
            case INTEGER:
                return 76;
            case FLOAT:
                return 87;
            case IGUALES:
                return 150;
            case MAYORQUE:
                return 151;
            case MENORQUE:
                return 152;
            case O:
                return 153;
            case Y:
                return 154;
            case '(':
                return 155;
        }
        return 727;
    }

    private int yys246() {
        switch (yytok) {
            case INTEGER:
                return 76;
            case FLOAT:
                return 87;
            case IGUALES:
                return 150;
            case MAYORQUE:
                return 151;
            case MENORQUE:
                return 152;
            case O:
                return 153;
            case Y:
                return 154;
            case '(':
                return 155;
        }
        return 727;
    }

    private int yys254() {
        switch (yytok) {
            case ROJO:
            case error:
            case ENDINPUT:
            case PARA:
            case NEGRO:
            case EJECUTA:
            case MENORQUE:
            case '>':
            case PROCEDURE_NAME:
            case AZUL:
            case O:
            case Y:
            case PARAMETER:
            case '<':
            case BLANCO:
            case VERDE:
            case MAYORQUE:
            case '=':
            case IGUALES:
            case GRIS:
            case CIAN:
            case FIN:
            case AMARILLO:
            case MARRON:
                return 727;
        }
        return yyr34();
    }

    private int yys255() {
        switch (yytok) {
            case MAYORQUE:
            case error:
            case NEGRO:
            case FIN:
            case EJECUTA:
            case O:
            case ROJO:
            case MARRON:
            case AZUL:
            case GRIS:
            case '>':
            case VERDE:
            case '<':
            case PARAMETER:
            case Y:
            case '=':
            case MENORQUE:
            case BLANCO:
            case AMARILLO:
            case IGUALES:
            case PROCEDURE_NAME:
            case CIAN:
            case PARA:
            case ENDINPUT:
                return 727;
            case '*':
                return 167;
            case '/':
                return 170;
        }
        return yyr28();
    }

    private int yys256() {
        switch (yytok) {
            case MAYORQUE:
            case error:
            case NEGRO:
            case FIN:
            case EJECUTA:
            case O:
            case ROJO:
            case MARRON:
            case AZUL:
            case GRIS:
            case '>':
            case VERDE:
            case '<':
            case PARAMETER:
            case Y:
            case '=':
            case MENORQUE:
            case BLANCO:
            case AMARILLO:
            case IGUALES:
            case PROCEDURE_NAME:
            case CIAN:
            case PARA:
            case ENDINPUT:
                return 727;
            case '*':
                return 167;
            case '/':
                return 170;
        }
        return yyr31();
    }

    private int yys257() {
        switch (yytok) {
            case ROJO:
            case error:
            case ENDINPUT:
            case PARA:
            case NEGRO:
            case EJECUTA:
            case MENORQUE:
            case '>':
            case PROCEDURE_NAME:
            case AZUL:
            case O:
            case Y:
            case PARAMETER:
            case '<':
            case BLANCO:
            case VERDE:
            case MAYORQUE:
            case '=':
            case IGUALES:
            case GRIS:
            case CIAN:
            case FIN:
            case AMARILLO:
            case MARRON:
                return 727;
        }
        return yyr37();
    }

    private int yys258() {
        switch (yytok) {
            case ROJO:
            case error:
            case ENDINPUT:
            case PARA:
            case NEGRO:
            case EJECUTA:
            case MENORQUE:
            case '>':
            case PROCEDURE_NAME:
            case AZUL:
            case O:
            case Y:
            case PARAMETER:
            case '<':
            case BLANCO:
            case VERDE:
            case MAYORQUE:
            case '=':
            case IGUALES:
            case GRIS:
            case CIAN:
            case FIN:
            case AMARILLO:
            case MARRON:
                return 727;
        }
        return yyr33();
    }

    private int yys259() {
        switch (yytok) {
            case ROJO:
            case error:
            case ENDINPUT:
            case PARA:
            case NEGRO:
            case EJECUTA:
            case MENORQUE:
            case '>':
            case PROCEDURE_NAME:
            case AZUL:
            case O:
            case Y:
            case PARAMETER:
            case '<':
            case BLANCO:
            case VERDE:
            case MAYORQUE:
            case '=':
            case IGUALES:
            case GRIS:
            case CIAN:
            case FIN:
            case AMARILLO:
            case MARRON:
                return 727;
        }
        return yyr35();
    }

    private int yys260() {
        switch (yytok) {
            case MAYORQUE:
            case error:
            case NEGRO:
            case FIN:
            case EJECUTA:
            case O:
            case ROJO:
            case MARRON:
            case AZUL:
            case GRIS:
            case '>':
            case VERDE:
            case '<':
            case PARAMETER:
            case Y:
            case '=':
            case MENORQUE:
            case BLANCO:
            case AMARILLO:
            case IGUALES:
            case PROCEDURE_NAME:
            case CIAN:
            case PARA:
            case ENDINPUT:
                return 727;
            case '*':
                return 163;
            case '/':
                return 166;
        }
        return yyr27();
    }

    private int yys261() {
        switch (yytok) {
            case MAYORQUE:
            case error:
            case NEGRO:
            case FIN:
            case EJECUTA:
            case O:
            case ROJO:
            case MARRON:
            case AZUL:
            case GRIS:
            case '>':
            case VERDE:
            case '<':
            case PARAMETER:
            case Y:
            case '=':
            case MENORQUE:
            case BLANCO:
            case AMARILLO:
            case IGUALES:
            case PROCEDURE_NAME:
            case CIAN:
            case PARA:
            case ENDINPUT:
                return 727;
            case '*':
                return 167;
            case '/':
                return 170;
        }
        return yyr29();
    }

    private int yys262() {
        switch (yytok) {
            case MAYORQUE:
            case error:
            case NEGRO:
            case FIN:
            case EJECUTA:
            case O:
            case ROJO:
            case MARRON:
            case AZUL:
            case GRIS:
            case '>':
            case VERDE:
            case '<':
            case PARAMETER:
            case Y:
            case '=':
            case MENORQUE:
            case BLANCO:
            case AMARILLO:
            case IGUALES:
            case PROCEDURE_NAME:
            case CIAN:
            case PARA:
            case ENDINPUT:
                return 727;
            case '*':
                return 163;
            case '/':
                return 166;
        }
        return yyr30();
    }

    private int yys263() {
        switch (yytok) {
            case MAYORQUE:
            case error:
            case NEGRO:
            case FIN:
            case EJECUTA:
            case O:
            case ROJO:
            case MARRON:
            case AZUL:
            case GRIS:
            case '>':
            case VERDE:
            case '<':
            case PARAMETER:
            case Y:
            case '=':
            case MENORQUE:
            case BLANCO:
            case AMARILLO:
            case IGUALES:
            case PROCEDURE_NAME:
            case CIAN:
            case PARA:
            case ENDINPUT:
                return 727;
            case '*':
                return 167;
            case '/':
                return 170;
        }
        return yyr32();
    }

    private int yys264() {
        switch (yytok) {
            case ROJO:
            case error:
            case ENDINPUT:
            case PARA:
            case NEGRO:
            case EJECUTA:
            case MENORQUE:
            case '>':
            case PROCEDURE_NAME:
            case AZUL:
            case O:
            case Y:
            case PARAMETER:
            case '<':
            case BLANCO:
            case VERDE:
            case MAYORQUE:
            case '=':
            case IGUALES:
            case GRIS:
            case CIAN:
            case FIN:
            case AMARILLO:
            case MARRON:
                return 727;
        }
        return yyr36();
    }

    private int yys265() {
        switch (yytok) {
            case ROJO:
            case error:
            case ENDINPUT:
            case PARA:
            case NEGRO:
            case EJECUTA:
            case MENORQUE:
            case '>':
            case PROCEDURE_NAME:
            case AZUL:
            case O:
            case Y:
            case PARAMETER:
            case '<':
            case BLANCO:
            case VERDE:
            case MAYORQUE:
            case '=':
            case IGUALES:
            case GRIS:
            case CIAN:
            case FIN:
            case AMARILLO:
            case MARRON:
                return 727;
        }
        return yyr38();
    }

    private int yys266() {
        switch (yytok) {
            case ROJO:
            case error:
            case ENDINPUT:
            case PARA:
            case NEGRO:
            case EJECUTA:
            case MENORQUE:
            case '>':
            case PROCEDURE_NAME:
            case AZUL:
            case O:
            case Y:
            case PARAMETER:
            case '<':
            case BLANCO:
            case VERDE:
            case MAYORQUE:
            case '=':
            case IGUALES:
            case GRIS:
            case CIAN:
            case FIN:
            case AMARILLO:
            case MARRON:
                return 727;
        }
        return yyr23();
    }

    private int yys268() {
        switch (yytok) {
            case MAYORQUE:
            case error:
            case NEGRO:
            case FIN:
            case EJECUTA:
            case O:
            case ROJO:
            case MARRON:
            case AZUL:
            case GRIS:
            case '>':
            case VERDE:
            case '<':
            case PARAMETER:
            case Y:
            case '=':
            case MENORQUE:
            case BLANCO:
            case AMARILLO:
            case IGUALES:
            case PROCEDURE_NAME:
            case CIAN:
            case PARA:
            case ENDINPUT:
                return 727;
            case '*':
                return 171;
            case '/':
                return 174;
        }
        return yyr21();
    }

    private int yys269() {
        switch (yytok) {
            case MAYORQUE:
            case error:
            case NEGRO:
            case FIN:
            case EJECUTA:
            case O:
            case ROJO:
            case MARRON:
            case AZUL:
            case GRIS:
            case '>':
            case VERDE:
            case '<':
            case PARAMETER:
            case Y:
            case '=':
            case MENORQUE:
            case BLANCO:
            case AMARILLO:
            case IGUALES:
            case PROCEDURE_NAME:
            case CIAN:
            case PARA:
            case ENDINPUT:
                return 727;
            case '*':
                return 171;
            case '/':
                return 174;
        }
        return yyr22();
    }

    private int yys270() {
        switch (yytok) {
            case ROJO:
            case error:
            case ENDINPUT:
            case PARA:
            case NEGRO:
            case EJECUTA:
            case MENORQUE:
            case '>':
            case PROCEDURE_NAME:
            case AZUL:
            case O:
            case Y:
            case PARAMETER:
            case '<':
            case BLANCO:
            case VERDE:
            case MAYORQUE:
            case '=':
            case IGUALES:
            case GRIS:
            case CIAN:
            case FIN:
            case AMARILLO:
            case MARRON:
                return 727;
        }
        return yyr24();
    }

    private int yys271() {
        switch (yytok) {
            case ROJO:
            case error:
            case ENDINPUT:
            case PARA:
            case NEGRO:
            case EJECUTA:
            case MENORQUE:
            case '>':
            case PROCEDURE_NAME:
            case AZUL:
            case O:
            case Y:
            case PARAMETER:
            case '<':
            case BLANCO:
            case VERDE:
            case MAYORQUE:
            case '=':
            case IGUALES:
            case GRIS:
            case CIAN:
            case FIN:
            case AMARILLO:
            case MARRON:
                return 727;
        }
        return yyr39();
    }

    private int yys272() {
        switch (yytok) {
            case VERDE:
            case AZUL:
            case PROCEDURE_NAME:
            case EJECUTA:
            case PARA:
            case FIN:
            case MARRON:
            case GRIS:
            case ROJO:
            case '=':
            case PARAMETER:
            case BLANCO:
            case AMARILLO:
            case CIAN:
            case NEGRO:
            case error:
            case ENDINPUT:
                return 727;
        }
        return yyr25();
    }

    private int yys273() {
        switch (yytok) {
            case PARA:
            case MENORQUE:
            case '[':
            case IGUALES:
            case error:
            case O:
            case VERDE:
            case '>':
            case GRIS:
            case FIN:
            case BLANCO:
            case EJECUTA:
            case PARAMETER:
            case '=':
            case '<':
            case Y:
            case NEGRO:
            case MARRON:
            case ROJO:
            case AZUL:
            case CIAN:
            case PROCEDURE_NAME:
            case AMARILLO:
            case ENDINPUT:
            case MAYORQUE:
                return 727;
        }
        return yyr70();
    }

    private int yys274() {
        switch (yytok) {
            case O:
            case error:
            case EJECUTA:
            case AZUL:
            case Y:
            case '=':
            case FIN:
            case BLANCO:
            case IGUALES:
            case PROCEDURE_NAME:
            case '[':
            case MENORQUE:
            case NEGRO:
            case PARAMETER:
            case '<':
            case MARRON:
            case VERDE:
            case MAYORQUE:
            case ENDINPUT:
            case ROJO:
            case GRIS:
            case CIAN:
            case AMARILLO:
            case PARA:
            case '>':
                return 727;
            case '*':
                return 182;
            case '/':
                return 185;
        }
        return yyr60();
    }

    private int yys275() {
        switch (yytok) {
            case O:
            case error:
            case EJECUTA:
            case AZUL:
            case Y:
            case '=':
            case FIN:
            case BLANCO:
            case IGUALES:
            case PROCEDURE_NAME:
            case '[':
            case MENORQUE:
            case NEGRO:
            case PARAMETER:
            case '<':
            case MARRON:
            case VERDE:
            case MAYORQUE:
            case ENDINPUT:
            case ROJO:
            case GRIS:
            case CIAN:
            case AMARILLO:
            case PARA:
            case '>':
                return 727;
            case '*':
                return 182;
            case '/':
                return 185;
        }
        return yyr65();
    }

    private int yys276() {
        switch (yytok) {
            case PARA:
            case MENORQUE:
            case '[':
            case IGUALES:
            case error:
            case O:
            case VERDE:
            case '>':
            case GRIS:
            case FIN:
            case BLANCO:
            case EJECUTA:
            case PARAMETER:
            case '=':
            case '<':
            case Y:
            case NEGRO:
            case MARRON:
            case ROJO:
            case AZUL:
            case CIAN:
            case PROCEDURE_NAME:
            case AMARILLO:
            case ENDINPUT:
            case MAYORQUE:
                return 727;
        }
        return yyr75();
    }

    private int yys277() {
        switch (yytok) {
            case PARA:
            case MENORQUE:
            case '[':
            case IGUALES:
            case error:
            case O:
            case VERDE:
            case '>':
            case GRIS:
            case FIN:
            case BLANCO:
            case EJECUTA:
            case PARAMETER:
            case '=':
            case '<':
            case Y:
            case NEGRO:
            case MARRON:
            case ROJO:
            case AZUL:
            case CIAN:
            case PROCEDURE_NAME:
            case AMARILLO:
            case ENDINPUT:
            case MAYORQUE:
                return 727;
        }
        return yyr68();
    }

    private int yys278() {
        switch (yytok) {
            case PARA:
            case MENORQUE:
            case '[':
            case IGUALES:
            case error:
            case O:
            case VERDE:
            case '>':
            case GRIS:
            case FIN:
            case BLANCO:
            case EJECUTA:
            case PARAMETER:
            case '=':
            case '<':
            case Y:
            case NEGRO:
            case MARRON:
            case ROJO:
            case AZUL:
            case CIAN:
            case PROCEDURE_NAME:
            case AMARILLO:
            case ENDINPUT:
            case MAYORQUE:
                return 727;
        }
        return yyr72();
    }

    private int yys279() {
        switch (yytok) {
            case PARA:
            case MENORQUE:
            case '[':
            case IGUALES:
            case error:
            case O:
            case VERDE:
            case '>':
            case GRIS:
            case FIN:
            case BLANCO:
            case EJECUTA:
            case PARAMETER:
            case '=':
            case '<':
            case Y:
            case NEGRO:
            case MARRON:
            case ROJO:
            case AZUL:
            case CIAN:
            case PROCEDURE_NAME:
            case AMARILLO:
            case ENDINPUT:
            case MAYORQUE:
                return 727;
        }
        return yyr69();
    }

    private int yys280() {
        switch (yytok) {
            case O:
            case error:
            case EJECUTA:
            case AZUL:
            case Y:
            case '=':
            case FIN:
            case BLANCO:
            case IGUALES:
            case PROCEDURE_NAME:
            case '[':
            case MENORQUE:
            case NEGRO:
            case PARAMETER:
            case '<':
            case MARRON:
            case VERDE:
            case MAYORQUE:
            case ENDINPUT:
            case ROJO:
            case GRIS:
            case CIAN:
            case AMARILLO:
            case PARA:
            case '>':
                return 727;
            case '*':
                return 178;
            case '/':
                return 181;
        }
        return yyr58();
    }

    private int yys281() {
        switch (yytok) {
            case O:
            case error:
            case EJECUTA:
            case AZUL:
            case Y:
            case '=':
            case FIN:
            case BLANCO:
            case IGUALES:
            case PROCEDURE_NAME:
            case '[':
            case MENORQUE:
            case NEGRO:
            case PARAMETER:
            case '<':
            case MARRON:
            case VERDE:
            case MAYORQUE:
            case ENDINPUT:
            case ROJO:
            case GRIS:
            case CIAN:
            case AMARILLO:
            case PARA:
            case '>':
                return 727;
            case '*':
                return 182;
            case '/':
                return 185;
        }
        return yyr62();
    }

    private int yys282() {
        switch (yytok) {
            case O:
            case error:
            case EJECUTA:
            case AZUL:
            case Y:
            case '=':
            case FIN:
            case BLANCO:
            case IGUALES:
            case PROCEDURE_NAME:
            case '[':
            case MENORQUE:
            case NEGRO:
            case PARAMETER:
            case '<':
            case MARRON:
            case VERDE:
            case MAYORQUE:
            case ENDINPUT:
            case ROJO:
            case GRIS:
            case CIAN:
            case AMARILLO:
            case PARA:
            case '>':
                return 727;
            case '*':
                return 228;
            case '/':
                return 231;
        }
        return yyr59();
    }

    private int yys283() {
        switch (yytok) {
            case O:
            case error:
            case EJECUTA:
            case AZUL:
            case Y:
            case '=':
            case FIN:
            case BLANCO:
            case IGUALES:
            case PROCEDURE_NAME:
            case '[':
            case MENORQUE:
            case NEGRO:
            case PARAMETER:
            case '<':
            case MARRON:
            case VERDE:
            case MAYORQUE:
            case ENDINPUT:
            case ROJO:
            case GRIS:
            case CIAN:
            case AMARILLO:
            case PARA:
            case '>':
                return 727;
            case '*':
                return 178;
            case '/':
                return 181;
        }
        return yyr63();
    }

    private int yys284() {
        switch (yytok) {
            case O:
            case error:
            case EJECUTA:
            case AZUL:
            case Y:
            case '=':
            case FIN:
            case BLANCO:
            case IGUALES:
            case PROCEDURE_NAME:
            case '[':
            case MENORQUE:
            case NEGRO:
            case PARAMETER:
            case '<':
            case MARRON:
            case VERDE:
            case MAYORQUE:
            case ENDINPUT:
            case ROJO:
            case GRIS:
            case CIAN:
            case AMARILLO:
            case PARA:
            case '>':
                return 727;
            case '*':
                return 182;
            case '/':
                return 185;
        }
        return yyr67();
    }

    private int yys285() {
        switch (yytok) {
            case O:
            case error:
            case EJECUTA:
            case AZUL:
            case Y:
            case '=':
            case FIN:
            case BLANCO:
            case IGUALES:
            case PROCEDURE_NAME:
            case '[':
            case MENORQUE:
            case NEGRO:
            case PARAMETER:
            case '<':
            case MARRON:
            case VERDE:
            case MAYORQUE:
            case ENDINPUT:
            case ROJO:
            case GRIS:
            case CIAN:
            case AMARILLO:
            case PARA:
            case '>':
                return 727;
            case '*':
                return 228;
            case '/':
                return 231;
        }
        return yyr64();
    }

    private int yys286() {
        switch (yytok) {
            case PARA:
            case MENORQUE:
            case '[':
            case IGUALES:
            case error:
            case O:
            case VERDE:
            case '>':
            case GRIS:
            case FIN:
            case BLANCO:
            case EJECUTA:
            case PARAMETER:
            case '=':
            case '<':
            case Y:
            case NEGRO:
            case MARRON:
            case ROJO:
            case AZUL:
            case CIAN:
            case PROCEDURE_NAME:
            case AMARILLO:
            case ENDINPUT:
            case MAYORQUE:
                return 727;
        }
        return yyr73();
    }

    private int yys287() {
        switch (yytok) {
            case PARA:
            case MENORQUE:
            case '[':
            case IGUALES:
            case error:
            case O:
            case VERDE:
            case '>':
            case GRIS:
            case FIN:
            case BLANCO:
            case EJECUTA:
            case PARAMETER:
            case '=':
            case '<':
            case Y:
            case NEGRO:
            case MARRON:
            case ROJO:
            case AZUL:
            case CIAN:
            case PROCEDURE_NAME:
            case AMARILLO:
            case ENDINPUT:
            case MAYORQUE:
                return 727;
        }
        return yyr77();
    }

    private int yys288() {
        switch (yytok) {
            case PARA:
            case MENORQUE:
            case '[':
            case IGUALES:
            case error:
            case O:
            case VERDE:
            case '>':
            case GRIS:
            case FIN:
            case BLANCO:
            case EJECUTA:
            case PARAMETER:
            case '=':
            case '<':
            case Y:
            case NEGRO:
            case MARRON:
            case ROJO:
            case AZUL:
            case CIAN:
            case PROCEDURE_NAME:
            case AMARILLO:
            case ENDINPUT:
            case MAYORQUE:
                return 727;
        }
        return yyr74();
    }

    private int yys289() {
        switch (yytok) {
            case VERDE:
            case AZUL:
            case PROCEDURE_NAME:
            case EJECUTA:
            case PARA:
            case FIN:
            case MARRON:
            case GRIS:
            case ROJO:
            case '=':
            case PARAMETER:
            case BLANCO:
            case AMARILLO:
            case CIAN:
            case NEGRO:
            case error:
            case ENDINPUT:
                return 727;
        }
        return yyr52();
    }

    private int yys290() {
        switch (yytok) {
            case VERDE:
            case AZUL:
            case PROCEDURE_NAME:
            case EJECUTA:
            case PARA:
            case FIN:
            case MARRON:
            case GRIS:
            case ROJO:
            case '=':
            case PARAMETER:
            case BLANCO:
            case AMARILLO:
            case CIAN:
            case NEGRO:
            case error:
            case ENDINPUT:
                return 727;
        }
        return yyr50();
    }

    private int yys291() {
        switch (yytok) {
            case AMARILLO:
            case FIN:
            case CIAN:
            case MARRON:
            case VERDE:
            case GRIS:
            case NEGRO:
            case ROJO:
            case PROCEDURE_NAME:
            case PARA:
            case BLANCO:
            case PARAMETER:
            case EJECUTA:
            case ENDINPUT:
            case error:
            case AZUL:
            case '=':
                return 727;
            case '*':
                return 186;
            case '/':
                return 189;
        }
        return yyr46();
    }

    private int yys292() {
        switch (yytok) {
            case AMARILLO:
            case FIN:
            case CIAN:
            case MARRON:
            case VERDE:
            case GRIS:
            case NEGRO:
            case ROJO:
            case PROCEDURE_NAME:
            case PARA:
            case BLANCO:
            case PARAMETER:
            case EJECUTA:
            case ENDINPUT:
            case error:
            case AZUL:
            case '=':
                return 727;
            case '*':
                return 194;
            case '/':
                return 197;
        }
        return yyr44();
    }

    private int yys293() {
        switch (yytok) {
            case AMARILLO:
            case FIN:
            case CIAN:
            case MARRON:
            case VERDE:
            case GRIS:
            case NEGRO:
            case ROJO:
            case PROCEDURE_NAME:
            case PARA:
            case BLANCO:
            case PARAMETER:
            case EJECUTA:
            case ENDINPUT:
            case error:
            case AZUL:
            case '=':
                return 727;
            case '*':
                return 186;
            case '/':
                return 189;
        }
        return yyr49();
    }

    private int yys294() {
        switch (yytok) {
            case AMARILLO:
            case FIN:
            case CIAN:
            case MARRON:
            case VERDE:
            case GRIS:
            case NEGRO:
            case ROJO:
            case PROCEDURE_NAME:
            case PARA:
            case BLANCO:
            case PARAMETER:
            case EJECUTA:
            case ENDINPUT:
            case error:
            case AZUL:
            case '=':
                return 727;
            case '*':
                return 194;
            case '/':
                return 197;
        }
        return yyr47();
    }

    private int yys295() {
        switch (yytok) {
            case VERDE:
            case AZUL:
            case PROCEDURE_NAME:
            case EJECUTA:
            case PARA:
            case FIN:
            case MARRON:
            case GRIS:
            case ROJO:
            case '=':
            case PARAMETER:
            case BLANCO:
            case AMARILLO:
            case CIAN:
            case NEGRO:
            case error:
            case ENDINPUT:
                return 727;
        }
        return yyr55();
    }

    private int yys296() {
        switch (yytok) {
            case VERDE:
            case AZUL:
            case PROCEDURE_NAME:
            case EJECUTA:
            case PARA:
            case FIN:
            case MARRON:
            case GRIS:
            case ROJO:
            case '=':
            case PARAMETER:
            case BLANCO:
            case AMARILLO:
            case CIAN:
            case NEGRO:
            case error:
            case ENDINPUT:
                return 727;
        }
        return yyr53();
    }

    private int yys297() {
        switch (yytok) {
            case PARA:
            case MENORQUE:
            case '[':
            case IGUALES:
            case error:
            case O:
            case VERDE:
            case '>':
            case GRIS:
            case FIN:
            case BLANCO:
            case EJECUTA:
            case PARAMETER:
            case '=':
            case '<':
            case Y:
            case NEGRO:
            case MARRON:
            case ROJO:
            case AZUL:
            case CIAN:
            case PROCEDURE_NAME:
            case AMARILLO:
            case ENDINPUT:
            case MAYORQUE:
                return 727;
        }
        return yyr71();
    }

    private int yys298() {
        switch (yytok) {
            case O:
            case error:
            case EJECUTA:
            case AZUL:
            case Y:
            case '=':
            case FIN:
            case BLANCO:
            case IGUALES:
            case PROCEDURE_NAME:
            case '[':
            case MENORQUE:
            case NEGRO:
            case PARAMETER:
            case '<':
            case MARRON:
            case VERDE:
            case MAYORQUE:
            case ENDINPUT:
            case ROJO:
            case GRIS:
            case CIAN:
            case AMARILLO:
            case PARA:
            case '>':
                return 727;
            case '*':
                return 182;
            case '/':
                return 185;
        }
        return yyr61();
    }

    private int yys299() {
        switch (yytok) {
            case O:
            case error:
            case EJECUTA:
            case AZUL:
            case Y:
            case '=':
            case FIN:
            case BLANCO:
            case IGUALES:
            case PROCEDURE_NAME:
            case '[':
            case MENORQUE:
            case NEGRO:
            case PARAMETER:
            case '<':
            case MARRON:
            case VERDE:
            case MAYORQUE:
            case ENDINPUT:
            case ROJO:
            case GRIS:
            case CIAN:
            case AMARILLO:
            case PARA:
            case '>':
                return 727;
            case '*':
                return 182;
            case '/':
                return 185;
        }
        return yyr66();
    }

    private int yys300() {
        switch (yytok) {
            case PARA:
            case MENORQUE:
            case '[':
            case IGUALES:
            case error:
            case O:
            case VERDE:
            case '>':
            case GRIS:
            case FIN:
            case BLANCO:
            case EJECUTA:
            case PARAMETER:
            case '=':
            case '<':
            case Y:
            case NEGRO:
            case MARRON:
            case ROJO:
            case AZUL:
            case CIAN:
            case PROCEDURE_NAME:
            case AMARILLO:
            case ENDINPUT:
            case MAYORQUE:
                return 727;
        }
        return yyr76();
    }

    private int yys301() {
        switch (yytok) {
            case VERDE:
            case AZUL:
            case PROCEDURE_NAME:
            case EJECUTA:
            case PARA:
            case FIN:
            case MARRON:
            case GRIS:
            case ROJO:
            case '=':
            case PARAMETER:
            case BLANCO:
            case AMARILLO:
            case CIAN:
            case NEGRO:
            case error:
            case ENDINPUT:
                return 727;
        }
        return yyr51();
    }

    private int yys302() {
        switch (yytok) {
            case VERDE:
            case AZUL:
            case PROCEDURE_NAME:
            case EJECUTA:
            case PARA:
            case FIN:
            case MARRON:
            case GRIS:
            case ROJO:
            case '=':
            case PARAMETER:
            case BLANCO:
            case AMARILLO:
            case CIAN:
            case NEGRO:
            case error:
            case ENDINPUT:
                return 727;
        }
        return yyr23();
    }

    private int yys303() {
        switch (yytok) {
            case AMARILLO:
            case FIN:
            case CIAN:
            case MARRON:
            case VERDE:
            case GRIS:
            case NEGRO:
            case ROJO:
            case PROCEDURE_NAME:
            case PARA:
            case BLANCO:
            case PARAMETER:
            case EJECUTA:
            case ENDINPUT:
            case error:
            case AZUL:
            case '=':
                return 727;
            case '*':
                return 186;
            case '/':
                return 189;
        }
        return yyr45();
    }

    private int yys304() {
        switch (yytok) {
            case AMARILLO:
            case FIN:
            case CIAN:
            case MARRON:
            case VERDE:
            case GRIS:
            case NEGRO:
            case ROJO:
            case PROCEDURE_NAME:
            case PARA:
            case BLANCO:
            case PARAMETER:
            case EJECUTA:
            case ENDINPUT:
            case error:
            case AZUL:
            case '=':
                return 727;
            case '*':
                return 194;
            case '/':
                return 197;
        }
        return yyr21();
    }

    private int yys305() {
        switch (yytok) {
            case AMARILLO:
            case FIN:
            case CIAN:
            case MARRON:
            case VERDE:
            case GRIS:
            case NEGRO:
            case ROJO:
            case PROCEDURE_NAME:
            case PARA:
            case BLANCO:
            case PARAMETER:
            case EJECUTA:
            case ENDINPUT:
            case error:
            case AZUL:
            case '=':
                return 727;
            case '*':
                return 186;
            case '/':
                return 189;
        }
        return yyr48();
    }

    private int yys306() {
        switch (yytok) {
            case AMARILLO:
            case FIN:
            case CIAN:
            case MARRON:
            case VERDE:
            case GRIS:
            case NEGRO:
            case ROJO:
            case PROCEDURE_NAME:
            case PARA:
            case BLANCO:
            case PARAMETER:
            case EJECUTA:
            case ENDINPUT:
            case error:
            case AZUL:
            case '=':
                return 727;
            case '*':
                return 194;
            case '/':
                return 197;
        }
        return yyr22();
    }

    private int yys307() {
        switch (yytok) {
            case VERDE:
            case AZUL:
            case PROCEDURE_NAME:
            case EJECUTA:
            case PARA:
            case FIN:
            case MARRON:
            case GRIS:
            case ROJO:
            case '=':
            case PARAMETER:
            case BLANCO:
            case AMARILLO:
            case CIAN:
            case NEGRO:
            case error:
            case ENDINPUT:
                return 727;
        }
        return yyr54();
    }

    private int yys308() {
        switch (yytok) {
            case VERDE:
            case AZUL:
            case PROCEDURE_NAME:
            case EJECUTA:
            case PARA:
            case FIN:
            case MARRON:
            case GRIS:
            case ROJO:
            case '=':
            case PARAMETER:
            case BLANCO:
            case AMARILLO:
            case CIAN:
            case NEGRO:
            case error:
            case ENDINPUT:
                return 727;
        }
        return yyr24();
    }

    private int yys309() {
        switch (yytok) {
            case PARA:
            case MENORQUE:
            case '[':
            case IGUALES:
            case error:
            case O:
            case VERDE:
            case '>':
            case GRIS:
            case FIN:
            case BLANCO:
            case EJECUTA:
            case PARAMETER:
            case '=':
            case '<':
            case Y:
            case NEGRO:
            case MARRON:
            case ROJO:
            case AZUL:
            case CIAN:
            case PROCEDURE_NAME:
            case AMARILLO:
            case ENDINPUT:
            case MAYORQUE:
                return 727;
        }
        return yyr78();
    }

    private int yys310() {
        switch (yytok) {
            case VERDE:
            case AZUL:
            case PROCEDURE_NAME:
            case EJECUTA:
            case PARA:
            case FIN:
            case MARRON:
            case GRIS:
            case ROJO:
            case '=':
            case PARAMETER:
            case BLANCO:
            case AMARILLO:
            case CIAN:
            case NEGRO:
            case error:
            case ENDINPUT:
                return 727;
        }
        return yyr56();
    }

    private int yys311() {
        switch (yytok) {
            case AZUL:
            case '-':
            case '/':
            case GRIS:
            case O:
            case PARAMETER:
            case error:
            case MAYORQUE:
            case AMARILLO:
            case CIAN:
            case '[':
            case BLANCO:
            case EJECUTA:
            case '=':
            case '<':
            case NEGRO:
            case VERDE:
            case '+':
            case '>':
            case ENDINPUT:
            case IGUALES:
            case PROCEDURE_NAME:
            case ROJO:
            case FIN:
            case PARA:
            case MARRON:
            case MENORQUE:
            case Y:
            case '*':
                return 727;
        }
        return yyr109();
    }

    private int yys312() {
        switch (yytok) {
            case GRIS:
            case '+':
            case '-':
            case AZUL:
            case MARRON:
            case EJECUTA:
            case NEGRO:
            case MENORQUE:
            case INTEGER:
            case IDENTIFIER:
            case ROJO:
            case FIN:
            case BLANCO:
            case '(':
            case '=':
            case '*':
            case error:
            case VERDE:
            case '<':
            case '[':
            case AMARILLO:
            case IGUALES:
            case CIAN:
            case PROCEDURE_NAME:
            case FLOAT:
            case ENDINPUT:
            case PARA:
            case MAYORQUE:
            case O:
            case Y:
            case PARAMETER:
            case '>':
            case '/':
                return 727;
        }
        return yyr185();
    }

    private int yys313() {
        switch (yytok) {
            case GRIS:
            case '+':
            case '-':
            case AZUL:
            case MARRON:
            case EJECUTA:
            case NEGRO:
            case MENORQUE:
            case INTEGER:
            case IDENTIFIER:
            case ROJO:
            case FIN:
            case BLANCO:
            case '(':
            case '=':
            case '*':
            case error:
            case VERDE:
            case '<':
            case '[':
            case AMARILLO:
            case IGUALES:
            case CIAN:
            case PROCEDURE_NAME:
            case FLOAT:
            case ENDINPUT:
            case PARA:
            case MAYORQUE:
            case O:
            case Y:
            case PARAMETER:
            case '>':
            case '/':
                return 727;
        }
        return yyr184();
    }

    private int yys314() {
        switch (yytok) {
            case GRIS:
            case '+':
            case '-':
            case AZUL:
            case MARRON:
            case EJECUTA:
            case NEGRO:
            case MENORQUE:
            case INTEGER:
            case IDENTIFIER:
            case ROJO:
            case FIN:
            case BLANCO:
            case '(':
            case '=':
            case '*':
            case error:
            case VERDE:
            case '<':
            case '[':
            case AMARILLO:
            case IGUALES:
            case CIAN:
            case PROCEDURE_NAME:
            case FLOAT:
            case ENDINPUT:
            case PARA:
            case MAYORQUE:
            case O:
            case Y:
            case PARAMETER:
            case '>':
            case '/':
                return 727;
        }
        return yyr183();
    }

    private int yys319() {
        switch (yytok) {
            case AZUL:
            case EJECUTA:
            case MENORQUE:
            case IDENTIFIER:
            case FIN:
            case '(':
            case ')':
            case VERDE:
            case '[':
            case IGUALES:
            case GRIS:
            case INTEGER:
            case '-':
            case NEGRO:
            case '=':
            case '*':
            case error:
            case Y:
            case MAYORQUE:
            case MARRON:
            case ENDINPUT:
            case ROJO:
            case CIAN:
            case PROCEDURE_NAME:
            case AMARILLO:
            case FLOAT:
            case '<':
            case PARA:
            case BLANCO:
            case O:
            case PARAMETER:
            case '>':
            case '/':
            case '+':
                return 727;
        }
        return yyr112();
    }

    private int yys321() {
        switch (yytok) {
            case GRIS:
            case '+':
            case '-':
            case AZUL:
            case MARRON:
            case EJECUTA:
            case NEGRO:
            case MENORQUE:
            case INTEGER:
            case IDENTIFIER:
            case ROJO:
            case FIN:
            case BLANCO:
            case '(':
            case '=':
            case '*':
            case error:
            case VERDE:
            case '<':
            case '[':
            case AMARILLO:
            case IGUALES:
            case CIAN:
            case PROCEDURE_NAME:
            case FLOAT:
            case ENDINPUT:
            case PARA:
            case MAYORQUE:
            case O:
            case Y:
            case PARAMETER:
            case '>':
            case '/':
                return 727;
        }
        return yyr191();
    }

    private int yys322() {
        switch (yytok) {
            case GRIS:
            case '+':
            case '-':
            case AZUL:
            case MARRON:
            case EJECUTA:
            case NEGRO:
            case MENORQUE:
            case INTEGER:
            case IDENTIFIER:
            case ROJO:
            case FIN:
            case BLANCO:
            case '(':
            case '=':
            case '*':
            case error:
            case VERDE:
            case '<':
            case '[':
            case AMARILLO:
            case IGUALES:
            case CIAN:
            case PROCEDURE_NAME:
            case FLOAT:
            case ENDINPUT:
            case PARA:
            case MAYORQUE:
            case O:
            case Y:
            case PARAMETER:
            case '>':
            case '/':
                return 727;
        }
        return yyr190();
    }

    private int yys323() {
        switch (yytok) {
            case APARECETORTUGA:
                return 17;
            case AT:
                return 18;
            case AV:
                return 19;
            case AVANZA:
                return 20;
            case AZAR:
                return 21;
            case BAJALAPIZ:
                return 22;
            case BL:
                return 23;
            case BORRAPANTALLA:
                return 24;
            case CENTRO:
                return 25;
            case COS:
                return 26;
            case CUENTA:
                return 27;
            case DIFERENCIA:
                return 28;
            case DIVISION:
                return 29;
            case ELEGIR:
                return 30;
            case ELEMENTO:
                return 31;
            case ESPERA:
                return 32;
            case GD:
                return 33;
            case GI:
                return 34;
            case GIRADERECHA:
                return 35;
            case GIRAIZQUIERDA:
                return 36;
            case INC:
                return 37;
            case INIC:
                return 38;
            case MENOS:
                return 39;
            case OCULTATORTUGA:
                return 40;
            case OT:
                return 41;
            case PONCL:
                return 42;
            case PONCOLORLAPIZ:
                return 43;
            case PONPOS:
                return 44;
            case PONRUMBO:
                return 45;
            case PONX:
                return 46;
            case PONXY:
                return 47;
            case PONY:
                return 48;
            case POTENCIA:
                return 49;
            case PRIMERO:
                return 50;
            case PRODUCTO:
                return 51;
            case RAIZCUADRADA:
                return 52;
            case RC:
                return 53;
            case RE:
                return 54;
            case REDONDEA:
                return 55;
            case REPITE:
                return 56;
            case RESTO:
                return 57;
            case RETROCEDE:
                return 58;
            case RUMBO:
                return 59;
            case SB:
                return 60;
            case SEN:
                return 61;
            case SENO:
                return 62;
            case SI:
                return 63;
            case SUBELAPIZ:
                return 64;
            case SUMA:
                return 65;
            case UL:
                return 66;
            case ULTIMO:
                return 67;
            case VAR:
                return 68;
            case ']':
                return yyr170();
        }
        return 727;
    }

    private int yys326() {
        switch (yytok) {
            case '*':
                return 186;
            case '+':
                return 187;
            case '-':
                return 188;
            case '/':
                return 189;
            case IGUALES:
            case FLOAT:
            case '[':
            case O:
            case '(':
            case Y:
            case MENORQUE:
            case MAYORQUE:
            case INTEGER:
                return yyr83();
        }
        return 727;
    }

    private int yys327() {
        switch (yytok) {
            case '*':
                return 194;
            case '+':
                return 195;
            case '-':
                return 196;
            case '/':
                return 197;
            case IGUALES:
            case FLOAT:
            case '[':
            case O:
            case '(':
            case Y:
            case MENORQUE:
            case MAYORQUE:
            case INTEGER:
                return yyr81();
        }
        return 727;
    }

    private int yys328() {
        switch (yytok) {
            case '*':
                return 186;
            case '+':
                return 187;
            case '-':
                return 188;
            case '/':
                return 189;
            case IGUALES:
            case FLOAT:
            case '[':
            case O:
            case '(':
            case Y:
            case MENORQUE:
            case MAYORQUE:
            case INTEGER:
                return yyr87();
        }
        return 727;
    }

    private int yys329() {
        switch (yytok) {
            case '*':
                return 194;
            case '+':
                return 195;
            case '-':
                return 196;
            case '/':
                return 197;
            case IGUALES:
            case FLOAT:
            case '[':
            case O:
            case '(':
            case Y:
            case MENORQUE:
            case MAYORQUE:
            case INTEGER:
                return yyr85();
        }
        return 727;
    }

    private int yys330() {
        switch (yytok) {
            case '*':
                return 186;
            case '+':
                return 187;
            case '-':
                return 188;
            case '/':
                return 189;
            case IGUALES:
            case FLOAT:
            case '[':
            case O:
            case '(':
            case Y:
            case MENORQUE:
            case MAYORQUE:
            case INTEGER:
                return yyr82();
        }
        return 727;
    }

    private int yys331() {
        switch (yytok) {
            case '*':
                return 194;
            case '+':
                return 195;
            case '-':
                return 196;
            case '/':
                return 197;
            case IGUALES:
            case FLOAT:
            case '[':
            case O:
            case '(':
            case Y:
            case MENORQUE:
            case MAYORQUE:
            case INTEGER:
                return yyr80();
        }
        return 727;
    }

    private int yys332() {
        switch (yytok) {
            case '*':
                return 186;
            case '+':
                return 187;
            case '-':
                return 188;
            case '/':
                return 189;
            case IGUALES:
            case FLOAT:
            case '[':
            case O:
            case '(':
            case Y:
            case MENORQUE:
            case MAYORQUE:
            case INTEGER:
                return yyr86();
        }
        return 727;
    }

    private int yys333() {
        switch (yytok) {
            case '*':
                return 194;
            case '+':
                return 195;
            case '-':
                return 196;
            case '/':
                return 197;
            case IGUALES:
            case FLOAT:
            case '[':
            case O:
            case '(':
            case Y:
            case MENORQUE:
            case MAYORQUE:
            case INTEGER:
                return yyr84();
        }
        return 727;
    }

    private int yys334() {
        switch (yytok) {
            case '*':
                return 186;
            case '+':
                return 187;
            case '-':
                return 188;
            case '/':
                return 189;
            case IGUALES:
            case FLOAT:
            case '[':
            case O:
            case '(':
            case Y:
            case MENORQUE:
            case MAYORQUE:
            case INTEGER:
                return yyr89();
        }
        return 727;
    }

    private int yys335() {
        switch (yytok) {
            case '*':
                return 194;
            case '+':
                return 195;
            case '-':
                return 196;
            case '/':
                return 197;
            case IGUALES:
            case FLOAT:
            case '[':
            case O:
            case '(':
            case Y:
            case MENORQUE:
            case MAYORQUE:
            case INTEGER:
                return yyr91();
        }
        return 727;
    }

    private int yys336() {
        switch (yytok) {
            case '*':
                return 186;
            case '+':
                return 187;
            case '-':
                return 188;
            case '/':
                return 189;
            case IGUALES:
            case FLOAT:
            case '[':
            case O:
            case '(':
            case Y:
            case MENORQUE:
            case MAYORQUE:
            case INTEGER:
                return yyr90();
        }
        return 727;
    }

    private int yys337() {
        switch (yytok) {
            case '*':
                return 194;
            case '+':
                return 195;
            case '-':
                return 196;
            case '/':
                return 197;
            case IGUALES:
            case FLOAT:
            case '[':
            case O:
            case '(':
            case Y:
            case MENORQUE:
            case MAYORQUE:
            case INTEGER:
                return yyr88();
        }
        return 727;
    }

    private int yys338() {
        switch (yytok) {
            case '*':
                return 186;
            case '+':
                return 187;
            case '-':
                return 188;
            case '/':
                return 189;
            case IGUALES:
            case FLOAT:
            case '[':
            case O:
            case '(':
            case Y:
            case MENORQUE:
            case MAYORQUE:
            case INTEGER:
                return yyr97();
        }
        return 727;
    }

    private int yys339() {
        switch (yytok) {
            case '*':
                return 194;
            case '+':
                return 195;
            case '-':
                return 196;
            case '/':
                return 197;
            case IGUALES:
            case FLOAT:
            case '[':
            case O:
            case '(':
            case Y:
            case MENORQUE:
            case MAYORQUE:
            case INTEGER:
                return yyr95();
        }
        return 727;
    }

    private int yys340() {
        switch (yytok) {
            case '*':
                return 186;
            case '+':
                return 187;
            case '-':
                return 188;
            case '/':
                return 189;
            case IGUALES:
            case FLOAT:
            case '[':
            case O:
            case '(':
            case Y:
            case MENORQUE:
            case MAYORQUE:
            case INTEGER:
                return yyr96();
        }
        return 727;
    }

    private int yys341() {
        switch (yytok) {
            case '*':
                return 194;
            case '+':
                return 195;
            case '-':
                return 196;
            case '/':
                return 197;
            case IGUALES:
            case FLOAT:
            case '[':
            case O:
            case '(':
            case Y:
            case MENORQUE:
            case MAYORQUE:
            case INTEGER:
                return yyr94();
        }
        return 727;
    }

    private int yys342() {
        switch (yytok) {
            case '*':
                return 186;
            case '+':
                return 187;
            case '-':
                return 188;
            case '/':
                return 189;
            case IGUALES:
            case FLOAT:
            case '[':
            case O:
            case '(':
            case Y:
            case MENORQUE:
            case MAYORQUE:
            case INTEGER:
                return yyr101();
        }
        return 727;
    }

    private int yys343() {
        switch (yytok) {
            case '*':
                return 194;
            case '+':
                return 195;
            case '-':
                return 196;
            case '/':
                return 197;
            case IGUALES:
            case FLOAT:
            case '[':
            case O:
            case '(':
            case Y:
            case MENORQUE:
            case MAYORQUE:
            case INTEGER:
                return yyr99();
        }
        return 727;
    }

    private int yys344() {
        switch (yytok) {
            case '*':
                return 186;
            case '+':
                return 187;
            case '-':
                return 188;
            case '/':
                return 189;
            case IGUALES:
            case FLOAT:
            case '[':
            case O:
            case '(':
            case Y:
            case MENORQUE:
            case MAYORQUE:
            case INTEGER:
                return yyr100();
        }
        return 727;
    }

    private int yys345() {
        switch (yytok) {
            case '*':
                return 194;
            case '+':
                return 195;
            case '-':
                return 196;
            case '/':
                return 197;
            case IGUALES:
            case FLOAT:
            case '[':
            case O:
            case '(':
            case Y:
            case MENORQUE:
            case MAYORQUE:
            case INTEGER:
                return yyr98();
        }
        return 727;
    }

    private int yys346() {
        switch (yytok) {
            case IGUALES:
            case FLOAT:
            case '[':
            case O:
            case '(':
            case Y:
            case MENORQUE:
            case MAYORQUE:
            case INTEGER:
                return yyr93();
        }
        return 727;
    }

    private int yys347() {
        switch (yytok) {
            case IGUALES:
            case FLOAT:
            case '[':
            case O:
            case '(':
            case Y:
            case MENORQUE:
            case MAYORQUE:
            case INTEGER:
                return yyr92();
        }
        return 727;
    }

    private int yys348() {
        switch (yytok) {
            case GRIS:
            case '+':
            case '-':
            case AZUL:
            case MARRON:
            case EJECUTA:
            case NEGRO:
            case MENORQUE:
            case INTEGER:
            case IDENTIFIER:
            case ROJO:
            case FIN:
            case BLANCO:
            case '(':
            case '=':
            case '*':
            case error:
            case VERDE:
            case '<':
            case '[':
            case AMARILLO:
            case IGUALES:
            case CIAN:
            case PROCEDURE_NAME:
            case FLOAT:
            case ENDINPUT:
            case PARA:
            case MAYORQUE:
            case O:
            case Y:
            case PARAMETER:
            case '>':
            case '/':
                return 727;
        }
        return yyr189();
    }

    private int yys349() {
        switch (yytok) {
            case GRIS:
            case '+':
            case '-':
            case AZUL:
            case MARRON:
            case EJECUTA:
            case NEGRO:
            case MENORQUE:
            case INTEGER:
            case IDENTIFIER:
            case ROJO:
            case FIN:
            case BLANCO:
            case '(':
            case '=':
            case '*':
            case error:
            case VERDE:
            case '<':
            case '[':
            case AMARILLO:
            case IGUALES:
            case CIAN:
            case PROCEDURE_NAME:
            case FLOAT:
            case ENDINPUT:
            case PARA:
            case MAYORQUE:
            case O:
            case Y:
            case PARAMETER:
            case '>':
            case '/':
                return 727;
        }
        return yyr188();
    }

    private int yys350() {
        switch (yytok) {
            case GRIS:
            case '+':
            case '-':
            case AZUL:
            case MARRON:
            case EJECUTA:
            case NEGRO:
            case MENORQUE:
            case INTEGER:
            case IDENTIFIER:
            case ROJO:
            case FIN:
            case BLANCO:
            case '(':
            case '=':
            case '*':
            case error:
            case VERDE:
            case '<':
            case '[':
            case AMARILLO:
            case IGUALES:
            case CIAN:
            case PROCEDURE_NAME:
            case FLOAT:
            case ENDINPUT:
            case PARA:
            case MAYORQUE:
            case O:
            case Y:
            case PARAMETER:
            case '>':
            case '/':
                return 727;
        }
        return yyr187();
    }

    private int yys351() {
        switch (yytok) {
            case GRIS:
            case '+':
            case '-':
            case AZUL:
            case MARRON:
            case EJECUTA:
            case NEGRO:
            case MENORQUE:
            case INTEGER:
            case IDENTIFIER:
            case ROJO:
            case FIN:
            case BLANCO:
            case '(':
            case '=':
            case '*':
            case error:
            case VERDE:
            case '<':
            case '[':
            case AMARILLO:
            case IGUALES:
            case CIAN:
            case PROCEDURE_NAME:
            case FLOAT:
            case ENDINPUT:
            case PARA:
            case MAYORQUE:
            case O:
            case Y:
            case PARAMETER:
            case '>':
            case '/':
                return 727;
        }
        return yyr186();
    }

    private int yys352() {
        switch (yytok) {
            case AZUL:
            case EJECUTA:
            case MENORQUE:
            case IDENTIFIER:
            case FIN:
            case '(':
            case ')':
            case VERDE:
            case '[':
            case IGUALES:
            case GRIS:
            case INTEGER:
            case '-':
            case NEGRO:
            case '=':
            case '*':
            case error:
            case Y:
            case MAYORQUE:
            case MARRON:
            case ENDINPUT:
            case ROJO:
            case CIAN:
            case PROCEDURE_NAME:
            case AMARILLO:
            case FLOAT:
            case '<':
            case PARA:
            case BLANCO:
            case O:
            case PARAMETER:
            case '>':
            case '/':
            case '+':
                return 727;
        }
        return yyr111();
    }

    private int yys354() {
        switch (yytok) {
            case GRIS:
            case '+':
            case '-':
            case AZUL:
            case MARRON:
            case EJECUTA:
            case NEGRO:
            case MENORQUE:
            case INTEGER:
            case IDENTIFIER:
            case ROJO:
            case FIN:
            case BLANCO:
            case '(':
            case '=':
            case '*':
            case error:
            case VERDE:
            case '<':
            case '[':
            case AMARILLO:
            case IGUALES:
            case CIAN:
            case PROCEDURE_NAME:
            case FLOAT:
            case ENDINPUT:
            case PARA:
            case MAYORQUE:
            case O:
            case Y:
            case PARAMETER:
            case '>':
            case '/':
                return 727;
        }
        return yyr193();
    }

    private int yys355() {
        switch (yytok) {
            case GRIS:
            case '+':
            case '-':
            case AZUL:
            case MARRON:
            case EJECUTA:
            case NEGRO:
            case MENORQUE:
            case INTEGER:
            case IDENTIFIER:
            case ROJO:
            case FIN:
            case BLANCO:
            case '(':
            case '=':
            case '*':
            case error:
            case VERDE:
            case '<':
            case '[':
            case AMARILLO:
            case IGUALES:
            case CIAN:
            case PROCEDURE_NAME:
            case FLOAT:
            case ENDINPUT:
            case PARA:
            case MAYORQUE:
            case O:
            case Y:
            case PARAMETER:
            case '>':
            case '/':
                return 727;
        }
        return yyr192();
    }

    private int yys356() {
        switch (yytok) {
            case AZUL:
            case EJECUTA:
            case MENORQUE:
            case IDENTIFIER:
            case FIN:
            case '(':
            case ')':
            case VERDE:
            case '[':
            case IGUALES:
            case GRIS:
            case INTEGER:
            case '-':
            case NEGRO:
            case '=':
            case '*':
            case error:
            case Y:
            case MAYORQUE:
            case MARRON:
            case ENDINPUT:
            case ROJO:
            case CIAN:
            case PROCEDURE_NAME:
            case AMARILLO:
            case FLOAT:
            case '<':
            case PARA:
            case BLANCO:
            case O:
            case PARAMETER:
            case '>':
            case '/':
            case '+':
                return 727;
        }
        return yyr181();
    }

    private int yys357() {
        switch (yytok) {
            case AZUL:
            case EJECUTA:
            case MENORQUE:
            case IDENTIFIER:
            case FIN:
            case '(':
            case ')':
            case VERDE:
            case '[':
            case IGUALES:
            case GRIS:
            case INTEGER:
            case '-':
            case NEGRO:
            case '=':
            case '*':
            case error:
            case Y:
            case MAYORQUE:
            case MARRON:
            case ENDINPUT:
            case ROJO:
            case CIAN:
            case PROCEDURE_NAME:
            case AMARILLO:
            case FLOAT:
            case '<':
            case PARA:
            case BLANCO:
            case O:
            case PARAMETER:
            case '>':
            case '/':
            case '+':
                return 727;
        }
        return yyr180();
    }

    private int yys358() {
        switch (yytok) {
            case AZUL:
            case EJECUTA:
            case MENORQUE:
            case IDENTIFIER:
            case FIN:
            case '(':
            case ')':
            case VERDE:
            case '[':
            case IGUALES:
            case GRIS:
            case INTEGER:
            case '-':
            case NEGRO:
            case '=':
            case '*':
            case error:
            case Y:
            case MAYORQUE:
            case MARRON:
            case ENDINPUT:
            case ROJO:
            case CIAN:
            case PROCEDURE_NAME:
            case AMARILLO:
            case FLOAT:
            case '<':
            case PARA:
            case BLANCO:
            case O:
            case PARAMETER:
            case '>':
            case '/':
            case '+':
                return 727;
        }
        return yyr182();
    }

    private int yys360() {
        switch (yytok) {
            case AZUL:
            case EJECUTA:
            case MENORQUE:
            case IDENTIFIER:
            case FIN:
            case '(':
            case ')':
            case VERDE:
            case '[':
            case IGUALES:
            case GRIS:
            case INTEGER:
            case '-':
            case NEGRO:
            case '=':
            case '*':
            case error:
            case Y:
            case MAYORQUE:
            case MARRON:
            case ENDINPUT:
            case ROJO:
            case CIAN:
            case PROCEDURE_NAME:
            case AMARILLO:
            case FLOAT:
            case '<':
            case PARA:
            case BLANCO:
            case O:
            case PARAMETER:
            case '>':
            case '/':
            case '+':
                return 727;
        }
        return yyr194();
    }

    private int yys361() {
        switch (yytok) {
            case AZUL:
            case EJECUTA:
            case MENORQUE:
            case IDENTIFIER:
            case FIN:
            case '(':
            case ')':
            case VERDE:
            case '[':
            case IGUALES:
            case GRIS:
            case INTEGER:
            case '-':
            case NEGRO:
            case '=':
            case '*':
            case error:
            case Y:
            case MAYORQUE:
            case MARRON:
            case ENDINPUT:
            case ROJO:
            case CIAN:
            case PROCEDURE_NAME:
            case AMARILLO:
            case FLOAT:
            case '<':
            case PARA:
            case BLANCO:
            case O:
            case PARAMETER:
            case '>':
            case '/':
            case '+':
                return 727;
        }
        return yyr195();
    }

    private int yyr1() { // program_end : program
        { parsingDone(); }
        yysv[yysp-=1] = yyrv;
        return 1;
    }

    private int yyr80() { // boolean_value : integer_value '<' integer_value
        { yyrv = (((Integer)yysv[yysp-3]) < ((Integer)yysv[yysp-1])); }
        yysv[yysp-=3] = yyrv;
        return yypboolean_value();
    }

    private int yyr81() { // boolean_value : float_value '<' integer_value
        { yyrv = (((Float)yysv[yysp-3]) < ((Integer)yysv[yysp-1])); }
        yysv[yysp-=3] = yyrv;
        return yypboolean_value();
    }

    private int yyr82() { // boolean_value : integer_value '<' float_value
        { yyrv = (((Integer)yysv[yysp-3]) < ((Float)yysv[yysp-1])); }
        yysv[yysp-=3] = yyrv;
        return yypboolean_value();
    }

    private int yyr83() { // boolean_value : float_value '<' float_value
        { yyrv = (((Float)yysv[yysp-3]) < ((Float)yysv[yysp-1])); }
        yysv[yysp-=3] = yyrv;
        return yypboolean_value();
    }

    private int yyr84() { // boolean_value : integer_value '>' integer_value
        { yyrv = (((Integer)yysv[yysp-3]) > ((Integer)yysv[yysp-1])); }
        yysv[yysp-=3] = yyrv;
        return yypboolean_value();
    }

    private int yyr85() { // boolean_value : float_value '>' integer_value
        { yyrv = (((Float)yysv[yysp-3]) > ((Integer)yysv[yysp-1])); }
        yysv[yysp-=3] = yyrv;
        return yypboolean_value();
    }

    private int yyr86() { // boolean_value : integer_value '>' float_value
        { yyrv = (((Integer)yysv[yysp-3]) > ((Float)yysv[yysp-1])); }
        yysv[yysp-=3] = yyrv;
        return yypboolean_value();
    }

    private int yyr87() { // boolean_value : float_value '>' float_value
        { yyrv = (((Float)yysv[yysp-3]) > ((Float)yysv[yysp-1])); }
        yysv[yysp-=3] = yyrv;
        return yypboolean_value();
    }

    private int yyr88() { // boolean_value : IGUALES integer_value integer_value
        { yyrv = ((Integer)yysv[yysp-2]).equals(((Integer)yysv[yysp-1])); }
        yysv[yysp-=3] = yyrv;
        return yypboolean_value();
    }

    private int yyr89() { // boolean_value : IGUALES float_value float_value
        { yyrv = ((Float)yysv[yysp-2]).equals(((Float)yysv[yysp-1])); }
        yysv[yysp-=3] = yyrv;
        return yypboolean_value();
    }

    private int yyr90() { // boolean_value : IGUALES integer_value float_value
        { yyrv = false; }
        yysv[yysp-=3] = yyrv;
        return yypboolean_value();
    }

    private int yyr91() { // boolean_value : IGUALES float_value integer_value
        { yyrv = false; }
        yysv[yysp-=3] = yyrv;
        return yypboolean_value();
    }

    private int yyr92() { // boolean_value : Y boolean_value boolean_value
        yysp -= 3;
        return yypboolean_value();
    }

    private int yyr93() { // boolean_value : O boolean_value boolean_value
        yysp -= 3;
        return yypboolean_value();
    }

    private int yyr94() { // boolean_value : MAYORQUE integer_value integer_value
        { yyrv = (((Integer)yysv[yysp-2]) > ((Integer)yysv[yysp-1])); }
        yysv[yysp-=3] = yyrv;
        return yypboolean_value();
    }

    private int yyr95() { // boolean_value : MAYORQUE float_value integer_value
        { yyrv = (((Float)yysv[yysp-2]) > ((Integer)yysv[yysp-1])); }
        yysv[yysp-=3] = yyrv;
        return yypboolean_value();
    }

    private int yyr96() { // boolean_value : MAYORQUE integer_value float_value
        { yyrv = (((Integer)yysv[yysp-2]) > ((Float)yysv[yysp-1])); }
        yysv[yysp-=3] = yyrv;
        return yypboolean_value();
    }

    private int yyr97() { // boolean_value : MAYORQUE float_value float_value
        { yyrv = (((Float)yysv[yysp-2]) > ((Float)yysv[yysp-1])); }
        yysv[yysp-=3] = yyrv;
        return yypboolean_value();
    }

    private int yyr98() { // boolean_value : MENORQUE integer_value integer_value
        { yyrv = (((Integer)yysv[yysp-2]) < ((Integer)yysv[yysp-1])); }
        yysv[yysp-=3] = yyrv;
        return yypboolean_value();
    }

    private int yyr99() { // boolean_value : MENORQUE float_value integer_value
        { yyrv = (((Float)yysv[yysp-2]) < ((Integer)yysv[yysp-1])); }
        yysv[yysp-=3] = yyrv;
        return yypboolean_value();
    }

    private int yyr100() { // boolean_value : MENORQUE integer_value float_value
        { yyrv = (((Integer)yysv[yysp-2]) < ((Float)yysv[yysp-1])); }
        yysv[yysp-=3] = yyrv;
        return yypboolean_value();
    }

    private int yyr101() { // boolean_value : MENORQUE float_value float_value
        { yyrv = (((Float)yysv[yysp-2]) < ((Float)yysv[yysp-1])); }
        yysv[yysp-=3] = yyrv;
        return yypboolean_value();
    }

    private int yypboolean_value() {
        switch (yyst[yysp-1]) {
            case 245: return 346;
            case 154: return 246;
            case 153: return 245;
            case 63: return 147;
            default: return 347;
        }
    }

    private int yyr113() { // color : BLANCO
        { yyrv = "blanco"; }
        yysv[yysp-=1] = yyrv;
        return yypcolor();
    }

    private int yyr114() { // color : AZUL
        { yyrv = "azul"; }
        yysv[yysp-=1] = yyrv;
        return yypcolor();
    }

    private int yyr115() { // color : MARRON
        { yyrv = "marron"; }
        yysv[yysp-=1] = yyrv;
        return yypcolor();
    }

    private int yyr116() { // color : CIAN
        { yyrv = "cian"; }
        yysv[yysp-=1] = yyrv;
        return yypcolor();
    }

    private int yyr117() { // color : GRIS
        { yyrv = "gris"; }
        yysv[yysp-=1] = yyrv;
        return yypcolor();
    }

    private int yyr118() { // color : AMARILLO
        { yyrv = "amarillo"; }
        yysv[yysp-=1] = yyrv;
        return yypcolor();
    }

    private int yyr119() { // color : NEGRO
        { yyrv = "negro"; }
        yysv[yysp-=1] = yyrv;
        return yypcolor();
    }

    private int yyr120() { // color : ROJO
        { yyrv = "rojo"; }
        yysv[yysp-=1] = yyrv;
        return yypcolor();
    }

    private int yyr121() { // color : VERDE
        { yyrv = "verde"; }
        yysv[yysp-=1] = yyrv;
        return yypcolor();
    }

    private int yypcolor() {
        switch (yyst[yysp-1]) {
            case 42: return 112;
            default: return 122;
        }
    }

    private int yyr110() { // declaration_expr : VAR IDENTIFIER
        { yyrv = instr("var", InstructionType.VARIABLE, ReturnType.VOID, ((String)yysv[yysp-1])); }
        yysv[yysp-=2] = yyrv;
        return 2;
    }

    private int yyr111() { // declaration_expr : VAR IDENTIFIER '=' argument
        { yyrv = instr("var", InstructionType.VARIABLE, ReturnType.VOID, arguments.stringArg(((String)yysv[yysp-3])), ((String)yysv[yysp-1])); }
        yysv[yysp-=4] = yyrv;
        return 2;
    }

    private int yyr4() { // expression : declaration_expr
        yysp -= 1;
        return yypexpression();
    }

    private int yyr5() { // expression : redeclaration_expr
        yysp -= 1;
        return yypexpression();
    }

    private int yyr6() { // expression : proc
        yysp -= 1;
        return yypexpression();
    }

    private int yyr7() { // expression : proc1
        yysp -= 1;
        return yypexpression();
    }

    private int yyr8() { // expression : val_proc1
        yysp -= 1;
        return yypexpression();
    }

    private int yyr9() { // expression : proc2
        yysp -= 1;
        return yypexpression();
    }

    private int yyr10() { // expression : val_proc2
        yysp -= 1;
        return yypexpression();
    }

    private int yyr11() { // expression : val_proc_n
        yysp -= 1;
        return yypexpression();
    }

    private int yyr12() { // expression : proc_p
        yysp -= 1;
        return yypexpression();
    }

    private int yyr13() { // expression : val_proc_p
        yysp -= 1;
        return yypexpression();
    }

    private int yyr14() { // expression : val_proc_1p
        yysp -= 1;
        return yypexpression();
    }

    private int yyr15() { // expression : proc_loop
        yysp -= 1;
        return yypexpression();
    }

    private int yyr16() { // expression : proc_cond
        yysp -= 1;
        return yypexpression();
    }

    private int yypexpression() {
        switch (yyst[yysp-1]) {
            case 69: return 3;
            case 0: return 3;
            default: return 323;
        }
    }

    private int yyr41() { // float : float_value
        { yyrv = arguments.floatArg(((Float)yysv[yysp-1])); }
        yysv[yysp-=1] = yyrv;
        switch (yyst[yysp-1]) {
            case 231: return 198;
            case 230: return 198;
            case 229: return 198;
            case 228: return 198;
            case 193: return 198;
            case 192: return 198;
            case 191: return 198;
            case 190: return 198;
            case 185: return 286;
            case 184: return 283;
            case 183: return 280;
            case 182: return 277;
            case 181: return 198;
            case 180: return 198;
            case 179: return 198;
            case 178: return 198;
            case 141: return 198;
            case 92: return 198;
            case 88: return 198;
            default: return 79;
        }
    }

    private int yyr42() { // float_arg : float
        yysp -= 1;
        return yypfloat_arg();
    }

    private int yyr43() { // float_arg : float_expr
        yysp -= 1;
        return yypfloat_arg();
    }

    private int yypfloat_arg() {
        switch (yyst[yysp-1]) {
            case 219: return 317;
            case 218: return 210;
            case 210: return 210;
            case 160: return 210;
            case 159: return 210;
            case 131: return 210;
            case 130: return 225;
            case 101: return 210;
            case 94: return 210;
            case 65: return 94;
            case 55: return 138;
            case 51: return 94;
            case 49: return 128;
            case 39: return 110;
            case 28: return 94;
            case 21: return 80;
            default: return 89;
        }
    }

    private int yyr58() { // float_expr : float_expr '+' float
        { yyrv = instr("+", InstructionType.OPERATION, ReturnType.FLOAT, ((String)yysv[yysp-3]), ((String)yysv[yysp-1])); }
        yysv[yysp-=3] = yyrv;
        return yypfloat_expr();
    }

    private int yyr59() { // float_expr : float_expr '+' integer
        { yyrv = instr("+", InstructionType.OPERATION, ReturnType.FLOAT, ((String)yysv[yysp-3]), ((String)yysv[yysp-1])); }
        yysv[yysp-=3] = yyrv;
        return yypfloat_expr();
    }

    private int yyr60() { // float_expr : float '+' float_expr
        { yyrv = instr("+", InstructionType.OPERATION, ReturnType.FLOAT, ((String)yysv[yysp-3]), ((String)yysv[yysp-1])); }
        yysv[yysp-=3] = yyrv;
        return yypfloat_expr();
    }

    private int yyr61() { // float_expr : integer '+' float_expr
        { yyrv = instr("+", InstructionType.OPERATION, ReturnType.FLOAT, ((String)yysv[yysp-3]), ((String)yysv[yysp-1])); }
        yysv[yysp-=3] = yyrv;
        return yypfloat_expr();
    }

    private int yyr62() { // float_expr : float_expr '+' float_expr
        { yyrv = instr("+", InstructionType.OPERATION, ReturnType.FLOAT, ((String)yysv[yysp-3]), ((String)yysv[yysp-1])); }
        yysv[yysp-=3] = yyrv;
        return yypfloat_expr();
    }

    private int yyr63() { // float_expr : float_expr '-' float
        { yyrv = instr("-", InstructionType.OPERATION, ReturnType.FLOAT, ((String)yysv[yysp-3]), ((String)yysv[yysp-1])); }
        yysv[yysp-=3] = yyrv;
        return yypfloat_expr();
    }

    private int yyr64() { // float_expr : float_expr '-' integer
        { yyrv = instr("-", InstructionType.OPERATION, ReturnType.FLOAT, ((String)yysv[yysp-3]), ((String)yysv[yysp-1])); }
        yysv[yysp-=3] = yyrv;
        return yypfloat_expr();
    }

    private int yyr65() { // float_expr : float '-' float_expr
        { yyrv = instr("-", InstructionType.OPERATION, ReturnType.FLOAT, ((String)yysv[yysp-3]), ((String)yysv[yysp-1])); }
        yysv[yysp-=3] = yyrv;
        return yypfloat_expr();
    }

    private int yyr66() { // float_expr : integer '-' float_expr
        { yyrv = instr("-", InstructionType.OPERATION, ReturnType.FLOAT, ((String)yysv[yysp-3]), ((String)yysv[yysp-1])); }
        yysv[yysp-=3] = yyrv;
        return yypfloat_expr();
    }

    private int yyr67() { // float_expr : float_expr '-' float_expr
        { yyrv = instr("-", InstructionType.OPERATION, ReturnType.FLOAT, ((String)yysv[yysp-3]), ((String)yysv[yysp-1])); }
        yysv[yysp-=3] = yyrv;
        return yypfloat_expr();
    }

    private int yyr68() { // float_expr : float_expr '*' float
        { yyrv = instr("*", InstructionType.OPERATION, ReturnType.FLOAT, ((String)yysv[yysp-3]), ((String)yysv[yysp-1])); }
        yysv[yysp-=3] = yyrv;
        return yypfloat_expr();
    }

    private int yyr69() { // float_expr : float_expr '*' integer
        { yyrv = instr("*", InstructionType.OPERATION, ReturnType.FLOAT, ((String)yysv[yysp-3]), ((String)yysv[yysp-1])); }
        yysv[yysp-=3] = yyrv;
        return yypfloat_expr();
    }

    private int yyr70() { // float_expr : float '*' float_expr
        { yyrv = instr("*", InstructionType.OPERATION, ReturnType.FLOAT, ((String)yysv[yysp-3]), ((String)yysv[yysp-1])); }
        yysv[yysp-=3] = yyrv;
        return yypfloat_expr();
    }

    private int yyr71() { // float_expr : integer '*' float_expr
        { yyrv = instr("*", InstructionType.OPERATION, ReturnType.FLOAT, ((String)yysv[yysp-3]), ((String)yysv[yysp-1])); }
        yysv[yysp-=3] = yyrv;
        return yypfloat_expr();
    }

    private int yyr72() { // float_expr : float_expr '*' float_expr
        { yyrv = instr("*", InstructionType.OPERATION, ReturnType.FLOAT, ((String)yysv[yysp-3]), ((String)yysv[yysp-1])); }
        yysv[yysp-=3] = yyrv;
        return yypfloat_expr();
    }

    private int yyr73() { // float_expr : float_expr '/' float
        { yyrv = instr("/", InstructionType.OPERATION, ReturnType.FLOAT, ((String)yysv[yysp-3]), ((String)yysv[yysp-1])); }
        yysv[yysp-=3] = yyrv;
        return yypfloat_expr();
    }

    private int yyr74() { // float_expr : float_expr '/' integer
        { yyrv = instr("/", InstructionType.OPERATION, ReturnType.FLOAT, ((String)yysv[yysp-3]), ((String)yysv[yysp-1])); }
        yysv[yysp-=3] = yyrv;
        return yypfloat_expr();
    }

    private int yyr75() { // float_expr : float '/' float_expr
        { yyrv = instr("/", InstructionType.OPERATION, ReturnType.FLOAT, ((String)yysv[yysp-3]), ((String)yysv[yysp-1])); }
        yysv[yysp-=3] = yyrv;
        return yypfloat_expr();
    }

    private int yyr76() { // float_expr : integer '/' float_expr
        { yyrv = instr("/", InstructionType.OPERATION, ReturnType.FLOAT, ((String)yysv[yysp-3]), ((String)yysv[yysp-1])); }
        yysv[yysp-=3] = yyrv;
        return yypfloat_expr();
    }

    private int yyr77() { // float_expr : float_expr '/' float_expr
        { yyrv = instr("/", InstructionType.OPERATION, ReturnType.FLOAT, ((String)yysv[yysp-3]), ((String)yysv[yysp-1])); }
        yysv[yysp-=3] = yyrv;
        return yypfloat_expr();
    }

    private int yyr78() { // float_expr : '(' float_expr ')'
        { yyrv = ((String)yysv[yysp-2]); }
        yysv[yysp-=3] = yyrv;
        return yypfloat_expr();
    }

    private int yyr79() { // float_expr : variable
        { yyrv = ((String)yysv[yysp-1]); }
        yysv[yysp-=1] = yyrv;
        return yypfloat_expr();
    }

    private int yypfloat_expr() {
        switch (yyst[yysp-1]) {
            case 231: return 300;
            case 230: return 299;
            case 229: return 298;
            case 228: return 297;
            case 193: return 300;
            case 192: return 299;
            case 191: return 298;
            case 190: return 297;
            case 185: return 287;
            case 184: return 284;
            case 183: return 281;
            case 182: return 278;
            case 181: return 276;
            case 180: return 275;
            case 179: return 274;
            case 178: return 273;
            case 141: return 199;
            case 92: return 199;
            case 88: return 199;
            default: return 81;
        }
    }

    private int yyr44() { // float_value : float_value '+' integer_value
        { yyrv = ((Float)yysv[yysp-3]) + ((Integer)yysv[yysp-1]); }
        yysv[yysp-=3] = yyrv;
        return yypfloat_value();
    }

    private int yyr45() { // float_value : integer_value '+' float_value
        { yyrv = ((Integer)yysv[yysp-3]) + ((Float)yysv[yysp-1]); }
        yysv[yysp-=3] = yyrv;
        return yypfloat_value();
    }

    private int yyr46() { // float_value : float_value '+' float_value
        { yyrv = ((Float)yysv[yysp-3]) + ((Float)yysv[yysp-1]); }
        yysv[yysp-=3] = yyrv;
        return yypfloat_value();
    }

    private int yyr47() { // float_value : float_value '-' integer_value
        { yyrv = ((Float)yysv[yysp-3]) - ((Integer)yysv[yysp-1]); }
        yysv[yysp-=3] = yyrv;
        return yypfloat_value();
    }

    private int yyr48() { // float_value : integer_value '-' float_value
        { yyrv = ((Integer)yysv[yysp-3]) - ((Float)yysv[yysp-1]); }
        yysv[yysp-=3] = yyrv;
        return yypfloat_value();
    }

    private int yyr49() { // float_value : float_value '-' float_value
        { yyrv = ((Float)yysv[yysp-3]) - ((Float)yysv[yysp-1]); }
        yysv[yysp-=3] = yyrv;
        return yypfloat_value();
    }

    private int yyr50() { // float_value : float_value '*' integer_value
        { yyrv = ((Float)yysv[yysp-3]) * ((Integer)yysv[yysp-1]); }
        yysv[yysp-=3] = yyrv;
        return yypfloat_value();
    }

    private int yyr51() { // float_value : integer_value '*' float_value
        { yyrv = ((Integer)yysv[yysp-3]) * ((Float)yysv[yysp-1]); }
        yysv[yysp-=3] = yyrv;
        return yypfloat_value();
    }

    private int yyr52() { // float_value : float_value '*' float_value
        { yyrv = ((Float)yysv[yysp-3]) * ((Float)yysv[yysp-1]); }
        yysv[yysp-=3] = yyrv;
        return yypfloat_value();
    }

    private int yyr53() { // float_value : float_value '/' integer_value
        { yyrv = ((Float)yysv[yysp-3]) / ((Integer)yysv[yysp-1]); }
        yysv[yysp-=3] = yyrv;
        return yypfloat_value();
    }

    private int yyr54() { // float_value : integer_value '/' float_value
        { yyrv = ((Integer)yysv[yysp-3]) / ((Float)yysv[yysp-1]); }
        yysv[yysp-=3] = yyrv;
        return yypfloat_value();
    }

    private int yyr55() { // float_value : float_value '/' float_value
        { yyrv = ((Float)yysv[yysp-3]) / ((Float)yysv[yysp-1]); }
        yysv[yysp-=3] = yyrv;
        return yypfloat_value();
    }

    private int yyr56() { // float_value : '(' float_value ')'
        { yyrv = ((Float)yysv[yysp-2]); }
        yysv[yysp-=3] = yyrv;
        return yypfloat_value();
    }

    private int yyr57() { // float_value : FLOAT
        { yyrv = ((Float)yysv[yysp-1]); }
        yysv[yysp-=1] = yyrv;
        return yypfloat_value();
    }

    private int yypfloat_value() {
        switch (yyst[yysp-1]) {
            case 246: return 148;
            case 245: return 148;
            case 244: return 344;
            case 243: return 342;
            case 242: return 340;
            case 241: return 338;
            case 240: return 336;
            case 239: return 334;
            case 238: return 332;
            case 237: return 330;
            case 236: return 328;
            case 235: return 326;
            case 197: return 307;
            case 196: return 305;
            case 195: return 303;
            case 194: return 301;
            case 189: return 295;
            case 188: return 293;
            case 187: return 291;
            case 186: return 289;
            case 155: return 247;
            case 154: return 148;
            case 153: return 148;
            case 152: return 243;
            case 151: return 241;
            case 150: return 239;
            case 141: return 200;
            case 92: return 200;
            case 88: return 200;
            case 63: return 148;
            default: return 82;
        }
    }

    private int yyr102() { // instr_arg : val_proc1
        { yyrv = arguments.instrArg(((String)yysv[yysp-1])); }
        yysv[yysp-=1] = yyrv;
        return 203;
    }

    private int yyr103() { // instr_arg : val_proc2
        { yyrv = arguments.instrArg(((String)yysv[yysp-1])); }
        yysv[yysp-=1] = yyrv;
        return 203;
    }

    private int yyr104() { // instr_arg : val_proc_p
        { yyrv = arguments.instrArg(((String)yysv[yysp-1])); }
        yysv[yysp-=1] = yyrv;
        return 203;
    }

    private int yyr105() { // instr_arg : val_proc_1p
        { yyrv = arguments.instrArg(((String)yysv[yysp-1])); }
        yysv[yysp-=1] = yyrv;
        return 203;
    }

    private int yyr106() { // instr_arg : val_proc_n
        { yyrv = arguments.instrArg(((String)yysv[yysp-1])); }
        yysv[yysp-=1] = yyrv;
        return 203;
    }

    private int yyr18() { // integer : integer_value
        { yyrv = arguments.intArg(((Integer)yysv[yysp-1])); }
        yysv[yysp-=1] = yyrv;
        switch (yyst[yysp-1]) {
            case 231: return 139;
            case 230: return 139;
            case 229: return 139;
            case 228: return 139;
            case 221: return 70;
            case 212: return 70;
            case 210: return 139;
            case 193: return 201;
            case 192: return 201;
            case 191: return 201;
            case 190: return 201;
            case 185: return 288;
            case 184: return 285;
            case 183: return 282;
            case 182: return 279;
            case 181: return 139;
            case 180: return 139;
            case 179: return 139;
            case 178: return 139;
            case 170: return 264;
            case 169: return 262;
            case 168: return 260;
            case 167: return 258;
            case 166: return 175;
            case 165: return 175;
            case 164: return 175;
            case 163: return 175;
            case 143: return 70;
            case 141: return 139;
            case 130: return 139;
            case 129: return 70;
            case 128: return 70;
            case 126: return 70;
            case 123: return 70;
            case 95: return 70;
            case 94: return 139;
            case 92: return 201;
            case 88: return 201;
            case 77: return 175;
            case 58: return 70;
            case 57: return 70;
            case 56: return 70;
            case 55: return 139;
            case 54: return 70;
            case 47: return 70;
            case 31: return 70;
            case 20: return 70;
            case 19: return 70;
            default: return 83;
        }
    }

    private int yyr19() { // integer_arg : integer
        yysp -= 1;
        return yypinteger_arg();
    }

    private int yyr20() { // integer_arg : integer_expr
        yysp -= 1;
        return yypinteger_arg();
    }

    private int yypinteger_arg() {
        switch (yyst[yysp-1]) {
            case 221: return 320;
            case 219: return 318;
            case 218: return 212;
            case 212: return 212;
            case 160: return 212;
            case 159: return 212;
            case 143: return 233;
            case 131: return 212;
            case 129: return 224;
            case 128: return 223;
            case 126: return 222;
            case 123: return 221;
            case 101: return 212;
            case 95: return 212;
            case 65: return 95;
            case 58: return 144;
            case 57: return 143;
            case 56: return 142;
            case 54: return 137;
            case 51: return 95;
            case 49: return 129;
            case 47: return 126;
            case 39: return 111;
            case 31: return 102;
            case 28: return 95;
            case 21: return 84;
            case 20: return 78;
            case 19: return 71;
            default: return 90;
        }
    }

    private int yyr27() { // integer_expr : integer_expr '+' integer
        { yyrv = instr("+", InstructionType.OPERATION, ReturnType.INTEGER, ((String)yysv[yysp-3]), ((String)yysv[yysp-1])); }
        yysv[yysp-=3] = yyrv;
        return yypinteger_expr();
    }

    private int yyr28() { // integer_expr : integer '+' integer_expr
        { yyrv = instr("+", InstructionType.OPERATION, ReturnType.INTEGER, ((String)yysv[yysp-3]), ((String)yysv[yysp-1])); }
        yysv[yysp-=3] = yyrv;
        return yypinteger_expr();
    }

    private int yyr29() { // integer_expr : integer_expr '+' integer_expr
        { yyrv = instr("+", InstructionType.OPERATION, ReturnType.INTEGER, ((String)yysv[yysp-3]), ((String)yysv[yysp-1])); }
        yysv[yysp-=3] = yyrv;
        return yypinteger_expr();
    }

    private int yyr30() { // integer_expr : integer_expr '-' integer
        { yyrv = instr("-", InstructionType.OPERATION, ReturnType.INTEGER, ((String)yysv[yysp-3]), ((String)yysv[yysp-1])); }
        yysv[yysp-=3] = yyrv;
        return yypinteger_expr();
    }

    private int yyr31() { // integer_expr : integer '-' integer_expr
        { yyrv = instr("-", InstructionType.OPERATION, ReturnType.INTEGER, ((String)yysv[yysp-3]), ((String)yysv[yysp-1])); }
        yysv[yysp-=3] = yyrv;
        return yypinteger_expr();
    }

    private int yyr32() { // integer_expr : integer_expr '-' integer_expr
        { yyrv = instr("-", InstructionType.OPERATION, ReturnType.INTEGER, ((String)yysv[yysp-3]), ((String)yysv[yysp-1])); }
        yysv[yysp-=3] = yyrv;
        return yypinteger_expr();
    }

    private int yyr33() { // integer_expr : integer_expr '*' integer
        { yyrv = instr("*", InstructionType.OPERATION, ReturnType.INTEGER, ((String)yysv[yysp-3]), ((String)yysv[yysp-1])); }
        yysv[yysp-=3] = yyrv;
        return yypinteger_expr();
    }

    private int yyr34() { // integer_expr : integer '*' integer_expr
        { yyrv = instr("*", InstructionType.OPERATION, ReturnType.INTEGER, ((String)yysv[yysp-3]), ((String)yysv[yysp-1])); }
        yysv[yysp-=3] = yyrv;
        return yypinteger_expr();
    }

    private int yyr35() { // integer_expr : integer_expr '*' integer_expr
        { yyrv = instr("*", InstructionType.OPERATION, ReturnType.INTEGER, ((String)yysv[yysp-3]), ((String)yysv[yysp-1])); }
        yysv[yysp-=3] = yyrv;
        return yypinteger_expr();
    }

    private int yyr36() { // integer_expr : integer_expr '/' integer
        { yyrv = instr("/", InstructionType.OPERATION, ReturnType.INTEGER, ((String)yysv[yysp-3]), ((String)yysv[yysp-1])); }
        yysv[yysp-=3] = yyrv;
        return yypinteger_expr();
    }

    private int yyr37() { // integer_expr : integer '/' integer_expr
        { yyrv = instr("/", InstructionType.OPERATION, ReturnType.INTEGER, ((String)yysv[yysp-3]), ((String)yysv[yysp-1])); }
        yysv[yysp-=3] = yyrv;
        return yypinteger_expr();
    }

    private int yyr38() { // integer_expr : integer_expr '/' integer_expr
        { yyrv = instr("/", InstructionType.OPERATION, ReturnType.INTEGER, ((String)yysv[yysp-3]), ((String)yysv[yysp-1])); }
        yysv[yysp-=3] = yyrv;
        return yypinteger_expr();
    }

    private int yyr39() { // integer_expr : '(' integer_expr ')'
        { yyrv = ((String)yysv[yysp-2]); }
        yysv[yysp-=3] = yyrv;
        return yypinteger_expr();
    }

    private int yyr40() { // integer_expr : variable
        { yyrv = ((String)yysv[yysp-1]); }
        yysv[yysp-=1] = yyrv;
        return yypinteger_expr();
    }

    private int yypinteger_expr() {
        switch (yyst[yysp-1]) {
            case 193: return 257;
            case 192: return 256;
            case 191: return 255;
            case 190: return 254;
            case 170: return 265;
            case 169: return 263;
            case 168: return 261;
            case 167: return 259;
            case 166: return 257;
            case 165: return 256;
            case 164: return 255;
            case 163: return 254;
            case 92: return 176;
            case 88: return 176;
            case 77: return 176;
            default: return 72;
        }
    }

    private int yyr21() { // integer_value : integer_value '+' integer_value
        { yyrv = ((Integer)yysv[yysp-3]) + ((Integer)yysv[yysp-1]); }
        yysv[yysp-=3] = yyrv;
        return yypinteger_value();
    }

    private int yyr22() { // integer_value : integer_value '-' integer_value
        { yyrv = ((Integer)yysv[yysp-3]) - ((Integer)yysv[yysp-1]); }
        yysv[yysp-=3] = yyrv;
        return yypinteger_value();
    }

    private int yyr23() { // integer_value : integer_value '*' integer_value
        { yyrv = ((Integer)yysv[yysp-3]) * ((Integer)yysv[yysp-1]); }
        yysv[yysp-=3] = yyrv;
        return yypinteger_value();
    }

    private int yyr24() { // integer_value : integer_value '/' integer_value
        { yyrv = (((Integer)yysv[yysp-3]) / ((Integer)yysv[yysp-1])); }
        yysv[yysp-=3] = yyrv;
        return yypinteger_value();
    }

    private int yyr25() { // integer_value : '(' integer_value ')'
        { yyrv = ((Integer)yysv[yysp-2]); }
        yysv[yysp-=3] = yyrv;
        return yypinteger_value();
    }

    private int yyr26() { // integer_value : INTEGER
        { yyrv = ((Integer)yysv[yysp-1]); }
        yysv[yysp-=1] = yyrv;
        return yypinteger_value();
    }

    private int yypinteger_value() {
        switch (yyst[yysp-1]) {
            case 267: return 353;
            case 246: return 149;
            case 245: return 149;
            case 244: return 345;
            case 243: return 343;
            case 242: return 341;
            case 241: return 339;
            case 240: return 337;
            case 239: return 335;
            case 238: return 333;
            case 237: return 331;
            case 236: return 329;
            case 235: return 327;
            case 221: return 73;
            case 212: return 73;
            case 197: return 308;
            case 196: return 306;
            case 195: return 304;
            case 194: return 302;
            case 189: return 296;
            case 188: return 294;
            case 187: return 292;
            case 186: return 290;
            case 174: return 270;
            case 173: return 269;
            case 172: return 268;
            case 171: return 266;
            case 170: return 73;
            case 169: return 73;
            case 168: return 73;
            case 167: return 73;
            case 166: return 73;
            case 165: return 73;
            case 164: return 73;
            case 163: return 73;
            case 155: return 248;
            case 154: return 149;
            case 153: return 149;
            case 152: return 244;
            case 151: return 242;
            case 150: return 240;
            case 143: return 73;
            case 141: return 202;
            case 129: return 73;
            case 128: return 73;
            case 126: return 73;
            case 123: return 73;
            case 95: return 73;
            case 92: return 202;
            case 88: return 202;
            case 77: return 177;
            case 63: return 149;
            case 58: return 73;
            case 57: return 73;
            case 56: return 73;
            case 54: return 73;
            case 47: return 73;
            case 31: return 73;
            case 20: return 73;
            case 19: return 73;
            default: return 85;
        }
    }

    private int yyr163() { // n_args : argument n_args
        { paramsList.add(((String)yysv[yysp-2])); }
        yysv[yysp-=2] = yyrv;
        return yypn_args();
    }

    private int yyr164() { // n_args : argument
        { paramsList.add(((String)yysv[yysp-1])); }
        yysv[yysp-=1] = yyrv;
        return yypn_args();
    }

    private int yypn_args() {
        switch (yyst[yysp-1]) {
            case 93: return 209;
            case 65: return 156;
            case 51: return 132;
            case 28: return 96;
            default: return 214;
        }
    }

    private int yyr167() { // n_float_args : float_arg n_float_args
        { paramsList.add(((String)yysv[yysp-2])); }
        yysv[yysp-=2] = yyrv;
        return yypn_float_args();
    }

    private int yyr168() { // n_float_args : float_arg
        { paramsList.add(((String)yysv[yysp-1])); }
        yysv[yysp-=1] = yyrv;
        return yypn_float_args();
    }

    private int yypn_float_args() {
        switch (yyst[yysp-1]) {
            case 218: return 315;
            case 160: return 251;
            case 159: return 249;
            case 131: return 226;
            case 101: return 216;
            case 65: return 157;
            case 51: return 133;
            case 28: return 97;
            default: return 211;
        }
    }

    private int yyr169() { // n_instr : expression n_instr
        { instrList.add(((String)yysv[yysp-2])); }
        yysv[yysp-=2] = yyrv;
        return yypn_instr();
    }

    private int yyr170() { // n_instr : expression
        { instrList.add(((String)yysv[yysp-1])); }
        yysv[yysp-=1] = yyrv;
        return yypn_instr();
    }

    private int yypn_instr() {
        switch (yyst[yysp-1]) {
            case 234: return 325;
            case 232: return 324;
            default: return 359;
        }
    }

    private int yyr165() { // n_int_args : integer_arg n_int_args
        { paramsList.add(((String)yysv[yysp-2])); }
        yysv[yysp-=2] = yyrv;
        return yypn_int_args();
    }

    private int yyr166() { // n_int_args : integer_arg
        { paramsList.add(((String)yysv[yysp-1])); }
        yysv[yysp-=1] = yyrv;
        return yypn_int_args();
    }

    private int yypn_int_args() {
        switch (yyst[yysp-1]) {
            case 218: return 316;
            case 160: return 252;
            case 159: return 250;
            case 131: return 227;
            case 101: return 217;
            case 65: return 158;
            case 51: return 134;
            case 28: return 98;
            default: return 213;
        }
    }

    private int yyr122() { // proc : OCULTATORTUGA
        { yyrv = instr("ocultatortuga", InstructionType.NORMAL, ReturnType.VOID); }
        yysv[yysp-=1] = yyrv;
        return 4;
    }

    private int yyr123() { // proc : OT
        { yyrv = instr("ocultatortuga", InstructionType.NORMAL, ReturnType.VOID); }
        yysv[yysp-=1] = yyrv;
        return 4;
    }

    private int yyr124() { // proc : APARECETORTUGA
        { yyrv = instr("aparecetoruga", InstructionType.NORMAL, ReturnType.VOID); }
        yysv[yysp-=1] = yyrv;
        return 4;
    }

    private int yyr125() { // proc : AT
        { yyrv = instr("aparecetoruga", InstructionType.NORMAL, ReturnType.VOID); }
        yysv[yysp-=1] = yyrv;
        return 4;
    }

    private int yyr126() { // proc : BAJALAPIZ
        { yyrv = instr("bajalapiz", InstructionType.NORMAL, ReturnType.VOID); }
        yysv[yysp-=1] = yyrv;
        return 4;
    }

    private int yyr127() { // proc : BL
        { yyrv = instr("bajalapiz", InstructionType.NORMAL, ReturnType.VOID); }
        yysv[yysp-=1] = yyrv;
        return 4;
    }

    private int yyr128() { // proc : SUBELAPIZ
        { yyrv = instr("subelapiz", InstructionType.NORMAL, ReturnType.VOID); }
        yysv[yysp-=1] = yyrv;
        return 4;
    }

    private int yyr129() { // proc : SB
        { yyrv = instr("subelapiz", InstructionType.NORMAL, ReturnType.VOID); }
        yysv[yysp-=1] = yyrv;
        return 4;
    }

    private int yyr130() { // proc : CENTRO
        { yyrv = instr("centro", InstructionType.NORMAL, ReturnType.VOID); }
        yysv[yysp-=1] = yyrv;
        return 4;
    }

    private int yyr131() { // proc : BORRAPANTALLA
        { yyrv = instr("borrapantalla", InstructionType.NORMAL, ReturnType.VOID); }
        yysv[yysp-=1] = yyrv;
        return 4;
    }

    private int yyr132() { // proc : RUMBO
        { yyrv = instr("print", InstructionType.NORMAL, ReturnType.VOID, arguments.varArg("rumbo")); }
        yysv[yysp-=1] = yyrv;
        return 4;
    }

    private int yyr133() { // proc1 : AVANZA integer_arg
        { yyrv = instr("avanza", InstructionType.NORMAL, ReturnType.VOID, ((String)yysv[yysp-1])); }
        yysv[yysp-=2] = yyrv;
        return 5;
    }

    private int yyr134() { // proc1 : AV integer_arg
        { yyrv = instr("avanza", InstructionType.NORMAL, ReturnType.VOID, ((String)yysv[yysp-1])); }
        yysv[yysp-=2] = yyrv;
        return 5;
    }

    private int yyr135() { // proc1 : RETROCEDE integer_arg
        { yyrv = instr("retrocede", InstructionType.NORMAL, ReturnType.VOID, ((String)yysv[yysp-1])); }
        yysv[yysp-=2] = yyrv;
        return 5;
    }

    private int yyr136() { // proc1 : RE integer_arg
        { yyrv = instr("retrocede", InstructionType.NORMAL, ReturnType.VOID, ((String)yysv[yysp-1])); }
        yysv[yysp-=2] = yyrv;
        return 5;
    }

    private int yyr137() { // proc1 : GIRADERECHA argument
        { yyrv = instr("giraderecha", InstructionType.NORMAL, ReturnType.VOID, ((String)yysv[yysp-1])); }
        yysv[yysp-=2] = yyrv;
        return 5;
    }

    private int yyr138() { // proc1 : GD argument
        { yyrv = instr("giraderecha", InstructionType.NORMAL, ReturnType.VOID, ((String)yysv[yysp-1])); }
        yysv[yysp-=2] = yyrv;
        return 5;
    }

    private int yyr139() { // proc1 : GIRAIZQUIERDA argument
        { yyrv = instr("giraizquierda", InstructionType.NORMAL, ReturnType.VOID, ((String)yysv[yysp-1])); }
        yysv[yysp-=2] = yyrv;
        return 5;
    }

    private int yyr140() { // proc1 : GI argument
        { yyrv = instr("giraizquierda", InstructionType.NORMAL, ReturnType.VOID, ((String)yysv[yysp-1])); }
        yysv[yysp-=2] = yyrv;
        return 5;
    }

    private int yyr141() { // proc1 : PONRUMBO argument
        { yyrv = instr("ponrumbo", InstructionType.NORMAL, ReturnType.VOID, ((String)yysv[yysp-1])); }
        yysv[yysp-=2] = yyrv;
        return 5;
    }

    private int yyr142() { // proc1 : PONX argument
        { yyrv = instr("ponx", InstructionType.NORMAL, ReturnType.VOID, ((String)yysv[yysp-1])); }
        yysv[yysp-=2] = yyrv;
        return 5;
    }

    private int yyr143() { // proc1 : PONY argument
        { yyrv = instr("pony", InstructionType.NORMAL, ReturnType.VOID, ((String)yysv[yysp-1])); }
        yysv[yysp-=2] = yyrv;
        return 5;
    }

    private int yyr144() { // proc1 : PONCOLORLAPIZ color
        { yyrv = instr("poncl", InstructionType.NORMAL, ReturnType.VOID, ((String)yysv[yysp-1])); }
        yysv[yysp-=2] = yyrv;
        return 5;
    }

    private int yyr145() { // proc1 : PONCL color
        { yyrv = instr("poncl", InstructionType.NORMAL, ReturnType.VOID, ((String)yysv[yysp-1])); }
        yysv[yysp-=2] = yyrv;
        return 5;
    }

    private int yyr146() { // proc1 : ESPERA argument
        { yyrv = instr("espera", InstructionType.NORMAL, ReturnType.VOID, ((String)yysv[yysp-1])); }
        yysv[yysp-=2] = yyrv;
        return 5;
    }

    private int yyr157() { // proc2 : PONXY integer_arg integer_arg
        { yyrv = instr("ponxy", InstructionType.NORMAL, ReturnType.VOID, ((String)yysv[yysp-2]), ((String)yysv[yysp-1])); }
        yysv[yysp-=3] = yyrv;
        return 6;
    }

    private int yyr195() { // proc_cond : SI boolean_value '[' n_instr ']'
        {
        paramsList.add(arguments.boolArg(((Boolean)yysv[yysp-4])));
        yyrv = instr("si", InstructionType.CONDITION, ReturnType.VOID, paramsList, instrList);
        paramsList.clear();
        instrList.clear();
    }
        yysv[yysp-=5] = yyrv;
        return 7;
    }

    private int yyr194() { // proc_loop : REPITE integer_arg '[' n_instr ']'
        { 
        paramsList.add(((String)yysv[yysp-4])); 
        yyrv = instr("repite", InstructionType.CYCLE, ReturnType.VOID, paramsList, instrList); 
        paramsList.clear();
        instrList.clear(); 
    }
        yysv[yysp-=5] = yyrv;
        return 8;
    }

    private int yyr180() { // proc_p : INC '[' variable integer_arg ']'
        { yyrv = instr("inc", InstructionType.VARIABLE, ReturnType.VOID, ((String)yysv[yysp-3]), ((String)yysv[yysp-2])); }
        yysv[yysp-=5] = yyrv;
        return 9;
    }

    private int yyr181() { // proc_p : INC '[' variable float_arg ']'
        { yyrv = instr("inc", InstructionType.VARIABLE, ReturnType.VOID, ((String)yysv[yysp-3]), ((String)yysv[yysp-2])); }
        yysv[yysp-=5] = yyrv;
        return 9;
    }

    private int yyr182() { // proc_p : PONPOS '[' integer_arg integer_arg ']'
        { yyrv = instr("ponpos", InstructionType.NORMAL, ReturnType.VOID, ((String)yysv[yysp-3]), ((String)yysv[yysp-2])); }
        yysv[yysp-=5] = yyrv;
        return 9;
    }

    private int yyr2() { // program : expression ';' program
        { instructions.add(((String)yysv[yysp-3])); }
        yysv[yysp-=3] = yyrv;
        return yypprogram();
    }

    private int yyr3() { // program : expression ';'
        { instructions.add(((String)yysv[yysp-2])); }
        yysv[yysp-=2] = yyrv;
        return yypprogram();
    }

    private int yypprogram() {
        switch (yyst[yysp-1]) {
            case 0: return 10;
            default: return 162;
        }
    }

    private int yyr107() { // argument : integer_arg
        yysp -= 1;
        return yypargument();
    }

    private int yyr108() { // argument : float_arg
        yysp -= 1;
        return yypargument();
    }

    private int yyr109() { // argument : '(' instr_arg ')'
        yysp -= 3;
        return yypargument();
    }

    private int yypargument() {
        switch (yyst[yysp-1]) {
            case 253: return 352;
            case 220: return 319;
            case 100: return 215;
            case 62: return 146;
            case 61: return 145;
            case 53: return 136;
            case 52: return 135;
            case 49: return 130;
            case 48: return 127;
            case 46: return 125;
            case 45: return 124;
            case 36: return 107;
            case 35: return 106;
            case 34: return 105;
            case 33: return 104;
            case 32: return 103;
            case 29: return 100;
            case 26: return 91;
            default: return 99;
        }
    }

    private int yyr112() { // redeclaration_expr : INIC IDENTIFIER '=' argument
        { yyrv = instr("inic", InstructionType.VARIABLE, ReturnType.VOID, arguments.stringArg(((String)yysv[yysp-3])), ((String)yysv[yysp-1])); }
        yysv[yysp-=4] = yyrv;
        return 11;
    }

    private int yyr147() { // val_proc1 : REDONDEA float_arg
        { yyrv = instr("redondea", InstructionType.NORMAL, ReturnType.INTEGER, ((String)yysv[yysp-1])); }
        yysv[yysp-=2] = yyrv;
        return yypval_proc1();
    }

    private int yyr148() { // val_proc1 : AZAR integer_arg
        { yyrv = instr("azar", InstructionType.NORMAL, ReturnType.INTEGER, ((String)yysv[yysp-1])); }
        yysv[yysp-=2] = yyrv;
        return yypval_proc1();
    }

    private int yyr149() { // val_proc1 : AZAR float_arg
        { yyrv = instr("azar", InstructionType.NORMAL, ReturnType.FLOAT, ((String)yysv[yysp-1])); }
        yysv[yysp-=2] = yyrv;
        return yypval_proc1();
    }

    private int yyr150() { // val_proc1 : MENOS integer_arg
        { yyrv = instr("menos", InstructionType.NORMAL, ReturnType.INTEGER, ((String)yysv[yysp-1])); }
        yysv[yysp-=2] = yyrv;
        return yypval_proc1();
    }

    private int yyr151() { // val_proc1 : MENOS float_arg
        { yyrv = instr("menos", InstructionType.NORMAL, ReturnType.FLOAT, ((String)yysv[yysp-1])); }
        yysv[yysp-=2] = yyrv;
        return yypval_proc1();
    }

    private int yyr152() { // val_proc1 : COS argument
        { yyrv = instr("cos", InstructionType.NORMAL, ReturnType.FLOAT, ((String)yysv[yysp-1])); }
        yysv[yysp-=2] = yyrv;
        return yypval_proc1();
    }

    private int yyr153() { // val_proc1 : RAIZCUADRADA argument
        { yyrv = instr("raiz", InstructionType.NORMAL, ReturnType.FLOAT, ((String)yysv[yysp-1])); }
        yysv[yysp-=2] = yyrv;
        return yypval_proc1();
    }

    private int yyr154() { // val_proc1 : RC argument
        { yyrv = instr("raiz", InstructionType.NORMAL, ReturnType.FLOAT, ((String)yysv[yysp-1])); }
        yysv[yysp-=2] = yyrv;
        return yypval_proc1();
    }

    private int yyr155() { // val_proc1 : SENO argument
        { yyrv = instr("seno", InstructionType.NORMAL, ReturnType.FLOAT, ((String)yysv[yysp-1])); }
        yysv[yysp-=2] = yyrv;
        return yypval_proc1();
    }

    private int yyr156() { // val_proc1 : SEN argument
        { yyrv = instr("seno", InstructionType.NORMAL, ReturnType.FLOAT, ((String)yysv[yysp-1])); }
        yysv[yysp-=2] = yyrv;
        return yypval_proc1();
    }

    private int yypval_proc1() {
        switch (yyst[yysp-1]) {
            case 92: return 204;
            default: return 12;
        }
    }

    private int yyr158() { // val_proc2 : POTENCIA integer_arg integer_arg
        { yyrv = instr("potencia", InstructionType.NORMAL, ReturnType.INTEGER, ((String)yysv[yysp-2]), ((String)yysv[yysp-1])); }
        yysv[yysp-=3] = yyrv;
        return yypval_proc2();
    }

    private int yyr159() { // val_proc2 : POTENCIA float_arg integer_arg
        { yyrv = instr("potencia", InstructionType.NORMAL, ReturnType.FLOAT, ((String)yysv[yysp-2]), ((String)yysv[yysp-1])); }
        yysv[yysp-=3] = yyrv;
        return yypval_proc2();
    }

    private int yyr160() { // val_proc2 : POTENCIA argument float_arg
        { yyrv = instr("potencia", InstructionType.NORMAL, ReturnType.FLOAT, ((String)yysv[yysp-2]), ((String)yysv[yysp-1])); }
        yysv[yysp-=3] = yyrv;
        return yypval_proc2();
    }

    private int yyr161() { // val_proc2 : RESTO integer_arg integer_arg
        { yyrv = instr("resto", InstructionType.NORMAL, ReturnType.INTEGER, ((String)yysv[yysp-2]), ((String)yysv[yysp-1])); }
        yysv[yysp-=3] = yyrv;
        return yypval_proc2();
    }

    private int yyr162() { // val_proc2 : DIVISION argument argument
        { yyrv = instr("division", InstructionType.NORMAL, ReturnType.FLOAT, ((String)yysv[yysp-2]), ((String)yysv[yysp-1])); }
        yysv[yysp-=3] = yyrv;
        return yypval_proc2();
    }

    private int yypval_proc2() {
        switch (yyst[yysp-1]) {
            case 92: return 205;
            default: return 13;
        }
    }

    private int yyr192() { // val_proc_1p : ELEMENTO integer_arg '[' n_int_args ']'
        { yyrv = instr("elemento", InstructionType.NORMAL, ReturnType.INTEGER, paramsList); paramsList.clear(); }
        yysv[yysp-=5] = yyrv;
        return yypval_proc_1p();
    }

    private int yyr193() { // val_proc_1p : ELEMENTO integer_arg '[' n_float_args ']'
        { yyrv = instr("elemento", InstructionType.NORMAL, ReturnType.FLOAT, paramsList); paramsList.clear(); }
        yysv[yysp-=5] = yyrv;
        return yypval_proc_1p();
    }

    private int yypval_proc_1p() {
        switch (yyst[yysp-1]) {
            case 92: return 206;
            default: return 14;
        }
    }

    private int yyr171() { // val_proc_n : DIFERENCIA n_int_args
        { yyrv = instr("diferencia", InstructionType.NORMAL, ReturnType.INTEGER, paramsList); paramsList.clear(); }
        yysv[yysp-=2] = yyrv;
        return yypval_proc_n();
    }

    private int yyr172() { // val_proc_n : DIFERENCIA n_float_args
        { yyrv = instr("diferencia", InstructionType.NORMAL, ReturnType.FLOAT, paramsList); paramsList.clear(); }
        yysv[yysp-=2] = yyrv;
        return yypval_proc_n();
    }

    private int yyr173() { // val_proc_n : DIFERENCIA n_args
        { yyrv = instr("diferencia", InstructionType.NORMAL, ReturnType.FLOAT, paramsList); paramsList.clear(); }
        yysv[yysp-=2] = yyrv;
        return yypval_proc_n();
    }

    private int yyr174() { // val_proc_n : PRODUCTO n_int_args
        { yyrv = instr("producto", InstructionType.NORMAL, ReturnType.INTEGER, paramsList); paramsList.clear(); }
        yysv[yysp-=2] = yyrv;
        return yypval_proc_n();
    }

    private int yyr175() { // val_proc_n : PRODUCTO n_float_args
        { yyrv = instr("producto", InstructionType.NORMAL, ReturnType.FLOAT, paramsList); paramsList.clear(); }
        yysv[yysp-=2] = yyrv;
        return yypval_proc_n();
    }

    private int yyr176() { // val_proc_n : PRODUCTO n_args
        { yyrv = instr("producto", InstructionType.NORMAL, ReturnType.FLOAT, paramsList); paramsList.clear(); }
        yysv[yysp-=2] = yyrv;
        return yypval_proc_n();
    }

    private int yyr177() { // val_proc_n : SUMA n_int_args
        { yyrv = instr("suma", InstructionType.NORMAL, ReturnType.INTEGER, paramsList); paramsList.clear(); }
        yysv[yysp-=2] = yyrv;
        return yypval_proc_n();
    }

    private int yyr178() { // val_proc_n : SUMA n_float_args
        { yyrv = instr("suma", InstructionType.NORMAL, ReturnType.FLOAT, paramsList); paramsList.clear(); }
        yysv[yysp-=2] = yyrv;
        return yypval_proc_n();
    }

    private int yyr179() { // val_proc_n : SUMA n_args
        { yyrv = instr("suma", InstructionType.NORMAL, ReturnType.FLOAT, paramsList); paramsList.clear(); }
        yysv[yysp-=2] = yyrv;
        return yypval_proc_n();
    }

    private int yypval_proc_n() {
        switch (yyst[yysp-1]) {
            case 92: return 207;
            default: return 15;
        }
    }

    private int yyr183() { // val_proc_p : ELEGIR '[' n_int_args ']'
        { yyrv = instr("elegir", InstructionType.NORMAL, ReturnType.INTEGER, paramsList); paramsList.clear(); }
        yysv[yysp-=4] = yyrv;
        return yypval_proc_p();
    }

    private int yyr184() { // val_proc_p : ELEGIR '[' n_float_args ']'
        { yyrv = instr("elegir", InstructionType.NORMAL, ReturnType.FLOAT, paramsList); paramsList.clear(); }
        yysv[yysp-=4] = yyrv;
        return yypval_proc_p();
    }

    private int yyr185() { // val_proc_p : CUENTA '[' n_args ']'
        { yyrv = instr("cuenta", InstructionType.NORMAL, ReturnType.INTEGER, paramsList); paramsList.clear(); }
        yysv[yysp-=4] = yyrv;
        return yypval_proc_p();
    }

    private int yyr186() { // val_proc_p : ULTIMO '[' n_int_args ']'
        { yyrv = instr("ultimo", InstructionType.NORMAL, ReturnType.INTEGER, paramsList); paramsList.clear(); }
        yysv[yysp-=4] = yyrv;
        return yypval_proc_p();
    }

    private int yyr187() { // val_proc_p : ULTIMO '[' n_float_args ']'
        { yyrv = instr("ultimo", InstructionType.NORMAL, ReturnType.FLOAT, paramsList); paramsList.clear(); }
        yysv[yysp-=4] = yyrv;
        return yypval_proc_p();
    }

    private int yyr188() { // val_proc_p : UL '[' n_int_args ']'
        { yyrv = instr("ultimo", InstructionType.NORMAL, ReturnType.INTEGER, paramsList); paramsList.clear(); }
        yysv[yysp-=4] = yyrv;
        return yypval_proc_p();
    }

    private int yyr189() { // val_proc_p : UL '[' n_float_args ']'
        { yyrv = instr("ultimo", InstructionType.NORMAL, ReturnType.FLOAT, paramsList); paramsList.clear(); }
        yysv[yysp-=4] = yyrv;
        return yypval_proc_p();
    }

    private int yyr190() { // val_proc_p : PRIMERO '[' n_int_args ']'
        { yyrv = instr("primero", InstructionType.NORMAL, ReturnType.INTEGER, paramsList); paramsList.clear(); }
        yysv[yysp-=4] = yyrv;
        return yypval_proc_p();
    }

    private int yyr191() { // val_proc_p : PRIMERO '[' n_float_args ']'
        { yyrv = instr("primero", InstructionType.NORMAL, ReturnType.FLOAT, paramsList); paramsList.clear(); }
        yysv[yysp-=4] = yyrv;
        return yypval_proc_p();
    }

    private int yypval_proc_p() {
        switch (yyst[yysp-1]) {
            case 92: return 208;
            default: return 16;
        }
    }

    private int yyr17() { // variable : IDENTIFIER
        { yyrv = arguments.varArg(((String)yysv[yysp-1])); }
        yysv[yysp-=1] = yyrv;
        switch (yyst[yysp-1]) {
            case 231: return 140;
            case 230: return 140;
            case 229: return 140;
            case 228: return 140;
            case 221: return 74;
            case 212: return 74;
            case 210: return 140;
            case 185: return 140;
            case 184: return 140;
            case 183: return 140;
            case 182: return 140;
            case 181: return 140;
            case 180: return 140;
            case 179: return 140;
            case 178: return 140;
            case 170: return 74;
            case 169: return 74;
            case 168: return 74;
            case 167: return 74;
            case 166: return 74;
            case 165: return 74;
            case 164: return 74;
            case 163: return 74;
            case 143: return 74;
            case 141: return 140;
            case 130: return 140;
            case 129: return 74;
            case 128: return 74;
            case 126: return 74;
            case 123: return 74;
            case 108: return 219;
            case 95: return 74;
            case 94: return 140;
            case 77: return 74;
            case 58: return 74;
            case 57: return 74;
            case 56: return 74;
            case 55: return 140;
            case 54: return 74;
            case 47: return 74;
            case 31: return 74;
            case 20: return 74;
            case 19: return 74;
            default: return 86;
        }
    }

    protected String[] yyerrmsgs = {
    };


    private Lexer lexer;
    private VariableHandler variables; //Manejador de variables
    private ProcedureHandler procedures; //Manejador de procedimientos
    private InstructionHandler instructions;
    private ArgumentHandler arguments;

    //Estructuras temporales
    private ArrayList<String> paramsList; //Para almacenar parámetros de un procedimiento
    private ArrayList<String> instrList; // Para almacenar instrucciones de un procedimiento

    public String instr(String name, InstructionType type, ReturnType returnType, String... args) {
        return instructions.create(name, type, returnType, new ArrayList<>(Arrays.asList(args)));
    }

    public String instr(String name, InstructionType type, ReturnType returnType, ArrayList<String> args) {
        return instructions.create(name, type, returnType, args);
    }

    public String instr(String name, InstructionType type, ReturnType returnType, ArrayList<String> args, ArrayList<String> body) {
        return instructions.create(name, type, returnType, args, body);
    }

    public void yyerror(String msg) {
        System.err.println(msg);
        //TODO: mostrar los errores en la interfaz
    }

    public Parser(String ruta) {
        variables = new VariableHandler();
        procedures = new ProcedureHandler();
        instructions = new InstructionHandler();
        arguments = new ArgumentHandler();

        paramsList = new ArrayList<>();
        instrList = new ArrayList<>();

        try {
            Reader reader = new BufferedReader(new FileReader(ruta));
            lexer = new Lexer(reader);
            lexer.getNextToken();

        } catch (IOException ex) {
            yyerror("No se pudo abrir el archivo especificado");
        }
    }

    public void parsingDone() {
        System.out.println("Compilación finalizada");
        //TODO: notificar que se finalizó la compilación

        variables.printVars();
        procedures.printProcedures();
        instructions.print();
    }

    public static void main(String[] args) {
        String path = "/src/Compiler/Lex/parse.txt";
        String ruta  = System.getProperty("user.dir").replaceAll("\\\\", "/") + path;
        Parser parser = new Parser(ruta);
        parser.parse();
    }

}
