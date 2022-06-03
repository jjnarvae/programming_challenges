package evalart;

public class SymetricArray {

    static String[] myArray = {"a", "b", "c", "d", "d", "c", "b", "a"};
    static  int n=8;

    public static void main(String[] args) {

        String res="Symmetric";
        for (int i = 0, j=n-1; i <n ; i++,j--) {

            if(!myArray[i].equals(myArray[j])){
                res= "Asymmetric";
                break;
            }

        }

        System.out.println(res);
    }
}
