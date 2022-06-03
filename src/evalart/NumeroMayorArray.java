package evalart;

public class NumeroMayorArray {

    static int [] myArray={1,8,14,7,9};
    public static void main(String[] args) {

        int mayor=myArray[0];
        for (int i = 0; i < myArray.length; i++) {

            if(mayor<myArray[i]) {
                mayor = myArray[i];//14
            }
        }

        System.out.println(mayor);
    }
}
