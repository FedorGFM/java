package lesson2;

import java.util.Scanner;
public class Task1 {
    public static void main(String[] args) {
//        Дано четное число N (>0) и символы c1 и c2.
//        Написать метод, который вернет строку длины N, которая состоит из чередующихся
//        символов c1 и c2, начиная с c1.

//        char c1 = 'A';
//        char c2 ='b';
//        Scanner cs = new Scanner(System.in);
//        System.out.println("Введите длинну N: ");
//        int amountOfChar = cs.nextInt();
//        String result = " ";
//        char tmpC = c2;
//        for (int i = 0; i < amountOfChar; i++) {
//            if (tmpC == c1) {
//                result += c2;
//                tmpC = c2;
//            } else {
//                result += c1;
//                tmpC = c1;
//            }
//        }
//        System.out.println(result);
//
//    }
//}



        // Через канкотинацию

        char a = 'A';
        char b = 'b';
        int n = 5;
        String str = "" + a + b;
        str = str.repeat(n / 2) + ((n % 2 == 1) ? a : "");

        System.out.println(str);

    }
}