package aula02;
public class Main {
    public static void main(String[] args) {
        Caneta c1 = new Caneta();

        c1.modelo = "BIC";
        c1.cor = "Azul";
        // c1.ponta = 0.5f;
        c1.carga = 50;
        c1.tampar();
        c1.status();
        c1.rabiscar();
        c1.destampar();
        c1.status();
        c1.rabiscar();
    }
}