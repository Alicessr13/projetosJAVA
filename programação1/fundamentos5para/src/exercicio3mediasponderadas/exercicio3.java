package exercicio3mediasponderadas;

import java.util.Locale;
import java.util.Scanner;

public class exercicio3 {
    public static void main(String[]args){
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        int num;
        double nota1,nota2,nota3,media;

        System.out.println("Quantas medias ira fazer? ");
        num = scan.nextInt();

        for(int i=0; i<num;i++){
            System.out.println("Digite as notas da media:");
            nota1 = scan.nextDouble();
            nota2 = scan.nextDouble();
            nota3 = scan.nextDouble();

            media=((nota1*2)+(nota2*3)+(nota3*5))/10;
            System.out.println();
            System.out.printf("MEDIA: %.1f%n%n",media);
        }
    }
}
