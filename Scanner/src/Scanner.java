import java.util.ArrayList;
import java.util.Collections;

public class Scanner {
    ArrayList<Token> process (String line){
        String[] temp = line.split(" ");
        ArrayList<String> words = new ArrayList<>();
        for (String l: temp){
            String[] tempwords = l.split(",");
            Collections.addAll(words, tempwords);
        }
        ArrayList<Token> tokenList = new ArrayList<>();
        for (String w: words) {
            if(!w.equals("")){
                tokenList.add(new Token(w));
            }
        }
        return tokenList;
    }
}
