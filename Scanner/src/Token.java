public class Token {
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

    public static TokenType identifyToken(String word){
        return null;
    }

    @Override
    public String toString() {
        return this.lexeme;
    }
}
