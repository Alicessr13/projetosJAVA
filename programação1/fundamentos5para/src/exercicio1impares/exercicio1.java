package exercicio1impares;

import java.util.Locale;
import java.util.Scanner;

public class exercicio1 {
    public static void main(String[]args){
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        int num,teste;
        System.out.println("Digite um numero: ");
        num = scan.nextInt();

        for(int i=0;i<=num;i++){
            teste = i%2;
            if(teste!=0){
                System.out.println(i);
            }
        }
    }
}
