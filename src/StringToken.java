
import java.util.Scanner;

public class StringToken {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String s = scan.nextLine().trim();

        if (s.isEmpty()){
            System.out.println("0");
        }else{

            String[] aux=s.trim().split("[!,?._'@' ']+");

            System.out.println(aux.length);
            for (int i = 0; i <aux.length ; i++) {

                System.out.println(aux[i]);

            }

        }


        scan.close();
    }
}
