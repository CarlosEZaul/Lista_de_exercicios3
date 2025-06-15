import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double glicose = sc.nextDouble();

        if (glicose <= 100) {
            System.out.println("Classificacao: normal");
        } else if (glicose <= 140) {
            System.out.println("Classificacao: elevado");
        } else {
            System.out.println("Classificacao: diabetes");
        }

        sc.close();
    }
}
