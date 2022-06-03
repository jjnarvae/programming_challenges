import java.util.Scanner;

public class Reto {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Digite el numero a calcular:");
        int num= in.nextInt();
        System.out.println(fibonacci(num));
        System.out.println(factorial(num));
    }

    public static int fibonacci(int n) {

        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }

    }

    public static int factorial (int n) {
        if (n==0)
            return 1;
        else
            return n * factorial(n-1);
    }
}
