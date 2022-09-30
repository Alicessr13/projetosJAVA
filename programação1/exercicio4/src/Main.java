import java.util.Locale;
import java.util.Scanner;
//URI = 1008
public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner scan = new Scanner(System.in);
        int numFunc;
        double horaTra, valorHora, salario;

        System.out.println("Numero do funcionario: ");
        numFunc = scan.nextInt();

        System.out.println("Horas trabalhadas desse funcionario: ");
        horaTra = scan.nextDouble();

        System.out.println("Valor da hora: ");
        valorHora = scan.nextDouble();

        salario = horaTra*valorHora;

        System.out.println("NUMERO = "+numFunc);
        System.out.printf("SALARIO = U$ %.2f%n",salario);

        scan.close();
    }
}