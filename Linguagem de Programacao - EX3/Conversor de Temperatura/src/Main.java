import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char escala = sc.next().toUpperCase().charAt(0);

        if (escala == 'F') {
            double f = sc.nextDouble();
            double c = (5.0 / 9.0) * (f - 32);
            System.out.printf("Temperatura equivalente em Celsius: %.2f%n", c);
        } else {
            double c = sc.nextDouble();
            double f = (c * 9.0 / 5.0) + 32;
            System.out.printf("Temperatura equivalente em Fahrenheit: %.2f%n", f);
        }

        sc.close();
    }
}
