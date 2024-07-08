package lesson_38;

import java.util.Comparator;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetExample {
    public static void main(String[] args) {
        SortedSet<Integer> sortedSet = new TreeSet<>(List.of(5, 1, 3, 8, 6, 4));
        System.out.println(sortedSet);

        // Методы интерфейсов SortedSet

        // возвращает comparator используемый для упорядочивания элементов в коллекции
        // или null, если используется естественный порядок
        Comparator<Integer> comparator = (Comparator<Integer>) sortedSet.comparator();
        System.out.println(comparator == null);

        //  first возвращает первый эл множества
        System.out.println("sortedSet.first " + sortedSet.first());
        //  last возвращает последний эл множества
        System.out.println("sortedSet.last " + sortedSet.last());

        // headSet(E toElement) - возвращает представление части множества,эл которого строго меньше toElement
        System.out.println("sortedSet.headSet " + sortedSet.headSet(5));

        // tileSet (E fromElement)
        SortedSet<Integer> tailSet = sortedSet.tailSet(4);
        System.out.println("tailSet " + tailSet);


        // возвращает эл (E fromElement) до toElement - возвращает представление части множества, эл которого
        // находятся в диапозоне от (E fromElement) до toElement не включительно
        System.out.println(sortedSet.subSet(3, 8));


    }
}
