package exercicio3tipodecombustivel;

import java.util.Locale;
import java.util.Scanner;

public class exercicio3 {
    public static void main(String[]args){
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        int alcool=0, gasolina=0,diesel=0, num=0;

        do{
            System.out.println("Qual o combustivel usado? ");
            System.out.println("Alcool = 1 | Gasolina = 2 | Diesel = 3 | Para sair = 4");
            num = scan.nextInt();
            if(num==1){
                alcool++;
            } else if (num==2) {
                gasolina++;
            } else if (num==3) {
                diesel++;
            }

        }while(num!=4);
        System.out.printf("%n");
        System.out.println("MUITO OBRIGADO");
        System.out.println("Alcool: "+alcool);
        System.out.println("Gasolina: "+gasolina);
        System.out.println("Diesel: "+diesel);
    }
}
