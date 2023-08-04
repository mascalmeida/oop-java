package exe.material;

public class car {
    String model;
    int year;
    float km;
    String status;


    void description(){
        System.out.println("Model: " + this.model);
        System.out.println("Year: " + this.year);
        System.out.println("km: " + this.km);
        System.out.println("Status: " + this.status);
    }

    void sale(){
        if (this.status == "Available"){
            this.status = "Sold";
            System.out.println("The car " + this.model + " was sold");
        } else {
            System.out.println("The car " + this.model + " isn't available");
        }
    }
}
