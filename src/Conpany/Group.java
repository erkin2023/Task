package Conpany;

import java.time.LocalDate;

public class Group {
    String groupName;
    String starDate;
    String mentor;
    String person ;

    public Group(String groupName, String starDate, String mentor) {
        this.groupName = groupName;
        this.starDate = starDate;
        this.mentor = mentor;
    }

    @Override
    public String toString() {
        return "Conpany.Group{" +
                "groupName='" + groupName + '\'' +
                ", starDate=" + starDate +
                ", mentor='" + mentor + '\'' +
                ", person='" + person + '\'' +
                '}';
    }
}

