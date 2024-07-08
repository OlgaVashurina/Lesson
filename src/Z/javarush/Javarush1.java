package Z.javarush;

import java.util.Scanner;

public class Javarush1 {
    public static void main(String[] args) {
        int n = 5;
        while (n > 0) {
            System.out.println(n);
            n--;
        }

        int n1 = 0;
        while (n1 < 10) {
            System.out.println(n1);
            n1++;
        }

        // Scanner scanner = new Scanner(System.in);
        // while (scanner.hasNext()) {
        //     int x = scanner.nextInt();
        // }

        // Для вызова метода main класса Solution
        Solution.main(new String[0]);
    }

    public static class Solution {
        public static void main(String[] args) {
            String quote = "Я никогда не буду работать за копейки. Амиго";
            int i = 1;
            while (i <= 10) {
                System.out.println(quote);
                ++i;
            }
            // Вызов метода main класса Solution1
            Solution1.main(new String[0]);
        }
    }

    public static class Solution1 {
        public static void main(String[] args) {
            String text = "Алёна любит меня";
            Scanner scanner = new Scanner(System.in);
            String userInput = scanner.nextLine();
            String result = userInput + text;
            int i = 1;
            while (i <= 10) {
                System.out.println(result);
                i++;
            }

        }

    }

}
