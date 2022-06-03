import java.io.*;
import java.math.BigInteger;
import java.util.Scanner;

public class knowledgeBigInteger {

    public static void main(String[] args) throws IOException {

        Scanner scanner= new Scanner(System.in);
        BigInteger one = new BigInteger(scanner.nextLine());
        BigInteger dos = new BigInteger(scanner.nextLine());

        System.out.println(one.add(dos));
        System.out.println(one.multiply(dos));




    }
}
