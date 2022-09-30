import java.util.Locale;
import java.util.Scanner;

public class exercicio2par_impar {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US); //para usar ponto
        Scanner scan = new Scanner(System.in);
        int num;
        String par_impar;

        System.out.println("Digite um numero inteiro: ");
        num = scan.nextInt();

        par_impar = (num%2==0) ? "PAR" : "IMPAR"; // alternativa para if else

        System.out.println(par_impar);

        scan.close(); // fechar o scanner
    }
}
