public class Caneta {
    private String modelo;
    private double ponta;
    private boolean tampada;
    private String cor;

    public Caneta(String modelo, String cor, double ponta){ //metodo construtor tem o mesmo nome da classe
        this.tampar();
        this.setModelo(modelo);
        this.setCor(cor);
        this.setPonta(ponta);
    }

    public String getCor() {
        return this.cor;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }

    public boolean getTampada() {
        return this.tampada;
    }

    public void setTampada(boolean tampada) {
        this.tampada = tampada;
    }

    public String getModelo(){
        return this.modelo;
    }
    public void setModelo(String m){
        this.modelo = m;
    }

    public double getPonta(){
        return this.ponta;
    }
    public void setPonta(double p){
        this.ponta = p;
    }

    public void tampar(){
        this.tampada = true;
    }
    public void destampar(){
        this.tampada = false;
    }

    public void status(){
        System.out.println("Sobre a caneta: ");
        System.out.println("MODELO: " + this.getModelo());
        System.out.println("PONTA: " + this.getPonta());
        System.out.println("COR: "+this.cor);
        System.out.println("TAMPADA: "+this.tampada);
    }
}
