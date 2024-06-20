package lesson_26.persons;


import java.util.Scanner;

public class PersonApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите email: ");
        String email = scanner.nextLine();

        System.out.print("Введите пароль: ");
        String password = scanner.nextLine();

        Person person = new Person(email, password);

        boolean isEmailValid = person.getEmail() != null;
        boolean isPasswordValid = person.getPassword() != null;

        if (isEmailValid && isPasswordValid) {
            System.out.println("Пароль и email приняты.");
        } else {
            if (!isEmailValid) {
                System.out.println("Email не принят.");
            }
            if (!isPasswordValid) {
                System.out.println("Пароль не принят.");
            }
        }
        System.out.println(person);
        System.out.println("Password: " + person.getPassword());
    }
}