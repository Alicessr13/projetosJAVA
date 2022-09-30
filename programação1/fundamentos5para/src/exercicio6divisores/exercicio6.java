package exercicio6divisores;

import java.util.Locale;
import java.util.Scanner;

public class exercicio6 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        int num,divisao=0;
        System.out.println("Digite um numero: ");
        num = scan.nextInt();

        for(int i=1; i<=num;i++){
            divisao=num%i;
            if(divisao==0){
                System.out.println(i);
            }
        }
    }
}