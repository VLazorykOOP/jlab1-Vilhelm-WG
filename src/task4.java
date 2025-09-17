import java.util.*;

public class task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введіть текст:");
        String text = sc.nextLine();

        // Розбиваємо текст на слова (розділювачі: пробіли, розділові знаки)
        String[] words = text.split("[\\s.,!?;:()\"'-]+");

        // Знаходимо максимальну довжину слова
        int maxLen = 0;
        for (String word : words) {
            if (word.length() > maxLen) {
                maxLen = word.length();
            }
        }

        // Видаляємо слова з максимальною довжиною
        String result = text;
        for (String word : words) {
            if (word.length() == maxLen) {
                // замінюємо слово на порожній рядок, зберігаючи розділові знаки
                result = result.replaceAll("\\b" + word + "\\b", "");
            }
        }

        // Прибираємо зайві пробіли
        result = result.replaceAll("\\s+", " ").trim();

        System.out.println("Текст після видалення найдовших слів:");
        System.out.println(result);
    }
}