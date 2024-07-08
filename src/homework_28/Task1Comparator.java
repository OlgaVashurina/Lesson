package homework_28;

import java.util.Comparator;

/*
Напишите MyComparator, реализующий Comparator с методом сравнения для сортировки массива целых чисел в следующем порядке:

Четные целые числа должны идти перед нечетными числами
Integer[] integers = { 1, 6, 5, 4, 7, 8, 9, 2, 7, 3 };
[2, 4, 6, 8, 1, 3, 5, 7, 7, 9] // Outpur
 */
public class Task1Comparator implements Comparator<Integer> { // наш внешний сравнитель
    // сортируй по такому-то принципу Comparator один из способов сравнивать объекты.
    @Override
    public int compare(Integer int1, Integer int2) {
        boolean isFirstEven = int1 % 2 == 0;
        boolean isSecondEven = int2 % 2 == 0;

        String email = "test@email.com";
        email.replaceFirst("[a-z]4", "ABCD");

        if (isFirstEven && !isSecondEven) {//Первое четно, второе не четное. Четное должно быть меньше. Первое меньше
            return -1;
        } else if (!isFirstEven && isSecondEven) {  // Первое не четное, второе четное. Тогда второе меньше. Второе четное
            return 1;
        } else {// оба либо четные, либо не четные. Сортируем в порядке возрастания
//return int1-int2;
            return Integer.compare(int1, int2);
        }

    }
}