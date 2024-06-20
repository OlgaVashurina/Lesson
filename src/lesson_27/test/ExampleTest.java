package lesson_27.test;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;           // позволяет писать асершенс без обращения к классу

class PersonTest {
    // метод помеченный это йанатацией выполняется перед каждым тестом (каждым тестовым методом)
    @BeforeEach   // метод помечанный этой анатацией будет запускаться везде. Ничего не запускает
    public void setUp() {
        System.out.println("Method  @BeforeEach");
    }

    /*

@BeforeAll -- будет запускаться только 1 раз, перед выполнением первого теста. (запускается разово только перед первым)
@AfterEach -- после каждого (выполняется после каждого тестового метода
@AfterAll -- после всем методов тестовых запускается
@Disabled --// ВЫКЛЮЧИТЬ ТЕСТ ИЗ ГУРППЫ ТЕСТОВ указывает что тест или группа тестов отключены и выполнятся не будут
@Nested -- позволяет создавать вложенный тестовый класс, может быть использована для группировки каких то групп тетсов

 */
    @Test
    public void testAddition() {
        int result = 2 + 2;


        Integer[] array = {1, 23, 4, 5, 6, 76, null, 8, 9, 6, 6, 0};  // массив интеджерс

        Assertions.assertEquals(4, result); // РАВЕНСТВО проверяет равны ли 2 значения (проверка на равенства ожидаемого результат с фактическим)
        Assertions.assertNotEquals(5, result); // НЕРАВЕНСТВО тест будет пройден - этот метод принимаает анекспектет, принимает не ожидаемый результат(тест пройден если не ожидаемый результат не совпадет с ФАКТИЧЕСКИМ)
        assertTrue(result <= 4); // УСЛОВИЕ ИСТИННО проверяет что условие верно условие- возвращает тру
        assertFalse(result > 5);  //УСЛОВИЕ ЛОЖНО
        assertNotNull("String");   // проверяет что условие не равен налл
        assertNotNull(array[5]); // проверяет что обьект равен налу

    }

    @Disabled   // ВЫКЛЮЧИТЬ ТЕСТ ИЗ ГУРППЫ ТЕСТОВ указывает что тест или группа тестов отключены и выполнятся не будут
    @Test
    public void emptyTest() {
        assertEquals(5, 10);
    }

    @ParameterizedTest
    // один и тоже тест с разными аргументами( у параметризированных тестов всегда будет исочник для проведения теастов)
    //массивы принимающие строки . числа. булен . целые и с плав точкой
    // анотация позволя выполнить 1 тест несколько раз с разыми аргументами
    // метод перезапускается целиком по очереди
    @ValueSource(strings = {"apple", "banana", "cherry", "fig"})
    public void testFruits(String fruit) {
        System.out.println("Current fruit: " + fruit);
        Assertions.assertTrue(fruit.length() > 2); // длина должна быть больше 2!
    }

    @ParameterizedTest
    @ValueSource(ints = {1, 2, -1, 4, 5})    // тест будет выполнен 5 раз, каждый раз будет присвоено по очереди 1 цирфа
    // так как мы в цикле указали -1 - тест не прошел (мы ожидали тру, а она выдала фолсо)
    void testInts(int value) {
        System.out.println("current int: " + value);
        Assertions.assertTrue(value > -10);
    }

    @Disabled
    @Nested                     // можно запустить методы пачкой !!!!!!!!!!!!
    class NestedTest {

        @BeforeEach
        public void setStartValue() {
            System.out.println("Nested Before Each");
        }

        @Test
        void testNested() {
            Assertions.assertNotEquals(5, 10);
        }

        @Test
        void testNested2() {
            assertNotNull("Java");
        }
    }
}