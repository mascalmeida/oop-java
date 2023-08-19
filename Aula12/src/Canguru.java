public class Canguru extends Mamifero {
    public Canguru(float peso, int idade, int membros, String cor) {
        super(peso, idade, membros, cor);
    }
    public void usarBolsa(){
        System.out.println("colocando um filhote na bolsa...");
    }
    @Override
    public void locomover(){
        System.out.println("saltando");
    }
}
