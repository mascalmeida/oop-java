public class Peixe extends Animal {
    protected String cor;

    public Peixe(float peso, int idade, int membros, String cor) {
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
        System.out.println("nadando");
    }

    @Override
    public void alimentar() {
        System.out.println("carnes e vegetais");
    }

    @Override
    public void emitirSom() {
        System.out.println("silêncio...");
    }
    public void bolhas(){
        System.out.println("soltando bolha...");
    }
}
