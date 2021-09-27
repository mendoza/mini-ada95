/* The following code was generated by JFlex 1.4.3 on 9/27/21 10:14 AM */

package picoada;

import java_cup.runtime.Symbol;
import static picoada.Tokens.*;
import java.util.LinkedList;

/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.4.3
 * on 9/27/21 10:14 AM from the specification file
 * <tt>/Users/jeancasoto/CompiladoresI/mini-ada95/src/picoada/adaCup.flex</tt>
 */
class LexerCup implements java_cup.runtime.Scanner {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int STRING = 4;
  public static final int YYINITIAL = 0;
  public static final int COMMENT_LINE = 2;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0,  0,  1,  1,  2, 2
  };

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = {
     0,  0,  0,  0,  0,  0,  0,  0,  0, 13, 42,  0,  0, 23,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
    13,  0, 33,  0,  0,  0,  0,  0, 17, 18, 29, 30, 14, 31,  4, 25, 
     1,  1,  1,  1,  1,  1,  1,  1,  1,  1, 15, 16, 19, 24, 19,  0, 
     0, 10, 36, 35, 28,  8,  9, 37, 40, 38,  2,  2, 11,  2, 26, 27, 
    34,  2,  6, 12,  5,  7,  2, 39, 41,  2,  2, 20, 32, 21,  0,  3, 
     0, 10, 36, 35, 28,  8,  9, 37, 40, 38,  2,  2, 11,  2, 26, 27, 
    34,  2,  6, 12,  5,  7,  2, 39, 41,  2,  2,  0, 22,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0
  };

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\3\0\1\1\1\2\1\3\1\4\6\3\1\5\1\6"+
    "\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\13"+
    "\1\16\2\3\1\16\2\17\1\1\5\3\1\5\1\20"+
    "\1\5\2\0\1\3\1\0\14\3\1\21\1\3\1\22"+
    "\1\3\1\16\1\23\1\0\5\3\1\24\1\25\1\26"+
    "\1\3\1\27\1\0\1\30\2\0\4\3\1\31\4\3"+
    "\1\32\1\33\1\3\1\34\1\35\2\0\1\3\1\36"+
    "\2\3\1\37\3\3\1\2\2\3\1\0\2\3\1\0"+
    "\1\40\1\41\1\3\1\42\1\3\1\43\2\3\1\44"+
    "\3\0\1\3\1\0\3\3\1\45\3\3\1\46\1\3"+
    "\1\47\2\0\1\50\1\3\1\0\1\51\2\3\1\52"+
    "\1\53\1\3\6\0\5\3\1\0\2\3\1\54\1\55"+
    "\1\56\1\3\1\57\1\60";

  private static int [] zzUnpackAction() {
    int [] result = new int[161];
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
    "\0\0\0\53\0\126\0\201\0\254\0\327\0\201\0\u0102"+
    "\0\u012d\0\u0158\0\u0183\0\u01ae\0\u01d9\0\u0204\0\201\0\u022f"+
    "\0\201\0\201\0\201\0\u025a\0\201\0\201\0\201\0\u025a"+
    "\0\u0285\0\u02b0\0\u02db\0\201\0\u0306\0\u0331\0\u035c\0\u0387"+
    "\0\u03b2\0\u03dd\0\u0408\0\201\0\201\0\u0433\0\u045e\0\u0489"+
    "\0\u04b4\0\u04df\0\u050a\0\u0535\0\u0560\0\u058b\0\u05b6\0\u05e1"+
    "\0\u060c\0\u0637\0\u0662\0\u068d\0\u06b8\0\u06e3\0\201\0\u070e"+
    "\0\327\0\u0739\0\201\0\201\0\u0764\0\u078f\0\u07ba\0\u07e5"+
    "\0\u0810\0\u083b\0\327\0\327\0\u0866\0\u0891\0\201\0\u08bc"+
    "\0\u0489\0\u08e7\0\u0912\0\u093d\0\u0968\0\u0993\0\u09be\0\327"+
    "\0\u09e9\0\u0a14\0\u0a3f\0\u0a6a\0\327\0\327\0\u0a95\0\327"+
    "\0\327\0\u0ac0\0\u0331\0\u0aeb\0\u0b16\0\u0b41\0\u0b6c\0\327"+
    "\0\u0b97\0\u0bc2\0\u0bed\0\u08bc\0\u08e7\0\u0c18\0\u0c43\0\u0c6e"+
    "\0\u0912\0\u0c99\0\327\0\327\0\u0cc4\0\327\0\u0cef\0\327"+
    "\0\u0d1a\0\u0d45\0\327\0\u0d70\0\u0d9b\0\u0dc6\0\u0df1\0\u0e1c"+
    "\0\u0e47\0\u0e72\0\u0e9d\0\327\0\u0ec8\0\u0ef3\0\u0f1e\0\327"+
    "\0\u0f49\0\327\0\u0f74\0\u0f9f\0\u0fca\0\u0ff5\0\u1020\0\327"+
    "\0\u104b\0\u1076\0\327\0\327\0\u10a1\0\u10cc\0\u10f7\0\u1122"+
    "\0\u114d\0\u1178\0\u11a3\0\u11ce\0\u11f9\0\u1224\0\u124f\0\u127a"+
    "\0\u12a5\0\u12d0\0\u12fb\0\327\0\327\0\327\0\u1326\0\u0912"+
    "\0\327";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[161];
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
    "\1\4\1\5\1\6\1\4\1\7\1\10\1\11\1\6"+
    "\1\12\1\13\1\14\1\15\1\6\1\16\1\17\1\20"+
    "\1\21\1\22\1\23\1\24\1\25\1\26\1\4\1\16"+
    "\1\27\1\30\1\31\1\32\1\6\1\33\1\34\1\35"+
    "\1\36\1\4\1\37\1\6\1\40\1\41\1\42\1\43"+
    "\2\6\1\16\26\44\2\45\22\44\1\45\40\44\1\46"+
    "\11\44\55\0\1\5\1\0\1\47\1\50\47\0\1\51"+
    "\1\6\1\52\1\0\10\6\15\0\3\6\5\0\10\6"+
    "\2\0\1\51\1\6\1\52\1\0\1\6\1\53\6\6"+
    "\15\0\3\6\5\0\6\6\1\54\1\6\2\0\1\51"+
    "\1\6\1\52\1\0\3\6\1\55\4\6\15\0\3\6"+
    "\5\0\10\6\2\0\1\51\1\6\1\52\1\0\6\6"+
    "\1\56\1\6\15\0\1\57\2\6\5\0\7\6\1\60"+
    "\2\0\1\51\1\6\1\52\1\0\2\6\1\61\2\6"+
    "\1\62\1\63\1\6\15\0\1\6\1\64\1\6\5\0"+
    "\10\6\2\0\1\51\1\6\1\52\1\0\10\6\15\0"+
    "\1\65\2\6\5\0\10\6\2\0\1\51\1\6\1\52"+
    "\1\0\10\6\15\0\1\6\1\66\1\6\5\0\10\6"+
    "\16\0\1\16\11\0\1\16\22\0\1\16\30\0\1\67"+
    "\52\0\1\27\23\0\1\51\1\6\1\52\1\0\10\6"+
    "\15\0\1\6\1\70\1\6\5\0\10\6\2\0\1\51"+
    "\1\6\1\52\1\0\1\6\1\71\1\72\5\6\15\0"+
    "\3\6\5\0\10\6\36\0\1\73\54\0\1\74\54\0"+
    "\1\75\12\0\1\51\1\6\1\52\1\0\1\6\1\76"+
    "\1\77\5\6\15\0\3\6\5\0\10\6\2\0\1\51"+
    "\1\6\1\52\1\0\3\6\1\100\4\6\15\0\1\6"+
    "\1\101\1\6\5\0\10\6\2\0\1\51\1\6\1\52"+
    "\1\0\3\6\1\102\4\6\15\0\3\6\5\0\10\6"+
    "\2\0\1\51\1\6\1\52\1\0\4\6\1\103\2\6"+
    "\1\104\15\0\1\105\2\6\5\0\10\6\2\0\1\51"+
    "\1\6\1\52\1\0\10\6\15\0\3\6\5\0\6\6"+
    "\1\106\1\6\42\0\1\107\12\0\1\110\52\0\1\111"+
    "\52\0\1\51\52\0\1\112\1\113\2\0\10\113\15\0"+
    "\3\113\5\0\10\113\2\0\1\51\1\6\1\52\1\0"+
    "\2\6\1\114\5\6\15\0\3\6\5\0\10\6\2\0"+
    "\1\51\1\6\1\52\1\0\3\6\1\115\4\6\15\0"+
    "\3\6\5\0\10\6\2\0\1\51\1\6\1\52\1\0"+
    "\1\116\7\6\15\0\3\6\5\0\10\6\2\0\1\51"+
    "\1\6\1\52\1\0\7\6\1\117\15\0\3\6\5\0"+
    "\10\6\2\0\1\51\1\6\1\52\1\0\10\6\15\0"+
    "\2\6\1\120\5\0\10\6\2\0\1\51\1\6\1\52"+
    "\1\0\10\6\15\0\3\6\5\0\4\6\1\121\3\6"+
    "\2\0\1\51\1\6\1\52\1\0\10\6\15\0\1\122"+
    "\2\6\5\0\10\6\2\0\1\51\1\6\1\52\1\0"+
    "\6\6\1\123\1\6\15\0\3\6\5\0\10\6\2\0"+
    "\1\51\1\6\1\52\1\0\10\6\15\0\1\6\1\124"+
    "\1\6\5\0\10\6\2\0\1\51\1\6\1\52\1\0"+
    "\1\6\1\125\6\6\15\0\3\6\5\0\10\6\2\0"+
    "\1\51\1\6\1\52\1\0\10\6\15\0\2\6\1\126"+
    "\5\0\10\6\2\0\1\51\1\6\1\52\1\0\10\6"+
    "\15\0\1\6\1\127\1\6\5\0\10\6\2\0\1\51"+
    "\1\6\1\52\1\0\1\130\7\6\15\0\3\6\5\0"+
    "\10\6\2\0\1\51\1\6\1\52\1\0\1\131\7\6"+
    "\15\0\3\6\5\0\10\6\3\0\1\132\2\0\10\132"+
    "\15\0\3\132\3\0\1\133\1\0\10\132\2\0\1\51"+
    "\1\6\1\52\1\0\10\6\15\0\1\6\1\134\1\6"+
    "\5\0\10\6\2\0\1\51\1\6\1\52\1\0\1\135"+
    "\7\6\15\0\3\6\5\0\10\6\2\0\1\51\1\6"+
    "\1\52\1\0\10\6\15\0\3\6\5\0\3\6\1\136"+
    "\4\6\2\0\1\51\1\6\1\52\1\0\10\6\15\0"+
    "\1\6\1\137\1\6\5\0\10\6\2\0\1\51\1\6"+
    "\1\52\1\0\1\140\7\6\15\0\3\6\5\0\10\6"+
    "\2\0\1\51\1\6\1\52\1\0\1\141\7\6\15\0"+
    "\3\6\5\0\10\6\2\0\1\51\1\6\1\52\1\0"+
    "\3\6\1\142\4\6\15\0\3\6\5\0\4\6\1\143"+
    "\3\6\2\0\1\144\1\0\1\47\50\0\1\145\1\146"+
    "\1\147\1\0\10\146\15\0\3\146\5\0\10\146\2\0"+
    "\1\150\1\151\1\152\1\0\10\151\15\0\3\151\5\0"+
    "\10\151\2\0\1\51\1\6\1\52\1\0\3\6\1\153"+
    "\4\6\15\0\3\6\5\0\10\6\2\0\1\51\1\6"+
    "\1\52\1\0\10\6\15\0\1\154\2\6\5\0\10\6"+
    "\2\0\1\51\1\6\1\52\1\0\2\6\1\155\5\6"+
    "\15\0\3\6\5\0\10\6\2\0\1\51\1\6\1\52"+
    "\1\0\3\6\1\156\4\6\15\0\3\6\5\0\4\6"+
    "\1\157\3\6\2\0\1\51\1\6\1\52\1\0\1\160"+
    "\7\6\15\0\3\6\5\0\10\6\2\0\1\51\1\6"+
    "\1\52\1\0\10\6\15\0\3\6\5\0\1\6\1\161"+
    "\6\6\2\0\1\51\1\6\1\52\1\0\7\6\1\114"+
    "\15\0\3\6\5\0\10\6\2\0\1\51\1\6\1\52"+
    "\1\0\5\6\1\162\2\6\15\0\3\6\5\0\10\6"+
    "\2\0\1\51\1\6\1\52\1\0\10\6\15\0\3\6"+
    "\5\0\1\163\7\6\2\0\1\164\1\132\1\165\1\0"+
    "\10\132\15\0\3\132\3\0\1\166\1\0\10\132\2\0"+
    "\1\51\1\6\1\52\1\0\10\6\15\0\3\6\5\0"+
    "\1\6\1\167\6\6\2\0\1\51\1\6\1\170\1\0"+
    "\10\6\15\0\3\6\5\0\10\6\2\0\1\51\1\6"+
    "\1\52\1\0\10\6\15\0\3\6\5\0\4\6\1\171"+
    "\3\6\2\0\1\51\1\6\1\52\1\0\6\6\1\172"+
    "\1\6\15\0\3\6\5\0\10\6\2\0\1\51\1\6"+
    "\1\52\1\0\3\6\1\173\4\6\15\0\3\6\5\0"+
    "\10\6\2\0\1\51\1\6\1\52\1\0\10\6\15\0"+
    "\1\174\2\6\5\0\10\6\2\0\1\51\1\6\1\52"+
    "\1\0\6\6\1\175\1\6\15\0\3\6\5\0\10\6"+
    "\2\0\1\51\1\146\1\147\1\0\10\146\15\0\3\146"+
    "\5\0\10\146\2\0\1\112\52\0\1\150\1\176\1\152"+
    "\1\0\10\176\15\0\3\176\5\0\10\176\3\0\1\113"+
    "\2\0\10\113\15\0\3\113\5\0\10\113\2\0\1\51"+
    "\1\6\1\52\1\0\1\6\1\177\6\6\15\0\3\6"+
    "\5\0\10\6\2\0\1\51\1\6\1\52\1\0\4\6"+
    "\1\200\3\6\15\0\3\6\5\0\10\6\2\0\1\51"+
    "\1\6\1\52\1\0\1\201\7\6\15\0\3\6\5\0"+
    "\10\6\2\0\1\51\1\6\1\52\1\0\1\202\7\6"+
    "\15\0\3\6\5\0\10\6\2\0\1\164\36\0\1\166"+
    "\13\0\1\203\1\204\2\0\10\204\15\0\3\204\5\0"+
    "\10\204\42\0\1\205\12\0\1\51\1\6\1\52\1\0"+
    "\3\6\1\206\4\6\15\0\3\6\5\0\10\6\2\0"+
    "\1\112\1\113\2\0\6\113\1\207\1\113\15\0\3\113"+
    "\5\0\10\113\2\0\1\51\1\6\1\52\1\0\10\6"+
    "\15\0\1\210\2\6\5\0\10\6\2\0\1\51\1\6"+
    "\1\52\1\0\3\6\1\211\4\6\15\0\3\6\5\0"+
    "\10\6\2\0\1\51\1\6\1\52\1\0\10\6\15\0"+
    "\3\6\5\0\3\6\1\212\4\6\2\0\1\51\1\6"+
    "\1\52\1\0\3\6\1\213\4\6\15\0\3\6\5\0"+
    "\10\6\3\0\1\176\2\0\10\176\15\0\3\176\5\0"+
    "\10\176\2\0\1\51\1\6\1\52\1\0\10\6\15\0"+
    "\1\214\2\6\5\0\10\6\2\0\1\51\1\6\1\52"+
    "\1\0\10\6\15\0\3\6\5\0\4\6\1\215\3\6"+
    "\2\0\1\216\1\217\1\220\1\0\10\217\15\0\3\217"+
    "\5\0\10\217\2\0\1\221\1\222\1\223\1\0\10\222"+
    "\15\0\3\222\5\0\10\222\41\0\1\166\13\0\1\51"+
    "\1\6\1\52\1\0\10\6\15\0\2\6\1\224\5\0"+
    "\10\6\2\0\1\150\1\151\1\152\1\0\10\151\15\0"+
    "\3\151\5\0\4\151\1\225\3\151\2\0\1\51\1\6"+
    "\1\52\1\0\5\6\1\226\2\6\15\0\3\6\5\0"+
    "\10\6\2\0\1\51\1\6\1\52\1\0\3\6\1\227"+
    "\4\6\15\0\3\6\5\0\10\6\2\0\1\51\1\6"+
    "\1\52\1\0\10\6\15\0\1\6\1\230\1\6\5\0"+
    "\10\6\2\0\1\216\1\217\1\220\1\0\10\217\15\0"+
    "\3\217\3\0\1\166\1\0\10\217\2\0\1\164\1\217"+
    "\1\220\1\0\10\217\15\0\3\217\3\0\1\166\1\0"+
    "\10\217\2\0\1\203\52\0\1\221\1\231\1\223\1\0"+
    "\10\231\15\0\3\231\3\0\1\166\1\0\10\231\2\0"+
    "\1\221\1\222\1\223\1\0\10\222\15\0\3\222\3\0"+
    "\1\166\1\0\10\222\3\0\1\204\2\0\10\204\15\0"+
    "\3\204\5\0\10\204\2\0\1\51\1\6\1\52\1\0"+
    "\2\6\1\232\5\6\15\0\3\6\5\0\10\6\2\0"+
    "\1\150\1\151\1\152\1\0\10\151\15\0\1\233\2\151"+
    "\5\0\10\151\2\0\1\51\1\6\1\52\1\0\10\6"+
    "\15\0\1\234\2\6\5\0\10\6\2\0\1\51\1\6"+
    "\1\52\1\0\1\6\1\235\6\6\15\0\3\6\5\0"+
    "\10\6\2\0\1\51\1\6\1\52\1\0\10\6\15\0"+
    "\1\236\2\6\5\0\10\6\3\0\1\231\2\0\10\231"+
    "\15\0\3\231\3\0\1\166\1\0\10\231\2\0\1\51"+
    "\1\6\1\52\1\0\1\6\1\237\6\6\15\0\3\6"+
    "\5\0\10\6\2\0\1\150\1\151\1\152\1\0\3\151"+
    "\1\240\4\151\15\0\3\151\5\0\10\151\2\0\1\51"+
    "\1\6\1\52\1\0\3\6\1\241\4\6\15\0\3\6"+
    "\5\0\10\6\1\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[4945];
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
    "\3\0\1\11\2\1\1\11\7\1\1\11\1\1\3\11"+
    "\1\1\3\11\4\1\1\11\7\1\2\11\1\1\2\0"+
    "\1\1\1\0\14\1\1\11\3\1\2\11\1\0\11\1"+
    "\1\11\1\0\1\1\2\0\16\1\2\0\13\1\1\0"+
    "\2\1\1\0\11\1\3\0\1\1\1\0\12\1\2\0"+
    "\2\1\1\0\6\1\6\0\5\1\1\0\10\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[161];
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

    static int errors =0;
    String Logs = "";

    String comment = "";
    String cadena = "";

    public String getLogs(){
        return this.Logs;
    }

    public void Log(String cadena){
        this.Logs += cadena + "\n" ;
    }


  /**
   * Creates a new scanner
   * There is also a java.io.InputStream version of this constructor.
   *
   * @param   in  the java.io.Reader to read input from.
   */
  LexerCup(java.io.Reader in) {
    this.zzReader = in;
  }

  /**
   * Creates a new scanner.
   * There is also java.io.Reader version of this constructor.
   *
   * @param   in  the java.io.Inputstream to read input from.
   */
  LexerCup(java.io.InputStream in) {
    this(new java.io.InputStreamReader(in));
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
   * Contains user EOF-code, which will be executed exactly once,
   * when the end of file is reached
   */
  private void zzDoEOF() throws java.io.IOException {
    if (!zzEOFDone) {
      zzEOFDone = true;
      yyclose();
    }
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public java_cup.runtime.Symbol next_token() throws java.io.IOException {
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

      yychar+= zzMarkedPosL-zzStartRead;

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
        case 22: 
          { return new Symbol(sym.in,yycolumn,yyline,yytext());
          }
        case 49: break;
        case 23: 
          { yybegin(YYINITIAL); return new Symbol (sym.string, yycolumn, yyline, yytext());
          }
        case 50: break;
        case 32: 
          { return new Symbol (sym.Boolean, yycolumn, yyline, yytext());
          }
        case 51: break;
        case 36: 
          { return new Symbol (sym.loop, yycolumn, yyline, yytext());
          }
        case 52: break;
        case 26: 
          { return new Symbol (sym.For, yycolumn, yyline, yytext());
          }
        case 53: break;
        case 13: 
          { return new Symbol (sym.CerrarBracket, yycolumn, yyline, yytext());
          }
        case 54: break;
        case 46: 
          { return new Symbol(sym.Function,yycolumn,yyline,yytext());
          }
        case 55: break;
        case 2: 
          { return new Symbol (sym.Integer, yycolumn, yyline, yytext());
          }
        case 56: break;
        case 29: 
          { return new Symbol(sym.out,yycolumn,yyline,yytext());
          }
        case 57: break;
        case 34: 
          { return new Symbol (sym.Else, yycolumn, yyline, yytext());
          }
        case 58: break;
        case 33: 
          { return new Symbol (sym.then, yycolumn, yyline, yytext());
          }
        case 59: break;
        case 10: 
          { return new Symbol (sym.CerrarParentesis, yycolumn, yyline, yytext());
          }
        case 60: break;
        case 43: 
          { return new Symbol(sym.Return,yycolumn,yyline,yytext());
          }
        case 61: break;
        case 44: 
          { return new Symbol (sym.TypeBoolean, yycolumn, yyline, yytext());
          }
        case 62: break;
        case 18: 
          { return new Symbol (sym.or, yycolumn, yyline, yytext());
          }
        case 63: break;
        case 35: 
          { return new Symbol(sym.Exit,yycolumn,yyline,yytext());
          }
        case 64: break;
        case 16: 
          { yybegin(YYINITIAL);
          }
        case 65: break;
        case 45: 
          { return new Symbol (sym.TypeInteger, yycolumn, yyline, yytext());
          }
        case 66: break;
        case 39: 
          { return new Symbol (sym.TypeFloat, yycolumn, yyline, yytext());
          }
        case 67: break;
        case 31: 
          { return new Symbol(sym.Get,yycolumn,yyline,yytext());
          }
        case 68: break;
        case 37: 
          { return new Symbol(sym.When,yycolumn,yyline,yytext());
          }
        case 69: break;
        case 25: 
          { return new Symbol (sym.end, yycolumn, yyline, yytext());
          }
        case 70: break;
        case 8: 
          { return new Symbol (sym.PuntoComa, yycolumn, yyline, yytext());
          }
        case 71: break;
        case 41: 
          { return new Symbol (sym.begin, yycolumn, yyline, yytext());
          }
        case 72: break;
        case 40: 
          { yybegin(STRING);
          }
        case 73: break;
        case 15: 
          { return new Symbol (sym.OperadorSuma, yycolumn, yyline, yytext());
          }
        case 74: break;
        case 4: 
          { return new Symbol (sym.punto, yycolumn, yyline, yytext());
          }
        case 75: break;
        case 28: 
          { return new Symbol (sym.not, yycolumn, yyline, yytext());
          }
        case 76: break;
        case 6: 
          { return new Symbol (sym.coma, yycolumn, yyline, yytext());
          }
        case 77: break;
        case 21: 
          { return new Symbol (sym.is, yycolumn, yyline, yytext());
          }
        case 78: break;
        case 14: 
          { return new Symbol (sym.OperadorMultiplicacion, yycolumn, yyline, yytext());
          }
        case 79: break;
        case 42: 
          { return new Symbol (sym.While, yycolumn, yyline, yytext());
          }
        case 80: break;
        case 3: 
          { return new Symbol (sym.Id, yycolumn, yyline, yytext());
          }
        case 81: break;
        case 9: 
          { return new Symbol (sym.AbrirParentesis, yycolumn, yyline, yytext());
          }
        case 82: break;
        case 30: 
          { return new Symbol (sym.Put, yycolumn, yyline, yytext());
          }
        case 83: break;
        case 48: 
          { return new Symbol (sym.procedure, yycolumn, yyline, yytext());
          }
        case 84: break;
        case 12: 
          { return new Symbol (sym.AbrirBracket, yycolumn, yyline, yytext());
          }
        case 85: break;
        case 24: 
          { return new Symbol (sym.Float, yycolumn, yyline, yytext());
          }
        case 86: break;
        case 7: 
          { return new Symbol (sym.DosPuntos, yycolumn, yyline, yytext());
          }
        case 87: break;
        case 17: 
          { return new Symbol (sym.asignacion, yycolumn, yyline, yytext());
          }
        case 88: break;
        case 47: 
          { return new Symbol (sym.Put_Line, yycolumn, yyline, yytext());
          }
        case 89: break;
        case 20: 
          { return new Symbol (sym.If, yycolumn, yyline, yytext());
          }
        case 90: break;
        case 38: 
          { return new Symbol (sym.elsif, yycolumn, yyline, yytext());
          }
        case 91: break;
        case 1: 
          { Log("Falla en lexico, char o variable no aceptada: " +yytext()+" Linea: "+(yyline + 1)+ ", Columna: "+(yycolumn+1));
							errors++;
          }
        case 92: break;
        case 19: 
          { yybegin(COMMENT_LINE); comment = "";
          }
        case 93: break;
        case 27: 
          { return new Symbol (sym.and, yycolumn, yyline, yytext());
          }
        case 94: break;
        case 5: 
          { 
          }
        case 95: break;
        case 11: 
          { return new Symbol (sym.OperadorRelacional, yycolumn, yyline, yytext());
          }
        case 96: break;
        default: 
          if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
            zzAtEOF = true;
            zzDoEOF();
              { return new java_cup.runtime.Symbol(sym.EOF); }
          } 
          else {
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}
