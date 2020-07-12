// Output created by jacc on Sun Jul 12 15:03:21 CST 2020

package Tests.Jacc;

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
        yytok = (lexer.getToken()
                 );
    loop:
        for (;;) {
            switch (yyn) {
                case 0:
                    yyst[yysp] = 0;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 229:
                    yyn = yys0();
                    continue;

                case 1:
                    yyst[yysp] = 1;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 230:
                    switch (yytok) {
                        case ENDINPUT:
                            yyn = 458;
                            continue;
                        case ';':
                            yyn = 69;
                            continue;
                    }
                    yyn = 461;
                    continue;

                case 2:
                    yyst[yysp] = 2;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 231:
                    yyn = yys2();
                    continue;

                case 3:
                    yyst[yysp] = 3;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 232:
                    switch (yytok) {
                        case ';':
                            yyn = 70;
                            continue;
                    }
                    yyn = 461;
                    continue;

                case 4:
                    yyst[yysp] = 4;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 233:
                    yyn = yys4();
                    continue;

                case 5:
                    yyst[yysp] = 5;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 234:
                    yyn = yys5();
                    continue;

                case 6:
                    yyst[yysp] = 6;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 235:
                    yyn = yys6();
                    continue;

                case 7:
                    yyst[yysp] = 7;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 236:
                    yyn = yys7();
                    continue;

                case 8:
                    yyst[yysp] = 8;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 237:
                    yyn = yys8();
                    continue;

                case 9:
                    yyst[yysp] = 9;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 238:
                    yyn = yys9();
                    continue;

                case 10:
                    yyst[yysp] = 10;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 239:
                    yyn = yys10();
                    continue;

                case 11:
                    yyst[yysp] = 11;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 240:
                    yyn = yys11();
                    continue;

                case 12:
                    yyst[yysp] = 12;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 241:
                    yyn = yys12();
                    continue;

                case 13:
                    yyst[yysp] = 13;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 242:
                    yyn = yys13();
                    continue;

                case 14:
                    yyst[yysp] = 14;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 243:
                    yyn = yys14();
                    continue;

                case 15:
                    yyst[yysp] = 15;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 244:
                    yyn = yys15();
                    continue;

                case 16:
                    yyst[yysp] = 16;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 245:
                    yyn = yys16();
                    continue;

                case 17:
                    yyst[yysp] = 17;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 246:
                    yyn = yys17();
                    continue;

                case 18:
                    yyst[yysp] = 18;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 247:
                    yyn = yys18();
                    continue;

                case 19:
                    yyst[yysp] = 19;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 248:
                    yyn = yys19();
                    continue;

                case 20:
                    yyst[yysp] = 20;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 249:
                    yyn = yys20();
                    continue;

                case 21:
                    yyst[yysp] = 21;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 250:
                    yyn = yys21();
                    continue;

                case 22:
                    yyst[yysp] = 22;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 251:
                    yyn = yys22();
                    continue;

                case 23:
                    yyst[yysp] = 23;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 252:
                    yyn = yys23();
                    continue;

                case 24:
                    yyst[yysp] = 24;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 253:
                    yyn = yys24();
                    continue;

                case 25:
                    yyst[yysp] = 25;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 254:
                    yyn = yys25();
                    continue;

                case 26:
                    yyst[yysp] = 26;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 255:
                    switch (yytok) {
                        case '[':
                            yyn = 85;
                            continue;
                    }
                    yyn = 461;
                    continue;

                case 27:
                    yyst[yysp] = 27;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 256:
                    yyn = yys27();
                    continue;

                case 28:
                    yyst[yysp] = 28;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 257:
                    yyn = yys28();
                    continue;

                case 29:
                    yyst[yysp] = 29;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 258:
                    switch (yytok) {
                        case '[':
                            yyn = 89;
                            continue;
                    }
                    yyn = 461;
                    continue;

                case 30:
                    yyst[yysp] = 30;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 259:
                    switch (yytok) {
                        case '[':
                            yyn = 90;
                            continue;
                    }
                    yyn = 461;
                    continue;

                case 31:
                    yyst[yysp] = 31;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 260:
                    switch (yytok) {
                        case IDENTIFIER:
                            yyn = 91;
                            continue;
                        case INTEGER:
                            yyn = 92;
                            continue;
                    }
                    yyn = 461;
                    continue;

                case 32:
                    yyst[yysp] = 32;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 261:
                    yyn = yys32();
                    continue;

                case 33:
                    yyst[yysp] = 33;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 262:
                    yyn = yys33();
                    continue;

                case 34:
                    yyst[yysp] = 34;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 263:
                    yyn = yys34();
                    continue;

                case 35:
                    yyst[yysp] = 35;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 264:
                    yyn = yys35();
                    continue;

                case 36:
                    yyst[yysp] = 36;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 265:
                    yyn = yys36();
                    continue;

                case 37:
                    yyst[yysp] = 37;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 266:
                    switch (yytok) {
                        case '[':
                            yyn = 98;
                            continue;
                    }
                    yyn = 461;
                    continue;

                case 38:
                    yyst[yysp] = 38;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 267:
                    switch (yytok) {
                        case IDENTIFIER:
                            yyn = 99;
                            continue;
                    }
                    yyn = 461;
                    continue;

                case 39:
                    yyst[yysp] = 39;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 268:
                    yyn = yys39();
                    continue;

                case 40:
                    yyst[yysp] = 40;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 269:
                    yyn = yys40();
                    continue;

                case 41:
                    yyst[yysp] = 41;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 270:
                    yyn = yys41();
                    continue;

                case 42:
                    yyst[yysp] = 42;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 271:
                    yyn = yys42();
                    continue;

                case 43:
                    yyst[yysp] = 43;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 272:
                    yyn = yys43();
                    continue;

                case 44:
                    yyst[yysp] = 44;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 273:
                    switch (yytok) {
                        case '[':
                            yyn = 112;
                            continue;
                    }
                    yyn = 461;
                    continue;

                case 45:
                    yyst[yysp] = 45;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 274:
                    yyn = yys45();
                    continue;

                case 46:
                    yyst[yysp] = 46;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 275:
                    yyn = yys46();
                    continue;

                case 47:
                    yyst[yysp] = 47;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 276:
                    yyn = yys47();
                    continue;

                case 48:
                    yyst[yysp] = 48;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 277:
                    yyn = yys48();
                    continue;

                case 49:
                    yyst[yysp] = 49;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 278:
                    yyn = yys49();
                    continue;

                case 50:
                    yyst[yysp] = 50;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 279:
                    switch (yytok) {
                        case '[':
                            yyn = 118;
                            continue;
                    }
                    yyn = 461;
                    continue;

                case 51:
                    yyst[yysp] = 51;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 280:
                    yyn = yys51();
                    continue;

                case 52:
                    yyst[yysp] = 52;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 281:
                    yyn = yys52();
                    continue;

                case 53:
                    yyst[yysp] = 53;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 282:
                    yyn = yys53();
                    continue;

                case 54:
                    yyst[yysp] = 54;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 283:
                    yyn = yys54();
                    continue;

                case 55:
                    yyst[yysp] = 55;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 284:
                    yyn = yys55();
                    continue;

                case 56:
                    yyst[yysp] = 56;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 285:
                    switch (yytok) {
                        case IDENTIFIER:
                            yyn = 124;
                            continue;
                        case INTEGER:
                            yyn = 125;
                            continue;
                    }
                    yyn = 461;
                    continue;

                case 57:
                    yyst[yysp] = 57;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 286:
                    yyn = yys57();
                    continue;

                case 58:
                    yyst[yysp] = 58;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 287:
                    yyn = yys58();
                    continue;

                case 59:
                    yyst[yysp] = 59;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 288:
                    yyn = yys59();
                    continue;

                case 60:
                    yyst[yysp] = 60;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 289:
                    yyn = yys60();
                    continue;

                case 61:
                    yyst[yysp] = 61;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 290:
                    yyn = yys61();
                    continue;

                case 62:
                    yyst[yysp] = 62;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 291:
                    yyn = yys62();
                    continue;

                case 63:
                    yyst[yysp] = 63;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 292:
                    yyn = yys63();
                    continue;

                case 64:
                    yyst[yysp] = 64;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 293:
                    yyn = yys64();
                    continue;

                case 65:
                    yyst[yysp] = 65;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 294:
                    yyn = yys65();
                    continue;

                case 66:
                    yyst[yysp] = 66;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 295:
                    switch (yytok) {
                        case '[':
                            yyn = 139;
                            continue;
                    }
                    yyn = 461;
                    continue;

                case 67:
                    yyst[yysp] = 67;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 296:
                    switch (yytok) {
                        case '[':
                            yyn = 140;
                            continue;
                    }
                    yyn = 461;
                    continue;

                case 68:
                    yyst[yysp] = 68;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 297:
                    switch (yytok) {
                        case IDENTIFIER:
                            yyn = 141;
                            continue;
                    }
                    yyn = 461;
                    continue;

                case 69:
                    yyst[yysp] = 69;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 298:
                    yyn = yys69();
                    continue;

                case 70:
                    yyst[yysp] = 70;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 299:
                    switch (yytok) {
                        case ENDINPUT:
                        case ';':
                            yyn = yyr2();
                            continue;
                    }
                    yyn = 461;
                    continue;

                case 71:
                    yyst[yysp] = 71;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 300:
                    yyn = yys71();
                    continue;

                case 72:
                    yyst[yysp] = 72;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 301:
                    yyn = yys72();
                    continue;

                case 73:
                    yyst[yysp] = 73;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 302:
                    yyn = yys73();
                    continue;

                case 74:
                    yyst[yysp] = 74;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 303:
                    yyn = yys74();
                    continue;

                case 75:
                    yyst[yysp] = 75;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 304:
                    yyn = yys75();
                    continue;

                case 76:
                    yyst[yysp] = 76;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 305:
                    yyn = yys76();
                    continue;

                case 77:
                    yyst[yysp] = 77;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 306:
                    yyn = yys77();
                    continue;

                case 78:
                    yyst[yysp] = 78;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 307:
                    yyn = yys78();
                    continue;

                case 79:
                    yyst[yysp] = 79;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 308:
                    yyn = yys79();
                    continue;

                case 80:
                    yyst[yysp] = 80;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 309:
                    yyn = yys80();
                    continue;

                case 81:
                    yyst[yysp] = 81;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 310:
                    yyn = yys81();
                    continue;

                case 82:
                    yyst[yysp] = 82;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 311:
                    yyn = yys82();
                    continue;

                case 83:
                    yyst[yysp] = 83;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 312:
                    yyn = yys83();
                    continue;

                case 84:
                    yyst[yysp] = 84;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 313:
                    yyn = yys84();
                    continue;

                case 85:
                    yyst[yysp] = 85;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 314:
                    switch (yytok) {
                        case FLOAT:
                            yyn = 149;
                            continue;
                        case INTEGER:
                            yyn = 150;
                            continue;
                    }
                    yyn = 461;
                    continue;

                case 86:
                    yyst[yysp] = 86;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 315:
                    yyn = yys86();
                    continue;

                case 87:
                    yyst[yysp] = 87;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 316:
                    yyn = yys87();
                    continue;

                case 88:
                    yyst[yysp] = 88;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 317:
                    yyn = yys88();
                    continue;

                case 89:
                    yyst[yysp] = 89;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 318:
                    yyn = yys89();
                    continue;

                case 90:
                    yyst[yysp] = 90;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 319:
                    switch (yytok) {
                        case FLOAT:
                            yyn = 149;
                            continue;
                        case INTEGER:
                            yyn = 150;
                            continue;
                    }
                    yyn = 461;
                    continue;

                case 91:
                    yyst[yysp] = 91;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 320:
                    switch (yytok) {
                        case '[':
                            yyn = 157;
                            continue;
                    }
                    yyn = 461;
                    continue;

                case 92:
                    yyst[yysp] = 92;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 321:
                    switch (yytok) {
                        case '[':
                            yyn = 158;
                            continue;
                    }
                    yyn = 461;
                    continue;

                case 93:
                    yyst[yysp] = 93;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 322:
                    yyn = yys93();
                    continue;

                case 94:
                    yyst[yysp] = 94;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 323:
                    yyn = yys94();
                    continue;

                case 95:
                    yyst[yysp] = 95;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 324:
                    yyn = yys95();
                    continue;

                case 96:
                    yyst[yysp] = 96;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 325:
                    yyn = yys96();
                    continue;

                case 97:
                    yyst[yysp] = 97;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 326:
                    yyn = yys97();
                    continue;

                case 98:
                    yyst[yysp] = 98;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 327:
                    switch (yytok) {
                        case IDENTIFIER:
                            yyn = 159;
                            continue;
                    }
                    yyn = 461;
                    continue;

                case 99:
                    yyst[yysp] = 99;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 328:
                    switch (yytok) {
                        case '=':
                            yyn = 160;
                            continue;
                    }
                    yyn = 461;
                    continue;

                case 100:
                    yyst[yysp] = 100;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 329:
                    yyn = yys100();
                    continue;

                case 101:
                    yyst[yysp] = 101;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 330:
                    yyn = yys101();
                    continue;

                case 102:
                    yyst[yysp] = 102;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 331:
                    yyn = yys102();
                    continue;

                case 103:
                    yyst[yysp] = 103;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 332:
                    yyn = yys103();
                    continue;

                case 104:
                    yyst[yysp] = 104;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 333:
                    yyn = yys104();
                    continue;

                case 105:
                    yyst[yysp] = 105;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 334:
                    yyn = yys105();
                    continue;

                case 106:
                    yyst[yysp] = 106;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 335:
                    yyn = yys106();
                    continue;

                case 107:
                    yyst[yysp] = 107;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 336:
                    yyn = yys107();
                    continue;

                case 108:
                    yyst[yysp] = 108;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 337:
                    yyn = yys108();
                    continue;

                case 109:
                    yyst[yysp] = 109;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 338:
                    yyn = yys109();
                    continue;

                case 110:
                    yyst[yysp] = 110;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 339:
                    yyn = yys110();
                    continue;

                case 111:
                    yyst[yysp] = 111;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 340:
                    yyn = yys111();
                    continue;

                case 112:
                    yyst[yysp] = 112;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 341:
                    yyn = yys112();
                    continue;

                case 113:
                    yyst[yysp] = 113;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 342:
                    yyn = yys113();
                    continue;

                case 114:
                    yyst[yysp] = 114;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 343:
                    yyn = yys114();
                    continue;

                case 115:
                    yyst[yysp] = 115;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 344:
                    yyn = yys115();
                    continue;

                case 116:
                    yyst[yysp] = 116;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 345:
                    yyn = yys116();
                    continue;

                case 117:
                    yyst[yysp] = 117;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 346:
                    yyn = yys117();
                    continue;

                case 118:
                    yyst[yysp] = 118;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 347:
                    switch (yytok) {
                        case FLOAT:
                            yyn = 149;
                            continue;
                        case INTEGER:
                            yyn = 150;
                            continue;
                    }
                    yyn = 461;
                    continue;

                case 119:
                    yyst[yysp] = 119;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 348:
                    yyn = yys119();
                    continue;

                case 120:
                    yyst[yysp] = 120;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 349:
                    yyn = yys120();
                    continue;

                case 121:
                    yyst[yysp] = 121;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 350:
                    yyn = yys121();
                    continue;

                case 122:
                    yyst[yysp] = 122;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 351:
                    yyn = yys122();
                    continue;

                case 123:
                    yyst[yysp] = 123;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 352:
                    yyn = yys123();
                    continue;

                case 124:
                    yyst[yysp] = 124;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 353:
                    switch (yytok) {
                        case '[':
                            yyn = 166;
                            continue;
                    }
                    yyn = 461;
                    continue;

                case 125:
                    yyst[yysp] = 125;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 354:
                    switch (yytok) {
                        case '[':
                            yyn = 167;
                            continue;
                    }
                    yyn = 461;
                    continue;

                case 126:
                    yyst[yysp] = 126;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 355:
                    yyn = yys126();
                    continue;

                case 127:
                    yyst[yysp] = 127;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 356:
                    yyn = yys127();
                    continue;

                case 128:
                    yyst[yysp] = 128;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 357:
                    yyn = yys128();
                    continue;

                case 129:
                    yyst[yysp] = 129;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 358:
                    yyn = yys129();
                    continue;

                case 130:
                    yyst[yysp] = 130;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 359:
                    switch (yytok) {
                        case '[':
                            yyn = 169;
                            continue;
                    }
                    yyn = 461;
                    continue;

                case 131:
                    yyst[yysp] = 131;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 360:
                    yyn = yys131();
                    continue;

                case 132:
                    yyst[yysp] = 132;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 361:
                    switch (yytok) {
                        case '[':
                            yyn = yyr31();
                            continue;
                    }
                    yyn = 461;
                    continue;

                case 133:
                    yyst[yysp] = 133;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 362:
                    yyn = yys133();
                    continue;

                case 134:
                    yyst[yysp] = 134;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 363:
                    yyn = yys134();
                    continue;

                case 135:
                    yyst[yysp] = 135;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 364:
                    yyn = yys135();
                    continue;

                case 136:
                    yyst[yysp] = 136;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 365:
                    yyn = yys136();
                    continue;

                case 137:
                    yyst[yysp] = 137;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 366:
                    yyn = yys137();
                    continue;

                case 138:
                    yyst[yysp] = 138;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 367:
                    yyn = yys138();
                    continue;

                case 139:
                    yyst[yysp] = 139;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 368:
                    switch (yytok) {
                        case FLOAT:
                            yyn = 149;
                            continue;
                        case INTEGER:
                            yyn = 150;
                            continue;
                    }
                    yyn = 461;
                    continue;

                case 140:
                    yyst[yysp] = 140;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 369:
                    switch (yytok) {
                        case FLOAT:
                            yyn = 149;
                            continue;
                        case INTEGER:
                            yyn = 150;
                            continue;
                    }
                    yyn = 461;
                    continue;

                case 141:
                    yyst[yysp] = 141;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 370:
                    yyn = yys141();
                    continue;

                case 142:
                    yyst[yysp] = 142;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 371:
                    switch (yytok) {
                        case ';':
                            yyn = 182;
                            continue;
                    }
                    yyn = 461;
                    continue;

                case 143:
                    yyst[yysp] = 143;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 372:
                    yyn = yys143();
                    continue;

                case 144:
                    yyst[yysp] = 144;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 373:
                    yyn = yys144();
                    continue;

                case 145:
                    yyst[yysp] = 145;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 374:
                    yyn = yys145();
                    continue;

                case 146:
                    yyst[yysp] = 146;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 375:
                    yyn = yys146();
                    continue;

                case 147:
                    yyst[yysp] = 147;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 376:
                    switch (yytok) {
                        case ']':
                            yyn = 187;
                            continue;
                    }
                    yyn = 461;
                    continue;

                case 148:
                    yyst[yysp] = 148;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 377:
                    switch (yytok) {
                        case ']':
                            yyn = 188;
                            continue;
                    }
                    yyn = 461;
                    continue;

                case 149:
                    yyst[yysp] = 149;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 378:
                    switch (yytok) {
                        case FLOAT:
                            yyn = 149;
                            continue;
                        case ']':
                            yyn = yyr97();
                            continue;
                    }
                    yyn = 461;
                    continue;

                case 150:
                    yyst[yysp] = 150;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 379:
                    switch (yytok) {
                        case INTEGER:
                            yyn = 150;
                            continue;
                        case ']':
                            yyn = yyr95();
                            continue;
                    }
                    yyn = 461;
                    continue;

                case 151:
                    yyst[yysp] = 151;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 380:
                    yyn = yys151();
                    continue;

                case 152:
                    yyst[yysp] = 152;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 381:
                    yyn = yys152();
                    continue;

                case 153:
                    yyst[yysp] = 153;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 382:
                    switch (yytok) {
                        case ']':
                            yyn = 191;
                            continue;
                    }
                    yyn = 461;
                    continue;

                case 154:
                    yyst[yysp] = 154;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 383:
                    yyn = yys154();
                    continue;

                case 155:
                    yyst[yysp] = 155;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 384:
                    switch (yytok) {
                        case ']':
                            yyn = 193;
                            continue;
                    }
                    yyn = 461;
                    continue;

                case 156:
                    yyst[yysp] = 156;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 385:
                    switch (yytok) {
                        case ']':
                            yyn = 194;
                            continue;
                    }
                    yyn = 461;
                    continue;

                case 157:
                    yyst[yysp] = 157;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 386:
                    switch (yytok) {
                        case FLOAT:
                            yyn = 149;
                            continue;
                        case INTEGER:
                            yyn = 150;
                            continue;
                    }
                    yyn = 461;
                    continue;

                case 158:
                    yyst[yysp] = 158;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 387:
                    switch (yytok) {
                        case FLOAT:
                            yyn = 149;
                            continue;
                        case INTEGER:
                            yyn = 150;
                            continue;
                    }
                    yyn = 461;
                    continue;

                case 159:
                    yyst[yysp] = 159;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 388:
                    yyn = yys159();
                    continue;

                case 160:
                    yyst[yysp] = 160;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 389:
                    yyn = yys160();
                    continue;

                case 161:
                    yyst[yysp] = 161;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 390:
                    yyn = yys161();
                    continue;

                case 162:
                    yyst[yysp] = 162;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 391:
                    yyn = yys162();
                    continue;

                case 163:
                    yyst[yysp] = 163;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 392:
                    yyn = yys163();
                    continue;

                case 164:
                    yyst[yysp] = 164;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 393:
                    switch (yytok) {
                        case ']':
                            yyn = 203;
                            continue;
                    }
                    yyn = 461;
                    continue;

                case 165:
                    yyst[yysp] = 165;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 394:
                    switch (yytok) {
                        case ']':
                            yyn = 204;
                            continue;
                    }
                    yyn = 461;
                    continue;

                case 166:
                    yyst[yysp] = 166;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 395:
                    yyn = yys166();
                    continue;

                case 167:
                    yyst[yysp] = 167;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 396:
                    yyn = yys167();
                    continue;

                case 168:
                    yyst[yysp] = 168;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 397:
                    yyn = yys168();
                    continue;

                case 169:
                    yyst[yysp] = 169;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 398:
                    yyn = yys169();
                    continue;

                case 170:
                    yyst[yysp] = 170;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 399:
                    yyn = yys170();
                    continue;

                case 171:
                    yyst[yysp] = 171;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 400:
                    yyn = yys171();
                    continue;

                case 172:
                    yyst[yysp] = 172;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 401:
                    yyn = yys172();
                    continue;

                case 173:
                    yyst[yysp] = 173;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 402:
                    yyn = yys173();
                    continue;

                case 174:
                    yyst[yysp] = 174;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 403:
                    yyn = yys174();
                    continue;

                case 175:
                    yyst[yysp] = 175;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 404:
                    yyn = yys175();
                    continue;

                case 176:
                    yyst[yysp] = 176;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 405:
                    yyn = yys176();
                    continue;

                case 177:
                    yyst[yysp] = 177;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 406:
                    switch (yytok) {
                        case ']':
                            yyn = 215;
                            continue;
                    }
                    yyn = 461;
                    continue;

                case 178:
                    yyst[yysp] = 178;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 407:
                    switch (yytok) {
                        case ']':
                            yyn = 216;
                            continue;
                    }
                    yyn = 461;
                    continue;

                case 179:
                    yyst[yysp] = 179;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 408:
                    switch (yytok) {
                        case ']':
                            yyn = 217;
                            continue;
                    }
                    yyn = 461;
                    continue;

                case 180:
                    yyst[yysp] = 180;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 409:
                    switch (yytok) {
                        case ']':
                            yyn = 218;
                            continue;
                    }
                    yyn = 461;
                    continue;

                case 181:
                    yyst[yysp] = 181;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 410:
                    yyn = yys181();
                    continue;

                case 182:
                    yyst[yysp] = 182;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 411:
                    switch (yytok) {
                        case ENDINPUT:
                        case ';':
                            yyn = yyr1();
                            continue;
                    }
                    yyn = 461;
                    continue;

                case 183:
                    yyst[yysp] = 183;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 412:
                    yyn = yys183();
                    continue;

                case 184:
                    yyst[yysp] = 184;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 413:
                    yyn = yys184();
                    continue;

                case 185:
                    yyst[yysp] = 185;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 414:
                    yyn = yys185();
                    continue;

                case 186:
                    yyst[yysp] = 186;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 415:
                    yyn = yys186();
                    continue;

                case 187:
                    yyst[yysp] = 187;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 416:
                    yyn = yys187();
                    continue;

                case 188:
                    yyst[yysp] = 188;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 417:
                    yyn = yys188();
                    continue;

                case 189:
                    yyst[yysp] = 189;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 418:
                    switch (yytok) {
                        case ']':
                            yyn = yyr96();
                            continue;
                    }
                    yyn = 461;
                    continue;

                case 190:
                    yyst[yysp] = 190;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 419:
                    switch (yytok) {
                        case ']':
                            yyn = yyr94();
                            continue;
                    }
                    yyn = 461;
                    continue;

                case 191:
                    yyst[yysp] = 191;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 420:
                    yyn = yys191();
                    continue;

                case 192:
                    yyst[yysp] = 192;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 421:
                    switch (yytok) {
                        case ']':
                            yyn = yyr92();
                            continue;
                    }
                    yyn = 461;
                    continue;

                case 193:
                    yyst[yysp] = 193;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 422:
                    yyn = yys193();
                    continue;

                case 194:
                    yyst[yysp] = 194;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 423:
                    yyn = yys194();
                    continue;

                case 195:
                    yyst[yysp] = 195;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 424:
                    switch (yytok) {
                        case ']':
                            yyn = 220;
                            continue;
                    }
                    yyn = 461;
                    continue;

                case 196:
                    yyst[yysp] = 196;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 425:
                    switch (yytok) {
                        case ']':
                            yyn = 221;
                            continue;
                    }
                    yyn = 461;
                    continue;

                case 197:
                    yyst[yysp] = 197;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 426:
                    switch (yytok) {
                        case ']':
                            yyn = 222;
                            continue;
                    }
                    yyn = 461;
                    continue;

                case 198:
                    yyst[yysp] = 198;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 427:
                    switch (yytok) {
                        case ']':
                            yyn = 223;
                            continue;
                    }
                    yyn = 461;
                    continue;

                case 199:
                    yyst[yysp] = 199;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 428:
                    switch (yytok) {
                        case '*':
                            yyn = 143;
                            continue;
                        case '+':
                            yyn = 144;
                            continue;
                        case '-':
                            yyn = 145;
                            continue;
                        case '/':
                            yyn = 146;
                            continue;
                        case ']':
                            yyn = 224;
                            continue;
                    }
                    yyn = 461;
                    continue;

                case 200:
                    yyst[yysp] = 200;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 429:
                    yyn = yys200();
                    continue;

                case 201:
                    yyst[yysp] = 201;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 430:
                    yyn = yys201();
                    continue;

                case 202:
                    yyst[yysp] = 202;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 431:
                    switch (yytok) {
                        case '*':
                            yyn = 143;
                            continue;
                        case '+':
                            yyn = 144;
                            continue;
                        case '-':
                            yyn = 145;
                            continue;
                        case '/':
                            yyn = 146;
                            continue;
                        case ']':
                            yyn = 225;
                            continue;
                    }
                    yyn = 461;
                    continue;

                case 203:
                    yyst[yysp] = 203;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 432:
                    yyn = yys203();
                    continue;

                case 204:
                    yyst[yysp] = 204;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 433:
                    yyn = yys204();
                    continue;

                case 205:
                    yyst[yysp] = 205;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 434:
                    switch (yytok) {
                        case ']':
                            yyn = 226;
                            continue;
                    }
                    yyn = 461;
                    continue;

                case 206:
                    yyst[yysp] = 206;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 435:
                    switch (yytok) {
                        case ']':
                            yyn = 227;
                            continue;
                    }
                    yyn = 461;
                    continue;

                case 207:
                    yyst[yysp] = 207;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 436:
                    switch (yytok) {
                        case ']':
                            yyn = 228;
                            continue;
                    }
                    yyn = 461;
                    continue;

                case 208:
                    yyst[yysp] = 208;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 437:
                    switch (yytok) {
                        case '*':
                            yyn = 143;
                            continue;
                        case '+':
                            yyn = 144;
                            continue;
                        case '-':
                            yyn = 145;
                            continue;
                        case '/':
                            yyn = 146;
                            continue;
                        case '[':
                            yyn = yyr29();
                            continue;
                    }
                    yyn = 461;
                    continue;

                case 209:
                    yyst[yysp] = 209;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 438:
                    switch (yytok) {
                        case '*':
                            yyn = 143;
                            continue;
                        case '+':
                            yyn = 144;
                            continue;
                        case '-':
                            yyn = 145;
                            continue;
                        case '/':
                            yyn = 146;
                            continue;
                        case '[':
                            yyn = yyr30();
                            continue;
                    }
                    yyn = 461;
                    continue;

                case 210:
                    yyst[yysp] = 210;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 439:
                    switch (yytok) {
                        case '*':
                            yyn = 143;
                            continue;
                        case '+':
                            yyn = 144;
                            continue;
                        case '-':
                            yyn = 145;
                            continue;
                        case '/':
                            yyn = 146;
                            continue;
                        case '[':
                            yyn = yyr81();
                            continue;
                    }
                    yyn = 461;
                    continue;

                case 211:
                    yyst[yysp] = 211;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 440:
                    switch (yytok) {
                        case '*':
                            yyn = 143;
                            continue;
                        case '+':
                            yyn = 144;
                            continue;
                        case '-':
                            yyn = 145;
                            continue;
                        case '/':
                            yyn = 146;
                            continue;
                        case '[':
                            yyn = yyr84();
                            continue;
                    }
                    yyn = 461;
                    continue;

                case 212:
                    yyst[yysp] = 212;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 441:
                    switch (yytok) {
                        case '*':
                            yyn = 143;
                            continue;
                        case '+':
                            yyn = 144;
                            continue;
                        case '-':
                            yyn = 145;
                            continue;
                        case '/':
                            yyn = 146;
                            continue;
                        case '[':
                            yyn = yyr85();
                            continue;
                    }
                    yyn = 461;
                    continue;

                case 213:
                    yyst[yysp] = 213;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 442:
                    switch (yytok) {
                        case '*':
                            yyn = 143;
                            continue;
                        case '+':
                            yyn = 144;
                            continue;
                        case '-':
                            yyn = 145;
                            continue;
                        case '/':
                            yyn = 146;
                            continue;
                        case '[':
                            yyn = yyr83();
                            continue;
                    }
                    yyn = 461;
                    continue;

                case 214:
                    yyst[yysp] = 214;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 443:
                    switch (yytok) {
                        case '*':
                            yyn = 143;
                            continue;
                        case '+':
                            yyn = 144;
                            continue;
                        case '-':
                            yyn = 145;
                            continue;
                        case '/':
                            yyn = 146;
                            continue;
                        case '[':
                            yyn = yyr82();
                            continue;
                    }
                    yyn = 461;
                    continue;

                case 215:
                    yyst[yysp] = 215;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 444:
                    yyn = yys215();
                    continue;

                case 216:
                    yyst[yysp] = 216;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 445:
                    yyn = yys216();
                    continue;

                case 217:
                    yyst[yysp] = 217;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 446:
                    yyn = yys217();
                    continue;

                case 218:
                    yyst[yysp] = 218;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 447:
                    yyn = yys218();
                    continue;

                case 219:
                    yyst[yysp] = 219;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 448:
                    yyn = yys219();
                    continue;

                case 220:
                    yyst[yysp] = 220;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 449:
                    yyn = yys220();
                    continue;

                case 221:
                    yyst[yysp] = 221;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 450:
                    yyn = yys221();
                    continue;

                case 222:
                    yyst[yysp] = 222;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 451:
                    yyn = yys222();
                    continue;

                case 223:
                    yyst[yysp] = 223;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 452:
                    yyn = yys223();
                    continue;

                case 224:
                    yyst[yysp] = 224;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 453:
                    yyn = yys224();
                    continue;

                case 225:
                    yyst[yysp] = 225;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 454:
                    yyn = yys225();
                    continue;

                case 226:
                    yyst[yysp] = 226;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 455:
                    yyn = yys226();
                    continue;

                case 227:
                    yyst[yysp] = 227;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 456:
                    yyn = yys227();
                    continue;

                case 228:
                    yyst[yysp] = 228;
                    yysv[yysp] = (lexer.getSemantic()
                                 );
                    yytok = (lexer.nextToken()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 457:
                    yyn = yys228();
                    continue;

                case 458:
                    return true;
                case 459:
                    yyerror("stack overflow");
                case 460:
                    return false;
                case 461:
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
                return 16;
            case AT:
                return 17;
            case AV:
                return 18;
            case AVANZA:
                return 19;
            case AZAR:
                return 20;
            case BAJALAPIZ:
                return 21;
            case BL:
                return 22;
            case BORRAPANTALLA:
                return 23;
            case CENTRO:
                return 24;
            case COS:
                return 25;
            case CUENTA:
                return 26;
            case DIFERENCIA:
                return 27;
            case DIVISION:
                return 28;
            case EJECUTA:
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
            case GIRAIZQUIERZA:
                return 36;
            case INC:
                return 37;
            case INIC:
                return 38;
            case MENOS:
                return 39;
            case OCULTARTORTUGA:
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
        return 461;
    }

    private int yys2() {
        switch (yytok) {
            case AZUL:
            case '<':
            case Y:
            case IDENTIFIER:
            case ')':
            case ENDINPUT:
            case '-':
            case error:
            case INTEGER:
            case CIAN:
            case MARRON:
            case BLANCO:
            case '+':
            case '>':
            case '=':
            case '/':
            case '*':
            case '(':
            case MAYORQUE:
            case AMARILLO:
            case ROJO:
            case GRIS:
            case IGUALES:
            case FLOAT:
            case '[':
            case VERDE:
            case O:
            case NEGRO:
            case MENORQUE:
                return 461;
        }
        return yyr3();
    }

    private int yys4() {
        switch (yytok) {
            case AZUL:
            case '<':
            case Y:
            case IDENTIFIER:
            case ')':
            case ENDINPUT:
            case '-':
            case error:
            case INTEGER:
            case CIAN:
            case MARRON:
            case BLANCO:
            case '+':
            case '>':
            case '=':
            case '/':
            case '*':
            case '(':
            case MAYORQUE:
            case AMARILLO:
            case ROJO:
            case GRIS:
            case IGUALES:
            case FLOAT:
            case '[':
            case VERDE:
            case O:
            case NEGRO:
            case MENORQUE:
                return 461;
        }
        return yyr15();
    }

    private int yys5() {
        switch (yytok) {
            case AZUL:
            case '<':
            case Y:
            case IDENTIFIER:
            case ')':
            case ENDINPUT:
            case '-':
            case error:
            case INTEGER:
            case CIAN:
            case MARRON:
            case BLANCO:
            case '+':
            case '>':
            case '=':
            case '/':
            case '*':
            case '(':
            case MAYORQUE:
            case AMARILLO:
            case ROJO:
            case GRIS:
            case IGUALES:
            case FLOAT:
            case '[':
            case VERDE:
            case O:
            case NEGRO:
            case MENORQUE:
                return 461;
        }
        return yyr10();
    }

    private int yys6() {
        switch (yytok) {
            case AZUL:
            case '<':
            case Y:
            case IDENTIFIER:
            case ')':
            case ENDINPUT:
            case '-':
            case error:
            case INTEGER:
            case CIAN:
            case MARRON:
            case BLANCO:
            case '+':
            case '>':
            case '=':
            case '/':
            case '*':
            case '(':
            case MAYORQUE:
            case AMARILLO:
            case ROJO:
            case GRIS:
            case IGUALES:
            case FLOAT:
            case '[':
            case VERDE:
            case O:
            case NEGRO:
            case MENORQUE:
                return 461;
        }
        return yyr12();
    }

    private int yys7() {
        switch (yytok) {
            case AZUL:
            case '<':
            case Y:
            case IDENTIFIER:
            case ')':
            case ENDINPUT:
            case '-':
            case error:
            case INTEGER:
            case CIAN:
            case MARRON:
            case BLANCO:
            case '+':
            case '>':
            case '=':
            case '/':
            case '*':
            case '(':
            case MAYORQUE:
            case AMARILLO:
            case ROJO:
            case GRIS:
            case IGUALES:
            case FLOAT:
            case '[':
            case VERDE:
            case O:
            case NEGRO:
            case MENORQUE:
                return 461;
        }
        return yyr6();
    }

    private int yys8() {
        switch (yytok) {
            case AZUL:
            case '<':
            case Y:
            case IDENTIFIER:
            case ')':
            case ENDINPUT:
            case '-':
            case error:
            case INTEGER:
            case CIAN:
            case MARRON:
            case BLANCO:
            case '+':
            case '>':
            case '=':
            case '/':
            case '*':
            case '(':
            case MAYORQUE:
            case AMARILLO:
            case ROJO:
            case GRIS:
            case IGUALES:
            case FLOAT:
            case '[':
            case VERDE:
            case O:
            case NEGRO:
            case MENORQUE:
                return 461;
        }
        return yyr13();
    }

    private int yys9() {
        switch (yytok) {
            case AZUL:
            case '<':
            case Y:
            case IDENTIFIER:
            case ')':
            case ENDINPUT:
            case '-':
            case error:
            case INTEGER:
            case CIAN:
            case MARRON:
            case BLANCO:
            case '+':
            case '>':
            case '=':
            case '/':
            case '*':
            case '(':
            case MAYORQUE:
            case AMARILLO:
            case ROJO:
            case GRIS:
            case IGUALES:
            case FLOAT:
            case '[':
            case VERDE:
            case O:
            case NEGRO:
            case MENORQUE:
                return 461;
        }
        return yyr7();
    }

    private int yys10() {
        switch (yytok) {
            case AZUL:
            case '<':
            case Y:
            case IDENTIFIER:
            case ')':
            case ENDINPUT:
            case '-':
            case error:
            case INTEGER:
            case CIAN:
            case MARRON:
            case BLANCO:
            case '+':
            case '>':
            case '=':
            case '/':
            case '*':
            case '(':
            case MAYORQUE:
            case AMARILLO:
            case ROJO:
            case GRIS:
            case IGUALES:
            case FLOAT:
            case '[':
            case VERDE:
            case O:
            case NEGRO:
            case MENORQUE:
                return 461;
        }
        return yyr8();
    }

    private int yys11() {
        switch (yytok) {
            case AZUL:
            case '<':
            case Y:
            case IDENTIFIER:
            case ')':
            case ENDINPUT:
            case '-':
            case error:
            case INTEGER:
            case CIAN:
            case MARRON:
            case BLANCO:
            case '+':
            case '>':
            case '=':
            case '/':
            case '*':
            case '(':
            case MAYORQUE:
            case AMARILLO:
            case ROJO:
            case GRIS:
            case IGUALES:
            case FLOAT:
            case '[':
            case VERDE:
            case O:
            case NEGRO:
            case MENORQUE:
                return 461;
        }
        return yyr14();
    }

    private int yys12() {
        switch (yytok) {
            case AZUL:
            case '<':
            case Y:
            case IDENTIFIER:
            case ')':
            case ENDINPUT:
            case '-':
            case error:
            case INTEGER:
            case CIAN:
            case MARRON:
            case BLANCO:
            case '+':
            case '>':
            case '=':
            case '/':
            case '*':
            case '(':
            case MAYORQUE:
            case AMARILLO:
            case ROJO:
            case GRIS:
            case IGUALES:
            case FLOAT:
            case '[':
            case VERDE:
            case O:
            case NEGRO:
            case MENORQUE:
                return 461;
        }
        return yyr9();
    }

    private int yys13() {
        switch (yytok) {
            case AZUL:
            case '<':
            case Y:
            case IDENTIFIER:
            case ')':
            case ENDINPUT:
            case '-':
            case error:
            case INTEGER:
            case CIAN:
            case MARRON:
            case BLANCO:
            case '+':
            case '>':
            case '=':
            case '/':
            case '*':
            case '(':
            case MAYORQUE:
            case AMARILLO:
            case ROJO:
            case GRIS:
            case IGUALES:
            case FLOAT:
            case '[':
            case VERDE:
            case O:
            case NEGRO:
            case MENORQUE:
                return 461;
        }
        return yyr11();
    }

    private int yys14() {
        switch (yytok) {
            case AZUL:
            case '<':
            case Y:
            case IDENTIFIER:
            case ')':
            case ENDINPUT:
            case '-':
            case error:
            case INTEGER:
            case CIAN:
            case MARRON:
            case BLANCO:
            case '+':
            case '>':
            case '=':
            case '/':
            case '*':
            case '(':
            case MAYORQUE:
            case AMARILLO:
            case ROJO:
            case GRIS:
            case IGUALES:
            case FLOAT:
            case '[':
            case VERDE:
            case O:
            case NEGRO:
            case MENORQUE:
                return 461;
        }
        return yyr5();
    }

    private int yys15() {
        switch (yytok) {
            case AZUL:
            case '<':
            case Y:
            case IDENTIFIER:
            case ')':
            case ENDINPUT:
            case '-':
            case error:
            case INTEGER:
            case CIAN:
            case MARRON:
            case BLANCO:
            case '+':
            case '>':
            case '=':
            case '/':
            case '*':
            case '(':
            case MAYORQUE:
            case AMARILLO:
            case ROJO:
            case GRIS:
            case IGUALES:
            case FLOAT:
            case '[':
            case VERDE:
            case O:
            case NEGRO:
            case MENORQUE:
                return 461;
        }
        return yyr4();
    }

    private int yys16() {
        switch (yytok) {
            case AZUL:
            case '<':
            case Y:
            case IDENTIFIER:
            case ')':
            case ENDINPUT:
            case '-':
            case error:
            case INTEGER:
            case CIAN:
            case MARRON:
            case BLANCO:
            case '+':
            case '>':
            case '=':
            case '/':
            case '*':
            case '(':
            case MAYORQUE:
            case AMARILLO:
            case ROJO:
            case GRIS:
            case IGUALES:
            case FLOAT:
            case '[':
            case VERDE:
            case O:
            case NEGRO:
            case MENORQUE:
                return 461;
        }
        return yyr48();
    }

    private int yys17() {
        switch (yytok) {
            case AZUL:
            case '<':
            case Y:
            case IDENTIFIER:
            case ')':
            case ENDINPUT:
            case '-':
            case error:
            case INTEGER:
            case CIAN:
            case MARRON:
            case BLANCO:
            case '+':
            case '>':
            case '=':
            case '/':
            case '*':
            case '(':
            case MAYORQUE:
            case AMARILLO:
            case ROJO:
            case GRIS:
            case IGUALES:
            case FLOAT:
            case '[':
            case VERDE:
            case O:
            case NEGRO:
            case MENORQUE:
                return 461;
        }
        return yyr49();
    }

    private int yys18() {
        switch (yytok) {
            case AZAR:
                return 20;
            case COS:
                return 25;
            case CUENTA:
                return 26;
            case DIFERENCIA:
                return 27;
            case DIVISION:
                return 28;
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
            case RUMBO:
                return 59;
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
            case FLOAT:
                return 79;
            case IDENTIFIER:
                return 80;
            case INTEGER:
                return 81;
        }
        return 461;
    }

    private int yys19() {
        switch (yytok) {
            case AZAR:
                return 20;
            case COS:
                return 25;
            case CUENTA:
                return 26;
            case DIFERENCIA:
                return 27;
            case DIVISION:
                return 28;
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
            case RUMBO:
                return 59;
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
            case FLOAT:
                return 79;
            case IDENTIFIER:
                return 80;
            case INTEGER:
                return 81;
        }
        return 461;
    }

    private int yys20() {
        switch (yytok) {
            case AZAR:
                return 20;
            case COS:
                return 25;
            case CUENTA:
                return 26;
            case DIFERENCIA:
                return 27;
            case DIVISION:
                return 28;
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
            case RUMBO:
                return 59;
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
            case FLOAT:
                return 79;
            case IDENTIFIER:
                return 80;
            case INTEGER:
                return 81;
        }
        return 461;
    }

    private int yys21() {
        switch (yytok) {
            case AZUL:
            case '<':
            case Y:
            case IDENTIFIER:
            case ')':
            case ENDINPUT:
            case '-':
            case error:
            case INTEGER:
            case CIAN:
            case MARRON:
            case BLANCO:
            case '+':
            case '>':
            case '=':
            case '/':
            case '*':
            case '(':
            case MAYORQUE:
            case AMARILLO:
            case ROJO:
            case GRIS:
            case IGUALES:
            case FLOAT:
            case '[':
            case VERDE:
            case O:
            case NEGRO:
            case MENORQUE:
                return 461;
        }
        return yyr50();
    }

    private int yys22() {
        switch (yytok) {
            case AZUL:
            case '<':
            case Y:
            case IDENTIFIER:
            case ')':
            case ENDINPUT:
            case '-':
            case error:
            case INTEGER:
            case CIAN:
            case MARRON:
            case BLANCO:
            case '+':
            case '>':
            case '=':
            case '/':
            case '*':
            case '(':
            case MAYORQUE:
            case AMARILLO:
            case ROJO:
            case GRIS:
            case IGUALES:
            case FLOAT:
            case '[':
            case VERDE:
            case O:
            case NEGRO:
            case MENORQUE:
                return 461;
        }
        return yyr51();
    }

    private int yys23() {
        switch (yytok) {
            case AZUL:
            case '<':
            case Y:
            case IDENTIFIER:
            case ')':
            case ENDINPUT:
            case '-':
            case error:
            case INTEGER:
            case CIAN:
            case MARRON:
            case BLANCO:
            case '+':
            case '>':
            case '=':
            case '/':
            case '*':
            case '(':
            case MAYORQUE:
            case AMARILLO:
            case ROJO:
            case GRIS:
            case IGUALES:
            case FLOAT:
            case '[':
            case VERDE:
            case O:
            case NEGRO:
            case MENORQUE:
                return 461;
        }
        return yyr55();
    }

    private int yys24() {
        switch (yytok) {
            case AZUL:
            case '<':
            case Y:
            case IDENTIFIER:
            case ')':
            case ENDINPUT:
            case '-':
            case error:
            case INTEGER:
            case CIAN:
            case MARRON:
            case BLANCO:
            case '+':
            case '>':
            case '=':
            case '/':
            case '*':
            case '(':
            case MAYORQUE:
            case AMARILLO:
            case ROJO:
            case GRIS:
            case IGUALES:
            case FLOAT:
            case '[':
            case VERDE:
            case O:
            case NEGRO:
            case MENORQUE:
                return 461;
        }
        return yyr54();
    }

    private int yys25() {
        switch (yytok) {
            case AZAR:
                return 20;
            case COS:
                return 25;
            case CUENTA:
                return 26;
            case DIFERENCIA:
                return 27;
            case DIVISION:
                return 28;
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
            case RUMBO:
                return 59;
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
            case FLOAT:
                return 79;
            case IDENTIFIER:
                return 80;
            case INTEGER:
                return 81;
        }
        return 461;
    }

    private int yys27() {
        switch (yytok) {
            case AZAR:
                return 20;
            case COS:
                return 25;
            case CUENTA:
                return 26;
            case DIFERENCIA:
                return 27;
            case DIVISION:
                return 28;
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
            case RUMBO:
                return 59;
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
            case FLOAT:
                return 79;
            case IDENTIFIER:
                return 80;
            case INTEGER:
                return 81;
        }
        return 461;
    }

    private int yys28() {
        switch (yytok) {
            case AZAR:
                return 20;
            case COS:
                return 25;
            case CUENTA:
                return 26;
            case DIFERENCIA:
                return 27;
            case DIVISION:
                return 28;
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
            case RUMBO:
                return 59;
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
            case FLOAT:
                return 79;
            case IDENTIFIER:
                return 80;
            case INTEGER:
                return 81;
        }
        return 461;
    }

    private int yys32() {
        switch (yytok) {
            case AZAR:
                return 20;
            case COS:
                return 25;
            case CUENTA:
                return 26;
            case DIFERENCIA:
                return 27;
            case DIVISION:
                return 28;
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
            case RUMBO:
                return 59;
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
            case FLOAT:
                return 79;
            case IDENTIFIER:
                return 80;
            case INTEGER:
                return 81;
        }
        return 461;
    }

    private int yys33() {
        switch (yytok) {
            case AZAR:
                return 20;
            case COS:
                return 25;
            case CUENTA:
                return 26;
            case DIFERENCIA:
                return 27;
            case DIVISION:
                return 28;
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
            case RUMBO:
                return 59;
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
            case FLOAT:
                return 79;
            case IDENTIFIER:
                return 80;
            case INTEGER:
                return 81;
        }
        return 461;
    }

    private int yys34() {
        switch (yytok) {
            case AZAR:
                return 20;
            case COS:
                return 25;
            case CUENTA:
                return 26;
            case DIFERENCIA:
                return 27;
            case DIVISION:
                return 28;
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
            case RUMBO:
                return 59;
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
            case FLOAT:
                return 79;
            case IDENTIFIER:
                return 80;
            case INTEGER:
                return 81;
        }
        return 461;
    }

    private int yys35() {
        switch (yytok) {
            case AZAR:
                return 20;
            case COS:
                return 25;
            case CUENTA:
                return 26;
            case DIFERENCIA:
                return 27;
            case DIVISION:
                return 28;
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
            case RUMBO:
                return 59;
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
            case FLOAT:
                return 79;
            case IDENTIFIER:
                return 80;
            case INTEGER:
                return 81;
        }
        return 461;
    }

    private int yys36() {
        switch (yytok) {
            case AZAR:
                return 20;
            case COS:
                return 25;
            case CUENTA:
                return 26;
            case DIFERENCIA:
                return 27;
            case DIVISION:
                return 28;
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
            case RUMBO:
                return 59;
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
            case FLOAT:
                return 79;
            case IDENTIFIER:
                return 80;
            case INTEGER:
                return 81;
        }
        return 461;
    }

    private int yys39() {
        switch (yytok) {
            case AZAR:
                return 20;
            case COS:
                return 25;
            case CUENTA:
                return 26;
            case DIFERENCIA:
                return 27;
            case DIVISION:
                return 28;
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
            case RUMBO:
                return 59;
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
            case FLOAT:
                return 79;
            case IDENTIFIER:
                return 80;
            case INTEGER:
                return 81;
        }
        return 461;
    }

    private int yys40() {
        switch (yytok) {
            case AZUL:
            case '<':
            case Y:
            case IDENTIFIER:
            case ')':
            case ENDINPUT:
            case '-':
            case error:
            case INTEGER:
            case CIAN:
            case MARRON:
            case BLANCO:
            case '+':
            case '>':
            case '=':
            case '/':
            case '*':
            case '(':
            case MAYORQUE:
            case AMARILLO:
            case ROJO:
            case GRIS:
            case IGUALES:
            case FLOAT:
            case '[':
            case VERDE:
            case O:
            case NEGRO:
            case MENORQUE:
                return 461;
        }
        return yyr46();
    }

    private int yys41() {
        switch (yytok) {
            case AZUL:
            case '<':
            case Y:
            case IDENTIFIER:
            case ')':
            case ENDINPUT:
            case '-':
            case error:
            case INTEGER:
            case CIAN:
            case MARRON:
            case BLANCO:
            case '+':
            case '>':
            case '=':
            case '/':
            case '*':
            case '(':
            case MAYORQUE:
            case AMARILLO:
            case ROJO:
            case GRIS:
            case IGUALES:
            case FLOAT:
            case '[':
            case VERDE:
            case O:
            case NEGRO:
            case MENORQUE:
                return 461;
        }
        return yyr47();
    }

    private int yys42() {
        switch (yytok) {
            case AMARILLO:
                return 102;
            case AZUL:
                return 103;
            case BLANCO:
                return 104;
            case CIAN:
                return 105;
            case GRIS:
                return 106;
            case MARRON:
                return 107;
            case NEGRO:
                return 108;
            case ROJO:
                return 109;
            case VERDE:
                return 110;
        }
        return 461;
    }

    private int yys43() {
        switch (yytok) {
            case AMARILLO:
                return 102;
            case AZUL:
                return 103;
            case BLANCO:
                return 104;
            case CIAN:
                return 105;
            case GRIS:
                return 106;
            case MARRON:
                return 107;
            case NEGRO:
                return 108;
            case ROJO:
                return 109;
            case VERDE:
                return 110;
        }
        return 461;
    }

    private int yys45() {
        switch (yytok) {
            case AZAR:
                return 20;
            case COS:
                return 25;
            case CUENTA:
                return 26;
            case DIFERENCIA:
                return 27;
            case DIVISION:
                return 28;
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
            case RUMBO:
                return 59;
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
            case FLOAT:
                return 79;
            case IDENTIFIER:
                return 80;
            case INTEGER:
                return 81;
        }
        return 461;
    }

    private int yys46() {
        switch (yytok) {
            case AZAR:
                return 20;
            case COS:
                return 25;
            case CUENTA:
                return 26;
            case DIFERENCIA:
                return 27;
            case DIVISION:
                return 28;
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
            case RUMBO:
                return 59;
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
            case FLOAT:
                return 79;
            case IDENTIFIER:
                return 80;
            case INTEGER:
                return 81;
        }
        return 461;
    }

    private int yys47() {
        switch (yytok) {
            case AZAR:
                return 20;
            case COS:
                return 25;
            case CUENTA:
                return 26;
            case DIFERENCIA:
                return 27;
            case DIVISION:
                return 28;
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
            case RUMBO:
                return 59;
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
            case FLOAT:
                return 79;
            case IDENTIFIER:
                return 80;
            case INTEGER:
                return 81;
        }
        return 461;
    }

    private int yys48() {
        switch (yytok) {
            case AZAR:
                return 20;
            case COS:
                return 25;
            case CUENTA:
                return 26;
            case DIFERENCIA:
                return 27;
            case DIVISION:
                return 28;
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
            case RUMBO:
                return 59;
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
            case FLOAT:
                return 79;
            case IDENTIFIER:
                return 80;
            case INTEGER:
                return 81;
        }
        return 461;
    }

    private int yys49() {
        switch (yytok) {
            case AZAR:
                return 20;
            case COS:
                return 25;
            case CUENTA:
                return 26;
            case DIFERENCIA:
                return 27;
            case DIVISION:
                return 28;
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
            case RUMBO:
                return 59;
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
            case FLOAT:
                return 79;
            case IDENTIFIER:
                return 80;
            case INTEGER:
                return 81;
        }
        return 461;
    }

    private int yys51() {
        switch (yytok) {
            case AZAR:
                return 20;
            case COS:
                return 25;
            case CUENTA:
                return 26;
            case DIFERENCIA:
                return 27;
            case DIVISION:
                return 28;
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
            case RUMBO:
                return 59;
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
            case FLOAT:
                return 79;
            case IDENTIFIER:
                return 80;
            case INTEGER:
                return 81;
        }
        return 461;
    }

    private int yys52() {
        switch (yytok) {
            case AZAR:
                return 20;
            case COS:
                return 25;
            case CUENTA:
                return 26;
            case DIFERENCIA:
                return 27;
            case DIVISION:
                return 28;
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
            case RUMBO:
                return 59;
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
            case FLOAT:
                return 79;
            case IDENTIFIER:
                return 80;
            case INTEGER:
                return 81;
        }
        return 461;
    }

    private int yys53() {
        switch (yytok) {
            case AZAR:
                return 20;
            case COS:
                return 25;
            case CUENTA:
                return 26;
            case DIFERENCIA:
                return 27;
            case DIVISION:
                return 28;
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
            case RUMBO:
                return 59;
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
            case FLOAT:
                return 79;
            case IDENTIFIER:
                return 80;
            case INTEGER:
                return 81;
        }
        return 461;
    }

    private int yys54() {
        switch (yytok) {
            case AZAR:
                return 20;
            case COS:
                return 25;
            case CUENTA:
                return 26;
            case DIFERENCIA:
                return 27;
            case DIVISION:
                return 28;
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
            case RUMBO:
                return 59;
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
            case FLOAT:
                return 79;
            case IDENTIFIER:
                return 80;
            case INTEGER:
                return 81;
        }
        return 461;
    }

    private int yys55() {
        switch (yytok) {
            case AZAR:
                return 20;
            case COS:
                return 25;
            case CUENTA:
                return 26;
            case DIFERENCIA:
                return 27;
            case DIVISION:
                return 28;
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
            case RUMBO:
                return 59;
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
            case FLOAT:
                return 79;
            case IDENTIFIER:
                return 80;
            case INTEGER:
                return 81;
        }
        return 461;
    }

    private int yys57() {
        switch (yytok) {
            case AZAR:
                return 20;
            case COS:
                return 25;
            case CUENTA:
                return 26;
            case DIFERENCIA:
                return 27;
            case DIVISION:
                return 28;
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
            case RUMBO:
                return 59;
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
            case FLOAT:
                return 79;
            case IDENTIFIER:
                return 80;
            case INTEGER:
                return 81;
        }
        return 461;
    }

    private int yys58() {
        switch (yytok) {
            case AZAR:
                return 20;
            case COS:
                return 25;
            case CUENTA:
                return 26;
            case DIFERENCIA:
                return 27;
            case DIVISION:
                return 28;
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
            case RUMBO:
                return 59;
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
            case FLOAT:
                return 79;
            case IDENTIFIER:
                return 80;
            case INTEGER:
                return 81;
        }
        return 461;
    }

    private int yys59() {
        switch (yytok) {
            case Y:
            case CIAN:
            case IGUALES:
            case VERDE:
            case ')':
            case ROJO:
            case error:
            case AMARILLO:
            case AZUL:
            case '=':
            case O:
            case BLANCO:
            case MENORQUE:
            case MARRON:
            case NEGRO:
            case '(':
            case MAYORQUE:
            case ENDINPUT:
            case GRIS:
                return 461;
        }
        return yyr45();
    }

    private int yys60() {
        switch (yytok) {
            case AZUL:
            case '<':
            case Y:
            case IDENTIFIER:
            case ')':
            case ENDINPUT:
            case '-':
            case error:
            case INTEGER:
            case CIAN:
            case MARRON:
            case BLANCO:
            case '+':
            case '>':
            case '=':
            case '/':
            case '*':
            case '(':
            case MAYORQUE:
            case AMARILLO:
            case ROJO:
            case GRIS:
            case IGUALES:
            case FLOAT:
            case '[':
            case VERDE:
            case O:
            case NEGRO:
            case MENORQUE:
                return 461;
        }
        return yyr53();
    }

    private int yys61() {
        switch (yytok) {
            case AZAR:
                return 20;
            case COS:
                return 25;
            case CUENTA:
                return 26;
            case DIFERENCIA:
                return 27;
            case DIVISION:
                return 28;
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
            case RUMBO:
                return 59;
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
            case FLOAT:
                return 79;
            case IDENTIFIER:
                return 80;
            case INTEGER:
                return 81;
        }
        return 461;
    }

    private int yys62() {
        switch (yytok) {
            case AZAR:
                return 20;
            case COS:
                return 25;
            case CUENTA:
                return 26;
            case DIFERENCIA:
                return 27;
            case DIVISION:
                return 28;
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
            case RUMBO:
                return 59;
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
            case FLOAT:
                return 79;
            case IDENTIFIER:
                return 80;
            case INTEGER:
                return 81;
        }
        return 461;
    }

    private int yys63() {
        switch (yytok) {
            case AZAR:
                return 20;
            case COS:
                return 25;
            case CUENTA:
                return 26;
            case DIFERENCIA:
                return 27;
            case DIVISION:
                return 28;
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
            case RUMBO:
                return 59;
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
            case FLOAT:
                return 79;
            case IDENTIFIER:
                return 80;
            case INTEGER:
                return 81;
            case IGUALES:
                return 133;
            case MAYORQUE:
                return 134;
            case MENORQUE:
                return 135;
            case O:
                return 136;
            case Y:
                return 137;
        }
        return 461;
    }

    private int yys64() {
        switch (yytok) {
            case AZUL:
            case '<':
            case Y:
            case IDENTIFIER:
            case ')':
            case ENDINPUT:
            case '-':
            case error:
            case INTEGER:
            case CIAN:
            case MARRON:
            case BLANCO:
            case '+':
            case '>':
            case '=':
            case '/':
            case '*':
            case '(':
            case MAYORQUE:
            case AMARILLO:
            case ROJO:
            case GRIS:
            case IGUALES:
            case FLOAT:
            case '[':
            case VERDE:
            case O:
            case NEGRO:
            case MENORQUE:
                return 461;
        }
        return yyr52();
    }

    private int yys65() {
        switch (yytok) {
            case AZAR:
                return 20;
            case COS:
                return 25;
            case CUENTA:
                return 26;
            case DIFERENCIA:
                return 27;
            case DIVISION:
                return 28;
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
            case RUMBO:
                return 59;
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
            case FLOAT:
                return 79;
            case IDENTIFIER:
                return 80;
            case INTEGER:
                return 81;
        }
        return 461;
    }

    private int yys69() {
        switch (yytok) {
            case APARECETORTUGA:
                return 16;
            case AT:
                return 17;
            case AV:
                return 18;
            case AVANZA:
                return 19;
            case AZAR:
                return 20;
            case BAJALAPIZ:
                return 21;
            case BL:
                return 22;
            case BORRAPANTALLA:
                return 23;
            case CENTRO:
                return 24;
            case COS:
                return 25;
            case CUENTA:
                return 26;
            case DIFERENCIA:
                return 27;
            case DIVISION:
                return 28;
            case EJECUTA:
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
            case GIRAIZQUIERZA:
                return 36;
            case INC:
                return 37;
            case INIC:
                return 38;
            case MENOS:
                return 39;
            case OCULTARTORTUGA:
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
        return 461;
    }

    private int yys71() {
        switch (yytok) {
            case Y:
            case CIAN:
            case IGUALES:
            case VERDE:
            case ')':
            case ROJO:
            case error:
            case AMARILLO:
            case AZUL:
            case '=':
            case O:
            case BLANCO:
            case MENORQUE:
            case MARRON:
            case NEGRO:
            case '(':
            case MAYORQUE:
            case ENDINPUT:
            case GRIS:
                return 461;
        }
        return yyr19();
    }

    private int yys72() {
        switch (yytok) {
            case VERDE:
            case '<':
            case '(':
            case IDENTIFIER:
            case ')':
            case ENDINPUT:
            case AZUL:
            case Y:
            case INTEGER:
            case CIAN:
            case MARRON:
            case BLANCO:
            case NEGRO:
            case '>':
            case '=':
            case O:
            case MENORQUE:
            case error:
            case MAYORQUE:
            case AMARILLO:
            case ROJO:
            case GRIS:
            case IGUALES:
            case FLOAT:
            case '[':
                return 461;
            case '*':
                return 143;
            case '+':
                return 144;
            case '-':
                return 145;
            case '/':
                return 146;
        }
        return yyr65();
    }

    private int yys73() {
        switch (yytok) {
            case Y:
            case CIAN:
            case IGUALES:
            case VERDE:
            case ')':
            case ROJO:
            case error:
            case AMARILLO:
            case AZUL:
            case '=':
            case O:
            case BLANCO:
            case MENORQUE:
            case MARRON:
            case NEGRO:
            case '(':
            case MAYORQUE:
            case ENDINPUT:
            case GRIS:
                return 461;
        }
        return yyr25();
    }

    private int yys74() {
        switch (yytok) {
            case Y:
            case CIAN:
            case IGUALES:
            case VERDE:
            case ')':
            case ROJO:
            case error:
            case AMARILLO:
            case AZUL:
            case '=':
            case O:
            case BLANCO:
            case MENORQUE:
            case MARRON:
            case NEGRO:
            case '(':
            case MAYORQUE:
            case ENDINPUT:
            case GRIS:
                return 461;
        }
        return yyr21();
    }

    private int yys75() {
        switch (yytok) {
            case Y:
            case CIAN:
            case IGUALES:
            case VERDE:
            case ')':
            case ROJO:
            case error:
            case AMARILLO:
            case AZUL:
            case '=':
            case O:
            case BLANCO:
            case MENORQUE:
            case MARRON:
            case NEGRO:
            case '(':
            case MAYORQUE:
            case ENDINPUT:
            case GRIS:
                return 461;
        }
        return yyr22();
    }

    private int yys76() {
        switch (yytok) {
            case Y:
            case CIAN:
            case IGUALES:
            case VERDE:
            case ')':
            case ROJO:
            case error:
            case AMARILLO:
            case AZUL:
            case '=':
            case O:
            case BLANCO:
            case MENORQUE:
            case MARRON:
            case NEGRO:
            case '(':
            case MAYORQUE:
            case ENDINPUT:
            case GRIS:
                return 461;
        }
        return yyr23();
    }

    private int yys77() {
        switch (yytok) {
            case Y:
            case CIAN:
            case IGUALES:
            case VERDE:
            case ')':
            case ROJO:
            case error:
            case AMARILLO:
            case AZUL:
            case '=':
            case O:
            case BLANCO:
            case MENORQUE:
            case MARRON:
            case NEGRO:
            case '(':
            case MAYORQUE:
            case ENDINPUT:
            case GRIS:
                return 461;
        }
        return yyr24();
    }

    private int yys78() {
        switch (yytok) {
            case Y:
            case CIAN:
            case IGUALES:
            case VERDE:
            case ')':
            case ROJO:
            case error:
            case AMARILLO:
            case AZUL:
            case '=':
            case O:
            case BLANCO:
            case MENORQUE:
            case MARRON:
            case NEGRO:
            case '(':
            case MAYORQUE:
            case ENDINPUT:
            case GRIS:
                return 461;
        }
        return yyr20();
    }

    private int yys79() {
        switch (yytok) {
            case Y:
            case CIAN:
            case IGUALES:
            case VERDE:
            case ')':
            case ROJO:
            case error:
            case AMARILLO:
            case AZUL:
            case '=':
            case O:
            case BLANCO:
            case MENORQUE:
            case MARRON:
            case NEGRO:
            case '(':
            case MAYORQUE:
            case ENDINPUT:
            case GRIS:
                return 461;
        }
        return yyr17();
    }

    private int yys80() {
        switch (yytok) {
            case Y:
            case CIAN:
            case IGUALES:
            case VERDE:
            case ')':
            case ROJO:
            case error:
            case AMARILLO:
            case AZUL:
            case '=':
            case O:
            case BLANCO:
            case MENORQUE:
            case MARRON:
            case NEGRO:
            case '(':
            case MAYORQUE:
            case ENDINPUT:
            case GRIS:
                return 461;
        }
        return yyr18();
    }

    private int yys81() {
        switch (yytok) {
            case Y:
            case CIAN:
            case IGUALES:
            case VERDE:
            case ')':
            case ROJO:
            case error:
            case AMARILLO:
            case AZUL:
            case '=':
            case O:
            case BLANCO:
            case MENORQUE:
            case MARRON:
            case NEGRO:
            case '(':
            case MAYORQUE:
            case ENDINPUT:
            case GRIS:
                return 461;
        }
        return yyr16();
    }

    private int yys82() {
        switch (yytok) {
            case VERDE:
            case '<':
            case '(':
            case IDENTIFIER:
            case ')':
            case ENDINPUT:
            case AZUL:
            case Y:
            case INTEGER:
            case CIAN:
            case MARRON:
            case BLANCO:
            case NEGRO:
            case '>':
            case '=':
            case O:
            case MENORQUE:
            case error:
            case MAYORQUE:
            case AMARILLO:
            case ROJO:
            case GRIS:
            case IGUALES:
            case FLOAT:
            case '[':
                return 461;
            case '*':
                return 143;
            case '+':
                return 144;
            case '-':
                return 145;
            case '/':
                return 146;
        }
        return yyr64();
    }

    private int yys83() {
        switch (yytok) {
            case AZUL:
            case VERDE:
            case CIAN:
            case ENDINPUT:
            case O:
            case '(':
            case ROJO:
            case Y:
            case GRIS:
            case IGUALES:
            case error:
            case NEGRO:
            case BLANCO:
            case MENORQUE:
            case ')':
            case MARRON:
            case '=':
            case MAYORQUE:
            case AMARILLO:
                return 461;
            case '*':
                return 143;
            case '+':
                return 144;
            case '-':
                return 145;
            case '/':
                return 146;
        }
        return yyr58();
    }

    private int yys84() {
        switch (yytok) {
            case AZUL:
            case VERDE:
            case CIAN:
            case ENDINPUT:
            case O:
            case '(':
            case ROJO:
            case Y:
            case GRIS:
            case IGUALES:
            case error:
            case NEGRO:
            case BLANCO:
            case MENORQUE:
            case ')':
            case MARRON:
            case '=':
            case MAYORQUE:
            case AMARILLO:
                return 461;
            case '*':
                return 143;
            case '+':
                return 144;
            case '-':
                return 145;
            case '/':
                return 146;
        }
        return yyr57();
    }

    private int yys86() {
        switch (yytok) {
            case Y:
            case CIAN:
            case IGUALES:
            case VERDE:
            case ')':
            case ROJO:
            case error:
            case AMARILLO:
            case AZUL:
            case '=':
            case O:
            case BLANCO:
            case MENORQUE:
            case MARRON:
            case NEGRO:
            case '(':
            case MAYORQUE:
            case ENDINPUT:
            case GRIS:
                return 461;
        }
        return yyr89();
    }

    private int yys87() {
        switch (yytok) {
            case NEGRO:
            case Y:
            case BLANCO:
            case ENDINPUT:
            case CIAN:
            case MARRON:
            case GRIS:
            case MENORQUE:
            case O:
            case error:
            case MAYORQUE:
            case AZUL:
            case AMARILLO:
            case IGUALES:
            case '(':
            case '=':
            case ROJO:
            case ')':
            case VERDE:
                return 461;
            case AZAR:
                return 20;
            case COS:
                return 25;
            case CUENTA:
                return 26;
            case DIFERENCIA:
                return 27;
            case DIVISION:
                return 28;
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
            case RUMBO:
                return 59;
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
            case FLOAT:
                return 79;
            case IDENTIFIER:
                return 80;
            case INTEGER:
                return 81;
            case '*':
                return 143;
            case '+':
                return 144;
            case '-':
                return 145;
            case '/':
                return 146;
        }
        return yyr88();
    }

    private int yys88() {
        switch (yytok) {
            case AZAR:
                return 20;
            case COS:
                return 25;
            case CUENTA:
                return 26;
            case DIFERENCIA:
                return 27;
            case DIVISION:
                return 28;
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
            case RUMBO:
                return 59;
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
            case FLOAT:
                return 79;
            case IDENTIFIER:
                return 80;
            case INTEGER:
                return 81;
            case '*':
                return 143;
            case '+':
                return 144;
            case '-':
                return 145;
            case '/':
                return 146;
        }
        return 461;
    }

    private int yys89() {
        switch (yytok) {
            case APARECETORTUGA:
                return 16;
            case AT:
                return 17;
            case AV:
                return 18;
            case AVANZA:
                return 19;
            case AZAR:
                return 20;
            case BAJALAPIZ:
                return 21;
            case BL:
                return 22;
            case BORRAPANTALLA:
                return 23;
            case CENTRO:
                return 24;
            case COS:
                return 25;
            case CUENTA:
                return 26;
            case DIFERENCIA:
                return 27;
            case DIVISION:
                return 28;
            case EJECUTA:
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
            case GIRAIZQUIERZA:
                return 36;
            case INC:
                return 37;
            case INIC:
                return 38;
            case MENOS:
                return 39;
            case OCULTARTORTUGA:
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
        return 461;
    }

    private int yys93() {
        switch (yytok) {
            case VERDE:
            case '<':
            case '(':
            case IDENTIFIER:
            case ')':
            case ENDINPUT:
            case AZUL:
            case Y:
            case INTEGER:
            case CIAN:
            case MARRON:
            case BLANCO:
            case NEGRO:
            case '>':
            case '=':
            case O:
            case MENORQUE:
            case error:
            case MAYORQUE:
            case AMARILLO:
            case ROJO:
            case GRIS:
            case IGUALES:
            case FLOAT:
            case '[':
                return 461;
            case '*':
                return 143;
            case '+':
                return 144;
            case '-':
                return 145;
            case '/':
                return 146;
        }
        return yyr77();
    }

    private int yys94() {
        switch (yytok) {
            case VERDE:
            case '<':
            case '(':
            case IDENTIFIER:
            case ')':
            case ENDINPUT:
            case AZUL:
            case Y:
            case INTEGER:
            case CIAN:
            case MARRON:
            case BLANCO:
            case NEGRO:
            case '>':
            case '=':
            case O:
            case MENORQUE:
            case error:
            case MAYORQUE:
            case AMARILLO:
            case ROJO:
            case GRIS:
            case IGUALES:
            case FLOAT:
            case '[':
                return 461;
            case '*':
                return 143;
            case '+':
                return 144;
            case '-':
                return 145;
            case '/':
                return 146;
        }
        return yyr69();
    }

    private int yys95() {
        switch (yytok) {
            case VERDE:
            case '<':
            case '(':
            case IDENTIFIER:
            case ')':
            case ENDINPUT:
            case AZUL:
            case Y:
            case INTEGER:
            case CIAN:
            case MARRON:
            case BLANCO:
            case NEGRO:
            case '>':
            case '=':
            case O:
            case MENORQUE:
            case error:
            case MAYORQUE:
            case AMARILLO:
            case ROJO:
            case GRIS:
            case IGUALES:
            case FLOAT:
            case '[':
                return 461;
            case '*':
                return 143;
            case '+':
                return 144;
            case '-':
                return 145;
            case '/':
                return 146;
        }
        return yyr71();
    }

    private int yys96() {
        switch (yytok) {
            case VERDE:
            case '<':
            case '(':
            case IDENTIFIER:
            case ')':
            case ENDINPUT:
            case AZUL:
            case Y:
            case INTEGER:
            case CIAN:
            case MARRON:
            case BLANCO:
            case NEGRO:
            case '>':
            case '=':
            case O:
            case MENORQUE:
            case error:
            case MAYORQUE:
            case AMARILLO:
            case ROJO:
            case GRIS:
            case IGUALES:
            case FLOAT:
            case '[':
                return 461;
            case '*':
                return 143;
            case '+':
                return 144;
            case '-':
                return 145;
            case '/':
                return 146;
        }
        return yyr68();
    }

    private int yys97() {
        switch (yytok) {
            case VERDE:
            case '<':
            case '(':
            case IDENTIFIER:
            case ')':
            case ENDINPUT:
            case AZUL:
            case Y:
            case INTEGER:
            case CIAN:
            case MARRON:
            case BLANCO:
            case NEGRO:
            case '>':
            case '=':
            case O:
            case MENORQUE:
            case error:
            case MAYORQUE:
            case AMARILLO:
            case ROJO:
            case GRIS:
            case IGUALES:
            case FLOAT:
            case '[':
                return 461;
            case '*':
                return 143;
            case '+':
                return 144;
            case '-':
                return 145;
            case '/':
                return 146;
        }
        return yyr70();
    }

    private int yys100() {
        switch (yytok) {
            case AZUL:
            case VERDE:
            case CIAN:
            case ENDINPUT:
            case O:
            case '(':
            case ROJO:
            case Y:
            case GRIS:
            case IGUALES:
            case error:
            case NEGRO:
            case BLANCO:
            case MENORQUE:
            case ')':
            case MARRON:
            case '=':
            case MAYORQUE:
            case AMARILLO:
                return 461;
            case '*':
                return 143;
            case '+':
                return 144;
            case '-':
                return 145;
            case '/':
                return 146;
        }
        return yyr59();
    }

    private int yys101() {
        switch (yytok) {
            case AZUL:
            case '<':
            case Y:
            case IDENTIFIER:
            case ')':
            case ENDINPUT:
            case '-':
            case error:
            case INTEGER:
            case CIAN:
            case MARRON:
            case BLANCO:
            case '+':
            case '>':
            case '=':
            case '/':
            case '*':
            case '(':
            case MAYORQUE:
            case AMARILLO:
            case ROJO:
            case GRIS:
            case IGUALES:
            case FLOAT:
            case '[':
            case VERDE:
            case O:
            case NEGRO:
            case MENORQUE:
                return 461;
        }
        return yyr76();
    }

    private int yys102() {
        switch (yytok) {
            case AZUL:
            case '<':
            case Y:
            case IDENTIFIER:
            case ')':
            case ENDINPUT:
            case '-':
            case error:
            case INTEGER:
            case CIAN:
            case MARRON:
            case BLANCO:
            case '+':
            case '>':
            case '=':
            case '/':
            case '*':
            case '(':
            case MAYORQUE:
            case AMARILLO:
            case ROJO:
            case GRIS:
            case IGUALES:
            case FLOAT:
            case '[':
            case VERDE:
            case O:
            case NEGRO:
            case MENORQUE:
                return 461;
        }
        return yyr41();
    }

    private int yys103() {
        switch (yytok) {
            case AZUL:
            case '<':
            case Y:
            case IDENTIFIER:
            case ')':
            case ENDINPUT:
            case '-':
            case error:
            case INTEGER:
            case CIAN:
            case MARRON:
            case BLANCO:
            case '+':
            case '>':
            case '=':
            case '/':
            case '*':
            case '(':
            case MAYORQUE:
            case AMARILLO:
            case ROJO:
            case GRIS:
            case IGUALES:
            case FLOAT:
            case '[':
            case VERDE:
            case O:
            case NEGRO:
            case MENORQUE:
                return 461;
        }
        return yyr37();
    }

    private int yys104() {
        switch (yytok) {
            case AZUL:
            case '<':
            case Y:
            case IDENTIFIER:
            case ')':
            case ENDINPUT:
            case '-':
            case error:
            case INTEGER:
            case CIAN:
            case MARRON:
            case BLANCO:
            case '+':
            case '>':
            case '=':
            case '/':
            case '*':
            case '(':
            case MAYORQUE:
            case AMARILLO:
            case ROJO:
            case GRIS:
            case IGUALES:
            case FLOAT:
            case '[':
            case VERDE:
            case O:
            case NEGRO:
            case MENORQUE:
                return 461;
        }
        return yyr36();
    }

    private int yys105() {
        switch (yytok) {
            case AZUL:
            case '<':
            case Y:
            case IDENTIFIER:
            case ')':
            case ENDINPUT:
            case '-':
            case error:
            case INTEGER:
            case CIAN:
            case MARRON:
            case BLANCO:
            case '+':
            case '>':
            case '=':
            case '/':
            case '*':
            case '(':
            case MAYORQUE:
            case AMARILLO:
            case ROJO:
            case GRIS:
            case IGUALES:
            case FLOAT:
            case '[':
            case VERDE:
            case O:
            case NEGRO:
            case MENORQUE:
                return 461;
        }
        return yyr39();
    }

    private int yys106() {
        switch (yytok) {
            case AZUL:
            case '<':
            case Y:
            case IDENTIFIER:
            case ')':
            case ENDINPUT:
            case '-':
            case error:
            case INTEGER:
            case CIAN:
            case MARRON:
            case BLANCO:
            case '+':
            case '>':
            case '=':
            case '/':
            case '*':
            case '(':
            case MAYORQUE:
            case AMARILLO:
            case ROJO:
            case GRIS:
            case IGUALES:
            case FLOAT:
            case '[':
            case VERDE:
            case O:
            case NEGRO:
            case MENORQUE:
                return 461;
        }
        return yyr40();
    }

    private int yys107() {
        switch (yytok) {
            case AZUL:
            case '<':
            case Y:
            case IDENTIFIER:
            case ')':
            case ENDINPUT:
            case '-':
            case error:
            case INTEGER:
            case CIAN:
            case MARRON:
            case BLANCO:
            case '+':
            case '>':
            case '=':
            case '/':
            case '*':
            case '(':
            case MAYORQUE:
            case AMARILLO:
            case ROJO:
            case GRIS:
            case IGUALES:
            case FLOAT:
            case '[':
            case VERDE:
            case O:
            case NEGRO:
            case MENORQUE:
                return 461;
        }
        return yyr38();
    }

    private int yys108() {
        switch (yytok) {
            case AZUL:
            case '<':
            case Y:
            case IDENTIFIER:
            case ')':
            case ENDINPUT:
            case '-':
            case error:
            case INTEGER:
            case CIAN:
            case MARRON:
            case BLANCO:
            case '+':
            case '>':
            case '=':
            case '/':
            case '*':
            case '(':
            case MAYORQUE:
            case AMARILLO:
            case ROJO:
            case GRIS:
            case IGUALES:
            case FLOAT:
            case '[':
            case VERDE:
            case O:
            case NEGRO:
            case MENORQUE:
                return 461;
        }
        return yyr42();
    }

    private int yys109() {
        switch (yytok) {
            case AZUL:
            case '<':
            case Y:
            case IDENTIFIER:
            case ')':
            case ENDINPUT:
            case '-':
            case error:
            case INTEGER:
            case CIAN:
            case MARRON:
            case BLANCO:
            case '+':
            case '>':
            case '=':
            case '/':
            case '*':
            case '(':
            case MAYORQUE:
            case AMARILLO:
            case ROJO:
            case GRIS:
            case IGUALES:
            case FLOAT:
            case '[':
            case VERDE:
            case O:
            case NEGRO:
            case MENORQUE:
                return 461;
        }
        return yyr43();
    }

    private int yys110() {
        switch (yytok) {
            case AZUL:
            case '<':
            case Y:
            case IDENTIFIER:
            case ')':
            case ENDINPUT:
            case '-':
            case error:
            case INTEGER:
            case CIAN:
            case MARRON:
            case BLANCO:
            case '+':
            case '>':
            case '=':
            case '/':
            case '*':
            case '(':
            case MAYORQUE:
            case AMARILLO:
            case ROJO:
            case GRIS:
            case IGUALES:
            case FLOAT:
            case '[':
            case VERDE:
            case O:
            case NEGRO:
            case MENORQUE:
                return 461;
        }
        return yyr44();
    }

    private int yys111() {
        switch (yytok) {
            case AZUL:
            case '<':
            case Y:
            case IDENTIFIER:
            case ')':
            case ENDINPUT:
            case '-':
            case error:
            case INTEGER:
            case CIAN:
            case MARRON:
            case BLANCO:
            case '+':
            case '>':
            case '=':
            case '/':
            case '*':
            case '(':
            case MAYORQUE:
            case AMARILLO:
            case ROJO:
            case GRIS:
            case IGUALES:
            case FLOAT:
            case '[':
            case VERDE:
            case O:
            case NEGRO:
            case MENORQUE:
                return 461;
        }
        return yyr75();
    }

    private int yys112() {
        switch (yytok) {
            case AZAR:
                return 20;
            case COS:
                return 25;
            case CUENTA:
                return 26;
            case DIFERENCIA:
                return 27;
            case DIVISION:
                return 28;
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
            case RUMBO:
                return 59;
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
            case FLOAT:
                return 79;
            case IDENTIFIER:
                return 80;
            case INTEGER:
                return 81;
        }
        return 461;
    }

    private int yys113() {
        switch (yytok) {
            case VERDE:
            case '<':
            case '(':
            case IDENTIFIER:
            case ')':
            case ENDINPUT:
            case AZUL:
            case Y:
            case INTEGER:
            case CIAN:
            case MARRON:
            case BLANCO:
            case NEGRO:
            case '>':
            case '=':
            case O:
            case MENORQUE:
            case error:
            case MAYORQUE:
            case AMARILLO:
            case ROJO:
            case GRIS:
            case IGUALES:
            case FLOAT:
            case '[':
                return 461;
            case '*':
                return 143;
            case '+':
                return 144;
            case '-':
                return 145;
            case '/':
                return 146;
        }
        return yyr72();
    }

    private int yys114() {
        switch (yytok) {
            case VERDE:
            case '<':
            case '(':
            case IDENTIFIER:
            case ')':
            case ENDINPUT:
            case AZUL:
            case Y:
            case INTEGER:
            case CIAN:
            case MARRON:
            case BLANCO:
            case NEGRO:
            case '>':
            case '=':
            case O:
            case MENORQUE:
            case error:
            case MAYORQUE:
            case AMARILLO:
            case ROJO:
            case GRIS:
            case IGUALES:
            case FLOAT:
            case '[':
                return 461;
            case '*':
                return 143;
            case '+':
                return 144;
            case '-':
                return 145;
            case '/':
                return 146;
        }
        return yyr73();
    }

    private int yys115() {
        switch (yytok) {
            case AZAR:
                return 20;
            case COS:
                return 25;
            case CUENTA:
                return 26;
            case DIFERENCIA:
                return 27;
            case DIVISION:
                return 28;
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
            case RUMBO:
                return 59;
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
            case FLOAT:
                return 79;
            case IDENTIFIER:
                return 80;
            case INTEGER:
                return 81;
            case '*':
                return 143;
            case '+':
                return 144;
            case '-':
                return 145;
            case '/':
                return 146;
        }
        return 461;
    }

    private int yys116() {
        switch (yytok) {
            case VERDE:
            case '<':
            case '(':
            case IDENTIFIER:
            case ')':
            case ENDINPUT:
            case AZUL:
            case Y:
            case INTEGER:
            case CIAN:
            case MARRON:
            case BLANCO:
            case NEGRO:
            case '>':
            case '=':
            case O:
            case MENORQUE:
            case error:
            case MAYORQUE:
            case AMARILLO:
            case ROJO:
            case GRIS:
            case IGUALES:
            case FLOAT:
            case '[':
                return 461;
            case '*':
                return 143;
            case '+':
                return 144;
            case '-':
                return 145;
            case '/':
                return 146;
        }
        return yyr74();
    }

    private int yys117() {
        switch (yytok) {
            case AZAR:
                return 20;
            case COS:
                return 25;
            case CUENTA:
                return 26;
            case DIFERENCIA:
                return 27;
            case DIVISION:
                return 28;
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
            case RUMBO:
                return 59;
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
            case FLOAT:
                return 79;
            case IDENTIFIER:
                return 80;
            case INTEGER:
                return 81;
            case '*':
                return 143;
            case '+':
                return 144;
            case '-':
                return 145;
            case '/':
                return 146;
        }
        return 461;
    }

    private int yys119() {
        switch (yytok) {
            case Y:
            case CIAN:
            case IGUALES:
            case VERDE:
            case ')':
            case ROJO:
            case error:
            case AMARILLO:
            case AZUL:
            case '=':
            case O:
            case BLANCO:
            case MENORQUE:
            case MARRON:
            case NEGRO:
            case '(':
            case MAYORQUE:
            case ENDINPUT:
            case GRIS:
                return 461;
        }
        return yyr90();
    }

    private int yys120() {
        switch (yytok) {
            case AZUL:
            case VERDE:
            case CIAN:
            case ENDINPUT:
            case O:
            case '(':
            case ROJO:
            case Y:
            case GRIS:
            case IGUALES:
            case error:
            case NEGRO:
            case BLANCO:
            case MENORQUE:
            case ')':
            case MARRON:
            case '=':
            case MAYORQUE:
            case AMARILLO:
                return 461;
            case '*':
                return 143;
            case '+':
                return 144;
            case '-':
                return 145;
            case '/':
                return 146;
        }
        return yyr60();
    }

    private int yys121() {
        switch (yytok) {
            case AZUL:
            case VERDE:
            case CIAN:
            case ENDINPUT:
            case O:
            case '(':
            case ROJO:
            case Y:
            case GRIS:
            case IGUALES:
            case error:
            case NEGRO:
            case BLANCO:
            case MENORQUE:
            case ')':
            case MARRON:
            case '=':
            case MAYORQUE:
            case AMARILLO:
                return 461;
            case '*':
                return 143;
            case '+':
                return 144;
            case '-':
                return 145;
            case '/':
                return 146;
        }
        return yyr61();
    }

    private int yys122() {
        switch (yytok) {
            case VERDE:
            case '<':
            case '(':
            case IDENTIFIER:
            case ')':
            case ENDINPUT:
            case AZUL:
            case Y:
            case INTEGER:
            case CIAN:
            case MARRON:
            case BLANCO:
            case NEGRO:
            case '>':
            case '=':
            case O:
            case MENORQUE:
            case error:
            case MAYORQUE:
            case AMARILLO:
            case ROJO:
            case GRIS:
            case IGUALES:
            case FLOAT:
            case '[':
                return 461;
            case '*':
                return 143;
            case '+':
                return 144;
            case '-':
                return 145;
            case '/':
                return 146;
        }
        return yyr67();
    }

    private int yys123() {
        switch (yytok) {
            case AZUL:
            case VERDE:
            case CIAN:
            case ENDINPUT:
            case O:
            case '(':
            case ROJO:
            case Y:
            case GRIS:
            case IGUALES:
            case error:
            case NEGRO:
            case BLANCO:
            case MENORQUE:
            case ')':
            case MARRON:
            case '=':
            case MAYORQUE:
            case AMARILLO:
                return 461;
            case '*':
                return 143;
            case '+':
                return 144;
            case '-':
                return 145;
            case '/':
                return 146;
        }
        return yyr56();
    }

    private int yys126() {
        switch (yytok) {
            case AZAR:
                return 20;
            case COS:
                return 25;
            case CUENTA:
                return 26;
            case DIFERENCIA:
                return 27;
            case DIVISION:
                return 28;
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
            case RUMBO:
                return 59;
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
            case FLOAT:
                return 79;
            case IDENTIFIER:
                return 80;
            case INTEGER:
                return 81;
            case '*':
                return 143;
            case '+':
                return 144;
            case '-':
                return 145;
            case '/':
                return 146;
        }
        return 461;
    }

    private int yys127() {
        switch (yytok) {
            case VERDE:
            case '<':
            case '(':
            case IDENTIFIER:
            case ')':
            case ENDINPUT:
            case AZUL:
            case Y:
            case INTEGER:
            case CIAN:
            case MARRON:
            case BLANCO:
            case NEGRO:
            case '>':
            case '=':
            case O:
            case MENORQUE:
            case error:
            case MAYORQUE:
            case AMARILLO:
            case ROJO:
            case GRIS:
            case IGUALES:
            case FLOAT:
            case '[':
                return 461;
            case '*':
                return 143;
            case '+':
                return 144;
            case '-':
                return 145;
            case '/':
                return 146;
        }
        return yyr66();
    }

    private int yys128() {
        switch (yytok) {
            case AZUL:
            case VERDE:
            case CIAN:
            case ENDINPUT:
            case O:
            case '(':
            case ROJO:
            case Y:
            case GRIS:
            case IGUALES:
            case error:
            case NEGRO:
            case BLANCO:
            case MENORQUE:
            case ')':
            case MARRON:
            case '=':
            case MAYORQUE:
            case AMARILLO:
                return 461;
            case '*':
                return 143;
            case '+':
                return 144;
            case '-':
                return 145;
            case '/':
                return 146;
        }
        return yyr63();
    }

    private int yys129() {
        switch (yytok) {
            case AZUL:
            case VERDE:
            case CIAN:
            case ENDINPUT:
            case O:
            case '(':
            case ROJO:
            case Y:
            case GRIS:
            case IGUALES:
            case error:
            case NEGRO:
            case BLANCO:
            case MENORQUE:
            case ')':
            case MARRON:
            case '=':
            case MAYORQUE:
            case AMARILLO:
                return 461;
            case '*':
                return 143;
            case '+':
                return 144;
            case '-':
                return 145;
            case '/':
                return 146;
        }
        return yyr62();
    }

    private int yys131() {
        switch (yytok) {
            case '*':
                return 143;
            case '+':
                return 144;
            case '-':
                return 145;
            case '/':
                return 146;
            case '<':
                return 170;
            case '>':
                return 171;
        }
        return 461;
    }

    private int yys133() {
        switch (yytok) {
            case AZAR:
                return 20;
            case COS:
                return 25;
            case CUENTA:
                return 26;
            case DIFERENCIA:
                return 27;
            case DIVISION:
                return 28;
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
            case RUMBO:
                return 59;
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
            case FLOAT:
                return 79;
            case IDENTIFIER:
                return 80;
            case INTEGER:
                return 81;
        }
        return 461;
    }

    private int yys134() {
        switch (yytok) {
            case AZAR:
                return 20;
            case COS:
                return 25;
            case CUENTA:
                return 26;
            case DIFERENCIA:
                return 27;
            case DIVISION:
                return 28;
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
            case RUMBO:
                return 59;
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
            case FLOAT:
                return 79;
            case IDENTIFIER:
                return 80;
            case INTEGER:
                return 81;
        }
        return 461;
    }

    private int yys135() {
        switch (yytok) {
            case AZAR:
                return 20;
            case COS:
                return 25;
            case CUENTA:
                return 26;
            case DIFERENCIA:
                return 27;
            case DIVISION:
                return 28;
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
            case RUMBO:
                return 59;
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
            case FLOAT:
                return 79;
            case IDENTIFIER:
                return 80;
            case INTEGER:
                return 81;
        }
        return 461;
    }

    private int yys136() {
        switch (yytok) {
            case AZAR:
                return 20;
            case COS:
                return 25;
            case CUENTA:
                return 26;
            case DIFERENCIA:
                return 27;
            case DIVISION:
                return 28;
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
            case RUMBO:
                return 59;
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
            case FLOAT:
                return 79;
            case IDENTIFIER:
                return 80;
            case INTEGER:
                return 81;
        }
        return 461;
    }

    private int yys137() {
        switch (yytok) {
            case AZAR:
                return 20;
            case COS:
                return 25;
            case CUENTA:
                return 26;
            case DIFERENCIA:
                return 27;
            case DIVISION:
                return 28;
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
            case RUMBO:
                return 59;
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
            case FLOAT:
                return 79;
            case IDENTIFIER:
                return 80;
            case INTEGER:
                return 81;
        }
        return 461;
    }

    private int yys138() {
        switch (yytok) {
            case Y:
            case CIAN:
            case IGUALES:
            case VERDE:
            case ')':
            case ROJO:
            case error:
            case AMARILLO:
            case AZUL:
            case '=':
            case O:
            case BLANCO:
            case MENORQUE:
            case MARRON:
            case NEGRO:
            case '(':
            case MAYORQUE:
            case ENDINPUT:
            case GRIS:
                return 461;
        }
        return yyr91();
    }

    private int yys141() {
        switch (yytok) {
            case MENORQUE:
            case '<':
            case Y:
            case AZUL:
            case ')':
            case ENDINPUT:
            case '-':
            case error:
            case IDENTIFIER:
            case CIAN:
            case MARRON:
            case MAYORQUE:
            case '+':
            case '>':
            case BLANCO:
            case '/':
            case '*':
            case '(':
            case INTEGER:
            case AMARILLO:
            case ROJO:
            case GRIS:
            case IGUALES:
            case FLOAT:
            case '[':
            case VERDE:
            case O:
            case NEGRO:
                return 461;
            case '=':
                return 181;
        }
        return yyr27();
    }

    private int yys143() {
        switch (yytok) {
            case AZAR:
                return 20;
            case COS:
                return 25;
            case CUENTA:
                return 26;
            case DIFERENCIA:
                return 27;
            case DIVISION:
                return 28;
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
            case RUMBO:
                return 59;
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
            case FLOAT:
                return 79;
            case IDENTIFIER:
                return 80;
            case INTEGER:
                return 81;
        }
        return 461;
    }

    private int yys144() {
        switch (yytok) {
            case AZAR:
                return 20;
            case COS:
                return 25;
            case CUENTA:
                return 26;
            case DIFERENCIA:
                return 27;
            case DIVISION:
                return 28;
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
            case RUMBO:
                return 59;
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
            case FLOAT:
                return 79;
            case IDENTIFIER:
                return 80;
            case INTEGER:
                return 81;
        }
        return 461;
    }

    private int yys145() {
        switch (yytok) {
            case AZAR:
                return 20;
            case COS:
                return 25;
            case CUENTA:
                return 26;
            case DIFERENCIA:
                return 27;
            case DIVISION:
                return 28;
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
            case RUMBO:
                return 59;
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
            case FLOAT:
                return 79;
            case IDENTIFIER:
                return 80;
            case INTEGER:
                return 81;
        }
        return 461;
    }

    private int yys146() {
        switch (yytok) {
            case AZAR:
                return 20;
            case COS:
                return 25;
            case CUENTA:
                return 26;
            case DIFERENCIA:
                return 27;
            case DIVISION:
                return 28;
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
            case RUMBO:
                return 59;
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
            case FLOAT:
                return 79;
            case IDENTIFIER:
                return 80;
            case INTEGER:
                return 81;
        }
        return 461;
    }

    private int yys151() {
        switch (yytok) {
            case Y:
            case CIAN:
            case IGUALES:
            case VERDE:
            case ')':
            case ROJO:
            case error:
            case AMARILLO:
            case AZUL:
            case '=':
            case O:
            case BLANCO:
            case MENORQUE:
            case MARRON:
            case NEGRO:
            case '(':
            case MAYORQUE:
            case ENDINPUT:
            case GRIS:
                return 461;
        }
        return yyr87();
    }

    private int yys152() {
        switch (yytok) {
            case AZUL:
            case VERDE:
            case CIAN:
            case ENDINPUT:
            case O:
            case '(':
            case ROJO:
            case Y:
            case GRIS:
            case IGUALES:
            case error:
            case NEGRO:
            case BLANCO:
            case MENORQUE:
            case ')':
            case MARRON:
            case '=':
            case MAYORQUE:
            case AMARILLO:
                return 461;
            case '*':
                return 143;
            case '+':
                return 144;
            case '-':
                return 145;
            case '/':
                return 146;
        }
        return yyr79();
    }

    private int yys154() {
        switch (yytok) {
            case APARECETORTUGA:
                return 16;
            case AT:
                return 17;
            case AV:
                return 18;
            case AVANZA:
                return 19;
            case AZAR:
                return 20;
            case BAJALAPIZ:
                return 21;
            case BL:
                return 22;
            case BORRAPANTALLA:
                return 23;
            case CENTRO:
                return 24;
            case COS:
                return 25;
            case CUENTA:
                return 26;
            case DIFERENCIA:
                return 27;
            case DIVISION:
                return 28;
            case EJECUTA:
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
            case GIRAIZQUIERZA:
                return 36;
            case INC:
                return 37;
            case INIC:
                return 38;
            case MENOS:
                return 39;
            case OCULTARTORTUGA:
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
                return yyr93();
        }
        return 461;
    }

    private int yys159() {
        switch (yytok) {
            case AZAR:
                return 20;
            case COS:
                return 25;
            case CUENTA:
                return 26;
            case DIFERENCIA:
                return 27;
            case DIVISION:
                return 28;
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
            case RUMBO:
                return 59;
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
            case FLOAT:
                return 79;
            case IDENTIFIER:
                return 80;
            case INTEGER:
                return 81;
            case ']':
                return 200;
        }
        return 461;
    }

    private int yys160() {
        switch (yytok) {
            case AZAR:
                return 20;
            case COS:
                return 25;
            case CUENTA:
                return 26;
            case DIFERENCIA:
                return 27;
            case DIVISION:
                return 28;
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
            case RUMBO:
                return 59;
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
            case FLOAT:
                return 79;
            case IDENTIFIER:
                return 80;
            case INTEGER:
                return 81;
        }
        return 461;
    }

    private int yys161() {
        switch (yytok) {
            case AZAR:
                return 20;
            case COS:
                return 25;
            case CUENTA:
                return 26;
            case DIFERENCIA:
                return 27;
            case DIVISION:
                return 28;
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
            case RUMBO:
                return 59;
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
            case FLOAT:
                return 79;
            case IDENTIFIER:
                return 80;
            case INTEGER:
                return 81;
            case '*':
                return 143;
            case '+':
                return 144;
            case '-':
                return 145;
            case '/':
                return 146;
        }
        return 461;
    }

    private int yys162() {
        switch (yytok) {
            case VERDE:
            case '<':
            case '(':
            case IDENTIFIER:
            case ')':
            case ENDINPUT:
            case AZUL:
            case Y:
            case INTEGER:
            case CIAN:
            case MARRON:
            case BLANCO:
            case NEGRO:
            case '>':
            case '=':
            case O:
            case MENORQUE:
            case error:
            case MAYORQUE:
            case AMARILLO:
            case ROJO:
            case GRIS:
            case IGUALES:
            case FLOAT:
            case '[':
                return 461;
            case '*':
                return 143;
            case '+':
                return 144;
            case '-':
                return 145;
            case '/':
                return 146;
        }
        return yyr86();
    }

    private int yys163() {
        switch (yytok) {
            case AZUL:
            case VERDE:
            case CIAN:
            case ENDINPUT:
            case O:
            case '(':
            case ROJO:
            case Y:
            case GRIS:
            case IGUALES:
            case error:
            case NEGRO:
            case BLANCO:
            case MENORQUE:
            case ')':
            case MARRON:
            case '=':
            case MAYORQUE:
            case AMARILLO:
                return 461;
            case '*':
                return 143;
            case '+':
                return 144;
            case '-':
                return 145;
            case '/':
                return 146;
        }
        return yyr78();
    }

    private int yys166() {
        switch (yytok) {
            case APARECETORTUGA:
                return 16;
            case AT:
                return 17;
            case AV:
                return 18;
            case AVANZA:
                return 19;
            case AZAR:
                return 20;
            case BAJALAPIZ:
                return 21;
            case BL:
                return 22;
            case BORRAPANTALLA:
                return 23;
            case CENTRO:
                return 24;
            case COS:
                return 25;
            case CUENTA:
                return 26;
            case DIFERENCIA:
                return 27;
            case DIVISION:
                return 28;
            case EJECUTA:
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
            case GIRAIZQUIERZA:
                return 36;
            case INC:
                return 37;
            case INIC:
                return 38;
            case MENOS:
                return 39;
            case OCULTARTORTUGA:
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
        return 461;
    }

    private int yys167() {
        switch (yytok) {
            case APARECETORTUGA:
                return 16;
            case AT:
                return 17;
            case AV:
                return 18;
            case AVANZA:
                return 19;
            case AZAR:
                return 20;
            case BAJALAPIZ:
                return 21;
            case BL:
                return 22;
            case BORRAPANTALLA:
                return 23;
            case CENTRO:
                return 24;
            case COS:
                return 25;
            case CUENTA:
                return 26;
            case DIFERENCIA:
                return 27;
            case DIVISION:
                return 28;
            case EJECUTA:
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
            case GIRAIZQUIERZA:
                return 36;
            case INC:
                return 37;
            case INIC:
                return 38;
            case MENOS:
                return 39;
            case OCULTARTORTUGA:
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
        return 461;
    }

    private int yys168() {
        switch (yytok) {
            case AZUL:
            case VERDE:
            case CIAN:
            case ENDINPUT:
            case O:
            case '(':
            case ROJO:
            case Y:
            case GRIS:
            case IGUALES:
            case error:
            case NEGRO:
            case BLANCO:
            case MENORQUE:
            case ')':
            case MARRON:
            case '=':
            case MAYORQUE:
            case AMARILLO:
                return 461;
            case '*':
                return 143;
            case '+':
                return 144;
            case '-':
                return 145;
            case '/':
                return 146;
        }
        return yyr80();
    }

    private int yys169() {
        switch (yytok) {
            case APARECETORTUGA:
                return 16;
            case AT:
                return 17;
            case AV:
                return 18;
            case AVANZA:
                return 19;
            case AZAR:
                return 20;
            case BAJALAPIZ:
                return 21;
            case BL:
                return 22;
            case BORRAPANTALLA:
                return 23;
            case CENTRO:
                return 24;
            case COS:
                return 25;
            case CUENTA:
                return 26;
            case DIFERENCIA:
                return 27;
            case DIVISION:
                return 28;
            case EJECUTA:
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
            case GIRAIZQUIERZA:
                return 36;
            case INC:
                return 37;
            case INIC:
                return 38;
            case MENOS:
                return 39;
            case OCULTARTORTUGA:
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
        return 461;
    }

    private int yys170() {
        switch (yytok) {
            case AZAR:
                return 20;
            case COS:
                return 25;
            case CUENTA:
                return 26;
            case DIFERENCIA:
                return 27;
            case DIVISION:
                return 28;
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
            case RUMBO:
                return 59;
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
            case FLOAT:
                return 79;
            case IDENTIFIER:
                return 80;
            case INTEGER:
                return 81;
        }
        return 461;
    }

    private int yys171() {
        switch (yytok) {
            case AZAR:
                return 20;
            case COS:
                return 25;
            case CUENTA:
                return 26;
            case DIFERENCIA:
                return 27;
            case DIVISION:
                return 28;
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
            case RUMBO:
                return 59;
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
            case FLOAT:
                return 79;
            case IDENTIFIER:
                return 80;
            case INTEGER:
                return 81;
        }
        return 461;
    }

    private int yys172() {
        switch (yytok) {
            case AZAR:
                return 20;
            case COS:
                return 25;
            case CUENTA:
                return 26;
            case DIFERENCIA:
                return 27;
            case DIVISION:
                return 28;
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
            case RUMBO:
                return 59;
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
            case FLOAT:
                return 79;
            case IDENTIFIER:
                return 80;
            case INTEGER:
                return 81;
            case '*':
                return 143;
            case '+':
                return 144;
            case '-':
                return 145;
            case '/':
                return 146;
        }
        return 461;
    }

    private int yys173() {
        switch (yytok) {
            case AZAR:
                return 20;
            case COS:
                return 25;
            case CUENTA:
                return 26;
            case DIFERENCIA:
                return 27;
            case DIVISION:
                return 28;
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
            case RUMBO:
                return 59;
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
            case FLOAT:
                return 79;
            case IDENTIFIER:
                return 80;
            case INTEGER:
                return 81;
            case '*':
                return 143;
            case '+':
                return 144;
            case '-':
                return 145;
            case '/':
                return 146;
        }
        return 461;
    }

    private int yys174() {
        switch (yytok) {
            case AZAR:
                return 20;
            case COS:
                return 25;
            case CUENTA:
                return 26;
            case DIFERENCIA:
                return 27;
            case DIVISION:
                return 28;
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
            case RUMBO:
                return 59;
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
            case FLOAT:
                return 79;
            case IDENTIFIER:
                return 80;
            case INTEGER:
                return 81;
            case '*':
                return 143;
            case '+':
                return 144;
            case '-':
                return 145;
            case '/':
                return 146;
        }
        return 461;
    }

    private int yys175() {
        switch (yytok) {
            case AZAR:
                return 20;
            case COS:
                return 25;
            case CUENTA:
                return 26;
            case DIFERENCIA:
                return 27;
            case DIVISION:
                return 28;
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
            case RUMBO:
                return 59;
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
            case FLOAT:
                return 79;
            case IDENTIFIER:
                return 80;
            case INTEGER:
                return 81;
            case '*':
                return 143;
            case '+':
                return 144;
            case '-':
                return 145;
            case '/':
                return 146;
        }
        return 461;
    }

    private int yys176() {
        switch (yytok) {
            case AZAR:
                return 20;
            case COS:
                return 25;
            case CUENTA:
                return 26;
            case DIFERENCIA:
                return 27;
            case DIVISION:
                return 28;
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
            case RUMBO:
                return 59;
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
            case FLOAT:
                return 79;
            case IDENTIFIER:
                return 80;
            case INTEGER:
                return 81;
            case '*':
                return 143;
            case '+':
                return 144;
            case '-':
                return 145;
            case '/':
                return 146;
        }
        return 461;
    }

    private int yys181() {
        switch (yytok) {
            case AZAR:
                return 20;
            case COS:
                return 25;
            case CUENTA:
                return 26;
            case DIFERENCIA:
                return 27;
            case DIVISION:
                return 28;
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
            case RUMBO:
                return 59;
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
            case FLOAT:
                return 79;
            case IDENTIFIER:
                return 80;
            case INTEGER:
                return 81;
        }
        return 461;
    }

    private int yys183() {
        switch (yytok) {
            case Y:
            case CIAN:
            case IGUALES:
            case VERDE:
            case ')':
            case ROJO:
            case error:
            case AMARILLO:
            case AZUL:
            case '=':
            case O:
            case BLANCO:
            case MENORQUE:
            case MARRON:
            case NEGRO:
            case '(':
            case MAYORQUE:
            case ENDINPUT:
            case GRIS:
                return 461;
        }
        return yyr34();
    }

    private int yys184() {
        switch (yytok) {
            case CIAN:
            case IGUALES:
            case AZUL:
            case MAYORQUE:
            case O:
            case error:
            case VERDE:
            case MARRON:
            case GRIS:
            case AMARILLO:
            case MENORQUE:
            case BLANCO:
            case NEGRO:
            case '(':
            case ')':
            case ENDINPUT:
            case Y:
            case '=':
            case ROJO:
                return 461;
            case '*':
                return 143;
            case '/':
                return 146;
        }
        return yyr32();
    }

    private int yys185() {
        switch (yytok) {
            case CIAN:
            case IGUALES:
            case AZUL:
            case MAYORQUE:
            case O:
            case error:
            case VERDE:
            case MARRON:
            case GRIS:
            case AMARILLO:
            case MENORQUE:
            case BLANCO:
            case NEGRO:
            case '(':
            case ')':
            case ENDINPUT:
            case Y:
            case '=':
            case ROJO:
                return 461;
            case '*':
                return 143;
            case '/':
                return 146;
        }
        return yyr33();
    }

    private int yys186() {
        switch (yytok) {
            case Y:
            case CIAN:
            case IGUALES:
            case VERDE:
            case ')':
            case ROJO:
            case error:
            case AMARILLO:
            case AZUL:
            case '=':
            case O:
            case BLANCO:
            case MENORQUE:
            case MARRON:
            case NEGRO:
            case '(':
            case MAYORQUE:
            case ENDINPUT:
            case GRIS:
                return 461;
        }
        return yyr35();
    }

    private int yys187() {
        switch (yytok) {
            case Y:
            case CIAN:
            case IGUALES:
            case VERDE:
            case ')':
            case ROJO:
            case error:
            case AMARILLO:
            case AZUL:
            case '=':
            case O:
            case BLANCO:
            case MENORQUE:
            case MARRON:
            case NEGRO:
            case '(':
            case MAYORQUE:
            case ENDINPUT:
            case GRIS:
                return 461;
        }
        return yyr100();
    }

    private int yys188() {
        switch (yytok) {
            case Y:
            case CIAN:
            case IGUALES:
            case VERDE:
            case ')':
            case ROJO:
            case error:
            case AMARILLO:
            case AZUL:
            case '=':
            case O:
            case BLANCO:
            case MENORQUE:
            case MARRON:
            case NEGRO:
            case '(':
            case MAYORQUE:
            case ENDINPUT:
            case GRIS:
                return 461;
        }
        return yyr101();
    }

    private int yys191() {
        switch (yytok) {
            case AZUL:
            case '<':
            case Y:
            case IDENTIFIER:
            case ')':
            case ENDINPUT:
            case '-':
            case error:
            case INTEGER:
            case CIAN:
            case MARRON:
            case BLANCO:
            case '+':
            case '>':
            case '=':
            case '/':
            case '*':
            case '(':
            case MAYORQUE:
            case AMARILLO:
            case ROJO:
            case GRIS:
            case IGUALES:
            case FLOAT:
            case '[':
            case VERDE:
            case O:
            case NEGRO:
            case MENORQUE:
                return 461;
        }
        return yyr111();
    }

    private int yys193() {
        switch (yytok) {
            case Y:
            case CIAN:
            case IGUALES:
            case VERDE:
            case ')':
            case ROJO:
            case error:
            case AMARILLO:
            case AZUL:
            case '=':
            case O:
            case BLANCO:
            case MENORQUE:
            case MARRON:
            case NEGRO:
            case '(':
            case MAYORQUE:
            case ENDINPUT:
            case GRIS:
                return 461;
        }
        return yyr98();
    }

    private int yys194() {
        switch (yytok) {
            case Y:
            case CIAN:
            case IGUALES:
            case VERDE:
            case ')':
            case ROJO:
            case error:
            case AMARILLO:
            case AZUL:
            case '=':
            case O:
            case BLANCO:
            case MENORQUE:
            case MARRON:
            case NEGRO:
            case '(':
            case MAYORQUE:
            case ENDINPUT:
            case GRIS:
                return 461;
        }
        return yyr99();
    }

    private int yys200() {
        switch (yytok) {
            case AZUL:
            case '<':
            case Y:
            case IDENTIFIER:
            case ')':
            case ENDINPUT:
            case '-':
            case error:
            case INTEGER:
            case CIAN:
            case MARRON:
            case BLANCO:
            case '+':
            case '>':
            case '=':
            case '/':
            case '*':
            case '(':
            case MAYORQUE:
            case AMARILLO:
            case ROJO:
            case GRIS:
            case IGUALES:
            case FLOAT:
            case '[':
            case VERDE:
            case O:
            case NEGRO:
            case MENORQUE:
                return 461;
        }
        return yyr108();
    }

    private int yys201() {
        switch (yytok) {
            case VERDE:
            case '<':
            case '(':
            case IDENTIFIER:
            case ')':
            case ENDINPUT:
            case AZUL:
            case Y:
            case INTEGER:
            case CIAN:
            case MARRON:
            case BLANCO:
            case NEGRO:
            case '>':
            case '=':
            case O:
            case MENORQUE:
            case error:
            case MAYORQUE:
            case AMARILLO:
            case ROJO:
            case GRIS:
            case IGUALES:
            case FLOAT:
            case '[':
                return 461;
            case '*':
                return 143;
            case '+':
                return 144;
            case '-':
                return 145;
            case '/':
                return 146;
        }
        return yyr26();
    }

    private int yys203() {
        switch (yytok) {
            case Y:
            case CIAN:
            case IGUALES:
            case VERDE:
            case ')':
            case ROJO:
            case error:
            case AMARILLO:
            case AZUL:
            case '=':
            case O:
            case BLANCO:
            case MENORQUE:
            case MARRON:
            case NEGRO:
            case '(':
            case MAYORQUE:
            case ENDINPUT:
            case GRIS:
                return 461;
        }
        return yyr106();
    }

    private int yys204() {
        switch (yytok) {
            case Y:
            case CIAN:
            case IGUALES:
            case VERDE:
            case ')':
            case ROJO:
            case error:
            case AMARILLO:
            case AZUL:
            case '=':
            case O:
            case BLANCO:
            case MENORQUE:
            case MARRON:
            case NEGRO:
            case '(':
            case MAYORQUE:
            case ENDINPUT:
            case GRIS:
                return 461;
        }
        return yyr107();
    }

    private int yys215() {
        switch (yytok) {
            case Y:
            case CIAN:
            case IGUALES:
            case VERDE:
            case ')':
            case ROJO:
            case error:
            case AMARILLO:
            case AZUL:
            case '=':
            case O:
            case BLANCO:
            case MENORQUE:
            case MARRON:
            case NEGRO:
            case '(':
            case MAYORQUE:
            case ENDINPUT:
            case GRIS:
                return 461;
        }
        return yyr103();
    }

    private int yys216() {
        switch (yytok) {
            case Y:
            case CIAN:
            case IGUALES:
            case VERDE:
            case ')':
            case ROJO:
            case error:
            case AMARILLO:
            case AZUL:
            case '=':
            case O:
            case BLANCO:
            case MENORQUE:
            case MARRON:
            case NEGRO:
            case '(':
            case MAYORQUE:
            case ENDINPUT:
            case GRIS:
                return 461;
        }
        return yyr105();
    }

    private int yys217() {
        switch (yytok) {
            case Y:
            case CIAN:
            case IGUALES:
            case VERDE:
            case ')':
            case ROJO:
            case error:
            case AMARILLO:
            case AZUL:
            case '=':
            case O:
            case BLANCO:
            case MENORQUE:
            case MARRON:
            case NEGRO:
            case '(':
            case MAYORQUE:
            case ENDINPUT:
            case GRIS:
                return 461;
        }
        return yyr102();
    }

    private int yys218() {
        switch (yytok) {
            case Y:
            case CIAN:
            case IGUALES:
            case VERDE:
            case ')':
            case ROJO:
            case error:
            case AMARILLO:
            case AZUL:
            case '=':
            case O:
            case BLANCO:
            case MENORQUE:
            case MARRON:
            case NEGRO:
            case '(':
            case MAYORQUE:
            case ENDINPUT:
            case GRIS:
                return 461;
        }
        return yyr104();
    }

    private int yys219() {
        switch (yytok) {
            case VERDE:
            case '<':
            case '(':
            case IDENTIFIER:
            case ')':
            case ENDINPUT:
            case AZUL:
            case Y:
            case INTEGER:
            case CIAN:
            case MARRON:
            case BLANCO:
            case NEGRO:
            case '>':
            case '=':
            case O:
            case MENORQUE:
            case error:
            case MAYORQUE:
            case AMARILLO:
            case ROJO:
            case GRIS:
            case IGUALES:
            case FLOAT:
            case '[':
                return 461;
            case '*':
                return 143;
            case '+':
                return 144;
            case '-':
                return 145;
            case '/':
                return 146;
        }
        return yyr28();
    }

    private int yys220() {
        switch (yytok) {
            case Y:
            case CIAN:
            case IGUALES:
            case VERDE:
            case ')':
            case ROJO:
            case error:
            case AMARILLO:
            case AZUL:
            case '=':
            case O:
            case BLANCO:
            case MENORQUE:
            case MARRON:
            case NEGRO:
            case '(':
            case MAYORQUE:
            case ENDINPUT:
            case GRIS:
                return 461;
        }
        return yyr114();
    }

    private int yys221() {
        switch (yytok) {
            case Y:
            case CIAN:
            case IGUALES:
            case VERDE:
            case ')':
            case ROJO:
            case error:
            case AMARILLO:
            case AZUL:
            case '=':
            case O:
            case BLANCO:
            case MENORQUE:
            case MARRON:
            case NEGRO:
            case '(':
            case MAYORQUE:
            case ENDINPUT:
            case GRIS:
                return 461;
        }
        return yyr115();
    }

    private int yys222() {
        switch (yytok) {
            case Y:
            case CIAN:
            case IGUALES:
            case VERDE:
            case ')':
            case ROJO:
            case error:
            case AMARILLO:
            case AZUL:
            case '=':
            case O:
            case BLANCO:
            case MENORQUE:
            case MARRON:
            case NEGRO:
            case '(':
            case MAYORQUE:
            case ENDINPUT:
            case GRIS:
                return 461;
        }
        return yyr112();
    }

    private int yys223() {
        switch (yytok) {
            case Y:
            case CIAN:
            case IGUALES:
            case VERDE:
            case ')':
            case ROJO:
            case error:
            case AMARILLO:
            case AZUL:
            case '=':
            case O:
            case BLANCO:
            case MENORQUE:
            case MARRON:
            case NEGRO:
            case '(':
            case MAYORQUE:
            case ENDINPUT:
            case GRIS:
                return 461;
        }
        return yyr113();
    }

    private int yys224() {
        switch (yytok) {
            case AZUL:
            case '<':
            case Y:
            case IDENTIFIER:
            case ')':
            case ENDINPUT:
            case '-':
            case error:
            case INTEGER:
            case CIAN:
            case MARRON:
            case BLANCO:
            case '+':
            case '>':
            case '=':
            case '/':
            case '*':
            case '(':
            case MAYORQUE:
            case AMARILLO:
            case ROJO:
            case GRIS:
            case IGUALES:
            case FLOAT:
            case '[':
            case VERDE:
            case O:
            case NEGRO:
            case MENORQUE:
                return 461;
        }
        return yyr109();
    }

    private int yys225() {
        switch (yytok) {
            case AZUL:
            case '<':
            case Y:
            case IDENTIFIER:
            case ')':
            case ENDINPUT:
            case '-':
            case error:
            case INTEGER:
            case CIAN:
            case MARRON:
            case BLANCO:
            case '+':
            case '>':
            case '=':
            case '/':
            case '*':
            case '(':
            case MAYORQUE:
            case AMARILLO:
            case ROJO:
            case GRIS:
            case IGUALES:
            case FLOAT:
            case '[':
            case VERDE:
            case O:
            case NEGRO:
            case MENORQUE:
                return 461;
        }
        return yyr110();
    }

    private int yys226() {
        switch (yytok) {
            case AZUL:
            case '<':
            case Y:
            case IDENTIFIER:
            case ')':
            case ENDINPUT:
            case '-':
            case error:
            case INTEGER:
            case CIAN:
            case MARRON:
            case BLANCO:
            case '+':
            case '>':
            case '=':
            case '/':
            case '*':
            case '(':
            case MAYORQUE:
            case AMARILLO:
            case ROJO:
            case GRIS:
            case IGUALES:
            case FLOAT:
            case '[':
            case VERDE:
            case O:
            case NEGRO:
            case MENORQUE:
                return 461;
        }
        return yyr117();
    }

    private int yys227() {
        switch (yytok) {
            case AZUL:
            case '<':
            case Y:
            case IDENTIFIER:
            case ')':
            case ENDINPUT:
            case '-':
            case error:
            case INTEGER:
            case CIAN:
            case MARRON:
            case BLANCO:
            case '+':
            case '>':
            case '=':
            case '/':
            case '*':
            case '(':
            case MAYORQUE:
            case AMARILLO:
            case ROJO:
            case GRIS:
            case IGUALES:
            case FLOAT:
            case '[':
            case VERDE:
            case O:
            case NEGRO:
            case MENORQUE:
                return 461;
        }
        return yyr116();
    }

    private int yys228() {
        switch (yytok) {
            case AZUL:
            case '<':
            case Y:
            case IDENTIFIER:
            case ')':
            case ENDINPUT:
            case '-':
            case error:
            case INTEGER:
            case CIAN:
            case MARRON:
            case BLANCO:
            case '+':
            case '>':
            case '=':
            case '/':
            case '*':
            case '(':
            case MAYORQUE:
            case AMARILLO:
            case ROJO:
            case GRIS:
            case IGUALES:
            case FLOAT:
            case '[':
            case VERDE:
            case O:
            case NEGRO:
            case MENORQUE:
                return 461;
        }
        return yyr118();
    }

    private int yyr1() { // prog : prog ';' expression ';'
        yysp -= 4;
        return 1;
    }

    private int yyr2() { // prog : expression ';'
        yysp -= 2;
        return 1;
    }

    private int yyr94() { // N_intvals : INTEGER N_intvals
        yysp -= 2;
        return yypN_intvals();
    }

    private int yyr95() { // N_intvals : INTEGER
        yysp -= 1;
        return yypN_intvals();
    }

    private int yypN_intvals() {
        switch (yyst[yysp-1]) {
            case 157: return 195;
            case 150: return 190;
            case 140: return 179;
            case 139: return 177;
            case 118: return 164;
            case 90: return 155;
            case 85: return 147;
            default: return 197;
        }
    }

    private int yyr92() { // N_ordenes : expression N_ordenes
        yysp -= 2;
        return yypN_ordenes();
    }

    private int yyr93() { // N_ordenes : expression
        yysp -= 1;
        return yypN_ordenes();
    }

    private int yypN_ordenes() {
        switch (yyst[yysp-1]) {
            case 167: return 206;
            case 166: return 205;
            case 154: return 192;
            case 89: return 153;
            default: return 207;
        }
    }

    private int yyr87() { // N_params : number N_params
        yysp -= 2;
        return yypN_params();
    }

    private int yyr88() { // N_params : number
        yysp -= 1;
        return yypN_params();
    }

    private int yypN_params() {
        switch (yyst[yysp-1]) {
            case 65: return 138;
            case 51: return 119;
            case 27: return 86;
            default: return 151;
        }
    }

    private int yyr32() { // arithmetic_expr : number '+' number
        yysp -= 3;
        return 71;
    }

    private int yyr33() { // arithmetic_expr : number '-' number
        yysp -= 3;
        return 71;
    }

    private int yyr34() { // arithmetic_expr : number '*' number
        yysp -= 3;
        return 71;
    }

    private int yyr35() { // arithmetic_expr : number '/' number
        yysp -= 3;
        return 71;
    }

    private int yyr36() { // color : BLANCO
        yysp -= 1;
        return yypcolor();
    }

    private int yyr37() { // color : AZUL
        yysp -= 1;
        return yypcolor();
    }

    private int yyr38() { // color : MARRON
        yysp -= 1;
        return yypcolor();
    }

    private int yyr39() { // color : CIAN
        yysp -= 1;
        return yypcolor();
    }

    private int yyr40() { // color : GRIS
        yysp -= 1;
        return yypcolor();
    }

    private int yyr41() { // color : AMARILLO
        yysp -= 1;
        return yypcolor();
    }

    private int yyr42() { // color : NEGRO
        yysp -= 1;
        return yypcolor();
    }

    private int yyr43() { // color : ROJO
        yysp -= 1;
        return yypcolor();
    }

    private int yyr44() { // color : VERDE
        yysp -= 1;
        return yypcolor();
    }

    private int yypcolor() {
        switch (yyst[yysp-1]) {
            case 42: return 101;
            default: return 111;
        }
    }

    private int yyr27() { // declaration_expr : VAR IDENTIFIER
        { /* Almacenar identificador */ }
        yysv[yysp-=2] = yyrv;
        return 2;
    }

    private int yyr28() { // declaration_expr : VAR IDENTIFIER '=' number
        { /* Almacenar identificador con valor dado */ }
        yysv[yysp-=4] = yyrv;
        return 2;
    }

    private int yyr3() { // expression : declaration_expr
        yysp -= 1;
        return yypexpression();
    }

    private int yyr4() { // expression : redeclaration_expr
        yysp -= 1;
        return yypexpression();
    }

    private int yyr5() { // expression : procedure_val
        yysp -= 1;
        return yypexpression();
    }

    private int yyr6() { // expression : procedure1_val
        yysp -= 1;
        return yypexpression();
    }

    private int yyr7() { // expression : procedure2_val
        yysp -= 1;
        return yypexpression();
    }

    private int yyr8() { // expression : procedureN_val
        yysp -= 1;
        return yypexpression();
    }

    private int yyr9() { // expression : procedureP_val
        yysp -= 1;
        return yypexpression();
    }

    private int yyr10() { // expression : procedure1P_val
        yysp -= 1;
        return yypexpression();
    }

    private int yyr11() { // expression : procedure_noval
        yysp -= 1;
        return yypexpression();
    }

    private int yyr12() { // expression : procedure1_noval
        yysp -= 1;
        return yypexpression();
    }

    private int yyr13() { // expression : procedure2_noval
        yysp -= 1;
        return yypexpression();
    }

    private int yyr14() { // expression : procedureP_noval
        yysp -= 1;
        return yypexpression();
    }

    private int yyr15() { // expression : procedure1P_noval
        yysp -= 1;
        return yypexpression();
    }

    private int yypexpression() {
        switch (yyst[yysp-1]) {
            case 69: return 142;
            case 0: return 3;
            default: return 154;
        }
    }

    private int yyr29() { // logic_expr : number '<' number
        yysp -= 3;
        return 130;
    }

    private int yyr30() { // logic_expr : number '>' number
        yysp -= 3;
        return 130;
    }

    private int yyr31() { // logic_expr : procedure2_bool
        yysp -= 1;
        return 130;
    }

    private int yyr16() { // number : INTEGER
        yysp -= 1;
        return yypnumber();
    }

    private int yyr17() { // number : FLOAT
        yysp -= 1;
        return yypnumber();
    }

    private int yyr18() { // number : IDENTIFIER
        yysp -= 1;
        return yypnumber();
    }

    private int yyr19() { // number : arithmetic_expr
        yysp -= 1;
        return yypnumber();
    }

    private int yyr20() { // number : procedure_val
        yysp -= 1;
        return yypnumber();
    }

    private int yyr21() { // number : procedure1_val
        yysp -= 1;
        return yypnumber();
    }

    private int yyr22() { // number : procedure2_val
        yysp -= 1;
        return yypnumber();
    }

    private int yyr23() { // number : procedureN_val
        yysp -= 1;
        return yypnumber();
    }

    private int yyr24() { // number : procedureP_val
        yysp -= 1;
        return yypnumber();
    }

    private int yyr25() { // number : procedure1P_val
        yysp -= 1;
        return yypnumber();
    }

    private int yypnumber() {
        switch (yyst[yysp-1]) {
            case 181: return 219;
            case 176: return 214;
            case 175: return 213;
            case 174: return 212;
            case 173: return 211;
            case 172: return 210;
            case 171: return 209;
            case 170: return 208;
            case 161: return 202;
            case 160: return 201;
            case 159: return 199;
            case 146: return 186;
            case 145: return 185;
            case 144: return 184;
            case 143: return 183;
            case 137: return 176;
            case 136: return 175;
            case 135: return 174;
            case 134: return 173;
            case 133: return 172;
            case 126: return 168;
            case 117: return 163;
            case 115: return 162;
            case 112: return 161;
            case 88: return 152;
            case 63: return 131;
            case 62: return 129;
            case 61: return 128;
            case 58: return 127;
            case 57: return 126;
            case 55: return 123;
            case 54: return 122;
            case 53: return 121;
            case 52: return 120;
            case 49: return 117;
            case 48: return 116;
            case 47: return 115;
            case 46: return 114;
            case 45: return 113;
            case 39: return 100;
            case 36: return 97;
            case 35: return 96;
            case 34: return 95;
            case 33: return 94;
            case 32: return 93;
            case 28: return 88;
            case 25: return 84;
            case 20: return 83;
            case 19: return 82;
            case 18: return 72;
            default: return 87;
        }
    }

    private int yyr116() { // procedure1P_noval : REPITE INTEGER '[' N_ordenes ']'
        yysp -= 5;
        return 4;
    }

    private int yyr117() { // procedure1P_noval : REPITE IDENTIFIER '[' N_ordenes ']'
        yysp -= 5;
        return 4;
    }

    private int yyr118() { // procedure1P_noval : SI logic_expr '[' N_ordenes ']'
        yysp -= 5;
        return 4;
    }

    private int yyr112() { // procedure1P_val : ELEMENTO INTEGER '[' N_intvals ']'
        yysp -= 5;
        return yypprocedure1P_val();
    }

    private int yyr113() { // procedure1P_val : ELEMENTO INTEGER '[' N_floatvals ']'
        yysp -= 5;
        return yypprocedure1P_val();
    }

    private int yyr114() { // procedure1P_val : ELEMENTO IDENTIFIER '[' N_intvals ']'
        yysp -= 5;
        return yypprocedure1P_val();
    }

    private int yyr115() { // procedure1P_val : ELEMENTO IDENTIFIER '[' N_floatvals ']'
        yysp -= 5;
        return yypprocedure1P_val();
    }

    private int yypprocedure1P_val() {
        switch (yyst[yysp-1]) {
            case 169: return 5;
            case 167: return 5;
            case 166: return 5;
            case 154: return 5;
            case 89: return 5;
            case 69: return 5;
            case 0: return 5;
            default: return 73;
        }
    }

    private int yyr64() { // procedure1_noval : AVANZA number
        yysp -= 2;
        return 6;
    }

    private int yyr65() { // procedure1_noval : AV number
        yysp -= 2;
        return 6;
    }

    private int yyr66() { // procedure1_noval : RETROCEDE number
        yysp -= 2;
        return 6;
    }

    private int yyr67() { // procedure1_noval : RE number
        yysp -= 2;
        return 6;
    }

    private int yyr68() { // procedure1_noval : GIRADERECHA number
        yysp -= 2;
        return 6;
    }

    private int yyr69() { // procedure1_noval : GD number
        yysp -= 2;
        return 6;
    }

    private int yyr70() { // procedure1_noval : GIRAIZQUIERZA number
        yysp -= 2;
        return 6;
    }

    private int yyr71() { // procedure1_noval : GI number
        yysp -= 2;
        return 6;
    }

    private int yyr72() { // procedure1_noval : PONRUMBO number
        yysp -= 2;
        return 6;
    }

    private int yyr73() { // procedure1_noval : PONX number
        yysp -= 2;
        return 6;
    }

    private int yyr74() { // procedure1_noval : PONY number
        yysp -= 2;
        return 6;
    }

    private int yyr75() { // procedure1_noval : PONCOLORLAPIZ color
        yysp -= 2;
        return 6;
    }

    private int yyr76() { // procedure1_noval : PONCL color
        yysp -= 2;
        return 6;
    }

    private int yyr77() { // procedure1_noval : ESPERA number
        yysp -= 2;
        return 6;
    }

    private int yyr56() { // procedure1_val : REDONDEA number
        yysp -= 2;
        return yypprocedure1_val();
    }

    private int yyr57() { // procedure1_val : COS number
        yysp -= 2;
        return yypprocedure1_val();
    }

    private int yyr58() { // procedure1_val : AZAR number
        yysp -= 2;
        return yypprocedure1_val();
    }

    private int yyr59() { // procedure1_val : MENOS number
        yysp -= 2;
        return yypprocedure1_val();
    }

    private int yyr60() { // procedure1_val : RAIZCUADRADA number
        yysp -= 2;
        return yypprocedure1_val();
    }

    private int yyr61() { // procedure1_val : RC number
        yysp -= 2;
        return yypprocedure1_val();
    }

    private int yyr62() { // procedure1_val : SENO number
        yysp -= 2;
        return yypprocedure1_val();
    }

    private int yyr63() { // procedure1_val : SEN number
        yysp -= 2;
        return yypprocedure1_val();
    }

    private int yypprocedure1_val() {
        switch (yyst[yysp-1]) {
            case 169: return 7;
            case 167: return 7;
            case 166: return 7;
            case 154: return 7;
            case 89: return 7;
            case 69: return 7;
            case 0: return 7;
            default: return 74;
        }
    }

    private int yyr81() { // procedure2_bool : IGUALES number number
        yysp -= 3;
        return 132;
    }

    private int yyr82() { // procedure2_bool : Y number number
        yysp -= 3;
        return 132;
    }

    private int yyr83() { // procedure2_bool : O number number
        yysp -= 3;
        return 132;
    }

    private int yyr84() { // procedure2_bool : MAYORQUE number number
        yysp -= 3;
        return 132;
    }

    private int yyr85() { // procedure2_bool : MENORQUE number number
        yysp -= 3;
        return 132;
    }

    private int yyr86() { // procedure2_noval : PONXY number number
        yysp -= 3;
        return 8;
    }

    private int yyr78() { // procedure2_val : POTENCIA number number
        yysp -= 3;
        return yypprocedure2_val();
    }

    private int yyr79() { // procedure2_val : DIVISION number number
        yysp -= 3;
        return yypprocedure2_val();
    }

    private int yyr80() { // procedure2_val : RESTO number number
        yysp -= 3;
        return yypprocedure2_val();
    }

    private int yypprocedure2_val() {
        switch (yyst[yysp-1]) {
            case 169: return 9;
            case 167: return 9;
            case 166: return 9;
            case 154: return 9;
            case 89: return 9;
            case 69: return 9;
            case 0: return 9;
            default: return 75;
        }
    }

    private int yyr89() { // procedureN_val : DIFERENCIA N_params
        yysp -= 2;
        return yypprocedureN_val();
    }

    private int yyr90() { // procedureN_val : PRODUCTO N_params
        yysp -= 2;
        return yypprocedureN_val();
    }

    private int yyr91() { // procedureN_val : SUMA N_params
        yysp -= 2;
        return yypprocedureN_val();
    }

    private int yypprocedureN_val() {
        switch (yyst[yysp-1]) {
            case 169: return 10;
            case 167: return 10;
            case 166: return 10;
            case 154: return 10;
            case 89: return 10;
            case 69: return 10;
            case 0: return 10;
            default: return 76;
        }
    }

    private int yyr108() { // procedureP_noval : INC '[' IDENTIFIER ']'
        yysp -= 4;
        return 11;
    }

    private int yyr109() { // procedureP_noval : INC '[' IDENTIFIER number ']'
        yysp -= 5;
        return 11;
    }

    private int yyr110() { // procedureP_noval : PONPOS '[' number number ']'
        yysp -= 5;
        return 11;
    }

    private int yyr111() { // procedureP_noval : EJECUTA '[' N_ordenes ']'
        { /* Similar a un procedimiento anónimo */ }
        yysv[yysp-=4] = yyrv;
        return 11;
    }

    private int yyr98() { // procedureP_val : ELEGIR '[' N_intvals ']'
        yysp -= 4;
        return yypprocedureP_val();
    }

    private int yyr99() { // procedureP_val : ELEGIR '[' N_floatvals ']'
        yysp -= 4;
        return yypprocedureP_val();
    }

    private int yyr100() { // procedureP_val : CUENTA '[' N_intvals ']'
        yysp -= 4;
        return yypprocedureP_val();
    }

    private int yyr101() { // procedureP_val : CUENTA '[' N_floatvals ']'
        yysp -= 4;
        return yypprocedureP_val();
    }

    private int yyr102() { // procedureP_val : ULTIMO '[' N_intvals ']'
        yysp -= 4;
        return yypprocedureP_val();
    }

    private int yyr103() { // procedureP_val : UL '[' N_intvals ']'
        yysp -= 4;
        return yypprocedureP_val();
    }

    private int yyr104() { // procedureP_val : ULTIMO '[' N_floatvals ']'
        yysp -= 4;
        return yypprocedureP_val();
    }

    private int yyr105() { // procedureP_val : UL '[' N_floatvals ']'
        yysp -= 4;
        return yypprocedureP_val();
    }

    private int yyr106() { // procedureP_val : PRIMERO '[' N_intvals ']'
        yysp -= 4;
        return yypprocedureP_val();
    }

    private int yyr107() { // procedureP_val : PRIMERO '[' N_floatvals ']'
        yysp -= 4;
        return yypprocedureP_val();
    }

    private int yypprocedureP_val() {
        switch (yyst[yysp-1]) {
            case 169: return 12;
            case 167: return 12;
            case 166: return 12;
            case 154: return 12;
            case 89: return 12;
            case 69: return 12;
            case 0: return 12;
            default: return 77;
        }
    }

    private int yyr46() { // procedure_noval : OCULTARTORTUGA
        yysp -= 1;
        return 13;
    }

    private int yyr47() { // procedure_noval : OT
        yysp -= 1;
        return 13;
    }

    private int yyr48() { // procedure_noval : APARECETORTUGA
        yysp -= 1;
        return 13;
    }

    private int yyr49() { // procedure_noval : AT
        yysp -= 1;
        return 13;
    }

    private int yyr50() { // procedure_noval : BAJALAPIZ
        yysp -= 1;
        return 13;
    }

    private int yyr51() { // procedure_noval : BL
        yysp -= 1;
        return 13;
    }

    private int yyr52() { // procedure_noval : SUBELAPIZ
        yysp -= 1;
        return 13;
    }

    private int yyr53() { // procedure_noval : SB
        yysp -= 1;
        return 13;
    }

    private int yyr54() { // procedure_noval : CENTRO
        yysp -= 1;
        return 13;
    }

    private int yyr55() { // procedure_noval : BORRAPANTALLA
        yysp -= 1;
        return 13;
    }

    private int yyr45() { // procedure_val : RUMBO
        yysp -= 1;
        switch (yyst[yysp-1]) {
            case 169: return 14;
            case 167: return 14;
            case 166: return 14;
            case 154: return 14;
            case 89: return 14;
            case 69: return 14;
            case 0: return 14;
            default: return 78;
        }
    }

    private int yyr96() { // N_floatvals : FLOAT N_floatvals
        yysp -= 2;
        return yypN_floatvals();
    }

    private int yyr97() { // N_floatvals : FLOAT
        yysp -= 1;
        return yypN_floatvals();
    }

    private int yypN_floatvals() {
        switch (yyst[yysp-1]) {
            case 157: return 196;
            case 149: return 189;
            case 140: return 180;
            case 139: return 178;
            case 118: return 165;
            case 90: return 156;
            case 85: return 148;
            default: return 198;
        }
    }

    private int yyr26() { // redeclaration_expr : INIC IDENTIFIER '=' number
        yysp -= 4;
        return 15;
    }

    protected String[] yyerrmsgs = {
    };


public static void main(String[] args) {
    Parser parser = new Parser();
    parser.parse();
}

}
