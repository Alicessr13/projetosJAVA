import java.util.Scanner;

//URI = 1002

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double raio, area, pi =3.14159;

        System.out.println("Valor do raio: ");
        raio = scan.nextDouble();

        area = pi*Math.pow(raio,2);

        System.out.printf("Area = %.4f%n",area);

        scan.close();
    }
}