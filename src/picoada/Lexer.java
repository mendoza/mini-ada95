/* The following code was generated by JFlex 1.4.3 on 9/25/21 11:50 PM */

package picoada;

import static picoada.Tokens.*;
import java.util.LinkedList;

/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.4.3
 * on 9/25/21 11:50 PM from the specification file
 * <tt>/Users/jeancasoto/CompiladoresI/mini-ada95/src/picoada/ada.flex</tt>
 */
class Lexer {

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
  private static final String ZZ_CMAP_PACKED = 
    "\11\0\1\15\1\61\2\0\1\27\22\0\1\15\1\0\1\31\5\0"+
    "\1\21\1\22\1\40\1\41\1\16\1\42\1\4\1\33\12\1\1\17"+
    "\1\20\1\23\1\32\1\23\2\0\1\2\1\54\3\2\1\11\1\57"+
    "\1\2\1\53\2\2\1\56\3\2\1\55\3\2\1\5\6\2\1\24"+
    "\1\30\1\25\1\0\1\3\1\0\1\12\1\45\1\44\1\37\1\10"+
    "\1\50\1\46\1\52\1\47\2\2\1\13\1\2\1\34\1\35\1\43"+
    "\1\2\1\6\1\14\1\36\1\7\1\2\1\51\1\60\2\2\1\0"+
    "\1\26\uff83\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\3\0\1\1\1\2\1\3\1\4\6\3\1\5\1\6"+
    "\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\1"+
    "\1\13\1\16\3\3\1\16\2\17\11\3\1\20\1\21"+
    "\2\22\2\0\1\3\1\0\11\3\1\23\1\0\1\24"+
    "\1\3\1\25\2\3\1\26\2\3\1\27\1\30\1\31"+
    "\7\3\1\32\1\0\1\33\2\0\3\3\1\34\3\3"+
    "\1\35\1\3\2\0\1\36\1\37\4\3\1\40\4\3"+
    "\1\41\1\42\1\2\2\3\1\0\2\3\1\0\1\43"+
    "\1\3\1\44\1\3\1\45\1\3\1\46\3\0\1\47"+
    "\3\3\1\50\3\3\1\0\2\3\1\51\1\52\2\0"+
    "\1\53\1\3\1\54\1\3\1\55\2\3\1\0\1\56"+
    "\6\0\5\3\1\0\2\3\1\57\1\60\2\3\1\61"+
    "\1\62\1\63";

