public class Mamifero extends Animal {
    protected String cor;

    public Mamifero(float peso, int idade, int membros, String cor) {
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
    public void emitirSom() {
        System.out.println("som de mamífero");
    }
}
