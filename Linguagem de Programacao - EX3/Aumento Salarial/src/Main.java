import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double salario = sc.nextDouble();
        double percentual;

        if (salario <= 1000.00) percentual = 0.20;
        else if (salario <= 3000.00) percentual = 0.15;
        else if (salario <= 8000.00) percentual = 0.10;
        else percentual = 0.05;

        double aumento = salario * percentual;
        double novoSalario = salario + aumento;

        System.out.printf("Novo salario R$ %.2f%n", novoSalario);
        System.out.printf("Aumento R$ %.2f%n", aumento);
        System.out.printf("Porcentagem = %.0f%%%n", percentual * 100);

        sc.close();
    }
}
