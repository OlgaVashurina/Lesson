package homework_07;
/*
@date 24.05.2024
@author Sergey Bugaienko
*/

/*
Используйте цикл while для решения задачи:

Распечатайте 10 строк: "Task1", "Task2", ..., "Task10".
 */
public class Task4 {
    public static void main(String[] args) {

        int count = 1;
        while (count <= 10) {
            System.out.println("Task" + count++);
        }

    }
}
