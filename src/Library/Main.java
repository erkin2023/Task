package Library;

public class Main {
    public static void main(String[] args) {
//        1) library
        Task task = new Task("Toigonbaev erkin ", 2023, "Юридический ", "2002.08.14", 709095524);
        System.out.println("\n "+task.takeBook(3));
        System.out.println("\n "+task.returnBook());
    }
}
