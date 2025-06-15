import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int codigo = sc.nextInt();
        int quantidade = sc.nextInt();

        double preco;

        if (codigo == 1) preco = 5.00;
        else if (codigo == 2) preco = 3.50;
        else if (codigo == 3) preco = 4.80;
        else if (codigo == 4) preco = 8.90;
        else preco = 7.32;

        double total = preco * quantidade;

        System.out.printf("Valor a pagar: R$ %.2f%n", total);

        sc.close();
    }
}
