

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;



class SampleTest {

    /*
     * Complete the 'fizzBuzz' function below.
     *
     * The function accepts INTEGER n as parameter.
     */

    public static void fizzBuzz(int n) {
        // Write your code here
        for(int i=1;i<=n;i++){
               if(i%3==0||i%5==0){
                   System.out.print("FizzBuzz");
               }
               else if(i%3==0){
                   System.out.print("Fizz");
               }
               else if(i%5==0){
                   System.out.print("Buzz");
               }else{
                   System.out.print(i);
               }
        }

    }




    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        SampleTest.fizzBuzz(n);

        bufferedReader.close();
    }
}
