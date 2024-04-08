package Lesson_5;

import java.util.*;

public class Massive {
    public static void main(String[] args) {
        String[] words = {
                "пихта",
                "ясень",
                "пихта",
                "пихта",
                "клён",
                "лиственница",
                "пихта",
                "берёза",
                "ива",
                "сосна",
                "ель",
                "ель",
                "сосна",
                "дуб",
                "клён",
                "ива",
                "тополь",
                "топль",
                "ясень",
                "пихта",
                "сосна"
        };

        System.out.println("Слово : количество таких слов в списке:");
        countUnique(words);


        Phonebook phonebook = new Phonebook();
        phonebook.add("Пупкин", "+375 25 572-23-65");
        phonebook.add("Пупкин", "+375 29 232-25-64");
        phonebook.add("Обжоркин", "+375 33 650-74-46");
        phonebook.add("Обжоркин", "+375 44 423-68-65");
        phonebook.add("Некоглаев", "+375 33 223-63-78");
        phonebook.add("Некоглаев", "+375 25 232-56-64");
        phonebook.add("Барбосов", "+375 33 258-26-75");
        phonebook.add("Петров", "+375 25 657-92-83");
        phonebook.add("Дуров", "+375 33 256-85-36");

        System.out.println("\n\nТелефонный справочник.");
        System.out.println("Фамилия : номер(а):");
        phonebook.show();
    }

    private static void countUnique(String[] words) {
        Map<String, Integer> numberOfWords = new LinkedHashMap<>();
        for (String word : words) {
            countWord(numberOfWords, word);
        }
        for (String word: numberOfWords.keySet()) {
            System.out.println(word + " : " + numberOfWords.get(word) + ".");
        }
    }

    private static void countWord(Map<String, Integer> numberOfWords, String word) {
        if (numberOfWords.containsKey(word)) {
            numberOfWords.put(word, numberOfWords.get(word) + 1);
        }
        else {
            numberOfWords.put(word,1);
        }
    }
}
