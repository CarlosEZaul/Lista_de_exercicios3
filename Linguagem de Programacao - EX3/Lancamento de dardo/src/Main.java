import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        double maior = a;

        if (b > maior) maior = b;
        if (c > maior) maior = c;

        System.out.printf("MAIOR DISTANCIA = %.2f%n", maior);

        sc.close();
    }
}
