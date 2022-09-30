import java.util.Scanner;

public class Main {

    //URI 1003

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int num1, num2, soma;

        System.out.println("Digite 2 numeros: ");
        num1 = entrada.nextInt();
        num2 = entrada.nextInt();

        soma = num1+num2;

        System.out.println("Soma = "+soma);

        entrada.close();
    }
}