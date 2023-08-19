public class Main {
    public static void main(String[] args) {
        Cachorro c[] = new Cachorro[4];
        c[0] = new Cachorro(6.3f, 3, 4, "caramelo");
        c[0].emitirSom();
        c[0].reagir();
        c[1] = new Cachorro(12.1f, 9, 4, "negão");
        c[1].reagir("positiva");
        c[1].reagir("oi auau");
        c[2] = new Cachorro(9.9f, 5, 4, "dalmata");
        c[2].reagir(23);
        c[2].reagir(-1);
        c[2].reagir(25);
        c[3] = new Cachorro(0.0000001f, 100000, 4, "branco");
        c[3].reagir(false);
        c[3].reagir(true);
    }
}