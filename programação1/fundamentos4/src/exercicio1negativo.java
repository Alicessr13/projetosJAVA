import java.util.Locale;
import java.util.Scanner;

public class exercicio1negativo {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US); //para usar ponto
        Scanner scan = new Scanner(System.in);
        int num;
        String negativo;

        System.out.println("Digite um numero inteiro: ");
        num = scan.nextInt();

        negativo = (num<0) ? "NEGATIVO" : "NAO NEGATIVO"; // alternativa para if else
        // varivel = (condição) ? se_verdadeiro : se_falso

        System.out.println(negativo);

        scan.close(); // fechar o scanner
    }
}