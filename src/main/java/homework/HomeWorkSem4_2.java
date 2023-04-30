package homework;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.LinkedList;

public class HomeWorkSem4_2 {

    public static void main(String[] arg) {
        linkedList();
    }

    private static void linkedList() {
        LinkedList<String> inputList = new LinkedList<>();
        Collections.addAll(inputList, "1", "2", "3", "4", "5", "6");

        System.out.println("Исходный лист: ");
        printAllNotNullValues(inputList);

        System.out.println("'Перевернутый' список: ");
        changeElemPosition(inputList);
    }

    private static void changeElemPosition(LinkedList<String> inputList) {
        ArrayDeque<String> arrayDeque = new ArrayDeque<>();
        arrayDeque.addAll(inputList);
        inputList.clear();
        while (!arrayDeque.isEmpty()) {
            inputList.add(arrayDeque.pollLast());
        }
        printAllNotNullValues(inputList);
    }

    private static void printAllNotNullValues(LinkedList<String> inputList) {
        for (int i = 0; i < inputList.size(); i++) {
            if (inputList.get(i) != null) {
                System.out.printf("%d. %s%n", i + 1, inputList.get(i));
            }
        }
    }
}

