package homework_37;

import java.util.*;

public class Task1 {
    public static void main(String[] args) {
        String testString = "Тестовая строка для удаления слов, которые повторяются. \"строка\" для удаления!";
        System.out.println(getUniqueSortedWords(testString));
    }

    private static List<String> getUniqueSortedWords(String testString) {
        // Удалить знаки препинания, которые не являются буквами, цифрами или пробелом, и разбить строку на слова
        String[] words = testString.replaceAll("[^a-zA-Zа-яА-Я0-9 ]", "").split("\\s+");

        // Поместить слова в коллекцию, которая обеспечит уникальность и сортировку по длине слов
        Set<String> uniqueWords = new TreeSet<>(Comparator.comparing(String::length).thenComparing(Comparator.naturalOrder()));
        uniqueWords.addAll(Arrays.asList(words));

        // Преобразовать коллекцию в список и вернуть
        return new ArrayList<>(uniqueWords);
    }
}
