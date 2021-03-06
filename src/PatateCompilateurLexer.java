/* The following code was generated by JFlex 1.4.2 on 17/11/15 17:19 */

import java_cup.runtime.*;
import java.util.Stack;

/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.4.2
 * on 17/11/15 17:19 from the specification file
 * <tt>/home/aamulumi/Documents/S7/Compilation/Compilation_M1/lexer/patateCompilateur.jflex</tt>
 */
class PatateCompilateurLexer implements java_cup.runtime.Scanner {

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
    "\11\0\1\0\1\63\2\0\1\0\22\0\1\34\1\21\3\0\1\23"+
    "\1\17\1\33\1\6\1\7\1\11\1\10\1\13\1\16\1\5\1\22"+
    "\1\3\11\4\1\35\1\12\1\24\1\26\1\25\2\0\32\1\1\31"+
    "\1\0\1\32\1\27\1\2\1\0\1\46\1\57\1\44\1\55\1\41"+
    "\1\47\1\42\1\45\1\36\1\1\1\60\1\50\1\1\1\37\1\51"+
    "\1\54\1\1\1\43\1\52\1\40\1\56\1\62\1\61\1\1\1\53"+
    "\1\1\1\14\1\30\1\15\1\20\uff81\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\1\2\2\3\1\4\1\5\1\6\1\7"+
    "\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\17"+
    "\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\27"+
    "\1\30\1\31\1\32\1\1\1\33\14\2\1\34\1\35"+
    "\1\36\1\37\1\40\1\41\1\42\1\43\1\44\1\45"+
    "\1\0\1\1\1\46\1\47\1\50\1\51\1\52\1\53"+
    "\1\54\1\55\1\56\1\0\1\57\1\60\22\2\1\0"+
    "\1\61\27\2\1\0\1\2\1\62\1\63\1\64\1\65"+
    "\14\2\1\66\6\2\1\1\4\2\1\67\1\70\1\71"+
    "\2\2\1\0\6\2\1\72\1\2\1\73\1\2\1\74"+
    "\1\75\3\2\1\0\1\76\1\2\1\77\2\2\1\100"+
    "\1\2\1\101\1\2\1\102\1\2\1\103\1\2\1\104"+
    "\1\2\1\105\1\2\1\106\2\2\1\107\1\110\1\111";

