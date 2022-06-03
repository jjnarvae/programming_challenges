
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;



class Ejercicio3 {

    /*
     * Complete the 'maximoNumeroHoras' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts 2D_INTEGER_ARRAY equipo as parameter.
     */

    public static List<Integer> maximoNumeroHoras(List<List<Integer>> equipo) {
        // Write your code here

        List<Integer> arr= new ArrayList<>();
        for (int i = 0; i < equipo.size(); i++) {

            int n = equipo.get(i).get(0);
            int t = equipo.get(i).get(1);
            int r = equipo.get(i).get(2);

            int res=((t-r)*n)+r;

            System.out.println(res);
            arr.add(res);


        }

       return arr;
    }




    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int equipoRows = Integer.parseInt(bufferedReader.readLine().trim());
        int equipoColumns = Integer.parseInt(bufferedReader.readLine().trim());

        List<List<Integer>> equipo = new ArrayList<>();

        for (int i = 0; i < equipoRows; i++) {
            String[] equipoRowTempItems = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

            List<Integer> equipoRowItems = new ArrayList<>();

            for (int j = 0; j < equipoColumns; j++) {
                int equipoItem = Integer.parseInt(equipoRowTempItems[j]);
                equipoRowItems.add(equipoItem);
            }

            equipo.add(equipoRowItems);
        }

        List<Integer> result = maximoNumeroHoras(equipo);

        for (int i = 0; i < result.size(); i++) {
            //bufferedWriter.write(String.valueOf(result.get(i)));

            if (i != result.size() - 1) {
          //      bufferedWriter.write("\n");
            }
        }

        //bufferedWriter.newLine();

        bufferedReader.close();
       // bufferedWriter.close();
    }
}
