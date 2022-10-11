import java.util.Scanner;

public class Calculos {

    private double medias;
    private double variancia;
    private double numero;
    private double result;
    private double resultVar;
    private double resultCoe;

    Scanner scan = new Scanner(System.in);

    public double media(int num){
        this.setMedias(0);
        this.setNumero(0);
        this.setResult(0);
        for (int i = 0; i < num; i++) {
            System.out.println("Numero: ");
            this.setNumero(scan.nextDouble());
            this.setMedias(this.getMedias() + this.getNumero());
        }
        this.setResult(this.getMedias()/num);
        return this.getResult();
    }

    public double variancia(int num){
        this.setMedias(0);
        this.setVariancia(0);
        this.setNumero(0);
        this.setResultVar(0);
        this.setResult(0);
        double[] vetor = new double[num];
        for (int i = 0; i < num; i++) {
            System.out.println("Numero: ");
            this.setNumero(scan.nextDouble());
            this.setMedias(this.getMedias() + this.getNumero());
            vetor[i] = this.getNumero();
        }
        this.setResult(this.getMedias()/num);

        for (int i = 0; i < num; i++) {
            if (vetor[i] >= this.getResult()) {
                this.setResultVar(vetor[i] - this.getResult());
            } else {
                this.setResultVar(this.getResult() - vetor[i]);
            }
            this.setVariancia(this.getVariancia()+Math.pow(this.getResultVar(), 2));
        }
        this.setResult(this.getVariancia()/ num);
        return this.getResult();
    }

    public double desvioPadrao(int num){
        this.setMedias(0);
        this.setVariancia(0);
        this.setNumero(0);
        this.setResultVar(0);
        this.setResult(0);
        double[] vetor = new double[num];
        for (int i = 0; i < num; i++) {
            System.out.println("Numero: ");
            this.setNumero(scan.nextDouble());
            this.setMedias(this.getMedias() + this.getNumero());
            vetor[i] = this.getNumero();
        }
        this.setResult(this.getMedias()/num);
        double v;
        for (int i = 0; i < num; i++) {

            if (vetor[i] >= this.getResult()) {
                v = vetor[i] - this.getResult();
            } else {
                v = this.getResult() - vetor[i];
            }
            this.setVariancia(this.getVariancia()+Math.pow(v, 2));
        }
        this.setResultVar(this.getVariancia()/ num);
        this.setResult(Math.sqrt(this.getResultVar()));
        return this.getResult();
    }

    public double coeficientePad(int num){
        this.setResultCoe(0);
        this.setMedias(0);
        this.setVariancia(0);
        this.setNumero(0);
        this.setResultVar(0);
        this.setResult(0);
        double[] vetor = new double[num];
        for (int i = 0; i < num; i++) {
            System.out.println("Numero: ");
            this.setNumero(scan.nextDouble());
            this.setMedias(this.getMedias() + this.getNumero());
            vetor[i] = this.getNumero();
        }
        this.setResult(this.getMedias()/num);
        double v;
        for (int i = 0; i < num; i++) {

            if (vetor[i] >= this.getResult()) {
                v = vetor[i] - this.getResult();
            } else {
                v = this.getResult() - vetor[i];
            }
            this.setVariancia(this.getVariancia()+Math.pow(v, 2));
        }
        this.setResultVar(this.getVariancia()/ num);
        this.setResultCoe(((Math.sqrt(this.getResultVar()))/this.getResult())*100);
        return this.getResultCoe();
    }

    public void setMedias(double medias){
        this.medias = medias;
    }
    public double getMedias(){
        return this.medias;
    }

    public void setNumero(double numero){
        this.numero = numero;
    }
    public double getNumero(){
        return this.numero;
    }

    public void setResult(double result){
        this.result = result;
    }
    public double getResult(){
        return this.result;
    }

    public void setVariancia(double variancia){
        this.variancia = variancia;
    }
    public double getVariancia(){
        return this.variancia;
    }

    public void setResultVar(double resultVar){
        this.resultVar = resultVar;
    }
    public double getResultVar(){
        return this.resultVar;
    }

    public void setResultCoe(double resultCoe){
        this.resultCoe = resultCoe;
    }
    public double getResultCoe(){
        return this.resultCoe;
    }
}