  private static int [] zzUnpackAction() {
    int [] result = new int[168];
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
    "\0\0\0\62\0\144\0\226\0\310\0\372\0\226\0\u012c"+
    "\0\u015e\0\u0190\0\u01c2\0\u01f4\0\u0226\0\u0258\0\226\0\u028a"+
    "\0\226\0\226\0\226\0\u02bc\0\226\0\226\0\u02ee\0\226"+
    "\0\u0320\0\u0352\0\u0384\0\u03b6\0\226\0\226\0\u03e8\0\u041a"+
    "\0\u044c\0\u047e\0\u04b0\0\u04e2\0\u0514\0\u0546\0\u0578\0\u05aa"+
    "\0\226\0\226\0\226\0\u05dc\0\u060e\0\u0640\0\u0672\0\u06a4"+
    "\0\u06d6\0\u0708\0\u073a\0\u076c\0\u079e\0\u07d0\0\u0802\0\u0834"+
    "\0\u0866\0\226\0\u0898\0\226\0\u08ca\0\372\0\u08fc\0\u092e"+
    "\0\226\0\u0960\0\u0992\0\372\0\372\0\372\0\u09c4\0\u09f6"+
    "\0\u0a28\0\u0a5a\0\u0a8c\0\u0abe\0\u0af0\0\226\0\u0b22\0\u0640"+
    "\0\u0b54\0\u0b86\0\u0bb8\0\u0bea\0\u0c1c\0\372\0\u0c4e\0\u0c80"+
    "\0\u0cb2\0\372\0\u0ce4\0\u0d16\0\u02ee\0\372\0\372\0\u0d48"+
    "\0\u0d7a\0\u0dac\0\u0dde\0\372\0\u0e10\0\u0e42\0\u0e74\0\u0ea6"+
    "\0\u0ed8\0\372\0\u0b22\0\u0b54\0\u0f0a\0\u0f3c\0\u0f6e\0\u0b86"+
    "\0\u0fa0\0\372\0\u0fd2\0\372\0\u1004\0\372\0\u1036\0\372"+
    "\0\u1068\0\u109a\0\u10cc\0\372\0\u10fe\0\u1130\0\u1162\0\372"+
    "\0\u1194\0\u11c6\0\u11f8\0\u122a\0\u125c\0\u128e\0\372\0\372"+
    "\0\u12c0\0\u12f2\0\u1324\0\u1356\0\372\0\u1388\0\372\0\u13ba"+
    "\0\u13ec\0\u141e\0\372\0\u1450\0\u1482\0\u14b4\0\u14e6\0\u1518"+
    "\0\u154a\0\u157c\0\u15ae\0\u15e0\0\u1612\0\u1644\0\u1676\0\u16a8"+
    "\0\u16da\0\372\0\372\0\u170c\0\u173e\0\372\0\u0b86\0\372";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[168];
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
    "\1\27\1\4\1\30\1\31\1\32\1\33\1\34\1\6"+
    "\1\35\1\36\1\37\1\40\1\6\1\41\1\6\1\42"+
    "\1\43\1\44\1\6\1\45\1\46\1\47\1\6\1\50"+
    "\1\6\1\16\26\51\2\52\31\51\1\52\30\53\1\54"+
    "\30\53\64\0\1\5\1\0\1\55\1\56\56\0\1\57"+
    "\1\6\1\60\1\0\10\6\17\0\4\6\3\0\16\6"+
    "\2\0\1\57\1\6\1\60\1\0\1\6\1\61\6\6"+
    "\17\0\4\6\3\0\16\6\2\0\1\57\1\6\1\60"+
    "\1\0\3\6\1\62\4\6\17\0\4\6\3\0\16\6"+
    "\2\0\1\57\1\6\1\60\1\0\6\6\1\63\1\6"+
    "\17\0\1\64\3\6\3\0\15\6\1\65\2\0\1\57"+
    "\1\6\1\60\1\0\5\6\1\66\1\67\1\6\17\0"+
    "\4\6\3\0\16\6\2\0\1\57\1\6\1\60\1\0"+
    "\10\6\17\0\1\70\3\6\3\0\16\6\2\0\1\57"+
    "\1\6\1\60\1\0\10\6\17\0\1\6\1\71\2\6"+
    "\3\0\16\6\16\0\1\16\11\0\1\16\31\0\1\16"+
    "\32\0\1\72\61\0\1\30\60\0\1\73\62\0\1\74"+
    "\30\0\1\57\1\6\1\60\1\0\10\6\17\0\1\6"+
    "\1\75\2\6\3\0\16\6\2\0\1\57\1\6\1\60"+
    "\1\0\1\6\1\76\1\77\5\6\17\0\4\6\3\0"+
    "\16\6\2\0\1\57\1\6\1\60\1\0\10\6\17\0"+
    "\4\6\3\0\7\6\1\100\6\6\43\0\1\101\20\0"+
    "\1\57\1\6\1\60\1\0\1\6\1\102\6\6\17\0"+
    "\4\6\3\0\16\6\2\0\1\57\1\6\1\60\1\0"+
    "\3\6\1\103\4\6\17\0\4\6\3\0\16\6\2\0"+
    "\1\57\1\6\1\60\1\0\7\6\1\104\17\0\1\105"+
    "\3\6\3\0\5\6\1\106\10\6\2\0\1\57\1\6"+
    "\1\60\1\0\2\6\1\107\5\6\17\0\1\6\1\110"+
    "\2\6\3\0\16\6\2\0\1\57\1\6\1\60\1\0"+
    "\10\6\17\0\4\6\3\0\7\6\1\111\6\6\2\0"+
    "\1\57\1\6\1\60\1\0\10\6\17\0\1\112\3\6"+
    "\3\0\16\6\2\0\1\57\1\6\1\60\1\0\10\6"+
    "\17\0\1\6\1\113\2\6\3\0\16\6\2\0\1\57"+
    "\1\6\1\60\1\0\2\6\1\114\5\6\17\0\4\6"+
    "\3\0\16\6\2\0\1\57\1\6\1\60\1\0\3\6"+
    "\1\115\4\6\17\0\4\6\3\0\16\6\32\0\1\116"+
    "\31\0\1\117\61\0\1\120\61\0\1\57\61\0\1\121"+
    "\1\122\2\0\10\122\17\0\4\122\3\0\16\122\2\0"+
    "\1\57\1\6\1\60\1\0\2\6\1\123\5\6\17\0"+
    "\4\6\3\0\16\6\2\0\1\57\1\6\1\60\1\0"+
    "\10\6\17\0\2\6\1\124\1\6\3\0\16\6\2\0"+
    "\1\57\1\6\1\60\1\0\7\6\1\125\17\0\4\6"+
    "\3\0\16\6\2\0\1\57\1\6\1\60\1\0\10\6"+
    "\17\0\3\6\1\126\3\0\16\6\2\0\1\57\1\6"+
    "\1\60\1\0\10\6\17\0\4\6\3\0\4\6\1\127"+
    "\11\6\2\0\1\57\1\6\1\60\1\0\6\6\1\130"+
    "\1\6\17\0\4\6\3\0\16\6\2\0\1\57\1\6"+
    "\1\60\1\0\10\6\17\0\1\6\1\131\2\6\3\0"+
    "\16\6\2\0\1\57\1\6\1\60\1\0\10\6\17\0"+
    "\3\6\1\132\3\0\16\6\2\0\1\57\1\6\1\60"+
    "\1\0\10\6\17\0\1\6\1\133\2\6\3\0\16\6"+
    "\3\0\1\134\2\0\10\134\13\0\1\135\3\0\4\134"+
    "\3\0\16\134\2\0\1\57\1\6\1\60\1\0\10\6"+
    "\17\0\2\6\1\136\1\6\3\0\16\6\2\0\1\57"+
    "\1\6\1\60\1\0\10\6\17\0\2\6\1\137\1\6"+
    "\3\0\16\6\2\0\1\57\1\6\1\60\1\0\3\6"+
    "\1\140\4\6\17\0\4\6\3\0\16\6\2\0\1\57"+
    "\1\6\1\60\1\0\10\6\17\0\1\6\1\141\2\6"+
    "\3\0\16\6\2\0\1\57\1\6\1\60\1\0\10\6"+
    "\17\0\4\6\3\0\3\6\1\142\12\6\2\0\1\57"+
    "\1\6\1\60\1\0\10\6\17\0\1\143\3\6\3\0"+
    "\16\6\2\0\1\57\1\6\1\60\1\0\1\6\1\144"+
    "\6\6\17\0\4\6\3\0\16\6\2\0\1\57\1\6"+
    "\1\60\1\0\3\6\1\145\4\6\17\0\4\6\3\0"+
    "\4\6\1\146\11\6\2\0\1\57\1\6\1\60\1\0"+
    "\10\6\17\0\2\6\1\147\1\6\3\0\16\6\2\0"+
    "\1\57\1\6\1\60\1\0\10\6\17\0\1\6\1\150"+
    "\2\6\3\0\16\6\2\0\1\57\1\6\1\60\1\0"+
    "\10\6\17\0\2\6\1\151\1\6\3\0\16\6\2\0"+
    "\1\57\1\6\1\60\1\0\10\6\17\0\2\6\1\152"+
    "\1\6\3\0\16\6\2\0\1\153\1\0\1\55\57\0"+
    "\1\154\1\155\1\156\1\0\10\155\17\0\4\155\3\0"+
    "\16\155\2\0\1\157\1\160\1\161\1\0\10\160\17\0"+
    "\4\160\3\0\16\160\2\0\1\57\1\6\1\60\1\0"+
    "\3\6\1\162\4\6\17\0\4\6\3\0\16\6\2\0"+
    "\1\57\1\6\1\60\1\0\2\6\1\163\5\6\17\0"+
    "\4\6\3\0\16\6\2\0\1\57\1\6\1\60\1\0"+
    "\3\6\1\164\4\6\17\0\4\6\3\0\4\6\1\165"+
    "\11\6\2\0\1\57\1\6\1\60\1\0\10\6\17\0"+
    "\2\6\1\166\1\6\3\0\16\6\2\0\1\57\1\6"+
    "\1\60\1\0\7\6\1\123\17\0\4\6\3\0\16\6"+
    "\2\0\1\57\1\6\1\60\1\0\5\6\1\167\2\6"+
    "\17\0\4\6\3\0\16\6\2\0\1\57\1\6\1\60"+
    "\1\0\10\6\17\0\4\6\3\0\1\170\15\6\2\0"+
    "\1\171\1\134\1\172\1\0\10\134\13\0\1\173\3\0"+
    "\4\134\3\0\16\134\2\0\1\57\1\6\1\60\1\0"+
    "\10\6\17\0\1\174\3\6\3\0\16\6\2\0\1\57"+
    "\1\6\1\60\1\0\10\6\17\0\4\6\3\0\1\6"+
    "\1\175\14\6\2\0\1\57\1\6\1\60\1\0\10\6"+
    "\17\0\4\6\3\0\4\6\1\176\11\6\2\0\1\57"+
    "\1\6\1\60\1\0\10\6\17\0\4\6\3\0\1\6"+
    "\1\177\14\6\2\0\1\57\1\6\1\60\1\0\10\6"+
    "\17\0\1\200\3\6\3\0\16\6\2\0\1\57\1\6"+
    "\1\60\1\0\6\6\1\201\1\6\17\0\4\6\3\0"+
    "\16\6\2\0\1\57\1\6\1\60\1\0\3\6\1\202"+
    "\4\6\17\0\4\6\3\0\16\6\2\0\1\57\1\6"+
    "\1\60\1\0\6\6\1\203\1\6\17\0\4\6\3\0"+
    "\16\6\2\0\1\57\1\6\1\204\1\0\10\6\17\0"+
    "\4\6\3\0\16\6\2\0\1\57\1\155\1\156\1\0"+
    "\10\155\17\0\4\155\3\0\16\155\2\0\1\121\61\0"+
    "\1\157\1\205\1\161\1\0\10\205\17\0\4\205\3\0"+
    "\16\205\3\0\1\122\2\0\10\122\17\0\4\122\3\0"+
    "\16\122\2\0\1\57\1\6\1\60\1\0\1\6\1\206"+
    "\6\6\17\0\4\6\3\0\16\6\2\0\1\57\1\6"+
    "\1\60\1\0\10\6\17\0\4\6\3\0\5\6\1\207"+
    "\10\6\2\0\1\57\1\6\1\60\1\0\10\6\17\0"+
    "\2\6\1\210\1\6\3\0\16\6\2\0\1\171\26\0"+
    "\1\173\32\0\1\211\1\212\2\0\10\212\17\0\4\212"+
    "\3\0\16\212\32\0\1\213\31\0\1\57\1\6\1\60"+
    "\1\0\3\6\1\214\4\6\17\0\4\6\3\0\16\6"+
    "\2\0\1\57\1\6\1\60\1\0\10\6\17\0\1\215"+
    "\3\6\3\0\16\6\2\0\1\57\1\6\1\60\1\0"+
    "\10\6\17\0\2\6\1\216\1\6\3\0\16\6\2\0"+
    "\1\57\1\6\1\60\1\0\3\6\1\217\4\6\17\0"+
    "\4\6\3\0\16\6\2\0\1\57\1\6\1\60\1\0"+
    "\10\6\17\0\4\6\3\0\3\6\1\220\12\6\2\0"+
    "\1\57\1\6\1\60\1\0\3\6\1\221\4\6\17\0"+
    "\4\6\3\0\16\6\2\0\1\121\1\122\2\0\10\122"+
    "\17\0\4\122\3\0\13\122\1\222\2\122\3\0\1\205"+
    "\2\0\10\205\17\0\4\205\3\0\16\205\2\0\1\57"+
    "\1\6\1\60\1\0\10\6\17\0\1\223\3\6\3\0"+
    "\16\6\2\0\1\224\1\225\1\226\1\0\10\225\17\0"+
    "\4\225\3\0\16\225\2\0\1\227\1\230\1\231\1\0"+
    "\10\230\17\0\4\230\3\0\16\230\31\0\1\173\32\0"+
    "\1\57\1\6\1\60\1\0\10\6\17\0\3\6\1\232"+
    "\3\0\16\6\2\0\1\57\1\6\1\60\1\0\10\6"+
    "\17\0\4\6\3\0\4\6\1\233\11\6\2\0\1\57"+
    "\1\6\1\60\1\0\3\6\1\234\4\6\17\0\4\6"+
    "\3\0\16\6\2\0\1\57\1\6\1\60\1\0\5\6"+
    "\1\235\2\6\17\0\4\6\3\0\16\6\2\0\1\157"+
    "\1\160\1\161\1\0\10\160\17\0\4\160\3\0\4\160"+
    "\1\236\11\160\2\0\1\224\1\225\1\226\1\0\10\225"+
    "\13\0\1\173\3\0\4\225\3\0\16\225\2\0\1\171"+
    "\1\225\1\226\1\0\10\225\13\0\1\173\3\0\4\225"+
    "\3\0\16\225\2\0\1\211\61\0\1\227\1\237\1\231"+
    "\1\0\10\237\13\0\1\173\3\0\4\237\3\0\16\237"+
    "\2\0\1\227\1\230\1\231\1\0\10\230\13\0\1\173"+
    "\3\0\4\230\3\0\16\230\3\0\1\212\2\0\10\212"+
    "\17\0\4\212\3\0\16\212\2\0\1\57\1\6\1\60"+
    "\1\0\2\6\1\240\5\6\17\0\4\6\3\0\16\6"+
    "\2\0\1\57\1\6\1\60\1\0\10\6\17\0\1\6"+
    "\1\241\2\6\3\0\16\6\2\0\1\57\1\6\1\60"+
    "\1\0\1\6\1\242\6\6\17\0\4\6\3\0\16\6"+
    "\2\0\1\57\1\6\1\60\1\0\10\6\17\0\1\243"+
    "\3\6\3\0\16\6\2\0\1\157\1\160\1\161\1\0"+
    "\10\160\17\0\1\244\3\160\3\0\16\160\3\0\1\237"+
    "\2\0\10\237\13\0\1\173\3\0\4\237\3\0\16\237"+
    "\2\0\1\57\1\6\1\60\1\0\1\6\1\245\6\6"+
    "\17\0\4\6\3\0\16\6\2\0\1\57\1\6\1\60"+
    "\1\0\10\6\17\0\1\246\3\6\3\0\16\6\2\0"+
    "\1\157\1\160\1\161\1\0\3\160\1\247\4\160\17\0"+
    "\4\160\3\0\16\160\2\0\1\57\1\6\1\60\1\0"+
    "\3\6\1\250\4\6\17\0\4\6\3\0\16\6\1\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[6000];
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
    "\1\1\2\11\1\1\1\11\4\1\2\11\12\1\3\11"+
    "\1\1\2\0\1\1\1\0\11\1\1\11\1\0\1\11"+
    "\4\1\1\11\14\1\1\11\1\0\1\1\2\0\11\1"+
    "\2\0\20\1\1\0\2\1\1\0\7\1\3\0\10\1"+
    "\1\0\4\1\2\0\7\1\1\0\1\1\6\0\5\1"+
    "\1\0\11\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[168];
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

    String comment = "";
    String cadena = "";

    public String lexema;
    /* Lista con errores lexicos */
    public static LinkedList<String> ErroresLexicos=new LinkedList<String>();
    int errores = 0;


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
    while (i < 144) {
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
        case 51: 
          { lexema = yytext(); return procedure;
          }
        case 52: break;
        case 38: 
          { lexema = yytext(); return loop;
          }
        case 53: break;
        case 20: 
          { lexema = yytext(); return diff;
          }
        case 54: break;
        case 18: 
          { cadena = cadena + yytext();
          }
        case 55: break;
        case 1: 
          { lexema = yytext(); return ERROR;
          }
        case 56: break;
        case 27: 
          { lexema = yytext(); return Float;
          }
        case 57: break;
        case 28: 
          { lexema = yytext(); return end;
          }
        case 58: break;
        case 16: 
          { ; comment = comment + yytext();
          }
        case 59: break;
        case 8: 
          { lexema = yytext(); return PuntoComa;
          }
        case 60: break;
        case 45: 
          { lexema = yytext(); return While;
          }
        case 61: break;
        case 10: 
          { lexema = yytext(); return CerrarParentesis;
          }
        case 62: break;
        case 14: 
          { lexema = yytext(); return OperadorMultiplicacion;
          }
        case 63: break;
        case 25: 
          { lexema = yytext(); return If;
          }
        case 64: break;
        case 31: 
          { lexema = yytext(); return out;
          }
        case 65: break;
        case 23: 
          { lexema = yytext(); return is;
          }
        case 66: break;
        case 11: 
          { lexema = yytext(); return OperadorRelacional;
          }
        case 67: break;
        case 17: 
          { yybegin(YYINITIAL); lexema = comment; comment =""; return comentario;
          }
        case 68: break;
        case 44: 
          { lexema = yytext(); return begin;
          }
        case 69: break;
        case 12: 
          { lexema = yytext(); return AbrirBracket;
          }
        case 70: break;
        case 48: 
          { lexema = yytext(); return TypeBoolean;
          }
        case 71: break;
        case 13: 
          { lexema = yytext(); return CerrarBracket;
          }
        case 72: break;
        case 26: 
          { yybegin(YYINITIAL); lexema = cadena; cadena = ""; return string;
          }
        case 73: break;
        case 47: 
          { lexema = yytext(); return TypeInteger;
          }
        case 74: break;
        case 4: 
          { lexema = yytext(); return punto;
          }
        case 75: break;
        case 41: 
          { lexema = yytext(); return elsif;
          }
        case 76: break;
        case 33: 
          { lexema = yytext(); return Put;
          }
        case 77: break;
        case 36: 
          { lexema = yytext(); return Else;
          }
        case 78: break;
        case 9: 
          { lexema = yytext(); return AbrirParentesis;
          }
        case 79: break;
        case 29: 
          { lexema = yytext(); return and;
          }
        case 80: break;
        case 30: 
          { lexema = yytext(); return not;
          }
        case 81: break;
        case 35: 
          { lexema = yytext(); return Boolean;
          }
        case 82: break;
        case 49: 
          { lexema = yytext(); return Function;
          }
        case 83: break;
        case 6: 
          { lexema = yytext(); return coma;
          }
        case 84: break;
        case 43: 
          { yybegin(STRING);
          }
        case 85: break;
        case 2: 
          { lexema = yytext(); return Integer;
          }
        case 86: break;
        case 46: 
          { lexema = yytext(); return Return;
          }
        case 87: break;
        case 42: 
          { lexema = yytext(); return TypeFloat;
          }
        case 88: break;
        case 40: 
          { lexema = yytext(); return When;
          }
        case 89: break;
        case 34: 
          { lexema = yytext(); return Get;
          }
        case 90: break;
        case 39: 
          { lexema = yytext(); return then;
          }
        case 91: break;
        case 37: 
          { lexema = yytext(); return Exit;
          }
        case 92: break;
        case 7: 
          { lexema = yytext(); return DosPuntos;
          }
        case 93: break;
        case 50: 
          { lexema = yytext(); return Put_Line;
          }
        case 94: break;
        case 32: 
          { lexema = yytext(); return For;
          }
        case 95: break;
        case 15: 
          { lexema = yytext(); return OperadorSuma;
          }
        case 96: break;
        case 22: 
          { yybegin(COMMENT_LINE);
          }
        case 97: break;
        case 3: 
          { lexema = yytext(); return Id;
          }
        case 98: break;
        case 21: 
          { lexema = yytext(); return or;
          }
        case 99: break;
        case 24: 
          { lexema = yytext(); return in;
          }
        case 100: break;
        case 19: 
          { lexema = yytext(); return asignacion;
          }
        case 101: break;
        case 5: 
          { 
          }
        case 102: break;
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
