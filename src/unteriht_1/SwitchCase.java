package unteriht_1;

import java.util.Scanner;

public class SwitchCase {
    static Scanner scanner = new Scanner(System.in); // Общий Scanner для всех методов

    public static void main(String[] args) {
        // if else
        int a = 15, b = 10, c = 12, d = 22;
        char sym1 = 'A', sym2 = 'a';
        boolean isHasCar = false;
        if (a > b) {
            System.out.println("a > b верно");
        }
        if (c < d) {
            System.out.println("c < d верно");
        }
        if (sym1 != sym2) {
            System.out.println("sym1 не равно sym2");
        }
        if (!isHasCar) {   // Эквивалентно (isHasCar != true)
            System.out.println("верно");
        }
        Main1();
    }

    public static void Main1() {
        Boolean isHasCar1 = false;
        int a = 15, b = 10;
        if (isHasCar1) {
            System.out.println("isHasCar1 - Верно");
        } else if (a >= b) {
            System.out.println("a >= b еще 1 тест");
        } else {
            System.out.println("isHasCar1 - Не верно");
        }
        Main2();
    }

    public static void Main2() {
        Boolean isHasCar1 = true;
        int a = 9, b = 10;
        char sym1 = 'A', sym2 = 'a';
        if (isHasCar1 || a == b || sym1 != sym2) {  // if (isHasCar1 && a == b) и/или
            System.out.println("isHasCar1 - Верно");
            if (a == b) {
                System.out.println();
            } else if (a >= b) {
                System.out.println(" 1 тест");
            } else if (a > b) {
                System.out.println(" 2 тест");
            } else if (a <= b) {
                System.out.println("3 тест");
            } else {
                System.out.println("isHasCar1 - Не верно");
            }
        }
        Main3();
    }

    public static void Main3() {
        System.out.print("Введите роль: ");
        String role = scanner.nextLine();
        System.out.println("Введите пароль: ");
        String pass = scanner.nextLine();
        if (role.equalsIgnoreCase("Admin") && pass.equalsIgnoreCase("123456")) {   // у строки role.equalsIgnoreCase - существует метод сравни и проигнорируй аперкейс
            System.out.println("Все пользователи");
        } else {
            System.out.println("Привет как вас зовут?");
            String name = scanner.nextLine();
            System.out.println("Привет " + name);
        }
        Main4();
    }

    static void Main4() {
        // switch case
        // можно проверить только четкое значенеи, четкое совпадение!!!
        // есть оператор дефолт
        System.out.println("Введите номер: ");
        int num = scanner.nextInt();
        switch (num) {
            case 1:
                System.out.println("Number is 1");
                break;
            case 2:
                System.out.println("Number is 2");
                break;
            case 3:
                System.out.println("Number is 3");
                break;
            case 4:
                System.out.println("Number is 4");
                break;
            default:
                System.out.println("Number is not between 1 and 4"); // Добавлено для обработки остальных случаев
        }
        scanner.close(); // Закрываем Scanner только здесь, когда он больше не нужен
    }
}
