import java.util.Locale;
import java.util.Scanner;

public class exercicio4tempodejogo {
    public static void main (String[]args){
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        int hora_ini,hora_final,hora_total=0;

        System.out.println("Informe a hora inicial: ");
        hora_ini = scan.nextInt();

        System.out.println("Informa a hora final:");
        hora_final = scan.nextInt();

        scan.close();

        if(hora_ini<hora_final){
            hora_total = hora_final-hora_ini;
        }
        else if(hora_ini>hora_final || hora_ini==hora_final){
            hora_total = (hora_final+24)-hora_ini;
        }

        if ((hora_total<=24)&&(hora_total>=1)) {
            System.out.print("O jogo durou " +hora_total+" horas\n");
        }
        else if (hora_total>24){
            System.out.println("A duracao do jogo excedeu 24 horas");
        }
        else if (hora_final<1){
            System.out.println("O jogo tem duracao minima de 1 hora");
        }
    }
}
