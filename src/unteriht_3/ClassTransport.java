package unteriht_3;

/*Так как package совпадает у нас есть доступ к другому классу
 */
// для создания класса прописываем модификатор доступа
//  прописывается class и его название. Далее описываем характеристики для всего транспорта!!!!!!
public class ClassTransport {
    // у каждого транспорта есть скорость, вес, цвет, координаты, где транспорт находится
// нужно описать 4 переменные (или поля) внутри класса это ПОЛЯ
/*
прежде чем создать поля, надо указать модификатор доступа!
1. public - доступна ото всюду из др классов из др файлов
если к полю или функция - доступна из др файлов! Полностью открыта
2. protected - можно ставить везде, protected говорит что какое-либо поля.метод.класс -
Поле\класс\метод - будет доступен внутри самого класса и внутри классов наследников
3. private - если пишем у класса поля или метода - закрытая переменная, функция, классбудет виден только внутри самого
поля, класса, метода!
 */
// 1 поля хранит - скорость авто
    public float speed;
    // 2 поля хранит - вес авто
    public int weight;
    // 3 поля хранит - цвет авто
    public String color;
    // 4 поля хранит - массив хранящий координаты авто []
    public byte[] coordinate;

    public ClassTransport(int i, byte[] bytes) {
    }

    public ClassTransport() {

    }

    /*
    мы создали класс где есть 4 поля, теперь можно создать объекты
    на основе этого класса
    */
/*
ВАЖНО ЧТО ЕСЛИ МЫ МЕНЯЕМ НА PRIVET ТО
МЫ СМОЖЕМ ОБРАТИТЬСЯ К ЭТОМУ ПОЛЮ ТОЛЬКО ОТ СЮДА!!!!!
ТОЛЬКО В ПРЕДЕЛАХ ЭТОГО КЛАССА
*/
// ДАВАЙТЕ ЕЩЕ ВНУТРЬ КЛАССА ДОБАВИМ КАКИЕ-ЛИБО МЕТОДЫ,
// добавим новый функционал за счет добавления новых методов (функций)
// разработаем новый функционал который будет позволять транспорту двигаться!
// Можно реализовать метод меняющий координаты объектов, они бы смещались на 1 ед. вперед
// не будем прописывать static так как нам нужно, что бы метод не принадлежал классу, а к каждому объекту
// прописываем setValues - установка значений (надо прописать все параметры которые мы будем получать)
//                       (4 параметра скорость. вес.цвет координаты)
//  когда мы их получим, мы будем прописывать их в поля        , массив координат)
    public void setValues(float _speed, int _weight, String _color, byte[] _coordinate) {
// в этом методе мы будем обращаться к скорости speed
// и будем туда устанавливать скорость, которую получаем _speed;
// для всех полей значение!
        speed = _speed;
        weight = _weight;
        color = _color;
        coordinate = _coordinate;
    }

    // доп создадим еще 1 метод и он будет возвращать строку!
    public String getValues() {
// сразу укажем что мы что-то возвращаем!
// создадим строку в нее поместим все и доп создадим цикл for и переберем все координаты!
// также нам нужно выводить info (туда мы поместим все)
        String info = "Object speed: " + speed + ". Weight: " + weight + ".Color: " + color; // все поля не являющиеся масивом!
// infoCoordinates которые я получу я хочу записывать в эту строку!
        String infoCoordinates = "Coordinates: \n";   // создаем новую переменную infoCoordinates и в ней прописываем слово "Coordinates: \n";
// Также создадим цикл и переберем в нем все наши координаты coordinate.length
//i = 0 и i меньше чем < кол-во эл. в массиве координаты; и i ++
        for (int i = 0; i < coordinate.length; i++) {
// обращаться к строке и к ней добавлять новые координаты
// обращаемся к строке из 62 к String infoCoordinates и к не же
//                          coordinate добавляем по индексу
//                                        i и плюс выполняем переход на новую строку и + переход на нов строку
            infoCoordinates += coordinate[i] + "\n"; // к текущей строке infoCoordinates добавляем += каждый эл.из самого этого массива coordinate[i]
        }
// дополнительно мы выводим info и infoCoordinates
        return info + infoCoordinates;  //


    }

}