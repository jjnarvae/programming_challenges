import java.util.*;
import java.io.*;
import java.math.*;

class Solution {

    public static int calc(int[] array, int n1, int n2) {

        int suma=0;
        for (int i = 0; i <array.length ; i++) {
            if(i>=n1 && i<=n2){
                suma=suma+array[i];
            }
        }
        return suma;
    }

    public static int computeMultiplesSum(int n) {
        // Write your code here
        // To debug: System.err.println("Debug messages...");
        int suma=0;
        for (int i = 0; i < n; i++) {
            if(i%3==0 || i%5==0 || i%7==0 ){
                suma=suma+i;
            }

        }

        return suma;
    }

    /* Ignore and do not change the code below */
    // #region main
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        PrintStream outStream = System.out;
        System.setOut(System.err);
        int res = computeMultiplesSum(n);
        System.setOut(outStream);
        System.out.println(res);
    }
    // #endregion
}