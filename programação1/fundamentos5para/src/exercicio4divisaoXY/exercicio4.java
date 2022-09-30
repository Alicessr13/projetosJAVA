package exercicio4divisaoXY;

import java.util.Locale;
import java.util.Scanner;

public class exercicio4 {
    public static void main(String[]args){
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        int num, x,y;
        double divisao = 0;

        System.out.println("Quantas divisões ira fazer? ");
        num = scan.nextInt();

        for(int i=0;i<num;i++){

                System.out.println("Digite 2 numeros: ");
                x = scan.nextInt();
                y = scan.nextInt();
                divisao= (double) x/y;
                if(y!=0){
                    System.out.printf("%.1f%n",divisao);
                }else {
                    System.out.println("Divisao impossivel");
                }
                System.out.println();
        }


        }
    }

