package Task1;

import java.time.LocalDate;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
    Student student1 = new Student("Erkin", LocalDate.of(2002,9,14),509095524,"Kg");
    Student student2 = new Student("Jon", LocalDate.of(2002,9,14),509095524,"USA");
    Student student3 = new Student("Violeta", LocalDate.of(2002,9,14),509095524,"ES");
    Student student4 = new Student("Synada", LocalDate.of(2002,9,14),509095524,"JP");
    Student student5 = new Student("AdylHakim", LocalDate.of(2002,9,14),509095524,"EG");
    Student [] students = {student1,student2,student3,student4,student5};
    System.out.println(Arrays.toString(students));

    }
}
