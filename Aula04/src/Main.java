// Class 04
public class Main {
    public static void main(String[] args) {
        Caneta c1 = new Caneta("Compactor", 1.0f, "Preta", true);
        c1.status();
        c1.setModelo((String) "brw");
        c1.setPonta((float) 0.7f);
        c1.status();
    }
}