
import java.util.Scanner;

public class SubstringComparisons {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();

        System.out.println(getSmallestAndLargest(s, k));
    }

    private static String getSmallestAndLargest(String s, int k) {

        String smallest=s.substring(0,k);
        String largest=s.substring(0,k);

        for (int i = 0; i <k ; i++) {
            for (int j = i; j <= s.length()-k; j++) {

                String aux= s.substring(j,j+3);

                smallest=aux.compareTo(smallest)<0?aux:smallest;
                largest=aux.compareTo(largest)>0?aux:largest;

                j=(j+k)-1;
            }
        }
        return smallest + "\n" + largest;

    }
}
