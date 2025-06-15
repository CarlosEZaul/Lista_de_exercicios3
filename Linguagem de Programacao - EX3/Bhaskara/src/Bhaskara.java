import java.util.Scanner;

public class Bhaskara {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Entrada dos coeficientes
        System.out.print("Coeficiente a: ");
        double a = sc.nextDouble();

        System.out.print("Coeficiente b: ");
        double b = sc.nextDouble();

        System.out.print("Coeficiente c: ");
        double c = sc.nextDouble();

        if (a == 0) {
            System.out.println("Não é uma equação do segundo grau.");
        } else {
            // Cálculo do discriminante
            double delta = b * b - 4 * a * c;

            if (delta < 0) {
                System.out.println("A equação não possui raízes reais.");
            } else {
                double x1 = (-b + Math.sqrt(delta)) / (2 * a);
                double x2 = (-b - Math.sqrt(delta)) / (2 * a);

                // Exibe as raízes com 4 casas decimais
                System.out.printf("X1 = %.4f%n", x1);
                System.out.printf("X2 = %.4f%n", x2);
            }
        }

        sc.close();
    }
}
