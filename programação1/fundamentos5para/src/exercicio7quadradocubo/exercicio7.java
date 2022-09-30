package exercicio7quadradocubo;

import java.util.Locale;
import java.util.Scanner;

public class exercicio7 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        int num,quadrado,cubo;
        System.out.println("Digite um numero: ");
        num = scan.nextInt();

        for(int i=1; i<=num;i++){
            quadrado=i*i;
            cubo=i*i*i;
            System.out.println(i+" "+quadrado+" "+cubo);
        }
    }
}