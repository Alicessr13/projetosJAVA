public class ContaBanco {
    //atributos
    public int numConta;
    protected String tipo;
    private String dono;
    private double saldo;
    private boolean status;

    //metodos personalizados
    public ContaBanco(){
        this.setStatus(false);
        this.setSaldo(0);
    }
    public void abrirConta(String tipo){
        this.setTipo(tipo);
        this.setStatus(true);
        if(this.tipo.equalsIgnoreCase("cp")){
            this.setSaldo(150);
            System.out.println("Conta aberta com sucesso!");
        }else if (this.tipo.equalsIgnoreCase("cc")){
            this.setSaldo(50);
            System.out.println("Conta aberta com sucesso!");
        }else{
            System.out.println("ERRO: a conta tem q ser cp(poupança) ou cc(corrente)");
            this.setStatus(false);
        }
    }

    public void fecharConta(){
            if(this.saldo>0) System.out.println("Conta não pode ser fechada porque ainda tem saldo");
            else if (this.saldo<0) System.out.println("Saldo negativo, nao e possivel fechar a conta");
            else{
                this.setStatus(false);
                System.out.println("Conta fechada");
            }
    }

    public void depositar(double deposito){
        if(this.getStatus()){
            //this.saldo+=deposito;
            this.setSaldo(this.getSaldo()+deposito);
            System.out.println("Deposito realizado com sucesso na conta: "+this.getNumConta());
        }else System.out.println("ERRO: impossivel depositar");

    }

    public void sacar(double saque){
        if(this.getStatus()){
            if (this.getSaldo()>=saque){
                //this.saldo -= saque;
                this.setSaldo(this.getSaldo()-saque);
                System.out.println("Saque realizado com sucesso na conta: "+this.getNumConta());
            }
            else System.out.println("Saldo insuficiente para saque");
        }else System.out.println("ERRO: impossivel sacar");

    }

    public void pagMensalidade(){
        int mensalidade=0;
        if(this.tipo.equals("cc")) mensalidade =12;
        else if (this.tipo.equals("cp")) mensalidade = 20;

        if(this.status && this.getSaldo()>mensalidade){
            this.setSaldo(this.getSaldo()-mensalidade);
            System.out.println("Mensalidade paga com sucesso");
        }else System.out.println("ERRO: impossivel pagar mensalidade");
    }

    public void estadoAtual(){
        System.out.println("-------------------------------");
        System.out.println("Numero da conta: "+this.getNumConta());
        System.out.println("Tipo da conta: "+this.getTipo().toUpperCase());
        System.out.println("Dono da conta: "+this.getDono());
        System.out.println("Saldo da conta: "+this.getSaldo());
        System.out.println("Status da conta: "+this.getStatus());
    }

    //metodos especiais getters e setters
    public int getNumConta(){
        return this.numConta;
    }public void setNumConta(int numConta){
        this.numConta = numConta;
    }

    public String getTipo(){
        return this.tipo;
    }public void setTipo(String tipo){
        this.tipo = tipo;
    }

    public String getDono(){
        return this.dono;
    }public void setDono(String dono){
        this.dono = dono;
    }

    public double getSaldo(){
        return this.saldo;
    }public void setSaldo(double saldo){
        this.saldo = saldo;
    }

    public boolean getStatus(){
        return this.status;
    }public void setStatus(boolean status){
        this.status = status;
    }
}
