package lesson3;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

public class Task2_1 {

    public static void main(String[] args) {
//    Задание №2.1 Заполнить список названиями планет Солнечной системы в произвольном порядке с повторениями.
//    Вывести название каждой планеты и количество его повторений в списке.

        Random random = new Random();
        String[] planetsNamesStringArray = {"Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Neptune", "Uranus", "Pluto"};
        List<String> randomSolarSystem = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            randomSolarSystem.add(planetsNamesStringArray[random.nextInt(planetsNamesStringArray.length)]);
        }
        randomSolarSystem.sort(Comparator.naturalOrder());
        int counter = 0;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < planetsNamesStringArray.length; i++) {
            counter = 0;
            for (var item : randomSolarSystem) {

//            for (int j = 0; j < randomSolarSystem.size(); j++) {
                if (item.equals(planetsNamesStringArray[i])) {
                    counter++;
                }
            }
            sb.append(planetsNamesStringArray[i]).append(": ").append(counter).append("\n");
        }
        System.out.println(sb);
    }
}
