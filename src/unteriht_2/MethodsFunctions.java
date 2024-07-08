package unteriht_2;

public class MethodsFunctions {
    public static void main(String[] args) {   // МЕТОД MAIN!!!
// ФУНКЦИИ - НЕБОЛЬШИЕ ПОДПРОГРАММЫ СОДЕРЖАЩИЕ НАБОР КОДА,
// ДЛЯ ВЫПОЛНЕНИЯ КОДА МОЖНО ССЫЛАТЬСЯ К ФУНКЦИИ (ПО НАЗВАНИЮ) И КОД БУДЕТ ВЫПОЛНЯТЬСЯ
// НАПРИМЕР ПОВТОРЯЩИЕСЯ КОД( НО ЕСТЬ ПРАВИЛО - НЕ ПОВТОРЯЙТЕ САМИ СЕБЯ!)
// ВЕСЬ ПОВТОРЯЮЩИЙСЯ КОД ЗАПИСЫВАЕТСЯ В ФУНКЦИ. (ОПТИМИЗАЦИЯ) ССЫЛАТЬСЯ НА ОТД.КОД
// ВСТРОЕННЫЕ ТАК И СВОИ СОБСТВЕННЫЕ ФЙНКЦИИ ЕСТЬ PRINTLN . NEXTLINE(РАБОТА СО ВСТРОЕННЫМИ ФУНКЦИЯМИ )
// ФУНКЦИИИ - ЗАПИСЫВАЮТСЯ В НЕ КЛАССА
// МЕТОД - ЗАПИСЫВАЕТСЯ ВНУТРИ КЛАССА
// ООП ЛЮБОЙ МЕТОД - КЛАСС
// все методы создаются на равне с др методами!!!!!!!!!!!!!
        info("Hello");
        String java = "Java";
        info(java);
        info("");


    }

    //МОДИФИКАТОР ДОСТУПА public - доступен отовсюду
//                 static - данный МЕТОД будет принадлежать к классу в целом( а не к объектам по отдельности)
//                        void - МЕТОД (функция) НЕ ВОЗВРАЩАЕТ ничего
//                             info - НАЗВАНИЕ ФУНКЦИИ
//                                 () - указываются ПАРАМЕТРЫ - что функция может принимать!(позже сюда передаются параметры)
//                           {} - все что между скобками - ТЕЛО ФУНКЦИИ
    public static void info(String word) {
//  Ничего не произойдет, программа выполнится, но на экран ничего не выведется.
//  Функция срабатывает только тогда когда МЫ ЕЕ ВЫЗЫВАЕМ!(ИСКЛЮЧЕНИЕ MAIN)
//  ФУНКЦИИ САМИ ПО СЕБЕ НЕ ВЫЗЫВАЮТСЯ
//  что бы ее вызвать, ее надо запустить!!!!  СТРОКА 14!!!!!!!!!!!! (info(); } ВЫВЕДЕТСЯ 3 РАЗА
/*
стр 14
  1 раз прописали название (); 1 раз будет вызвана функция. Можно запустить 3 фраза, тогда ее нужно вызвать 3 раза
поместили кусочек кода в отд. Функцию. Если нам нужно снова вызвать кусочек кода, мы просто обращаемся к функции по ее названи
и каждый раз будет выполняться опр. Действие.
*/
/*
Функцию можно усовершенствовать info( она будет принимать параметр) - те значения с которыми потом можно будет работать внутри самой функции(интеджер, стринг, шот)
Например передадим (String word) строка с параметром word - название у параметра может быть любым.
Далее мы можем вывести параметр на экран! и в конце добавим !!
        System.out.print(word);
        System.out.println("!");
Тогда вот эти вызовы становятся не верными:
info();
info();
info();
потому что в функции (String word) мы принимаем 1 обязательный параметр (String);
а в круглые скобки мы ничего не передаем! Не указываем никакое значение!
Нужно передавать info(значение о которе будет подставлено в параметр word);
info("Hello"); стр 14
нам нужно передать значение, которое подставим потом в word
можем прописать текст или создать переменную
        info("Hello"); - прописать текст надпись
        String java ="Java"; - создать переменную
        info(java); - и передать эту переменную
        info(""); - или пустую строку передать
Выведется так!
Hello!
Java!
!
*/
        System.out.print(word);
        System.out.println("!");

        short num = 7;
        int result1 = summa((short) 5, num);
        short num2 = 8;
        int result2 = summa((short) 4, num);
// после 95 строки обучение - передаем (обращаемся к классу String и к его методу .valueOf (и передаем 1 параметр число)
// при помощи функции .valueOf из числа преобразовываем в строку "6" но как строка
        info(String.valueOf(result2));

    }

    // создадим еще один функцию, ничего не возвращает и называется сум,
// принимает несколько параметров(short a, short b)
//                              параметр, а и параметр б
    public static int summa(short a, short b) {
//          создаем переменную res и вкладываем результат сложения этих параметров a + b;
        int res = a + b;
// выше строка 65 нам нужно обратиться к этой функции   summa() и передать два каких то числа(5,7);
// система показывает что параметры надо преобразовать в (short) вот так ((short) 5, (short) 7);
// либо это можно записать по другому:
// short num = 7;
// summa((short) 5, num); ВСЕ В 67 СТРОКЕ!!!!!!!!!!!
        System.out.println("Результат: " + res);


        int res2 = a + b;
        String result = "Результат: " + res2;
        info(result);
        return res;
    }


}
