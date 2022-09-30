package exercicio1senhafixa;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class exercicio1 {
    public static void main(String[]args) throws IOException {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);
        int senha=2002, sen=0;

        System.out.println("Digite a senha: ");
        sen = scan.nextInt();

        while (sen!=senha){
            System.out.println("Senha Invalida");
            System.out.println("Digite a senha novamente: ");
            sen = scan.nextInt();
        }
        System.out.println("Acesso permitido");
    }
}
