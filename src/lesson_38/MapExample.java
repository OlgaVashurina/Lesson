package lesson_38;

import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

public class MapExample {// хранит пар ключ значение

    public static void main(String[] args) {
        Map<Integer, String> oldTable = new Hashtable<>();  // старая не используется
        Map<Integer, String> map = new HashMap<>();  // старая не используется
        // Добавить пару ключ значение.
        // Возвращение

        map.put(1, "Hello");
        map.put(2, "Java");
        map.put(3, "World");
        System.out.println(map.put(4, "Orange"));
        String oldValueStr = map.put(4, "Test");
        System.out.println("oldValueStr " + oldValueStr);
        System.out.println("map " + map); // печатается в виде ключа значение


        Map<Integer, String> map1 = new HashMap<>();


        map1.put(1, "Hello");
        map1.put(0, "Python");
        map1.put(3, "Banana");
        System.out.println(map1);

        //  put all - приникает карту и копирует все пары ключ-значение из этой карты
        map.putAll(map1);
        System.out.println(map);

        // возвращает true, если карта содержит указанный ключ
        // boolean contains value(Object value) - возвращает true, если карта содержит одно или несколько значений
        System.out.println("map.containsKey(8) " + map.containsKey(8));
        System.out.println("map.containsValue(\"Test\") " + map.containsValue("Test"));

        //get(Object key) - возвращает значение по ключу, если нет ключа - вернет null
        System.out.println("map.get(1) " + map.get(1));
        System.out.println("map.get(8) " + map.get(8));

        //   getOrDefault(Object key, V defaultvalue) возвращает значение (если ключ есть)а если нет вернет дефолтное значение которое мы ему и напишем)
        String value = map.getOrDefault(8, "Default"); // нужно что бы избавиться от нала
        System.out.println("map.getOrDefault " + value);

        value = map.getOrDefault(1, "Default 2");
        System.out.println("Default 2" + value);


//удаляет пару V remove(Object key)
        System.out.println("// ключа нет вернется null map.remove(8)" + map.remove(8)); // ключа нет вернется null
        System.out.println("// ключа нет вернется null map.remove(4)" + map.remove(4)); // ключ есть, вернет значение Test


        // void clear() - очищает карту
        map.clear();
        System.out.println("(очищает значение)" + map);


        // int size () возвращает кол-во эл
        System.out.println("map.size() " + map.size());

        // boolaen isEmpty - если в карте что, то есть выдаст false, если нет true
        System.out.println("boolean isEmpty - если в карте что то есть выдаст false, если нет тру" + map.isEmpty());
        // Collection<V> value() - возвращает коллекцию всех значений карты
        map.put(25, "Java");
        System.out.println(map);

        map.put(16, "Java");
        System.out.println(map);

        Collection<String> values = map.values();
        System.out.println("map.values() " + values);

        // можем получить все ключи в коллекцию Set<K> keySet() - возвращает set, состоящий из всех ключи карты
        Set<Integer> keys = map.keySet();
        System.out.println("key сет - все ключи которые есть: " + keys);
        // могу перебрать все ключи в цикле и получить все значения
        for (Integer key : keys) {
            System.out.println("map.get(key)" + map.get(key));
        }

        // Возвращает сет представлений всех пар ключ значение - метод вернет Map.Entry<K, V> получить все вхождения
        // ПОЛУЧАЮ ТУТ СЕТ. МОЖНО ПЕРЕБИРАТЬ ПАРАМИ
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println("entry.getKey() " + entry.getKey());  // Перебрали все вхождения и получили ключи / Значение
            System.out.println(" - ");
            System.out.println("entry.getValue() " + entry.getValue());
            // рассмотрели 3 способа перебирать значения
        }
        // метод replace vs put -
        System.out.println(" - - - - - ");
        System.out.println(map);

        System.out.println("если пут нет то вернет старое значение " + map.put(10, "Red"));
        System.out.println(map.put(10, "Yellow")); // если ключ есть значение будет перезаписано

        // если ключа нет, новая пара не создается, есь ключ есть значение будет перезаписано
        System.out.println(map.replace(10, "Green"));// Такого ключа в карте нет. Если ключа нет, пара не создается (ключ значение)
        System.out.println(map.replace(11, "Green"));// Если ключ есть. Значение будет перезаписано

        System.out.println(map);


        System.out.println("\n=============================\n ");
        // у мап есть фор ич - перебор всех мап ключ значение и возможность применять какую то функцию к ним
        map.forEach((k, v) -> System.out.println("Key: " + k + "; value: " + v));
        // Key: 16; value: Java
        // Key: 25; value: Java
        //  Key: 10; value: Green
        // перебирает каждый ключ значения (форма цикла)

    }
}