
import java.util.Scanner;

public class Anigrams {

    public static void main(String[] args) {

        Scanner in=  new Scanner(System.in);

        String a= in.next().toLowerCase();
        String b= in.next().toLowerCase();

        in.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }

    private static boolean isAnagram(String a, String b) {

             if(a.length()!=b.length()){
                 return false;
             }

             a=a.toLowerCase();
             b=b.toLowerCase();

            for (int j = 0; j < a.length(); j++) {

                int x=contador(a.charAt(j),a);
                int y=contador(a.charAt(j),b);

                if (x!=y){
                     return false;
                }

            }
            return true;
    }



    private static int contador(char p, String x){

        int cont=0;

        for (int i = 0; i <x.length() ; i++) {

            if (x.charAt(i) == p) {

                cont++;

            }

        }
        return cont;
    }
}
