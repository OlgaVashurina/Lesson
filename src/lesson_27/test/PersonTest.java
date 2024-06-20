package lesson_27.test;

import lesson_27.Person;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PersonTest {

    Person person;
    String startEmail = "join@gmail.com ";
    String startPassword = "qwerty1Q$";


    @BeforeEach
    void setUp() {
        person = new Person(startEmail, startPassword);

    }

    @Test
    void testValidEmail() {    // метод для проверки валидного емейл
        String validEmail = "valid@test.com";   // отправили в прогу валидный эмейл
        System.out.println("getEmail Before: " + person.getEmail());

        person.setEmail(validEmail);

        System.out.println("get:" + person.getEmail());
        Assertions.assertEquals(validEmail, person.getEmail());  // ожидаемы и фактический результат

    }

    // стартовый сравнить с фактическим и передать варианты не валидных эмейлов
}
