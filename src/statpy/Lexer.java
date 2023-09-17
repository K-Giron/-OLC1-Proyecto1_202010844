// DO NOT EDIT
// Generated by JFlex 1.9.1 http://jflex.de/
// source: src/statpy/Lexer.jflex



// ------------  Paquete e importaciones ------------
package statpy; 

import java_cup.runtime.*;


@SuppressWarnings("fallthrough")
public class Lexer implements java_cup.runtime.Scanner {

  /** This character denotes the end of file. */
  public static final int YYEOF = -1;

  /** Initial size of the lookahead buffer. */
  private static final int ZZ_BUFFERSIZE = 16384;

  // Lexical states.
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
   * Top-level table for translating characters to character classes
   */
  private static final int [] ZZ_CMAP_TOP = zzUnpackcmap_top();

  private static final String ZZ_CMAP_TOP_PACKED_0 =
    "\1\0\1\u0100\36\u0200\1\u0300\1\u0400\266\u0200\10\u0500\u1020\u0200";

  private static int [] zzUnpackcmap_top() {
    int [] result = new int[4352];
    int offset = 0;
    offset = zzUnpackcmap_top(ZZ_CMAP_TOP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackcmap_top(String packed, int offset, int [] result) {
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
   * Second-level tables for translating characters to character classes
   */
  private static final int [] ZZ_CMAP_BLOCKS = zzUnpackcmap_blocks();

  private static final String ZZ_CMAP_BLOCKS_PACKED_0 =
    "\11\0\1\1\1\2\1\3\2\4\22\0\1\5\1\6"+
    "\1\7\3\0\1\10\1\11\1\12\1\13\1\14\1\15"+
    "\1\0\1\16\1\17\1\20\12\21\1\22\1\23\1\24"+
    "\1\25\1\26\2\0\1\27\1\30\1\31\1\32\1\33"+
    "\1\34\1\35\1\36\1\37\1\40\1\41\1\42\1\43"+
    "\1\44\1\45\2\40\1\46\1\47\1\50\1\51\1\52"+
    "\1\53\4\40\1\54\4\40\1\27\1\30\1\31\1\32"+
    "\1\33\1\34\1\35\1\36\1\37\1\40\1\41\1\42"+
    "\1\43\1\55\1\45\2\40\1\56\1\47\1\50\1\51"+
    "\1\52\1\53\3\40\1\57\1\60\1\61\7\0\1\3"+
    "\252\0\2\62\115\0\1\63\u01a8\0\2\3\u0100\0\1\64"+
    "\325\0\u0100\3";

  private static int [] zzUnpackcmap_blocks() {
    int [] result = new int[1536];
    int offset = 0;
    offset = zzUnpackcmap_blocks(ZZ_CMAP_BLOCKS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackcmap_blocks(String packed, int offset, int [] result) {
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
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\1\2\1\3\2\1\1\4\1\5\1\6"+
    "\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\16"+
    "\1\17\1\20\1\21\14\22\1\23\1\1\1\24\2\1"+
    "\1\25\1\0\1\26\1\0\1\27\2\0\1\30\1\0"+
    "\1\31\1\32\1\33\6\22\1\34\3\22\1\35\10\22"+
    "\1\36\1\35\3\0\1\26\1\37\1\0\1\40\3\22"+
    "\1\0\5\22\1\0\1\22\1\41\1\42\1\22\1\0"+
    "\2\22\1\0\2\22\1\0\1\22\1\0\1\22\1\0"+
    "\1\42\2\0\1\43\1\22\2\44\1\45\1\22\1\0"+
    "\2\22\2\46\1\22\1\0\2\47\1\22\1\0\1\22"+
    "\1\0\1\50\2\51\1\22\1\0\1\22\1\0\1\52"+
    "\2\53\1\22\1\0\2\22\2\54\1\22\1\0\1\22"+
    "\1\0\2\55\2\56\1\22\1\0\1\22\1\57\2\60"+
    "\2\61\2\62\1\63";

  private static int [] zzUnpackAction() {
    int [] result = new int[159];
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
    "\0\0\0\65\0\65\0\152\0\237\0\324\0\u0109\0\65"+
    "\0\65\0\65\0\65\0\65\0\65\0\u013e\0\u0173\0\65"+
    "\0\65\0\u01a8\0\u01dd\0\u0212\0\u0247\0\u027c\0\u02b1\0\u02e6"+
    "\0\u031b\0\u0350\0\u0385\0\u03ba\0\u03ef\0\u0424\0\u0459\0\u048e"+
    "\0\65\0\u04c3\0\65\0\u04f8\0\u052d\0\65\0\237\0\65"+
    "\0\u0562\0\65\0\u0597\0\u05cc\0\u0601\0\u0636\0\65\0\65"+
    "\0\65\0\u066b\0\u06a0\0\u06d5\0\u070a\0\u073f\0\u0774\0\u07a9"+
    "\0\u07de\0\u0813\0\u0848\0\u0247\0\u087d\0\u08b2\0\u08e7\0\u091c"+
    "\0\u0951\0\u0986\0\u09bb\0\u09f0\0\65\0\65\0\u0a25\0\u0a5a"+
    "\0\u0a8f\0\237\0\65\0\u0ac4\0\u0636\0\u0af9\0\u0b2e\0\u0b63"+
    "\0\u0b98\0\u0bcd\0\u0c02\0\u0c37\0\u0c6c\0\u0ca1\0\u0cd6\0\u0d0b"+
    "\0\u0247\0\u0247\0\u0d40\0\u0d75\0\u0daa\0\u0ddf\0\u0e14\0\u0e49"+
    "\0\u0e7e\0\u0eb3\0\u0ee8\0\u0f1d\0\u0f52\0\u0f87\0\65\0\u0fbc"+
    "\0\u0ff1\0\u0247\0\u1026\0\u0247\0\65\0\u0247\0\u105b\0\u1090"+
    "\0\u10c5\0\u10fa\0\u0247\0\65\0\u112f\0\u1164\0\u0247\0\65"+
    "\0\u1199\0\u11ce\0\u1203\0\u1238\0\u0247\0\u0247\0\65\0\u126d"+
    "\0\u12a2\0\u12d7\0\u130c\0\65\0\u0247\0\65\0\u1341\0\u1376"+
    "\0\u13ab\0\u13e0\0\u0247\0\65\0\u1415\0\u144a\0\u147f\0\u14b4"+
    "\0\u0247\0\65\0\u0247\0\65\0\u14e9\0\u151e\0\u1553\0\u0247"+
    "\0\u0247\0\65\0\u0247\0\65\0\u0247\0\65\0\u0247";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[159];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length() - 1;
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /**
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpacktrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\2\2\3\1\0\2\3\1\4\1\5\1\6\1\7"+
    "\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\17"+
    "\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\27"+
    "\1\30\1\31\1\32\2\25\1\33\3\25\1\34\3\25"+
    "\1\35\1\36\1\25\1\37\1\40\3\25\1\41\1\42"+
    "\1\43\1\44\1\45\1\2\112\0\1\46\37\0\2\47"+
    "\1\0\4\47\1\50\44\47\1\51\10\47\10\0\1\52"+
    "\54\0\11\53\1\0\42\53\3\0\6\53\14\0\1\54"+
    "\3\0\1\55\63\0\1\56\1\0\1\17\70\0\1\57"+
    "\64\0\1\60\64\0\1\61\60\0\1\25\5\0\30\25"+
    "\27\0\1\25\5\0\16\25\1\62\1\63\7\25\1\63"+
    "\27\0\1\25\5\0\1\64\6\25\1\65\6\25\1\66"+
    "\11\25\27\0\1\25\5\0\4\25\1\67\11\25\1\70"+
    "\11\25\27\0\1\25\5\0\13\25\1\71\14\25\27\0"+
    "\1\25\5\0\1\72\15\25\1\73\11\25\27\0\1\25"+
    "\5\0\5\25\1\74\7\25\1\75\10\25\1\75\1\25"+
    "\27\0\1\25\5\0\1\76\27\25\27\0\1\25\5\0"+
    "\21\25\1\77\2\25\1\100\3\25\27\0\1\25\5\0"+
    "\17\25\1\101\7\25\1\101\27\0\1\25\5\0\16\25"+
    "\1\102\11\25\27\0\1\25\5\0\7\25\1\103\7\25"+
    "\1\104\7\25\1\104\66\0\1\105\40\0\1\106\7\0"+
    "\1\107\10\0\1\107\57\0\1\110\2\0\1\111\11\0"+
    "\2\47\1\0\4\47\1\112\44\47\1\51\10\47\11\0"+
    "\1\113\60\0\1\114\57\0\2\55\3\0\60\55\21\0"+
    "\1\115\64\0\1\25\5\0\16\25\1\116\11\25\27\0"+
    "\1\25\5\0\4\25\1\117\23\25\27\0\1\25\5\0"+
    "\20\25\1\120\7\25\4\0\1\121\22\0\1\25\5\0"+
    "\1\122\27\25\27\0\1\25\5\0\15\25\1\123\10\25"+
    "\1\123\1\25\27\0\1\25\5\0\5\25\1\124\22\25"+
    "\27\0\1\25\5\0\22\25\1\125\5\25\27\0\1\25"+
    "\5\0\20\25\1\126\7\25\4\0\1\127\22\0\1\25"+
    "\5\0\13\25\1\130\14\25\27\0\1\25\5\0\17\25"+
    "\1\131\7\25\1\131\27\0\1\25\5\0\21\25\1\132"+
    "\6\25\27\0\1\25\5\0\10\25\1\133\17\25\3\0"+
    "\1\134\23\0\1\25\5\0\17\25\1\135\7\25\1\135"+
    "\27\0\1\25\5\0\10\25\1\136\17\25\3\0\1\137"+
    "\23\0\1\25\5\0\22\25\1\140\5\25\27\0\1\25"+
    "\5\0\10\25\1\141\17\25\3\0\1\142\23\0\1\25"+
    "\5\0\10\25\1\143\17\25\3\0\1\144\23\0\1\25"+
    "\5\0\10\25\1\145\17\25\3\0\1\146\52\0\1\147"+
    "\62\0\1\150\7\0\1\150\45\0\1\137\22\0\1\137"+
    "\2\0\14\114\1\151\3\114\1\0\44\114\21\0\1\25"+
    "\5\0\13\25\1\152\14\25\27\0\1\25\5\0\1\153"+
    "\27\25\27\0\1\25\5\0\4\25\1\154\23\25\41\0"+
    "\1\155\52\0\1\25\5\0\17\25\1\156\7\25\1\156"+
    "\27\0\1\25\5\0\20\25\1\157\7\25\4\0\1\160"+
    "\22\0\1\25\5\0\1\161\27\25\27\0\1\25\5\0"+
    "\1\25\1\162\26\25\27\0\1\25\5\0\4\25\1\163"+
    "\23\25\41\0\1\164\52\0\1\25\5\0\20\25\1\165"+
    "\7\25\4\0\1\166\22\0\1\25\5\0\15\25\1\167"+
    "\10\25\1\167\1\25\52\0\1\170\10\0\1\170\30\0"+
    "\1\25\5\0\10\25\1\171\17\25\3\0\1\172\23\0"+
    "\1\25\5\0\21\25\1\173\6\25\56\0\1\174\35\0"+
    "\1\25\5\0\4\25\1\175\23\25\27\0\1\25\5\0"+
    "\3\25\1\176\24\25\40\0\1\177\53\0\1\25\5\0"+
    "\13\25\1\200\14\25\50\0\1\201\43\0\1\25\5\0"+
    "\21\25\1\202\6\25\56\0\1\203\53\0\1\172\22\0"+
    "\1\172\22\0\1\204\65\0\1\25\5\0\12\25\1\205"+
    "\15\25\5\0\1\206\21\0\1\25\5\0\16\25\1\207"+
    "\11\25\53\0\1\210\40\0\1\25\5\0\22\25\1\211"+
    "\5\25\27\0\1\25\5\0\13\25\1\212\14\25\27\0"+
    "\1\25\5\0\4\25\1\213\23\25\41\0\1\214\52\0"+
    "\1\25\5\0\15\25\1\215\10\25\1\215\1\25\52\0"+
    "\1\216\10\0\1\216\30\0\1\25\5\0\2\25\1\217"+
    "\25\25\37\0\1\220\54\0\1\25\5\0\4\25\1\221"+
    "\23\25\41\0\1\222\52\0\1\25\5\0\4\25\1\223"+
    "\23\25\41\0\1\224\52\0\1\25\5\0\13\25\1\225"+
    "\14\25\50\0\1\226\43\0\1\25\5\0\13\25\1\227"+
    "\14\25\27\0\1\25\5\0\4\25\1\230\23\25\27\0"+
    "\1\25\5\0\6\25\1\231\21\25\43\0\1\232\50\0"+
    "\1\25\5\0\7\25\1\233\20\25\44\0\1\234\47\0"+
    "\1\25\5\0\4\25\1\235\23\25\41\0\1\236\52\0"+
    "\1\25\5\0\21\25\1\237\6\25\6\0";

  private static int [] zzUnpacktrans() {
    int [] result = new int[5512];
    int offset = 0;
    offset = zzUnpacktrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpacktrans(String packed, int offset, int [] result) {
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


  /** Error code for "Unknown internal scanner error". */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  /** Error code for "could not match input". */
  private static final int ZZ_NO_MATCH = 1;
  /** Error code for "pushback value was too large". */
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /**
   * Error messages for {@link #ZZ_UNKNOWN_ERROR}, {@link #ZZ_NO_MATCH}, and
   * {@link #ZZ_PUSHBACK_2BIG} respectively.
   */
  private static final String ZZ_ERROR_MSG[] = {
    "Unknown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state {@code aState}
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\0\2\11\4\1\6\11\2\1\2\11\17\1\1\11"+
    "\1\1\1\11\2\1\1\11\1\0\1\11\1\0\1\11"+
    "\2\0\1\1\1\0\3\11\23\1\2\11\3\0\1\1"+
    "\1\11\1\0\4\1\1\0\5\1\1\0\4\1\1\0"+
    "\2\1\1\0\2\1\1\0\1\1\1\0\1\1\1\0"+
    "\1\11\2\0\3\1\1\11\2\1\1\0\3\1\1\11"+
    "\1\1\1\0\1\1\1\11\1\1\1\0\1\1\1\0"+
    "\2\1\1\11\1\1\1\0\1\1\1\0\1\11\1\1"+
    "\1\11\1\1\1\0\3\1\1\11\1\1\1\0\1\1"+
    "\1\0\1\1\1\11\1\1\1\11\1\1\1\0\3\1"+
    "\1\11\1\1\1\11\1\1\1\11\1\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[159];
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

  /** Input device. */
  private java.io.Reader zzReader;

  /** Current state of the DFA. */
  private int zzState;

  /** Current lexical state. */
  private int zzLexicalState = YYINITIAL;

  /**
   * This buffer contains the current text to be matched and is the source of the {@link #yytext()}
   * string.
   */
  private char zzBuffer[] = new char[Math.min(ZZ_BUFFERSIZE, zzMaxBufferLen())];

  /** Text position at the last accepting state. */
  private int zzMarkedPos;

  /** Current text position in the buffer. */
  private int zzCurrentPos;

  /** Marks the beginning of the {@link #yytext()} string in the buffer. */
  private int zzStartRead;

  /** Marks the last character in the buffer, that has been read from input. */
  private int zzEndRead;

  /**
   * Whether the scanner is at the end of file.
   * @see #yyatEOF
   */
  private boolean zzAtEOF;

  /**
   * The number of occupied positions in {@link #zzBuffer} beyond {@link #zzEndRead}.
   *
   * <p>When a lead/high surrogate has been read from the input stream into the final
   * {@link #zzBuffer} position, this will have a value of 1; otherwise, it will have a value of 0.
   */
  private int zzFinalHighSurrogate = 0;

  /** Number of newlines encountered up to the start of the matched text. */
  private int yyline;

  /** Number of characters from the last newline up to the start of the matched text. */
  private int yycolumn;

  /** Number of characters up to the start of the matched text. */
  private long yychar;

  /** Whether the scanner is currently at the beginning of a line. */
  @SuppressWarnings("unused")
  private boolean zzAtBOL = true;

  /** Whether the user-EOF-code has already been executed. */
  private boolean zzEOFDone;

  /* user code: */


  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  public Lexer(java.io.Reader in) {
    this.zzReader = in;
  }


  /** Returns the maximum size of the scanner buffer, which limits the size of tokens. */
  private int zzMaxBufferLen() {
    return Integer.MAX_VALUE;
  }

  /**  Whether the scanner buffer can grow to accommodate a larger token. */
  private boolean zzCanGrow() {
    return true;
  }

  /**
   * Translates raw input code points to DFA table row
   */
  private static int zzCMap(int input) {
    int offset = input & 255;
    return offset == input ? ZZ_CMAP_BLOCKS[offset] : ZZ_CMAP_BLOCKS[ZZ_CMAP_TOP[input >> 8] | offset];
  }

  /**
   * Refills the input buffer.
   *
   * @return {@code false} iff there was new input.
   * @exception java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead - zzStartRead);

      /* translate stored positions */
      zzEndRead -= zzStartRead;
      zzCurrentPos -= zzStartRead;
      zzMarkedPos -= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length - zzFinalHighSurrogate && zzCanGrow()) {
      /* if not, and it can grow: blow it up */
      char newBuffer[] = new char[Math.min(zzBuffer.length * 2, zzMaxBufferLen())];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
    }

    /* fill the buffer with new input */
    int requested = zzBuffer.length - zzEndRead;
    int numRead = zzReader.read(zzBuffer, zzEndRead, requested);

    /* not supposed to occur according to specification of java.io.Reader */
    if (numRead == 0) {
      if (requested == 0) {
        throw new java.io.EOFException("Scan buffer limit reached ["+zzBuffer.length+"]");
      }
      else {
        throw new java.io.IOException(
            "Reader returned 0 characters. See JFlex examples/zero-reader for a workaround.");
      }
    }
    if (numRead > 0) {
      zzEndRead += numRead;
      if (Character.isHighSurrogate(zzBuffer[zzEndRead - 1])) {
        if (numRead == requested) { // We requested too few chars to encode a full Unicode character
          --zzEndRead;
          zzFinalHighSurrogate = 1;
        } else {                    // There is room in the buffer for at least one more char
          int c = zzReader.read();  // Expecting to read a paired low surrogate char
          if (c == -1) {
            return true;
          } else {
            zzBuffer[zzEndRead++] = (char)c;
          }
        }
      }
      /* potentially more input available */
      return false;
    }

    /* numRead < 0 ==> end of stream */
    return true;
  }


  /**
   * Closes the input reader.
   *
   * @throws java.io.IOException if the reader could not be closed.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true; // indicate end of file
    zzEndRead = zzStartRead; // invalidate buffer

    if (zzReader != null) {
      zzReader.close();
    }
  }


  /**
   * Resets the scanner to read from a new input stream.
   *
   * <p>Does not close the old reader.
   *
   * <p>All internal variables are reset, the old input stream <b>cannot</b> be reused (internal
   * buffer is discarded and lost). Lexical state is set to {@code ZZ_INITIAL}.
   *
   * <p>Internal scan buffer is resized down to its initial length, if it has grown.
   *
   * @param reader The new input stream.
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzEOFDone = false;
    yyResetPosition();
    zzLexicalState = YYINITIAL;
    int initBufferSize = Math.min(ZZ_BUFFERSIZE, zzMaxBufferLen());
    if (zzBuffer.length > initBufferSize) {
      zzBuffer = new char[initBufferSize];
    }
  }

  /**
   * Resets the input position.
   */
  private final void yyResetPosition() {
      zzAtBOL  = true;
      zzAtEOF  = false;
      zzCurrentPos = 0;
      zzMarkedPos = 0;
      zzStartRead = 0;
      zzEndRead = 0;
      zzFinalHighSurrogate = 0;
      yyline = 0;
      yycolumn = 0;
      yychar = 0L;
  }


  /**
   * Returns whether the scanner has reached the end of the reader it reads from.
   *
   * @return whether the scanner has reached EOF.
   */
  public final boolean yyatEOF() {
    return zzAtEOF;
  }


  /**
   * Returns the current lexical state.
   *
   * @return the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state.
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   *
   * @return the matched text.
   */
  public final String yytext() {
    return new String(zzBuffer, zzStartRead, zzMarkedPos-zzStartRead);
  }


  /**
   * Returns the character at the given position from the matched text.
   *
   * <p>It is equivalent to {@code yytext().charAt(pos)}, but faster.
   *
   * @param position the position of the character to fetch. A value from 0 to {@code yylength()-1}.
   *
   * @return the character at {@code position}.
   */
  public final char yycharat(int position) {
    return zzBuffer[zzStartRead + position];
  }


  /**
   * How many characters were matched.
   *
   * @return the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occurred while scanning.
   *
   * <p>In a well-formed scanner (no or only correct usage of {@code yypushback(int)} and a
   * match-all fallback rule) this method will only be called with things that
   * "Can't Possibly Happen".
   *
   * <p>If this method is called, something is seriously wrong (e.g. a JFlex bug producing a faulty
   * scanner etc.).
   *
   * <p>Usual syntax/scanner level error handling should be done in error fallback rules.
   *
   * @param errorCode the code of the error message to display.
   */
  private static void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    } catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  }


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * <p>They will be read again by then next call of the scanning method.
   *
   * @param number the number of characters to be read again. This number must not be greater than
   *     {@link #yylength()}.
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
    
  yyclose();    }
  }




  /**
   * Resumes scanning until the next regular expression is matched, the end of input is encountered
   * or an I/O-Error occurs.
   *
   * @return the next token.
   * @exception java.io.IOException if any I/O-Error occurs.
   */
  @Override  public java_cup.runtime.Symbol next_token() throws java.io.IOException
  {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char[] zzBufferL = zzBuffer;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      yychar+= zzMarkedPosL-zzStartRead;

      boolean zzR = false;
      int zzCh;
      int zzCharCount;
      for (zzCurrentPosL = zzStartRead  ;
           zzCurrentPosL < zzMarkedPosL ;
           zzCurrentPosL += zzCharCount ) {
        zzCh = Character.codePointAt(zzBufferL, zzCurrentPosL, zzMarkedPosL);
        zzCharCount = Character.charCount(zzCh);
        switch (zzCh) {
        case '\u000B':  // fall through
        case '\u000C':  // fall through
        case '\u0085':  // fall through
        case '\u2028':  // fall through
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
          yycolumn += zzCharCount;
        }
      }

      if (zzR) {
        // peek one character ahead if it is
        // (if we have counted one line too much)
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

      // set up zzAction for empty match case:
      int zzAttributes = zzAttrL[zzState];
      if ( (zzAttributes & 1) == 1 ) {
        zzAction = zzState;
      }


      zzForAction: {
        while (true) {

          if (zzCurrentPosL < zzEndReadL) {
            zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
            zzCurrentPosL += Character.charCount(zzInput);
          }
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
              zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
              zzCurrentPosL += Character.charCount(zzInput);
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMap(zzInput) ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
        zzAtEOF = true;
            zzDoEOF();
          { return new java_cup.runtime.Symbol(sym.EOF); }
      }
      else {
        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 1:
            { System.out.println("Error Lexico: " + yytext() + " | Fila:" + yyline + " | Columna: " + yycolumn);
                    data.Info.listaErrores.add(new data.Error("Error Lexico", "No reconocido el caracter "+ yytext() ,
                    yyline, yycolumn));
            }
          // fall through
          case 52: break;
          case 2:
            { /* Espacios en blanco se ignoran */
            }
          // fall through
          case 53: break;
          case 3:
            { return new Symbol(sym.NOT, yycolumn, yyline, yytext());
            }
          // fall through
          case 54: break;
          case 4:
            { return new Symbol(sym.APOSTROFE, yycolumn, yyline, yytext());
            }
          // fall through
          case 55: break;
          case 5:
            { return new Symbol(sym.PARENTESIS_A, yycolumn, yyline, yytext());
            }
          // fall through
          case 56: break;
          case 6:
            { return new Symbol(sym.PARENTESIS_C, yycolumn, yyline, yytext());
            }
          // fall through
          case 57: break;
          case 7:
            { return new Symbol(sym.POR, yycolumn, yyline, yytext());
            }
          // fall through
          case 58: break;
          case 8:
            { return new Symbol(sym.MAS, yycolumn, yyline, yytext());
            }
          // fall through
          case 59: break;
          case 9:
            { return new Symbol(sym.MENOS, yycolumn, yyline, yytext());
            }
          // fall through
          case 60: break;
          case 10:
            { return new Symbol(sym.PUNTO, yycolumn, yyline, yytext());
            }
          // fall through
          case 61: break;
          case 11:
            { return new Symbol(sym.DIVISION, yycolumn, yyline, yytext());
            }
          // fall through
          case 62: break;
          case 12:
            { return new Symbol(sym.ENTERO, yycolumn, yyline, yytext());
            }
          // fall through
          case 63: break;
          case 13:
            { return new Symbol(sym.DOSPUNTOS, yycolumn, yyline, yytext());
            }
          // fall through
          case 64: break;
          case 14:
            { return new Symbol(sym.PUNTOYCOMA, yycolumn, yyline, yytext());
            }
          // fall through
          case 65: break;
          case 15:
            { return new Symbol(sym.MENOR, yycolumn, yyline, yytext());
            }
          // fall through
          case 66: break;
          case 16:
            { return new Symbol(sym.IGUAL, yycolumn, yyline, yytext());
            }
          // fall through
          case 67: break;
          case 17:
            { return new Symbol(sym.MAYOR, yycolumn, yyline, yytext());
            }
          // fall through
          case 68: break;
          case 18:
            { return new Symbol(sym.ID, yycolumn, yyline, yytext());
            }
          // fall through
          case 69: break;
          case 19:
            { return new Symbol(sym.LLAVE_A, yycolumn, yyline, yytext());
            }
          // fall through
          case 70: break;
          case 20:
            { return new Symbol(sym.LLAVE_C, yycolumn, yyline, yytext());
            }
          // fall through
          case 71: break;
          case 21:
            { return new Symbol(sym.DISTINTO, yycolumn, yyline, yytext());
            }
          // fall through
          case 72: break;
          case 22:
            { return new Symbol(sym.TEXTOENTRECOMILLAS, yycolumn, yyline, yytext());
            }
          // fall through
          case 73: break;
          case 23:
            { return new Symbol(sym.AND, yycolumn, yyline, yytext());
            }
          // fall through
          case 74: break;
          case 24:
            { /* Comentario simple se ignora */
            }
          // fall through
          case 75: break;
          case 25:
            { return new Symbol(sym.MENORIGUAL, yycolumn, yyline, yytext());
            }
          // fall through
          case 76: break;
          case 26:
            { return new Symbol(sym.IGUALIGUAL, yycolumn, yyline, yytext());
            }
          // fall through
          case 77: break;
          case 27:
            { return new Symbol(sym.MAYORIGUAL, yycolumn, yyline, yytext());
            }
          // fall through
          case 78: break;
          case 28:
            { return new Symbol(sym.DO, yycolumn, yyline, yytext());
            }
          // fall through
          case 79: break;
          case 29:
            { return new Symbol(sym.IF, yycolumn, yyline, yytext());
            }
          // fall through
          case 80: break;
          case 30:
            { return new Symbol(sym.OR, yycolumn, yyline, yytext());
            }
          // fall through
          case 81: break;
          case 31:
            { return new Symbol(sym.TCHAR, yycolumn, yyline, yytext());
            }
          // fall through
          case 82: break;
          case 32:
            { return new Symbol(sym.DECIMAL, yycolumn, yyline, yytext());
            }
          // fall through
          case 83: break;
          case 33:
            { return new Symbol(sym.FOR, yycolumn, yyline, yytext());
            }
          // fall through
          case 84: break;
          case 34:
            { return new Symbol(sym.INT, yycolumn, yyline, yytext());
            }
          // fall through
          case 85: break;
          case 35:
            { return new Symbol(sym.BOOL, yycolumn, yyline, yytext());
            }
          // fall through
          case 86: break;
          case 36:
            { return new Symbol(sym.CASE, yycolumn, yyline, yytext());
            }
          // fall through
          case 87: break;
          case 37:
            { return new Symbol(sym.CHAR, yycolumn, yyline, yytext());
            }
          // fall through
          case 88: break;
          case 38:
            { return new Symbol(sym.ELSE, yycolumn, yyline, yytext());
            }
          // fall through
          case 89: break;
          case 39:
            { return new Symbol(sym.MAIN, yycolumn, yyline, yytext());
            }
          // fall through
          case 90: break;
          case 40:
            { return new Symbol(sym.TRUE, yycolumn, yyline, yytext());
            }
          // fall through
          case 91: break;
          case 41:
            { return new Symbol(sym.VOID, yycolumn, yyline, yytext());
            }
          // fall through
          case 92: break;
          case 42:
            { /* Comentario múltiple se ignora */
            }
          // fall through
          case 93: break;
          case 43:
            { return new Symbol(sym.BREAK, yycolumn, yyline, yytext());
            }
          // fall through
          case 94: break;
          case 44:
            { return new Symbol(sym.FALSE, yycolumn, yyline, yytext());
            }
          // fall through
          case 95: break;
          case 45:
            { return new Symbol(sym.WHILE, yycolumn, yyline, yytext());
            }
          // fall through
          case 96: break;
          case 46:
            { return new Symbol(sym.WRITE, yycolumn, yyline, yytext());
            }
          // fall through
          case 97: break;
          case 47:
            { return new Symbol(sym.DOUBLE, yycolumn, yyline, yytext());
            }
          // fall through
          case 98: break;
          case 48:
            { return new Symbol(sym.STRING, yycolumn, yyline, yytext());
            }
          // fall through
          case 99: break;
          case 49:
            { return new Symbol(sym.SWITCH, yycolumn, yyline, yytext());
            }
          // fall through
          case 100: break;
          case 50:
            { return new Symbol(sym.CONSOLE, yycolumn, yyline, yytext());
            }
          // fall through
          case 101: break;
          case 51:
            { return new Symbol(sym.DEFAULT, yycolumn, yyline, yytext());
            }
          // fall through
          case 102: break;
          default:
            zzScanError(ZZ_NO_MATCH);
        }
      }
    }
  }


}
