public class ControleRemoto implements Controlador {
    private int volume;
    private boolean ligado;
    private boolean tocando;

    public ControleRemoto(){
        setVolume(50);
        setLigado(false);
        setTocando(false);
    }

    private void setVolume(int volume){
        this.volume = volume;
    }public int getVolume(){
        return this.volume;
    }
    public void setLigado(boolean ligado){
        this.ligado = ligado;
    }public boolean getLigado(){
        return this.ligado;
    }
    public void setTocando(boolean tocando){
        this.tocando = tocando;
    }public boolean getTocando(){
        return this.tocando;
    }

    @Override
    public void ligar() {
        this.setLigado(true);
    }

    @Override
    public void desligar() {
        this.setLigado(false);
    }

    @Override
    public void abrirMenu() {
        if(this.getLigado()){System.out.println("-------MENU-------");
        System.out.println("Esta ligado? "+this.getLigado());
        System.out.println("Esta tocando? "+this.getTocando());
        System.out.print("Volume: "+this.getVolume());
        for (int i=0; i<=this.getVolume();i+=10){
            System.out.print(" |");
        }
        System.out.println();
        }else System.out.println("Impossivel abrir o menu");
    }

    @Override
    public void fecharMenu() {
        if(this.getLigado())System.out.println("Fechando menu...");
        else System.out.println("Impossivel fechar o menu");
    }

    @Override
    public void maisVolume() {
        if(this.getLigado()){
            this.setVolume(this.getVolume()+1);
        }else System.out.println("Impossivel diminuir volume");
    }

    @Override
    public void menosVolume() {
        if(this.getLigado()){
            this.setVolume(this.getVolume()-1);
        }else System.out.println("Impossivel diminuir volume");
    }

    @Override
    public void ligarMudo() {
        if(this.getLigado() && this.getVolume()>0){
            this.setVolume(0);
        }else System.out.println("Impossivel mutar");
    }

    @Override
    public void desligarMudo() {
        if(this.getLigado() && this.getVolume()==0){
            this.setVolume(20);
        }else System.out.println("Impossivel desmutar");
    }

    @Override
    public void play() {
        if(this.getLigado() && !(this.getTocando())){
            this.setTocando(true);
        }else System.out.println("Impossivel reproduzir");
    }

    @Override
    public void pause() {
        if(this.getLigado() && this.getTocando()){
            this.setTocando(false);
        }else System.out.println("Impossivel pausar");
    }
}
