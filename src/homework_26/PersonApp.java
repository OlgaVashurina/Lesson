package homework_26;

import lesson_26.persons.Person;

public class PersonApp {
    public static void main(String[] args) {
        Person person = new Person("email", "password");
        System.out.println(person);
        System.out.println(person.getPassword());

        person.setEmail("ovashurina@gmail.com");
        System.out.println(person.getEmail());

        person.setEmail(".@gmail.com");
        System.out.println(person.getEmail());

    }
}
