package homework_38;

import java.util.HashMap;
import java.util.Map;

public class WordFrequency {
    /*
    Task 1
    Частотный словарь слов: Напишите метод, который принимает строку текста
    и возвращает Map<String, Integer>,
    где каждому слову соответствует количество его вхождений в текст.
     */
    public static Map<String, Integer> getWordFrequency(String text) {
        Map<String, Integer> wordFrequency = new HashMap<>();
        String[] words = text.toLowerCase().split("[,\\s]+");

        for (String word : words) {
            System.out.println(word);
        }
        for (String word : words) {
            if (word.isEmpty()) {
                continue;
            }
            if (wordFrequency.containsKey(word)) {
                wordFrequency.put(word, wordFrequency.get(word) + 1);
            } else {
                wordFrequency.put(word, 1);
            }
        }
        return wordFrequency;
    }

    public static void main(String[] args) {
        String test = "яблоко, банан, апельсин, яблоко, банан, яблоко, виноград, арбуз, апельсин, виноград, банан, апельсин, финики";
        Map<String, Integer> frequencyMap = getWordFrequency(test);
        System.out.println(test);

        if (frequencyMap.isEmpty()) {
            System.out.println("Частотный словарь пустой.");
        } else {
            System.out.println("Частотный словарь:");
            for (Map.Entry<String, Integer> entry : frequencyMap.entrySet()) {
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }
        }
    }
}
