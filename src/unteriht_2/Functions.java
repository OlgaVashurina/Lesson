package unteriht_2;

public class Functions {
    public static void main(String[] args) {
// метод принимающий массив и в массиве считает сумму всех эл и возвращает обратно из функции
        // массив байт = выделяем память и устанавливаем значения{}
        byte[] nums1 = new byte[]{5, 6, 8};

// после строки 52 summaArray передаем массив nums1 и доп созданим переменную
// и назовем ее int summ1 первая сумму и выводим сумму на экран!
        int sum1 = summaArray(nums1);
        System.out.println("Сумма 1:" + sum1);

/*
В САМОМ КОНЦЕ ЗАЧЕМ НУЖНЫ ФУНКЦИИ?
ЧТО БЫ НЕ ПИСАТЬ КОД ДОПОЛНИТЕЛЬНО МОЖНО СОЗДАТЬ НОВЫЙ МАССИВ И
МОЖНО СОЗДАТЬ ДР МАССИВ И ЧТО БЫ ПОСЧИТАТЬ СУММУ ЭЛ В НОВОМ МАССИВЕ?
ВЫЗЫВАЕМ ТУ ЖЕ ФУНКЦИЮ НО ПЕРЕДАТЬ ДР МАССИВ (ХОТЬ 20 МАССИВОВ)
 */
        byte[] nums2 = new byte[]{5, 6, 8, 8, 6, 5, 4, 4};
        int sum2 = summaArray(nums2);
        System.out.println("Сумма 2:" + sum2);


    }

    // можно продублировать код и сдр значениями и что бы посчитать сумму эл я вызываю ту же функцию
    //РАЗРАБОТКА НАШЕЙ ФУНКЦИИ
// хотим возвращать (сумма всех эл) определенного типа данных например
//                int
//                   название summaArray
//                               ()какой параметр принимаем
//                              ПРИНИМАТЬ МАССИВ на основе байт поэтому с [] и
//                                называется arr
// принимаю 1 массив на основе типа данных byte
    public static int summaArray(byte[] arr) {
// создаем новую переменную summa и позже мы будем в нее записывать сумму всех переменных
        int summa = 0;
// создаем цикл (на основе типа переменных
//      byte переменная i,
//                     будет длиться до лины массива
//                                       и увеличиваться на 1
        for (byte i = 0; i < arr.length; i++) {
// в переменную summa мы каждый раз будем
//                 добавлять конкретный эл
//                 из самого массива []
// обращаемся к переменной сумма, к ее текущему значению добавляем
// новый элемент - это все
            summa += arr[i];
        }
// ниже будем возвращать сумму всех эл ( переменная сумма)
        return summa;
// далее что бы ее вызвать переходим на строку 11!!!!!!!!!!      int sum1 = summaArray(nums1);
    }

}