import java.util.Locale;
import java.util.Scanner;

public class exercicio7coordenadas {
    public static void main(String[]args){
        Locale.setDefault(Locale.US);
        double x,y;
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o valor de X: ");
        x = scan.nextDouble();

        System.out.println("Digite o valor de Y: ");
        y = scan.nextDouble();


            if(x>0 && y>0){
                System.out.println("Q1");
            }
            else if(x<0 && y>0){
                System.out.println("Q2");
            }
            else if(x<0 && y<0){
                System.out.println("Q3");
            }
            else if(x>0 && y<0){
                System.out.println("Q4");
            }
            else if(x==0 && y==0){
                System.out.println("Origem");
            }

    }
}
