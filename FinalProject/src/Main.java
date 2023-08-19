public class Main {
    public static void main(String[] args) {
        Video v1 = new Video("Live");
        v1.info();

        Gafanhoto p1 = new Gafanhoto("Ola", 21, "F", "hello");
        p1.perfil();

        Visualizacao f1 = new Visualizacao(p1, v1);
        f1.status();
    }
}