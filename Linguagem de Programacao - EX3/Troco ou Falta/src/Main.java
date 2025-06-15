import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double preco = sc.nextDouble();
        int quantidade = sc.nextInt();
        double recebido = sc.nextDouble();

        double total = preco * quantidade;

        if (recebido >= total) {
            System.out.printf("TROCO = %.2f%n", recebido - total);
        } else {
            System.out.printf("DINHEIRO INSUFICIENTE. FALTAM %.2f REAIS%n", total - recebido);
        }

        sc.close();
    }
}
