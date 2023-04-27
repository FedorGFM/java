package homework;

import java.util.*;

public class HomeWorkSem3 {
    public static void main(String[] args) {
//        ex1();
        ex2();
    }

    public static void ex1() {
//        1. Создать список типа ArrayList<String>. Поместить в него как строки, так и целые числа. Пройти по списку, найти и удалить целые числа.
//        Пример: {"Яблоко", "11", "13", "Апельсин", "Дыня", "17"} -> {"Яблоко", "Апельсин", "Дыня"}

        ArrayList<String> typeList = new ArrayList<>(Arrays.asList("Яблоко", "11", "13", "Апельсин", "Дыня", "17"));
        System.out.print(typeList);

//        ArrayList<String> numDelete = new ArrayList<>(Arrays.asList());
        ArrayList<String> numDelete = new ArrayList<>();

        for (int i = 0; i < typeList.size(); i++) {
            String str = typeList.get(i);
            try {
                Integer.parseInt(str);
                numDelete.add(str);
            }catch (Exception e){
            }
        }
        typeList.removeAll(numDelete);
        System.out.println(" -> " + typeList);

    }


    public static void ex2() {
//        2. Каталог товаров книжного магазина сохранен в виде двумерного списка List<ArrayList<String>> так,
//        что на 0й позиции каждого внутреннего списка содержится название жанра, а на остальных позициях - названия книг.
//        Напишите метод для заполнения данной структуры(можно через консоль).
//        Пример:
//        "Классика", "Преступление и наказание", "Война и мир", "Анна Каренина".
//        "Научная фантастика", "Солярис", "Ночной дозор", "Братья Стругацкие".
//        "Детектив", "Десять негритят".
//        "Фантастика", "Хроники Нарнии", "Гарри Поттер и философский камень", "Грозовой перевал".


        Scanner scanner = new Scanner(System.in);
        List<ArrayList<String>> bookList = new ArrayList<>();
        int size = 2;

        for (int i = 0; i < size; i++) {
            System.out.printf("Введите Жанр книги: ");
            String inputGenre = scanner.nextLine();

            ArrayList<String> genreList = new ArrayList<>();
            genreList.add(inputGenre);

            System.out.printf("Введите количество книг в жанре: ");
            int bookQty = Integer.parseInt(scanner.nextLine());

            for (int j = 0; j < bookQty; j++) {
                System.out.printf("Введите название книги: ");
                String inputBookName = scanner.nextLine();
                genreList.add(inputBookName);
            }
            bookList.add(genreList);
        }
        bookList.forEach(System.out::println);
    }
}
