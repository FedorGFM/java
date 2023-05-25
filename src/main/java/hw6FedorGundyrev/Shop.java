package hw6FedorGundyrev;
import java.util.*;
public class Shop {
    public static void main(String[] args) {
        Set notebooksSet = Notebooks();
        System.out.println("В наличие ");
        for (var i : notebooksSet) {
            {
                System.out.println(i);
            }
        }

        findParameter(notebooksSet);
    }

    private static void findParameter(Set<Notebooks> notebooksSet) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nВыберите номер для поска по критерию: ");

        int inputMin;
        ArrayList<Integer> criteria = new ArrayList<>();
        ArrayList<String> inputStr = new ArrayList<>();
        Map<Integer, ArrayList<String>> criteriaLetter = new HashMap<>();
        ArrayList<String> nameNB = new ArrayList<>(Arrays.asList("ASUS", "Apple", "Samsung", "MSI"));
        criteriaLetter.put(1, nameNB);
        ArrayList<String> cpuNB = new ArrayList<>(Arrays.asList("AMD", "Intel", "M1", "M2"));
        criteriaLetter.put(2, cpuNB);
        ArrayList<String> osNB = new ArrayList<>(Arrays.asList("Windows", "MacOS"));
        criteriaLetter.put(3, osNB);
        Map<Integer, Integer> criteriaDigit = new HashMap<>();
        criteriaDigit.put(4, 0);
        criteriaDigit.put(5, 0);
        criteriaDigit.put(6, 0);
        String[] name = new String[]{"брендов", "процессоров", "OS", "HDD", "RAM", "цен"};

        System.out.println("1 - бренд");
        System.out.println("2 - процессор");
        System.out.println("3 - OS");
        System.out.println("4 - HDD");
        System.out.println("5 - RAM");
        System.out.println("6 - цена");
        System.out.print("Вводите через пробел -> ");

        for (String item : scanner.nextLine().split(" ")) {
            criteria.add(Integer.parseInt(item));
        }
        for (int i : criteria) {

            if (i <= 3) {
                System.out.printf("Введите названия %s через пробел ", name[i - 1]);
                for (String item : scanner.nextLine().split(" ")) {
                    inputStr.add(item);
                }
                criteriaLetter.put(i, inputStr);
            } else {
                System.out.printf("Введите минимальный порог %s ", name[i - 1]);
                inputMin = Integer.parseInt(scanner.nextLine());
                criteriaDigit.put(i, inputMin);
            }

        }

        System.out.println("\nРезультат поиска ");
        for (Notebooks notebook : notebooksSet) {
            if (criteriaLetter.get(1).contains(notebook.getName()) && criteriaLetter.get(2).contains(notebook.getCpu()) && criteriaLetter.get(3).contains(notebook.getOs()) &&
                    criteriaDigit.get(4) <= notebook.getHdd() && criteriaDigit.get(5) <= notebook.getRam() && criteriaDigit.get(6) <= notebook.getPrice()) {
                System.out.println(notebook);
            }
        }
    }

    private static Set Notebooks() {
        Notebooks ApplePro1 = new Notebooks("Apple", "M2", "MacOS", 512, 16, 290000);
        Notebooks ApplePro2 = new Notebooks("Apple", "M2", "MacOS", 1024, 32, 340000);
        Notebooks AppleAir = new Notebooks("Apple", "M1", "MacOS", 512, 8, 180000);
        Notebooks ASUSPro = new Notebooks("ASUS", "Intel", "Windows", 512, 16, 80000);
        Notebooks ASUS2 = new Notebooks("ASUS", "AMD", "Windows", 2048, 8, 70300);
        Notebooks SamsungNP960 = new Notebooks("Samsung", "Intel", "Windows", 1024, 32, 420000);
        Notebooks MSI1 = new Notebooks("MSI", "AMD", "Windows", 512, 8, 90000);
        Notebooks MSI2 = new Notebooks("MSI", "AMD", "Windows", 1024, 16, 125000);

        Set<Notebooks> notebooksSet = new HashSet<>();
        notebooksSet.add(ApplePro1);
        notebooksSet.add(ApplePro2);
        notebooksSet.add(AppleAir);
        notebooksSet.add(ASUSPro);
        notebooksSet.add(ASUS2);
        notebooksSet.add(SamsungNP960);
        notebooksSet.add(MSI1);
        notebooksSet.add(MSI2);
        return notebooksSet;
    }
}
