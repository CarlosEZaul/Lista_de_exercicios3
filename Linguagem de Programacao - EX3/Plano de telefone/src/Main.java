import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a quantidade de minutos: ");
        int minutos = sc.nextInt();

        double valor = 50.0;

        if (minutos > 100) {
            valor += (minutos - 100) * 2.0;
        }

        System.out.printf("Valor a pagar: R$ %.2f%n", valor);

        sc.close();
    }
}
