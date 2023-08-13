package Library;

import java.time.LocalDate;
import java.util.Arrays;

public class Task {
    String fullName ;
    int libraryCardNumber ;
    String faculty ;
    String dateOfBirth;
    long phoneNumber ;
    int books;

    public Task(String fullName, int libraryCardNumber, String faculty, String dateOfBirth, long phoneNumber) {
        this.fullName = fullName;
        this.libraryCardNumber = libraryCardNumber;
        this.faculty = faculty;
        this.dateOfBirth = dateOfBirth;
        this.phoneNumber = phoneNumber;
        System.out.println("Полное имя : "+fullName +"\n "+"Библеотечная карта "+ libraryCardNumber+"\n "+faculty +"Дата рождение : "+ dateOfBirth+"\nTel number : "+phoneNumber);
    }
    public String takeBook(int book){
        this.books=book;
        return fullName + "взял "+ books;

    }
public String returnBook(){
        return faculty + "Вернул "+ books;
}
}
