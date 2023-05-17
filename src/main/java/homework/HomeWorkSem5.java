package homework;
import java.util.*;
public class HomeWorkSem5 {
    public static void main(String[] args) {
        Map<String, ArrayList<String>> notePhone = ex1();
        for (var item : notePhone.entrySet())
        {
            System.out.println(item);
        }
                ex2(notePhone);
    }

    private static Map<String, ArrayList<String>> ex1() {
        System.out.println("----Task1----");
        /**
         * Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что 1 человек может иметь несколько телефонов.
         * Пусть дан список сотрудников:
         Иван Иванов
         Светлана Петрова
         Кристина Белова
         Анна Мусина
         Анна Крутова
         Иван Юрин
         Петр Лыков
         Павел Чернов
         Петр Чернышов
         Мария Федорова
         Марина Светлова
         Мария Савина
         Мария Рыкова
         Марина Лугова
         Анна Владимирова
         Иван Мечников
         Петр Петин
         Иван Ежов
         */
        Map<String, ArrayList<String>> note = Map.ofEntries(
                Map.entry("Иван Иванов", new ArrayList<>(List.of("+7 920 1624"))),
                Map.entry("Светлана Петрова", new ArrayList<>(Arrays.asList("+7 920 4381", "+7 920 2345"))),
                Map.entry("Кристина Белова", new ArrayList<>(List.of("+7 920 8775"))),
                Map.entry("Анна Мусина", new ArrayList<>(Arrays.asList("+7 920 0033", "+7 920 5543"))),
                Map.entry("Анна Крутова", new ArrayList<>(Arrays.asList("+7 920 4656", "+7 920 9805"))),
                Map.entry("Иван Юрин", new ArrayList<>(Arrays.asList("+7 920 9807", "+7 920 6879", "+7 920 0700"))),
                Map.entry("Петр Лыков", new ArrayList<>(Arrays.asList("+7 920 1202", "+7 920 8796"))),
                Map.entry("Павел Чернов", new ArrayList<>(List.of("+7 920 4305"))),
                Map.entry("Петр Чернышов", new ArrayList<>(List.of("+7 920 9703"))),
                Map.entry("Мария Федорова", new ArrayList<>(List.of("+7 920 1357"))),
                Map.entry("Марина Светлова", new ArrayList<>(List.of("+7 920 2568", "+7 920 0760"))),
                Map.entry("Мария Савина", new ArrayList<>(List.of("+7 920 3579"))),
                Map.entry("Мария Рыкова", new ArrayList<>(List.of("+7 920 4280"))),
                Map.entry("Марина Лугова", new ArrayList<>(List.of("+7 920 1653"))),
                Map.entry("Анна Владимирова", new ArrayList<>(List.of("+7 920 6754"))),
                Map.entry("Иван Мечников", new ArrayList<>(Arrays.asList("+7 920 1257", "+7 920 9393"))),
                Map.entry("Петр Петин", new ArrayList<>(Arrays.asList("+7 920 8702", "+7 920 6543"))),
                Map.entry("Иван Ежов", new ArrayList<>(List.of("+7 920 9999")))
        );
        return note;
    }

    private static void ex2(Map<String, ArrayList<String>> note) {
        System.out.println("\n---Task2---");
        /**
         Написать программу, которая найдёт и выведет повторяющиеся имена с количеством повторений.
         Отсортировать по убыванию популярности.
         */
        Map<String, Integer> sor = new HashMap<>();
        for (var item : note.keySet()) {
            String item2 = item.split(" ")[0];
            if (sor.containsKey(item2)) {
                sor.put(item2, sor.get(item2) + 1);
            } else {
                sor.put(item2, 1);
            }
        }
        System.out.println(sor);
        List<Map.Entry<String, Integer>> list = new ArrayList<>(sor.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return o2.getValue().compareTo(o1.getValue());
            }
        });
        System.out.println(list);
    }
}
