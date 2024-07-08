package unteriht_3;

public class ClassObject {
    // реализуем транспорт, который описывает транспортное средство, характеристики, и создадим несколько обьектов
    // ООП КЛАССЫ И ОБЬЕКТЫ
    // ОДИН КЛАСС ОДИН ФАЙЛ
    public static void main(String[] args) {
/*
Для создания объектов нам необходимо указать название того класса
на основе которого мы создаем сам объект
 */
//указываем название класса/
// указываем название bmw
//                    = выделяем под него память!
        ClassTransport bmw = new ClassTransport();
// Создали объект bmw который идет на основе класса ClasTransport

// Теперь мы можем к нему обратиться и через . мы имеем доступ ко всем полям и методам
// которые сущ внутри самого класса и которые идут с
// модификатором доступа паблик. Так как других методов нет есть доступ только к переменным(полям)
// после всего КОГДА ВСЕ ЗАПИСАЛИ
// Для bmw обратимся к методу setValues и через запятую укажем все значения которые были по одиночке!();
//            (250.5f, 2500,"White", new byte[]{0, 0, 0};);
        bmw.setValues(250.5f, 2500, "White", new byte[]{0, 0, 0});
        String rest1 = bmw.getValues();
        System.out.println(rest1);
//      Обратимся к полю speed и установим сюда значение = мак скорость
// так как создали метод в 24 строке, ниже все можно закомментировать:
//        bmw.speed = 250.5f;
// так же обратимся к весу и укажем 2500 кг.
//        bmw.weight = 2500;
//кроме этого мы обращаемся к color
//        bmw.color = "White";
// так же обращаемся к coordinate и тут надо указать coordinate,
// мы под нее тоже должны выделить память
// если мы делаем игру - то там есть плоскость и координаты x- 0 y-0 z-0 - начало всех координат
//        bmw.coordinate = new byte[]{0, 0, 0};

        ClassTransport truck = new ClassTransport();
        truck.speed = 140.5f;
        truck.weight = 5600;
        truck.color = "Red";
        truck.coordinate = new byte[]{100, 0, 100};


// так как модификатор стоит Public в ClasTransport то через точку мы можем обратиться к любому методу!!
        ClassTransport boat = new ClassTransport();
        boat.speed = 300.05f;
        boat.weight = 100;
        boat.color = "Blue";
        boat.coordinate = new byte[]{90, 100, 90};


        System.out.println("Truck speed: " + truck.speed + ". BMW speed: " + bmw.speed);
        System.out.println("Truck color: " + truck.color + ". BMW color: " + bmw.color);
        System.out.println("Boat color: " + boat.color + "Boat coordinate: " + boat.coordinate + "]");


        String rest2 = bmw.getValues();
        System.out.println(rest2);

    }
}
