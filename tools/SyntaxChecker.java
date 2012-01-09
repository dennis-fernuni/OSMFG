/* Generated By:JavaCC: Do not edit this line. SyntaxChecker.java */
public class SyntaxChecker implements SyntaxCheckerConstants {
    public static void main(String[] args) {
        try {
            new SyntaxChecker(new java.io.StringReader(args[0])).S();
            System.out.println("Syntax is okay");
        } catch (Throwable e) {
            // Catching Throwable is ugly but JavaCC throws Error objects!
            System.out.println("Syntax check failed: " + e.getMessage());
        }
    }

  static final public void S() throws ParseException {
    NODE();
    jj_consume_token(0);
  }

  static final public void XML() throws ParseException {
    jj_consume_token(9);
    jj_consume_token(10);
    jj_consume_token(11);
    jj_consume_token(12);
    jj_consume_token(11);
    jj_consume_token(13);
    jj_consume_token(11);
    jj_consume_token(14);
    jj_consume_token(11);
    jj_consume_token(15);
    NODE();
    jj_consume_token(16);
  }

  static final public void NODE() throws ParseException {
    jj_consume_token(17);
    TEXT();
    jj_consume_token(15);
    TAG();
    jj_consume_token(18);
  }

  static final public void TAG() throws ParseException {
    label_1:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case 28:
        ;
        break;
      default:
        jj_la1[0] = jj_gen;
        break label_1;
      }
      SPACE();
    }
    jj_consume_token(19);
    TEXT();
    jj_consume_token(20);
    label_2:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case 28:
        ;
        break;
      default:
        jj_la1[1] = jj_gen;
        break label_2;
      }
      SPACE();
    }
  }

  static final public void DIGIT() throws ParseException {
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case 21:
      jj_consume_token(21);
      break;
    case 32:
      NONZERODIGIT();
      break;
    default:
      jj_la1[2] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
  }

  static final public void TIMESTAMP() throws ParseException {
    YEAR();
    jj_consume_token(22);
    DIGIT();
    DIGIT();
    jj_consume_token(22);
    DIGIT();
    DIGIT();
    jj_consume_token(23);
    DIGIT();
    DIGIT();
    jj_consume_token(24);
    DIGIT();
    DIGIT();
    jj_consume_token(24);
    DIGIT();
    DIGIT();
    jj_consume_token(25);
    NUMBER();
    TZD();
  }

  static final public void NUMBER() throws ParseException {
    NONZERODIGIT();
    label_3:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case 21:
      case 32:
        ;
        break;
      default:
        jj_la1[3] = jj_gen;
        break label_3;
      }
      DIGIT();
    }
  }

  static final public void BOOLEAN() throws ParseException {
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case 26:
      jj_consume_token(26);
      break;
    case 27:
      jj_consume_token(27);
      break;
    default:
      jj_la1[4] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
  }

  static final public void SPACE() throws ParseException {
    jj_consume_token(28);
  }

  static final public void TEXT() throws ParseException {
    label_4:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case 21:
      case 28:
      case 29:
      case 30:
      case 32:
        ;
        break;
      default:
        jj_la1[5] = jj_gen;
        break label_4;
      }
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case 29:
        jj_consume_token(29);
        break;
      case 30:
        jj_consume_token(30);
        break;
      case 21:
      case 32:
        DIGIT();
        break;
      case 28:
        SPACE();
        break;
      default:
        jj_la1[6] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
    }
  }

  static final public void YEAR() throws ParseException {
    DIGIT();
    DIGIT();
    DIGIT();
    DIGIT();
  }

  static final public void TZD() throws ParseException {
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case 31:
      jj_consume_token(31);
      break;
    case 6:
    case 22:
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case 6:
        jj_consume_token(6);
        break;
      case 22:
        jj_consume_token(22);
        break;
      default:
        jj_la1[7] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
      DIGIT();
      DIGIT();
      jj_consume_token(24);
      DIGIT();
      DIGIT();
      break;
    default:
      jj_la1[8] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
  }

  static final public void NONZERODIGIT() throws ParseException {
    jj_consume_token(32);
  }

  static final public void NODE__ermergency_fire_hydrant() throws ParseException {
    jj_consume_token(33);
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case 34:
      jj_consume_token(34);
      fire_hydrant_type();
      break;
    default:
      jj_la1[9] = jj_gen;
      ;
    }
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case 35:
      jj_consume_token(35);
      fire_hydrant_diameter();
      break;
    default:
      jj_la1[10] = jj_gen;
      ;
    }
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case 36:
      jj_consume_token(36);
      fire_hydrant_preasure();
      break;
    default:
      jj_la1[11] = jj_gen;
      ;
    }
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case 37:
      jj_consume_token(37);
      fire_hydrant_position();
      break;
    default:
      jj_la1[12] = jj_gen;
      ;
    }
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case 46:
      fire_hydrant_count();
      break;
    default:
      jj_la1[13] = jj_gen;
      ;
    }
  }

  static final public void fire_hydrant_type() throws ParseException {
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case 38:
      jj_consume_token(38);
      break;
    case 39:
      jj_consume_token(39);
      break;
    case 40:
      jj_consume_token(40);
      break;
    case 41:
      jj_consume_token(41);
      break;
    default:
      jj_la1[14] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
  }

  static final public void fire_hydrant_diameter() throws ParseException {
    jj_consume_token(34);
    NUMBER();
  }

  static final public void fire_hydrant_preasure() throws ParseException {
    jj_consume_token(36);
    NUMBER();
  }

  static final public void fire_hydrant_position() throws ParseException {
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case 42:
      jj_consume_token(42);
      break;
    case 43:
      jj_consume_token(43);
      break;
    case 44:
      jj_consume_token(44);
      break;
    case 45:
      jj_consume_token(45);
      break;
    default:
      jj_la1[15] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
  }

  static final public void fire_hydrant_count() throws ParseException {
    jj_consume_token(46);
    NUMBER();
  }

  static final public void NODE__traffic_signals() throws ParseException {
    jj_consume_token(47);
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case 48:
      jj_consume_token(48);
      traffic_signals_sound();
      break;
    default:
      jj_la1[16] = jj_gen;
      ;
    }
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case 49:
      jj_consume_token(49);
      traffic_signals_vibration();
      break;
    default:
      jj_la1[17] = jj_gen;
      ;
    }
  }

  static final public void traffic_signals_sound() throws ParseException {
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case 50:
      jj_consume_token(50);
      break;
    case 51:
      jj_consume_token(51);
      break;
    case 52:
      jj_consume_token(52);
      break;
    case 53:
      jj_consume_token(53);
      break;
    default:
      jj_la1[18] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
  }

  static final public void traffic_signals_vibration() throws ParseException {
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case 52:
      jj_consume_token(52);
      break;
    case 53:
      jj_consume_token(53);
      break;
    default:
      jj_la1[19] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
  }

  static private boolean jj_initialized_once = false;
  /** Generated Token Manager. */
  static public SyntaxCheckerTokenManager token_source;
  static SimpleCharStream jj_input_stream;
  /** Current token. */
  static public Token token;
  /** Next token. */
  static public Token jj_nt;
  static private int jj_ntk;
  static private int jj_gen;
  static final private int[] jj_la1 = new int[20];
  static private int[] jj_la1_0;
  static private int[] jj_la1_1;
  static {
      jj_la1_init_0();
      jj_la1_init_1();
   }
   private static void jj_la1_init_0() {
      jj_la1_0 = new int[] {0x10000000,0x10000000,0x200000,0x200000,0xc000000,0x70200000,0x70200000,0x400040,0x80400040,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,};
   }
   private static void jj_la1_init_1() {
      jj_la1_1 = new int[] {0x0,0x0,0x1,0x1,0x0,0x1,0x1,0x0,0x0,0x4,0x8,0x10,0x20,0x4000,0x3c0,0x3c00,0x10000,0x20000,0x3c0000,0x300000,};
   }

  /** Constructor with InputStream. */
  public SyntaxChecker(java.io.InputStream stream) {
     this(stream, null);
  }
  /** Constructor with InputStream and supplied encoding */
  public SyntaxChecker(java.io.InputStream stream, String encoding) {
    if (jj_initialized_once) {
      System.out.println("ERROR: Second call to constructor of static parser.  ");
      System.out.println("       You must either use ReInit() or set the JavaCC option STATIC to false");
      System.out.println("       during parser generation.");
      throw new Error();
    }
    jj_initialized_once = true;
    try { jj_input_stream = new SimpleCharStream(stream, encoding, 1, 1); } catch(java.io.UnsupportedEncodingException e) { throw new RuntimeException(e); }
    token_source = new SyntaxCheckerTokenManager(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 20; i++) jj_la1[i] = -1;
  }

  /** Reinitialise. */
  static public void ReInit(java.io.InputStream stream) {
     ReInit(stream, null);
  }
  /** Reinitialise. */
  static public void ReInit(java.io.InputStream stream, String encoding) {
    try { jj_input_stream.ReInit(stream, encoding, 1, 1); } catch(java.io.UnsupportedEncodingException e) { throw new RuntimeException(e); }
    token_source.ReInit(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 20; i++) jj_la1[i] = -1;
  }

  /** Constructor. */
  public SyntaxChecker(java.io.Reader stream) {
    if (jj_initialized_once) {
      System.out.println("ERROR: Second call to constructor of static parser. ");
      System.out.println("       You must either use ReInit() or set the JavaCC option STATIC to false");
      System.out.println("       during parser generation.");
      throw new Error();
    }
    jj_initialized_once = true;
    jj_input_stream = new SimpleCharStream(stream, 1, 1);
    token_source = new SyntaxCheckerTokenManager(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 20; i++) jj_la1[i] = -1;
  }

  /** Reinitialise. */
  static public void ReInit(java.io.Reader stream) {
    jj_input_stream.ReInit(stream, 1, 1);
    token_source.ReInit(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 20; i++) jj_la1[i] = -1;
  }

  /** Constructor with generated Token Manager. */
  public SyntaxChecker(SyntaxCheckerTokenManager tm) {
    if (jj_initialized_once) {
      System.out.println("ERROR: Second call to constructor of static parser. ");
      System.out.println("       You must either use ReInit() or set the JavaCC option STATIC to false");
      System.out.println("       during parser generation.");
      throw new Error();
    }
    jj_initialized_once = true;
    token_source = tm;
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 20; i++) jj_la1[i] = -1;
  }

  /** Reinitialise. */
  public void ReInit(SyntaxCheckerTokenManager tm) {
    token_source = tm;
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 20; i++) jj_la1[i] = -1;
  }

  static private Token jj_consume_token(int kind) throws ParseException {
    Token oldToken;
    if ((oldToken = token).next != null) token = token.next;
    else token = token.next = token_source.getNextToken();
    jj_ntk = -1;
    if (token.kind == kind) {
      jj_gen++;
      return token;
    }
    token = oldToken;
    jj_kind = kind;
    throw generateParseException();
  }


