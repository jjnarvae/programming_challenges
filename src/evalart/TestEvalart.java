package evalart;

public class TestEvalart {

    static int n=0;
    public static void main(String[] args) {
if (n==0){
    System.out.println("ERROR");
}
else {
    String[][] letra = new String[n][n];

    for (int i = 0, j = letra.length - 1; i < letra.length; i++, j--) {

        letra[i][i] = "X";
        letra[i][j] = "X";

    }

    for (int i = 0; i < letra.length; i++) {

        for (int j = 0; j < letra.length; j++) {

            if (letra[i][j] == null) {
                letra[i][j] = "_";
            }
            System.out.print(letra[i][j]);
        }
        System.out.println("");

    }

}

    }
}
