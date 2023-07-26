package exe.nonmaterial;

public class Main {
    public static void main(String[] args){
        officeday d1 = new officeday();
        d1.day = "Tuesday";
        d1.location = "Thome de Souza Building - Salvador Office";
        d1.meeting = false;

        d1.agenda();

        d1.schedule();
        d1.roomnumber = 20;
        d1.schedule();

        d1.agenda();

        d1.cancel();
        d1.roomnumber = 0;
        d1.cancel();

        d1.agenda();
    }
}