package lesson_27.test;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.*;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;           // позволяет писать асершенс без обращения к классу

class ExampleTest {
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
    @ValueSource(strings = {"apple", "banana", "cherry", "fig"})   // в массив можно передать значение одного типа
    public void testFruits(String fruit) {
        System.out.println("Current fruit: " + fruit);
        Assertions.assertTrue(fruit.length() > 2); // длина должна быть больше 2!
    }

    @ParameterizedTest
    @ValueSource(ints = {1, 2, -1, 4, 5})
        // тест будет выполнен 5 раз, каждый раз будет присвоено по очереди 1 цирфа
        // так как мы в цикле указали -1 - тест не прошел (мы ожидали тру, а она выдала фолсо)
    void testInts(int value) {
        System.out.println("current int: " + value);
        Assertions.assertTrue(value > -10); // было Assertions.assertTrue(value < 0);
    }

    @ParameterizedTest
    @EnumSource(TestEnum.class)
        // в качестве источника будет набор констант из перечисления
    void testEnum(TestEnum value) {

        System.out.println("EnumSource: " + value);
        assertNotNull(value);
    }
// источник данных в формате CSV - значение разделенное запятой - спец структура для организации табличнх данных

    @ParameterizedTest   // считывает данные строками. если в строке несколько данных можно получить их набором
    @CsvSource({"apple, 1", " banana, 2", "cherry,3"})
        // внутри ковычек пара данных, в ковычках 1 строка
    void testWithCsvSource(String fruit, int rank) {   // хочу получать данные попрано
        System.out.println("fruit: " + fruit);
        System.out.println("rank: " + rank);
        Assertions.assertNotNull(fruit);
        assertTrue(rank > 0);
    }


    @ParameterizedTest
    @CsvFileSource(resources = "data.csv")
    void testWithFileSource(String fruit, int rank, boolean flag) {
        System.out.println("fruit + rank  + flag:" + fruit + " | " + (rank + 10) + " | " + !flag);
        assertTrue(fruit.length() > 4 && rank > 0);
    }

    // статические методы для получения значений

    @ParameterizedTest
    @MethodSource("TestMethodSource")
    void testDataFromMethod(String fruit) {
        System.out.println("fruit: " + fruit);
        assertNotNull(fruit); // фрукт не равен налу
    }

    static Stream<String> TestMethodSource() {
        return Stream.of("banana", "cherry", "orange");  // будет получен поток стрингов и каждое значение будет подсаавлено во фрукт
    }

    // можно пердавать разнатипные анные
    @ParameterizedTest
    @MethodSource("squareTestData")
    void testSquare(int input, int expected, boolean isEqual) {   // одним пакетом передать 2 инта и буль
        System.out.println(input + " | " + expected + " | " + isEqual);
        int result = input * input;
        assertEquals(isEqual, result == expected);
    }

    static Stream<Arguments> squareTestData() {    // разнашерстные наборы данных обьеденяет
        return Stream.of(
                Arguments.of(2, 4, true),   // набор значений которые будут приземлены в каждый
                Arguments.of(3, 9, true),
                Arguments.of(4, 15, false)
        );
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