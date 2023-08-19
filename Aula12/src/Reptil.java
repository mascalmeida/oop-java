public class Reptil extends Animal {
    protected String cor;

    public Reptil(float peso, int idade, int membros, String cor) {
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
        System.out.println("rastejando");
    }

    @Override
    public void alimentar() {
        System.out.println("vegetais e carnes");
    }

    @Override
    public void emitirSom() {
        System.out.println("emitindo som...");
    }
}
