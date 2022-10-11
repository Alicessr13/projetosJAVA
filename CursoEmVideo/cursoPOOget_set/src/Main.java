public class Main {
    public static void main(String[] args) {
        Caneta c1 = new Caneta("BIC", "Vermelha", 0.6);
        //c1.setModelo("BIC");
        //c1.setPonta(0.5);
        c1.status();
        //System.out.println("Tenho uma caneta "+c1.getModelo()+" de ponta "+c1.getPonta());
        System.out.println();
        Caneta c2 = new Caneta("Faber", "Preta",1.0);
        c2.status();
    }
}