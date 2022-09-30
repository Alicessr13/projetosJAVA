package Programacao;

import Model.Triangle;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[]args){
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        Triangle x, y;
        x = new Triangle();
        y = new Triangle();

        System.out.println("Entre com as medidas do triangulo x: ");
        x.a = scan.nextDouble();
        x.b = scan.nextDouble();
        x.c = scan.nextDouble();

        System.out.println("Entre com as medidas do triangulo y: ");
        y.a = scan.nextDouble();
        y.b = scan.nextDouble();
        y.c = scan.nextDouble();

        scan.close();

        double areaX = x.area();
        double areaY = y.area();

        System.out.printf("Area do triangulo x: %.4f%n",areaX);
        System.out.printf("Area do triangulo y: %.4f%n",areaY);

        if(areaX>areaY){
            System.out.println("Maior area eh X");
        }
        else if (areaX<areaY){
            System.out.println("Maior area eh Y");
        }
        else{
            System.out.println("As areas sao iguais");
        }
    }
}
