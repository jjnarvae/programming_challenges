

public class Histograma {

    static int[] myArray = {1,2,1,3,3,1,2,1,1,1};

    public static void main(String[] args) {

        for (int i = 1; i <=5; i++) {

            System.out.println(i+": "+getCharacters(i));

        }
    }

    private static String getCharacters(int i) {

        String res="";

        for (int j = 0; j <myArray.length ; j++) {

            if(i==myArray[j]){
                res=res+"*";
            }

        }

      return res;

    }
}
