package exercicio2quadrante;

import java.util.Locale;
import java.util.Scanner;

public class exercicio2 {
        public static void main(String[]args){
            Locale.setDefault(Locale.US);
            double x,y;
            Scanner scan = new Scanner(System.in);

            do {
                System.out.println("Digite o valor de X: ");
                x = scan.nextDouble();

                System.out.println("Digite o valor de Y: ");
                y = scan.nextDouble();

                if (x > 0 && y > 0) {
                    System.out.println("Primeiro\n");
                } else if (x < 0 && y > 0) {
                    System.out.println("Segundo\n");
                } else if (x < 0 && y < 0) {
                    System.out.println("Terceiro\n");
                } else if (x > 0 && y < 0) {
                    System.out.println("Quarto\n");
                }
            }while(x!=0&&y!=0);

        }
    }

