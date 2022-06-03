
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Formatter {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();

        String france = NumberFormat.getCurrencyInstance(Locale.FRANCE).format(payment);
        String us = NumberFormat.getCurrencyInstance(Locale.US).format(payment);
        String india = NumberFormat.getCurrencyInstance(new Locale("en","IN")).format(payment);
        String china = NumberFormat.getCurrencyInstance(Locale.CHINA).format(payment);
        String col = NumberFormat.getCurrencyInstance(new Locale("es","CO")).format(payment);

        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
        System.out.println("Colombia: " + col);

    }
}
