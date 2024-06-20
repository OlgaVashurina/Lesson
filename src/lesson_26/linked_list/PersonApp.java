package lesson_26.linked_list;

public class PersonApp {
    public static void main(String[] args) {
        Person person = new Person("email", "password");

        System.out.println(person);
        System.out.println(person.getPassword());

    }
}