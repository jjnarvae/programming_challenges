import java.util.HashSet;
import java.util.Scanner;

public class JavaHashSet {

    public static void main(String[] args) {


        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        s.nextLine();

        HashSet<String> hashSet = new HashSet<String>();

        for (int i = 0; i < t; i++) {
             String str= s.nextLine();
             hashSet.add(str);
             System.out.println(hashSet.size());
        }
    }
}
