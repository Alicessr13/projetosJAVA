import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US); // pra usar ponto em vez de virgula (padrão US)

        System.out.print("Hello world!"); //sem quebra de linha
        System.out.printf("%n"); // %n pula linha

        System.out.println("Hello world!"); //com quebra de linha

        double x = 10.48654;
        System.out.printf("%.2f %n",x); //%.f para variavel com ponto flutuante

        //concatenar elementos:
        System.out.println("Resultado = "+ x +" metros");
        System.out.printf("Resultado = %.4f metros%n",x);

        //conversão de tipos (casting) implicito resultado = 2,0
        int a = 5, b = 2;
        double resultado;
        resultado = a/b;
        System.out.println(resultado);

        //casting explicito resultado = 2,5
        int a2 = 5, b2 = 2;
        double resultado2;
        resultado2 = (double) a/b;
        System.out.println(resultado2);

        Scanner sc = new Scanner(System.in); //para entrada de dados
        // variavel = sc.next(); para string
        // variavel = sc.nextLine(); para string para ler ate a quebra de linha
        // variavel = sc.next().charAt(0); para char
        // variavel = sc.nextInt(); e variavel = sc.nextDouble();

        int variavel1;
        String variavel2, variavel3;

        System.out.println("Digite um numero e 2 palavras ou texto: ");
        variavel1 = sc.nextInt();
        sc.nextLine(); // para não dar erro no next line (quebra de linha pendente)
        variavel2 = sc.nextLine();
        variavel3 = sc.nextLine();

        //variavel sem tipo tipo explicito
        var variavel4 = 10;

        sc.close(); //fechar scanner

    }
}