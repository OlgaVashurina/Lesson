package unteriht_1;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        Double num1 = scanner.nextDouble();

        System.out.print("Введите второе число: ");
        Double num2 = scanner.nextDouble();
        System.out.println("Введите операцию: 1. + \n 2. -\n 3. *\n 4. /");
        String action = scanner.nextLine();
        action = scanner.nextLine();
        switch (action) {
            case "+":
                Double res = num1 + num2;
                System.out.println("Сумма равна: " + res);
                break;
            case "-":
                Double res1 = num1 - num2;
                System.out.println("Сумма равна: " + res1);
                break;
            case "*":
                Double res2 = num1 * num2;
                System.out.println("Сумма равна: " + res2);
                break;
            case "/":
                if (num2 == 0)
                    System.out.println("Error");
                else {
                    Double res3 = num1 / num2;
                    System.out.println("Сумма равна: " + res3);
                }
                break;
            default:
                System.out.println("Вы ввели не существующий метод");
        }


    }

}
