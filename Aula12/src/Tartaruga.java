public class Tartaruga extends Reptil {
    public Tartaruga(float peso, int idade, int membros, String cor) {
        super(peso, idade, membros, cor);
    }
    @Override
    public void locomover(){
        System.out.println("andando devagarinho...");
    }
}
