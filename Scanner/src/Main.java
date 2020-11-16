import java.io.*;
import java.util.ArrayList;

public class Main {
    public static void main(String args[]) throws IOException {
        InputStream inputStream = new FileInputStream("Scanner/IO/input.txt");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        FileWriter fileWriter = new FileWriter("Scanner/IO/output.txt");
        String line;
        Scanner sc = new Scanner();
        while((line = bufferedReader.readLine()) != null){
            ArrayList<Token> tokens = sc.process(line);
            for(Token token: tokens){
                fileWriter.write(token +" ");
            }
            fileWriter.write("\n");
        }
        inputStream.close();
        fileWriter.close();
    }
}
