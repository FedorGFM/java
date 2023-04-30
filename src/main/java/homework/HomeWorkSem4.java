package homework;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class HomeWorkSem4 {
    public static void main(String[] args) {

        LinkedList<String> str = new LinkedList<>();
        ex1(str);
    }

    private static void ex1(LinkedList<String> arr) {

//         1. Реализовать консольное приложение, которое:
//         Принимает от пользователя и “запоминает” строки.
//         Если введено print, выводит строки так, чтобы последняя введенная была первой в списке, а первая - последней.
//         Если введено revert, удаляет предыдущую введенную строку из памяти.


        Scanner sc = new Scanner(System.in);
        System.out.println("Введите строку или команду: ");

        while (true) {
            String input = sc.nextLine();

            if (input.equalsIgnoreCase("print")) {
                print(arr);
                continue;
            }
            if (input.equalsIgnoreCase("revert")) {
                arr.removeFirst();
                System.out.println("Предыдущая строка удалена");
                continue;
            }
            if (input.equalsIgnoreCase("stop")) {
                print(arr);
                System.out.println("Приложение остановлено");
                return;
            }
            arr.addFirst(input);
            System.out.println("Введите новую стоку");
        }
    }

    private static void print(LinkedList<String> list) {
        for (String str : list) {
            System.out.println(str);
        }
    }
}

