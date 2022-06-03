
import java.math.BigDecimal;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class JavaBigDecimal {

    public static void main(String[] args) {


        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        String []s=new String[n+2];
        for(int i=0;i<n;i++){
            s[i]=sc.next();
        }
        sc.close();



        //forma burbuja
        /*
        for (int i = 0; i < s.length-2; i++) {
            for (int j = 1; j < (n-i); j++) {
                BigDecimal sj = new BigDecimal(s[j]);
                BigDecimal sj1 = new BigDecimal(s[j-1]);
                if(sj.compareTo(sj1) == 1){
                    String temp = s[j];
                    s[j] = s[j-1];
                    s[j-1] = temp;
                }
            }
        }*/


        Comparator<String> customComparator = new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                BigDecimal a = new BigDecimal(s1);
                BigDecimal b = new BigDecimal(s2);
                return b.compareTo(a); // descending order
            }
        };

        Arrays.sort(s, 0, n, customComparator);

        //Output
        for(int i=0;i<n;i++)
        {
            System.out.println(s[i]);
        }

    }
}
