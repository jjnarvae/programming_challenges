
import java.util.Scanner;

public class OutputFormatting {

    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("================================");
        for(int i=0;i<3;i++)
        {
            String s1=sc.next();
            int x=sc.nextInt();
            System.out.printf("%3d",s1);
            String textoFormateado = String.format("%3s", x).replace(' ','0');
            System.out.println(textoFormateado);
        }
        System.out.println("================================");

    }
}
