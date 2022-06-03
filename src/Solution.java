import java.util.*;
import java.io.*;
import java.math.*;

class Solution1 {

    public static int computeCheckDigit(String identificationNumber) {
        // Write your code here
        // To debug: System.err.println("Debug messages...");
        int suma=0;
        int resta=0;
        for (int i = 0; i <identificationNumber.length() ; i++) {

            if((int)identificationNumber.charAt(i)%2==0){
             //   suma=suma+Character.getNumericValue(identificationNumber.charAt(i));//4
            }else{
               // resta=resta+Character.getNumericValue(identificationNumber.charAt(i));//3
            }

        }

        int digito=((suma*3)+resta)%10==0?0:10-(((suma*3)+resta)%10);


        return digito;

    }

    /* Ignore and do not change the code below */
    // #region main
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        String identificationNumber = in.next();
        PrintStream outStream = System.out;
        System.setOut(System.err);
        int checkDigit = computeCheckDigit(identificationNumber);
        System.setOut(outStream);
        System.out.println(checkDigit);
    }
    // #endregion
}