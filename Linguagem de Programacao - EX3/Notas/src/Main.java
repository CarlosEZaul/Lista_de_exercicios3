import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nota 1: ");
        double nota1 = sc.nextDouble();
        System.out.println("Nota 2: ");
        double nota2 = sc.nextDouble();
        double notaFinal = nota1 + nota2;

        System.out.println("Nota 1: "+nota1);
        System.out.println("Nota 2: "+nota2);
        System.out.println("Nota Final: "+notaFinal);
        if(notaFinal<60){
            System.out.println("Reprovado");
        }
        else{
            System.out.println("Aprovado");
        }

    }
}