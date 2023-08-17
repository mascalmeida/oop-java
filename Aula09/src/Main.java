public class Main {
    public static void main(String[] args) {
        Pessoa p = new Pessoa("Lucas", 28, "M");
        Pessoa a = new Pessoa("Ariano", 80, "M");
        Livro l = new Livro("O auto da compadecida", a, 325, 0, false, p);
        l.detalhes();
        l.abrir();
        for (int i = 0; i < 10; i++) {
            l.avancarPag();
        }
        l.fechar();
        l.voltarPag();
        l.abrir();
        l.voltarPag();
        l.detalhes();
    }
}