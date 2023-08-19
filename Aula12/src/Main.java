public class Main {
    public static void main(String[] args) {
        Mamifero m1 = new Mamifero(18.4f, 2, 4, "marisco");
        m1.locomover();
        m1.alimentar();
        m1.emitirSom();
        Reptil r1 = new Reptil(5.1f, 7, 4, "cinza");
        r1.locomover();
        r1.alimentar();
        r1.emitirSom();
        Peixe p1 = new Peixe(2.8f, 1, 0, "vermelhinho");
        p1.locomover();
        p1.alimentar();
        p1.emitirSom();
        p1.bolhas();
        Ave a1 = new Ave(1.9f, 4, 2, "branco");
        a1.locomover();
        a1.alimentar();
        a1.emitirSom();
        a1.ninho();
    }
}