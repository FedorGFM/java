package homework;
import java.util.Arrays;
import java.util.OptionalInt;
import java.util.Scanner;
import java.util.Random;
import java.time.LocalTime;

public class HomeWorkSem1 {
    public static void main(String[] args) {
//        hw1();
//        hw2();
//        hw3();
        hw4();
    }

//    1. Написать метод, принимающий на вход два аргумента: len и initialValue, и возвращающий одномерный массив
//        типа int длиной len, каждая ячейка которого равна initialValue;
    private static int[] hw1() {
        Scanner input = new Scanner(System.in);
        System.out.println("Длина массива: ");
        int len = input.nextInt();

        int[] arr_output = new int[len];

        for (int i = 0; i < len; i++) {
            System.out.println("Элемент массива: ");
            int initialValue = input.nextInt();
            arr_output[i] = initialValue;

        }
        System.out.println(Arrays.toString(arr_output));
        return arr_output;
    }


//    2. Задать одномерный массив и найти в нем минимальный и максимальный элементы;
    private static int[] hw2(){
        int[] arr = {1, 2, 4, 5, 6, 7, 8, 2, 45, 6, 6, 7, 78, 95};
        int max = arr[0];
        int min = arr[0];
        for(int i = 0; i != arr.length; i ++){
            if(arr[i] > max){
                max = arr[i];
            }
            if(arr[i] < min){
                min = arr[i];
            }
        }
        System.out.println("Min = " + min + " " + "Max = " + max);
        return arr;
    }


//    3. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое), и с помощью цикла(-ов)
//    заполнить его диагональные элементы единицами (можно только одну из диагоналей, если обе сложно).
//    Определить элементы одной из диагоналей можно по следующему принципу:
//    индексы таких элементов равны, то есть [0][0], [1][1], [2][2], …, [n][n];
    private static int[][] hw3(){
        Scanner input = new Scanner(System.in);
        System.out.println("Длина массива: ");
        int len = input.nextInt();
        int[][] arr2 = new int[len][len];
        for (int i = 0; i < arr2.length; i++){
            System.out.println();
            for (int j = 0, k = arr2.length - 1; j < arr2.length;k--, j++){
                if (i == j || k == i){
                    arr2[i][j] = 1;
                } else {
                    arr2[i][j] = 0;
                }
                System.out.print(arr2[i][j]);
            }
        }
        return arr2;
    }


//    4. В консоли запросить имя пользователя. В зависимости от текущего времени, вывести приветствие вида:
//            "Доброе утро, <Имя>!", если время от 05:00 до 11:59
//            "Добрый день, <Имя>!", если время от 12:00 до 17:59;
//            "Добрый вечер, <Имя>!", если время от 18:00 до 22:59;
//            "Доброй ночи, <Имя>!", если время от 23:00 до 4:59;


    private static boolean hw4(){
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Введите Ваше имя: ");

        boolean isNow;

        LocalTime now = LocalTime.now();
        LocalTime utro1 = LocalTime.parse( "05:00");
        LocalTime utro2 = LocalTime.parse( "11:59");
        isNow = now.isAfter(utro1) && now.isBefore(utro2);
        if (isNow){
            String name = myScanner.nextLine();
            System.out.printf("Доброе утро, %s!%n", name);
        }
        LocalTime obed1 = LocalTime.parse( "12:00");
        LocalTime obed2 = LocalTime.parse( "17:59" );
        isNow = now.isAfter(obed1) && now.isBefore(obed2);
        if (isNow){
            String name = myScanner.nextLine();
            System.out.printf("Добрый дунь, %s!%n", name);
        }
        LocalTime vecher1 = LocalTime.parse( "18:00");
        LocalTime vecher2 = LocalTime.parse( "22:59");
        isNow = now.isAfter(vecher1) && now.isBefore(vecher2);
        if (isNow){
            String name = myScanner.nextLine();
            System.out.printf("Добрый вечер, %s!%n", name);
        }
        LocalTime noch1 = LocalTime.parse( "23:00");
        LocalTime noch2 = LocalTime.parse( "04:59" );
        isNow = now.isAfter(noch1) && now.isBefore(noch2);
        if (isNow){
            String name = myScanner.nextLine();
            System.out.printf("Доброй ночи, %s!%n", name);
        }
        return isNow;
    }
}