/** Get the next Token. */
  static final public Token getNextToken() {
    if (token.next != null) token = token.next;
    else token = token.next = token_source.getNextToken();
    jj_ntk = -1;
    jj_gen++;
    return token;
  }

/** Get the specific Token. */
  static final public Token getToken(int index) {
    Token t = token;
    for (int i = 0; i < index; i++) {
      if (t.next != null) t = t.next;
      else t = t.next = token_source.getNextToken();
    }
    return t;
  }

  static private int jj_ntk() {
    if ((jj_nt=token.next) == null)
      return (jj_ntk = (token.next=token_source.getNextToken()).kind);
    else
      return (jj_ntk = jj_nt.kind);
  }

  static private java.util.List<int[]> jj_expentries = new java.util.ArrayList<int[]>();
  static private int[] jj_expentry;
  static private int jj_kind = -1;

  /** Generate ParseException. */
  static public ParseException generateParseException() {
    jj_expentries.clear();
    boolean[] la1tokens = new boolean[54];
    if (jj_kind >= 0) {
      la1tokens[jj_kind] = true;
      jj_kind = -1;
    }
    for (int i = 0; i < 20; i++) {
      if (jj_la1[i] == jj_gen) {
        for (int j = 0; j < 32; j++) {
          if ((jj_la1_0[i] & (1<<j)) != 0) {
            la1tokens[j] = true;
          }
          if ((jj_la1_1[i] & (1<<j)) != 0) {
            la1tokens[32+j] = true;
          }
        }
      }
    }
    for (int i = 0; i < 54; i++) {
      if (la1tokens[i]) {
        jj_expentry = new int[1];
        jj_expentry[0] = i;
        jj_expentries.add(jj_expentry);
      }
    }
    int[][] exptokseq = new int[jj_expentries.size()][];
    for (int i = 0; i < jj_expentries.size(); i++) {
      exptokseq[i] = jj_expentries.get(i);
    }
    return new ParseException(token, exptokseq, tokenImage);
  }

  /** Enable tracing. */
  static final public void enable_tracing() {
  }

  /** Disable tracing. */
  static final public void disable_tracing() {
  }

}