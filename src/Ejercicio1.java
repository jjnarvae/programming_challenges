import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;



public class Ejercicio1 {


    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
       // BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int prestamoCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Long> prestamo = new ArrayList<>();

        for (int i = 0; i < prestamoCount; i++) {
            long prestamoItem = Long.parseLong(bufferedReader.readLine().trim());
            prestamo.add(prestamoItem);
        }

        List<Long> result = calcularDias(prestamo);

        for (int i = 0; i < result.size(); i++) {
         //   bufferedWriter.write(String.valueOf(result.get(i)));

            if (i != result.size() - 1) {
           //     bufferedWriter.write("\n");
            }
        }

        //bufferedWriter.newLine();

        bufferedReader.close();
    //    bufferedWriter.close();
    }

    public static List<Long> calcularDias(List<Long> prestamo) {
        // Write your code here
       // System.out.println(caso.get(0).get(0));

        List<Long> arr= new ArrayList<>();

        for (int i = 0; i < prestamo.size(); i++) {

              long res=1;

              long dia=1;

              while (res<prestamo.get(i)){
                  dia++;
                  res=(res*2)+1;

              }

              arr.add(dia);
        }

           return  arr;
    }

}