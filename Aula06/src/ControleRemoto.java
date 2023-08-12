public class ControleRemoto implements Controlador {
    private int volume;
    private boolean ligado;
    private boolean tocando;

    public ControleRemoto() {
        this.volume = 50;
        this.ligado = false;
        this.tocando = false;
    }

    private int getVolume() {
        return volume;
    }

    private void setVolume(int volume) {
        if (volume > 100){
            System.out.println("The max volume is 100");
            this.volume = 100;
        } else if (volume < 0){
            System.out.println("The min volume is 0");
            volume = 0;
        } else {
            this.volume = volume;
        }
    }

    private boolean isLigado() {
        return ligado;
    }

    private void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    private boolean isTocando() {
        return tocando;
    }

    private void setTocando(boolean tocando) {
        this.tocando = tocando;
    }

    // abstract methods
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

        System.out.println(">>>>>>>>>>>>>>>>>> MENU <<<<<<<<<<<<<<<<<<<<");
        System.out.println("Está ligado? " + this.isLigado());
        System.out.println("Está tocando? " + this.isTocando());
        System.out.println("Volume: " + this.getVolume());
        for (int i=10; i <= 100; i+=10) System.out.print(" "+i+" ");
        System.out.println("");
        for (int i=10; i <= this.getVolume(); i+=10){
            if (i == 100){
                System.out.print("[***]");
            } else {
                System.out.print("[**]");
            }
        }
        for (int i=10; i <= (100 - this.getVolume()); i+=10){
            if (i == (100 - this.getVolume())){
                System.out.print("[   ]");
            } else System.out.print("[  ]");
        }

        System.out.println("");
    }

    @Override
    public void fecharMenu() {
        System.out.println("Fechando Menu...");
    }

    @Override
    public void maisVolume() {
        if (this.isLigado()) this.setVolume(this.getVolume() + 10);
    }

    @Override
    public void menosVolume() {
        if (this.isLigado()) this.setVolume(this.getVolume() - 10);
    }

    @Override
    public void ligarMudo() {
        if (this.isLigado() && this.getVolume() > 0) this.setVolume(0);
    }

    @Override
    public void deligarMudo() {
        if (this.isLigado() && this.getVolume() == 0) this.setVolume(10);
    }

    @Override
    public void play() {
        if (this.isLigado() && !(this.isTocando())) this.setTocando(true);
    }

    @Override
    public void pause() {
        if (this.isLigado() && this.isTocando()) this.setTocando(false);
    }

}
