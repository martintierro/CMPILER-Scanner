public class Token {

    private static final int s0 = 0;
    private static final int s1 = 1;
    private static final int s2 = 2;
    private static final int s3 = 3;
    private static final int s4 = 4;
    private static final int s5 = 5;
    private static final int s6 = 6;
    private static final int s7 = 7;
    private static final int s8 = 8;
    private static final int s9 = 9;
    private static final int s10 = 10;
    private static final int s11 = 11;
    private static final int s12 = 12;
    private static final int s13 = 13;
    private static final int s14 = 14;
    private static final int s15 = 15;
    private static final int s16 = 16;
    private static final int s17 = 17;
    private static final int dead = -1;
    private static int state = s0;

    enum TokenType{
        KEYWORD,
        ERROR,
        FPR,
        GPR,
    }

    public TokenType tokenType;
    public String lexeme;

    public Token(String word){
        this.tokenType = identifyToken(word);
        this.lexeme = word;
    }

    public static void initialize() {
        state = s0;
    }

    private static TokenType identifyToken(String word){
        initialize();
        for (int i = 0; i < word.length(); i++) {
            char input = word.charAt(i);
            state = transition(state, input);
        }
        switch(state){
            case s5: {
                return TokenType.KEYWORD;
            }
            case s6: {
                return TokenType.KEYWORD;
            }
            case s12:{
                return TokenType.FPR;
            }
            case s13:{
                return TokenType.FPR;
            }
            case s16:{
                return  TokenType.GPR;
            }
            case s17:{
                return TokenType.GPR;
            }
            default:{
                return TokenType.ERROR;
            }
        }
    }

    static private int transition(int state, char input) {
        switch (state) {
            case s0: switch (input) {
                case 'D': return s1;
                case 'R': return s15;
                case 'F': return s11;
                case '$': return s14;
                default: return dead;
            }
            case s1: switch (input) {
                case 'M': return s2;
                case 'A': return s7;
                default: return dead;
            }
            case s2: switch (input) {
                case 'U': return s3;
                default: return dead;
            }
            case s3: switch (input) {
                case 'L': return s4;
                default: return dead;
            }
            case s4: switch (input) {
                case 'T': return s5;
                default: return dead;
            }
            case s5: switch (input) {
                case 'U': return s6;
                default: return dead;
            }
            case s6: switch (input) {
                default: return dead;
            }
            case s7: switch (input) {
                case 'D': return s8;
                default: return dead;
            }
            case s8: switch (input) {
                case 'D': return s9;
                default: return dead;
            }
            case s9: switch (input) {
                case 'I': return s9;
                case 'U': return s6;
                default: return dead;
            }
            case s10: switch (input) {
                case 'U': return s6;
                default: return dead;
            }
            case s11: switch (input) {
                case '0': return s13;
                case '1': return s12;
                case '2': return s12;
                case '3': return s12;
                case '4': return s13;
                case '5': return s13;
                case '6': return s13;
                case '7': return s13;
                case '8': return s13;
                case '9': return s13;
                default: return dead;
            }
            case s12: switch (input) {
                case '0': return s13;
                case '1': return s13;
                default: return dead;
            }
            case s13: switch (input) {
                default: return dead;
            }
            case s14: switch (input) {
                case 'F': return s11;
                case '0': return s17;
                case '1': return s16;
                case '2': return s16;
                case '3': return s16;
                case '4': return s17;
                case '5': return s17;
                case '6': return s17;
                case '7': return s17;
                case '8': return s17;
                case '9': return s17;
                default: return dead;
            }
            case s15: switch (input) {
                case '0': return s17;
                case '1': return s16;
                case '2': return s16;
                case '3': return s16;
                case '4': return s17;
                case '5': return s17;
                case '6': return s17;
                case '7': return s17;
                case '8': return s17;
                case '9': return s17;
                default: return dead;
            }
            case s16: switch (input) {
                case '0': return s17;
                case '1': return s17;
                default: return dead;
            }
            case s17: switch (input) {
                default: return dead;
            }
            default: return dead;
        }
    }

    @Override
    public String toString() {
        return this.tokenType.toString();
    }
}
