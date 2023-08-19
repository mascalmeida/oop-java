public class Ave extends Animal {
    protected String cor;

    public Ave(float peso, int idade, int membros, String cor) {
        super(peso, idade, membros);
        this.cor = cor;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    @Override
    public void locomover() {
        System.out.println("voando");
    }

    @Override
    public void alimentar() {
        System.out.println("bicando");
    }

    @Override
    public void emitirSom() {
        System.out.println("piando");
    }

    public void ninho(){
        System.out.println("Fazendo ninho...");
    }
}
