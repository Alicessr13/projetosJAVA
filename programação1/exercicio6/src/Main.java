import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);
        double valorA, valorB, valorC;

        System.out.println("Digite 3 valores: ");
        valorA = scan.nextDouble();
        valorB = scan.nextDouble();
        valorC = scan.nextDouble();

        scan.close();

        //AREA DO TRIANGULO RETANGULO A POR BASE C POR ALTURA
        double triangulo;
        triangulo = (valorA*valorC)/2;
        System.out.printf("TRIANGULO: %.3f%n",triangulo);

        //AREA DO CIRCULO DE RAIO C;
        double circulo, pi=3.14159;
        circulo = pi*Math.pow(valorC,2);
        System.out.printf("CIRCULO: %.3f%n",circulo);

        //AREA DO TRAPEZIO QUE TEM A E B POR BASES E C POR ALTURA
        double trapezio;
        trapezio = ((valorA+valorB)*valorC)/2;
        System.out.printf("TRAPEZIO: %.3f%n",trapezio);

        //AREA DO QUADRADO QUE TEM LADO B
        double quadrado;
        quadrado = valorB*valorB;
        System.out.printf("QUADRADO: %.3f%n",quadrado);

        //AREA DO RETANGULO QUE TEM LADOS A E B
        double retangulo;
        retangulo = valorA*valorB;
        System.out.printf("RETANGULO: %.3f%n",retangulo);

    }
}