// Output created by jacc on Sun Aug 02 19:55:00 CST 2020

package Compiler.Jacc;

import Compiler.Lex.Lexer;
import java.io.*;
import Logic.MessageType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

import com.fasterxml.jackson.databind.ObjectMapper;

import Compiler.Helpers.*;


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
                case 387:
                    yyn = yys0();
                    continue;

                case 1:
                    yyst[yysp] = 1;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 388:
                    switch (yytok) {
                        case ENDINPUT:
                            yyn = 774;
                            continue;
                    }
                    yyn = 777;
                    continue;

                case 2:
                    yyst[yysp] = 2;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 389:
                    yyn = yys2();
                    continue;

                case 3:
                    yyst[yysp] = 3;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 390:
                    switch (yytok) {
                        case ';':
                            yyn = 76;
                            continue;
                    }
                    yyn = 777;
                    continue;

                case 4:
                    yyst[yysp] = 4;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 391:
                    yyn = yys4();
                    continue;

                case 5:
                    yyst[yysp] = 5;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 392:
                    yyn = yys5();
                    continue;

                case 6:
                    yyst[yysp] = 6;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 393:
                    yyn = yys6();
                    continue;

                case 7:
                    yyst[yysp] = 7;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 394:
                    yyn = yys7();
                    continue;

                case 8:
                    yyst[yysp] = 8;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 395:
                    switch (yytok) {
                        case ';':
                            yyn = yyr7();
                            continue;
                    }
                    yyn = 777;
                    continue;

                case 9:
                    yyst[yysp] = 9;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 396:
                    yyn = yys9();
                    continue;

                case 10:
                    yyst[yysp] = 10;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 397:
                    yyn = yys10();
                    continue;

                case 11:
                    yyst[yysp] = 11;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 398:
                    switch (yytok) {
                        case ENDINPUT:
                            yyn = yyr1();
                            continue;
                    }
                    yyn = 777;
                    continue;

                case 12:
                    yyst[yysp] = 12;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 399:
                    yyn = yys12();
                    continue;

                case 13:
                    yyst[yysp] = 13;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 400:
                    switch (yytok) {
                        case ';':
                            yyn = 77;
                            continue;
                    }
                    yyn = 777;
                    continue;

                case 14:
                    yyst[yysp] = 14;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 401:
                    switch (yytok) {
                        case ';':
                            yyn = yyr6();
                            continue;
                    }
                    yyn = 777;
                    continue;

                case 15:
                    yyst[yysp] = 15;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 402:
                    yyn = yys15();
                    continue;

                case 16:
                    yyst[yysp] = 16;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 403:
                    yyn = yys16();
                    continue;

                case 17:
                    yyst[yysp] = 17;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 404:
                    yyn = yys17();
                    continue;

                case 18:
                    yyst[yysp] = 18;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 405:
                    yyn = yys18();
                    continue;

                case 19:
                    yyst[yysp] = 19;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 406:
                    yyn = yys19();
                    continue;

                case 20:
                    yyst[yysp] = 20;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 407:
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
                case 408:
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
                case 409:
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
                case 410:
                    switch (yytok) {
                        case IDENTIFIER:
                            yyn = 83;
                            continue;
                        case INTEGER:
                            yyn = 84;
                            continue;
                        case '(':
                            yyn = 85;
                            continue;
                    }
                    yyn = 777;
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
                case 411:
                    switch (yytok) {
                        case IDENTIFIER:
                            yyn = 83;
                            continue;
                        case INTEGER:
                            yyn = 84;
                            continue;
                        case '(':
                            yyn = 85;
                            continue;
                    }
                    yyn = 777;
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
                case 412:
                    switch (yytok) {
                        case IDENTIFIER:
                            yyn = 83;
                            continue;
                        case INTEGER:
                            yyn = 84;
                            continue;
                        case FLOAT:
                            yyn = 95;
                            continue;
                        case '(':
                            yyn = 96;
                            continue;
                    }
                    yyn = 777;
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
                case 413:
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
                case 414:
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
                case 415:
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
                case 416:
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
                case 417:
                    switch (yytok) {
                        case IDENTIFIER:
                            yyn = 83;
                            continue;
                        case INTEGER:
                            yyn = 84;
                            continue;
                        case FLOAT:
                            yyn = 95;
                            continue;
                        case '(':
                            yyn = 100;
                            continue;
                    }
                    yyn = 777;
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
                case 418:
                    switch (yytok) {
                        case '[':
                            yyn = 101;
                            continue;
                    }
                    yyn = 777;
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
                case 419:
                    switch (yytok) {
                        case IDENTIFIER:
                            yyn = 83;
                            continue;
                        case INTEGER:
                            yyn = 84;
                            continue;
                        case FLOAT:
                            yyn = 95;
                            continue;
                        case '(':
                            yyn = 100;
                            continue;
                    }
                    yyn = 777;
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
                case 420:
                    switch (yytok) {
                        case IDENTIFIER:
                            yyn = 83;
                            continue;
                        case INTEGER:
                            yyn = 84;
                            continue;
                        case FLOAT:
                            yyn = 95;
                            continue;
                        case '(':
                            yyn = 100;
                            continue;
                    }
                    yyn = 777;
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
                case 421:
                    switch (yytok) {
                        case '[':
                            yyn = 109;
                            continue;
                    }
                    yyn = 777;
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
                case 422:
                    switch (yytok) {
                        case '[':
                            yyn = 110;
                            continue;
                    }
                    yyn = 777;
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
                case 423:
                    switch (yytok) {
                        case IDENTIFIER:
                            yyn = 83;
                            continue;
                        case INTEGER:
                            yyn = 84;
                            continue;
                        case '(':
                            yyn = 85;
                            continue;
                    }
                    yyn = 777;
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
                case 424:
                    switch (yytok) {
                        case IDENTIFIER:
                            yyn = 83;
                            continue;
                        case INTEGER:
                            yyn = 84;
                            continue;
                        case FLOAT:
                            yyn = 95;
                            continue;
                        case '(':
                            yyn = 100;
                            continue;
                    }
                    yyn = 777;
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
                case 425:
                    switch (yytok) {
                        case IDENTIFIER:
                            yyn = 83;
                            continue;
                        case INTEGER:
                            yyn = 84;
                            continue;
                        case FLOAT:
                            yyn = 95;
                            continue;
                        case '(':
                            yyn = 100;
                            continue;
                    }
                    yyn = 777;
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
                case 426:
                    switch (yytok) {
                        case IDENTIFIER:
                            yyn = 83;
                            continue;
                        case INTEGER:
                            yyn = 84;
                            continue;
                        case FLOAT:
                            yyn = 95;
                            continue;
                        case '(':
                            yyn = 100;
                            continue;
                    }
                    yyn = 777;
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
                case 427:
                    switch (yytok) {
                        case IDENTIFIER:
                            yyn = 83;
                            continue;
                        case INTEGER:
                            yyn = 84;
                            continue;
                        case FLOAT:
                            yyn = 95;
                            continue;
                        case '(':
                            yyn = 100;
                            continue;
                    }
                    yyn = 777;
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
                case 428:
                    switch (yytok) {
                        case IDENTIFIER:
                            yyn = 83;
                            continue;
                        case INTEGER:
                            yyn = 84;
                            continue;
                        case FLOAT:
                            yyn = 95;
                            continue;
                        case '(':
                            yyn = 100;
                            continue;
                    }
                    yyn = 777;
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
                case 429:
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
                case 430:
                    switch (yytok) {
                        case '[':
                            yyn = 118;
                            continue;
                    }
                    yyn = 777;
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
                case 431:
                    switch (yytok) {
                        case IDENTIFIER:
                            yyn = 119;
                            continue;
                    }
                    yyn = 777;
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
                case 432:
                    switch (yytok) {
                        case IDENTIFIER:
                            yyn = 83;
                            continue;
                        case INTEGER:
                            yyn = 84;
                            continue;
                        case FLOAT:
                            yyn = 95;
                            continue;
                        case '(':
                            yyn = 96;
                            continue;
                    }
                    yyn = 777;
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
                case 433:
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
                case 434:
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
                case 435:
                    switch (yytok) {
                        case IDENTIFIER:
                            yyn = 122;
                            continue;
                    }
                    yyn = 777;
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
                case 436:
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
                case 437:
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
                case 438:
                    switch (yytok) {
                        case '[':
                            yyn = 134;
                            continue;
                    }
                    yyn = 777;
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
                case 439:
                    switch (yytok) {
                        case IDENTIFIER:
                            yyn = 83;
                            continue;
                        case INTEGER:
                            yyn = 84;
                            continue;
                        case FLOAT:
                            yyn = 95;
                            continue;
                        case '(':
                            yyn = 100;
                            continue;
                    }
                    yyn = 777;
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
                case 440:
                    switch (yytok) {
                        case IDENTIFIER:
                            yyn = 83;
                            continue;
                        case INTEGER:
                            yyn = 84;
                            continue;
                        case FLOAT:
                            yyn = 95;
                            continue;
                        case '(':
                            yyn = 100;
                            continue;
                    }
                    yyn = 777;
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
                case 441:
                    switch (yytok) {
                        case IDENTIFIER:
                            yyn = 83;
                            continue;
                        case INTEGER:
                            yyn = 84;
                            continue;
                        case '(':
                            yyn = 85;
                            continue;
                    }
                    yyn = 777;
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
                case 442:
                    switch (yytok) {
                        case IDENTIFIER:
                            yyn = 83;
                            continue;
                        case INTEGER:
                            yyn = 84;
                            continue;
                        case FLOAT:
                            yyn = 95;
                            continue;
                        case '(':
                            yyn = 100;
                            continue;
                    }
                    yyn = 777;
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
                case 443:
                    switch (yytok) {
                        case IDENTIFIER:
                            yyn = 83;
                            continue;
                        case INTEGER:
                            yyn = 84;
                            continue;
                        case FLOAT:
                            yyn = 95;
                            continue;
                        case '(':
                            yyn = 100;
                            continue;
                    }
                    yyn = 777;
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
                case 444:
                    switch (yytok) {
                        case '[':
                            yyn = 142;
                            continue;
                    }
                    yyn = 777;
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
                case 445:
                    switch (yytok) {
                        case IDENTIFIER:
                            yyn = 83;
                            continue;
                        case INTEGER:
                            yyn = 84;
                            continue;
                        case FLOAT:
                            yyn = 95;
                            continue;
                        case '(':
                            yyn = 100;
                            continue;
                    }
                    yyn = 777;
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
                case 446:
                    switch (yytok) {
                        case IDENTIFIER:
                            yyn = 83;
                            continue;
                        case INTEGER:
                            yyn = 84;
                            continue;
                        case FLOAT:
                            yyn = 95;
                            continue;
                        case '(':
                            yyn = 100;
                            continue;
                    }
                    yyn = 777;
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
                case 447:
                    switch (yytok) {
                        case IDENTIFIER:
                            yyn = 83;
                            continue;
                        case INTEGER:
                            yyn = 84;
                            continue;
                        case FLOAT:
                            yyn = 95;
                            continue;
                        case '(':
                            yyn = 100;
                            continue;
                    }
                    yyn = 777;
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
                case 448:
                    switch (yytok) {
                        case IDENTIFIER:
                            yyn = 83;
                            continue;
                        case INTEGER:
                            yyn = 84;
                            continue;
                        case '(':
                            yyn = 85;
                            continue;
                    }
                    yyn = 777;
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
                case 449:
                    switch (yytok) {
                        case IDENTIFIER:
                            yyn = 83;
                            continue;
                        case INTEGER:
                            yyn = 84;
                            continue;
                        case FLOAT:
                            yyn = 95;
                            continue;
                        case '(':
                            yyn = 152;
                            continue;
                    }
                    yyn = 777;
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
                case 450:
                    switch (yytok) {
                        case IDENTIFIER:
                            yyn = 83;
                            continue;
                        case INTEGER:
                            yyn = 84;
                            continue;
                        case '(':
                            yyn = 85;
                            continue;
                    }
                    yyn = 777;
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
                case 451:
                    switch (yytok) {
                        case IDENTIFIER:
                            yyn = 83;
                            continue;
                        case INTEGER:
                            yyn = 84;
                            continue;
                        case '(':
                            yyn = 85;
                            continue;
                    }
                    yyn = 777;
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
                case 452:
                    switch (yytok) {
                        case IDENTIFIER:
                            yyn = 83;
                            continue;
                        case INTEGER:
                            yyn = 84;
                            continue;
                        case '(':
                            yyn = 85;
                            continue;
                    }
                    yyn = 777;
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
                case 453:
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
                case 454:
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
                case 455:
                    switch (yytok) {
                        case IDENTIFIER:
                            yyn = 83;
                            continue;
                        case INTEGER:
                            yyn = 84;
                            continue;
                        case FLOAT:
                            yyn = 95;
                            continue;
                        case '(':
                            yyn = 100;
                            continue;
                    }
                    yyn = 777;
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
                case 456:
                    switch (yytok) {
                        case IDENTIFIER:
                            yyn = 83;
                            continue;
                        case INTEGER:
                            yyn = 84;
                            continue;
                        case FLOAT:
                            yyn = 95;
                            continue;
                        case '(':
                            yyn = 100;
                            continue;
                    }
                    yyn = 777;
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
                case 457:
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
                case 458:
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
                case 459:
                    switch (yytok) {
                        case IDENTIFIER:
                            yyn = 83;
                            continue;
                        case INTEGER:
                            yyn = 84;
                            continue;
                        case FLOAT:
                            yyn = 95;
                            continue;
                        case '(':
                            yyn = 100;
                            continue;
                    }
                    yyn = 777;
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
                case 460:
                    switch (yytok) {
                        case '[':
                            yyn = 170;
                            continue;
                    }
                    yyn = 777;
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
                case 461:
                    switch (yytok) {
                        case '[':
                            yyn = 171;
                            continue;
                    }
                    yyn = 777;
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
                case 462:
                    switch (yytok) {
                        case IDENTIFIER:
                            yyn = 172;
                            continue;
                    }
                    yyn = 777;
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
                case 463:
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
                case 464:
                    yyn = yys77();
                    continue;

                case 78:
                    yyst[yysp] = 78;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 465:
                    yyn = yys78();
                    continue;

                case 79:
                    yyst[yysp] = 79;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 466:
                    yyn = yys79();
                    continue;

                case 80:
                    yyst[yysp] = 80;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 467:
                    yyn = yys80();
                    continue;

                case 81:
                    yyst[yysp] = 81;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 468:
                    yyn = yys81();
                    continue;

                case 82:
                    yyst[yysp] = 82;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 469:
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
                case 470:
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
                case 471:
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
                case 472:
                    switch (yytok) {
                        case IDENTIFIER:
                            yyn = 83;
                            continue;
                        case INTEGER:
                            yyn = 84;
                            continue;
                        case '(':
                            yyn = 85;
                            continue;
                    }
                    yyn = 777;
                    continue;

                case 86:
                    yyst[yysp] = 86;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 473:
                    yyn = yys86();
                    continue;

                case 87:
                    yyst[yysp] = 87;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 474:
                    yyn = yys87();
                    continue;

                case 88:
                    yyst[yysp] = 88;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 475:
                    yyn = yys88();
                    continue;

                case 89:
                    yyst[yysp] = 89;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 476:
                    yyn = yys89();
                    continue;

                case 90:
                    yyst[yysp] = 90;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 477:
                    yyn = yys90();
                    continue;

                case 91:
                    yyst[yysp] = 91;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 478:
                    yyn = yys91();
                    continue;

                case 92:
                    yyst[yysp] = 92;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 479:
                    yyn = yys92();
                    continue;

                case 93:
                    yyst[yysp] = 93;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 480:
                    yyn = yys93();
                    continue;

                case 94:
                    yyst[yysp] = 94;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 481:
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
                case 482:
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
                case 483:
                    switch (yytok) {
                        case IDENTIFIER:
                            yyn = 83;
                            continue;
                        case INTEGER:
                            yyn = 84;
                            continue;
                        case FLOAT:
                            yyn = 95;
                            continue;
                        case '(':
                            yyn = 96;
                            continue;
                    }
                    yyn = 777;
                    continue;

                case 97:
                    yyst[yysp] = 97;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 484:
                    yyn = yys97();
                    continue;

                case 98:
                    yyst[yysp] = 98;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 485:
                    yyn = yys98();
                    continue;

                case 99:
                    yyst[yysp] = 99;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 486:
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
                case 487:
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
                case 488:
                    switch (yytok) {
                        case IDENTIFIER:
                            yyn = 83;
                            continue;
                        case INTEGER:
                            yyn = 84;
                            continue;
                        case FLOAT:
                            yyn = 95;
                            continue;
                        case '(':
                            yyn = 100;
                            continue;
                    }
                    yyn = 777;
                    continue;

                case 102:
                    yyst[yysp] = 102;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 489:
                    yyn = yys102();
                    continue;

                case 103:
                    yyst[yysp] = 103;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 490:
                    yyn = yys103();
                    continue;

                case 104:
                    yyst[yysp] = 104;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 491:
                    yyn = yys104();
                    continue;

                case 105:
                    yyst[yysp] = 105;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 492:
                    yyn = yys105();
                    continue;

                case 106:
                    yyst[yysp] = 106;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 493:
                    yyn = yys106();
                    continue;

                case 107:
                    yyst[yysp] = 107;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 494:
                    yyn = yys107();
                    continue;

                case 108:
                    yyst[yysp] = 108;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 495:
                    switch (yytok) {
                        case IDENTIFIER:
                            yyn = 83;
                            continue;
                        case INTEGER:
                            yyn = 84;
                            continue;
                        case FLOAT:
                            yyn = 95;
                            continue;
                        case '(':
                            yyn = 100;
                            continue;
                    }
                    yyn = 777;
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
                case 496:
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
                case 497:
                    switch (yytok) {
                        case IDENTIFIER:
                            yyn = 83;
                            continue;
                        case INTEGER:
                            yyn = 84;
                            continue;
                        case FLOAT:
                            yyn = 95;
                            continue;
                        case '(':
                            yyn = 96;
                            continue;
                    }
                    yyn = 777;
                    continue;

                case 111:
                    yyst[yysp] = 111;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 498:
                    switch (yytok) {
                        case '[':
                            yyn = 232;
                            continue;
                    }
                    yyn = 777;
                    continue;

                case 112:
                    yyst[yysp] = 112;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 499:
                    yyn = yys112();
                    continue;

                case 113:
                    yyst[yysp] = 113;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 500:
                    yyn = yys113();
                    continue;

                case 114:
                    yyst[yysp] = 114;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 501:
                    yyn = yys114();
                    continue;

                case 115:
                    yyst[yysp] = 115;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 502:
                    yyn = yys115();
                    continue;

                case 116:
                    yyst[yysp] = 116;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 503:
                    yyn = yys116();
                    continue;

                case 117:
                    yyst[yysp] = 117;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 504:
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
                case 505:
                    switch (yytok) {
                        case IDENTIFIER:
                            yyn = 83;
                            continue;
                    }
                    yyn = 777;
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
                case 506:
                    switch (yytok) {
                        case '=':
                            yyn = 234;
                            continue;
                    }
                    yyn = 777;
                    continue;

                case 120:
                    yyst[yysp] = 120;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 507:
                    yyn = yys120();
                    continue;

                case 121:
                    yyst[yysp] = 121;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 508:
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
                case 509:
                    yyn = yys122();
                    continue;

                case 123:
                    yyst[yysp] = 123;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 510:
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
                case 511:
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
                case 512:
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
                case 513:
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
                case 514:
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
                case 515:
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
                case 516:
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
                case 517:
                    yyn = yys130();
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
                case 518:
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
                case 519:
                    yyn = yys132();
                    continue;

                case 133:
                    yyst[yysp] = 133;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 520:
                    yyn = yys133();
                    continue;

                case 134:
                    yyst[yysp] = 134;
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
                            yyn = 83;
                            continue;
                        case INTEGER:
                            yyn = 84;
                            continue;
                        case '(':
                            yyn = 85;
                            continue;
                    }
                    yyn = 777;
                    continue;

                case 135:
                    yyst[yysp] = 135;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 522:
                    yyn = yys135();
                    continue;

                case 136:
                    yyst[yysp] = 136;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 523:
                    yyn = yys136();
                    continue;

                case 137:
                    yyst[yysp] = 137;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 524:
                    switch (yytok) {
                        case IDENTIFIER:
                            yyn = 83;
                            continue;
                        case INTEGER:
                            yyn = 84;
                            continue;
                        case '(':
                            yyn = 85;
                            continue;
                    }
                    yyn = 777;
                    continue;

                case 138:
                    yyst[yysp] = 138;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 525:
                    yyn = yys138();
                    continue;

                case 139:
                    yyst[yysp] = 139;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 526:
                    switch (yytok) {
                        case IDENTIFIER:
                            yyn = 83;
                            continue;
                        case INTEGER:
                            yyn = 84;
                            continue;
                        case '(':
                            yyn = 85;
                            continue;
                        case FLOAT:
                            yyn = yyr113();
                            continue;
                    }
                    yyn = 777;
                    continue;

                case 140:
                    yyst[yysp] = 140;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 527:
                    switch (yytok) {
                        case IDENTIFIER:
                            yyn = 83;
                            continue;
                        case INTEGER:
                            yyn = 84;
                            continue;
                        case '(':
                            yyn = 85;
                            continue;
                        case FLOAT:
                            yyn = yyr112();
                            continue;
                    }
                    yyn = 777;
                    continue;

                case 141:
                    yyst[yysp] = 141;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 528:
                    switch (yytok) {
                        case IDENTIFIER:
                            yyn = 83;
                            continue;
                        case INTEGER:
                            yyn = 84;
                            continue;
                        case FLOAT:
                            yyn = 95;
                            continue;
                        case '(':
                            yyn = 152;
                            continue;
                    }
                    yyn = 777;
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
                case 529:
                    switch (yytok) {
                        case IDENTIFIER:
                            yyn = 83;
                            continue;
                        case INTEGER:
                            yyn = 84;
                            continue;
                        case FLOAT:
                            yyn = 95;
                            continue;
                        case '(':
                            yyn = 96;
                            continue;
                    }
                    yyn = 777;
                    continue;

                case 143:
                    yyst[yysp] = 143;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 530:
                    yyn = yys143();
                    continue;

                case 144:
                    yyst[yysp] = 144;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 531:
                    yyn = yys144();
                    continue;

                case 145:
                    yyst[yysp] = 145;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 532:
                    yyn = yys145();
                    continue;

                case 146:
                    yyst[yysp] = 146;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 533:
                    yyn = yys146();
                    continue;

                case 147:
                    yyst[yysp] = 147;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 534:
                    yyn = yys147();
                    continue;

                case 148:
                    yyst[yysp] = 148;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 535:
                    yyn = yys148();
                    continue;

                case 149:
                    yyst[yysp] = 149;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 536:
                    yyn = yys149();
                    continue;

                case 150:
                    yyst[yysp] = 150;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 537:
                    switch (yytok) {
                        case '*':
                            yyn = 246;
                            continue;
                        case '+':
                            yyn = 247;
                            continue;
                        case '-':
                            yyn = 248;
                            continue;
                        case '/':
                            yyn = 249;
                            continue;
                    }
                    yyn = 777;
                    continue;

                case 151:
                    yyst[yysp] = 151;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 538:
                    yyn = yys151();
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
                case 539:
                    switch (yytok) {
                        case IDENTIFIER:
                            yyn = 83;
                            continue;
                        case INTEGER:
                            yyn = 84;
                            continue;
                        case FLOAT:
                            yyn = 95;
                            continue;
                        case '(':
                            yyn = 152;
                            continue;
                    }
                    yyn = 777;
                    continue;

                case 153:
                    yyst[yysp] = 153;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 540:
                    switch (yytok) {
                        case '[':
                            yyn = 250;
                            continue;
                    }
                    yyn = 777;
                    continue;

                case 154:
                    yyst[yysp] = 154;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 541:
                    switch (yytok) {
                        case IDENTIFIER:
                            yyn = 83;
                            continue;
                        case INTEGER:
                            yyn = 84;
                            continue;
                        case '(':
                            yyn = 85;
                            continue;
                    }
                    yyn = 777;
                    continue;

                case 155:
                    yyst[yysp] = 155;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 542:
                    yyn = yys155();
                    continue;

                case 156:
                    yyst[yysp] = 156;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 543:
                    yyn = yys156();
                    continue;

                case 157:
                    yyst[yysp] = 157;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 544:
                    yyn = yys157();
                    continue;

                case 158:
                    yyst[yysp] = 158;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 545:
                    switch (yytok) {
                        case '[':
                            yyn = 252;
                            continue;
                    }
                    yyn = 777;
                    continue;

                case 159:
                    yyst[yysp] = 159;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 546:
                    yyn = yys159();
                    continue;

                case 160:
                    yyst[yysp] = 160;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 547:
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
                case 548:
                    switch (yytok) {
                        case INTEGER:
                            yyn = 84;
                            continue;
                        case FLOAT:
                            yyn = 95;
                            continue;
                        case '(':
                            yyn = 166;
                            continue;
                    }
                    yyn = 777;
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
                case 549:
                    switch (yytok) {
                        case INTEGER:
                            yyn = 84;
                            continue;
                        case FLOAT:
                            yyn = 95;
                            continue;
                        case '(':
                            yyn = 166;
                            continue;
                    }
                    yyn = 777;
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
                case 550:
                    switch (yytok) {
                        case INTEGER:
                            yyn = 84;
                            continue;
                        case FLOAT:
                            yyn = 95;
                            continue;
                        case '(':
                            yyn = 166;
                            continue;
                    }
                    yyn = 777;
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
                case 551:
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
                case 552:
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
                case 553:
                    switch (yytok) {
                        case INTEGER:
                            yyn = 84;
                            continue;
                        case FLOAT:
                            yyn = 95;
                            continue;
                        case '(':
                            yyn = 166;
                            continue;
                    }
                    yyn = 777;
                    continue;

                case 167:
                    yyst[yysp] = 167;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 554:
                    yyn = yys167();
                    continue;

                case 168:
                    yyst[yysp] = 168;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 555:
                    yyn = yys168();
                    continue;

                case 169:
                    yyst[yysp] = 169;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 556:
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
                case 557:
                    switch (yytok) {
                        case IDENTIFIER:
                            yyn = 83;
                            continue;
                        case INTEGER:
                            yyn = 84;
                            continue;
                        case FLOAT:
                            yyn = 95;
                            continue;
                        case '(':
                            yyn = 96;
                            continue;
                    }
                    yyn = 777;
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
                case 558:
                    switch (yytok) {
                        case IDENTIFIER:
                            yyn = 83;
                            continue;
                        case INTEGER:
                            yyn = 84;
                            continue;
                        case FLOAT:
                            yyn = 95;
                            continue;
                        case '(':
                            yyn = 96;
                            continue;
                    }
                    yyn = 777;
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
                case 559:
                    yyn = yys172();
                    continue;

                case 173:
                    yyst[yysp] = 173;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 560:
                    switch (yytok) {
                        case ENDINPUT:
                            yyn = yyr2();
                            continue;
                    }
                    yyn = 777;
                    continue;

                case 174:
                    yyst[yysp] = 174;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 561:
                    switch (yytok) {
                        case ENDINPUT:
                            yyn = yyr4();
                            continue;
                    }
                    yyn = 777;
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
                case 562:
                    switch (yytok) {
                        case IDENTIFIER:
                            yyn = 83;
                            continue;
                        case INTEGER:
                            yyn = 84;
                            continue;
                        case '(':
                            yyn = 85;
                            continue;
                    }
                    yyn = 777;
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
                case 563:
                    switch (yytok) {
                        case IDENTIFIER:
                            yyn = 83;
                            continue;
                        case INTEGER:
                            yyn = 84;
                            continue;
                        case '(':
                            yyn = 85;
                            continue;
                    }
                    yyn = 777;
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
                case 564:
                    switch (yytok) {
                        case IDENTIFIER:
                            yyn = 83;
                            continue;
                        case INTEGER:
                            yyn = 84;
                            continue;
                        case '(':
                            yyn = 85;
                            continue;
                    }
                    yyn = 777;
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
                case 565:
                    switch (yytok) {
                        case IDENTIFIER:
                            yyn = 83;
                            continue;
                        case INTEGER:
                            yyn = 84;
                            continue;
                        case '(':
                            yyn = 85;
                            continue;
                    }
                    yyn = 777;
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
                case 566:
                    switch (yytok) {
                        case IDENTIFIER:
                            yyn = 83;
                            continue;
                        case INTEGER:
                            yyn = 84;
                            continue;
                        case '(':
                            yyn = 85;
                            continue;
                    }
                    yyn = 777;
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
                case 567:
                    switch (yytok) {
                        case IDENTIFIER:
                            yyn = 83;
                            continue;
                        case INTEGER:
                            yyn = 84;
                            continue;
                        case '(':
                            yyn = 85;
                            continue;
                    }
                    yyn = 777;
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
                case 568:
                    switch (yytok) {
                        case IDENTIFIER:
                            yyn = 83;
                            continue;
                        case INTEGER:
                            yyn = 84;
                            continue;
                        case '(':
                            yyn = 85;
                            continue;
                    }
                    yyn = 777;
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
                case 569:
                    switch (yytok) {
                        case IDENTIFIER:
                            yyn = 83;
                            continue;
                        case INTEGER:
                            yyn = 84;
                            continue;
                        case '(':
                            yyn = 85;
                            continue;
                    }
                    yyn = 777;
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
                case 570:
                    switch (yytok) {
                        case INTEGER:
                            yyn = 84;
                            continue;
                        case '(':
                            yyn = 285;
                            continue;
                    }
                    yyn = 777;
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
                case 571:
                    switch (yytok) {
                        case INTEGER:
                            yyn = 84;
                            continue;
                        case '(':
                            yyn = 285;
                            continue;
                    }
                    yyn = 777;
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
                case 572:
                    switch (yytok) {
                        case INTEGER:
                            yyn = 84;
                            continue;
                        case '(':
                            yyn = 285;
                            continue;
                    }
                    yyn = 777;
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
                case 573:
                    switch (yytok) {
                        case INTEGER:
                            yyn = 84;
                            continue;
                        case '(':
                            yyn = 285;
                            continue;
                    }
                    yyn = 777;
                    continue;

                case 187:
                    yyst[yysp] = 187;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 574:
                    switch (yytok) {
                        case '*':
                            yyn = 175;
                            continue;
                        case '+':
                            yyn = 176;
                            continue;
                        case '-':
                            yyn = 177;
                            continue;
                        case '/':
                            yyn = 178;
                            continue;
                    }
                    yyn = 777;
                    continue;

                case 188:
                    yyst[yysp] = 188;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 575:
                    switch (yytok) {
                        case '*':
                            yyn = 179;
                            continue;
                        case '+':
                            yyn = 180;
                            continue;
                        case '-':
                            yyn = 181;
                            continue;
                        case '/':
                            yyn = 182;
                            continue;
                        case ')':
                            yyn = 289;
                            continue;
                    }
                    yyn = 777;
                    continue;

                case 189:
                    yyst[yysp] = 189;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 576:
                    switch (yytok) {
                        case '*':
                            yyn = 183;
                            continue;
                        case '+':
                            yyn = 184;
                            continue;
                        case '-':
                            yyn = 185;
                            continue;
                        case '/':
                            yyn = 186;
                            continue;
                        case ')':
                            yyn = 290;
                            continue;
                    }
                    yyn = 777;
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
                case 577:
                    switch (yytok) {
                        case IDENTIFIER:
                            yyn = 83;
                            continue;
                        case INTEGER:
                            yyn = 84;
                            continue;
                        case FLOAT:
                            yyn = 95;
                            continue;
                        case '(':
                            yyn = 152;
                            continue;
                    }
                    yyn = 777;
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
                case 578:
                    switch (yytok) {
                        case IDENTIFIER:
                            yyn = 83;
                            continue;
                        case INTEGER:
                            yyn = 84;
                            continue;
                        case FLOAT:
                            yyn = 95;
                            continue;
                        case '(':
                            yyn = 152;
                            continue;
                    }
                    yyn = 777;
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
                case 579:
                    switch (yytok) {
                        case IDENTIFIER:
                            yyn = 83;
                            continue;
                        case INTEGER:
                            yyn = 84;
                            continue;
                        case FLOAT:
                            yyn = 95;
                            continue;
                        case '(':
                            yyn = 152;
                            continue;
                    }
                    yyn = 777;
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
                case 580:
                    switch (yytok) {
                        case IDENTIFIER:
                            yyn = 83;
                            continue;
                        case INTEGER:
                            yyn = 84;
                            continue;
                        case FLOAT:
                            yyn = 95;
                            continue;
                        case '(':
                            yyn = 152;
                            continue;
                    }
                    yyn = 777;
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
                case 581:
                    switch (yytok) {
                        case IDENTIFIER:
                            yyn = 83;
                            continue;
                        case INTEGER:
                            yyn = 84;
                            continue;
                        case FLOAT:
                            yyn = 95;
                            continue;
                        case '(':
                            yyn = 152;
                            continue;
                    }
                    yyn = 777;
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
                case 582:
                    switch (yytok) {
                        case IDENTIFIER:
                            yyn = 83;
                            continue;
                        case INTEGER:
                            yyn = 84;
                            continue;
                        case FLOAT:
                            yyn = 95;
                            continue;
                        case '(':
                            yyn = 152;
                            continue;
                    }
                    yyn = 777;
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
                case 583:
                    switch (yytok) {
                        case IDENTIFIER:
                            yyn = 83;
                            continue;
                        case INTEGER:
                            yyn = 84;
                            continue;
                        case FLOAT:
                            yyn = 95;
                            continue;
                        case '(':
                            yyn = 152;
                            continue;
                    }
                    yyn = 777;
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
                case 584:
                    switch (yytok) {
                        case IDENTIFIER:
                            yyn = 83;
                            continue;
                        case INTEGER:
                            yyn = 84;
                            continue;
                        case FLOAT:
                            yyn = 95;
                            continue;
                        case '(':
                            yyn = 152;
                            continue;
                    }
                    yyn = 777;
                    continue;

                case 198:
                    yyst[yysp] = 198;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.getNextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 585:
                    switch (yytok) {
                        case INTEGER:
                            yyn = 84;
                            continue;
                        case FLOAT:
                            yyn = 95;
                            continue;
                        case '(':
                            yyn = 166;
                            continue;
                    }
                    yyn = 777;
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
                case 586:
                    switch (yytok) {
                        case INTEGER:
                            yyn = 84;
                            continue;
                        case FLOAT:
                            yyn = 95;
                            continue;
                        case '(':
                            yyn = 166;
                            continue;
                    }
                    yyn = 777;
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
                case 587:
                    switch (yytok) {
                        case INTEGER:
                            yyn = 84;
                            continue;
                        case FLOAT:
                            yyn = 95;
                            continue;
                        case '(':
                            yyn = 166;
                            continue;
                    }
                    yyn = 777;
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
                case 588:
                    switch (yytok) {
                        case INTEGER:
                            yyn = 84;
                            continue;
                        case FLOAT:
                            yyn = 95;
                            continue;
                        case '(':
                            yyn = 166;
                            continue;
                    }
                    yyn = 777;
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
                case 589:
                    switch (yytok) {
                        case IDENTIFIER:
                            yyn = 83;
                            continue;
                        case INTEGER:
                            yyn = 84;
                            continue;
                        case FLOAT:
                            yyn = 95;
                            continue;
                        case '(':
                            yyn = 96;
                            continue;
                    }
                    yyn = 777;
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
                case 590:
                    switch (yytok) {
                        case IDENTIFIER:
                            yyn = 83;
                            continue;
                        case INTEGER:
                            yyn = 84;
                            continue;
                        case FLOAT:
                            yyn = 95;
                            continue;
                        case '(':
                            yyn = 96;
                            continue;
                    }
                    yyn = 777;
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
                case 591:
                    switch (yytok) {
                        case IDENTIFIER:
                            yyn = 83;
                            continue;
                        case INTEGER:
                            yyn = 84;
                            continue;
                        case FLOAT:
                            yyn = 95;
                            continue;
                        case '(':
                            yyn = 96;
                            continue;
                    }
                    yyn = 777;
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
                case 592:
                    switch (yytok) {
                        case IDENTIFIER:
                            yyn = 83;
                            continue;
                        case INTEGER:
                            yyn = 84;
                            continue;
                        case FLOAT:
                            yyn = 95;
                            continue;
                        case '(':
                            yyn = 96;
                            continue;
                    }
                    yyn = 777;
                    continue;

                case 206:
                    yyst[yysp] = 206;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.getNextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 593:
                    switch (yytok) {
                        case INTEGER:
                            yyn = 84;
                            continue;
                        case FLOAT:
                            yyn = 95;
                            continue;
                        case '(':
                            yyn = 166;
                            continue;
                    }
                    yyn = 777;
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
                case 594:
                    switch (yytok) {
                        case INTEGER:
                            yyn = 84;
                            continue;
                        case FLOAT:
                            yyn = 95;
                            continue;
                        case '(':
                            yyn = 166;
                            continue;
                    }
                    yyn = 777;
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
                case 595:
                    switch (yytok) {
                        case INTEGER:
                            yyn = 84;
                            continue;
                        case FLOAT:
                            yyn = 95;
                            continue;
                        case '(':
                            yyn = 166;
                            continue;
                    }
                    yyn = 777;
                    continue;

                case 209:
                    yyst[yysp] = 209;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.getNextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 596:
                    switch (yytok) {
                        case INTEGER:
                            yyn = 84;
                            continue;
                        case FLOAT:
                            yyn = 95;
                            continue;
                        case '(':
                            yyn = 166;
                            continue;
                    }
                    yyn = 777;
                    continue;

                case 210:
                    yyst[yysp] = 210;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 597:
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
                    yyn = 777;
                    continue;

                case 211:
                    yyst[yysp] = 211;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 598:
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
                            yyn = 327;
                            continue;
                    }
                    yyn = 777;
                    continue;

                case 212:
                    yyst[yysp] = 212;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 599:
                    switch (yytok) {
                        case '*':
                            yyn = 198;
                            continue;
                        case '+':
                            yyn = 199;
                            continue;
                        case '-':
                            yyn = 200;
                            continue;
                        case '/':
                            yyn = 201;
                            continue;
                        case ')':
                            yyn = 328;
                            continue;
                    }
                    yyn = 777;
                    continue;

                case 213:
                    yyst[yysp] = 213;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 600:
                    switch (yytok) {
                        case '*':
                            yyn = 202;
                            continue;
                        case '+':
                            yyn = 203;
                            continue;
                        case '-':
                            yyn = 204;
                            continue;
                        case '/':
                            yyn = 205;
                            continue;
                    }
                    yyn = 777;
                    continue;

                case 214:
                    yyst[yysp] = 214;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 601:
                    switch (yytok) {
                        case '*':
                            yyn = 206;
                            continue;
                        case '+':
                            yyn = 207;
                            continue;
                        case '-':
                            yyn = 208;
                            continue;
                        case '/':
                            yyn = 209;
                            continue;
                        case ')':
                            yyn = 290;
                            continue;
                    }
                    yyn = 777;
                    continue;

                case 215:
                    yyst[yysp] = 215;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 602:
                    switch (yytok) {
                        case ')':
                            yyn = 329;
                            continue;
                    }
                    yyn = 777;
                    continue;

                case 216:
                    yyst[yysp] = 216;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 603:
                    switch (yytok) {
                        case ')':
                            yyn = yyr107();
                            continue;
                    }
                    yyn = 777;
                    continue;

                case 217:
                    yyst[yysp] = 217;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 604:
                    switch (yytok) {
                        case ')':
                            yyn = yyr108();
                            continue;
                    }
                    yyn = 777;
                    continue;

                case 218:
                    yyst[yysp] = 218;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 605:
                    switch (yytok) {
                        case ')':
                            yyn = yyr110();
                            continue;
                    }
                    yyn = 777;
                    continue;

                case 219:
                    yyst[yysp] = 219;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 606:
                    switch (yytok) {
                        case ')':
                            yyn = yyr111();
                            continue;
                    }
                    yyn = 777;
                    continue;

                case 220:
                    yyst[yysp] = 220;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 607:
                    switch (yytok) {
                        case ')':
                            yyn = yyr109();
                            continue;
                    }
                    yyn = 777;
                    continue;

                case 221:
                    yyst[yysp] = 221;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 608:
                    switch (yytok) {
                        case ']':
                            yyn = 330;
                            continue;
                    }
                    yyn = 777;
                    continue;

                case 222:
                    yyst[yysp] = 222;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 609:
                    yyn = yys222();
                    continue;

                case 223:
                    yyst[yysp] = 223;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 610:
                    yyn = yys223();
                    continue;

                case 224:
                    yyst[yysp] = 224;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 611:
                    yyn = yys224();
                    continue;

                case 225:
                    yyst[yysp] = 225;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 612:
                    yyn = yys225();
                    continue;

                case 226:
                    yyst[yysp] = 226;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 613:
                    yyn = yys226();
                    continue;

                case 227:
                    yyst[yysp] = 227;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 614:
                    yyn = yys227();
                    continue;

                case 228:
                    yyst[yysp] = 228;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 615:
                    switch (yytok) {
                        case ']':
                            yyn = 331;
                            continue;
                    }
                    yyn = 777;
                    continue;

                case 229:
                    yyst[yysp] = 229;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 616:
                    yyn = yys229();
                    continue;

                case 230:
                    yyst[yysp] = 230;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 617:
                    switch (yytok) {
                        case ']':
                            yyn = 333;
                            continue;
                    }
                    yyn = 777;
                    continue;

                case 231:
                    yyst[yysp] = 231;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 618:
                    switch (yytok) {
                        case ']':
                            yyn = 334;
                            continue;
                    }
                    yyn = 777;
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
                case 619:
                    switch (yytok) {
                        case IDENTIFIER:
                            yyn = 83;
                            continue;
                        case INTEGER:
                            yyn = 84;
                            continue;
                        case FLOAT:
                            yyn = 95;
                            continue;
                        case '(':
                            yyn = 96;
                            continue;
                    }
                    yyn = 777;
                    continue;

                case 233:
                    yyst[yysp] = 233;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 620:
                    switch (yytok) {
                        case IDENTIFIER:
                            yyn = 83;
                            continue;
                        case INTEGER:
                            yyn = 84;
                            continue;
                        case FLOAT:
                            yyn = 95;
                            continue;
                        case '(':
                            yyn = 96;
                            continue;
                    }
                    yyn = 777;
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
                case 621:
                    switch (yytok) {
                        case IDENTIFIER:
                            yyn = 83;
                            continue;
                        case INTEGER:
                            yyn = 84;
                            continue;
                        case FLOAT:
                            yyn = 95;
                            continue;
                        case '(':
                            yyn = 100;
                            continue;
                    }
                    yyn = 777;
                    continue;

                case 235:
                    yyst[yysp] = 235;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 622:
                    yyn = yys235();
                    continue;

                case 236:
                    yyst[yysp] = 236;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 623:
                    switch (yytok) {
                        case FIN:
                            yyn = 341;
                            continue;
                    }
                    yyn = 777;
                    continue;

                case 237:
                    yyst[yysp] = 237;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 624:
                    yyn = yys237();
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
                case 625:
                    yyn = yys238();
                    continue;

                case 239:
                    yyst[yysp] = 239;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 626:
                    switch (yytok) {
                        case IDENTIFIER:
                            yyn = 83;
                            continue;
                        case INTEGER:
                            yyn = 84;
                            continue;
                        case '(':
                            yyn = 85;
                            continue;
                    }
                    yyn = 777;
                    continue;

                case 240:
                    yyst[yysp] = 240;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 627:
                    yyn = yys240();
                    continue;

                case 241:
                    yyst[yysp] = 241;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 628:
                    yyn = yys241();
                    continue;

                case 242:
                    yyst[yysp] = 242;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 629:
                    yyn = yys242();
                    continue;

                case 243:
                    yyst[yysp] = 243;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 630:
                    yyn = yys243();
                    continue;

                case 244:
                    yyst[yysp] = 244;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 631:
                    switch (yytok) {
                        case ']':
                            yyn = 346;
                            continue;
                    }
                    yyn = 777;
                    continue;

                case 245:
                    yyst[yysp] = 245;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 632:
                    switch (yytok) {
                        case ']':
                            yyn = 347;
                            continue;
                    }
                    yyn = 777;
                    continue;

                case 246:
                    yyst[yysp] = 246;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.getNextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 633:
                    switch (yytok) {
                        case IDENTIFIER:
                            yyn = 83;
                            continue;
                        case INTEGER:
                            yyn = 84;
                            continue;
                        case FLOAT:
                            yyn = 95;
                            continue;
                        case '(':
                            yyn = 152;
                            continue;
                    }
                    yyn = 777;
                    continue;

                case 247:
                    yyst[yysp] = 247;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.getNextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 634:
                    switch (yytok) {
                        case IDENTIFIER:
                            yyn = 83;
                            continue;
                        case INTEGER:
                            yyn = 84;
                            continue;
                        case FLOAT:
                            yyn = 95;
                            continue;
                        case '(':
                            yyn = 152;
                            continue;
                    }
                    yyn = 777;
                    continue;

                case 248:
                    yyst[yysp] = 248;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.getNextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 635:
                    switch (yytok) {
                        case IDENTIFIER:
                            yyn = 83;
                            continue;
                        case INTEGER:
                            yyn = 84;
                            continue;
                        case FLOAT:
                            yyn = 95;
                            continue;
                        case '(':
                            yyn = 152;
                            continue;
                    }
                    yyn = 777;
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
                case 636:
                    switch (yytok) {
                        case IDENTIFIER:
                            yyn = 83;
                            continue;
                        case INTEGER:
                            yyn = 84;
                            continue;
                        case FLOAT:
                            yyn = 95;
                            continue;
                        case '(':
                            yyn = 152;
                            continue;
                    }
                    yyn = 777;
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
                case 637:
                    yyn = yys250();
                    continue;

                case 251:
                    yyst[yysp] = 251;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 638:
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
                case 639:
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
                case 640:
                    switch (yytok) {
                        case INTEGER:
                            yyn = 84;
                            continue;
                        case FLOAT:
                            yyn = 95;
                            continue;
                        case '(':
                            yyn = 166;
                            continue;
                    }
                    yyn = 777;
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
                case 641:
                    switch (yytok) {
                        case INTEGER:
                            yyn = 84;
                            continue;
                        case FLOAT:
                            yyn = 95;
                            continue;
                        case '(':
                            yyn = 166;
                            continue;
                    }
                    yyn = 777;
                    continue;

                case 255:
                    yyst[yysp] = 255;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.getNextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 642:
                    switch (yytok) {
                        case INTEGER:
                            yyn = 84;
                            continue;
                        case FLOAT:
                            yyn = 95;
                            continue;
                        case '(':
                            yyn = 166;
                            continue;
                    }
                    yyn = 777;
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
                case 643:
                    switch (yytok) {
                        case INTEGER:
                            yyn = 84;
                            continue;
                        case FLOAT:
                            yyn = 95;
                            continue;
                        case '(':
                            yyn = 166;
                            continue;
                    }
                    yyn = 777;
                    continue;

                case 257:
                    yyst[yysp] = 257;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 644:
                    yyn = yys257();
                    continue;

                case 258:
                    yyst[yysp] = 258;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 645:
                    yyn = yys258();
                    continue;

                case 259:
                    yyst[yysp] = 259;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 646:
                    yyn = yys259();
                    continue;

                case 260:
                    yyst[yysp] = 260;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 647:
                    yyn = yys260();
                    continue;

                case 261:
                    yyst[yysp] = 261;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 648:
                    yyn = yys261();
                    continue;

                case 262:
                    yyst[yysp] = 262;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 649:
                    yyn = yys262();
                    continue;

                case 263:
                    yyst[yysp] = 263;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 650:
                    yyn = yys263();
                    continue;

                case 264:
                    yyst[yysp] = 264;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 651:
                    yyn = yys264();
                    continue;

                case 265:
                    yyst[yysp] = 265;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 652:
                    switch (yytok) {
                        case '*':
                            yyn = 198;
                            continue;
                        case '+':
                            yyn = 199;
                            continue;
                        case '-':
                            yyn = 200;
                            continue;
                        case '/':
                            yyn = 201;
                            continue;
                        case ')':
                            yyn = 328;
                            continue;
                    }
                    yyn = 777;
                    continue;

                case 266:
                    yyst[yysp] = 266;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 653:
                    switch (yytok) {
                        case '*':
                            yyn = 206;
                            continue;
                        case '+':
                            yyn = 207;
                            continue;
                        case '-':
                            yyn = 208;
                            continue;
                        case '/':
                            yyn = 209;
                            continue;
                        case ')':
                            yyn = 290;
                            continue;
                    }
                    yyn = 777;
                    continue;

                case 267:
                    yyst[yysp] = 267;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 654:
                    switch (yytok) {
                        case ']':
                            yyn = 372;
                            continue;
                    }
                    yyn = 777;
                    continue;

                case 268:
                    yyst[yysp] = 268;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 655:
                    switch (yytok) {
                        case ']':
                            yyn = 373;
                            continue;
                    }
                    yyn = 777;
                    continue;

                case 269:
                    yyst[yysp] = 269;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 656:
                    switch (yytok) {
                        case ']':
                            yyn = 374;
                            continue;
                    }
                    yyn = 777;
                    continue;

                case 270:
                    yyst[yysp] = 270;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 657:
                    switch (yytok) {
                        case ']':
                            yyn = 375;
                            continue;
                    }
                    yyn = 777;
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
                case 658:
                    switch (yytok) {
                        case IDENTIFIER:
                            yyn = 83;
                            continue;
                        case INTEGER:
                            yyn = 84;
                            continue;
                        case FLOAT:
                            yyn = 95;
                            continue;
                        case '(':
                            yyn = 100;
                            continue;
                    }
                    yyn = 777;
                    continue;

                case 272:
                    yyst[yysp] = 272;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 659:
                    yyn = yys272();
                    continue;

                case 273:
                    yyst[yysp] = 273;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 660:
                    yyn = yys273();
                    continue;

                case 274:
                    yyst[yysp] = 274;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 661:
                    yyn = yys274();
                    continue;

                case 275:
                    yyst[yysp] = 275;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 662:
                    yyn = yys275();
                    continue;

                case 276:
                    yyst[yysp] = 276;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 663:
                    yyn = yys276();
                    continue;

                case 277:
                    yyst[yysp] = 277;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 664:
                    yyn = yys277();
                    continue;

                case 278:
                    yyst[yysp] = 278;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 665:
                    yyn = yys278();
                    continue;

                case 279:
                    yyst[yysp] = 279;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 666:
                    yyn = yys279();
                    continue;

                case 280:
                    yyst[yysp] = 280;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 667:
                    yyn = yys280();
                    continue;

                case 281:
                    yyst[yysp] = 281;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 668:
                    yyn = yys281();
                    continue;

                case 282:
                    yyst[yysp] = 282;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 669:
                    yyn = yys282();
                    continue;

                case 283:
                    yyst[yysp] = 283;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 670:
                    yyn = yys283();
                    continue;

                case 284:
                    yyst[yysp] = 284;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 671:
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
                case 672:
                    switch (yytok) {
                        case INTEGER:
                            yyn = 84;
                            continue;
                        case '(':
                            yyn = 285;
                            continue;
                    }
                    yyn = 777;
                    continue;

                case 286:
                    yyst[yysp] = 286;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 673:
                    yyn = yys286();
                    continue;

                case 287:
                    yyst[yysp] = 287;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 674:
                    yyn = yys287();
                    continue;

                case 288:
                    yyst[yysp] = 288;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 675:
                    yyn = yys288();
                    continue;

                case 289:
                    yyst[yysp] = 289;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.getNextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 676:
                    yyn = yys289();
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
                case 677:
                    yyn = yys290();
                    continue;

                case 291:
                    yyst[yysp] = 291;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 678:
                    yyn = yys291();
                    continue;

                case 292:
                    yyst[yysp] = 292;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 679:
                    yyn = yys292();
                    continue;

                case 293:
                    yyst[yysp] = 293;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 680:
                    yyn = yys293();
                    continue;

                case 294:
                    yyst[yysp] = 294;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 681:
                    yyn = yys294();
                    continue;

                case 295:
                    yyst[yysp] = 295;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 682:
                    yyn = yys295();
                    continue;

                case 296:
                    yyst[yysp] = 296;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 683:
                    yyn = yys296();
                    continue;

                case 297:
                    yyst[yysp] = 297;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 684:
                    yyn = yys297();
                    continue;

                case 298:
                    yyst[yysp] = 298;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 685:
                    yyn = yys298();
                    continue;

                case 299:
                    yyst[yysp] = 299;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 686:
                    yyn = yys299();
                    continue;

                case 300:
                    yyst[yysp] = 300;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 687:
                    yyn = yys300();
                    continue;

                case 301:
                    yyst[yysp] = 301;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 688:
                    yyn = yys301();
                    continue;

                case 302:
                    yyst[yysp] = 302;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 689:
                    yyn = yys302();
                    continue;

                case 303:
                    yyst[yysp] = 303;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 690:
                    yyn = yys303();
                    continue;

                case 304:
                    yyst[yysp] = 304;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 691:
                    yyn = yys304();
                    continue;

                case 305:
                    yyst[yysp] = 305;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 692:
                    yyn = yys305();
                    continue;

                case 306:
                    yyst[yysp] = 306;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 693:
                    yyn = yys306();
                    continue;

                case 307:
                    yyst[yysp] = 307;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 694:
                    yyn = yys307();
                    continue;

                case 308:
                    yyst[yysp] = 308;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 695:
                    yyn = yys308();
                    continue;

                case 309:
                    yyst[yysp] = 309;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 696:
                    yyn = yys309();
                    continue;

                case 310:
                    yyst[yysp] = 310;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 697:
                    yyn = yys310();
                    continue;

                case 311:
                    yyst[yysp] = 311;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 698:
                    yyn = yys311();
                    continue;

                case 312:
                    yyst[yysp] = 312;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 699:
                    yyn = yys312();
                    continue;

                case 313:
                    yyst[yysp] = 313;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 700:
                    yyn = yys313();
                    continue;

                case 314:
                    yyst[yysp] = 314;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 701:
                    yyn = yys314();
                    continue;

                case 315:
                    yyst[yysp] = 315;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 702:
                    yyn = yys315();
                    continue;

                case 316:
                    yyst[yysp] = 316;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 703:
                    yyn = yys316();
                    continue;

                case 317:
                    yyst[yysp] = 317;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 704:
                    yyn = yys317();
                    continue;

                case 318:
                    yyst[yysp] = 318;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 705:
                    yyn = yys318();
                    continue;

                case 319:
                    yyst[yysp] = 319;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 706:
                    yyn = yys319();
                    continue;

                case 320:
                    yyst[yysp] = 320;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 707:
                    yyn = yys320();
                    continue;

                case 321:
                    yyst[yysp] = 321;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 708:
                    yyn = yys321();
                    continue;

                case 322:
                    yyst[yysp] = 322;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 709:
                    yyn = yys322();
                    continue;

                case 323:
                    yyst[yysp] = 323;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 710:
                    yyn = yys323();
                    continue;

                case 324:
                    yyst[yysp] = 324;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 711:
                    yyn = yys324();
                    continue;

                case 325:
                    yyst[yysp] = 325;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 712:
                    yyn = yys325();
                    continue;

                case 326:
                    yyst[yysp] = 326;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 713:
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
                case 714:
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
                case 715:
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
                case 716:
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
                case 717:
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
                case 718:
                    switch (yytok) {
                        case ';':
                            yyn = yyr201();
                            continue;
                    }
                    yyn = 777;
                    continue;

                case 332:
                    yyst[yysp] = 332;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 719:
                    switch (yytok) {
                        case ']':
                            yyn = yyr199();
                            continue;
                    }
                    yyn = 777;
                    continue;

                case 333:
                    yyst[yysp] = 333;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.getNextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 720:
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
                case 721:
                    yyn = yys334();
                    continue;

                case 335:
                    yyst[yysp] = 335;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 722:
                    switch (yytok) {
                        case ']':
                            yyn = 378;
                            continue;
                    }
                    yyn = 777;
                    continue;

                case 336:
                    yyst[yysp] = 336;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 723:
                    switch (yytok) {
                        case ']':
                            yyn = 379;
                            continue;
                    }
                    yyn = 777;
                    continue;

                case 337:
                    yyst[yysp] = 337;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 724:
                    switch (yytok) {
                        case ']':
                            yyn = 380;
                            continue;
                    }
                    yyn = 777;
                    continue;

                case 338:
                    yyst[yysp] = 338;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 725:
                    switch (yytok) {
                        case ']':
                            yyn = 381;
                            continue;
                    }
                    yyn = 777;
                    continue;

                case 339:
                    yyst[yysp] = 339;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 726:
                    yyn = yys339();
                    continue;

                case 340:
                    yyst[yysp] = 340;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 727:
                    switch (yytok) {
                        case FIN:
                        case ']':
                            yyn = yyr174();
                            continue;
                    }
                    yyn = 777;
                    continue;

                case 341:
                    yyst[yysp] = 341;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.getNextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 728:
                    switch (yytok) {
                        case ';':
                            yyn = yyr207();
                            continue;
                    }
                    yyn = 777;
                    continue;

                case 342:
                    yyst[yysp] = 342;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 729:
                    switch (yytok) {
                        case FIN:
                            yyn = 382;
                            continue;
                    }
                    yyn = 777;
                    continue;

                case 343:
                    yyst[yysp] = 343;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 730:
                    yyn = yys343();
                    continue;

                case 344:
                    yyst[yysp] = 344;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.getNextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 731:
                    yyn = yys344();
                    continue;

                case 345:
                    yyst[yysp] = 345;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 732:
                    switch (yytok) {
                        case ']':
                            yyn = 384;
                            continue;
                    }
                    yyn = 777;
                    continue;

                case 346:
                    yyst[yysp] = 346;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.getNextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 733:
                    yyn = yys346();
                    continue;

                case 347:
                    yyst[yysp] = 347;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.getNextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 734:
                    yyn = yys347();
                    continue;

                case 348:
                    yyst[yysp] = 348;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 735:
                    switch (yytok) {
                        case ']':
                            yyn = 385;
                            continue;
                    }
                    yyn = 777;
                    continue;

                case 349:
                    yyst[yysp] = 349;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 736:
                    switch (yytok) {
                        case ']':
                            yyn = 386;
                            continue;
                    }
                    yyn = 777;
                    continue;

                case 350:
                    yyst[yysp] = 350;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 737:
                    yyn = yys350();
                    continue;

                case 351:
                    yyst[yysp] = 351;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 738:
                    yyn = yys351();
                    continue;

                case 352:
                    yyst[yysp] = 352;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 739:
                    yyn = yys352();
                    continue;

                case 353:
                    yyst[yysp] = 353;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 740:
                    yyn = yys353();
                    continue;

                case 354:
                    yyst[yysp] = 354;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 741:
                    yyn = yys354();
                    continue;

                case 355:
                    yyst[yysp] = 355;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 742:
                    yyn = yys355();
                    continue;

                case 356:
                    yyst[yysp] = 356;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 743:
                    yyn = yys356();
                    continue;

                case 357:
                    yyst[yysp] = 357;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 744:
                    yyn = yys357();
                    continue;

                case 358:
                    yyst[yysp] = 358;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 745:
                    yyn = yys358();
                    continue;

                case 359:
                    yyst[yysp] = 359;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 746:
                    yyn = yys359();
                    continue;

                case 360:
                    yyst[yysp] = 360;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 747:
                    yyn = yys360();
                    continue;

                case 361:
                    yyst[yysp] = 361;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 748:
                    yyn = yys361();
                    continue;

                case 362:
                    yyst[yysp] = 362;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 749:
                    yyn = yys362();
                    continue;

                case 363:
                    yyst[yysp] = 363;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 750:
                    yyn = yys363();
                    continue;

                case 364:
                    yyst[yysp] = 364;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 751:
                    yyn = yys364();
                    continue;

                case 365:
                    yyst[yysp] = 365;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 752:
                    yyn = yys365();
                    continue;

                case 366:
                    yyst[yysp] = 366;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 753:
                    yyn = yys366();
                    continue;

                case 367:
                    yyst[yysp] = 367;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 754:
                    yyn = yys367();
                    continue;

                case 368:
                    yyst[yysp] = 368;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 755:
                    yyn = yys368();
                    continue;

                case 369:
                    yyst[yysp] = 369;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 756:
                    yyn = yys369();
                    continue;

                case 370:
                    yyst[yysp] = 370;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 757:
                    yyn = yys370();
                    continue;

                case 371:
                    yyst[yysp] = 371;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 758:
                    yyn = yys371();
                    continue;

                case 372:
                    yyst[yysp] = 372;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.getNextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 759:
                    yyn = yys372();
                    continue;

                case 373:
                    yyst[yysp] = 373;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.getNextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 760:
                    yyn = yys373();
                    continue;

                case 374:
                    yyst[yysp] = 374;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.getNextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 761:
                    yyn = yys374();
                    continue;

                case 375:
                    yyst[yysp] = 375;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.getNextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 762:
                    yyn = yys375();
                    continue;

                case 376:
                    yyst[yysp] = 376;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 763:
                    yyn = yys376();
                    continue;

                case 377:
                    yyst[yysp] = 377;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 764:
                    switch (yytok) {
                        case '*':
                            yyn = 183;
                            continue;
                        case '+':
                            yyn = 184;
                            continue;
                        case '-':
                            yyn = 185;
                            continue;
                        case '/':
                            yyn = 186;
                            continue;
                        case ')':
                            yyn = 290;
                            continue;
                    }
                    yyn = 777;
                    continue;

                case 378:
                    yyst[yysp] = 378;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.getNextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 765:
                    yyn = yys378();
                    continue;

                case 379:
                    yyst[yysp] = 379;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.getNextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 766:
                    yyn = yys379();
                    continue;

                case 380:
                    yyst[yysp] = 380;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.getNextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 767:
                    yyn = yys380();
                    continue;

                case 381:
                    yyst[yysp] = 381;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.getNextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 768:
                    yyn = yys381();
                    continue;

                case 382:
                    yyst[yysp] = 382;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.getNextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 769:
                    switch (yytok) {
                        case ';':
                            yyn = yyr206();
                            continue;
                    }
                    yyn = 777;
                    continue;

                case 383:
                    yyst[yysp] = 383;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.getNextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 770:
                    yyn = yys383();
                    continue;

                case 384:
                    yyst[yysp] = 384;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.getNextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 771:
                    yyn = yys384();
                    continue;

                case 385:
                    yyst[yysp] = 385;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.getNextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 772:
                    yyn = yys385();
                    continue;

                case 386:
                    yyst[yysp] = 386;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.getNextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 773:
                    yyn = yys386();
                    continue;

                case 774:
                    return true;
                case 775:
                    yyerror("stack overflow");
                case 776:
                    return false;
                case 777:
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
                return 21;
            case AT:
                return 22;
            case AV:
                return 23;
            case AVANZA:
                return 24;
            case AZAR:
                return 25;
            case BAJALAPIZ:
                return 26;
            case BL:
                return 27;
            case BORRAPANTALLA:
                return 28;
            case CENTRO:
                return 29;
            case COS:
                return 30;
            case CUENTA:
                return 31;
            case DIFERENCIA:
                return 32;
            case DIVISION:
                return 33;
            case EJECUTA:
                return 34;
            case ELEGIR:
                return 35;
            case ELEMENTO:
                return 36;
            case ESPERA:
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
            case INC:
                return 43;
            case INIC:
                return 44;
            case MENOS:
                return 45;
            case OCULTATORTUGA:
                return 46;
            case OT:
                return 47;
            case PARA:
                return 48;
            case PONCL:
                return 49;
            case PONCOLORLAPIZ:
                return 50;
            case PONPOS:
                return 51;
            case PONRUMBO:
                return 52;
            case PONX:
                return 53;
            case PONXY:
                return 54;
            case PONY:
                return 55;
            case POTENCIA:
                return 56;
            case PRIMERO:
                return 57;
            case PRODUCTO:
                return 58;
            case RAIZCUADRADA:
                return 59;
            case RC:
                return 60;
            case RE:
                return 61;
            case REDONDEA:
                return 62;
            case REPITE:
                return 63;
            case RESTO:
                return 64;
            case RETROCEDE:
                return 65;
            case RUMBO:
                return 66;
            case SB:
                return 67;
            case SEN:
                return 68;
            case SENO:
                return 69;
            case SI:
                return 70;
            case SUBELAPIZ:
                return 71;
            case SUMA:
                return 72;
            case UL:
                return 73;
            case ULTIMO:
                return 74;
            case VAR:
                return 75;
        }
        return 777;
    }

    private int yys2() {
        switch (yytok) {
            case ROJO:
            case PARA:
            case error:
            case CIAN:
            case Y:
            case '>':
            case '+':
            case '(':
            case INTEGER:
            case GRIS:
            case ENDINPUT:
            case VERDE:
            case EJECUTA:
            case BLANCO:
            case '=':
            case '-':
            case '*':
            case ')':
            case MAYORQUE:
            case '[':
            case IGUALES:
            case AZUL:
            case FLOAT:
            case AMARILLO:
            case MARRON:
            case '<':
            case O:
            case NEGRO:
            case MENORQUE:
            case '/':
                return 777;
        }
        return yyr8();
    }

    private int yys4() {
        switch (yytok) {
            case ROJO:
            case PARA:
            case error:
            case CIAN:
            case Y:
            case '>':
            case '+':
            case '(':
            case INTEGER:
            case GRIS:
            case ENDINPUT:
            case VERDE:
            case EJECUTA:
            case BLANCO:
            case '=':
            case '-':
            case '*':
            case ')':
            case MAYORQUE:
            case '[':
            case IGUALES:
            case AZUL:
            case FLOAT:
            case AMARILLO:
            case MARRON:
            case '<':
            case O:
            case NEGRO:
            case MENORQUE:
            case '/':
                return 777;
        }
        return yyr10();
    }

    private int yys5() {
        switch (yytok) {
            case ROJO:
            case PARA:
            case error:
            case CIAN:
            case Y:
            case '>':
            case '+':
            case '(':
            case INTEGER:
            case GRIS:
            case ENDINPUT:
            case VERDE:
            case EJECUTA:
            case BLANCO:
            case '=':
            case '-':
            case '*':
            case ')':
            case MAYORQUE:
            case '[':
            case IGUALES:
            case AZUL:
            case FLOAT:
            case AMARILLO:
            case MARRON:
            case '<':
            case O:
            case NEGRO:
            case MENORQUE:
            case '/':
                return 777;
        }
        return yyr11();
    }

    private int yys6() {
        switch (yytok) {
            case ROJO:
            case PARA:
            case error:
            case CIAN:
            case Y:
            case '>':
            case '+':
            case '(':
            case INTEGER:
            case GRIS:
            case ENDINPUT:
            case VERDE:
            case EJECUTA:
            case BLANCO:
            case '=':
            case '-':
            case '*':
            case ')':
            case MAYORQUE:
            case '[':
            case IGUALES:
            case AZUL:
            case FLOAT:
            case AMARILLO:
            case MARRON:
            case '<':
            case O:
            case NEGRO:
            case MENORQUE:
            case '/':
                return 777;
        }
        return yyr13();
    }

    private int yys7() {
        switch (yytok) {
            case ROJO:
            case PARA:
            case error:
            case CIAN:
            case Y:
            case '>':
            case '+':
            case '(':
            case INTEGER:
            case GRIS:
            case ENDINPUT:
            case VERDE:
            case EJECUTA:
            case BLANCO:
            case '=':
            case '-':
            case '*':
            case ')':
            case MAYORQUE:
            case '[':
            case IGUALES:
            case AZUL:
            case FLOAT:
            case AMARILLO:
            case MARRON:
            case '<':
            case O:
            case NEGRO:
            case MENORQUE:
            case '/':
                return 777;
        }
        return yyr20();
    }

    private int yys9() {
        switch (yytok) {
            case ROJO:
            case PARA:
            case error:
            case CIAN:
            case Y:
            case '>':
            case '+':
            case '(':
            case INTEGER:
            case GRIS:
            case ENDINPUT:
            case VERDE:
            case EJECUTA:
            case BLANCO:
            case '=':
            case '-':
            case '*':
            case ')':
            case MAYORQUE:
            case '[':
            case IGUALES:
            case AZUL:
            case FLOAT:
            case AMARILLO:
            case MARRON:
            case '<':
            case O:
            case NEGRO:
            case MENORQUE:
            case '/':
                return 777;
        }
        return yyr19();
    }

    private int yys10() {
        switch (yytok) {
            case ROJO:
            case PARA:
            case error:
            case CIAN:
            case Y:
            case '>':
            case '+':
            case '(':
            case INTEGER:
            case GRIS:
            case ENDINPUT:
            case VERDE:
            case EJECUTA:
            case BLANCO:
            case '=':
            case '-':
            case '*':
            case ')':
            case MAYORQUE:
            case '[':
            case IGUALES:
            case AZUL:
            case FLOAT:
            case AMARILLO:
            case MARRON:
            case '<':
            case O:
            case NEGRO:
            case MENORQUE:
            case '/':
                return 777;
        }
        return yyr16();
    }

    private int yys12() {
        switch (yytok) {
            case ROJO:
            case PARA:
            case error:
            case CIAN:
            case Y:
            case '>':
            case '+':
            case '(':
            case INTEGER:
            case GRIS:
            case ENDINPUT:
            case VERDE:
            case EJECUTA:
            case BLANCO:
            case '=':
            case '-':
            case '*':
            case ')':
            case MAYORQUE:
            case '[':
            case IGUALES:
            case AZUL:
            case FLOAT:
            case AMARILLO:
            case MARRON:
            case '<':
            case O:
            case NEGRO:
            case MENORQUE:
            case '/':
                return 777;
        }
        return yyr9();
    }

    private int yys15() {
        switch (yytok) {
            case ROJO:
            case PARA:
            case error:
            case CIAN:
            case Y:
            case '>':
            case '+':
            case '(':
            case INTEGER:
            case GRIS:
            case ENDINPUT:
            case VERDE:
            case EJECUTA:
            case BLANCO:
            case '=':
            case '-':
            case '*':
            case ')':
            case MAYORQUE:
            case '[':
            case IGUALES:
            case AZUL:
            case FLOAT:
            case AMARILLO:
            case MARRON:
            case '<':
            case O:
            case NEGRO:
            case MENORQUE:
            case '/':
                return 777;
        }
        return yyr21();
    }

    private int yys16() {
        switch (yytok) {
            case ROJO:
            case PARA:
            case error:
            case CIAN:
            case Y:
            case '>':
            case '+':
            case '(':
            case INTEGER:
            case GRIS:
            case ENDINPUT:
            case VERDE:
            case EJECUTA:
            case BLANCO:
            case '=':
            case '-':
            case '*':
            case ')':
            case MAYORQUE:
            case '[':
            case IGUALES:
            case AZUL:
            case FLOAT:
            case AMARILLO:
            case MARRON:
            case '<':
            case O:
            case NEGRO:
            case MENORQUE:
            case '/':
                return 777;
        }
        return yyr12();
    }

    private int yys17() {
        switch (yytok) {
            case ROJO:
            case PARA:
            case error:
            case CIAN:
            case Y:
            case '>':
            case '+':
            case '(':
            case INTEGER:
            case GRIS:
            case ENDINPUT:
            case VERDE:
            case EJECUTA:
            case BLANCO:
            case '=':
            case '-':
            case '*':
            case ')':
            case MAYORQUE:
            case '[':
            case IGUALES:
            case AZUL:
            case FLOAT:
            case AMARILLO:
            case MARRON:
            case '<':
            case O:
            case NEGRO:
            case MENORQUE:
            case '/':
                return 777;
        }
        return yyr14();
    }

    private int yys18() {
        switch (yytok) {
            case ROJO:
            case PARA:
            case error:
            case CIAN:
            case Y:
            case '>':
            case '+':
            case '(':
            case INTEGER:
            case GRIS:
            case ENDINPUT:
            case VERDE:
            case EJECUTA:
            case BLANCO:
            case '=':
            case '-':
            case '*':
            case ')':
            case MAYORQUE:
            case '[':
            case IGUALES:
            case AZUL:
            case FLOAT:
            case AMARILLO:
            case MARRON:
            case '<':
            case O:
            case NEGRO:
            case MENORQUE:
            case '/':
                return 777;
        }
        return yyr18();
    }

    private int yys19() {
        switch (yytok) {
            case ROJO:
            case PARA:
            case error:
            case CIAN:
            case Y:
            case '>':
            case '+':
            case '(':
            case INTEGER:
            case GRIS:
            case ENDINPUT:
            case VERDE:
            case EJECUTA:
            case BLANCO:
            case '=':
            case '-':
            case '*':
            case ')':
            case MAYORQUE:
            case '[':
            case IGUALES:
            case AZUL:
            case FLOAT:
            case AMARILLO:
            case MARRON:
            case '<':
            case O:
            case NEGRO:
            case MENORQUE:
            case '/':
                return 777;
        }
        return yyr15();
    }

    private int yys20() {
        switch (yytok) {
            case ROJO:
            case PARA:
            case error:
            case CIAN:
            case Y:
            case '>':
            case '+':
            case '(':
            case INTEGER:
            case GRIS:
            case ENDINPUT:
            case VERDE:
            case EJECUTA:
            case BLANCO:
            case '=':
            case '-':
            case '*':
            case ')':
            case MAYORQUE:
            case '[':
            case IGUALES:
            case AZUL:
            case FLOAT:
            case AMARILLO:
            case MARRON:
            case '<':
            case O:
            case NEGRO:
            case MENORQUE:
            case '/':
                return 777;
        }
        return yyr17();
    }

    private int yys21() {
        switch (yytok) {
            case ROJO:
            case PARA:
            case error:
            case CIAN:
            case Y:
            case '>':
            case '+':
            case '(':
            case INTEGER:
            case GRIS:
            case ENDINPUT:
            case VERDE:
            case EJECUTA:
            case BLANCO:
            case '=':
            case '-':
            case '*':
            case ')':
            case MAYORQUE:
            case '[':
            case IGUALES:
            case AZUL:
            case FLOAT:
            case AMARILLO:
            case MARRON:
            case '<':
            case O:
            case NEGRO:
            case MENORQUE:
            case '/':
                return 777;
        }
        return yyr129();
    }

    private int yys22() {
        switch (yytok) {
            case ROJO:
            case PARA:
            case error:
            case CIAN:
            case Y:
            case '>':
            case '+':
            case '(':
            case INTEGER:
            case GRIS:
            case ENDINPUT:
            case VERDE:
            case EJECUTA:
            case BLANCO:
            case '=':
            case '-':
            case '*':
            case ')':
            case MAYORQUE:
            case '[':
            case IGUALES:
            case AZUL:
            case FLOAT:
            case AMARILLO:
            case MARRON:
            case '<':
            case O:
            case NEGRO:
            case MENORQUE:
            case '/':
                return 777;
        }
        return yyr130();
    }

    private int yys26() {
        switch (yytok) {
            case ROJO:
            case PARA:
            case error:
            case CIAN:
            case Y:
            case '>':
            case '+':
            case '(':
            case INTEGER:
            case GRIS:
            case ENDINPUT:
            case VERDE:
            case EJECUTA:
            case BLANCO:
            case '=':
            case '-':
            case '*':
            case ')':
            case MAYORQUE:
            case '[':
            case IGUALES:
            case AZUL:
            case FLOAT:
            case AMARILLO:
            case MARRON:
            case '<':
            case O:
            case NEGRO:
            case MENORQUE:
            case '/':
                return 777;
        }
        return yyr131();
    }

    private int yys27() {
        switch (yytok) {
            case ROJO:
            case PARA:
            case error:
            case CIAN:
            case Y:
            case '>':
            case '+':
            case '(':
            case INTEGER:
            case GRIS:
            case ENDINPUT:
            case VERDE:
            case EJECUTA:
            case BLANCO:
            case '=':
            case '-':
            case '*':
            case ')':
            case MAYORQUE:
            case '[':
            case IGUALES:
            case AZUL:
            case FLOAT:
            case AMARILLO:
            case MARRON:
            case '<':
            case O:
            case NEGRO:
            case MENORQUE:
            case '/':
                return 777;
        }
        return yyr132();
    }

    private int yys28() {
        switch (yytok) {
            case ROJO:
            case PARA:
            case error:
            case CIAN:
            case Y:
            case '>':
            case '+':
            case '(':
            case INTEGER:
            case GRIS:
            case ENDINPUT:
            case VERDE:
            case EJECUTA:
            case BLANCO:
            case '=':
            case '-':
            case '*':
            case ')':
            case MAYORQUE:
            case '[':
            case IGUALES:
            case AZUL:
            case FLOAT:
            case AMARILLO:
            case MARRON:
            case '<':
            case O:
            case NEGRO:
            case MENORQUE:
            case '/':
                return 777;
        }
        return yyr136();
    }

    private int yys29() {
        switch (yytok) {
            case ROJO:
            case PARA:
            case error:
            case CIAN:
            case Y:
            case '>':
            case '+':
            case '(':
            case INTEGER:
            case GRIS:
            case ENDINPUT:
            case VERDE:
            case EJECUTA:
            case BLANCO:
            case '=':
            case '-':
            case '*':
            case ')':
            case MAYORQUE:
            case '[':
            case IGUALES:
            case AZUL:
            case FLOAT:
            case AMARILLO:
            case MARRON:
            case '<':
            case O:
            case NEGRO:
            case MENORQUE:
            case '/':
                return 777;
        }
        return yyr135();
    }

    private int yys42() {
        switch (yytok) {
            case O:
            case '=':
            case MENORQUE:
            case '*':
            case VERDE:
            case BLANCO:
            case CIAN:
            case error:
            case '>':
            case PARA:
            case AMARILLO:
            case '<':
            case NEGRO:
            case '/':
            case '+':
            case '-':
            case EJECUTA:
            case ')':
            case MAYORQUE:
            case '[':
            case IGUALES:
            case GRIS:
            case ROJO:
            case AZUL:
            case ENDINPUT:
            case MARRON:
            case Y:
                return 777;
            case IDENTIFIER:
                return 83;
            case INTEGER:
                return 84;
            case FLOAT:
                return 95;
            case '(':
                return 100;
        }
        return yyr209();
    }

    private int yys46() {
        switch (yytok) {
            case ROJO:
            case PARA:
            case error:
            case CIAN:
            case Y:
            case '>':
            case '+':
            case '(':
            case INTEGER:
            case GRIS:
            case ENDINPUT:
            case VERDE:
            case EJECUTA:
            case BLANCO:
            case '=':
            case '-':
            case '*':
            case ')':
            case MAYORQUE:
            case '[':
            case IGUALES:
            case AZUL:
            case FLOAT:
            case AMARILLO:
            case MARRON:
            case '<':
            case O:
            case NEGRO:
            case MENORQUE:
            case '/':
                return 777;
        }
        return yyr127();
    }

    private int yys47() {
        switch (yytok) {
            case ROJO:
            case PARA:
            case error:
            case CIAN:
            case Y:
            case '>':
            case '+':
            case '(':
            case INTEGER:
            case GRIS:
            case ENDINPUT:
            case VERDE:
            case EJECUTA:
            case BLANCO:
            case '=':
            case '-':
            case '*':
            case ')':
            case MAYORQUE:
            case '[':
            case IGUALES:
            case AZUL:
            case FLOAT:
            case AMARILLO:
            case MARRON:
            case '<':
            case O:
            case NEGRO:
            case MENORQUE:
            case '/':
                return 777;
        }
        return yyr128();
    }

    private int yys49() {
        switch (yytok) {
            case AMARILLO:
                return 124;
            case AZUL:
                return 125;
            case BLANCO:
                return 126;
            case CIAN:
                return 127;
            case GRIS:
                return 128;
            case MARRON:
                return 129;
            case NEGRO:
                return 130;
            case ROJO:
                return 131;
            case VERDE:
                return 132;
        }
        return 777;
    }

    private int yys50() {
        switch (yytok) {
            case AMARILLO:
                return 124;
            case AZUL:
                return 125;
            case BLANCO:
                return 126;
            case CIAN:
                return 127;
            case GRIS:
                return 128;
            case MARRON:
                return 129;
            case NEGRO:
                return 130;
            case ROJO:
                return 131;
            case VERDE:
                return 132;
        }
        return 777;
    }

    private int yys66() {
        switch (yytok) {
            case ROJO:
            case PARA:
            case error:
            case CIAN:
            case Y:
            case '>':
            case '+':
            case '(':
            case INTEGER:
            case GRIS:
            case ENDINPUT:
            case VERDE:
            case EJECUTA:
            case BLANCO:
            case '=':
            case '-':
            case '*':
            case ')':
            case MAYORQUE:
            case '[':
            case IGUALES:
            case AZUL:
            case FLOAT:
            case AMARILLO:
            case MARRON:
            case '<':
            case O:
            case NEGRO:
            case MENORQUE:
            case '/':
                return 777;
        }
        return yyr137();
    }

    private int yys67() {
        switch (yytok) {
            case ROJO:
            case PARA:
            case error:
            case CIAN:
            case Y:
            case '>':
            case '+':
            case '(':
            case INTEGER:
            case GRIS:
            case ENDINPUT:
            case VERDE:
            case EJECUTA:
            case BLANCO:
            case '=':
            case '-':
            case '*':
            case ')':
            case MAYORQUE:
            case '[':
            case IGUALES:
            case AZUL:
            case FLOAT:
            case AMARILLO:
            case MARRON:
            case '<':
            case O:
            case NEGRO:
            case MENORQUE:
            case '/':
                return 777;
        }
        return yyr134();
    }

    private int yys70() {
        switch (yytok) {
            case INTEGER:
                return 84;
            case FLOAT:
                return 95;
            case IGUALES:
                return 161;
            case MAYORQUE:
                return 162;
            case MENORQUE:
                return 163;
            case O:
                return 164;
            case Y:
                return 165;
            case '(':
                return 166;
        }
        return 777;
    }

    private int yys71() {
        switch (yytok) {
            case ROJO:
            case PARA:
            case error:
            case CIAN:
            case Y:
            case '>':
            case '+':
            case '(':
            case INTEGER:
            case GRIS:
            case ENDINPUT:
            case VERDE:
            case EJECUTA:
            case BLANCO:
            case '=':
            case '-':
            case '*':
            case ')':
            case MAYORQUE:
            case '[':
            case IGUALES:
            case AZUL:
            case FLOAT:
            case AMARILLO:
            case MARRON:
            case '<':
            case O:
            case NEGRO:
            case MENORQUE:
            case '/':
                return 777;
        }
        return yyr133();
    }

    private int yys76() {
        switch (yytok) {
            case APARECETORTUGA:
                return 21;
            case AT:
                return 22;
            case AV:
                return 23;
            case AVANZA:
                return 24;
            case AZAR:
                return 25;
            case BAJALAPIZ:
                return 26;
            case BL:
                return 27;
            case BORRAPANTALLA:
                return 28;
            case CENTRO:
                return 29;
            case COS:
                return 30;
            case CUENTA:
                return 31;
            case DIFERENCIA:
                return 32;
            case DIVISION:
                return 33;
            case EJECUTA:
                return 34;
            case ELEGIR:
                return 35;
            case ELEMENTO:
                return 36;
            case ESPERA:
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
            case INC:
                return 43;
            case INIC:
                return 44;
            case MENOS:
                return 45;
            case OCULTATORTUGA:
                return 46;
            case OT:
                return 47;
            case PARA:
                return 48;
            case PONCL:
                return 49;
            case PONCOLORLAPIZ:
                return 50;
            case PONPOS:
                return 51;
            case PONRUMBO:
                return 52;
            case PONX:
                return 53;
            case PONXY:
                return 54;
            case PONY:
                return 55;
            case POTENCIA:
                return 56;
            case PRIMERO:
                return 57;
            case PRODUCTO:
                return 58;
            case RAIZCUADRADA:
                return 59;
            case RC:
                return 60;
            case RE:
                return 61;
            case REDONDEA:
                return 62;
            case REPITE:
                return 63;
            case RESTO:
                return 64;
            case RETROCEDE:
                return 65;
            case RUMBO:
                return 66;
            case SB:
                return 67;
            case SEN:
                return 68;
            case SENO:
                return 69;
            case SI:
                return 70;
            case SUBELAPIZ:
                return 71;
            case SUMA:
                return 72;
            case UL:
                return 73;
            case ULTIMO:
                return 74;
            case VAR:
                return 75;
            case ENDINPUT:
                return yyr3();
        }
        return 777;
    }

    private int yys77() {
        switch (yytok) {
            case APARECETORTUGA:
                return 21;
            case AT:
                return 22;
            case AV:
                return 23;
            case AVANZA:
                return 24;
            case AZAR:
                return 25;
            case BAJALAPIZ:
                return 26;
            case BL:
                return 27;
            case BORRAPANTALLA:
                return 28;
            case CENTRO:
                return 29;
            case COS:
                return 30;
            case CUENTA:
                return 31;
            case DIFERENCIA:
                return 32;
            case DIVISION:
                return 33;
            case EJECUTA:
                return 34;
            case ELEGIR:
                return 35;
            case ELEMENTO:
                return 36;
            case ESPERA:
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
            case INC:
                return 43;
            case INIC:
                return 44;
            case MENOS:
                return 45;
            case OCULTATORTUGA:
                return 46;
            case OT:
                return 47;
            case PARA:
                return 48;
            case PONCL:
                return 49;
            case PONCOLORLAPIZ:
                return 50;
            case PONPOS:
                return 51;
            case PONRUMBO:
                return 52;
            case PONX:
                return 53;
            case PONXY:
                return 54;
            case PONY:
                return 55;
            case POTENCIA:
                return 56;
            case PRIMERO:
                return 57;
            case PRODUCTO:
                return 58;
            case RAIZCUADRADA:
                return 59;
            case RC:
                return 60;
            case RE:
                return 61;
            case REDONDEA:
                return 62;
            case REPITE:
                return 63;
            case RESTO:
                return 64;
            case RETROCEDE:
                return 65;
            case RUMBO:
                return 66;
            case SB:
                return 67;
            case SEN:
                return 68;
            case SENO:
                return 69;
            case SI:
                return 70;
            case SUBELAPIZ:
                return 71;
            case SUMA:
                return 72;
            case UL:
                return 73;
            case ULTIMO:
                return 74;
            case VAR:
                return 75;
            case ENDINPUT:
                return yyr5();
        }
        return 777;
    }

    private int yys78() {
        switch (yytok) {
            case ENDINPUT:
            case NEGRO:
            case '=':
            case AZUL:
            case MENORQUE:
            case EJECUTA:
            case VERDE:
            case MAYORQUE:
            case ROJO:
            case GRIS:
            case MARRON:
            case error:
            case '<':
            case PARA:
            case BLANCO:
            case AMARILLO:
            case Y:
            case O:
            case '>':
            case IGUALES:
            case CIAN:
            case FLOAT:
                return 777;
            case '*':
                return 175;
            case '+':
                return 176;
            case '-':
                return 177;
            case '/':
                return 178;
        }
        return yyr24();
    }

    private int yys79() {
        switch (yytok) {
            case ROJO:
            case PARA:
            case error:
            case CIAN:
            case Y:
            case '>':
            case '+':
            case '(':
            case INTEGER:
            case GRIS:
            case ENDINPUT:
            case VERDE:
            case EJECUTA:
            case BLANCO:
            case '=':
            case '-':
            case '*':
            case ')':
            case MAYORQUE:
            case '[':
            case IGUALES:
            case AZUL:
            case FLOAT:
            case AMARILLO:
            case MARRON:
            case '<':
            case O:
            case NEGRO:
            case MENORQUE:
            case '/':
                return 777;
        }
        return yyr139();
    }

    private int yys80() {
        switch (yytok) {
            case GRIS:
            case error:
            case '=':
            case AMARILLO:
            case NEGRO:
            case EJECUTA:
            case MARRON:
            case MAYORQUE:
            case ROJO:
            case AZUL:
            case VERDE:
            case MENORQUE:
            case PARA:
            case '<':
            case BLANCO:
            case ENDINPUT:
            case Y:
            case O:
            case '>':
            case IGUALES:
            case CIAN:
                return 777;
            case '*':
                return 179;
            case '+':
                return 180;
            case '-':
                return 181;
            case '/':
                return 182;
        }
        return yyr25();
    }

    private int yys81() {
        switch (yytok) {
            case GRIS:
            case error:
            case '=':
            case AMARILLO:
            case NEGRO:
            case EJECUTA:
            case MARRON:
            case MAYORQUE:
            case ROJO:
            case AZUL:
            case VERDE:
            case MENORQUE:
            case PARA:
            case '<':
            case BLANCO:
            case ENDINPUT:
            case Y:
            case O:
            case '>':
            case IGUALES:
            case CIAN:
                return 777;
            case '*':
                return 183;
            case '+':
                return 184;
            case '-':
                return 185;
            case '/':
                return 186;
        }
        return yyr23();
    }

    private int yys82() {
        switch (yytok) {
            case O:
            case IGUALES:
            case ENDINPUT:
            case MARRON:
            case '<':
            case VERDE:
            case Y:
            case '>':
            case GRIS:
            case AMARILLO:
            case EJECUTA:
            case PARA:
            case NEGRO:
            case MENORQUE:
            case BLANCO:
            case error:
            case MAYORQUE:
            case '=':
            case ROJO:
            case CIAN:
            case AZUL:
                return 777;
        }
        return yyr45();
    }

    private int yys83() {
        switch (yytok) {
            case O:
            case IGUALES:
            case ENDINPUT:
            case MARRON:
            case '<':
            case VERDE:
            case Y:
            case '>':
            case GRIS:
            case AMARILLO:
            case EJECUTA:
            case PARA:
            case NEGRO:
            case MENORQUE:
            case BLANCO:
            case error:
            case MAYORQUE:
            case '=':
            case ROJO:
            case CIAN:
            case AZUL:
                return 777;
        }
        return yyr22();
    }

    private int yys84() {
        switch (yytok) {
            case VERDE:
            case error:
            case AZUL:
            case PARA:
            case ROJO:
            case MARRON:
            case BLANCO:
            case CIAN:
            case '=':
            case NEGRO:
            case EJECUTA:
            case ENDINPUT:
            case GRIS:
            case AMARILLO:
                return 777;
        }
        return yyr31();
    }

    private int yys86() {
        switch (yytok) {
            case ROJO:
            case PARA:
            case error:
            case CIAN:
            case Y:
            case '>':
            case '+':
            case '(':
            case INTEGER:
            case GRIS:
            case ENDINPUT:
            case VERDE:
            case EJECUTA:
            case BLANCO:
            case '=':
            case '-':
            case '*':
            case ')':
            case MAYORQUE:
            case '[':
            case IGUALES:
            case AZUL:
            case FLOAT:
            case AMARILLO:
            case MARRON:
            case '<':
            case O:
            case NEGRO:
            case MENORQUE:
            case '/':
                return 777;
        }
        return yyr138();
    }

    private int yys87() {
        switch (yytok) {
            case '[':
            case NEGRO:
            case MARRON:
            case ROJO:
            case MENORQUE:
            case O:
            case Y:
            case VERDE:
            case IGUALES:
            case AZUL:
            case BLANCO:
            case EJECUTA:
            case '=':
            case PARA:
            case '<':
            case ENDINPUT:
            case error:
            case MAYORQUE:
            case '>':
            case AMARILLO:
            case GRIS:
            case CIAN:
                return 777;
            case '*':
                return 190;
            case '+':
                return 191;
            case '-':
                return 192;
            case '/':
                return 193;
        }
        return yyr47();
    }

    private int yys88() {
        switch (yytok) {
            case FLOAT:
            case BLANCO:
            case Y:
            case AZUL:
            case O:
            case PARA:
            case '+':
            case error:
            case ENDINPUT:
            case CIAN:
            case '[':
            case VERDE:
            case MENORQUE:
            case '>':
            case '=':
            case '-':
            case EJECUTA:
            case '(':
            case '<':
            case INTEGER:
            case ROJO:
            case GRIS:
            case IGUALES:
            case AMARILLO:
            case MARRON:
            case MAYORQUE:
            case NEGRO:
            case '*':
            case '/':
                return 777;
        }
        return yyr154();
    }

    private int yys89() {
        switch (yytok) {
            case '[':
            case NEGRO:
            case MARRON:
            case ROJO:
            case MENORQUE:
            case O:
            case Y:
            case VERDE:
            case IGUALES:
            case AZUL:
            case BLANCO:
            case EJECUTA:
            case '=':
            case PARA:
            case '<':
            case ENDINPUT:
            case error:
            case MAYORQUE:
            case '>':
            case AMARILLO:
            case GRIS:
            case CIAN:
                return 777;
            case '*':
                return 194;
            case '+':
                return 195;
            case '-':
                return 196;
            case '/':
                return 197;
        }
        return yyr48();
    }

    private int yys90() {
        switch (yytok) {
            case '[':
            case NEGRO:
            case MARRON:
            case ROJO:
            case MENORQUE:
            case O:
            case Y:
            case VERDE:
            case IGUALES:
            case AZUL:
            case BLANCO:
            case EJECUTA:
            case '=':
            case PARA:
            case '<':
            case ENDINPUT:
            case error:
            case MAYORQUE:
            case '>':
            case AMARILLO:
            case GRIS:
            case CIAN:
                return 777;
            case '*':
                return 198;
            case '+':
                return 199;
            case '-':
                return 200;
            case '/':
                return 201;
        }
        return yyr46();
    }

    private int yys91() {
        switch (yytok) {
            case '[':
            case NEGRO:
            case MARRON:
            case ROJO:
            case MENORQUE:
            case O:
            case Y:
            case VERDE:
            case IGUALES:
            case AZUL:
            case BLANCO:
            case EJECUTA:
            case '=':
            case PARA:
            case '<':
            case ENDINPUT:
            case error:
            case MAYORQUE:
            case '>':
            case AMARILLO:
            case GRIS:
            case CIAN:
                return 777;
            case '*':
                return 202;
            case '+':
                return 203;
            case '-':
                return 204;
            case '/':
                return 205;
        }
        return yyr24();
    }

    private int yys92() {
        switch (yytok) {
            case FLOAT:
            case BLANCO:
            case Y:
            case AZUL:
            case O:
            case PARA:
            case '+':
            case error:
            case ENDINPUT:
            case CIAN:
            case '[':
            case VERDE:
            case MENORQUE:
            case '>':
            case '=':
            case '-':
            case EJECUTA:
            case '(':
            case '<':
            case INTEGER:
            case ROJO:
            case GRIS:
            case IGUALES:
            case AMARILLO:
            case MARRON:
            case MAYORQUE:
            case NEGRO:
            case '*':
            case '/':
                return 777;
        }
        return yyr153();
    }

    private int yys93() {
        switch (yytok) {
            case '[':
            case NEGRO:
            case MARRON:
            case ROJO:
            case MENORQUE:
            case O:
            case Y:
            case VERDE:
            case IGUALES:
            case AZUL:
            case BLANCO:
            case EJECUTA:
            case '=':
            case PARA:
            case '<':
            case ENDINPUT:
            case error:
            case MAYORQUE:
            case '>':
            case AMARILLO:
            case GRIS:
            case CIAN:
                return 777;
            case '*':
                return 206;
            case '+':
                return 207;
            case '-':
                return 208;
            case '/':
                return 209;
        }
        return yyr23();
    }

    private int yys94() {
        switch (yytok) {
            case BLANCO:
            case MAYORQUE:
            case '[':
            case ENDINPUT:
            case PARA:
            case Y:
            case error:
            case '>':
            case CIAN:
            case AMARILLO:
            case MENORQUE:
            case '=':
            case O:
            case NEGRO:
            case '<':
            case EJECUTA:
            case VERDE:
            case MARRON:
            case IGUALES:
            case GRIS:
            case AZUL:
            case ROJO:
                return 777;
        }
        return yyr45();
    }

    private int yys95() {
        switch (yytok) {
            case VERDE:
            case error:
            case AZUL:
            case PARA:
            case ROJO:
            case MARRON:
            case BLANCO:
            case CIAN:
            case '=':
            case NEGRO:
            case EJECUTA:
            case ENDINPUT:
            case GRIS:
            case AMARILLO:
                return 777;
        }
        return yyr62();
    }

    private int yys97() {
        switch (yytok) {
            case ENDINPUT:
            case '-':
            case MAYORQUE:
            case ROJO:
            case MENORQUE:
            case '/':
            case '*':
            case VERDE:
            case IGUALES:
            case AZUL:
            case BLANCO:
            case EJECUTA:
            case '=':
            case PARA:
            case '<':
            case '+':
            case error:
            case Y:
            case '>':
            case AMARILLO:
            case GRIS:
            case CIAN:
            case '[':
            case MARRON:
            case O:
            case NEGRO:
                return 777;
        }
        return yyr113();
    }

    private int yys98() {
        switch (yytok) {
            case ENDINPUT:
            case '-':
            case MAYORQUE:
            case ROJO:
            case MENORQUE:
            case '/':
            case '*':
            case VERDE:
            case IGUALES:
            case AZUL:
            case BLANCO:
            case EJECUTA:
            case '=':
            case PARA:
            case '<':
            case '+':
            case error:
            case Y:
            case '>':
            case AMARILLO:
            case GRIS:
            case CIAN:
            case '[':
            case MARRON:
            case O:
            case NEGRO:
                return 777;
        }
        return yyr112();
    }

    private int yys99() {
        switch (yytok) {
            case FLOAT:
            case BLANCO:
            case Y:
            case AZUL:
            case O:
            case PARA:
            case '+':
            case error:
            case ENDINPUT:
            case CIAN:
            case '[':
            case VERDE:
            case MENORQUE:
            case '>':
            case '=':
            case '-':
            case EJECUTA:
            case '(':
            case '<':
            case INTEGER:
            case ROJO:
            case GRIS:
            case IGUALES:
            case AMARILLO:
            case MARRON:
            case MAYORQUE:
            case NEGRO:
            case '*':
            case '/':
                return 777;
        }
        return yyr157();
    }

    private int yys100() {
        switch (yytok) {
            case AZAR:
                return 25;
            case COS:
                return 30;
            case CUENTA:
                return 31;
            case DIFERENCIA:
                return 32;
            case DIVISION:
                return 33;
            case ELEGIR:
                return 35;
            case ELEMENTO:
                return 36;
            case MENOS:
                return 45;
            case POTENCIA:
                return 56;
            case PRIMERO:
                return 57;
            case PRODUCTO:
                return 58;
            case RAIZCUADRADA:
                return 59;
            case RC:
                return 60;
            case REDONDEA:
                return 62;
            case RESTO:
                return 64;
            case SEN:
                return 68;
            case SENO:
                return 69;
            case SUMA:
                return 72;
            case UL:
                return 73;
            case ULTIMO:
                return 74;
            case IDENTIFIER:
                return 83;
            case INTEGER:
                return 84;
            case FLOAT:
                return 95;
            case '(':
                return 96;
        }
        return 777;
    }

    private int yys102() {
        switch (yytok) {
            case O:
            case PARA:
            case MENORQUE:
            case NEGRO:
            case VERDE:
            case '=':
            case GRIS:
            case Y:
            case ENDINPUT:
            case '/':
            case AMARILLO:
            case MAYORQUE:
            case EJECUTA:
            case BLANCO:
            case '+':
            case '-':
            case error:
            case '*':
            case '<':
            case '>':
            case ROJO:
            case CIAN:
            case AZUL:
            case IGUALES:
            case '[':
            case MARRON:
                return 777;
            case IDENTIFIER:
                return 83;
            case INTEGER:
                return 84;
            case FLOAT:
                return 95;
            case '(':
                return 152;
        }
        return yyr113();
    }

    private int yys103() {
        switch (yytok) {
            case NEGRO:
            case BLANCO:
            case '/':
            case EJECUTA:
            case O:
            case PARA:
            case GRIS:
            case Y:
            case ENDINPUT:
            case AZUL:
            case '[':
            case VERDE:
            case MENORQUE:
            case '=':
            case '+':
            case '-':
            case error:
            case '*':
            case '<':
            case '>':
            case ROJO:
            case CIAN:
            case IGUALES:
            case AMARILLO:
            case MARRON:
            case MAYORQUE:
                return 777;
            case IDENTIFIER:
                return 83;
            case INTEGER:
                return 84;
            case '(':
                return 85;
        }
        return yyr112();
    }

    private int yys104() {
        switch (yytok) {
            case FLOAT:
            case BLANCO:
            case Y:
            case AZUL:
            case O:
            case PARA:
            case '+':
            case error:
            case ENDINPUT:
            case CIAN:
            case '[':
            case VERDE:
            case MENORQUE:
            case '>':
            case '=':
            case '-':
            case EJECUTA:
            case '(':
            case '<':
            case INTEGER:
            case ROJO:
            case GRIS:
            case IGUALES:
            case AMARILLO:
            case MARRON:
            case MAYORQUE:
            case NEGRO:
            case '*':
            case '/':
                return 777;
        }
        return yyr178();
    }

    private int yys105() {
        switch (yytok) {
            case FLOAT:
            case BLANCO:
            case Y:
            case AZUL:
            case O:
            case PARA:
            case '+':
            case error:
            case ENDINPUT:
            case CIAN:
            case '[':
            case VERDE:
            case MENORQUE:
            case '>':
            case '=':
            case '-':
            case EJECUTA:
            case '(':
            case '<':
            case INTEGER:
            case ROJO:
            case GRIS:
            case IGUALES:
            case AMARILLO:
            case MARRON:
            case MAYORQUE:
            case NEGRO:
            case '*':
            case '/':
                return 777;
        }
        return yyr177();
    }

    private int yys106() {
        switch (yytok) {
            case FLOAT:
            case BLANCO:
            case Y:
            case AZUL:
            case O:
            case PARA:
            case '+':
            case error:
            case ENDINPUT:
            case CIAN:
            case '[':
            case VERDE:
            case MENORQUE:
            case '>':
            case '=':
            case '-':
            case EJECUTA:
            case '(':
            case '<':
            case INTEGER:
            case ROJO:
            case GRIS:
            case IGUALES:
            case AMARILLO:
            case MARRON:
            case MAYORQUE:
            case NEGRO:
            case '*':
            case '/':
                return 777;
        }
        return yyr176();
    }

    private int yys107() {
        switch (yytok) {
            case O:
            case PARA:
            case MENORQUE:
            case NEGRO:
            case VERDE:
            case '=':
            case GRIS:
            case Y:
            case ENDINPUT:
            case '/':
            case AMARILLO:
            case MAYORQUE:
            case EJECUTA:
            case BLANCO:
            case '+':
            case '-':
            case error:
            case '*':
            case '<':
            case '>':
            case ROJO:
            case CIAN:
            case AZUL:
            case IGUALES:
            case '[':
            case MARRON:
                return 777;
            case IDENTIFIER:
                return 83;
            case INTEGER:
                return 84;
            case FLOAT:
                return 95;
            case '(':
                return 100;
        }
        return yyr169();
    }

    private int yys109() {
        switch (yytok) {
            case APARECETORTUGA:
                return 21;
            case AT:
                return 22;
            case AV:
                return 23;
            case AVANZA:
                return 24;
            case AZAR:
                return 25;
            case BAJALAPIZ:
                return 26;
            case BL:
                return 27;
            case BORRAPANTALLA:
                return 28;
            case CENTRO:
                return 29;
            case COS:
                return 30;
            case CUENTA:
                return 31;
            case DIFERENCIA:
                return 32;
            case DIVISION:
                return 33;
            case ELEGIR:
                return 35;
            case ELEMENTO:
                return 36;
            case ESPERA:
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
            case INC:
                return 43;
            case INIC:
                return 44;
            case MENOS:
                return 45;
            case OCULTATORTUGA:
                return 46;
            case OT:
                return 47;
            case PONCL:
                return 49;
            case PONCOLORLAPIZ:
                return 50;
            case PONPOS:
                return 51;
            case PONRUMBO:
                return 52;
            case PONX:
                return 53;
            case PONXY:
                return 54;
            case PONY:
                return 55;
            case POTENCIA:
                return 56;
            case PRIMERO:
                return 57;
            case PRODUCTO:
                return 58;
            case RAIZCUADRADA:
                return 59;
            case RC:
                return 60;
            case RE:
                return 61;
            case REDONDEA:
                return 62;
            case REPITE:
                return 63;
            case RESTO:
                return 64;
            case RETROCEDE:
                return 65;
            case RUMBO:
                return 66;
            case SB:
                return 67;
            case SEN:
                return 68;
            case SENO:
                return 69;
            case SI:
                return 70;
            case SUBELAPIZ:
                return 71;
            case SUMA:
                return 72;
            case UL:
                return 73;
            case ULTIMO:
                return 74;
            case VAR:
                return 75;
        }
        return 777;
    }

    private int yys112() {
        switch (yytok) {
            case ROJO:
            case PARA:
            case error:
            case CIAN:
            case Y:
            case '>':
            case '+':
            case '(':
            case INTEGER:
            case GRIS:
            case ENDINPUT:
            case VERDE:
            case EJECUTA:
            case BLANCO:
            case '=':
            case '-':
            case '*':
            case ')':
            case MAYORQUE:
            case '[':
            case IGUALES:
            case AZUL:
            case FLOAT:
            case AMARILLO:
            case MARRON:
            case '<':
            case O:
            case NEGRO:
            case MENORQUE:
            case '/':
                return 777;
        }
        return yyr151();
    }

    private int yys113() {
        switch (yytok) {
            case ROJO:
            case PARA:
            case error:
            case CIAN:
            case Y:
            case '>':
            case '+':
            case '(':
            case INTEGER:
            case GRIS:
            case ENDINPUT:
            case VERDE:
            case EJECUTA:
            case BLANCO:
            case '=':
            case '-':
            case '*':
            case ')':
            case MAYORQUE:
            case '[':
            case IGUALES:
            case AZUL:
            case FLOAT:
            case AMARILLO:
            case MARRON:
            case '<':
            case O:
            case NEGRO:
            case MENORQUE:
            case '/':
                return 777;
        }
        return yyr143();
    }

    private int yys114() {
        switch (yytok) {
            case ROJO:
            case PARA:
            case error:
            case CIAN:
            case Y:
            case '>':
            case '+':
            case '(':
            case INTEGER:
            case GRIS:
            case ENDINPUT:
            case VERDE:
            case EJECUTA:
            case BLANCO:
            case '=':
            case '-':
            case '*':
            case ')':
            case MAYORQUE:
            case '[':
            case IGUALES:
            case AZUL:
            case FLOAT:
            case AMARILLO:
            case MARRON:
            case '<':
            case O:
            case NEGRO:
            case MENORQUE:
            case '/':
                return 777;
        }
        return yyr145();
    }

    private int yys115() {
        switch (yytok) {
            case ROJO:
            case PARA:
            case error:
            case CIAN:
            case Y:
            case '>':
            case '+':
            case '(':
            case INTEGER:
            case GRIS:
            case ENDINPUT:
            case VERDE:
            case EJECUTA:
            case BLANCO:
            case '=':
            case '-':
            case '*':
            case ')':
            case MAYORQUE:
            case '[':
            case IGUALES:
            case AZUL:
            case FLOAT:
            case AMARILLO:
            case MARRON:
            case '<':
            case O:
            case NEGRO:
            case MENORQUE:
            case '/':
                return 777;
        }
        return yyr142();
    }

    private int yys116() {
        switch (yytok) {
            case ROJO:
            case PARA:
            case error:
            case CIAN:
            case Y:
            case '>':
            case '+':
            case '(':
            case INTEGER:
            case GRIS:
            case ENDINPUT:
            case VERDE:
            case EJECUTA:
            case BLANCO:
            case '=':
            case '-':
            case '*':
            case ')':
            case MAYORQUE:
            case '[':
            case IGUALES:
            case AZUL:
            case FLOAT:
            case AMARILLO:
            case MARRON:
            case '<':
            case O:
            case NEGRO:
            case MENORQUE:
            case '/':
                return 777;
        }
        return yyr144();
    }

    private int yys117() {
        switch (yytok) {
            case ROJO:
            case PARA:
            case error:
            case CIAN:
            case Y:
            case '>':
            case '+':
            case '(':
            case INTEGER:
            case GRIS:
            case ENDINPUT:
            case VERDE:
            case EJECUTA:
            case BLANCO:
            case '=':
            case '-':
            case '*':
            case ')':
            case MAYORQUE:
            case '[':
            case IGUALES:
            case AZUL:
            case FLOAT:
            case AMARILLO:
            case MARRON:
            case '<':
            case O:
            case NEGRO:
            case MENORQUE:
            case '/':
                return 777;
        }
        return yyr208();
    }

    private int yys120() {
        switch (yytok) {
            case FLOAT:
            case BLANCO:
            case Y:
            case AZUL:
            case O:
            case PARA:
            case '+':
            case error:
            case ENDINPUT:
            case CIAN:
            case '[':
            case VERDE:
            case MENORQUE:
            case '>':
            case '=':
            case '-':
            case EJECUTA:
            case '(':
            case '<':
            case INTEGER:
            case ROJO:
            case GRIS:
            case IGUALES:
            case AMARILLO:
            case MARRON:
            case MAYORQUE:
            case NEGRO:
            case '*':
            case '/':
                return 777;
        }
        return yyr156();
    }

    private int yys121() {
        switch (yytok) {
            case FLOAT:
            case BLANCO:
            case Y:
            case AZUL:
            case O:
            case PARA:
            case '+':
            case error:
            case ENDINPUT:
            case CIAN:
            case '[':
            case VERDE:
            case MENORQUE:
            case '>':
            case '=':
            case '-':
            case EJECUTA:
            case '(':
            case '<':
            case INTEGER:
            case ROJO:
            case GRIS:
            case IGUALES:
            case AMARILLO:
            case MARRON:
            case MAYORQUE:
            case NEGRO:
            case '*':
            case '/':
                return 777;
        }
        return yyr155();
    }

    private int yys122() {
        switch (yytok) {
            case APARECETORTUGA:
                return 21;
            case AT:
                return 22;
            case AV:
                return 23;
            case AVANZA:
                return 24;
            case AZAR:
                return 25;
            case BAJALAPIZ:
                return 26;
            case BL:
                return 27;
            case BORRAPANTALLA:
                return 28;
            case CENTRO:
                return 29;
            case COS:
                return 30;
            case CUENTA:
                return 31;
            case DIFERENCIA:
                return 32;
            case DIVISION:
                return 33;
            case ELEGIR:
                return 35;
            case ELEMENTO:
                return 36;
            case ESPERA:
                return 37;
            case GD:
                return 38;
            case GI:
                return 39;
            case GIRADERECHA:
                return 40;
            case GIRAIZQUIERDA:
                return 41;
            case INC:
                return 43;
            case INIC:
                return 44;
            case MENOS:
                return 45;
            case OCULTATORTUGA:
                return 46;
            case OT:
                return 47;
            case PONCL:
                return 49;
            case PONCOLORLAPIZ:
                return 50;
            case PONPOS:
                return 51;
            case PONRUMBO:
                return 52;
            case PONX:
                return 53;
            case PONXY:
                return 54;
            case PONY:
                return 55;
            case POTENCIA:
                return 56;
            case PRIMERO:
                return 57;
            case PRODUCTO:
                return 58;
            case RAIZCUADRADA:
                return 59;
            case RC:
                return 60;
            case RE:
                return 61;
            case REDONDEA:
                return 62;
            case REPITE:
                return 63;
            case RESTO:
                return 64;
            case RETROCEDE:
                return 65;
            case RUMBO:
                return 66;
            case SB:
                return 67;
            case SEN:
                return 68;
            case SENO:
                return 69;
            case SI:
                return 70;
            case SUBELAPIZ:
                return 71;
            case SUMA:
                return 72;
            case UL:
                return 73;
            case ULTIMO:
                return 74;
            case VAR:
                return 75;
            case IDENTIFIER:
                return 238;
        }
        return 777;
    }

    private int yys123() {
        switch (yytok) {
            case ROJO:
            case PARA:
            case error:
            case CIAN:
            case Y:
            case '>':
            case '+':
            case '(':
            case INTEGER:
            case GRIS:
            case ENDINPUT:
            case VERDE:
            case EJECUTA:
            case BLANCO:
            case '=':
            case '-':
            case '*':
            case ')':
            case MAYORQUE:
            case '[':
            case IGUALES:
            case AZUL:
            case FLOAT:
            case AMARILLO:
            case MARRON:
            case '<':
            case O:
            case NEGRO:
            case MENORQUE:
            case '/':
                return 777;
        }
        return yyr150();
    }

    private int yys124() {
        switch (yytok) {
            case ROJO:
            case PARA:
            case error:
            case CIAN:
            case Y:
            case '>':
            case '+':
            case '(':
            case INTEGER:
            case GRIS:
            case ENDINPUT:
            case VERDE:
            case EJECUTA:
            case BLANCO:
            case '=':
            case '-':
            case '*':
            case ')':
            case MAYORQUE:
            case '[':
            case IGUALES:
            case AZUL:
            case FLOAT:
            case AMARILLO:
            case MARRON:
            case '<':
            case O:
            case NEGRO:
            case MENORQUE:
            case '/':
                return 777;
        }
        return yyr123();
    }

    private int yys125() {
        switch (yytok) {
            case ROJO:
            case PARA:
            case error:
            case CIAN:
            case Y:
            case '>':
            case '+':
            case '(':
            case INTEGER:
            case GRIS:
            case ENDINPUT:
            case VERDE:
            case EJECUTA:
            case BLANCO:
            case '=':
            case '-':
            case '*':
            case ')':
            case MAYORQUE:
            case '[':
            case IGUALES:
            case AZUL:
            case FLOAT:
            case AMARILLO:
            case MARRON:
            case '<':
            case O:
            case NEGRO:
            case MENORQUE:
            case '/':
                return 777;
        }
        return yyr119();
    }

    private int yys126() {
        switch (yytok) {
            case ROJO:
            case PARA:
            case error:
            case CIAN:
            case Y:
            case '>':
            case '+':
            case '(':
            case INTEGER:
            case GRIS:
            case ENDINPUT:
            case VERDE:
            case EJECUTA:
            case BLANCO:
            case '=':
            case '-':
            case '*':
            case ')':
            case MAYORQUE:
            case '[':
            case IGUALES:
            case AZUL:
            case FLOAT:
            case AMARILLO:
            case MARRON:
            case '<':
            case O:
            case NEGRO:
            case MENORQUE:
            case '/':
                return 777;
        }
        return yyr118();
    }

    private int yys127() {
        switch (yytok) {
            case ROJO:
            case PARA:
            case error:
            case CIAN:
            case Y:
            case '>':
            case '+':
            case '(':
            case INTEGER:
            case GRIS:
            case ENDINPUT:
            case VERDE:
            case EJECUTA:
            case BLANCO:
            case '=':
            case '-':
            case '*':
            case ')':
            case MAYORQUE:
            case '[':
            case IGUALES:
            case AZUL:
            case FLOAT:
            case AMARILLO:
            case MARRON:
            case '<':
            case O:
            case NEGRO:
            case MENORQUE:
            case '/':
                return 777;
        }
        return yyr121();
    }

    private int yys128() {
        switch (yytok) {
            case ROJO:
            case PARA:
            case error:
            case CIAN:
            case Y:
            case '>':
            case '+':
            case '(':
            case INTEGER:
            case GRIS:
            case ENDINPUT:
            case VERDE:
            case EJECUTA:
            case BLANCO:
            case '=':
            case '-':
            case '*':
            case ')':
            case MAYORQUE:
            case '[':
            case IGUALES:
            case AZUL:
            case FLOAT:
            case AMARILLO:
            case MARRON:
            case '<':
            case O:
            case NEGRO:
            case MENORQUE:
            case '/':
                return 777;
        }
        return yyr122();
    }

    private int yys129() {
        switch (yytok) {
            case ROJO:
            case PARA:
            case error:
            case CIAN:
            case Y:
            case '>':
            case '+':
            case '(':
            case INTEGER:
            case GRIS:
            case ENDINPUT:
            case VERDE:
            case EJECUTA:
            case BLANCO:
            case '=':
            case '-':
            case '*':
            case ')':
            case MAYORQUE:
            case '[':
            case IGUALES:
            case AZUL:
            case FLOAT:
            case AMARILLO:
            case MARRON:
            case '<':
            case O:
            case NEGRO:
            case MENORQUE:
            case '/':
                return 777;
        }
        return yyr120();
    }

    private int yys130() {
        switch (yytok) {
            case ROJO:
            case PARA:
            case error:
            case CIAN:
            case Y:
            case '>':
            case '+':
            case '(':
            case INTEGER:
            case GRIS:
            case ENDINPUT:
            case VERDE:
            case EJECUTA:
            case BLANCO:
            case '=':
            case '-':
            case '*':
            case ')':
            case MAYORQUE:
            case '[':
            case IGUALES:
            case AZUL:
            case FLOAT:
            case AMARILLO:
            case MARRON:
            case '<':
            case O:
            case NEGRO:
            case MENORQUE:
            case '/':
                return 777;
        }
        return yyr124();
    }

    private int yys131() {
        switch (yytok) {
            case ROJO:
            case PARA:
            case error:
            case CIAN:
            case Y:
            case '>':
            case '+':
            case '(':
            case INTEGER:
            case GRIS:
            case ENDINPUT:
            case VERDE:
            case EJECUTA:
            case BLANCO:
            case '=':
            case '-':
            case '*':
            case ')':
            case MAYORQUE:
            case '[':
            case IGUALES:
            case AZUL:
            case FLOAT:
            case AMARILLO:
            case MARRON:
            case '<':
            case O:
            case NEGRO:
            case MENORQUE:
            case '/':
                return 777;
        }
        return yyr125();
    }

    private int yys132() {
        switch (yytok) {
            case ROJO:
            case PARA:
            case error:
            case CIAN:
            case Y:
            case '>':
            case '+':
            case '(':
            case INTEGER:
            case GRIS:
            case ENDINPUT:
            case VERDE:
            case EJECUTA:
            case BLANCO:
            case '=':
            case '-':
            case '*':
            case ')':
            case MAYORQUE:
            case '[':
            case IGUALES:
            case AZUL:
            case FLOAT:
            case AMARILLO:
            case MARRON:
            case '<':
            case O:
            case NEGRO:
            case MENORQUE:
            case '/':
                return 777;
        }
        return yyr126();
    }

    private int yys133() {
        switch (yytok) {
            case ROJO:
            case PARA:
            case error:
            case CIAN:
            case Y:
            case '>':
            case '+':
            case '(':
            case INTEGER:
            case GRIS:
            case ENDINPUT:
            case VERDE:
            case EJECUTA:
            case BLANCO:
            case '=':
            case '-':
            case '*':
            case ')':
            case MAYORQUE:
            case '[':
            case IGUALES:
            case AZUL:
            case FLOAT:
            case AMARILLO:
            case MARRON:
            case '<':
            case O:
            case NEGRO:
            case MENORQUE:
            case '/':
                return 777;
        }
        return yyr149();
    }

    private int yys135() {
        switch (yytok) {
            case ROJO:
            case PARA:
            case error:
            case CIAN:
            case Y:
            case '>':
            case '+':
            case '(':
            case INTEGER:
            case GRIS:
            case ENDINPUT:
            case VERDE:
            case EJECUTA:
            case BLANCO:
            case '=':
            case '-':
            case '*':
            case ')':
            case MAYORQUE:
            case '[':
            case IGUALES:
            case AZUL:
            case FLOAT:
            case AMARILLO:
            case MARRON:
            case '<':
            case O:
            case NEGRO:
            case MENORQUE:
            case '/':
                return 777;
        }
        return yyr146();
    }

    private int yys136() {
        switch (yytok) {
            case ROJO:
            case PARA:
            case error:
            case CIAN:
            case Y:
            case '>':
            case '+':
            case '(':
            case INTEGER:
            case GRIS:
            case ENDINPUT:
            case VERDE:
            case EJECUTA:
            case BLANCO:
            case '=':
            case '-':
            case '*':
            case ')':
            case MAYORQUE:
            case '[':
            case IGUALES:
            case AZUL:
            case FLOAT:
            case AMARILLO:
            case MARRON:
            case '<':
            case O:
            case NEGRO:
            case MENORQUE:
            case '/':
                return 777;
        }
        return yyr147();
    }

    private int yys138() {
        switch (yytok) {
            case ROJO:
            case PARA:
            case error:
            case CIAN:
            case Y:
            case '>':
            case '+':
            case '(':
            case INTEGER:
            case GRIS:
            case ENDINPUT:
            case VERDE:
            case EJECUTA:
            case BLANCO:
            case '=':
            case '-':
            case '*':
            case ')':
            case MAYORQUE:
            case '[':
            case IGUALES:
            case AZUL:
            case FLOAT:
            case AMARILLO:
            case MARRON:
            case '<':
            case O:
            case NEGRO:
            case MENORQUE:
            case '/':
                return 777;
        }
        return yyr148();
    }

    private int yys143() {
        switch (yytok) {
            case FLOAT:
            case BLANCO:
            case Y:
            case AZUL:
            case O:
            case PARA:
            case '+':
            case error:
            case ENDINPUT:
            case CIAN:
            case '[':
            case VERDE:
            case MENORQUE:
            case '>':
            case '=':
            case '-':
            case EJECUTA:
            case '(':
            case '<':
            case INTEGER:
            case ROJO:
            case GRIS:
            case IGUALES:
            case AMARILLO:
            case MARRON:
            case MAYORQUE:
            case NEGRO:
            case '*':
            case '/':
                return 777;
        }
        return yyr181();
    }

    private int yys144() {
        switch (yytok) {
            case FLOAT:
            case BLANCO:
            case Y:
            case AZUL:
            case O:
            case PARA:
            case '+':
            case error:
            case ENDINPUT:
            case CIAN:
            case '[':
            case VERDE:
            case MENORQUE:
            case '>':
            case '=':
            case '-':
            case EJECUTA:
            case '(':
            case '<':
            case INTEGER:
            case ROJO:
            case GRIS:
            case IGUALES:
            case AMARILLO:
            case MARRON:
            case MAYORQUE:
            case NEGRO:
            case '*':
            case '/':
                return 777;
        }
        return yyr180();
    }

    private int yys145() {
        switch (yytok) {
            case FLOAT:
            case BLANCO:
            case Y:
            case AZUL:
            case O:
            case PARA:
            case '+':
            case error:
            case ENDINPUT:
            case CIAN:
            case '[':
            case VERDE:
            case MENORQUE:
            case '>':
            case '=':
            case '-':
            case EJECUTA:
            case '(':
            case '<':
            case INTEGER:
            case ROJO:
            case GRIS:
            case IGUALES:
            case AMARILLO:
            case MARRON:
            case MAYORQUE:
            case NEGRO:
            case '*':
            case '/':
                return 777;
        }
        return yyr179();
    }

    private int yys146() {
        switch (yytok) {
            case FLOAT:
            case BLANCO:
            case Y:
            case AZUL:
            case O:
            case PARA:
            case '+':
            case error:
            case ENDINPUT:
            case CIAN:
            case '[':
            case VERDE:
            case MENORQUE:
            case '>':
            case '=':
            case '-':
            case EJECUTA:
            case '(':
            case '<':
            case INTEGER:
            case ROJO:
            case GRIS:
            case IGUALES:
            case AMARILLO:
            case MARRON:
            case MAYORQUE:
            case NEGRO:
            case '*':
            case '/':
                return 777;
        }
        return yyr158();
    }

    private int yys147() {
        switch (yytok) {
            case FLOAT:
            case BLANCO:
            case Y:
            case AZUL:
            case O:
            case PARA:
            case '+':
            case error:
            case ENDINPUT:
            case CIAN:
            case '[':
            case VERDE:
            case MENORQUE:
            case '>':
            case '=':
            case '-':
            case EJECUTA:
            case '(':
            case '<':
            case INTEGER:
            case ROJO:
            case GRIS:
            case IGUALES:
            case AMARILLO:
            case MARRON:
            case MAYORQUE:
            case NEGRO:
            case '*':
            case '/':
                return 777;
        }
        return yyr159();
    }

    private int yys148() {
        switch (yytok) {
            case ROJO:
            case PARA:
            case error:
            case CIAN:
            case Y:
            case '>':
            case '+':
            case '(':
            case INTEGER:
            case GRIS:
            case ENDINPUT:
            case VERDE:
            case EJECUTA:
            case BLANCO:
            case '=':
            case '-':
            case '*':
            case ')':
            case MAYORQUE:
            case '[':
            case IGUALES:
            case AZUL:
            case FLOAT:
            case AMARILLO:
            case MARRON:
            case '<':
            case O:
            case NEGRO:
            case MENORQUE:
            case '/':
                return 777;
        }
        return yyr141();
    }

    private int yys149() {
        switch (yytok) {
            case FLOAT:
            case BLANCO:
            case Y:
            case AZUL:
            case O:
            case PARA:
            case '+':
            case error:
            case ENDINPUT:
            case CIAN:
            case '[':
            case VERDE:
            case MENORQUE:
            case '>':
            case '=':
            case '-':
            case EJECUTA:
            case '(':
            case '<':
            case INTEGER:
            case ROJO:
            case GRIS:
            case IGUALES:
            case AMARILLO:
            case MARRON:
            case MAYORQUE:
            case NEGRO:
            case '*':
            case '/':
                return 777;
        }
        return yyr152();
    }

    private int yys151() {
        switch (yytok) {
            case BLANCO:
            case MAYORQUE:
            case '[':
            case ENDINPUT:
            case PARA:
            case Y:
            case error:
            case '>':
            case CIAN:
            case AMARILLO:
            case MENORQUE:
            case '=':
            case O:
            case NEGRO:
            case '<':
            case EJECUTA:
            case VERDE:
            case MARRON:
            case IGUALES:
            case GRIS:
            case AZUL:
            case ROJO:
                return 777;
        }
        return yyr84();
    }

    private int yys155() {
        switch (yytok) {
            case ROJO:
            case PARA:
            case error:
            case CIAN:
            case Y:
            case '>':
            case '+':
            case '(':
            case INTEGER:
            case GRIS:
            case ENDINPUT:
            case VERDE:
            case EJECUTA:
            case BLANCO:
            case '=':
            case '-':
            case '*':
            case ')':
            case MAYORQUE:
            case '[':
            case IGUALES:
            case AZUL:
            case FLOAT:
            case AMARILLO:
            case MARRON:
            case '<':
            case O:
            case NEGRO:
            case MENORQUE:
            case '/':
                return 777;
        }
        return yyr140();
    }

    private int yys156() {
        switch (yytok) {
            case FLOAT:
            case BLANCO:
            case Y:
            case AZUL:
            case O:
            case PARA:
            case '+':
            case error:
            case ENDINPUT:
            case CIAN:
            case '[':
            case VERDE:
            case MENORQUE:
            case '>':
            case '=':
            case '-':
            case EJECUTA:
            case '(':
            case '<':
            case INTEGER:
            case ROJO:
            case GRIS:
            case IGUALES:
            case AMARILLO:
            case MARRON:
            case MAYORQUE:
            case NEGRO:
            case '*':
            case '/':
                return 777;
        }
        return yyr161();
    }

    private int yys157() {
        switch (yytok) {
            case FLOAT:
            case BLANCO:
            case Y:
            case AZUL:
            case O:
            case PARA:
            case '+':
            case error:
            case ENDINPUT:
            case CIAN:
            case '[':
            case VERDE:
            case MENORQUE:
            case '>':
            case '=':
            case '-':
            case EJECUTA:
            case '(':
            case '<':
            case INTEGER:
            case ROJO:
            case GRIS:
            case IGUALES:
            case AMARILLO:
            case MARRON:
            case MAYORQUE:
            case NEGRO:
            case '*':
            case '/':
                return 777;
        }
        return yyr160();
    }

    private int yys159() {
        switch (yytok) {
            case '*':
                return 198;
            case '+':
                return 199;
            case '-':
                return 200;
            case '/':
                return 201;
            case '<':
                return 253;
            case '>':
                return 254;
        }
        return 777;
    }

    private int yys160() {
        switch (yytok) {
            case '*':
                return 206;
            case '+':
                return 207;
            case '-':
                return 208;
            case '/':
                return 209;
            case '<':
                return 255;
            case '>':
                return 256;
        }
        return 777;
    }

    private int yys164() {
        switch (yytok) {
            case INTEGER:
                return 84;
            case FLOAT:
                return 95;
            case IGUALES:
                return 161;
            case MAYORQUE:
                return 162;
            case MENORQUE:
                return 163;
            case O:
                return 164;
            case Y:
                return 165;
            case '(':
                return 166;
        }
        return 777;
    }

    private int yys165() {
        switch (yytok) {
            case INTEGER:
                return 84;
            case FLOAT:
                return 95;
            case IGUALES:
                return 161;
            case MAYORQUE:
                return 162;
            case MENORQUE:
                return 163;
            case O:
                return 164;
            case Y:
                return 165;
            case '(':
                return 166;
        }
        return 777;
    }

    private int yys167() {
        switch (yytok) {
            case FLOAT:
            case BLANCO:
            case Y:
            case AZUL:
            case O:
            case PARA:
            case '+':
            case error:
            case ENDINPUT:
            case CIAN:
            case '[':
            case VERDE:
            case MENORQUE:
            case '>':
            case '=':
            case '-':
            case EJECUTA:
            case '(':
            case '<':
            case INTEGER:
            case ROJO:
            case GRIS:
            case IGUALES:
            case AMARILLO:
            case MARRON:
            case MAYORQUE:
            case NEGRO:
            case '*':
            case '/':
                return 777;
        }
        return yyr184();
    }

    private int yys168() {
        switch (yytok) {
            case FLOAT:
            case BLANCO:
            case Y:
            case AZUL:
            case O:
            case PARA:
            case '+':
            case error:
            case ENDINPUT:
            case CIAN:
            case '[':
            case VERDE:
            case MENORQUE:
            case '>':
            case '=':
            case '-':
            case EJECUTA:
            case '(':
            case '<':
            case INTEGER:
            case ROJO:
            case GRIS:
            case IGUALES:
            case AMARILLO:
            case MARRON:
            case MAYORQUE:
            case NEGRO:
            case '*':
            case '/':
                return 777;
        }
        return yyr183();
    }

    private int yys169() {
        switch (yytok) {
            case FLOAT:
            case BLANCO:
            case Y:
            case AZUL:
            case O:
            case PARA:
            case '+':
            case error:
            case ENDINPUT:
            case CIAN:
            case '[':
            case VERDE:
            case MENORQUE:
            case '>':
            case '=':
            case '-':
            case EJECUTA:
            case '(':
            case '<':
            case INTEGER:
            case ROJO:
            case GRIS:
            case IGUALES:
            case AMARILLO:
            case MARRON:
            case MAYORQUE:
            case NEGRO:
            case '*':
            case '/':
                return 777;
        }
        return yyr182();
    }

    private int yys172() {
        switch (yytok) {
            case '/':
            case PARA:
            case ROJO:
            case CIAN:
            case Y:
            case '>':
            case error:
            case '(':
            case INTEGER:
            case GRIS:
            case ENDINPUT:
            case VERDE:
            case EJECUTA:
            case BLANCO:
            case '+':
            case '-':
            case '*':
            case ')':
            case MAYORQUE:
            case '[':
            case IGUALES:
            case AZUL:
            case FLOAT:
            case AMARILLO:
            case MARRON:
            case '<':
            case O:
            case NEGRO:
            case MENORQUE:
                return 777;
            case '=':
                return 271;
        }
        return yyr115();
    }

    private int yys222() {
        switch (yytok) {
            case O:
            case PARA:
            case MENORQUE:
            case NEGRO:
            case VERDE:
            case '=':
            case GRIS:
            case Y:
            case ENDINPUT:
            case '/':
            case AMARILLO:
            case MAYORQUE:
            case EJECUTA:
            case BLANCO:
            case '+':
            case '-':
            case error:
            case '*':
            case '<':
            case '>':
            case ROJO:
            case CIAN:
            case AZUL:
            case IGUALES:
            case '[':
            case MARRON:
                return 777;
            case IDENTIFIER:
                return 83;
            case INTEGER:
                return 84;
            case FLOAT:
                return 95;
            case '(':
                return 152;
        }
        return yyr173();
    }

    private int yys223() {
        switch (yytok) {
            case FLOAT:
            case BLANCO:
            case Y:
            case AZUL:
            case O:
            case PARA:
            case '+':
            case error:
            case ENDINPUT:
            case CIAN:
            case '[':
            case VERDE:
            case MENORQUE:
            case '>':
            case '=':
            case '-':
            case EJECUTA:
            case '(':
            case '<':
            case INTEGER:
            case ROJO:
            case GRIS:
            case IGUALES:
            case AMARILLO:
            case MARRON:
            case MAYORQUE:
            case NEGRO:
            case '*':
            case '/':
                return 777;
        }
        return yyr172();
    }

    private int yys224() {
        switch (yytok) {
            case NEGRO:
            case PARA:
            case '/':
            case MENORQUE:
            case VERDE:
            case '=':
            case AZUL:
            case Y:
            case ENDINPUT:
            case CIAN:
            case AMARILLO:
            case MAYORQUE:
            case EJECUTA:
            case BLANCO:
            case '+':
            case '-':
            case error:
            case '*':
            case '<':
            case '>':
            case ROJO:
            case GRIS:
            case FLOAT:
            case IGUALES:
            case '[':
            case MARRON:
            case O:
                return 777;
            case IDENTIFIER:
                return 83;
            case INTEGER:
                return 84;
            case '(':
                return 85;
        }
        return yyr171();
    }

    private int yys225() {
        switch (yytok) {
            case FLOAT:
            case BLANCO:
            case Y:
            case AZUL:
            case O:
            case PARA:
            case '+':
            case error:
            case ENDINPUT:
            case CIAN:
            case '[':
            case VERDE:
            case MENORQUE:
            case '>':
            case '=':
            case '-':
            case EJECUTA:
            case '(':
            case '<':
            case INTEGER:
            case ROJO:
            case GRIS:
            case IGUALES:
            case AMARILLO:
            case MARRON:
            case MAYORQUE:
            case NEGRO:
            case '*':
            case '/':
                return 777;
        }
        return yyr170();
    }

    private int yys226() {
        switch (yytok) {
            case FLOAT:
            case BLANCO:
            case Y:
            case AZUL:
            case O:
            case PARA:
            case '+':
            case error:
            case ENDINPUT:
            case CIAN:
            case '[':
            case VERDE:
            case MENORQUE:
            case '>':
            case '=':
            case '-':
            case EJECUTA:
            case '(':
            case '<':
            case INTEGER:
            case ROJO:
            case GRIS:
            case IGUALES:
            case AMARILLO:
            case MARRON:
            case MAYORQUE:
            case NEGRO:
            case '*':
            case '/':
                return 777;
        }
        return yyr168();
    }

    private int yys227() {
        switch (yytok) {
            case FLOAT:
            case BLANCO:
            case Y:
            case AZUL:
            case O:
            case PARA:
            case '+':
            case error:
            case ENDINPUT:
            case CIAN:
            case '[':
            case VERDE:
            case MENORQUE:
            case '>':
            case '=':
            case '-':
            case EJECUTA:
            case '(':
            case '<':
            case INTEGER:
            case ROJO:
            case GRIS:
            case IGUALES:
            case AMARILLO:
            case MARRON:
            case MAYORQUE:
            case NEGRO:
            case '*':
            case '/':
                return 777;
        }
        return yyr167();
    }

    private int yys229() {
        switch (yytok) {
            case APARECETORTUGA:
                return 21;
            case AT:
                return 22;
            case AV:
                return 23;
            case AVANZA:
                return 24;
            case AZAR:
                return 25;
            case BAJALAPIZ:
                return 26;
            case BL:
                return 27;
            case BORRAPANTALLA:
                return 28;
            case CENTRO:
                return 29;
            case COS:
                return 30;
            case CUENTA:
                return 31;
            case DIFERENCIA:
                return 32;
            case DIVISION:
                return 33;
            case ELEGIR:
                return 35;
            case ELEMENTO:
                return 36;
            case ESPERA:
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
            case INC:
                return 43;
            case INIC:
                return 44;
            case MENOS:
                return 45;
            case OCULTATORTUGA:
                return 46;
            case OT:
                return 47;
            case PONCL:
                return 49;
            case PONCOLORLAPIZ:
                return 50;
            case PONPOS:
                return 51;
            case PONRUMBO:
                return 52;
            case PONX:
                return 53;
            case PONXY:
                return 54;
            case PONY:
                return 55;
            case POTENCIA:
                return 56;
            case PRIMERO:
                return 57;
            case PRODUCTO:
                return 58;
            case RAIZCUADRADA:
                return 59;
            case RC:
                return 60;
            case RE:
                return 61;
            case REDONDEA:
                return 62;
            case REPITE:
                return 63;
            case RESTO:
                return 64;
            case RETROCEDE:
                return 65;
            case RUMBO:
                return 66;
            case SB:
                return 67;
            case SEN:
                return 68;
            case SENO:
                return 69;
            case SI:
                return 70;
            case SUBELAPIZ:
                return 71;
            case SUMA:
                return 72;
            case UL:
                return 73;
            case ULTIMO:
                return 74;
            case VAR:
                return 75;
            case ']':
                return yyr200();
        }
        return 777;
    }

    private int yys235() {
        switch (yytok) {
            case APARECETORTUGA:
                return 21;
            case AT:
                return 22;
            case AV:
                return 23;
            case AVANZA:
                return 24;
            case AZAR:
                return 25;
            case BAJALAPIZ:
                return 26;
            case BL:
                return 27;
            case BORRAPANTALLA:
                return 28;
            case CENTRO:
                return 29;
            case COS:
                return 30;
            case CUENTA:
                return 31;
            case DIFERENCIA:
                return 32;
            case DIVISION:
                return 33;
            case ELEGIR:
                return 35;
            case ELEMENTO:
                return 36;
            case ESPERA:
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
            case INC:
                return 43;
            case INIC:
                return 44;
            case MENOS:
                return 45;
            case OCULTATORTUGA:
                return 46;
            case OT:
                return 47;
            case PONCL:
                return 49;
            case PONCOLORLAPIZ:
                return 50;
            case PONPOS:
                return 51;
            case PONRUMBO:
                return 52;
            case PONX:
                return 53;
            case PONXY:
                return 54;
            case PONY:
                return 55;
            case POTENCIA:
                return 56;
            case PRIMERO:
                return 57;
            case PRODUCTO:
                return 58;
            case RAIZCUADRADA:
                return 59;
            case RC:
                return 60;
            case RE:
                return 61;
            case REDONDEA:
                return 62;
            case REPITE:
                return 63;
            case RESTO:
                return 64;
            case RETROCEDE:
                return 65;
            case RUMBO:
                return 66;
            case SB:
                return 67;
            case SEN:
                return 68;
            case SENO:
                return 69;
            case SI:
                return 70;
            case SUBELAPIZ:
                return 71;
            case SUMA:
                return 72;
            case UL:
                return 73;
            case ULTIMO:
                return 74;
            case VAR:
                return 75;
            case FIN:
            case ']':
                return yyr175();
        }
        return 777;
    }

    private int yys237() {
        switch (yytok) {
            case APARECETORTUGA:
                return 21;
            case AT:
                return 22;
            case AV:
                return 23;
            case AVANZA:
                return 24;
            case AZAR:
                return 25;
            case BAJALAPIZ:
                return 26;
            case BL:
                return 27;
            case BORRAPANTALLA:
                return 28;
            case CENTRO:
                return 29;
            case COS:
                return 30;
            case CUENTA:
                return 31;
            case DIFERENCIA:
                return 32;
            case DIVISION:
                return 33;
            case ELEGIR:
                return 35;
            case ELEMENTO:
                return 36;
            case ESPERA:
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
            case INC:
                return 43;
            case INIC:
                return 44;
            case MENOS:
                return 45;
            case OCULTATORTUGA:
                return 46;
            case OT:
                return 47;
            case PONCL:
                return 49;
            case PONCOLORLAPIZ:
                return 50;
            case PONPOS:
                return 51;
            case PONRUMBO:
                return 52;
            case PONX:
                return 53;
            case PONXY:
                return 54;
            case PONY:
                return 55;
            case POTENCIA:
                return 56;
            case PRIMERO:
                return 57;
            case PRODUCTO:
                return 58;
            case RAIZCUADRADA:
                return 59;
            case RC:
                return 60;
            case RE:
                return 61;
            case REDONDEA:
                return 62;
            case REPITE:
                return 63;
            case RESTO:
                return 64;
            case RETROCEDE:
                return 65;
            case RUMBO:
                return 66;
            case SB:
                return 67;
            case SEN:
                return 68;
            case SENO:
                return 69;
            case SI:
                return 70;
            case SUBELAPIZ:
                return 71;
            case SUMA:
                return 72;
            case UL:
                return 73;
            case ULTIMO:
                return 74;
            case VAR:
                return 75;
        }
        return 777;
    }

    private int yys238() {
        switch (yytok) {
            case NEGRO:
            case '/':
            case ']':
            case '=':
            case MAYORQUE:
            case MENORQUE:
            case ';':
            case error:
            case MARRON:
            case AZUL:
            case AMARILLO:
            case '[':
            case BLANCO:
            case '*':
            case '+':
            case '-':
            case EJECUTA:
            case ')':
            case VERDE:
            case '<':
            case ENDINPUT:
            case ROJO:
            case CIAN:
            case GRIS:
            case IGUALES:
            case '>':
            case PARA:
            case Y:
            case O:
                return 777;
            case INTEGER:
                return 84;
            case FLOAT:
                return 95;
            case '(':
                return 100;
            case IDENTIFIER:
                return 344;
            case FIN:
                return yyr209();
        }
        return yyr205();
    }

    private int yys240() {
        switch (yytok) {
            case ROJO:
            case PARA:
            case error:
            case CIAN:
            case Y:
            case '>':
            case '+':
            case '(':
            case INTEGER:
            case GRIS:
            case ENDINPUT:
            case VERDE:
            case EJECUTA:
            case BLANCO:
            case '=':
            case '-':
            case '*':
            case ')':
            case MAYORQUE:
            case '[':
            case IGUALES:
            case AZUL:
            case FLOAT:
            case AMARILLO:
            case MARRON:
            case '<':
            case O:
            case NEGRO:
            case MENORQUE:
            case '/':
                return 777;
        }
        return yyr162();
    }

    private int yys241() {
        switch (yytok) {
            case FLOAT:
            case BLANCO:
            case Y:
            case AZUL:
            case O:
            case PARA:
            case '+':
            case error:
            case ENDINPUT:
            case CIAN:
            case '[':
            case VERDE:
            case MENORQUE:
            case '>':
            case '=':
            case '-':
            case EJECUTA:
            case '(':
            case '<':
            case INTEGER:
            case ROJO:
            case GRIS:
            case IGUALES:
            case AMARILLO:
            case MARRON:
            case MAYORQUE:
            case NEGRO:
            case '*':
            case '/':
                return 777;
        }
        return yyr164();
    }

    private int yys242() {
        switch (yytok) {
            case FLOAT:
            case BLANCO:
            case Y:
            case AZUL:
            case O:
            case PARA:
            case '+':
            case error:
            case ENDINPUT:
            case CIAN:
            case '[':
            case VERDE:
            case MENORQUE:
            case '>':
            case '=':
            case '-':
            case EJECUTA:
            case '(':
            case '<':
            case INTEGER:
            case ROJO:
            case GRIS:
            case IGUALES:
            case AMARILLO:
            case MARRON:
            case MAYORQUE:
            case NEGRO:
            case '*':
            case '/':
                return 777;
        }
        return yyr163();
    }

    private int yys243() {
        switch (yytok) {
            case FLOAT:
            case BLANCO:
            case Y:
            case AZUL:
            case O:
            case PARA:
            case '+':
            case error:
            case ENDINPUT:
            case CIAN:
            case '[':
            case VERDE:
            case MENORQUE:
            case '>':
            case '=':
            case '-':
            case EJECUTA:
            case '(':
            case '<':
            case INTEGER:
            case ROJO:
            case GRIS:
            case IGUALES:
            case AMARILLO:
            case MARRON:
            case MAYORQUE:
            case NEGRO:
            case '*':
            case '/':
                return 777;
        }
        return yyr165();
    }

    private int yys250() {
        switch (yytok) {
            case APARECETORTUGA:
                return 21;
            case AT:
                return 22;
            case AV:
                return 23;
            case AVANZA:
                return 24;
            case AZAR:
                return 25;
            case BAJALAPIZ:
                return 26;
            case BL:
                return 27;
            case BORRAPANTALLA:
                return 28;
            case CENTRO:
                return 29;
            case COS:
                return 30;
            case CUENTA:
                return 31;
            case DIFERENCIA:
                return 32;
            case DIVISION:
                return 33;
            case ELEGIR:
                return 35;
            case ELEMENTO:
                return 36;
            case ESPERA:
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
            case INC:
                return 43;
            case INIC:
                return 44;
            case MENOS:
                return 45;
            case OCULTATORTUGA:
                return 46;
            case OT:
                return 47;
            case PONCL:
                return 49;
            case PONCOLORLAPIZ:
                return 50;
            case PONPOS:
                return 51;
            case PONRUMBO:
                return 52;
            case PONX:
                return 53;
            case PONXY:
                return 54;
            case PONY:
                return 55;
            case POTENCIA:
                return 56;
            case PRIMERO:
                return 57;
            case PRODUCTO:
                return 58;
            case RAIZCUADRADA:
                return 59;
            case RC:
                return 60;
            case RE:
                return 61;
            case REDONDEA:
                return 62;
            case REPITE:
                return 63;
            case RESTO:
                return 64;
            case RETROCEDE:
                return 65;
            case RUMBO:
                return 66;
            case SB:
                return 67;
            case SEN:
                return 68;
            case SENO:
                return 69;
            case SI:
                return 70;
            case SUBELAPIZ:
                return 71;
            case SUMA:
                return 72;
            case UL:
                return 73;
            case ULTIMO:
                return 74;
            case VAR:
                return 75;
        }
        return 777;
    }

    private int yys251() {
        switch (yytok) {
            case FLOAT:
            case BLANCO:
            case Y:
            case AZUL:
            case O:
            case PARA:
            case '+':
            case error:
            case ENDINPUT:
            case CIAN:
            case '[':
            case VERDE:
            case MENORQUE:
            case '>':
            case '=':
            case '-':
            case EJECUTA:
            case '(':
            case '<':
            case INTEGER:
            case ROJO:
            case GRIS:
            case IGUALES:
            case AMARILLO:
            case MARRON:
            case MAYORQUE:
            case NEGRO:
            case '*':
            case '/':
                return 777;
        }
        return yyr166();
    }

    private int yys252() {
        switch (yytok) {
            case APARECETORTUGA:
                return 21;
            case AT:
                return 22;
            case AV:
                return 23;
            case AVANZA:
                return 24;
            case AZAR:
                return 25;
            case BAJALAPIZ:
                return 26;
            case BL:
                return 27;
            case BORRAPANTALLA:
                return 28;
            case CENTRO:
                return 29;
            case COS:
                return 30;
            case CUENTA:
                return 31;
            case DIFERENCIA:
                return 32;
            case DIVISION:
                return 33;
            case ELEGIR:
                return 35;
            case ELEMENTO:
                return 36;
            case ESPERA:
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
            case INC:
                return 43;
            case INIC:
                return 44;
            case MENOS:
                return 45;
            case OCULTATORTUGA:
                return 46;
            case OT:
                return 47;
            case PONCL:
                return 49;
            case PONCOLORLAPIZ:
                return 50;
            case PONPOS:
                return 51;
            case PONRUMBO:
                return 52;
            case PONX:
                return 53;
            case PONXY:
                return 54;
            case PONY:
                return 55;
            case POTENCIA:
                return 56;
            case PRIMERO:
                return 57;
            case PRODUCTO:
                return 58;
            case RAIZCUADRADA:
                return 59;
            case RC:
                return 60;
            case RE:
                return 61;
            case REDONDEA:
                return 62;
            case REPITE:
                return 63;
            case RESTO:
                return 64;
            case RETROCEDE:
                return 65;
            case RUMBO:
                return 66;
            case SB:
                return 67;
            case SEN:
                return 68;
            case SENO:
                return 69;
            case SI:
                return 70;
            case SUBELAPIZ:
                return 71;
            case SUMA:
                return 72;
            case UL:
                return 73;
            case ULTIMO:
                return 74;
            case VAR:
                return 75;
        }
        return 777;
    }

    private int yys257() {
        switch (yytok) {
            case INTEGER:
                return 84;
            case FLOAT:
                return 95;
            case '(':
                return 166;
            case '*':
                return 198;
            case '+':
                return 199;
            case '-':
                return 200;
            case '/':
                return 201;
        }
        return 777;
    }

    private int yys258() {
        switch (yytok) {
            case INTEGER:
                return 84;
            case FLOAT:
                return 95;
            case '(':
                return 166;
            case '*':
                return 206;
            case '+':
                return 207;
            case '-':
                return 208;
            case '/':
                return 209;
        }
        return 777;
    }

    private int yys259() {
        switch (yytok) {
            case INTEGER:
                return 84;
            case FLOAT:
                return 95;
            case '(':
                return 166;
            case '*':
                return 198;
            case '+':
                return 199;
            case '-':
                return 200;
            case '/':
                return 201;
        }
        return 777;
    }

    private int yys260() {
        switch (yytok) {
            case INTEGER:
                return 84;
            case FLOAT:
                return 95;
            case '(':
                return 166;
            case '*':
                return 206;
            case '+':
                return 207;
            case '-':
                return 208;
            case '/':
                return 209;
        }
        return 777;
    }

    private int yys261() {
        switch (yytok) {
            case INTEGER:
                return 84;
            case FLOAT:
                return 95;
            case '(':
                return 166;
            case '*':
                return 198;
            case '+':
                return 199;
            case '-':
                return 200;
            case '/':
                return 201;
        }
        return 777;
    }

    private int yys262() {
        switch (yytok) {
            case INTEGER:
                return 84;
            case FLOAT:
                return 95;
            case '(':
                return 166;
            case '*':
                return 206;
            case '+':
                return 207;
            case '-':
                return 208;
            case '/':
                return 209;
        }
        return 777;
    }

    private int yys263() {
        switch (yytok) {
            case INTEGER:
                return 84;
            case FLOAT:
                return 95;
            case IGUALES:
                return 161;
            case MAYORQUE:
                return 162;
            case MENORQUE:
                return 163;
            case O:
                return 164;
            case Y:
                return 165;
            case '(':
                return 166;
        }
        return 777;
    }

    private int yys264() {
        switch (yytok) {
            case INTEGER:
                return 84;
            case FLOAT:
                return 95;
            case IGUALES:
                return 161;
            case MAYORQUE:
                return 162;
            case MENORQUE:
                return 163;
            case O:
                return 164;
            case Y:
                return 165;
            case '(':
                return 166;
        }
        return 777;
    }

    private int yys272() {
        switch (yytok) {
            case O:
            case IGUALES:
            case ENDINPUT:
            case MARRON:
            case '<':
            case VERDE:
            case Y:
            case '>':
            case GRIS:
            case AMARILLO:
            case EJECUTA:
            case PARA:
            case NEGRO:
            case MENORQUE:
            case BLANCO:
            case error:
            case MAYORQUE:
            case '=':
            case ROJO:
            case CIAN:
            case AZUL:
                return 777;
        }
        return yyr39();
    }

    private int yys273() {
        switch (yytok) {
            case ROJO:
            case VERDE:
            case MAYORQUE:
            case ENDINPUT:
            case '<':
            case MENORQUE:
            case '>':
            case MARRON:
            case GRIS:
            case IGUALES:
            case error:
            case EJECUTA:
            case PARA:
            case NEGRO:
            case BLANCO:
            case '=':
            case Y:
            case O:
            case AMARILLO:
            case AZUL:
            case CIAN:
                return 777;
            case '*':
                return 179;
            case '/':
                return 182;
        }
        return yyr33();
    }

    private int yys274() {
        switch (yytok) {
            case ROJO:
            case VERDE:
            case MAYORQUE:
            case ENDINPUT:
            case '<':
            case MENORQUE:
            case '>':
            case MARRON:
            case GRIS:
            case IGUALES:
            case error:
            case EJECUTA:
            case PARA:
            case NEGRO:
            case BLANCO:
            case '=':
            case Y:
            case O:
            case AMARILLO:
            case AZUL:
            case CIAN:
                return 777;
            case '*':
                return 179;
            case '/':
                return 182;
        }
        return yyr36();
    }

    private int yys275() {
        switch (yytok) {
            case O:
            case IGUALES:
            case ENDINPUT:
            case MARRON:
            case '<':
            case VERDE:
            case Y:
            case '>':
            case GRIS:
            case AMARILLO:
            case EJECUTA:
            case PARA:
            case NEGRO:
            case MENORQUE:
            case BLANCO:
            case error:
            case MAYORQUE:
            case '=':
            case ROJO:
            case CIAN:
            case AZUL:
                return 777;
        }
        return yyr42();
    }

    private int yys276() {
        switch (yytok) {
            case O:
            case IGUALES:
            case ENDINPUT:
            case MARRON:
            case '<':
            case VERDE:
            case Y:
            case '>':
            case GRIS:
            case AMARILLO:
            case EJECUTA:
            case PARA:
            case NEGRO:
            case MENORQUE:
            case BLANCO:
            case error:
            case MAYORQUE:
            case '=':
            case ROJO:
            case CIAN:
            case AZUL:
                return 777;
        }
        return yyr38();
    }

    private int yys277() {
        switch (yytok) {
            case O:
            case IGUALES:
            case ENDINPUT:
            case MARRON:
            case '<':
            case VERDE:
            case Y:
            case '>':
            case GRIS:
            case AMARILLO:
            case EJECUTA:
            case PARA:
            case NEGRO:
            case MENORQUE:
            case BLANCO:
            case error:
            case MAYORQUE:
            case '=':
            case ROJO:
            case CIAN:
            case AZUL:
                return 777;
        }
        return yyr40();
    }

    private int yys278() {
        switch (yytok) {
            case ROJO:
            case VERDE:
            case MAYORQUE:
            case ENDINPUT:
            case '<':
            case MENORQUE:
            case '>':
            case MARRON:
            case GRIS:
            case IGUALES:
            case error:
            case EJECUTA:
            case PARA:
            case NEGRO:
            case BLANCO:
            case '=':
            case Y:
            case O:
            case AMARILLO:
            case AZUL:
            case CIAN:
                return 777;
            case '*':
                return 175;
            case '/':
                return 178;
        }
        return yyr32();
    }

    private int yys279() {
        switch (yytok) {
            case ROJO:
            case VERDE:
            case MAYORQUE:
            case ENDINPUT:
            case '<':
            case MENORQUE:
            case '>':
            case MARRON:
            case GRIS:
            case IGUALES:
            case error:
            case EJECUTA:
            case PARA:
            case NEGRO:
            case BLANCO:
            case '=':
            case Y:
            case O:
            case AMARILLO:
            case AZUL:
            case CIAN:
                return 777;
            case '*':
                return 179;
            case '/':
                return 182;
        }
        return yyr34();
    }

    private int yys280() {
        switch (yytok) {
            case ROJO:
            case VERDE:
            case MAYORQUE:
            case ENDINPUT:
            case '<':
            case MENORQUE:
            case '>':
            case MARRON:
            case GRIS:
            case IGUALES:
            case error:
            case EJECUTA:
            case PARA:
            case NEGRO:
            case BLANCO:
            case '=':
            case Y:
            case O:
            case AMARILLO:
            case AZUL:
            case CIAN:
                return 777;
            case '*':
                return 175;
            case '/':
                return 178;
        }
        return yyr35();
    }

    private int yys281() {
        switch (yytok) {
            case ROJO:
            case VERDE:
            case MAYORQUE:
            case ENDINPUT:
            case '<':
            case MENORQUE:
            case '>':
            case MARRON:
            case GRIS:
            case IGUALES:
            case error:
            case EJECUTA:
            case PARA:
            case NEGRO:
            case BLANCO:
            case '=':
            case Y:
            case O:
            case AMARILLO:
            case AZUL:
            case CIAN:
                return 777;
            case '*':
                return 179;
            case '/':
                return 182;
        }
        return yyr37();
    }

    private int yys282() {
        switch (yytok) {
            case O:
            case IGUALES:
            case ENDINPUT:
            case MARRON:
            case '<':
            case VERDE:
            case Y:
            case '>':
            case GRIS:
            case AMARILLO:
            case EJECUTA:
            case PARA:
            case NEGRO:
            case MENORQUE:
            case BLANCO:
            case error:
            case MAYORQUE:
            case '=':
            case ROJO:
            case CIAN:
            case AZUL:
                return 777;
        }
        return yyr41();
    }

    private int yys283() {
        switch (yytok) {
            case O:
            case IGUALES:
            case ENDINPUT:
            case MARRON:
            case '<':
            case VERDE:
            case Y:
            case '>':
            case GRIS:
            case AMARILLO:
            case EJECUTA:
            case PARA:
            case NEGRO:
            case MENORQUE:
            case BLANCO:
            case error:
            case MAYORQUE:
            case '=':
            case ROJO:
            case CIAN:
            case AZUL:
                return 777;
        }
        return yyr43();
    }

    private int yys284() {
        switch (yytok) {
            case O:
            case IGUALES:
            case ENDINPUT:
            case MARRON:
            case '<':
            case VERDE:
            case Y:
            case '>':
            case GRIS:
            case AMARILLO:
            case EJECUTA:
            case PARA:
            case NEGRO:
            case MENORQUE:
            case BLANCO:
            case error:
            case MAYORQUE:
            case '=':
            case ROJO:
            case CIAN:
            case AZUL:
                return 777;
        }
        return yyr28();
    }

    private int yys286() {
        switch (yytok) {
            case ROJO:
            case VERDE:
            case MAYORQUE:
            case ENDINPUT:
            case '<':
            case MENORQUE:
            case '>':
            case MARRON:
            case GRIS:
            case IGUALES:
            case error:
            case EJECUTA:
            case PARA:
            case NEGRO:
            case BLANCO:
            case '=':
            case Y:
            case O:
            case AMARILLO:
            case AZUL:
            case CIAN:
                return 777;
            case '*':
                return 183;
            case '/':
                return 186;
        }
        return yyr26();
    }

    private int yys287() {
        switch (yytok) {
            case ROJO:
            case VERDE:
            case MAYORQUE:
            case ENDINPUT:
            case '<':
            case MENORQUE:
            case '>':
            case MARRON:
            case GRIS:
            case IGUALES:
            case error:
            case EJECUTA:
            case PARA:
            case NEGRO:
            case BLANCO:
            case '=':
            case Y:
            case O:
            case AMARILLO:
            case AZUL:
            case CIAN:
                return 777;
            case '*':
                return 183;
            case '/':
                return 186;
        }
        return yyr27();
    }

    private int yys288() {
        switch (yytok) {
            case O:
            case IGUALES:
            case ENDINPUT:
            case MARRON:
            case '<':
            case VERDE:
            case Y:
            case '>':
            case GRIS:
            case AMARILLO:
            case EJECUTA:
            case PARA:
            case NEGRO:
            case MENORQUE:
            case BLANCO:
            case error:
            case MAYORQUE:
            case '=':
            case ROJO:
            case CIAN:
            case AZUL:
                return 777;
        }
        return yyr29();
    }

    private int yys289() {
        switch (yytok) {
            case O:
            case IGUALES:
            case ENDINPUT:
            case MARRON:
            case '<':
            case VERDE:
            case Y:
            case '>':
            case GRIS:
            case AMARILLO:
            case EJECUTA:
            case PARA:
            case NEGRO:
            case MENORQUE:
            case BLANCO:
            case error:
            case MAYORQUE:
            case '=':
            case ROJO:
            case CIAN:
            case AZUL:
                return 777;
        }
        return yyr44();
    }

    private int yys290() {
        switch (yytok) {
            case VERDE:
            case error:
            case AZUL:
            case PARA:
            case ROJO:
            case MARRON:
            case BLANCO:
            case CIAN:
            case '=':
            case NEGRO:
            case EJECUTA:
            case ENDINPUT:
            case GRIS:
            case AMARILLO:
                return 777;
        }
        return yyr30();
    }

    private int yys291() {
        switch (yytok) {
            case BLANCO:
            case MAYORQUE:
            case '[':
            case ENDINPUT:
            case PARA:
            case Y:
            case error:
            case '>':
            case CIAN:
            case AMARILLO:
            case MENORQUE:
            case '=':
            case O:
            case NEGRO:
            case '<':
            case EJECUTA:
            case VERDE:
            case MARRON:
            case IGUALES:
            case GRIS:
            case AZUL:
            case ROJO:
                return 777;
        }
        return yyr75();
    }

    private int yys292() {
        switch (yytok) {
            case '>':
            case EJECUTA:
            case VERDE:
            case AMARILLO:
            case NEGRO:
            case MENORQUE:
            case '[':
            case BLANCO:
            case AZUL:
            case IGUALES:
            case Y:
            case O:
            case PARA:
            case '=':
            case '<':
            case MARRON:
            case error:
            case MAYORQUE:
            case ENDINPUT:
            case ROJO:
            case CIAN:
            case GRIS:
                return 777;
            case '*':
                return 194;
            case '/':
                return 197;
        }
        return yyr65();
    }

    private int yys293() {
        switch (yytok) {
            case '>':
            case EJECUTA:
            case VERDE:
            case AMARILLO:
            case NEGRO:
            case MENORQUE:
            case '[':
            case BLANCO:
            case AZUL:
            case IGUALES:
            case Y:
            case O:
            case PARA:
            case '=':
            case '<':
            case MARRON:
            case error:
            case MAYORQUE:
            case ENDINPUT:
            case ROJO:
            case CIAN:
            case GRIS:
                return 777;
            case '*':
                return 194;
            case '/':
                return 197;
        }
        return yyr70();
    }

    private int yys294() {
        switch (yytok) {
            case BLANCO:
            case MAYORQUE:
            case '[':
            case ENDINPUT:
            case PARA:
            case Y:
            case error:
            case '>':
            case CIAN:
            case AMARILLO:
            case MENORQUE:
            case '=':
            case O:
            case NEGRO:
            case '<':
            case EJECUTA:
            case VERDE:
            case MARRON:
            case IGUALES:
            case GRIS:
            case AZUL:
            case ROJO:
                return 777;
        }
        return yyr80();
    }

    private int yys295() {
        switch (yytok) {
            case BLANCO:
            case MAYORQUE:
            case '[':
            case ENDINPUT:
            case PARA:
            case Y:
            case error:
            case '>':
            case CIAN:
            case AMARILLO:
            case MENORQUE:
            case '=':
            case O:
            case NEGRO:
            case '<':
            case EJECUTA:
            case VERDE:
            case MARRON:
            case IGUALES:
            case GRIS:
            case AZUL:
            case ROJO:
                return 777;
        }
        return yyr73();
    }

    private int yys296() {
        switch (yytok) {
            case BLANCO:
            case MAYORQUE:
            case '[':
            case ENDINPUT:
            case PARA:
            case Y:
            case error:
            case '>':
            case CIAN:
            case AMARILLO:
            case MENORQUE:
            case '=':
            case O:
            case NEGRO:
            case '<':
            case EJECUTA:
            case VERDE:
            case MARRON:
            case IGUALES:
            case GRIS:
            case AZUL:
            case ROJO:
                return 777;
        }
        return yyr77();
    }

    private int yys297() {
        switch (yytok) {
            case BLANCO:
            case MAYORQUE:
            case '[':
            case ENDINPUT:
            case PARA:
            case Y:
            case error:
            case '>':
            case CIAN:
            case AMARILLO:
            case MENORQUE:
            case '=':
            case O:
            case NEGRO:
            case '<':
            case EJECUTA:
            case VERDE:
            case MARRON:
            case IGUALES:
            case GRIS:
            case AZUL:
            case ROJO:
                return 777;
        }
        return yyr74();
    }

    private int yys298() {
        switch (yytok) {
            case '>':
            case EJECUTA:
            case VERDE:
            case AMARILLO:
            case NEGRO:
            case MENORQUE:
            case '[':
            case BLANCO:
            case AZUL:
            case IGUALES:
            case Y:
            case O:
            case PARA:
            case '=':
            case '<':
            case MARRON:
            case error:
            case MAYORQUE:
            case ENDINPUT:
            case ROJO:
            case CIAN:
            case GRIS:
                return 777;
            case '*':
                return 190;
            case '/':
                return 193;
        }
        return yyr63();
    }

    private int yys299() {
        switch (yytok) {
            case '>':
            case EJECUTA:
            case VERDE:
            case AMARILLO:
            case NEGRO:
            case MENORQUE:
            case '[':
            case BLANCO:
            case AZUL:
            case IGUALES:
            case Y:
            case O:
            case PARA:
            case '=':
            case '<':
            case MARRON:
            case error:
            case MAYORQUE:
            case ENDINPUT:
            case ROJO:
            case CIAN:
            case GRIS:
                return 777;
            case '*':
                return 194;
            case '/':
                return 197;
        }
        return yyr67();
    }

    private int yys300() {
        switch (yytok) {
            case '>':
            case EJECUTA:
            case VERDE:
            case AMARILLO:
            case NEGRO:
            case MENORQUE:
            case '[':
            case BLANCO:
            case AZUL:
            case IGUALES:
            case Y:
            case O:
            case PARA:
            case '=':
            case '<':
            case MARRON:
            case error:
            case MAYORQUE:
            case ENDINPUT:
            case ROJO:
            case CIAN:
            case GRIS:
                return 777;
            case '*':
                return 246;
            case '/':
                return 249;
        }
        return yyr64();
    }

    private int yys301() {
        switch (yytok) {
            case '>':
            case EJECUTA:
            case VERDE:
            case AMARILLO:
            case NEGRO:
            case MENORQUE:
            case '[':
            case BLANCO:
            case AZUL:
            case IGUALES:
            case Y:
            case O:
            case PARA:
            case '=':
            case '<':
            case MARRON:
            case error:
            case MAYORQUE:
            case ENDINPUT:
            case ROJO:
            case CIAN:
            case GRIS:
                return 777;
            case '*':
                return 190;
            case '/':
                return 193;
        }
        return yyr68();
    }

    private int yys302() {
        switch (yytok) {
            case '>':
            case EJECUTA:
            case VERDE:
            case AMARILLO:
            case NEGRO:
            case MENORQUE:
            case '[':
            case BLANCO:
            case AZUL:
            case IGUALES:
            case Y:
            case O:
            case PARA:
            case '=':
            case '<':
            case MARRON:
            case error:
            case MAYORQUE:
            case ENDINPUT:
            case ROJO:
            case CIAN:
            case GRIS:
                return 777;
            case '*':
                return 194;
            case '/':
                return 197;
        }
        return yyr72();
    }

    private int yys303() {
        switch (yytok) {
            case '>':
            case EJECUTA:
            case VERDE:
            case AMARILLO:
            case NEGRO:
            case MENORQUE:
            case '[':
            case BLANCO:
            case AZUL:
            case IGUALES:
            case Y:
            case O:
            case PARA:
            case '=':
            case '<':
            case MARRON:
            case error:
            case MAYORQUE:
            case ENDINPUT:
            case ROJO:
            case CIAN:
            case GRIS:
                return 777;
            case '*':
                return 246;
            case '/':
                return 249;
        }
        return yyr69();
    }

    private int yys304() {
        switch (yytok) {
            case BLANCO:
            case MAYORQUE:
            case '[':
            case ENDINPUT:
            case PARA:
            case Y:
            case error:
            case '>':
            case CIAN:
            case AMARILLO:
            case MENORQUE:
            case '=':
            case O:
            case NEGRO:
            case '<':
            case EJECUTA:
            case VERDE:
            case MARRON:
            case IGUALES:
            case GRIS:
            case AZUL:
            case ROJO:
                return 777;
        }
        return yyr78();
    }

    private int yys305() {
        switch (yytok) {
            case BLANCO:
            case MAYORQUE:
            case '[':
            case ENDINPUT:
            case PARA:
            case Y:
            case error:
            case '>':
            case CIAN:
            case AMARILLO:
            case MENORQUE:
            case '=':
            case O:
            case NEGRO:
            case '<':
            case EJECUTA:
            case VERDE:
            case MARRON:
            case IGUALES:
            case GRIS:
            case AZUL:
            case ROJO:
                return 777;
        }
        return yyr82();
    }

    private int yys306() {
        switch (yytok) {
            case BLANCO:
            case MAYORQUE:
            case '[':
            case ENDINPUT:
            case PARA:
            case Y:
            case error:
            case '>':
            case CIAN:
            case AMARILLO:
            case MENORQUE:
            case '=':
            case O:
            case NEGRO:
            case '<':
            case EJECUTA:
            case VERDE:
            case MARRON:
            case IGUALES:
            case GRIS:
            case AZUL:
            case ROJO:
                return 777;
        }
        return yyr79();
    }

    private int yys307() {
        switch (yytok) {
            case VERDE:
            case error:
            case AZUL:
            case PARA:
            case ROJO:
            case MARRON:
            case BLANCO:
            case CIAN:
            case '=':
            case NEGRO:
            case EJECUTA:
            case ENDINPUT:
            case GRIS:
            case AMARILLO:
                return 777;
        }
        return yyr57();
    }

    private int yys308() {
        switch (yytok) {
            case VERDE:
            case error:
            case AZUL:
            case PARA:
            case ROJO:
            case MARRON:
            case BLANCO:
            case CIAN:
            case '=':
            case NEGRO:
            case EJECUTA:
            case ENDINPUT:
            case GRIS:
            case AMARILLO:
                return 777;
        }
        return yyr55();
    }

    private int yys309() {
        switch (yytok) {
            case error:
            case '=':
            case GRIS:
            case EJECUTA:
            case BLANCO:
            case ROJO:
            case NEGRO:
            case AZUL:
            case ENDINPUT:
            case VERDE:
            case PARA:
            case MARRON:
            case AMARILLO:
            case CIAN:
                return 777;
            case '*':
                return 198;
            case '/':
                return 201;
        }
        return yyr51();
    }

    private int yys310() {
        switch (yytok) {
            case error:
            case '=':
            case GRIS:
            case EJECUTA:
            case BLANCO:
            case ROJO:
            case NEGRO:
            case AZUL:
            case ENDINPUT:
            case VERDE:
            case PARA:
            case MARRON:
            case AMARILLO:
            case CIAN:
                return 777;
            case '*':
                return 206;
            case '/':
                return 209;
        }
        return yyr49();
    }

    private int yys311() {
        switch (yytok) {
            case error:
            case '=':
            case GRIS:
            case EJECUTA:
            case BLANCO:
            case ROJO:
            case NEGRO:
            case AZUL:
            case ENDINPUT:
            case VERDE:
            case PARA:
            case MARRON:
            case AMARILLO:
            case CIAN:
                return 777;
            case '*':
                return 198;
            case '/':
                return 201;
        }
        return yyr54();
    }

    private int yys312() {
        switch (yytok) {
            case error:
            case '=':
            case GRIS:
            case EJECUTA:
            case BLANCO:
            case ROJO:
            case NEGRO:
            case AZUL:
            case ENDINPUT:
            case VERDE:
            case PARA:
            case MARRON:
            case AMARILLO:
            case CIAN:
                return 777;
            case '*':
                return 206;
            case '/':
                return 209;
        }
        return yyr52();
    }

    private int yys313() {
        switch (yytok) {
            case VERDE:
            case error:
            case AZUL:
            case PARA:
            case ROJO:
            case MARRON:
            case BLANCO:
            case CIAN:
            case '=':
            case NEGRO:
            case EJECUTA:
            case ENDINPUT:
            case GRIS:
            case AMARILLO:
                return 777;
        }
        return yyr60();
    }

    private int yys314() {
        switch (yytok) {
            case VERDE:
            case error:
            case AZUL:
            case PARA:
            case ROJO:
            case MARRON:
            case BLANCO:
            case CIAN:
            case '=':
            case NEGRO:
            case EJECUTA:
            case ENDINPUT:
            case GRIS:
            case AMARILLO:
                return 777;
        }
        return yyr58();
    }

    private int yys315() {
        switch (yytok) {
            case BLANCO:
            case MAYORQUE:
            case '[':
            case ENDINPUT:
            case PARA:
            case Y:
            case error:
            case '>':
            case CIAN:
            case AMARILLO:
            case MENORQUE:
            case '=':
            case O:
            case NEGRO:
            case '<':
            case EJECUTA:
            case VERDE:
            case MARRON:
            case IGUALES:
            case GRIS:
            case AZUL:
            case ROJO:
                return 777;
        }
        return yyr76();
    }

    private int yys316() {
        switch (yytok) {
            case '>':
            case EJECUTA:
            case VERDE:
            case AMARILLO:
            case NEGRO:
            case MENORQUE:
            case '[':
            case BLANCO:
            case AZUL:
            case IGUALES:
            case Y:
            case O:
            case PARA:
            case '=':
            case '<':
            case MARRON:
            case error:
            case MAYORQUE:
            case ENDINPUT:
            case ROJO:
            case CIAN:
            case GRIS:
                return 777;
            case '*':
                return 194;
            case '/':
                return 197;
        }
        return yyr66();
    }

    private int yys317() {
        switch (yytok) {
            case '>':
            case EJECUTA:
            case VERDE:
            case AMARILLO:
            case NEGRO:
            case MENORQUE:
            case '[':
            case BLANCO:
            case AZUL:
            case IGUALES:
            case Y:
            case O:
            case PARA:
            case '=':
            case '<':
            case MARRON:
            case error:
            case MAYORQUE:
            case ENDINPUT:
            case ROJO:
            case CIAN:
            case GRIS:
                return 777;
            case '*':
                return 194;
            case '/':
                return 197;
        }
        return yyr71();
    }

    private int yys318() {
        switch (yytok) {
            case BLANCO:
            case MAYORQUE:
            case '[':
            case ENDINPUT:
            case PARA:
            case Y:
            case error:
            case '>':
            case CIAN:
            case AMARILLO:
            case MENORQUE:
            case '=':
            case O:
            case NEGRO:
            case '<':
            case EJECUTA:
            case VERDE:
            case MARRON:
            case IGUALES:
            case GRIS:
            case AZUL:
            case ROJO:
                return 777;
        }
        return yyr81();
    }

    private int yys319() {
        switch (yytok) {
            case VERDE:
            case error:
            case AZUL:
            case PARA:
            case ROJO:
            case MARRON:
            case BLANCO:
            case CIAN:
            case '=':
            case NEGRO:
            case EJECUTA:
            case ENDINPUT:
            case GRIS:
            case AMARILLO:
                return 777;
        }
        return yyr56();
    }

    private int yys320() {
        switch (yytok) {
            case VERDE:
            case error:
            case AZUL:
            case PARA:
            case ROJO:
            case MARRON:
            case BLANCO:
            case CIAN:
            case '=':
            case NEGRO:
            case EJECUTA:
            case ENDINPUT:
            case GRIS:
            case AMARILLO:
                return 777;
        }
        return yyr28();
    }

    private int yys321() {
        switch (yytok) {
            case error:
            case '=':
            case GRIS:
            case EJECUTA:
            case BLANCO:
            case ROJO:
            case NEGRO:
            case AZUL:
            case ENDINPUT:
            case VERDE:
            case PARA:
            case MARRON:
            case AMARILLO:
            case CIAN:
                return 777;
            case '*':
                return 198;
            case '/':
                return 201;
        }
        return yyr50();
    }

    private int yys322() {
        switch (yytok) {
            case error:
            case '=':
            case GRIS:
            case EJECUTA:
            case BLANCO:
            case ROJO:
            case NEGRO:
            case AZUL:
            case ENDINPUT:
            case VERDE:
            case PARA:
            case MARRON:
            case AMARILLO:
            case CIAN:
                return 777;
            case '*':
                return 206;
            case '/':
                return 209;
        }
        return yyr26();
    }

    private int yys323() {
        switch (yytok) {
            case error:
            case '=':
            case GRIS:
            case EJECUTA:
            case BLANCO:
            case ROJO:
            case NEGRO:
            case AZUL:
            case ENDINPUT:
            case VERDE:
            case PARA:
            case MARRON:
            case AMARILLO:
            case CIAN:
                return 777;
            case '*':
                return 198;
            case '/':
                return 201;
        }
        return yyr53();
    }

    private int yys324() {
        switch (yytok) {
            case error:
            case '=':
            case GRIS:
            case EJECUTA:
            case BLANCO:
            case ROJO:
            case NEGRO:
            case AZUL:
            case ENDINPUT:
            case VERDE:
            case PARA:
            case MARRON:
            case AMARILLO:
            case CIAN:
                return 777;
            case '*':
                return 206;
            case '/':
                return 209;
        }
        return yyr27();
    }

    private int yys325() {
        switch (yytok) {
            case VERDE:
            case error:
            case AZUL:
            case PARA:
            case ROJO:
            case MARRON:
            case BLANCO:
            case CIAN:
            case '=':
            case NEGRO:
            case EJECUTA:
            case ENDINPUT:
            case GRIS:
            case AMARILLO:
                return 777;
        }
        return yyr59();
    }

    private int yys326() {
        switch (yytok) {
            case VERDE:
            case error:
            case AZUL:
            case PARA:
            case ROJO:
            case MARRON:
            case BLANCO:
            case CIAN:
            case '=':
            case NEGRO:
            case EJECUTA:
            case ENDINPUT:
            case GRIS:
            case AMARILLO:
                return 777;
        }
        return yyr29();
    }

    private int yys327() {
        switch (yytok) {
            case BLANCO:
            case MAYORQUE:
            case '[':
            case ENDINPUT:
            case PARA:
            case Y:
            case error:
            case '>':
            case CIAN:
            case AMARILLO:
            case MENORQUE:
            case '=':
            case O:
            case NEGRO:
            case '<':
            case EJECUTA:
            case VERDE:
            case MARRON:
            case IGUALES:
            case GRIS:
            case AZUL:
            case ROJO:
                return 777;
        }
        return yyr83();
    }

    private int yys328() {
        switch (yytok) {
            case VERDE:
            case error:
            case AZUL:
            case PARA:
            case ROJO:
            case MARRON:
            case BLANCO:
            case CIAN:
            case '=':
            case NEGRO:
            case EJECUTA:
            case ENDINPUT:
            case GRIS:
            case AMARILLO:
                return 777;
        }
        return yyr61();
    }

    private int yys329() {
        switch (yytok) {
            case ENDINPUT:
            case '-':
            case MAYORQUE:
            case ROJO:
            case MENORQUE:
            case '/':
            case '*':
            case VERDE:
            case IGUALES:
            case AZUL:
            case BLANCO:
            case EJECUTA:
            case '=':
            case PARA:
            case '<':
            case '+':
            case error:
            case Y:
            case '>':
            case AMARILLO:
            case GRIS:
            case CIAN:
            case '[':
            case MARRON:
            case O:
            case NEGRO:
                return 777;
        }
        return yyr114();
    }

    private int yys330() {
        switch (yytok) {
            case FLOAT:
            case BLANCO:
            case Y:
            case AZUL:
            case O:
            case PARA:
            case '+':
            case error:
            case ENDINPUT:
            case CIAN:
            case '[':
            case VERDE:
            case MENORQUE:
            case '>':
            case '=':
            case '-':
            case EJECUTA:
            case '(':
            case '<':
            case INTEGER:
            case ROJO:
            case GRIS:
            case IGUALES:
            case AMARILLO:
            case MARRON:
            case MAYORQUE:
            case NEGRO:
            case '*':
            case '/':
                return 777;
        }
        return yyr190();
    }

    private int yys333() {
        switch (yytok) {
            case FLOAT:
            case BLANCO:
            case Y:
            case AZUL:
            case O:
            case PARA:
            case '+':
            case error:
            case ENDINPUT:
            case CIAN:
            case '[':
            case VERDE:
            case MENORQUE:
            case '>':
            case '=':
            case '-':
            case EJECUTA:
            case '(':
            case '<':
            case INTEGER:
            case ROJO:
            case GRIS:
            case IGUALES:
            case AMARILLO:
            case MARRON:
            case MAYORQUE:
            case NEGRO:
            case '*':
            case '/':
                return 777;
        }
        return yyr189();
    }

    private int yys334() {
        switch (yytok) {
            case FLOAT:
            case BLANCO:
            case Y:
            case AZUL:
            case O:
            case PARA:
            case '+':
            case error:
            case ENDINPUT:
            case CIAN:
            case '[':
            case VERDE:
            case MENORQUE:
            case '>':
            case '=':
            case '-':
            case EJECUTA:
            case '(':
            case '<':
            case INTEGER:
            case ROJO:
            case GRIS:
            case IGUALES:
            case AMARILLO:
            case MARRON:
            case MAYORQUE:
            case NEGRO:
            case '*':
            case '/':
                return 777;
        }
        return yyr188();
    }

    private int yys339() {
        switch (yytok) {
            case ROJO:
            case PARA:
            case error:
            case CIAN:
            case Y:
            case '>':
            case '+':
            case '(':
            case INTEGER:
            case GRIS:
            case ENDINPUT:
            case VERDE:
            case EJECUTA:
            case BLANCO:
            case '=':
            case '-':
            case '*':
            case ')':
            case MAYORQUE:
            case '[':
            case IGUALES:
            case AZUL:
            case FLOAT:
            case AMARILLO:
            case MARRON:
            case '<':
            case O:
            case NEGRO:
            case MENORQUE:
            case '/':
                return 777;
        }
        return yyr117();
    }

    private int yys343() {
        switch (yytok) {
            case AZUL:
            case '/':
            case error:
            case ROJO:
            case MAYORQUE:
            case MENORQUE:
            case '+':
            case '(':
            case MARRON:
            case IGUALES:
            case ENDINPUT:
            case FIN:
            case BLANCO:
            case EJECUTA:
            case '=':
            case '-':
            case '*':
            case ')':
            case VERDE:
            case '<':
            case INTEGER:
            case AMARILLO:
            case CIAN:
            case GRIS:
            case FLOAT:
            case '[':
            case PARA:
            case Y:
            case O:
            case NEGRO:
            case ']':
            case '>':
            case ';':
                return 777;
        }
        return yyr204();
    }

    private int yys344() {
        switch (yytok) {
            case VERDE:
            case NEGRO:
            case '>':
            case AMARILLO:
            case MENORQUE:
            case O:
            case EJECUTA:
            case MARRON:
            case ROJO:
            case GRIS:
            case BLANCO:
            case error:
            case '=':
            case ']':
            case '<':
            case ')':
            case Y:
            case ';':
            case ENDINPUT:
            case IGUALES:
            case AZUL:
            case CIAN:
            case PARA:
            case '[':
            case MAYORQUE:
                return 777;
            case IDENTIFIER:
                return 383;
        }
        return yyr22();
    }

    private int yys346() {
        switch (yytok) {
            case FLOAT:
            case BLANCO:
            case Y:
            case AZUL:
            case O:
            case PARA:
            case '+':
            case error:
            case ENDINPUT:
            case CIAN:
            case '[':
            case VERDE:
            case MENORQUE:
            case '>':
            case '=':
            case '-':
            case EJECUTA:
            case '(':
            case '<':
            case INTEGER:
            case ROJO:
            case GRIS:
            case IGUALES:
            case AMARILLO:
            case MARRON:
            case MAYORQUE:
            case NEGRO:
            case '*':
            case '/':
                return 777;
        }
        return yyr196();
    }

    private int yys347() {
        switch (yytok) {
            case FLOAT:
            case BLANCO:
            case Y:
            case AZUL:
            case O:
            case PARA:
            case '+':
            case error:
            case ENDINPUT:
            case CIAN:
            case '[':
            case VERDE:
            case MENORQUE:
            case '>':
            case '=':
            case '-':
            case EJECUTA:
            case '(':
            case '<':
            case INTEGER:
            case ROJO:
            case GRIS:
            case IGUALES:
            case AMARILLO:
            case MARRON:
            case MAYORQUE:
            case NEGRO:
            case '*':
            case '/':
                return 777;
        }
        return yyr195();
    }

    private int yys350() {
        switch (yytok) {
            case '*':
                return 198;
            case '+':
                return 199;
            case '-':
                return 200;
            case '/':
                return 201;
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
        return 777;
    }

    private int yys351() {
        switch (yytok) {
            case '*':
                return 206;
            case '+':
                return 207;
            case '-':
                return 208;
            case '/':
                return 209;
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
        return 777;
    }

    private int yys352() {
        switch (yytok) {
            case '*':
                return 198;
            case '+':
                return 199;
            case '-':
                return 200;
            case '/':
                return 201;
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
        return 777;
    }

    private int yys353() {
        switch (yytok) {
            case '*':
                return 206;
            case '+':
                return 207;
            case '-':
                return 208;
            case '/':
                return 209;
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
        return 777;
    }

    private int yys354() {
        switch (yytok) {
            case '*':
                return 198;
            case '+':
                return 199;
            case '-':
                return 200;
            case '/':
                return 201;
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
        return 777;
    }

    private int yys355() {
        switch (yytok) {
            case '*':
                return 206;
            case '+':
                return 207;
            case '-':
                return 208;
            case '/':
                return 209;
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
        return 777;
    }

    private int yys356() {
        switch (yytok) {
            case '*':
                return 198;
            case '+':
                return 199;
            case '-':
                return 200;
            case '/':
                return 201;
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
        return 777;
    }

    private int yys357() {
        switch (yytok) {
            case '*':
                return 206;
            case '+':
                return 207;
            case '-':
                return 208;
            case '/':
                return 209;
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
        return 777;
    }

    private int yys358() {
        switch (yytok) {
            case '*':
                return 198;
            case '+':
                return 199;
            case '-':
                return 200;
            case '/':
                return 201;
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
        return 777;
    }

    private int yys359() {
        switch (yytok) {
            case '*':
                return 206;
            case '+':
                return 207;
            case '-':
                return 208;
            case '/':
                return 209;
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
        return 777;
    }

    private int yys360() {
        switch (yytok) {
            case '*':
                return 198;
            case '+':
                return 199;
            case '-':
                return 200;
            case '/':
                return 201;
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
        return 777;
    }

    private int yys361() {
        switch (yytok) {
            case '*':
                return 206;
            case '+':
                return 207;
            case '-':
                return 208;
            case '/':
                return 209;
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
        return 777;
    }

    private int yys362() {
        switch (yytok) {
            case '*':
                return 198;
            case '+':
                return 199;
            case '-':
                return 200;
            case '/':
                return 201;
            case IGUALES:
            case FLOAT:
            case '[':
            case O:
            case '(':
            case Y:
            case MENORQUE:
            case MAYORQUE:
            case INTEGER:
                return yyr102();
        }
        return 777;
    }

    private int yys363() {
        switch (yytok) {
            case '*':
                return 206;
            case '+':
                return 207;
            case '-':
                return 208;
            case '/':
                return 209;
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
        return 777;
    }

    private int yys364() {
        switch (yytok) {
            case '*':
                return 198;
            case '+':
                return 199;
            case '-':
                return 200;
            case '/':
                return 201;
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
        return 777;
    }

    private int yys365() {
        switch (yytok) {
            case '*':
                return 206;
            case '+':
                return 207;
            case '-':
                return 208;
            case '/':
                return 209;
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
        return 777;
    }

    private int yys366() {
        switch (yytok) {
            case '*':
                return 198;
            case '+':
                return 199;
            case '-':
                return 200;
            case '/':
                return 201;
            case IGUALES:
            case FLOAT:
            case '[':
            case O:
            case '(':
            case Y:
            case MENORQUE:
            case MAYORQUE:
            case INTEGER:
                return yyr106();
        }
        return 777;
    }

    private int yys367() {
        switch (yytok) {
            case '*':
                return 206;
            case '+':
                return 207;
            case '-':
                return 208;
            case '/':
                return 209;
            case IGUALES:
            case FLOAT:
            case '[':
            case O:
            case '(':
            case Y:
            case MENORQUE:
            case MAYORQUE:
            case INTEGER:
                return yyr104();
        }
        return 777;
    }

    private int yys368() {
        switch (yytok) {
            case '*':
                return 198;
            case '+':
                return 199;
            case '-':
                return 200;
            case '/':
                return 201;
            case IGUALES:
            case FLOAT:
            case '[':
            case O:
            case '(':
            case Y:
            case MENORQUE:
            case MAYORQUE:
            case INTEGER:
                return yyr105();
        }
        return 777;
    }

    private int yys369() {
        switch (yytok) {
            case '*':
                return 206;
            case '+':
                return 207;
            case '-':
                return 208;
            case '/':
                return 209;
            case IGUALES:
            case FLOAT:
            case '[':
            case O:
            case '(':
            case Y:
            case MENORQUE:
            case MAYORQUE:
            case INTEGER:
                return yyr103();
        }
        return 777;
    }

    private int yys370() {
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
                return yyr98();
        }
        return 777;
    }

    private int yys371() {
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
                return yyr97();
        }
        return 777;
    }

    private int yys372() {
        switch (yytok) {
            case FLOAT:
            case BLANCO:
            case Y:
            case AZUL:
            case O:
            case PARA:
            case '+':
            case error:
            case ENDINPUT:
            case CIAN:
            case '[':
            case VERDE:
            case MENORQUE:
            case '>':
            case '=':
            case '-':
            case EJECUTA:
            case '(':
            case '<':
            case INTEGER:
            case ROJO:
            case GRIS:
            case IGUALES:
            case AMARILLO:
            case MARRON:
            case MAYORQUE:
            case NEGRO:
            case '*':
            case '/':
                return 777;
        }
        return yyr194();
    }

    private int yys373() {
        switch (yytok) {
            case FLOAT:
            case BLANCO:
            case Y:
            case AZUL:
            case O:
            case PARA:
            case '+':
            case error:
            case ENDINPUT:
            case CIAN:
            case '[':
            case VERDE:
            case MENORQUE:
            case '>':
            case '=':
            case '-':
            case EJECUTA:
            case '(':
            case '<':
            case INTEGER:
            case ROJO:
            case GRIS:
            case IGUALES:
            case AMARILLO:
            case MARRON:
            case MAYORQUE:
            case NEGRO:
            case '*':
            case '/':
                return 777;
        }
        return yyr193();
    }

    private int yys374() {
        switch (yytok) {
            case FLOAT:
            case BLANCO:
            case Y:
            case AZUL:
            case O:
            case PARA:
            case '+':
            case error:
            case ENDINPUT:
            case CIAN:
            case '[':
            case VERDE:
            case MENORQUE:
            case '>':
            case '=':
            case '-':
            case EJECUTA:
            case '(':
            case '<':
            case INTEGER:
            case ROJO:
            case GRIS:
            case IGUALES:
            case AMARILLO:
            case MARRON:
            case MAYORQUE:
            case NEGRO:
            case '*':
            case '/':
                return 777;
        }
        return yyr192();
    }

    private int yys375() {
        switch (yytok) {
            case FLOAT:
            case BLANCO:
            case Y:
            case AZUL:
            case O:
            case PARA:
            case '+':
            case error:
            case ENDINPUT:
            case CIAN:
            case '[':
            case VERDE:
            case MENORQUE:
            case '>':
            case '=':
            case '-':
            case EJECUTA:
            case '(':
            case '<':
            case INTEGER:
            case ROJO:
            case GRIS:
            case IGUALES:
            case AMARILLO:
            case MARRON:
            case MAYORQUE:
            case NEGRO:
            case '*':
            case '/':
                return 777;
        }
        return yyr191();
    }

    private int yys376() {
        switch (yytok) {
            case ROJO:
            case PARA:
            case error:
            case CIAN:
            case Y:
            case '>':
            case '+':
            case '(':
            case INTEGER:
            case GRIS:
            case ENDINPUT:
            case VERDE:
            case EJECUTA:
            case BLANCO:
            case '=':
            case '-':
            case '*':
            case ')':
            case MAYORQUE:
            case '[':
            case IGUALES:
            case AZUL:
            case FLOAT:
            case AMARILLO:
            case MARRON:
            case '<':
            case O:
            case NEGRO:
            case MENORQUE:
            case '/':
                return 777;
        }
        return yyr116();
    }

    private int yys378() {
        switch (yytok) {
            case FLOAT:
            case BLANCO:
            case Y:
            case AZUL:
            case O:
            case PARA:
            case '+':
            case error:
            case ENDINPUT:
            case CIAN:
            case '[':
            case VERDE:
            case MENORQUE:
            case '>':
            case '=':
            case '-':
            case EJECUTA:
            case '(':
            case '<':
            case INTEGER:
            case ROJO:
            case GRIS:
            case IGUALES:
            case AMARILLO:
            case MARRON:
            case MAYORQUE:
            case NEGRO:
            case '*':
            case '/':
                return 777;
        }
        return yyr198();
    }

    private int yys379() {
        switch (yytok) {
            case FLOAT:
            case BLANCO:
            case Y:
            case AZUL:
            case O:
            case PARA:
            case '+':
            case error:
            case ENDINPUT:
            case CIAN:
            case '[':
            case VERDE:
            case MENORQUE:
            case '>':
            case '=':
            case '-':
            case EJECUTA:
            case '(':
            case '<':
            case INTEGER:
            case ROJO:
            case GRIS:
            case IGUALES:
            case AMARILLO:
            case MARRON:
            case MAYORQUE:
            case NEGRO:
            case '*':
            case '/':
                return 777;
        }
        return yyr197();
    }

    private int yys380() {
        switch (yytok) {
            case ROJO:
            case PARA:
            case error:
            case CIAN:
            case Y:
            case '>':
            case '+':
            case '(':
            case INTEGER:
            case GRIS:
            case ENDINPUT:
            case VERDE:
            case EJECUTA:
            case BLANCO:
            case '=':
            case '-':
            case '*':
            case ')':
            case MAYORQUE:
            case '[':
            case IGUALES:
            case AZUL:
            case FLOAT:
            case AMARILLO:
            case MARRON:
            case '<':
            case O:
            case NEGRO:
            case MENORQUE:
            case '/':
                return 777;
        }
        return yyr186();
    }

    private int yys381() {
        switch (yytok) {
            case ROJO:
            case PARA:
            case error:
            case CIAN:
            case Y:
            case '>':
            case '+':
            case '(':
            case INTEGER:
            case GRIS:
            case ENDINPUT:
            case VERDE:
            case EJECUTA:
            case BLANCO:
            case '=':
            case '-':
            case '*':
            case ')':
            case MAYORQUE:
            case '[':
            case IGUALES:
            case AZUL:
            case FLOAT:
            case AMARILLO:
            case MARRON:
            case '<':
            case O:
            case NEGRO:
            case MENORQUE:
            case '/':
                return 777;
        }
        return yyr185();
    }

    private int yys383() {
        switch (yytok) {
            case '/':
            case MENORQUE:
            case error:
            case ROJO:
            case FIN:
            case EJECUTA:
            case '+':
            case '(':
            case MARRON:
            case IGUALES:
            case AZUL:
            case '[':
            case Y:
            case NEGRO:
            case '=':
            case '-':
            case '*':
            case ')':
            case VERDE:
            case '<':
            case INTEGER:
            case AMARILLO:
            case CIAN:
            case GRIS:
            case ENDINPUT:
            case FLOAT:
            case MAYORQUE:
            case PARA:
            case BLANCO:
            case O:
            case ']':
            case '>':
            case ';':
                return 777;
            case IDENTIFIER:
                return 383;
        }
        return yyr205();
    }

    private int yys384() {
        switch (yytok) {
            case ROJO:
            case PARA:
            case error:
            case CIAN:
            case Y:
            case '>':
            case '+':
            case '(':
            case INTEGER:
            case GRIS:
            case ENDINPUT:
            case VERDE:
            case EJECUTA:
            case BLANCO:
            case '=':
            case '-':
            case '*':
            case ')':
            case MAYORQUE:
            case '[':
            case IGUALES:
            case AZUL:
            case FLOAT:
            case AMARILLO:
            case MARRON:
            case '<':
            case O:
            case NEGRO:
            case MENORQUE:
            case '/':
                return 777;
        }
        return yyr187();
    }

    private int yys385() {
        switch (yytok) {
            case ROJO:
            case PARA:
            case error:
            case CIAN:
            case Y:
            case '>':
            case '+':
            case '(':
            case INTEGER:
            case GRIS:
            case ENDINPUT:
            case VERDE:
            case EJECUTA:
            case BLANCO:
            case '=':
            case '-':
            case '*':
            case ')':
            case MAYORQUE:
            case '[':
            case IGUALES:
            case AZUL:
            case FLOAT:
            case AMARILLO:
            case MARRON:
            case '<':
            case O:
            case NEGRO:
            case MENORQUE:
            case '/':
                return 777;
        }
        return yyr202();
    }

    private int yys386() {
        switch (yytok) {
            case ROJO:
            case PARA:
            case error:
            case CIAN:
            case Y:
            case '>':
            case '+':
            case '(':
            case INTEGER:
            case GRIS:
            case ENDINPUT:
            case VERDE:
            case EJECUTA:
            case BLANCO:
            case '=':
            case '-':
            case '*':
            case ')':
            case MAYORQUE:
            case '[':
            case IGUALES:
            case AZUL:
            case FLOAT:
            case AMARILLO:
            case MARRON:
            case '<':
            case O:
            case NEGRO:
            case MENORQUE:
            case '/':
                return 777;
        }
        return yyr203();
    }

    private int yyr1() { // program_end : program
        { parsingDone(); }
        yysv[yysp-=1] = yyrv;
        return 1;
    }

    private int yyr85() { // boolean_value : integer_value '<' integer_value
        { yyrv = (((Integer)yysv[yysp-3]) < ((Integer)yysv[yysp-1])); }
        yysv[yysp-=3] = yyrv;
        return yypboolean_value();
    }

    private int yyr86() { // boolean_value : float_value '<' integer_value
        { yyrv = (((Float)yysv[yysp-3]) < ((Integer)yysv[yysp-1])); }
        yysv[yysp-=3] = yyrv;
        return yypboolean_value();
    }

    private int yyr87() { // boolean_value : integer_value '<' float_value
        { yyrv = (((Integer)yysv[yysp-3]) < ((Float)yysv[yysp-1])); }
        yysv[yysp-=3] = yyrv;
        return yypboolean_value();
    }

    private int yyr88() { // boolean_value : float_value '<' float_value
        { yyrv = (((Float)yysv[yysp-3]) < ((Float)yysv[yysp-1])); }
        yysv[yysp-=3] = yyrv;
        return yypboolean_value();
    }

    private int yyr89() { // boolean_value : integer_value '>' integer_value
        { yyrv = (((Integer)yysv[yysp-3]) > ((Integer)yysv[yysp-1])); }
        yysv[yysp-=3] = yyrv;
        return yypboolean_value();
    }

    private int yyr90() { // boolean_value : float_value '>' integer_value
        { yyrv = (((Float)yysv[yysp-3]) > ((Integer)yysv[yysp-1])); }
        yysv[yysp-=3] = yyrv;
        return yypboolean_value();
    }

    private int yyr91() { // boolean_value : integer_value '>' float_value
        { yyrv = (((Integer)yysv[yysp-3]) > ((Float)yysv[yysp-1])); }
        yysv[yysp-=3] = yyrv;
        return yypboolean_value();
    }

    private int yyr92() { // boolean_value : float_value '>' float_value
        { yyrv = (((Float)yysv[yysp-3]) > ((Float)yysv[yysp-1])); }
        yysv[yysp-=3] = yyrv;
        return yypboolean_value();
    }

    private int yyr93() { // boolean_value : IGUALES integer_value integer_value
        { yyrv = ((Integer)yysv[yysp-2]).equals(((Integer)yysv[yysp-1])); }
        yysv[yysp-=3] = yyrv;
        return yypboolean_value();
    }

    private int yyr94() { // boolean_value : IGUALES float_value float_value
        { yyrv = ((Float)yysv[yysp-2]).equals(((Float)yysv[yysp-1])); }
        yysv[yysp-=3] = yyrv;
        return yypboolean_value();
    }

    private int yyr95() { // boolean_value : IGUALES integer_value float_value
        { yyrv = false; }
        yysv[yysp-=3] = yyrv;
        return yypboolean_value();
    }

    private int yyr96() { // boolean_value : IGUALES float_value integer_value
        { yyrv = false; }
        yysv[yysp-=3] = yyrv;
        return yypboolean_value();
    }

    private int yyr97() { // boolean_value : Y boolean_value boolean_value
        yysp -= 3;
        return yypboolean_value();
    }

    private int yyr98() { // boolean_value : O boolean_value boolean_value
        yysp -= 3;
        return yypboolean_value();
    }

    private int yyr99() { // boolean_value : MAYORQUE integer_value integer_value
        { yyrv = (((Integer)yysv[yysp-2]) > ((Integer)yysv[yysp-1])); }
        yysv[yysp-=3] = yyrv;
        return yypboolean_value();
    }

    private int yyr100() { // boolean_value : MAYORQUE float_value integer_value
        { yyrv = (((Float)yysv[yysp-2]) > ((Integer)yysv[yysp-1])); }
        yysv[yysp-=3] = yyrv;
        return yypboolean_value();
    }

    private int yyr101() { // boolean_value : MAYORQUE integer_value float_value
        { yyrv = (((Integer)yysv[yysp-2]) > ((Float)yysv[yysp-1])); }
        yysv[yysp-=3] = yyrv;
        return yypboolean_value();
    }

    private int yyr102() { // boolean_value : MAYORQUE float_value float_value
        { yyrv = (((Float)yysv[yysp-2]) > ((Float)yysv[yysp-1])); }
        yysv[yysp-=3] = yyrv;
        return yypboolean_value();
    }

    private int yyr103() { // boolean_value : MENORQUE integer_value integer_value
        { yyrv = (((Integer)yysv[yysp-2]) < ((Integer)yysv[yysp-1])); }
        yysv[yysp-=3] = yyrv;
        return yypboolean_value();
    }

    private int yyr104() { // boolean_value : MENORQUE float_value integer_value
        { yyrv = (((Float)yysv[yysp-2]) < ((Integer)yysv[yysp-1])); }
        yysv[yysp-=3] = yyrv;
        return yypboolean_value();
    }

    private int yyr105() { // boolean_value : MENORQUE integer_value float_value
        { yyrv = (((Integer)yysv[yysp-2]) < ((Float)yysv[yysp-1])); }
        yysv[yysp-=3] = yyrv;
        return yypboolean_value();
    }

    private int yyr106() { // boolean_value : MENORQUE float_value float_value
        { yyrv = (((Float)yysv[yysp-2]) < ((Float)yysv[yysp-1])); }
        yysv[yysp-=3] = yyrv;
        return yypboolean_value();
    }

    private int yypboolean_value() {
        switch (yyst[yysp-1]) {
            case 263: return 370;
            case 165: return 264;
            case 164: return 263;
            case 70: return 158;
            default: return 371;
        }
    }

    private int yyr118() { // color : BLANCO
        { yyrv = "blanco"; }
        yysv[yysp-=1] = yyrv;
        return yypcolor();
    }

    private int yyr119() { // color : AZUL
        { yyrv = "azul"; }
        yysv[yysp-=1] = yyrv;
        return yypcolor();
    }

    private int yyr120() { // color : MARRON
        { yyrv = "marron"; }
        yysv[yysp-=1] = yyrv;
        return yypcolor();
    }

    private int yyr121() { // color : CIAN
        { yyrv = "cian"; }
        yysv[yysp-=1] = yyrv;
        return yypcolor();
    }

    private int yyr122() { // color : GRIS
        { yyrv = "gris"; }
        yysv[yysp-=1] = yyrv;
        return yypcolor();
    }

    private int yyr123() { // color : AMARILLO
        { yyrv = "amarillo"; }
        yysv[yysp-=1] = yyrv;
        return yypcolor();
    }

    private int yyr124() { // color : NEGRO
        { yyrv = "negro"; }
        yysv[yysp-=1] = yyrv;
        return yypcolor();
    }

    private int yyr125() { // color : ROJO
        { yyrv = "rojo"; }
        yysv[yysp-=1] = yyrv;
        return yypcolor();
    }

    private int yyr126() { // color : VERDE
        { yyrv = "verde"; }
        yysv[yysp-=1] = yyrv;
        return yypcolor();
    }

    private int yypcolor() {
        switch (yyst[yysp-1]) {
            case 49: return 123;
            default: return 133;
        }
    }

    private int yyr115() { // declaration_expr : VAR IDENTIFIER
        { yyrv = instr("var", InstructionType.VARIABLE, ReturnType.VOID, ((String)yysv[yysp-1])); }
        yysv[yysp-=2] = yyrv;
        return 2;
    }

    private int yyr116() { // declaration_expr : VAR IDENTIFIER '=' argument
        { yyrv = instr("var", InstructionType.VARIABLE, ReturnType.VOID, arguments.stringArg(((String)yysv[yysp-3])), ((String)yysv[yysp-1])); }
        yysv[yysp-=4] = yyrv;
        return 2;
    }

    private int yyr199() { // exec_instr : expression exec_instr
        { instrList.add(((String)yysv[yysp-2])); }
        yysv[yysp-=2] = yyrv;
        return yypexec_instr();
    }

    private int yyr200() { // exec_instr : expression
        { instrList.add(((String)yysv[yysp-1])); }
        yysv[yysp-=1] = yyrv;
        return yypexec_instr();
    }

    private int yypexec_instr() {
        switch (yyst[yysp-1]) {
            case 109: return 228;
            default: return 332;
        }
    }

    private int yyr8() { // expression : declaration_expr
        yysp -= 1;
        return yypexpression();
    }

    private int yyr9() { // expression : redeclaration_expr
        yysp -= 1;
        return yypexpression();
    }

    private int yyr10() { // expression : proc
        yysp -= 1;
        return yypexpression();
    }

    private int yyr11() { // expression : proc1
        yysp -= 1;
        return yypexpression();
    }

    private int yyr12() { // expression : val_proc1
        yysp -= 1;
        return yypexpression();
    }

    private int yyr13() { // expression : proc2
        yysp -= 1;
        return yypexpression();
    }

    private int yyr14() { // expression : val_proc2
        yysp -= 1;
        return yypexpression();
    }

    private int yyr15() { // expression : val_proc_n
        yysp -= 1;
        return yypexpression();
    }

    private int yyr16() { // expression : proc_p
        yysp -= 1;
        return yypexpression();
    }

    private int yyr17() { // expression : val_proc_p
        yysp -= 1;
        return yypexpression();
    }

    private int yyr18() { // expression : val_proc_1p
        yysp -= 1;
        return yypexpression();
    }

    private int yyr19() { // expression : proc_loop
        yysp -= 1;
        return yypexpression();
    }

    private int yyr20() { // expression : proc_cond
        yysp -= 1;
        return yypexpression();
    }

    private int yyr21() { // expression : user_proc_call
        yysp -= 1;
        return yypexpression();
    }

    private int yypexpression() {
        switch (yyst[yysp-1]) {
            case 229: return 229;
            case 109: return 229;
            case 77: return 3;
            case 76: return 3;
            case 0: return 3;
            default: return 235;
        }
    }

    private int yyr46() { // float : float_value
        { yyrv = arguments.floatArg(((Float)yysv[yysp-1])); }
        yysv[yysp-=1] = yyrv;
        switch (yyst[yysp-1]) {
            case 249: return 210;
            case 248: return 210;
            case 247: return 210;
            case 246: return 210;
            case 205: return 210;
            case 204: return 210;
            case 203: return 210;
            case 202: return 210;
            case 197: return 304;
            case 196: return 301;
            case 195: return 298;
            case 194: return 295;
            case 193: return 210;
            case 192: return 210;
            case 191: return 210;
            case 190: return 210;
            case 152: return 210;
            case 100: return 210;
            case 96: return 210;
            default: return 87;
        }
    }

    private int yyr47() { // float_arg : float
        yysp -= 1;
        return yypfloat_arg();
    }

    private int yyr48() { // float_arg : float_expr
        yysp -= 1;
        return yypfloat_arg();
    }

    private int yypfloat_arg() {
        switch (yyst[yysp-1]) {
            case 233: return 337;
            case 232: return 222;
            case 222: return 222;
            case 171: return 222;
            case 170: return 222;
            case 142: return 222;
            case 141: return 243;
            case 110: return 222;
            case 102: return 222;
            case 72: return 102;
            case 62: return 149;
            case 58: return 102;
            case 56: return 139;
            case 45: return 120;
            case 32: return 102;
            case 25: return 88;
            default: return 97;
        }
    }

    private int yyr63() { // float_expr : float_expr '+' float
        { yyrv = instr("+", InstructionType.OPERATION, ReturnType.FLOAT, ((String)yysv[yysp-3]), ((String)yysv[yysp-1])); }
        yysv[yysp-=3] = yyrv;
        return yypfloat_expr();
    }

    private int yyr64() { // float_expr : float_expr '+' integer
        { yyrv = instr("+", InstructionType.OPERATION, ReturnType.FLOAT, ((String)yysv[yysp-3]), ((String)yysv[yysp-1])); }
        yysv[yysp-=3] = yyrv;
        return yypfloat_expr();
    }

    private int yyr65() { // float_expr : float '+' float_expr
        { yyrv = instr("+", InstructionType.OPERATION, ReturnType.FLOAT, ((String)yysv[yysp-3]), ((String)yysv[yysp-1])); }
        yysv[yysp-=3] = yyrv;
        return yypfloat_expr();
    }

    private int yyr66() { // float_expr : integer '+' float_expr
        { yyrv = instr("+", InstructionType.OPERATION, ReturnType.FLOAT, ((String)yysv[yysp-3]), ((String)yysv[yysp-1])); }
        yysv[yysp-=3] = yyrv;
        return yypfloat_expr();
    }

    private int yyr67() { // float_expr : float_expr '+' float_expr
        { yyrv = instr("+", InstructionType.OPERATION, ReturnType.FLOAT, ((String)yysv[yysp-3]), ((String)yysv[yysp-1])); }
        yysv[yysp-=3] = yyrv;
        return yypfloat_expr();
    }

    private int yyr68() { // float_expr : float_expr '-' float
        { yyrv = instr("-", InstructionType.OPERATION, ReturnType.FLOAT, ((String)yysv[yysp-3]), ((String)yysv[yysp-1])); }
        yysv[yysp-=3] = yyrv;
        return yypfloat_expr();
    }

    private int yyr69() { // float_expr : float_expr '-' integer
        { yyrv = instr("-", InstructionType.OPERATION, ReturnType.FLOAT, ((String)yysv[yysp-3]), ((String)yysv[yysp-1])); }
        yysv[yysp-=3] = yyrv;
        return yypfloat_expr();
    }

    private int yyr70() { // float_expr : float '-' float_expr
        { yyrv = instr("-", InstructionType.OPERATION, ReturnType.FLOAT, ((String)yysv[yysp-3]), ((String)yysv[yysp-1])); }
        yysv[yysp-=3] = yyrv;
        return yypfloat_expr();
    }

    private int yyr71() { // float_expr : integer '-' float_expr
        { yyrv = instr("-", InstructionType.OPERATION, ReturnType.FLOAT, ((String)yysv[yysp-3]), ((String)yysv[yysp-1])); }
        yysv[yysp-=3] = yyrv;
        return yypfloat_expr();
    }

    private int yyr72() { // float_expr : float_expr '-' float_expr
        { yyrv = instr("-", InstructionType.OPERATION, ReturnType.FLOAT, ((String)yysv[yysp-3]), ((String)yysv[yysp-1])); }
        yysv[yysp-=3] = yyrv;
        return yypfloat_expr();
    }

    private int yyr73() { // float_expr : float_expr '*' float
        { yyrv = instr("*", InstructionType.OPERATION, ReturnType.FLOAT, ((String)yysv[yysp-3]), ((String)yysv[yysp-1])); }
        yysv[yysp-=3] = yyrv;
        return yypfloat_expr();
    }

    private int yyr74() { // float_expr : float_expr '*' integer
        { yyrv = instr("*", InstructionType.OPERATION, ReturnType.FLOAT, ((String)yysv[yysp-3]), ((String)yysv[yysp-1])); }
        yysv[yysp-=3] = yyrv;
        return yypfloat_expr();
    }

    private int yyr75() { // float_expr : float '*' float_expr
        { yyrv = instr("*", InstructionType.OPERATION, ReturnType.FLOAT, ((String)yysv[yysp-3]), ((String)yysv[yysp-1])); }
        yysv[yysp-=3] = yyrv;
        return yypfloat_expr();
    }

    private int yyr76() { // float_expr : integer '*' float_expr
        { yyrv = instr("*", InstructionType.OPERATION, ReturnType.FLOAT, ((String)yysv[yysp-3]), ((String)yysv[yysp-1])); }
        yysv[yysp-=3] = yyrv;
        return yypfloat_expr();
    }

    private int yyr77() { // float_expr : float_expr '*' float_expr
        { yyrv = instr("*", InstructionType.OPERATION, ReturnType.FLOAT, ((String)yysv[yysp-3]), ((String)yysv[yysp-1])); }
        yysv[yysp-=3] = yyrv;
        return yypfloat_expr();
    }

    private int yyr78() { // float_expr : float_expr '/' float
        { yyrv = instr("/", InstructionType.OPERATION, ReturnType.FLOAT, ((String)yysv[yysp-3]), ((String)yysv[yysp-1])); }
        yysv[yysp-=3] = yyrv;
        return yypfloat_expr();
    }

    private int yyr79() { // float_expr : float_expr '/' integer
        { yyrv = instr("/", InstructionType.OPERATION, ReturnType.FLOAT, ((String)yysv[yysp-3]), ((String)yysv[yysp-1])); }
        yysv[yysp-=3] = yyrv;
        return yypfloat_expr();
    }

    private int yyr80() { // float_expr : float '/' float_expr
        { yyrv = instr("/", InstructionType.OPERATION, ReturnType.FLOAT, ((String)yysv[yysp-3]), ((String)yysv[yysp-1])); }
        yysv[yysp-=3] = yyrv;
        return yypfloat_expr();
    }

    private int yyr81() { // float_expr : integer '/' float_expr
        { yyrv = instr("/", InstructionType.OPERATION, ReturnType.FLOAT, ((String)yysv[yysp-3]), ((String)yysv[yysp-1])); }
        yysv[yysp-=3] = yyrv;
        return yypfloat_expr();
    }

    private int yyr82() { // float_expr : float_expr '/' float_expr
        { yyrv = instr("/", InstructionType.OPERATION, ReturnType.FLOAT, ((String)yysv[yysp-3]), ((String)yysv[yysp-1])); }
        yysv[yysp-=3] = yyrv;
        return yypfloat_expr();
    }

    private int yyr83() { // float_expr : '(' float_expr ')'
        { yyrv = ((String)yysv[yysp-2]); }
        yysv[yysp-=3] = yyrv;
        return yypfloat_expr();
    }

    private int yyr84() { // float_expr : variable
        { yyrv = ((String)yysv[yysp-1]); }
        yysv[yysp-=1] = yyrv;
        return yypfloat_expr();
    }

    private int yypfloat_expr() {
        switch (yyst[yysp-1]) {
            case 249: return 318;
            case 248: return 317;
            case 247: return 316;
            case 246: return 315;
            case 205: return 318;
            case 204: return 317;
            case 203: return 316;
            case 202: return 315;
            case 197: return 305;
            case 196: return 302;
            case 195: return 299;
            case 194: return 296;
            case 193: return 294;
            case 192: return 293;
            case 191: return 292;
            case 190: return 291;
            case 152: return 211;
            case 100: return 211;
            case 96: return 211;
            default: return 89;
        }
    }

    private int yyr49() { // float_value : float_value '+' integer_value
        { yyrv = ((Float)yysv[yysp-3]) + ((Integer)yysv[yysp-1]); }
        yysv[yysp-=3] = yyrv;
        return yypfloat_value();
    }

    private int yyr50() { // float_value : integer_value '+' float_value
        { yyrv = ((Integer)yysv[yysp-3]) + ((Float)yysv[yysp-1]); }
        yysv[yysp-=3] = yyrv;
        return yypfloat_value();
    }

    private int yyr51() { // float_value : float_value '+' float_value
        { yyrv = ((Float)yysv[yysp-3]) + ((Float)yysv[yysp-1]); }
        yysv[yysp-=3] = yyrv;
        return yypfloat_value();
    }

    private int yyr52() { // float_value : float_value '-' integer_value
        { yyrv = ((Float)yysv[yysp-3]) - ((Integer)yysv[yysp-1]); }
        yysv[yysp-=3] = yyrv;
        return yypfloat_value();
    }

    private int yyr53() { // float_value : integer_value '-' float_value
        { yyrv = ((Integer)yysv[yysp-3]) - ((Float)yysv[yysp-1]); }
        yysv[yysp-=3] = yyrv;
        return yypfloat_value();
    }

    private int yyr54() { // float_value : float_value '-' float_value
        { yyrv = ((Float)yysv[yysp-3]) - ((Float)yysv[yysp-1]); }
        yysv[yysp-=3] = yyrv;
        return yypfloat_value();
    }

    private int yyr55() { // float_value : float_value '*' integer_value
        { yyrv = ((Float)yysv[yysp-3]) * ((Integer)yysv[yysp-1]); }
        yysv[yysp-=3] = yyrv;
        return yypfloat_value();
    }

    private int yyr56() { // float_value : integer_value '*' float_value
        { yyrv = ((Integer)yysv[yysp-3]) * ((Float)yysv[yysp-1]); }
        yysv[yysp-=3] = yyrv;
        return yypfloat_value();
    }

    private int yyr57() { // float_value : float_value '*' float_value
        { yyrv = ((Float)yysv[yysp-3]) * ((Float)yysv[yysp-1]); }
        yysv[yysp-=3] = yyrv;
        return yypfloat_value();
    }

    private int yyr58() { // float_value : float_value '/' integer_value
        { yyrv = ((Float)yysv[yysp-3]) / ((Integer)yysv[yysp-1]); }
        yysv[yysp-=3] = yyrv;
        return yypfloat_value();
    }

    private int yyr59() { // float_value : integer_value '/' float_value
        { yyrv = ((Integer)yysv[yysp-3]) / ((Float)yysv[yysp-1]); }
        yysv[yysp-=3] = yyrv;
        return yypfloat_value();
    }

    private int yyr60() { // float_value : float_value '/' float_value
        { yyrv = ((Float)yysv[yysp-3]) / ((Float)yysv[yysp-1]); }
        yysv[yysp-=3] = yyrv;
        return yypfloat_value();
    }

    private int yyr61() { // float_value : '(' float_value ')'
        { yyrv = ((Float)yysv[yysp-2]); }
        yysv[yysp-=3] = yyrv;
        return yypfloat_value();
    }

    private int yyr62() { // float_value : FLOAT
        { yyrv = ((Float)yysv[yysp-1]); }
        yysv[yysp-=1] = yyrv;
        return yypfloat_value();
    }

    private int yypfloat_value() {
        switch (yyst[yysp-1]) {
            case 264: return 159;
            case 263: return 159;
            case 262: return 368;
            case 261: return 366;
            case 260: return 364;
            case 259: return 362;
            case 258: return 360;
            case 257: return 358;
            case 256: return 356;
            case 255: return 354;
            case 254: return 352;
            case 253: return 350;
            case 209: return 325;
            case 208: return 323;
            case 207: return 321;
            case 206: return 319;
            case 201: return 313;
            case 200: return 311;
            case 199: return 309;
            case 198: return 307;
            case 166: return 265;
            case 165: return 159;
            case 164: return 159;
            case 163: return 261;
            case 162: return 259;
            case 161: return 257;
            case 152: return 212;
            case 100: return 212;
            case 96: return 212;
            case 70: return 159;
            default: return 90;
        }
    }

    private int yyr107() { // instr_arg : val_proc1
        { yyrv = arguments.instrArg(((String)yysv[yysp-1])); }
        yysv[yysp-=1] = yyrv;
        return 215;
    }

    private int yyr108() { // instr_arg : val_proc2
        { yyrv = arguments.instrArg(((String)yysv[yysp-1])); }
        yysv[yysp-=1] = yyrv;
        return 215;
    }

    private int yyr109() { // instr_arg : val_proc_p
        { yyrv = arguments.instrArg(((String)yysv[yysp-1])); }
        yysv[yysp-=1] = yyrv;
        return 215;
    }

    private int yyr110() { // instr_arg : val_proc_1p
        { yyrv = arguments.instrArg(((String)yysv[yysp-1])); }
        yysv[yysp-=1] = yyrv;
        return 215;
    }

    private int yyr111() { // instr_arg : val_proc_n
        { yyrv = arguments.instrArg(((String)yysv[yysp-1])); }
        yysv[yysp-=1] = yyrv;
        return 215;
    }

    private int yyr23() { // integer : integer_value
        { yyrv = arguments.intArg(((Integer)yysv[yysp-1])); }
        yysv[yysp-=1] = yyrv;
        switch (yyst[yysp-1]) {
            case 249: return 150;
            case 248: return 150;
            case 247: return 150;
            case 246: return 150;
            case 239: return 78;
            case 224: return 78;
            case 222: return 150;
            case 205: return 213;
            case 204: return 213;
            case 203: return 213;
            case 202: return 213;
            case 197: return 306;
            case 196: return 303;
            case 195: return 300;
            case 194: return 297;
            case 193: return 150;
            case 192: return 150;
            case 191: return 150;
            case 190: return 150;
            case 182: return 282;
            case 181: return 280;
            case 180: return 278;
            case 179: return 276;
            case 178: return 187;
            case 177: return 187;
            case 176: return 187;
            case 175: return 187;
            case 154: return 78;
            case 152: return 150;
            case 141: return 150;
            case 140: return 78;
            case 139: return 78;
            case 137: return 78;
            case 134: return 78;
            case 103: return 78;
            case 102: return 150;
            case 100: return 213;
            case 96: return 213;
            case 85: return 187;
            case 65: return 78;
            case 64: return 78;
            case 63: return 78;
            case 62: return 150;
            case 61: return 78;
            case 54: return 78;
            case 36: return 78;
            case 24: return 78;
            case 23: return 78;
            default: return 91;
        }
    }

    private int yyr24() { // integer_arg : integer
        yysp -= 1;
        return yypinteger_arg();
    }

    private int yyr25() { // integer_arg : integer_expr
        yysp -= 1;
        return yypinteger_arg();
    }

    private int yypinteger_arg() {
        switch (yyst[yysp-1]) {
            case 239: return 345;
            case 233: return 338;
            case 232: return 224;
            case 224: return 224;
            case 171: return 224;
            case 170: return 224;
            case 154: return 251;
            case 142: return 224;
            case 140: return 242;
            case 139: return 241;
            case 137: return 240;
            case 134: return 239;
            case 110: return 224;
            case 103: return 224;
            case 72: return 103;
            case 65: return 155;
            case 64: return 154;
            case 63: return 153;
            case 61: return 148;
            case 58: return 103;
            case 56: return 140;
            case 54: return 137;
            case 45: return 121;
            case 36: return 111;
            case 32: return 103;
            case 25: return 92;
            case 24: return 86;
            case 23: return 79;
            default: return 98;
        }
    }

    private int yyr32() { // integer_expr : integer_expr '+' integer
        { yyrv = instr("+", InstructionType.OPERATION, ReturnType.INTEGER, ((String)yysv[yysp-3]), ((String)yysv[yysp-1])); }
        yysv[yysp-=3] = yyrv;
        return yypinteger_expr();
    }

    private int yyr33() { // integer_expr : integer '+' integer_expr
        { yyrv = instr("+", InstructionType.OPERATION, ReturnType.INTEGER, ((String)yysv[yysp-3]), ((String)yysv[yysp-1])); }
        yysv[yysp-=3] = yyrv;
        return yypinteger_expr();
    }

    private int yyr34() { // integer_expr : integer_expr '+' integer_expr
        { yyrv = instr("+", InstructionType.OPERATION, ReturnType.INTEGER, ((String)yysv[yysp-3]), ((String)yysv[yysp-1])); }
        yysv[yysp-=3] = yyrv;
        return yypinteger_expr();
    }

    private int yyr35() { // integer_expr : integer_expr '-' integer
        { yyrv = instr("-", InstructionType.OPERATION, ReturnType.INTEGER, ((String)yysv[yysp-3]), ((String)yysv[yysp-1])); }
        yysv[yysp-=3] = yyrv;
        return yypinteger_expr();
    }

    private int yyr36() { // integer_expr : integer '-' integer_expr
        { yyrv = instr("-", InstructionType.OPERATION, ReturnType.INTEGER, ((String)yysv[yysp-3]), ((String)yysv[yysp-1])); }
        yysv[yysp-=3] = yyrv;
        return yypinteger_expr();
    }

    private int yyr37() { // integer_expr : integer_expr '-' integer_expr
        { yyrv = instr("-", InstructionType.OPERATION, ReturnType.INTEGER, ((String)yysv[yysp-3]), ((String)yysv[yysp-1])); }
        yysv[yysp-=3] = yyrv;
        return yypinteger_expr();
    }

    private int yyr38() { // integer_expr : integer_expr '*' integer
        { yyrv = instr("*", InstructionType.OPERATION, ReturnType.INTEGER, ((String)yysv[yysp-3]), ((String)yysv[yysp-1])); }
        yysv[yysp-=3] = yyrv;
        return yypinteger_expr();
    }

    private int yyr39() { // integer_expr : integer '*' integer_expr
        { yyrv = instr("*", InstructionType.OPERATION, ReturnType.INTEGER, ((String)yysv[yysp-3]), ((String)yysv[yysp-1])); }
        yysv[yysp-=3] = yyrv;
        return yypinteger_expr();
    }

    private int yyr40() { // integer_expr : integer_expr '*' integer_expr
        { yyrv = instr("*", InstructionType.OPERATION, ReturnType.INTEGER, ((String)yysv[yysp-3]), ((String)yysv[yysp-1])); }
        yysv[yysp-=3] = yyrv;
        return yypinteger_expr();
    }

    private int yyr41() { // integer_expr : integer_expr '/' integer
        { yyrv = instr("/", InstructionType.OPERATION, ReturnType.INTEGER, ((String)yysv[yysp-3]), ((String)yysv[yysp-1])); }
        yysv[yysp-=3] = yyrv;
        return yypinteger_expr();
    }

    private int yyr42() { // integer_expr : integer '/' integer_expr
        { yyrv = instr("/", InstructionType.OPERATION, ReturnType.INTEGER, ((String)yysv[yysp-3]), ((String)yysv[yysp-1])); }
        yysv[yysp-=3] = yyrv;
        return yypinteger_expr();
    }

    private int yyr43() { // integer_expr : integer_expr '/' integer_expr
        { yyrv = instr("/", InstructionType.OPERATION, ReturnType.INTEGER, ((String)yysv[yysp-3]), ((String)yysv[yysp-1])); }
        yysv[yysp-=3] = yyrv;
        return yypinteger_expr();
    }

    private int yyr44() { // integer_expr : '(' integer_expr ')'
        { yyrv = ((String)yysv[yysp-2]); }
        yysv[yysp-=3] = yyrv;
        return yypinteger_expr();
    }

    private int yyr45() { // integer_expr : variable
        { yyrv = ((String)yysv[yysp-1]); }
        yysv[yysp-=1] = yyrv;
        return yypinteger_expr();
    }

    private int yypinteger_expr() {
        switch (yyst[yysp-1]) {
            case 205: return 275;
            case 204: return 274;
            case 203: return 273;
            case 202: return 272;
            case 182: return 283;
            case 181: return 281;
            case 180: return 279;
            case 179: return 277;
            case 178: return 275;
            case 177: return 274;
            case 176: return 273;
            case 175: return 272;
            case 100: return 188;
            case 96: return 188;
            case 85: return 188;
            default: return 80;
        }
    }

    private int yyr26() { // integer_value : integer_value '+' integer_value
        { yyrv = ((Integer)yysv[yysp-3]) + ((Integer)yysv[yysp-1]); }
        yysv[yysp-=3] = yyrv;
        return yypinteger_value();
    }

    private int yyr27() { // integer_value : integer_value '-' integer_value
        { yyrv = ((Integer)yysv[yysp-3]) - ((Integer)yysv[yysp-1]); }
        yysv[yysp-=3] = yyrv;
        return yypinteger_value();
    }

    private int yyr28() { // integer_value : integer_value '*' integer_value
        { yyrv = ((Integer)yysv[yysp-3]) * ((Integer)yysv[yysp-1]); }
        yysv[yysp-=3] = yyrv;
        return yypinteger_value();
    }

    private int yyr29() { // integer_value : integer_value '/' integer_value
        { yyrv = (((Integer)yysv[yysp-3]) / ((Integer)yysv[yysp-1])); }
        yysv[yysp-=3] = yyrv;
        return yypinteger_value();
    }

    private int yyr30() { // integer_value : '(' integer_value ')'
        { yyrv = ((Integer)yysv[yysp-2]); }
        yysv[yysp-=3] = yyrv;
        return yypinteger_value();
    }

    private int yyr31() { // integer_value : INTEGER
        { yyrv = ((Integer)yysv[yysp-1]); }
        yysv[yysp-=1] = yyrv;
        return yypinteger_value();
    }

    private int yypinteger_value() {
        switch (yyst[yysp-1]) {
            case 285: return 377;
            case 264: return 160;
            case 263: return 160;
            case 262: return 369;
            case 261: return 367;
            case 260: return 365;
            case 259: return 363;
            case 258: return 361;
            case 257: return 359;
            case 256: return 357;
            case 255: return 355;
            case 254: return 353;
            case 253: return 351;
            case 239: return 81;
            case 224: return 81;
            case 209: return 326;
            case 208: return 324;
            case 207: return 322;
            case 206: return 320;
            case 201: return 314;
            case 200: return 312;
            case 199: return 310;
            case 198: return 308;
            case 186: return 288;
            case 185: return 287;
            case 184: return 286;
            case 183: return 284;
            case 182: return 81;
            case 181: return 81;
            case 180: return 81;
            case 179: return 81;
            case 178: return 81;
            case 177: return 81;
            case 176: return 81;
            case 175: return 81;
            case 166: return 266;
            case 165: return 160;
            case 164: return 160;
            case 163: return 262;
            case 162: return 260;
            case 161: return 258;
            case 154: return 81;
            case 152: return 214;
            case 140: return 81;
            case 139: return 81;
            case 137: return 81;
            case 134: return 81;
            case 103: return 81;
            case 100: return 214;
            case 96: return 214;
            case 85: return 189;
            case 70: return 160;
            case 65: return 81;
            case 64: return 81;
            case 63: return 81;
            case 61: return 81;
            case 54: return 81;
            case 36: return 81;
            case 24: return 81;
            case 23: return 81;
            default: return 93;
        }
    }

    private int yyr168() { // n_args : argument n_args
        { paramsList.add(((String)yysv[yysp-2])); }
        yysv[yysp-=2] = yyrv;
        return yypn_args();
    }

    private int yyr169() { // n_args : argument
        { paramsList.add(((String)yysv[yysp-1])); }
        yysv[yysp-=1] = yyrv;
        return yypn_args();
    }

    private int yypn_args() {
        switch (yyst[yysp-1]) {
            case 107: return 226;
            case 101: return 221;
            case 72: return 167;
            case 58: return 143;
            case 32: return 104;
            default: return 117;
        }
    }

    private int yyr172() { // n_float_args : float_arg n_float_args
        { paramsList.add(((String)yysv[yysp-2])); }
        yysv[yysp-=2] = yyrv;
        return yypn_float_args();
    }

    private int yyr173() { // n_float_args : float_arg
        { paramsList.add(((String)yysv[yysp-1])); }
        yysv[yysp-=1] = yyrv;
        return yypn_float_args();
    }

    private int yypn_float_args() {
        switch (yyst[yysp-1]) {
            case 232: return 335;
            case 171: return 269;
            case 170: return 267;
            case 142: return 244;
            case 110: return 230;
            case 72: return 168;
            case 58: return 144;
            case 32: return 105;
            default: return 223;
        }
    }

    private int yyr174() { // n_instr : expression n_instr
        { instrList.add(((String)yysv[yysp-2])); }
        yysv[yysp-=2] = yyrv;
        return yypn_instr();
    }

    private int yyr175() { // n_instr : expression
        { instrList.add(((String)yysv[yysp-1])); }
        yysv[yysp-=1] = yyrv;
        return yypn_instr();
    }

    private int yypn_instr() {
        switch (yyst[yysp-1]) {
            case 250: return 348;
            case 237: return 342;
            case 235: return 340;
            case 122: return 236;
            default: return 349;
        }
    }

    private int yyr170() { // n_int_args : integer_arg n_int_args
        { paramsList.add(((String)yysv[yysp-2])); }
        yysv[yysp-=2] = yyrv;
        return yypn_int_args();
    }

    private int yyr171() { // n_int_args : integer_arg
        { paramsList.add(((String)yysv[yysp-1])); }
        yysv[yysp-=1] = yyrv;
        return yypn_int_args();
    }

    private int yypn_int_args() {
        switch (yyst[yysp-1]) {
            case 232: return 336;
            case 171: return 270;
            case 170: return 268;
            case 142: return 245;
            case 110: return 231;
            case 72: return 169;
            case 58: return 145;
            case 32: return 106;
            default: return 225;
        }
    }

    private int yyr204() { // n_params : IDENTIFIER n_params
        { paramsList.add(((String)yysv[yysp-2])); }
        yysv[yysp-=2] = yyrv;
        return yypn_params();
    }

    private int yyr205() { // n_params : IDENTIFIER
        { paramsList.add(((String)yysv[yysp-1])); }
        yysv[yysp-=1] = yyrv;
        return yypn_params();
    }

    private int yypn_params() {
        switch (yyst[yysp-1]) {
            case 122: return 237;
            default: return 343;
        }
    }

    private int yyr127() { // proc : OCULTATORTUGA
        { yyrv = instr("ocultatortuga", InstructionType.NORMAL, ReturnType.VOID); }
        yysv[yysp-=1] = yyrv;
        return 4;
    }

    private int yyr128() { // proc : OT
        { yyrv = instr("ocultatortuga", InstructionType.NORMAL, ReturnType.VOID); }
        yysv[yysp-=1] = yyrv;
        return 4;
    }

    private int yyr129() { // proc : APARECETORTUGA
        { yyrv = instr("aparecetoruga", InstructionType.NORMAL, ReturnType.VOID); }
        yysv[yysp-=1] = yyrv;
        return 4;
    }

    private int yyr130() { // proc : AT
        { yyrv = instr("aparecetoruga", InstructionType.NORMAL, ReturnType.VOID); }
        yysv[yysp-=1] = yyrv;
        return 4;
    }

    private int yyr131() { // proc : BAJALAPIZ
        { yyrv = instr("bajalapiz", InstructionType.NORMAL, ReturnType.VOID); }
        yysv[yysp-=1] = yyrv;
        return 4;
    }

    private int yyr132() { // proc : BL
        { yyrv = instr("bajalapiz", InstructionType.NORMAL, ReturnType.VOID); }
        yysv[yysp-=1] = yyrv;
        return 4;
    }

    private int yyr133() { // proc : SUBELAPIZ
        { yyrv = instr("subelapiz", InstructionType.NORMAL, ReturnType.VOID); }
        yysv[yysp-=1] = yyrv;
        return 4;
    }

    private int yyr134() { // proc : SB
        { yyrv = instr("subelapiz", InstructionType.NORMAL, ReturnType.VOID); }
        yysv[yysp-=1] = yyrv;
        return 4;
    }

    private int yyr135() { // proc : CENTRO
        { yyrv = instr("centro", InstructionType.NORMAL, ReturnType.VOID); }
        yysv[yysp-=1] = yyrv;
        return 4;
    }

    private int yyr136() { // proc : BORRAPANTALLA
        { yyrv = instr("borrapantalla", InstructionType.NORMAL, ReturnType.VOID); }
        yysv[yysp-=1] = yyrv;
        return 4;
    }

    private int yyr137() { // proc : RUMBO
        { yyrv = instr("print", InstructionType.NORMAL, ReturnType.VOID, arguments.varArg("rumbo")); }
        yysv[yysp-=1] = yyrv;
        return 4;
    }

    private int yyr138() { // proc1 : AVANZA integer_arg
        { yyrv = instr("avanza", InstructionType.NORMAL, ReturnType.VOID, ((String)yysv[yysp-1])); }
        yysv[yysp-=2] = yyrv;
        return 5;
    }

    private int yyr139() { // proc1 : AV integer_arg
        { yyrv = instr("avanza", InstructionType.NORMAL, ReturnType.VOID, ((String)yysv[yysp-1])); }
        yysv[yysp-=2] = yyrv;
        return 5;
    }

    private int yyr140() { // proc1 : RETROCEDE integer_arg
        { yyrv = instr("retrocede", InstructionType.NORMAL, ReturnType.VOID, ((String)yysv[yysp-1])); }
        yysv[yysp-=2] = yyrv;
        return 5;
    }

    private int yyr141() { // proc1 : RE integer_arg
        { yyrv = instr("retrocede", InstructionType.NORMAL, ReturnType.VOID, ((String)yysv[yysp-1])); }
        yysv[yysp-=2] = yyrv;
        return 5;
    }

    private int yyr142() { // proc1 : GIRADERECHA argument
        { yyrv = instr("giraderecha", InstructionType.NORMAL, ReturnType.VOID, ((String)yysv[yysp-1])); }
        yysv[yysp-=2] = yyrv;
        return 5;
    }

    private int yyr143() { // proc1 : GD argument
        { yyrv = instr("giraderecha", InstructionType.NORMAL, ReturnType.VOID, ((String)yysv[yysp-1])); }
        yysv[yysp-=2] = yyrv;
        return 5;
    }

    private int yyr144() { // proc1 : GIRAIZQUIERDA argument
        { yyrv = instr("giraizquierda", InstructionType.NORMAL, ReturnType.VOID, ((String)yysv[yysp-1])); }
        yysv[yysp-=2] = yyrv;
        return 5;
    }

    private int yyr145() { // proc1 : GI argument
        { yyrv = instr("giraizquierda", InstructionType.NORMAL, ReturnType.VOID, ((String)yysv[yysp-1])); }
        yysv[yysp-=2] = yyrv;
        return 5;
    }

    private int yyr146() { // proc1 : PONRUMBO argument
        { yyrv = instr("ponrumbo", InstructionType.NORMAL, ReturnType.VOID, ((String)yysv[yysp-1])); }
        yysv[yysp-=2] = yyrv;
        return 5;
    }

    private int yyr147() { // proc1 : PONX argument
        { yyrv = instr("ponx", InstructionType.NORMAL, ReturnType.VOID, ((String)yysv[yysp-1])); }
        yysv[yysp-=2] = yyrv;
        return 5;
    }

    private int yyr148() { // proc1 : PONY argument
        { yyrv = instr("pony", InstructionType.NORMAL, ReturnType.VOID, ((String)yysv[yysp-1])); }
        yysv[yysp-=2] = yyrv;
        return 5;
    }

    private int yyr149() { // proc1 : PONCOLORLAPIZ color
        { yyrv = instr("poncl", InstructionType.NORMAL, ReturnType.VOID, ((String)yysv[yysp-1])); }
        yysv[yysp-=2] = yyrv;
        return 5;
    }

    private int yyr150() { // proc1 : PONCL color
        { yyrv = instr("poncl", InstructionType.NORMAL, ReturnType.VOID, ((String)yysv[yysp-1])); }
        yysv[yysp-=2] = yyrv;
        return 5;
    }

    private int yyr151() { // proc1 : ESPERA argument
        { yyrv = instr("espera", InstructionType.NORMAL, ReturnType.VOID, ((String)yysv[yysp-1])); }
        yysv[yysp-=2] = yyrv;
        return 5;
    }

    private int yyr162() { // proc2 : PONXY integer_arg integer_arg
        { yyrv = instr("ponxy", InstructionType.NORMAL, ReturnType.VOID, ((String)yysv[yysp-2]), ((String)yysv[yysp-1])); }
        yysv[yysp-=3] = yyrv;
        return 6;
    }

    private int yyr203() { // proc_cond : SI boolean_value '[' n_instr ']'
        {
        paramsList.add(arguments.boolArg(((Boolean)yysv[yysp-4])));
        instrList = reverse(instrList);
        yyrv = instr("si", InstructionType.CONDITION, ReturnType.VOID, paramsList, instrList);
        paramsList.clear();
        instrList.clear();
    }
        yysv[yysp-=5] = yyrv;
        return 7;
    }

    private int yyr201() { // proc_exec : EJECUTA '[' exec_instr ']'
        { /* No hacer nada */ }
        yysv[yysp-=4] = yyrv;
        return 8;
    }

    private int yyr202() { // proc_loop : REPITE integer_arg '[' n_instr ']'
        { 
        paramsList.add(((String)yysv[yysp-4]));
        instrList = reverse(instrList);
        yyrv = instr("repite", InstructionType.CYCLE, ReturnType.VOID, paramsList, instrList); 
        paramsList.clear();
        instrList.clear(); 
    }
        yysv[yysp-=5] = yyrv;
        return 9;
    }

    private int yyr185() { // proc_p : INC '[' variable integer_arg ']'
        { yyrv = instr("inc", InstructionType.VARIABLE, ReturnType.VOID, ((String)yysv[yysp-3]), ((String)yysv[yysp-2])); }
        yysv[yysp-=5] = yyrv;
        return 10;
    }

    private int yyr186() { // proc_p : INC '[' variable float_arg ']'
        { yyrv = instr("inc", InstructionType.VARIABLE, ReturnType.VOID, ((String)yysv[yysp-3]), ((String)yysv[yysp-2])); }
        yysv[yysp-=5] = yyrv;
        return 10;
    }

    private int yyr187() { // proc_p : PONPOS '[' integer_arg integer_arg ']'
        { yyrv = instr("ponpos", InstructionType.NORMAL, ReturnType.VOID, ((String)yysv[yysp-3]), ((String)yysv[yysp-2])); }
        yysv[yysp-=5] = yyrv;
        return 10;
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

    private int yyr4() { // program : special_expr ';' program
        { /* No hacer nada */ }
        yysv[yysp-=3] = yyrv;
        return yypprogram();
    }

    private int yyr5() { // program : special_expr ';'
        { /* No hacer nada */ }
        yysv[yysp-=2] = yyrv;
        return yypprogram();
    }

    private int yypprogram() {
        switch (yyst[yysp-1]) {
            case 76: return 173;
            case 0: return 11;
            default: return 174;
        }
    }

    private int yyr112() { // argument : integer_arg
        yysp -= 1;
        return yypargument();
    }

    private int yyr113() { // argument : float_arg
        yysp -= 1;
        return yypargument();
    }

    private int yyr114() { // argument : '(' instr_arg ')'
        yysp -= 3;
        return yypargument();
    }

    private int yypargument() {
        switch (yyst[yysp-1]) {
            case 271: return 376;
            case 234: return 339;
            case 108: return 227;
            case 69: return 157;
            case 68: return 156;
            case 60: return 147;
            case 59: return 146;
            case 56: return 141;
            case 55: return 138;
            case 53: return 136;
            case 52: return 135;
            case 41: return 116;
            case 40: return 115;
            case 39: return 114;
            case 38: return 113;
            case 37: return 112;
            case 33: return 108;
            case 30: return 99;
            default: return 107;
        }
    }

    private int yyr117() { // redeclaration_expr : INIC IDENTIFIER '=' argument
        { yyrv = instr("inic", InstructionType.VARIABLE, ReturnType.VOID, arguments.stringArg(((String)yysv[yysp-3])), ((String)yysv[yysp-1])); }
        yysv[yysp-=4] = yyrv;
        return 12;
    }

    private int yyr6() { // special_expr : user_proc
        yysp -= 1;
        return 13;
    }

    private int yyr7() { // special_expr : proc_exec
        { for (String instr: instrList) { instructions.add(instr); } instrList.clear(); }
        yysv[yysp-=1] = yyrv;
        return 13;
    }

    private int yyr206() { // user_proc : PARA IDENTIFIER n_params n_instr FIN
        {
        instrList = reverse(instrList);
        procedures.add(((String)yysv[yysp-4]), paramsList, instrList);
        paramsList.clear();
        instrList.clear();
    }
        yysv[yysp-=5] = yyrv;
        return 14;
    }

    private int yyr207() { // user_proc : PARA IDENTIFIER n_instr FIN
        {
        instrList = reverse(instrList);
        procedures.add(((String)yysv[yysp-3]), instrList);
        instrList.clear();
    }
        yysv[yysp-=4] = yyrv;
        return 14;
    }

    private int yyr208() { // user_proc_call : IDENTIFIER n_args
        { yyrv = instr(((String)yysv[yysp-2]), InstructionType.PROCEDURE, ReturnType.VOID, paramsList); paramsList.clear(); }
        yysv[yysp-=2] = yyrv;
        return 15;
    }

    private int yyr209() { // user_proc_call : IDENTIFIER
        { yyrv = instr(((String)yysv[yysp-1]), InstructionType.PROCEDURE, ReturnType.VOID); }
        yysv[yysp-=1] = yyrv;
        return 15;
    }

    private int yyr152() { // val_proc1 : REDONDEA float_arg
        { yyrv = instr("redondea", InstructionType.NORMAL, ReturnType.INTEGER, ((String)yysv[yysp-1])); }
        yysv[yysp-=2] = yyrv;
        return yypval_proc1();
    }

    private int yyr153() { // val_proc1 : AZAR integer_arg
        { yyrv = instr("azar", InstructionType.NORMAL, ReturnType.INTEGER, ((String)yysv[yysp-1])); }
        yysv[yysp-=2] = yyrv;
        return yypval_proc1();
    }

    private int yyr154() { // val_proc1 : AZAR float_arg
        { yyrv = instr("azar", InstructionType.NORMAL, ReturnType.FLOAT, ((String)yysv[yysp-1])); }
        yysv[yysp-=2] = yyrv;
        return yypval_proc1();
    }

    private int yyr155() { // val_proc1 : MENOS integer_arg
        { yyrv = instr("menos", InstructionType.NORMAL, ReturnType.INTEGER, ((String)yysv[yysp-1])); }
        yysv[yysp-=2] = yyrv;
        return yypval_proc1();
    }

    private int yyr156() { // val_proc1 : MENOS float_arg
        { yyrv = instr("menos", InstructionType.NORMAL, ReturnType.FLOAT, ((String)yysv[yysp-1])); }
        yysv[yysp-=2] = yyrv;
        return yypval_proc1();
    }

    private int yyr157() { // val_proc1 : COS argument
        { yyrv = instr("cos", InstructionType.NORMAL, ReturnType.FLOAT, ((String)yysv[yysp-1])); }
        yysv[yysp-=2] = yyrv;
        return yypval_proc1();
    }

    private int yyr158() { // val_proc1 : RAIZCUADRADA argument
        { yyrv = instr("raiz", InstructionType.NORMAL, ReturnType.FLOAT, ((String)yysv[yysp-1])); }
        yysv[yysp-=2] = yyrv;
        return yypval_proc1();
    }

    private int yyr159() { // val_proc1 : RC argument
        { yyrv = instr("raiz", InstructionType.NORMAL, ReturnType.FLOAT, ((String)yysv[yysp-1])); }
        yysv[yysp-=2] = yyrv;
        return yypval_proc1();
    }

    private int yyr160() { // val_proc1 : SENO argument
        { yyrv = instr("seno", InstructionType.NORMAL, ReturnType.FLOAT, ((String)yysv[yysp-1])); }
        yysv[yysp-=2] = yyrv;
        return yypval_proc1();
    }

    private int yyr161() { // val_proc1 : SEN argument
        { yyrv = instr("seno", InstructionType.NORMAL, ReturnType.FLOAT, ((String)yysv[yysp-1])); }
        yysv[yysp-=2] = yyrv;
        return yypval_proc1();
    }

    private int yypval_proc1() {
        switch (yyst[yysp-1]) {
            case 100: return 216;
            default: return 16;
        }
    }

    private int yyr163() { // val_proc2 : POTENCIA integer_arg integer_arg
        { yyrv = instr("potencia", InstructionType.NORMAL, ReturnType.INTEGER, ((String)yysv[yysp-2]), ((String)yysv[yysp-1])); }
        yysv[yysp-=3] = yyrv;
        return yypval_proc2();
    }

    private int yyr164() { // val_proc2 : POTENCIA float_arg integer_arg
        { yyrv = instr("potencia", InstructionType.NORMAL, ReturnType.FLOAT, ((String)yysv[yysp-2]), ((String)yysv[yysp-1])); }
        yysv[yysp-=3] = yyrv;
        return yypval_proc2();
    }

    private int yyr165() { // val_proc2 : POTENCIA argument float_arg
        { yyrv = instr("potencia", InstructionType.NORMAL, ReturnType.FLOAT, ((String)yysv[yysp-2]), ((String)yysv[yysp-1])); }
        yysv[yysp-=3] = yyrv;
        return yypval_proc2();
    }

    private int yyr166() { // val_proc2 : RESTO integer_arg integer_arg
        { yyrv = instr("resto", InstructionType.NORMAL, ReturnType.INTEGER, ((String)yysv[yysp-2]), ((String)yysv[yysp-1])); }
        yysv[yysp-=3] = yyrv;
        return yypval_proc2();
    }

    private int yyr167() { // val_proc2 : DIVISION argument argument
        { yyrv = instr("division", InstructionType.NORMAL, ReturnType.FLOAT, ((String)yysv[yysp-2]), ((String)yysv[yysp-1])); }
        yysv[yysp-=3] = yyrv;
        return yypval_proc2();
    }

    private int yypval_proc2() {
        switch (yyst[yysp-1]) {
            case 100: return 217;
            default: return 17;
        }
    }

    private int yyr197() { // val_proc_1p : ELEMENTO integer_arg '[' n_int_args ']'
        { yyrv = instr("elemento", InstructionType.NORMAL, ReturnType.INTEGER, paramsList); paramsList.clear(); }
        yysv[yysp-=5] = yyrv;
        return yypval_proc_1p();
    }

    private int yyr198() { // val_proc_1p : ELEMENTO integer_arg '[' n_float_args ']'
        { yyrv = instr("elemento", InstructionType.NORMAL, ReturnType.FLOAT, paramsList); paramsList.clear(); }
        yysv[yysp-=5] = yyrv;
        return yypval_proc_1p();
    }

    private int yypval_proc_1p() {
        switch (yyst[yysp-1]) {
            case 100: return 218;
            default: return 18;
        }
    }

    private int yyr176() { // val_proc_n : DIFERENCIA n_int_args
        { yyrv = instr("diferencia", InstructionType.NORMAL, ReturnType.INTEGER, paramsList); paramsList.clear(); }
        yysv[yysp-=2] = yyrv;
        return yypval_proc_n();
    }

    private int yyr177() { // val_proc_n : DIFERENCIA n_float_args
        { yyrv = instr("diferencia", InstructionType.NORMAL, ReturnType.FLOAT, paramsList); paramsList.clear(); }
        yysv[yysp-=2] = yyrv;
        return yypval_proc_n();
    }

    private int yyr178() { // val_proc_n : DIFERENCIA n_args
        { yyrv = instr("diferencia", InstructionType.NORMAL, ReturnType.FLOAT, paramsList); paramsList.clear(); }
        yysv[yysp-=2] = yyrv;
        return yypval_proc_n();
    }

    private int yyr179() { // val_proc_n : PRODUCTO n_int_args
        { yyrv = instr("producto", InstructionType.NORMAL, ReturnType.INTEGER, paramsList); paramsList.clear(); }
        yysv[yysp-=2] = yyrv;
        return yypval_proc_n();
    }

    private int yyr180() { // val_proc_n : PRODUCTO n_float_args
        { yyrv = instr("producto", InstructionType.NORMAL, ReturnType.FLOAT, paramsList); paramsList.clear(); }
        yysv[yysp-=2] = yyrv;
        return yypval_proc_n();
    }

    private int yyr181() { // val_proc_n : PRODUCTO n_args
        { yyrv = instr("producto", InstructionType.NORMAL, ReturnType.FLOAT, paramsList); paramsList.clear(); }
        yysv[yysp-=2] = yyrv;
        return yypval_proc_n();
    }

    private int yyr182() { // val_proc_n : SUMA n_int_args
        { yyrv = instr("suma", InstructionType.NORMAL, ReturnType.INTEGER, paramsList); paramsList.clear(); }
        yysv[yysp-=2] = yyrv;
        return yypval_proc_n();
    }

    private int yyr183() { // val_proc_n : SUMA n_float_args
        { yyrv = instr("suma", InstructionType.NORMAL, ReturnType.FLOAT, paramsList); paramsList.clear(); }
        yysv[yysp-=2] = yyrv;
        return yypval_proc_n();
    }

    private int yyr184() { // val_proc_n : SUMA n_args
        { yyrv = instr("suma", InstructionType.NORMAL, ReturnType.FLOAT, paramsList); paramsList.clear(); }
        yysv[yysp-=2] = yyrv;
        return yypval_proc_n();
    }

    private int yypval_proc_n() {
        switch (yyst[yysp-1]) {
            case 100: return 219;
            default: return 19;
        }
    }

    private int yyr188() { // val_proc_p : ELEGIR '[' n_int_args ']'
        { yyrv = instr("elegir", InstructionType.NORMAL, ReturnType.INTEGER, paramsList); paramsList.clear(); }
        yysv[yysp-=4] = yyrv;
        return yypval_proc_p();
    }

    private int yyr189() { // val_proc_p : ELEGIR '[' n_float_args ']'
        { yyrv = instr("elegir", InstructionType.NORMAL, ReturnType.FLOAT, paramsList); paramsList.clear(); }
        yysv[yysp-=4] = yyrv;
        return yypval_proc_p();
    }

    private int yyr190() { // val_proc_p : CUENTA '[' n_args ']'
        { yyrv = instr("cuenta", InstructionType.NORMAL, ReturnType.INTEGER, paramsList); paramsList.clear(); }
        yysv[yysp-=4] = yyrv;
        return yypval_proc_p();
    }

    private int yyr191() { // val_proc_p : ULTIMO '[' n_int_args ']'
        { yyrv = instr("ultimo", InstructionType.NORMAL, ReturnType.INTEGER, paramsList); paramsList.clear(); }
        yysv[yysp-=4] = yyrv;
        return yypval_proc_p();
    }

    private int yyr192() { // val_proc_p : ULTIMO '[' n_float_args ']'
        { yyrv = instr("ultimo", InstructionType.NORMAL, ReturnType.FLOAT, paramsList); paramsList.clear(); }
        yysv[yysp-=4] = yyrv;
        return yypval_proc_p();
    }

    private int yyr193() { // val_proc_p : UL '[' n_int_args ']'
        { yyrv = instr("ultimo", InstructionType.NORMAL, ReturnType.INTEGER, paramsList); paramsList.clear(); }
        yysv[yysp-=4] = yyrv;
        return yypval_proc_p();
    }

    private int yyr194() { // val_proc_p : UL '[' n_float_args ']'
        { yyrv = instr("ultimo", InstructionType.NORMAL, ReturnType.FLOAT, paramsList); paramsList.clear(); }
        yysv[yysp-=4] = yyrv;
        return yypval_proc_p();
    }

    private int yyr195() { // val_proc_p : PRIMERO '[' n_int_args ']'
        { yyrv = instr("primero", InstructionType.NORMAL, ReturnType.INTEGER, paramsList); paramsList.clear(); }
        yysv[yysp-=4] = yyrv;
        return yypval_proc_p();
    }

    private int yyr196() { // val_proc_p : PRIMERO '[' n_float_args ']'
        { yyrv = instr("primero", InstructionType.NORMAL, ReturnType.FLOAT, paramsList); paramsList.clear(); }
        yysv[yysp-=4] = yyrv;
        return yypval_proc_p();
    }

    private int yypval_proc_p() {
        switch (yyst[yysp-1]) {
            case 100: return 220;
            default: return 20;
        }
    }

    private int yyr22() { // variable : IDENTIFIER
        { yyrv = arguments.varArg(((String)yysv[yysp-1])); }
        yysv[yysp-=1] = yyrv;
        switch (yyst[yysp-1]) {
            case 249: return 151;
            case 248: return 151;
            case 247: return 151;
            case 246: return 151;
            case 239: return 82;
            case 224: return 82;
            case 222: return 151;
            case 197: return 151;
            case 196: return 151;
            case 195: return 151;
            case 194: return 151;
            case 193: return 151;
            case 192: return 151;
            case 191: return 151;
            case 190: return 151;
            case 182: return 82;
            case 181: return 82;
            case 180: return 82;
            case 179: return 82;
            case 178: return 82;
            case 177: return 82;
            case 176: return 82;
            case 175: return 82;
            case 154: return 82;
            case 152: return 151;
            case 141: return 151;
            case 140: return 82;
            case 139: return 82;
            case 137: return 82;
            case 134: return 82;
            case 118: return 233;
            case 103: return 82;
            case 102: return 151;
            case 85: return 82;
            case 65: return 82;
            case 64: return 82;
            case 63: return 82;
            case 62: return 151;
            case 61: return 82;
            case 54: return 82;
            case 36: return 82;
            case 24: return 82;
            case 23: return 82;
            default: return 94;
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
    private ArrayList<String> paramsList; //Para almacenar par??metros de un procedimiento
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

    public ArrayList<String> reverse(ArrayList<String> _instr) {

            Stack<String> s = new Stack<>();  //create a stack

            //while the queue is not empty
            while(!_instr.isEmpty())
            {  //add the elements of the queue onto a stack
                s.push(_instr.get(0));
                _instr.remove(0);
            }

            //while the stack is not empty
            while(!s.isEmpty())
            { //add the elements in the stack back to the queue
                _instr.add(s.pop());
            }
            return _instr;
        }

    public void yyerror(String msg) {
        if (lexer.isLexerError()) {
            System.err.println(lexer.getErrorMessage());
        } else {
            System.err.println(msg);
        }

        System.out.println("En " + lexer.getSemantic() + ", l??nea " + (lexer.getCurrentLine() + 1) + ". columna " + (lexer.getCurrentColumn() + 1));
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

    /**
     * Funci??n para mostrar un mensaje del compilador en la interfaz.
     */
    public void showMessage(String msg, MessageType type) {
        //TODO: mostrar mensaje del tipo correspondiente en la interfaz.
    }

    public String getRutaCompilado(String filePath) {

        String rutaCompilado = filePath.substring(0, filePath.lastIndexOf(".") + 1) + "cld";
        System.out.println(rutaCompilado);

        ObjectMapper mapper = new ObjectMapper();
        instructions.reverse();
        CompiledFile cFile = new CompiledFile(instructions, procedures);
        
        try {
            File file = new File(rutaCompilado);
            file.createNewFile();

            String compilado = mapper.writeValueAsString(cFile);
            System.out.println("File compiled created: " + file.getName());
            FileWriter writer = new FileWriter(rutaCompilado);
            writer.write(compilado);
            writer.close();
            return rutaCompilado;

        } catch (IOException ex) {
            System.out.println("An error ocurred");
        }

        return null;
    }

    public static String compile(String filePath) {
        String ruta = filePath.replaceAll("\\\\", "/");
        Parser parser = new Parser(ruta);
        parser.parse();
        String rutaCompilado = parser.getRutaCompilado(filePath);

        return rutaCompilado;
    }

    public void parsingDone() {
        System.out.println("Compilaci??n finalizada");

        //TODO: notificar que se finaliz?? la compilaci??n
        variables.printVars();
        procedures.printProcedures();
        instructions.print();
    }

    public static void main(String[] args) {
        String path = "/src/Compiler/Lex/parse.txt";
        String ruta  = System.getProperty("user.dir").replaceAll("\\\\", "/") + path;
        //Parser parser = new Parser(ruta);
        //parser.parse();
        System.out.println(compile(System.getProperty("user.dir") + path));
    }

}
