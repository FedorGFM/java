package homework;

import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.Arrays;
import java.util.Objects;


public class HomeWorkSem2 {
    public static void main(String[] args) {
        hw1();
//        hw2();
//        hw22();
    }

//    public static StringBuilder hw1() {
//        1. Дана строка sql-запроса "select * from students where ". Сформируйте часть WHERE этого запроса, используя StringBuilder.
//        Данные для фильтрации приведены ниже в виде json-строки.
//        Если значение null, то параметр не должен попадать в запрос.
//        Пример 1:
//        Параметры для фильтрации: {"name:Ivanov", "country:Russia", "city:Moscow", "age:null"}
//        Результат: SELECT * FROM USER WHERE name = 'Ivanov' and country = 'Russia' and city = 'Moscow';
//        Пример 2:
//        Параметры для фильтрации: {"name:null", "country:null", "city:null", "age:null"}
//        Результат: SELECT * FROM USER;


//        String[] where = {"name:Ivanov", "country:Russia", "city:Moscow", "age:null"};
//
//        String[] name = where[0].split(":");
//        String[] country = where[1].split(":");
//        String[] city = where[2].split(":");
//        String[] age = where[3].split(":");
//
//        String skipElem = "null";
//        StringBuilder strBuilder = new StringBuilder();
//
//        if (!Objects.equals(name[1], skipElem)) {
//            strBuilder.append(" " + where[0]);
//        }
//        if (!Objects.equals(country[1], skipElem)) {
//            strBuilder.append(" " + where[1]);
//        }
//        if (!Objects.equals(city[1], skipElem)) {
//            strBuilder.append(" " + where[2]);
//        }
//        if (!Objects.equals(age[1], skipElem)) {
//            strBuilder.append("" + " = " + where[3]);
//        }
//        System.out.println("SELECT * FROM USER WHERE " + strBuilder);
//        return strBuilder;
//    }


    // Решение 2
    public static void hw1() {

        Map<String, String> params1 = new HashMap<String, String>();
        params1.put("name", "Ivanov");
        params1.put("country", "Russia");
        params1.put("city", "Moscow");
        params1.put("age", null);
        System.out.println(getQuery(params1));
    }

    public static String getQuery(Map<String, String> params) {
        StringBuilder s = new StringBuilder();
        s.append("SELECT * FROM USER WHERE ");
        for (Map.Entry<String, String> pair : params.entrySet()) {
            if (pair.getValue() != null) {
                s.append(pair.getKey() + " = '" + pair.getValue() + "' and ");
            }
        }
        s.delete(s.toString().length() - 5, s.toString().length());
        return s.toString();


    }


    public static void hw2() {
//        2.Напишите метод, который определит тип (расширение) файлов из текущей папки и выведет в консоль результат вида:
//        1 Расширение файла: txt
//        2 Расширение файла: pdf
//        3 Расширение файла:
//        4 Расширение файла: jpg


        File file = new File("C:\\Users\\user\\Desktop\\java.practic\\java.practic13042023");
        File[] files = file.listFiles();
        for (int i = 0; i < files.length; i++) {
            String name = files[i].getName();
            String typeFile = " ";
            int j = name.lastIndexOf('.');
            if (j > 0) {
                typeFile = name.substring(j + 1);
            }
            System.out.println((i + 1) + "Тип файла: " + typeFile);
        }


//    public static void hw22() {
//         File dir = new File("C:\\Users\\user\\Desktop\\java.practic\\java.practic13042023\\src\\main\\java\\lesson2");
//         if (dir.isDirectory()) {
//            for (File item : dir.listFiles()) {
//                if (item.isDirectory()) {
//                    System.out.println(item.getName() + " \t folder");
//                } else {
//                    System.out.println(item.getName() + "\t file");
//                }
//                }
//            }
//        }
    }
}