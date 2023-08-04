package exe.material;
public class Main {
    public static void main(String[] args) {
        car c1 = new car();
        c1.model = "March";
        c1.year = 2014;
        c1.km = 94000.5f;
        c1.status = "Available";

        c1.description();
        c1.sale();
        c1.description();

    }
}