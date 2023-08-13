package Task1;

import java.time.LocalDate;

public class Student {
    String name;
    LocalDate dateOfBirth;
    int PhoneNumber;
    String nationality;

    public Student(String name, LocalDate dateOfBirth, int phoneNumber, String nationality) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        PhoneNumber = phoneNumber;
        this.nationality = nationality;
    }
    public Student (){

    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", PhoneNumber=" + PhoneNumber +
                ", nationality='" + nationality + '\'' +
                +'}'+"\n";
    }
}
