package Person;

public class Main {
    public static void main(String[] args) {
        Person [] people = new Person[5];
        Person person1= new Person("Erkin toi",21,"men");
        Person person2= new Person("nurles",20,"men");
        Person person3= new Person("adelya",24,"woman");
        Person person4= new Person ("tunuk",17,"woman");
        Person person5= new Person("farida ",19,"woman");
        System.out.println(person1+"\n "+ person2+ " \n"+ person3+" \n"+person4+"\n "+person5);

        // Assigning values to the array elements
        people[0] = person1;
        people[1] = person2;
        people[2] = person3;
        people[3] = person4;
        people[4] = person5;
        System.out.println(maxage(people));
        System.out.println(minage(people));

    }public static Person minage(Person[] persons){
        System.out.println("минимальный возраст ");
        Person person = persons[0];
        for (int i = 0; i < persons.length ; i++) {
            if (persons[i].age<person.age){
                person=persons[i];

            }
        }
        return person;

    }
    public static Person maxage(Person[] persons){
        Person person = persons[0];
        System.out.println("максимальный  возраст ");
        for (int i = 0; i < persons.length ; i++) {
            if (persons[i].age>person.age){
                person=persons[i];

            }
        }
        return person;
    }
}
