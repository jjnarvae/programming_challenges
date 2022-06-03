
public class Exceptions {

    public static void main(String[] args) {

        int a =0;
        int b=0;
        try {

                 for (int i = 0; i <3 ; i++) {

                     try {
                         a = getResultado(4, i);

                     }catch (Exception e){
                         System.out.println("interno a "+ i);
                     }
                 }


        }catch (Exception e){
            System.out.println(e.getMessage()+" a");
        }

        try {
            b= getResultado(1,1);
        }catch (Exception e){
            System.out.println(e.getMessage()+ " b");
        }


        System.out.println(a);
        System.out.println(b);


    }

    public static int getResultado(int a, int b){

        int res=a/b;
        return res;
    }

    public static int getResultadoDos(int a, int b){

        int res=a/b;
        return res;
    }


}
