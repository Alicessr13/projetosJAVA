import java.util.Locale;
import java.util.Scanner;

//URI = 1012
public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);
        int cod1, cod2, numPe1, numPe2; //variaveis dos codigos e do numero de peças
        double valor1, valor2, valorTotal; //valor das peças

        System.out.println("Codigo da primeira peca: ");
        cod1 = scan.nextInt();
        System.out.println("Numero de pecas: ");
        numPe1 = scan.nextInt();
        System.out.println("Valor unitario da peca: ");
        valor1 = scan.nextDouble();

        System.out.println("Codigo da segunda peca: ");
        cod2 = scan.nextInt();
        System.out.println("Numero de pecas: ");
        numPe2 = scan.nextInt();
        System.out.println("Valor unitario da peca: ");
        valor2 = scan.nextDouble();

        scan.close();

        valorTotal = (numPe1*valor1)+(numPe2*valor2);

        System.out.printf("VALOR A PAGAR: R$ %.2f%n",valorTotal);
    }
}