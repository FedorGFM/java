package lesson3;

import java.util.*;

public class Task2_2 {
    public static void main(String[] args) {
//        Задание №2.2 Пройти по списку из предыдущего задания и удалить повторяющиеся элементы.

        String[] planetsNamesStringArray = {"Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Neptune", "Uranus", "Pluto"};
        Random random = new Random();
        List<String> randomSunSystem = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            randomSunSystem.add(planetsNamesStringArray[random.nextInt(planetsNamesStringArray.length)]);
        }

        randomSunSystem.sort(Comparator.naturalOrder());
        System.out.println(randomSunSystem);


        for (int i = 0; i < randomSunSystem.size(); i++) {
            Set<String> setSSList = new LinkedHashSet<>(randomSunSystem);
            randomSunSystem.clear();
            randomSunSystem.addAll(setSSList);
        }
        System.out.println(randomSunSystem);

        // 2nd Method with distinct() application:
        //List<String> listWithoutDuplicates =
        //        randomSunSystem.stream().distinct().collect(Collectors.toList());
        //System.out.println(randomSunSystem);
    }
}
