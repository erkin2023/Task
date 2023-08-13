package Conpany;

public class Main {
    public static void main(String[] args) {
        Conpany.PersonGroup person = new Conpany.PersonGroup("erkin"," toigonbaev ","2002.08.14");
        Conpany.PersonGroup person2 = new Conpany.PersonGroup("erkin"," toigonbaev ","2002.08.14");
        Conpany.Group group1 = new Conpany.Group("expert of запуск ","1980","Илон Макс");
        Conpany.Group group2 = new Conpany.Group("Satellite Deployment","1985", "Gwynne Shotwell");
        Conpany.Group[] groupsArray = {group1, group2};
        Company spaceX = new Company("SpaceX", "USA", 2002, "Elon Musk",groupsArray,"fdgfdsg");
        System.out.println(spaceX);
    }
}
