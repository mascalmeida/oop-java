package exe.nonmaterial;

public class officeday {
    String day;
    String location;
    boolean meeting;
    int roomnumber;

    void agenda(){
        System.out.println("Day to go to the office is " + this.day);
        System.out.println("Local: "+ this.location);
        System.out.println("Is there any meeting? " + this.meeting);
        System.out.println("The work room is " + this.roomnumber);
    }

    void schedule(){
        if (this.meeting == false){
            this.meeting = true;
            System.out.println("Meeting scheduled!");
        } else {
            System.out.println("Don't worry. The meeting has already scheduled!");
        }
    }

    void cancel(){
        if (this.meeting == true){
            this.meeting = false;
            System.out.println("Meeting canceled!");
        } else {
            System.out.println("Don't worry. There isn't any meeting.");
        }
    }
}
