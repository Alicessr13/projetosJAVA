package exercicio2intervalo;

import java.util.Locale;
import java.util.Scanner;

public class exercicio2 {
    public static void main(String[]args){
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);
        int num=0,in=0,out=0;

        System.out.println("Quantos numeros vai digitar? ");
        num = scan.nextInt();

        for(int i=0; i<num;i++){
            System.out.println("Digite um numero: ");
            num = scan.nextInt();
            if(num>=10&&num<=20){
                in++;
            }
            else{
                out++;
            }
        }
        System.out.printf("%n");
        System.out.println(in+" in");
        System.out.println(out+" out");
    }
}
