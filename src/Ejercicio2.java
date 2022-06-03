
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;



class Ejercicio2 {

    /*
     * Complete the 'cantidadMinimaDeDias' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY x as parameter.
     */

    public static int cantidadMinimaDeDias(List<Integer> x) {
        // Write your code here
        Collections.sort(x);

        int diferentes=1;
        for (int i=0;i<x.size()-1;i++){

             if(x.get(i)!=x.get(i+1)){
                  diferentes++;
             }
        }
        return diferentes;
    }




    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
       // BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int xCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> x = new ArrayList<>();

        for (int i = 0; i < xCount; i++) {
            int xItem = Integer.parseInt(bufferedReader.readLine().trim());
            x.add(xItem);
        }

        int result = cantidadMinimaDeDias(x);

        //bufferedWriter.write(String.valueOf(result));
        //bufferedWriter.newLine();

        bufferedReader.close();
        //bufferedWriter.close();
    }
}

