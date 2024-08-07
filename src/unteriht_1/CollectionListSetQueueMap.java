package unteriht_1;

import java.util.ArrayList;
import java.util.LinkedList;

public class CollectionListSetQueueMap {
    public static void main(String[] args) {
        // КОЛЛЕКЦИИ В ДЖАВА НАБОР СВЯЗАННЫХ МЕЖДУ СОБОЙ КЛАССОВ
        //  ДЛЯ РЕАЛИЗАЦИИ СТРУКТУР ДАННЫХ
        // СУЩ ИНТЕРФЕЙС КОЛЛЕКШН И МЕП

        // ОБЬЕКТ НА ОСНОВЕ (какого либо класса) ЕРЕЙ ЛИСТ И ЛИНКЕД ArrayList
        // объект на основе класса ArrayList
        // если создаем просто массив и не планируем удалять добавлять
        // ArrayList <какой тип данных используется внутри структуры> нужно прописать полное название это класс который отвечает за тип данных
        //назовем структуру  numbers  = выделяем память new ArrayList<>();
        ArrayList<Integer> numbers = new ArrayList<>(); // добавлять любые данные и размер динамически расширяется
        // обычный массив - мощность меньше, а вот такие как наверху потребляют большие данные
        // можем добавить новые элементы и можем обратиться к одной из его функций
        // обращаемся к numbers и далее к его функции  .add()
        //      .add() - добавить эл в массив 5
        numbers.add(5);     // 0 эл по индексу
        numbers.add(50);   //  (1 эл по индексу) добавили два эл (5 и 50)

        //мы можем вместо 1 эл по индексу установить новое значение 30
        // необходимо установить в эл опр индекс. Новый некий эл
        // в место первого значения установить 30
        numbers.add(1, 30); // вместа 50( первого эл) указать новый индекс (эл по индексу)

        // добавляет по 1 элементу и он добавляется в конец списка
// напишем цикл for что бы понимать какие мы эл добавили и что в нем есть
        /*
Нужно указать тип данных который указан тут <Integer> должно совпаладь
далее создаем некую переменную el далее мы
указываем : двоеточее и указываем какую коллекцию мы перебираем numbers!!!!

Далее мы работаем с переменной el - эл из самой коллекции (текущий элемент) */
        for (Integer el : numbers) {
            System.out.println(el);
        }
// если нужно будет выяснить размерность коллекции можно будет обратиться к методу size
// numbers.size - вернет дилну коллекции
        System.out.println("Длина коллекции numbers.size: " + numbers.size());
        // так же можно вывести эл.по индексу 1! (принимает 1 параметр. индекс эл который мы хотим вывести
        System.out.println(" Элемент по индексу 1! numbers.get(1): " + numbers.get(1));
// так же можно удалять индексы из списка!
// удаяем из списка второй символ
//             ( по индексу 1)
        numbers.remove(1);
// numbers.clear(); // полностью удаляет все!!
// выводим то что получилось, удалился 1 символ [30]
        System.out.println(numbers); // выйдет так [5, 50]
// коллекция  LinkedList
        /*
LinkedList - как сами классы созданы, LinkedList привязывает эл к др другу( если часто надо удалять или вставлять эл - переиндексирования!
принцип туда-сюда!!!!! LinkedList лист будет делать это быстрее
         */
// коллекция LinkedList<работает с Типом данных Float>
//                       название коллекции
//                                 = выделяем память!
        LinkedList<Float> numbers1 = new LinkedList<>();
// если нужно добавить новый эл (обьект)
//обращаемся к коллекции. Через точку
// .обращаемся к ее методу (добавляем новый эл)(5.6f) - эл добавлен
        numbers1.add(5.6f);
        numbers1.add(5.354f);
        numbers1.add(5.23456f);
// далее используются те же самые методы - get \ remouv\add\ clear
// выводим эл на экран elem
// указываем тип данных Float
//                 переменную elem
//                через : указываем с какой коллекцией работам
        for (Float elem : numbers1) {
            // запускаем и выводим на экран!
            System.out.println("LinkedList для динамических коллекций: " + elem);
        }
        numbers1.remove(1);   // удаляем первый (по счету второй) эл из массива
        System.out.println(numbers1); // выводим на экран
        numbers1.clear();  // удаляем все!
        System.out.println(numbers1); // выводим на экран!


    }
}
