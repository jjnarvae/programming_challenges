
import java.util.Scanner;

public class KnowledgeStdin {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String s= scan.nextLine();
        int i = scan.nextInt();
        scan.nextLine();
        double d= scan.nextDouble();


        // Write your code here.

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }
}
