public class Caneta {
    public String modelo, cor;
    private double ponta;
    protected int carga;
    private boolean tampada;

    public void status (){
        System.out.println("Uma caneta "+this.cor);
        System.out.println("Modelo: "+this.modelo);
        System.out.println("Ponta: "+this.ponta);
        System.out.println("Carga: "+this.carga);
        System.out.println("Esta tampada? "+this.tampada);
    }
    public void rabiscar(){
        if(tampada == true){
            System.out.println("A caneta esta tampada! ");
        }else{
            System.out.println("Rabiscando....");
        }
    }

    protected void tampar(){
        this.tampada = true;
    }

    protected void destampar(){
        this.tampada = false;
    }
}
