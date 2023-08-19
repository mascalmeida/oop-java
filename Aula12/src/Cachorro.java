public class Cachorro extends Mamifero {
    public Cachorro(float peso, int idade, int membros, String cor) {
        super(peso, idade, membros, cor);
    }
    public void enterrarOsso(){
        System.out.println("Enterrando osso...");
    }
    public void abanarRabo(){
        System.out.println("Abanando o rabo...");
    }
}
