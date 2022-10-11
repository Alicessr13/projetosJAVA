public class Main {
    public static void main(String[] args) {
        ContaBanco c1 = new ContaBanco();
        c1.setNumConta(100);
        c1.setDono("Alice");
        c1.abrirConta("CC");

        ContaBanco c2 = new ContaBanco();
        c2.setNumConta(333);
        c2.setDono("Malia");
        c2.abrirConta("cp");

        c1.depositar(100);
        c2.depositar(500);

        c2.sacar(100);

        c1.estadoAtual();
        c2.estadoAtual();

    }
}