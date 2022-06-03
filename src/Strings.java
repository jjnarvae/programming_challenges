
import java.util.Locale;
import java.util.Scanner;

public class Strings {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();

        System.out.println(A.length()+B.length());

        String res= A.compareTo(B)>0?"Yes":"No";
        System.out.println(res);
        System.out.println(A.substring(0,1).toUpperCase()+A.substring(1)+" "+B.substring(0,1).toUpperCase()+B.substring(1));

    }
}
