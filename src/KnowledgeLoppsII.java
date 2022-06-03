
import java.util.Scanner;

public class KnowledgeLoppsII {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();

            int res=a+b;//8
            for (int j = 1; j <=n ; j++) {
                System.out.print(res+" ");
                int temp=  (int)Math.pow(2,j);//2//4//8//16
                res= res+(temp*b);//14//26
                
            }
            System.out.println("");

        }


        in.close();


    }
}
