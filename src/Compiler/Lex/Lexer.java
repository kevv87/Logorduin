/* The following code was generated by JFlex 1.4.3 on 12/7/20 18:56 */

package Compiler.Lex;
import static Compiler.Lex.Tokens.*;

/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.4.3
 * on 12/7/20 18:56 from the specification file
 * <tt>C:/Users/pvill/Documents/Compiladores/Logorduin/src/Compiler/Lex/lexical.jflex</tt>
 */
class Lexer {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0, 0
  };

  /** 
   * Translates characters to character classes
   */
  private static final String ZZ_CMAP_PACKED = 
    "\11\0\1\5\1\43\2\0\1\5\22\0\1\5\5\0\1\10\1\0"+
    "\1\45\1\45\1\44\1\0\1\5\1\0\1\4\1\42\1\3\11\2"+
    "\1\0\1\45\1\44\1\44\1\44\1\41\1\10\32\1\1\45\1\0"+
    "\1\45\1\0\1\10\1\0\1\12\1\30\1\20\1\34\1\26\1\14"+
    "\1\25\1\35\1\15\1\31\1\6\1\23\1\27\1\16\1\21\1\11"+
    "\1\36\1\13\1\33\1\24\1\22\1\17\1\6\1\37\1\40\1\32"+
    "\1\0\1\7\uff83\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\1\1\2\3\3\1\4\1\3\1\1\7\3\1\5"+
    "\7\3\1\5\2\6\1\7\1\0\1\1\7\10\1\11"+
    "\1\12\2\10\1\11\1\10\1\11\10\10\1\13\1\11"+
    "\7\10\1\14\3\10\1\4\1\3\21\10\1\15\1\10"+
    "\1\13\1\10\1\11\16\10\1\11\5\10\1\15\5\10"+
    "\2\11\27\10\1\16\12\10\1\11\1\5\4\10\1\12"+
    "\27\10\1\13\4\10\1\11\1\10\1\14\3\10\1\12"+
    "\15\10\1\13\25\10\1\16\1\11\1\10\1\5\3\10"+
    "\1\5\3\10\1\14\12\10\1\11\3\10\1\12\14\10"+
    "\1\16\5\3\1\11\4\3\1\12";

  private static int [] zzUnpackAction() {
    int [] result = new int[278];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\46\0\114\0\162\0\230\0\276\0\344\0\u010a"+
    "\0\u0130\0\u0156\0\u017c\0\u01a2\0\u01c8\0\u01ee\0\u0214\0\u023a"+
    "\0\u0260\0\u0286\0\u02ac\0\u02d2\0\u02f8\0\u031e\0\u0344\0\344"+
    "\0\u036a\0\46\0\46\0\u0390\0\230\0\u03b6\0\u03dc\0\u0402"+
    "\0\u0428\0\u044e\0\u0474\0\u049a\0\u04c0\0\u03b6\0\u04e6\0\u050c"+
    "\0\u03b6\0\u0532\0\u0558\0\u057e\0\u05a4\0\u05ca\0\u05f0\0\u0616"+
    "\0\u063c\0\u0662\0\u0688\0\u06ae\0\u06d4\0\u06fa\0\u0720\0\u0746"+
    "\0\u076c\0\u0792\0\u07b8\0\u07de\0\u03b6\0\u0804\0\u082a\0\u0850"+
    "\0\u0876\0\u0390\0\u089c\0\u08c2\0\u08e8\0\u090e\0\u0934\0\u095a"+
    "\0\u0980\0\u09a6\0\u09cc\0\u09f2\0\u0a18\0\u0a3e\0\u0a64\0\u0a8a"+
    "\0\u0ab0\0\u0ad6\0\u0afc\0\u089c\0\u0b22\0\u089c\0\u0b48\0\u089c"+
    "\0\u0b6e\0\u0b94\0\u0bba\0\u0be0\0\u0c06\0\u0c2c\0\u0c52\0\u0c78"+
    "\0\u0c9e\0\u0cc4\0\u0cea\0\u0d10\0\u0d36\0\u0d5c\0\u0d82\0\u0da8"+
    "\0\u0dce\0\u0df4\0\u0e1a\0\u0e40\0\u0df4\0\u0e66\0\u0e8c\0\u0eb2"+
    "\0\u0ed8\0\u0efe\0\u0f24\0\u0df4\0\u0f4a\0\u0f70\0\u0f96\0\u0fbc"+
    "\0\u0fe2\0\u1008\0\u102e\0\u1054\0\u107a\0\u10a0\0\u10c6\0\u10ec"+
    "\0\u1112\0\u1138\0\u115e\0\u1184\0\u11aa\0\u11d0\0\u11f6\0\u121c"+
    "\0\u1242\0\u1268\0\u128e\0\u0df4\0\u12b4\0\u12da\0\u1300\0\u1326"+
    "\0\u134c\0\u1372\0\u1398\0\u13be\0\u13e4\0\u140a\0\u1300\0\u1300"+
    "\0\u1430\0\u1456\0\u147c\0\u14a2\0\u1300\0\u14c8\0\u14ee\0\u1514"+
    "\0\u153a\0\u1560\0\u1586\0\u15ac\0\u15d2\0\u15f8\0\u161e\0\u1644"+
    "\0\u166a\0\u1690\0\u16b6\0\u16dc\0\u1702\0\u1728\0\u174e\0\u1774"+
    "\0\u179a\0\u17c0\0\u17e6\0\u180c\0\u1774\0\u1832\0\u1858\0\u187e"+
    "\0\u18a4\0\u1774\0\u18ca\0\u1774\0\u18f0\0\u1916\0\u193c\0\u1774"+
    "\0\u1962\0\u1988\0\u19ae\0\u19d4\0\u19fa\0\u1a20\0\u1a46\0\u1a6c"+
    "\0\u1a92\0\u1ab8\0\u1ade\0\u1b04\0\u1b2a\0\u1ade\0\u1b50\0\u1b76"+
    "\0\u1b9c\0\u1bc2\0\u1be8\0\u1c0e\0\u1c34\0\u1c5a\0\u1c80\0\u1ca6"+
    "\0\u1ccc\0\u1cf2\0\u1d18\0\u1d3e\0\u1d64\0\u1d8a\0\u1db0\0\u1dd6"+
    "\0\u1dfc\0\u1e22\0\u1e48\0\u1dfc\0\u1dfc\0\u1e6e\0\u1dfc\0\u1e94"+
    "\0\u1eba\0\u1ee0\0\46\0\u1f06\0\u1f2c\0\u1f52\0\u1dfc\0\u1f78"+
    "\0\u1f9e\0\u1fc4\0\u1fea\0\u2010\0\u2036\0\u205c\0\u2082\0\u20a8"+
    "\0\u20ce\0\u2010\0\u20f4\0\u211a\0\u2140\0\u2010\0\u2166\0\u218c"+
    "\0\114\0\u010a\0\46\0\u21b2\0\u21d8\0\u21fe\0\u2224\0\u224a"+
    "\0\u2270\0\u2296\0\114\0\u22bc\0\u2224\0\u2270\0\u22e2\0\u21fe"+
    "\0\114\0\u2308\0\u232e\0\u2354\0\u237a\0\114";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[278];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\2\1\3\1\4\1\5\1\2\1\6\1\7\1\2"+
    "\1\10\1\11\1\12\1\13\1\14\1\15\1\7\1\16"+
    "\1\17\1\20\1\21\2\7\1\22\1\23\1\24\1\25"+
    "\2\7\1\26\1\27\3\7\1\30\1\2\1\31\1\6"+
    "\1\32\1\33\47\0\1\3\2\10\2\0\1\3\1\0"+
    "\1\10\30\3\6\0\1\10\2\4\1\34\1\0\1\10"+
    "\1\0\31\10\6\0\1\10\2\35\1\34\1\0\1\10"+
    "\1\0\31\10\12\0\1\6\35\0\1\6\3\0\1\36"+
    "\2\37\2\0\1\36\1\40\1\37\30\36\6\0\3\10"+
    "\2\0\1\10\1\0\31\10\6\0\1\36\2\37\2\0"+
    "\1\36\1\40\1\37\1\36\1\41\1\42\5\36\1\43"+
    "\17\36\6\0\1\36\2\37\2\0\1\36\1\40\1\37"+
    "\1\44\5\36\1\45\4\36\1\46\5\36\1\47\6\36"+
    "\6\0\1\36\2\37\2\0\1\36\1\40\1\37\1\36"+
    "\1\50\5\36\1\51\1\36\1\52\3\36\1\53\12\36"+
    "\6\0\1\36\2\37\2\0\1\36\1\40\1\37\4\36"+
    "\1\54\23\36\6\0\1\36\2\37\2\0\1\36\1\40"+
    "\1\37\5\36\1\55\6\36\1\56\13\36\6\0\1\36"+
    "\2\37\2\0\1\36\1\40\1\37\1\36\1\57\26\36"+
    "\6\0\1\36\2\37\2\0\1\36\1\40\1\37\10\36"+
    "\1\60\1\61\3\36\1\62\12\36\6\0\1\36\2\37"+
    "\2\0\1\36\1\40\1\37\7\36\1\63\3\36\1\46"+
    "\14\36\6\0\1\36\2\37\2\0\1\36\1\40\1\37"+
    "\12\36\1\64\15\36\6\0\1\36\2\37\2\0\1\36"+
    "\1\40\1\37\4\36\1\65\16\36\1\51\4\36\6\0"+
    "\1\36\2\37\2\0\1\36\1\40\1\37\12\36\1\66"+
    "\5\36\1\67\1\36\1\70\5\36\6\0\1\36\2\37"+
    "\2\0\1\36\1\40\1\37\1\36\1\71\13\36\1\72"+
    "\12\36\6\0\1\36\2\37\2\0\1\36\1\40\1\37"+
    "\1\36\1\73\6\36\1\74\1\36\1\46\15\36\6\0"+
    "\1\36\2\37\2\0\1\36\1\40\1\37\4\36\1\75"+
    "\4\36\1\76\3\36\1\77\1\36\1\46\10\36\6\0"+
    "\1\36\2\37\2\0\1\36\1\40\1\37\4\36\1\100"+
    "\23\36\47\0\1\101\5\0\2\102\43\0\1\103\2\104"+
    "\2\0\1\103\1\105\1\104\30\103\6\0\3\104\2\0"+
    "\1\104\1\105\31\104\6\0\3\105\2\0\33\105\6\0"+
    "\1\103\2\104\2\0\1\103\1\105\1\104\2\103\1\106"+
    "\25\103\6\0\1\103\2\104\2\0\1\103\1\105\1\104"+
    "\4\103\1\107\3\103\1\110\17\103\6\0\1\103\2\104"+
    "\2\0\1\103\1\105\1\104\5\103\1\111\5\103\1\112"+
    "\14\103\6\0\1\103\2\104\2\0\1\103\1\105\1\104"+
    "\1\103\1\113\26\103\6\0\1\103\2\104\2\0\1\103"+
    "\1\105\1\104\1\103\1\114\26\103\6\0\1\103\2\104"+
    "\2\0\1\103\1\105\1\104\1\103\1\115\26\103\6\0"+
    "\1\103\2\104\2\0\1\103\1\105\1\104\4\103\1\116"+
    "\23\103\6\0\1\103\2\104\2\0\1\103\1\105\1\104"+
    "\16\103\1\117\11\103\6\0\1\103\2\104\2\0\1\103"+
    "\1\105\1\104\1\120\12\103\1\121\6\103\1\122\1\123"+
    "\4\103\6\0\1\103\2\104\2\0\1\103\1\105\1\104"+
    "\5\103\1\124\22\103\6\0\1\103\2\104\2\0\1\103"+
    "\1\105\1\104\4\103\1\125\2\103\1\126\20\103\6\0"+
    "\1\103\2\104\2\0\1\103\1\105\1\104\11\103\1\127"+
    "\16\103\6\0\1\103\2\104\2\0\1\103\1\105\1\104"+
    "\2\103\1\124\25\103\6\0\1\103\2\104\2\0\1\103"+
    "\1\105\1\104\22\103\1\130\5\103\6\0\1\103\2\104"+
    "\2\0\1\103\1\105\1\104\15\103\1\131\12\103\6\0"+
    "\1\103\2\104\2\0\1\103\1\105\1\104\5\103\1\132"+
    "\22\103\6\0\1\103\2\104\2\0\1\103\1\105\1\104"+
    "\11\103\1\133\16\103\6\0\1\103\2\104\2\0\1\103"+
    "\1\105\1\104\13\103\1\134\14\103\6\0\1\103\2\104"+
    "\2\0\1\103\1\105\1\104\2\103\1\135\25\103\6\0"+
    "\1\103\2\104\2\0\1\103\1\105\1\104\15\103\1\136"+
    "\12\103\6\0\1\103\2\104\2\0\1\103\1\105\1\104"+
    "\15\103\1\137\12\103\6\0\1\103\2\104\2\0\1\103"+
    "\1\105\1\104\1\140\27\103\6\0\1\103\2\104\2\0"+
    "\1\103\1\105\1\104\27\103\1\141\6\0\1\103\2\104"+
    "\2\0\1\103\1\105\1\104\5\103\1\142\22\103\6\0"+
    "\1\103\2\104\2\0\1\103\1\105\1\104\20\103\1\143"+
    "\7\103\6\0\1\103\2\104\2\0\1\103\1\105\1\104"+
    "\2\103\1\144\25\103\6\0\1\103\2\104\2\0\1\103"+
    "\1\105\1\104\16\103\1\145\1\146\10\103\6\0\1\103"+
    "\2\104\2\0\1\103\1\105\1\104\5\103\1\147\22\103"+
    "\6\0\1\103\2\104\2\0\1\103\1\105\1\104\3\103"+
    "\1\150\2\103\1\151\21\103\5\0\43\101\1\0\2\101"+
    "\1\0\1\152\2\153\2\0\1\152\1\154\1\153\30\152"+
    "\6\0\3\153\2\0\1\153\1\154\31\153\6\0\3\154"+
    "\2\0\33\154\6\0\1\152\2\153\2\0\1\152\1\154"+
    "\1\153\1\152\1\155\26\152\6\0\1\152\2\153\2\0"+
    "\1\152\1\154\1\153\16\152\1\156\11\152\6\0\1\152"+
    "\2\153\2\0\1\152\1\154\1\153\23\152\1\157\4\152"+
    "\6\0\1\152\2\153\2\0\1\152\1\154\1\153\1\160"+
    "\1\152\1\161\4\152\1\162\16\152\1\163\1\164\6\0"+
    "\1\152\2\153\2\0\1\152\1\154\1\153\15\152\1\165"+
    "\12\152\6\0\1\152\2\153\2\0\1\152\1\154\1\153"+
    "\2\152\1\166\25\152\6\0\1\152\2\153\2\0\1\152"+
    "\1\154\1\153\5\152\1\167\22\152\6\0\1\152\2\153"+
    "\2\0\1\152\1\154\1\153\2\152\1\164\25\152\6\0"+
    "\1\152\2\153\2\0\1\152\1\154\1\153\21\152\1\170"+
    "\6\152\6\0\1\152\2\153\2\0\1\152\1\154\1\153"+
    "\17\152\1\171\10\152\6\0\1\152\2\153\2\0\1\152"+
    "\1\154\1\153\4\152\1\172\23\152\6\0\1\152\2\153"+
    "\2\0\1\152\1\154\1\153\2\152\1\173\25\152\6\0"+
    "\1\152\2\153\2\0\1\152\1\154\1\153\13\152\1\174"+
    "\14\152\6\0\1\152\2\153\2\0\1\152\1\154\1\153"+
    "\10\152\1\175\17\152\6\0\1\152\2\153\2\0\1\152"+
    "\1\154\1\153\7\152\1\155\20\152\6\0\1\152\2\153"+
    "\2\0\1\152\1\154\1\153\1\152\1\176\26\152\6\0"+
    "\1\152\2\153\2\0\1\152\1\154\1\153\5\152\1\177"+
    "\22\152\6\0\1\152\2\153\2\0\1\152\1\154\1\153"+
    "\13\152\1\200\14\152\6\0\1\152\2\153\2\0\1\152"+
    "\1\154\1\153\12\152\1\201\15\152\6\0\1\152\2\153"+
    "\2\0\1\152\1\154\1\153\4\152\1\202\23\152\6\0"+
    "\1\152\2\153\2\0\1\152\1\154\1\153\1\152\1\203"+
    "\26\152\6\0\1\152\2\153\2\0\1\152\1\154\1\153"+
    "\14\152\1\204\1\152\1\205\11\152\6\0\1\152\2\153"+
    "\2\0\1\152\1\154\1\153\7\152\1\206\20\152\6\0"+
    "\1\152\2\153\2\0\1\152\1\154\1\153\15\152\1\207"+
    "\12\152\6\0\1\152\2\153\2\0\1\152\1\154\1\153"+
    "\10\152\1\210\17\152\6\0\1\152\2\153\2\0\1\152"+
    "\1\154\1\153\10\152\1\211\17\152\6\0\1\152\2\153"+
    "\2\0\1\152\1\154\1\153\1\152\1\212\26\152\6\0"+
    "\1\152\2\153\2\0\1\152\1\154\1\153\2\152\1\213"+
    "\25\152\6\0\1\152\2\153\2\0\1\152\1\154\1\153"+
    "\1\152\1\214\26\152\6\0\1\152\2\153\2\0\1\152"+
    "\1\154\1\153\15\152\1\212\12\152\6\0\1\152\2\153"+
    "\2\0\1\152\1\154\1\153\10\152\1\164\17\152\6\0"+
    "\1\152\2\153\2\0\1\152\1\154\1\153\15\152\1\215"+
    "\12\152\6\0\1\152\2\153\2\0\1\152\1\154\1\153"+
    "\4\152\1\216\23\152\6\0\1\217\2\220\2\0\1\217"+
    "\1\221\1\220\30\217\6\0\3\220\2\0\1\220\1\221"+
    "\31\220\6\0\3\221\2\0\33\221\6\0\1\217\2\220"+
    "\2\0\1\217\1\221\1\220\15\217\1\222\12\217\6\0"+
    "\1\217\2\220\2\0\1\217\1\221\1\220\11\217\1\223"+
    "\16\217\6\0\1\217\2\220\2\0\1\217\1\221\1\220"+
    "\10\217\1\224\17\217\6\0\1\217\2\220\2\0\1\217"+
    "\1\221\1\220\11\217\1\225\16\217\6\0\1\217\2\220"+
    "\2\0\1\217\1\221\1\220\10\217\1\226\1\217\1\227"+
    "\15\217\6\0\1\217\2\220\2\0\1\217\1\221\1\220"+
    "\27\217\1\230\6\0\1\217\2\220\2\0\1\217\1\221"+
    "\1\220\5\217\1\231\22\217\6\0\1\217\2\220\2\0"+
    "\1\217\1\221\1\220\15\217\1\232\12\217\6\0\1\217"+
    "\2\220\2\0\1\217\1\221\1\220\21\217\1\233\6\217"+
    "\6\0\1\217\2\220\2\0\1\217\1\221\1\220\7\217"+
    "\1\234\20\217\6\0\1\217\2\220\2\0\1\217\1\221"+
    "\1\220\10\217\1\235\17\217\6\0\1\217\2\220\2\0"+
    "\1\217\1\221\1\220\13\217\1\236\14\217\6\0\1\217"+
    "\2\220\2\0\1\217\1\221\1\220\10\217\1\237\17\217"+
    "\6\0\1\217\2\220\2\0\1\217\1\221\1\220\10\217"+
    "\1\230\17\217\6\0\1\217\2\220\2\0\1\217\1\221"+
    "\1\220\5\217\1\240\22\217\6\0\1\217\2\220\2\0"+
    "\1\217\1\221\1\220\12\217\1\241\15\217\6\0\1\217"+
    "\2\220\2\0\1\217\1\221\1\220\13\217\1\242\14\217"+
    "\6\0\1\217\2\220\2\0\1\217\1\221\1\220\2\217"+
    "\1\243\25\217\6\0\1\217\2\220\2\0\1\217\1\221"+
    "\1\220\13\217\1\244\14\217\6\0\1\217\2\220\2\0"+
    "\1\217\1\221\1\220\16\217\1\245\11\217\6\0\1\217"+
    "\2\220\2\0\1\217\1\221\1\220\4\217\1\246\16\217"+
    "\1\247\4\217\6\0\1\217\2\220\2\0\1\217\1\221"+
    "\1\220\4\217\1\250\23\217\6\0\1\217\2\220\2\0"+
    "\1\217\1\221\1\220\15\217\1\251\12\217\6\0\1\217"+
    "\2\220\2\0\1\217\1\221\1\220\11\217\1\252\16\217"+
    "\6\0\1\217\2\220\2\0\1\217\1\221\1\220\2\217"+
    "\1\233\25\217\6\0\1\217\2\220\2\0\1\217\1\221"+
    "\1\220\2\217\1\253\25\217\6\0\1\217\2\220\2\0"+
    "\1\217\1\221\1\220\2\217\1\253\17\217\1\227\5\217"+
    "\6\0\1\217\2\220\2\0\1\217\1\221\1\220\12\217"+
    "\1\254\15\217\6\0\1\217\2\220\2\0\1\217\1\221"+
    "\1\220\1\217\1\255\26\217\6\0\1\217\2\220\2\0"+
    "\1\217\1\221\1\220\2\217\1\256\25\217\6\0\1\217"+
    "\2\220\2\0\1\217\1\221\1\220\22\217\1\257\5\217"+
    "\6\0\1\260\2\261\2\0\1\260\1\262\1\261\30\260"+
    "\6\0\3\261\2\0\1\261\1\262\31\261\6\0\3\262"+
    "\2\0\33\262\6\0\1\260\2\261\2\0\1\260\1\262"+
    "\1\261\2\260\1\263\25\260\6\0\1\260\2\261\2\0"+
    "\1\260\1\262\1\261\7\260\1\264\20\260\6\0\1\260"+
    "\2\261\2\0\1\260\1\262\1\261\22\260\1\265\5\260"+
    "\6\0\1\260\2\261\2\0\1\260\1\262\1\261\16\260"+
    "\1\266\11\260\6\0\1\260\2\261\2\0\1\260\1\262"+
    "\1\261\12\260\1\267\15\260\6\0\1\260\2\261\2\0"+
    "\1\260\1\262\1\261\7\260\1\270\20\260\6\0\1\260"+
    "\2\261\2\0\1\260\1\262\1\261\7\260\1\271\20\260"+
    "\6\0\1\260\2\261\2\0\1\260\1\262\1\261\1\260"+
    "\1\272\26\260\6\0\1\260\2\261\2\0\1\260\1\262"+
    "\1\261\11\260\1\273\16\260\6\0\1\260\2\261\2\0"+
    "\1\260\1\262\1\261\15\260\1\274\12\260\6\0\1\260"+
    "\2\261\2\0\1\260\1\262\1\261\7\260\1\275\20\260"+
    "\6\0\1\260\2\261\2\0\1\260\1\262\1\261\23\260"+
    "\1\276\4\260\6\0\1\260\2\261\2\0\1\260\1\262"+
    "\1\261\15\260\1\277\12\260\6\0\1\260\2\261\2\0"+
    "\1\260\1\262\1\261\1\260\1\265\26\260\6\0\1\260"+
    "\2\261\2\0\1\260\1\262\1\261\10\260\1\300\17\260"+
    "\6\0\1\260\2\261\2\0\1\260\1\262\1\261\1\260"+
    "\1\301\26\260\6\0\1\260\2\261\2\0\1\260\1\262"+
    "\1\261\10\260\1\265\17\260\6\0\1\260\2\261\2\0"+
    "\1\260\1\262\1\261\21\260\1\302\6\260\6\0\1\260"+
    "\2\261\2\0\1\260\1\262\1\261\15\260\1\303\12\260"+
    "\6\0\1\260\2\261\2\0\1\260\1\262\1\261\2\260"+
    "\1\265\25\260\6\0\1\260\2\261\2\0\1\260\1\262"+
    "\1\261\5\260\1\304\22\260\6\0\1\260\2\261\2\0"+
    "\1\260\1\262\1\261\13\260\1\305\14\260\6\0\1\260"+
    "\2\261\2\0\1\260\1\262\1\261\25\260\1\306\2\260"+
    "\6\0\1\260\2\261\2\0\1\260\1\262\1\261\1\260"+
    "\1\307\26\260\6\0\1\260\2\261\2\0\1\260\1\262"+
    "\1\261\2\260\1\310\25\260\6\0\1\260\2\261\2\0"+
    "\1\260\1\262\1\261\15\260\1\311\12\260\6\0\1\260"+
    "\2\261\2\0\1\260\1\262\1\261\4\260\1\312\23\260"+
    "\6\0\1\313\2\314\2\0\1\313\1\315\1\314\30\313"+
    "\6\0\3\314\2\0\1\314\1\315\31\314\6\0\3\315"+
    "\2\0\33\315\6\0\1\313\2\314\2\0\1\313\1\315"+
    "\1\314\10\313\1\316\17\313\6\0\1\313\2\314\2\0"+
    "\1\313\1\315\1\314\13\313\1\317\14\313\6\0\1\313"+
    "\2\314\2\0\1\313\1\315\1\314\17\313\1\320\10\313"+
    "\6\0\1\313\2\314\2\0\1\313\1\315\1\314\10\313"+
    "\1\321\17\313\6\0\1\313\2\314\2\0\1\313\1\315"+
    "\1\314\4\313\1\322\23\313\6\0\1\313\2\314\2\0"+
    "\1\313\1\315\1\314\15\313\1\323\12\313\6\0\1\313"+
    "\2\314\2\0\1\313\1\315\1\314\1\313\1\324\26\313"+
    "\6\0\1\313\2\314\2\0\1\313\1\315\1\314\15\313"+
    "\1\325\12\313\6\0\1\313\2\314\2\0\1\313\1\315"+
    "\1\314\15\313\1\326\12\313\6\0\1\313\2\314\2\0"+
    "\1\313\1\315\1\314\22\313\1\327\5\313\6\0\1\313"+
    "\2\314\2\0\1\313\1\315\1\314\13\313\1\330\14\313"+
    "\6\0\1\313\2\314\2\0\1\313\1\315\1\314\25\313"+
    "\1\331\2\313\6\0\1\313\2\314\2\0\1\313\1\315"+
    "\1\314\2\313\1\332\25\313\6\0\1\313\2\314\2\0"+
    "\1\313\1\315\1\314\13\313\1\333\14\313\6\0\1\313"+
    "\2\314\2\0\1\313\1\315\1\314\1\313\1\316\26\313"+
    "\6\0\1\313\2\314\2\0\1\313\1\315\1\314\11\313"+
    "\1\334\16\313\6\0\1\313\2\314\2\0\1\313\1\315"+
    "\1\314\1\335\27\313\6\0\1\313\2\314\2\0\1\313"+
    "\1\315\1\314\1\336\27\313\6\0\1\313\2\314\2\0"+
    "\1\313\1\315\1\314\5\313\1\337\22\313\6\0\1\313"+
    "\2\314\2\0\1\313\1\315\1\314\10\313\1\340\17\313"+
    "\6\0\1\341\2\342\2\0\1\341\1\343\1\342\30\341"+
    "\6\0\3\342\2\0\1\342\1\343\31\342\6\0\3\343"+
    "\2\0\33\343\6\0\1\341\2\342\2\0\1\341\1\343"+
    "\1\342\10\341\1\344\17\341\6\0\1\341\2\342\2\0"+
    "\1\341\1\343\1\342\10\341\1\345\17\341\6\0\1\341"+
    "\2\342\2\0\1\341\1\343\1\342\2\341\1\346\25\341"+
    "\6\0\1\341\2\342\2\0\1\341\1\343\1\342\1\341"+
    "\1\347\26\341\6\0\1\341\2\342\2\0\1\341\1\343"+
    "\1\342\13\341\1\350\14\341\6\0\1\341\2\342\2\0"+
    "\1\341\1\343\1\342\23\341\1\351\4\341\6\0\1\341"+
    "\2\342\2\0\1\341\1\343\1\342\23\341\1\352\4\341"+
    "\6\0\1\341\2\342\2\0\1\341\1\343\1\342\1\341"+
    "\1\345\26\341\6\0\1\341\2\342\2\0\1\341\1\343"+
    "\1\342\30\341\1\353\5\0\1\341\2\342\2\0\1\341"+
    "\1\343\1\342\10\341\1\354\17\341\6\0\1\341\2\342"+
    "\2\0\1\341\1\343\1\342\11\341\1\355\16\341\6\0"+
    "\1\341\2\342\2\0\1\341\1\343\1\342\15\341\1\356"+
    "\12\341\6\0\1\341\2\342\2\0\1\341\1\343\1\342"+
    "\10\341\1\357\17\341\6\0\1\341\2\342\2\0\1\341"+
    "\1\343\1\342\15\341\1\360\12\341\6\0\1\341\2\342"+
    "\2\0\1\341\1\343\1\342\4\341\1\361\23\341\6\0"+
    "\1\341\2\342\2\0\1\341\1\343\1\342\1\341\1\362"+
    "\26\341\6\0\1\341\2\342\2\0\1\341\1\343\1\342"+
    "\7\341\1\363\20\341\6\0\1\341\2\342\2\0\1\341"+
    "\1\343\1\342\5\341\1\347\22\341\6\0\1\364\2\365"+
    "\2\0\1\364\1\366\1\365\30\364\6\0\3\365\2\0"+
    "\1\365\1\366\31\365\6\0\3\366\2\0\33\366\6\0"+
    "\1\364\2\365\2\0\1\364\1\366\1\365\12\364\1\367"+
    "\15\364\6\0\1\364\2\365\2\0\1\364\1\366\1\365"+
    "\10\364\1\370\17\364\6\0\1\364\2\365\2\0\1\364"+
    "\1\366\1\365\2\364\1\371\25\364\6\0\1\364\2\365"+
    "\2\0\1\364\1\366\1\365\15\364\1\372\12\364\6\0"+
    "\1\364\2\365\2\0\1\364\1\366\1\365\2\364\1\373"+
    "\25\364\6\0\1\364\2\365\2\0\1\364\1\366\1\365"+
    "\4\364\1\374\23\364\6\0\1\364\2\365\2\0\1\364"+
    "\1\366\1\365\7\364\1\375\20\364\6\0\1\364\2\365"+
    "\2\0\1\364\1\366\1\365\30\364\1\353\5\0\1\364"+
    "\2\365\2\0\1\364\1\366\1\365\21\364\1\376\6\364"+
    "\6\0\1\364\2\365\2\0\1\364\1\366\1\365\5\364"+
    "\1\377\22\364\6\0\1\364\2\365\2\0\1\364\1\366"+
    "\1\365\4\364\1\u0100\23\364\6\0\1\u0101\2\u0102\2\0"+
    "\1\u0101\1\u0103\1\u0102\30\u0101\6\0\3\u0102\2\0\1\u0102"+
    "\1\u0103\31\u0102\6\0\3\u0103\2\0\33\u0103\6\0\1\u0101"+
    "\2\u0102\2\0\1\u0101\1\u0103\1\u0102\1\u0101\1\u0104\26\u0101"+
    "\6\0\1\u0101\2\u0102\2\0\1\u0101\1\u0103\1\u0102\2\u0101"+
    "\1\u0105\25\u0101\6\0\1\u0101\2\u0102\2\0\1\u0101\1\u0103"+
    "\1\u0102\1\u0101\1\u0106\26\u0101\6\0\1\u0101\2\u0102\2\0"+
    "\1\u0101\1\u0103\1\u0102\13\u0101\1\u0107\14\u0101\6\0\1\u0101"+
    "\2\u0102\2\0\1\u0101\1\u0103\1\u0102\15\u0101\1\u0108\12\u0101"+
    "\6\0\1\u0101\2\u0102\2\0\1\u0101\1\u0103\1\u0102\24\u0101"+
    "\1\u0109\3\u0101\6\0\1\u0101\2\u0102\2\0\1\u0101\1\u0103"+
    "\1\u0102\13\u0101\1\u010a\14\u0101\6\0\1\u0101\2\u0102\2\0"+
    "\1\u0101\1\u0103\1\u0102\1\u0101\1\u010b\26\u0101\6\0\1\3"+
    "\2\10\2\0\1\3\1\0\1\10\1\u010c\27\3\6\0"+
    "\1\3\2\10\2\0\1\3\1\0\1\10\13\3\1\u010d"+
    "\14\3\6\0\1\3\2\10\2\0\1\3\1\0\1\10"+
    "\23\3\1\u010e\4\3\6\0\1\3\2\10\2\0\1\3"+
    "\1\0\1\10\11\3\1\u010f\16\3\6\0\1\3\2\10"+
    "\2\0\1\3\1\0\1\10\2\3\1\u0110\25\3\6\0"+
    "\1\3\2\10\2\0\1\3\1\0\1\10\1\3\1\u0111"+
    "\26\3\6\0\1\3\2\10\2\0\1\3\1\0\1\10"+
    "\1\3\1\u0112\26\3\6\0\1\3\2\10\2\0\1\3"+
    "\1\0\1\10\4\3\1\u0113\23\3\6\0\1\3\2\10"+
    "\2\0\1\3\1\0\1\10\14\3\1\u0114\13\3\6\0"+
    "\1\3\2\10\2\0\1\3\1\0\1\10\12\3\1\u0115"+
    "\15\3\6\0\1\3\2\10\2\0\1\3\1\0\1\10"+
    "\21\3\1\u0111\6\3\6\0\1\3\2\10\2\0\1\3"+
    "\1\0\1\10\1\3\1\u0116\26\3\6\0\1\3\2\10"+
    "\2\0\1\3\1\0\1\10\12\3\1\u0114\15\3\5\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[9120];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /* error messages for the codes above */
  private static final String ZZ_ERROR_MSG[] = {
    "Unkown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\1\1\11\27\1\2\11\1\0\316\1\1\11\27\1"+
    "\1\11\23\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[278];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /** number of newlines encountered up to the start of the matched text */
  private int yyline;

  /** the number of characters up to the start of the matched text */
  private int yychar;

  /**
   * the number of characters from the last newline up to the start of the 
   * matched text
   */
  private int yycolumn;

  /** 
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;

  /* user code: */
    public String lexeme;
    public int line;
    public int column;


  /**
   * Creates a new scanner
   * There is also a java.io.InputStream version of this constructor.
   *
   * @param   in  the java.io.Reader to read input from.
   */
  Lexer(java.io.Reader in) {
    this.zzReader = in;
  }

  /**
   * Creates a new scanner.
   * There is also java.io.Reader version of this constructor.
   *
   * @param   in  the java.io.Inputstream to read input from.
   */
  Lexer(java.io.InputStream in) {
    this(new java.io.InputStreamReader(in));
  }

  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    char [] map = new char[0x10000];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 126) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }


  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   * 
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead-zzStartRead);

      /* translate stored positions */
      zzEndRead-= zzStartRead;
      zzCurrentPos-= zzStartRead;
      zzMarkedPos-= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzCurrentPos*2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
    }

    /* finally: fill the buffer with new input */
    int numRead = zzReader.read(zzBuffer, zzEndRead,
                                            zzBuffer.length-zzEndRead);

    if (numRead > 0) {
      zzEndRead+= numRead;
      return false;
    }
    // unlikely but not impossible: read 0 characters, but not at end of stream    
    if (numRead == 0) {
      int c = zzReader.read();
      if (c == -1) {
        return true;
      } else {
        zzBuffer[zzEndRead++] = (char) c;
        return false;
      }     
    }

	// numRead < 0
    return true;
  }

    
  /**
   * Closes the input stream.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true;            /* indicate end of file */
    zzEndRead = zzStartRead;  /* invalidate buffer    */

    if (zzReader != null)
      zzReader.close();
  }


  /**
   * Resets the scanner to read from a new input stream.
   * Does not close the old reader.
   *
   * All internal variables are reset, the old input stream 
   * <b>cannot</b> be reused (internal buffer is discarded and lost).
   * Lexical state is set to <tt>ZZ_INITIAL</tt>.
   *
   * @param reader   the new input stream 
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzAtBOL  = true;
    zzAtEOF  = false;
    zzEOFDone = false;
    zzEndRead = zzStartRead = 0;
    zzCurrentPos = zzMarkedPos = 0;
    yyline = yychar = yycolumn = 0;
    zzLexicalState = YYINITIAL;
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final String yytext() {
    return new String( zzBuffer, zzStartRead, zzMarkedPos-zzStartRead );
  }


  /**
   * Returns the character at position <tt>pos</tt> from the 
   * matched text. 
   * 
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch. 
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBuffer[zzStartRead+pos];
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of 
   * yypushback(int) and a match-all fallback rule) this method 
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  } 


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public Tokens yylex() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char [] zzBufferL = zzBuffer;
    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      boolean zzR = false;
      for (zzCurrentPosL = zzStartRead; zzCurrentPosL < zzMarkedPosL;
                                                             zzCurrentPosL++) {
        switch (zzBufferL[zzCurrentPosL]) {
        case '\u000B':
        case '\u000C':
        case '\u0085':
        case '\u2028':
        case '\u2029':
          yyline++;
          yycolumn = 0;
          zzR = false;
          break;
        case '\r':
          yyline++;
          yycolumn = 0;
          zzR = true;
          break;
        case '\n':
          if (zzR)
            zzR = false;
          else {
            yyline++;
            yycolumn = 0;
          }
          break;
        default:
          zzR = false;
          yycolumn++;
        }
      }

      if (zzR) {
        // peek one character ahead if it is \n (if we have counted one line too much)
        boolean zzPeek;
        if (zzMarkedPosL < zzEndReadL)
          zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        else if (zzAtEOF)
          zzPeek = false;
        else {
          boolean eof = zzRefill();
          zzEndReadL = zzEndRead;
          zzMarkedPosL = zzMarkedPos;
          zzBufferL = zzBuffer;
          if (eof) 
            zzPeek = false;
          else 
            zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        }
        if (zzPeek) yyline--;
      }
      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;
  
      zzState = ZZ_LEXSTATE[zzLexicalState];


      zzForAction: {
        while (true) {
    
          if (zzCurrentPosL < zzEndReadL)
            zzInput = zzBufferL[zzCurrentPosL++];
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = zzBufferL[zzCurrentPosL++];
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          int zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
        case 2: 
          { // token desconocido
    lexeme = yytext();
    line = yyline;
    column = yycolumn;
    return Error;
          }
        case 15: break;
        case 9: 
          { lexeme = yytext(); return Procedimiento1;
          }
        case 16: break;
        case 11: 
          { lexeme = yytext(); return ProcedimientoP;
          }
        case 17: break;
        case 13: 
          { lexeme = yytext(); return Reservadas;
          }
        case 18: break;
        case 12: 
          { lexeme = yytext(); return Procedimiento1P;
          }
        case 19: break;
        case 6: 
          { lexeme = yytext(); return Operador;
          }
        case 20: break;
        case 1: 
          { lexeme = yytext(); 
    line = yyline;
    column = yycolumn;
    return Error;
          }
        case 21: break;
        case 7: 
          { lexeme = yytext(); return SimboloEspecial;
          }
        case 22: break;
        case 8: 
          { lexeme = yytext(); return Identificador;
          }
        case 23: break;
        case 5: 
          { lexeme = yytext(); return Procedimiento2;
          }
        case 24: break;
        case 4: 
          { /*Ignore*/
          }
        case 25: break;
        case 10: 
          { lexeme = yytext(); return Procedimiento;
          }
        case 26: break;
        case 3: 
          { lexeme = yytext(); return Constante;
          }
        case 27: break;
        case 14: 
          { lexeme = yytext(); return ProcedimientoN;
          }
        case 28: break;
        default: 
          if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
            zzAtEOF = true;
            return null;
          } 
          else {
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}