  private static int [] zzUnpackAction() {
    int [] result = new int[184];
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
    "\0\0\0\64\0\150\0\64\0\234\0\64\0\64\0\64"+
    "\0\320\0\u0104\0\64\0\64\0\64\0\64\0\u0138\0\u016c"+
    "\0\64\0\u01a0\0\u01d4\0\u0208\0\u023c\0\u0270\0\u02a4\0\u02d8"+
    "\0\u030c\0\64\0\64\0\64\0\u0340\0\64\0\u0374\0\u03a8"+
    "\0\u03dc\0\u0410\0\u0444\0\u0478\0\u04ac\0\u04e0\0\u0514\0\u0548"+
    "\0\u057c\0\u05b0\0\u05e4\0\64\0\64\0\64\0\64\0\64"+
    "\0\64\0\64\0\64\0\64\0\u0618\0\u064c\0\64\0\64"+
    "\0\64\0\64\0\64\0\64\0\64\0\64\0\64\0\u0680"+
    "\0\u06b4\0\150\0\u06e8\0\u071c\0\u0750\0\u0784\0\u07b8\0\u07ec"+
    "\0\u0820\0\u0854\0\u0888\0\u08bc\0\u08f0\0\u0924\0\u0958\0\u098c"+
    "\0\u09c0\0\u09f4\0\u0a28\0\u0a5c\0\u0a90\0\64\0\u0ac4\0\u0af8"+
    "\0\u0b2c\0\u0b60\0\u0b94\0\u0bc8\0\u0bfc\0\u0c30\0\u0c64\0\u0c98"+
    "\0\u0ccc\0\u0d00\0\u0d34\0\u0d68\0\u0d9c\0\u0dd0\0\u0e04\0\u0e38"+
    "\0\u0e6c\0\u0ea0\0\u0ed4\0\u0f08\0\u0f3c\0\u0f70\0\u0fa4\0\150"+
    "\0\150\0\150\0\150\0\u0fd8\0\u100c\0\u1040\0\u1074\0\u10a8"+
    "\0\u10dc\0\u1110\0\u1144\0\u1178\0\u11ac\0\u11e0\0\u1214\0\150"+
    "\0\u1248\0\u127c\0\u12b0\0\u12e4\0\u1318\0\u134c\0\u0618\0\u1380"+
    "\0\u13b4\0\u13e8\0\u141c\0\150\0\150\0\150\0\u1450\0\u1484"+
    "\0\u14b8\0\u14ec\0\u1520\0\u1554\0\u1588\0\u15bc\0\u15f0\0\150"+
    "\0\u1624\0\150\0\u1658\0\150\0\150\0\u168c\0\u16c0\0\u16f4"+
    "\0\u1728\0\150\0\u175c\0\150\0\u1790\0\u17c4\0\150\0\u17f8"+
    "\0\150\0\u182c\0\150\0\u1860\0\64\0\u1894\0\150\0\u18c8"+
    "\0\150\0\u18fc\0\150\0\u1930\0\u1964\0\150\0\150\0\150";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[184];
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
    "\1\2\1\3\1\2\1\4\1\5\1\6\1\7\1\10"+
    "\1\11\1\12\1\13\1\14\1\15\1\16\1\17\1\20"+
    "\1\21\1\22\1\23\1\24\1\25\1\26\1\27\1\30"+
    "\1\31\1\32\1\33\1\34\1\35\1\36\1\37\1\40"+
    "\1\41\1\42\1\3\1\43\1\44\2\3\1\45\1\46"+
    "\1\3\1\47\1\3\1\50\2\3\1\51\1\3\1\52"+
    "\1\3\1\2\65\0\4\3\31\0\25\3\4\0\2\5"+
    "\1\53\66\0\1\54\15\0\1\55\63\0\1\56\53\0"+
    "\1\57\6\0\1\60\1\61\54\0\1\62\6\0\1\63"+
    "\63\0\1\64\46\0\1\65\10\0\1\66\3\0\1\67"+
    "\63\0\1\70\61\0\1\71\1\0\1\72\62\0\1\73"+
    "\1\74\63\0\1\75\63\0\1\76\65\0\1\77\55\0"+
    "\1\100\42\0\4\3\31\0\1\3\1\101\7\3\1\102"+
    "\13\3\2\0\4\3\31\0\20\3\1\103\4\3\2\0"+
    "\4\3\31\0\5\3\1\104\7\3\1\105\7\3\2\0"+
    "\4\3\31\0\12\3\1\106\12\3\2\0\4\3\31\0"+
    "\3\3\1\107\21\3\2\0\4\3\31\0\7\3\1\110"+
    "\2\3\1\111\12\3\2\0\4\3\31\0\10\3\1\112"+
    "\1\3\1\113\1\114\4\3\1\115\4\3\2\0\4\3"+
    "\31\0\1\116\24\3\2\0\4\3\31\0\2\3\1\117"+
    "\22\3\2\0\4\3\31\0\5\3\1\120\12\3\1\121"+
    "\4\3\2\0\4\3\31\0\5\3\1\122\5\3\1\123"+
    "\11\3\2\0\4\3\31\0\7\3\1\124\15\3\4\0"+
    "\2\53\57\0\11\65\1\125\52\65\63\66\23\0\1\126"+
    "\42\0\4\3\31\0\2\3\1\127\22\3\2\0\4\3"+
    "\31\0\12\3\1\130\12\3\2\0\4\3\31\0\20\3"+
    "\1\131\4\3\2\0\4\3\31\0\16\3\1\132\6\3"+
    "\2\0\4\3\31\0\14\3\1\133\10\3\2\0\4\3"+
    "\31\0\2\3\1\134\13\3\1\135\6\3\2\0\4\3"+
    "\31\0\10\3\1\136\14\3\2\0\4\3\31\0\10\3"+
    "\1\137\14\3\2\0\4\3\31\0\12\3\1\140\12\3"+
    "\2\0\4\3\31\0\13\3\1\141\11\3\2\0\4\3"+
    "\31\0\5\3\1\142\17\3\2\0\4\3\31\0\1\3"+
    "\1\143\23\3\2\0\4\3\31\0\14\3\1\144\10\3"+
    "\2\0\4\3\31\0\5\3\1\145\2\3\1\146\2\3"+
    "\1\147\11\3\2\0\4\3\31\0\1\150\12\3\1\151"+
    "\11\3\2\0\4\3\31\0\21\3\1\152\3\3\2\0"+
    "\4\3\31\0\3\3\1\153\21\3\2\0\4\3\31\0"+
    "\13\3\1\154\11\3\2\0\4\3\31\0\1\155\24\3"+
    "\1\0\11\65\1\156\10\65\1\2\41\65\1\0\4\3"+
    "\31\0\3\3\1\157\21\3\2\0\4\3\31\0\12\3"+
    "\1\160\12\3\2\0\4\3\31\0\3\3\1\161\21\3"+
    "\2\0\4\3\31\0\3\3\1\162\21\3\2\0\4\3"+
    "\31\0\3\3\1\163\21\3\2\0\4\3\31\0\20\3"+
    "\1\164\4\3\2\0\4\3\31\0\3\3\1\165\21\3"+
    "\2\0\4\3\31\0\5\3\1\166\17\3\2\0\4\3"+
    "\31\0\14\3\1\167\10\3\2\0\4\3\31\0\14\3"+
    "\1\170\10\3\2\0\4\3\31\0\10\3\1\171\14\3"+
    "\2\0\4\3\31\0\3\3\1\172\21\3\2\0\4\3"+
    "\31\0\6\3\1\173\16\3\2\0\4\3\31\0\2\3"+
    "\1\174\22\3\2\0\4\3\31\0\1\175\17\3\1\176"+
    "\4\3\2\0\4\3\31\0\2\3\1\177\22\3\2\0"+
    "\4\3\31\0\16\3\1\200\6\3\2\0\4\3\31\0"+
    "\24\3\1\201\2\0\4\3\31\0\6\3\1\202\16\3"+
    "\2\0\4\3\31\0\12\3\1\203\12\3\2\0\4\3"+
    "\31\0\10\3\1\204\14\3\2\0\4\3\31\0\12\3"+
    "\1\205\12\3\2\0\4\3\31\0\12\3\1\206\12\3"+
    "\1\0\11\65\1\156\10\65\1\207\41\65\1\0\4\3"+
    "\31\0\4\3\1\210\20\3\2\0\4\3\31\0\5\3"+
    "\1\211\17\3\2\0\4\3\31\0\10\3\1\212\14\3"+
    "\2\0\4\3\31\0\10\3\1\213\14\3\2\0\4\3"+
    "\31\0\14\3\1\214\10\3\2\0\4\3\31\0\3\3"+
    "\1\215\21\3\2\0\4\3\31\0\2\3\1\216\22\3"+
    "\2\0\4\3\31\0\10\3\1\217\14\3\2\0\4\3"+
    "\31\0\2\3\1\220\22\3\2\0\4\3\27\0\1\221"+
    "\1\0\25\3\2\0\4\3\31\0\1\3\1\222\23\3"+
    "\2\0\4\3\31\0\6\3\1\223\16\3\2\0\4\3"+
    "\31\0\1\224\24\3\2\0\4\3\31\0\10\3\1\225"+
    "\14\3\2\0\4\3\31\0\3\3\1\226\21\3\2\0"+
    "\4\3\31\0\1\227\24\3\2\0\4\3\31\0\22\3"+
    "\1\230\2\3\2\0\4\3\31\0\3\3\1\231\21\3"+
    "\2\0\4\3\31\0\3\3\1\232\21\3\2\0\4\3"+
    "\31\0\3\3\1\233\21\3\2\0\4\3\31\0\1\3"+
    "\1\234\23\3\2\0\4\3\31\0\2\3\1\235\22\3"+
    "\2\0\4\3\31\0\6\3\1\236\16\3\2\0\4\3"+
    "\31\0\6\3\1\237\16\3\2\0\4\3\31\0\1\240"+
    "\24\3\52\0\1\241\13\0\4\3\31\0\4\3\1\242"+
    "\20\3\2\0\4\3\31\0\2\3\1\243\22\3\2\0"+
    "\4\3\31\0\6\3\1\244\16\3\2\0\4\3\31\0"+
    "\2\3\1\245\22\3\2\0\4\3\31\0\17\3\1\246"+
    "\5\3\2\0\4\3\31\0\6\3\1\247\16\3\2\0"+
    "\4\3\31\0\10\3\1\250\14\3\2\0\4\3\31\0"+
    "\5\3\1\251\17\3\2\0\4\3\31\0\2\3\1\252"+
    "\22\3\2\0\4\3\31\0\7\3\1\253\15\3\2\0"+
    "\4\3\31\0\13\3\1\254\11\3\50\0\1\255\15\0"+
    "\4\3\31\0\20\3\1\256\4\3\2\0\4\3\31\0"+
    "\3\3\1\257\21\3\2\0\4\3\31\0\20\3\1\260"+
    "\4\3\2\0\4\3\31\0\1\3\1\261\23\3\2\0"+
    "\4\3\31\0\3\3\1\262\21\3\2\0\4\3\31\0"+
    "\1\3\1\263\23\3\2\0\4\3\31\0\5\3\1\264"+
    "\17\3\2\0\4\3\31\0\5\3\1\265\17\3\2\0"+
    "\4\3\31\0\5\3\1\266\17\3\2\0\4\3\31\0"+
    "\3\3\1\267\21\3\2\0\4\3\31\0\3\3\1\270"+
    "\21\3\1\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[6552];
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
    "\1\0\1\11\1\1\1\11\1\1\3\11\2\1\4\11"+
    "\2\1\1\11\10\1\3\11\1\1\1\11\15\1\11\11"+
    "\1\0\1\1\11\11\1\0\24\1\1\0\1\11\27\1"+
    "\1\0\42\1\1\0\17\1\1\0\13\1\1\11\13\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[184];
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
/* On ajoute 1 à la ligne et la colonne car un éditeur de texte commence
  à la ligne 1 et la colonne 1, tandis que le lexeur commence à 0:0.
  */
private Symbol symbol (int type) {
        return new Symbol (type, yyline+1, yycolumn+1);
}

private Symbol symbol (int type, Object value) {
        return new Symbol (type, yyline+1, yycolumn+1, value);
}

public class Pile{

  Stack<Character> s = new Stack<Character>();

  public Pile(){

  }

  public boolean isOpeningSymbol(char c)
  {
    return c == '(' || c == '{' || c == '[';
  }

  public boolean isClosingSymbol(char c)
  {
    return c == ')' || c == '}' || c == ']';
  }

  public void checkMismatch(char c)
  {
    if (isOpeningSymbol(c))
      s.push(c);

    else if (isClosingSymbol(c))
    {
      try
      {
        if ((c == ')' && s.peek() == '(') ||
            (c == '}' && s.peek() == '{') ||
            (c == ']' && s.peek() == '['))
        {
          s.pop();
        }
        else throw new RuntimeException();
      }catch(RuntimeException e)
      {
        System.out.println("Erreur " + c + yyline + yycolumn);
      }
    }
  }
}

Pile p = new Pile();


  /**
   * Creates a new scanner
   * There is also a java.io.InputStream version of this constructor.
   *
   * @param   in  the java.io.Reader to read input from.
   */
  PatateCompilateurLexer(java.io.Reader in) {
    this.zzReader = in;
  }

  /**
   * Creates a new scanner.
   * There is also java.io.Reader version of this constructor.
   *
   * @param   in  the java.io.Inputstream to read input from.
   */
  PatateCompilateurLexer(java.io.InputStream in) {
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
    while (i < 132) {
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
        case 17: 
          { return symbol(PatateCompilateurSymbol.DIV);
          }
        case 74: break;
        case 48: 
          { return symbol(PatateCompilateurSymbol.IF);
          }
        case 75: break;
        case 58: 
          { return symbol(PatateCompilateurSymbol.BREAK);
          }
        case 76: break;
        case 18: 
          { return symbol(PatateCompilateurSymbol.MOD);
          }
        case 77: break;
        case 56: 
          { return symbol(PatateCompilateurSymbol.FALSE);
          }
        case 78: break;
        case 46: 
          { return symbol(PatateCompilateurSymbol.OR_OP);
          }
        case 79: break;
        case 62: 
          { return symbol(PatateCompilateurSymbol.STRING);
          }
        case 80: break;
        case 70: 
          { return symbol(PatateCompilateurSymbol.FUNCTION);
          }
        case 81: break;
        case 37: 
          { return symbol(PatateCompilateurSymbol.NE_OP);
          }
        case 82: break;
        case 35: 
          { return symbol(PatateCompilateurSymbol.AND_OP);
          }
        case 83: break;
        case 16: 
          { return symbol(PatateCompilateurSymbol.NE);
          }
        case 84: break;
        case 53: 
          { return symbol(PatateCompilateurSymbol.ELSE);
          }
        case 85: break;
        case 60: 
          { return symbol(PatateCompilateurSymbol.RETURN);
          }
        case 86: break;
        case 72: 
          { return symbol(PatateCompilateurSymbol.STRUCTURE);
          }
        case 87: break;
        case 65: 
          { return symbol(PatateCompilateurSymbol.INT);
          }
        case 88: break;
        case 14: 
          { return symbol(PatateCompilateurSymbol.AND);
          }
        case 89: break;
        case 57: 
          { return symbol(PatateCompilateurSymbol.FLOAT);
          }
        case 90: break;
        case 13: 
          { return symbol(PatateCompilateurSymbol.MINUS);
          }
        case 91: break;
        case 54: 
          { return symbol(PatateCompilateurSymbol.STOP);
          }
        case 92: break;
        case 31: 
          { return symbol(PatateCompilateurSymbol.MUL_ASSIGN);
          }
        case 93: break;
        case 6: 
          { p.checkMismatch(yytext().charAt(0));
          return symbol(PatateCompilateurSymbol.RPAR);
          }
        case 94: break;
        case 63: 
          { return symbol(PatateCompilateurSymbol.STATIC);
          }
        case 95: break;
        case 51: 
          { return symbol(PatateCompilateurSymbol.TRUE);
          }
        case 96: break;
        case 20: 
          { return symbol(PatateCompilateurSymbol.RIGHT);
          }
        case 97: break;
        case 34: 
          { return symbol(PatateCompilateurSymbol.SUB_ASSIGN);
          }
        case 98: break;
        case 5: 
          { p.checkMismatch(yytext().charAt(0));
          return symbol(PatateCompilateurSymbol.LPAR);
          }
        case 99: break;
        case 27: 
          { return symbol(PatateCompilateurSymbol.COLON);
          }
        case 100: break;
        case 73: 
          { return symbol(PatateCompilateurSymbol.PROCEDURE);
          }
        case 101: break;
        case 50: 
          { return symbol(PatateCompilateurSymbol.NULL);
          }
        case 102: break;
        case 15: 
          { return symbol(PatateCompilateurSymbol.TILDE);
          }
        case 103: break;
        case 30: 
          { return symbol(PatateCompilateurSymbol.ADD_ASSIGN);
          }
        case 104: break;
        case 43: 
          { return symbol(PatateCompilateurSymbol.GE_OP);
          }
        case 105: break;
        case 7: 
          { return symbol(PatateCompilateurSymbol.PLUS);
          }
        case 106: break;
        case 71: 
          { return symbol(PatateCompilateurSymbol.CHARACTER);
          }
        case 107: break;
        case 36: 
          { return symbol(PatateCompilateurSymbol.AND_ASSIGN);
          }
        case 108: break;
        case 64: 
          { return symbol(PatateCompilateurSymbol.PUBLIC);
          }
        case 109: break;
        case 4: 
          { return symbol(PatateCompilateurSymbol.POINT);
          }
        case 110: break;
        case 59: 
          { return symbol(PatateCompilateurSymbol.WHILE);
          }
        case 111: break;
        case 22: 
          { return symbol(PatateCompilateurSymbol.XOR);
          }
        case 112: break;
        case 42: 
          { return symbol(PatateCompilateurSymbol.RIGHT_OP);
          }
        case 113: break;
        case 41: 
          { return symbol(PatateCompilateurSymbol.LE_OP);
          }
        case 114: break;
        case 10: 
          { return symbol(PatateCompilateurSymbol.COMMA);
          }
        case 115: break;
        case 21: 
          { return symbol(PatateCompilateurSymbol.EQ);
          }
        case 116: break;
        case 69: 
          { return symbol(PatateCompilateurSymbol.BOOLEAN);
          }
        case 117: break;
        case 26: 
          { return symbol(PatateCompilateurSymbol.SINGLEQUOTE);
          }
        case 118: break;
        case 49: 
          { return symbol(PatateCompilateurSymbol.QUOTE);
          }
        case 119: break;
        case 3: 
          { return symbol(PatateCompilateurSymbol.NB, Integer.parseInt(yytext()));
          }
        case 120: break;
        case 38: 
          { return symbol(PatateCompilateurSymbol.DIV_ASSIGN);
          }
        case 121: break;
        case 44: 
          { return symbol(PatateCompilateurSymbol.EQ_OP);
          }
        case 122: break;
        case 12: 
          { p.checkMismatch(yytext().charAt(0));
          return symbol(PatateCompilateurSymbol.RACC);
          }
        case 123: break;
        case 28: 
          { return symbol(PatateCompilateurSymbol.NBV, Double.parseDouble(yytext()));
          }
        case 124: break;
        case 19: 
          { return symbol(PatateCompilateurSymbol.LEFT);
          }
        case 125: break;
        case 39: 
          { return symbol(PatateCompilateurSymbol.MOD_ASSIGN);
          }
        case 126: break;
        case 11: 
          { p.checkMismatch(yytext().charAt(0));
          return symbol(PatateCompilateurSymbol.LACC);
          }
        case 127: break;
        case 68: 
          { return symbol(PatateCompilateurSymbol.PRIVATE);
          }
        case 128: break;
        case 47: 
          { return symbol(PatateCompilateurSymbol.IN);
          }
        case 129: break;
        case 45: 
          { return symbol(PatateCompilateurSymbol.XOR_ASSIGN);
          }
        case 130: break;
        case 29: 
          { return symbol(PatateCompilateurSymbol.INC_OP);
          }
        case 131: break;
        case 23: 
          { return symbol(PatateCompilateurSymbol.OR);
          }
        case 132: break;
        case 66: 
          { return symbol(PatateCompilateurSymbol.FOREACH);
          }
        case 133: break;
        case 33: 
          { return symbol(PatateCompilateurSymbol.ARROW);
          }
        case 134: break;
        case 40: 
          { return symbol(PatateCompilateurSymbol.LEFT_OP);
          }
        case 135: break;
        case 52: 
          { return symbol(PatateCompilateurSymbol.TYPE);
          }
        case 136: break;
        case 9: 
          { return symbol(PatateCompilateurSymbol.SEMIC);
          }
        case 137: break;
        case 67: 
          { return symbol(PatateCompilateurSymbol.LISTOF);
          }
        case 138: break;
        case 55: 
          { return symbol(PatateCompilateurSymbol.CLASS);
          }
        case 139: break;
        case 25: 
          { p.checkMismatch(yytext().charAt(0));
          return symbol(PatateCompilateurSymbol.RBRA);
          }
        case 140: break;
        case 32: 
          { return symbol(PatateCompilateurSymbol.DEC_OP);
          }
        case 141: break;
        case 8: 
          { return symbol(PatateCompilateurSymbol.MULT);
          }
        case 142: break;
        case 2: 
          { return symbol(PatateCompilateurSymbol.ID, yytext());
          }
        case 143: break;
        case 1: 
          { 
          }
        case 144: break;
        case 24: 
          { p.checkMismatch(yytext().charAt(0));
          return symbol(PatateCompilateurSymbol.LBRA);
          }
        case 145: break;
        case 61: 
          { return symbol(PatateCompilateurSymbol.REPEAT);
          }
        case 146: break;
        default: 
          if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
            zzAtEOF = true;
            zzDoEOF();
              { return new java_cup.runtime.Symbol(PatateCompilateurSymbol.EOF); }
          } 
          else {
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}
