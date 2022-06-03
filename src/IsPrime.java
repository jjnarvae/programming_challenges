
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class IsPrime {

    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String n = bufferedReader.readLine();

        BigInteger temp= new BigInteger(n);

        String r= temp.isProbablePrime(1)==true?"prime":"not prime";
        System.out.println(r);
        bufferedReader.close();
    }
}
