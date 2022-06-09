import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JavaList {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int n= in.nextInt();

        List<Integer> list= new ArrayList<Integer>();

        for (int i = 0; i <n ; i++) {
            list.add(in.nextInt());
        }

        int q= in.nextInt();

        for (int i = 0; i <q ; i++) {

            String command= in.next();
            int x= in.nextInt();


            if(command.equals("Insert")){
                int y= in.nextInt();
                list.add(x,y);
            }else{
                list.remove(x);
            }
        }

        list.stream().forEach(numbers->{
            System.out.print(numbers+" ");
        });
    }
}
