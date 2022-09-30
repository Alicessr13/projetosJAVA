package exercicio5fatorial;

import java.util.Locale;
import java.util.Scanner;

public class exercicio5 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        int num,fatorial=1;
        System.out.println("Digite um numero: ");
        num = scan.nextInt();

        for(int i=num;i>0;i--){
            fatorial=fatorial*num;
            num--;
        }
        System.out.println(fatorial);
    }
}
