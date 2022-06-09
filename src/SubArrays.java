import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SubArrays {

    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);

        int n = sc.nextInt();
       int [] numbers= new int [n];

        int negatives=0;

        for (int i = 0; i <n ; i++) {

            int temp=sc.nextInt();
             numbers[i]=temp;
        }


        for (int i = 0; i < n; i++) {
            int aux= numbers[i];

            if(aux<0){
                negatives++;
            }

            for (int j = i+1; j < n; j++) {
                 aux=aux+numbers[j];

                 if(aux<0){
                     negatives++;
                 }
            }

        }

        System.out.println(negatives);
    }
}
