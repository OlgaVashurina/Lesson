package unteriht_1;

import javax.lang.model.util.Elements;
import java.util.Scanner;

public class OnedimensionalMultidimensionalArrays {
    public static void main(String[] args) {
// ОДНОМЕРНЫЙ МАССИВ - ГДЕ КАЖДЫЙ ЭЛ ЭТО 1 ЗНАЧЕНИЕ
// массивы похожи в переменных. Но в массивах можно хранить много даннs[
// массив будет хранить числа
        // [] - создаем массив даных, куда запишем много элементов
        //         = надо указать размерность
        // так же необходимо выделить под него память! Укеазать размерность
        // под nums надо выделить столько то памяти=
        //         = new для выделения памяти пишут new
        //          = под выделяем память под интеджер[говорим сколько эл будет находится в массиве]
        //          = сказали будет 5 элементов
        int[] nums = new int[5]; // у них было установлено значение по умолчанию у интеджер это 0
        //int[] nums = new int[5];// 5 элементов и у каждого по умолчанию значение0
        //можем сделать что угодно
        // Хочу вывести первый эл из массива
        // обращаемся к массиву nums к его [первому эл.] первый элемент находится под номером 0
        //указываем индекс элемента, по индексу это 0. Второй по индексу первый эл
        // System.out.println(nums[0]);
        // устанавливаем свое значение:
        // по индексу последний это 4 и он на "5"месте 5 элементов но счет с 0
        nums[0] = 15;
        nums[1] = 25;
        nums[2] = 35;
        nums[3] = 45;
        nums[4] = 55;
        //  System.out.println(nums[0]);
        // мы можем складывать массивы:
        int res = nums[2] + nums[3];
        System.out.println(res);
        System.out.println("\n===========\n");
        // можно указать значения во всех рядах в момент создания массива
        // тип данных float назовем nums2 = выделяем память указываем{указываем все значения которые нужны}
        float[] nums2 = new float[]{1.05f, 2.54f, 3, 4, 5, 6, 7, 12, 8, 10, 9, 345, 4, 3, 5, 43};
        System.out.println(nums2[2]);  // можно обратиться к массиву[обратится к эл по индексу]
        // выйдет ,3,(3.0)
        System.out.println("\n===========\n");
        // а если мы хотим ВЫВЕСТИ ВСЕ ЭЛЕМЕНТЫ МАССИВА, нам понадобиться цикл!!!
        // можем использовать любой ЦИКЛ - for, do while, do while,
        //  FOR - ХОРОШО ПОДХОДИТ ДЛЯ МАССИВА
        // можем самостоятельно указать номер[2], а можно обратиться к массиву и
        // через точку обратиться к его свойству
        //цикл for (создаем переменную,
        //        от 0 и до кол-во эл
        //               обращаемся к массиву и через .length
        //       - к его свойству length-оно возвращает длину всего
        //                   массива(от i и до кол-во эл.в опр.массиве
        //                                i увеличивается на единицу
        for (int i = 0; i < nums2.length; i++) {
// когда мы первый раз будем проходить цикл [I] будет потом будет подставляться 2 и вплоть до длины массива
            System.out.println("Elements [массив всех чисел] (перебор): " + nums2[i]); // выводим все эл. i++ увеличится на 1 еще увеличится на 1 пока не будет соблюдено условие
        }  // Elements [] массив всех чисел(перебор): 1.05
        // Elements[] массив всех чисел(перебор): 2.54
        // перебрал все эл. и вывел на экран.
        System.out.println("\n===========\n");

// применение массивов данные
        // на примере интеджер массив array - массив
        // необходимо выделить память
// массив назовем arr
        //        = выделяем память [4] указываем длину массива 4 эл
        int[] arr = new int[4];
        // создаем цикл, устанавливать значение будет пользователь
        Scanner scanner = new Scanner(System.in);
//                          arr.length - можем указать так и будет понятно что до конца массива
        for (int i = 0; i < arr.length; i++) {
            // просим пользователя внести число
            System.out.println("Введите значение: ");
//надо создать место хранения введенного числа value - значение
            int value = scanner.nextInt();
            // следующее нам нужно обратиться к массиву[]
            // обращаемся к массиву[]по его индексу! I
            //     = в качестве значения устанавливаем то что получили от пользователя!
            arr[i] = value;
        } // верхняя i видна только в пределах верхнего цикла
        //Можем создать еще 1 цикл в котором мы сможем найти мин эл. среди все введенных эл.
        // создаем переменную минимум и в нее установим первый эл массива[]
        // предположим что это первый эл самого этого массива
        //            []- предполагаем что мин. эл. это самый первый
        int min = arr[0];// предполагаем! мин эл массива //2
        for (int i = 0; i < arr.length; i++) { // 1
//3 нам нужно создать условие - обращаемся к текущему эл. и если он будет меньший мин мы его нашли.
            // и помещаем его в переменную мин
            // обращаемся к текущему эл с которым мы работаем в цикле arr[i]
//                 <min) - если он будет меньше, нежели наш мин, то мы понимаем что мы нашли новый мин эл
            if (arr[i] < min)
// что бы его сохранить arr[i] мы его помещаем в переменную min
                min = arr[i];
        }
        System.out.println("Минимальный элемент цикла равен: " + min); // после цикла выводим переменную min

        System.out.println("\n===========\n");
        // МНОГОМЕРНЫЙ МАССИВ
        // КАЖДЫЙ ЭЛ ЭТО ЕЩЕ МАССИВ ДАНЫХ
        // ПРИМЕР ДВУМЕРНЫЙ МАССИВ [][]
        //            = нужно выделить память
        //                      указываем сколько эл будет в массива
        //                         сколько эл будет в каждом вложенном массиве
        char[][] syms = new char[2][2];
        // [1,2,3,4] - раньше было так
        // [[2,3,4],[2,3,4]] - а теперь так (суть идет что есть большая вложенность добавляется на 1 [] больше)
//что бы установить значение для первого эл.двум массива мы:
// обращаемся к массиву syms по названию далее
// мы обращаемся к Первому массиву[0] а так же обращаемся ко второму влож массив[0]
//   = устанавливаем сивол 't'
        syms[0][0] = 't';
        System.out.println("Str 112 syms[0][0] = 't' :" + syms[0][0]);

        System.out.println("\n===========\n");

        // При создании масссива можно указать все заначения для элементов
        // создаем массив на основе данных типа byte[]
        //называется nums =  мы выделяем память под него new byte[][]
        // {} будем устанавливать значения после создания массива
        byte[][] numss = new byte[][]{      // переводим на новую строку для простоты
                {5, 7},                     // указываем {}скобки как будто создавая еще один массив
                {7, 3},                     //
                {2, 3}                      //
                // в массиве 3 элемента (3 массива) в которых идут значения
        };                                 // колличество эл должно совпалдать в каждом из массивов {5,7}, 2 эл. в след 2 и дальше 2
        /*
        Это 1 массив с 3 элементами:
        {
              {5, 7},   - в каждом из массивов по 2 элемента(значения)
              {7, 4},   - в каждом из массивов по 2 элемента
              {2, 3}    - в каждом из массивов по 2 элемента
        };
Можем к каждому эл обратиться
 nums указываем индекс первого эл [1] и индекс второго эл[1]
Например - в первом массиве{
{5, 7},                                                      0 массив(каждый из 3 эл это массив)
0 эл 1 эл
{7, 3}, - ищем тот массив где находится нужный эл по индексу 1 массив(в каждом из масиивов есть по 2 эл - это опр значения
{2, 0}                                                       2 массив
}
nums индекс первго[1] эл и индекс второго[1]эл
                   = можем также установить новое число 67
         */
        numss[1][1] = 67;
        System.out.println(numss[1][1]);


    }
}
