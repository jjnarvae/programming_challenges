
import java.io.*;
        import java.math.*;
        import java.security.*;
        import java.text.*;
        import java.util.*;
        import java.util.concurrent.*;
        import java.util.regex.*;

class MiniPluss {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        String[] arrTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> arr = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrTemp[i]);
            arr.add(arrItem);
        }
        MiniPluss.plusMinus(arr);

        bufferedReader.close();
    }

    public static void plusMinus(List<Integer> arr) {
        // Write your code here

        double positivos=0;
        double negativos=0;
        double ceros=0;
        for(int i=0;i<arr.size();i++){

              if(arr.get(i)==0){
                  ceros++;
              }
              else if(arr.get(i)>0){
                  positivos++;
              }
              else{
                  negativos++;
              }

        }

        DecimalFormat formato =new DecimalFormat("#0.000000");
        System.out.print(formato.format(positivos/arr.size())+"\n"+formato.format(negativos/arr.size())+"\n"+formato.format(ceros/arr.size()));
    }

}
