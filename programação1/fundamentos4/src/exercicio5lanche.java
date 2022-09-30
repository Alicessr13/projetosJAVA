import java.util.Locale;
import java.util.Scanner;

public class exercicio5lanche {
    public static void main(String[]args){
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        int codigo, quantidade;
        double produto, total;

        System.out.println("Codigo do produto: ");
        codigo = scan.nextInt();

        System.out.println("Quantidade do produto: ");
        quantidade = scan.nextInt();

        scan.close();

        switch (codigo){
            case 1:
                produto = 4.00;
                break;

            case 2:
                produto = 4.50;
                break;

            case 3:
                produto = 5.00;
                break;

            case 4:
                produto = 2.00;
                break;

            case 5:
                produto = 1.50;
                break;

            default:
                produto =0;
                break;
        }

        total = produto*quantidade;

        System.out.printf("Total: R$ %.2f",total);
    }
}
