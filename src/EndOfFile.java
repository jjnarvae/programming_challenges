
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EndOfFile {

    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String input;
        int i=1;
        while ((input=bufferedReader.readLine())!=null){
                  System.out.println(i+" "+input);
                  i++;
        }

        bufferedReader.close();

    }
}
