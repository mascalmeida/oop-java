public class Lobo extends Mamifero {

    public Lobo(float peso, int idade, int membros, String cor) {
        super(peso, idade, membros, cor);
    }

    @Override
    public void emitirSom() {
        System.out.println("auuuuuuuuu...");
    }
}
