public class Person {
    String fullName ;
    int age;
    String gender;

    public Person(String fullName, int age, String gender) {
        this.fullName = fullName;
        this.age = age;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Person{" +
                "fullName='" + fullName + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                '}';
    }
}

