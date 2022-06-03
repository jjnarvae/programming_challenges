
import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in) ;

        String in= sc.next();

        int j=0;

        String out="Yes";
        for (int i = in.length()-1; i >=0 ; i--) {

            if(in.charAt(i)!=in.charAt(j)){
                out="No";
                break;
            }
            j++;
        }

        System.out.println(out);
    }
}
