// Output created by jacc on Tue Aug 04 14:52:31 CST 2020

package Compiler.Jacc;

import Compiler.Lex.Lexer;
import java.io.*;
import Logic.MessageType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;
import com.fasterxml.jackson.databind.ObjectMapper;
import Compiler.Helpers.*;
import Logic.MessageHandler;
import Logic.MessageType;

public

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
                case 472:
                    yyn = yys0();
                    continue;

                case 1:
                    yyst[yysp] = 1;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 473:
                    switch (yytok) {
                        case ENDINPUT:
                            yyn = 944;
                            continue;
                    }
                    yyn = 947;
                    continue;

                case 2:
                    yyst[yysp] = 2;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 474:
                    yyn = yys2();
                    continue;

                case 3:
                    yyst[yysp] = 3;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 475:
                    switch (yytok) {
                        case ';':
                            yyn = 84;
                            continue;
                    }
                    yyn = 947;
                    continue;

                case 4:
                    yyst[yysp] = 4;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 476:
                    yyn = yys4();
                    continue;

                case 5:
                    yyst[yysp] = 5;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 477:
                    yyn = yys5();
                    continue;

                case 6:
                    yyst[yysp] = 6;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 478:
                    yyn = yys6();
                    continue;

                case 7:
                    yyst[yysp] = 7;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 479:
                    yyn = yys7();
                    continue;

                case 8:
                    yyst[yysp] = 8;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 480:
                    yyn = yys8();
                    continue;

                case 9:
                    yyst[yysp] = 9;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 481:
                    yyn = yys9();
                    continue;

                case 10:
                    yyst[yysp] = 10;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 482:
                    yyn = yys10();
                    continue;

                case 11:
                    yyst[yysp] = 11;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 483:
                    yyn = yys11();
                    continue;

                case 12:
                    yyst[yysp] = 12;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 484:
                    yyn = yys12();
                    continue;

                case 13:
                    yyst[yysp] = 13;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 485:
                    yyn = yys13();
                    continue;

                case 14:
                    yyst[yysp] = 14;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 486:
                    yyn = yys14();
                    continue;

                case 15:
                    yyst[yysp] = 15;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 487:
                    yyn = yys15();
                    continue;

                case 16:
                    yyst[yysp] = 16;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 488:
                    yyn = yys16();
                    continue;

                case 17:
                    yyst[yysp] = 17;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 489:
                    yyn = yys17();
                    continue;

                case 18:
                    yyst[yysp] = 18;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 490:
                    yyn = yys18();
                    continue;

                case 19:
                    yyst[yysp] = 19;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 491:
                    yyn = yys19();
                    continue;

                case 20:
                    yyst[yysp] = 20;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 492:
                    yyn = yys20();
                    continue;

                case 21:
                    yyst[yysp] = 21;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 493:
                    switch (yytok) {
                        case ENDINPUT:
                            yyn = yyr1();
                            continue;
                    }
                    yyn = 947;
                    continue;

                case 22:
                    yyst[yysp] = 22;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 494:
                    yyn = yys22();
                    continue;

                case 23:
                    yyst[yysp] = 23;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 495:
                    switch (yytok) {
                        case ';':
                            yyn = 85;
                            continue;
                    }
                    yyn = 947;
                    continue;

                case 24:
                    yyst[yysp] = 24;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 496:
                    yyn = yys24();
                    continue;

                case 25:
                    yyst[yysp] = 25;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 497:
                    yyn = yys25();
                    continue;

                case 26:
                    yyst[yysp] = 26;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 498:
                    yyn = yys26();
                    continue;

                case 27:
                    yyst[yysp] = 27;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 499:
                    yyn = yys27();
                    continue;

                case 28:
                    yyst[yysp] = 28;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 500:
                    yyn = yys28();
                    continue;

                case 29:
                    yyst[yysp] = 29;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 501:
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
                case 502:
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
                case 503:
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
                case 504:
                    switch (yytok) {
                        case FLOAT:
                            yyn = 89;
                            continue;
                        case IDENTIFIER:
                            yyn = 90;
                            continue;
                        case INTEGER:
                            yyn = 91;
                            continue;
                        case '(':
                            yyn = 92;
                            continue;
                    }
                    yyn = 947;
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
                case 505:
                    switch (yytok) {
                        case FLOAT:
                            yyn = 89;
                            continue;
                        case IDENTIFIER:
                            yyn = 90;
                            continue;
                        case INTEGER:
                            yyn = 91;
                            continue;
                        case '(':
                            yyn = 94;
                            continue;
                    }
                    yyn = 947;
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
                case 506:
                    switch (yytok) {
                        case FLOAT:
                            yyn = 89;
                            continue;
                        case IDENTIFIER:
                            yyn = 90;
                            continue;
                        case INTEGER:
                            yyn = 91;
                            continue;
                        case '(':
                            yyn = 97;
                            continue;
                    }
                    yyn = 947;
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
                case 507:
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
                case 508:
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
                case 509:
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
                case 510:
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
                case 511:
                    switch (yytok) {
                        case FLOAT:
                            yyn = 89;
                            continue;
                        case IDENTIFIER:
                            yyn = 90;
                            continue;
                        case INTEGER:
                            yyn = 91;
                            continue;
                        case '(':
                            yyn = 99;
                            continue;
                    }
                    yyn = 947;
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
                case 512:
                    switch (yytok) {
                        case FLOAT:
                            yyn = 89;
                            continue;
                        case IDENTIFIER:
                            yyn = 90;
                            continue;
                        case INTEGER:
                            yyn = 91;
                            continue;
                        case '(':
                            yyn = 104;
                            continue;
                    }
                    yyn = 947;
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
                case 513:
                    switch (yytok) {
                        case FLOAT:
                            yyn = 89;
                            continue;
                        case IDENTIFIER:
                            yyn = 90;
                            continue;
                        case INTEGER:
                            yyn = 91;
                            continue;
                        case '(':
                            yyn = 106;
                            continue;
                    }
                    yyn = 947;
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
                case 514:
                    switch (yytok) {
                        case '[':
                            yyn = 107;
                            continue;
                    }
                    yyn = 947;
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
                case 515:
                    switch (yytok) {
                        case '[':
                            yyn = 108;
                            continue;
                    }
                    yyn = 947;
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
                case 516:
                    switch (yytok) {
                        case INTEGER:
                            yyn = 91;
                            continue;
                        case IDENTIFIER:
                            yyn = 110;
                            continue;
                        case '(':
                            yyn = 111;
                            continue;
                    }
                    yyn = 947;
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
                case 517:
                    switch (yytok) {
                        case FLOAT:
                            yyn = 89;
                            continue;
                        case IDENTIFIER:
                            yyn = 90;
                            continue;
                        case INTEGER:
                            yyn = 91;
                            continue;
                        case '(':
                            yyn = 113;
                            continue;
                    }
                    yyn = 947;
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
                case 518:
                    switch (yytok) {
                        case FLOAT:
                            yyn = 89;
                            continue;
                        case IDENTIFIER:
                            yyn = 90;
                            continue;
                        case INTEGER:
                            yyn = 91;
                            continue;
                        case '(':
                            yyn = 115;
                            continue;
                    }
                    yyn = 947;
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
                case 519:
                    switch (yytok) {
                        case FLOAT:
                            yyn = 89;
                            continue;
                        case IDENTIFIER:
                            yyn = 90;
                            continue;
                        case INTEGER:
                            yyn = 91;
                            continue;
                        case '(':
                            yyn = 117;
                            continue;
                    }
                    yyn = 947;
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
                case 520:
                    switch (yytok) {
                        case FLOAT:
                            yyn = 89;
                            continue;
                        case IDENTIFIER:
                            yyn = 90;
                            continue;
                        case INTEGER:
                            yyn = 91;
                            continue;
                        case '(':
                            yyn = 119;
                            continue;
                    }
                    yyn = 947;
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
                case 521:
                    switch (yytok) {
                        case FLOAT:
                            yyn = 89;
                            continue;
                        case IDENTIFIER:
                            yyn = 90;
                            continue;
                        case INTEGER:
                            yyn = 91;
                            continue;
                        case '(':
                            yyn = 121;
                            continue;
                    }
                    yyn = 947;
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
                case 522:
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
                case 523:
                    switch (yytok) {
                        case '[':
                            yyn = 125;
                            continue;
                    }
                    yyn = 947;
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
                case 524:
                    switch (yytok) {
                        case IDENTIFIER:
                            yyn = 126;
                            continue;
                    }
                    yyn = 947;
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
                case 525:
                    switch (yytok) {
                        case FLOAT:
                            yyn = 89;
                            continue;
                        case IDENTIFIER:
                            yyn = 90;
                            continue;
                        case INTEGER:
                            yyn = 91;
                            continue;
                        case '(':
                            yyn = 129;
                            continue;
                    }
                    yyn = 947;
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
                case 526:
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
                case 527:
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
                case 528:
                    switch (yytok) {
                        case IDENTIFIER:
                            yyn = 130;
                            continue;
                    }
                    yyn = 947;
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
                case 529:
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
                case 530:
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
                case 531:
                    switch (yytok) {
                        case '[':
                            yyn = 142;
                            continue;
                    }
                    yyn = 947;
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
                case 532:
                    switch (yytok) {
                        case FLOAT:
                            yyn = 89;
                            continue;
                        case IDENTIFIER:
                            yyn = 90;
                            continue;
                        case INTEGER:
                            yyn = 91;
                            continue;
                        case '(':
                            yyn = 144;
                            continue;
                    }
                    yyn = 947;
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
                case 533:
                    switch (yytok) {
                        case FLOAT:
                            yyn = 89;
                            continue;
                        case IDENTIFIER:
                            yyn = 90;
                            continue;
                        case INTEGER:
                            yyn = 91;
                            continue;
                        case '(':
                            yyn = 146;
                            continue;
                    }
                    yyn = 947;
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
                case 534:
                    switch (yytok) {
                        case INTEGER:
                            yyn = 91;
                            continue;
                        case IDENTIFIER:
                            yyn = 110;
                            continue;
                        case '(':
                            yyn = 148;
                            continue;
                    }
                    yyn = 947;
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
                case 535:
                    switch (yytok) {
                        case FLOAT:
                            yyn = 89;
                            continue;
                        case IDENTIFIER:
                            yyn = 90;
                            continue;
                        case INTEGER:
                            yyn = 91;
                            continue;
                        case '(':
                            yyn = 150;
                            continue;
                    }
                    yyn = 947;
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
                case 536:
                    switch (yytok) {
                        case FLOAT:
                            yyn = 89;
                            continue;
                        case IDENTIFIER:
                            yyn = 90;
                            continue;
                        case INTEGER:
                            yyn = 91;
                            continue;
                        case '(':
                            yyn = 153;
                            continue;
                    }
                    yyn = 947;
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
                case 537:
                    switch (yytok) {
                        case '[':
                            yyn = 154;
                            continue;
                    }
                    yyn = 947;
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
                case 538:
                    switch (yytok) {
                        case FLOAT:
                            yyn = 89;
                            continue;
                        case IDENTIFIER:
                            yyn = 90;
                            continue;
                        case INTEGER:
                            yyn = 91;
                            continue;
                        case '(':
                            yyn = 104;
                            continue;
                    }
                    yyn = 947;
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
                case 539:
                    switch (yytok) {
                        case FLOAT:
                            yyn = 89;
                            continue;
                        case IDENTIFIER:
                            yyn = 90;
                            continue;
                        case INTEGER:
                            yyn = 91;
                            continue;
                        case '(':
                            yyn = 158;
                            continue;
                    }
                    yyn = 947;
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
                case 540:
                    switch (yytok) {
                        case FLOAT:
                            yyn = 89;
                            continue;
                        case IDENTIFIER:
                            yyn = 90;
                            continue;
                        case INTEGER:
                            yyn = 91;
                            continue;
                        case '(':
                            yyn = 160;
                            continue;
                    }
                    yyn = 947;
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
                case 541:
                    switch (yytok) {
                        case FLOAT:
                            yyn = 89;
                            continue;
                        case IDENTIFIER:
                            yyn = 90;
                            continue;
                        case INTEGER:
                            yyn = 91;
                            continue;
                        case '(':
                            yyn = 162;
                            continue;
                    }
                    yyn = 947;
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
                case 542:
                    switch (yytok) {
                        case FLOAT:
                            yyn = 89;
                            continue;
                        case IDENTIFIER:
                            yyn = 164;
                            continue;
                        case '(':
                            yyn = 165;
                            continue;
                    }
                    yyn = 947;
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
                case 543:
                    switch (yytok) {
                        case INTEGER:
                            yyn = 91;
                            continue;
                        case IDENTIFIER:
                            yyn = 110;
                            continue;
                        case '(':
                            yyn = 111;
                            continue;
                    }
                    yyn = 947;
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
                case 544:
                    switch (yytok) {
                        case FLOAT:
                            yyn = 89;
                            continue;
                        case IDENTIFIER:
                            yyn = 90;
                            continue;
                        case INTEGER:
                            yyn = 91;
                            continue;
                        case '(':
                            yyn = 168;
                            continue;
                    }
                    yyn = 947;
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
                case 545:
                    switch (yytok) {
                        case FLOAT:
                            yyn = 89;
                            continue;
                        case IDENTIFIER:
                            yyn = 90;
                            continue;
                        case INTEGER:
                            yyn = 91;
                            continue;
                        case '(':
                            yyn = 170;
                            continue;
                    }
                    yyn = 947;
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
                case 546:
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
                case 547:
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
                case 548:
                    switch (yytok) {
                        case FLOAT:
                            yyn = 89;
                            continue;
                        case IDENTIFIER:
                            yyn = 90;
                            continue;
                        case INTEGER:
                            yyn = 91;
                            continue;
                        case '(':
                            yyn = 172;
                            continue;
                    }
                    yyn = 947;
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
                case 549:
                    switch (yytok) {
                        case FLOAT:
                            yyn = 89;
                            continue;
                        case IDENTIFIER:
                            yyn = 90;
                            continue;
                        case INTEGER:
                            yyn = 91;
                            continue;
                        case '(':
                            yyn = 174;
                            continue;
                    }
                    yyn = 947;
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
                case 550:
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
                case 551:
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
                case 552:
                    switch (yytok) {
                        case FLOAT:
                            yyn = 89;
                            continue;
                        case IDENTIFIER:
                            yyn = 90;
                            continue;
                        case INTEGER:
                            yyn = 91;
                            continue;
                        case '(':
                            yyn = 104;
                            continue;
                    }
                    yyn = 947;
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
                case 553:
                    switch (yytok) {
                        case '[':
                            yyn = 200;
                            continue;
                    }
                    yyn = 947;
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
                case 554:
                    switch (yytok) {
                        case '[':
                            yyn = 201;
                            continue;
                    }
                    yyn = 947;
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
                case 555:
                    switch (yytok) {
                        case IDENTIFIER:
                            yyn = 202;
                            continue;
                    }
                    yyn = 947;
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
                case 556:
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
                case 557:
                    yyn = yys85();
                    continue;

                case 86:
                    yyst[yysp] = 86;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 558:
                    yyn = yys86();
                    continue;

                case 87:
                    yyst[yysp] = 87;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 559:
                    yyn = yys87();
                    continue;

                case 88:
                    yyst[yysp] = 88;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 560:
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
                case 561:
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
                case 562:
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
                case 563:
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
                case 564:
                    yyn = yys92();
                    continue;

                case 93:
                    yyst[yysp] = 93;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 565:
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
                case 566:
                    yyn = yys94();
                    continue;

                case 95:
                    yyst[yysp] = 95;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 567:
                    yyn = yys95();
                    continue;

                case 96:
                    yyst[yysp] = 96;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 568:
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
                case 569:
                    yyn = yys97();
                    continue;

                case 98:
                    yyst[yysp] = 98;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 570:
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
                case 571:
                    yyn = yys99();
                    continue;

                case 100:
                    yyst[yysp] = 100;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 572:
                    yyn = yys100();
                    continue;

                case 101:
                    yyst[yysp] = 101;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 573:
                    yyn = yys101();
                    continue;

                case 102:
                    yyst[yysp] = 102;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 574:
                    yyn = yys102();
                    continue;

                case 103:
                    yyst[yysp] = 103;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 575:
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
                case 576:
                    switch (yytok) {
                        case FLOAT:
                            yyn = 89;
                            continue;
                        case IDENTIFIER:
                            yyn = 90;
                            continue;
                        case INTEGER:
                            yyn = 91;
                            continue;
                        case '(':
                            yyn = 104;
                            continue;
                    }
                    yyn = 947;
                    continue;

                case 105:
                    yyst[yysp] = 105;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 577:
                    switch (yytok) {
                        case FLOAT:
                            yyn = 89;
                            continue;
                        case IDENTIFIER:
                            yyn = 90;
                            continue;
                        case INTEGER:
                            yyn = 91;
                            continue;
                        case '(':
                            yyn = 224;
                            continue;
                    }
                    yyn = 947;
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
                case 578:
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
                case 579:
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
                case 580:
                    switch (yytok) {
                        case FLOAT:
                            yyn = 89;
                            continue;
                        case IDENTIFIER:
                            yyn = 90;
                            continue;
                        case INTEGER:
                            yyn = 91;
                            continue;
                        case '(':
                            yyn = 104;
                            continue;
                    }
                    yyn = 947;
                    continue;

                case 109:
                    yyst[yysp] = 109;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 581:
                    switch (yytok) {
                        case '*':
                            yyn = 209;
                            continue;
                        case '+':
                            yyn = 210;
                            continue;
                        case '-':
                            yyn = 211;
                            continue;
                        case '/':
                            yyn = 212;
                            continue;
                        case '[':
                            yyn = 230;
                            continue;
                    }
                    yyn = 947;
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
                case 582:
                    yyn = yys110();
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
                case 583:
                    switch (yytok) {
                        case INTEGER:
                            yyn = 91;
                            continue;
                        case IDENTIFIER:
                            yyn = 110;
                            continue;
                        case '(':
                            yyn = 111;
                            continue;
                    }
                    yyn = 947;
                    continue;

                case 112:
                    yyst[yysp] = 112;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 584:
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
                case 585:
                    yyn = yys113();
                    continue;

                case 114:
                    yyst[yysp] = 114;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 586:
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
                case 587:
                    yyn = yys115();
                    continue;

                case 116:
                    yyst[yysp] = 116;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 588:
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
                case 589:
                    yyn = yys117();
                    continue;

                case 118:
                    yyst[yysp] = 118;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 590:
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
                case 591:
                    yyn = yys119();
                    continue;

                case 120:
                    yyst[yysp] = 120;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 592:
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
                case 593:
                    yyn = yys121();
                    continue;

                case 122:
                    yyst[yysp] = 122;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 594:
                    yyn = yys122();
                    continue;

                case 123:
                    yyst[yysp] = 123;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 595:
                    yyn = yys123();
                    continue;

                case 124:
                    yyst[yysp] = 124;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 596:
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
                case 597:
                    switch (yytok) {
                        case IDENTIFIER:
                            yyn = 238;
                            continue;
                    }
                    yyn = 947;
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
                case 598:
                    switch (yytok) {
                        case '=':
                            yyn = 239;
                            continue;
                    }
                    yyn = 947;
                    continue;

                case 127:
                    yyst[yysp] = 127;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 599:
                    yyn = yys127();
                    continue;

                case 128:
                    yyst[yysp] = 128;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 600:
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
                case 601:
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
                case 602:
                    yyn = yys130();
                    continue;

                case 131:
                    yyst[yysp] = 131;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 603:
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
                case 604:
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
                case 605:
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
                case 606:
                    yyn = yys134();
                    continue;

                case 135:
                    yyst[yysp] = 135;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.getNextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 607:
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
                case 608:
                    yyn = yys136();
                    continue;

                case 137:
                    yyst[yysp] = 137;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.getNextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 609:
                    yyn = yys137();
                    continue;

                case 138:
                    yyst[yysp] = 138;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.getNextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 610:
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
                case 611:
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
                case 612:
                    yyn = yys140();
                    continue;

                case 141:
                    yyst[yysp] = 141;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 613:
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
                case 614:
                    switch (yytok) {
                        case INTEGER:
                            yyn = 91;
                            continue;
                        case IDENTIFIER:
                            yyn = 110;
                            continue;
                        case '(':
                            yyn = 111;
                            continue;
                    }
                    yyn = 947;
                    continue;

                case 143:
                    yyst[yysp] = 143;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 615:
                    yyn = yys143();
                    continue;

                case 144:
                    yyst[yysp] = 144;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.getNextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 616:
                    yyn = yys144();
                    continue;

                case 145:
                    yyst[yysp] = 145;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 617:
                    yyn = yys145();
                    continue;

                case 146:
                    yyst[yysp] = 146;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.getNextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 618:
                    yyn = yys146();
                    continue;

                case 147:
                    yyst[yysp] = 147;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 619:
                    yyn = yys147();
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
                case 620:
                    yyn = yys148();
                    continue;

                case 149:
                    yyst[yysp] = 149;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 621:
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
                case 622:
                    yyn = yys150();
                    continue;

                case 151:
                    yyst[yysp] = 151;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 623:
                    yyn = yys151();
                    continue;

                case 152:
                    yyst[yysp] = 152;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 624:
                    yyn = yys152();
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
                case 625:
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
                case 626:
                    switch (yytok) {
                        case FLOAT:
                            yyn = 89;
                            continue;
                        case IDENTIFIER:
                            yyn = 90;
                            continue;
                        case INTEGER:
                            yyn = 91;
                            continue;
                        case '(':
                            yyn = 104;
                            continue;
                    }
                    yyn = 947;
                    continue;

                case 155:
                    yyst[yysp] = 155;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 627:
                    yyn = yys155();
                    continue;

                case 156:
                    yyst[yysp] = 156;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 628:
                    yyn = yys156();
                    continue;

                case 157:
                    yyst[yysp] = 157;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 629:
                    yyn = yys157();
                    continue;

                case 158:
                    yyst[yysp] = 158;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.getNextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 630:
                    yyn = yys158();
                    continue;

                case 159:
                    yyst[yysp] = 159;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 631:
                    yyn = yys159();
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
                case 632:
                    yyn = yys160();
                    continue;

                case 161:
                    yyst[yysp] = 161;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 633:
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
                case 634:
                    yyn = yys162();
                    continue;

                case 163:
                    yyst[yysp] = 163;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 635:
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
                case 636:
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
                case 637:
                    yyn = yys165();
                    continue;

                case 166:
                    yyst[yysp] = 166;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 638:
                    switch (yytok) {
                        case '*':
                            yyn = 209;
                            continue;
                        case '+':
                            yyn = 210;
                            continue;
                        case '-':
                            yyn = 211;
                            continue;
                        case '/':
                            yyn = 212;
                            continue;
                        case '[':
                            yyn = 278;
                            continue;
                    }
                    yyn = 947;
                    continue;

                case 167:
                    yyst[yysp] = 167;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 639:
                    switch (yytok) {
                        case FLOAT:
                            yyn = 89;
                            continue;
                        case IDENTIFIER:
                            yyn = 90;
                            continue;
                        case INTEGER:
                            yyn = 91;
                            continue;
                        case '(':
                            yyn = 104;
                            continue;
                    }
                    yyn = 947;
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
                case 640:
                    yyn = yys168();
                    continue;

                case 169:
                    yyst[yysp] = 169;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 641:
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
                case 642:
                    yyn = yys170();
                    continue;

                case 171:
                    yyst[yysp] = 171;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 643:
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
                case 644:
                    yyn = yys172();
                    continue;

                case 173:
                    yyst[yysp] = 173;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 645:
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
                case 646:
                    yyn = yys174();
                    continue;

                case 175:
                    yyst[yysp] = 175;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 647:
                    yyn = yys175();
                    continue;

                case 176:
                    yyst[yysp] = 176;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 648:
                    yyn = yys176();
                    continue;

                case 177:
                    yyst[yysp] = 177;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 649:
                    yyn = yys177();
                    continue;

                case 178:
                    yyst[yysp] = 178;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 650:
                    yyn = yys178();
                    continue;

                case 179:
                    yyst[yysp] = 179;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 651:
                    yyn = yys179();
                    continue;

                case 180:
                    yyst[yysp] = 180;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 652:
                    yyn = yys180();
                    continue;

                case 181:
                    yyst[yysp] = 181;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 653:
                    switch (yytok) {
                        case '<':
                            yyn = 284;
                            continue;
                        case '>':
                            yyn = 285;
                            continue;
                    }
                    yyn = 947;
                    continue;

                case 182:
                    yyst[yysp] = 182;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 654:
                    yyn = yys182();
                    continue;

                case 183:
                    yyst[yysp] = 183;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 655:
                    yyn = yys183();
                    continue;

                case 184:
                    yyst[yysp] = 184;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 656:
                    yyn = yys184();
                    continue;

                case 185:
                    yyst[yysp] = 185;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 657:
                    yyn = yys185();
                    continue;

                case 186:
                    yyst[yysp] = 186;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 658:
                    yyn = yys186();
                    continue;

                case 187:
                    yyst[yysp] = 187;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 659:
                    yyn = yys187();
                    continue;

                case 188:
                    yyst[yysp] = 188;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 660:
                    switch (yytok) {
                        case '<':
                            yyn = 286;
                            continue;
                        case '>':
                            yyn = 287;
                            continue;
                    }
                    yyn = 947;
                    continue;

                case 189:
                    yyst[yysp] = 189;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 661:
                    switch (yytok) {
                        case '[':
                            yyn = 288;
                            continue;
                    }
                    yyn = 947;
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
                case 662:
                    switch (yytok) {
                        case '[':
                        case ')':
                            yyn = yyr51();
                            continue;
                    }
                    yyn = 947;
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
                case 663:
                    yyn = yys191();
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
                case 664:
                    switch (yytok) {
                        case FLOAT:
                            yyn = 89;
                            continue;
                        case IDENTIFIER:
                            yyn = 90;
                            continue;
                        case INTEGER:
                            yyn = 91;
                            continue;
                        case '(':
                            yyn = 290;
                            continue;
                    }
                    yyn = 947;
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
                case 665:
                    switch (yytok) {
                        case FLOAT:
                            yyn = 89;
                            continue;
                        case IDENTIFIER:
                            yyn = 90;
                            continue;
                        case INTEGER:
                            yyn = 91;
                            continue;
                        case '(':
                            yyn = 104;
                            continue;
                    }
                    yyn = 947;
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
                case 666:
                    switch (yytok) {
                        case FLOAT:
                            yyn = 89;
                            continue;
                        case IDENTIFIER:
                            yyn = 90;
                            continue;
                        case INTEGER:
                            yyn = 91;
                            continue;
                        case '(':
                            yyn = 104;
                            continue;
                    }
                    yyn = 947;
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
                case 667:
                    switch (yytok) {
                        case '(':
                            yyn = 293;
                            continue;
                    }
                    yyn = 947;
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
                case 668:
                    switch (yytok) {
                        case '(':
                            yyn = 294;
                            continue;
                    }
                    yyn = 947;
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
                case 669:
                    yyn = yys197();
                    continue;

                case 198:
                    yyst[yysp] = 198;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 670:
                    yyn = yys198();
                    continue;

                case 199:
                    yyst[yysp] = 199;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 671:
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
                case 672:
                    switch (yytok) {
                        case FLOAT:
                            yyn = 89;
                            continue;
                        case IDENTIFIER:
                            yyn = 90;
                            continue;
                        case INTEGER:
                            yyn = 91;
                            continue;
                        case '(':
                            yyn = 104;
                            continue;
                    }
                    yyn = 947;
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
                case 673:
                    switch (yytok) {
                        case FLOAT:
                            yyn = 89;
                            continue;
                        case IDENTIFIER:
                            yyn = 90;
                            continue;
                        case INTEGER:
                            yyn = 91;
                            continue;
                        case '(':
                            yyn = 104;
                            continue;
                    }
                    yyn = 947;
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
                case 674:
                    yyn = yys202();
                    continue;

                case 203:
                    yyst[yysp] = 203;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 675:
                    switch (yytok) {
                        case ENDINPUT:
                            yyn = yyr2();
                            continue;
                    }
                    yyn = 947;
                    continue;

                case 204:
                    yyst[yysp] = 204;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 676:
                    switch (yytok) {
                        case ENDINPUT:
                            yyn = yyr3();
                            continue;
                    }
                    yyn = 947;
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
                case 677:
                    switch (yytok) {
                        case FLOAT:
                            yyn = 89;
                            continue;
                        case IDENTIFIER:
                            yyn = 164;
                            continue;
                        case '(':
                            yyn = 221;
                            continue;
                    }
                    yyn = 947;
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
                case 678:
                    switch (yytok) {
                        case FLOAT:
                            yyn = 89;
                            continue;
                        case IDENTIFIER:
                            yyn = 164;
                            continue;
                        case '(':
                            yyn = 221;
                            continue;
                    }
                    yyn = 947;
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
                case 679:
                    switch (yytok) {
                        case FLOAT:
                            yyn = 89;
                            continue;
                        case IDENTIFIER:
                            yyn = 164;
                            continue;
                        case '(':
                            yyn = 221;
                            continue;
                    }
                    yyn = 947;
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
                case 680:
                    switch (yytok) {
                        case FLOAT:
                            yyn = 89;
                            continue;
                        case IDENTIFIER:
                            yyn = 164;
                            continue;
                        case '(':
                            yyn = 221;
                            continue;
                    }
                    yyn = 947;
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
                case 681:
                    switch (yytok) {
                        case INTEGER:
                            yyn = 91;
                            continue;
                        case IDENTIFIER:
                            yyn = 110;
                            continue;
                        case '(':
                            yyn = 111;
                            continue;
                    }
                    yyn = 947;
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
                case 682:
                    switch (yytok) {
                        case INTEGER:
                            yyn = 91;
                            continue;
                        case IDENTIFIER:
                            yyn = 110;
                            continue;
                        case '(':
                            yyn = 111;
                            continue;
                    }
                    yyn = 947;
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
                case 683:
                    switch (yytok) {
                        case INTEGER:
                            yyn = 91;
                            continue;
                        case IDENTIFIER:
                            yyn = 110;
                            continue;
                        case '(':
                            yyn = 111;
                            continue;
                    }
                    yyn = 947;
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
                case 684:
                    switch (yytok) {
                        case INTEGER:
                            yyn = 91;
                            continue;
                        case IDENTIFIER:
                            yyn = 110;
                            continue;
                        case '(':
                            yyn = 111;
                            continue;
                    }
                    yyn = 947;
                    continue;

                case 213:
                    yyst[yysp] = 213;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 685:
                    switch (yytok) {
                        case '*':
                            yyn = 205;
                            continue;
                        case '+':
                            yyn = 206;
                            continue;
                        case '-':
                            yyn = 207;
                            continue;
                        case '/':
                            yyn = 208;
                            continue;
                        case ')':
                            yyn = 312;
                            continue;
                    }
                    yyn = 947;
                    continue;

                case 214:
                    yyst[yysp] = 214;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 686:
                    switch (yytok) {
                        case ')':
                            yyn = 313;
                            continue;
                    }
                    yyn = 947;
                    continue;

                case 215:
                    yyst[yysp] = 215;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 687:
                    switch (yytok) {
                        case '*':
                            yyn = 209;
                            continue;
                        case '+':
                            yyn = 210;
                            continue;
                        case '-':
                            yyn = 211;
                            continue;
                        case '/':
                            yyn = 212;
                            continue;
                        case ')':
                            yyn = 314;
                            continue;
                    }
                    yyn = 947;
                    continue;

                case 216:
                    yyst[yysp] = 216;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 688:
                    switch (yytok) {
                        case ')':
                            yyn = 315;
                            continue;
                    }
                    yyn = 947;
                    continue;

                case 217:
                    yyst[yysp] = 217;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 689:
                    switch (yytok) {
                        case ')':
                            yyn = 316;
                            continue;
                    }
                    yyn = 947;
                    continue;

                case 218:
                    yyst[yysp] = 218;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 690:
                    switch (yytok) {
                        case ')':
                            yyn = 317;
                            continue;
                    }
                    yyn = 947;
                    continue;

                case 219:
                    yyst[yysp] = 219;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 691:
                    switch (yytok) {
                        case ')':
                            yyn = 318;
                            continue;
                    }
                    yyn = 947;
                    continue;

                case 220:
                    yyst[yysp] = 220;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 692:
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
                case 693:
                    switch (yytok) {
                        case FLOAT:
                            yyn = 89;
                            continue;
                        case IDENTIFIER:
                            yyn = 164;
                            continue;
                        case '(':
                            yyn = 221;
                            continue;
                    }
                    yyn = 947;
                    continue;

                case 222:
                    yyst[yysp] = 222;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 694:
                    yyn = yys222();
                    continue;

                case 223:
                    yyst[yysp] = 223;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 695:
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
                case 696:
                    yyn = yys224();
                    continue;

                case 225:
                    yyst[yysp] = 225;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 697:
                    switch (yytok) {
                        case ')':
                            yyn = 320;
                            continue;
                    }
                    yyn = 947;
                    continue;

                case 226:
                    yyst[yysp] = 226;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 698:
                    switch (yytok) {
                        case ']':
                            yyn = 321;
                            continue;
                    }
                    yyn = 947;
                    continue;

                case 227:
                    yyst[yysp] = 227;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 699:
                    yyn = yys227();
                    continue;

                case 228:
                    yyst[yysp] = 228;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 700:
                    switch (yytok) {
                        case ']':
                            yyn = 323;
                            continue;
                    }
                    yyn = 947;
                    continue;

                case 229:
                    yyst[yysp] = 229;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 701:
                    switch (yytok) {
                        case ']':
                            yyn = 324;
                            continue;
                    }
                    yyn = 947;
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
                case 702:
                    switch (yytok) {
                        case FLOAT:
                            yyn = 89;
                            continue;
                        case IDENTIFIER:
                            yyn = 90;
                            continue;
                        case INTEGER:
                            yyn = 91;
                            continue;
                        case '(':
                            yyn = 104;
                            continue;
                    }
                    yyn = 947;
                    continue;

                case 231:
                    yyst[yysp] = 231;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 703:
                    switch (yytok) {
                        case ')':
                            yyn = 327;
                            continue;
                    }
                    yyn = 947;
                    continue;

                case 232:
                    yyst[yysp] = 232;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 704:
                    switch (yytok) {
                        case ')':
                            yyn = 328;
                            continue;
                    }
                    yyn = 947;
                    continue;

                case 233:
                    yyst[yysp] = 233;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 705:
                    switch (yytok) {
                        case ')':
                            yyn = 329;
                            continue;
                    }
                    yyn = 947;
                    continue;

                case 234:
                    yyst[yysp] = 234;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 706:
                    switch (yytok) {
                        case ')':
                            yyn = 330;
                            continue;
                    }
                    yyn = 947;
                    continue;

                case 235:
                    yyst[yysp] = 235;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 707:
                    switch (yytok) {
                        case ')':
                            yyn = 331;
                            continue;
                    }
                    yyn = 947;
                    continue;

                case 236:
                    yyst[yysp] = 236;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 708:
                    yyn = yys236();
                    continue;

                case 237:
                    yyst[yysp] = 237;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 709:
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
                case 710:
                    switch (yytok) {
                        case INTEGER:
                            yyn = 91;
                            continue;
                        case IDENTIFIER:
                            yyn = 110;
                            continue;
                        case '(':
                            yyn = 111;
                            continue;
                        case ']':
                            yyn = 333;
                            continue;
                    }
                    yyn = 947;
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
                case 711:
                    yyn = yys239();
                    continue;

                case 240:
                    yyst[yysp] = 240;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 712:
                    switch (yytok) {
                        case ')':
                            yyn = 337;
                            continue;
                    }
                    yyn = 947;
                    continue;

                case 241:
                    yyst[yysp] = 241;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 713:
                    switch (yytok) {
                        case ')':
                            yyn = 338;
                            continue;
                    }
                    yyn = 947;
                    continue;

                case 242:
                    yyst[yysp] = 242;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 714:
                    yyn = yys242();
                    continue;

                case 243:
                    yyst[yysp] = 243;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 715:
                    switch (yytok) {
                        case FIN:
                            yyn = 340;
                            continue;
                    }
                    yyn = 947;
                    continue;

                case 244:
                    yyst[yysp] = 244;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 716:
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
                case 717:
                    yyn = yys245();
                    continue;

                case 246:
                    yyst[yysp] = 246;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 718:
                    yyn = yys246();
                    continue;

                case 247:
                    yyst[yysp] = 247;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 719:
                    switch (yytok) {
                        case ')':
                            yyn = 345;
                            continue;
                    }
                    yyn = 947;
                    continue;

                case 248:
                    yyst[yysp] = 248;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 720:
                    switch (yytok) {
                        case ')':
                            yyn = 346;
                            continue;
                    }
                    yyn = 947;
                    continue;

                case 249:
                    yyst[yysp] = 249;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 721:
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
                case 722:
                    yyn = yys250();
                    continue;

                case 251:
                    yyst[yysp] = 251;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 723:
                    switch (yytok) {
                        case ')':
                            yyn = 348;
                            continue;
                    }
                    yyn = 947;
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
                case 724:
                    switch (yytok) {
                        case INTEGER:
                            yyn = 91;
                            continue;
                        case IDENTIFIER:
                            yyn = 110;
                            continue;
                        case '(':
                            yyn = 349;
                            continue;
                    }
                    yyn = 947;
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
                case 725:
                    switch (yytok) {
                        case INTEGER:
                            yyn = 91;
                            continue;
                        case IDENTIFIER:
                            yyn = 110;
                            continue;
                        case '(':
                            yyn = 111;
                            continue;
                    }
                    yyn = 947;
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
                case 726:
                    switch (yytok) {
                        case '[':
                            yyn = 350;
                            continue;
                    }
                    yyn = 947;
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
                case 727:
                    switch (yytok) {
                        case INTEGER:
                            yyn = 91;
                            continue;
                        case IDENTIFIER:
                            yyn = 110;
                            continue;
                        case '(':
                            yyn = 111;
                            continue;
                    }
                    yyn = 947;
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
                case 728:
                    switch (yytok) {
                        case INTEGER:
                            yyn = 91;
                            continue;
                        case IDENTIFIER:
                            yyn = 110;
                            continue;
                        case '(':
                            yyn = 352;
                            continue;
                    }
                    yyn = 947;
                    continue;

                case 257:
                    yyst[yysp] = 257;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.getNextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 729:
                    switch (yytok) {
                        case INTEGER:
                            yyn = 91;
                            continue;
                        case IDENTIFIER:
                            yyn = 110;
                            continue;
                        case '(':
                            yyn = 354;
                            continue;
                    }
                    yyn = 947;
                    continue;

                case 258:
                    yyst[yysp] = 258;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.getNextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 730:
                    switch (yytok) {
                        case '[':
                            yyn = 355;
                            continue;
                    }
                    yyn = 947;
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
                case 731:
                    switch (yytok) {
                        case INTEGER:
                            yyn = 91;
                            continue;
                        case IDENTIFIER:
                            yyn = 110;
                            continue;
                        case '(':
                            yyn = 111;
                            continue;
                    }
                    yyn = 947;
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
                case 732:
                    switch (yytok) {
                        case INTEGER:
                            yyn = 91;
                            continue;
                        case IDENTIFIER:
                            yyn = 110;
                            continue;
                        case '(':
                            yyn = 111;
                            continue;
                    }
                    yyn = 947;
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
                case 733:
                    switch (yytok) {
                        case '[':
                            yyn = 356;
                            continue;
                    }
                    yyn = 947;
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
                case 734:
                    switch (yytok) {
                        case '[':
                            yyn = 357;
                            continue;
                    }
                    yyn = 947;
                    continue;

                case 263:
                    yyst[yysp] = 263;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 735:
                    switch (yytok) {
                        case ')':
                            yyn = 358;
                            continue;
                    }
                    yyn = 947;
                    continue;

                case 264:
                    yyst[yysp] = 264;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 736:
                    yyn = yys264();
                    continue;

                case 265:
                    yyst[yysp] = 265;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 737:
                    yyn = yys265();
                    continue;

                case 266:
                    yyst[yysp] = 266;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.getNextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 738:
                    yyn = yys266();
                    continue;

                case 267:
                    yyst[yysp] = 267;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 739:
                    yyn = yys267();
                    continue;

                case 268:
                    yyst[yysp] = 268;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 740:
                    yyn = yys268();
                    continue;

                case 269:
                    yyst[yysp] = 269;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.getNextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 741:
                    yyn = yys269();
                    continue;

                case 270:
                    yyst[yysp] = 270;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 742:
                    switch (yytok) {
                        case ')':
                            yyn = 373;
                            continue;
                    }
                    yyn = 947;
                    continue;

                case 271:
                    yyst[yysp] = 271;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 743:
                    switch (yytok) {
                        case ')':
                            yyn = 374;
                            continue;
                    }
                    yyn = 947;
                    continue;

                case 272:
                    yyst[yysp] = 272;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 744:
                    switch (yytok) {
                        case ']':
                            yyn = 375;
                            continue;
                    }
                    yyn = 947;
                    continue;

                case 273:
                    yyst[yysp] = 273;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 745:
                    switch (yytok) {
                        case ']':
                            yyn = 376;
                            continue;
                    }
                    yyn = 947;
                    continue;

                case 274:
                    yyst[yysp] = 274;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 746:
                    switch (yytok) {
                        case ')':
                            yyn = 377;
                            continue;
                    }
                    yyn = 947;
                    continue;

                case 275:
                    yyst[yysp] = 275;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 747:
                    switch (yytok) {
                        case ')':
                            yyn = 378;
                            continue;
                    }
                    yyn = 947;
                    continue;

                case 276:
                    yyst[yysp] = 276;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 748:
                    switch (yytok) {
                        case ')':
                            yyn = 379;
                            continue;
                    }
                    yyn = 947;
                    continue;

                case 277:
                    yyst[yysp] = 277;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 749:
                    switch (yytok) {
                        case ')':
                            yyn = 380;
                            continue;
                    }
                    yyn = 947;
                    continue;

                case 278:
                    yyst[yysp] = 278;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.getNextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 750:
                    yyn = yys278();
                    continue;

                case 279:
                    yyst[yysp] = 279;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 751:
                    yyn = yys279();
                    continue;

                case 280:
                    yyst[yysp] = 280;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 752:
                    switch (yytok) {
                        case ')':
                            yyn = 382;
                            continue;
                    }
                    yyn = 947;
                    continue;

                case 281:
                    yyst[yysp] = 281;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 753:
                    switch (yytok) {
                        case ')':
                            yyn = 383;
                            continue;
                    }
                    yyn = 947;
                    continue;

                case 282:
                    yyst[yysp] = 282;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 754:
                    switch (yytok) {
                        case ')':
                            yyn = 384;
                            continue;
                    }
                    yyn = 947;
                    continue;

                case 283:
                    yyst[yysp] = 283;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 755:
                    switch (yytok) {
                        case ')':
                            yyn = 385;
                            continue;
                    }
                    yyn = 947;
                    continue;

                case 284:
                    yyst[yysp] = 284;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.getNextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 756:
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
                case 757:
                    yyn = yys285();
                    continue;

                case 286:
                    yyst[yysp] = 286;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.getNextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 758:
                    switch (yytok) {
                        case FLOAT:
                            yyn = 89;
                            continue;
                        case IDENTIFIER:
                            yyn = 90;
                            continue;
                        case INTEGER:
                            yyn = 91;
                            continue;
                        case '(':
                            yyn = 104;
                            continue;
                    }
                    yyn = 947;
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
                case 759:
                    switch (yytok) {
                        case FLOAT:
                            yyn = 89;
                            continue;
                        case IDENTIFIER:
                            yyn = 90;
                            continue;
                        case INTEGER:
                            yyn = 91;
                            continue;
                        case '(':
                            yyn = 104;
                            continue;
                    }
                    yyn = 947;
                    continue;

                case 288:
                    yyst[yysp] = 288;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.getNextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 760:
                    yyn = yys288();
                    continue;

                case 289:
                    yyst[yysp] = 289;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 761:
                    switch (yytok) {
                        case FLOAT:
                            yyn = 89;
                            continue;
                        case IDENTIFIER:
                            yyn = 90;
                            continue;
                        case INTEGER:
                            yyn = 91;
                            continue;
                        case '(':
                            yyn = 104;
                            continue;
                    }
                    yyn = 947;
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
                case 762:
                    yyn = yys290();
                    continue;

                case 291:
                    yyst[yysp] = 291;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 763:
                    switch (yytok) {
                        case FLOAT:
                            yyn = 89;
                            continue;
                        case IDENTIFIER:
                            yyn = 90;
                            continue;
                        case INTEGER:
                            yyn = 91;
                            continue;
                        case '(':
                            yyn = 104;
                            continue;
                    }
                    yyn = 947;
                    continue;

                case 292:
                    yyst[yysp] = 292;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 764:
                    switch (yytok) {
                        case FLOAT:
                            yyn = 89;
                            continue;
                        case IDENTIFIER:
                            yyn = 90;
                            continue;
                        case INTEGER:
                            yyn = 91;
                            continue;
                        case '(':
                            yyn = 104;
                            continue;
                    }
                    yyn = 947;
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
                case 765:
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
                case 766:
                    yyn = yys294();
                    continue;

                case 295:
                    yyst[yysp] = 295;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 767:
                    yyn = yys295();
                    continue;

                case 296:
                    yyst[yysp] = 296;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 768:
                    switch (yytok) {
                        case '<':
                            yyn = 284;
                            continue;
                        case '>':
                            yyn = 285;
                            continue;
                        case ')':
                            yyn = 397;
                            continue;
                    }
                    yyn = 947;
                    continue;

                case 297:
                    yyst[yysp] = 297;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 769:
                    yyn = yys297();
                    continue;

                case 298:
                    yyst[yysp] = 298;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 770:
                    switch (yytok) {
                        case ')':
                            yyn = 398;
                            continue;
                    }
                    yyn = 947;
                    continue;

                case 299:
                    yyst[yysp] = 299;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 771:
                    switch (yytok) {
                        case ']':
                            yyn = 399;
                            continue;
                    }
                    yyn = 947;
                    continue;

                case 300:
                    yyst[yysp] = 300;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 772:
                    switch (yytok) {
                        case ']':
                            yyn = 400;
                            continue;
                    }
                    yyn = 947;
                    continue;

                case 301:
                    yyst[yysp] = 301;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 773:
                    switch (yytok) {
                        case ']':
                            yyn = 401;
                            continue;
                    }
                    yyn = 947;
                    continue;

                case 302:
                    yyst[yysp] = 302;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 774:
                    switch (yytok) {
                        case ']':
                            yyn = 402;
                            continue;
                    }
                    yyn = 947;
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
                case 775:
                    yyn = yys303();
                    continue;

                case 304:
                    yyst[yysp] = 304;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 776:
                    yyn = yys304();
                    continue;

                case 305:
                    yyst[yysp] = 305;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 777:
                    yyn = yys305();
                    continue;

                case 306:
                    yyst[yysp] = 306;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 778:
                    yyn = yys306();
                    continue;

                case 307:
                    yyst[yysp] = 307;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 779:
                    yyn = yys307();
                    continue;

                case 308:
                    yyst[yysp] = 308;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 780:
                    yyn = yys308();
                    continue;

                case 309:
                    yyst[yysp] = 309;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 781:
                    yyn = yys309();
                    continue;

                case 310:
                    yyst[yysp] = 310;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 782:
                    yyn = yys310();
                    continue;

                case 311:
                    yyst[yysp] = 311;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 783:
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
                case 784:
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
                case 785:
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
                case 786:
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
                case 787:
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
                case 788:
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
                case 789:
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
                case 790:
                    yyn = yys318();
                    continue;

                case 319:
                    yyst[yysp] = 319;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 791:
                    switch (yytok) {
                        case ')':
                            yyn = 406;
                            continue;
                    }
                    yyn = 947;
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
                case 792:
                    switch (yytok) {
                        case FLOAT:
                            yyn = 89;
                            continue;
                        case IDENTIFIER:
                            yyn = 90;
                            continue;
                        case INTEGER:
                            yyn = 91;
                            continue;
                        case '(':
                            yyn = 408;
                            continue;
                    }
                    yyn = 947;
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
                case 793:
                    yyn = yys321();
                    continue;

                case 322:
                    yyst[yysp] = 322;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 794:
                    switch (yytok) {
                        case ']':
                            yyn = yyr195();
                            continue;
                    }
                    yyn = 947;
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
                case 795:
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
                case 796:
                    yyn = yys324();
                    continue;

                case 325:
                    yyst[yysp] = 325;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 797:
                    switch (yytok) {
                        case ']':
                            yyn = 409;
                            continue;
                    }
                    yyn = 947;
                    continue;

                case 326:
                    yyst[yysp] = 326;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 798:
                    switch (yytok) {
                        case ']':
                            yyn = 410;
                            continue;
                    }
                    yyn = 947;
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
                case 799:
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
                case 800:
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
                case 801:
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
                case 802:
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
                case 803:
                    yyn = yys331();
                    continue;

                case 332:
                    yyst[yysp] = 332;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 804:
                    switch (yytok) {
                        case '*':
                            yyn = 209;
                            continue;
                        case '+':
                            yyn = 210;
                            continue;
                        case '-':
                            yyn = 211;
                            continue;
                        case '/':
                            yyn = 212;
                            continue;
                        case ']':
                            yyn = 411;
                            continue;
                    }
                    yyn = 947;
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
                case 805:
                    yyn = yys333();
                    continue;

                case 334:
                    yyst[yysp] = 334;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 806:
                    yyn = yys334();
                    continue;

                case 335:
                    yyst[yysp] = 335;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 807:
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
                case 808:
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
                case 809:
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
                case 810:
                    yyn = yys338();
                    continue;

                case 339:
                    yyst[yysp] = 339;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 811:
                    switch (yytok) {
                        case FIN:
                        case ']':
                            yyn = yyr167();
                            continue;
                    }
                    yyn = 947;
                    continue;

                case 340:
                    yyst[yysp] = 340;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.getNextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 812:
                    switch (yytok) {
                        case ';':
                            yyn = yyr203();
                            continue;
                    }
                    yyn = 947;
                    continue;

                case 341:
                    yyst[yysp] = 341;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 813:
                    switch (yytok) {
                        case FIN:
                            yyn = 412;
                            continue;
                    }
                    yyn = 947;
                    continue;

                case 342:
                    yyst[yysp] = 342;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 814:
                    yyn = yys342();
                    continue;

                case 343:
                    yyst[yysp] = 343;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.getNextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 815:
                    yyn = yys343();
                    continue;

                case 344:
                    yyst[yysp] = 344;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 816:
                    switch (yytok) {
                        case '*':
                            yyn = 209;
                            continue;
                        case '+':
                            yyn = 210;
                            continue;
                        case '-':
                            yyn = 211;
                            continue;
                        case '/':
                            yyn = 212;
                            continue;
                        case ']':
                            yyn = 414;
                            continue;
                    }
                    yyn = 947;
                    continue;

                case 345:
                    yyst[yysp] = 345;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.getNextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 817:
                    yyn = yys345();
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
                case 818:
                    yyn = yys346();
                    continue;

                case 347:
                    yyst[yysp] = 347;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 819:
                    switch (yytok) {
                        case ')':
                            yyn = 415;
                            continue;
                    }
                    yyn = 947;
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
                case 820:
                    switch (yytok) {
                        case INTEGER:
                            yyn = 91;
                            continue;
                        case IDENTIFIER:
                            yyn = 110;
                            continue;
                        case '(':
                            yyn = 417;
                            continue;
                    }
                    yyn = 947;
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
                case 821:
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
                case 822:
                    switch (yytok) {
                        case INTEGER:
                            yyn = 91;
                            continue;
                        case IDENTIFIER:
                            yyn = 110;
                            continue;
                        case '(':
                            yyn = 111;
                            continue;
                    }
                    yyn = 947;
                    continue;

                case 351:
                    yyst[yysp] = 351;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 823:
                    switch (yytok) {
                        case '*':
                            yyn = 209;
                            continue;
                        case '+':
                            yyn = 210;
                            continue;
                        case '-':
                            yyn = 211;
                            continue;
                        case '/':
                            yyn = 212;
                            continue;
                        case '[':
                            yyn = 418;
                            continue;
                    }
                    yyn = 947;
                    continue;

                case 352:
                    yyst[yysp] = 352;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.getNextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 824:
                    yyn = yys352();
                    continue;

                case 353:
                    yyst[yysp] = 353;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 825:
                    yyn = yys353();
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
                case 826:
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
                case 827:
                    switch (yytok) {
                        case INTEGER:
                            yyn = 91;
                            continue;
                        case IDENTIFIER:
                            yyn = 110;
                            continue;
                        case '(':
                            yyn = 111;
                            continue;
                    }
                    yyn = 947;
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
                case 828:
                    switch (yytok) {
                        case INTEGER:
                            yyn = 91;
                            continue;
                        case IDENTIFIER:
                            yyn = 110;
                            continue;
                        case '(':
                            yyn = 111;
                            continue;
                    }
                    yyn = 947;
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
                case 829:
                    switch (yytok) {
                        case INTEGER:
                            yyn = 91;
                            continue;
                        case IDENTIFIER:
                            yyn = 110;
                            continue;
                        case '(':
                            yyn = 111;
                            continue;
                    }
                    yyn = 947;
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
                case 830:
                    yyn = yys358();
                    continue;

                case 359:
                    yyst[yysp] = 359;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 831:
                    switch (yytok) {
                        case ')':
                            yyn = 420;
                            continue;
                    }
                    yyn = 947;
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
                case 832:
                    switch (yytok) {
                        case FLOAT:
                            yyn = 89;
                            continue;
                        case IDENTIFIER:
                            yyn = 164;
                            continue;
                        case '(':
                            yyn = 421;
                            continue;
                    }
                    yyn = 947;
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
                case 833:
                    switch (yytok) {
                        case FLOAT:
                            yyn = 89;
                            continue;
                        case IDENTIFIER:
                            yyn = 164;
                            continue;
                        case '(':
                            yyn = 221;
                            continue;
                    }
                    yyn = 947;
                    continue;

                case 362:
                    yyst[yysp] = 362;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.getNextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 834:
                    switch (yytok) {
                        case '[':
                            yyn = 422;
                            continue;
                    }
                    yyn = 947;
                    continue;

                case 363:
                    yyst[yysp] = 363;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.getNextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 835:
                    switch (yytok) {
                        case INTEGER:
                            yyn = 91;
                            continue;
                        case IDENTIFIER:
                            yyn = 110;
                            continue;
                        case '(':
                            yyn = 111;
                            continue;
                    }
                    yyn = 947;
                    continue;

                case 364:
                    yyst[yysp] = 364;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.getNextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 836:
                    switch (yytok) {
                        case FLOAT:
                            yyn = 89;
                            continue;
                        case IDENTIFIER:
                            yyn = 164;
                            continue;
                        case '(':
                            yyn = 424;
                            continue;
                    }
                    yyn = 947;
                    continue;

                case 365:
                    yyst[yysp] = 365;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.getNextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 837:
                    switch (yytok) {
                        case FLOAT:
                            yyn = 89;
                            continue;
                        case IDENTIFIER:
                            yyn = 90;
                            continue;
                        case INTEGER:
                            yyn = 91;
                            continue;
                        case '(':
                            yyn = 426;
                            continue;
                    }
                    yyn = 947;
                    continue;

                case 366:
                    yyst[yysp] = 366;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.getNextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 838:
                    switch (yytok) {
                        case '[':
                            yyn = 427;
                            continue;
                    }
                    yyn = 947;
                    continue;

                case 367:
                    yyst[yysp] = 367;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.getNextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 839:
                    switch (yytok) {
                        case FLOAT:
                            yyn = 89;
                            continue;
                        case IDENTIFIER:
                            yyn = 164;
                            continue;
                        case '(':
                            yyn = 221;
                            continue;
                    }
                    yyn = 947;
                    continue;

                case 368:
                    yyst[yysp] = 368;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.getNextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 840:
                    switch (yytok) {
                        case FLOAT:
                            yyn = 89;
                            continue;
                        case IDENTIFIER:
                            yyn = 164;
                            continue;
                        case '(':
                            yyn = 221;
                            continue;
                    }
                    yyn = 947;
                    continue;

                case 369:
                    yyst[yysp] = 369;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.getNextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 841:
                    switch (yytok) {
                        case '[':
                            yyn = 428;
                            continue;
                    }
                    yyn = 947;
                    continue;

                case 370:
                    yyst[yysp] = 370;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.getNextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 842:
                    switch (yytok) {
                        case '[':
                            yyn = 429;
                            continue;
                    }
                    yyn = 947;
                    continue;

                case 371:
                    yyst[yysp] = 371;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 843:
                    switch (yytok) {
                        case ')':
                            yyn = 430;
                            continue;
                    }
                    yyn = 947;
                    continue;

                case 372:
                    yyst[yysp] = 372;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 844:
                    switch (yytok) {
                        case ')':
                            yyn = 431;
                            continue;
                    }
                    yyn = 947;
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
                case 845:
                    switch (yytok) {
                        case FLOAT:
                            yyn = 89;
                            continue;
                        case IDENTIFIER:
                            yyn = 90;
                            continue;
                        case INTEGER:
                            yyn = 91;
                            continue;
                        case '(':
                            yyn = 434;
                            continue;
                    }
                    yyn = 947;
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
                case 846:
                    switch (yytok) {
                        case INTEGER:
                            yyn = 91;
                            continue;
                        case IDENTIFIER:
                            yyn = 110;
                            continue;
                        case '(':
                            yyn = 436;
                            continue;
                    }
                    yyn = 947;
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
                case 847:
                    yyn = yys375();
                    continue;

                case 376:
                    yyst[yysp] = 376;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.getNextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 848:
                    yyn = yys376();
                    continue;

                case 377:
                    yyst[yysp] = 377;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.getNextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 849:
                    yyn = yys377();
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
                case 850:
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
                case 851:
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
                case 852:
                    yyn = yys380();
                    continue;

                case 381:
                    yyst[yysp] = 381;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 853:
                    switch (yytok) {
                        case ']':
                            yyn = 437;
                            continue;
                    }
                    yyn = 947;
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
                case 854:
                    switch (yytok) {
                        case '(':
                            yyn = 438;
                            continue;
                    }
                    yyn = 947;
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
                case 855:
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
                case 856:
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
                case 857:
                    yyn = yys385();
                    continue;

                case 386:
                    yyst[yysp] = 386;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 858:
                    switch (yytok) {
                        case '[':
                        case ')':
                            yyn = yyr41();
                            continue;
                    }
                    yyn = 947;
                    continue;

                case 387:
                    yyst[yysp] = 387;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 859:
                    switch (yytok) {
                        case '[':
                        case ')':
                            yyn = yyr42();
                            continue;
                    }
                    yyn = 947;
                    continue;

                case 388:
                    yyst[yysp] = 388;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 860:
                    switch (yytok) {
                        case '[':
                        case ')':
                            yyn = yyr37();
                            continue;
                    }
                    yyn = 947;
                    continue;

                case 389:
                    yyst[yysp] = 389;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 861:
                    switch (yytok) {
                        case '[':
                        case ')':
                            yyn = yyr38();
                            continue;
                    }
                    yyn = 947;
                    continue;

                case 390:
                    yyst[yysp] = 390;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 862:
                    switch (yytok) {
                        case ']':
                            yyn = 439;
                            continue;
                    }
                    yyn = 947;
                    continue;

                case 391:
                    yyst[yysp] = 391;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 863:
                    switch (yytok) {
                        case '[':
                        case ')':
                            yyn = yyr43();
                            continue;
                    }
                    yyn = 947;
                    continue;

                case 392:
                    yyst[yysp] = 392;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 864:
                    switch (yytok) {
                        case ')':
                            yyn = 440;
                            continue;
                    }
                    yyn = 947;
                    continue;

                case 393:
                    yyst[yysp] = 393;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 865:
                    switch (yytok) {
                        case '[':
                        case ')':
                            yyn = yyr47();
                            continue;
                    }
                    yyn = 947;
                    continue;

                case 394:
                    yyst[yysp] = 394;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 866:
                    switch (yytok) {
                        case '[':
                        case ')':
                            yyn = yyr48();
                            continue;
                    }
                    yyn = 947;
                    continue;

                case 395:
                    yyst[yysp] = 395;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 867:
                    switch (yytok) {
                        case ')':
                            yyn = 441;
                            continue;
                    }
                    yyn = 947;
                    continue;

                case 396:
                    yyst[yysp] = 396;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 868:
                    switch (yytok) {
                        case ')':
                            yyn = 442;
                            continue;
                    }
                    yyn = 947;
                    continue;

                case 397:
                    yyst[yysp] = 397;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.getNextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 869:
                    switch (yytok) {
                        case '<':
                            yyn = 443;
                            continue;
                        case '>':
                            yyn = 444;
                            continue;
                    }
                    yyn = 947;
                    continue;

                case 398:
                    yyst[yysp] = 398;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.getNextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 870:
                    switch (yytok) {
                        case '[':
                        case ')':
                            yyn = yyr49();
                            continue;
                    }
                    yyn = 947;
                    continue;

                case 399:
                    yyst[yysp] = 399;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.getNextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 871:
                    yyn = yys399();
                    continue;

                case 400:
                    yyst[yysp] = 400;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.getNextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 872:
                    yyn = yys400();
                    continue;

                case 401:
                    yyst[yysp] = 401;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.getNextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 873:
                    yyn = yys401();
                    continue;

                case 402:
                    yyst[yysp] = 402;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.getNextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 874:
                    yyn = yys402();
                    continue;

                case 403:
                    yyst[yysp] = 403;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 875:
                    yyn = yys403();
                    continue;

                case 404:
                    yyst[yysp] = 404;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 876:
                    yyn = yys404();
                    continue;

                case 405:
                    yyst[yysp] = 405;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.getNextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 877:
                    yyn = yys405();
                    continue;

                case 406:
                    yyst[yysp] = 406;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.getNextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 878:
                    yyn = yys406();
                    continue;

                case 407:
                    yyst[yysp] = 407;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 879:
                    yyn = yys407();
                    continue;

                case 408:
                    yyst[yysp] = 408;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.getNextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 880:
                    yyn = yys408();
                    continue;

                case 409:
                    yyst[yysp] = 409;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.getNextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 881:
                    yyn = yys409();
                    continue;

                case 410:
                    yyst[yysp] = 410;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.getNextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 882:
                    yyn = yys410();
                    continue;

                case 411:
                    yyst[yysp] = 411;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.getNextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 883:
                    yyn = yys411();
                    continue;

                case 412:
                    yyst[yysp] = 412;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.getNextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 884:
                    switch (yytok) {
                        case ';':
                            yyn = yyr202();
                            continue;
                    }
                    yyn = 947;
                    continue;

                case 413:
                    yyst[yysp] = 413;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.getNextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 885:
                    yyn = yys413();
                    continue;

                case 414:
                    yyst[yysp] = 414;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.getNextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 886:
                    yyn = yys414();
                    continue;

                case 415:
                    yyst[yysp] = 415;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.getNextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 887:
                    yyn = yys415();
                    continue;

                case 416:
                    yyst[yysp] = 416;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 888:
                    yyn = yys416();
                    continue;

                case 417:
                    yyst[yysp] = 417;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.getNextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 889:
                    yyn = yys417();
                    continue;

                case 418:
                    yyst[yysp] = 418;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.getNextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 890:
                    switch (yytok) {
                        case INTEGER:
                            yyn = 91;
                            continue;
                        case IDENTIFIER:
                            yyn = 110;
                            continue;
                        case '(':
                            yyn = 111;
                            continue;
                    }
                    yyn = 947;
                    continue;

                case 419:
                    yyst[yysp] = 419;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.getNextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 891:
                    yyn = yys419();
                    continue;

                case 420:
                    yyst[yysp] = 420;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.getNextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 892:
                    yyn = yys420();
                    continue;

                case 421:
                    yyst[yysp] = 421;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.getNextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 893:
                    yyn = yys421();
                    continue;

                case 422:
                    yyst[yysp] = 422;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.getNextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 894:
                    switch (yytok) {
                        case FLOAT:
                            yyn = 89;
                            continue;
                        case IDENTIFIER:
                            yyn = 164;
                            continue;
                        case '(':
                            yyn = 221;
                            continue;
                    }
                    yyn = 947;
                    continue;

                case 423:
                    yyst[yysp] = 423;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 895:
                    switch (yytok) {
                        case '*':
                            yyn = 209;
                            continue;
                        case '+':
                            yyn = 210;
                            continue;
                        case '-':
                            yyn = 211;
                            continue;
                        case '/':
                            yyn = 212;
                            continue;
                        case '[':
                            yyn = 447;
                            continue;
                    }
                    yyn = 947;
                    continue;

                case 424:
                    yyst[yysp] = 424;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.getNextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 896:
                    yyn = yys424();
                    continue;

                case 425:
                    yyst[yysp] = 425;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 897:
                    yyn = yys425();
                    continue;

                case 426:
                    yyst[yysp] = 426;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.getNextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 898:
                    yyn = yys426();
                    continue;

                case 427:
                    yyst[yysp] = 427;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.getNextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 899:
                    switch (yytok) {
                        case FLOAT:
                            yyn = 89;
                            continue;
                        case IDENTIFIER:
                            yyn = 164;
                            continue;
                        case '(':
                            yyn = 221;
                            continue;
                    }
                    yyn = 947;
                    continue;

                case 428:
                    yyst[yysp] = 428;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.getNextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 900:
                    switch (yytok) {
                        case FLOAT:
                            yyn = 89;
                            continue;
                        case IDENTIFIER:
                            yyn = 164;
                            continue;
                        case '(':
                            yyn = 221;
                            continue;
                    }
                    yyn = 947;
                    continue;

                case 429:
                    yyst[yysp] = 429;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.getNextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 901:
                    switch (yytok) {
                        case FLOAT:
                            yyn = 89;
                            continue;
                        case IDENTIFIER:
                            yyn = 164;
                            continue;
                        case '(':
                            yyn = 221;
                            continue;
                    }
                    yyn = 947;
                    continue;

                case 430:
                    yyst[yysp] = 430;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.getNextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 902:
                    yyn = yys430();
                    continue;

                case 431:
                    yyst[yysp] = 431;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.getNextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 903:
                    yyn = yys431();
                    continue;

                case 432:
                    yyst[yysp] = 432;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 904:
                    yyn = yys432();
                    continue;

                case 433:
                    yyst[yysp] = 433;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 905:
                    yyn = yys433();
                    continue;

                case 434:
                    yyst[yysp] = 434;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.getNextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 906:
                    yyn = yys434();
                    continue;

                case 435:
                    yyst[yysp] = 435;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 907:
                    yyn = yys435();
                    continue;

                case 436:
                    yyst[yysp] = 436;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.getNextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 908:
                    yyn = yys436();
                    continue;

                case 437:
                    yyst[yysp] = 437;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.getNextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 909:
                    yyn = yys437();
                    continue;

                case 438:
                    yyst[yysp] = 438;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.getNextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 910:
                    yyn = yys438();
                    continue;

                case 439:
                    yyst[yysp] = 439;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.getNextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 911:
                    yyn = yys439();
                    continue;

                case 440:
                    yyst[yysp] = 440;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.getNextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 912:
                    switch (yytok) {
                        case '(':
                            yyn = 452;
                            continue;
                    }
                    yyn = 947;
                    continue;

                case 441:
                    yyst[yysp] = 441;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.getNextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 913:
                    switch (yytok) {
                        case '(':
                            yyn = 453;
                            continue;
                    }
                    yyn = 947;
                    continue;

                case 442:
                    yyst[yysp] = 442;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.getNextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 914:
                    switch (yytok) {
                        case '(':
                            yyn = 454;
                            continue;
                    }
                    yyn = 947;
                    continue;

                case 443:
                    yyst[yysp] = 443;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.getNextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 915:
                    switch (yytok) {
                        case '(':
                            yyn = 455;
                            continue;
                    }
                    yyn = 947;
                    continue;

                case 444:
                    yyst[yysp] = 444;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.getNextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 916:
                    switch (yytok) {
                        case '(':
                            yyn = 456;
                            continue;
                    }
                    yyn = 947;
                    continue;

                case 445:
                    yyst[yysp] = 445;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 917:
                    switch (yytok) {
                        case ')':
                            yyn = 457;
                            continue;
                    }
                    yyn = 947;
                    continue;

                case 446:
                    yyst[yysp] = 446;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 918:
                    switch (yytok) {
                        case ')':
                            yyn = 458;
                            continue;
                    }
                    yyn = 947;
                    continue;

                case 447:
                    yyst[yysp] = 447;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.getNextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 919:
                    switch (yytok) {
                        case FLOAT:
                            yyn = 89;
                            continue;
                        case IDENTIFIER:
                            yyn = 164;
                            continue;
                        case '(':
                            yyn = 221;
                            continue;
                    }
                    yyn = 947;
                    continue;

                case 448:
                    yyst[yysp] = 448;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.getNextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 920:
                    yyn = yys448();
                    continue;

                case 449:
                    yyst[yysp] = 449;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 921:
                    switch (yytok) {
                        case ')':
                            yyn = 459;
                            continue;
                    }
                    yyn = 947;
                    continue;

                case 450:
                    yyst[yysp] = 450;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 922:
                    switch (yytok) {
                        case ')':
                            yyn = 460;
                            continue;
                    }
                    yyn = 947;
                    continue;

                case 451:
                    yyst[yysp] = 451;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 923:
                    switch (yytok) {
                        case ')':
                            yyn = 461;
                            continue;
                    }
                    yyn = 947;
                    continue;

                case 452:
                    yyst[yysp] = 452;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.getNextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 924:
                    yyn = yys452();
                    continue;

                case 453:
                    yyst[yysp] = 453;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.getNextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 925:
                    yyn = yys453();
                    continue;

                case 454:
                    yyst[yysp] = 454;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.getNextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 926:
                    yyn = yys454();
                    continue;

                case 455:
                    yyst[yysp] = 455;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.getNextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 927:
                    yyn = yys455();
                    continue;

                case 456:
                    yyst[yysp] = 456;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.getNextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 928:
                    yyn = yys456();
                    continue;

                case 457:
                    yyst[yysp] = 457;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.getNextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 929:
                    yyn = yys457();
                    continue;

                case 458:
                    yyst[yysp] = 458;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.getNextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 930:
                    yyn = yys458();
                    continue;

                case 459:
                    yyst[yysp] = 459;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.getNextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 931:
                    yyn = yys459();
                    continue;

                case 460:
                    yyst[yysp] = 460;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.getNextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 932:
                    yyn = yys460();
                    continue;

                case 461:
                    yyst[yysp] = 461;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.getNextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 933:
                    yyn = yys461();
                    continue;

                case 462:
                    yyst[yysp] = 462;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 934:
                    switch (yytok) {
                        case ')':
                            yyn = 467;
                            continue;
                    }
                    yyn = 947;
                    continue;

                case 463:
                    yyst[yysp] = 463;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 935:
                    switch (yytok) {
                        case ')':
                            yyn = 468;
                            continue;
                    }
                    yyn = 947;
                    continue;

                case 464:
                    yyst[yysp] = 464;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 936:
                    switch (yytok) {
                        case ')':
                            yyn = 469;
                            continue;
                    }
                    yyn = 947;
                    continue;

                case 465:
                    yyst[yysp] = 465;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 937:
                    switch (yytok) {
                        case ')':
                            yyn = 470;
                            continue;
                    }
                    yyn = 947;
                    continue;

                case 466:
                    yyst[yysp] = 466;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 938:
                    switch (yytok) {
                        case ')':
                            yyn = 471;
                            continue;
                    }
                    yyn = 947;
                    continue;

                case 467:
                    yyst[yysp] = 467;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.getNextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 939:
                    switch (yytok) {
                        case '[':
                        case ')':
                            yyn = yyr44();
                            continue;
                    }
                    yyn = 947;
                    continue;

                case 468:
                    yyst[yysp] = 468;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.getNextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 940:
                    switch (yytok) {
                        case '[':
                        case ')':
                            yyn = yyr46();
                            continue;
                    }
                    yyn = 947;
                    continue;

                case 469:
                    yyst[yysp] = 469;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.getNextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 941:
                    switch (yytok) {
                        case '[':
                        case ')':
                            yyn = yyr45();
                            continue;
                    }
                    yyn = 947;
                    continue;

                case 470:
                    yyst[yysp] = 470;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.getNextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 942:
                    switch (yytok) {
                        case '[':
                        case ')':
                            yyn = yyr39();
                            continue;
                    }
                    yyn = 947;
                    continue;

                case 471:
                    yyst[yysp] = 471;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.getNextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 943:
                    switch (yytok) {
                        case '[':
                        case ')':
                            yyn = yyr40();
                            continue;
                    }
                    yyn = 947;
                    continue;

                case 944:
                    return true;
                case 945:
                    yyerror("stack overflow");
                case 946:
                    return false;
                case 947:
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
                return 30;
            case AT:
                return 31;
            case AV:
                return 32;
            case AVANZA:
                return 33;
            case AZAR:
                return 34;
            case BAJALAPIZ:
                return 35;
            case BL:
                return 36;
            case BORRAPANTALLA:
                return 37;
            case CENTRO:
                return 38;
            case COS:
                return 39;
            case DIFERENCIA:
                return 40;
            case DIVISION:
                return 41;
            case EJECUTA:
                return 42;
            case ELEGIR:
                return 43;
            case ELEMENTO:
                return 44;
            case ESPERA:
                return 45;
            case GD:
                return 46;
            case GI:
                return 47;
            case GIRADERECHA:
                return 48;
            case GIRAIZQUIERDA:
                return 49;
            case IDENTIFIER:
                return 50;
            case INC:
                return 51;
            case INIC:
                return 52;
            case MENOS:
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
        }
        return 947;
    }

    private int yys2() {
        switch (yytok) {
            case FLOAT:
            case '>':
            case VERDE:
            case CIAN:
            case '/':
            case O:
            case '*':
            case Y:
            case PARA:
            case AZUL:
            case AMARILLO:
            case '<':
            case '(':
            case '-':
            case '=':
            case '+':
            case ')':
            case error:
            case MARRON:
            case '[':
            case CUENTA:
            case GRIS:
            case ROJO:
            case IGUALES:
            case BOOLEAN:
            case INTEGER:
            case BLANCO:
            case NEGRO:
            case MENORQUE:
            case MAYORQUE:
            case ENDINPUT:
                return 947;
        }
        return yyr6();
    }

    private int yys4() {
        switch (yytok) {
            case FLOAT:
            case '>':
            case VERDE:
            case CIAN:
            case '/':
            case O:
            case '*':
            case Y:
            case PARA:
            case AZUL:
            case AMARILLO:
            case '<':
            case '(':
            case '-':
            case '=':
            case '+':
            case ')':
            case error:
            case MARRON:
            case '[':
            case CUENTA:
            case GRIS:
            case ROJO:
            case IGUALES:
            case BOOLEAN:
            case INTEGER:
            case BLANCO:
            case NEGRO:
            case MENORQUE:
            case MAYORQUE:
            case ENDINPUT:
                return 947;
        }
        return yyr118();
    }

    private int yys5() {
        switch (yytok) {
            case FLOAT:
            case '>':
            case VERDE:
            case CIAN:
            case '/':
            case O:
            case '*':
            case Y:
            case PARA:
            case AZUL:
            case AMARILLO:
            case '<':
            case '(':
            case '-':
            case '=':
            case '+':
            case ')':
            case error:
            case MARRON:
            case '[':
            case CUENTA:
            case GRIS:
            case ROJO:
            case IGUALES:
            case BOOLEAN:
            case INTEGER:
            case BLANCO:
            case NEGRO:
            case MENORQUE:
            case MAYORQUE:
            case ENDINPUT:
                return 947;
        }
        return yyr144();
    }

    private int yys6() {
        switch (yytok) {
            case FLOAT:
            case '>':
            case VERDE:
            case CIAN:
            case '/':
            case O:
            case '*':
            case Y:
            case PARA:
            case AZUL:
            case AMARILLO:
            case '<':
            case '(':
            case '-':
            case '=':
            case '+':
            case ')':
            case error:
            case MARRON:
            case '[':
            case CUENTA:
            case GRIS:
            case ROJO:
            case IGUALES:
            case BOOLEAN:
            case INTEGER:
            case BLANCO:
            case NEGRO:
            case MENORQUE:
            case MAYORQUE:
            case ENDINPUT:
                return 947;
        }
        return yyr192();
    }

    private int yys7() {
        switch (yytok) {
            case FLOAT:
            case '>':
            case VERDE:
            case CIAN:
            case '/':
            case O:
            case '*':
            case Y:
            case PARA:
            case AZUL:
            case AMARILLO:
            case '<':
            case '(':
            case '-':
            case '=':
            case '+':
            case ')':
            case error:
            case MARRON:
            case '[':
            case CUENTA:
            case GRIS:
            case ROJO:
            case IGUALES:
            case BOOLEAN:
            case INTEGER:
            case BLANCO:
            case NEGRO:
            case MENORQUE:
            case MAYORQUE:
            case ENDINPUT:
                return 947;
        }
        return yyr170();
    }

    private int yys8() {
        switch (yytok) {
            case FLOAT:
            case '>':
            case VERDE:
            case CIAN:
            case '/':
            case O:
            case '*':
            case Y:
            case PARA:
            case AZUL:
            case AMARILLO:
            case '<':
            case '(':
            case '-':
            case '=':
            case '+':
            case ')':
            case error:
            case MARRON:
            case '[':
            case CUENTA:
            case GRIS:
            case ROJO:
            case IGUALES:
            case BOOLEAN:
            case INTEGER:
            case BLANCO:
            case NEGRO:
            case MENORQUE:
            case MAYORQUE:
            case ENDINPUT:
                return 947;
        }
        return yyr182();
    }

    private int yys9() {
        switch (yytok) {
            case FLOAT:
            case '>':
            case VERDE:
            case CIAN:
            case '/':
            case O:
            case '*':
            case Y:
            case PARA:
            case AZUL:
            case AMARILLO:
            case '<':
            case '(':
            case '-':
            case '=':
            case '+':
            case ')':
            case error:
            case MARRON:
            case '[':
            case CUENTA:
            case GRIS:
            case ROJO:
            case IGUALES:
            case BOOLEAN:
            case INTEGER:
            case BLANCO:
            case NEGRO:
            case MENORQUE:
            case MAYORQUE:
            case ENDINPUT:
                return 947;
        }
        return yyr117();
    }

    private int yys10() {
        switch (yytok) {
            case FLOAT:
            case '>':
            case VERDE:
            case CIAN:
            case '/':
            case O:
            case '*':
            case Y:
            case PARA:
            case AZUL:
            case AMARILLO:
            case '<':
            case '(':
            case '-':
            case '=':
            case '+':
            case ')':
            case error:
            case MARRON:
            case '[':
            case CUENTA:
            case GRIS:
            case ROJO:
            case IGUALES:
            case BOOLEAN:
            case INTEGER:
            case BLANCO:
            case NEGRO:
            case MENORQUE:
            case MAYORQUE:
            case ENDINPUT:
                return 947;
        }
        return yyr143();
    }

    private int yys11() {
        switch (yytok) {
            case FLOAT:
            case '>':
            case VERDE:
            case CIAN:
            case '/':
            case O:
            case '*':
            case Y:
            case PARA:
            case AZUL:
            case AMARILLO:
            case '<':
            case '(':
            case '-':
            case '=':
            case '+':
            case ')':
            case error:
            case MARRON:
            case '[':
            case CUENTA:
            case GRIS:
            case ROJO:
            case IGUALES:
            case BOOLEAN:
            case INTEGER:
            case BLANCO:
            case NEGRO:
            case MENORQUE:
            case MAYORQUE:
            case ENDINPUT:
                return 947;
        }
        return yyr191();
    }

    private int yys12() {
        switch (yytok) {
            case FLOAT:
            case '>':
            case VERDE:
            case CIAN:
            case '/':
            case O:
            case '*':
            case Y:
            case PARA:
            case AZUL:
            case AMARILLO:
            case '<':
            case '(':
            case '-':
            case '=':
            case '+':
            case ')':
            case error:
            case MARRON:
            case '[':
            case CUENTA:
            case GRIS:
            case ROJO:
            case IGUALES:
            case BOOLEAN:
            case INTEGER:
            case BLANCO:
            case NEGRO:
            case MENORQUE:
            case MAYORQUE:
            case ENDINPUT:
                return 947;
        }
        return yyr169();
    }

    private int yys13() {
        switch (yytok) {
            case FLOAT:
            case '>':
            case VERDE:
            case CIAN:
            case '/':
            case O:
            case '*':
            case Y:
            case PARA:
            case AZUL:
            case AMARILLO:
            case '<':
            case '(':
            case '-':
            case '=':
            case '+':
            case ')':
            case error:
            case MARRON:
            case '[':
            case CUENTA:
            case GRIS:
            case ROJO:
            case IGUALES:
            case BOOLEAN:
            case INTEGER:
            case BLANCO:
            case NEGRO:
            case MENORQUE:
            case MAYORQUE:
            case ENDINPUT:
                return 947;
        }
        return yyr181();
    }

    private int yys14() {
        switch (yytok) {
            case FLOAT:
            case '>':
            case VERDE:
            case CIAN:
            case '/':
            case O:
            case '*':
            case Y:
            case PARA:
            case AZUL:
            case AMARILLO:
            case '<':
            case '(':
            case '-':
            case '=':
            case '+':
            case ')':
            case error:
            case MARRON:
            case '[':
            case CUENTA:
            case GRIS:
            case ROJO:
            case IGUALES:
            case BOOLEAN:
            case INTEGER:
            case BLANCO:
            case NEGRO:
            case MENORQUE:
            case MAYORQUE:
            case ENDINPUT:
                return 947;
        }
        return yyr8();
    }

    private int yys15() {
        switch (yytok) {
            case FLOAT:
            case '>':
            case VERDE:
            case CIAN:
            case '/':
            case O:
            case '*':
            case Y:
            case PARA:
            case AZUL:
            case AMARILLO:
            case '<':
            case '(':
            case '-':
            case '=':
            case '+':
            case ')':
            case error:
            case MARRON:
            case '[':
            case CUENTA:
            case GRIS:
            case ROJO:
            case IGUALES:
            case BOOLEAN:
            case INTEGER:
            case BLANCO:
            case NEGRO:
            case MENORQUE:
            case MAYORQUE:
            case ENDINPUT:
                return 947;
        }
        return yyr9();
    }

    private int yys16() {
        switch (yytok) {
            case FLOAT:
            case '>':
            case VERDE:
            case CIAN:
            case '/':
            case O:
            case '*':
            case Y:
            case PARA:
            case AZUL:
            case AMARILLO:
            case '<':
            case '(':
            case '-':
            case '=':
            case '+':
            case ')':
            case error:
            case MARRON:
            case '[':
            case CUENTA:
            case GRIS:
            case ROJO:
            case IGUALES:
            case BOOLEAN:
            case INTEGER:
            case BLANCO:
            case NEGRO:
            case MENORQUE:
            case MAYORQUE:
            case ENDINPUT:
                return 947;
        }
        return yyr11();
    }

    private int yys17() {
        switch (yytok) {
            case FLOAT:
            case '>':
            case VERDE:
            case CIAN:
            case '/':
            case O:
            case '*':
            case Y:
            case PARA:
            case AZUL:
            case AMARILLO:
            case '<':
            case '(':
            case '-':
            case '=':
            case '+':
            case ')':
            case error:
            case MARRON:
            case '[':
            case CUENTA:
            case GRIS:
            case ROJO:
            case IGUALES:
            case BOOLEAN:
            case INTEGER:
            case BLANCO:
            case NEGRO:
            case MENORQUE:
            case MAYORQUE:
            case ENDINPUT:
                return 947;
        }
        return yyr18();
    }

    private int yys18() {
        switch (yytok) {
            case FLOAT:
            case '>':
            case VERDE:
            case CIAN:
            case '/':
            case O:
            case '*':
            case Y:
            case PARA:
            case AZUL:
            case AMARILLO:
            case '<':
            case '(':
            case '-':
            case '=':
            case '+':
            case ')':
            case error:
            case MARRON:
            case '[':
            case CUENTA:
            case GRIS:
            case ROJO:
            case IGUALES:
            case BOOLEAN:
            case INTEGER:
            case BLANCO:
            case NEGRO:
            case MENORQUE:
            case MAYORQUE:
            case ENDINPUT:
                return 947;
        }
        return yyr20();
    }

    private int yys19() {
        switch (yytok) {
            case FLOAT:
            case '>':
            case VERDE:
            case CIAN:
            case '/':
            case O:
            case '*':
            case Y:
            case PARA:
            case AZUL:
            case AMARILLO:
            case '<':
            case '(':
            case '-':
            case '=':
            case '+':
            case ')':
            case error:
            case MARRON:
            case '[':
            case CUENTA:
            case GRIS:
            case ROJO:
            case IGUALES:
            case BOOLEAN:
            case INTEGER:
            case BLANCO:
            case NEGRO:
            case MENORQUE:
            case MAYORQUE:
            case ENDINPUT:
                return 947;
        }
        return yyr17();
    }

    private int yys20() {
        switch (yytok) {
            case FLOAT:
            case '>':
            case VERDE:
            case CIAN:
            case '/':
            case O:
            case '*':
            case Y:
            case PARA:
            case AZUL:
            case AMARILLO:
            case '<':
            case '(':
            case '-':
            case '=':
            case '+':
            case ')':
            case error:
            case MARRON:
            case '[':
            case CUENTA:
            case GRIS:
            case ROJO:
            case IGUALES:
            case BOOLEAN:
            case INTEGER:
            case BLANCO:
            case NEGRO:
            case MENORQUE:
            case MAYORQUE:
            case ENDINPUT:
                return 947;
        }
        return yyr14();
    }

    private int yys22() {
        switch (yytok) {
            case FLOAT:
            case '>':
            case VERDE:
            case CIAN:
            case '/':
            case O:
            case '*':
            case Y:
            case PARA:
            case AZUL:
            case AMARILLO:
            case '<':
            case '(':
            case '-':
            case '=':
            case '+':
            case ')':
            case error:
            case MARRON:
            case '[':
            case CUENTA:
            case GRIS:
            case ROJO:
            case IGUALES:
            case BOOLEAN:
            case INTEGER:
            case BLANCO:
            case NEGRO:
            case MENORQUE:
            case MAYORQUE:
            case ENDINPUT:
                return 947;
        }
        return yyr7();
    }

    private int yys24() {
        switch (yytok) {
            case FLOAT:
            case '>':
            case VERDE:
            case CIAN:
            case '/':
            case O:
            case '*':
            case Y:
            case PARA:
            case AZUL:
            case AMARILLO:
            case '<':
            case '(':
            case '-':
            case '=':
            case '+':
            case ')':
            case error:
            case MARRON:
            case '[':
            case CUENTA:
            case GRIS:
            case ROJO:
            case IGUALES:
            case BOOLEAN:
            case INTEGER:
            case BLANCO:
            case NEGRO:
            case MENORQUE:
            case MAYORQUE:
            case ENDINPUT:
                return 947;
        }
        return yyr19();
    }

    private int yys25() {
        switch (yytok) {
            case FLOAT:
            case '>':
            case VERDE:
            case CIAN:
            case '/':
            case O:
            case '*':
            case Y:
            case PARA:
            case AZUL:
            case AMARILLO:
            case '<':
            case '(':
            case '-':
            case '=':
            case '+':
            case ')':
            case error:
            case MARRON:
            case '[':
            case CUENTA:
            case GRIS:
            case ROJO:
            case IGUALES:
            case BOOLEAN:
            case INTEGER:
            case BLANCO:
            case NEGRO:
            case MENORQUE:
            case MAYORQUE:
            case ENDINPUT:
                return 947;
        }
        return yyr10();
    }

    private int yys26() {
        switch (yytok) {
            case FLOAT:
            case '>':
            case VERDE:
            case CIAN:
            case '/':
            case O:
            case '*':
            case Y:
            case PARA:
            case AZUL:
            case AMARILLO:
            case '<':
            case '(':
            case '-':
            case '=':
            case '+':
            case ')':
            case error:
            case MARRON:
            case '[':
            case CUENTA:
            case GRIS:
            case ROJO:
            case IGUALES:
            case BOOLEAN:
            case INTEGER:
            case BLANCO:
            case NEGRO:
            case MENORQUE:
            case MAYORQUE:
            case ENDINPUT:
                return 947;
        }
        return yyr12();
    }

    private int yys27() {
        switch (yytok) {
            case FLOAT:
            case '>':
            case VERDE:
            case CIAN:
            case '/':
            case O:
            case '*':
            case Y:
            case PARA:
            case AZUL:
            case AMARILLO:
            case '<':
            case '(':
            case '-':
            case '=':
            case '+':
            case ')':
            case error:
            case MARRON:
            case '[':
            case CUENTA:
            case GRIS:
            case ROJO:
            case IGUALES:
            case BOOLEAN:
            case INTEGER:
            case BLANCO:
            case NEGRO:
            case MENORQUE:
            case MAYORQUE:
            case ENDINPUT:
                return 947;
        }
        return yyr16();
    }

    private int yys28() {
        switch (yytok) {
            case FLOAT:
            case '>':
            case VERDE:
            case CIAN:
            case '/':
            case O:
            case '*':
            case Y:
            case PARA:
            case AZUL:
            case AMARILLO:
            case '<':
            case '(':
            case '-':
            case '=':
            case '+':
            case ')':
            case error:
            case MARRON:
            case '[':
            case CUENTA:
            case GRIS:
            case ROJO:
            case IGUALES:
            case BOOLEAN:
            case INTEGER:
            case BLANCO:
            case NEGRO:
            case MENORQUE:
            case MAYORQUE:
            case ENDINPUT:
                return 947;
        }
        return yyr13();
    }

    private int yys29() {
        switch (yytok) {
            case FLOAT:
            case '>':
            case VERDE:
            case CIAN:
            case '/':
            case O:
            case '*':
            case Y:
            case PARA:
            case AZUL:
            case AMARILLO:
            case '<':
            case '(':
            case '-':
            case '=':
            case '+':
            case ')':
            case error:
            case MARRON:
            case '[':
            case CUENTA:
            case GRIS:
            case ROJO:
            case IGUALES:
            case BOOLEAN:
            case INTEGER:
            case BLANCO:
            case NEGRO:
            case MENORQUE:
            case MAYORQUE:
            case ENDINPUT:
                return 947;
        }
        return yyr15();
    }

    private int yys30() {
        switch (yytok) {
            case FLOAT:
            case '>':
            case VERDE:
            case CIAN:
            case '/':
            case O:
            case '*':
            case Y:
            case PARA:
            case AZUL:
            case AMARILLO:
            case '<':
            case '(':
            case '-':
            case '=':
            case '+':
            case ')':
            case error:
            case MARRON:
            case '[':
            case CUENTA:
            case GRIS:
            case ROJO:
            case IGUALES:
            case BOOLEAN:
            case INTEGER:
            case BLANCO:
            case NEGRO:
            case MENORQUE:
            case MAYORQUE:
            case ENDINPUT:
                return 947;
        }
        return yyr82();
    }

    private int yys31() {
        switch (yytok) {
            case FLOAT:
            case '>':
            case VERDE:
            case CIAN:
            case '/':
            case O:
            case '*':
            case Y:
            case PARA:
            case AZUL:
            case AMARILLO:
            case '<':
            case '(':
            case '-':
            case '=':
            case '+':
            case ')':
            case error:
            case MARRON:
            case '[':
            case CUENTA:
            case GRIS:
            case ROJO:
            case IGUALES:
            case BOOLEAN:
            case INTEGER:
            case BLANCO:
            case NEGRO:
            case MENORQUE:
            case MAYORQUE:
            case ENDINPUT:
                return 947;
        }
        return yyr83();
    }

    private int yys35() {
        switch (yytok) {
            case FLOAT:
            case '>':
            case VERDE:
            case CIAN:
            case '/':
            case O:
            case '*':
            case Y:
            case PARA:
            case AZUL:
            case AMARILLO:
            case '<':
            case '(':
            case '-':
            case '=':
            case '+':
            case ')':
            case error:
            case MARRON:
            case '[':
            case CUENTA:
            case GRIS:
            case ROJO:
            case IGUALES:
            case BOOLEAN:
            case INTEGER:
            case BLANCO:
            case NEGRO:
            case MENORQUE:
            case MAYORQUE:
            case ENDINPUT:
                return 947;
        }
        return yyr84();
    }

    private int yys36() {
        switch (yytok) {
            case FLOAT:
            case '>':
            case VERDE:
            case CIAN:
            case '/':
            case O:
            case '*':
            case Y:
            case PARA:
            case AZUL:
            case AMARILLO:
            case '<':
            case '(':
            case '-':
            case '=':
            case '+':
            case ')':
            case error:
            case MARRON:
            case '[':
            case CUENTA:
            case GRIS:
            case ROJO:
            case IGUALES:
            case BOOLEAN:
            case INTEGER:
            case BLANCO:
            case NEGRO:
            case MENORQUE:
            case MAYORQUE:
            case ENDINPUT:
                return 947;
        }
        return yyr85();
    }

    private int yys37() {
        switch (yytok) {
            case FLOAT:
            case '>':
            case VERDE:
            case CIAN:
            case '/':
            case O:
            case '*':
            case Y:
            case PARA:
            case AZUL:
            case AMARILLO:
            case '<':
            case '(':
            case '-':
            case '=':
            case '+':
            case ')':
            case error:
            case MARRON:
            case '[':
            case CUENTA:
            case GRIS:
            case ROJO:
            case IGUALES:
            case BOOLEAN:
            case INTEGER:
            case BLANCO:
            case NEGRO:
            case MENORQUE:
            case MAYORQUE:
            case ENDINPUT:
                return 947;
        }
        return yyr89();
    }

    private int yys38() {
        switch (yytok) {
            case FLOAT:
            case '>':
            case VERDE:
            case CIAN:
            case '/':
            case O:
            case '*':
            case Y:
            case PARA:
            case AZUL:
            case AMARILLO:
            case '<':
            case '(':
            case '-':
            case '=':
            case '+':
            case ')':
            case error:
            case MARRON:
            case '[':
            case CUENTA:
            case GRIS:
            case ROJO:
            case IGUALES:
            case BOOLEAN:
            case INTEGER:
            case BLANCO:
            case NEGRO:
            case MENORQUE:
            case MAYORQUE:
            case ENDINPUT:
                return 947;
        }
        return yyr88();
    }

    private int yys50() {
        switch (yytok) {
            case ')':
            case MENORQUE:
            case '>':
            case ENDINPUT:
            case '+':
            case '-':
            case CIAN:
            case VERDE:
            case PARA:
            case AZUL:
            case '<':
            case O:
            case NEGRO:
            case MAYORQUE:
            case '=':
            case '*':
            case Y:
            case error:
            case MARRON:
            case '[':
            case CUENTA:
            case GRIS:
            case IGUALES:
            case ROJO:
            case AMARILLO:
            case BOOLEAN:
            case '/':
            case BLANCO:
                return 947;
            case FLOAT:
                return 89;
            case IDENTIFIER:
                return 90;
            case INTEGER:
                return 91;
            case '(':
                return 104;
        }
        return yyr209();
    }

    private int yys54() {
        switch (yytok) {
            case FLOAT:
            case '>':
            case VERDE:
            case CIAN:
            case '/':
            case O:
            case '*':
            case Y:
            case PARA:
            case AZUL:
            case AMARILLO:
            case '<':
            case '(':
            case '-':
            case '=':
            case '+':
            case ')':
            case error:
            case MARRON:
            case '[':
            case CUENTA:
            case GRIS:
            case ROJO:
            case IGUALES:
            case BOOLEAN:
            case INTEGER:
            case BLANCO:
            case NEGRO:
            case MENORQUE:
            case MAYORQUE:
            case ENDINPUT:
                return 947;
        }
        return yyr80();
    }

    private int yys55() {
        switch (yytok) {
            case FLOAT:
            case '>':
            case VERDE:
            case CIAN:
            case '/':
            case O:
            case '*':
            case Y:
            case PARA:
            case AZUL:
            case AMARILLO:
            case '<':
            case '(':
            case '-':
            case '=':
            case '+':
            case ')':
            case error:
            case MARRON:
            case '[':
            case CUENTA:
            case GRIS:
            case ROJO:
            case IGUALES:
            case BOOLEAN:
            case INTEGER:
            case BLANCO:
            case NEGRO:
            case MENORQUE:
            case MAYORQUE:
            case ENDINPUT:
                return 947;
        }
        return yyr81();
    }

    private int yys57() {
        switch (yytok) {
            case AMARILLO:
                return 132;
            case AZUL:
                return 133;
            case BLANCO:
                return 134;
            case CIAN:
                return 135;
            case GRIS:
                return 136;
            case MARRON:
                return 137;
            case NEGRO:
                return 138;
            case ROJO:
                return 139;
            case VERDE:
                return 140;
        }
        return 947;
    }

    private int yys58() {
        switch (yytok) {
            case AMARILLO:
                return 132;
            case AZUL:
                return 133;
            case BLANCO:
                return 134;
            case CIAN:
                return 135;
            case GRIS:
                return 136;
            case MARRON:
                return 137;
            case NEGRO:
                return 138;
            case ROJO:
                return 139;
            case VERDE:
                return 140;
        }
        return 947;
    }

    private int yys74() {
        switch (yytok) {
            case FLOAT:
            case '>':
            case VERDE:
            case CIAN:
            case '/':
            case O:
            case '*':
            case Y:
            case PARA:
            case AZUL:
            case AMARILLO:
            case '<':
            case '(':
            case '-':
            case '=':
            case '+':
            case ')':
            case error:
            case MARRON:
            case '[':
            case CUENTA:
            case GRIS:
            case ROJO:
            case IGUALES:
            case BOOLEAN:
            case INTEGER:
            case BLANCO:
            case NEGRO:
            case MENORQUE:
            case MAYORQUE:
            case ENDINPUT:
                return 947;
        }
        return yyr90();
    }

    private int yys75() {
        switch (yytok) {
            case FLOAT:
            case '>':
            case VERDE:
            case CIAN:
            case '/':
            case O:
            case '*':
            case Y:
            case PARA:
            case AZUL:
            case AMARILLO:
            case '<':
            case '(':
            case '-':
            case '=':
            case '+':
            case ')':
            case error:
            case MARRON:
            case '[':
            case CUENTA:
            case GRIS:
            case ROJO:
            case IGUALES:
            case BOOLEAN:
            case INTEGER:
            case BLANCO:
            case NEGRO:
            case MENORQUE:
            case MAYORQUE:
            case ENDINPUT:
                return 947;
        }
        return yyr87();
    }

    private int yys78() {
        switch (yytok) {
            case AZAR:
                return 34;
            case COS:
                return 39;
            case DIFERENCIA:
                return 40;
            case DIVISION:
                return 41;
            case ELEGIR:
                return 43;
            case ELEMENTO:
                return 44;
            case MENOS:
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
            case FLOAT:
                return 89;
            case INTEGER:
                return 91;
            case BOOLEAN:
                return 190;
            case IDENTIFIER:
                return 191;
            case IGUALES:
                return 192;
            case MAYORQUE:
                return 193;
            case MENORQUE:
                return 194;
            case O:
                return 195;
            case Y:
                return 196;
            case '(':
                return 197;
        }
        return 947;
    }

    private int yys79() {
        switch (yytok) {
            case FLOAT:
            case '>':
            case VERDE:
            case CIAN:
            case '/':
            case O:
            case '*':
            case Y:
            case PARA:
            case AZUL:
            case AMARILLO:
            case '<':
            case '(':
            case '-':
            case '=':
            case '+':
            case ')':
            case error:
            case MARRON:
            case '[':
            case CUENTA:
            case GRIS:
            case ROJO:
            case IGUALES:
            case BOOLEAN:
            case INTEGER:
            case BLANCO:
            case NEGRO:
            case MENORQUE:
            case MAYORQUE:
            case ENDINPUT:
                return 947;
        }
        return yyr86();
    }

    private int yys84() {
        switch (yytok) {
            case APARECETORTUGA:
                return 30;
            case AT:
                return 31;
            case AV:
                return 32;
            case AVANZA:
                return 33;
            case AZAR:
                return 34;
            case BAJALAPIZ:
                return 35;
            case BL:
                return 36;
            case BORRAPANTALLA:
                return 37;
            case CENTRO:
                return 38;
            case COS:
                return 39;
            case DIFERENCIA:
                return 40;
            case DIVISION:
                return 41;
            case EJECUTA:
                return 42;
            case ELEGIR:
                return 43;
            case ELEMENTO:
                return 44;
            case ESPERA:
                return 45;
            case GD:
                return 46;
            case GI:
                return 47;
            case GIRADERECHA:
                return 48;
            case GIRAIZQUIERDA:
                return 49;
            case IDENTIFIER:
                return 50;
            case INC:
                return 51;
            case INIC:
                return 52;
            case MENOS:
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
            case ENDINPUT:
                return yyr4();
        }
        return 947;
    }

    private int yys85() {
        switch (yytok) {
            case APARECETORTUGA:
                return 30;
            case AT:
                return 31;
            case AV:
                return 32;
            case AVANZA:
                return 33;
            case AZAR:
                return 34;
            case BAJALAPIZ:
                return 35;
            case BL:
                return 36;
            case BORRAPANTALLA:
                return 37;
            case CENTRO:
                return 38;
            case COS:
                return 39;
            case DIFERENCIA:
                return 40;
            case DIVISION:
                return 41;
            case EJECUTA:
                return 42;
            case ELEGIR:
                return 43;
            case ELEMENTO:
                return 44;
            case ESPERA:
                return 45;
            case GD:
                return 46;
            case GI:
                return 47;
            case GIRADERECHA:
                return 48;
            case GIRAIZQUIERDA:
                return 49;
            case IDENTIFIER:
                return 50;
            case INC:
                return 51;
            case INIC:
                return 52;
            case MENOS:
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
            case ENDINPUT:
                return yyr5();
        }
        return 947;
    }

    private int yys86() {
        switch (yytok) {
            case CIAN:
            case MENORQUE:
            case BOOLEAN:
            case AMARILLO:
            case VERDE:
            case MAYORQUE:
            case CUENTA:
            case PARA:
            case IGUALES:
            case ROJO:
            case Y:
            case error:
            case ENDINPUT:
            case O:
            case BLANCO:
            case NEGRO:
            case MARRON:
            case '=':
            case AZUL:
            case GRIS:
                return 947;
            case '*':
                return 205;
            case '+':
                return 206;
            case '-':
                return 207;
            case '/':
                return 208;
        }
        return yyr36();
    }

    private int yys87() {
        switch (yytok) {
            case CIAN:
            case MENORQUE:
            case BOOLEAN:
            case AMARILLO:
            case VERDE:
            case MAYORQUE:
            case CUENTA:
            case PARA:
            case IGUALES:
            case ROJO:
            case Y:
            case error:
            case ENDINPUT:
            case O:
            case BLANCO:
            case NEGRO:
            case MARRON:
            case '=':
            case AZUL:
            case GRIS:
                return 947;
            case '*':
                return 209;
            case '+':
                return 210;
            case '-':
                return 211;
            case '/':
                return 212;
        }
        return yyr35();
    }

    private int yys88() {
        switch (yytok) {
            case FLOAT:
            case '>':
            case VERDE:
            case CIAN:
            case '/':
            case O:
            case '*':
            case Y:
            case PARA:
            case AZUL:
            case AMARILLO:
            case '<':
            case '(':
            case '-':
            case '=':
            case '+':
            case ')':
            case error:
            case MARRON:
            case '[':
            case CUENTA:
            case GRIS:
            case ROJO:
            case IGUALES:
            case BOOLEAN:
            case INTEGER:
            case BLANCO:
            case NEGRO:
            case MENORQUE:
            case MAYORQUE:
            case ENDINPUT:
                return 947;
        }
        return yyr92();
    }

    private int yys89() {
        switch (yytok) {
            case MENORQUE:
            case GRIS:
            case IGUALES:
            case '=':
            case BLANCO:
            case ROJO:
            case MARRON:
            case CUENTA:
            case CIAN:
            case PARA:
            case error:
            case ENDINPUT:
            case VERDE:
            case MAYORQUE:
            case O:
            case Y:
            case NEGRO:
            case AMARILLO:
            case AZUL:
            case BOOLEAN:
                return 947;
        }
        return yyr34();
    }

    private int yys90() {
        switch (yytok) {
            case MENORQUE:
            case GRIS:
            case IGUALES:
            case '=':
            case BLANCO:
            case ROJO:
            case MARRON:
            case CUENTA:
            case CIAN:
            case PARA:
            case error:
            case ENDINPUT:
            case VERDE:
            case MAYORQUE:
            case O:
            case Y:
            case NEGRO:
            case AMARILLO:
            case AZUL:
            case BOOLEAN:
                return 947;
        }
        return yyr26();
    }

    private int yys91() {
        switch (yytok) {
            case MENORQUE:
            case GRIS:
            case IGUALES:
            case '=':
            case BLANCO:
            case ROJO:
            case MARRON:
            case CUENTA:
            case CIAN:
            case PARA:
            case error:
            case ENDINPUT:
            case VERDE:
            case MAYORQUE:
            case O:
            case Y:
            case NEGRO:
            case AMARILLO:
            case AZUL:
            case BOOLEAN:
                return 947;
        }
        return yyr27();
    }

    private int yys92() {
        switch (yytok) {
            case AZAR:
                return 34;
            case COS:
                return 39;
            case DIFERENCIA:
                return 40;
            case DIVISION:
                return 41;
            case ELEGIR:
                return 43;
            case ELEMENTO:
                return 44;
            case MENOS:
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
            case FLOAT:
                return 89;
            case IDENTIFIER:
                return 90;
            case INTEGER:
                return 91;
            case '(':
                return 104;
        }
        return 947;
    }

    private int yys93() {
        switch (yytok) {
            case FLOAT:
            case '>':
            case VERDE:
            case CIAN:
            case '/':
            case O:
            case '*':
            case Y:
            case PARA:
            case AZUL:
            case AMARILLO:
            case '<':
            case '(':
            case '-':
            case '=':
            case '+':
            case ')':
            case error:
            case MARRON:
            case '[':
            case CUENTA:
            case GRIS:
            case ROJO:
            case IGUALES:
            case BOOLEAN:
            case INTEGER:
            case BLANCO:
            case NEGRO:
            case MENORQUE:
            case MAYORQUE:
            case ENDINPUT:
                return 947;
        }
        return yyr91();
    }

    private int yys94() {
        switch (yytok) {
            case AZAR:
                return 34;
            case COS:
                return 39;
            case DIFERENCIA:
                return 40;
            case DIVISION:
                return 41;
            case ELEGIR:
                return 43;
            case ELEMENTO:
                return 44;
            case MENOS:
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
            case FLOAT:
                return 89;
            case IDENTIFIER:
                return 90;
            case INTEGER:
                return 91;
            case '(':
                return 104;
        }
        return 947;
    }

    private int yys95() {
        switch (yytok) {
            case AMARILLO:
            case Y:
            case PARA:
            case BOOLEAN:
            case MENORQUE:
            case O:
            case MARRON:
            case INTEGER:
            case GRIS:
            case CIAN:
            case '=':
            case '(':
            case error:
            case ENDINPUT:
            case BLANCO:
            case MAYORQUE:
            case VERDE:
            case NEGRO:
            case ROJO:
            case IGUALES:
            case AZUL:
            case FLOAT:
            case CUENTA:
                return 947;
            case '*':
                return 205;
            case '+':
                return 206;
            case '-':
                return 207;
            case '/':
                return 208;
        }
        return yyr125();
    }

    private int yys96() {
        switch (yytok) {
            case AMARILLO:
            case Y:
            case PARA:
            case BOOLEAN:
            case MENORQUE:
            case O:
            case MARRON:
            case INTEGER:
            case GRIS:
            case CIAN:
            case '=':
            case '(':
            case error:
            case ENDINPUT:
            case BLANCO:
            case MAYORQUE:
            case VERDE:
            case NEGRO:
            case ROJO:
            case IGUALES:
            case AZUL:
            case FLOAT:
            case CUENTA:
                return 947;
            case '*':
                return 209;
            case '+':
                return 210;
            case '-':
                return 211;
            case '/':
                return 212;
        }
        return yyr120();
    }

    private int yys97() {
        switch (yytok) {
            case AZAR:
                return 34;
            case COS:
                return 39;
            case DIFERENCIA:
                return 40;
            case DIVISION:
                return 41;
            case ELEGIR:
                return 43;
            case ELEMENTO:
                return 44;
            case MENOS:
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
            case FLOAT:
                return 89;
            case IDENTIFIER:
                return 90;
            case INTEGER:
                return 91;
            case '(':
                return 104;
        }
        return 947;
    }

    private int yys98() {
        switch (yytok) {
            case BOOLEAN:
            case '(':
            case INTEGER:
            case GRIS:
            case MENORQUE:
            case O:
            case Y:
            case '-':
            case ROJO:
            case CIAN:
            case '=':
            case '*':
            case '+':
            case ENDINPUT:
            case '/':
            case error:
            case VERDE:
            case MARRON:
            case PARA:
            case IGUALES:
            case AZUL:
            case FLOAT:
            case CUENTA:
            case AMARILLO:
            case BLANCO:
            case NEGRO:
            case MAYORQUE:
                return 947;
        }
        return yyr127();
    }

    private int yys99() {
        switch (yytok) {
            case AZAR:
                return 34;
            case COS:
                return 39;
            case DIFERENCIA:
                return 40;
            case DIVISION:
                return 41;
            case ELEGIR:
                return 43;
            case ELEMENTO:
                return 44;
            case MENOS:
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
            case FLOAT:
                return 89;
            case IDENTIFIER:
                return 90;
            case INTEGER:
                return 91;
            case '(':
                return 104;
        }
        return 947;
    }

    private int yys100() {
        switch (yytok) {
            case MAYORQUE:
            case error:
            case '=':
            case BOOLEAN:
            case MENORQUE:
            case O:
            case PARA:
            case GRIS:
            case AZUL:
            case CUENTA:
            case AMARILLO:
            case MARRON:
            case Y:
            case ENDINPUT:
            case BLANCO:
            case VERDE:
            case NEGRO:
            case INTEGER:
            case ROJO:
            case IGUALES:
            case CIAN:
                return 947;
            case FLOAT:
                return 89;
            case IDENTIFIER:
                return 164;
            case '*':
                return 205;
            case '+':
                return 206;
            case '-':
                return 207;
            case '/':
                return 208;
            case '(':
                return 221;
        }
        return yyr166();
    }

    private int yys101() {
        switch (yytok) {
            case BOOLEAN:
            case FLOAT:
            case '=':
            case CUENTA:
            case MENORQUE:
            case ENDINPUT:
            case VERDE:
            case PARA:
            case AZUL:
            case GRIS:
            case AMARILLO:
            case MARRON:
            case Y:
            case O:
            case BLANCO:
            case MAYORQUE:
            case error:
            case NEGRO:
            case ROJO:
            case IGUALES:
            case CIAN:
                return 947;
            case INTEGER:
                return 91;
            case IDENTIFIER:
                return 110;
            case '(':
                return 111;
            case '*':
                return 209;
            case '+':
                return 210;
            case '-':
                return 211;
            case '/':
                return 212;
        }
        return yyr164();
    }

    private int yys102() {
        switch (yytok) {
            case BOOLEAN:
            case '(':
            case INTEGER:
            case GRIS:
            case MENORQUE:
            case O:
            case Y:
            case '-':
            case ROJO:
            case CIAN:
            case '=':
            case '*':
            case '+':
            case ENDINPUT:
            case '/':
            case error:
            case VERDE:
            case MARRON:
            case PARA:
            case IGUALES:
            case AZUL:
            case FLOAT:
            case CUENTA:
            case AMARILLO:
            case BLANCO:
            case NEGRO:
            case MAYORQUE:
                return 947;
        }
        return yyr174();
    }

    private int yys103() {
        switch (yytok) {
            case BOOLEAN:
            case '(':
            case INTEGER:
            case GRIS:
            case MENORQUE:
            case O:
            case Y:
            case '-':
            case ROJO:
            case CIAN:
            case '=':
            case '*':
            case '+':
            case ENDINPUT:
            case '/':
            case error:
            case VERDE:
            case MARRON:
            case PARA:
            case IGUALES:
            case AZUL:
            case FLOAT:
            case CUENTA:
            case AMARILLO:
            case BLANCO:
            case NEGRO:
            case MAYORQUE:
                return 947;
        }
        return yyr171();
    }

    private int yys106() {
        switch (yytok) {
            case AZAR:
                return 34;
            case COS:
                return 39;
            case DIFERENCIA:
                return 40;
            case DIVISION:
                return 41;
            case ELEGIR:
                return 43;
            case ELEMENTO:
                return 44;
            case MENOS:
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
            case FLOAT:
                return 89;
            case IDENTIFIER:
                return 90;
            case INTEGER:
                return 91;
            case '(':
                return 104;
        }
        return 947;
    }

    private int yys107() {
        switch (yytok) {
            case APARECETORTUGA:
                return 30;
            case AT:
                return 31;
            case AV:
                return 32;
            case AVANZA:
                return 33;
            case AZAR:
                return 34;
            case BAJALAPIZ:
                return 35;
            case BL:
                return 36;
            case BORRAPANTALLA:
                return 37;
            case CENTRO:
                return 38;
            case COS:
                return 39;
            case DIFERENCIA:
                return 40;
            case DIVISION:
                return 41;
            case EJECUTA:
                return 42;
            case ELEGIR:
                return 43;
            case ELEMENTO:
                return 44;
            case ESPERA:
                return 45;
            case GD:
                return 46;
            case GI:
                return 47;
            case GIRADERECHA:
                return 48;
            case GIRAIZQUIERDA:
                return 49;
            case IDENTIFIER:
                return 50;
            case INC:
                return 51;
            case INIC:
                return 52;
            case MENOS:
                return 53;
            case OCULTATORTUGA:
                return 54;
            case OT:
                return 55;
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
        }
        return 947;
    }

    private int yys110() {
        switch (yytok) {
            case MENORQUE:
            case GRIS:
            case IGUALES:
            case '=':
            case BLANCO:
            case ROJO:
            case MARRON:
            case CUENTA:
            case CIAN:
            case PARA:
            case error:
            case ENDINPUT:
            case VERDE:
            case MAYORQUE:
            case O:
            case Y:
            case NEGRO:
            case AMARILLO:
            case AZUL:
            case BOOLEAN:
                return 947;
        }
        return yyr26();
    }

    private int yys112() {
        switch (yytok) {
            case FLOAT:
            case '>':
            case VERDE:
            case CIAN:
            case '/':
            case O:
            case '*':
            case Y:
            case PARA:
            case AZUL:
            case AMARILLO:
            case '<':
            case '(':
            case '-':
            case '=':
            case '+':
            case ')':
            case error:
            case MARRON:
            case '[':
            case CUENTA:
            case GRIS:
            case ROJO:
            case IGUALES:
            case BOOLEAN:
            case INTEGER:
            case BLANCO:
            case NEGRO:
            case MENORQUE:
            case MAYORQUE:
            case ENDINPUT:
                return 947;
        }
        return yyr104();
    }

    private int yys113() {
        switch (yytok) {
            case AZAR:
                return 34;
            case COS:
                return 39;
            case DIFERENCIA:
                return 40;
            case DIVISION:
                return 41;
            case ELEGIR:
                return 43;
            case ELEMENTO:
                return 44;
            case MENOS:
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
            case FLOAT:
                return 89;
            case IDENTIFIER:
                return 90;
            case INTEGER:
                return 91;
            case '(':
                return 104;
        }
        return 947;
    }

    private int yys114() {
        switch (yytok) {
            case FLOAT:
            case '>':
            case VERDE:
            case CIAN:
            case '/':
            case O:
            case '*':
            case Y:
            case PARA:
            case AZUL:
            case AMARILLO:
            case '<':
            case '(':
            case '-':
            case '=':
            case '+':
            case ')':
            case error:
            case MARRON:
            case '[':
            case CUENTA:
            case GRIS:
            case ROJO:
            case IGUALES:
            case BOOLEAN:
            case INTEGER:
            case BLANCO:
            case NEGRO:
            case MENORQUE:
            case MAYORQUE:
            case ENDINPUT:
                return 947;
        }
        return yyr96();
    }

    private int yys115() {
        switch (yytok) {
            case AZAR:
                return 34;
            case COS:
                return 39;
            case DIFERENCIA:
                return 40;
            case DIVISION:
                return 41;
            case ELEGIR:
                return 43;
            case ELEMENTO:
                return 44;
            case MENOS:
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
            case FLOAT:
                return 89;
            case IDENTIFIER:
                return 90;
            case INTEGER:
                return 91;
            case '(':
                return 104;
        }
        return 947;
    }

    private int yys116() {
        switch (yytok) {
            case FLOAT:
            case '>':
            case VERDE:
            case CIAN:
            case '/':
            case O:
            case '*':
            case Y:
            case PARA:
            case AZUL:
            case AMARILLO:
            case '<':
            case '(':
            case '-':
            case '=':
            case '+':
            case ')':
            case error:
            case MARRON:
            case '[':
            case CUENTA:
            case GRIS:
            case ROJO:
            case IGUALES:
            case BOOLEAN:
            case INTEGER:
            case BLANCO:
            case NEGRO:
            case MENORQUE:
            case MAYORQUE:
            case ENDINPUT:
                return 947;
        }
        return yyr98();
    }

    private int yys117() {
        switch (yytok) {
            case AZAR:
                return 34;
            case COS:
                return 39;
            case DIFERENCIA:
                return 40;
            case DIVISION:
                return 41;
            case ELEGIR:
                return 43;
            case ELEMENTO:
                return 44;
            case MENOS:
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
            case FLOAT:
                return 89;
            case IDENTIFIER:
                return 90;
            case INTEGER:
                return 91;
            case '(':
                return 104;
        }
        return 947;
    }

    private int yys118() {
        switch (yytok) {
            case FLOAT:
            case '>':
            case VERDE:
            case CIAN:
            case '/':
            case O:
            case '*':
            case Y:
            case PARA:
            case AZUL:
            case AMARILLO:
            case '<':
            case '(':
            case '-':
            case '=':
            case '+':
            case ')':
            case error:
            case MARRON:
            case '[':
            case CUENTA:
            case GRIS:
            case ROJO:
            case IGUALES:
            case BOOLEAN:
            case INTEGER:
            case BLANCO:
            case NEGRO:
            case MENORQUE:
            case MAYORQUE:
            case ENDINPUT:
                return 947;
        }
        return yyr95();
    }

    private int yys119() {
        switch (yytok) {
            case AZAR:
                return 34;
            case COS:
                return 39;
            case DIFERENCIA:
                return 40;
            case DIVISION:
                return 41;
            case ELEGIR:
                return 43;
            case ELEMENTO:
                return 44;
            case MENOS:
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
            case FLOAT:
                return 89;
            case IDENTIFIER:
                return 90;
            case INTEGER:
                return 91;
            case '(':
                return 104;
        }
        return 947;
    }

    private int yys120() {
        switch (yytok) {
            case FLOAT:
            case '>':
            case VERDE:
            case CIAN:
            case '/':
            case O:
            case '*':
            case Y:
            case PARA:
            case AZUL:
            case AMARILLO:
            case '<':
            case '(':
            case '-':
            case '=':
            case '+':
            case ')':
            case error:
            case MARRON:
            case '[':
            case CUENTA:
            case GRIS:
            case ROJO:
            case IGUALES:
            case BOOLEAN:
            case INTEGER:
            case BLANCO:
            case NEGRO:
            case MENORQUE:
            case MAYORQUE:
            case ENDINPUT:
                return 947;
        }
        return yyr97();
    }

    private int yys121() {
        switch (yytok) {
            case AZAR:
                return 34;
            case COS:
                return 39;
            case DIFERENCIA:
                return 40;
            case DIVISION:
                return 41;
            case ELEGIR:
                return 43;
            case ELEMENTO:
                return 44;
            case MENOS:
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
            case FLOAT:
                return 89;
            case IDENTIFIER:
                return 90;
            case INTEGER:
                return 91;
            case '(':
                return 104;
        }
        return 947;
    }

    private int yys122() {
        switch (yytok) {
            case BOOLEAN:
            case AMARILLO:
            case MENORQUE:
            case MARRON:
            case BLANCO:
            case NEGRO:
            case ENDINPUT:
            case ')':
            case AZUL:
            case CIAN:
            case '<':
            case O:
            case error:
            case MAYORQUE:
            case '=':
            case '>':
            case VERDE:
            case Y:
            case PARA:
            case '[':
            case CUENTA:
            case GRIS:
            case IGUALES:
            case ROJO:
                return 947;
            case FLOAT:
                return 89;
            case IDENTIFIER:
                return 90;
            case INTEGER:
                return 91;
            case '(':
                return 104;
            case '*':
                return 205;
            case '+':
                return 206;
            case '-':
                return 207;
            case '/':
                return 208;
        }
        return yyr207();
    }

    private int yys123() {
        switch (yytok) {
            case BOOLEAN:
            case AMARILLO:
            case MENORQUE:
            case MARRON:
            case BLANCO:
            case NEGRO:
            case ENDINPUT:
            case ')':
            case AZUL:
            case CIAN:
            case '<':
            case O:
            case error:
            case MAYORQUE:
            case '=':
            case '>':
            case VERDE:
            case Y:
            case PARA:
            case '[':
            case CUENTA:
            case GRIS:
            case IGUALES:
            case ROJO:
                return 947;
            case FLOAT:
                return 89;
            case IDENTIFIER:
                return 90;
            case INTEGER:
                return 91;
            case '(':
                return 104;
            case '*':
                return 209;
            case '+':
                return 210;
            case '-':
                return 211;
            case '/':
                return 212;
        }
        return yyr206();
    }

    private int yys124() {
        switch (yytok) {
            case FLOAT:
            case '>':
            case VERDE:
            case CIAN:
            case '/':
            case O:
            case '*':
            case Y:
            case PARA:
            case AZUL:
            case AMARILLO:
            case '<':
            case '(':
            case '-':
            case '=':
            case '+':
            case ')':
            case error:
            case MARRON:
            case '[':
            case CUENTA:
            case GRIS:
            case ROJO:
            case IGUALES:
            case BOOLEAN:
            case INTEGER:
            case BLANCO:
            case NEGRO:
            case MENORQUE:
            case MAYORQUE:
            case ENDINPUT:
                return 947;
        }
        return yyr208();
    }

    private int yys127() {
        switch (yytok) {
            case AMARILLO:
            case Y:
            case PARA:
            case BOOLEAN:
            case MENORQUE:
            case O:
            case MARRON:
            case INTEGER:
            case GRIS:
            case CIAN:
            case '=':
            case '(':
            case error:
            case ENDINPUT:
            case BLANCO:
            case MAYORQUE:
            case VERDE:
            case NEGRO:
            case ROJO:
            case IGUALES:
            case AZUL:
            case FLOAT:
            case CUENTA:
                return 947;
            case '*':
                return 205;
            case '+':
                return 206;
            case '-':
                return 207;
            case '/':
                return 208;
        }
        return yyr126();
    }

    private int yys128() {
        switch (yytok) {
            case AMARILLO:
            case Y:
            case PARA:
            case BOOLEAN:
            case MENORQUE:
            case O:
            case MARRON:
            case INTEGER:
            case GRIS:
            case CIAN:
            case '=':
            case '(':
            case error:
            case ENDINPUT:
            case BLANCO:
            case MAYORQUE:
            case VERDE:
            case NEGRO:
            case ROJO:
            case IGUALES:
            case AZUL:
            case FLOAT:
            case CUENTA:
                return 947;
            case '*':
                return 209;
            case '+':
                return 210;
            case '-':
                return 211;
            case '/':
                return 212;
        }
        return yyr121();
    }

    private int yys129() {
        switch (yytok) {
            case AZAR:
                return 34;
            case COS:
                return 39;
            case DIFERENCIA:
                return 40;
            case DIVISION:
                return 41;
            case ELEGIR:
                return 43;
            case ELEMENTO:
                return 44;
            case MENOS:
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
            case FLOAT:
                return 89;
            case IDENTIFIER:
                return 90;
            case INTEGER:
                return 91;
            case '(':
                return 104;
        }
        return 947;
    }

    private int yys130() {
        switch (yytok) {
            case APARECETORTUGA:
                return 30;
            case AT:
                return 31;
            case AV:
                return 32;
            case AVANZA:
                return 33;
            case AZAR:
                return 34;
            case BAJALAPIZ:
                return 35;
            case BL:
                return 36;
            case BORRAPANTALLA:
                return 37;
            case CENTRO:
                return 38;
            case COS:
                return 39;
            case DIFERENCIA:
                return 40;
            case DIVISION:
                return 41;
            case EJECUTA:
                return 42;
            case ELEGIR:
                return 43;
            case ELEMENTO:
                return 44;
            case ESPERA:
                return 45;
            case GD:
                return 46;
            case GI:
                return 47;
            case GIRADERECHA:
                return 48;
            case GIRAIZQUIERDA:
                return 49;
            case INC:
                return 51;
            case INIC:
                return 52;
            case MENOS:
                return 53;
            case OCULTATORTUGA:
                return 54;
            case OT:
                return 55;
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
            case IDENTIFIER:
                return 245;
        }
        return 947;
    }

    private int yys131() {
        switch (yytok) {
            case FLOAT:
            case '>':
            case VERDE:
            case CIAN:
            case '/':
            case O:
            case '*':
            case Y:
            case PARA:
            case AZUL:
            case AMARILLO:
            case '<':
            case '(':
            case '-':
            case '=':
            case '+':
            case ')':
            case error:
            case MARRON:
            case '[':
            case CUENTA:
            case GRIS:
            case ROJO:
            case IGUALES:
            case BOOLEAN:
            case INTEGER:
            case BLANCO:
            case NEGRO:
            case MENORQUE:
            case MAYORQUE:
            case ENDINPUT:
                return 947;
        }
        return yyr103();
    }

    private int yys132() {
        switch (yytok) {
            case FLOAT:
            case '>':
            case VERDE:
            case CIAN:
            case '/':
            case O:
            case '*':
            case Y:
            case PARA:
            case AZUL:
            case AMARILLO:
            case '<':
            case '(':
            case '-':
            case '=':
            case '+':
            case ')':
            case error:
            case MARRON:
            case '[':
            case CUENTA:
            case GRIS:
            case ROJO:
            case IGUALES:
            case BOOLEAN:
            case INTEGER:
            case BLANCO:
            case NEGRO:
            case MENORQUE:
            case MAYORQUE:
            case ENDINPUT:
                return 947;
        }
        return yyr76();
    }

    private int yys133() {
        switch (yytok) {
            case FLOAT:
            case '>':
            case VERDE:
            case CIAN:
            case '/':
            case O:
            case '*':
            case Y:
            case PARA:
            case AZUL:
            case AMARILLO:
            case '<':
            case '(':
            case '-':
            case '=':
            case '+':
            case ')':
            case error:
            case MARRON:
            case '[':
            case CUENTA:
            case GRIS:
            case ROJO:
            case IGUALES:
            case BOOLEAN:
            case INTEGER:
            case BLANCO:
            case NEGRO:
            case MENORQUE:
            case MAYORQUE:
            case ENDINPUT:
                return 947;
        }
        return yyr72();
    }

    private int yys134() {
        switch (yytok) {
            case FLOAT:
            case '>':
            case VERDE:
            case CIAN:
            case '/':
            case O:
            case '*':
            case Y:
            case PARA:
            case AZUL:
            case AMARILLO:
            case '<':
            case '(':
            case '-':
            case '=':
            case '+':
            case ')':
            case error:
            case MARRON:
            case '[':
            case CUENTA:
            case GRIS:
            case ROJO:
            case IGUALES:
            case BOOLEAN:
            case INTEGER:
            case BLANCO:
            case NEGRO:
            case MENORQUE:
            case MAYORQUE:
            case ENDINPUT:
                return 947;
        }
        return yyr71();
    }

    private int yys135() {
        switch (yytok) {
            case FLOAT:
            case '>':
            case VERDE:
            case CIAN:
            case '/':
            case O:
            case '*':
            case Y:
            case PARA:
            case AZUL:
            case AMARILLO:
            case '<':
            case '(':
            case '-':
            case '=':
            case '+':
            case ')':
            case error:
            case MARRON:
            case '[':
            case CUENTA:
            case GRIS:
            case ROJO:
            case IGUALES:
            case BOOLEAN:
            case INTEGER:
            case BLANCO:
            case NEGRO:
            case MENORQUE:
            case MAYORQUE:
            case ENDINPUT:
                return 947;
        }
        return yyr74();
    }

    private int yys136() {
        switch (yytok) {
            case FLOAT:
            case '>':
            case VERDE:
            case CIAN:
            case '/':
            case O:
            case '*':
            case Y:
            case PARA:
            case AZUL:
            case AMARILLO:
            case '<':
            case '(':
            case '-':
            case '=':
            case '+':
            case ')':
            case error:
            case MARRON:
            case '[':
            case CUENTA:
            case GRIS:
            case ROJO:
            case IGUALES:
            case BOOLEAN:
            case INTEGER:
            case BLANCO:
            case NEGRO:
            case MENORQUE:
            case MAYORQUE:
            case ENDINPUT:
                return 947;
        }
        return yyr75();
    }

    private int yys137() {
        switch (yytok) {
            case FLOAT:
            case '>':
            case VERDE:
            case CIAN:
            case '/':
            case O:
            case '*':
            case Y:
            case PARA:
            case AZUL:
            case AMARILLO:
            case '<':
            case '(':
            case '-':
            case '=':
            case '+':
            case ')':
            case error:
            case MARRON:
            case '[':
            case CUENTA:
            case GRIS:
            case ROJO:
            case IGUALES:
            case BOOLEAN:
            case INTEGER:
            case BLANCO:
            case NEGRO:
            case MENORQUE:
            case MAYORQUE:
            case ENDINPUT:
                return 947;
        }
        return yyr73();
    }

    private int yys138() {
        switch (yytok) {
            case FLOAT:
            case '>':
            case VERDE:
            case CIAN:
            case '/':
            case O:
            case '*':
            case Y:
            case PARA:
            case AZUL:
            case AMARILLO:
            case '<':
            case '(':
            case '-':
            case '=':
            case '+':
            case ')':
            case error:
            case MARRON:
            case '[':
            case CUENTA:
            case GRIS:
            case ROJO:
            case IGUALES:
            case BOOLEAN:
            case INTEGER:
            case BLANCO:
            case NEGRO:
            case MENORQUE:
            case MAYORQUE:
            case ENDINPUT:
                return 947;
        }
        return yyr77();
    }

    private int yys139() {
        switch (yytok) {
            case FLOAT:
            case '>':
            case VERDE:
            case CIAN:
            case '/':
            case O:
            case '*':
            case Y:
            case PARA:
            case AZUL:
            case AMARILLO:
            case '<':
            case '(':
            case '-':
            case '=':
            case '+':
            case ')':
            case error:
            case MARRON:
            case '[':
            case CUENTA:
            case GRIS:
            case ROJO:
            case IGUALES:
            case BOOLEAN:
            case INTEGER:
            case BLANCO:
            case NEGRO:
            case MENORQUE:
            case MAYORQUE:
            case ENDINPUT:
                return 947;
        }
        return yyr78();
    }

    private int yys140() {
        switch (yytok) {
            case FLOAT:
            case '>':
            case VERDE:
            case CIAN:
            case '/':
            case O:
            case '*':
            case Y:
            case PARA:
            case AZUL:
            case AMARILLO:
            case '<':
            case '(':
            case '-':
            case '=':
            case '+':
            case ')':
            case error:
            case MARRON:
            case '[':
            case CUENTA:
            case GRIS:
            case ROJO:
            case IGUALES:
            case BOOLEAN:
            case INTEGER:
            case BLANCO:
            case NEGRO:
            case MENORQUE:
            case MAYORQUE:
            case ENDINPUT:
                return 947;
        }
        return yyr79();
    }

    private int yys141() {
        switch (yytok) {
            case FLOAT:
            case '>':
            case VERDE:
            case CIAN:
            case '/':
            case O:
            case '*':
            case Y:
            case PARA:
            case AZUL:
            case AMARILLO:
            case '<':
            case '(':
            case '-':
            case '=':
            case '+':
            case ')':
            case error:
            case MARRON:
            case '[':
            case CUENTA:
            case GRIS:
            case ROJO:
            case IGUALES:
            case BOOLEAN:
            case INTEGER:
            case BLANCO:
            case NEGRO:
            case MENORQUE:
            case MAYORQUE:
            case ENDINPUT:
                return 947;
        }
        return yyr102();
    }

    private int yys143() {
        switch (yytok) {
            case FLOAT:
            case '>':
            case VERDE:
            case CIAN:
            case '/':
            case O:
            case '*':
            case Y:
            case PARA:
            case AZUL:
            case AMARILLO:
            case '<':
            case '(':
            case '-':
            case '=':
            case '+':
            case ')':
            case error:
            case MARRON:
            case '[':
            case CUENTA:
            case GRIS:
            case ROJO:
            case IGUALES:
            case BOOLEAN:
            case INTEGER:
            case BLANCO:
            case NEGRO:
            case MENORQUE:
            case MAYORQUE:
            case ENDINPUT:
                return 947;
        }
        return yyr99();
    }

    private int yys144() {
        switch (yytok) {
            case AZAR:
                return 34;
            case COS:
                return 39;
            case DIFERENCIA:
                return 40;
            case DIVISION:
                return 41;
            case ELEGIR:
                return 43;
            case ELEMENTO:
                return 44;
            case MENOS:
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
            case FLOAT:
                return 89;
            case IDENTIFIER:
                return 90;
            case INTEGER:
                return 91;
            case '(':
                return 104;
        }
        return 947;
    }

    private int yys145() {
        switch (yytok) {
            case FLOAT:
            case '>':
            case VERDE:
            case CIAN:
            case '/':
            case O:
            case '*':
            case Y:
            case PARA:
            case AZUL:
            case AMARILLO:
            case '<':
            case '(':
            case '-':
            case '=':
            case '+':
            case ')':
            case error:
            case MARRON:
            case '[':
            case CUENTA:
            case GRIS:
            case ROJO:
            case IGUALES:
            case BOOLEAN:
            case INTEGER:
            case BLANCO:
            case NEGRO:
            case MENORQUE:
            case MAYORQUE:
            case ENDINPUT:
                return 947;
        }
        return yyr100();
    }

    private int yys146() {
        switch (yytok) {
            case AZAR:
                return 34;
            case COS:
                return 39;
            case DIFERENCIA:
                return 40;
            case DIVISION:
                return 41;
            case ELEGIR:
                return 43;
            case ELEMENTO:
                return 44;
            case MENOS:
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
            case FLOAT:
                return 89;
            case IDENTIFIER:
                return 90;
            case INTEGER:
                return 91;
            case '(':
                return 104;
        }
        return 947;
    }

    private int yys147() {
        switch (yytok) {
            case INTEGER:
                return 91;
            case IDENTIFIER:
                return 110;
            case '*':
                return 209;
            case '+':
                return 210;
            case '-':
                return 211;
            case '/':
                return 212;
            case '(':
                return 250;
        }
        return 947;
    }

    private int yys148() {
        switch (yytok) {
            case REDONDEA:
                return 70;
            case RESTO:
                return 72;
            case INTEGER:
                return 91;
            case IDENTIFIER:
                return 110;
            case '(':
                return 111;
            case AZAR:
                return 252;
            case DIFERENCIA:
                return 253;
            case ELEGIR:
                return 254;
            case ELEMENTO:
                return 255;
            case MENOS:
                return 256;
            case POTENCIA:
                return 257;
            case PRIMERO:
                return 258;
            case PRODUCTO:
                return 259;
            case SUMA:
                return 260;
            case UL:
                return 261;
            case ULTIMO:
                return 262;
        }
        return 947;
    }

    private int yys149() {
        switch (yytok) {
            case FLOAT:
            case '>':
            case VERDE:
            case CIAN:
            case '/':
            case O:
            case '*':
            case Y:
            case PARA:
            case AZUL:
            case AMARILLO:
            case '<':
            case '(':
            case '-':
            case '=':
            case '+':
            case ')':
            case error:
            case MARRON:
            case '[':
            case CUENTA:
            case GRIS:
            case ROJO:
            case IGUALES:
            case BOOLEAN:
            case INTEGER:
            case BLANCO:
            case NEGRO:
            case MENORQUE:
            case MAYORQUE:
            case ENDINPUT:
                return 947;
        }
        return yyr101();
    }

    private int yys150() {
        switch (yytok) {
            case AZAR:
                return 34;
            case COS:
                return 39;
            case DIFERENCIA:
                return 40;
            case DIVISION:
                return 41;
            case ELEGIR:
                return 43;
            case ELEMENTO:
                return 44;
            case MENOS:
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
            case FLOAT:
                return 89;
            case IDENTIFIER:
                return 90;
            case INTEGER:
                return 91;
            case '(':
                return 104;
        }
        return 947;
    }

    private int yys151() {
        switch (yytok) {
            case FLOAT:
                return 89;
            case IDENTIFIER:
                return 90;
            case INTEGER:
                return 91;
            case '*':
                return 205;
            case '+':
                return 206;
            case '-':
                return 207;
            case '/':
                return 208;
            case '(':
                return 266;
        }
        return 947;
    }

    private int yys152() {
        switch (yytok) {
            case FLOAT:
                return 89;
            case IDENTIFIER:
                return 90;
            case INTEGER:
                return 91;
            case '*':
                return 209;
            case '+':
                return 210;
            case '-':
                return 211;
            case '/':
                return 212;
            case '(':
                return 269;
        }
        return 947;
    }

    private int yys153() {
        switch (yytok) {
            case AZAR:
                return 34;
            case COS:
                return 39;
            case DIFERENCIA:
                return 40;
            case DIVISION:
                return 41;
            case ELEGIR:
                return 43;
            case ELEMENTO:
                return 44;
            case MENOS:
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
            case FLOAT:
                return 89;
            case IDENTIFIER:
                return 90;
            case INTEGER:
                return 91;
            case '(':
                return 104;
        }
        return 947;
    }

    private int yys155() {
        switch (yytok) {
            case BOOLEAN:
            case '(':
            case INTEGER:
            case GRIS:
            case MENORQUE:
            case O:
            case Y:
            case '-':
            case ROJO:
            case CIAN:
            case '=':
            case '*':
            case '+':
            case ENDINPUT:
            case '/':
            case error:
            case VERDE:
            case MARRON:
            case PARA:
            case IGUALES:
            case AZUL:
            case FLOAT:
            case CUENTA:
            case AMARILLO:
            case BLANCO:
            case NEGRO:
            case MAYORQUE:
                return 947;
        }
        return yyr175();
    }

    private int yys156() {
        switch (yytok) {
            case BOOLEAN:
            case '(':
            case INTEGER:
            case GRIS:
            case MENORQUE:
            case O:
            case Y:
            case '-':
            case ROJO:
            case CIAN:
            case '=':
            case '*':
            case '+':
            case ENDINPUT:
            case '/':
            case error:
            case VERDE:
            case MARRON:
            case PARA:
            case IGUALES:
            case AZUL:
            case FLOAT:
            case CUENTA:
            case AMARILLO:
            case BLANCO:
            case NEGRO:
            case MAYORQUE:
                return 947;
        }
        return yyr172();
    }

    private int yys157() {
        switch (yytok) {
            case BOOLEAN:
            case '(':
            case INTEGER:
            case GRIS:
            case MENORQUE:
            case O:
            case Y:
            case '-':
            case ROJO:
            case CIAN:
            case '=':
            case '*':
            case '+':
            case ENDINPUT:
            case '/':
            case error:
            case VERDE:
            case MARRON:
            case PARA:
            case IGUALES:
            case AZUL:
            case FLOAT:
            case CUENTA:
            case AMARILLO:
            case BLANCO:
            case NEGRO:
            case MAYORQUE:
                return 947;
        }
        return yyr128();
    }

    private int yys158() {
        switch (yytok) {
            case AZAR:
                return 34;
            case COS:
                return 39;
            case DIFERENCIA:
                return 40;
            case DIVISION:
                return 41;
            case ELEGIR:
                return 43;
            case ELEMENTO:
                return 44;
            case MENOS:
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
            case FLOAT:
                return 89;
            case IDENTIFIER:
                return 90;
            case INTEGER:
                return 91;
            case '(':
                return 104;
        }
        return 947;
    }

    private int yys159() {
        switch (yytok) {
            case BOOLEAN:
            case '(':
            case INTEGER:
            case GRIS:
            case MENORQUE:
            case O:
            case Y:
            case '-':
            case ROJO:
            case CIAN:
            case '=':
            case '*':
            case '+':
            case ENDINPUT:
            case '/':
            case error:
            case VERDE:
            case MARRON:
            case PARA:
            case IGUALES:
            case AZUL:
            case FLOAT:
            case CUENTA:
            case AMARILLO:
            case BLANCO:
            case NEGRO:
            case MAYORQUE:
                return 947;
        }
        return yyr129();
    }

    private int yys160() {
        switch (yytok) {
            case AZAR:
                return 34;
            case COS:
                return 39;
            case DIFERENCIA:
                return 40;
            case DIVISION:
                return 41;
            case ELEGIR:
                return 43;
            case ELEMENTO:
                return 44;
            case MENOS:
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
            case FLOAT:
                return 89;
            case IDENTIFIER:
                return 90;
            case INTEGER:
                return 91;
            case '(':
                return 104;
        }
        return 947;
    }

    private int yys161() {
        switch (yytok) {
            case FLOAT:
            case '>':
            case VERDE:
            case CIAN:
            case '/':
            case O:
            case '*':
            case Y:
            case PARA:
            case AZUL:
            case AMARILLO:
            case '<':
            case '(':
            case '-':
            case '=':
            case '+':
            case ')':
            case error:
            case MARRON:
            case '[':
            case CUENTA:
            case GRIS:
            case ROJO:
            case IGUALES:
            case BOOLEAN:
            case INTEGER:
            case BLANCO:
            case NEGRO:
            case MENORQUE:
            case MAYORQUE:
            case ENDINPUT:
                return 947;
        }
        return yyr94();
    }

    private int yys162() {
        switch (yytok) {
            case AZAR:
                return 34;
            case COS:
                return 39;
            case DIFERENCIA:
                return 40;
            case DIVISION:
                return 41;
            case ELEGIR:
                return 43;
            case ELEMENTO:
                return 44;
            case MENOS:
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
            case FLOAT:
                return 89;
            case IDENTIFIER:
                return 90;
            case INTEGER:
                return 91;
            case '(':
                return 104;
        }
        return 947;
    }

    private int yys163() {
        switch (yytok) {
            case AMARILLO:
            case Y:
            case PARA:
            case BOOLEAN:
            case MENORQUE:
            case O:
            case MARRON:
            case INTEGER:
            case GRIS:
            case CIAN:
            case '=':
            case '(':
            case error:
            case ENDINPUT:
            case BLANCO:
            case MAYORQUE:
            case VERDE:
            case NEGRO:
            case ROJO:
            case IGUALES:
            case AZUL:
            case FLOAT:
            case CUENTA:
                return 947;
            case '*':
                return 205;
            case '+':
                return 206;
            case '-':
                return 207;
            case '/':
                return 208;
        }
        return yyr119();
    }

    private int yys164() {
        switch (yytok) {
            case MENORQUE:
            case GRIS:
            case IGUALES:
            case '=':
            case BLANCO:
            case ROJO:
            case MARRON:
            case CUENTA:
            case CIAN:
            case PARA:
            case error:
            case ENDINPUT:
            case VERDE:
            case MAYORQUE:
            case O:
            case Y:
            case NEGRO:
            case AMARILLO:
            case AZUL:
            case BOOLEAN:
                return 947;
        }
        return yyr33();
    }

    private int yys165() {
        switch (yytok) {
            case AZAR:
                return 34;
            case COS:
                return 39;
            case DIFERENCIA:
                return 40;
            case DIVISION:
                return 41;
            case ELEGIR:
                return 43;
            case ELEMENTO:
                return 44;
            case MENOS:
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
            case FLOAT:
                return 89;
            case IDENTIFIER:
                return 164;
            case '(':
                return 221;
        }
        return 947;
    }

    private int yys168() {
        switch (yytok) {
            case AZAR:
                return 34;
            case COS:
                return 39;
            case DIFERENCIA:
                return 40;
            case DIVISION:
                return 41;
            case ELEGIR:
                return 43;
            case ELEMENTO:
                return 44;
            case MENOS:
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
            case FLOAT:
                return 89;
            case IDENTIFIER:
                return 90;
            case INTEGER:
                return 91;
            case '(':
                return 104;
        }
        return 947;
    }

    private int yys169() {
        switch (yytok) {
            case FLOAT:
            case '>':
            case VERDE:
            case CIAN:
            case '/':
            case O:
            case '*':
            case Y:
            case PARA:
            case AZUL:
            case AMARILLO:
            case '<':
            case '(':
            case '-':
            case '=':
            case '+':
            case ')':
            case error:
            case MARRON:
            case '[':
            case CUENTA:
            case GRIS:
            case ROJO:
            case IGUALES:
            case BOOLEAN:
            case INTEGER:
            case BLANCO:
            case NEGRO:
            case MENORQUE:
            case MAYORQUE:
            case ENDINPUT:
                return 947;
        }
        return yyr93();
    }

    private int yys170() {
        switch (yytok) {
            case AZAR:
                return 34;
            case COS:
                return 39;
            case DIFERENCIA:
                return 40;
            case DIVISION:
                return 41;
            case ELEGIR:
                return 43;
            case ELEMENTO:
                return 44;
            case MENOS:
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
            case FLOAT:
                return 89;
            case IDENTIFIER:
                return 90;
            case INTEGER:
                return 91;
            case '(':
                return 104;
        }
        return 947;
    }

    private int yys171() {
        switch (yytok) {
            case BOOLEAN:
            case '(':
            case INTEGER:
            case GRIS:
            case MENORQUE:
            case O:
            case Y:
            case '-':
            case ROJO:
            case CIAN:
            case '=':
            case '*':
            case '+':
            case ENDINPUT:
            case '/':
            case error:
            case VERDE:
            case MARRON:
            case PARA:
            case IGUALES:
            case AZUL:
            case FLOAT:
            case CUENTA:
            case AMARILLO:
            case BLANCO:
            case NEGRO:
            case MAYORQUE:
                return 947;
        }
        return yyr131();
    }

    private int yys172() {
        switch (yytok) {
            case AZAR:
                return 34;
            case COS:
                return 39;
            case DIFERENCIA:
                return 40;
            case DIVISION:
                return 41;
            case ELEGIR:
                return 43;
            case ELEMENTO:
                return 44;
            case MENOS:
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
            case FLOAT:
                return 89;
            case IDENTIFIER:
                return 90;
            case INTEGER:
                return 91;
            case '(':
                return 104;
        }
        return 947;
    }

    private int yys173() {
        switch (yytok) {
            case BOOLEAN:
            case '(':
            case INTEGER:
            case GRIS:
            case MENORQUE:
            case O:
            case Y:
            case '-':
            case ROJO:
            case CIAN:
            case '=':
            case '*':
            case '+':
            case ENDINPUT:
            case '/':
            case error:
            case VERDE:
            case MARRON:
            case PARA:
            case IGUALES:
            case AZUL:
            case FLOAT:
            case CUENTA:
            case AMARILLO:
            case BLANCO:
            case NEGRO:
            case MAYORQUE:
                return 947;
        }
        return yyr130();
    }

    private int yys174() {
        switch (yytok) {
            case AZAR:
                return 34;
            case COS:
                return 39;
            case DIFERENCIA:
                return 40;
            case DIVISION:
                return 41;
            case ELEGIR:
                return 43;
            case ELEMENTO:
                return 44;
            case MENOS:
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
            case FLOAT:
                return 89;
            case IDENTIFIER:
                return 90;
            case INTEGER:
                return 91;
            case '(':
                return 104;
        }
        return 947;
    }

    private int yys175() {
        switch (yytok) {
            case BOOLEAN:
            case '(':
            case INTEGER:
            case GRIS:
            case MENORQUE:
            case O:
            case Y:
            case '-':
            case ROJO:
            case CIAN:
            case '=':
            case '*':
            case '+':
            case ENDINPUT:
            case '/':
            case error:
            case VERDE:
            case MARRON:
            case PARA:
            case IGUALES:
            case AZUL:
            case FLOAT:
            case CUENTA:
            case AMARILLO:
            case BLANCO:
            case NEGRO:
            case MAYORQUE:
                return 947;
        }
        return yyr53();
    }

    private int yys176() {
        switch (yytok) {
            case BOOLEAN:
            case '(':
            case INTEGER:
            case GRIS:
            case MENORQUE:
            case O:
            case Y:
            case '-':
            case ROJO:
            case CIAN:
            case '=':
            case '*':
            case '+':
            case ENDINPUT:
            case '/':
            case error:
            case VERDE:
            case MARRON:
            case PARA:
            case IGUALES:
            case AZUL:
            case FLOAT:
            case CUENTA:
            case AMARILLO:
            case BLANCO:
            case NEGRO:
            case MAYORQUE:
                return 947;
        }
        return yyr59();
    }

    private int yys177() {
        switch (yytok) {
            case BOOLEAN:
            case '(':
            case INTEGER:
            case GRIS:
            case MENORQUE:
            case O:
            case Y:
            case '-':
            case ROJO:
            case CIAN:
            case '=':
            case '*':
            case '+':
            case ENDINPUT:
            case '/':
            case error:
            case VERDE:
            case MARRON:
            case PARA:
            case IGUALES:
            case AZUL:
            case FLOAT:
            case CUENTA:
            case AMARILLO:
            case BLANCO:
            case NEGRO:
            case MAYORQUE:
                return 947;
        }
        return yyr60();
    }

    private int yys178() {
        switch (yytok) {
            case BOOLEAN:
            case '(':
            case INTEGER:
            case GRIS:
            case MENORQUE:
            case O:
            case Y:
            case '-':
            case ROJO:
            case CIAN:
            case '=':
            case '*':
            case '+':
            case ENDINPUT:
            case '/':
            case error:
            case VERDE:
            case MARRON:
            case PARA:
            case IGUALES:
            case AZUL:
            case FLOAT:
            case CUENTA:
            case AMARILLO:
            case BLANCO:
            case NEGRO:
            case MAYORQUE:
                return 947;
        }
        return yyr63();
    }

    private int yys179() {
        switch (yytok) {
            case BOOLEAN:
            case '(':
            case INTEGER:
            case GRIS:
            case MENORQUE:
            case O:
            case Y:
            case '-':
            case ROJO:
            case CIAN:
            case '=':
            case '*':
            case '+':
            case ENDINPUT:
            case '/':
            case error:
            case VERDE:
            case MARRON:
            case PARA:
            case IGUALES:
            case AZUL:
            case FLOAT:
            case CUENTA:
            case AMARILLO:
            case BLANCO:
            case NEGRO:
            case MAYORQUE:
                return 947;
        }
        return yyr61();
    }

    private int yys180() {
        switch (yytok) {
            case BOOLEAN:
            case '(':
            case INTEGER:
            case GRIS:
            case MENORQUE:
            case O:
            case Y:
            case '-':
            case ROJO:
            case CIAN:
            case '=':
            case '*':
            case '+':
            case ENDINPUT:
            case '/':
            case error:
            case VERDE:
            case MARRON:
            case PARA:
            case IGUALES:
            case AZUL:
            case FLOAT:
            case CUENTA:
            case AMARILLO:
            case BLANCO:
            case NEGRO:
            case MAYORQUE:
                return 947;
        }
        return yyr62();
    }

    private int yys182() {
        switch (yytok) {
            case BOOLEAN:
            case '(':
            case INTEGER:
            case GRIS:
            case MENORQUE:
            case O:
            case Y:
            case '-':
            case ROJO:
            case CIAN:
            case '=':
            case '*':
            case '+':
            case ENDINPUT:
            case '/':
            case error:
            case VERDE:
            case MARRON:
            case PARA:
            case IGUALES:
            case AZUL:
            case FLOAT:
            case CUENTA:
            case AMARILLO:
            case BLANCO:
            case NEGRO:
            case MAYORQUE:
                return 947;
        }
        return yyr52();
    }

    private int yys183() {
        switch (yytok) {
            case BOOLEAN:
            case '(':
            case INTEGER:
            case GRIS:
            case MENORQUE:
            case O:
            case Y:
            case '-':
            case ROJO:
            case CIAN:
            case '=':
            case '*':
            case '+':
            case ENDINPUT:
            case '/':
            case error:
            case VERDE:
            case MARRON:
            case PARA:
            case IGUALES:
            case AZUL:
            case FLOAT:
            case CUENTA:
            case AMARILLO:
            case BLANCO:
            case NEGRO:
            case MAYORQUE:
                return 947;
        }
        return yyr54();
    }

    private int yys184() {
        switch (yytok) {
            case BOOLEAN:
            case '(':
            case INTEGER:
            case GRIS:
            case MENORQUE:
            case O:
            case Y:
            case '-':
            case ROJO:
            case CIAN:
            case '=':
            case '*':
            case '+':
            case ENDINPUT:
            case '/':
            case error:
            case VERDE:
            case MARRON:
            case PARA:
            case IGUALES:
            case AZUL:
            case FLOAT:
            case CUENTA:
            case AMARILLO:
            case BLANCO:
            case NEGRO:
            case MAYORQUE:
                return 947;
        }
        return yyr55();
    }

    private int yys185() {
        switch (yytok) {
            case BOOLEAN:
            case '(':
            case INTEGER:
            case GRIS:
            case MENORQUE:
            case O:
            case Y:
            case '-':
            case ROJO:
            case CIAN:
            case '=':
            case '*':
            case '+':
            case ENDINPUT:
            case '/':
            case error:
            case VERDE:
            case MARRON:
            case PARA:
            case IGUALES:
            case AZUL:
            case FLOAT:
            case CUENTA:
            case AMARILLO:
            case BLANCO:
            case NEGRO:
            case MAYORQUE:
                return 947;
        }
        return yyr58();
    }

    private int yys186() {
        switch (yytok) {
            case BOOLEAN:
            case '(':
            case INTEGER:
            case GRIS:
            case MENORQUE:
            case O:
            case Y:
            case '-':
            case ROJO:
            case CIAN:
            case '=':
            case '*':
            case '+':
            case ENDINPUT:
            case '/':
            case error:
            case VERDE:
            case MARRON:
            case PARA:
            case IGUALES:
            case AZUL:
            case FLOAT:
            case CUENTA:
            case AMARILLO:
            case BLANCO:
            case NEGRO:
            case MAYORQUE:
                return 947;
        }
        return yyr56();
    }

    private int yys187() {
        switch (yytok) {
            case BOOLEAN:
            case '(':
            case INTEGER:
            case GRIS:
            case MENORQUE:
            case O:
            case Y:
            case '-':
            case ROJO:
            case CIAN:
            case '=':
            case '*':
            case '+':
            case ENDINPUT:
            case '/':
            case error:
            case VERDE:
            case MARRON:
            case PARA:
            case IGUALES:
            case AZUL:
            case FLOAT:
            case CUENTA:
            case AMARILLO:
            case BLANCO:
            case NEGRO:
            case MAYORQUE:
                return 947;
        }
        return yyr57();
    }

    private int yys191() {
        switch (yytok) {
            case '>':
            case '<':
            case '/':
            case '-':
            case '+':
            case '*':
            case ')':
                return yyr26();
            case '[':
                return yyr50();
        }
        return 947;
    }

    private int yys197() {
        switch (yytok) {
            case AZAR:
                return 34;
            case COS:
                return 39;
            case DIFERENCIA:
                return 40;
            case DIVISION:
                return 41;
            case ELEGIR:
                return 43;
            case ELEMENTO:
                return 44;
            case MENOS:
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
            case FLOAT:
                return 89;
            case INTEGER:
                return 91;
            case BOOLEAN:
                return 190;
            case IDENTIFIER:
                return 191;
            case IGUALES:
                return 192;
            case MAYORQUE:
                return 193;
            case MENORQUE:
                return 194;
            case O:
                return 195;
            case Y:
                return 196;
            case '(':
                return 197;
        }
        return 947;
    }

    private int yys198() {
        switch (yytok) {
            case BOOLEAN:
            case '(':
            case INTEGER:
            case GRIS:
            case MENORQUE:
            case O:
            case Y:
            case '-':
            case ROJO:
            case CIAN:
            case '=':
            case '*':
            case '+':
            case ENDINPUT:
            case '/':
            case error:
            case VERDE:
            case MARRON:
            case PARA:
            case IGUALES:
            case AZUL:
            case FLOAT:
            case CUENTA:
            case AMARILLO:
            case BLANCO:
            case NEGRO:
            case MAYORQUE:
                return 947;
        }
        return yyr176();
    }

    private int yys199() {
        switch (yytok) {
            case BOOLEAN:
            case '(':
            case INTEGER:
            case GRIS:
            case MENORQUE:
            case O:
            case Y:
            case '-':
            case ROJO:
            case CIAN:
            case '=':
            case '*':
            case '+':
            case ENDINPUT:
            case '/':
            case error:
            case VERDE:
            case MARRON:
            case PARA:
            case IGUALES:
            case AZUL:
            case FLOAT:
            case CUENTA:
            case AMARILLO:
            case BLANCO:
            case NEGRO:
            case MAYORQUE:
                return 947;
        }
        return yyr173();
    }

    private int yys202() {
        switch (yytok) {
            case ENDINPUT:
            case '>':
            case FLOAT:
            case CIAN:
            case '/':
            case O:
            case VERDE:
            case Y:
            case PARA:
            case AZUL:
            case AMARILLO:
            case '<':
            case '(':
            case '-':
            case '*':
            case '+':
            case ')':
            case error:
            case MARRON:
            case '[':
            case CUENTA:
            case GRIS:
            case ROJO:
            case IGUALES:
            case BOOLEAN:
            case INTEGER:
            case BLANCO:
            case NEGRO:
            case MENORQUE:
            case MAYORQUE:
                return 947;
            case '=':
                return 303;
        }
        return yyr64();
    }

    private int yys220() {
        switch (yytok) {
            case BOOLEAN:
            case '(':
            case INTEGER:
            case GRIS:
            case MENORQUE:
            case O:
            case Y:
            case '-':
            case ROJO:
            case CIAN:
            case '=':
            case '*':
            case '+':
            case ENDINPUT:
            case '/':
            case error:
            case VERDE:
            case MARRON:
            case PARA:
            case IGUALES:
            case AZUL:
            case FLOAT:
            case CUENTA:
            case AMARILLO:
            case BLANCO:
            case NEGRO:
            case MAYORQUE:
                return 947;
        }
        return yyr165();
    }

    private int yys222() {
        switch (yytok) {
            case BOOLEAN:
            case '(':
            case INTEGER:
            case GRIS:
            case MENORQUE:
            case O:
            case Y:
            case '-':
            case ROJO:
            case CIAN:
            case '=':
            case '*':
            case '+':
            case ENDINPUT:
            case '/':
            case error:
            case VERDE:
            case MARRON:
            case PARA:
            case IGUALES:
            case AZUL:
            case FLOAT:
            case CUENTA:
            case AMARILLO:
            case BLANCO:
            case NEGRO:
            case MAYORQUE:
                return 947;
        }
        return yyr163();
    }

    private int yys223() {
        switch (yytok) {
            case BOOLEAN:
            case '(':
            case INTEGER:
            case GRIS:
            case MENORQUE:
            case O:
            case Y:
            case '-':
            case ROJO:
            case CIAN:
            case '=':
            case '*':
            case '+':
            case ENDINPUT:
            case '/':
            case error:
            case VERDE:
            case MARRON:
            case PARA:
            case IGUALES:
            case AZUL:
            case FLOAT:
            case CUENTA:
            case AMARILLO:
            case BLANCO:
            case NEGRO:
            case MAYORQUE:
                return 947;
        }
        return yyr159();
    }

    private int yys224() {
        switch (yytok) {
            case AZAR:
                return 34;
            case COS:
                return 39;
            case DIFERENCIA:
                return 40;
            case DIVISION:
                return 41;
            case ELEGIR:
                return 43;
            case ELEMENTO:
                return 44;
            case MENOS:
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
            case FLOAT:
                return 89;
            case IDENTIFIER:
                return 90;
            case INTEGER:
                return 91;
            case '(':
                return 104;
        }
        return 947;
    }

    private int yys227() {
        switch (yytok) {
            case APARECETORTUGA:
                return 30;
            case AT:
                return 31;
            case AV:
                return 32;
            case AVANZA:
                return 33;
            case AZAR:
                return 34;
            case BAJALAPIZ:
                return 35;
            case BL:
                return 36;
            case BORRAPANTALLA:
                return 37;
            case CENTRO:
                return 38;
            case COS:
                return 39;
            case DIFERENCIA:
                return 40;
            case DIVISION:
                return 41;
            case EJECUTA:
                return 42;
            case ELEGIR:
                return 43;
            case ELEMENTO:
                return 44;
            case ESPERA:
                return 45;
            case GD:
                return 46;
            case GI:
                return 47;
            case GIRADERECHA:
                return 48;
            case GIRAIZQUIERDA:
                return 49;
            case IDENTIFIER:
                return 50;
            case INC:
                return 51;
            case INIC:
                return 52;
            case MENOS:
                return 53;
            case OCULTATORTUGA:
                return 54;
            case OT:
                return 55;
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
            case ']':
                return yyr196();
        }
        return 947;
    }

    private int yys236() {
        switch (yytok) {
            case FLOAT:
            case '>':
            case VERDE:
            case CIAN:
            case '/':
            case O:
            case '*':
            case Y:
            case PARA:
            case AZUL:
            case AMARILLO:
            case '<':
            case '(':
            case '-':
            case '=':
            case '+':
            case ')':
            case error:
            case MARRON:
            case '[':
            case CUENTA:
            case GRIS:
            case ROJO:
            case IGUALES:
            case BOOLEAN:
            case INTEGER:
            case BLANCO:
            case NEGRO:
            case MENORQUE:
            case MAYORQUE:
            case ENDINPUT:
                return 947;
        }
        return yyr205();
    }

    private int yys237() {
        switch (yytok) {
            case FLOAT:
            case '>':
            case VERDE:
            case CIAN:
            case '/':
            case O:
            case '*':
            case Y:
            case PARA:
            case AZUL:
            case AMARILLO:
            case '<':
            case '(':
            case '-':
            case '=':
            case '+':
            case ')':
            case error:
            case MARRON:
            case '[':
            case CUENTA:
            case GRIS:
            case ROJO:
            case IGUALES:
            case BOOLEAN:
            case INTEGER:
            case BLANCO:
            case NEGRO:
            case MENORQUE:
            case MAYORQUE:
            case ENDINPUT:
                return 947;
        }
        return yyr204();
    }

    private int yys239() {
        switch (yytok) {
            case AZAR:
                return 34;
            case COS:
                return 39;
            case DIFERENCIA:
                return 40;
            case DIVISION:
                return 41;
            case ELEGIR:
                return 43;
            case ELEMENTO:
                return 44;
            case MENOS:
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
            case FLOAT:
                return 89;
            case IDENTIFIER:
                return 90;
            case INTEGER:
                return 91;
            case '(':
                return 104;
            case BOOLEAN:
                return 336;
        }
        return 947;
    }

    private int yys242() {
        switch (yytok) {
            case APARECETORTUGA:
                return 30;
            case AT:
                return 31;
            case AV:
                return 32;
            case AVANZA:
                return 33;
            case AZAR:
                return 34;
            case BAJALAPIZ:
                return 35;
            case BL:
                return 36;
            case BORRAPANTALLA:
                return 37;
            case CENTRO:
                return 38;
            case COS:
                return 39;
            case DIFERENCIA:
                return 40;
            case DIVISION:
                return 41;
            case EJECUTA:
                return 42;
            case ELEGIR:
                return 43;
            case ELEMENTO:
                return 44;
            case ESPERA:
                return 45;
            case GD:
                return 46;
            case GI:
                return 47;
            case GIRADERECHA:
                return 48;
            case GIRAIZQUIERDA:
                return 49;
            case IDENTIFIER:
                return 50;
            case INC:
                return 51;
            case INIC:
                return 52;
            case MENOS:
                return 53;
            case OCULTATORTUGA:
                return 54;
            case OT:
                return 55;
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
            case FIN:
            case ']':
                return yyr168();
        }
        return 947;
    }

    private int yys244() {
        switch (yytok) {
            case APARECETORTUGA:
                return 30;
            case AT:
                return 31;
            case AV:
                return 32;
            case AVANZA:
                return 33;
            case AZAR:
                return 34;
            case BAJALAPIZ:
                return 35;
            case BL:
                return 36;
            case BORRAPANTALLA:
                return 37;
            case CENTRO:
                return 38;
            case COS:
                return 39;
            case DIFERENCIA:
                return 40;
            case DIVISION:
                return 41;
            case EJECUTA:
                return 42;
            case ELEGIR:
                return 43;
            case ELEMENTO:
                return 44;
            case ESPERA:
                return 45;
            case GD:
                return 46;
            case GI:
                return 47;
            case GIRADERECHA:
                return 48;
            case GIRAIZQUIERDA:
                return 49;
            case IDENTIFIER:
                return 50;
            case INC:
                return 51;
            case INIC:
                return 52;
            case MENOS:
                return 53;
            case OCULTATORTUGA:
                return 54;
            case OT:
                return 55;
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
        }
        return 947;
    }

    private int yys245() {
        switch (yytok) {
            case '>':
            case ENDINPUT:
            case '+':
            case GRIS:
            case MAYORQUE:
            case ')':
            case '-':
            case VERDE:
            case ';':
            case ROJO:
            case '[':
            case ']':
            case BLANCO:
            case MENORQUE:
            case '=':
            case '*':
            case Y:
            case error:
            case '/':
            case '<':
            case AMARILLO:
            case IGUALES:
            case CIAN:
            case AZUL:
            case CUENTA:
            case BOOLEAN:
            case PARA:
            case MARRON:
            case O:
            case NEGRO:
                return 947;
            case FLOAT:
                return 89;
            case INTEGER:
                return 91;
            case '(':
                return 104;
            case IDENTIFIER:
                return 343;
            case FIN:
                return yyr209();
        }
        return yyr201();
    }

    private int yys246() {
        switch (yytok) {
            case INTEGER:
                return 91;
            case IDENTIFIER:
                return 110;
            case '(':
                return 111;
            case '*':
                return 209;
            case '+':
                return 210;
            case '-':
                return 211;
            case '/':
                return 212;
        }
        return 947;
    }

    private int yys249() {
        switch (yytok) {
            case error:
            case '>':
            case MENORQUE:
            case FLOAT:
            case BLANCO:
            case O:
            case MAYORQUE:
            case VERDE:
            case CIAN:
            case AZUL:
            case AMARILLO:
            case '<':
            case '(':
            case NEGRO:
            case '=':
            case ENDINPUT:
            case ')':
            case Y:
            case PARA:
            case '[':
            case CUENTA:
            case GRIS:
            case ROJO:
            case IGUALES:
            case BOOLEAN:
            case INTEGER:
            case MARRON:
                return 947;
            case '*':
                return 209;
            case '+':
                return 210;
            case '-':
                return 211;
            case '/':
                return 212;
        }
        return yyr139();
    }

    private int yys250() {
        switch (yytok) {
            case REDONDEA:
                return 70;
            case RESTO:
                return 72;
            case INTEGER:
                return 91;
            case IDENTIFIER:
                return 110;
            case '(':
                return 111;
            case AZAR:
                return 252;
            case DIFERENCIA:
                return 253;
            case ELEGIR:
                return 254;
            case ELEMENTO:
                return 255;
            case MENOS:
                return 256;
            case POTENCIA:
                return 257;
            case PRIMERO:
                return 258;
            case PRODUCTO:
                return 259;
            case SUMA:
                return 260;
            case UL:
                return 261;
            case ULTIMO:
                return 262;
        }
        return 947;
    }

    private int yys264() {
        switch (yytok) {
            case AMARILLO:
            case Y:
            case PARA:
            case BOOLEAN:
            case MENORQUE:
            case O:
            case MARRON:
            case INTEGER:
            case GRIS:
            case CIAN:
            case '=':
            case '(':
            case error:
            case ENDINPUT:
            case BLANCO:
            case MAYORQUE:
            case VERDE:
            case NEGRO:
            case ROJO:
            case IGUALES:
            case AZUL:
            case FLOAT:
            case CUENTA:
                return 947;
            case '*':
                return 205;
            case '+':
                return 206;
            case '-':
                return 207;
            case '/':
                return 208;
        }
        return yyr151();
    }

    private int yys265() {
        switch (yytok) {
            case AMARILLO:
            case Y:
            case PARA:
            case BOOLEAN:
            case MENORQUE:
            case O:
            case MARRON:
            case INTEGER:
            case GRIS:
            case CIAN:
            case '=':
            case '(':
            case error:
            case ENDINPUT:
            case BLANCO:
            case MAYORQUE:
            case VERDE:
            case NEGRO:
            case ROJO:
            case IGUALES:
            case AZUL:
            case FLOAT:
            case CUENTA:
                return 947;
            case '*':
                return 209;
            case '+':
                return 210;
            case '-':
                return 211;
            case '/':
                return 212;
        }
        return yyr153();
    }

    private int yys266() {
        switch (yytok) {
            case COS:
                return 39;
            case DIVISION:
                return 41;
            case RAIZCUADRADA:
                return 67;
            case RC:
                return 68;
            case SEN:
                return 76;
            case SENO:
                return 77;
            case FLOAT:
                return 89;
            case IDENTIFIER:
                return 90;
            case INTEGER:
                return 91;
            case '(':
                return 104;
            case AZAR:
                return 360;
            case DIFERENCIA:
                return 361;
            case ELEGIR:
                return 362;
            case ELEMENTO:
                return 363;
            case MENOS:
                return 364;
            case POTENCIA:
                return 365;
            case PRIMERO:
                return 366;
            case PRODUCTO:
                return 367;
            case SUMA:
                return 368;
            case UL:
                return 369;
            case ULTIMO:
                return 370;
        }
        return 947;
    }

    private int yys267() {
        switch (yytok) {
            case AMARILLO:
            case Y:
            case PARA:
            case BOOLEAN:
            case MENORQUE:
            case O:
            case MARRON:
            case INTEGER:
            case GRIS:
            case CIAN:
            case '=':
            case '(':
            case error:
            case ENDINPUT:
            case BLANCO:
            case MAYORQUE:
            case VERDE:
            case NEGRO:
            case ROJO:
            case IGUALES:
            case AZUL:
            case FLOAT:
            case CUENTA:
                return 947;
            case '*':
                return 205;
            case '+':
                return 206;
            case '-':
                return 207;
            case '/':
                return 208;
        }
        return yyr152();
    }

    private int yys268() {
        switch (yytok) {
            case AMARILLO:
            case Y:
            case PARA:
            case BOOLEAN:
            case MENORQUE:
            case O:
            case MARRON:
            case INTEGER:
            case GRIS:
            case CIAN:
            case '=':
            case '(':
            case error:
            case ENDINPUT:
            case BLANCO:
            case MAYORQUE:
            case VERDE:
            case NEGRO:
            case ROJO:
            case IGUALES:
            case AZUL:
            case FLOAT:
            case CUENTA:
                return 947;
            case '*':
                return 209;
            case '+':
                return 210;
            case '-':
                return 211;
            case '/':
                return 212;
        }
        return yyr145();
    }

    private int yys269() {
        switch (yytok) {
            case AZAR:
                return 34;
            case COS:
                return 39;
            case DIFERENCIA:
                return 40;
            case DIVISION:
                return 41;
            case ELEGIR:
                return 43;
            case ELEMENTO:
                return 44;
            case MENOS:
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
            case FLOAT:
                return 89;
            case IDENTIFIER:
                return 90;
            case INTEGER:
                return 91;
            case '(':
                return 104;
        }
        return 947;
    }

    private int yys278() {
        switch (yytok) {
            case APARECETORTUGA:
                return 30;
            case AT:
                return 31;
            case AV:
                return 32;
            case AVANZA:
                return 33;
            case AZAR:
                return 34;
            case BAJALAPIZ:
                return 35;
            case BL:
                return 36;
            case BORRAPANTALLA:
                return 37;
            case CENTRO:
                return 38;
            case COS:
                return 39;
            case DIFERENCIA:
                return 40;
            case DIVISION:
                return 41;
            case EJECUTA:
                return 42;
            case ELEGIR:
                return 43;
            case ELEMENTO:
                return 44;
            case ESPERA:
                return 45;
            case GD:
                return 46;
            case GI:
                return 47;
            case GIRADERECHA:
                return 48;
            case GIRAIZQUIERDA:
                return 49;
            case IDENTIFIER:
                return 50;
            case INC:
                return 51;
            case INIC:
                return 52;
            case MENOS:
                return 53;
            case OCULTATORTUGA:
                return 54;
            case OT:
                return 55;
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
        }
        return 947;
    }

    private int yys279() {
        switch (yytok) {
            case BOOLEAN:
            case '(':
            case INTEGER:
            case GRIS:
            case MENORQUE:
            case O:
            case Y:
            case '-':
            case ROJO:
            case CIAN:
            case '=':
            case '*':
            case '+':
            case ENDINPUT:
            case '/':
            case error:
            case VERDE:
            case MARRON:
            case PARA:
            case IGUALES:
            case AZUL:
            case FLOAT:
            case CUENTA:
            case AMARILLO:
            case BLANCO:
            case NEGRO:
            case MAYORQUE:
                return 947;
        }
        return yyr149();
    }

    private int yys284() {
        switch (yytok) {
            case AZAR:
                return 34;
            case COS:
                return 39;
            case DIFERENCIA:
                return 40;
            case DIVISION:
                return 41;
            case ELEGIR:
                return 43;
            case ELEMENTO:
                return 44;
            case MENOS:
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
        }
        return 947;
    }

    private int yys285() {
        switch (yytok) {
            case AZAR:
                return 34;
            case COS:
                return 39;
            case DIFERENCIA:
                return 40;
            case DIVISION:
                return 41;
            case ELEGIR:
                return 43;
            case ELEMENTO:
                return 44;
            case MENOS:
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
        }
        return 947;
    }

    private int yys288() {
        switch (yytok) {
            case APARECETORTUGA:
                return 30;
            case AT:
                return 31;
            case AV:
                return 32;
            case AVANZA:
                return 33;
            case AZAR:
                return 34;
            case BAJALAPIZ:
                return 35;
            case BL:
                return 36;
            case BORRAPANTALLA:
                return 37;
            case CENTRO:
                return 38;
            case COS:
                return 39;
            case DIFERENCIA:
                return 40;
            case DIVISION:
                return 41;
            case EJECUTA:
                return 42;
            case ELEGIR:
                return 43;
            case ELEMENTO:
                return 44;
            case ESPERA:
                return 45;
            case GD:
                return 46;
            case GI:
                return 47;
            case GIRADERECHA:
                return 48;
            case GIRAIZQUIERDA:
                return 49;
            case IDENTIFIER:
                return 50;
            case INC:
                return 51;
            case INIC:
                return 52;
            case MENOS:
                return 53;
            case OCULTATORTUGA:
                return 54;
            case OT:
                return 55;
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
        }
        return 947;
    }

    private int yys290() {
        switch (yytok) {
            case AZAR:
                return 34;
            case COS:
                return 39;
            case DIFERENCIA:
                return 40;
            case DIVISION:
                return 41;
            case ELEGIR:
                return 43;
            case ELEMENTO:
                return 44;
            case MENOS:
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
            case FLOAT:
                return 89;
            case IDENTIFIER:
                return 90;
            case INTEGER:
                return 91;
            case '(':
                return 104;
        }
        return 947;
    }

    private int yys293() {
        switch (yytok) {
            case AZAR:
                return 34;
            case COS:
                return 39;
            case DIFERENCIA:
                return 40;
            case DIVISION:
                return 41;
            case ELEGIR:
                return 43;
            case ELEMENTO:
                return 44;
            case MENOS:
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
            case FLOAT:
                return 89;
            case INTEGER:
                return 91;
            case BOOLEAN:
                return 190;
            case IDENTIFIER:
                return 191;
            case IGUALES:
                return 192;
            case MAYORQUE:
                return 193;
            case MENORQUE:
                return 194;
            case O:
                return 195;
            case Y:
                return 196;
            case '(':
                return 197;
        }
        return 947;
    }

    private int yys294() {
        switch (yytok) {
            case AZAR:
                return 34;
            case COS:
                return 39;
            case DIFERENCIA:
                return 40;
            case DIVISION:
                return 41;
            case ELEGIR:
                return 43;
            case ELEMENTO:
                return 44;
            case MENOS:
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
            case FLOAT:
                return 89;
            case INTEGER:
                return 91;
            case BOOLEAN:
                return 190;
            case IDENTIFIER:
                return 191;
            case IGUALES:
                return 192;
            case MAYORQUE:
                return 193;
            case MENORQUE:
                return 194;
            case O:
                return 195;
            case Y:
                return 196;
            case '(':
                return 197;
        }
        return 947;
    }

    private int yys295() {
        switch (yytok) {
            case '*':
                return 205;
            case '+':
                return 206;
            case '-':
                return 207;
            case '/':
                return 208;
            case ')':
                return 312;
            case '>':
            case '<':
                return yyr36();
        }
        return 947;
    }

    private int yys297() {
        switch (yytok) {
            case '*':
                return 209;
            case '+':
                return 210;
            case '-':
                return 211;
            case '/':
                return 212;
            case ')':
                return 314;
            case '>':
            case '<':
                return yyr35();
        }
        return 947;
    }

    private int yys303() {
        switch (yytok) {
            case AZAR:
                return 34;
            case COS:
                return 39;
            case DIFERENCIA:
                return 40;
            case DIVISION:
                return 41;
            case ELEGIR:
                return 43;
            case ELEMENTO:
                return 44;
            case MENOS:
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
            case FLOAT:
                return 89;
            case IDENTIFIER:
                return 90;
            case INTEGER:
                return 91;
            case '(':
                return 104;
            case BOOLEAN:
                return 405;
        }
        return 947;
    }

    private int yys304() {
        switch (yytok) {
            case MENORQUE:
            case GRIS:
            case IGUALES:
            case '=':
            case BLANCO:
            case ROJO:
            case MARRON:
            case CUENTA:
            case CIAN:
            case PARA:
            case error:
            case ENDINPUT:
            case VERDE:
            case MAYORQUE:
            case O:
            case Y:
            case NEGRO:
            case AMARILLO:
            case AZUL:
            case BOOLEAN:
                return 947;
        }
        return yyr30();
    }

    private int yys305() {
        switch (yytok) {
            case AZUL:
            case NEGRO:
            case GRIS:
            case '=':
            case ENDINPUT:
            case MARRON:
            case CUENTA:
            case AMARILLO:
            case ROJO:
            case IGUALES:
            case MAYORQUE:
            case O:
            case VERDE:
            case Y:
            case BLANCO:
            case error:
            case MENORQUE:
            case PARA:
            case BOOLEAN:
            case CIAN:
                return 947;
            case '*':
                return 205;
            case '/':
                return 208;
        }
        return yyr28();
    }

    private int yys306() {
        switch (yytok) {
            case AZUL:
            case NEGRO:
            case GRIS:
            case '=':
            case ENDINPUT:
            case MARRON:
            case CUENTA:
            case AMARILLO:
            case ROJO:
            case IGUALES:
            case MAYORQUE:
            case O:
            case VERDE:
            case Y:
            case BLANCO:
            case error:
            case MENORQUE:
            case PARA:
            case BOOLEAN:
            case CIAN:
                return 947;
            case '*':
                return 205;
            case '/':
                return 208;
        }
        return yyr29();
    }

    private int yys307() {
        switch (yytok) {
            case MENORQUE:
            case GRIS:
            case IGUALES:
            case '=':
            case BLANCO:
            case ROJO:
            case MARRON:
            case CUENTA:
            case CIAN:
            case PARA:
            case error:
            case ENDINPUT:
            case VERDE:
            case MAYORQUE:
            case O:
            case Y:
            case NEGRO:
            case AMARILLO:
            case AZUL:
            case BOOLEAN:
                return 947;
        }
        return yyr31();
    }

    private int yys308() {
        switch (yytok) {
            case MENORQUE:
            case GRIS:
            case IGUALES:
            case '=':
            case BLANCO:
            case ROJO:
            case MARRON:
            case CUENTA:
            case CIAN:
            case PARA:
            case error:
            case ENDINPUT:
            case VERDE:
            case MAYORQUE:
            case O:
            case Y:
            case NEGRO:
            case AMARILLO:
            case AZUL:
            case BOOLEAN:
                return 947;
        }
        return yyr23();
    }

    private int yys309() {
        switch (yytok) {
            case AZUL:
            case NEGRO:
            case GRIS:
            case '=':
            case ENDINPUT:
            case MARRON:
            case CUENTA:
            case AMARILLO:
            case ROJO:
            case IGUALES:
            case MAYORQUE:
            case O:
            case VERDE:
            case Y:
            case BLANCO:
            case error:
            case MENORQUE:
            case PARA:
            case BOOLEAN:
            case CIAN:
                return 947;
            case '*':
                return 209;
            case '/':
                return 212;
        }
        return yyr21();
    }

    private int yys310() {
        switch (yytok) {
            case AZUL:
            case NEGRO:
            case GRIS:
            case '=':
            case ENDINPUT:
            case MARRON:
            case CUENTA:
            case AMARILLO:
            case ROJO:
            case IGUALES:
            case MAYORQUE:
            case O:
            case VERDE:
            case Y:
            case BLANCO:
            case error:
            case MENORQUE:
            case PARA:
            case BOOLEAN:
            case CIAN:
                return 947;
            case '*':
                return 209;
            case '/':
                return 212;
        }
        return yyr22();
    }

    private int yys311() {
        switch (yytok) {
            case MENORQUE:
            case GRIS:
            case IGUALES:
            case '=':
            case BLANCO:
            case ROJO:
            case MARRON:
            case CUENTA:
            case CIAN:
            case PARA:
            case error:
            case ENDINPUT:
            case VERDE:
            case MAYORQUE:
            case O:
            case Y:
            case NEGRO:
            case AMARILLO:
            case AZUL:
            case BOOLEAN:
                return 947;
        }
        return yyr24();
    }

    private int yys312() {
        switch (yytok) {
            case MENORQUE:
            case GRIS:
            case IGUALES:
            case '=':
            case BLANCO:
            case ROJO:
            case MARRON:
            case CUENTA:
            case CIAN:
            case PARA:
            case error:
            case ENDINPUT:
            case VERDE:
            case MAYORQUE:
            case O:
            case Y:
            case NEGRO:
            case AMARILLO:
            case AZUL:
            case BOOLEAN:
                return 947;
        }
        return yyr32();
    }

    private int yys313() {
        switch (yytok) {
            case FLOAT:
            case '>':
            case VERDE:
            case CIAN:
            case '/':
            case O:
            case '*':
            case Y:
            case PARA:
            case AZUL:
            case AMARILLO:
            case '<':
            case '(':
            case '-':
            case '=':
            case '+':
            case ')':
            case error:
            case MARRON:
            case '[':
            case CUENTA:
            case GRIS:
            case ROJO:
            case IGUALES:
            case BOOLEAN:
            case INTEGER:
            case BLANCO:
            case NEGRO:
            case MENORQUE:
            case MAYORQUE:
            case ENDINPUT:
                return 947;
        }
        return yyr107();
    }

    private int yys314() {
        switch (yytok) {
            case MENORQUE:
            case GRIS:
            case IGUALES:
            case '=':
            case BLANCO:
            case ROJO:
            case MARRON:
            case CUENTA:
            case CIAN:
            case PARA:
            case error:
            case ENDINPUT:
            case VERDE:
            case MAYORQUE:
            case O:
            case Y:
            case NEGRO:
            case AMARILLO:
            case AZUL:
            case BOOLEAN:
                return 947;
        }
        return yyr25();
    }

    private int yys315() {
        switch (yytok) {
            case FLOAT:
            case '>':
            case VERDE:
            case CIAN:
            case '/':
            case O:
            case '*':
            case Y:
            case PARA:
            case AZUL:
            case AMARILLO:
            case '<':
            case '(':
            case '-':
            case '=':
            case '+':
            case ')':
            case error:
            case MARRON:
            case '[':
            case CUENTA:
            case GRIS:
            case ROJO:
            case IGUALES:
            case BOOLEAN:
            case INTEGER:
            case BLANCO:
            case NEGRO:
            case MENORQUE:
            case MAYORQUE:
            case ENDINPUT:
                return 947;
        }
        return yyr106();
    }

    private int yys316() {
        switch (yytok) {
            case BOOLEAN:
            case '(':
            case INTEGER:
            case GRIS:
            case MENORQUE:
            case O:
            case Y:
            case '-':
            case ROJO:
            case CIAN:
            case '=':
            case '*':
            case '+':
            case ENDINPUT:
            case '/':
            case error:
            case VERDE:
            case MARRON:
            case PARA:
            case IGUALES:
            case AZUL:
            case FLOAT:
            case CUENTA:
            case AMARILLO:
            case BLANCO:
            case NEGRO:
            case MAYORQUE:
                return 947;
        }
        return yyr132();
    }

    private int yys317() {
        switch (yytok) {
            case BOOLEAN:
            case '(':
            case INTEGER:
            case GRIS:
            case MENORQUE:
            case O:
            case Y:
            case '-':
            case ROJO:
            case CIAN:
            case '=':
            case '*':
            case '+':
            case ENDINPUT:
            case '/':
            case error:
            case VERDE:
            case MARRON:
            case PARA:
            case IGUALES:
            case AZUL:
            case FLOAT:
            case CUENTA:
            case AMARILLO:
            case BLANCO:
            case NEGRO:
            case MAYORQUE:
                return 947;
        }
        return yyr123();
    }

    private int yys318() {
        switch (yytok) {
            case BOOLEAN:
            case '(':
            case INTEGER:
            case GRIS:
            case MENORQUE:
            case O:
            case Y:
            case '-':
            case ROJO:
            case CIAN:
            case '=':
            case '*':
            case '+':
            case ENDINPUT:
            case '/':
            case error:
            case VERDE:
            case MARRON:
            case PARA:
            case IGUALES:
            case AZUL:
            case FLOAT:
            case CUENTA:
            case AMARILLO:
            case BLANCO:
            case NEGRO:
            case MAYORQUE:
                return 947;
        }
        return yyr134();
    }

    private int yys321() {
        switch (yytok) {
            case FLOAT:
            case '>':
            case VERDE:
            case CIAN:
            case '/':
            case O:
            case '*':
            case Y:
            case PARA:
            case AZUL:
            case AMARILLO:
            case '<':
            case '(':
            case '-':
            case '=':
            case '+':
            case ')':
            case error:
            case MARRON:
            case '[':
            case CUENTA:
            case GRIS:
            case ROJO:
            case IGUALES:
            case BOOLEAN:
            case INTEGER:
            case BLANCO:
            case NEGRO:
            case MENORQUE:
            case MAYORQUE:
            case ENDINPUT:
                return 947;
        }
        return yyr197();
    }

    private int yys323() {
        switch (yytok) {
            case BOOLEAN:
            case '(':
            case INTEGER:
            case GRIS:
            case MENORQUE:
            case O:
            case Y:
            case '-':
            case ROJO:
            case CIAN:
            case '=':
            case '*':
            case '+':
            case ENDINPUT:
            case '/':
            case error:
            case VERDE:
            case MARRON:
            case PARA:
            case IGUALES:
            case AZUL:
            case FLOAT:
            case CUENTA:
            case AMARILLO:
            case BLANCO:
            case NEGRO:
            case MAYORQUE:
                return 947;
        }
        return yyr187();
    }

    private int yys324() {
        switch (yytok) {
            case BOOLEAN:
            case '(':
            case INTEGER:
            case GRIS:
            case MENORQUE:
            case O:
            case Y:
            case '-':
            case ROJO:
            case CIAN:
            case '=':
            case '*':
            case '+':
            case ENDINPUT:
            case '/':
            case error:
            case VERDE:
            case MARRON:
            case PARA:
            case IGUALES:
            case AZUL:
            case FLOAT:
            case CUENTA:
            case AMARILLO:
            case BLANCO:
            case NEGRO:
            case MAYORQUE:
                return 947;
        }
        return yyr183();
    }

    private int yys327() {
        switch (yytok) {
            case FLOAT:
            case '>':
            case VERDE:
            case CIAN:
            case '/':
            case O:
            case '*':
            case Y:
            case PARA:
            case AZUL:
            case AMARILLO:
            case '<':
            case '(':
            case '-':
            case '=':
            case '+':
            case ')':
            case error:
            case MARRON:
            case '[':
            case CUENTA:
            case GRIS:
            case ROJO:
            case IGUALES:
            case BOOLEAN:
            case INTEGER:
            case BLANCO:
            case NEGRO:
            case MENORQUE:
            case MAYORQUE:
            case ENDINPUT:
                return 947;
        }
        return yyr105();
    }

    private int yys328() {
        switch (yytok) {
            case FLOAT:
            case '>':
            case VERDE:
            case CIAN:
            case '/':
            case O:
            case '*':
            case Y:
            case PARA:
            case AZUL:
            case AMARILLO:
            case '<':
            case '(':
            case '-':
            case '=':
            case '+':
            case ')':
            case error:
            case MARRON:
            case '[':
            case CUENTA:
            case GRIS:
            case ROJO:
            case IGUALES:
            case BOOLEAN:
            case INTEGER:
            case BLANCO:
            case NEGRO:
            case MENORQUE:
            case MAYORQUE:
            case ENDINPUT:
                return 947;
        }
        return yyr111();
    }

    private int yys329() {
        switch (yytok) {
            case FLOAT:
            case '>':
            case VERDE:
            case CIAN:
            case '/':
            case O:
            case '*':
            case Y:
            case PARA:
            case AZUL:
            case AMARILLO:
            case '<':
            case '(':
            case '-':
            case '=':
            case '+':
            case ')':
            case error:
            case MARRON:
            case '[':
            case CUENTA:
            case GRIS:
            case ROJO:
            case IGUALES:
            case BOOLEAN:
            case INTEGER:
            case BLANCO:
            case NEGRO:
            case MENORQUE:
            case MAYORQUE:
            case ENDINPUT:
                return 947;
        }
        return yyr113();
    }

    private int yys330() {
        switch (yytok) {
            case FLOAT:
            case '>':
            case VERDE:
            case CIAN:
            case '/':
            case O:
            case '*':
            case Y:
            case PARA:
            case AZUL:
            case AMARILLO:
            case '<':
            case '(':
            case '-':
            case '=':
            case '+':
            case ')':
            case error:
            case MARRON:
            case '[':
            case CUENTA:
            case GRIS:
            case ROJO:
            case IGUALES:
            case BOOLEAN:
            case INTEGER:
            case BLANCO:
            case NEGRO:
            case MENORQUE:
            case MAYORQUE:
            case ENDINPUT:
                return 947;
        }
        return yyr110();
    }

    private int yys331() {
        switch (yytok) {
            case FLOAT:
            case '>':
            case VERDE:
            case CIAN:
            case '/':
            case O:
            case '*':
            case Y:
            case PARA:
            case AZUL:
            case AMARILLO:
            case '<':
            case '(':
            case '-':
            case '=':
            case '+':
            case ')':
            case error:
            case MARRON:
            case '[':
            case CUENTA:
            case GRIS:
            case ROJO:
            case IGUALES:
            case BOOLEAN:
            case INTEGER:
            case BLANCO:
            case NEGRO:
            case MENORQUE:
            case MAYORQUE:
            case ENDINPUT:
                return 947;
        }
        return yyr112();
    }

    private int yys333() {
        switch (yytok) {
            case FLOAT:
            case '>':
            case VERDE:
            case CIAN:
            case '/':
            case O:
            case '*':
            case Y:
            case PARA:
            case AZUL:
            case AMARILLO:
            case '<':
            case '(':
            case '-':
            case '=':
            case '+':
            case ')':
            case error:
            case MARRON:
            case '[':
            case CUENTA:
            case GRIS:
            case ROJO:
            case IGUALES:
            case BOOLEAN:
            case INTEGER:
            case BLANCO:
            case NEGRO:
            case MENORQUE:
            case MAYORQUE:
            case ENDINPUT:
                return 947;
        }
        return yyr177();
    }

    private int yys334() {
        switch (yytok) {
            case FLOAT:
            case '>':
            case VERDE:
            case CIAN:
            case '/':
            case O:
            case '*':
            case Y:
            case PARA:
            case AZUL:
            case AMARILLO:
            case '<':
            case '(':
            case '-':
            case '=':
            case '+':
            case ')':
            case error:
            case MARRON:
            case '[':
            case CUENTA:
            case GRIS:
            case ROJO:
            case IGUALES:
            case BOOLEAN:
            case INTEGER:
            case BLANCO:
            case NEGRO:
            case MENORQUE:
            case MAYORQUE:
            case ENDINPUT:
                return 947;
        }
        return yyr69();
    }

    private int yys335() {
        switch (yytok) {
            case FLOAT:
            case '>':
            case VERDE:
            case CIAN:
            case '/':
            case O:
            case '*':
            case Y:
            case PARA:
            case AZUL:
            case AMARILLO:
            case '<':
            case '(':
            case '-':
            case '=':
            case '+':
            case ')':
            case error:
            case MARRON:
            case '[':
            case CUENTA:
            case GRIS:
            case ROJO:
            case IGUALES:
            case BOOLEAN:
            case INTEGER:
            case BLANCO:
            case NEGRO:
            case MENORQUE:
            case MAYORQUE:
            case ENDINPUT:
                return 947;
        }
        return yyr68();
    }

    private int yys336() {
        switch (yytok) {
            case FLOAT:
            case '>':
            case VERDE:
            case CIAN:
            case '/':
            case O:
            case '*':
            case Y:
            case PARA:
            case AZUL:
            case AMARILLO:
            case '<':
            case '(':
            case '-':
            case '=':
            case '+':
            case ')':
            case error:
            case MARRON:
            case '[':
            case CUENTA:
            case GRIS:
            case ROJO:
            case IGUALES:
            case BOOLEAN:
            case INTEGER:
            case BLANCO:
            case NEGRO:
            case MENORQUE:
            case MAYORQUE:
            case ENDINPUT:
                return 947;
        }
        return yyr70();
    }

    private int yys337() {
        switch (yytok) {
            case BOOLEAN:
            case '(':
            case INTEGER:
            case GRIS:
            case MENORQUE:
            case O:
            case Y:
            case '-':
            case ROJO:
            case CIAN:
            case '=':
            case '*':
            case '+':
            case ENDINPUT:
            case '/':
            case error:
            case VERDE:
            case MARRON:
            case PARA:
            case IGUALES:
            case AZUL:
            case FLOAT:
            case CUENTA:
            case AMARILLO:
            case BLANCO:
            case NEGRO:
            case MAYORQUE:
                return 947;
        }
        return yyr133();
    }

    private int yys338() {
        switch (yytok) {
            case BOOLEAN:
            case '(':
            case INTEGER:
            case GRIS:
            case MENORQUE:
            case O:
            case Y:
            case '-':
            case ROJO:
            case CIAN:
            case '=':
            case '*':
            case '+':
            case ENDINPUT:
            case '/':
            case error:
            case VERDE:
            case MARRON:
            case PARA:
            case IGUALES:
            case AZUL:
            case FLOAT:
            case CUENTA:
            case AMARILLO:
            case BLANCO:
            case NEGRO:
            case MAYORQUE:
                return 947;
        }
        return yyr124();
    }

    private int yys342() {
        switch (yytok) {
            case GRIS:
            case MAYORQUE:
            case VERDE:
            case ROJO:
            case BOOLEAN:
            case MENORQUE:
            case '*':
            case Y:
            case INTEGER:
            case IGUALES:
            case FLOAT:
            case '[':
            case BLANCO:
            case '(':
            case '=':
            case '+':
            case ')':
            case error:
            case '/':
            case '<':
            case ']':
            case CUENTA:
            case CIAN:
            case AZUL:
            case AMARILLO:
            case FIN:
            case PARA:
            case MARRON:
            case O:
            case NEGRO:
            case ENDINPUT:
            case '>':
            case ';':
            case '-':
                return 947;
        }
        return yyr200();
    }

    private int yys343() {
        switch (yytok) {
            case MAYORQUE:
            case ')':
            case '[':
            case BOOLEAN:
            case Y:
            case '>':
            case error:
            case '<':
            case ROJO:
            case GRIS:
            case ']':
            case NEGRO:
            case O:
            case ENDINPUT:
            case '=':
            case MENORQUE:
            case VERDE:
            case ';':
            case AMARILLO:
            case IGUALES:
            case AZUL:
            case CIAN:
            case PARA:
            case CUENTA:
            case BLANCO:
            case MARRON:
                return 947;
            case IDENTIFIER:
                return 413;
        }
        return yyr26();
    }

    private int yys345() {
        switch (yytok) {
            case FLOAT:
            case '>':
            case VERDE:
            case CIAN:
            case '/':
            case O:
            case '*':
            case Y:
            case PARA:
            case AZUL:
            case AMARILLO:
            case '<':
            case '(':
            case '-':
            case '=':
            case '+':
            case ')':
            case error:
            case MARRON:
            case '[':
            case CUENTA:
            case GRIS:
            case ROJO:
            case IGUALES:
            case BOOLEAN:
            case INTEGER:
            case BLANCO:
            case NEGRO:
            case MENORQUE:
            case MAYORQUE:
            case ENDINPUT:
                return 947;
        }
        return yyr114();
    }

    private int yys346() {
        switch (yytok) {
            case FLOAT:
            case '>':
            case VERDE:
            case CIAN:
            case '/':
            case O:
            case '*':
            case Y:
            case PARA:
            case AZUL:
            case AMARILLO:
            case '<':
            case '(':
            case '-':
            case '=':
            case '+':
            case ')':
            case error:
            case MARRON:
            case '[':
            case CUENTA:
            case GRIS:
            case ROJO:
            case IGUALES:
            case BOOLEAN:
            case INTEGER:
            case BLANCO:
            case NEGRO:
            case MENORQUE:
            case MAYORQUE:
            case ENDINPUT:
                return 947;
        }
        return yyr115();
    }

    private int yys349() {
        switch (yytok) {
            case REDONDEA:
                return 70;
            case RESTO:
                return 72;
            case INTEGER:
                return 91;
            case IDENTIFIER:
                return 110;
            case '(':
                return 111;
            case AZAR:
                return 252;
            case DIFERENCIA:
                return 253;
            case ELEGIR:
                return 254;
            case ELEMENTO:
                return 255;
            case MENOS:
                return 256;
            case POTENCIA:
                return 257;
            case PRIMERO:
                return 258;
            case PRODUCTO:
                return 259;
            case SUMA:
                return 260;
            case UL:
                return 261;
            case ULTIMO:
                return 262;
        }
        return 947;
    }

    private int yys352() {
        switch (yytok) {
            case REDONDEA:
                return 70;
            case RESTO:
                return 72;
            case INTEGER:
                return 91;
            case IDENTIFIER:
                return 110;
            case '(':
                return 111;
            case AZAR:
                return 252;
            case DIFERENCIA:
                return 253;
            case ELEGIR:
                return 254;
            case ELEMENTO:
                return 255;
            case MENOS:
                return 256;
            case POTENCIA:
                return 257;
            case PRIMERO:
                return 258;
            case PRODUCTO:
                return 259;
            case SUMA:
                return 260;
            case UL:
                return 261;
            case ULTIMO:
                return 262;
        }
        return 947;
    }

    private int yys353() {
        switch (yytok) {
            case INTEGER:
                return 91;
            case IDENTIFIER:
                return 110;
            case '*':
                return 209;
            case '+':
                return 210;
            case '-':
                return 211;
            case '/':
                return 212;
            case '(':
                return 419;
        }
        return 947;
    }

    private int yys354() {
        switch (yytok) {
            case REDONDEA:
                return 70;
            case RESTO:
                return 72;
            case INTEGER:
                return 91;
            case IDENTIFIER:
                return 110;
            case '(':
                return 111;
            case AZAR:
                return 252;
            case DIFERENCIA:
                return 253;
            case ELEGIR:
                return 254;
            case ELEMENTO:
                return 255;
            case MENOS:
                return 256;
            case POTENCIA:
                return 257;
            case PRIMERO:
                return 258;
            case PRODUCTO:
                return 259;
            case SUMA:
                return 260;
            case UL:
                return 261;
            case ULTIMO:
                return 262;
        }
        return 947;
    }

    private int yys358() {
        switch (yytok) {
            case FLOAT:
            case '>':
            case VERDE:
            case CIAN:
            case '/':
            case O:
            case '*':
            case Y:
            case PARA:
            case AZUL:
            case AMARILLO:
            case '<':
            case '(':
            case '-':
            case '=':
            case '+':
            case ')':
            case error:
            case MARRON:
            case '[':
            case CUENTA:
            case GRIS:
            case ROJO:
            case IGUALES:
            case BOOLEAN:
            case INTEGER:
            case BLANCO:
            case NEGRO:
            case MENORQUE:
            case MAYORQUE:
            case ENDINPUT:
                return 947;
        }
        return yyr116();
    }

    private int yys375() {
        switch (yytok) {
            case BOOLEAN:
            case '(':
            case INTEGER:
            case GRIS:
            case MENORQUE:
            case O:
            case Y:
            case '-':
            case ROJO:
            case CIAN:
            case '=':
            case '*':
            case '+':
            case ENDINPUT:
            case '/':
            case error:
            case VERDE:
            case MARRON:
            case PARA:
            case IGUALES:
            case AZUL:
            case FLOAT:
            case CUENTA:
            case AMARILLO:
            case BLANCO:
            case NEGRO:
            case MAYORQUE:
                return 947;
        }
        return yyr190();
    }

    private int yys376() {
        switch (yytok) {
            case BOOLEAN:
            case '(':
            case INTEGER:
            case GRIS:
            case MENORQUE:
            case O:
            case Y:
            case '-':
            case ROJO:
            case CIAN:
            case '=':
            case '*':
            case '+':
            case ENDINPUT:
            case '/':
            case error:
            case VERDE:
            case MARRON:
            case PARA:
            case IGUALES:
            case AZUL:
            case FLOAT:
            case CUENTA:
            case AMARILLO:
            case BLANCO:
            case NEGRO:
            case MAYORQUE:
                return 947;
        }
        return yyr186();
    }

    private int yys377() {
        switch (yytok) {
            case BOOLEAN:
            case '(':
            case INTEGER:
            case GRIS:
            case MENORQUE:
            case O:
            case Y:
            case '-':
            case ROJO:
            case CIAN:
            case '=':
            case '*':
            case '+':
            case ENDINPUT:
            case '/':
            case error:
            case VERDE:
            case MARRON:
            case PARA:
            case IGUALES:
            case AZUL:
            case FLOAT:
            case CUENTA:
            case AMARILLO:
            case BLANCO:
            case NEGRO:
            case MAYORQUE:
                return 947;
        }
        return yyr135();
    }

    private int yys378() {
        switch (yytok) {
            case BOOLEAN:
            case '(':
            case INTEGER:
            case GRIS:
            case MENORQUE:
            case O:
            case Y:
            case '-':
            case ROJO:
            case CIAN:
            case '=':
            case '*':
            case '+':
            case ENDINPUT:
            case '/':
            case error:
            case VERDE:
            case MARRON:
            case PARA:
            case IGUALES:
            case AZUL:
            case FLOAT:
            case CUENTA:
            case AMARILLO:
            case BLANCO:
            case NEGRO:
            case MAYORQUE:
                return 947;
        }
        return yyr136();
    }

    private int yys379() {
        switch (yytok) {
            case FLOAT:
            case '>':
            case VERDE:
            case CIAN:
            case '/':
            case O:
            case '*':
            case Y:
            case PARA:
            case AZUL:
            case AMARILLO:
            case '<':
            case '(':
            case '-':
            case '=':
            case '+':
            case ')':
            case error:
            case MARRON:
            case '[':
            case CUENTA:
            case GRIS:
            case ROJO:
            case IGUALES:
            case BOOLEAN:
            case INTEGER:
            case BLANCO:
            case NEGRO:
            case MENORQUE:
            case MAYORQUE:
            case ENDINPUT:
                return 947;
        }
        return yyr109();
    }

    private int yys380() {
        switch (yytok) {
            case BOOLEAN:
            case '(':
            case INTEGER:
            case GRIS:
            case MENORQUE:
            case O:
            case Y:
            case '-':
            case ROJO:
            case CIAN:
            case '=':
            case '*':
            case '+':
            case ENDINPUT:
            case '/':
            case error:
            case VERDE:
            case MARRON:
            case PARA:
            case IGUALES:
            case AZUL:
            case FLOAT:
            case CUENTA:
            case AMARILLO:
            case BLANCO:
            case NEGRO:
            case MAYORQUE:
                return 947;
        }
        return yyr122();
    }

    private int yys383() {
        switch (yytok) {
            case FLOAT:
            case '>':
            case VERDE:
            case CIAN:
            case '/':
            case O:
            case '*':
            case Y:
            case PARA:
            case AZUL:
            case AMARILLO:
            case '<':
            case '(':
            case '-':
            case '=':
            case '+':
            case ')':
            case error:
            case MARRON:
            case '[':
            case CUENTA:
            case GRIS:
            case ROJO:
            case IGUALES:
            case BOOLEAN:
            case INTEGER:
            case BLANCO:
            case NEGRO:
            case MENORQUE:
            case MAYORQUE:
            case ENDINPUT:
                return 947;
        }
        return yyr108();
    }

    private int yys384() {
        switch (yytok) {
            case BOOLEAN:
            case '(':
            case INTEGER:
            case GRIS:
            case MENORQUE:
            case O:
            case Y:
            case '-':
            case ROJO:
            case CIAN:
            case '=':
            case '*':
            case '+':
            case ENDINPUT:
            case '/':
            case error:
            case VERDE:
            case MARRON:
            case PARA:
            case IGUALES:
            case AZUL:
            case FLOAT:
            case CUENTA:
            case AMARILLO:
            case BLANCO:
            case NEGRO:
            case MAYORQUE:
                return 947;
        }
        return yyr138();
    }

    private int yys385() {
        switch (yytok) {
            case BOOLEAN:
            case '(':
            case INTEGER:
            case GRIS:
            case MENORQUE:
            case O:
            case Y:
            case '-':
            case ROJO:
            case CIAN:
            case '=':
            case '*':
            case '+':
            case ENDINPUT:
            case '/':
            case error:
            case VERDE:
            case MARRON:
            case PARA:
            case IGUALES:
            case AZUL:
            case FLOAT:
            case CUENTA:
            case AMARILLO:
            case BLANCO:
            case NEGRO:
            case MAYORQUE:
                return 947;
        }
        return yyr137();
    }

    private int yys399() {
        switch (yytok) {
            case BOOLEAN:
            case '(':
            case INTEGER:
            case GRIS:
            case MENORQUE:
            case O:
            case Y:
            case '-':
            case ROJO:
            case CIAN:
            case '=':
            case '*':
            case '+':
            case ENDINPUT:
            case '/':
            case error:
            case VERDE:
            case MARRON:
            case PARA:
            case IGUALES:
            case AZUL:
            case FLOAT:
            case CUENTA:
            case AMARILLO:
            case BLANCO:
            case NEGRO:
            case MAYORQUE:
                return 947;
        }
        return yyr189();
    }

    private int yys400() {
        switch (yytok) {
            case BOOLEAN:
            case '(':
            case INTEGER:
            case GRIS:
            case MENORQUE:
            case O:
            case Y:
            case '-':
            case ROJO:
            case CIAN:
            case '=':
            case '*':
            case '+':
            case ENDINPUT:
            case '/':
            case error:
            case VERDE:
            case MARRON:
            case PARA:
            case IGUALES:
            case AZUL:
            case FLOAT:
            case CUENTA:
            case AMARILLO:
            case BLANCO:
            case NEGRO:
            case MAYORQUE:
                return 947;
        }
        return yyr185();
    }

    private int yys401() {
        switch (yytok) {
            case BOOLEAN:
            case '(':
            case INTEGER:
            case GRIS:
            case MENORQUE:
            case O:
            case Y:
            case '-':
            case ROJO:
            case CIAN:
            case '=':
            case '*':
            case '+':
            case ENDINPUT:
            case '/':
            case error:
            case VERDE:
            case MARRON:
            case PARA:
            case IGUALES:
            case AZUL:
            case FLOAT:
            case CUENTA:
            case AMARILLO:
            case BLANCO:
            case NEGRO:
            case MAYORQUE:
                return 947;
        }
        return yyr188();
    }

    private int yys402() {
        switch (yytok) {
            case BOOLEAN:
            case '(':
            case INTEGER:
            case GRIS:
            case MENORQUE:
            case O:
            case Y:
            case '-':
            case ROJO:
            case CIAN:
            case '=':
            case '*':
            case '+':
            case ENDINPUT:
            case '/':
            case error:
            case VERDE:
            case MARRON:
            case PARA:
            case IGUALES:
            case AZUL:
            case FLOAT:
            case CUENTA:
            case AMARILLO:
            case BLANCO:
            case NEGRO:
            case MAYORQUE:
                return 947;
        }
        return yyr184();
    }

    private int yys403() {
        switch (yytok) {
            case FLOAT:
            case '>':
            case VERDE:
            case CIAN:
            case '/':
            case O:
            case '*':
            case Y:
            case PARA:
            case AZUL:
            case AMARILLO:
            case '<':
            case '(':
            case '-':
            case '=':
            case '+':
            case ')':
            case error:
            case MARRON:
            case '[':
            case CUENTA:
            case GRIS:
            case ROJO:
            case IGUALES:
            case BOOLEAN:
            case INTEGER:
            case BLANCO:
            case NEGRO:
            case MENORQUE:
            case MAYORQUE:
            case ENDINPUT:
                return 947;
        }
        return yyr66();
    }

    private int yys404() {
        switch (yytok) {
            case FLOAT:
            case '>':
            case VERDE:
            case CIAN:
            case '/':
            case O:
            case '*':
            case Y:
            case PARA:
            case AZUL:
            case AMARILLO:
            case '<':
            case '(':
            case '-':
            case '=':
            case '+':
            case ')':
            case error:
            case MARRON:
            case '[':
            case CUENTA:
            case GRIS:
            case ROJO:
            case IGUALES:
            case BOOLEAN:
            case INTEGER:
            case BLANCO:
            case NEGRO:
            case MENORQUE:
            case MAYORQUE:
            case ENDINPUT:
                return 947;
        }
        return yyr65();
    }

    private int yys405() {
        switch (yytok) {
            case FLOAT:
            case '>':
            case VERDE:
            case CIAN:
            case '/':
            case O:
            case '*':
            case Y:
            case PARA:
            case AZUL:
            case AMARILLO:
            case '<':
            case '(':
            case '-':
            case '=':
            case '+':
            case ')':
            case error:
            case MARRON:
            case '[':
            case CUENTA:
            case GRIS:
            case ROJO:
            case IGUALES:
            case BOOLEAN:
            case INTEGER:
            case BLANCO:
            case NEGRO:
            case MENORQUE:
            case MAYORQUE:
            case ENDINPUT:
                return 947;
        }
        return yyr67();
    }

    private int yys406() {
        switch (yytok) {
            case BOOLEAN:
            case '(':
            case INTEGER:
            case GRIS:
            case MENORQUE:
            case O:
            case Y:
            case '-':
            case ROJO:
            case CIAN:
            case '=':
            case '*':
            case '+':
            case ENDINPUT:
            case '/':
            case error:
            case VERDE:
            case MARRON:
            case PARA:
            case IGUALES:
            case AZUL:
            case FLOAT:
            case CUENTA:
            case AMARILLO:
            case BLANCO:
            case NEGRO:
            case MAYORQUE:
                return 947;
        }
        return yyr161();
    }

    private int yys407() {
        switch (yytok) {
            case BOOLEAN:
            case '(':
            case INTEGER:
            case GRIS:
            case MENORQUE:
            case O:
            case Y:
            case '-':
            case ROJO:
            case CIAN:
            case '=':
            case '*':
            case '+':
            case ENDINPUT:
            case '/':
            case error:
            case VERDE:
            case MARRON:
            case PARA:
            case IGUALES:
            case AZUL:
            case FLOAT:
            case CUENTA:
            case AMARILLO:
            case BLANCO:
            case NEGRO:
            case MAYORQUE:
                return 947;
        }
        return yyr160();
    }

    private int yys408() {
        switch (yytok) {
            case AZAR:
                return 34;
            case COS:
                return 39;
            case DIFERENCIA:
                return 40;
            case DIVISION:
                return 41;
            case ELEGIR:
                return 43;
            case ELEMENTO:
                return 44;
            case MENOS:
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
            case FLOAT:
                return 89;
            case IDENTIFIER:
                return 90;
            case INTEGER:
                return 91;
            case '(':
                return 104;
        }
        return 947;
    }

    private int yys409() {
        switch (yytok) {
            case BOOLEAN:
            case '(':
            case INTEGER:
            case GRIS:
            case MENORQUE:
            case O:
            case Y:
            case '-':
            case ROJO:
            case CIAN:
            case '=':
            case '*':
            case '+':
            case ENDINPUT:
            case '/':
            case error:
            case VERDE:
            case MARRON:
            case PARA:
            case IGUALES:
            case AZUL:
            case FLOAT:
            case CUENTA:
            case AMARILLO:
            case BLANCO:
            case NEGRO:
            case MAYORQUE:
                return 947;
        }
        return yyr194();
    }

    private int yys410() {
        switch (yytok) {
            case BOOLEAN:
            case '(':
            case INTEGER:
            case GRIS:
            case MENORQUE:
            case O:
            case Y:
            case '-':
            case ROJO:
            case CIAN:
            case '=':
            case '*':
            case '+':
            case ENDINPUT:
            case '/':
            case error:
            case VERDE:
            case MARRON:
            case PARA:
            case IGUALES:
            case AZUL:
            case FLOAT:
            case CUENTA:
            case AMARILLO:
            case BLANCO:
            case NEGRO:
            case MAYORQUE:
                return 947;
        }
        return yyr193();
    }

    private int yys411() {
        switch (yytok) {
            case FLOAT:
            case '>':
            case VERDE:
            case CIAN:
            case '/':
            case O:
            case '*':
            case Y:
            case PARA:
            case AZUL:
            case AMARILLO:
            case '<':
            case '(':
            case '-':
            case '=':
            case '+':
            case ')':
            case error:
            case MARRON:
            case '[':
            case CUENTA:
            case GRIS:
            case ROJO:
            case IGUALES:
            case BOOLEAN:
            case INTEGER:
            case BLANCO:
            case NEGRO:
            case MENORQUE:
            case MAYORQUE:
            case ENDINPUT:
                return 947;
        }
        return yyr178();
    }

    private int yys413() {
        switch (yytok) {
            case MAYORQUE:
            case MENORQUE:
            case VERDE:
            case ROJO:
            case '[':
            case '(':
            case '*':
            case Y:
            case INTEGER:
            case IGUALES:
            case GRIS:
            case FIN:
            case MARRON:
            case NEGRO:
            case '=':
            case '+':
            case ')':
            case error:
            case '/':
            case '<':
            case ']':
            case CUENTA:
            case AZUL:
            case CIAN:
            case FLOAT:
            case AMARILLO:
            case BOOLEAN:
            case PARA:
            case BLANCO:
            case O:
            case ENDINPUT:
            case '>':
            case ';':
            case '-':
                return 947;
            case IDENTIFIER:
                return 413;
        }
        return yyr201();
    }

    private int yys414() {
        switch (yytok) {
            case FLOAT:
            case '>':
            case VERDE:
            case CIAN:
            case '/':
            case O:
            case '*':
            case Y:
            case PARA:
            case AZUL:
            case AMARILLO:
            case '<':
            case '(':
            case '-':
            case '=':
            case '+':
            case ')':
            case error:
            case MARRON:
            case '[':
            case CUENTA:
            case GRIS:
            case ROJO:
            case IGUALES:
            case BOOLEAN:
            case INTEGER:
            case BLANCO:
            case NEGRO:
            case MENORQUE:
            case MAYORQUE:
            case ENDINPUT:
                return 947;
        }
        return yyr180();
    }

    private int yys415() {
        switch (yytok) {
            case FLOAT:
            case '>':
            case VERDE:
            case CIAN:
            case '/':
            case O:
            case '*':
            case Y:
            case PARA:
            case AZUL:
            case AMARILLO:
            case '<':
            case '(':
            case '-':
            case '=':
            case '+':
            case ')':
            case error:
            case MARRON:
            case '[':
            case CUENTA:
            case GRIS:
            case ROJO:
            case IGUALES:
            case BOOLEAN:
            case INTEGER:
            case BLANCO:
            case NEGRO:
            case MENORQUE:
            case MAYORQUE:
            case ENDINPUT:
                return 947;
        }
        return yyr140();
    }

    private int yys416() {
        switch (yytok) {
            case error:
            case '>':
            case MENORQUE:
            case FLOAT:
            case BLANCO:
            case O:
            case MAYORQUE:
            case VERDE:
            case CIAN:
            case AZUL:
            case AMARILLO:
            case '<':
            case '(':
            case NEGRO:
            case '=':
            case ENDINPUT:
            case ')':
            case Y:
            case PARA:
            case '[':
            case CUENTA:
            case GRIS:
            case ROJO:
            case IGUALES:
            case BOOLEAN:
            case INTEGER:
            case MARRON:
                return 947;
            case '*':
                return 209;
            case '+':
                return 210;
            case '-':
                return 211;
            case '/':
                return 212;
        }
        return yyr141();
    }

    private int yys417() {
        switch (yytok) {
            case REDONDEA:
                return 70;
            case RESTO:
                return 72;
            case INTEGER:
                return 91;
            case IDENTIFIER:
                return 110;
            case '(':
                return 111;
            case AZAR:
                return 252;
            case DIFERENCIA:
                return 253;
            case ELEGIR:
                return 254;
            case ELEMENTO:
                return 255;
            case MENOS:
                return 256;
            case POTENCIA:
                return 257;
            case PRIMERO:
                return 258;
            case PRODUCTO:
                return 259;
            case SUMA:
                return 260;
            case UL:
                return 261;
            case ULTIMO:
                return 262;
        }
        return 947;
    }

    private int yys419() {
        switch (yytok) {
            case REDONDEA:
                return 70;
            case RESTO:
                return 72;
            case INTEGER:
                return 91;
            case IDENTIFIER:
                return 110;
            case '(':
                return 111;
            case AZAR:
                return 252;
            case DIFERENCIA:
                return 253;
            case ELEGIR:
                return 254;
            case ELEMENTO:
                return 255;
            case MENOS:
                return 256;
            case POTENCIA:
                return 257;
            case PRIMERO:
                return 258;
            case PRODUCTO:
                return 259;
            case SUMA:
                return 260;
            case UL:
                return 261;
            case ULTIMO:
                return 262;
        }
        return 947;
    }

    private int yys420() {
        switch (yytok) {
            case BOOLEAN:
            case '(':
            case INTEGER:
            case GRIS:
            case MENORQUE:
            case O:
            case Y:
            case '-':
            case ROJO:
            case CIAN:
            case '=':
            case '*':
            case '+':
            case ENDINPUT:
            case '/':
            case error:
            case VERDE:
            case MARRON:
            case PARA:
            case IGUALES:
            case AZUL:
            case FLOAT:
            case CUENTA:
            case AMARILLO:
            case BLANCO:
            case NEGRO:
            case MAYORQUE:
                return 947;
        }
        return yyr157();
    }

    private int yys421() {
        switch (yytok) {
            case COS:
                return 39;
            case DIVISION:
                return 41;
            case RAIZCUADRADA:
                return 67;
            case RC:
                return 68;
            case SEN:
                return 76;
            case SENO:
                return 77;
            case FLOAT:
                return 89;
            case IDENTIFIER:
                return 164;
            case '(':
                return 221;
            case AZAR:
                return 360;
            case DIFERENCIA:
                return 361;
            case ELEGIR:
                return 362;
            case ELEMENTO:
                return 363;
            case MENOS:
                return 364;
            case POTENCIA:
                return 365;
            case PRIMERO:
                return 366;
            case PRODUCTO:
                return 367;
            case SUMA:
                return 368;
            case UL:
                return 369;
            case ULTIMO:
                return 370;
        }
        return 947;
    }

    private int yys424() {
        switch (yytok) {
            case COS:
                return 39;
            case DIVISION:
                return 41;
            case RAIZCUADRADA:
                return 67;
            case RC:
                return 68;
            case SEN:
                return 76;
            case SENO:
                return 77;
            case FLOAT:
                return 89;
            case IDENTIFIER:
                return 164;
            case '(':
                return 221;
            case AZAR:
                return 360;
            case DIFERENCIA:
                return 361;
            case ELEGIR:
                return 362;
            case ELEMENTO:
                return 363;
            case MENOS:
                return 364;
            case POTENCIA:
                return 365;
            case PRIMERO:
                return 366;
            case PRODUCTO:
                return 367;
            case SUMA:
                return 368;
            case UL:
                return 369;
            case ULTIMO:
                return 370;
        }
        return 947;
    }

    private int yys425() {
        switch (yytok) {
            case FLOAT:
                return 89;
            case IDENTIFIER:
                return 164;
            case '*':
                return 209;
            case '+':
                return 210;
            case '-':
                return 211;
            case '/':
                return 212;
            case '(':
                return 448;
        }
        return 947;
    }

    private int yys426() {
        switch (yytok) {
            case COS:
                return 39;
            case DIVISION:
                return 41;
            case RAIZCUADRADA:
                return 67;
            case RC:
                return 68;
            case SEN:
                return 76;
            case SENO:
                return 77;
            case FLOAT:
                return 89;
            case IDENTIFIER:
                return 90;
            case INTEGER:
                return 91;
            case '(':
                return 104;
            case AZAR:
                return 360;
            case DIFERENCIA:
                return 361;
            case ELEGIR:
                return 362;
            case ELEMENTO:
                return 363;
            case MENOS:
                return 364;
            case POTENCIA:
                return 365;
            case PRIMERO:
                return 366;
            case PRODUCTO:
                return 367;
            case SUMA:
                return 368;
            case UL:
                return 369;
            case ULTIMO:
                return 370;
        }
        return 947;
    }

    private int yys430() {
        switch (yytok) {
            case BOOLEAN:
            case '(':
            case INTEGER:
            case GRIS:
            case MENORQUE:
            case O:
            case Y:
            case '-':
            case ROJO:
            case CIAN:
            case '=':
            case '*':
            case '+':
            case ENDINPUT:
            case '/':
            case error:
            case VERDE:
            case MARRON:
            case PARA:
            case IGUALES:
            case AZUL:
            case FLOAT:
            case CUENTA:
            case AMARILLO:
            case BLANCO:
            case NEGRO:
            case MAYORQUE:
                return 947;
        }
        return yyr156();
    }

    private int yys431() {
        switch (yytok) {
            case BOOLEAN:
            case '(':
            case INTEGER:
            case GRIS:
            case MENORQUE:
            case O:
            case Y:
            case '-':
            case ROJO:
            case CIAN:
            case '=':
            case '*':
            case '+':
            case ENDINPUT:
            case '/':
            case error:
            case VERDE:
            case MARRON:
            case PARA:
            case IGUALES:
            case AZUL:
            case FLOAT:
            case CUENTA:
            case AMARILLO:
            case BLANCO:
            case NEGRO:
            case MAYORQUE:
                return 947;
        }
        return yyr147();
    }

    private int yys432() {
        switch (yytok) {
            case AMARILLO:
            case Y:
            case PARA:
            case BOOLEAN:
            case MENORQUE:
            case O:
            case MARRON:
            case INTEGER:
            case GRIS:
            case CIAN:
            case '=':
            case '(':
            case error:
            case ENDINPUT:
            case BLANCO:
            case MAYORQUE:
            case VERDE:
            case NEGRO:
            case ROJO:
            case IGUALES:
            case AZUL:
            case FLOAT:
            case CUENTA:
                return 947;
            case '*':
                return 205;
            case '+':
                return 206;
            case '-':
                return 207;
            case '/':
                return 208;
        }
        return yyr155();
    }

    private int yys433() {
        switch (yytok) {
            case AMARILLO:
            case Y:
            case PARA:
            case BOOLEAN:
            case MENORQUE:
            case O:
            case MARRON:
            case INTEGER:
            case GRIS:
            case CIAN:
            case '=':
            case '(':
            case error:
            case ENDINPUT:
            case BLANCO:
            case MAYORQUE:
            case VERDE:
            case NEGRO:
            case ROJO:
            case IGUALES:
            case AZUL:
            case FLOAT:
            case CUENTA:
                return 947;
            case '*':
                return 209;
            case '+':
                return 210;
            case '-':
                return 211;
            case '/':
                return 212;
        }
        return yyr154();
    }

    private int yys434() {
        switch (yytok) {
            case COS:
                return 39;
            case DIVISION:
                return 41;
            case RAIZCUADRADA:
                return 67;
            case RC:
                return 68;
            case SEN:
                return 76;
            case SENO:
                return 77;
            case FLOAT:
                return 89;
            case IDENTIFIER:
                return 90;
            case INTEGER:
                return 91;
            case '(':
                return 104;
            case AZAR:
                return 360;
            case DIFERENCIA:
                return 361;
            case ELEGIR:
                return 362;
            case ELEMENTO:
                return 363;
            case MENOS:
                return 364;
            case POTENCIA:
                return 365;
            case PRIMERO:
                return 366;
            case PRODUCTO:
                return 367;
            case SUMA:
                return 368;
            case UL:
                return 369;
            case ULTIMO:
                return 370;
        }
        return 947;
    }

    private int yys435() {
        switch (yytok) {
            case AMARILLO:
            case Y:
            case PARA:
            case BOOLEAN:
            case MENORQUE:
            case O:
            case MARRON:
            case INTEGER:
            case GRIS:
            case CIAN:
            case '=':
            case '(':
            case error:
            case ENDINPUT:
            case BLANCO:
            case MAYORQUE:
            case VERDE:
            case NEGRO:
            case ROJO:
            case IGUALES:
            case AZUL:
            case FLOAT:
            case CUENTA:
                return 947;
            case '*':
                return 209;
            case '+':
                return 210;
            case '-':
                return 211;
            case '/':
                return 212;
        }
        return yyr146();
    }

    private int yys436() {
        switch (yytok) {
            case REDONDEA:
                return 70;
            case RESTO:
                return 72;
            case INTEGER:
                return 91;
            case IDENTIFIER:
                return 110;
            case '(':
                return 111;
            case AZAR:
                return 252;
            case DIFERENCIA:
                return 253;
            case ELEGIR:
                return 254;
            case ELEMENTO:
                return 255;
            case MENOS:
                return 256;
            case POTENCIA:
                return 257;
            case PRIMERO:
                return 258;
            case PRODUCTO:
                return 259;
            case SUMA:
                return 260;
            case UL:
                return 261;
            case ULTIMO:
                return 262;
        }
        return 947;
    }

    private int yys437() {
        switch (yytok) {
            case FLOAT:
            case '>':
            case VERDE:
            case CIAN:
            case '/':
            case O:
            case '*':
            case Y:
            case PARA:
            case AZUL:
            case AMARILLO:
            case '<':
            case '(':
            case '-':
            case '=':
            case '+':
            case ')':
            case error:
            case MARRON:
            case '[':
            case CUENTA:
            case GRIS:
            case ROJO:
            case IGUALES:
            case BOOLEAN:
            case INTEGER:
            case BLANCO:
            case NEGRO:
            case MENORQUE:
            case MAYORQUE:
            case ENDINPUT:
                return 947;
        }
        return yyr198();
    }

    private int yys438() {
        switch (yytok) {
            case AZAR:
                return 34;
            case COS:
                return 39;
            case DIFERENCIA:
                return 40;
            case DIVISION:
                return 41;
            case ELEGIR:
                return 43;
            case ELEMENTO:
                return 44;
            case MENOS:
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
        }
        return 947;
    }

    private int yys439() {
        switch (yytok) {
            case FLOAT:
            case '>':
            case VERDE:
            case CIAN:
            case '/':
            case O:
            case '*':
            case Y:
            case PARA:
            case AZUL:
            case AMARILLO:
            case '<':
            case '(':
            case '-':
            case '=':
            case '+':
            case ')':
            case error:
            case MARRON:
            case '[':
            case CUENTA:
            case GRIS:
            case ROJO:
            case IGUALES:
            case BOOLEAN:
            case INTEGER:
            case BLANCO:
            case NEGRO:
            case MENORQUE:
            case MAYORQUE:
            case ENDINPUT:
                return 947;
        }
        return yyr199();
    }

    private int yys448() {
        switch (yytok) {
            case COS:
                return 39;
            case DIVISION:
                return 41;
            case RAIZCUADRADA:
                return 67;
            case RC:
                return 68;
            case SEN:
                return 76;
            case SENO:
                return 77;
            case FLOAT:
                return 89;
            case IDENTIFIER:
                return 164;
            case '(':
                return 221;
            case AZAR:
                return 360;
            case DIFERENCIA:
                return 361;
            case ELEGIR:
                return 362;
            case ELEMENTO:
                return 363;
            case MENOS:
                return 364;
            case POTENCIA:
                return 365;
            case PRIMERO:
                return 366;
            case PRODUCTO:
                return 367;
            case SUMA:
                return 368;
            case UL:
                return 369;
            case ULTIMO:
                return 370;
        }
        return 947;
    }

    private int yys452() {
        switch (yytok) {
            case AZAR:
                return 34;
            case COS:
                return 39;
            case DIFERENCIA:
                return 40;
            case DIVISION:
                return 41;
            case ELEGIR:
                return 43;
            case ELEMENTO:
                return 44;
            case MENOS:
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
        }
        return 947;
    }

    private int yys453() {
        switch (yytok) {
            case AZAR:
                return 34;
            case COS:
                return 39;
            case DIFERENCIA:
                return 40;
            case DIVISION:
                return 41;
            case ELEGIR:
                return 43;
            case ELEMENTO:
                return 44;
            case MENOS:
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
            case FLOAT:
                return 89;
            case INTEGER:
                return 91;
            case BOOLEAN:
                return 190;
            case IDENTIFIER:
                return 191;
            case IGUALES:
                return 192;
            case MAYORQUE:
                return 193;
            case MENORQUE:
                return 194;
            case O:
                return 195;
            case Y:
                return 196;
            case '(':
                return 197;
        }
        return 947;
    }

    private int yys454() {
        switch (yytok) {
            case AZAR:
                return 34;
            case COS:
                return 39;
            case DIFERENCIA:
                return 40;
            case DIVISION:
                return 41;
            case ELEGIR:
                return 43;
            case ELEMENTO:
                return 44;
            case MENOS:
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
            case FLOAT:
                return 89;
            case INTEGER:
                return 91;
            case BOOLEAN:
                return 190;
            case IDENTIFIER:
                return 191;
            case IGUALES:
                return 192;
            case MAYORQUE:
                return 193;
            case MENORQUE:
                return 194;
            case O:
                return 195;
            case Y:
                return 196;
            case '(':
                return 197;
        }
        return 947;
    }

    private int yys455() {
        switch (yytok) {
            case AZAR:
                return 34;
            case COS:
                return 39;
            case DIFERENCIA:
                return 40;
            case DIVISION:
                return 41;
            case ELEGIR:
                return 43;
            case ELEMENTO:
                return 44;
            case MENOS:
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
        }
        return 947;
    }

    private int yys456() {
        switch (yytok) {
            case AZAR:
                return 34;
            case COS:
                return 39;
            case DIFERENCIA:
                return 40;
            case DIVISION:
                return 41;
            case ELEGIR:
                return 43;
            case ELEMENTO:
                return 44;
            case MENOS:
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
        }
        return 947;
    }

    private int yys457() {
        switch (yytok) {
            case BOOLEAN:
            case '(':
            case INTEGER:
            case GRIS:
            case MENORQUE:
            case O:
            case Y:
            case '-':
            case ROJO:
            case CIAN:
            case '=':
            case '*':
            case '+':
            case ENDINPUT:
            case '/':
            case error:
            case VERDE:
            case MARRON:
            case PARA:
            case IGUALES:
            case AZUL:
            case FLOAT:
            case CUENTA:
            case AMARILLO:
            case BLANCO:
            case NEGRO:
            case MAYORQUE:
                return 947;
        }
        return yyr162();
    }

    private int yys458() {
        switch (yytok) {
            case FLOAT:
            case '>':
            case VERDE:
            case CIAN:
            case '/':
            case O:
            case '*':
            case Y:
            case PARA:
            case AZUL:
            case AMARILLO:
            case '<':
            case '(':
            case '-':
            case '=':
            case '+':
            case ')':
            case error:
            case MARRON:
            case '[':
            case CUENTA:
            case GRIS:
            case ROJO:
            case IGUALES:
            case BOOLEAN:
            case INTEGER:
            case BLANCO:
            case NEGRO:
            case MENORQUE:
            case MAYORQUE:
            case ENDINPUT:
                return 947;
        }
        return yyr142();
    }

    private int yys459() {
        switch (yytok) {
            case BOOLEAN:
            case '(':
            case INTEGER:
            case GRIS:
            case MENORQUE:
            case O:
            case Y:
            case '-':
            case ROJO:
            case CIAN:
            case '=':
            case '*':
            case '+':
            case ENDINPUT:
            case '/':
            case error:
            case VERDE:
            case MARRON:
            case PARA:
            case IGUALES:
            case AZUL:
            case FLOAT:
            case CUENTA:
            case AMARILLO:
            case BLANCO:
            case NEGRO:
            case MAYORQUE:
                return 947;
        }
        return yyr158();
    }

    private int yys460() {
        switch (yytok) {
            case BOOLEAN:
            case '(':
            case INTEGER:
            case GRIS:
            case MENORQUE:
            case O:
            case Y:
            case '-':
            case ROJO:
            case CIAN:
            case '=':
            case '*':
            case '+':
            case ENDINPUT:
            case '/':
            case error:
            case VERDE:
            case MARRON:
            case PARA:
            case IGUALES:
            case AZUL:
            case FLOAT:
            case CUENTA:
            case AMARILLO:
            case BLANCO:
            case NEGRO:
            case MAYORQUE:
                return 947;
        }
        return yyr148();
    }

    private int yys461() {
        switch (yytok) {
            case BOOLEAN:
            case '(':
            case INTEGER:
            case GRIS:
            case MENORQUE:
            case O:
            case Y:
            case '-':
            case ROJO:
            case CIAN:
            case '=':
            case '*':
            case '+':
            case ENDINPUT:
            case '/':
            case error:
            case VERDE:
            case MARRON:
            case PARA:
            case IGUALES:
            case AZUL:
            case FLOAT:
            case CUENTA:
            case AMARILLO:
            case BLANCO:
            case NEGRO:
            case MAYORQUE:
                return 947;
        }
        return yyr150();
    }

    private int yyr1() { // program_end : program
        { parsingDone(); }
        yysv[yysp-=1] = yyrv;
        return 1;
    }

    private int yyr71() { // color : BLANCO
        { yyrv = arguments.stringArg("blanco"); }
        yysv[yysp-=1] = yyrv;
        return yypcolor();
    }

    private int yyr72() { // color : AZUL
        { yyrv = arguments.stringArg("azul"); }
        yysv[yysp-=1] = yyrv;
        return yypcolor();
    }

    private int yyr73() { // color : MARRON
        { yyrv = arguments.stringArg("marron"); }
        yysv[yysp-=1] = yyrv;
        return yypcolor();
    }

    private int yyr74() { // color : CIAN
        { yyrv = arguments.stringArg("cian"); }
        yysv[yysp-=1] = yyrv;
        return yypcolor();
    }

    private int yyr75() { // color : GRIS
        { yyrv = arguments.stringArg("gris"); }
        yysv[yysp-=1] = yyrv;
        return yypcolor();
    }

    private int yyr76() { // color : AMARILLO
        { yyrv = arguments.stringArg("amarillo"); }
        yysv[yysp-=1] = yyrv;
        return yypcolor();
    }

    private int yyr77() { // color : NEGRO
        { yyrv = arguments.stringArg("negro"); }
        yysv[yysp-=1] = yyrv;
        return yypcolor();
    }

    private int yyr78() { // color : ROJO
        { yyrv = arguments.stringArg("rojo"); }
        yysv[yysp-=1] = yyrv;
        return yypcolor();
    }

    private int yyr79() { // color : VERDE
        { yyrv = arguments.stringArg("verde"); }
        yysv[yysp-=1] = yyrv;
        return yypcolor();
    }

    private int yypcolor() {
        switch (yyst[yysp-1]) {
            case 57: return 131;
            default: return 141;
        }
    }

    private int yyr64() { // declaration_expr : VAR IDENTIFIER
        { yyrv = instr("var", InstructionType.VARIABLE, ReturnType.VOID, arguments.stringArg(((String)yysv[yysp-1])));}
        yysv[yysp-=2] = yyrv;
        return 2;
    }

    private int yyr65() { // declaration_expr : VAR IDENTIFIER '=' number_argument
        { yyrv = instr("var", InstructionType.VARIABLE, ReturnType.VOID, arguments.stringArg(((String)yysv[yysp-3])), ((String)yysv[yysp-1]));}
        yysv[yysp-=4] = yyrv;
        return 2;
    }

    private int yyr66() { // declaration_expr : VAR IDENTIFIER '=' instr_arg
        { yyrv = instr("var", InstructionType.VARIABLE, ReturnType.VOID, arguments.stringArg(((String)yysv[yysp-3])), ((String)yysv[yysp-1]));}
        yysv[yysp-=4] = yyrv;
        return 2;
    }

    private int yyr67() { // declaration_expr : VAR IDENTIFIER '=' BOOLEAN
        { yyrv = instr("var", InstructionType.VARIABLE, ReturnType.VOID, arguments.stringArg(((String)yysv[yysp-3])), arguments.boolArg(((Boolean)yysv[yysp-1]))); }
        yysv[yysp-=4] = yyrv;
        return 2;
    }

    private int yyr195() { // exec_instr : expression exec_instr
        { instrList.add(0, ((String)yysv[yysp-2])); }
        yysv[yysp-=2] = yyrv;
        return yypexec_instr();
    }

    private int yyr196() { // exec_instr : expression
        { instrList.add(0, ((String)yysv[yysp-1])); }
        yysv[yysp-=1] = yyrv;
        return yypexec_instr();
    }

    private int yypexec_instr() {
        switch (yyst[yysp-1]) {
            case 107: return 226;
            default: return 322;
        }
    }

    private int yyr6() { // expression : declaration_expr
        yysp -= 1;
        return yypexpression();
    }

    private int yyr7() { // expression : redeclaration_expr
        yysp -= 1;
        return yypexpression();
    }

    private int yyr8() { // expression : proc
        yysp -= 1;
        return yypexpression();
    }

    private int yyr9() { // expression : proc1
        yysp -= 1;
        return yypexpression();
    }

    private int yyr10() { // expression : val_proc1
        yysp -= 1;
        return yypexpression();
    }

    private int yyr11() { // expression : proc2
        yysp -= 1;
        return yypexpression();
    }

    private int yyr12() { // expression : val_proc2
        yysp -= 1;
        return yypexpression();
    }

    private int yyr13() { // expression : val_proc_n
        yysp -= 1;
        return yypexpression();
    }

    private int yyr14() { // expression : proc_p
        yysp -= 1;
        return yypexpression();
    }

    private int yyr15() { // expression : val_proc_p
        yysp -= 1;
        return yypexpression();
    }

    private int yyr16() { // expression : val_proc_1p
        yysp -= 1;
        return yypexpression();
    }

    private int yyr17() { // expression : proc_loop
        yysp -= 1;
        return yypexpression();
    }

    private int yyr18() { // expression : proc_cond
        yysp -= 1;
        return yypexpression();
    }

    private int yyr19() { // expression : user_proc_call
        yysp -= 1;
        return yypexpression();
    }

    private int yyr20() { // expression : proc_exec
        yysp -= 1;
        return yypexpression();
    }

    private int yypexpression() {
        switch (yyst[yysp-1]) {
            case 227: return 227;
            case 107: return 227;
            case 85: return 3;
            case 84: return 3;
            case 0: return 3;
            default: return 242;
        }
    }

    private int yyr28() { // float_expr : float_expr '+' float_expr
        { yyrv = numeric_expr(((String)yysv[yysp-3]), ((String)yysv[yysp-1]), "+"); }
        yysv[yysp-=3] = yyrv;
        return yypfloat_expr();
    }

    private int yyr29() { // float_expr : float_expr '-' float_expr
        { yyrv = numeric_expr(((String)yysv[yysp-3]), ((String)yysv[yysp-1]), "-"); }
        yysv[yysp-=3] = yyrv;
        return yypfloat_expr();
    }

    private int yyr30() { // float_expr : float_expr '*' float_expr
        { yyrv = numeric_expr(((String)yysv[yysp-3]), ((String)yysv[yysp-1]), "*"); }
        yysv[yysp-=3] = yyrv;
        return yypfloat_expr();
    }

    private int yyr31() { // float_expr : float_expr '/' float_expr
        { yyrv = numeric_expr(((String)yysv[yysp-3]), ((String)yysv[yysp-1]), "/"); }
        yysv[yysp-=3] = yyrv;
        return yypfloat_expr();
    }

    private int yyr32() { // float_expr : '(' float_expr ')'
        { yyrv = ((String)yysv[yysp-2]); }
        yysv[yysp-=3] = yyrv;
        return yypfloat_expr();
    }

    private int yyr33() { // float_expr : IDENTIFIER
        { yyrv = arguments.varArg(((String)yysv[yysp-1])); }
        yysv[yysp-=1] = yyrv;
        return yypfloat_expr();
    }

    private int yyr34() { // float_expr : FLOAT
        { yyrv = arguments.floatArg(((Float)yysv[yysp-1])); }
        yysv[yysp-=1] = yyrv;
        return yypfloat_expr();
    }

    private int yypfloat_expr() {
        switch (yyst[yysp-1]) {
            case 448: return 213;
            case 447: return 100;
            case 434: return 213;
            case 429: return 100;
            case 428: return 100;
            case 427: return 100;
            case 426: return 213;
            case 425: return 267;
            case 424: return 213;
            case 422: return 100;
            case 421: return 213;
            case 408: return 213;
            case 373: return 432;
            case 368: return 100;
            case 367: return 100;
            case 365: return 151;
            case 364: return 127;
            case 361: return 100;
            case 360: return 95;
            case 290: return 213;
            case 269: return 213;
            case 266: return 213;
            case 245: return 122;
            case 230: return 100;
            case 224: return 213;
            case 221: return 213;
            case 208: return 307;
            case 207: return 306;
            case 206: return 305;
            case 205: return 304;
            case 201: return 100;
            case 200: return 100;
            case 197: return 295;
            case 174: return 213;
            case 172: return 213;
            case 170: return 213;
            case 168: return 213;
            case 165: return 213;
            case 162: return 213;
            case 160: return 213;
            case 158: return 213;
            case 154: return 100;
            case 153: return 213;
            case 152: return 267;
            case 151: return 264;
            case 150: return 213;
            case 146: return 213;
            case 144: return 213;
            case 129: return 213;
            case 123: return 122;
            case 122: return 122;
            case 121: return 213;
            case 119: return 213;
            case 117: return 213;
            case 115: return 213;
            case 113: return 213;
            case 108: return 100;
            case 106: return 213;
            case 104: return 213;
            case 100: return 100;
            case 99: return 213;
            case 97: return 213;
            case 94: return 213;
            case 92: return 213;
            case 80: return 100;
            case 70: return 163;
            case 66: return 100;
            case 64: return 151;
            case 53: return 127;
            case 50: return 122;
            case 40: return 100;
            case 34: return 95;
            default: return 86;
        }
    }

    private int yyr59() { // float_instr_argument : float_proc1
        yysp -= 1;
        return yypfloat_instr_argument();
    }

    private int yyr60() { // float_instr_argument : float_proc2
        yysp -= 1;
        return yypfloat_instr_argument();
    }

    private int yyr61() { // float_instr_argument : float_proc_n
        yysp -= 1;
        return yypfloat_instr_argument();
    }

    private int yyr62() { // float_instr_argument : float_proc_p
        yysp -= 1;
        return yypfloat_instr_argument();
    }

    private int yyr63() { // float_instr_argument : float_proc_1p
        yysp -= 1;
        return yypfloat_instr_argument();
    }

    private int yypfloat_instr_argument() {
        switch (yyst[yysp-1]) {
            case 448: return 371;
            case 434: return 449;
            case 426: return 270;
            case 424: return 240;
            case 421: return 217;
            case 269: return 371;
            case 266: return 359;
            case 153: return 270;
            case 129: return 240;
            case 97: return 217;
            default: return 175;
        }
    }

    private int yyr125() { // float_proc1 : AZAR float_expr
        { yyrv = instr("azar", InstructionType.NORMAL, ReturnType.FLOAT, ((String)yysv[yysp-1])); }
        yysv[yysp-=2] = yyrv;
        return yypfloat_proc1();
    }

    private int yyr126() { // float_proc1 : MENOS float_expr
        { yyrv = instr("menos", InstructionType.NORMAL, ReturnType.FLOAT, ((String)yysv[yysp-1])); }
        yysv[yysp-=2] = yyrv;
        return yypfloat_proc1();
    }

    private int yyr127() { // float_proc1 : COS number_argument
        { yyrv = instr("cos", InstructionType.NORMAL, ReturnType.FLOAT, ((String)yysv[yysp-1])); }
        yysv[yysp-=2] = yyrv;
        return yypfloat_proc1();
    }

    private int yyr128() { // float_proc1 : RAIZCUADRADA number_argument
        { yyrv = instr("raiz", InstructionType.NORMAL, ReturnType.FLOAT, ((String)yysv[yysp-1])); }
        yysv[yysp-=2] = yyrv;
        return yypfloat_proc1();
    }

    private int yyr129() { // float_proc1 : RC number_argument
        { yyrv = instr("raiz", InstructionType.NORMAL, ReturnType.FLOAT, ((String)yysv[yysp-1])); }
        yysv[yysp-=2] = yyrv;
        return yypfloat_proc1();
    }

    private int yyr130() { // float_proc1 : SENO number_argument
        { yyrv = instr("seno", InstructionType.NORMAL, ReturnType.FLOAT, ((String)yysv[yysp-1])); }
        yysv[yysp-=2] = yyrv;
        return yypfloat_proc1();
    }

    private int yyr131() { // float_proc1 : SEN number_argument
        { yyrv = instr("seno", InstructionType.NORMAL, ReturnType.FLOAT, ((String)yysv[yysp-1])); }
        yysv[yysp-=2] = yyrv;
        return yypfloat_proc1();
    }

    private int yyr132() { // float_proc1 : AZAR '(' float_instr_argument ')'
        { yyrv = instr("azar", InstructionType.NORMAL, ReturnType.FLOAT, ((String)yysv[yysp-2])); }
        yysv[yysp-=4] = yyrv;
        return yypfloat_proc1();
    }

    private int yyr133() { // float_proc1 : MENOS '(' float_instr_argument ')'
        { yyrv = instr("menos", InstructionType.NORMAL, ReturnType.FLOAT, ((String)yysv[yysp-2])); }
        yysv[yysp-=4] = yyrv;
        return yypfloat_proc1();
    }

    private int yyr134() { // float_proc1 : COS '(' instr_arg ')'
        { yyrv = instr("cos", InstructionType.NORMAL, ReturnType.FLOAT, ((String)yysv[yysp-2])); }
        yysv[yysp-=4] = yyrv;
        return yypfloat_proc1();
    }

    private int yyr135() { // float_proc1 : RAIZCUADRADA '(' instr_arg ')'
        { yyrv = instr("raiz", InstructionType.NORMAL, ReturnType.FLOAT, ((String)yysv[yysp-2])); }
        yysv[yysp-=4] = yyrv;
        return yypfloat_proc1();
    }

    private int yyr136() { // float_proc1 : RC '(' instr_arg ')'
        { yyrv = instr("raiz", InstructionType.NORMAL, ReturnType.FLOAT, ((String)yysv[yysp-2])); }
        yysv[yysp-=4] = yyrv;
        return yypfloat_proc1();
    }

    private int yyr137() { // float_proc1 : SENO '(' instr_arg ')'
        { yyrv = instr("seno", InstructionType.NORMAL, ReturnType.FLOAT, ((String)yysv[yysp-2])); }
        yysv[yysp-=4] = yyrv;
        return yypfloat_proc1();
    }

    private int yyr138() { // float_proc1 : SEN '(' instr_arg ')'
        { yyrv = instr("seno", InstructionType.NORMAL, ReturnType.FLOAT, ((String)yysv[yysp-2])); }
        yysv[yysp-=4] = yyrv;
        return yypfloat_proc1();
    }

    private int yypfloat_proc1() {
        switch (yyst[yysp-1]) {
            case 288: return 4;
            case 278: return 4;
            case 244: return 4;
            case 242: return 4;
            case 227: return 4;
            case 130: return 4;
            case 107: return 4;
            case 85: return 4;
            case 84: return 4;
            case 0: return 4;
            default: return 176;
        }
    }

    private int yyr151() { // float_proc2 : POTENCIA float_expr float_expr
        { yyrv = instr("potencia", InstructionType.NORMAL, ReturnType.FLOAT, ((String)yysv[yysp-2]), ((String)yysv[yysp-1])); }
        yysv[yysp-=3] = yyrv;
        return yypfloat_proc2();
    }

    private int yyr152() { // float_proc2 : POTENCIA integer_expr float_expr
        { yyrv = instr("potencia", InstructionType.NORMAL, ReturnType.FLOAT, ((String)yysv[yysp-2]), ((String)yysv[yysp-1])); }
        yysv[yysp-=3] = yyrv;
        return yypfloat_proc2();
    }

    private int yyr153() { // float_proc2 : POTENCIA float_expr integer_expr
        { yyrv = instr("potencia", InstructionType.NORMAL, ReturnType.FLOAT, ((String)yysv[yysp-2]), ((String)yysv[yysp-1])); }
        yysv[yysp-=3] = yyrv;
        return yypfloat_proc2();
    }

    private int yyr154() { // float_proc2 : POTENCIA '(' float_instr_argument ')' integer_expr
        { yyrv = instr("potencia", InstructionType.NORMAL, ReturnType.FLOAT, ((String)yysv[yysp-3]), ((String)yysv[yysp-1])); }
        yysv[yysp-=5] = yyrv;
        return yypfloat_proc2();
    }

    private int yyr155() { // float_proc2 : POTENCIA '(' float_instr_argument ')' float_expr
        { yyrv = instr("potencia", InstructionType.NORMAL, ReturnType.FLOAT, ((String)yysv[yysp-3]), ((String)yysv[yysp-1])); }
        yysv[yysp-=5] = yyrv;
        return yypfloat_proc2();
    }

    private int yyr156() { // float_proc2 : POTENCIA integer_expr '(' float_instr_argument ')'
        { yyrv = instr("potencia", InstructionType.NORMAL, ReturnType.FLOAT, ((String)yysv[yysp-4]), ((String)yysv[yysp-2])); }
        yysv[yysp-=5] = yyrv;
        return yypfloat_proc2();
    }

    private int yyr157() { // float_proc2 : POTENCIA float_expr '(' float_instr_argument ')'
        { yyrv = instr("potencia", InstructionType.NORMAL, ReturnType.FLOAT, ((String)yysv[yysp-4]), ((String)yysv[yysp-2])); }
        yysv[yysp-=5] = yyrv;
        return yypfloat_proc2();
    }

    private int yyr158() { // float_proc2 : POTENCIA '(' float_instr_argument ')' '(' float_instr_argument ')'
        { yyrv = instr("potencia", InstructionType.NORMAL, ReturnType.FLOAT, ((String)yysv[yysp-5]), ((String)yysv[yysp-2])); }
        yysv[yysp-=7] = yyrv;
        return yypfloat_proc2();
    }

    private int yyr159() { // float_proc2 : DIVISION number_argument number_argument
        { yyrv = instr("division", InstructionType.NORMAL, ReturnType.FLOAT, ((String)yysv[yysp-2]), ((String)yysv[yysp-1])); }
        yysv[yysp-=3] = yyrv;
        return yypfloat_proc2();
    }

    private int yyr160() { // float_proc2 : DIVISION '(' instr_arg ')' number_argument
        { yyrv = instr("division", InstructionType.NORMAL, ReturnType.FLOAT, ((String)yysv[yysp-3]), ((String)yysv[yysp-1])); }
        yysv[yysp-=5] = yyrv;
        return yypfloat_proc2();
    }

    private int yyr161() { // float_proc2 : DIVISION number_argument '(' instr_arg ')'
        { yyrv = instr("division", InstructionType.NORMAL, ReturnType.FLOAT, ((String)yysv[yysp-4]), ((String)yysv[yysp-2])); }
        yysv[yysp-=5] = yyrv;
        return yypfloat_proc2();
    }

    private int yyr162() { // float_proc2 : DIVISION '(' instr_arg ')' '(' instr_arg ')'
        { yyrv = instr("division", InstructionType.NORMAL, ReturnType.FLOAT, ((String)yysv[yysp-5]), ((String)yysv[yysp-2])); }
        yysv[yysp-=7] = yyrv;
        return yypfloat_proc2();
    }

    private int yypfloat_proc2() {
        switch (yyst[yysp-1]) {
            case 288: return 5;
            case 278: return 5;
            case 244: return 5;
            case 242: return 5;
            case 227: return 5;
            case 130: return 5;
            case 107: return 5;
            case 85: return 5;
            case 84: return 5;
            case 0: return 5;
            default: return 177;
        }
    }

    private int yyr194() { // float_proc_1p : ELEMENTO integer_expr '[' n_float_args ']'
        {
        var args = new ArrayList<String>();
        args.add(((String)yysv[yysp-4]));
        yyrv = instr("elemento", InstructionType.NORMAL, ReturnType.FLOAT, args, paramsList); paramsList.clear(); }
        yysv[yysp-=5] = yyrv;
        switch (yyst[yysp-1]) {
            case 288: return 6;
            case 278: return 6;
            case 244: return 6;
            case 242: return 6;
            case 227: return 6;
            case 130: return 6;
            case 107: return 6;
            case 85: return 6;
            case 84: return 6;
            case 0: return 6;
            default: return 178;
        }
    }

    private int yyr174() { // float_proc_n : DIFERENCIA n_float_args
        { yyrv = instr("diferencia", InstructionType.NORMAL, ReturnType.FLOAT, paramsList); paramsList.clear(); }
        yysv[yysp-=2] = yyrv;
        return yypfloat_proc_n();
    }

    private int yyr175() { // float_proc_n : PRODUCTO n_float_args
        { yyrv = instr("producto", InstructionType.NORMAL, ReturnType.FLOAT, paramsList); paramsList.clear(); }
        yysv[yysp-=2] = yyrv;
        return yypfloat_proc_n();
    }

    private int yyr176() { // float_proc_n : SUMA n_float_args
        { yyrv = instr("suma", InstructionType.NORMAL, ReturnType.FLOAT, paramsList); paramsList.clear(); }
        yysv[yysp-=2] = yyrv;
        return yypfloat_proc_n();
    }

    private int yypfloat_proc_n() {
        switch (yyst[yysp-1]) {
            case 288: return 7;
            case 278: return 7;
            case 244: return 7;
            case 242: return 7;
            case 227: return 7;
            case 130: return 7;
            case 107: return 7;
            case 85: return 7;
            case 84: return 7;
            case 0: return 7;
            default: return 179;
        }
    }

    private int yyr187() { // float_proc_p : ELEGIR '[' n_float_args ']'
        { yyrv = instr("elegir", InstructionType.NORMAL, ReturnType.FLOAT, paramsList); paramsList.clear(); }
        yysv[yysp-=4] = yyrv;
        return yypfloat_proc_p();
    }

    private int yyr188() { // float_proc_p : ULTIMO '[' n_float_args ']'
        { yyrv = instr("ultimo", InstructionType.NORMAL, ReturnType.FLOAT, paramsList); paramsList.clear(); }
        yysv[yysp-=4] = yyrv;
        return yypfloat_proc_p();
    }

    private int yyr189() { // float_proc_p : UL '[' n_float_args ']'
        { yyrv = instr("ultimo", InstructionType.NORMAL, ReturnType.FLOAT, paramsList); paramsList.clear(); }
        yysv[yysp-=4] = yyrv;
        return yypfloat_proc_p();
    }

    private int yyr190() { // float_proc_p : PRIMERO '[' n_float_args ']'
        { yyrv = instr("primero", InstructionType.NORMAL, ReturnType.FLOAT, paramsList); paramsList.clear(); }
        yysv[yysp-=4] = yyrv;
        return yypfloat_proc_p();
    }

    private int yypfloat_proc_p() {
        switch (yyst[yysp-1]) {
            case 288: return 8;
            case 278: return 8;
            case 244: return 8;
            case 242: return 8;
            case 227: return 8;
            case 130: return 8;
            case 107: return 8;
            case 85: return 8;
            case 84: return 8;
            case 0: return 8;
            default: return 180;
        }
    }

    private int yyr52() { // instr_arg : int_instr_argument
        { yyrv = arguments.instrArg(((String)yysv[yysp-1])); }
        yysv[yysp-=1] = yyrv;
        return yypinstr_arg();
    }

    private int yyr53() { // instr_arg : float_instr_argument
        { yyrv = arguments.instrArg(((String)yysv[yysp-1])); }
        yysv[yysp-=1] = yyrv;
        return yypinstr_arg();
    }

    private int yypinstr_arg() {
        switch (yyst[yysp-1]) {
            case 456: return 466;
            case 455: return 465;
            case 452: return 462;
            case 438: return 451;
            case 408: return 445;
            case 303: return 403;
            case 290: return 392;
            case 285: return 387;
            case 284: return 386;
            case 239: return 334;
            case 224: return 319;
            case 197: return 296;
            case 174: return 283;
            case 172: return 282;
            case 170: return 281;
            case 168: return 280;
            case 165: return 277;
            case 162: return 276;
            case 160: return 275;
            case 158: return 274;
            case 150: return 263;
            case 146: return 248;
            case 144: return 247;
            case 121: return 235;
            case 119: return 234;
            case 117: return 233;
            case 115: return 232;
            case 113: return 231;
            case 106: return 225;
            case 99: return 219;
            case 94: return 216;
            case 92: return 214;
            default: return 181;
        }
    }

    private int yyr54() { // int_instr_argument : int_proc1
        yysp -= 1;
        return yypint_instr_argument();
    }

    private int yyr55() { // int_instr_argument : int_proc2
        yysp -= 1;
        return yypint_instr_argument();
    }

    private int yyr56() { // int_instr_argument : int_proc_n
        yysp -= 1;
        return yypint_instr_argument();
    }

    private int yyr57() { // int_instr_argument : int_proc_p
        yysp -= 1;
        return yypint_instr_argument();
    }

    private int yyr58() { // int_instr_argument : int_proc_1p
        yysp -= 1;
        return yypint_instr_argument();
    }

    private int yypint_instr_argument() {
        switch (yyst[yysp-1]) {
            case 436: return 450;
            case 419: return 372;
            case 417: return 446;
            case 354: return 271;
            case 352: return 241;
            case 349: return 218;
            case 269: return 372;
            case 250: return 347;
            case 153: return 271;
            case 148: return 251;
            case 129: return 241;
            case 97: return 218;
            default: return 182;
        }
    }

    private int yyr119() { // int_proc1 : REDONDEA float_expr
        { yyrv = instr("redondea", InstructionType.NORMAL, ReturnType.INTEGER, ((String)yysv[yysp-1])); }
        yysv[yysp-=2] = yyrv;
        return yypint_proc1();
    }

    private int yyr120() { // int_proc1 : AZAR integer_expr
        { yyrv = instr("azar", InstructionType.NORMAL, ReturnType.INTEGER, ((String)yysv[yysp-1])); }
        yysv[yysp-=2] = yyrv;
        return yypint_proc1();
    }

    private int yyr121() { // int_proc1 : MENOS integer_expr
        { yyrv = instr("menos", InstructionType.NORMAL, ReturnType.INTEGER, ((String)yysv[yysp-1])); }
        yysv[yysp-=2] = yyrv;
        return yypint_proc1();
    }

    private int yyr122() { // int_proc1 : REDONDEA '(' instr_arg ')'
        { yyrv = instr("redondea", InstructionType.NORMAL, ReturnType.INTEGER, ((String)yysv[yysp-2])); }
        yysv[yysp-=4] = yyrv;
        return yypint_proc1();
    }

    private int yyr123() { // int_proc1 : AZAR '(' int_instr_argument ')'
        { yyrv = instr("azar", InstructionType.NORMAL, ReturnType.INTEGER, ((String)yysv[yysp-2])); }
        yysv[yysp-=4] = yyrv;
        return yypint_proc1();
    }

    private int yyr124() { // int_proc1 : MENOS '(' int_instr_argument ')'
        { yyrv = instr("menos", InstructionType.NORMAL, ReturnType.INTEGER, ((String)yysv[yysp-2])); }
        yysv[yysp-=4] = yyrv;
        return yypint_proc1();
    }

    private int yypint_proc1() {
        switch (yyst[yysp-1]) {
            case 288: return 9;
            case 278: return 9;
            case 244: return 9;
            case 242: return 9;
            case 227: return 9;
            case 130: return 9;
            case 107: return 9;
            case 85: return 9;
            case 84: return 9;
            case 0: return 9;
            default: return 183;
        }
    }

    private int yyr145() { // int_proc2 : POTENCIA integer_expr integer_expr
        { yyrv = instr("potencia", InstructionType.NORMAL, ReturnType.INTEGER, ((String)yysv[yysp-2]), ((String)yysv[yysp-1])); }
        yysv[yysp-=3] = yyrv;
        return yypint_proc2();
    }

    private int yyr146() { // int_proc2 : POTENCIA '(' int_instr_argument ')' integer_expr
        { yyrv = instr("potencia", InstructionType.NORMAL, ReturnType.INTEGER, ((String)yysv[yysp-3]), ((String)yysv[yysp-1])); }
        yysv[yysp-=5] = yyrv;
        return yypint_proc2();
    }

    private int yyr147() { // int_proc2 : POTENCIA integer_expr '(' int_instr_argument ')'
        { yyrv = instr("potencia", InstructionType.NORMAL, ReturnType.INTEGER, ((String)yysv[yysp-4]), ((String)yysv[yysp-2])); }
        yysv[yysp-=5] = yyrv;
        return yypint_proc2();
    }

    private int yyr148() { // int_proc2 : POTENCIA '(' int_instr_argument ')' '(' int_instr_argument ')'
        { yyrv = instr("potencia", InstructionType.NORMAL, ReturnType.INTEGER, ((String)yysv[yysp-5]), ((String)yysv[yysp-2])); }
        yysv[yysp-=7] = yyrv;
        return yypint_proc2();
    }

    private int yyr149() { // int_proc2 : RESTO number_argument number_argument
        { yyrv = instr("resto", InstructionType.NORMAL, ReturnType.INTEGER, ((String)yysv[yysp-2]), ((String)yysv[yysp-1])); }
        yysv[yysp-=3] = yyrv;
        return yypint_proc2();
    }

    private int yyr150() { // int_proc2 : RESTO '(' instr_arg ')' '(' instr_arg ')'
        { yyrv = instr("resto", InstructionType.NORMAL, ReturnType.INTEGER, ((String)yysv[yysp-5]), ((String)yysv[yysp-2])); }
        yysv[yysp-=7] = yyrv;
        return yypint_proc2();
    }

    private int yypint_proc2() {
        switch (yyst[yysp-1]) {
            case 288: return 10;
            case 278: return 10;
            case 244: return 10;
            case 242: return 10;
            case 227: return 10;
            case 130: return 10;
            case 107: return 10;
            case 85: return 10;
            case 84: return 10;
            case 0: return 10;
            default: return 184;
        }
    }

    private int yyr193() { // int_proc_1p : ELEMENTO integer_expr '[' n_int_args ']'
        {
        var args = new ArrayList<String>();
        args.add(((String)yysv[yysp-4]));
        yyrv = instr("elemento", InstructionType.NORMAL, ReturnType.INTEGER, args, paramsList); paramsList.clear(); }
        yysv[yysp-=5] = yyrv;
        switch (yyst[yysp-1]) {
            case 288: return 11;
            case 278: return 11;
            case 244: return 11;
            case 242: return 11;
            case 227: return 11;
            case 130: return 11;
            case 107: return 11;
            case 85: return 11;
            case 84: return 11;
            case 0: return 11;
            default: return 185;
        }
    }

    private int yyr171() { // int_proc_n : DIFERENCIA n_int_args
        { yyrv = instr("diferencia", InstructionType.NORMAL, ReturnType.INTEGER, paramsList); paramsList.clear(); }
        yysv[yysp-=2] = yyrv;
        return yypint_proc_n();
    }

    private int yyr172() { // int_proc_n : PRODUCTO n_int_args
        { yyrv = instr("producto", InstructionType.NORMAL, ReturnType.INTEGER, paramsList); paramsList.clear(); }
        yysv[yysp-=2] = yyrv;
        return yypint_proc_n();
    }

    private int yyr173() { // int_proc_n : SUMA n_int_args
        { yyrv = instr("suma", InstructionType.NORMAL, ReturnType.INTEGER, paramsList); paramsList.clear(); }
        yysv[yysp-=2] = yyrv;
        return yypint_proc_n();
    }

    private int yypint_proc_n() {
        switch (yyst[yysp-1]) {
            case 288: return 12;
            case 278: return 12;
            case 244: return 12;
            case 242: return 12;
            case 227: return 12;
            case 130: return 12;
            case 107: return 12;
            case 85: return 12;
            case 84: return 12;
            case 0: return 12;
            default: return 186;
        }
    }

    private int yyr183() { // int_proc_p : ELEGIR '[' n_int_args ']'
        { yyrv = instr("elegir", InstructionType.NORMAL, ReturnType.INTEGER, paramsList); paramsList.clear(); }
        yysv[yysp-=4] = yyrv;
        return yypint_proc_p();
    }

    private int yyr184() { // int_proc_p : ULTIMO '[' n_int_args ']'
        { yyrv = instr("ultimo", InstructionType.NORMAL, ReturnType.INTEGER, paramsList); paramsList.clear(); }
        yysv[yysp-=4] = yyrv;
        return yypint_proc_p();
    }

    private int yyr185() { // int_proc_p : UL '[' n_int_args ']'
        { yyrv = instr("ultimo", InstructionType.NORMAL, ReturnType.INTEGER, paramsList); paramsList.clear(); }
        yysv[yysp-=4] = yyrv;
        return yypint_proc_p();
    }

    private int yyr186() { // int_proc_p : PRIMERO '[' n_int_args ']'
        { yyrv = instr("primero", InstructionType.NORMAL, ReturnType.INTEGER, paramsList); paramsList.clear(); }
        yysv[yysp-=4] = yyrv;
        return yypint_proc_p();
    }

    private int yypint_proc_p() {
        switch (yyst[yysp-1]) {
            case 288: return 13;
            case 278: return 13;
            case 244: return 13;
            case 242: return 13;
            case 227: return 13;
            case 130: return 13;
            case 107: return 13;
            case 85: return 13;
            case 84: return 13;
            case 0: return 13;
            default: return 187;
        }
    }

    private int yyr21() { // integer_expr : integer_expr '+' integer_expr
        { yyrv = numeric_expr(((String)yysv[yysp-3]), ((String)yysv[yysp-1]), "+"); }
        yysv[yysp-=3] = yyrv;
        return yypinteger_expr();
    }

    private int yyr22() { // integer_expr : integer_expr '-' integer_expr
        { yyrv = numeric_expr(((String)yysv[yysp-3]), ((String)yysv[yysp-1]), "-"); }
        yysv[yysp-=3] = yyrv;
        return yypinteger_expr();
    }

    private int yyr23() { // integer_expr : integer_expr '*' integer_expr
        { yyrv = numeric_expr(((String)yysv[yysp-3]), ((String)yysv[yysp-1]), "*"); }
        yysv[yysp-=3] = yyrv;
        return yypinteger_expr();
    }

    private int yyr24() { // integer_expr : integer_expr '/' integer_expr
        { yyrv = numeric_expr(((String)yysv[yysp-3]), ((String)yysv[yysp-1]), "/"); }
        yysv[yysp-=3] = yyrv;
        return yypinteger_expr();
    }

    private int yyr25() { // integer_expr : '(' integer_expr ')'
        { yyrv = ((String)yysv[yysp-2]); }
        yysv[yysp-=3] = yyrv;
        return yypinteger_expr();
    }

    private int yyr26() { // integer_expr : IDENTIFIER
        { yyrv = arguments.varArg(((String)yysv[yysp-1])); }
        yysv[yysp-=1] = yyrv;
        return yypinteger_expr();
    }

    private int yyr27() { // integer_expr : INTEGER
        { yyrv = arguments.intArg(((Integer)yysv[yysp-1])); }
        yysv[yysp-=1] = yyrv;
        return yypinteger_expr();
    }

    private int yypinteger_expr() {
        switch (yyst[yysp-1]) {
            case 454: return 87;
            case 453: return 87;
            case 418: return 101;
            case 374: return 435;
            case 373: return 433;
            case 365: return 425;
            case 363: return 423;
            case 357: return 101;
            case 356: return 101;
            case 355: return 101;
            case 353: return 268;
            case 350: return 101;
            case 348: return 416;
            case 320: return 87;
            case 303: return 87;
            case 294: return 87;
            case 293: return 87;
            case 292: return 87;
            case 291: return 87;
            case 289: return 87;
            case 287: return 87;
            case 286: return 87;
            case 260: return 101;
            case 259: return 101;
            case 257: return 353;
            case 256: return 128;
            case 255: return 351;
            case 253: return 101;
            case 252: return 96;
            case 246: return 344;
            case 245: return 123;
            case 239: return 87;
            case 238: return 332;
            case 230: return 101;
            case 212: return 311;
            case 211: return 310;
            case 210: return 309;
            case 209: return 308;
            case 201: return 101;
            case 200: return 101;
            case 197: return 297;
            case 194: return 87;
            case 193: return 87;
            case 192: return 87;
            case 167: return 87;
            case 154: return 101;
            case 152: return 268;
            case 151: return 265;
            case 147: return 249;
            case 142: return 246;
            case 123: return 123;
            case 122: return 123;
            case 108: return 101;
            case 105: return 87;
            case 101: return 101;
            case 80: return 101;
            case 78: return 87;
            case 77: return 87;
            case 76: return 87;
            case 73: return 87;
            case 72: return 87;
            case 71: return 166;
            case 69: return 87;
            case 68: return 87;
            case 67: return 87;
            case 66: return 101;
            case 64: return 152;
            case 63: return 87;
            case 62: return 147;
            case 61: return 87;
            case 60: return 87;
            case 53: return 128;
            case 50: return 123;
            case 49: return 87;
            case 48: return 87;
            case 47: return 87;
            case 46: return 87;
            case 45: return 87;
            case 44: return 109;
            case 41: return 87;
            case 40: return 101;
            case 39: return 87;
            case 34: return 96;
            case 33: return 87;
            case 32: return 87;
            default: return 215;
        }
    }

    private int yyr204() { // n_args : integer_expr n_args
        { paramsList.add(0, ((String)yysv[yysp-2])); }
        yysv[yysp-=2] = yyrv;
        return yypn_args();
    }

    private int yyr205() { // n_args : float_expr n_args
        { paramsList.add(0, ((String)yysv[yysp-2])); }
        yysv[yysp-=2] = yyrv;
        return yypn_args();
    }

    private int yyr206() { // n_args : integer_expr
        { paramsList.add(0, ((String)yysv[yysp-1])); }
        yysv[yysp-=1] = yyrv;
        return yypn_args();
    }

    private int yyr207() { // n_args : float_expr
        { paramsList.add(0, ((String)yysv[yysp-1])); }
        yysv[yysp-=1] = yyrv;
        return yypn_args();
    }

    private int yypn_args() {
        switch (yyst[yysp-1]) {
            case 123: return 237;
            case 122: return 236;
            default: return 124;
        }
    }

    private int yyr165() { // n_float_args : float_expr n_float_args
        { paramsList.add(0, ((String)yysv[yysp-2])); }
        yysv[yysp-=2] = yyrv;
        return yypn_float_args();
    }

    private int yyr166() { // n_float_args : float_expr
        { paramsList.add(0, ((String)yysv[yysp-1])); }
        yysv[yysp-=1] = yyrv;
        return yypn_float_args();
    }

    private int yypn_float_args() {
        switch (yyst[yysp-1]) {
            case 429: return 301;
            case 428: return 299;
            case 427: return 272;
            case 422: return 228;
            case 368: return 198;
            case 367: return 155;
            case 361: return 102;
            case 201: return 301;
            case 200: return 299;
            case 154: return 272;
            case 108: return 228;
            case 100: return 220;
            case 80: return 198;
            case 66: return 155;
            case 40: return 102;
            default: return 325;
        }
    }

    private int yyr167() { // n_instr : expression n_instr
        { instrList.add(0, ((String)yysv[yysp-2])); }
        yysv[yysp-=2] = yyrv;
        return yypn_instr();
    }

    private int yyr168() { // n_instr : expression
        { instrList.add(0, ((String)yysv[yysp-1])); }
        yysv[yysp-=1] = yyrv;
        return yypn_instr();
    }

    private int yypn_instr() {
        switch (yyst[yysp-1]) {
            case 278: return 381;
            case 244: return 341;
            case 242: return 339;
            case 130: return 243;
            default: return 390;
        }
    }

    private int yyr163() { // n_int_args : integer_expr n_int_args
        { paramsList.add(0, ((String)yysv[yysp-2])); }
        yysv[yysp-=2] = yyrv;
        return yypn_int_args();
    }

    private int yyr164() { // n_int_args : integer_expr
        { paramsList.add(0, ((String)yysv[yysp-1])); }
        yysv[yysp-=1] = yyrv;
        return yypn_int_args();
    }

    private int yypn_int_args() {
        switch (yyst[yysp-1]) {
            case 357: return 302;
            case 356: return 300;
            case 355: return 273;
            case 350: return 229;
            case 260: return 199;
            case 259: return 156;
            case 253: return 103;
            case 201: return 302;
            case 200: return 300;
            case 154: return 273;
            case 108: return 229;
            case 101: return 222;
            case 80: return 199;
            case 66: return 156;
            case 40: return 103;
            default: return 326;
        }
    }

    private int yyr200() { // n_params : IDENTIFIER n_params
        { paramsList.add(0, ((String)yysv[yysp-2])); }
        yysv[yysp-=2] = yyrv;
        return yypn_params();
    }

    private int yyr201() { // n_params : IDENTIFIER
        { paramsList.add(0, ((String)yysv[yysp-1])); }
        yysv[yysp-=1] = yyrv;
        return yypn_params();
    }

    private int yypn_params() {
        switch (yyst[yysp-1]) {
            case 130: return 244;
            default: return 342;
        }
    }

    private int yyr35() { // number_argument : integer_expr
        { yyrv = ((String)yysv[yysp-1]); }
        yysv[yysp-=1] = yyrv;
        return yypnumber_argument();
    }

    private int yyr36() { // number_argument : float_expr
        { yyrv = ((String)yysv[yysp-1]); }
        yysv[yysp-=1] = yyrv;
        return yypnumber_argument();
    }

    private int yypnumber_argument() {
        switch (yyst[yysp-1]) {
            case 320: return 407;
            case 303: return 404;
            case 292: return 394;
            case 291: return 393;
            case 289: return 391;
            case 287: return 389;
            case 286: return 388;
            case 239: return 335;
            case 194: return 292;
            case 193: return 291;
            case 192: return 289;
            case 167: return 279;
            case 105: return 223;
            case 77: return 173;
            case 76: return 171;
            case 73: return 169;
            case 72: return 167;
            case 69: return 161;
            case 68: return 159;
            case 67: return 157;
            case 63: return 149;
            case 61: return 145;
            case 60: return 143;
            case 49: return 120;
            case 48: return 118;
            case 47: return 116;
            case 46: return 114;
            case 45: return 112;
            case 41: return 105;
            case 39: return 98;
            case 33: return 93;
            case 32: return 88;
            default: return 188;
        }
    }

    private int yyr80() { // proc : OCULTATORTUGA
        { yyrv = instr("ocultatortuga", InstructionType.NORMAL, ReturnType.VOID); }
        yysv[yysp-=1] = yyrv;
        return 14;
    }

    private int yyr81() { // proc : OT
        { yyrv = instr("ocultatortuga", InstructionType.NORMAL, ReturnType.VOID); }
        yysv[yysp-=1] = yyrv;
        return 14;
    }

    private int yyr82() { // proc : APARECETORTUGA
        { yyrv = instr("aparecetoruga", InstructionType.NORMAL, ReturnType.VOID); }
        yysv[yysp-=1] = yyrv;
        return 14;
    }

    private int yyr83() { // proc : AT
        { yyrv = instr("aparecetoruga", InstructionType.NORMAL, ReturnType.VOID); }
        yysv[yysp-=1] = yyrv;
        return 14;
    }

    private int yyr84() { // proc : BAJALAPIZ
        { yyrv = instr("bajalapiz", InstructionType.NORMAL, ReturnType.VOID); }
        yysv[yysp-=1] = yyrv;
        return 14;
    }

    private int yyr85() { // proc : BL
        { yyrv = instr("bajalapiz", InstructionType.NORMAL, ReturnType.VOID); }
        yysv[yysp-=1] = yyrv;
        return 14;
    }

    private int yyr86() { // proc : SUBELAPIZ
        { yyrv = instr("subelapiz", InstructionType.NORMAL, ReturnType.VOID); }
        yysv[yysp-=1] = yyrv;
        return 14;
    }

    private int yyr87() { // proc : SB
        { yyrv = instr("subelapiz", InstructionType.NORMAL, ReturnType.VOID); }
        yysv[yysp-=1] = yyrv;
        return 14;
    }

    private int yyr88() { // proc : CENTRO
        { yyrv = instr("centro", InstructionType.NORMAL, ReturnType.VOID); }
        yysv[yysp-=1] = yyrv;
        return 14;
    }

    private int yyr89() { // proc : BORRAPANTALLA
        { yyrv = instr("borrapantalla", InstructionType.NORMAL, ReturnType.VOID); }
        yysv[yysp-=1] = yyrv;
        return 14;
    }

    private int yyr90() { // proc : RUMBO
        { yyrv = instr("print", InstructionType.NORMAL, ReturnType.VOID, arguments.varArg("rumbo")); }
        yysv[yysp-=1] = yyrv;
        return 14;
    }

    private int yyr91() { // proc1 : AVANZA number_argument
        { yyrv = instr("avanza", InstructionType.NORMAL, ReturnType.VOID, ((String)yysv[yysp-1])); }
        yysv[yysp-=2] = yyrv;
        return 15;
    }

    private int yyr92() { // proc1 : AV number_argument
        { yyrv = instr("avanza", InstructionType.NORMAL, ReturnType.VOID, ((String)yysv[yysp-1])); }
        yysv[yysp-=2] = yyrv;
        return 15;
    }

    private int yyr93() { // proc1 : RETROCEDE number_argument
        { yyrv = instr("retrocede", InstructionType.NORMAL, ReturnType.VOID, ((String)yysv[yysp-1])); }
        yysv[yysp-=2] = yyrv;
        return 15;
    }

    private int yyr94() { // proc1 : RE number_argument
        { yyrv = instr("retrocede", InstructionType.NORMAL, ReturnType.VOID, ((String)yysv[yysp-1])); }
        yysv[yysp-=2] = yyrv;
        return 15;
    }

    private int yyr95() { // proc1 : GIRADERECHA number_argument
        { yyrv = instr("giraderecha", InstructionType.NORMAL, ReturnType.VOID, ((String)yysv[yysp-1])); }
        yysv[yysp-=2] = yyrv;
        return 15;
    }

    private int yyr96() { // proc1 : GD number_argument
        { yyrv = instr("giraderecha", InstructionType.NORMAL, ReturnType.VOID, ((String)yysv[yysp-1])); }
        yysv[yysp-=2] = yyrv;
        return 15;
    }

    private int yyr97() { // proc1 : GIRAIZQUIERDA number_argument
        { yyrv = instr("giraizquierda", InstructionType.NORMAL, ReturnType.VOID, ((String)yysv[yysp-1])); }
        yysv[yysp-=2] = yyrv;
        return 15;
    }

    private int yyr98() { // proc1 : GI number_argument
        { yyrv = instr("giraizquierda", InstructionType.NORMAL, ReturnType.VOID, ((String)yysv[yysp-1])); }
        yysv[yysp-=2] = yyrv;
        return 15;
    }

    private int yyr99() { // proc1 : PONRUMBO number_argument
        { yyrv = instr("ponrumbo", InstructionType.NORMAL, ReturnType.VOID, ((String)yysv[yysp-1])); }
        yysv[yysp-=2] = yyrv;
        return 15;
    }

    private int yyr100() { // proc1 : PONX number_argument
        { yyrv = instr("ponx", InstructionType.NORMAL, ReturnType.VOID, ((String)yysv[yysp-1])); }
        yysv[yysp-=2] = yyrv;
        return 15;
    }

    private int yyr101() { // proc1 : PONY number_argument
        { yyrv = instr("pony", InstructionType.NORMAL, ReturnType.VOID, ((String)yysv[yysp-1])); }
        yysv[yysp-=2] = yyrv;
        return 15;
    }

    private int yyr102() { // proc1 : PONCOLORLAPIZ color
        { yyrv = instr("poncl", InstructionType.NORMAL, ReturnType.VOID, ((String)yysv[yysp-1])); }
        yysv[yysp-=2] = yyrv;
        return 15;
    }

    private int yyr103() { // proc1 : PONCL color
        { yyrv = instr("poncl", InstructionType.NORMAL, ReturnType.VOID, ((String)yysv[yysp-1])); }
        yysv[yysp-=2] = yyrv;
        return 15;
    }

    private int yyr104() { // proc1 : ESPERA number_argument
        { yyrv = instr("espera", InstructionType.NORMAL, ReturnType.VOID, ((String)yysv[yysp-1])); }
        yysv[yysp-=2] = yyrv;
        return 15;
    }

    private int yyr105() { // proc1 : ESPERA '(' instr_arg ')'
        { yyrv = instr("espera", InstructionType.NORMAL, ReturnType.VOID, ((String)yysv[yysp-2])); }
        yysv[yysp-=4] = yyrv;
        return 15;
    }

    private int yyr106() { // proc1 : AVANZA '(' instr_arg ')'
        { yyrv = instr("avanza", InstructionType.NORMAL, ReturnType.VOID, ((String)yysv[yysp-2])); }
        yysv[yysp-=4] = yyrv;
        return 15;
    }

    private int yyr107() { // proc1 : AV '(' instr_arg ')'
        { yyrv = instr("avanza", InstructionType.NORMAL, ReturnType.VOID, ((String)yysv[yysp-2])); }
        yysv[yysp-=4] = yyrv;
        return 15;
    }

    private int yyr108() { // proc1 : RETROCEDE '(' instr_arg ')'
        { yyrv = instr("retrocede", InstructionType.NORMAL, ReturnType.VOID, ((String)yysv[yysp-2])); }
        yysv[yysp-=4] = yyrv;
        return 15;
    }

    private int yyr109() { // proc1 : RE '(' instr_arg ')'
        { yyrv = instr("retrocede", InstructionType.NORMAL, ReturnType.VOID, ((String)yysv[yysp-2])); }
        yysv[yysp-=4] = yyrv;
        return 15;
    }

    private int yyr110() { // proc1 : GIRADERECHA '(' instr_arg ')'
        { yyrv = instr("giraderecha", InstructionType.NORMAL, ReturnType.VOID, ((String)yysv[yysp-2])); }
        yysv[yysp-=4] = yyrv;
        return 15;
    }

    private int yyr111() { // proc1 : GD '(' instr_arg ')'
        { yyrv = instr("giraderecha", InstructionType.NORMAL, ReturnType.VOID, ((String)yysv[yysp-2])); }
        yysv[yysp-=4] = yyrv;
        return 15;
    }

    private int yyr112() { // proc1 : GIRAIZQUIERDA '(' instr_arg ')'
        { yyrv = instr("giraizquierda", InstructionType.NORMAL, ReturnType.VOID, ((String)yysv[yysp-2])); }
        yysv[yysp-=4] = yyrv;
        return 15;
    }

    private int yyr113() { // proc1 : GI '(' instr_arg ')'
        { yyrv = instr("giraizquierda", InstructionType.NORMAL, ReturnType.VOID, ((String)yysv[yysp-2])); }
        yysv[yysp-=4] = yyrv;
        return 15;
    }

    private int yyr114() { // proc1 : PONRUMBO '(' instr_arg ')'
        { yyrv = instr("ponrumbo", InstructionType.NORMAL, ReturnType.VOID, ((String)yysv[yysp-2])); }
        yysv[yysp-=4] = yyrv;
        return 15;
    }

    private int yyr115() { // proc1 : PONX '(' instr_arg ')'
        { yyrv = instr("ponx", InstructionType.NORMAL, ReturnType.VOID, ((String)yysv[yysp-2])); }
        yysv[yysp-=4] = yyrv;
        return 15;
    }

    private int yyr116() { // proc1 : PONY '(' instr_arg ')'
        { yyrv = instr("pony", InstructionType.NORMAL, ReturnType.VOID, ((String)yysv[yysp-2])); }
        yysv[yysp-=4] = yyrv;
        return 15;
    }

    private int yyr139() { // proc2 : PONXY integer_expr integer_expr
        { yyrv = instr("ponxy", InstructionType.NORMAL, ReturnType.VOID, ((String)yysv[yysp-2]), ((String)yysv[yysp-1])); }
        yysv[yysp-=3] = yyrv;
        return 16;
    }

    private int yyr140() { // proc2 : PONXY integer_expr '(' int_instr_argument ')'
        { yyrv = instr("ponxy", InstructionType.NORMAL, ReturnType.VOID, ((String)yysv[yysp-4]), ((String)yysv[yysp-2])); }
        yysv[yysp-=5] = yyrv;
        return 16;
    }

    private int yyr141() { // proc2 : PONXY '(' int_instr_argument ')' integer_expr
        { yyrv = instr("ponxy", InstructionType.NORMAL, ReturnType.VOID, ((String)yysv[yysp-3]), ((String)yysv[yysp-1])); }
        yysv[yysp-=5] = yyrv;
        return 16;
    }

    private int yyr142() { // proc2 : PONXY '(' int_instr_argument ')' '(' int_instr_argument ')'
        { yyrv = instr("ponxy", InstructionType.NORMAL, ReturnType.VOID, ((String)yysv[yysp-5]), ((String)yysv[yysp-2])); }
        yysv[yysp-=7] = yyrv;
        return 16;
    }

    private int yyr199() { // proc_cond : SI boolean_expr '[' n_instr ']'
        {
        paramsList.add(0, ((String)yysv[yysp-4]));
        //instrList = reverse(instrList);
        yyrv = instr("si", InstructionType.CONDITION, ReturnType.VOID, paramsList, instrList);
        paramsList.clear();
        instrList.clear();
    }
        yysv[yysp-=5] = yyrv;
        return 17;
    }

    private int yyr197() { // proc_exec : EJECUTA '[' exec_instr ']'
        { yyrv = instr("ejecuta", InstructionType.NORMAL, ReturnType.VOID, null, instrList); instrList.clear(); }
        yysv[yysp-=4] = yyrv;
        return 18;
    }

    private int yyr198() { // proc_loop : REPITE integer_expr '[' n_instr ']'
        {
        paramsList.add(0, ((String)yysv[yysp-4]));
        //instrList = reverse(instrList);
        yyrv = instr("repite", InstructionType.CYCLE, ReturnType.VOID, paramsList, instrList);
        paramsList.clear();
        instrList.clear();
    }
        yysv[yysp-=5] = yyrv;
        return 19;
    }

    private int yyr177() { // proc_p : INC '[' IDENTIFIER ']'
        { yyrv = instr("inc", InstructionType.VARIABLE, ReturnType.VOID, arguments.stringArg(((String)yysv[yysp-2])), arguments.intArg(1)); }
        yysv[yysp-=4] = yyrv;
        return 20;
    }

    private int yyr178() { // proc_p : INC '[' IDENTIFIER integer_expr ']'
        { yyrv = instr("inc", InstructionType.VARIABLE, ReturnType.VOID, arguments.stringArg(((String)yysv[yysp-3])), ((String)yysv[yysp-2])); }
        yysv[yysp-=5] = yyrv;
        return 20;
    }

    private int yyr179() { // proc_p : INC '[' IDENTIFIER integer_expr ']'
        { yyrv = instr("inc", InstructionType.VARIABLE, ReturnType.VOID, arguments.stringArg(((String)yysv[yysp-3])), ((String)yysv[yysp-2])); }
        yysv[yysp-=5] = yyrv;
        return 20;
    }

    private int yyr180() { // proc_p : PONPOS '[' integer_expr integer_expr ']'
        { yyrv = instr("ponpos", InstructionType.NORMAL, ReturnType.VOID, ((String)yysv[yysp-3]), ((String)yysv[yysp-2])); }
        yysv[yysp-=5] = yyrv;
        return 20;
    }

    private int yyr2() { // program : expression ';' program
        { instructions.add(((String)yysv[yysp-3])); }
        yysv[yysp-=3] = yyrv;
        return yypprogram();
    }

    private int yyr3() { // program : user_proc ';' program
        yysp -= 3;
        return yypprogram();
    }

    private int yyr4() { // program : expression ';'
        { instructions.add(((String)yysv[yysp-2])); }
        yysv[yysp-=2] = yyrv;
        return yypprogram();
    }

    private int yyr5() { // program : user_proc ';'
        yysp -= 2;
        return yypprogram();
    }

    private int yypprogram() {
        switch (yyst[yysp-1]) {
            case 84: return 203;
            case 0: return 21;
            default: return 204;
        }
    }

    private int yyr37() { // boolean_expr : number_argument '<' number_argument
        { yyrv = instr("<", InstructionType.LOGIC, ReturnType.BOOLEAN, ((String)yysv[yysp-3]), ((String)yysv[yysp-1])); }
        yysv[yysp-=3] = yyrv;
        return yypboolean_expr();
    }

    private int yyr38() { // boolean_expr : number_argument '>' number_argument
        { yyrv = instr(">", InstructionType.LOGIC, ReturnType.BOOLEAN, ((String)yysv[yysp-3]), ((String)yysv[yysp-1])); }
        yysv[yysp-=3] = yyrv;
        return yypboolean_expr();
    }

    private int yyr39() { // boolean_expr : '(' instr_arg ')' '<' '(' instr_arg ')'
        { yyrv = instr("<", InstructionType.LOGIC, ReturnType.BOOLEAN, ((String)yysv[yysp-6]), ((String)yysv[yysp-2])); }
        yysv[yysp-=7] = yyrv;
        return yypboolean_expr();
    }

    private int yyr40() { // boolean_expr : '(' instr_arg ')' '>' '(' instr_arg ')'
        { yyrv = instr(">", InstructionType.LOGIC, ReturnType.BOOLEAN, ((String)yysv[yysp-6]), ((String)yysv[yysp-2])); }
        yysv[yysp-=7] = yyrv;
        return yypboolean_expr();
    }

    private int yyr41() { // boolean_expr : instr_arg '<' instr_arg
        { yyrv = instr("<", InstructionType.LOGIC, ReturnType.BOOLEAN, ((String)yysv[yysp-3]), ((String)yysv[yysp-1])); }
        yysv[yysp-=3] = yyrv;
        return yypboolean_expr();
    }

    private int yyr42() { // boolean_expr : instr_arg '>' instr_arg
        { yyrv = instr(">", InstructionType.LOGIC, ReturnType.BOOLEAN, ((String)yysv[yysp-3]), ((String)yysv[yysp-1])); }
        yysv[yysp-=3] = yyrv;
        return yypboolean_expr();
    }

    private int yyr43() { // boolean_expr : IGUALES number_argument number_argument
        { yyrv = instr("iguales", InstructionType.LOGIC, ReturnType.BOOLEAN, ((String)yysv[yysp-2]), ((String)yysv[yysp-1])); }
        yysv[yysp-=3] = yyrv;
        return yypboolean_expr();
    }

    private int yyr44() { // boolean_expr : IGUALES '(' instr_arg ')' '(' instr_arg ')'
        { yyrv = instr("iguales", InstructionType.LOGIC, ReturnType.BOOLEAN, ((String)yysv[yysp-5]), ((String)yysv[yysp-2])); }
        yysv[yysp-=7] = yyrv;
        return yypboolean_expr();
    }

    private int yyr45() { // boolean_expr : Y '(' boolean_expr ')' '(' boolean_expr ')'
        { yyrv = instr("y", InstructionType.LOGIC, ReturnType.BOOLEAN, ((String)yysv[yysp-5]), ((String)yysv[yysp-2])); }
        yysv[yysp-=7] = yyrv;
        return yypboolean_expr();
    }

    private int yyr46() { // boolean_expr : O '(' boolean_expr ')' '(' boolean_expr ')'
        { yyrv = instr("o", InstructionType.LOGIC, ReturnType.BOOLEAN, ((String)yysv[yysp-5]), ((String)yysv[yysp-2])); }
        yysv[yysp-=7] = yyrv;
        return yypboolean_expr();
    }

    private int yyr47() { // boolean_expr : MAYORQUE number_argument number_argument
        { yyrv = instr("mayorque", InstructionType.LOGIC, ReturnType.BOOLEAN, ((String)yysv[yysp-2]), ((String)yysv[yysp-1])); }
        yysv[yysp-=3] = yyrv;
        return yypboolean_expr();
    }

    private int yyr48() { // boolean_expr : MENORQUE number_argument number_argument
        { yyrv = instr("menorque", InstructionType.LOGIC, ReturnType.BOOLEAN, ((String)yysv[yysp-2]), ((String)yysv[yysp-1])); }
        yysv[yysp-=3] = yyrv;
        return yypboolean_expr();
    }

    private int yyr49() { // boolean_expr : '(' boolean_expr ')'
        { yyrv = ((String)yysv[yysp-2]); }
        yysv[yysp-=3] = yyrv;
        return yypboolean_expr();
    }

    private int yyr50() { // boolean_expr : IDENTIFIER
        { yyrv = arguments.varArg(((String)yysv[yysp-1])); }
        yysv[yysp-=1] = yyrv;
        return yypboolean_expr();
    }

    private int yyr51() { // boolean_expr : BOOLEAN
        { yyrv = arguments.boolArg(((Boolean)yysv[yysp-1])); }
        yysv[yysp-=1] = yyrv;
        return yypboolean_expr();
    }

    private int yypboolean_expr() {
        switch (yyst[yysp-1]) {
            case 453: return 463;
            case 294: return 396;
            case 293: return 395;
            case 197: return 298;
            case 78: return 189;
            default: return 464;
        }
    }

    private int yyr68() { // redeclaration_expr : INIC IDENTIFIER '=' number_argument
        { yyrv = instr("inic", InstructionType.VARIABLE, ReturnType.VOID, arguments.stringArg(((String)yysv[yysp-3])), ((String)yysv[yysp-1])); }
        yysv[yysp-=4] = yyrv;
        return 22;
    }

    private int yyr69() { // redeclaration_expr : INIC IDENTIFIER '=' instr_arg
        { yyrv = instr("inic", InstructionType.VARIABLE, ReturnType.VOID, arguments.stringArg(((String)yysv[yysp-3])), ((String)yysv[yysp-1])); }
        yysv[yysp-=4] = yyrv;
        return 22;
    }

    private int yyr70() { // redeclaration_expr : INIC IDENTIFIER '=' BOOLEAN
        { yyrv = instr("inic", InstructionType.VARIABLE, ReturnType.VOID, arguments.stringArg(((String)yysv[yysp-3])), arguments.boolArg(((Boolean)yysv[yysp-1]))); }
        yysv[yysp-=4] = yyrv;
        return 22;
    }

    private int yyr202() { // user_proc : PARA IDENTIFIER n_params n_instr FIN
        {
        //instrList = reverse(instrList);
        procedures.add(((String)yysv[yysp-4]), paramsList, instrList);
        paramsList.clear();
        instrList.clear();
    }
        yysv[yysp-=5] = yyrv;
        return 23;
    }

    private int yyr203() { // user_proc : PARA IDENTIFIER n_instr FIN
        {
        //instrList = reverse(instrList);
        procedures.add(((String)yysv[yysp-3]), instrList);
        instrList.clear();
    }
        yysv[yysp-=4] = yyrv;
        return 23;
    }

    private int yyr208() { // user_proc_call : IDENTIFIER n_args
        { yyrv = instr(((String)yysv[yysp-2]), InstructionType.PROCEDURE, ReturnType.VOID, paramsList); paramsList.clear(); }
        yysv[yysp-=2] = yyrv;
        return 24;
    }

    private int yyr209() { // user_proc_call : IDENTIFIER
        { yyrv = instr(((String)yysv[yysp-1]), InstructionType.PROCEDURE, ReturnType.VOID); }
        yysv[yysp-=1] = yyrv;
        return 24;
    }

    private int yyr117() { // val_proc1 : int_proc1
        yysp -= 1;
        return 25;
    }

    private int yyr118() { // val_proc1 : float_proc1
        yysp -= 1;
        return 25;
    }

    private int yyr143() { // val_proc2 : int_proc2
        yysp -= 1;
        return 26;
    }

    private int yyr144() { // val_proc2 : float_proc2
        yysp -= 1;
        return 26;
    }

    private int yyr191() { // val_proc_1p : int_proc_1p
        yysp -= 1;
        return 27;
    }

    private int yyr192() { // val_proc_1p : float_proc_1p
        yysp -= 1;
        return 27;
    }

    private int yyr169() { // val_proc_n : int_proc_n
        yysp -= 1;
        return 28;
    }

    private int yyr170() { // val_proc_n : float_proc_n
        yysp -= 1;
        return 28;
    }

    private int yyr181() { // val_proc_p : int_proc_p
        yysp -= 1;
        return 29;
    }

    private int yyr182() { // val_proc_p : float_proc_p
        yysp -= 1;
        return 29;
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
    
    private MessageHandler msgHandler; //Para mostrar mensajes de compilación

    public void d(String msg) {
        System.out.println(msg);
        msgHandler.add(msg, MessageType.INFO);
    }

    public String numeric_expr(String arg1, String arg2, String operation) {
        ArgType type1 = arguments.getArgType(arg1);
        ArgType type2 = arguments.getArgType(arg2);

        if (isNumeric(type1) && isNumeric(type2)) { //Simplificar
            if (type1 == ArgType.FLOAT_CONSTANT || type2 == ArgType.FLOAT_CONSTANT) { //Valor flontante
                Float fval1 = arguments.getFloatArg(arg1);
                Float fval2 = arguments.getFloatArg(arg2);
                Float fresult = null;
                switch (operation) {
                    case "+" -> fresult = (fval1 + fval2);
                    case "-" -> fresult = (fval1 - fval2);
                    case "*" -> fresult = (fval1 * fval2);
                    case "/" -> fresult = (fval1 / fval2);
                }
                return arguments.floatArg(fresult);

            } else { //Valor entero
                Integer val1 = arguments.getIntArg(arg1);
                Integer val2 = arguments.getIntArg(arg2);
                Integer result = null;

                switch (operation) {
                    case "+" -> result = (val1 + val2);
                    case "-" -> result = (val1 - val2);
                    case "*" -> result = (val1 * val2);
                    case "/" -> result = (val1 / val2);
                }
                return arguments.intArg(result);

            }
        } else { //Convertir a expresión
            if (type1 == ArgType.FLOAT_CONSTANT || type2 == ArgType.FLOAT_CONSTANT) {
                return instr(operation, InstructionType.OPERATION, ReturnType.FLOAT, arg1, arg2);
            } else {
                return instr(operation, InstructionType.OPERATION, ReturnType.INTEGER, arg1, arg2);
            }
        }
    }

    public boolean isNumeric(ArgType type) {
        return (type == ArgType.INT_CONSTANT || type == ArgType.FLOAT_CONSTANT);
    }

    public String instr(String name, InstructionType type, ReturnType returnType, String... args) {
      //  return instructions.create(name, type, returnType, new ArrayList<>(Arrays.asList(args)));
        return instr(name, type, returnType, new ArrayList<String>(Arrays.asList(args)), null);
    }

    public String instr(String name, InstructionType type, ReturnType returnType, ArrayList<String> args) {
        //return instructions.create(name, type, returnType, args);
        return instr(name, type, returnType, args, null);
    }

    public String instr(String name, InstructionType type, ReturnType returnType, ArrayList<String> args, ArrayList<String> body) {
        return instructions.create(name, type, returnType, args, body, lexer.getLine()+1);
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
            msgHandler.add(lexer.getErrorMessage(), MessageType.ERROR);
            return;
        }

        System.err.println(msg);
        msgHandler.add(msg, MessageType.ERROR);

        String onLine = "En " + lexer.getSemantic() + ", línea " + (lexer.getLine() + 1) + ". columna " + (lexer.getColumn() + 1);
        System.out.println(onLine);
        msgHandler.add(onLine, MessageType.ERROR);
    }

    public Parser(String ruta) {
        variables = new VariableHandler();
        procedures = new ProcedureHandler();
        instructions = new InstructionHandler();
        arguments = new ArgumentHandler();

        paramsList = new ArrayList<>();
        instrList = new ArrayList<>();
        msgHandler = MessageHandler.getInstance();

        try {
            Reader reader = new BufferedReader(new FileReader(ruta));
            lexer = new Lexer(reader);
            lexer.getNextToken();

        } catch (IOException ex) {
            yyerror("No se pudo abrir el archivo especificado");
            msgHandler.add("No se pudo abrir el archivo especificado", MessageType.ERROR);
        }
    }

    /**
     * Función para mostrar un mensaje del compilador en la interfaz.
     */
    public void showMessage(String msg, MessageType type) {
        //TODO: mostrar mensaje del tipo correspondiente en la interfaz.
    }

    public String getRutaCompilado(String filePath) {

        String rutaCompilado = filePath.substring(0, filePath.lastIndexOf(".") + 1) + "cld";
        System.out.println(rutaCompilado);

        ObjectMapper mapper = new ObjectMapper();
        //instructions.reverse();
        CompiledFile cFile = new CompiledFile(instructions, procedures);

        try {
            File file = new File(rutaCompilado);
            file.createNewFile();

            String compilado = mapper.writeValueAsString(cFile);
            System.out.println("File compiled created: " + file.getName());
            msgHandler.add("File compiled created: " + file.getName(), MessageType.INFO);
            FileWriter writer = new FileWriter(rutaCompilado);
            writer.write(compilado);
            writer.close();
            return rutaCompilado;

        } catch (IOException ex) {
            System.out.println("Occurió un error al compilar...");
            msgHandler.add("Occurió un error al compilar...", MessageType.ERROR);
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
        System.out.println("Compilación finalizada");
        msgHandler.add("Compilación finalizada con éxito.", MessageType.INFO);

        //TODO: notificar que se finalizó la compilación
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
