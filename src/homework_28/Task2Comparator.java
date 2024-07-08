package homework_28;

import java.util.Comparator;

/*
Integer[] integers = { 1, 6, 5, 4, 7, 8, 9, 2, 7, 3 };
[2, 4, 6, 8, 9, 7, 7, 5, 3, 1] // Outpur
 */
public class Task2Comparator implements Comparator<Integer> {
    @Override
    public int compare(Integer int1, Integer int2) {
        boolean isFirstEven = int1 % 2 == 0;
        boolean isSecondEven = int2 % 2 == 0;
        if (isFirstEven && isSecondEven) { // Оба четные сравниваем в естественном порядке. Какое меньше!
            return int1 - int2;
        } else if (isFirstEven) { //Первое четное, а второе будет не четное --> первое должно быть меньше. Вернуть из кампаратора -1
            return -1;
        } else if (isSecondEven) { // первое не чет второе четное, соответственно первое должно быть больше
            return 1;
        } else {  // обане четное, в порядке убывания
            return int2 - int1;
            //     return Integer.compare(int2,int1);
        }

    }
}
