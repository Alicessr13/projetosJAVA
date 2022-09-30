import java.util.Scanner;
//URI = 1007
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int valorA, valorB, valorC, valorD, diferenca;

        System.out.println("Digite 4 valores inteiros: ");
        valorA = scan.nextInt();
        valorB = scan.nextInt();
        valorC = scan.nextInt();
        valorD = scan.nextInt();

        diferenca = (valorA*valorB)-(valorC*valorD);

        System.out.println("DIFERENCA = "+diferenca);

        scan.close();
    }
}