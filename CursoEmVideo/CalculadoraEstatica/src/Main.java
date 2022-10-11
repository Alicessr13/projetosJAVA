import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int num=0;
        Scanner scan = new Scanner(System.in);

        Calculos cal = new Calculos();

        while (num!=5) {
            System.out.println("Qual equacao deseja fazer: ");
            System.out.println("1 = media | 2 = variancia | 3 = Desvio padrao | 4 = Coeficiente de variacao | 5 = Sair");
            num = scan.nextInt();
            scan.nextLine();
            switch (num) {
                case 1:
                    System.out.println("Quantos numeros para fazer a media? ");
                    int numero = scan.nextInt();
                    System.out.printf("Media: %.2f",cal.media(numero));
                    System.out.println();
                    System.out.println();
                    break;

                case 2:
                    System.out.println("Quantos numeros para fazer a variancia? ");
                    int num3 = scan.nextInt();
                    System.out.printf("Variancia: %.2f",cal.variancia(num3));
                    System.out.println();
                    break;

                case 3:
                    System.out.println("Quantos numeros para fazer o desvio padrao? ");
                    int num4 = scan.nextInt();
                    System.out.printf("Desvio padrao: %.2f",cal.desvioPadrao(num4));
                    System.out.println();
                    break;

                case 4:
                    System.out.println("Quantos numeros para fazer o coeficiente padrao? ");
                    int num5 = scan.nextInt();
                    System.out.printf("Coeficiente padrao: %.2f%%",cal.coeficientePad(num5));
                    System.out.println();
                    break;
        }
        }
        System.out.println("Fim do programa!");
        scan.close();
        }

        }


