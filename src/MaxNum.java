import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class MaxNum {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String[] arrTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> arr = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            int arrItem = Integer.parseInt(arrTemp[i]);
            arr.add(arrItem);
        }

        MaxNum.miniMaxSum(arr);

        bufferedReader.close();
    }


    public static void miniMaxSum(List<Integer> arr) {
        // Write your code here
        int min=0;
        int max=0;
        Collections.sort(arr);




        for (int i=0,j=4; i<4;i++,j--) {
                 min=min+Integer.parseInt(arr.get(i).toString());
                 max=max+Integer.parseInt(arr.get(j).toString());

            System.out.println(arr.get(i));
            System.out.println(arr.get(j));
        }

         System.out.println(389071625+714532089+623958417+467905213);
        System.out.println(min+ " "+max);



    }

}

