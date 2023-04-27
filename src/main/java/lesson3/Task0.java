package lesson3;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

public class Task0 {
    public static void main(String[] args) {
        ex1();
    }

    public static void ex1() {
        Random random = new Random();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            list.add(random.nextInt(100));
        }

        list.sort(Comparator.naturalOrder());
//        Collections.sort(list, Comparator.reverseOrder());

        System.out.println(list);

    }
}
