import java.util.Locale;
import java.util.Scanner;

public class exercicio8impostoderenda {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);
        double salario, resto, taxa;

        System.out.println("Digite o salario: ");
        salario = scan.nextDouble();

        if (salario <= 2000) {
            System.out.println("isento");
        } else if (salario > 2000 && salario <= 3000) {
            resto = salario - 2000;
            taxa = (resto*8)/100;
            System.out.printf("R$ %.2f%n", taxa);
        } else if (salario > 3000 && salario <= 4500) {
            resto = salario - 3000;
            taxa = ((1000*8)/100) + ((resto*18)/100);
            System.out.printf("R$ %.2f%n", taxa);
        }
        else if (salario>4500) {
            resto = salario - 4500;
            taxa = ((1000*8)/100) + ((1500*18)/100)+ ((resto*28)/100);
            System.out.printf("R$ %.2f%n", taxa);
        }
    }
}