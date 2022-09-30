import java.util.Locale;
import java.util.Scanner;

public class exercicio3multiplos {
    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);
        int num1, num2;
        String multiplo = null;
        System.out.println("Digite 2 numeros inteiros: ");
        num1 = scan.nextInt();
        num2 = scan.nextInt();

        scan.close();

        if(num1>=num2){
            multiplo = (num1%num2 == 0) ? "SAO MULTIPLOS" : "NAO SAO MULTIPLOS";
        }
        else{
            multiplo = (num2%num1 == 0) ? "SAO MULTIPLOS" : "NAO SAO MULTIPLOS";
        }
        System.out.println(multiplo);
    }
}
