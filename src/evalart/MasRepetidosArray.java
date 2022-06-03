package evalart;

public class MasRepetidosArray {
    static int[] myArray = {1,2,2,4,5,6,7,8,8,8};
    public static void main(String[] args) {

        int max=contar(myArray[0]);
        int number=myArray[0];
        for (int i = 0; i < myArray.length ; i++) {

            int temp=contar(myArray[i]);

            if(max<temp){
                max=temp;
                number=myArray[i];
            }

        }

        System.out.println("Longest: "+ max);
        System.out.println("Number: "+number);

    }

    public static int contar(int n){

        int count =0;

        for (int i = 0; i <myArray.length ; i++) {
            if(n==myArray[i]){
                count++;
            }
        }
        return count;
    }
}
