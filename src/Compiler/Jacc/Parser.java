// Output created by jacc on Wed Aug 05 13:58:54 CST 2020

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
        for (; ; ) {
            switch (yyn) {
                case 0:
                    yyst[yysp] = 0;
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 545:
                    yyn = yys0();
                    continue;

                case 1:
                    yyst[yysp] = 1;
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 546:
                    if (yytok == ENDINPUT) {
                        yyn = 1090;
                        continue;
                    }
                    yyn = 1093;
                    continue;

                case 2:
                    yyst[yysp] = 2;
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 547:
                    if (yytok == ';') {
                        yyn = yyr6();
                        continue;
                    }
                    yyn = 1093;
                    continue;

                case 3:
                    yyst[yysp] = 3;
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 548:
                    if (yytok == ';') {
                        yyn = 75;
                        continue;
                    }
                    yyn = 1093;
                    continue;

                case 4:
                    yyst[yysp] = 4;
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 549:
                    if (yytok == ';') {
                        yyn = yyr115();
                        continue;
                    }
                    yyn = 1093;
                    continue;

                case 5:
                    yyst[yysp] = 5;
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 550:
                    if (yytok == ';') {
                        yyn = yyr146();
                        continue;
                    }
                    yyn = 1093;
                    continue;

                case 6:
                    yyst[yysp] = 6;
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 551:
                    if (yytok == ';') {
                        yyn = yyr168();
                        continue;
                    }
                    yyn = 1093;
                    continue;

                case 7:
                    yyst[yysp] = 7;
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 552:
                    if (yytok == ';') {
                        yyn = yyr214();
                        continue;
                    }
                    yyn = 1093;
                    continue;

                case 8:
                    yyst[yysp] = 8;
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 553:
                    if (yytok == ';') {
                        yyn = yyr194();
                        continue;
                    }
                    yyn = 1093;
                    continue;

                case 9:
                    yyst[yysp] = 9;
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 554:
                    if (yytok == ';') {
                        yyn = yyr206();
                        continue;
                    }
                    yyn = 1093;
                    continue;

                case 10:
                    yyst[yysp] = 10;
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 555:
                    if (yytok == ';') {
                        yyn = yyr145();
                        continue;
                    }
                    yyn = 1093;
                    continue;

                case 11:
                    yyst[yysp] = 11;
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 556:
                    if (yytok == ';') {
                        yyn = yyr167();
                        continue;
                    }
                    yyn = 1093;
                    continue;

                case 12:
                    yyst[yysp] = 12;
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 557:
                    if (yytok == ';') {
                        yyn = yyr213();
                        continue;
                    }
                    yyn = 1093;
                    continue;

                case 13:
                    yyst[yysp] = 13;
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 558:
                    if (yytok == ';') {
                        yyn = yyr193();
                        continue;
                    }
                    yyn = 1093;
                    continue;

                case 14:
                    yyst[yysp] = 14;
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 559:
                    if (yytok == ';') {
                        yyn = yyr205();
                        continue;
                    }
                    yyn = 1093;
                    continue;

                case 15:
                    yyst[yysp] = 15;
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 560:
                    if (yytok == ';') {
                        yyn = yyr8();
                        continue;
                    }
                    yyn = 1093;
                    continue;

                case 16:
                    yyst[yysp] = 16;
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 561:
                    if (yytok == ';') {
                        yyn = yyr9();
                        continue;
                    }
                    yyn = 1093;
                    continue;

                case 17:
                    yyst[yysp] = 17;
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 562:
                    if (yytok == ';') {
                        yyn = yyr11();
                        continue;
                    }
                    yyn = 1093;
                    continue;

                case 18:
                    yyst[yysp] = 18;
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 563:
                    if (yytok == ';') {
                        yyn = yyr18();
                        continue;
                    }
                    yyn = 1093;
                    continue;

                case 19:
                    yyst[yysp] = 19;
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 564:
                    if (yytok == ';') {
                        yyn = yyr20();
                        continue;
                    }
                    yyn = 1093;
                    continue;

                case 20:
                    yyst[yysp] = 20;
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 565:
                    if (yytok == ';') {
                        yyn = yyr17();
                        continue;
                    }
                    yyn = 1093;
                    continue;

                case 21:
                    yyst[yysp] = 21;
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 566:
                    if (yytok == ';') {
                        yyn = yyr14();
                        continue;
                    }
                    yyn = 1093;
                    continue;

                case 22:
                    yyst[yysp] = 22;
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 567:
                    if (yytok == ENDINPUT) {
                        yyn = yyr1();
                        continue;
                    }
                    yyn = 1093;
                    continue;

                case 23:
                    yyst[yysp] = 23;
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 568:
                    if (yytok == ';') {
                        yyn = yyr7();
                        continue;
                    }
                    yyn = 1093;
                    continue;

                case 24:
                    yyst[yysp] = 24;
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 569:
                    if (yytok == ';') {
                        yyn = 76;
                        continue;
                    }
                    yyn = 1093;
                    continue;

                case 25:
                    yyst[yysp] = 25;
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 570:
                    if (yytok == ';') {
                        yyn = yyr19();
                        continue;
                    }
                    yyn = 1093;
                    continue;

                case 26:
                    yyst[yysp] = 26;
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 571:
                    if (yytok == ';') {
                        yyn = yyr10();
                        continue;
                    }
                    yyn = 1093;
                    continue;

                case 27:
                    yyst[yysp] = 27;
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 572:
                    if (yytok == ';') {
                        yyn = yyr12();
                        continue;
                    }
                    yyn = 1093;
                    continue;

                case 28:
                    yyst[yysp] = 28;
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 573:
                    if (yytok == ';') {
                        yyn = yyr16();
                        continue;
                    }
                    yyn = 1093;
                    continue;

                case 29:
                    yyst[yysp] = 29;
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 574:
                    if (yytok == ';') {
                        yyn = yyr13();
                        continue;
                    }
                    yyn = 1093;
                    continue;

                case 30:
                    yyst[yysp] = 30;
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 575:
                    if (yytok == ';') {
                        yyn = yyr15();
                        continue;
                    }
                    yyn = 1093;
                    continue;

                case 31:
                    yyst[yysp] = 31;
                    yysv[yysp] = (lexer.getSemantic()
                    );
                    yytok = (lexer.getNextToken()
                    );
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 576:
                    if (yytok == ';') {
                        yyn = yyr117();
                        continue;
                    }
                    yyn = 1093;
                    continue;

                case 32:
                    yyst[yysp] = 32;
                    yysv[yysp] = (lexer.getSemantic()
                    );
                    yytok = (lexer.getNextToken()
                    );
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 577:
                    switch (yytok) {
                        case FLOAT -> {
                            yyn = 80;
                            continue;
                        }
                        case IDENTIFIER -> {
                            yyn = 81;
                            continue;
                        }
                        case INTEGER -> {
                            yyn = 82;
                            continue;
                        }
                        case '(' -> {
                            yyn = 83;
                            continue;
                        }
                    }
                    yyn = 1093;
                    continue;

                case 33:
                    yyst[yysp] = 33;
                    yysv[yysp] = (lexer.getSemantic()
                    );
                    yytok = (lexer.getNextToken()
                    );
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 578:
                    switch (yytok) {
                        case FLOAT -> {
                            yyn = 80;
                            continue;
                        }
                        case IDENTIFIER -> {
                            yyn = 81;
                            continue;
                        }
                        case INTEGER -> {
                            yyn = 82;
                            continue;
                        }
                        case '(' -> {
                            yyn = 86;
                            continue;
                        }
                    }
                    yyn = 1093;
                    continue;

                case 34:
                    yyst[yysp] = 34;
                    yysv[yysp] = (lexer.getSemantic()
                    );
                    yytok = (lexer.getNextToken()
                    );
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 579:
                    if (yytok == ';') {
                        yyn = yyr118();
                        continue;
                    }
                    yyn = 1093;
                    continue;

                case 35:
                    yyst[yysp] = 35;
                    yysv[yysp] = (lexer.getSemantic()
                    );
                    yytok = (lexer.getNextToken()
                    );
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 580:
                    if (yytok == ';') {
                        yyn = yyr121();
                        continue;
                    }
                    yyn = 1093;
                    continue;

                case 36:
                    yyst[yysp] = 36;
                    yysv[yysp] = (lexer.getSemantic()
                    );
                    yytok = (lexer.getNextToken()
                    );
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 581:
                    if (yytok == ';') {
                        yyn = yyr120();
                        continue;
                    }
                    yyn = 1093;
                    continue;

                case 37:
                    yyst[yysp] = 37;
                    yysv[yysp] = (lexer.getSemantic()
                    );
                    yytok = (lexer.getNextToken()
                    );
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 582:
                    switch (yytok) {
                        case FLOAT -> {
                            yyn = 80;
                            continue;
                        }
                        case IDENTIFIER -> {
                            yyn = 81;
                            continue;
                        }
                        case INTEGER -> {
                            yyn = 82;
                            continue;
                        }
                        case '(' -> {
                            yyn = 88;
                            continue;
                        }
                    }
                    yyn = 1093;
                    continue;

                case 38:
                    yyst[yysp] = 38;
                    yysv[yysp] = (lexer.getSemantic()
                    );
                    yytok = (lexer.getNextToken()
                    );
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 583:
                    switch (yytok) {
                        case FLOAT -> {
                            yyn = 80;
                            continue;
                        }
                        case IDENTIFIER -> {
                            yyn = 81;
                            continue;
                        }
                        case INTEGER -> {
                            yyn = 82;
                            continue;
                        }
                        case '(' -> {
                            yyn = 93;
                            continue;
                        }
                    }
                    yyn = 1093;
                    continue;

                case 39:
                    yyst[yysp] = 39;
                    yysv[yysp] = (lexer.getSemantic()
                    );
                    yytok = (lexer.getNextToken()
                    );
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 584:
                    switch (yytok) {
                        case FLOAT -> {
                            yyn = 80;
                            continue;
                        }
                        case IDENTIFIER -> {
                            yyn = 81;
                            continue;
                        }
                        case INTEGER -> {
                            yyn = 82;
                            continue;
                        }
                        case '(' -> {
                            yyn = 95;
                            continue;
                        }
                    }
                    yyn = 1093;
                    continue;

                case 40:
                    yyst[yysp] = 40;
                    yysv[yysp] = (lexer.getSemantic()
                    );
                    yytok = (lexer.getNextToken()
                    );
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 585:
                    if (yytok == '[') {
                        yyn = 96;
                        continue;
                    }
                    yyn = 1093;
                    continue;

                case 41:
                    yyst[yysp] = 41;
                    yysv[yysp] = (lexer.getSemantic()
                    );
                    yytok = (lexer.getNextToken()
                    );
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 586:
                    if (yytok == '[') {
                        yyn = 97;
                        continue;
                    }
                    yyn = 1093;
                    continue;

                case 42:
                    yyst[yysp] = 42;
                    yysv[yysp] = (lexer.getSemantic()
                    );
                    yytok = (lexer.getNextToken()
                    );
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 587:
                    switch (yytok) {
                        case INTEGER -> {
                            yyn = 82;
                            continue;
                        }
                        case IDENTIFIER -> {
                            yyn = 99;
                            continue;
                        }
                        case '(' -> {
                            yyn = 100;
                            continue;
                        }
                    }
                    yyn = 1093;
                    continue;

                case 43:
                    yyst[yysp] = 43;
                    yysv[yysp] = (lexer.getSemantic()
                    );
                    yytok = (lexer.getNextToken()
                    );
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 588:
                    switch (yytok) {
                        case FLOAT -> {
                            yyn = 80;
                            continue;
                        }
                        case IDENTIFIER -> {
                            yyn = 81;
                            continue;
                        }
                        case INTEGER -> {
                            yyn = 82;
                            continue;
                        }
                        case '(' -> {
                            yyn = 102;
                            continue;
                        }
                    }
                    yyn = 1093;
                    continue;

                case 44:
                    yyst[yysp] = 44;
                    yysv[yysp] = (lexer.getSemantic()
                    );
                    yytok = (lexer.getNextToken()
                    );
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 589:
                    switch (yytok) {
                        case FLOAT -> {
                            yyn = 80;
                            continue;
                        }
                        case IDENTIFIER -> {
                            yyn = 81;
                            continue;
                        }
                        case INTEGER -> {
                            yyn = 82;
                            continue;
                        }
                        case '(' -> {
                            yyn = 104;
                            continue;
                        }
                    }
                    yyn = 1093;
                    continue;

                case 45:
                    yyst[yysp] = 45;
                    yysv[yysp] = (lexer.getSemantic()
                    );
                    yytok = (lexer.getNextToken()
                    );
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 590:
                    switch (yytok) {
                        case FLOAT -> {
                            yyn = 80;
                            continue;
                        }
                        case IDENTIFIER -> {
                            yyn = 81;
                            continue;
                        }
                        case INTEGER -> {
                            yyn = 82;
                            continue;
                        }
                        case '(' -> {
                            yyn = 106;
                            continue;
                        }
                    }
                    yyn = 1093;
                    continue;

                case 46:
                    yyst[yysp] = 46;
                    yysv[yysp] = (lexer.getSemantic()
                    );
                    yytok = (lexer.getNextToken()
                    );
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 591:
                    switch (yytok) {
                        case FLOAT -> {
                            yyn = 80;
                            continue;
                        }
                        case IDENTIFIER -> {
                            yyn = 81;
                            continue;
                        }
                        case INTEGER -> {
                            yyn = 82;
                            continue;
                        }
                        case '(' -> {
                            yyn = 93;
                            continue;
                        }
                        case ';' -> {
                            yyn = yyr231();
                            continue;
                        }
                    }
                    yyn = 1093;
                    continue;

                case 47:
                    yyst[yysp] = 47;
                    yysv[yysp] = (lexer.getSemantic()
                    );
                    yytok = (lexer.getNextToken()
                    );
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 592:
                    if (yytok == '[') {
                        yyn = 110;
                        continue;
                    }
                    yyn = 1093;
                    continue;

                case 48:
                    yyst[yysp] = 48;
                    yysv[yysp] = (lexer.getSemantic()
                    );
                    yytok = (lexer.getNextToken()
                    );
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 593:
                    if (yytok == IDENTIFIER) {
                        yyn = 111;
                        continue;
                    }
                    yyn = 1093;
                    continue;

                case 49:
                    yyst[yysp] = 49;
                    yysv[yysp] = (lexer.getSemantic()
                    );
                    yytok = (lexer.getNextToken()
                    );
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 594:
                    switch (yytok) {
                        case FLOAT -> {
                            yyn = 80;
                            continue;
                        }
                        case IDENTIFIER -> {
                            yyn = 81;
                            continue;
                        }
                        case INTEGER -> {
                            yyn = 82;
                            continue;
                        }
                        case '(' -> {
                            yyn = 114;
                            continue;
                        }
                    }
                    yyn = 1093;
                    continue;

                case 50:
                    yyst[yysp] = 50;
                    yysv[yysp] = (lexer.getSemantic()
                    );
                    yytok = (lexer.getNextToken()
                    );
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 595:
                    yyn = yys50();
                    continue;

                case 51:
                    yyst[yysp] = 51;
                    yysv[yysp] = (lexer.getSemantic()
                    );
                    yytok = (lexer.getNextToken()
                    );
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 596:
                    if (yytok == ';') {
                        yyn = yyr116();
                        continue;
                    }
                    yyn = 1093;
                    continue;

                case 52:
                    yyst[yysp] = 52;
                    yysv[yysp] = (lexer.getSemantic()
                    );
                    yytok = (lexer.getNextToken()
                    );
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 597:
                    if (yytok == IDENTIFIER) {
                        yyn = 139;
                        continue;
                    }
                    yyn = 1093;
                    continue;

                case 53:
                    yyst[yysp] = 53;
                    yysv[yysp] = (lexer.getSemantic()
                    );
                    yytok = (lexer.getNextToken()
                    );
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 598:
                    if (yytok == COLOR) {
                        yyn = 140;
                        continue;
                    }
                    yyn = 1093;
                    continue;

                case 54:
                    yyst[yysp] = 54;
                    yysv[yysp] = (lexer.getSemantic()
                    );
                    yytok = (lexer.getNextToken()
                    );
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 599:
                    if (yytok == '[') {
                        yyn = 141;
                        continue;
                    }
                    yyn = 1093;
                    continue;

                case 55:
                    yyst[yysp] = 55;
                    yysv[yysp] = (lexer.getSemantic()
                    );
                    yytok = (lexer.getNextToken()
                    );
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 600:
                    switch (yytok) {
                        case FLOAT -> {
                            yyn = 80;
                            continue;
                        }
                        case IDENTIFIER -> {
                            yyn = 81;
                            continue;
                        }
                        case INTEGER -> {
                            yyn = 82;
                            continue;
                        }
                        case '(' -> {
                            yyn = 143;
                            continue;
                        }
                    }
                    yyn = 1093;
                    continue;

                case 56:
                    yyst[yysp] = 56;
                    yysv[yysp] = (lexer.getSemantic()
                    );
                    yytok = (lexer.getNextToken()
                    );
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 601:
                    switch (yytok) {
                        case FLOAT -> {
                            yyn = 80;
                            continue;
                        }
                        case IDENTIFIER -> {
                            yyn = 81;
                            continue;
                        }
                        case INTEGER -> {
                            yyn = 82;
                            continue;
                        }
                        case '(' -> {
                            yyn = 145;
                            continue;
                        }
                    }
                    yyn = 1093;
                    continue;

                case 57:
                    yyst[yysp] = 57;
                    yysv[yysp] = (lexer.getSemantic()
                    );
                    yytok = (lexer.getNextToken()
                    );
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 602:
                    switch (yytok) {
                        case INTEGER -> {
                            yyn = 82;
                            continue;
                        }
                        case IDENTIFIER -> {
                            yyn = 99;
                            continue;
                        }
                        case '(' -> {
                            yyn = 147;
                            continue;
                        }
                    }
                    yyn = 1093;
                    continue;

                case 58:
                    yyst[yysp] = 58;
                    yysv[yysp] = (lexer.getSemantic()
                    );
                    yytok = (lexer.getNextToken()
                    );
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 603:
                    switch (yytok) {
                        case FLOAT -> {
                            yyn = 80;
                            continue;
                        }
                        case IDENTIFIER -> {
                            yyn = 81;
                            continue;
                        }
                        case INTEGER -> {
                            yyn = 82;
                            continue;
                        }
                        case '(' -> {
                            yyn = 149;
                            continue;
                        }
                    }
                    yyn = 1093;
                    continue;

                case 59:
                    yyst[yysp] = 59;
                    yysv[yysp] = (lexer.getSemantic()
                    );
                    yytok = (lexer.getNextToken()
                    );
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 604:
                    switch (yytok) {
                        case FLOAT -> {
                            yyn = 80;
                            continue;
                        }
                        case IDENTIFIER -> {
                            yyn = 81;
                            continue;
                        }
                        case INTEGER -> {
                            yyn = 82;
                            continue;
                        }
                        case '(' -> {
                            yyn = 152;
                            continue;
                        }
                    }
                    yyn = 1093;
                    continue;

                case 60:
                    yyst[yysp] = 60;
                    yysv[yysp] = (lexer.getSemantic()
                    );
                    yytok = (lexer.getNextToken()
                    );
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 605:
                    if (yytok == '[') {
                        yyn = 153;
                        continue;
                    }
                    yyn = 1093;
                    continue;

                case 61:
                    yyst[yysp] = 61;
                    yysv[yysp] = (lexer.getSemantic()
                    );
                    yytok = (lexer.getNextToken()
                    );
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 606:
                    switch (yytok) {
                        case FLOAT -> {
                            yyn = 80;
                            continue;
                        }
                        case IDENTIFIER -> {
                            yyn = 81;
                            continue;
                        }
                        case INTEGER -> {
                            yyn = 82;
                            continue;
                        }
                        case '(' -> {
                            yyn = 93;
                            continue;
                        }
                    }
                    yyn = 1093;
                    continue;

                case 62:
                    yyst[yysp] = 62;
                    yysv[yysp] = (lexer.getSemantic()
                    );
                    yytok = (lexer.getNextToken()
                    );
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 607:
                    switch (yytok) {
                        case FLOAT -> {
                            yyn = 80;
                            continue;
                        }
                        case IDENTIFIER -> {
                            yyn = 81;
                            continue;
                        }
                        case INTEGER -> {
                            yyn = 82;
                            continue;
                        }
                        case '(' -> {
                            yyn = 157;
                            continue;
                        }
                    }
                    yyn = 1093;
                    continue;

                case 63:
                    yyst[yysp] = 63;
                    yysv[yysp] = (lexer.getSemantic()
                    );
                    yytok = (lexer.getNextToken()
                    );
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 608:
                    switch (yytok) {
                        case FLOAT -> {
                            yyn = 80;
                            continue;
                        }
                        case IDENTIFIER -> {
                            yyn = 81;
                            continue;
                        }
                        case INTEGER -> {
                            yyn = 82;
                            continue;
                        }
                        case '(' -> {
                            yyn = 160;
                            continue;
                        }
                    }
                    yyn = 1093;
                    continue;

                case 64:
                    yyst[yysp] = 64;
                    yysv[yysp] = (lexer.getSemantic()
                    );
                    yytok = (lexer.getNextToken()
                    );
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 609:
                    switch (yytok) {
                        case INTEGER -> {
                            yyn = 82;
                            continue;
                        }
                        case IDENTIFIER -> {
                            yyn = 99;
                            continue;
                        }
                        case '(' -> {
                            yyn = 100;
                            continue;
                        }
                    }
                    yyn = 1093;
                    continue;

                case 65:
                    yyst[yysp] = 65;
                    yysv[yysp] = (lexer.getSemantic()
                    );
                    yytok = (lexer.getNextToken()
                    );
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 610:
                    switch (yytok) {
                        case FLOAT -> {
                            yyn = 80;
                            continue;
                        }
                        case IDENTIFIER -> {
                            yyn = 81;
                            continue;
                        }
                        case INTEGER -> {
                            yyn = 82;
                            continue;
                        }
                        case '(' -> {
                            yyn = 163;
                            continue;
                        }
                    }
                    yyn = 1093;
                    continue;

                case 66:
                    yyst[yysp] = 66;
                    yysv[yysp] = (lexer.getSemantic()
                    );
                    yytok = (lexer.getNextToken()
                    );
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 611:
                    switch (yytok) {
                        case FLOAT -> {
                            yyn = 80;
                            continue;
                        }
                        case IDENTIFIER -> {
                            yyn = 81;
                            continue;
                        }
                        case INTEGER -> {
                            yyn = 82;
                            continue;
                        }
                        case '(' -> {
                            yyn = 165;
                            continue;
                        }
                    }
                    yyn = 1093;
                    continue;

                case 67:
                    yyst[yysp] = 67;
                    yysv[yysp] = (lexer.getSemantic()
                    );
                    yytok = (lexer.getNextToken()
                    );
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 612:
                    switch (yytok) {
                        case ';', ')', '[', '>', '<' -> {
                            yyn = yyr122();
                            continue;
                        }
                    }
                    yyn = 1093;
                    continue;

                case 68:
                    yyst[yysp] = 68;
                    yysv[yysp] = (lexer.getSemantic()
                    );
                    yytok = (lexer.getNextToken()
                    );
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 613:
                    switch (yytok) {
                        case FLOAT -> {
                            yyn = 80;
                            continue;
                        }
                        case IDENTIFIER -> {
                            yyn = 81;
                            continue;
                        }
                        case INTEGER -> {
                            yyn = 82;
                            continue;
                        }
                        case '(' -> {
                            yyn = 167;
                            continue;
                        }
                    }
                    yyn = 1093;
                    continue;

                case 69:
                    yyst[yysp] = 69;
                    yysv[yysp] = (lexer.getSemantic()
                    );
                    yytok = (lexer.getNextToken()
                    );
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 614:
                    yyn = yys69();
                    continue;

                case 70:
                    yyst[yysp] = 70;
                    yysv[yysp] = (lexer.getSemantic()
                    );
                    yytok = (lexer.getNextToken()
                    );
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 615:
                    if (yytok == ';') {
                        yyn = yyr119();
                        continue;
                    }
                    yyn = 1093;
                    continue;

                case 71:
                    yyst[yysp] = 71;
                    yysv[yysp] = (lexer.getSemantic()
                    );
                    yytok = (lexer.getNextToken()
                    );
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 616:
                    switch (yytok) {
                        case FLOAT -> {
                            yyn = 80;
                            continue;
                        }
                        case IDENTIFIER -> {
                            yyn = 81;
                            continue;
                        }
                        case INTEGER -> {
                            yyn = 82;
                            continue;
                        }
                        case '(' -> {
                            yyn = 93;
                            continue;
                        }
                    }
                    yyn = 1093;
                    continue;

                case 72:
                    yyst[yysp] = 72;
                    yysv[yysp] = (lexer.getSemantic()
                    );
                    yytok = (lexer.getNextToken()
                    );
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 617:
                    if (yytok == '[') {
                        yyn = 173;
                        continue;
                    }
                    yyn = 1093;
                    continue;

                case 73:
                    yyst[yysp] = 73;
                    yysv[yysp] = (lexer.getSemantic()
                    );
                    yytok = (lexer.getNextToken()
                    );
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 618:
                    if (yytok == IDENTIFIER) {
                        yyn = 174;
                        continue;
                    }
                    yyn = 1093;
                    continue;

                case 74:
                    yyst[yysp] = 74;
                    yysv[yysp] = (lexer.getSemantic()
                    );
                    yytok = (lexer.getNextToken()
                    );
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 619:
                    switch (yytok) {
                        case INTEGER -> {
                            yyn = 82;
                            continue;
                        }
                        case IDENTIFIER -> {
                            yyn = 99;
                            continue;
                        }
                        case '(' -> {
                            yyn = 176;
                            continue;
                        }
                    }
                    yyn = 1093;
                    continue;

                case 75:
                    yyst[yysp] = 75;
                    yysv[yysp] = (lexer.getSemantic()
                    );
                    yytok = (lexer.getNextToken()
                    );
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 620:
                    yyn = yys75();
                    continue;

                case 76:
                    yyst[yysp] = 76;
                    yysv[yysp] = (lexer.getSemantic()
                    );
                    yytok = (lexer.getNextToken()
                    );
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 621:
                    yyn = yys76();
                    continue;

                case 77:
                    yyst[yysp] = 77;
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 622:
                    yyn = yys77();
                    continue;

                case 78:
                    yyst[yysp] = 78;
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 623:
                    yyn = yys78();
                    continue;

                case 79:
                    yyst[yysp] = 79;
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 624:
                    if (yytok == ';') {
                        yyn = yyr123();
                        continue;
                    }
                    yyn = 1093;
                    continue;

                case 80:
                    yyst[yysp] = 80;
                    yysv[yysp] = (lexer.getSemantic()
                    );
                    yytok = (lexer.getNextToken()
                    );
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 625:
                    yyn = yys80();
                    continue;

                case 81:
                    yyst[yysp] = 81;
                    yysv[yysp] = (lexer.getSemantic()
                    );
                    yytok = (lexer.getNextToken()
                    );
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 626:
                    yyn = yys81();
                    continue;

                case 82:
                    yyst[yysp] = 82;
                    yysv[yysp] = (lexer.getSemantic()
                    );
                    yytok = (lexer.getNextToken()
                    );
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 627:
                    yyn = yys82();
                    continue;

                case 83:
                    yyst[yysp] = 83;
                    yysv[yysp] = (lexer.getSemantic()
                    );
                    yytok = (lexer.getNextToken()
                    );
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 628:
                    yyn = yys83();
                    continue;

                case 84:
                    yyst[yysp] = 84;
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 629:
                    yyn = yys84();
                    continue;

                case 85:
                    yyst[yysp] = 85;
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 630:
                    yyn = yys85();
                    continue;

                case 86:
                    yyst[yysp] = 86;
                    yysv[yysp] = (lexer.getSemantic()
                    );
                    yytok = (lexer.getNextToken()
                    );
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 631:
                    yyn = yys86();
                    continue;

                case 87:
                    yyst[yysp] = 87;
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 632:
                    switch (yytok) {
                        case ';', ')', '[', '>', '<' -> {
                            yyn = yyr155();
                            continue;
                        }
                    }
                    yyn = 1093;
                    continue;

                case 88:
                    yyst[yysp] = 88;
                    yysv[yysp] = (lexer.getSemantic()
                    );
                    yytok = (lexer.getNextToken()
                    );
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 633:
                    yyn = yys88();
                    continue;

                case 89:
                    yyst[yysp] = 89;
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 634:
                    yyn = yys89();
                    continue;

                case 90:
                    yyst[yysp] = 90;
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 635:
                    yyn = yys90();
                    continue;

                case 91:
                    yyst[yysp] = 91;
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 636:
                    switch (yytok) {
                        case ';', ')', '[', '>', '<' -> {
                            yyn = yyr198();
                            continue;
                        }
                    }
                    yyn = 1093;
                    continue;

                case 92:
                    yyst[yysp] = 92;
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 637:
                    switch (yytok) {
                        case ';', ')', '[', '>', '<' -> {
                            yyn = yyr195();
                            continue;
                        }
                    }
                    yyn = 1093;
                    continue;

                case 93:
                    yyst[yysp] = 93;
                    yysv[yysp] = (lexer.getSemantic()
                    );
                    yytok = (lexer.getNextToken()
                    );
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 638:
                    switch (yytok) {
                        case FLOAT -> {
                            yyn = 80;
                            continue;
                        }
                        case IDENTIFIER -> {
                            yyn = 81;
                            continue;
                        }
                        case INTEGER -> {
                            yyn = 82;
                            continue;
                        }
                        case '(' -> {
                            yyn = 93;
                            continue;
                        }
                    }
                    yyn = 1093;
                    continue;

                case 94:
                    yyst[yysp] = 94;
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 639:
                    switch (yytok) {
                        case FLOAT -> {
                            yyn = 80;
                            continue;
                        }
                        case IDENTIFIER -> {
                            yyn = 81;
                            continue;
                        }
                        case INTEGER -> {
                            yyn = 82;
                            continue;
                        }
                        case '(' -> {
                            yyn = 197;
                            continue;
                        }
                    }
                    yyn = 1093;
                    continue;

                case 95:
                    yyst[yysp] = 95;
                    yysv[yysp] = (lexer.getSemantic()
                    );
                    yytok = (lexer.getNextToken()
                    );
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 640:
                    yyn = yys95();
                    continue;

                case 96:
                    yyst[yysp] = 96;
                    yysv[yysp] = (lexer.getSemantic()
                    );
                    yytok = (lexer.getNextToken()
                    );
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 641:
                    yyn = yys96();
                    continue;

                case 97:
                    yyst[yysp] = 97;
                    yysv[yysp] = (lexer.getSemantic()
                    );
                    yytok = (lexer.getNextToken()
                    );
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 642:
                    switch (yytok) {
                        case FLOAT -> {
                            yyn = 80;
                            continue;
                        }
                        case IDENTIFIER -> {
                            yyn = 81;
                            continue;
                        }
                        case INTEGER -> {
                            yyn = 82;
                            continue;
                        }
                        case '(' -> {
                            yyn = 93;
                            continue;
                        }
                    }
                    yyn = 1093;
                    continue;

                case 98:
                    yyst[yysp] = 98;
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 643:
                    switch (yytok) {
                        case '*' -> {
                            yyn = 183;
                            continue;
                        }
                        case '+' -> {
                            yyn = 184;
                            continue;
                        }
                        case '-' -> {
                            yyn = 185;
                            continue;
                        }
                        case '/' -> {
                            yyn = 186;
                            continue;
                        }
                        case '[' -> {
                            yyn = 203;
                            continue;
                        }
                    }
                    yyn = 1093;
                    continue;

                case 99:
                    yyst[yysp] = 99;
                    yysv[yysp] = (lexer.getSemantic()
                    );
                    yytok = (lexer.getNextToken()
                    );
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 644:
                    yyn = yys99();
                    continue;

                case 100:
                    yyst[yysp] = 100;
                    yysv[yysp] = (lexer.getSemantic()
                    );
                    yytok = (lexer.getNextToken()
                    );
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 645:
                    switch (yytok) {
                        case INTEGER -> {
                            yyn = 82;
                            continue;
                        }
                        case IDENTIFIER -> {
                            yyn = 99;
                            continue;
                        }
                        case '(' -> {
                            yyn = 100;
                            continue;
                        }
                    }
                    yyn = 1093;
                    continue;

                case 101:
                    yyst[yysp] = 101;
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 646:
                    if (yytok == ';') {
                        yyn = yyr131();
                        continue;
                    }
                    yyn = 1093;
                    continue;

                case 102:
                    yyst[yysp] = 102;
                    yysv[yysp] = (lexer.getSemantic()
                    );
                    yytok = (lexer.getNextToken()
                    );
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 647:
                    yyn = yys102();
                    continue;

                case 103:
                    yyst[yysp] = 103;
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 648:
                    if (yytok == ';') {
                        yyn = yyr125();
                        continue;
                    }
                    yyn = 1093;
                    continue;

                case 104:
                    yyst[yysp] = 104;
                    yysv[yysp] = (lexer.getSemantic()
                    );
                    yytok = (lexer.getNextToken()
                    );
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 649:
                    yyn = yys104();
                    continue;

                case 105:
                    yyst[yysp] = 105;
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 650:
                    if (yytok == ';') {
                        yyn = yyr126();
                        continue;
                    }
                    yyn = 1093;
                    continue;

                case 106:
                    yyst[yysp] = 106;
                    yysv[yysp] = (lexer.getSemantic()
                    );
                    yytok = (lexer.getNextToken()
                    );
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 651:
                    yyn = yys106();
                    continue;

                case 107:
                    yyst[yysp] = 107;
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 652:
                    yyn = yys107();
                    continue;

                case 108:
                    yyst[yysp] = 108;
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 653:
                    yyn = yys108();
                    continue;

                case 109:
                    yyst[yysp] = 109;
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 654:
                    if (yytok == ';') {
                        yyn = yyr230();
                        continue;
                    }
                    yyn = 1093;
                    continue;

                case 110:
                    yyst[yysp] = 110;
                    yysv[yysp] = (lexer.getSemantic()
                    );
                    yytok = (lexer.getNextToken()
                    );
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 655:
                    if (yytok == IDENTIFIER) {
                        yyn = 210;
                        continue;
                    }
                    yyn = 1093;
                    continue;

                case 111:
                    yyst[yysp] = 111;
                    yysv[yysp] = (lexer.getSemantic()
                    );
                    yytok = (lexer.getNextToken()
                    );
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 656:
                    if (yytok == '=') {
                        yyn = 211;
                        continue;
                    }
                    yyn = 1093;
                    continue;

                case 112:
                    yyst[yysp] = 112;
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 657:
                    yyn = yys112();
                    continue;

                case 113:
                    yyst[yysp] = 113;
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 658:
                    yyn = yys113();
                    continue;

                case 114:
                    yyst[yysp] = 114;
                    yysv[yysp] = (lexer.getSemantic()
                    );
                    yytok = (lexer.getNextToken()
                    );
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 659:
                    yyn = yys114();
                    continue;

                case 115:
                    yyst[yysp] = 115;
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 660:
                    switch (yytok) {
                        case ';', ')', '[', '>', '<' -> {
                            yyn = yyr90();
                            continue;
                        }
                    }
                    yyn = 1093;
                    continue;

                case 116:
                    yyst[yysp] = 116;
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 661:
                    switch (yytok) {
                        case ';', ')', '[', '>', '<' -> {
                            yyn = yyr96();
                            continue;
                        }
                    }
                    yyn = 1093;
                    continue;

                case 117:
                    yyst[yysp] = 117;
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 662:
                    switch (yytok) {
                        case ';', ')', '[', '>', '<' -> {
                            yyn = yyr97();
                            continue;
                        }
                    }
                    yyn = 1093;
                    continue;

                case 118:
                    yyst[yysp] = 118;
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 663:
                    switch (yytok) {
                        case ';', ')', '[', '>', '<' -> {
                            yyn = yyr98();
                            continue;
                        }
                    }
                    yyn = 1093;
                    continue;

                case 119:
                    yyst[yysp] = 119;
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 664:
                    switch (yytok) {
                        case ';', ')', '[', '>', '<' -> {
                            yyn = yyr101();
                            continue;
                        }
                    }
                    yyn = 1093;
                    continue;

                case 120:
                    yyst[yysp] = 120;
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 665:
                    switch (yytok) {
                        case ';', ')', '[', '>', '<' -> {
                            yyn = yyr99();
                            continue;
                        }
                    }
                    yyn = 1093;
                    continue;

                case 121:
                    yyst[yysp] = 121;
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 666:
                    switch (yytok) {
                        case ';', ')', '[', '>', '<' -> {
                            yyn = yyr100();
                            continue;
                        }
                    }
                    yyn = 1093;
                    continue;

                case 122:
                    yyst[yysp] = 122;
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 667:
                    switch (yytok) {
                        case '<' -> {
                            yyn = 214;
                            continue;
                        }
                        case '>' -> {
                            yyn = 215;
                            continue;
                        }
                    }
                    yyn = 1093;
                    continue;

                case 123:
                    yyst[yysp] = 123;
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 668:
                    switch (yytok) {
                        case ';', ')', '[', '>', '<' -> {
                            yyn = yyr89();
                            continue;
                        }
                    }
                    yyn = 1093;
                    continue;

                case 124:
                    yyst[yysp] = 124;
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 669:
                    switch (yytok) {
                        case ';', ')', '[', '>', '<' -> {
                            yyn = yyr91();
                            continue;
                        }
                    }
                    yyn = 1093;
                    continue;

                case 125:
                    yyst[yysp] = 125;
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 670:
                    switch (yytok) {
                        case ';', ')', '[', '>', '<' -> {
                            yyn = yyr92();
                            continue;
                        }
                    }
                    yyn = 1093;
                    continue;

                case 126:
                    yyst[yysp] = 126;
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 671:
                    switch (yytok) {
                        case ';', ')', '[', '>', '<' -> {
                            yyn = yyr95();
                            continue;
                        }
                    }
                    yyn = 1093;
                    continue;

                case 127:
                    yyst[yysp] = 127;
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 672:
                    switch (yytok) {
                        case ';', ')', '[', '>', '<' -> {
                            yyn = yyr93();
                            continue;
                        }
                    }
                    yyn = 1093;
                    continue;

                case 128:
                    yyst[yysp] = 128;
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 673:
                    switch (yytok) {
                        case ';', ')', '[', '>', '<' -> {
                            yyn = yyr94();
                            continue;
                        }
                    }
                    yyn = 1093;
                    continue;

                case 129:
                    yyst[yysp] = 129;
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 674:
                    switch (yytok) {
                        case '<' -> {
                            yyn = 216;
                            continue;
                        }
                        case '>' -> {
                            yyn = 217;
                            continue;
                        }
                        case ';' -> {
                            yyn = yyr140();
                            continue;
                        }
                    }
                    yyn = 1093;
                    continue;

                case 130:
                    yyst[yysp] = 130;
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 675:
                    if (yytok == ';') {
                        yyn = yyr141();
                        continue;
                    }
                    yyn = 1093;
                    continue;

                case 131:
                    yyst[yysp] = 131;
                    yysv[yysp] = (lexer.getSemantic()
                    );
                    yytok = (lexer.getNextToken()
                    );
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 676:
                    switch (yytok) {
                        case ';', ')', '[' -> {
                            yyn = yyr64();
                            continue;
                        }
                    }
                    yyn = 1093;
                    continue;

                case 132:
                    yyst[yysp] = 132;
                    yysv[yysp] = (lexer.getSemantic()
                    );
                    yytok = (lexer.getNextToken()
                    );
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 677:
                    yyn = yys132();
                    continue;

                case 133:
                    yyst[yysp] = 133;
                    yysv[yysp] = (lexer.getSemantic()
                    );
                    yytok = (lexer.getNextToken()
                    );
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 678:
                    switch (yytok) {
                        case FLOAT -> {
                            yyn = 80;
                            continue;
                        }
                        case IDENTIFIER -> {
                            yyn = 81;
                            continue;
                        }
                        case INTEGER -> {
                            yyn = 82;
                            continue;
                        }
                        case '(' -> {
                            yyn = 219;
                            continue;
                        }
                    }
                    yyn = 1093;
                    continue;

                case 134:
                    yyst[yysp] = 134;
                    yysv[yysp] = (lexer.getSemantic()
                    );
                    yytok = (lexer.getNextToken()
                    );
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 679:
                    switch (yytok) {
                        case FLOAT -> {
                            yyn = 80;
                            continue;
                        }
                        case IDENTIFIER -> {
                            yyn = 81;
                            continue;
                        }
                        case INTEGER -> {
                            yyn = 82;
                            continue;
                        }
                        case '(' -> {
                            yyn = 93;
                            continue;
                        }
                    }
                    yyn = 1093;
                    continue;

                case 135:
                    yyst[yysp] = 135;
                    yysv[yysp] = (lexer.getSemantic()
                    );
                    yytok = (lexer.getNextToken()
                    );
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 680:
                    switch (yytok) {
                        case FLOAT -> {
                            yyn = 80;
                            continue;
                        }
                        case IDENTIFIER -> {
                            yyn = 81;
                            continue;
                        }
                        case INTEGER -> {
                            yyn = 82;
                            continue;
                        }
                        case '(' -> {
                            yyn = 93;
                            continue;
                        }
                    }
                    yyn = 1093;
                    continue;

                case 136:
                    yyst[yysp] = 136;
                    yysv[yysp] = (lexer.getSemantic()
                    );
                    yytok = (lexer.getNextToken()
                    );
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 681:
                    if (yytok == '(') {
                        yyn = 222;
                        continue;
                    }
                    yyn = 1093;
                    continue;

                case 137:
                    yyst[yysp] = 137;
                    yysv[yysp] = (lexer.getSemantic()
                    );
                    yytok = (lexer.getNextToken()
                    );
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 682:
                    if (yytok == '(') {
                        yyn = 223;
                        continue;
                    }
                    yyn = 1093;
                    continue;

                case 138:
                    yyst[yysp] = 138;
                    yysv[yysp] = (lexer.getSemantic()
                    );
                    yytok = (lexer.getNextToken()
                    );
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 683:
                    yyn = yys138();
                    continue;

                case 139:
                    yyst[yysp] = 139;
                    yysv[yysp] = (lexer.getSemantic()
                    );
                    yytok = (lexer.getNextToken()
                    );
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 684:
                    yyn = yys139();
                    continue;

                case 140:
                    yyst[yysp] = 140;
                    yysv[yysp] = (lexer.getSemantic()
                    );
                    yytok = (lexer.getNextToken()
                    );
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 685:
                    if (yytok == ';') {
                        yyn = yyr130();
                        continue;
                    }
                    yyn = 1093;
                    continue;

                case 141:
                    yyst[yysp] = 141;
                    yysv[yysp] = (lexer.getSemantic()
                    );
                    yytok = (lexer.getNextToken()
                    );
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 686:
                    switch (yytok) {
                        case INTEGER -> {
                            yyn = 82;
                            continue;
                        }
                        case IDENTIFIER -> {
                            yyn = 99;
                            continue;
                        }
                        case '(' -> {
                            yyn = 100;
                            continue;
                        }
                    }
                    yyn = 1093;
                    continue;

                case 142:
                    yyst[yysp] = 142;
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 687:
                    if (yytok == ';') {
                        yyn = yyr127();
                        continue;
                    }
                    yyn = 1093;
                    continue;

                case 143:
                    yyst[yysp] = 143;
                    yysv[yysp] = (lexer.getSemantic()
                    );
                    yytok = (lexer.getNextToken()
                    );
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 688:
                    yyn = yys143();
                    continue;

                case 144:
                    yyst[yysp] = 144;
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 689:
                    if (yytok == ';') {
                        yyn = yyr128();
                        continue;
                    }
                    yyn = 1093;
                    continue;

                case 145:
                    yyst[yysp] = 145;
                    yysv[yysp] = (lexer.getSemantic()
                    );
                    yytok = (lexer.getNextToken()
                    );
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 690:
                    yyn = yys145();
                    continue;

                case 146:
                    yyst[yysp] = 146;
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 691:
                    yyn = yys146();
                    continue;

                case 147:
                    yyst[yysp] = 147;
                    yysv[yysp] = (lexer.getSemantic()
                    );
                    yytok = (lexer.getNextToken()
                    );
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 692:
                    yyn = yys147();
                    continue;

                case 148:
                    yyst[yysp] = 148;
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 693:
                    if (yytok == ';') {
                        yyn = yyr129();
                        continue;
                    }
                    yyn = 1093;
                    continue;

                case 149:
                    yyst[yysp] = 149;
                    yysv[yysp] = (lexer.getSemantic()
                    );
                    yytok = (lexer.getNextToken()
                    );
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 694:
                    yyn = yys149();
                    continue;

                case 150:
                    yyst[yysp] = 150;
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 695:
                    yyn = yys150();
                    continue;

                case 151:
                    yyst[yysp] = 151;
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 696:
                    yyn = yys151();
                    continue;

                case 152:
                    yyst[yysp] = 152;
                    yysv[yysp] = (lexer.getSemantic()
                    );
                    yytok = (lexer.getNextToken()
                    );
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 697:
                    yyn = yys152();
                    continue;

                case 153:
                    yyst[yysp] = 153;
                    yysv[yysp] = (lexer.getSemantic()
                    );
                    yytok = (lexer.getNextToken()
                    );
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 698:
                    switch (yytok) {
                        case FLOAT -> {
                            yyn = 80;
                            continue;
                        }
                        case IDENTIFIER -> {
                            yyn = 81;
                            continue;
                        }
                        case INTEGER -> {
                            yyn = 82;
                            continue;
                        }
                        case '(' -> {
                            yyn = 93;
                            continue;
                        }
                    }
                    yyn = 1093;
                    continue;

                case 154:
                    yyst[yysp] = 154;
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 699:
                    switch (yytok) {
                        case ';', ')', '[', '>', '<' -> {
                            yyn = yyr199();
                            continue;
                        }
                    }
                    yyn = 1093;
                    continue;

                case 155:
                    yyst[yysp] = 155;
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 700:
                    switch (yytok) {
                        case ';', ')', '[', '>', '<' -> {
                            yyn = yyr196();
                            continue;
                        }
                    }
                    yyn = 1093;
                    continue;

                case 156:
                    yyst[yysp] = 156;
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 701:
                    switch (yytok) {
                        case ';', ')', '[', '>', '<' -> {
                            yyn = yyr156();
                            continue;
                        }
                    }
                    yyn = 1093;
                    continue;

                case 157:
                    yyst[yysp] = 157;
                    yysv[yysp] = (lexer.getSemantic()
                    );
                    yytok = (lexer.getNextToken()
                    );
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 702:
                    yyn = yys157();
                    continue;

                case 158:
                    yyst[yysp] = 158;
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 703:
                    yyn = yys158();
                    continue;

                case 159:
                    yyst[yysp] = 159;
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 704:
                    yyn = yys159();
                    continue;

                case 160:
                    yyst[yysp] = 160;
                    yysv[yysp] = (lexer.getSemantic()
                    );
                    yytok = (lexer.getNextToken()
                    );
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 705:
                    yyn = yys160();
                    continue;

                case 161:
                    yyst[yysp] = 161;
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 706:
                    switch (yytok) {
                        case '*' -> {
                            yyn = 183;
                            continue;
                        }
                        case '+' -> {
                            yyn = 184;
                            continue;
                        }
                        case '-' -> {
                            yyn = 185;
                            continue;
                        }
                        case '/' -> {
                            yyn = 186;
                            continue;
                        }
                        case '[' -> {
                            yyn = 261;
                            continue;
                        }
                    }
                    yyn = 1093;
                    continue;

                case 162:
                    yyst[yysp] = 162;
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 707:
                    switch (yytok) {
                        case FLOAT -> {
                            yyn = 80;
                            continue;
                        }
                        case IDENTIFIER -> {
                            yyn = 81;
                            continue;
                        }
                        case INTEGER -> {
                            yyn = 82;
                            continue;
                        }
                        case '(' -> {
                            yyn = 93;
                            continue;
                        }
                    }
                    yyn = 1093;
                    continue;

                case 163:
                    yyst[yysp] = 163;
                    yysv[yysp] = (lexer.getSemantic()
                    );
                    yytok = (lexer.getNextToken()
                    );
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 708:
                    yyn = yys163();
                    continue;

                case 164:
                    yyst[yysp] = 164;
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 709:
                    if (yytok == ';') {
                        yyn = yyr124();
                        continue;
                    }
                    yyn = 1093;
                    continue;

                case 165:
                    yyst[yysp] = 165;
                    yysv[yysp] = (lexer.getSemantic()
                    );
                    yytok = (lexer.getNextToken()
                    );
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 710:
                    yyn = yys165();
                    continue;

                case 166:
                    yyst[yysp] = 166;
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 711:
                    switch (yytok) {
                        case ';', ')', '[', '>', '<' -> {
                            yyn = yyr157();
                            continue;
                        }
                    }
                    yyn = 1093;
                    continue;

                case 167:
                    yyst[yysp] = 167;
                    yysv[yysp] = (lexer.getSemantic()
                    );
                    yytok = (lexer.getNextToken()
                    );
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 712:
                    yyn = yys167();
                    continue;

                case 168:
                    yyst[yysp] = 168;
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 713:
                    switch (yytok) {
                        case '<' -> {
                            yyn = 216;
                            continue;
                        }
                        case '>' -> {
                            yyn = 217;
                            continue;
                        }
                    }
                    yyn = 1093;
                    continue;

                case 169:
                    yyst[yysp] = 169;
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 714:
                    if (yytok == '[') {
                        yyn = 266;
                        continue;
                    }
                    yyn = 1093;
                    continue;

                case 170:
                    yyst[yysp] = 170;
                    yysv[yysp] = (lexer.getSemantic()
                    );
                    yytok = (lexer.getNextToken()
                    );
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 715:
                    yyn = yys170();
                    continue;

                case 171:
                    yyst[yysp] = 171;
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 716:
                    switch (yytok) {
                        case ';', ')', '[', '>', '<' -> {
                            yyn = yyr200();
                            continue;
                        }
                    }
                    yyn = 1093;
                    continue;

                case 172:
                    yyst[yysp] = 172;
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 717:
                    switch (yytok) {
                        case ';', ')', '[', '>', '<' -> {
                            yyn = yyr197();
                            continue;
                        }
                    }
                    yyn = 1093;
                    continue;

                case 173:
                    yyst[yysp] = 173;
                    yysv[yysp] = (lexer.getSemantic()
                    );
                    yytok = (lexer.getNextToken()
                    );
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 718:
                    switch (yytok) {
                        case FLOAT -> {
                            yyn = 80;
                            continue;
                        }
                        case IDENTIFIER -> {
                            yyn = 81;
                            continue;
                        }
                        case INTEGER -> {
                            yyn = 82;
                            continue;
                        }
                        case '(' -> {
                            yyn = 93;
                            continue;
                        }
                    }
                    yyn = 1093;
                    continue;

                case 174:
                    yyst[yysp] = 174;
                    yysv[yysp] = (lexer.getSemantic()
                    );
                    yytok = (lexer.getNextToken()
                    );
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 719:
                    switch (yytok) {
                        case '=' -> {
                            yyn = 270;
                            continue;
                        }
                        case ';' -> {
                            yyn = yyr102();
                            continue;
                        }
                    }
                    yyn = 1093;
                    continue;

                case 175:
                    yyst[yysp] = 175;
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 720:
                    switch (yytok) {
                        case '*' -> {
                            yyn = 183;
                            continue;
                        }
                        case '+' -> {
                            yyn = 184;
                            continue;
                        }
                        case '-' -> {
                            yyn = 185;
                            continue;
                        }
                        case '/' -> {
                            yyn = 186;
                            continue;
                        }
                        case ';' -> {
                            yyn = yyr143();
                            continue;
                        }
                    }
                    yyn = 1093;
                    continue;

                case 176:
                    yyst[yysp] = 176;
                    yysv[yysp] = (lexer.getSemantic()
                    );
                    yytok = (lexer.getNextToken()
                    );
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 721:
                    yyn = yys176();
                    continue;

                case 177:
                    yyst[yysp] = 177;
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 722:
                    if (yytok == ENDINPUT) {
                        yyn = yyr2();
                        continue;
                    }
                    yyn = 1093;
                    continue;

                case 178:
                    yyst[yysp] = 178;
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 723:
                    if (yytok == ENDINPUT) {
                        yyn = yyr3();
                        continue;
                    }
                    yyn = 1093;
                    continue;

                case 179:
                    yyst[yysp] = 179;
                    yysv[yysp] = (lexer.getSemantic()
                    );
                    yytok = (lexer.getNextToken()
                    );
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 724:
                    switch (yytok) {
                        case FLOAT -> {
                            yyn = 80;
                            continue;
                        }
                        case IDENTIFIER -> {
                            yyn = 81;
                            continue;
                        }
                        case INTEGER -> {
                            yyn = 82;
                            continue;
                        }
                        case '(' -> {
                            yyn = 93;
                            continue;
                        }
                    }
                    yyn = 1093;
                    continue;

                case 180:
                    yyst[yysp] = 180;
                    yysv[yysp] = (lexer.getSemantic()
                    );
                    yytok = (lexer.getNextToken()
                    );
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 725:
                    switch (yytok) {
                        case FLOAT -> {
                            yyn = 80;
                            continue;
                        }
                        case IDENTIFIER -> {
                            yyn = 81;
                            continue;
                        }
                        case INTEGER -> {
                            yyn = 82;
                            continue;
                        }
                        case '(' -> {
                            yyn = 93;
                            continue;
                        }
                    }
                    yyn = 1093;
                    continue;

                case 181:
                    yyst[yysp] = 181;
                    yysv[yysp] = (lexer.getSemantic()
                    );
                    yytok = (lexer.getNextToken()
                    );
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 726:
                    switch (yytok) {
                        case FLOAT -> {
                            yyn = 80;
                            continue;
                        }
                        case IDENTIFIER -> {
                            yyn = 81;
                            continue;
                        }
                        case INTEGER -> {
                            yyn = 82;
                            continue;
                        }
                        case '(' -> {
                            yyn = 93;
                            continue;
                        }
                    }
                    yyn = 1093;
                    continue;

                case 182:
                    yyst[yysp] = 182;
                    yysv[yysp] = (lexer.getSemantic()
                    );
                    yytok = (lexer.getNextToken()
                    );
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 727:
                    switch (yytok) {
                        case FLOAT -> {
                            yyn = 80;
                            continue;
                        }
                        case IDENTIFIER -> {
                            yyn = 81;
                            continue;
                        }
                        case INTEGER -> {
                            yyn = 82;
                            continue;
                        }
                        case '(' -> {
                            yyn = 93;
                            continue;
                        }
                    }
                    yyn = 1093;
                    continue;

                case 183:
                    yyst[yysp] = 183;
                    yysv[yysp] = (lexer.getSemantic()
                    );
                    yytok = (lexer.getNextToken()
                    );
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 728:
                    switch (yytok) {
                        case INTEGER -> {
                            yyn = 82;
                            continue;
                        }
                        case IDENTIFIER -> {
                            yyn = 99;
                            continue;
                        }
                        case '(' -> {
                            yyn = 100;
                            continue;
                        }
                    }
                    yyn = 1093;
                    continue;

                case 184:
                    yyst[yysp] = 184;
                    yysv[yysp] = (lexer.getSemantic()
                    );
                    yytok = (lexer.getNextToken()
                    );
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 729:
                    switch (yytok) {
                        case INTEGER -> {
                            yyn = 82;
                            continue;
                        }
                        case IDENTIFIER -> {
                            yyn = 99;
                            continue;
                        }
                        case '(' -> {
                            yyn = 100;
                            continue;
                        }
                    }
                    yyn = 1093;
                    continue;

                case 185:
                    yyst[yysp] = 185;
                    yysv[yysp] = (lexer.getSemantic()
                    );
                    yytok = (lexer.getNextToken()
                    );
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 730:
                    switch (yytok) {
                        case INTEGER -> {
                            yyn = 82;
                            continue;
                        }
                        case IDENTIFIER -> {
                            yyn = 99;
                            continue;
                        }
                        case '(' -> {
                            yyn = 100;
                            continue;
                        }
                    }
                    yyn = 1093;
                    continue;

                case 186:
                    yyst[yysp] = 186;
                    yysv[yysp] = (lexer.getSemantic()
                    );
                    yytok = (lexer.getNextToken()
                    );
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 731:
                    switch (yytok) {
                        case INTEGER -> {
                            yyn = 82;
                            continue;
                        }
                        case IDENTIFIER -> {
                            yyn = 99;
                            continue;
                        }
                        case '(' -> {
                            yyn = 100;
                            continue;
                        }
                    }
                    yyn = 1093;
                    continue;

                case 187:
                    yyst[yysp] = 187;
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 732:
                    switch (yytok) {
                        case '*' -> {
                            yyn = 179;
                            continue;
                        }
                        case '+' -> {
                            yyn = 180;
                            continue;
                        }
                        case '-' -> {
                            yyn = 181;
                            continue;
                        }
                        case '/' -> {
                            yyn = 182;
                            continue;
                        }
                        case ')' -> {
                            yyn = 280;
                            continue;
                        }
                    }
                    yyn = 1093;
                    continue;

                case 188:
                    yyst[yysp] = 188;
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 733:
                    if (yytok == ')') {
                        yyn = 281;
                        continue;
                    }
                    yyn = 1093;
                    continue;

                case 189:
                    yyst[yysp] = 189;
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 734:
                    switch (yytok) {
                        case '*' -> {
                            yyn = 183;
                            continue;
                        }
                        case '+' -> {
                            yyn = 184;
                            continue;
                        }
                        case '-' -> {
                            yyn = 185;
                            continue;
                        }
                        case '/' -> {
                            yyn = 186;
                            continue;
                        }
                        case ')' -> {
                            yyn = 282;
                            continue;
                        }
                    }
                    yyn = 1093;
                    continue;

                case 190:
                    yyst[yysp] = 190;
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 735:
                    if (yytok == ')') {
                        yyn = 283;
                        continue;
                    }
                    yyn = 1093;
                    continue;

                case 191:
                    yyst[yysp] = 191;
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 736:
                    if (yytok == ')') {
                        yyn = 284;
                        continue;
                    }
                    yyn = 1093;
                    continue;

                case 192:
                    yyst[yysp] = 192;
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 737:
                    if (yytok == ')') {
                        yyn = 285;
                        continue;
                    }
                    yyn = 1093;
                    continue;

                case 193:
                    yyst[yysp] = 193;
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 738:
                    yyn = yys193();
                    continue;

                case 194:
                    yyst[yysp] = 194;
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 739:
                    yyn = yys194();
                    continue;

                case 195:
                    yyst[yysp] = 195;
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 740:
                    yyn = yys195();
                    continue;

                case 196:
                    yyst[yysp] = 196;
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 741:
                    switch (yytok) {
                        case ';', ')', '[', '>', '<' -> {
                            yyn = yyr183();
                            continue;
                        }
                    }
                    yyn = 1093;
                    continue;

                case 197:
                    yyst[yysp] = 197;
                    yysv[yysp] = (lexer.getSemantic()
                    );
                    yytok = (lexer.getNextToken()
                    );
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 742:
                    yyn = yys197();
                    continue;

                case 198:
                    yyst[yysp] = 198;
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 743:
                    if (yytok == ')') {
                        yyn = 287;
                        continue;
                    }
                    yyn = 1093;
                    continue;

                case 199:
                    yyst[yysp] = 199;
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 744:
                    if (yytok == ']') {
                        yyn = 288;
                        continue;
                    }
                    yyn = 1093;
                    continue;

                case 200:
                    yyst[yysp] = 200;
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 745:
                    if (yytok == ';') {
                        yyn = 289;
                        continue;
                    }
                    yyn = 1093;
                    continue;

                case 201:
                    yyst[yysp] = 201;
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 746:
                    if (yytok == ']') {
                        yyn = 290;
                        continue;
                    }
                    yyn = 1093;
                    continue;

                case 202:
                    yyst[yysp] = 202;
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 747:
                    if (yytok == ']') {
                        yyn = 291;
                        continue;
                    }
                    yyn = 1093;
                    continue;

                case 203:
                    yyst[yysp] = 203;
                    yysv[yysp] = (lexer.getSemantic()
                    );
                    yytok = (lexer.getNextToken()
                    );
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 748:
                    switch (yytok) {
                        case FLOAT -> {
                            yyn = 80;
                            continue;
                        }
                        case IDENTIFIER -> {
                            yyn = 81;
                            continue;
                        }
                        case INTEGER -> {
                            yyn = 82;
                            continue;
                        }
                        case '(' -> {
                            yyn = 93;
                            continue;
                        }
                    }
                    yyn = 1093;
                    continue;

                case 204:
                    yyst[yysp] = 204;
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 749:
                    switch (yytok) {
                        case '*' -> {
                            yyn = 183;
                            continue;
                        }
                        case '+' -> {
                            yyn = 184;
                            continue;
                        }
                        case '-' -> {
                            yyn = 185;
                            continue;
                        }
                        case '/' -> {
                            yyn = 186;
                            continue;
                        }
                        case ')' -> {
                            yyn = 282;
                            continue;
                        }
                    }
                    yyn = 1093;
                    continue;

                case 205:
                    yyst[yysp] = 205;
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 750:
                    if (yytok == ')') {
                        yyn = 294;
                        continue;
                    }
                    yyn = 1093;
                    continue;

                case 206:
                    yyst[yysp] = 206;
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 751:
                    if (yytok == ')') {
                        yyn = 295;
                        continue;
                    }
                    yyn = 1093;
                    continue;

                case 207:
                    yyst[yysp] = 207;
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 752:
                    if (yytok == ')') {
                        yyn = 296;
                        continue;
                    }
                    yyn = 1093;
                    continue;

                case 208:
                    yyst[yysp] = 208;
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 753:
                    if (yytok == ';') {
                        yyn = yyr227();
                        continue;
                    }
                    yyn = 1093;
                    continue;

                case 209:
                    yyst[yysp] = 209;
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 754:
                    if (yytok == ';') {
                        yyn = yyr226();
                        continue;
                    }
                    yyn = 1093;
                    continue;

                case 210:
                    yyst[yysp] = 210;
                    yysv[yysp] = (lexer.getSemantic()
                    );
                    yytok = (lexer.getNextToken()
                    );
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 755:
                    switch (yytok) {
                        case INTEGER -> {
                            yyn = 82;
                            continue;
                        }
                        case IDENTIFIER -> {
                            yyn = 99;
                            continue;
                        }
                        case '(' -> {
                            yyn = 100;
                            continue;
                        }
                        case ']' -> {
                            yyn = 298;
                            continue;
                        }
                    }
                    yyn = 1093;
                    continue;

                case 211:
                    yyst[yysp] = 211;
                    yysv[yysp] = (lexer.getSemantic()
                    );
                    yytok = (lexer.getNextToken()
                    );
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 756:
                    yyn = yys211();
                    continue;

                case 212:
                    yyst[yysp] = 212;
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 757:
                    if (yytok == ')') {
                        yyn = 318;
                        continue;
                    }
                    yyn = 1093;
                    continue;

                case 213:
                    yyst[yysp] = 213;
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 758:
                    if (yytok == ')') {
                        yyn = 319;
                        continue;
                    }
                    yyn = 1093;
                    continue;

                case 214:
                    yyst[yysp] = 214;
                    yysv[yysp] = (lexer.getSemantic()
                    );
                    yytok = (lexer.getNextToken()
                    );
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 759:
                    yyn = yys214();
                    continue;

                case 215:
                    yyst[yysp] = 215;
                    yysv[yysp] = (lexer.getSemantic()
                    );
                    yytok = (lexer.getNextToken()
                    );
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 760:
                    yyn = yys215();
                    continue;

                case 216:
                    yyst[yysp] = 216;
                    yysv[yysp] = (lexer.getSemantic()
                    );
                    yytok = (lexer.getNextToken()
                    );
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 761:
                    switch (yytok) {
                        case FLOAT -> {
                            yyn = 80;
                            continue;
                        }
                        case IDENTIFIER -> {
                            yyn = 81;
                            continue;
                        }
                        case INTEGER -> {
                            yyn = 82;
                            continue;
                        }
                        case '(' -> {
                            yyn = 93;
                            continue;
                        }
                    }
                    yyn = 1093;
                    continue;

                case 217:
                    yyst[yysp] = 217;
                    yysv[yysp] = (lexer.getSemantic()
                    );
                    yytok = (lexer.getNextToken()
                    );
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 762:
                    switch (yytok) {
                        case FLOAT -> {
                            yyn = 80;
                            continue;
                        }
                        case IDENTIFIER -> {
                            yyn = 81;
                            continue;
                        }
                        case INTEGER -> {
                            yyn = 82;
                            continue;
                        }
                        case '(' -> {
                            yyn = 93;
                            continue;
                        }
                    }
                    yyn = 1093;
                    continue;

                case 218:
                    yyst[yysp] = 218;
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 763:
                    switch (yytok) {
                        case FLOAT -> {
                            yyn = 80;
                            continue;
                        }
                        case IDENTIFIER -> {
                            yyn = 81;
                            continue;
                        }
                        case INTEGER -> {
                            yyn = 82;
                            continue;
                        }
                        case '(' -> {
                            yyn = 93;
                            continue;
                        }
                    }
                    yyn = 1093;
                    continue;

                case 219:
                    yyst[yysp] = 219;
                    yysv[yysp] = (lexer.getSemantic()
                    );
                    yytok = (lexer.getNextToken()
                    );
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 764:
                    yyn = yys219();
                    continue;

                case 220:
                    yyst[yysp] = 220;
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 765:
                    switch (yytok) {
                        case FLOAT -> {
                            yyn = 80;
                            continue;
                        }
                        case IDENTIFIER -> {
                            yyn = 81;
                            continue;
                        }
                        case INTEGER -> {
                            yyn = 82;
                            continue;
                        }
                        case '(' -> {
                            yyn = 93;
                            continue;
                        }
                    }
                    yyn = 1093;
                    continue;

                case 221:
                    yyst[yysp] = 221;
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 766:
                    switch (yytok) {
                        case FLOAT -> {
                            yyn = 80;
                            continue;
                        }
                        case IDENTIFIER -> {
                            yyn = 81;
                            continue;
                        }
                        case INTEGER -> {
                            yyn = 82;
                            continue;
                        }
                        case '(' -> {
                            yyn = 93;
                            continue;
                        }
                    }
                    yyn = 1093;
                    continue;

                case 222:
                    yyst[yysp] = 222;
                    yysv[yysp] = (lexer.getSemantic()
                    );
                    yytok = (lexer.getNextToken()
                    );
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 767:
                    yyn = yys222();
                    continue;

                case 223:
                    yyst[yysp] = 223;
                    yysv[yysp] = (lexer.getSemantic()
                    );
                    yytok = (lexer.getNextToken()
                    );
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 768:
                    yyn = yys223();
                    continue;

                case 224:
                    yyst[yysp] = 224;
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 769:
                    yyn = yys224();
                    continue;

                case 225:
                    yyst[yysp] = 225;
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 770:
                    switch (yytok) {
                        case '<' -> {
                            yyn = 214;
                            continue;
                        }
                        case '>' -> {
                            yyn = 215;
                            continue;
                        }
                        case ')' -> {
                            yyn = 330;
                            continue;
                        }
                    }
                    yyn = 1093;
                    continue;

                case 226:
                    yyst[yysp] = 226;
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 771:
                    yyn = yys226();
                    continue;

                case 227:
                    yyst[yysp] = 227;
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 772:
                    if (yytok == ')') {
                        yyn = 331;
                        continue;
                    }
                    yyn = 1093;
                    continue;

                case 228:
                    yyst[yysp] = 228;
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 773:
                    if (yytok == ';') {
                        yyn = 332;
                        continue;
                    }
                    yyn = 1093;
                    continue;

                case 229:
                    yyst[yysp] = 229;
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 774:
                    if (yytok == FIN) {
                        yyn = 333;
                        continue;
                    }
                    yyn = 1093;
                    continue;

                case 230:
                    yyst[yysp] = 230;
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 775:
                    yyn = yys230();
                    continue;

                case 231:
                    yyst[yysp] = 231;
                    yysv[yysp] = (lexer.getSemantic()
                    );
                    yytok = (lexer.getNextToken()
                    );
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 776:
                    yyn = yys231();
                    continue;

                case 232:
                    yyst[yysp] = 232;
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 777:
                    yyn = yys232();
                    continue;

                case 233:
                    yyst[yysp] = 233;
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 778:
                    if (yytok == ')') {
                        yyn = 338;
                        continue;
                    }
                    yyn = 1093;
                    continue;

                case 234:
                    yyst[yysp] = 234;
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 779:
                    if (yytok == ')') {
                        yyn = 339;
                        continue;
                    }
                    yyn = 1093;
                    continue;

                case 235:
                    yyst[yysp] = 235;
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 780:
                    switch (yytok) {
                        case '*' -> {
                            yyn = 183;
                            continue;
                        }
                        case '+' -> {
                            yyn = 184;
                            continue;
                        }
                        case '-' -> {
                            yyn = 185;
                            continue;
                        }
                        case '/' -> {
                            yyn = 186;
                            continue;
                        }
                        case ';' -> {
                            yyn = yyr163();
                            continue;
                        }
                    }
                    yyn = 1093;
                    continue;

                case 236:
                    yyst[yysp] = 236;
                    yysv[yysp] = (lexer.getSemantic()
                    );
                    yytok = (lexer.getNextToken()
                    );
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 781:
                    yyn = yys236();
                    continue;

                case 237:
                    yyst[yysp] = 237;
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 782:
                    if (yytok == ')') {
                        yyn = 341;
                        continue;
                    }
                    yyn = 1093;
                    continue;

                case 238:
                    yyst[yysp] = 238;
                    yysv[yysp] = (lexer.getSemantic()
                    );
                    yytok = (lexer.getNextToken()
                    );
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 783:
                    switch (yytok) {
                        case INTEGER -> {
                            yyn = 82;
                            continue;
                        }
                        case IDENTIFIER -> {
                            yyn = 99;
                            continue;
                        }
                        case '(' -> {
                            yyn = 343;
                            continue;
                        }
                    }
                    yyn = 1093;
                    continue;

                case 239:
                    yyst[yysp] = 239;
                    yysv[yysp] = (lexer.getSemantic()
                    );
                    yytok = (lexer.getNextToken()
                    );
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 784:
                    switch (yytok) {
                        case INTEGER -> {
                            yyn = 82;
                            continue;
                        }
                        case IDENTIFIER -> {
                            yyn = 99;
                            continue;
                        }
                        case '(' -> {
                            yyn = 100;
                            continue;
                        }
                    }
                    yyn = 1093;
                    continue;

                case 240:
                    yyst[yysp] = 240;
                    yysv[yysp] = (lexer.getSemantic()
                    );
                    yytok = (lexer.getNextToken()
                    );
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 785:
                    if (yytok == '[') {
                        yyn = 344;
                        continue;
                    }
                    yyn = 1093;
                    continue;

                case 241:
                    yyst[yysp] = 241;
                    yysv[yysp] = (lexer.getSemantic()
                    );
                    yytok = (lexer.getNextToken()
                    );
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 786:
                    switch (yytok) {
                        case INTEGER -> {
                            yyn = 82;
                            continue;
                        }
                        case IDENTIFIER -> {
                            yyn = 99;
                            continue;
                        }
                        case '(' -> {
                            yyn = 100;
                            continue;
                        }
                    }
                    yyn = 1093;
                    continue;

                case 242:
                    yyst[yysp] = 242;
                    yysv[yysp] = (lexer.getSemantic()
                    );
                    yytok = (lexer.getNextToken()
                    );
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 787:
                    switch (yytok) {
                        case INTEGER -> {
                            yyn = 82;
                            continue;
                        }
                        case IDENTIFIER -> {
                            yyn = 99;
                            continue;
                        }
                        case '(' -> {
                            yyn = 347;
                            continue;
                        }
                    }
                    yyn = 1093;
                    continue;

                case 243:
                    yyst[yysp] = 243;
                    yysv[yysp] = (lexer.getSemantic()
                    );
                    yytok = (lexer.getNextToken()
                    );
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 788:
                    switch (yytok) {
                        case INTEGER -> {
                            yyn = 82;
                            continue;
                        }
                        case IDENTIFIER -> {
                            yyn = 99;
                            continue;
                        }
                        case '(' -> {
                            yyn = 349;
                            continue;
                        }
                    }
                    yyn = 1093;
                    continue;

                case 244:
                    yyst[yysp] = 244;
                    yysv[yysp] = (lexer.getSemantic()
                    );
                    yytok = (lexer.getNextToken()
                    );
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 789:
                    if (yytok == '[') {
                        yyn = 350;
                        continue;
                    }
                    yyn = 1093;
                    continue;

                case 245:
                    yyst[yysp] = 245;
                    yysv[yysp] = (lexer.getSemantic()
                    );
                    yytok = (lexer.getNextToken()
                    );
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 790:
                    switch (yytok) {
                        case INTEGER -> {
                            yyn = 82;
                            continue;
                        }
                        case IDENTIFIER -> {
                            yyn = 99;
                            continue;
                        }
                        case '(' -> {
                            yyn = 100;
                            continue;
                        }
                    }
                    yyn = 1093;
                    continue;

                case 246:
                    yyst[yysp] = 246;
                    yysv[yysp] = (lexer.getSemantic()
                    );
                    yytok = (lexer.getNextToken()
                    );
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 791:
                    switch (yytok) {
                        case INTEGER -> {
                            yyn = 82;
                            continue;
                        }
                        case IDENTIFIER -> {
                            yyn = 99;
                            continue;
                        }
                        case '(' -> {
                            yyn = 100;
                            continue;
                        }
                    }
                    yyn = 1093;
                    continue;

                case 247:
                    yyst[yysp] = 247;
                    yysv[yysp] = (lexer.getSemantic()
                    );
                    yytok = (lexer.getNextToken()
                    );
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 792:
                    if (yytok == '[') {
                        yyn = 351;
                        continue;
                    }
                    yyn = 1093;
                    continue;

                case 248:
                    yyst[yysp] = 248;
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 793:
                    if (yytok == ')') {
                        yyn = 352;
                        continue;
                    }
                    yyn = 1093;
                    continue;

                case 249:
                    yyst[yysp] = 249;
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 794:
                    yyn = yys249();
                    continue;

                case 250:
                    yyst[yysp] = 250;
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 795:
                    yyn = yys250();
                    continue;

                case 251:
                    yyst[yysp] = 251;
                    yysv[yysp] = (lexer.getSemantic()
                    );
                    yytok = (lexer.getNextToken()
                    );
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 796:
                    yyn = yys251();
                    continue;

                case 252:
                    yyst[yysp] = 252;
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 797:
                    yyn = yys252();
                    continue;

                case 253:
                    yyst[yysp] = 253;
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 798:
                    yyn = yys253();
                    continue;

                case 254:
                    yyst[yysp] = 254;
                    yysv[yysp] = (lexer.getSemantic()
                    );
                    yytok = (lexer.getNextToken()
                    );
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 799:
                    yyn = yys254();
                    continue;

                case 255:
                    yyst[yysp] = 255;
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 800:
                    if (yytok == ')') {
                        yyn = 366;
                        continue;
                    }
                    yyn = 1093;
                    continue;

                case 256:
                    yyst[yysp] = 256;
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 801:
                    if (yytok == ')') {
                        yyn = 367;
                        continue;
                    }
                    yyn = 1093;
                    continue;

                case 257:
                    yyst[yysp] = 257;
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 802:
                    if (yytok == ']') {
                        yyn = 368;
                        continue;
                    }
                    yyn = 1093;
                    continue;

                case 258:
                    yyst[yysp] = 258;
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 803:
                    if (yytok == ']') {
                        yyn = 369;
                        continue;
                    }
                    yyn = 1093;
                    continue;

                case 259:
                    yyst[yysp] = 259;
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 804:
                    if (yytok == ')') {
                        yyn = 370;
                        continue;
                    }
                    yyn = 1093;
                    continue;

                case 260:
                    yyst[yysp] = 260;
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 805:
                    if (yytok == ')') {
                        yyn = 371;
                        continue;
                    }
                    yyn = 1093;
                    continue;

                case 261:
                    yyst[yysp] = 261;
                    yysv[yysp] = (lexer.getSemantic()
                    );
                    yytok = (lexer.getNextToken()
                    );
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 806:
                    yyn = yys261();
                    continue;

                case 262:
                    yyst[yysp] = 262;
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 807:
                    switch (yytok) {
                        case ';', ')', '[', '>', '<' -> {
                            yyn = yyr173();
                            continue;
                        }
                    }
                    yyn = 1093;
                    continue;

                case 263:
                    yyst[yysp] = 263;
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 808:
                    if (yytok == ')') {
                        yyn = 373;
                        continue;
                    }
                    yyn = 1093;
                    continue;

                case 264:
                    yyst[yysp] = 264;
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 809:
                    if (yytok == ')') {
                        yyn = 374;
                        continue;
                    }
                    yyn = 1093;
                    continue;

                case 265:
                    yyst[yysp] = 265;
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 810:
                    if (yytok == ')') {
                        yyn = 375;
                        continue;
                    }
                    yyn = 1093;
                    continue;

                case 266:
                    yyst[yysp] = 266;
                    yysv[yysp] = (lexer.getSemantic()
                    );
                    yytok = (lexer.getNextToken()
                    );
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 811:
                    yyn = yys266();
                    continue;

                case 267:
                    yyst[yysp] = 267;
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 812:
                    switch (yytok) {
                        case '<' -> {
                            yyn = 214;
                            continue;
                        }
                        case '>' -> {
                            yyn = 215;
                            continue;
                        }
                        case ')' -> {
                            yyn = 377;
                            continue;
                        }
                    }
                    yyn = 1093;
                    continue;

                case 268:
                    yyst[yysp] = 268;
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 813:
                    if (yytok == ']') {
                        yyn = 378;
                        continue;
                    }
                    yyn = 1093;
                    continue;

                case 269:
                    yyst[yysp] = 269;
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 814:
                    if (yytok == ']') {
                        yyn = 379;
                        continue;
                    }
                    yyn = 1093;
                    continue;

                case 270:
                    yyst[yysp] = 270;
                    yysv[yysp] = (lexer.getSemantic()
                    );
                    yytok = (lexer.getNextToken()
                    );
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 815:
                    yyn = yys270();
                    continue;

                case 271:
                    yyst[yysp] = 271;
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 816:
                    if (yytok == ')') {
                        yyn = 386;
                        continue;
                    }
                    yyn = 1093;
                    continue;

                case 272:
                    yyst[yysp] = 272;
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 817:
                    yyn = yys272();
                    continue;

                case 273:
                    yyst[yysp] = 273;
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 818:
                    yyn = yys273();
                    continue;

                case 274:
                    yyst[yysp] = 274;
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 819:
                    yyn = yys274();
                    continue;

                case 275:
                    yyst[yysp] = 275;
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 820:
                    yyn = yys275();
                    continue;

                case 276:
                    yyst[yysp] = 276;
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 821:
                    yyn = yys276();
                    continue;

                case 277:
                    yyst[yysp] = 277;
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 822:
                    yyn = yys277();
                    continue;

                case 278:
                    yyst[yysp] = 278;
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 823:
                    yyn = yys278();
                    continue;

                case 279:
                    yyst[yysp] = 279;
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 824:
                    yyn = yys279();
                    continue;

                case 280:
                    yyst[yysp] = 280;
                    yysv[yysp] = (lexer.getSemantic()
                    );
                    yytok = (lexer.getNextToken()
                    );
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 825:
                    yyn = yys280();
                    continue;

                case 281:
                    yyst[yysp] = 281;
                    yysv[yysp] = (lexer.getSemantic()
                    );
                    yytok = (lexer.getNextToken()
                    );
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 826:
                    if (yytok == ';') {
                        yyn = yyr133();
                        continue;
                    }
                    yyn = 1093;
                    continue;

                case 282:
                    yyst[yysp] = 282;
                    yysv[yysp] = (lexer.getSemantic()
                    );
                    yytok = (lexer.getNextToken()
                    );
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 827:
                    yyn = yys282();
                    continue;

                case 283:
                    yyst[yysp] = 283;
                    yysv[yysp] = (lexer.getSemantic()
                    );
                    yytok = (lexer.getNextToken()
                    );
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 828:
                    switch (yytok) {
                        case ';', ')', '[', '>', '<' -> {
                            yyn = yyr158();
                            continue;
                        }
                    }
                    yyn = 1093;
                    continue;

                case 284:
                    yyst[yysp] = 284;
                    yysv[yysp] = (lexer.getSemantic()
                    );
                    yytok = (lexer.getNextToken()
                    );
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 829:
                    switch (yytok) {
                        case ';', ')', '[', '>', '<' -> {
                            yyn = yyr151();
                            continue;
                        }
                    }
                    yyn = 1093;
                    continue;

                case 285:
                    yyst[yysp] = 285;
                    yysv[yysp] = (lexer.getSemantic()
                    );
                    yytok = (lexer.getNextToken()
                    );
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 830:
                    switch (yytok) {
                        case ';', ')', '[', '>', '<' -> {
                            yyn = yyr160();
                            continue;
                        }
                    }
                    yyn = 1093;
                    continue;

                case 286:
                    yyst[yysp] = 286;
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 831:
                    if (yytok == ')') {
                        yyn = 387;
                        continue;
                    }
                    yyn = 1093;
                    continue;

                case 287:
                    yyst[yysp] = 287;
                    yysv[yysp] = (lexer.getSemantic()
                    );
                    yytok = (lexer.getNextToken()
                    );
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 832:
                    switch (yytok) {
                        case FLOAT -> {
                            yyn = 80;
                            continue;
                        }
                        case IDENTIFIER -> {
                            yyn = 81;
                            continue;
                        }
                        case INTEGER -> {
                            yyn = 82;
                            continue;
                        }
                        case '(' -> {
                            yyn = 389;
                            continue;
                        }
                    }
                    yyn = 1093;
                    continue;

                case 288:
                    yyst[yysp] = 288;
                    yysv[yysp] = (lexer.getSemantic()
                    );
                    yytok = (lexer.getNextToken()
                    );
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 833:
                    if (yytok == ';') {
                        yyn = yyr219();
                        continue;
                    }
                    yyn = 1093;
                    continue;

                case 289:
                    yyst[yysp] = 289;
                    yysv[yysp] = (lexer.getSemantic()
                    );
                    yytok = (lexer.getNextToken()
                    );
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 834:
                    yyn = yys289();
                    continue;

                case 290:
                    yyst[yysp] = 290;
                    yysv[yysp] = (lexer.getSemantic()
                    );
                    yytok = (lexer.getNextToken()
                    );
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 835:
                    switch (yytok) {
                        case ';', ')', '[', '>', '<' -> {
                            yyn = yyr210();
                            continue;
                        }
                    }
                    yyn = 1093;
                    continue;

                case 291:
                    yyst[yysp] = 291;
                    yysv[yysp] = (lexer.getSemantic()
                    );
                    yytok = (lexer.getNextToken()
                    );
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 836:
                    switch (yytok) {
                        case ';', ')', '[', '>', '<' -> {
                            yyn = yyr207();
                            continue;
                        }
                    }
                    yyn = 1093;
                    continue;

                case 292:
                    yyst[yysp] = 292;
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 837:
                    if (yytok == ']') {
                        yyn = 391;
                        continue;
                    }
                    yyn = 1093;
                    continue;

                case 293:
                    yyst[yysp] = 293;
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 838:
                    if (yytok == ']') {
                        yyn = 392;
                        continue;
                    }
                    yyn = 1093;
                    continue;

                case 294:
                    yyst[yysp] = 294;
                    yysv[yysp] = (lexer.getSemantic()
                    );
                    yytok = (lexer.getNextToken()
                    );
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 839:
                    if (yytok == ';') {
                        yyn = yyr132();
                        continue;
                    }
                    yyn = 1093;
                    continue;

                case 295:
                    yyst[yysp] = 295;
                    yysv[yysp] = (lexer.getSemantic()
                    );
                    yytok = (lexer.getNextToken()
                    );
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 840:
                    if (yytok == ';') {
                        yyn = yyr135();
                        continue;
                    }
                    yyn = 1093;
                    continue;

                case 296:
                    yyst[yysp] = 296;
                    yysv[yysp] = (lexer.getSemantic()
                    );
                    yytok = (lexer.getNextToken()
                    );
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 841:
                    if (yytok == ';') {
                        yyn = yyr136();
                        continue;
                    }
                    yyn = 1093;
                    continue;

                case 297:
                    yyst[yysp] = 297;
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 842:
                    switch (yytok) {
                        case '*' -> {
                            yyn = 183;
                            continue;
                        }
                        case '+' -> {
                            yyn = 184;
                            continue;
                        }
                        case '-' -> {
                            yyn = 185;
                            continue;
                        }
                        case '/' -> {
                            yyn = 186;
                            continue;
                        }
                        case ']' -> {
                            yyn = 393;
                            continue;
                        }
                    }
                    yyn = 1093;
                    continue;

                case 298:
                    yyst[yysp] = 298;
                    yysv[yysp] = (lexer.getSemantic()
                    );
                    yytok = (lexer.getNextToken()
                    );
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 843:
                    if (yytok == ';') {
                        yyn = yyr201();
                        continue;
                    }
                    yyn = 1093;
                    continue;

                case 299:
                    yyst[yysp] = 299;
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 844:
                    if (yytok == ';') {
                        yyn = yyr113();
                        continue;
                    }
                    yyn = 1093;
                    continue;

                case 300:
                    yyst[yysp] = 300;
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 845:
                    yyn = yys300();
                    continue;

                case 301:
                    yyst[yysp] = 301;
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 846:
                    if (yytok == ';') {
                        yyn = yyr110();
                        continue;
                    }
                    yyn = 1093;
                    continue;

                case 302:
                    yyst[yysp] = 302;
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 847:
                    switch (yytok) {
                        case '>', '<' -> {
                            yyn = yyr90();
                            continue;
                        }
                        case ';' -> {
                            yyn = yyr112();
                            continue;
                        }
                    }
                    yyn = 1093;
                    continue;

                case 303:
                    yyst[yysp] = 303;
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 848:
                    switch (yytok) {
                        case '<' -> {
                            yyn = 398;
                            continue;
                        }
                        case '>' -> {
                            yyn = 399;
                            continue;
                        }
                    }
                    yyn = 1093;
                    continue;

                case 304:
                    yyst[yysp] = 304;
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 849:
                    switch (yytok) {
                        case '>', '<' -> {
                            yyn = yyr89();
                            continue;
                        }
                        case ';' -> {
                            yyn = yyr111();
                            continue;
                        }
                    }
                    yyn = 1093;
                    continue;

                case 305:
                    yyst[yysp] = 305;
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 850:
                    yyn = yys305();
                    continue;

                case 306:
                    yyst[yysp] = 306;
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 851:
                    if (yytok == ';') {
                        yyn = yyr109();
                        continue;
                    }
                    yyn = 1093;
                    continue;

                case 307:
                    yyst[yysp] = 307;
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 852:
                    switch (yytok) {
                        case '<' -> {
                            yyn = 404;
                            continue;
                        }
                        case '>' -> {
                            yyn = 405;
                            continue;
                        }
                    }
                    yyn = 1093;
                    continue;

                case 308:
                    yyst[yysp] = 308;
                    yysv[yysp] = (lexer.getSemantic()
                    );
                    yytok = (lexer.getNextToken()
                    );
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 853:
                    if (yytok == ';') {
                        yyn = yyr88();
                        continue;
                    }
                    yyn = 1093;
                    continue;

                case 309:
                    yyst[yysp] = 309;
                    yysv[yysp] = (lexer.getSemantic()
                    );
                    yytok = (lexer.getNextToken()
                    );
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 854:
                    yyn = yys309();
                    continue;

                case 310:
                    yyst[yysp] = 310;
                    yysv[yysp] = (lexer.getSemantic()
                    );
                    yytok = (lexer.getNextToken()
                    );
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 855:
                    yyn = yys310();
                    continue;

                case 311:
                    yyst[yysp] = 311;
                    yysv[yysp] = (lexer.getSemantic()
                    );
                    yytok = (lexer.getNextToken()
                    );
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 856:
                    switch (yytok) {
                        case FLOAT -> {
                            yyn = 80;
                            continue;
                        }
                        case IDENTIFIER -> {
                            yyn = 81;
                            continue;
                        }
                        case INTEGER -> {
                            yyn = 82;
                            continue;
                        }
                        case '(' -> {
                            yyn = 407;
                            continue;
                        }
                    }
                    yyn = 1093;
                    continue;

                case 312:
                    yyst[yysp] = 312;
                    yysv[yysp] = (lexer.getSemantic()
                    );
                    yytok = (lexer.getNextToken()
                    );
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 857:
                    yyn = yys312();
                    continue;

                case 313:
                    yyst[yysp] = 313;
                    yysv[yysp] = (lexer.getSemantic()
                    );
                    yytok = (lexer.getNextToken()
                    );
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 858:
                    switch (yytok) {
                        case FLOAT -> {
                            yyn = 80;
                            continue;
                        }
                        case IDENTIFIER -> {
                            yyn = 81;
                            continue;
                        }
                        case INTEGER -> {
                            yyn = 82;
                            continue;
                        }
                        case '(' -> {
                            yyn = 409;
                            continue;
                        }
                    }
                    yyn = 1093;
                    continue;

                case 314:
                    yyst[yysp] = 314;
                    yysv[yysp] = (lexer.getSemantic()
                    );
                    yytok = (lexer.getNextToken()
                    );
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 859:
                    switch (yytok) {
                        case FLOAT -> {
                            yyn = 80;
                            continue;
                        }
                        case IDENTIFIER -> {
                            yyn = 81;
                            continue;
                        }
                        case INTEGER -> {
                            yyn = 82;
                            continue;
                        }
                        case '(' -> {
                            yyn = 411;
                            continue;
                        }
                    }
                    yyn = 1093;
                    continue;

                case 315:
                    yyst[yysp] = 315;
                    yysv[yysp] = (lexer.getSemantic()
                    );
                    yytok = (lexer.getNextToken()
                    );
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 860:
                    if (yytok == '(') {
                        yyn = 412;
                        continue;
                    }
                    yyn = 1093;
                    continue;

                case 316:
                    yyst[yysp] = 316;
                    yysv[yysp] = (lexer.getSemantic()
                    );
                    yytok = (lexer.getNextToken()
                    );
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 861:
                    if (yytok == '(') {
                        yyn = 413;
                        continue;
                    }
                    yyn = 1093;
                    continue;

                case 317:
                    yyst[yysp] = 317;
                    yysv[yysp] = (lexer.getSemantic()
                    );
                    yytok = (lexer.getNextToken()
                    );
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 862:
                    yyn = yys317();
                    continue;

                case 318:
                    yyst[yysp] = 318;
                    yysv[yysp] = (lexer.getSemantic()
                    );
                    yytok = (lexer.getNextToken()
                    );
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 863:
                    switch (yytok) {
                        case ';', ')', '[', '>', '<' -> {
                            yyn = yyr159();
                            continue;
                        }
                    }
                    yyn = 1093;
                    continue;

                case 319:
                    yyst[yysp] = 319;
                    yysv[yysp] = (lexer.getSemantic()
                    );
                    yytok = (lexer.getNextToken()
                    );
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 864:
                    switch (yytok) {
                        case ';', ')', '[', '>', '<' -> {
                            yyn = yyr152();
                            continue;
                        }
                    }
                    yyn = 1093;
                    continue;

                case 320:
                    yyst[yysp] = 320;
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 865:
                    switch (yytok) {
                        case ';', ')', '[' -> {
                            yyn = yyr54();
                            continue;
                        }
                    }
                    yyn = 1093;
                    continue;

                case 321:
                    yyst[yysp] = 321;
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 866:
                    switch (yytok) {
                        case ';', ')', '[' -> {
                            yyn = yyr55();
                            continue;
                        }
                    }
                    yyn = 1093;
                    continue;

                case 322:
                    yyst[yysp] = 322;
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 867:
                    switch (yytok) {
                        case ';', ')', '[' -> {
                            yyn = yyr50();
                            continue;
                        }
                    }
                    yyn = 1093;
                    continue;

                case 323:
                    yyst[yysp] = 323;
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 868:
                    switch (yytok) {
                        case ';', ')', '[' -> {
                            yyn = yyr51();
                            continue;
                        }
                    }
                    yyn = 1093;
                    continue;

                case 324:
                    yyst[yysp] = 324;
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 869:
                    switch (yytok) {
                        case ';', ')', '[' -> {
                            yyn = yyr56();
                            continue;
                        }
                    }
                    yyn = 1093;
                    continue;

                case 325:
                    yyst[yysp] = 325;
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 870:
                    if (yytok == ')') {
                        yyn = 418;
                        continue;
                    }
                    yyn = 1093;
                    continue;

                case 326:
                    yyst[yysp] = 326;
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 871:
                    switch (yytok) {
                        case ';', ')', '[' -> {
                            yyn = yyr60();
                            continue;
                        }
                    }
                    yyn = 1093;
                    continue;

                case 327:
                    yyst[yysp] = 327;
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 872:
                    switch (yytok) {
                        case ';', ')', '[' -> {
                            yyn = yyr61();
                            continue;
                        }
                    }
                    yyn = 1093;
                    continue;

                case 328:
                    yyst[yysp] = 328;
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 873:
                    if (yytok == ')') {
                        yyn = 419;
                        continue;
                    }
                    yyn = 1093;
                    continue;

                case 329:
                    yyst[yysp] = 329;
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 874:
                    if (yytok == ')') {
                        yyn = 420;
                        continue;
                    }
                    yyn = 1093;
                    continue;

                case 330:
                    yyst[yysp] = 330;
                    yysv[yysp] = (lexer.getSemantic()
                    );
                    yytok = (lexer.getNextToken()
                    );
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 875:
                    switch (yytok) {
                        case '<' -> {
                            yyn = 421;
                            continue;
                        }
                        case '>' -> {
                            yyn = 422;
                            continue;
                        }
                        case ';' -> {
                            yyn = yyr142();
                            continue;
                        }
                    }
                    yyn = 1093;
                    continue;

                case 331:
                    yyst[yysp] = 331;
                    yysv[yysp] = (lexer.getSemantic()
                    );
                    yytok = (lexer.getNextToken()
                    );
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 876:
                    switch (yytok) {
                        case ';', ')', '[' -> {
                            yyn = yyr62();
                            continue;
                        }
                    }
                    yyn = 1093;
                    continue;

                case 332:
                    yyst[yysp] = 332;
                    yysv[yysp] = (lexer.getSemantic()
                    );
                    yytok = (lexer.getNextToken()
                    );
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 877:
                    yyn = yys332();
                    continue;

                case 333:
                    yyst[yysp] = 333;
                    yysv[yysp] = (lexer.getSemantic()
                    );
                    yytok = (lexer.getNextToken()
                    );
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 878:
                    if (yytok == ';') {
                        yyn = yyr225();
                        continue;
                    }
                    yyn = 1093;
                    continue;

                case 334:
                    yyst[yysp] = 334;
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 879:
                    if (yytok == FIN) {
                        yyn = 424;
                        continue;
                    }
                    yyn = 1093;
                    continue;

                case 335:
                    yyst[yysp] = 335;
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 880:
                    yyn = yys335();
                    continue;

                case 336:
                    yyst[yysp] = 336;
                    yysv[yysp] = (lexer.getSemantic()
                    );
                    yytok = (lexer.getNextToken()
                    );
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 881:
                    yyn = yys336();
                    continue;

                case 337:
                    yyst[yysp] = 337;
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 882:
                    switch (yytok) {
                        case '*' -> {
                            yyn = 183;
                            continue;
                        }
                        case '+' -> {
                            yyn = 184;
                            continue;
                        }
                        case '-' -> {
                            yyn = 185;
                            continue;
                        }
                        case '/' -> {
                            yyn = 186;
                            continue;
                        }
                        case ']' -> {
                            yyn = 426;
                            continue;
                        }
                    }
                    yyn = 1093;
                    continue;

                case 338:
                    yyst[yysp] = 338;
                    yysv[yysp] = (lexer.getSemantic()
                    );
                    yytok = (lexer.getNextToken()
                    );
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 883:
                    if (yytok == ';') {
                        yyn = yyr137();
                        continue;
                    }
                    yyn = 1093;
                    continue;

                case 339:
                    yyst[yysp] = 339;
                    yysv[yysp] = (lexer.getSemantic()
                    );
                    yytok = (lexer.getNextToken()
                    );
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 884:
                    if (yytok == ';') {
                        yyn = yyr138();
                        continue;
                    }
                    yyn = 1093;
                    continue;

                case 340:
                    yyst[yysp] = 340;
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 885:
                    if (yytok == ')') {
                        yyn = 427;
                        continue;
                    }
                    yyn = 1093;
                    continue;

                case 341:
                    yyst[yysp] = 341;
                    yysv[yysp] = (lexer.getSemantic()
                    );
                    yytok = (lexer.getNextToken()
                    );
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 886:
                    switch (yytok) {
                        case INTEGER -> {
                            yyn = 82;
                            continue;
                        }
                        case IDENTIFIER -> {
                            yyn = 99;
                            continue;
                        }
                        case '(' -> {
                            yyn = 429;
                            continue;
                        }
                    }
                    yyn = 1093;
                    continue;

                case 342:
                    yyst[yysp] = 342;
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 887:
                    switch (yytok) {
                        case '*' -> {
                            yyn = 183;
                            continue;
                        }
                        case '+' -> {
                            yyn = 184;
                            continue;
                        }
                        case '-' -> {
                            yyn = 185;
                            continue;
                        }
                        case '/' -> {
                            yyn = 186;
                            continue;
                        }
                        case ')' -> {
                            yyn = yyr148();
                            continue;
                        }
                    }
                    yyn = 1093;
                    continue;

                case 343:
                    yyst[yysp] = 343;
                    yysv[yysp] = (lexer.getSemantic()
                    );
                    yytok = (lexer.getNextToken()
                    );
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 888:
                    yyn = yys343();
                    continue;

                case 344:
                    yyst[yysp] = 344;
                    yysv[yysp] = (lexer.getSemantic()
                    );
                    yytok = (lexer.getNextToken()
                    );
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 889:
                    switch (yytok) {
                        case INTEGER -> {
                            yyn = 82;
                            continue;
                        }
                        case IDENTIFIER -> {
                            yyn = 99;
                            continue;
                        }
                        case '(' -> {
                            yyn = 100;
                            continue;
                        }
                    }
                    yyn = 1093;
                    continue;

                case 345:
                    yyst[yysp] = 345;
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 890:
                    switch (yytok) {
                        case '*' -> {
                            yyn = 183;
                            continue;
                        }
                        case '+' -> {
                            yyn = 184;
                            continue;
                        }
                        case '-' -> {
                            yyn = 185;
                            continue;
                        }
                        case '/' -> {
                            yyn = 186;
                            continue;
                        }
                        case '[' -> {
                            yyn = 430;
                            continue;
                        }
                    }
                    yyn = 1093;
                    continue;

                case 346:
                    yyst[yysp] = 346;
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 891:
                    switch (yytok) {
                        case '*' -> {
                            yyn = 183;
                            continue;
                        }
                        case '+' -> {
                            yyn = 184;
                            continue;
                        }
                        case '-' -> {
                            yyn = 185;
                            continue;
                        }
                        case '/' -> {
                            yyn = 186;
                            continue;
                        }
                        case ')' -> {
                            yyn = yyr149();
                            continue;
                        }
                    }
                    yyn = 1093;
                    continue;

                case 347:
                    yyst[yysp] = 347;
                    yysv[yysp] = (lexer.getSemantic()
                    );
                    yytok = (lexer.getNextToken()
                    );
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 892:
                    yyn = yys347();
                    continue;

                case 348:
                    yyst[yysp] = 348;
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 893:
                    yyn = yys348();
                    continue;

                case 349:
                    yyst[yysp] = 349;
                    yysv[yysp] = (lexer.getSemantic()
                    );
                    yytok = (lexer.getNextToken()
                    );
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 894:
                    yyn = yys349();
                    continue;

                case 350:
                    yyst[yysp] = 350;
                    yysv[yysp] = (lexer.getSemantic()
                    );
                    yytok = (lexer.getNextToken()
                    );
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 895:
                    switch (yytok) {
                        case INTEGER -> {
                            yyn = 82;
                            continue;
                        }
                        case IDENTIFIER -> {
                            yyn = 99;
                            continue;
                        }
                        case '(' -> {
                            yyn = 100;
                            continue;
                        }
                    }
                    yyn = 1093;
                    continue;

                case 351:
                    yyst[yysp] = 351;
                    yysv[yysp] = (lexer.getSemantic()
                    );
                    yytok = (lexer.getNextToken()
                    );
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 896:
                    switch (yytok) {
                        case INTEGER -> {
                            yyn = 82;
                            continue;
                        }
                        case IDENTIFIER -> {
                            yyn = 99;
                            continue;
                        }
                        case '(' -> {
                            yyn = 100;
                            continue;
                        }
                    }
                    yyn = 1093;
                    continue;

                case 352:
                    yyst[yysp] = 352;
                    yysv[yysp] = (lexer.getSemantic()
                    );
                    yytok = (lexer.getNextToken()
                    );
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 897:
                    if (yytok == ';') {
                        yyn = yyr139();
                        continue;
                    }
                    yyn = 1093;
                    continue;

                case 353:
                    yyst[yysp] = 353;
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 898:
                    if (yytok == ')') {
                        yyn = 433;
                        continue;
                    }
                    yyn = 1093;
                    continue;

                case 354:
                    yyst[yysp] = 354;
                    yysv[yysp] = (lexer.getSemantic()
                    );
                    yytok = (lexer.getNextToken()
                    );
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 899:
                    switch (yytok) {
                        case FLOAT -> {
                            yyn = 80;
                            continue;
                        }
                        case IDENTIFIER -> {
                            yyn = 81;
                            continue;
                        }
                        case INTEGER -> {
                            yyn = 82;
                            continue;
                        }
                        case '(' -> {
                            yyn = 434;
                            continue;
                        }
                    }
                    yyn = 1093;
                    continue;

                case 355:
                    yyst[yysp] = 355;
                    yysv[yysp] = (lexer.getSemantic()
                    );
                    yytok = (lexer.getNextToken()
                    );
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 900:
                    switch (yytok) {
                        case FLOAT -> {
                            yyn = 80;
                            continue;
                        }
                        case IDENTIFIER -> {
                            yyn = 81;
                            continue;
                        }
                        case INTEGER -> {
                            yyn = 82;
                            continue;
                        }
                        case '(' -> {
                            yyn = 93;
                            continue;
                        }
                    }
                    yyn = 1093;
                    continue;

                case 356:
                    yyst[yysp] = 356;
                    yysv[yysp] = (lexer.getSemantic()
                    );
                    yytok = (lexer.getNextToken()
                    );
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 901:
                    if (yytok == '[') {
                        yyn = 435;
                        continue;
                    }
                    yyn = 1093;
                    continue;

                case 357:
                    yyst[yysp] = 357;
                    yysv[yysp] = (lexer.getSemantic()
                    );
                    yytok = (lexer.getNextToken()
                    );
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 902:
                    switch (yytok) {
                        case INTEGER -> {
                            yyn = 82;
                            continue;
                        }
                        case IDENTIFIER -> {
                            yyn = 99;
                            continue;
                        }
                        case '(' -> {
                            yyn = 100;
                            continue;
                        }
                    }
                    yyn = 1093;
                    continue;

                case 358:
                    yyst[yysp] = 358;
                    yysv[yysp] = (lexer.getSemantic()
                    );
                    yytok = (lexer.getNextToken()
                    );
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 903:
                    switch (yytok) {
                        case FLOAT -> {
                            yyn = 80;
                            continue;
                        }
                        case IDENTIFIER -> {
                            yyn = 81;
                            continue;
                        }
                        case INTEGER -> {
                            yyn = 82;
                            continue;
                        }
                        case '(' -> {
                            yyn = 437;
                            continue;
                        }
                    }
                    yyn = 1093;
                    continue;

                case 359:
                    yyst[yysp] = 359;
                    yysv[yysp] = (lexer.getSemantic()
                    );
                    yytok = (lexer.getNextToken()
                    );
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 904:
                    switch (yytok) {
                        case FLOAT -> {
                            yyn = 80;
                            continue;
                        }
                        case IDENTIFIER -> {
                            yyn = 81;
                            continue;
                        }
                        case INTEGER -> {
                            yyn = 82;
                            continue;
                        }
                        case '(' -> {
                            yyn = 439;
                            continue;
                        }
                    }
                    yyn = 1093;
                    continue;

                case 360:
                    yyst[yysp] = 360;
                    yysv[yysp] = (lexer.getSemantic()
                    );
                    yytok = (lexer.getNextToken()
                    );
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 905:
                    if (yytok == '[') {
                        yyn = 440;
                        continue;
                    }
                    yyn = 1093;
                    continue;

                case 361:
                    yyst[yysp] = 361;
                    yysv[yysp] = (lexer.getSemantic()
                    );
                    yytok = (lexer.getNextToken()
                    );
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 906:
                    switch (yytok) {
                        case FLOAT -> {
                            yyn = 80;
                            continue;
                        }
                        case IDENTIFIER -> {
                            yyn = 81;
                            continue;
                        }
                        case INTEGER -> {
                            yyn = 82;
                            continue;
                        }
                        case '(' -> {
                            yyn = 93;
                            continue;
                        }
                    }
                    yyn = 1093;
                    continue;

                case 362:
                    yyst[yysp] = 362;
                    yysv[yysp] = (lexer.getSemantic()
                    );
                    yytok = (lexer.getNextToken()
                    );
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 907:
                    switch (yytok) {
                        case FLOAT -> {
                            yyn = 80;
                            continue;
                        }
                        case IDENTIFIER -> {
                            yyn = 81;
                            continue;
                        }
                        case INTEGER -> {
                            yyn = 82;
                            continue;
                        }
                        case '(' -> {
                            yyn = 93;
                            continue;
                        }
                    }
                    yyn = 1093;
                    continue;

                case 363:
                    yyst[yysp] = 363;
                    yysv[yysp] = (lexer.getSemantic()
                    );
                    yytok = (lexer.getNextToken()
                    );
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 908:
                    if (yytok == '[') {
                        yyn = 441;
                        continue;
                    }
                    yyn = 1093;
                    continue;

                case 364:
                    yyst[yysp] = 364;
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 909:
                    if (yytok == ')') {
                        yyn = 442;
                        continue;
                    }
                    yyn = 1093;
                    continue;

                case 365:
                    yyst[yysp] = 365;
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 910:
                    if (yytok == ')') {
                        yyn = 443;
                        continue;
                    }
                    yyn = 1093;
                    continue;

                case 366:
                    yyst[yysp] = 366;
                    yysv[yysp] = (lexer.getSemantic()
                    );
                    yytok = (lexer.getNextToken()
                    );
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 911:
                    switch (yytok) {
                        case FLOAT -> {
                            yyn = 80;
                            continue;
                        }
                        case IDENTIFIER -> {
                            yyn = 81;
                            continue;
                        }
                        case INTEGER -> {
                            yyn = 82;
                            continue;
                        }
                        case '(' -> {
                            yyn = 446;
                            continue;
                        }
                    }
                    yyn = 1093;
                    continue;

                case 367:
                    yyst[yysp] = 367;
                    yysv[yysp] = (lexer.getSemantic()
                    );
                    yytok = (lexer.getNextToken()
                    );
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 912:
                    switch (yytok) {
                        case INTEGER -> {
                            yyn = 82;
                            continue;
                        }
                        case IDENTIFIER -> {
                            yyn = 99;
                            continue;
                        }
                        case '(' -> {
                            yyn = 448;
                            continue;
                        }
                    }
                    yyn = 1093;
                    continue;

                case 368:
                    yyst[yysp] = 368;
                    yysv[yysp] = (lexer.getSemantic()
                    );
                    yytok = (lexer.getNextToken()
                    );
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 913:
                    switch (yytok) {
                        case ';', ')', '[', '>', '<' -> {
                            yyn = yyr212();
                            continue;
                        }
                    }
                    yyn = 1093;
                    continue;

                case 369:
                    yyst[yysp] = 369;
                    yysv[yysp] = (lexer.getSemantic()
                    );
                    yytok = (lexer.getNextToken()
                    );
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 914:
                    switch (yytok) {
                        case ';', ')', '[', '>', '<' -> {
                            yyn = yyr209();
                            continue;
                        }
                    }
                    yyn = 1093;
                    continue;

                case 370:
                    yyst[yysp] = 370;
                    yysv[yysp] = (lexer.getSemantic()
                    );
                    yytok = (lexer.getNextToken()
                    );
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 915:
                    switch (yytok) {
                        case ';', ')', '[', '>', '<' -> {
                            yyn = yyr161();
                            continue;
                        }
                    }
                    yyn = 1093;
                    continue;

                case 371:
                    yyst[yysp] = 371;
                    yysv[yysp] = (lexer.getSemantic()
                    );
                    yytok = (lexer.getNextToken()
                    );
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 916:
                    switch (yytok) {
                        case ';', ')', '[', '>', '<' -> {
                            yyn = yyr150();
                            continue;
                        }
                    }
                    yyn = 1093;
                    continue;

                case 372:
                    yyst[yysp] = 372;
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 917:
                    if (yytok == ']') {
                        yyn = 449;
                        continue;
                    }
                    yyn = 1093;
                    continue;

                case 373:
                    yyst[yysp] = 373;
                    yysv[yysp] = (lexer.getSemantic()
                    );
                    yytok = (lexer.getNextToken()
                    );
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 918:
                    if (yytok == '(') {
                        yyn = 450;
                        continue;
                    }
                    yyn = 1093;
                    continue;

                case 374:
                    yyst[yysp] = 374;
                    yysv[yysp] = (lexer.getSemantic()
                    );
                    yytok = (lexer.getNextToken()
                    );
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 919:
                    if (yytok == ';') {
                        yyn = yyr134();
                        continue;
                    }
                    yyn = 1093;
                    continue;

                case 375:
                    yyst[yysp] = 375;
                    yysv[yysp] = (lexer.getSemantic()
                    );
                    yytok = (lexer.getNextToken()
                    );
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 920:
                    switch (yytok) {
                        case ';', ')', '[', '>', '<' -> {
                            yyn = yyr162();
                            continue;
                        }
                    }
                    yyn = 1093;
                    continue;

                case 376:
                    yyst[yysp] = 376;
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 921:
                    if (yytok == ']') {
                        yyn = 451;
                        continue;
                    }
                    yyn = 1093;
                    continue;

                case 377:
                    yyst[yysp] = 377;
                    yysv[yysp] = (lexer.getSemantic()
                    );
                    yytok = (lexer.getNextToken()
                    );
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 922:
                    switch (yytok) {
                        case '<' -> {
                            yyn = 421;
                            continue;
                        }
                        case '>' -> {
                            yyn = 422;
                            continue;
                        }
                    }
                    yyn = 1093;
                    continue;

                case 378:
                    yyst[yysp] = 378;
                    yysv[yysp] = (lexer.getSemantic()
                    );
                    yytok = (lexer.getNextToken()
                    );
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 923:
                    switch (yytok) {
                        case ';', ')', '[', '>', '<' -> {
                            yyn = yyr211();
                            continue;
                        }
                    }
                    yyn = 1093;
                    continue;

                case 379:
                    yyst[yysp] = 379;
                    yysv[yysp] = (lexer.getSemantic()
                    );
                    yytok = (lexer.getNextToken()
                    );
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 924:
                    switch (yytok) {
                        case ';', ')', '[', '>', '<' -> {
                            yyn = yyr208();
                            continue;
                        }
                    }
                    yyn = 1093;
                    continue;

                case 380:
                    yyst[yysp] = 380;
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 925:
                    if (yytok == ';') {
                        yyn = yyr107();
                        continue;
                    }
                    yyn = 1093;
                    continue;

                case 381:
                    yyst[yysp] = 381;
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 926:
                    if (yytok == ';') {
                        yyn = yyr104();
                        continue;
                    }
                    yyn = 1093;
                    continue;

                case 382:
                    yyst[yysp] = 382;
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 927:
                    switch (yytok) {
                        case ';' -> {
                            yyn = yyr106();
                            continue;
                        }
                        case '>', '<' -> {
                            yyn = yyr90();
                            continue;
                        }
                    }
                    yyn = 1093;
                    continue;

                case 383:
                    yyst[yysp] = 383;
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 928:
                    switch (yytok) {
                        case ';' -> {
                            yyn = yyr105();
                            continue;
                        }
                        case '>', '<' -> {
                            yyn = yyr89();
                            continue;
                        }
                    }
                    yyn = 1093;
                    continue;

                case 384:
                    yyst[yysp] = 384;
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 929:
                    if (yytok == ';') {
                        yyn = yyr103();
                        continue;
                    }
                    yyn = 1093;
                    continue;

                case 385:
                    yyst[yysp] = 385;
                    yysv[yysp] = (lexer.getSemantic()
                    );
                    yytok = (lexer.getNextToken()
                    );
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 930:
                    yyn = yys385();
                    continue;

                case 386:
                    yyst[yysp] = 386;
                    yysv[yysp] = (lexer.getSemantic()
                    );
                    yytok = (lexer.getNextToken()
                    );
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 931:
                    if (yytok == ';') {
                        yyn = yyr144();
                        continue;
                    }
                    yyn = 1093;
                    continue;

                case 387:
                    yyst[yysp] = 387;
                    yysv[yysp] = (lexer.getSemantic()
                    );
                    yytok = (lexer.getNextToken()
                    );
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 932:
                    switch (yytok) {
                        case ';', ')', '[', '>', '<' -> {
                            yyn = yyr185();
                            continue;
                        }
                    }
                    yyn = 1093;
                    continue;

                case 388:
                    yyst[yysp] = 388;
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 933:
                    switch (yytok) {
                        case ';', ')', '[', '>', '<' -> {
                            yyn = yyr184();
                            continue;
                        }
                    }
                    yyn = 1093;
                    continue;

                case 389:
                    yyst[yysp] = 389;
                    yysv[yysp] = (lexer.getSemantic()
                    );
                    yytok = (lexer.getNextToken()
                    );
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 934:
                    yyn = yys389();
                    continue;

                case 390:
                    yyst[yysp] = 390;
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 935:
                    if (yytok == ']') {
                        yyn = yyr217();
                        continue;
                    }
                    yyn = 1093;
                    continue;

                case 391:
                    yyst[yysp] = 391;
                    yysv[yysp] = (lexer.getSemantic()
                    );
                    yytok = (lexer.getNextToken()
                    );
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 936:
                    switch (yytok) {
                        case ';', ')', '[', '>', '<' -> {
                            yyn = yyr216();
                            continue;
                        }
                    }
                    yyn = 1093;
                    continue;

                case 392:
                    yyst[yysp] = 392;
                    yysv[yysp] = (lexer.getSemantic()
                    );
                    yytok = (lexer.getNextToken()
                    );
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 937:
                    switch (yytok) {
                        case ';', ')', '[', '>', '<' -> {
                            yyn = yyr215();
                            continue;
                        }
                    }
                    yyn = 1093;
                    continue;

                case 393:
                    yyst[yysp] = 393;
                    yysv[yysp] = (lexer.getSemantic()
                    );
                    yytok = (lexer.getNextToken()
                    );
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 938:
                    if (yytok == ';') {
                        yyn = yyr202();
                        continue;
                    }
                    yyn = 1093;
                    continue;

                case 394:
                    yyst[yysp] = 394;
                    yysv[yysp] = (lexer.getSemantic()
                    );
                    yytok = (lexer.getNextToken()
                    );
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 939:
                    switch (yytok) {
                        case FLOAT -> {
                            yyn = 80;
                            continue;
                        }
                        case IDENTIFIER -> {
                            yyn = 81;
                            continue;
                        }
                        case INTEGER -> {
                            yyn = 82;
                            continue;
                        }
                        case '(' -> {
                            yyn = 93;
                            continue;
                        }
                    }
                    yyn = 1093;
                    continue;

                case 395:
                    yyst[yysp] = 395;
                    yysv[yysp] = (lexer.getSemantic()
                    );
                    yytok = (lexer.getNextToken()
                    );
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 940:
                    switch (yytok) {
                        case FLOAT -> {
                            yyn = 80;
                            continue;
                        }
                        case IDENTIFIER -> {
                            yyn = 81;
                            continue;
                        }
                        case INTEGER -> {
                            yyn = 82;
                            continue;
                        }
                        case '(' -> {
                            yyn = 93;
                            continue;
                        }
                    }
                    yyn = 1093;
                    continue;

                case 396:
                    yyst[yysp] = 396;
                    yysv[yysp] = (lexer.getSemantic()
                    );
                    yytok = (lexer.getNextToken()
                    );
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 941:
                    switch (yytok) {
                        case FLOAT -> {
                            yyn = 80;
                            continue;
                        }
                        case IDENTIFIER -> {
                            yyn = 81;
                            continue;
                        }
                        case INTEGER -> {
                            yyn = 82;
                            continue;
                        }
                        case '(' -> {
                            yyn = 93;
                            continue;
                        }
                    }
                    yyn = 1093;
                    continue;

                case 397:
                    yyst[yysp] = 397;
                    yysv[yysp] = (lexer.getSemantic()
                    );
                    yytok = (lexer.getNextToken()
                    );
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 942:
                    switch (yytok) {
                        case FLOAT -> {
                            yyn = 80;
                            continue;
                        }
                        case IDENTIFIER -> {
                            yyn = 81;
                            continue;
                        }
                        case INTEGER -> {
                            yyn = 82;
                            continue;
                        }
                        case '(' -> {
                            yyn = 93;
                            continue;
                        }
                    }
                    yyn = 1093;
                    continue;

                case 398:
                    yyst[yysp] = 398;
                    yysv[yysp] = (lexer.getSemantic()
                    );
                    yytok = (lexer.getNextToken()
                    );
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 943:
                    yyn = yys398();
                    continue;

                case 399:
                    yyst[yysp] = 399;
                    yysv[yysp] = (lexer.getSemantic()
                    );
                    yytok = (lexer.getNextToken()
                    );
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 944:
                    yyn = yys399();
                    continue;

                case 400:
                    yyst[yysp] = 400;
                    yysv[yysp] = (lexer.getSemantic()
                    );
                    yytok = (lexer.getNextToken()
                    );
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 945:
                    switch (yytok) {
                        case INTEGER -> {
                            yyn = 82;
                            continue;
                        }
                        case IDENTIFIER -> {
                            yyn = 99;
                            continue;
                        }
                        case '(' -> {
                            yyn = 100;
                            continue;
                        }
                    }
                    yyn = 1093;
                    continue;

                case 401:
                    yyst[yysp] = 401;
                    yysv[yysp] = (lexer.getSemantic()
                    );
                    yytok = (lexer.getNextToken()
                    );
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 946:
                    switch (yytok) {
                        case INTEGER -> {
                            yyn = 82;
                            continue;
                        }
                        case IDENTIFIER -> {
                            yyn = 99;
                            continue;
                        }
                        case '(' -> {
                            yyn = 100;
                            continue;
                        }
                    }
                    yyn = 1093;
                    continue;

                case 402:
                    yyst[yysp] = 402;
                    yysv[yysp] = (lexer.getSemantic()
                    );
                    yytok = (lexer.getNextToken()
                    );
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 947:
                    switch (yytok) {
                        case INTEGER -> {
                            yyn = 82;
                            continue;
                        }
                        case IDENTIFIER -> {
                            yyn = 99;
                            continue;
                        }
                        case '(' -> {
                            yyn = 100;
                            continue;
                        }
                    }
                    yyn = 1093;
                    continue;

                case 403:
                    yyst[yysp] = 403;
                    yysv[yysp] = (lexer.getSemantic()
                    );
                    yytok = (lexer.getNextToken()
                    );
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 948:
                    switch (yytok) {
                        case INTEGER -> {
                            yyn = 82;
                            continue;
                        }
                        case IDENTIFIER -> {
                            yyn = 99;
                            continue;
                        }
                        case '(' -> {
                            yyn = 100;
                            continue;
                        }
                    }
                    yyn = 1093;
                    continue;

                case 404:
                    yyst[yysp] = 404;
                    yysv[yysp] = (lexer.getSemantic()
                    );
                    yytok = (lexer.getNextToken()
                    );
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 949:
                    switch (yytok) {
                        case FLOAT -> {
                            yyn = 80;
                            continue;
                        }
                        case IDENTIFIER -> {
                            yyn = 81;
                            continue;
                        }
                        case INTEGER -> {
                            yyn = 82;
                            continue;
                        }
                        case '(' -> {
                            yyn = 464;
                            continue;
                        }
                    }
                    yyn = 1093;
                    continue;

                case 405:
                    yyst[yysp] = 405;
                    yysv[yysp] = (lexer.getSemantic()
                    );
                    yytok = (lexer.getNextToken()
                    );
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 950:
                    switch (yytok) {
                        case FLOAT -> {
                            yyn = 80;
                            continue;
                        }
                        case IDENTIFIER -> {
                            yyn = 81;
                            continue;
                        }
                        case INTEGER -> {
                            yyn = 82;
                            continue;
                        }
                        case '(' -> {
                            yyn = 466;
                            continue;
                        }
                    }
                    yyn = 1093;
                    continue;

                case 406:
                    yyst[yysp] = 406;
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 951:
                    switch (yytok) {
                        case FLOAT -> {
                            yyn = 80;
                            continue;
                        }
                        case IDENTIFIER -> {
                            yyn = 81;
                            continue;
                        }
                        case INTEGER -> {
                            yyn = 82;
                            continue;
                        }
                        case '(' -> {
                            yyn = 468;
                            continue;
                        }
                    }
                    yyn = 1093;
                    continue;

                case 407:
                    yyst[yysp] = 407;
                    yysv[yysp] = (lexer.getSemantic()
                    );
                    yytok = (lexer.getNextToken()
                    );
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 952:
                    yyn = yys407();
                    continue;

                case 408:
                    yyst[yysp] = 408;
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 953:
                    switch (yytok) {
                        case FLOAT -> {
                            yyn = 80;
                            continue;
                        }
                        case IDENTIFIER -> {
                            yyn = 81;
                            continue;
                        }
                        case INTEGER -> {
                            yyn = 82;
                            continue;
                        }
                        case '(' -> {
                            yyn = 471;
                            continue;
                        }
                    }
                    yyn = 1093;
                    continue;

                case 409:
                    yyst[yysp] = 409;
                    yysv[yysp] = (lexer.getSemantic()
                    );
                    yytok = (lexer.getNextToken()
                    );
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 954:
                    yyn = yys409();
                    continue;

                case 410:
                    yyst[yysp] = 410;
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 955:
                    switch (yytok) {
                        case FLOAT -> {
                            yyn = 80;
                            continue;
                        }
                        case IDENTIFIER -> {
                            yyn = 81;
                            continue;
                        }
                        case INTEGER -> {
                            yyn = 82;
                            continue;
                        }
                        case '(' -> {
                            yyn = 474;
                            continue;
                        }
                    }
                    yyn = 1093;
                    continue;

                case 411:
                    yyst[yysp] = 411;
                    yysv[yysp] = (lexer.getSemantic()
                    );
                    yytok = (lexer.getNextToken()
                    );
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 956:
                    yyn = yys411();
                    continue;

                case 412:
                    yyst[yysp] = 412;
                    yysv[yysp] = (lexer.getSemantic()
                    );
                    yytok = (lexer.getNextToken()
                    );
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 957:
                    yyn = yys412();
                    continue;

                case 413:
                    yyst[yysp] = 413;
                    yysv[yysp] = (lexer.getSemantic()
                    );
                    yytok = (lexer.getNextToken()
                    );
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 958:
                    yyn = yys413();
                    continue;

                case 414:
                    yyst[yysp] = 414;
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 959:
                    yyn = yys414();
                    continue;

                case 415:
                    yyst[yysp] = 415;
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 960:
                    switch (yytok) {
                        case '<' -> {
                            yyn = 214;
                            continue;
                        }
                        case '>' -> {
                            yyn = 215;
                            continue;
                        }
                        case ')' -> {
                            yyn = 479;
                            continue;
                        }
                    }
                    yyn = 1093;
                    continue;

                case 416:
                    yyst[yysp] = 416;
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 961:
                    yyn = yys416();
                    continue;

                case 417:
                    yyst[yysp] = 417;
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 962:
                    if (yytok == ')') {
                        yyn = 481;
                        continue;
                    }
                    yyn = 1093;
                    continue;

                case 418:
                    yyst[yysp] = 418;
                    yysv[yysp] = (lexer.getSemantic()
                    );
                    yytok = (lexer.getNextToken()
                    );
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 963:
                    if (yytok == '(') {
                        yyn = 482;
                        continue;
                    }
                    yyn = 1093;
                    continue;

                case 419:
                    yyst[yysp] = 419;
                    yysv[yysp] = (lexer.getSemantic()
                    );
                    yytok = (lexer.getNextToken()
                    );
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 964:
                    if (yytok == '(') {
                        yyn = 483;
                        continue;
                    }
                    yyn = 1093;
                    continue;

                case 420:
                    yyst[yysp] = 420;
                    yysv[yysp] = (lexer.getSemantic()
                    );
                    yytok = (lexer.getNextToken()
                    );
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 965:
                    if (yytok == '(') {
                        yyn = 484;
                        continue;
                    }
                    yyn = 1093;
                    continue;

                case 421:
                    yyst[yysp] = 421;
                    yysv[yysp] = (lexer.getSemantic()
                    );
                    yytok = (lexer.getNextToken()
                    );
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 966:
                    if (yytok == '(') {
                        yyn = 485;
                        continue;
                    }
                    yyn = 1093;
                    continue;

                case 422:
                    yyst[yysp] = 422;
                    yysv[yysp] = (lexer.getSemantic()
                    );
                    yytok = (lexer.getNextToken()
                    );
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 967:
                    if (yytok == '(') {
                        yyn = 486;
                        continue;
                    }
                    yyn = 1093;
                    continue;

                case 423:
                    yyst[yysp] = 423;
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 968:
                    switch (yytok) {
                        case ']', FIN -> {
                            yyn = yyr191();
                            continue;
                        }
                    }
                    yyn = 1093;
                    continue;

                case 424:
                    yyst[yysp] = 424;
                    yysv[yysp] = (lexer.getSemantic()
                    );
                    yytok = (lexer.getNextToken()
                    );
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 969:
                    if (yytok == ';') {
                        yyn = yyr224();
                        continue;
                    }
                    yyn = 1093;
                    continue;

                case 425:
                    yyst[yysp] = 425;
                    yysv[yysp] = (lexer.getSemantic()
                    );
                    yytok = (lexer.getNextToken()
                    );
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 970:
                    yyn = yys425();
                    continue;

                case 426:
                    yyst[yysp] = 426;
                    yysv[yysp] = (lexer.getSemantic()
                    );
                    yytok = (lexer.getNextToken()
                    );
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 971:
                    if (yytok == ';') {
                        yyn = yyr204();
                        continue;
                    }
                    yyn = 1093;
                    continue;

                case 427:
                    yyst[yysp] = 427;
                    yysv[yysp] = (lexer.getSemantic()
                    );
                    yytok = (lexer.getNextToken()
                    );
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 972:
                    if (yytok == ';') {
                        yyn = yyr164();
                        continue;
                    }
                    yyn = 1093;
                    continue;

                case 428:
                    yyst[yysp] = 428;
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 973:
                    switch (yytok) {
                        case '*' -> {
                            yyn = 183;
                            continue;
                        }
                        case '+' -> {
                            yyn = 184;
                            continue;
                        }
                        case '-' -> {
                            yyn = 185;
                            continue;
                        }
                        case '/' -> {
                            yyn = 186;
                            continue;
                        }
                        case ';' -> {
                            yyn = yyr165();
                            continue;
                        }
                    }
                    yyn = 1093;
                    continue;

                case 429:
                    yyst[yysp] = 429;
                    yysv[yysp] = (lexer.getSemantic()
                    );
                    yytok = (lexer.getNextToken()
                    );
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 974:
                    yyn = yys429();
                    continue;

                case 430:
                    yyst[yysp] = 430;
                    yysv[yysp] = (lexer.getSemantic()
                    );
                    yytok = (lexer.getNextToken()
                    );
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 975:
                    switch (yytok) {
                        case INTEGER -> {
                            yyn = 82;
                            continue;
                        }
                        case IDENTIFIER -> {
                            yyn = 99;
                            continue;
                        }
                        case '(' -> {
                            yyn = 100;
                            continue;
                        }
                    }
                    yyn = 1093;
                    continue;

                case 431:
                    yyst[yysp] = 431;
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 976:
                    switch (yytok) {
                        case '*' -> {
                            yyn = 183;
                            continue;
                        }
                        case '+' -> {
                            yyn = 184;
                            continue;
                        }
                        case '-' -> {
                            yyn = 185;
                            continue;
                        }
                        case '/' -> {
                            yyn = 186;
                            continue;
                        }
                        case ')' -> {
                            yyn = yyr169();
                            continue;
                        }
                    }
                    yyn = 1093;
                    continue;

                case 432:
                    yyst[yysp] = 432;
                    yysv[yysp] = (lexer.getSemantic()
                    );
                    yytok = (lexer.getNextToken()
                    );
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 977:
                    yyn = yys432();
                    continue;

                case 433:
                    yyst[yysp] = 433;
                    yysv[yysp] = (lexer.getSemantic()
                    );
                    yytok = (lexer.getNextToken()
                    );
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 978:
                    switch (yytok) {
                        case ';', ')', '[', '>', '<' -> {
                            yyn = yyr181();
                            continue;
                        }
                    }
                    yyn = 1093;
                    continue;

                case 434:
                    yyst[yysp] = 434;
                    yysv[yysp] = (lexer.getSemantic()
                    );
                    yytok = (lexer.getNextToken()
                    );
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 979:
                    yyn = yys434();
                    continue;

                case 435:
                    yyst[yysp] = 435;
                    yysv[yysp] = (lexer.getSemantic()
                    );
                    yytok = (lexer.getNextToken()
                    );
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 980:
                    switch (yytok) {
                        case FLOAT -> {
                            yyn = 80;
                            continue;
                        }
                        case IDENTIFIER -> {
                            yyn = 81;
                            continue;
                        }
                        case INTEGER -> {
                            yyn = 82;
                            continue;
                        }
                        case '(' -> {
                            yyn = 93;
                            continue;
                        }
                    }
                    yyn = 1093;
                    continue;

                case 436:
                    yyst[yysp] = 436;
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 981:
                    switch (yytok) {
                        case '*' -> {
                            yyn = 183;
                            continue;
                        }
                        case '+' -> {
                            yyn = 184;
                            continue;
                        }
                        case '-' -> {
                            yyn = 185;
                            continue;
                        }
                        case '/' -> {
                            yyn = 186;
                            continue;
                        }
                        case '[' -> {
                            yyn = 488;
                            continue;
                        }
                    }
                    yyn = 1093;
                    continue;

                case 437:
                    yyst[yysp] = 437;
                    yysv[yysp] = (lexer.getSemantic()
                    );
                    yytok = (lexer.getNextToken()
                    );
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 982:
                    yyn = yys437();
                    continue;

                case 438:
                    yyst[yysp] = 438;
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 983:
                    yyn = yys438();
                    continue;

                case 439:
                    yyst[yysp] = 439;
                    yysv[yysp] = (lexer.getSemantic()
                    );
                    yytok = (lexer.getNextToken()
                    );
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 984:
                    yyn = yys439();
                    continue;

                case 440:
                    yyst[yysp] = 440;
                    yysv[yysp] = (lexer.getSemantic()
                    );
                    yytok = (lexer.getNextToken()
                    );
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 985:
                    switch (yytok) {
                        case FLOAT -> {
                            yyn = 80;
                            continue;
                        }
                        case IDENTIFIER -> {
                            yyn = 81;
                            continue;
                        }
                        case INTEGER -> {
                            yyn = 82;
                            continue;
                        }
                        case '(' -> {
                            yyn = 93;
                            continue;
                        }
                    }
                    yyn = 1093;
                    continue;

                case 441:
                    yyst[yysp] = 441;
                    yysv[yysp] = (lexer.getSemantic()
                    );
                    yytok = (lexer.getNextToken()
                    );
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 986:
                    switch (yytok) {
                        case FLOAT -> {
                            yyn = 80;
                            continue;
                        }
                        case IDENTIFIER -> {
                            yyn = 81;
                            continue;
                        }
                        case INTEGER -> {
                            yyn = 82;
                            continue;
                        }
                        case '(' -> {
                            yyn = 93;
                            continue;
                        }
                    }
                    yyn = 1093;
                    continue;

                case 442:
                    yyst[yysp] = 442;
                    yysv[yysp] = (lexer.getSemantic()
                    );
                    yytok = (lexer.getNextToken()
                    );
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 987:
                    switch (yytok) {
                        case ';', ')', '[', '>', '<' -> {
                            yyn = yyr180();
                            continue;
                        }
                    }
                    yyn = 1093;
                    continue;

                case 443:
                    yyst[yysp] = 443;
                    yysv[yysp] = (lexer.getSemantic()
                    );
                    yytok = (lexer.getNextToken()
                    );
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 988:
                    switch (yytok) {
                        case ';', ')', '[', '>', '<' -> {
                            yyn = yyr171();
                            continue;
                        }
                    }
                    yyn = 1093;
                    continue;

                case 444:
                    yyst[yysp] = 444;
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 989:
                    yyn = yys444();
                    continue;

                case 445:
                    yyst[yysp] = 445;
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 990:
                    yyn = yys445();
                    continue;

                case 446:
                    yyst[yysp] = 446;
                    yysv[yysp] = (lexer.getSemantic()
                    );
                    yytok = (lexer.getNextToken()
                    );
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 991:
                    yyn = yys446();
                    continue;

                case 447:
                    yyst[yysp] = 447;
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 992:
                    yyn = yys447();
                    continue;

                case 448:
                    yyst[yysp] = 448;
                    yysv[yysp] = (lexer.getSemantic()
                    );
                    yytok = (lexer.getNextToken()
                    );
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 993:
                    yyn = yys448();
                    continue;

                case 449:
                    yyst[yysp] = 449;
                    yysv[yysp] = (lexer.getSemantic()
                    );
                    yytok = (lexer.getNextToken()
                    );
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 994:
                    if (yytok == ';') {
                        yyn = yyr220();
                        continue;
                    }
                    yyn = 1093;
                    continue;

                case 450:
                    yyst[yysp] = 450;
                    yysv[yysp] = (lexer.getSemantic()
                    );
                    yytok = (lexer.getNextToken()
                    );
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 995:
                    yyn = yys450();
                    continue;

                case 451:
                    yyst[yysp] = 451;
                    yysv[yysp] = (lexer.getSemantic()
                    );
                    yytok = (lexer.getNextToken()
                    );
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 996:
                    if (yytok == ';') {
                        yyn = yyr221();
                        continue;
                    }
                    yyn = 1093;
                    continue;

                case 452:
                    yyst[yysp] = 452;
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 997:
                    if (yytok == ')') {
                        yyn = 493;
                        continue;
                    }
                    yyn = 1093;
                    continue;

                case 453:
                    yyst[yysp] = 453;
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 998:
                    yyn = yys453();
                    continue;

                case 454:
                    yyst[yysp] = 454;
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 999:
                    yyn = yys454();
                    continue;

                case 455:
                    yyst[yysp] = 455;
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 1000:
                    yyn = yys455();
                    continue;

                case 456:
                    yyst[yysp] = 456;
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 1001:
                    yyn = yys456();
                    continue;

                case 457:
                    yyst[yysp] = 457;
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 1002:
                    if (yytok == ';') {
                        yyn = yyr73();
                        continue;
                    }
                    yyn = 1093;
                    continue;

                case 458:
                    yyst[yysp] = 458;
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 1003:
                    if (yytok == ';') {
                        yyn = yyr74();
                        continue;
                    }
                    yyn = 1093;
                    continue;

                case 459:
                    yyst[yysp] = 459;
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 1004:
                    yyn = yys459();
                    continue;

                case 460:
                    yyst[yysp] = 460;
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 1005:
                    yyn = yys460();
                    continue;

                case 461:
                    yyst[yysp] = 461;
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 1006:
                    yyn = yys461();
                    continue;

                case 462:
                    yyst[yysp] = 462;
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 1007:
                    yyn = yys462();
                    continue;

                case 463:
                    yyst[yysp] = 463;
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 1008:
                    if (yytok == ';') {
                        yyn = yyr65();
                        continue;
                    }
                    yyn = 1093;
                    continue;

                case 464:
                    yyst[yysp] = 464;
                    yysv[yysp] = (lexer.getSemantic()
                    );
                    yytok = (lexer.getNextToken()
                    );
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 1009:
                    yyn = yys464();
                    continue;

                case 465:
                    yyst[yysp] = 465;
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 1010:
                    if (yytok == ';') {
                        yyn = yyr66();
                        continue;
                    }
                    yyn = 1093;
                    continue;

                case 466:
                    yyst[yysp] = 466;
                    yysv[yysp] = (lexer.getSemantic()
                    );
                    yytok = (lexer.getNextToken()
                    );
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 1011:
                    yyn = yys466();
                    continue;

                case 467:
                    yyst[yysp] = 467;
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 1012:
                    if (yytok == ';') {
                        yyn = yyr75();
                        continue;
                    }
                    yyn = 1093;
                    continue;

                case 468:
                    yyst[yysp] = 468;
                    yysv[yysp] = (lexer.getSemantic()
                    );
                    yytok = (lexer.getNextToken()
                    );
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 1013:
                    yyn = yys468();
                    continue;

                case 469:
                    yyst[yysp] = 469;
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 1014:
                    if (yytok == ')') {
                        yyn = 497;
                        continue;
                    }
                    yyn = 1093;
                    continue;

                case 470:
                    yyst[yysp] = 470;
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 1015:
                    if (yytok == ';') {
                        yyn = yyr81();
                        continue;
                    }
                    yyn = 1093;
                    continue;

                case 471:
                    yyst[yysp] = 471;
                    yysv[yysp] = (lexer.getSemantic()
                    );
                    yytok = (lexer.getNextToken()
                    );
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 1016:
                    yyn = yys471();
                    continue;

                case 472:
                    yyst[yysp] = 472;
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 1017:
                    if (yytok == ')') {
                        yyn = 499;
                        continue;
                    }
                    yyn = 1093;
                    continue;

                case 473:
                    yyst[yysp] = 473;
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 1018:
                    if (yytok == ';') {
                        yyn = yyr84();
                        continue;
                    }
                    yyn = 1093;
                    continue;

                case 474:
                    yyst[yysp] = 474;
                    yysv[yysp] = (lexer.getSemantic()
                    );
                    yytok = (lexer.getNextToken()
                    );
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 1019:
                    yyn = yys474();
                    continue;

                case 475:
                    yyst[yysp] = 475;
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 1020:
                    if (yytok == ')') {
                        yyn = 501;
                        continue;
                    }
                    yyn = 1093;
                    continue;

                case 476:
                    yyst[yysp] = 476;
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 1021:
                    if (yytok == ')') {
                        yyn = 502;
                        continue;
                    }
                    yyn = 1093;
                    continue;

                case 477:
                    yyst[yysp] = 477;
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 1022:
                    if (yytok == ')') {
                        yyn = 503;
                        continue;
                    }
                    yyn = 1093;
                    continue;

                case 478:
                    yyst[yysp] = 478;
                    yysv[yysp] = (lexer.getSemantic()
                    );
                    yytok = (lexer.getNextToken()
                    );
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 1023:
                    yyn = yys478();
                    continue;

                case 479:
                    yyst[yysp] = 479;
                    yysv[yysp] = (lexer.getSemantic()
                    );
                    yytok = (lexer.getNextToken()
                    );
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 1024:
                    switch (yytok) {
                        case '<' -> {
                            yyn = 504;
                            continue;
                        }
                        case '>' -> {
                            yyn = 505;
                            continue;
                        }
                    }
                    yyn = 1093;
                    continue;

                case 480:
                    yyst[yysp] = 480;
                    yysv[yysp] = (lexer.getSemantic()
                    );
                    yytok = (lexer.getNextToken()
                    );
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 1025:
                    yyn = yys480();
                    continue;

                case 481:
                    yyst[yysp] = 481;
                    yysv[yysp] = (lexer.getSemantic()
                    );
                    yytok = (lexer.getNextToken()
                    );
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 1026:
                    if (yytok == ';') {
                        yyn = yyr87();
                        continue;
                    }
                    yyn = 1093;
                    continue;

                case 482:
                    yyst[yysp] = 482;
                    yysv[yysp] = (lexer.getSemantic()
                    );
                    yytok = (lexer.getNextToken()
                    );
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 1027:
                    yyn = yys482();
                    continue;

                case 483:
                    yyst[yysp] = 483;
                    yysv[yysp] = (lexer.getSemantic()
                    );
                    yytok = (lexer.getNextToken()
                    );
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 1028:
                    yyn = yys483();
                    continue;

                case 484:
                    yyst[yysp] = 484;
                    yysv[yysp] = (lexer.getSemantic()
                    );
                    yytok = (lexer.getNextToken()
                    );
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 1029:
                    yyn = yys484();
                    continue;

                case 485:
                    yyst[yysp] = 485;
                    yysv[yysp] = (lexer.getSemantic()
                    );
                    yytok = (lexer.getNextToken()
                    );
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 1030:
                    yyn = yys485();
                    continue;

                case 486:
                    yyst[yysp] = 486;
                    yysv[yysp] = (lexer.getSemantic()
                    );
                    yytok = (lexer.getNextToken()
                    );
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 1031:
                    yyn = yys486();
                    continue;

                case 487:
                    yyst[yysp] = 487;
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 1032:
                    if (yytok == ')') {
                        yyn = 511;
                        continue;
                    }
                    yyn = 1093;
                    continue;

                case 488:
                    yyst[yysp] = 488;
                    yysv[yysp] = (lexer.getSemantic()
                    );
                    yytok = (lexer.getNextToken()
                    );
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 1033:
                    switch (yytok) {
                        case FLOAT -> {
                            yyn = 80;
                            continue;
                        }
                        case IDENTIFIER -> {
                            yyn = 81;
                            continue;
                        }
                        case INTEGER -> {
                            yyn = 82;
                            continue;
                        }
                        case '(' -> {
                            yyn = 93;
                            continue;
                        }
                    }
                    yyn = 1093;
                    continue;

                case 489:
                    yyst[yysp] = 489;
                    yysv[yysp] = (lexer.getSemantic()
                    );
                    yytok = (lexer.getNextToken()
                    );
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 1034:
                    yyn = yys489();
                    continue;

                case 490:
                    yyst[yysp] = 490;
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 1035:
                    if (yytok == ')') {
                        yyn = 512;
                        continue;
                    }
                    yyn = 1093;
                    continue;

                case 491:
                    yyst[yysp] = 491;
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 1036:
                    if (yytok == ')') {
                        yyn = 513;
                        continue;
                    }
                    yyn = 1093;
                    continue;

                case 492:
                    yyst[yysp] = 492;
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 1037:
                    if (yytok == ')') {
                        yyn = 514;
                        continue;
                    }
                    yyn = 1093;
                    continue;

                case 493:
                    yyst[yysp] = 493;
                    yysv[yysp] = (lexer.getSemantic()
                    );
                    yytok = (lexer.getNextToken()
                    );
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 1038:
                    switch (yytok) {
                        case ';', ')', '[', '>', '<' -> {
                            yyn = yyr186();
                            continue;
                        }
                    }
                    yyn = 1093;
                    continue;

                case 494:
                    yyst[yysp] = 494;
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 1039:
                    if (yytok == ')') {
                        yyn = 515;
                        continue;
                    }
                    yyn = 1093;
                    continue;

                case 495:
                    yyst[yysp] = 495;
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 1040:
                    if (yytok == ')') {
                        yyn = 516;
                        continue;
                    }
                    yyn = 1093;
                    continue;

                case 496:
                    yyst[yysp] = 496;
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 1041:
                    if (yytok == ')') {
                        yyn = 517;
                        continue;
                    }
                    yyn = 1093;
                    continue;

                case 497:
                    yyst[yysp] = 497;
                    yysv[yysp] = (lexer.getSemantic()
                    );
                    yytok = (lexer.getNextToken()
                    );
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 1042:
                    switch (yytok) {
                        case FLOAT -> {
                            yyn = 80;
                            continue;
                        }
                        case IDENTIFIER -> {
                            yyn = 81;
                            continue;
                        }
                        case INTEGER -> {
                            yyn = 82;
                            continue;
                        }
                        case '(' -> {
                            yyn = 519;
                            continue;
                        }
                    }
                    yyn = 1093;
                    continue;

                case 498:
                    yyst[yysp] = 498;
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 1043:
                    if (yytok == ')') {
                        yyn = 520;
                        continue;
                    }
                    yyn = 1093;
                    continue;

                case 499:
                    yyst[yysp] = 499;
                    yysv[yysp] = (lexer.getSemantic()
                    );
                    yytok = (lexer.getNextToken()
                    );
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 1044:
                    switch (yytok) {
                        case FLOAT -> {
                            yyn = 80;
                            continue;
                        }
                        case IDENTIFIER -> {
                            yyn = 81;
                            continue;
                        }
                        case INTEGER -> {
                            yyn = 82;
                            continue;
                        }
                        case '(' -> {
                            yyn = 93;
                            continue;
                        }
                    }
                    yyn = 1093;
                    continue;

                case 500:
                    yyst[yysp] = 500;
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 1045:
                    if (yytok == ')') {
                        yyn = 522;
                        continue;
                    }
                    yyn = 1093;
                    continue;

                case 501:
                    yyst[yysp] = 501;
                    yysv[yysp] = (lexer.getSemantic()
                    );
                    yytok = (lexer.getNextToken()
                    );
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 1046:
                    switch (yytok) {
                        case FLOAT -> {
                            yyn = 80;
                            continue;
                        }
                        case IDENTIFIER -> {
                            yyn = 81;
                            continue;
                        }
                        case INTEGER -> {
                            yyn = 82;
                            continue;
                        }
                        case '(' -> {
                            yyn = 93;
                            continue;
                        }
                    }
                    yyn = 1093;
                    continue;

                case 502:
                    yyst[yysp] = 502;
                    yysv[yysp] = (lexer.getSemantic()
                    );
                    yytok = (lexer.getNextToken()
                    );
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 1047:
                    if (yytok == '(') {
                        yyn = 524;
                        continue;
                    }
                    yyn = 1093;
                    continue;

                case 503:
                    yyst[yysp] = 503;
                    yysv[yysp] = (lexer.getSemantic()
                    );
                    yytok = (lexer.getNextToken()
                    );
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 1048:
                    if (yytok == '(') {
                        yyn = 525;
                        continue;
                    }
                    yyn = 1093;
                    continue;

                case 504:
                    yyst[yysp] = 504;
                    yysv[yysp] = (lexer.getSemantic()
                    );
                    yytok = (lexer.getNextToken()
                    );
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 1049:
                    switch (yytok) {
                        case FLOAT -> {
                            yyn = 80;
                            continue;
                        }
                        case IDENTIFIER -> {
                            yyn = 81;
                            continue;
                        }
                        case INTEGER -> {
                            yyn = 82;
                            continue;
                        }
                        case '(' -> {
                            yyn = 527;
                            continue;
                        }
                    }
                    yyn = 1093;
                    continue;

                case 505:
                    yyst[yysp] = 505;
                    yysv[yysp] = (lexer.getSemantic()
                    );
                    yytok = (lexer.getNextToken()
                    );
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 1050:
                    switch (yytok) {
                        case FLOAT -> {
                            yyn = 80;
                            continue;
                        }
                        case IDENTIFIER -> {
                            yyn = 81;
                            continue;
                        }
                        case INTEGER -> {
                            yyn = 82;
                            continue;
                        }
                        case '(' -> {
                            yyn = 529;
                            continue;
                        }
                    }
                    yyn = 1093;
                    continue;

                case 506:
                    yyst[yysp] = 506;
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 1051:
                    if (yytok == ')') {
                        yyn = 530;
                        continue;
                    }
                    yyn = 1093;
                    continue;

                case 507:
                    yyst[yysp] = 507;
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 1052:
                    if (yytok == ')') {
                        yyn = 531;
                        continue;
                    }
                    yyn = 1093;
                    continue;

                case 508:
                    yyst[yysp] = 508;
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 1053:
                    if (yytok == ')') {
                        yyn = 532;
                        continue;
                    }
                    yyn = 1093;
                    continue;

                case 509:
                    yyst[yysp] = 509;
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 1054:
                    if (yytok == ')') {
                        yyn = 533;
                        continue;
                    }
                    yyn = 1093;
                    continue;

                case 510:
                    yyst[yysp] = 510;
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 1055:
                    if (yytok == ')') {
                        yyn = 534;
                        continue;
                    }
                    yyn = 1093;
                    continue;

                case 511:
                    yyst[yysp] = 511;
                    yysv[yysp] = (lexer.getSemantic()
                    );
                    yytok = (lexer.getNextToken()
                    );
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 1056:
                    if (yytok == ';') {
                        yyn = yyr166();
                        continue;
                    }
                    yyn = 1093;
                    continue;

                case 512:
                    yyst[yysp] = 512;
                    yysv[yysp] = (lexer.getSemantic()
                    );
                    yytok = (lexer.getNextToken()
                    );
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 1057:
                    switch (yytok) {
                        case ';', ')', '[', '>', '<' -> {
                            yyn = yyr182();
                            continue;
                        }
                    }
                    yyn = 1093;
                    continue;

                case 513:
                    yyst[yysp] = 513;
                    yysv[yysp] = (lexer.getSemantic()
                    );
                    yytok = (lexer.getNextToken()
                    );
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 1058:
                    switch (yytok) {
                        case ';', ')', '[', '>', '<' -> {
                            yyn = yyr172();
                            continue;
                        }
                    }
                    yyn = 1093;
                    continue;

                case 514:
                    yyst[yysp] = 514;
                    yysv[yysp] = (lexer.getSemantic()
                    );
                    yytok = (lexer.getNextToken()
                    );
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 1059:
                    switch (yytok) {
                        case ';', ')', '[', '>', '<' -> {
                            yyn = yyr174();
                            continue;
                        }
                    }
                    yyn = 1093;
                    continue;

                case 515:
                    yyst[yysp] = 515;
                    yysv[yysp] = (lexer.getSemantic()
                    );
                    yytok = (lexer.getNextToken()
                    );
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 1060:
                    if (yytok == ';') {
                        yyn = yyr71();
                        continue;
                    }
                    yyn = 1093;
                    continue;

                case 516:
                    yyst[yysp] = 516;
                    yysv[yysp] = (lexer.getSemantic()
                    );
                    yytok = (lexer.getNextToken()
                    );
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 1061:
                    if (yytok == ';') {
                        yyn = yyr69();
                        continue;
                    }
                    yyn = 1093;
                    continue;

                case 517:
                    yyst[yysp] = 517;
                    yysv[yysp] = (lexer.getSemantic()
                    );
                    yytok = (lexer.getNextToken()
                    );
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 1062:
                    if (yytok == ';') {
                        yyn = yyr77();
                        continue;
                    }
                    yyn = 1093;
                    continue;

                case 518:
                    yyst[yysp] = 518;
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 1063:
                    if (yytok == ';') {
                        yyn = yyr78();
                        continue;
                    }
                    yyn = 1093;
                    continue;

                case 519:
                    yyst[yysp] = 519;
                    yysv[yysp] = (lexer.getSemantic()
                    );
                    yytok = (lexer.getNextToken()
                    );
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 1064:
                    yyn = yys519();
                    continue;

                case 520:
                    yyst[yysp] = 520;
                    yysv[yysp] = (lexer.getSemantic()
                    );
                    yytok = (lexer.getNextToken()
                    );
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 1065:
                    if (yytok == ';') {
                        yyn = yyr83();
                        continue;
                    }
                    yyn = 1093;
                    continue;

                case 521:
                    yyst[yysp] = 521;
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 1066:
                    if (yytok == ';') {
                        yyn = yyr82();
                        continue;
                    }
                    yyn = 1093;
                    continue;

                case 522:
                    yyst[yysp] = 522;
                    yysv[yysp] = (lexer.getSemantic()
                    );
                    yytok = (lexer.getNextToken()
                    );
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 1067:
                    if (yytok == ';') {
                        yyn = yyr86();
                        continue;
                    }
                    yyn = 1093;
                    continue;

                case 523:
                    yyst[yysp] = 523;
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 1068:
                    if (yytok == ';') {
                        yyn = yyr85();
                        continue;
                    }
                    yyn = 1093;
                    continue;

                case 524:
                    yyst[yysp] = 524;
                    yysv[yysp] = (lexer.getSemantic()
                    );
                    yytok = (lexer.getNextToken()
                    );
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 1069:
                    yyn = yys524();
                    continue;

                case 525:
                    yyst[yysp] = 525;
                    yysv[yysp] = (lexer.getSemantic()
                    );
                    yytok = (lexer.getNextToken()
                    );
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 1070:
                    yyn = yys525();
                    continue;

                case 526:
                    yyst[yysp] = 526;
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 1071:
                    if (yytok == ';') {
                        yyn = yyr72();
                        continue;
                    }
                    yyn = 1093;
                    continue;

                case 527:
                    yyst[yysp] = 527;
                    yysv[yysp] = (lexer.getSemantic()
                    );
                    yytok = (lexer.getNextToken()
                    );
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 1072:
                    yyn = yys527();
                    continue;

                case 528:
                    yyst[yysp] = 528;
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 1073:
                    if (yytok == ';') {
                        yyn = yyr70();
                        continue;
                    }
                    yyn = 1093;
                    continue;

                case 529:
                    yyst[yysp] = 529;
                    yysv[yysp] = (lexer.getSemantic()
                    );
                    yytok = (lexer.getNextToken()
                    );
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 1074:
                    yyn = yys529();
                    continue;

                case 530:
                    yyst[yysp] = 530;
                    yysv[yysp] = (lexer.getSemantic()
                    );
                    yytok = (lexer.getNextToken()
                    );
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 1075:
                    switch (yytok) {
                        case ';', ')', '[' -> {
                            yyn = yyr57();
                            continue;
                        }
                    }
                    yyn = 1093;
                    continue;

                case 531:
                    yyst[yysp] = 531;
                    yysv[yysp] = (lexer.getSemantic()
                    );
                    yytok = (lexer.getNextToken()
                    );
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 1076:
                    switch (yytok) {
                        case ';', ')', '[' -> {
                            yyn = yyr59();
                            continue;
                        }
                    }
                    yyn = 1093;
                    continue;

                case 532:
                    yyst[yysp] = 532;
                    yysv[yysp] = (lexer.getSemantic()
                    );
                    yytok = (lexer.getNextToken()
                    );
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 1077:
                    switch (yytok) {
                        case ';', ')', '[' -> {
                            yyn = yyr58();
                            continue;
                        }
                    }
                    yyn = 1093;
                    continue;

                case 533:
                    yyst[yysp] = 533;
                    yysv[yysp] = (lexer.getSemantic()
                    );
                    yytok = (lexer.getNextToken()
                    );
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 1078:
                    switch (yytok) {
                        case ';', ')', '[' -> {
                            yyn = yyr52();
                            continue;
                        }
                    }
                    yyn = 1093;
                    continue;

                case 534:
                    yyst[yysp] = 534;
                    yysv[yysp] = (lexer.getSemantic()
                    );
                    yytok = (lexer.getNextToken()
                    );
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 1079:
                    switch (yytok) {
                        case ';', ')', '[' -> {
                            yyn = yyr53();
                            continue;
                        }
                    }
                    yyn = 1093;
                    continue;

                case 535:
                    yyst[yysp] = 535;
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 1080:
                    if (yytok == ')') {
                        yyn = 540;
                        continue;
                    }
                    yyn = 1093;
                    continue;

                case 536:
                    yyst[yysp] = 536;
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 1081:
                    if (yytok == ')') {
                        yyn = 541;
                        continue;
                    }
                    yyn = 1093;
                    continue;

                case 537:
                    yyst[yysp] = 537;
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 1082:
                    if (yytok == ')') {
                        yyn = 542;
                        continue;
                    }
                    yyn = 1093;
                    continue;

                case 538:
                    yyst[yysp] = 538;
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 1083:
                    if (yytok == ')') {
                        yyn = 543;
                        continue;
                    }
                    yyn = 1093;
                    continue;

                case 539:
                    yyst[yysp] = 539;
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 1084:
                    if (yytok == ')') {
                        yyn = 544;
                        continue;
                    }
                    yyn = 1093;
                    continue;

                case 540:
                    yyst[yysp] = 540;
                    yysv[yysp] = (lexer.getSemantic()
                    );
                    yytok = (lexer.getNextToken()
                    );
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 1085:
                    if (yytok == ';') {
                        yyn = yyr76();
                        continue;
                    }
                    yyn = 1093;
                    continue;

                case 541:
                    yyst[yysp] = 541;
                    yysv[yysp] = (lexer.getSemantic()
                    );
                    yytok = (lexer.getNextToken()
                    );
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 1086:
                    if (yytok == ';') {
                        yyn = yyr80();
                        continue;
                    }
                    yyn = 1093;
                    continue;

                case 542:
                    yyst[yysp] = 542;
                    yysv[yysp] = (lexer.getSemantic()
                    );
                    yytok = (lexer.getNextToken()
                    );
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 1087:
                    if (yytok == ';') {
                        yyn = yyr79();
                        continue;
                    }
                    yyn = 1093;
                    continue;

                case 543:
                    yyst[yysp] = 543;
                    yysv[yysp] = (lexer.getSemantic()
                    );
                    yytok = (lexer.getNextToken()
                    );
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 1088:
                    if (yytok == ';') {
                        yyn = yyr67();
                        continue;
                    }
                    yyn = 1093;
                    continue;

                case 544:
                    yyst[yysp] = 544;
                    yysv[yysp] = (lexer.getSemantic()
                    );
                    yytok = (lexer.getNextToken()
                    );
                    if (++yysp >= yyst.length) {
                        yyexpand();
                    }
                case 1089:
                    if (yytok == ';') {
                        yyn = yyr68();
                        continue;
                    }
                    yyn = 1093;
                    continue;

                case 1090:
                    return true;
                case 1091:
                    yyerror("stack overflow");
                case 1092:
                    return false;
                case 1093:
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
        return switch (yytok) {
            case APARECETORTUGA -> 31;
            case AVANZA -> 32;
            case AZAR -> 33;
            case BAJALAPIZ -> 34;
            case BORRAPANTALLA -> 35;
            case CENTRO -> 36;
            case COS -> 37;
            case DIFERENCIA -> 38;
            case DIVISION -> 39;
            case EJECUTA -> 40;
            case ELEGIR -> 41;
            case ELEMENTO -> 42;
            case ESPERA -> 43;
            case GIRADERECHA -> 44;
            case GIRAIZQUIERDA -> 45;
            case IDENTIFIER -> 46;
            case INC -> 47;
            case INIC -> 48;
            case MENOS -> 49;
            case MOSTRAR -> 50;
            case OCULTATORTUGA -> 51;
            case PARA -> 52;
            case PONCOLORLAPIZ -> 53;
            case PONPOS -> 54;
            case PONRUMBO -> 55;
            case PONX -> 56;
            case PONXY -> 57;
            case PONY -> 58;
            case POTENCIA -> 59;
            case PRIMERO -> 60;
            case PRODUCTO -> 61;
            case RAIZCUADRADA -> 62;
            case REDONDEA -> 63;
            case REPITE -> 64;
            case RESTO -> 65;
            case RETROCEDE -> 66;
            case RUMBO -> 67;
            case SEN -> 68;
            case SI -> 69;
            case SUBELAPIZ -> 70;
            case SUMA -> 71;
            case ULTIMO -> 72;
            case VAR -> 73;
            case VELOCIDAD -> 74;
            default -> 1093;
        };
    }

    private int yys50() {
        return switch (yytok) {
            case AZAR -> 33;
            case COS -> 37;
            case DIFERENCIA -> 38;
            case DIVISION -> 39;
            case ELEGIR -> 41;
            case ELEMENTO -> 42;
            case MENOS -> 49;
            case POTENCIA -> 59;
            case PRIMERO -> 60;
            case PRODUCTO -> 61;
            case RAIZCUADRADA -> 62;
            case REDONDEA -> 63;
            case RESTO -> 65;
            case RUMBO -> 67;
            case SEN -> 68;
            case SUMA -> 71;
            case ULTIMO -> 72;
            case FLOAT -> 80;
            case INTEGER -> 82;
            case BOOLEAN -> 131;
            case IDENTIFIER -> 132;
            case IGUALES -> 133;
            case MAYORQUE -> 134;
            case MENORQUE -> 135;
            case O -> 136;
            case Y -> 137;
            case '(' -> 138;
            default -> 1093;
        };
    }

    private int yys69() {
        return switch (yytok) {
            case AZAR -> 33;
            case COS -> 37;
            case DIFERENCIA -> 38;
            case DIVISION -> 39;
            case ELEGIR -> 41;
            case ELEMENTO -> 42;
            case MENOS -> 49;
            case POTENCIA -> 59;
            case PRIMERO -> 60;
            case PRODUCTO -> 61;
            case RAIZCUADRADA -> 62;
            case REDONDEA -> 63;
            case RESTO -> 65;
            case RUMBO -> 67;
            case SEN -> 68;
            case SUMA -> 71;
            case ULTIMO -> 72;
            case FLOAT -> 80;
            case INTEGER -> 82;
            case BOOLEAN -> 131;
            case IDENTIFIER -> 132;
            case IGUALES -> 133;
            case MAYORQUE -> 134;
            case MENORQUE -> 135;
            case O -> 136;
            case Y -> 137;
            case '(' -> 170;
            default -> 1093;
        };
    }

    private int yys75() {
        return switch (yytok) {
            case APARECETORTUGA -> 31;
            case AVANZA -> 32;
            case AZAR -> 33;
            case BAJALAPIZ -> 34;
            case BORRAPANTALLA -> 35;
            case CENTRO -> 36;
            case COS -> 37;
            case DIFERENCIA -> 38;
            case DIVISION -> 39;
            case EJECUTA -> 40;
            case ELEGIR -> 41;
            case ELEMENTO -> 42;
            case ESPERA -> 43;
            case GIRADERECHA -> 44;
            case GIRAIZQUIERDA -> 45;
            case IDENTIFIER -> 46;
            case INC -> 47;
            case INIC -> 48;
            case MENOS -> 49;
            case MOSTRAR -> 50;
            case OCULTATORTUGA -> 51;
            case PARA -> 52;
            case PONCOLORLAPIZ -> 53;
            case PONPOS -> 54;
            case PONRUMBO -> 55;
            case PONX -> 56;
            case PONXY -> 57;
            case PONY -> 58;
            case POTENCIA -> 59;
            case PRIMERO -> 60;
            case PRODUCTO -> 61;
            case RAIZCUADRADA -> 62;
            case REDONDEA -> 63;
            case REPITE -> 64;
            case RESTO -> 65;
            case RETROCEDE -> 66;
            case RUMBO -> 67;
            case SEN -> 68;
            case SI -> 69;
            case SUBELAPIZ -> 70;
            case SUMA -> 71;
            case ULTIMO -> 72;
            case VAR -> 73;
            case VELOCIDAD -> 74;
            case ENDINPUT -> yyr4();
            default -> 1093;
        };
    }

    private int yys76() {
        return switch (yytok) {
            case APARECETORTUGA -> 31;
            case AVANZA -> 32;
            case AZAR -> 33;
            case BAJALAPIZ -> 34;
            case BORRAPANTALLA -> 35;
            case CENTRO -> 36;
            case COS -> 37;
            case DIFERENCIA -> 38;
            case DIVISION -> 39;
            case EJECUTA -> 40;
            case ELEGIR -> 41;
            case ELEMENTO -> 42;
            case ESPERA -> 43;
            case GIRADERECHA -> 44;
            case GIRAIZQUIERDA -> 45;
            case IDENTIFIER -> 46;
            case INC -> 47;
            case INIC -> 48;
            case MENOS -> 49;
            case MOSTRAR -> 50;
            case OCULTATORTUGA -> 51;
            case PARA -> 52;
            case PONCOLORLAPIZ -> 53;
            case PONPOS -> 54;
            case PONRUMBO -> 55;
            case PONX -> 56;
            case PONXY -> 57;
            case PONY -> 58;
            case POTENCIA -> 59;
            case PRIMERO -> 60;
            case PRODUCTO -> 61;
            case RAIZCUADRADA -> 62;
            case REDONDEA -> 63;
            case REPITE -> 64;
            case RESTO -> 65;
            case RETROCEDE -> 66;
            case RUMBO -> 67;
            case SEN -> 68;
            case SI -> 69;
            case SUBELAPIZ -> 70;
            case SUMA -> 71;
            case ULTIMO -> 72;
            case VAR -> 73;
            case VELOCIDAD -> 74;
            case ENDINPUT -> yyr5();
            default -> 1093;
        };
    }

    private int yys77() {
        return switch (yytok) {
            case '*' -> 179;
            case '+' -> 180;
            case '-' -> 181;
            case '/' -> 182;
            case ';', ')', '(', INTEGER, IDENTIFIER, FLOAT, '[', '>', '<' -> yyr49();
            default -> 1093;
        };
    }

    private int yys78() {
        return switch (yytok) {
            case '*' -> 183;
            case '+' -> 184;
            case '-' -> 185;
            case '/' -> 186;
            case ';', ')', '(', INTEGER, IDENTIFIER, FLOAT, '[', '>', '<' -> yyr40();
            default -> 1093;
        };
    }

    private int yys80() {
        return switch (yytok) {
            case '/', '-', '+', '*', ')', '(', ';', INTEGER, IDENTIFIER, FLOAT, ']', '[', '>', '<' -> yyr41();
            default -> 1093;
        };
    }

    private int yys81() {
        return switch (yytok) {
            case '/', '-', '+', '*', ')', '(', ';', INTEGER, IDENTIFIER, FLOAT, ']', '[', '>', '<' -> yyr26();
            default -> 1093;
        };
    }

    private int yys82() {
        return switch (yytok) {
            case '/', '-', '+', '*', ')', '(', ';', INTEGER, IDENTIFIER, FLOAT, ']', '[', '>', '<' -> yyr27();
            default -> 1093;
        };
    }

    private int yys83() {
        return switch (yytok) {
            case AZAR -> 33;
            case COS -> 37;
            case DIFERENCIA -> 38;
            case DIVISION -> 39;
            case ELEGIR -> 41;
            case ELEMENTO -> 42;
            case MENOS -> 49;
            case POTENCIA -> 59;
            case PRIMERO -> 60;
            case PRODUCTO -> 61;
            case RAIZCUADRADA -> 62;
            case REDONDEA -> 63;
            case RESTO -> 65;
            case RUMBO -> 67;
            case SEN -> 68;
            case SUMA -> 71;
            case ULTIMO -> 72;
            case FLOAT -> 80;
            case IDENTIFIER -> 81;
            case INTEGER -> 82;
            case '(' -> 93;
            default -> 1093;
        };
    }

    private int yys84() {
        return switch (yytok) {
            case '*' -> 179;
            case '+' -> 180;
            case '-' -> 181;
            case '/' -> 182;
            case ';', ')', '[', '>', '<' -> yyr153();
            default -> 1093;
        };
    }

    private int yys85() {
        return switch (yytok) {
            case '*' -> 183;
            case '+' -> 184;
            case '-' -> 185;
            case '/' -> 186;
            case ';', ')', '[', '>', '<' -> yyr40();
            default -> 1093;
        };
    }

    private int yys86() {
        return switch (yytok) {
            case AZAR -> 33;
            case COS -> 37;
            case DIFERENCIA -> 38;
            case DIVISION -> 39;
            case ELEGIR -> 41;
            case ELEMENTO -> 42;
            case MENOS -> 49;
            case POTENCIA -> 59;
            case PRIMERO -> 60;
            case PRODUCTO -> 61;
            case RAIZCUADRADA -> 62;
            case REDONDEA -> 63;
            case RESTO -> 65;
            case RUMBO -> 67;
            case SEN -> 68;
            case SUMA -> 71;
            case ULTIMO -> 72;
            case FLOAT -> 80;
            case IDENTIFIER -> 81;
            case INTEGER -> 82;
            case '(' -> 93;
            default -> 1093;
        };
    }

    private int yys88() {
        return switch (yytok) {
            case AZAR -> 33;
            case COS -> 37;
            case DIFERENCIA -> 38;
            case DIVISION -> 39;
            case ELEGIR -> 41;
            case ELEMENTO -> 42;
            case MENOS -> 49;
            case POTENCIA -> 59;
            case PRIMERO -> 60;
            case PRODUCTO -> 61;
            case RAIZCUADRADA -> 62;
            case REDONDEA -> 63;
            case RESTO -> 65;
            case RUMBO -> 67;
            case SEN -> 68;
            case SUMA -> 71;
            case ULTIMO -> 72;
            case FLOAT -> 80;
            case IDENTIFIER -> 81;
            case INTEGER -> 82;
            case '(' -> 93;
            default -> 1093;
        };
    }

    private int yys89() {
        return switch (yytok) {
            case FLOAT -> 80;
            case IDENTIFIER -> 81;
            case INTEGER -> 82;
            case '(' -> 93;
            case '*' -> 179;
            case '+' -> 180;
            case '-' -> 181;
            case '/' -> 182;
            case ';', ')', ']', '[', '>', '<' -> yyr190();
            default -> 1093;
        };
    }

    private int yys90() {
        return switch (yytok) {
            case INTEGER -> 82;
            case IDENTIFIER -> 99;
            case '(' -> 100;
            case '*' -> 183;
            case '+' -> 184;
            case '-' -> 185;
            case '/' -> 186;
            case ';', ')', FLOAT, ']', '[', '>', '<' -> yyr40();
            default -> 1093;
        };
    }

    private int yys95() {
        return switch (yytok) {
            case AZAR -> 33;
            case COS -> 37;
            case DIFERENCIA -> 38;
            case DIVISION -> 39;
            case ELEGIR -> 41;
            case ELEMENTO -> 42;
            case MENOS -> 49;
            case POTENCIA -> 59;
            case PRIMERO -> 60;
            case PRODUCTO -> 61;
            case RAIZCUADRADA -> 62;
            case REDONDEA -> 63;
            case RESTO -> 65;
            case RUMBO -> 67;
            case SEN -> 68;
            case SUMA -> 71;
            case ULTIMO -> 72;
            case FLOAT -> 80;
            case IDENTIFIER -> 81;
            case INTEGER -> 82;
            case '(' -> 93;
            default -> 1093;
        };
    }

    private int yys96() {
        return switch (yytok) {
            case APARECETORTUGA -> 31;
            case AVANZA -> 32;
            case AZAR -> 33;
            case BAJALAPIZ -> 34;
            case BORRAPANTALLA -> 35;
            case CENTRO -> 36;
            case COS -> 37;
            case DIFERENCIA -> 38;
            case DIVISION -> 39;
            case EJECUTA -> 40;
            case ELEGIR -> 41;
            case ELEMENTO -> 42;
            case ESPERA -> 43;
            case GIRADERECHA -> 44;
            case GIRAIZQUIERDA -> 45;
            case IDENTIFIER -> 46;
            case INC -> 47;
            case INIC -> 48;
            case MENOS -> 49;
            case MOSTRAR -> 50;
            case OCULTATORTUGA -> 51;
            case PONCOLORLAPIZ -> 53;
            case PONPOS -> 54;
            case PONRUMBO -> 55;
            case PONX -> 56;
            case PONXY -> 57;
            case PONY -> 58;
            case POTENCIA -> 59;
            case PRIMERO -> 60;
            case PRODUCTO -> 61;
            case RAIZCUADRADA -> 62;
            case REDONDEA -> 63;
            case REPITE -> 64;
            case RESTO -> 65;
            case RETROCEDE -> 66;
            case RUMBO -> 67;
            case SEN -> 68;
            case SI -> 69;
            case SUBELAPIZ -> 70;
            case SUMA -> 71;
            case ULTIMO -> 72;
            case VAR -> 73;
            case VELOCIDAD -> 74;
            default -> 1093;
        };
    }

    private int yys99() {
        return switch (yytok) {
            case '/', '-', '+', '*', ')', '(', ';', INTEGER, IDENTIFIER, FLOAT, ']', '[', '>', '<' -> yyr26();
            default -> 1093;
        };
    }

    private int yys102() {
        return switch (yytok) {
            case AZAR -> 33;
            case COS -> 37;
            case DIFERENCIA -> 38;
            case DIVISION -> 39;
            case ELEGIR -> 41;
            case ELEMENTO -> 42;
            case MENOS -> 49;
            case POTENCIA -> 59;
            case PRIMERO -> 60;
            case PRODUCTO -> 61;
            case RAIZCUADRADA -> 62;
            case REDONDEA -> 63;
            case RESTO -> 65;
            case RUMBO -> 67;
            case SEN -> 68;
            case SUMA -> 71;
            case ULTIMO -> 72;
            case FLOAT -> 80;
            case IDENTIFIER -> 81;
            case INTEGER -> 82;
            case '(' -> 93;
            default -> 1093;
        };
    }

    private int yys104() {
        return switch (yytok) {
            case AZAR -> 33;
            case COS -> 37;
            case DIFERENCIA -> 38;
            case DIVISION -> 39;
            case ELEGIR -> 41;
            case ELEMENTO -> 42;
            case MENOS -> 49;
            case POTENCIA -> 59;
            case PRIMERO -> 60;
            case PRODUCTO -> 61;
            case RAIZCUADRADA -> 62;
            case REDONDEA -> 63;
            case RESTO -> 65;
            case RUMBO -> 67;
            case SEN -> 68;
            case SUMA -> 71;
            case ULTIMO -> 72;
            case FLOAT -> 80;
            case IDENTIFIER -> 81;
            case INTEGER -> 82;
            case '(' -> 93;
            default -> 1093;
        };
    }

    private int yys106() {
        return switch (yytok) {
            case AZAR -> 33;
            case COS -> 37;
            case DIFERENCIA -> 38;
            case DIVISION -> 39;
            case ELEGIR -> 41;
            case ELEMENTO -> 42;
            case MENOS -> 49;
            case POTENCIA -> 59;
            case PRIMERO -> 60;
            case PRODUCTO -> 61;
            case RAIZCUADRADA -> 62;
            case REDONDEA -> 63;
            case RESTO -> 65;
            case RUMBO -> 67;
            case SEN -> 68;
            case SUMA -> 71;
            case ULTIMO -> 72;
            case FLOAT -> 80;
            case IDENTIFIER -> 81;
            case INTEGER -> 82;
            case '(' -> 93;
            default -> 1093;
        };
    }

    private int yys107() {
        return switch (yytok) {
            case FLOAT -> 80;
            case IDENTIFIER -> 81;
            case INTEGER -> 82;
            case '(' -> 93;
            case '*' -> 179;
            case '+' -> 180;
            case '-' -> 181;
            case '/' -> 182;
            case ';' -> yyr229();
            default -> 1093;
        };
    }

    private int yys108() {
        return switch (yytok) {
            case FLOAT -> 80;
            case IDENTIFIER -> 81;
            case INTEGER -> 82;
            case '(' -> 93;
            case '*' -> 183;
            case '+' -> 184;
            case '-' -> 185;
            case '/' -> 186;
            case ';' -> yyr40();
            default -> 1093;
        };
    }

    private int yys112() {
        return switch (yytok) {
            case '*' -> 179;
            case '+' -> 180;
            case '-' -> 181;
            case '/' -> 182;
            case ';', ')', '[', '>', '<' -> yyr154();
            default -> 1093;
        };
    }

    private int yys113() {
        return switch (yytok) {
            case '*' -> 183;
            case '+' -> 184;
            case '-' -> 185;
            case '/' -> 186;
            case ';', ')', '[', '>', '<' -> yyr40();
            default -> 1093;
        };
    }

    private int yys114() {
        return switch (yytok) {
            case AZAR -> 33;
            case COS -> 37;
            case DIFERENCIA -> 38;
            case DIVISION -> 39;
            case ELEGIR -> 41;
            case ELEMENTO -> 42;
            case MENOS -> 49;
            case POTENCIA -> 59;
            case PRIMERO -> 60;
            case PRODUCTO -> 61;
            case RAIZCUADRADA -> 62;
            case REDONDEA -> 63;
            case RESTO -> 65;
            case RUMBO -> 67;
            case SEN -> 68;
            case SUMA -> 71;
            case ULTIMO -> 72;
            case FLOAT -> 80;
            case IDENTIFIER -> 81;
            case INTEGER -> 82;
            case '(' -> 93;
            default -> 1093;
        };
    }

    private int yys132() {
        return switch (yytok) {
            case ';', '/', '-', '+', '*', ')', '>', '<' -> yyr26();
            case '[' -> yyr63();
            default -> 1093;
        };
    }

    private int yys138() {
        return switch (yytok) {
            case AZAR -> 33;
            case COS -> 37;
            case DIFERENCIA -> 38;
            case DIVISION -> 39;
            case ELEGIR -> 41;
            case ELEMENTO -> 42;
            case MENOS -> 49;
            case POTENCIA -> 59;
            case PRIMERO -> 60;
            case PRODUCTO -> 61;
            case RAIZCUADRADA -> 62;
            case REDONDEA -> 63;
            case RESTO -> 65;
            case RUMBO -> 67;
            case SEN -> 68;
            case SUMA -> 71;
            case ULTIMO -> 72;
            case FLOAT -> 80;
            case INTEGER -> 82;
            case BOOLEAN -> 131;
            case IDENTIFIER -> 132;
            case IGUALES -> 133;
            case MAYORQUE -> 134;
            case MENORQUE -> 135;
            case O -> 136;
            case Y -> 137;
            case '(' -> 170;
            default -> 1093;
        };
    }

    private int yys139() {
        return switch (yytok) {
            case APARECETORTUGA -> 31;
            case AVANZA -> 32;
            case AZAR -> 33;
            case BAJALAPIZ -> 34;
            case BORRAPANTALLA -> 35;
            case CENTRO -> 36;
            case COS -> 37;
            case DIFERENCIA -> 38;
            case DIVISION -> 39;
            case EJECUTA -> 40;
            case ELEGIR -> 41;
            case ELEMENTO -> 42;
            case ESPERA -> 43;
            case GIRADERECHA -> 44;
            case GIRAIZQUIERDA -> 45;
            case INC -> 47;
            case INIC -> 48;
            case MENOS -> 49;
            case MOSTRAR -> 50;
            case OCULTATORTUGA -> 51;
            case PONCOLORLAPIZ -> 53;
            case PONPOS -> 54;
            case PONRUMBO -> 55;
            case PONX -> 56;
            case PONXY -> 57;
            case PONY -> 58;
            case POTENCIA -> 59;
            case PRIMERO -> 60;
            case PRODUCTO -> 61;
            case RAIZCUADRADA -> 62;
            case REDONDEA -> 63;
            case REPITE -> 64;
            case RESTO -> 65;
            case RETROCEDE -> 66;
            case RUMBO -> 67;
            case SEN -> 68;
            case SI -> 69;
            case SUBELAPIZ -> 70;
            case SUMA -> 71;
            case ULTIMO -> 72;
            case VAR -> 73;
            case VELOCIDAD -> 74;
            case IDENTIFIER -> 231;
            default -> 1093;
        };
    }

    private int yys143() {
        return switch (yytok) {
            case AZAR -> 33;
            case COS -> 37;
            case DIFERENCIA -> 38;
            case DIVISION -> 39;
            case ELEGIR -> 41;
            case ELEMENTO -> 42;
            case MENOS -> 49;
            case POTENCIA -> 59;
            case PRIMERO -> 60;
            case PRODUCTO -> 61;
            case RAIZCUADRADA -> 62;
            case REDONDEA -> 63;
            case RESTO -> 65;
            case RUMBO -> 67;
            case SEN -> 68;
            case SUMA -> 71;
            case ULTIMO -> 72;
            case FLOAT -> 80;
            case IDENTIFIER -> 81;
            case INTEGER -> 82;
            case '(' -> 93;
            default -> 1093;
        };
    }

    private int yys145() {
        return switch (yytok) {
            case AZAR -> 33;
            case COS -> 37;
            case DIFERENCIA -> 38;
            case DIVISION -> 39;
            case ELEGIR -> 41;
            case ELEMENTO -> 42;
            case MENOS -> 49;
            case POTENCIA -> 59;
            case PRIMERO -> 60;
            case PRODUCTO -> 61;
            case RAIZCUADRADA -> 62;
            case REDONDEA -> 63;
            case RESTO -> 65;
            case RUMBO -> 67;
            case SEN -> 68;
            case SUMA -> 71;
            case ULTIMO -> 72;
            case FLOAT -> 80;
            case IDENTIFIER -> 81;
            case INTEGER -> 82;
            case '(' -> 93;
            default -> 1093;
        };
    }

    private int yys146() {
        return switch (yytok) {
            case INTEGER -> 82;
            case IDENTIFIER -> 99;
            case '*' -> 183;
            case '+' -> 184;
            case '-' -> 185;
            case '/' -> 186;
            case '(' -> 236;
            default -> 1093;
        };
    }

    private int yys147() {
        return switch (yytok) {
            case REDONDEA -> 63;
            case RESTO -> 65;
            case INTEGER -> 82;
            case IDENTIFIER -> 99;
            case '(' -> 100;
            case AZAR -> 238;
            case DIFERENCIA -> 239;
            case ELEGIR -> 240;
            case ELEMENTO -> 241;
            case MENOS -> 242;
            case POTENCIA -> 243;
            case PRIMERO -> 244;
            case PRODUCTO -> 245;
            case SUMA -> 246;
            case ULTIMO -> 247;
            default -> 1093;
        };
    }

    private int yys149() {
        return switch (yytok) {
            case AZAR -> 33;
            case COS -> 37;
            case DIFERENCIA -> 38;
            case DIVISION -> 39;
            case ELEGIR -> 41;
            case ELEMENTO -> 42;
            case MENOS -> 49;
            case POTENCIA -> 59;
            case PRIMERO -> 60;
            case PRODUCTO -> 61;
            case RAIZCUADRADA -> 62;
            case REDONDEA -> 63;
            case RESTO -> 65;
            case RUMBO -> 67;
            case SEN -> 68;
            case SUMA -> 71;
            case ULTIMO -> 72;
            case FLOAT -> 80;
            case IDENTIFIER -> 81;
            case INTEGER -> 82;
            case '(' -> 93;
            default -> 1093;
        };
    }

    private int yys150() {
        return switch (yytok) {
            case FLOAT -> 80;
            case IDENTIFIER -> 81;
            case INTEGER -> 82;
            case '*' -> 179;
            case '+' -> 180;
            case '-' -> 181;
            case '/' -> 182;
            case '(' -> 251;
            default -> 1093;
        };
    }

    private int yys151() {
        return switch (yytok) {
            case FLOAT -> 80;
            case IDENTIFIER -> 81;
            case INTEGER -> 82;
            case '*' -> 183;
            case '+' -> 184;
            case '-' -> 185;
            case '/' -> 186;
            case '(' -> 254;
            default -> 1093;
        };
    }

    private int yys152() {
        return switch (yytok) {
            case AZAR -> 33;
            case COS -> 37;
            case DIFERENCIA -> 38;
            case DIVISION -> 39;
            case ELEGIR -> 41;
            case ELEMENTO -> 42;
            case MENOS -> 49;
            case POTENCIA -> 59;
            case PRIMERO -> 60;
            case PRODUCTO -> 61;
            case RAIZCUADRADA -> 62;
            case REDONDEA -> 63;
            case RESTO -> 65;
            case RUMBO -> 67;
            case SEN -> 68;
            case SUMA -> 71;
            case ULTIMO -> 72;
            case FLOAT -> 80;
            case IDENTIFIER -> 81;
            case INTEGER -> 82;
            case '(' -> 93;
            default -> 1093;
        };
    }

    private int yys157() {
        return switch (yytok) {
            case AZAR -> 33;
            case COS -> 37;
            case DIFERENCIA -> 38;
            case DIVISION -> 39;
            case ELEGIR -> 41;
            case ELEMENTO -> 42;
            case MENOS -> 49;
            case POTENCIA -> 59;
            case PRIMERO -> 60;
            case PRODUCTO -> 61;
            case RAIZCUADRADA -> 62;
            case REDONDEA -> 63;
            case RESTO -> 65;
            case RUMBO -> 67;
            case SEN -> 68;
            case SUMA -> 71;
            case ULTIMO -> 72;
            case FLOAT -> 80;
            case IDENTIFIER -> 81;
            case INTEGER -> 82;
            case '(' -> 93;
            default -> 1093;
        };
    }

    private int yys158() {
        return switch (yytok) {
            case '*' -> 179;
            case '+' -> 180;
            case '-' -> 181;
            case '/' -> 182;
            case ';', ')', '[', '>', '<' -> yyr147();
            default -> 1093;
        };
    }

    private int yys159() {
        return switch (yytok) {
            case '*' -> 183;
            case '+' -> 184;
            case '-' -> 185;
            case '/' -> 186;
            case ';', ')', '(', INTEGER, IDENTIFIER, FLOAT, ']', '[', '>', '<' -> yyr40();
            default -> 1093;
        };
    }

    private int yys160() {
        return switch (yytok) {
            case AZAR -> 33;
            case COS -> 37;
            case DIFERENCIA -> 38;
            case DIVISION -> 39;
            case ELEGIR -> 41;
            case ELEMENTO -> 42;
            case MENOS -> 49;
            case POTENCIA -> 59;
            case PRIMERO -> 60;
            case PRODUCTO -> 61;
            case RAIZCUADRADA -> 62;
            case REDONDEA -> 63;
            case RESTO -> 65;
            case RUMBO -> 67;
            case SEN -> 68;
            case SUMA -> 71;
            case ULTIMO -> 72;
            case FLOAT -> 80;
            case IDENTIFIER -> 81;
            case INTEGER -> 82;
            case '(' -> 93;
            default -> 1093;
        };
    }

    private int yys163() {
        return switch (yytok) {
            case AZAR -> 33;
            case COS -> 37;
            case DIFERENCIA -> 38;
            case DIVISION -> 39;
            case ELEGIR -> 41;
            case ELEMENTO -> 42;
            case MENOS -> 49;
            case POTENCIA -> 59;
            case PRIMERO -> 60;
            case PRODUCTO -> 61;
            case RAIZCUADRADA -> 62;
            case REDONDEA -> 63;
            case RESTO -> 65;
            case RUMBO -> 67;
            case SEN -> 68;
            case SUMA -> 71;
            case ULTIMO -> 72;
            case FLOAT -> 80;
            case IDENTIFIER -> 81;
            case INTEGER -> 82;
            case '(' -> 93;
            default -> 1093;
        };
    }

    private int yys165() {
        return switch (yytok) {
            case AZAR -> 33;
            case COS -> 37;
            case DIFERENCIA -> 38;
            case DIVISION -> 39;
            case ELEGIR -> 41;
            case ELEMENTO -> 42;
            case MENOS -> 49;
            case POTENCIA -> 59;
            case PRIMERO -> 60;
            case PRODUCTO -> 61;
            case RAIZCUADRADA -> 62;
            case REDONDEA -> 63;
            case RESTO -> 65;
            case RUMBO -> 67;
            case SEN -> 68;
            case SUMA -> 71;
            case ULTIMO -> 72;
            case FLOAT -> 80;
            case IDENTIFIER -> 81;
            case INTEGER -> 82;
            case '(' -> 93;
            default -> 1093;
        };
    }

    private int yys167() {
        return switch (yytok) {
            case AZAR -> 33;
            case COS -> 37;
            case DIFERENCIA -> 38;
            case DIVISION -> 39;
            case ELEGIR -> 41;
            case ELEMENTO -> 42;
            case MENOS -> 49;
            case POTENCIA -> 59;
            case PRIMERO -> 60;
            case PRODUCTO -> 61;
            case RAIZCUADRADA -> 62;
            case REDONDEA -> 63;
            case RESTO -> 65;
            case RUMBO -> 67;
            case SEN -> 68;
            case SUMA -> 71;
            case ULTIMO -> 72;
            case FLOAT -> 80;
            case IDENTIFIER -> 81;
            case INTEGER -> 82;
            case '(' -> 93;
            default -> 1093;
        };
    }

    private int yys170() {
        return switch (yytok) {
            case AZAR -> 33;
            case COS -> 37;
            case DIFERENCIA -> 38;
            case DIVISION -> 39;
            case ELEGIR -> 41;
            case ELEMENTO -> 42;
            case MENOS -> 49;
            case POTENCIA -> 59;
            case PRIMERO -> 60;
            case PRODUCTO -> 61;
            case RAIZCUADRADA -> 62;
            case REDONDEA -> 63;
            case RESTO -> 65;
            case RUMBO -> 67;
            case SEN -> 68;
            case SUMA -> 71;
            case ULTIMO -> 72;
            case FLOAT -> 80;
            case INTEGER -> 82;
            case BOOLEAN -> 131;
            case IDENTIFIER -> 132;
            case IGUALES -> 133;
            case MAYORQUE -> 134;
            case MENORQUE -> 135;
            case O -> 136;
            case Y -> 137;
            case '(' -> 170;
            default -> 1093;
        };
    }

    private int yys176() {
        return switch (yytok) {
            case REDONDEA -> 63;
            case RESTO -> 65;
            case INTEGER -> 82;
            case IDENTIFIER -> 99;
            case '(' -> 100;
            case AZAR -> 238;
            case DIFERENCIA -> 239;
            case ELEGIR -> 240;
            case ELEMENTO -> 241;
            case MENOS -> 242;
            case POTENCIA -> 243;
            case PRIMERO -> 244;
            case PRODUCTO -> 245;
            case SUMA -> 246;
            case ULTIMO -> 247;
            default -> 1093;
        };
    }

    private int yys193() {
        return switch (yytok) {
            case ';', ')', ']', '[', '>', '<' -> yyr189();
            default -> 1093;
        };
    }

    private int yys194() {
        return switch (yytok) {
            case INTEGER -> 82;
            case IDENTIFIER -> 99;
            case '(' -> 100;
            case '*' -> 183;
            case '+' -> 184;
            case '-' -> 185;
            case '/' -> 186;
            case ';', ')', ']', '[', '>', '<' -> yyr188();
            default -> 1093;
        };
    }

    private int yys195() {
        return switch (yytok) {
            case ';', ')', ']', '[', '>', '<' -> yyr187();
            default -> 1093;
        };
    }

    private int yys197() {
        return switch (yytok) {
            case AZAR -> 33;
            case COS -> 37;
            case DIFERENCIA -> 38;
            case DIVISION -> 39;
            case ELEGIR -> 41;
            case ELEMENTO -> 42;
            case MENOS -> 49;
            case POTENCIA -> 59;
            case PRIMERO -> 60;
            case PRODUCTO -> 61;
            case RAIZCUADRADA -> 62;
            case REDONDEA -> 63;
            case RESTO -> 65;
            case RUMBO -> 67;
            case SEN -> 68;
            case SUMA -> 71;
            case ULTIMO -> 72;
            case FLOAT -> 80;
            case IDENTIFIER -> 81;
            case INTEGER -> 82;
            case '(' -> 93;
            default -> 1093;
        };
    }

    private int yys211() {
        return switch (yytok) {
            case AZAR -> 33;
            case COS -> 37;
            case DIFERENCIA -> 38;
            case DIVISION -> 39;
            case ELEGIR -> 41;
            case ELEMENTO -> 42;
            case MENOS -> 49;
            case POTENCIA -> 59;
            case PRIMERO -> 60;
            case PRODUCTO -> 61;
            case RAIZCUADRADA -> 62;
            case REDONDEA -> 63;
            case RESTO -> 65;
            case RUMBO -> 67;
            case SEN -> 68;
            case SUMA -> 71;
            case ULTIMO -> 72;
            case BOOLEAN -> 308;
            case FLOAT -> 309;
            case IDENTIFIER -> 310;
            case IGUALES -> 311;
            case INTEGER -> 312;
            case MAYORQUE -> 313;
            case MENORQUE -> 314;
            case O -> 315;
            case Y -> 316;
            case '(' -> 317;
            default -> 1093;
        };
    }

    private int yys214() {
        return switch (yytok) {
            case AZAR -> 33;
            case COS -> 37;
            case DIFERENCIA -> 38;
            case DIVISION -> 39;
            case ELEGIR -> 41;
            case ELEMENTO -> 42;
            case MENOS -> 49;
            case POTENCIA -> 59;
            case PRIMERO -> 60;
            case PRODUCTO -> 61;
            case RAIZCUADRADA -> 62;
            case REDONDEA -> 63;
            case RESTO -> 65;
            case RUMBO -> 67;
            case SEN -> 68;
            case SUMA -> 71;
            case ULTIMO -> 72;
            default -> 1093;
        };
    }

    private int yys215() {
        return switch (yytok) {
            case AZAR -> 33;
            case COS -> 37;
            case DIFERENCIA -> 38;
            case DIVISION -> 39;
            case ELEGIR -> 41;
            case ELEMENTO -> 42;
            case MENOS -> 49;
            case POTENCIA -> 59;
            case PRIMERO -> 60;
            case PRODUCTO -> 61;
            case RAIZCUADRADA -> 62;
            case REDONDEA -> 63;
            case RESTO -> 65;
            case RUMBO -> 67;
            case SEN -> 68;
            case SUMA -> 71;
            case ULTIMO -> 72;
            default -> 1093;
        };
    }

    private int yys219() {
        return switch (yytok) {
            case AZAR -> 33;
            case COS -> 37;
            case DIFERENCIA -> 38;
            case DIVISION -> 39;
            case ELEGIR -> 41;
            case ELEMENTO -> 42;
            case MENOS -> 49;
            case POTENCIA -> 59;
            case PRIMERO -> 60;
            case PRODUCTO -> 61;
            case RAIZCUADRADA -> 62;
            case REDONDEA -> 63;
            case RESTO -> 65;
            case RUMBO -> 67;
            case SEN -> 68;
            case SUMA -> 71;
            case ULTIMO -> 72;
            case FLOAT -> 80;
            case IDENTIFIER -> 81;
            case INTEGER -> 82;
            case '(' -> 93;
            default -> 1093;
        };
    }

    private int yys222() {
        return switch (yytok) {
            case AZAR -> 33;
            case COS -> 37;
            case DIFERENCIA -> 38;
            case DIVISION -> 39;
            case ELEGIR -> 41;
            case ELEMENTO -> 42;
            case MENOS -> 49;
            case POTENCIA -> 59;
            case PRIMERO -> 60;
            case PRODUCTO -> 61;
            case RAIZCUADRADA -> 62;
            case REDONDEA -> 63;
            case RESTO -> 65;
            case RUMBO -> 67;
            case SEN -> 68;
            case SUMA -> 71;
            case ULTIMO -> 72;
            case FLOAT -> 80;
            case INTEGER -> 82;
            case BOOLEAN -> 131;
            case IDENTIFIER -> 132;
            case IGUALES -> 133;
            case MAYORQUE -> 134;
            case MENORQUE -> 135;
            case O -> 136;
            case Y -> 137;
            case '(' -> 170;
            default -> 1093;
        };
    }

    private int yys223() {
        return switch (yytok) {
            case AZAR -> 33;
            case COS -> 37;
            case DIFERENCIA -> 38;
            case DIVISION -> 39;
            case ELEGIR -> 41;
            case ELEMENTO -> 42;
            case MENOS -> 49;
            case POTENCIA -> 59;
            case PRIMERO -> 60;
            case PRODUCTO -> 61;
            case RAIZCUADRADA -> 62;
            case REDONDEA -> 63;
            case RESTO -> 65;
            case RUMBO -> 67;
            case SEN -> 68;
            case SUMA -> 71;
            case ULTIMO -> 72;
            case FLOAT -> 80;
            case INTEGER -> 82;
            case BOOLEAN -> 131;
            case IDENTIFIER -> 132;
            case IGUALES -> 133;
            case MAYORQUE -> 134;
            case MENORQUE -> 135;
            case O -> 136;
            case Y -> 137;
            case '(' -> 170;
            default -> 1093;
        };
    }

    private int yys224() {
        return switch (yytok) {
            case '*' -> 179;
            case '+' -> 180;
            case '-' -> 181;
            case '/' -> 182;
            case ')' -> 280;
            case '>', '<' -> yyr49();
            default -> 1093;
        };
    }

    private int yys226() {
        return switch (yytok) {
            case '*' -> 183;
            case '+' -> 184;
            case '-' -> 185;
            case '/' -> 186;
            case ')' -> 282;
            case '>', '<' -> yyr40();
            default -> 1093;
        };
    }

    private int yys230() {
        return switch (yytok) {
            case APARECETORTUGA -> 31;
            case AVANZA -> 32;
            case AZAR -> 33;
            case BAJALAPIZ -> 34;
            case BORRAPANTALLA -> 35;
            case CENTRO -> 36;
            case COS -> 37;
            case DIFERENCIA -> 38;
            case DIVISION -> 39;
            case EJECUTA -> 40;
            case ELEGIR -> 41;
            case ELEMENTO -> 42;
            case ESPERA -> 43;
            case GIRADERECHA -> 44;
            case GIRAIZQUIERDA -> 45;
            case IDENTIFIER -> 46;
            case INC -> 47;
            case INIC -> 48;
            case MENOS -> 49;
            case MOSTRAR -> 50;
            case OCULTATORTUGA -> 51;
            case PONCOLORLAPIZ -> 53;
            case PONPOS -> 54;
            case PONRUMBO -> 55;
            case PONX -> 56;
            case PONXY -> 57;
            case PONY -> 58;
            case POTENCIA -> 59;
            case PRIMERO -> 60;
            case PRODUCTO -> 61;
            case RAIZCUADRADA -> 62;
            case REDONDEA -> 63;
            case REPITE -> 64;
            case RESTO -> 65;
            case RETROCEDE -> 66;
            case RUMBO -> 67;
            case SEN -> 68;
            case SI -> 69;
            case SUBELAPIZ -> 70;
            case SUMA -> 71;
            case ULTIMO -> 72;
            case VAR -> 73;
            case VELOCIDAD -> 74;
            default -> 1093;
        };
    }

    private int yys231() {
        return switch (yytok) {
            case BOOLEAN, FIN, CUENTA, '/', ']', COLOR, '>', ')', Y, '=', '-', '<', PARA, O, ENDINPUT, '[', '*', '+', error, MENORQUE, IGUALES, MAYORQUE -> 1093;
            case FLOAT -> 80;
            case INTEGER -> 82;
            case '(' -> 93;
            case IDENTIFIER -> 336;
            case ';' -> yyr231();
            default -> yyr223();
        };
    }

    private int yys232() {
        return switch (yytok) {
            case INTEGER -> 82;
            case IDENTIFIER -> 99;
            case '(' -> 100;
            case '*' -> 183;
            case '+' -> 184;
            case '-' -> 185;
            case '/' -> 186;
            default -> 1093;
        };
    }

    private int yys236() {
        return switch (yytok) {
            case REDONDEA -> 63;
            case RESTO -> 65;
            case INTEGER -> 82;
            case IDENTIFIER -> 99;
            case '(' -> 100;
            case AZAR -> 238;
            case DIFERENCIA -> 239;
            case ELEGIR -> 240;
            case ELEMENTO -> 241;
            case MENOS -> 242;
            case POTENCIA -> 243;
            case PRIMERO -> 244;
            case PRODUCTO -> 245;
            case SUMA -> 246;
            case ULTIMO -> 247;
            default -> 1093;
        };
    }

    private int yys249() {
        return switch (yytok) {
            case '*' -> 179;
            case '+' -> 180;
            case '-' -> 181;
            case '/' -> 182;
            case ';', ')', '[', '>', '<' -> yyr175();
            default -> 1093;
        };
    }

    private int yys250() {
        return switch (yytok) {
            case '*' -> 183;
            case '+' -> 184;
            case '-' -> 185;
            case '/' -> 186;
            case ';', ')', '[', '>', '<' -> yyr40();
            default -> 1093;
        };
    }

    private int yys251() {
        return switch (yytok) {
            case COS -> 37;
            case DIVISION -> 39;
            case RAIZCUADRADA -> 62;
            case RUMBO -> 67;
            case SEN -> 68;
            case FLOAT -> 80;
            case IDENTIFIER -> 81;
            case INTEGER -> 82;
            case '(' -> 93;
            case AZAR -> 354;
            case DIFERENCIA -> 355;
            case ELEGIR -> 356;
            case ELEMENTO -> 357;
            case MENOS -> 358;
            case POTENCIA -> 359;
            case PRIMERO -> 360;
            case PRODUCTO -> 361;
            case SUMA -> 362;
            case ULTIMO -> 363;
            default -> 1093;
        };
    }

    private int yys252() {
        return switch (yytok) {
            case '*' -> 179;
            case '+' -> 180;
            case '-' -> 181;
            case '/' -> 182;
            case ';', ')', '[', '>', '<' -> yyr176();
            default -> 1093;
        };
    }

    private int yys253() {
        return switch (yytok) {
            case '*' -> 183;
            case '+' -> 184;
            case '-' -> 185;
            case '/' -> 186;
            case ';', ')', '[', '>', '<' -> yyr40();
            default -> 1093;
        };
    }

    private int yys254() {
        return switch (yytok) {
            case AZAR -> 33;
            case COS -> 37;
            case DIFERENCIA -> 38;
            case DIVISION -> 39;
            case ELEGIR -> 41;
            case ELEMENTO -> 42;
            case MENOS -> 49;
            case POTENCIA -> 59;
            case PRIMERO -> 60;
            case PRODUCTO -> 61;
            case RAIZCUADRADA -> 62;
            case REDONDEA -> 63;
            case RESTO -> 65;
            case RUMBO -> 67;
            case SEN -> 68;
            case SUMA -> 71;
            case ULTIMO -> 72;
            case FLOAT -> 80;
            case IDENTIFIER -> 81;
            case INTEGER -> 82;
            case '(' -> 93;
            default -> 1093;
        };
    }

    private int yys261() {
        return switch (yytok) {
            case APARECETORTUGA -> 31;
            case AVANZA -> 32;
            case AZAR -> 33;
            case BAJALAPIZ -> 34;
            case BORRAPANTALLA -> 35;
            case CENTRO -> 36;
            case COS -> 37;
            case DIFERENCIA -> 38;
            case DIVISION -> 39;
            case EJECUTA -> 40;
            case ELEGIR -> 41;
            case ELEMENTO -> 42;
            case ESPERA -> 43;
            case GIRADERECHA -> 44;
            case GIRAIZQUIERDA -> 45;
            case IDENTIFIER -> 46;
            case INC -> 47;
            case INIC -> 48;
            case MENOS -> 49;
            case MOSTRAR -> 50;
            case OCULTATORTUGA -> 51;
            case PONCOLORLAPIZ -> 53;
            case PONPOS -> 54;
            case PONRUMBO -> 55;
            case PONX -> 56;
            case PONXY -> 57;
            case PONY -> 58;
            case POTENCIA -> 59;
            case PRIMERO -> 60;
            case PRODUCTO -> 61;
            case RAIZCUADRADA -> 62;
            case REDONDEA -> 63;
            case REPITE -> 64;
            case RESTO -> 65;
            case RETROCEDE -> 66;
            case RUMBO -> 67;
            case SEN -> 68;
            case SI -> 69;
            case SUBELAPIZ -> 70;
            case SUMA -> 71;
            case ULTIMO -> 72;
            case VAR -> 73;
            case VELOCIDAD -> 74;
            default -> 1093;
        };
    }

    private int yys266() {
        return switch (yytok) {
            case APARECETORTUGA -> 31;
            case AVANZA -> 32;
            case AZAR -> 33;
            case BAJALAPIZ -> 34;
            case BORRAPANTALLA -> 35;
            case CENTRO -> 36;
            case COS -> 37;
            case DIFERENCIA -> 38;
            case DIVISION -> 39;
            case EJECUTA -> 40;
            case ELEGIR -> 41;
            case ELEMENTO -> 42;
            case ESPERA -> 43;
            case GIRADERECHA -> 44;
            case GIRAIZQUIERDA -> 45;
            case IDENTIFIER -> 46;
            case INC -> 47;
            case INIC -> 48;
            case MENOS -> 49;
            case MOSTRAR -> 50;
            case OCULTATORTUGA -> 51;
            case PONCOLORLAPIZ -> 53;
            case PONPOS -> 54;
            case PONRUMBO -> 55;
            case PONX -> 56;
            case PONXY -> 57;
            case PONY -> 58;
            case POTENCIA -> 59;
            case PRIMERO -> 60;
            case PRODUCTO -> 61;
            case RAIZCUADRADA -> 62;
            case REDONDEA -> 63;
            case REPITE -> 64;
            case RESTO -> 65;
            case RETROCEDE -> 66;
            case RUMBO -> 67;
            case SEN -> 68;
            case SI -> 69;
            case SUBELAPIZ -> 70;
            case SUMA -> 71;
            case ULTIMO -> 72;
            case VAR -> 73;
            case VELOCIDAD -> 74;
            default -> 1093;
        };
    }

    private int yys270() {
        return switch (yytok) {
            case AZAR -> 33;
            case COS -> 37;
            case DIFERENCIA -> 38;
            case DIVISION -> 39;
            case ELEGIR -> 41;
            case ELEMENTO -> 42;
            case MENOS -> 49;
            case POTENCIA -> 59;
            case PRIMERO -> 60;
            case PRODUCTO -> 61;
            case RAIZCUADRADA -> 62;
            case REDONDEA -> 63;
            case RESTO -> 65;
            case RUMBO -> 67;
            case SEN -> 68;
            case SUMA -> 71;
            case ULTIMO -> 72;
            case BOOLEAN -> 308;
            case FLOAT -> 309;
            case IGUALES -> 311;
            case INTEGER -> 312;
            case MAYORQUE -> 313;
            case MENORQUE -> 314;
            case O -> 315;
            case Y -> 316;
            case '(' -> 317;
            case IDENTIFIER -> 385;
            default -> 1093;
        };
    }

    private int yys272() {
        return switch (yytok) {
            case '/', '-', '+', '*', ')', '(', ';', INTEGER, IDENTIFIER, FLOAT, ']', '[', '>', '<' -> yyr36();
            default -> 1093;
        };
    }

    private int yys273() {
        return switch (yytok) {
            case '*' -> 179;
            case '/' -> 182;
            case ';', '-', '+', ')', '(', INTEGER, IDENTIFIER, FLOAT, ']', '[', '>', '<' -> yyr34();
            default -> 1093;
        };
    }

    private int yys274() {
        return switch (yytok) {
            case '*' -> 179;
            case '/' -> 182;
            case ';', '-', '+', ')', '(', INTEGER, IDENTIFIER, FLOAT, ']', '[', '>', '<' -> yyr35();
            default -> 1093;
        };
    }

    private int yys275() {
        return switch (yytok) {
            case '/', '-', '+', '*', ')', '(', ';', INTEGER, IDENTIFIER, FLOAT, ']', '[', '>', '<' -> yyr37();
            default -> 1093;
        };
    }

    private int yys276() {
        return switch (yytok) {
            case '/', '-', '+', '*', ')', '(', ';', INTEGER, IDENTIFIER, FLOAT, ']', '[', '>', '<' -> yyr23();
            default -> 1093;
        };
    }

    private int yys277() {
        return switch (yytok) {
            case '*' -> 183;
            case '/' -> 186;
            case ';', '-', '+', ')', '(', INTEGER, IDENTIFIER, FLOAT, ']', '[', '>', '<' -> yyr21();
            default -> 1093;
        };
    }

    private int yys278() {
        return switch (yytok) {
            case '*' -> 183;
            case '/' -> 186;
            case ';', '-', '+', ')', '(', INTEGER, IDENTIFIER, FLOAT, ']', '[', '>', '<' -> yyr22();
            default -> 1093;
        };
    }

    private int yys279() {
        return switch (yytok) {
            case '/', '-', '+', '*', ')', '(', ';', INTEGER, IDENTIFIER, FLOAT, ']', '[', '>', '<' -> yyr24();
            default -> 1093;
        };
    }

    private int yys280() {
        return switch (yytok) {
            case '/', '-', '+', '*', ')', '(', ';', INTEGER, IDENTIFIER, FLOAT, ']', '[', '>', '<' -> yyr38();
            default -> 1093;
        };
    }

    private int yys282() {
        return switch (yytok) {
            case '/', '-', '+', '*', ')', '(', ';', INTEGER, IDENTIFIER, FLOAT, ']', '[', '>', '<' -> yyr25();
            default -> 1093;
        };
    }

    private int yys289() {
        return switch (yytok) {
            case APARECETORTUGA -> 31;
            case AVANZA -> 32;
            case AZAR -> 33;
            case BAJALAPIZ -> 34;
            case BORRAPANTALLA -> 35;
            case CENTRO -> 36;
            case COS -> 37;
            case DIFERENCIA -> 38;
            case DIVISION -> 39;
            case EJECUTA -> 40;
            case ELEGIR -> 41;
            case ELEMENTO -> 42;
            case ESPERA -> 43;
            case GIRADERECHA -> 44;
            case GIRAIZQUIERDA -> 45;
            case IDENTIFIER -> 46;
            case INC -> 47;
            case INIC -> 48;
            case MENOS -> 49;
            case MOSTRAR -> 50;
            case OCULTATORTUGA -> 51;
            case PONCOLORLAPIZ -> 53;
            case PONPOS -> 54;
            case PONRUMBO -> 55;
            case PONX -> 56;
            case PONXY -> 57;
            case PONY -> 58;
            case POTENCIA -> 59;
            case PRIMERO -> 60;
            case PRODUCTO -> 61;
            case RAIZCUADRADA -> 62;
            case REDONDEA -> 63;
            case REPITE -> 64;
            case RESTO -> 65;
            case RETROCEDE -> 66;
            case RUMBO -> 67;
            case SEN -> 68;
            case SI -> 69;
            case SUBELAPIZ -> 70;
            case SUMA -> 71;
            case ULTIMO -> 72;
            case VAR -> 73;
            case VELOCIDAD -> 74;
            case ']' -> yyr218();
            default -> 1093;
        };
    }

    private int yys300() {
        return switch (yytok) {
            case '*' -> 394;
            case '+' -> 395;
            case '-' -> 396;
            case '/' -> 397;
            case '>', '<' -> yyr49();
            default -> 1093;
        };
    }

    private int yys305() {
        return switch (yytok) {
            case '*' -> 400;
            case '+' -> 401;
            case '-' -> 402;
            case '/' -> 403;
            case '>', '<' -> yyr40();
            default -> 1093;
        };
    }

    private int yys309() {
        return switch (yytok) {
            case '/', '-', '+', '*', '>', '<' -> yyr41();
            case ';' -> yyr47();
            default -> 1093;
        };
    }

    private int yys310() {
        return switch (yytok) {
            case '/', '-', '+', '*', '>', '<' -> yyr26();
            case ';' -> yyr114();
            default -> 1093;
        };
    }

    private int yys312() {
        return switch (yytok) {
            case '/', '-', '+', '*', '>', '<' -> yyr27();
            case ';' -> yyr33();
            default -> 1093;
        };
    }

    private int yys317() {
        return switch (yytok) {
            case AZAR -> 33;
            case COS -> 37;
            case DIFERENCIA -> 38;
            case DIVISION -> 39;
            case ELEGIR -> 41;
            case ELEMENTO -> 42;
            case MENOS -> 49;
            case POTENCIA -> 59;
            case PRIMERO -> 60;
            case PRODUCTO -> 61;
            case RAIZCUADRADA -> 62;
            case REDONDEA -> 63;
            case RESTO -> 65;
            case RUMBO -> 67;
            case SEN -> 68;
            case SUMA -> 71;
            case ULTIMO -> 72;
            case FLOAT -> 80;
            case INTEGER -> 82;
            case BOOLEAN -> 131;
            case IDENTIFIER -> 132;
            case IGUALES -> 133;
            case MAYORQUE -> 134;
            case MENORQUE -> 135;
            case O -> 136;
            case Y -> 137;
            case '(' -> 170;
            default -> 1093;
        };
    }

    private int yys332() {
        return switch (yytok) {
            case APARECETORTUGA -> 31;
            case AVANZA -> 32;
            case AZAR -> 33;
            case BAJALAPIZ -> 34;
            case BORRAPANTALLA -> 35;
            case CENTRO -> 36;
            case COS -> 37;
            case DIFERENCIA -> 38;
            case DIVISION -> 39;
            case EJECUTA -> 40;
            case ELEGIR -> 41;
            case ELEMENTO -> 42;
            case ESPERA -> 43;
            case GIRADERECHA -> 44;
            case GIRAIZQUIERDA -> 45;
            case IDENTIFIER -> 46;
            case INC -> 47;
            case INIC -> 48;
            case MENOS -> 49;
            case MOSTRAR -> 50;
            case OCULTATORTUGA -> 51;
            case PONCOLORLAPIZ -> 53;
            case PONPOS -> 54;
            case PONRUMBO -> 55;
            case PONX -> 56;
            case PONXY -> 57;
            case PONY -> 58;
            case POTENCIA -> 59;
            case PRIMERO -> 60;
            case PRODUCTO -> 61;
            case RAIZCUADRADA -> 62;
            case REDONDEA -> 63;
            case REPITE -> 64;
            case RESTO -> 65;
            case RETROCEDE -> 66;
            case RUMBO -> 67;
            case SEN -> 68;
            case SI -> 69;
            case SUBELAPIZ -> 70;
            case SUMA -> 71;
            case ULTIMO -> 72;
            case VAR -> 73;
            case VELOCIDAD -> 74;
            case ']', FIN -> yyr192();
            default -> 1093;
        };
    }

    private int yys335() {
        return switch (yytok) {
            case '(', FIN, '*', error, ']', COLOR, '>', '+', MENORQUE, IGUALES, '/', FLOAT, PARA, O, ENDINPUT, '[', '<', '-', ')', Y, INTEGER, MAYORQUE, BOOLEAN, CUENTA, ';', '=' -> 1093;
            default -> yyr222();
        };
    }

    private int yys336() {
        return switch (yytok) {
            case ')', IGUALES, '=', MENORQUE, FIN, MAYORQUE, '>', error, Y, BOOLEAN, CUENTA, '<', COLOR, PARA, ENDINPUT, '[', O, ']' -> 1093;
            case IDENTIFIER -> 425;
            case '+', '/', INTEGER, '(', ';', '-', FLOAT, '*' -> yyr26();
            default -> yyr223();
        };
    }

    private int yys343() {
        return switch (yytok) {
            case REDONDEA -> 63;
            case RESTO -> 65;
            case INTEGER -> 82;
            case IDENTIFIER -> 99;
            case '(' -> 100;
            case AZAR -> 238;
            case DIFERENCIA -> 239;
            case ELEGIR -> 240;
            case ELEMENTO -> 241;
            case MENOS -> 242;
            case POTENCIA -> 243;
            case PRIMERO -> 244;
            case PRODUCTO -> 245;
            case SUMA -> 246;
            case ULTIMO -> 247;
            default -> 1093;
        };
    }

    private int yys347() {
        return switch (yytok) {
            case REDONDEA -> 63;
            case RESTO -> 65;
            case INTEGER -> 82;
            case IDENTIFIER -> 99;
            case '(' -> 100;
            case AZAR -> 238;
            case DIFERENCIA -> 239;
            case ELEGIR -> 240;
            case ELEMENTO -> 241;
            case MENOS -> 242;
            case POTENCIA -> 243;
            case PRIMERO -> 244;
            case PRODUCTO -> 245;
            case SUMA -> 246;
            case ULTIMO -> 247;
            default -> 1093;
        };
    }

    private int yys348() {
        return switch (yytok) {
            case INTEGER -> 82;
            case IDENTIFIER -> 99;
            case '*' -> 183;
            case '+' -> 184;
            case '-' -> 185;
            case '/' -> 186;
            case '(' -> 432;
            default -> 1093;
        };
    }

    private int yys349() {
        return switch (yytok) {
            case REDONDEA -> 63;
            case RESTO -> 65;
            case INTEGER -> 82;
            case IDENTIFIER -> 99;
            case '(' -> 100;
            case AZAR -> 238;
            case DIFERENCIA -> 239;
            case ELEGIR -> 240;
            case ELEMENTO -> 241;
            case MENOS -> 242;
            case POTENCIA -> 243;
            case PRIMERO -> 244;
            case PRODUCTO -> 245;
            case SUMA -> 246;
            case ULTIMO -> 247;
            default -> 1093;
        };
    }

    private int yys385() {
        return switch (yytok) {
            case ';' -> yyr108();
            case '/', '-', '+', '*', '>', '<' -> yyr26();
            default -> 1093;
        };
    }

    private int yys389() {
        return switch (yytok) {
            case AZAR -> 33;
            case COS -> 37;
            case DIFERENCIA -> 38;
            case DIVISION -> 39;
            case ELEGIR -> 41;
            case ELEMENTO -> 42;
            case MENOS -> 49;
            case POTENCIA -> 59;
            case PRIMERO -> 60;
            case PRODUCTO -> 61;
            case RAIZCUADRADA -> 62;
            case REDONDEA -> 63;
            case RESTO -> 65;
            case RUMBO -> 67;
            case SEN -> 68;
            case SUMA -> 71;
            case ULTIMO -> 72;
            case FLOAT -> 80;
            case IDENTIFIER -> 81;
            case INTEGER -> 82;
            case '(' -> 93;
            default -> 1093;
        };
    }

    private int yys398() {
        return switch (yytok) {
            case AZAR -> 33;
            case COS -> 37;
            case DIFERENCIA -> 38;
            case DIVISION -> 39;
            case ELEGIR -> 41;
            case ELEMENTO -> 42;
            case MENOS -> 49;
            case POTENCIA -> 59;
            case PRIMERO -> 60;
            case PRODUCTO -> 61;
            case RAIZCUADRADA -> 62;
            case REDONDEA -> 63;
            case RESTO -> 65;
            case RUMBO -> 67;
            case SEN -> 68;
            case SUMA -> 71;
            case ULTIMO -> 72;
            default -> 1093;
        };
    }

    private int yys399() {
        return switch (yytok) {
            case AZAR -> 33;
            case COS -> 37;
            case DIFERENCIA -> 38;
            case DIVISION -> 39;
            case ELEGIR -> 41;
            case ELEMENTO -> 42;
            case MENOS -> 49;
            case POTENCIA -> 59;
            case PRIMERO -> 60;
            case PRODUCTO -> 61;
            case RAIZCUADRADA -> 62;
            case REDONDEA -> 63;
            case RESTO -> 65;
            case RUMBO -> 67;
            case SEN -> 68;
            case SUMA -> 71;
            case ULTIMO -> 72;
            default -> 1093;
        };
    }

    private int yys407() {
        return switch (yytok) {
            case AZAR -> 33;
            case COS -> 37;
            case DIFERENCIA -> 38;
            case DIVISION -> 39;
            case ELEGIR -> 41;
            case ELEMENTO -> 42;
            case MENOS -> 49;
            case POTENCIA -> 59;
            case PRIMERO -> 60;
            case PRODUCTO -> 61;
            case RAIZCUADRADA -> 62;
            case REDONDEA -> 63;
            case RESTO -> 65;
            case RUMBO -> 67;
            case SEN -> 68;
            case SUMA -> 71;
            case ULTIMO -> 72;
            case FLOAT -> 80;
            case IDENTIFIER -> 81;
            case INTEGER -> 82;
            case '(' -> 93;
            default -> 1093;
        };
    }

    private int yys409() {
        return switch (yytok) {
            case AZAR -> 33;
            case COS -> 37;
            case DIFERENCIA -> 38;
            case DIVISION -> 39;
            case ELEGIR -> 41;
            case ELEMENTO -> 42;
            case MENOS -> 49;
            case POTENCIA -> 59;
            case PRIMERO -> 60;
            case PRODUCTO -> 61;
            case RAIZCUADRADA -> 62;
            case REDONDEA -> 63;
            case RESTO -> 65;
            case RUMBO -> 67;
            case SEN -> 68;
            case SUMA -> 71;
            case ULTIMO -> 72;
            case FLOAT -> 80;
            case IDENTIFIER -> 81;
            case INTEGER -> 82;
            case '(' -> 93;
            default -> 1093;
        };
    }

    private int yys411() {
        return switch (yytok) {
            case AZAR -> 33;
            case COS -> 37;
            case DIFERENCIA -> 38;
            case DIVISION -> 39;
            case ELEGIR -> 41;
            case ELEMENTO -> 42;
            case MENOS -> 49;
            case POTENCIA -> 59;
            case PRIMERO -> 60;
            case PRODUCTO -> 61;
            case RAIZCUADRADA -> 62;
            case REDONDEA -> 63;
            case RESTO -> 65;
            case RUMBO -> 67;
            case SEN -> 68;
            case SUMA -> 71;
            case ULTIMO -> 72;
            case FLOAT -> 80;
            case IDENTIFIER -> 81;
            case INTEGER -> 82;
            case '(' -> 93;
            default -> 1093;
        };
    }

    private int yys412() {
        return switch (yytok) {
            case AZAR -> 33;
            case COS -> 37;
            case DIFERENCIA -> 38;
            case DIVISION -> 39;
            case ELEGIR -> 41;
            case ELEMENTO -> 42;
            case MENOS -> 49;
            case POTENCIA -> 59;
            case PRIMERO -> 60;
            case PRODUCTO -> 61;
            case RAIZCUADRADA -> 62;
            case REDONDEA -> 63;
            case RESTO -> 65;
            case RUMBO -> 67;
            case SEN -> 68;
            case SUMA -> 71;
            case ULTIMO -> 72;
            case FLOAT -> 80;
            case INTEGER -> 82;
            case BOOLEAN -> 131;
            case IDENTIFIER -> 132;
            case IGUALES -> 133;
            case MAYORQUE -> 134;
            case MENORQUE -> 135;
            case O -> 136;
            case Y -> 137;
            case '(' -> 170;
            default -> 1093;
        };
    }

    private int yys413() {
        return switch (yytok) {
            case AZAR -> 33;
            case COS -> 37;
            case DIFERENCIA -> 38;
            case DIVISION -> 39;
            case ELEGIR -> 41;
            case ELEMENTO -> 42;
            case MENOS -> 49;
            case POTENCIA -> 59;
            case PRIMERO -> 60;
            case PRODUCTO -> 61;
            case RAIZCUADRADA -> 62;
            case REDONDEA -> 63;
            case RESTO -> 65;
            case RUMBO -> 67;
            case SEN -> 68;
            case SUMA -> 71;
            case ULTIMO -> 72;
            case FLOAT -> 80;
            case INTEGER -> 82;
            case BOOLEAN -> 131;
            case IDENTIFIER -> 132;
            case IGUALES -> 133;
            case MAYORQUE -> 134;
            case MENORQUE -> 135;
            case O -> 136;
            case Y -> 137;
            case '(' -> 170;
            default -> 1093;
        };
    }

    private int yys414() {
        return switch (yytok) {
            case '*' -> 179;
            case '+' -> 180;
            case '-' -> 181;
            case '/' -> 182;
            case ')' -> 478;
            case '>', '<' -> yyr49();
            default -> 1093;
        };
    }

    private int yys416() {
        return switch (yytok) {
            case '*' -> 183;
            case '+' -> 184;
            case '-' -> 185;
            case '/' -> 186;
            case ')' -> 480;
            case '>', '<' -> yyr40();
            default -> 1093;
        };
    }

    private int yys425() {
        return switch (yytok) {
            case ']', FIN, '*', '(', FLOAT, O, '>', '+', IGUALES, MENORQUE, CUENTA, '=', COLOR, PARA, ENDINPUT, '[', '<', '-', ')', Y, MAYORQUE, INTEGER, error, BOOLEAN, '/', ';' -> 1093;
            case IDENTIFIER -> 425;
            default -> yyr223();
        };
    }

    private int yys429() {
        return switch (yytok) {
            case REDONDEA -> 63;
            case RESTO -> 65;
            case INTEGER -> 82;
            case IDENTIFIER -> 99;
            case '(' -> 100;
            case AZAR -> 238;
            case DIFERENCIA -> 239;
            case ELEGIR -> 240;
            case ELEMENTO -> 241;
            case MENOS -> 242;
            case POTENCIA -> 243;
            case PRIMERO -> 244;
            case PRODUCTO -> 245;
            case SUMA -> 246;
            case ULTIMO -> 247;
            default -> 1093;
        };
    }

    private int yys432() {
        return switch (yytok) {
            case REDONDEA -> 63;
            case RESTO -> 65;
            case INTEGER -> 82;
            case IDENTIFIER -> 99;
            case '(' -> 100;
            case AZAR -> 238;
            case DIFERENCIA -> 239;
            case ELEGIR -> 240;
            case ELEMENTO -> 241;
            case MENOS -> 242;
            case POTENCIA -> 243;
            case PRIMERO -> 244;
            case PRODUCTO -> 245;
            case SUMA -> 246;
            case ULTIMO -> 247;
            default -> 1093;
        };
    }

    private int yys434() {
        return switch (yytok) {
            case COS -> 37;
            case DIVISION -> 39;
            case RAIZCUADRADA -> 62;
            case RUMBO -> 67;
            case SEN -> 68;
            case FLOAT -> 80;
            case IDENTIFIER -> 81;
            case INTEGER -> 82;
            case '(' -> 93;
            case AZAR -> 354;
            case DIFERENCIA -> 355;
            case ELEGIR -> 356;
            case ELEMENTO -> 357;
            case MENOS -> 358;
            case POTENCIA -> 359;
            case PRIMERO -> 360;
            case PRODUCTO -> 361;
            case SUMA -> 362;
            case ULTIMO -> 363;
            default -> 1093;
        };
    }

    private int yys437() {
        return switch (yytok) {
            case COS -> 37;
            case DIVISION -> 39;
            case RAIZCUADRADA -> 62;
            case RUMBO -> 67;
            case SEN -> 68;
            case FLOAT -> 80;
            case IDENTIFIER -> 81;
            case INTEGER -> 82;
            case '(' -> 93;
            case AZAR -> 354;
            case DIFERENCIA -> 355;
            case ELEGIR -> 356;
            case ELEMENTO -> 357;
            case MENOS -> 358;
            case POTENCIA -> 359;
            case PRIMERO -> 360;
            case PRODUCTO -> 361;
            case SUMA -> 362;
            case ULTIMO -> 363;
            default -> 1093;
        };
    }

    private int yys438() {
        return switch (yytok) {
            case FLOAT -> 80;
            case IDENTIFIER -> 81;
            case INTEGER -> 82;
            case '*' -> 183;
            case '+' -> 184;
            case '-' -> 185;
            case '/' -> 186;
            case '(' -> 489;
            default -> 1093;
        };
    }

    private int yys439() {
        return switch (yytok) {
            case COS -> 37;
            case DIVISION -> 39;
            case RAIZCUADRADA -> 62;
            case RUMBO -> 67;
            case SEN -> 68;
            case FLOAT -> 80;
            case IDENTIFIER -> 81;
            case INTEGER -> 82;
            case '(' -> 93;
            case AZAR -> 354;
            case DIFERENCIA -> 355;
            case ELEGIR -> 356;
            case ELEMENTO -> 357;
            case MENOS -> 358;
            case POTENCIA -> 359;
            case PRIMERO -> 360;
            case PRODUCTO -> 361;
            case SUMA -> 362;
            case ULTIMO -> 363;
            default -> 1093;
        };
    }

    private int yys444() {
        return switch (yytok) {
            case '*' -> 179;
            case '+' -> 180;
            case '-' -> 181;
            case '/' -> 182;
            case ';', ')', '[', '>', '<' -> yyr179();
            default -> 1093;
        };
    }

    private int yys445() {
        return switch (yytok) {
            case '*' -> 183;
            case '+' -> 184;
            case '-' -> 185;
            case '/' -> 186;
            case ';', ')', '[', '>', '<' -> yyr40();
            default -> 1093;
        };
    }

    private int yys446() {
        return switch (yytok) {
            case COS -> 37;
            case DIVISION -> 39;
            case RAIZCUADRADA -> 62;
            case RUMBO -> 67;
            case SEN -> 68;
            case FLOAT -> 80;
            case IDENTIFIER -> 81;
            case INTEGER -> 82;
            case '(' -> 93;
            case AZAR -> 354;
            case DIFERENCIA -> 355;
            case ELEGIR -> 356;
            case ELEMENTO -> 357;
            case MENOS -> 358;
            case POTENCIA -> 359;
            case PRIMERO -> 360;
            case PRODUCTO -> 361;
            case SUMA -> 362;
            case ULTIMO -> 363;
            default -> 1093;
        };
    }

    private int yys447() {
        return switch (yytok) {
            case '*' -> 183;
            case '+' -> 184;
            case '-' -> 185;
            case '/' -> 186;
            case ';', ')', '[', '>', '<' -> yyr170();
            default -> 1093;
        };
    }

    private int yys448() {
        return switch (yytok) {
            case REDONDEA -> 63;
            case RESTO -> 65;
            case INTEGER -> 82;
            case IDENTIFIER -> 99;
            case '(' -> 100;
            case AZAR -> 238;
            case DIFERENCIA -> 239;
            case ELEGIR -> 240;
            case ELEMENTO -> 241;
            case MENOS -> 242;
            case POTENCIA -> 243;
            case PRIMERO -> 244;
            case PRODUCTO -> 245;
            case SUMA -> 246;
            case ULTIMO -> 247;
            default -> 1093;
        };
    }

    private int yys450() {
        return switch (yytok) {
            case AZAR -> 33;
            case COS -> 37;
            case DIFERENCIA -> 38;
            case DIVISION -> 39;
            case ELEGIR -> 41;
            case ELEMENTO -> 42;
            case MENOS -> 49;
            case POTENCIA -> 59;
            case PRIMERO -> 60;
            case PRODUCTO -> 61;
            case RAIZCUADRADA -> 62;
            case REDONDEA -> 63;
            case RESTO -> 65;
            case RUMBO -> 67;
            case SEN -> 68;
            case SUMA -> 71;
            case ULTIMO -> 72;
            default -> 1093;
        };
    }

    private int yys453() {
        return switch (yytok) {
            case '/', '-', '+', '*', '>', '<' -> yyr36();
            case ';' -> yyr44();
            default -> 1093;
        };
    }

    private int yys454() {
        return switch (yytok) {
            case '*' -> 179;
            case '/' -> 182;
            case '-', '+', '>', '<' -> yyr34();
            case ';' -> yyr42();
            default -> 1093;
        };
    }

    private int yys455() {
        return switch (yytok) {
            case '*' -> 179;
            case '/' -> 182;
            case '-', '+', '>', '<' -> yyr35();
            case ';' -> yyr43();
            default -> 1093;
        };
    }

    private int yys456() {
        return switch (yytok) {
            case '/', '-', '+', '*', '>', '<' -> yyr37();
            case ';' -> yyr45();
            default -> 1093;
        };
    }

    private int yys459() {
        return switch (yytok) {
            case '/', '-', '+', '*', '>', '<' -> yyr23();
            case ';' -> yyr30();
            default -> 1093;
        };
    }

    private int yys460() {
        return switch (yytok) {
            case '*' -> 183;
            case '/' -> 186;
            case '-', '+', '>', '<' -> yyr21();
            case ';' -> yyr28();
            default -> 1093;
        };
    }

    private int yys461() {
        return switch (yytok) {
            case '*' -> 183;
            case '/' -> 186;
            case '-', '+', '>', '<' -> yyr22();
            case ';' -> yyr29();
            default -> 1093;
        };
    }

    private int yys462() {
        return switch (yytok) {
            case '/', '-', '+', '*', '>', '<' -> yyr24();
            case ';' -> yyr31();
            default -> 1093;
        };
    }

    private int yys464() {
        return switch (yytok) {
            case AZAR -> 33;
            case COS -> 37;
            case DIFERENCIA -> 38;
            case DIVISION -> 39;
            case ELEGIR -> 41;
            case ELEMENTO -> 42;
            case MENOS -> 49;
            case POTENCIA -> 59;
            case PRIMERO -> 60;
            case PRODUCTO -> 61;
            case RAIZCUADRADA -> 62;
            case REDONDEA -> 63;
            case RESTO -> 65;
            case RUMBO -> 67;
            case SEN -> 68;
            case SUMA -> 71;
            case ULTIMO -> 72;
            case FLOAT -> 80;
            case IDENTIFIER -> 81;
            case INTEGER -> 82;
            case '(' -> 93;
            default -> 1093;
        };
    }

    private int yys466() {
        return switch (yytok) {
            case AZAR -> 33;
            case COS -> 37;
            case DIFERENCIA -> 38;
            case DIVISION -> 39;
            case ELEGIR -> 41;
            case ELEMENTO -> 42;
            case MENOS -> 49;
            case POTENCIA -> 59;
            case PRIMERO -> 60;
            case PRODUCTO -> 61;
            case RAIZCUADRADA -> 62;
            case REDONDEA -> 63;
            case RESTO -> 65;
            case RUMBO -> 67;
            case SEN -> 68;
            case SUMA -> 71;
            case ULTIMO -> 72;
            case FLOAT -> 80;
            case IDENTIFIER -> 81;
            case INTEGER -> 82;
            case '(' -> 93;
            default -> 1093;
        };
    }

    private int yys468() {
        return switch (yytok) {
            case AZAR -> 33;
            case COS -> 37;
            case DIFERENCIA -> 38;
            case DIVISION -> 39;
            case ELEGIR -> 41;
            case ELEMENTO -> 42;
            case MENOS -> 49;
            case POTENCIA -> 59;
            case PRIMERO -> 60;
            case PRODUCTO -> 61;
            case RAIZCUADRADA -> 62;
            case REDONDEA -> 63;
            case RESTO -> 65;
            case RUMBO -> 67;
            case SEN -> 68;
            case SUMA -> 71;
            case ULTIMO -> 72;
            case FLOAT -> 80;
            case IDENTIFIER -> 81;
            case INTEGER -> 82;
            case '(' -> 93;
            default -> 1093;
        };
    }

    private int yys471() {
        return switch (yytok) {
            case AZAR -> 33;
            case COS -> 37;
            case DIFERENCIA -> 38;
            case DIVISION -> 39;
            case ELEGIR -> 41;
            case ELEMENTO -> 42;
            case MENOS -> 49;
            case POTENCIA -> 59;
            case PRIMERO -> 60;
            case PRODUCTO -> 61;
            case RAIZCUADRADA -> 62;
            case REDONDEA -> 63;
            case RESTO -> 65;
            case RUMBO -> 67;
            case SEN -> 68;
            case SUMA -> 71;
            case ULTIMO -> 72;
            case FLOAT -> 80;
            case IDENTIFIER -> 81;
            case INTEGER -> 82;
            case '(' -> 93;
            default -> 1093;
        };
    }

    private int yys474() {
        return switch (yytok) {
            case AZAR -> 33;
            case COS -> 37;
            case DIFERENCIA -> 38;
            case DIVISION -> 39;
            case ELEGIR -> 41;
            case ELEMENTO -> 42;
            case MENOS -> 49;
            case POTENCIA -> 59;
            case PRIMERO -> 60;
            case PRODUCTO -> 61;
            case RAIZCUADRADA -> 62;
            case REDONDEA -> 63;
            case RESTO -> 65;
            case RUMBO -> 67;
            case SEN -> 68;
            case SUMA -> 71;
            case ULTIMO -> 72;
            case FLOAT -> 80;
            case IDENTIFIER -> 81;
            case INTEGER -> 82;
            case '(' -> 93;
            default -> 1093;
        };
    }

    private int yys478() {
        return switch (yytok) {
            case '/', '-', '+', '*', '>', '<' -> yyr38();
            case ';' -> yyr46();
            default -> 1093;
        };
    }

    private int yys480() {
        return switch (yytok) {
            case '/', '-', '+', '*', '>', '<' -> yyr25();
            case ';' -> yyr32();
            default -> 1093;
        };
    }

    private int yys482() {
        return switch (yytok) {
            case AZAR -> 33;
            case COS -> 37;
            case DIFERENCIA -> 38;
            case DIVISION -> 39;
            case ELEGIR -> 41;
            case ELEMENTO -> 42;
            case MENOS -> 49;
            case POTENCIA -> 59;
            case PRIMERO -> 60;
            case PRODUCTO -> 61;
            case RAIZCUADRADA -> 62;
            case REDONDEA -> 63;
            case RESTO -> 65;
            case RUMBO -> 67;
            case SEN -> 68;
            case SUMA -> 71;
            case ULTIMO -> 72;
            default -> 1093;
        };
    }

    private int yys483() {
        return switch (yytok) {
            case AZAR -> 33;
            case COS -> 37;
            case DIFERENCIA -> 38;
            case DIVISION -> 39;
            case ELEGIR -> 41;
            case ELEMENTO -> 42;
            case MENOS -> 49;
            case POTENCIA -> 59;
            case PRIMERO -> 60;
            case PRODUCTO -> 61;
            case RAIZCUADRADA -> 62;
            case REDONDEA -> 63;
            case RESTO -> 65;
            case RUMBO -> 67;
            case SEN -> 68;
            case SUMA -> 71;
            case ULTIMO -> 72;
            case FLOAT -> 80;
            case INTEGER -> 82;
            case BOOLEAN -> 131;
            case IDENTIFIER -> 132;
            case IGUALES -> 133;
            case MAYORQUE -> 134;
            case MENORQUE -> 135;
            case O -> 136;
            case Y -> 137;
            case '(' -> 170;
            default -> 1093;
        };
    }

    private int yys484() {
        return switch (yytok) {
            case AZAR -> 33;
            case COS -> 37;
            case DIFERENCIA -> 38;
            case DIVISION -> 39;
            case ELEGIR -> 41;
            case ELEMENTO -> 42;
            case MENOS -> 49;
            case POTENCIA -> 59;
            case PRIMERO -> 60;
            case PRODUCTO -> 61;
            case RAIZCUADRADA -> 62;
            case REDONDEA -> 63;
            case RESTO -> 65;
            case RUMBO -> 67;
            case SEN -> 68;
            case SUMA -> 71;
            case ULTIMO -> 72;
            case FLOAT -> 80;
            case INTEGER -> 82;
            case BOOLEAN -> 131;
            case IDENTIFIER -> 132;
            case IGUALES -> 133;
            case MAYORQUE -> 134;
            case MENORQUE -> 135;
            case O -> 136;
            case Y -> 137;
            case '(' -> 170;
            default -> 1093;
        };
    }

    private int yys485() {
        return switch (yytok) {
            case AZAR -> 33;
            case COS -> 37;
            case DIFERENCIA -> 38;
            case DIVISION -> 39;
            case ELEGIR -> 41;
            case ELEMENTO -> 42;
            case MENOS -> 49;
            case POTENCIA -> 59;
            case PRIMERO -> 60;
            case PRODUCTO -> 61;
            case RAIZCUADRADA -> 62;
            case REDONDEA -> 63;
            case RESTO -> 65;
            case RUMBO -> 67;
            case SEN -> 68;
            case SUMA -> 71;
            case ULTIMO -> 72;
            default -> 1093;
        };
    }

    private int yys486() {
        return switch (yytok) {
            case AZAR -> 33;
            case COS -> 37;
            case DIFERENCIA -> 38;
            case DIVISION -> 39;
            case ELEGIR -> 41;
            case ELEMENTO -> 42;
            case MENOS -> 49;
            case POTENCIA -> 59;
            case PRIMERO -> 60;
            case PRODUCTO -> 61;
            case RAIZCUADRADA -> 62;
            case REDONDEA -> 63;
            case RESTO -> 65;
            case RUMBO -> 67;
            case SEN -> 68;
            case SUMA -> 71;
            case ULTIMO -> 72;
            default -> 1093;
        };
    }

    private int yys489() {
        return switch (yytok) {
            case COS -> 37;
            case DIVISION -> 39;
            case RAIZCUADRADA -> 62;
            case RUMBO -> 67;
            case SEN -> 68;
            case FLOAT -> 80;
            case IDENTIFIER -> 81;
            case INTEGER -> 82;
            case '(' -> 93;
            case AZAR -> 354;
            case DIFERENCIA -> 355;
            case ELEGIR -> 356;
            case ELEMENTO -> 357;
            case MENOS -> 358;
            case POTENCIA -> 359;
            case PRIMERO -> 360;
            case PRODUCTO -> 361;
            case SUMA -> 362;
            case ULTIMO -> 363;
            default -> 1093;
        };
    }

    private int yys519() {
        return switch (yytok) {
            case AZAR -> 33;
            case COS -> 37;
            case DIFERENCIA -> 38;
            case DIVISION -> 39;
            case ELEGIR -> 41;
            case ELEMENTO -> 42;
            case MENOS -> 49;
            case POTENCIA -> 59;
            case PRIMERO -> 60;
            case PRODUCTO -> 61;
            case RAIZCUADRADA -> 62;
            case REDONDEA -> 63;
            case RESTO -> 65;
            case RUMBO -> 67;
            case SEN -> 68;
            case SUMA -> 71;
            case ULTIMO -> 72;
            case FLOAT -> 80;
            case IDENTIFIER -> 81;
            case INTEGER -> 82;
            case '(' -> 93;
            default -> 1093;
        };
    }

    private int yys524() {
        return switch (yytok) {
            case AZAR -> 33;
            case COS -> 37;
            case DIFERENCIA -> 38;
            case DIVISION -> 39;
            case ELEGIR -> 41;
            case ELEMENTO -> 42;
            case MENOS -> 49;
            case POTENCIA -> 59;
            case PRIMERO -> 60;
            case PRODUCTO -> 61;
            case RAIZCUADRADA -> 62;
            case REDONDEA -> 63;
            case RESTO -> 65;
            case RUMBO -> 67;
            case SEN -> 68;
            case SUMA -> 71;
            case ULTIMO -> 72;
            case FLOAT -> 80;
            case INTEGER -> 82;
            case BOOLEAN -> 131;
            case IDENTIFIER -> 132;
            case IGUALES -> 133;
            case MAYORQUE -> 134;
            case MENORQUE -> 135;
            case O -> 136;
            case Y -> 137;
            case '(' -> 170;
            default -> 1093;
        };
    }

    private int yys525() {
        return switch (yytok) {
            case AZAR -> 33;
            case COS -> 37;
            case DIFERENCIA -> 38;
            case DIVISION -> 39;
            case ELEGIR -> 41;
            case ELEMENTO -> 42;
            case MENOS -> 49;
            case POTENCIA -> 59;
            case PRIMERO -> 60;
            case PRODUCTO -> 61;
            case RAIZCUADRADA -> 62;
            case REDONDEA -> 63;
            case RESTO -> 65;
            case RUMBO -> 67;
            case SEN -> 68;
            case SUMA -> 71;
            case ULTIMO -> 72;
            case FLOAT -> 80;
            case INTEGER -> 82;
            case BOOLEAN -> 131;
            case IDENTIFIER -> 132;
            case IGUALES -> 133;
            case MAYORQUE -> 134;
            case MENORQUE -> 135;
            case O -> 136;
            case Y -> 137;
            case '(' -> 170;
            default -> 1093;
        };
    }

    private int yys527() {
        return switch (yytok) {
            case AZAR -> 33;
            case COS -> 37;
            case DIFERENCIA -> 38;
            case DIVISION -> 39;
            case ELEGIR -> 41;
            case ELEMENTO -> 42;
            case MENOS -> 49;
            case POTENCIA -> 59;
            case PRIMERO -> 60;
            case PRODUCTO -> 61;
            case RAIZCUADRADA -> 62;
            case REDONDEA -> 63;
            case RESTO -> 65;
            case RUMBO -> 67;
            case SEN -> 68;
            case SUMA -> 71;
            case ULTIMO -> 72;
            case FLOAT -> 80;
            case IDENTIFIER -> 81;
            case INTEGER -> 82;
            case '(' -> 93;
            default -> 1093;
        };
    }

    private int yys529() {
        return switch (yytok) {
            case AZAR -> 33;
            case COS -> 37;
            case DIFERENCIA -> 38;
            case DIVISION -> 39;
            case ELEGIR -> 41;
            case ELEMENTO -> 42;
            case MENOS -> 49;
            case POTENCIA -> 59;
            case PRIMERO -> 60;
            case PRODUCTO -> 61;
            case RAIZCUADRADA -> 62;
            case REDONDEA -> 63;
            case RESTO -> 65;
            case RUMBO -> 67;
            case SEN -> 68;
            case SUMA -> 71;
            case ULTIMO -> 72;
            case FLOAT -> 80;
            case IDENTIFIER -> 81;
            case INTEGER -> 82;
            case '(' -> 93;
            default -> 1093;
        };
    }

    private int yyr1() { // program_end : program
        { parsingDone(); }
        yysv[yysp-=1] = yyrv;
        return 1;
    }

    private int yyr65() { // boolean_expr2 : number_argument '<' number_argument
        { yyrv = instr("<", InstructionType.LOGIC, ReturnType.BOOLEAN, ((String)yysv[yysp-3]), ((String)yysv[yysp-1])); }
        yysv[yysp-=3] = yyrv;
        return yypboolean_expr2();
    }

    private int yyr66() { // boolean_expr2 : number_argument '>' number_argument
        { yyrv = instr(">", InstructionType.LOGIC, ReturnType.BOOLEAN, ((String)yysv[yysp-3]), ((String)yysv[yysp-1])); }
        yysv[yysp-=3] = yyrv;
        return yypboolean_expr2();
    }

    private int yyr67() { // boolean_expr2 : '(' instr_arg ')' '<' '(' instr_arg ')'
        { yyrv = instr("<", InstructionType.LOGIC, ReturnType.BOOLEAN, ((String)yysv[yysp-6]), ((String)yysv[yysp-2])); }
        yysv[yysp-=7] = yyrv;
        return yypboolean_expr2();
    }

    private int yyr68() { // boolean_expr2 : '(' instr_arg ')' '>' '(' instr_arg ')'
        { yyrv = instr(">", InstructionType.LOGIC, ReturnType.BOOLEAN, ((String)yysv[yysp-6]), ((String)yysv[yysp-2])); }
        yysv[yysp-=7] = yyrv;
        return yypboolean_expr2();
    }

    private int yyr69() { // boolean_expr2 : number_argument '>' '(' instr_arg ')'
        { yyrv = instr(">", InstructionType.LOGIC, ReturnType.BOOLEAN, ((String)yysv[yysp-5]), ((String)yysv[yysp-2])); }
        yysv[yysp-=5] = yyrv;
        return yypboolean_expr2();
    }

    private int yyr70() { // boolean_expr2 : '(' instr_arg ')' '>' number_argument
        { yyrv = instr(">", InstructionType.LOGIC, ReturnType.BOOLEAN, ((String)yysv[yysp-4]), ((String)yysv[yysp-1])); }
        yysv[yysp-=5] = yyrv;
        return yypboolean_expr2();
    }

    private int yyr71() { // boolean_expr2 : number_argument '<' '(' instr_arg ')'
        { yyrv = instr(">", InstructionType.LOGIC, ReturnType.BOOLEAN, ((String)yysv[yysp-5]), ((String)yysv[yysp-2])); }
        yysv[yysp-=5] = yyrv;
        return yypboolean_expr2();
    }

    private int yyr72() { // boolean_expr2 : '(' instr_arg ')' '<' number_argument
        { yyrv = instr(">", InstructionType.LOGIC, ReturnType.BOOLEAN, ((String)yysv[yysp-4]), ((String)yysv[yysp-1])); }
        yysv[yysp-=5] = yyrv;
        return yypboolean_expr2();
    }

    private int yyr73() { // boolean_expr2 : instr_arg '<' instr_arg
        { yyrv = instr("<", InstructionType.LOGIC, ReturnType.BOOLEAN, ((String)yysv[yysp-3]), ((String)yysv[yysp-1])); }
        yysv[yysp-=3] = yyrv;
        return yypboolean_expr2();
    }

    private int yyr74() { // boolean_expr2 : instr_arg '>' instr_arg
        { yyrv = instr(">", InstructionType.LOGIC, ReturnType.BOOLEAN, ((String)yysv[yysp-3]), ((String)yysv[yysp-1])); }
        yysv[yysp-=3] = yyrv;
        return yypboolean_expr2();
    }

    private int yyr75() { // boolean_expr2 : IGUALES number_argument number_argument
        { yyrv = instr("iguales", InstructionType.LOGIC, ReturnType.BOOLEAN, ((String)yysv[yysp-2]), ((String)yysv[yysp-1])); }
        yysv[yysp-=3] = yyrv;
        return yypboolean_expr2();
    }

    private int yyr76() { // boolean_expr2 : IGUALES '(' instr_arg ')' '(' instr_arg ')'
        { yyrv = instr("iguales", InstructionType.LOGIC, ReturnType.BOOLEAN, ((String)yysv[yysp-5]), ((String)yysv[yysp-2])); }
        yysv[yysp-=7] = yyrv;
        return yypboolean_expr2();
    }

    private int yyr77() { // boolean_expr2 : IGUALES number_argument '(' instr_arg ')'
        { yyrv = instr("iguales", InstructionType.LOGIC, ReturnType.BOOLEAN, ((String)yysv[yysp-4]), ((String)yysv[yysp-2])); }
        yysv[yysp-=5] = yyrv;
        return yypboolean_expr2();
    }

    private int yyr78() { // boolean_expr2 : IGUALES '(' instr_arg ')' number_argument
        { yyrv = instr("iguales", InstructionType.LOGIC, ReturnType.BOOLEAN, ((String)yysv[yysp-3]), ((String)yysv[yysp-1])); }
        yysv[yysp-=5] = yyrv;
        return yypboolean_expr2();
    }

    private int yyr79() { // boolean_expr2 : Y '(' boolean_expr ')' '(' boolean_expr ')'
        { yyrv = instr("y", InstructionType.LOGIC, ReturnType.BOOLEAN, ((String)yysv[yysp-5]), ((String)yysv[yysp-2])); }
        yysv[yysp-=7] = yyrv;
        return yypboolean_expr2();
    }

    private int yyr80() { // boolean_expr2 : O '(' boolean_expr ')' '(' boolean_expr ')'
        { yyrv = instr("o", InstructionType.LOGIC, ReturnType.BOOLEAN, ((String)yysv[yysp-5]), ((String)yysv[yysp-2])); }
        yysv[yysp-=7] = yyrv;
        return yypboolean_expr2();
    }

    private int yyr81() { // boolean_expr2 : MAYORQUE number_argument number_argument
        { yyrv = instr("mayorque", InstructionType.LOGIC, ReturnType.BOOLEAN, ((String)yysv[yysp-2]), ((String)yysv[yysp-1])); }
        yysv[yysp-=3] = yyrv;
        return yypboolean_expr2();
    }

    private int yyr82() { // boolean_expr2 : MAYORQUE '(' instr_arg ')' number_argument
        { yyrv = instr("mayorque", InstructionType.LOGIC, ReturnType.BOOLEAN, ((String)yysv[yysp-3]), ((String)yysv[yysp-1])); }
        yysv[yysp-=5] = yyrv;
        return yypboolean_expr2();
    }

    private int yyr83() { // boolean_expr2 : MAYORQUE number_argument '(' instr_arg ')'
        { yyrv = instr("mayorque", InstructionType.LOGIC, ReturnType.BOOLEAN, ((String)yysv[yysp-4]), ((String)yysv[yysp-2])); }
        yysv[yysp-=5] = yyrv;
        return yypboolean_expr2();
    }

    private int yyr84() { // boolean_expr2 : MENORQUE number_argument number_argument
        { yyrv = instr("menorque", InstructionType.LOGIC, ReturnType.BOOLEAN, ((String)yysv[yysp-2]), ((String)yysv[yysp-1])); }
        yysv[yysp-=3] = yyrv;
        return yypboolean_expr2();
    }

    private int yyr85() { // boolean_expr2 : MENORQUE '(' instr_arg ')' number_argument
        { yyrv = instr("menorque", InstructionType.LOGIC, ReturnType.BOOLEAN, ((String)yysv[yysp-3]), ((String)yysv[yysp-1])); }
        yysv[yysp-=5] = yyrv;
        return yypboolean_expr2();
    }

    private int yyr86() { // boolean_expr2 : MENORQUE number_argument '(' instr_arg ')'
        { yyrv = instr("menorque", InstructionType.LOGIC, ReturnType.BOOLEAN, ((String)yysv[yysp-4]), ((String)yysv[yysp-2])); }
        yysv[yysp-=5] = yyrv;
        return yypboolean_expr2();
    }

    private int yyr87() { // boolean_expr2 : '(' boolean_expr ')'
        { yyrv = ((String)yysv[yysp-2]); }
        yysv[yysp-=3] = yyrv;
        return yypboolean_expr2();
    }

    private int yyr88() { // boolean_expr2 : BOOLEAN
        { yyrv = arguments.boolArg(((Boolean)yysv[yysp-1])); }
        yysv[yysp-=1] = yyrv;
        return yypboolean_expr2();
    }

    private int yypboolean_expr2() {
        if (yyst[yysp - 1] == 211) {
            return 299;
        }
        return 380;
    }

    private int yyr102() { // declaration_expr : VAR IDENTIFIER
        { yyrv = instr("var", InstructionType.VARIABLE, ReturnType.VOID, arguments.stringArg(((String)yysv[yysp-1])));}
        yysv[yysp-=2] = yyrv;
        return 2;
    }

    private int yyr103() { // declaration_expr : VAR IDENTIFIER '=' integer_expr2
        { yyrv = instr("var", InstructionType.VARIABLE, ReturnType.VOID, arguments.stringArg(((String)yysv[yysp-3])), ((String)yysv[yysp-1]));}
        yysv[yysp-=4] = yyrv;
        return 2;
    }

    private int yyr104() { // declaration_expr : VAR IDENTIFIER '=' float_expr2
        { yyrv = instr("var", InstructionType.VARIABLE, ReturnType.VOID, arguments.stringArg(((String)yysv[yysp-3])), ((String)yysv[yysp-1]));}
        yysv[yysp-=4] = yyrv;
        return 2;
    }

    private int yyr105() { // declaration_expr : VAR IDENTIFIER '=' int_instr_argument
        { yyrv = instr("var", InstructionType.VARIABLE, ReturnType.VOID, arguments.stringArg(((String)yysv[yysp-3])), ((String)yysv[yysp-1]));}
        yysv[yysp-=4] = yyrv;
        return 2;
    }

    private int yyr106() { // declaration_expr : VAR IDENTIFIER '=' float_instr_argument
        { yyrv = instr("var", InstructionType.VARIABLE, ReturnType.VOID, arguments.stringArg(((String)yysv[yysp-3])), ((String)yysv[yysp-1]));}
        yysv[yysp-=4] = yyrv;
        return 2;
    }

    private int yyr107() { // declaration_expr : VAR IDENTIFIER '=' boolean_expr2
        { yyrv = instr("var", InstructionType.VARIABLE, ReturnType.VOID, arguments.stringArg(((String)yysv[yysp-3])), ((String)yysv[yysp-1])); }
        yysv[yysp-=4] = yyrv;
        return 2;
    }

    private int yyr108() { // declaration_expr : VAR IDENTIFIER '=' IDENTIFIER
        { yyrv = instr("var", InstructionType.VARIABLE, ReturnType.VOID, arguments.stringArg(((String)yysv[yysp-3])), arguments.varArg(((String)yysv[yysp-1]))); }
        yysv[yysp-=4] = yyrv;
        return 2;
    }

    private int yyr217() { // exec_instr : expression ';' exec_instr
        { instrList.add(0, ((String)yysv[yysp-3])); }
        yysv[yysp-=3] = yyrv;
        return yypexec_instr();
    }

    private int yyr218() { // exec_instr : expression ';'
        { instrList.add(0, ((String)yysv[yysp-2])); }
        yysv[yysp-=2] = yyrv;
        return yypexec_instr();
    }

    private int yypexec_instr() {
        if (yyst[yysp - 1] == 96) {
            return 199;
        }
        return 390;
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
        return switch (yyst[yysp - 1]) {
            case 289 -> 200;
            case 96 -> 200;
            case 76 -> 3;
            case 75 -> 3;
            case 0 -> 3;
            default -> 228;
        };
    }

    private int yyr34() { // float_expr : float_expr '+' float_expr
        { yyrv = numeric_expr(((String)yysv[yysp-3]), ((String)yysv[yysp-1]), "+"); }
        yysv[yysp-=3] = yyrv;
        return yypfloat_expr();
    }

    private int yyr35() { // float_expr : float_expr '-' float_expr
        { yyrv = numeric_expr(((String)yysv[yysp-3]), ((String)yysv[yysp-1]), "-"); }
        yysv[yysp-=3] = yyrv;
        return yypfloat_expr();
    }

    private int yyr36() { // float_expr : float_expr '*' float_expr
        { yyrv = numeric_expr(((String)yysv[yysp-3]), ((String)yysv[yysp-1]), "*"); }
        yysv[yysp-=3] = yyrv;
        return yypfloat_expr();
    }

    private int yyr37() { // float_expr : float_expr '/' float_expr
        { yyrv = numeric_expr(((String)yysv[yysp-3]), ((String)yysv[yysp-1]), "/"); }
        yysv[yysp-=3] = yyrv;
        return yypfloat_expr();
    }

    private int yyr38() { // float_expr : '(' float_expr ')'
        { yyrv = ((String)yysv[yysp-2]); }
        yysv[yysp-=3] = yyrv;
        return yypfloat_expr();
    }

    private int yyr39() { // float_expr : IDENTIFIER
        { yyrv = arguments.varArg(((String)yysv[yysp-1])); }
        yysv[yysp-=1] = yyrv;
        return yypfloat_expr();
    }

    private int yyr40() { // float_expr : integer_expr
        { yyrv = ((String)yysv[yysp-1]); }
        yysv[yysp-=1] = yyrv;
        return yypfloat_expr();
    }

    private int yyr41() { // float_expr : FLOAT
        { yyrv = arguments.floatArg(((Float)yysv[yysp-1])); }
        yysv[yysp-=1] = yyrv;
        return yypfloat_expr();
    }

    private int yypfloat_expr() {
        return switch (yyst[yysp - 1]) {
            case 529 -> 187;
            case 527 -> 187;
            case 519 -> 187;
            case 489 -> 187;
            case 488 -> 89;
            case 474 -> 187;
            case 471 -> 187;
            case 468 -> 187;
            case 466 -> 187;
            case 464 -> 187;
            case 446 -> 187;
            case 441 -> 89;
            case 440 -> 89;
            case 439 -> 187;
            case 438 -> 252;
            case 437 -> 187;
            case 435 -> 89;
            case 434 -> 187;
            case 411 -> 187;
            case 409 -> 187;
            case 407 -> 187;
            case 397 -> 456;
            case 396 -> 455;
            case 395 -> 454;
            case 394 -> 453;
            case 389 -> 187;
            case 366 -> 444;
            case 362 -> 89;
            case 361 -> 89;
            case 359 -> 150;
            case 358 -> 112;
            case 355 -> 89;
            case 354 -> 84;
            case 317 -> 414;
            case 270 -> 300;
            case 254 -> 187;
            case 251 -> 187;
            case 231 -> 107;
            case 219 -> 187;
            case 211 -> 300;
            case 203 -> 89;
            case 197 -> 187;
            case 182 -> 275;
            case 181 -> 274;
            case 180 -> 273;
            case 179 -> 272;
            case 173 -> 89;
            case 170 -> 224;
            case 167 -> 187;
            case 165 -> 187;
            case 163 -> 187;
            case 160 -> 187;
            case 157 -> 187;
            case 153 -> 89;
            case 152 -> 187;
            case 151 -> 252;
            case 150 -> 249;
            case 149 -> 187;
            case 145 -> 187;
            case 143 -> 187;
            case 138 -> 224;
            case 114 -> 187;
            case 108 -> 107;
            case 107 -> 107;
            case 106 -> 187;
            case 104 -> 187;
            case 102 -> 187;
            case 97 -> 89;
            case 95 -> 187;
            case 93 -> 187;
            case 89 -> 89;
            case 88 -> 187;
            case 86 -> 187;
            case 83 -> 187;
            case 71 -> 89;
            case 63 -> 158;
            case 61 -> 89;
            case 59 -> 150;
            case 49 -> 112;
            case 46 -> 107;
            case 38 -> 89;
            case 33 -> 84;
            default -> 77;
        };
    }

    private int yyr42() { // float_expr2 : float_expr '+' float_expr
        { yyrv = numeric_expr(((String)yysv[yysp-3]), ((String)yysv[yysp-1]), "+"); }
        yysv[yysp-=3] = yyrv;
        return yypfloat_expr2();
    }

    private int yyr43() { // float_expr2 : float_expr '-' float_expr
        { yyrv = numeric_expr(((String)yysv[yysp-3]), ((String)yysv[yysp-1]), "-"); }
        yysv[yysp-=3] = yyrv;
        return yypfloat_expr2();
    }

    private int yyr44() { // float_expr2 : float_expr '*' float_expr
        { yyrv = numeric_expr(((String)yysv[yysp-3]), ((String)yysv[yysp-1]), "*"); }
        yysv[yysp-=3] = yyrv;
        return yypfloat_expr2();
    }

    private int yyr45() { // float_expr2 : float_expr '/' float_expr
        { yyrv = numeric_expr(((String)yysv[yysp-3]), ((String)yysv[yysp-1]), "/"); }
        yysv[yysp-=3] = yyrv;
        return yypfloat_expr2();
    }

    private int yyr46() { // float_expr2 : '(' float_expr ')'
        { yyrv = ((String)yysv[yysp-2]); }
        yysv[yysp-=3] = yyrv;
        return yypfloat_expr2();
    }

    private int yyr47() { // float_expr2 : FLOAT
        { yyrv = arguments.floatArg(((Float)yysv[yysp-1])); }
        yysv[yysp-=1] = yyrv;
        return yypfloat_expr2();
    }

    private int yypfloat_expr2() {
        if (yyst[yysp - 1] == 211) {
            return 301;
        }
        return 381;
    }

    private int yyr96() { // float_instr_argument : float_proc
        yysp -= 1;
        return yypfloat_instr_argument();
    }

    private int yyr97() { // float_instr_argument : float_proc1
        yysp -= 1;
        return yypfloat_instr_argument();
    }

    private int yyr98() { // float_instr_argument : float_proc2
        yysp -= 1;
        return yypfloat_instr_argument();
    }

    private int yyr99() { // float_instr_argument : float_proc_n
        yysp -= 1;
        return yypfloat_instr_argument();
    }

    private int yyr100() { // float_instr_argument : float_proc_p
        yysp -= 1;
        return yypfloat_instr_argument();
    }

    private int yyr101() { // float_instr_argument : float_proc_1p
        yysp -= 1;
        return yypfloat_instr_argument();
    }

    private int yypfloat_instr_argument() {
        return switch (yyst[yysp - 1]) {
            case 489 -> 364;
            case 446 -> 490;
            case 439 -> 255;
            case 437 -> 212;
            case 434 -> 190;
            case 270 -> 382;
            case 254 -> 364;
            case 251 -> 353;
            case 211 -> 302;
            case 152 -> 255;
            case 114 -> 212;
            case 86 -> 190;
            default -> 115;
        };
    }

    private int yyr122() { // float_proc : RUMBO
        { yyrv = instr("print", InstructionType.NORMAL, ReturnType.FLOAT, arguments.varArg("rumbo")); }
        yysv[yysp-=1] = yyrv;
        return switch (yyst[yysp - 1]) {
            case 332 -> 4;
            case 289 -> 4;
            case 266 -> 4;
            case 261 -> 4;
            case 230 -> 4;
            case 139 -> 4;
            case 96 -> 4;
            case 76 -> 4;
            case 75 -> 4;
            case 0 -> 4;
            default -> 116;
        };
    }

    private int yyr153() { // float_proc1 : AZAR float_expr
        { yyrv = instr("azar", InstructionType.NORMAL, ReturnType.FLOAT, ((String)yysv[yysp-1])); }
        yysv[yysp-=2] = yyrv;
        return yypfloat_proc1();
    }

    private int yyr154() { // float_proc1 : MENOS float_expr
        { yyrv = instr("menos", InstructionType.NORMAL, ReturnType.FLOAT, ((String)yysv[yysp-1])); }
        yysv[yysp-=2] = yyrv;
        return yypfloat_proc1();
    }

    private int yyr155() { // float_proc1 : COS number_argument
        { yyrv = instr("cos", InstructionType.NORMAL, ReturnType.FLOAT, ((String)yysv[yysp-1])); }
        yysv[yysp-=2] = yyrv;
        return yypfloat_proc1();
    }

    private int yyr156() { // float_proc1 : RAIZCUADRADA number_argument
        { yyrv = instr("raiz", InstructionType.NORMAL, ReturnType.FLOAT, ((String)yysv[yysp-1])); }
        yysv[yysp-=2] = yyrv;
        return yypfloat_proc1();
    }

    private int yyr157() { // float_proc1 : SEN number_argument
        { yyrv = instr("seno", InstructionType.NORMAL, ReturnType.FLOAT, ((String)yysv[yysp-1])); }
        yysv[yysp-=2] = yyrv;
        return yypfloat_proc1();
    }

    private int yyr158() { // float_proc1 : AZAR '(' float_instr_argument ')'
        { yyrv = instr("azar", InstructionType.NORMAL, ReturnType.FLOAT, ((String)yysv[yysp-2])); }
        yysv[yysp-=4] = yyrv;
        return yypfloat_proc1();
    }

    private int yyr159() { // float_proc1 : MENOS '(' float_instr_argument ')'
        { yyrv = instr("menos", InstructionType.NORMAL, ReturnType.FLOAT, ((String)yysv[yysp-2])); }
        yysv[yysp-=4] = yyrv;
        return yypfloat_proc1();
    }

    private int yyr160() { // float_proc1 : COS '(' instr_arg ')'
        { yyrv = instr("cos", InstructionType.NORMAL, ReturnType.FLOAT, ((String)yysv[yysp-2])); }
        yysv[yysp-=4] = yyrv;
        return yypfloat_proc1();
    }

    private int yyr161() { // float_proc1 : RAIZCUADRADA '(' instr_arg ')'
        { yyrv = instr("raiz", InstructionType.NORMAL, ReturnType.FLOAT, ((String)yysv[yysp-2])); }
        yysv[yysp-=4] = yyrv;
        return yypfloat_proc1();
    }

    private int yyr162() { // float_proc1 : SEN '(' instr_arg ')'
        { yyrv = instr("seno", InstructionType.NORMAL, ReturnType.FLOAT, ((String)yysv[yysp-2])); }
        yysv[yysp-=4] = yyrv;
        return yypfloat_proc1();
    }

    private int yypfloat_proc1() {
        return switch (yyst[yysp - 1]) {
            case 332 -> 5;
            case 289 -> 5;
            case 266 -> 5;
            case 261 -> 5;
            case 230 -> 5;
            case 139 -> 5;
            case 96 -> 5;
            case 76 -> 5;
            case 75 -> 5;
            case 0 -> 5;
            default -> 117;
        };
    }

    private int yyr175() { // float_proc2 : POTENCIA float_expr float_expr
        { yyrv = instr("potencia", InstructionType.NORMAL, ReturnType.FLOAT, ((String)yysv[yysp-2]), ((String)yysv[yysp-1])); }
        yysv[yysp-=3] = yyrv;
        return yypfloat_proc2();
    }

    private int yyr176() { // float_proc2 : POTENCIA integer_expr float_expr
        { yyrv = instr("potencia", InstructionType.NORMAL, ReturnType.FLOAT, ((String)yysv[yysp-2]), ((String)yysv[yysp-1])); }
        yysv[yysp-=3] = yyrv;
        return yypfloat_proc2();
    }

    private int yyr177() { // float_proc2 : POTENCIA float_expr integer_expr
        { yyrv = instr("potencia", InstructionType.NORMAL, ReturnType.FLOAT, ((String)yysv[yysp-2]), ((String)yysv[yysp-1])); }
        yysv[yysp-=3] = yyrv;
        return yypfloat_proc2();
    }

    private int yyr178() { // float_proc2 : POTENCIA '(' float_instr_argument ')' integer_expr
        { yyrv = instr("potencia", InstructionType.NORMAL, ReturnType.FLOAT, ((String)yysv[yysp-3]), ((String)yysv[yysp-1])); }
        yysv[yysp-=5] = yyrv;
        return yypfloat_proc2();
    }

    private int yyr179() { // float_proc2 : POTENCIA '(' float_instr_argument ')' float_expr
        { yyrv = instr("potencia", InstructionType.NORMAL, ReturnType.FLOAT, ((String)yysv[yysp-3]), ((String)yysv[yysp-1])); }
        yysv[yysp-=5] = yyrv;
        return yypfloat_proc2();
    }

    private int yyr180() { // float_proc2 : POTENCIA integer_expr '(' float_instr_argument ')'
        { yyrv = instr("potencia", InstructionType.NORMAL, ReturnType.FLOAT, ((String)yysv[yysp-4]), ((String)yysv[yysp-2])); }
        yysv[yysp-=5] = yyrv;
        return yypfloat_proc2();
    }

    private int yyr181() { // float_proc2 : POTENCIA float_expr '(' float_instr_argument ')'
        { yyrv = instr("potencia", InstructionType.NORMAL, ReturnType.FLOAT, ((String)yysv[yysp-4]), ((String)yysv[yysp-2])); }
        yysv[yysp-=5] = yyrv;
        return yypfloat_proc2();
    }

    private int yyr182() { // float_proc2 : POTENCIA '(' float_instr_argument ')' '(' float_instr_argument ')'
        { yyrv = instr("potencia", InstructionType.NORMAL, ReturnType.FLOAT, ((String)yysv[yysp-5]), ((String)yysv[yysp-2])); }
        yysv[yysp-=7] = yyrv;
        return yypfloat_proc2();
    }

    private int yyr183() { // float_proc2 : DIVISION number_argument number_argument
        { yyrv = instr("division", InstructionType.NORMAL, ReturnType.FLOAT, ((String)yysv[yysp-2]), ((String)yysv[yysp-1])); }
        yysv[yysp-=3] = yyrv;
        return yypfloat_proc2();
    }

    private int yyr184() { // float_proc2 : DIVISION '(' instr_arg ')' number_argument
        { yyrv = instr("division", InstructionType.NORMAL, ReturnType.FLOAT, ((String)yysv[yysp-3]), ((String)yysv[yysp-1])); }
        yysv[yysp-=5] = yyrv;
        return yypfloat_proc2();
    }

    private int yyr185() { // float_proc2 : DIVISION number_argument '(' instr_arg ')'
        { yyrv = instr("division", InstructionType.NORMAL, ReturnType.FLOAT, ((String)yysv[yysp-4]), ((String)yysv[yysp-2])); }
        yysv[yysp-=5] = yyrv;
        return yypfloat_proc2();
    }

    private int yyr186() { // float_proc2 : DIVISION '(' instr_arg ')' '(' instr_arg ')'
        { yyrv = instr("division", InstructionType.NORMAL, ReturnType.FLOAT, ((String)yysv[yysp-5]), ((String)yysv[yysp-2])); }
        yysv[yysp-=7] = yyrv;
        return yypfloat_proc2();
    }

    private int yypfloat_proc2() {
        return switch (yyst[yysp - 1]) {
            case 332 -> 6;
            case 289 -> 6;
            case 266 -> 6;
            case 261 -> 6;
            case 230 -> 6;
            case 139 -> 6;
            case 96 -> 6;
            case 76 -> 6;
            case 75 -> 6;
            case 0 -> 6;
            default -> 118;
        };
    }

    private int yyr216() { // float_proc_1p : ELEMENTO integer_expr '[' n_float_args ']'
        {
        var args = new ArrayList<String>();
        args.add(((String)yysv[yysp-4]));
        yyrv = instr("elemento", InstructionType.NORMAL, ReturnType.FLOAT, args, paramsList); paramsList.clear(); }
        yysv[yysp-=5] = yyrv;
        return switch (yyst[yysp - 1]) {
            case 332 -> 7;
            case 289 -> 7;
            case 266 -> 7;
            case 261 -> 7;
            case 230 -> 7;
            case 139 -> 7;
            case 96 -> 7;
            case 76 -> 7;
            case 75 -> 7;
            case 0 -> 7;
            default -> 119;
        };
    }

    private int yyr198() { // float_proc_n : DIFERENCIA n_float_args
        { yyrv = instr("diferencia", InstructionType.NORMAL, ReturnType.FLOAT, paramsList); paramsList.clear(); }
        yysv[yysp-=2] = yyrv;
        return yypfloat_proc_n();
    }

    private int yyr199() { // float_proc_n : PRODUCTO n_float_args
        { yyrv = instr("producto", InstructionType.NORMAL, ReturnType.FLOAT, paramsList); paramsList.clear(); }
        yysv[yysp-=2] = yyrv;
        return yypfloat_proc_n();
    }

    private int yyr200() { // float_proc_n : SUMA n_float_args
        { yyrv = instr("suma", InstructionType.NORMAL, ReturnType.FLOAT, paramsList); paramsList.clear(); }
        yysv[yysp-=2] = yyrv;
        return yypfloat_proc_n();
    }

    private int yypfloat_proc_n() {
        return switch (yyst[yysp - 1]) {
            case 332 -> 8;
            case 289 -> 8;
            case 266 -> 8;
            case 261 -> 8;
            case 230 -> 8;
            case 139 -> 8;
            case 96 -> 8;
            case 76 -> 8;
            case 75 -> 8;
            case 0 -> 8;
            default -> 120;
        };
    }

    private int yyr210() { // float_proc_p : ELEGIR '[' n_float_args ']'
        { yyrv = instr("elegir", InstructionType.NORMAL, ReturnType.FLOAT, paramsList); paramsList.clear(); }
        yysv[yysp-=4] = yyrv;
        return yypfloat_proc_p();
    }

    private int yyr211() { // float_proc_p : ULTIMO '[' n_float_args ']'
        { yyrv = instr("ultimo", InstructionType.NORMAL, ReturnType.FLOAT, paramsList); paramsList.clear(); }
        yysv[yysp-=4] = yyrv;
        return yypfloat_proc_p();
    }

    private int yyr212() { // float_proc_p : PRIMERO '[' n_float_args ']'
        { yyrv = instr("primero", InstructionType.NORMAL, ReturnType.FLOAT, paramsList); paramsList.clear(); }
        yysv[yysp-=4] = yyrv;
        return yypfloat_proc_p();
    }

    private int yypfloat_proc_p() {
        return switch (yyst[yysp - 1]) {
            case 332 -> 9;
            case 289 -> 9;
            case 266 -> 9;
            case 261 -> 9;
            case 230 -> 9;
            case 139 -> 9;
            case 96 -> 9;
            case 76 -> 9;
            case 75 -> 9;
            case 0 -> 9;
            default -> 121;
        };
    }

    private int yyr89() { // instr_arg : int_instr_argument
        { yyrv = arguments.instrArg(((String)yysv[yysp-1])); }
        yysv[yysp-=1] = yyrv;
        return yypinstr_arg();
    }

    private int yyr90() { // instr_arg : float_instr_argument
        { yyrv = arguments.instrArg(((String)yysv[yysp-1])); }
        yysv[yysp-=1] = yyrv;
        return yypinstr_arg();
    }

    private int yypinstr_arg() {
        return switch (yyst[yysp - 1]) {
            case 529 -> 539;
            case 527 -> 538;
            case 519 -> 535;
            case 486 -> 510;
            case 485 -> 509;
            case 482 -> 506;
            case 474 -> 500;
            case 471 -> 498;
            case 468 -> 496;
            case 466 -> 495;
            case 464 -> 494;
            case 450 -> 492;
            case 411 -> 475;
            case 409 -> 472;
            case 407 -> 469;
            case 399 -> 458;
            case 398 -> 457;
            case 389 -> 452;
            case 317 -> 415;
            case 270 -> 303;
            case 219 -> 325;
            case 215 -> 321;
            case 214 -> 320;
            case 211 -> 303;
            case 197 -> 286;
            case 170 -> 267;
            case 167 -> 265;
            case 165 -> 264;
            case 163 -> 263;
            case 160 -> 260;
            case 157 -> 259;
            case 149 -> 248;
            case 145 -> 234;
            case 143 -> 233;
            case 138 -> 225;
            case 106 -> 207;
            case 104 -> 206;
            case 102 -> 205;
            case 95 -> 198;
            case 88 -> 192;
            case 83 -> 188;
            default -> 122;
        };
    }

    private int yyr91() { // int_instr_argument : int_proc1
        yysp -= 1;
        return yypint_instr_argument();
    }

    private int yyr92() { // int_instr_argument : int_proc2
        yysp -= 1;
        return yypint_instr_argument();
    }

    private int yyr93() { // int_instr_argument : int_proc_n
        yysp -= 1;
        return yypint_instr_argument();
    }

    private int yyr94() { // int_instr_argument : int_proc_p
        yysp -= 1;
        return yypint_instr_argument();
    }

    private int yyr95() { // int_instr_argument : int_proc_1p
        yysp -= 1;
        return yypint_instr_argument();
    }

    private int yypint_instr_argument() {
        return switch (yyst[yysp - 1]) {
            case 448 -> 491;
            case 432 -> 365;
            case 429 -> 487;
            case 349 -> 256;
            case 347 -> 213;
            case 343 -> 191;
            case 270 -> 383;
            case 254 -> 365;
            case 236 -> 340;
            case 211 -> 304;
            case 176 -> 271;
            case 152 -> 256;
            case 147 -> 237;
            case 114 -> 213;
            case 86 -> 191;
            default -> 123;
        };
    }

    private int yyr147() { // int_proc1 : REDONDEA float_expr
        { yyrv = instr("redondea", InstructionType.NORMAL, ReturnType.INTEGER, ((String)yysv[yysp-1])); }
        yysv[yysp-=2] = yyrv;
        return yypint_proc1();
    }

    private int yyr148() { // int_proc1 : AZAR integer_expr
        { yyrv = instr("azar", InstructionType.NORMAL, ReturnType.INTEGER, ((String)yysv[yysp-1])); }
        yysv[yysp-=2] = yyrv;
        return yypint_proc1();
    }

    private int yyr149() { // int_proc1 : MENOS integer_expr
        { yyrv = instr("menos", InstructionType.NORMAL, ReturnType.INTEGER, ((String)yysv[yysp-1])); }
        yysv[yysp-=2] = yyrv;
        return yypint_proc1();
    }

    private int yyr150() { // int_proc1 : REDONDEA '(' instr_arg ')'
        { yyrv = instr("redondea", InstructionType.NORMAL, ReturnType.INTEGER, ((String)yysv[yysp-2])); }
        yysv[yysp-=4] = yyrv;
        return yypint_proc1();
    }

    private int yyr151() { // int_proc1 : AZAR '(' int_instr_argument ')'
        { yyrv = instr("azar", InstructionType.NORMAL, ReturnType.INTEGER, ((String)yysv[yysp-2])); }
        yysv[yysp-=4] = yyrv;
        return yypint_proc1();
    }

    private int yyr152() { // int_proc1 : MENOS '(' int_instr_argument ')'
        { yyrv = instr("menos", InstructionType.NORMAL, ReturnType.INTEGER, ((String)yysv[yysp-2])); }
        yysv[yysp-=4] = yyrv;
        return yypint_proc1();
    }

    private int yypint_proc1() {
        return switch (yyst[yysp - 1]) {
            case 332 -> 10;
            case 289 -> 10;
            case 266 -> 10;
            case 261 -> 10;
            case 230 -> 10;
            case 139 -> 10;
            case 96 -> 10;
            case 76 -> 10;
            case 75 -> 10;
            case 0 -> 10;
            default -> 124;
        };
    }

    private int yyr169() { // int_proc2 : POTENCIA integer_expr integer_expr
        { yyrv = instr("potencia", InstructionType.NORMAL, ReturnType.INTEGER, ((String)yysv[yysp-2]), ((String)yysv[yysp-1])); }
        yysv[yysp-=3] = yyrv;
        return yypint_proc2();
    }

    private int yyr170() { // int_proc2 : POTENCIA '(' int_instr_argument ')' integer_expr
        { yyrv = instr("potencia", InstructionType.NORMAL, ReturnType.INTEGER, ((String)yysv[yysp-3]), ((String)yysv[yysp-1])); }
        yysv[yysp-=5] = yyrv;
        return yypint_proc2();
    }

    private int yyr171() { // int_proc2 : POTENCIA integer_expr '(' int_instr_argument ')'
        { yyrv = instr("potencia", InstructionType.NORMAL, ReturnType.INTEGER, ((String)yysv[yysp-4]), ((String)yysv[yysp-2])); }
        yysv[yysp-=5] = yyrv;
        return yypint_proc2();
    }

    private int yyr172() { // int_proc2 : POTENCIA '(' int_instr_argument ')' '(' int_instr_argument ')'
        { yyrv = instr("potencia", InstructionType.NORMAL, ReturnType.INTEGER, ((String)yysv[yysp-5]), ((String)yysv[yysp-2])); }
        yysv[yysp-=7] = yyrv;
        return yypint_proc2();
    }

    private int yyr173() { // int_proc2 : RESTO number_argument number_argument
        { yyrv = instr("resto", InstructionType.NORMAL, ReturnType.INTEGER, ((String)yysv[yysp-2]), ((String)yysv[yysp-1])); }
        yysv[yysp-=3] = yyrv;
        return yypint_proc2();
    }

    private int yyr174() { // int_proc2 : RESTO '(' instr_arg ')' '(' instr_arg ')'
        { yyrv = instr("resto", InstructionType.NORMAL, ReturnType.INTEGER, ((String)yysv[yysp-5]), ((String)yysv[yysp-2])); }
        yysv[yysp-=7] = yyrv;
        return yypint_proc2();
    }

    private int yypint_proc2() {
        return switch (yyst[yysp - 1]) {
            case 332 -> 11;
            case 289 -> 11;
            case 266 -> 11;
            case 261 -> 11;
            case 230 -> 11;
            case 139 -> 11;
            case 96 -> 11;
            case 76 -> 11;
            case 75 -> 11;
            case 0 -> 11;
            default -> 125;
        };
    }

    private int yyr215() { // int_proc_1p : ELEMENTO integer_expr '[' n_int_args ']'
        {
        var args = new ArrayList<String>();
        args.add(((String)yysv[yysp-4]));
        yyrv = instr("elemento", InstructionType.NORMAL, ReturnType.INTEGER, args, paramsList); paramsList.clear(); }
        yysv[yysp-=5] = yyrv;
        return switch (yyst[yysp - 1]) {
            case 332 -> 12;
            case 289 -> 12;
            case 266 -> 12;
            case 261 -> 12;
            case 230 -> 12;
            case 139 -> 12;
            case 96 -> 12;
            case 76 -> 12;
            case 75 -> 12;
            case 0 -> 12;
            default -> 126;
        };
    }

    private int yyr195() { // int_proc_n : DIFERENCIA n_int_args
        { yyrv = instr("diferencia", InstructionType.NORMAL, ReturnType.INTEGER, paramsList); paramsList.clear(); }
        yysv[yysp-=2] = yyrv;
        return yypint_proc_n();
    }

    private int yyr196() { // int_proc_n : PRODUCTO n_int_args
        { yyrv = instr("producto", InstructionType.NORMAL, ReturnType.INTEGER, paramsList); paramsList.clear(); }
        yysv[yysp-=2] = yyrv;
        return yypint_proc_n();
    }

    private int yyr197() { // int_proc_n : SUMA n_int_args
        { yyrv = instr("suma", InstructionType.NORMAL, ReturnType.INTEGER, paramsList); paramsList.clear(); }
        yysv[yysp-=2] = yyrv;
        return yypint_proc_n();
    }

    private int yypint_proc_n() {
        return switch (yyst[yysp - 1]) {
            case 332 -> 13;
            case 289 -> 13;
            case 266 -> 13;
            case 261 -> 13;
            case 230 -> 13;
            case 139 -> 13;
            case 96 -> 13;
            case 76 -> 13;
            case 75 -> 13;
            case 0 -> 13;
            default -> 127;
        };
    }

    private int yyr207() { // int_proc_p : ELEGIR '[' n_int_args ']'
        { yyrv = instr("elegir", InstructionType.NORMAL, ReturnType.INTEGER, paramsList); paramsList.clear(); }
        yysv[yysp-=4] = yyrv;
        return yypint_proc_p();
    }

    private int yyr208() { // int_proc_p : ULTIMO '[' n_int_args ']'
        { yyrv = instr("ultimo", InstructionType.NORMAL, ReturnType.INTEGER, paramsList); paramsList.clear(); }
        yysv[yysp-=4] = yyrv;
        return yypint_proc_p();
    }

    private int yyr209() { // int_proc_p : PRIMERO '[' n_int_args ']'
        { yyrv = instr("primero", InstructionType.NORMAL, ReturnType.INTEGER, paramsList); paramsList.clear(); }
        yysv[yysp-=4] = yyrv;
        return yypint_proc_p();
    }

    private int yypint_proc_p() {
        return switch (yyst[yysp - 1]) {
            case 332 -> 14;
            case 289 -> 14;
            case 266 -> 14;
            case 261 -> 14;
            case 230 -> 14;
            case 139 -> 14;
            case 96 -> 14;
            case 76 -> 14;
            case 75 -> 14;
            case 0 -> 14;
            default -> 128;
        };
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
        return switch (yyst[yysp - 1]) {
            case 529 -> 189;
            case 527 -> 189;
            case 519 -> 189;
            case 489 -> 189;
            case 488 -> 159;
            case 474 -> 189;
            case 471 -> 189;
            case 468 -> 189;
            case 466 -> 189;
            case 464 -> 189;
            case 448 -> 204;
            case 446 -> 189;
            case 441 -> 159;
            case 440 -> 159;
            case 439 -> 189;
            case 438 -> 159;
            case 437 -> 189;
            case 435 -> 159;
            case 434 -> 189;
            case 432 -> 204;
            case 430 -> 194;
            case 429 -> 204;
            case 411 -> 189;
            case 409 -> 189;
            case 407 -> 189;
            case 403 -> 462;
            case 402 -> 461;
            case 401 -> 460;
            case 400 -> 459;
            case 397 -> 159;
            case 396 -> 159;
            case 395 -> 159;
            case 394 -> 159;
            case 389 -> 189;
            case 367 -> 447;
            case 366 -> 445;
            case 362 -> 159;
            case 361 -> 159;
            case 359 -> 438;
            case 358 -> 159;
            case 357 -> 436;
            case 355 -> 159;
            case 354 -> 159;
            case 351 -> 194;
            case 350 -> 194;
            case 349 -> 204;
            case 348 -> 431;
            case 347 -> 204;
            case 344 -> 194;
            case 343 -> 204;
            case 341 -> 428;
            case 317 -> 416;
            case 270 -> 305;
            case 254 -> 189;
            case 251 -> 189;
            case 246 -> 194;
            case 245 -> 194;
            case 243 -> 348;
            case 242 -> 346;
            case 241 -> 345;
            case 239 -> 194;
            case 238 -> 342;
            case 236 -> 204;
            case 232 -> 337;
            case 231 -> 108;
            case 219 -> 189;
            case 211 -> 305;
            case 210 -> 297;
            case 203 -> 90;
            case 197 -> 189;
            case 194 -> 194;
            case 186 -> 279;
            case 185 -> 278;
            case 184 -> 277;
            case 183 -> 276;
            case 182 -> 159;
            case 181 -> 159;
            case 180 -> 159;
            case 179 -> 159;
            case 176 -> 204;
            case 173 -> 90;
            case 170 -> 226;
            case 167 -> 189;
            case 165 -> 189;
            case 163 -> 189;
            case 160 -> 189;
            case 157 -> 189;
            case 153 -> 90;
            case 152 -> 189;
            case 151 -> 253;
            case 150 -> 250;
            case 149 -> 189;
            case 147 -> 204;
            case 146 -> 235;
            case 145 -> 189;
            case 143 -> 189;
            case 141 -> 232;
            case 138 -> 226;
            case 114 -> 189;
            case 108 -> 108;
            case 107 -> 108;
            case 106 -> 189;
            case 104 -> 189;
            case 102 -> 189;
            case 100 -> 204;
            case 97 -> 90;
            case 95 -> 189;
            case 93 -> 189;
            case 90 -> 194;
            case 89 -> 159;
            case 88 -> 189;
            case 86 -> 189;
            case 83 -> 189;
            case 74 -> 175;
            case 71 -> 90;
            case 64 -> 161;
            case 63 -> 159;
            case 61 -> 90;
            case 59 -> 151;
            case 57 -> 146;
            case 49 -> 113;
            case 46 -> 108;
            case 42 -> 98;
            case 38 -> 90;
            case 33 -> 85;
            default -> 78;
        };
    }

    private int yyr28() { // integer_expr2 : integer_expr '+' integer_expr
        { yyrv = numeric_expr(((String)yysv[yysp-3]), ((String)yysv[yysp-1]), "+"); }
        yysv[yysp-=3] = yyrv;
        return yypinteger_expr2();
    }

    private int yyr29() { // integer_expr2 : integer_expr '-' integer_expr
        { yyrv = numeric_expr(((String)yysv[yysp-3]), ((String)yysv[yysp-1]), "-"); }
        yysv[yysp-=3] = yyrv;
        return yypinteger_expr2();
    }

    private int yyr30() { // integer_expr2 : integer_expr '*' integer_expr
        { yyrv = numeric_expr(((String)yysv[yysp-3]), ((String)yysv[yysp-1]), "*"); }
        yysv[yysp-=3] = yyrv;
        return yypinteger_expr2();
    }

    private int yyr31() { // integer_expr2 : integer_expr '/' integer_expr
        { yyrv = numeric_expr(((String)yysv[yysp-3]), ((String)yysv[yysp-1]), "/"); }
        yysv[yysp-=3] = yyrv;
        return yypinteger_expr2();
    }

    private int yyr32() { // integer_expr2 : '(' integer_expr ')'
        { yyrv = ((String)yysv[yysp-2]); }
        yysv[yysp-=3] = yyrv;
        return yypinteger_expr2();
    }

    private int yyr33() { // integer_expr2 : INTEGER
        { yyrv = arguments.intArg(((Integer)yysv[yysp-1])); }
        yysv[yysp-=1] = yyrv;
        return yypinteger_expr2();
    }

    private int yypinteger_expr2() {
        if (yyst[yysp - 1] == 211) {
            return 306;
        }
        return 384;
    }

    private int yyr226() { // n_args : integer_expr n_args
        { paramsList.add(0, ((String)yysv[yysp-2])); }
        yysv[yysp-=2] = yyrv;
        return yypn_args();
    }

    private int yyr227() { // n_args : float_expr n_args
        { paramsList.add(0, ((String)yysv[yysp-2])); }
        yysv[yysp-=2] = yyrv;
        return yypn_args();
    }

    private int yyr228() { // n_args : integer_expr
        { paramsList.add(0, ((String)yysv[yysp-1])); }
        yysv[yysp-=1] = yyrv;
        return yypn_args();
    }

    private int yyr229() { // n_args : float_expr
        { paramsList.add(0, ((String)yysv[yysp-1])); }
        yysv[yysp-=1] = yyrv;
        return yypn_args();
    }

    private int yypn_args() {
        return switch (yyst[yysp - 1]) {
            case 108 -> 209;
            case 107 -> 208;
            default -> 109;
        };
    }

    private int yyr189() { // n_float_args : float_expr n_float_args
        { paramsList.add(0, ((String)yysv[yysp-2])); }
        yysv[yysp-=2] = yyrv;
        return yypn_float_args();
    }

    private int yyr190() { // n_float_args : float_expr
        { paramsList.add(0, ((String)yysv[yysp-1])); }
        yysv[yysp-=1] = yyrv;
        return yypn_float_args();
    }

    private int yypn_float_args() {
        return switch (yyst[yysp - 1]) {
            case 441 -> 268;
            case 440 -> 257;
            case 435 -> 201;
            case 362 -> 171;
            case 361 -> 154;
            case 355 -> 91;
            case 173 -> 268;
            case 153 -> 257;
            case 97 -> 201;
            case 89 -> 193;
            case 71 -> 171;
            case 61 -> 154;
            case 38 -> 91;
            default -> 292;
        };
    }

    private int yyr191() { // n_instr : expression ';' n_instr
        { instrList.add(0, ((String)yysv[yysp-3])); }
        yysv[yysp-=3] = yyrv;
        return yypn_instr();
    }

    private int yyr192() { // n_instr : expression ';'
        { instrList.add(0, ((String)yysv[yysp-2])); }
        yysv[yysp-=2] = yyrv;
        return yypn_instr();
    }

    private int yypn_instr() {
        return switch (yyst[yysp - 1]) {
            case 266 -> 376;
            case 261 -> 372;
            case 230 -> 334;
            case 139 -> 229;
            default -> 423;
        };
    }

    private int yyr187() { // n_int_args : integer_expr n_int_args
        { paramsList.add(0, ((String)yysv[yysp-2])); }
        yysv[yysp-=2] = yyrv;
        return yypn_int_args();
    }

    private int yyr188() { // n_int_args : integer_expr
        { paramsList.add(0, ((String)yysv[yysp-1])); }
        yysv[yysp-=1] = yyrv;
        return yypn_int_args();
    }

    private int yypn_int_args() {
        return switch (yyst[yysp - 1]) {
            case 351 -> 269;
            case 350 -> 258;
            case 344 -> 202;
            case 246 -> 172;
            case 245 -> 155;
            case 239 -> 92;
            case 194 -> 195;
            case 173 -> 269;
            case 153 -> 258;
            case 97 -> 202;
            case 90 -> 195;
            case 71 -> 172;
            case 61 -> 155;
            case 38 -> 92;
            default -> 293;
        };
    }

    private int yyr222() { // n_params : IDENTIFIER n_params
        { paramsList.add(0, ((String)yysv[yysp-2])); }
        yysv[yysp-=2] = yyrv;
        return yypn_params();
    }

    private int yyr223() { // n_params : IDENTIFIER
        { paramsList.add(0, ((String)yysv[yysp-1])); }
        yysv[yysp-=1] = yyrv;
        return yypn_params();
    }

    private int yypn_params() {
        if (yyst[yysp - 1] == 139) {
            return 230;
        }
        return 335;
    }

    private int yyr48() { // number_argument : integer_expr
        { yyrv = ((String)yysv[yysp-1]); }
        yysv[yysp-=1] = yyrv;
        return yypnumber_argument();
    }

    private int yyr49() { // number_argument : float_expr
        { yyrv = ((String)yysv[yysp-1]); }
        yysv[yysp-=1] = yyrv;
        return yypnumber_argument();
    }

    private int yypnumber_argument() {
        return switch (yyst[yysp - 1]) {
            case 505 -> 528;
            case 504 -> 526;
            case 501 -> 523;
            case 499 -> 521;
            case 497 -> 518;
            case 410 -> 473;
            case 408 -> 470;
            case 406 -> 467;
            case 405 -> 465;
            case 404 -> 463;
            case 314 -> 410;
            case 313 -> 408;
            case 311 -> 406;
            case 287 -> 388;
            case 270 -> 307;
            case 221 -> 327;
            case 220 -> 326;
            case 218 -> 324;
            case 217 -> 323;
            case 216 -> 322;
            case 211 -> 307;
            case 162 -> 262;
            case 135 -> 221;
            case 134 -> 220;
            case 133 -> 218;
            case 94 -> 196;
            case 68 -> 166;
            case 66 -> 164;
            case 65 -> 162;
            case 62 -> 156;
            case 58 -> 148;
            case 56 -> 144;
            case 55 -> 142;
            case 50 -> 129;
            case 45 -> 105;
            case 44 -> 103;
            case 43 -> 101;
            case 39 -> 94;
            case 37 -> 87;
            case 32 -> 79;
            default -> 168;
        };
    }

    private int yyr115() { // proc : float_proc
        yysp -= 1;
        return 15;
    }

    private int yyr116() { // proc : OCULTATORTUGA
        { yyrv = instr("ocultatortuga", InstructionType.NORMAL, ReturnType.VOID); }
        yysv[yysp-=1] = yyrv;
        return 15;
    }

    private int yyr117() { // proc : APARECETORTUGA
        { yyrv = instr("aparecetoruga", InstructionType.NORMAL, ReturnType.VOID); }
        yysv[yysp-=1] = yyrv;
        return 15;
    }

    private int yyr118() { // proc : BAJALAPIZ
        { yyrv = instr("bajalapiz", InstructionType.NORMAL, ReturnType.VOID); }
        yysv[yysp-=1] = yyrv;
        return 15;
    }

    private int yyr119() { // proc : SUBELAPIZ
        { yyrv = instr("subelapiz", InstructionType.NORMAL, ReturnType.VOID); }
        yysv[yysp-=1] = yyrv;
        return 15;
    }

    private int yyr120() { // proc : CENTRO
        { yyrv = instr("centro", InstructionType.NORMAL, ReturnType.VOID); }
        yysv[yysp-=1] = yyrv;
        return 15;
    }

    private int yyr121() { // proc : BORRAPANTALLA
        { yyrv = instr("borrapantalla", InstructionType.NORMAL, ReturnType.VOID); }
        yysv[yysp-=1] = yyrv;
        return 15;
    }

    private int yyr123() { // proc1 : AVANZA number_argument
        { yyrv = instr("avanza", InstructionType.NORMAL, ReturnType.VOID, ((String)yysv[yysp-1])); }
        yysv[yysp-=2] = yyrv;
        return 16;
    }

    private int yyr124() { // proc1 : RETROCEDE number_argument
        { yyrv = instr("retrocede", InstructionType.NORMAL, ReturnType.VOID, ((String)yysv[yysp-1])); }
        yysv[yysp-=2] = yyrv;
        return 16;
    }

    private int yyr125() { // proc1 : GIRADERECHA number_argument
        { yyrv = instr("giraderecha", InstructionType.NORMAL, ReturnType.VOID, ((String)yysv[yysp-1])); }
        yysv[yysp-=2] = yyrv;
        return 16;
    }

    private int yyr126() { // proc1 : GIRAIZQUIERDA number_argument
        { yyrv = instr("giraizquierda", InstructionType.NORMAL, ReturnType.VOID, ((String)yysv[yysp-1])); }
        yysv[yysp-=2] = yyrv;
        return 16;
    }

    private int yyr127() { // proc1 : PONRUMBO number_argument
        { yyrv = instr("ponrumbo", InstructionType.NORMAL, ReturnType.VOID, ((String)yysv[yysp-1])); }
        yysv[yysp-=2] = yyrv;
        return 16;
    }

    private int yyr128() { // proc1 : PONX number_argument
        { yyrv = instr("ponx", InstructionType.NORMAL, ReturnType.VOID, ((String)yysv[yysp-1])); }
        yysv[yysp-=2] = yyrv;
        return 16;
    }

    private int yyr129() { // proc1 : PONY number_argument
        { yyrv = instr("pony", InstructionType.NORMAL, ReturnType.VOID, ((String)yysv[yysp-1])); }
        yysv[yysp-=2] = yyrv;
        return 16;
    }

    private int yyr130() { // proc1 : PONCOLORLAPIZ COLOR
        { yyrv = instr("poncl", InstructionType.NORMAL, ReturnType.VOID, arguments.stringArg(((String)yysv[yysp-1]))); }
        yysv[yysp-=2] = yyrv;
        return 16;
    }

    private int yyr131() { // proc1 : ESPERA number_argument
        { yyrv = instr("espera", InstructionType.NORMAL, ReturnType.VOID, ((String)yysv[yysp-1])); }
        yysv[yysp-=2] = yyrv;
        return 16;
    }

    private int yyr132() { // proc1 : ESPERA '(' instr_arg ')'
        { yyrv = instr("espera", InstructionType.NORMAL, ReturnType.VOID, ((String)yysv[yysp-2])); }
        yysv[yysp-=4] = yyrv;
        return 16;
    }

    private int yyr133() { // proc1 : AVANZA '(' instr_arg ')'
        { yyrv = instr("avanza", InstructionType.NORMAL, ReturnType.VOID, ((String)yysv[yysp-2])); }
        yysv[yysp-=4] = yyrv;
        return 16;
    }

    private int yyr134() { // proc1 : RETROCEDE '(' instr_arg ')'
        { yyrv = instr("retrocede", InstructionType.NORMAL, ReturnType.VOID, ((String)yysv[yysp-2])); }
        yysv[yysp-=4] = yyrv;
        return 16;
    }

    private int yyr135() { // proc1 : GIRADERECHA '(' instr_arg ')'
        { yyrv = instr("giraderecha", InstructionType.NORMAL, ReturnType.VOID, ((String)yysv[yysp-2])); }
        yysv[yysp-=4] = yyrv;
        return 16;
    }

    private int yyr136() { // proc1 : GIRAIZQUIERDA '(' instr_arg ')'
        { yyrv = instr("giraizquierda", InstructionType.NORMAL, ReturnType.VOID, ((String)yysv[yysp-2])); }
        yysv[yysp-=4] = yyrv;
        return 16;
    }

    private int yyr137() { // proc1 : PONRUMBO '(' instr_arg ')'
        { yyrv = instr("ponrumbo", InstructionType.NORMAL, ReturnType.VOID, ((String)yysv[yysp-2])); }
        yysv[yysp-=4] = yyrv;
        return 16;
    }

    private int yyr138() { // proc1 : PONX '(' instr_arg ')'
        { yyrv = instr("ponx", InstructionType.NORMAL, ReturnType.VOID, ((String)yysv[yysp-2])); }
        yysv[yysp-=4] = yyrv;
        return 16;
    }

    private int yyr139() { // proc1 : PONY '(' instr_arg ')'
        { yyrv = instr("pony", InstructionType.NORMAL, ReturnType.VOID, ((String)yysv[yysp-2])); }
        yysv[yysp-=4] = yyrv;
        return 16;
    }

    private int yyr140() { // proc1 : MOSTRAR number_argument
        { yyrv = instr("mostrar", InstructionType.NORMAL, ReturnType.VOID, ((String)yysv[yysp-1])); }
        yysv[yysp-=2] = yyrv;
        return 16;
    }

    private int yyr141() { // proc1 : MOSTRAR boolean_expr
        { yyrv = instr("mostrar", InstructionType.NORMAL, ReturnType.VOID, ((String)yysv[yysp-1])); }
        yysv[yysp-=2] = yyrv;
        return 16;
    }

    private int yyr142() { // proc1 : MOSTRAR '(' instr_arg ')'
        { yyrv = instr("mostrar", InstructionType.NORMAL, ReturnType.VOID, ((String)yysv[yysp-2])); }
        yysv[yysp-=4] = yyrv;
        return 16;
    }

    private int yyr143() { // proc1 : VELOCIDAD integer_expr
        { yyrv = instr("velocidad", InstructionType.NORMAL, ReturnType.VOID, ((String)yysv[yysp-1])); }
        yysv[yysp-=2] = yyrv;
        return 16;
    }

    private int yyr144() { // proc1 : VELOCIDAD '(' int_instr_argument ')'
        { yyrv = instr("velocidad", InstructionType.NORMAL, ReturnType.VOID, ((String)yysv[yysp-2])); }
        yysv[yysp-=4] = yyrv;
        return 16;
    }

    private int yyr163() { // proc2 : PONXY integer_expr integer_expr
        { yyrv = instr("ponxy", InstructionType.NORMAL, ReturnType.VOID, ((String)yysv[yysp-2]), ((String)yysv[yysp-1])); }
        yysv[yysp-=3] = yyrv;
        return 17;
    }

    private int yyr164() { // proc2 : PONXY integer_expr '(' int_instr_argument ')'
        { yyrv = instr("ponxy", InstructionType.NORMAL, ReturnType.VOID, ((String)yysv[yysp-4]), ((String)yysv[yysp-2])); }
        yysv[yysp-=5] = yyrv;
        return 17;
    }

    private int yyr165() { // proc2 : PONXY '(' int_instr_argument ')' integer_expr
        { yyrv = instr("ponxy", InstructionType.NORMAL, ReturnType.VOID, ((String)yysv[yysp-3]), ((String)yysv[yysp-1])); }
        yysv[yysp-=5] = yyrv;
        return 17;
    }

    private int yyr166() { // proc2 : PONXY '(' int_instr_argument ')' '(' int_instr_argument ')'
        { yyrv = instr("ponxy", InstructionType.NORMAL, ReturnType.VOID, ((String)yysv[yysp-5]), ((String)yysv[yysp-2])); }
        yysv[yysp-=7] = yyrv;
        return 17;
    }

    private int yyr221() { // proc_cond : SI boolean_expr '[' n_instr ']'
        {
        paramsList.add(0, ((String)yysv[yysp-4]));
        //instrList = reverse(instrList);
        yyrv = instr("si", InstructionType.CONDITION, ReturnType.VOID, paramsList, instrList);
        paramsList.clear();
        instrList.clear();
    }
        yysv[yysp-=5] = yyrv;
        return 18;
    }

    private int yyr219() { // proc_exec : EJECUTA '[' exec_instr ']'
        { yyrv = instr("ejecuta", InstructionType.NORMAL, ReturnType.VOID, null, instrList); instrList.clear(); }
        yysv[yysp-=4] = yyrv;
        return 19;
    }

    private int yyr220() { // proc_loop : REPITE integer_expr '[' n_instr ']'
        {
        paramsList.add(0, ((String)yysv[yysp-4]));
        //instrList = reverse(instrList);
        yyrv = instr("repite", InstructionType.CYCLE, ReturnType.VOID, paramsList, instrList);
        paramsList.clear();
        instrList.clear();
    }
        yysv[yysp-=5] = yyrv;
        return 20;
    }

    private int yyr201() { // proc_p : INC '[' IDENTIFIER ']'
        { yyrv = instr("inc", InstructionType.VARIABLE, ReturnType.VOID, arguments.stringArg(((String)yysv[yysp-2])), arguments.intArg(1)); }
        yysv[yysp-=4] = yyrv;
        return 21;
    }

    private int yyr202() { // proc_p : INC '[' IDENTIFIER integer_expr ']'
        { yyrv = instr("inc", InstructionType.VARIABLE, ReturnType.VOID, arguments.stringArg(((String)yysv[yysp-3])), ((String)yysv[yysp-2])); }
        yysv[yysp-=5] = yyrv;
        return 21;
    }

    private int yyr203() { // proc_p : INC '[' IDENTIFIER integer_expr ']'
        { yyrv = instr("inc", InstructionType.VARIABLE, ReturnType.VOID, arguments.stringArg(((String)yysv[yysp-3])), ((String)yysv[yysp-2])); }
        yysv[yysp-=5] = yyrv;
        return 21;
    }

    private int yyr204() { // proc_p : PONPOS '[' integer_expr integer_expr ']'
        { yyrv = instr("ponpos", InstructionType.NORMAL, ReturnType.VOID, ((String)yysv[yysp-3]), ((String)yysv[yysp-2])); }
        yysv[yysp-=5] = yyrv;
        return 21;
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
        return switch (yyst[yysp - 1]) {
            case 75 -> 177;
            case 0 -> 22;
            default -> 178;
        };
    }

    private int yyr50() { // boolean_expr : number_argument '<' number_argument
        { yyrv = instr("<", InstructionType.LOGIC, ReturnType.BOOLEAN, ((String)yysv[yysp-3]), ((String)yysv[yysp-1])); }
        yysv[yysp-=3] = yyrv;
        return yypboolean_expr();
    }

    private int yyr51() { // boolean_expr : number_argument '>' number_argument
        { yyrv = instr(">", InstructionType.LOGIC, ReturnType.BOOLEAN, ((String)yysv[yysp-3]), ((String)yysv[yysp-1])); }
        yysv[yysp-=3] = yyrv;
        return yypboolean_expr();
    }

    private int yyr52() { // boolean_expr : '(' instr_arg ')' '<' '(' instr_arg ')'
        { yyrv = instr("<", InstructionType.LOGIC, ReturnType.BOOLEAN, ((String)yysv[yysp-6]), ((String)yysv[yysp-2])); }
        yysv[yysp-=7] = yyrv;
        return yypboolean_expr();
    }

    private int yyr53() { // boolean_expr : '(' instr_arg ')' '>' '(' instr_arg ')'
        { yyrv = instr(">", InstructionType.LOGIC, ReturnType.BOOLEAN, ((String)yysv[yysp-6]), ((String)yysv[yysp-2])); }
        yysv[yysp-=7] = yyrv;
        return yypboolean_expr();
    }

    private int yyr54() { // boolean_expr : instr_arg '<' instr_arg
        { yyrv = instr("<", InstructionType.LOGIC, ReturnType.BOOLEAN, ((String)yysv[yysp-3]), ((String)yysv[yysp-1])); }
        yysv[yysp-=3] = yyrv;
        return yypboolean_expr();
    }

    private int yyr55() { // boolean_expr : instr_arg '>' instr_arg
        { yyrv = instr(">", InstructionType.LOGIC, ReturnType.BOOLEAN, ((String)yysv[yysp-3]), ((String)yysv[yysp-1])); }
        yysv[yysp-=3] = yyrv;
        return yypboolean_expr();
    }

    private int yyr56() { // boolean_expr : IGUALES number_argument number_argument
        { yyrv = instr("iguales", InstructionType.LOGIC, ReturnType.BOOLEAN, ((String)yysv[yysp-2]), ((String)yysv[yysp-1])); }
        yysv[yysp-=3] = yyrv;
        return yypboolean_expr();
    }

    private int yyr57() { // boolean_expr : IGUALES '(' instr_arg ')' '(' instr_arg ')'
        { yyrv = instr("iguales", InstructionType.LOGIC, ReturnType.BOOLEAN, ((String)yysv[yysp-5]), ((String)yysv[yysp-2])); }
        yysv[yysp-=7] = yyrv;
        return yypboolean_expr();
    }

    private int yyr58() { // boolean_expr : Y '(' boolean_expr ')' '(' boolean_expr ')'
        { yyrv = instr("y", InstructionType.LOGIC, ReturnType.BOOLEAN, ((String)yysv[yysp-5]), ((String)yysv[yysp-2])); }
        yysv[yysp-=7] = yyrv;
        return yypboolean_expr();
    }

    private int yyr59() { // boolean_expr : O '(' boolean_expr ')' '(' boolean_expr ')'
        { yyrv = instr("o", InstructionType.LOGIC, ReturnType.BOOLEAN, ((String)yysv[yysp-5]), ((String)yysv[yysp-2])); }
        yysv[yysp-=7] = yyrv;
        return yypboolean_expr();
    }

    private int yyr60() { // boolean_expr : MAYORQUE number_argument number_argument
        { yyrv = instr("mayorque", InstructionType.LOGIC, ReturnType.BOOLEAN, ((String)yysv[yysp-2]), ((String)yysv[yysp-1])); }
        yysv[yysp-=3] = yyrv;
        return yypboolean_expr();
    }

    private int yyr61() { // boolean_expr : MENORQUE number_argument number_argument
        { yyrv = instr("menorque", InstructionType.LOGIC, ReturnType.BOOLEAN, ((String)yysv[yysp-2]), ((String)yysv[yysp-1])); }
        yysv[yysp-=3] = yyrv;
        return yypboolean_expr();
    }

    private int yyr62() { // boolean_expr : '(' boolean_expr ')'
        { yyrv = ((String)yysv[yysp-2]); }
        yysv[yysp-=3] = yyrv;
        return yypboolean_expr();
    }

    private int yyr63() { // boolean_expr : IDENTIFIER
        { yyrv = arguments.varArg(((String)yysv[yysp-1])); }
        yysv[yysp-=1] = yyrv;
        return yypboolean_expr();
    }

    private int yyr64() { // boolean_expr : BOOLEAN
        { yyrv = arguments.boolArg(((Boolean)yysv[yysp-1])); }
        yysv[yysp-=1] = yyrv;
        return yypboolean_expr();
    }

    private int yypboolean_expr() {
        return switch (yyst[yysp - 1]) {
            case 525 -> 537;
            case 524 -> 536;
            case 484 -> 508;
            case 483 -> 507;
            case 413 -> 477;
            case 412 -> 476;
            case 317 -> 417;
            case 223 -> 329;
            case 222 -> 328;
            case 69 -> 169;
            case 50 -> 130;
            default -> 227;
        };
    }

    private int yyr109() { // redeclaration_expr : INIC IDENTIFIER '=' integer_expr2
        { yyrv = instr("inic", InstructionType.VARIABLE, ReturnType.VOID, arguments.stringArg(((String)yysv[yysp-3])), ((String)yysv[yysp-1])); }
        yysv[yysp-=4] = yyrv;
        return 23;
    }

    private int yyr110() { // redeclaration_expr : INIC IDENTIFIER '=' float_expr2
        { yyrv = instr("inic", InstructionType.VARIABLE, ReturnType.VOID, arguments.stringArg(((String)yysv[yysp-3])), ((String)yysv[yysp-1])); }
        yysv[yysp-=4] = yyrv;
        return 23;
    }

    private int yyr111() { // redeclaration_expr : INIC IDENTIFIER '=' int_instr_argument
        { yyrv = instr("inic", InstructionType.VARIABLE, ReturnType.VOID, arguments.stringArg(((String)yysv[yysp-3])), ((String)yysv[yysp-1])); }
        yysv[yysp-=4] = yyrv;
        return 23;
    }

    private int yyr112() { // redeclaration_expr : INIC IDENTIFIER '=' float_instr_argument
        { yyrv = instr("inic", InstructionType.VARIABLE, ReturnType.VOID, arguments.stringArg(((String)yysv[yysp-3])), ((String)yysv[yysp-1])); }
        yysv[yysp-=4] = yyrv;
        return 23;
    }

    private int yyr113() { // redeclaration_expr : INIC IDENTIFIER '=' boolean_expr2
        { yyrv = instr("inic", InstructionType.VARIABLE, ReturnType.VOID, arguments.stringArg(((String)yysv[yysp-3])), ((String)yysv[yysp-1])); }
        yysv[yysp-=4] = yyrv;
        return 23;
    }

    private int yyr114() { // redeclaration_expr : INIC IDENTIFIER '=' IDENTIFIER
        { yyrv = instr("inic", InstructionType.VARIABLE, ReturnType.VOID, arguments.stringArg(((String)yysv[yysp-3])), arguments.varArg(((String)yysv[yysp-1]))); }
        yysv[yysp-=4] = yyrv;
        return 23;
    }

    private int yyr224() { // user_proc : PARA IDENTIFIER n_params n_instr FIN
        {
        //instrList = reverse(instrList);
        procedures.add(((String)yysv[yysp-4]), paramsList, instrList);
        paramsList.clear();
        instrList.clear();
    }
        yysv[yysp-=5] = yyrv;
        return 24;
    }

    private int yyr225() { // user_proc : PARA IDENTIFIER n_instr FIN
        {
        //instrList = reverse(instrList);
        procedures.add(((String)yysv[yysp-3]), instrList);
        instrList.clear();
    }
        yysv[yysp-=4] = yyrv;
        return 24;
    }

    private int yyr230() { // user_proc_call : IDENTIFIER n_args
        { yyrv = instr(((String)yysv[yysp-2]), InstructionType.PROCEDURE, ReturnType.VOID, paramsList); paramsList.clear(); }
        yysv[yysp-=2] = yyrv;
        return 25;
    }

    private int yyr231() { // user_proc_call : IDENTIFIER
        { yyrv = instr(((String)yysv[yysp-1]), InstructionType.PROCEDURE, ReturnType.VOID); }
        yysv[yysp-=1] = yyrv;
        return 25;
    }

    private int yyr145() { // val_proc1 : int_proc1
        yysp -= 1;
        return 26;
    }

    private int yyr146() { // val_proc1 : float_proc1
        yysp -= 1;
        return 26;
    }

    private int yyr167() { // val_proc2 : int_proc2
        yysp -= 1;
        return 27;
    }

    private int yyr168() { // val_proc2 : float_proc2
        yysp -= 1;
        return 27;
    }

    private int yyr213() { // val_proc_1p : int_proc_1p
        yysp -= 1;
        return 28;
    }

    private int yyr214() { // val_proc_1p : float_proc_1p
        yysp -= 1;
        return 28;
    }

    private int yyr193() { // val_proc_n : int_proc_n
        yysp -= 1;
        return 29;
    }

    private int yyr194() { // val_proc_n : float_proc_n
        yysp -= 1;
        return 29;
    }

    private int yyr205() { // val_proc_p : int_proc_p
        yysp -= 1;
        return 30;
    }

    private int yyr206() { // val_proc_p : float_proc_p
        yysp -= 1;
        return 30;
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
