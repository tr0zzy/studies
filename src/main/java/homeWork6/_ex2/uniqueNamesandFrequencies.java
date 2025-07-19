package homeWork6._ex2;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class uniqueNamesandFrequencies {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Anna", "Ivan", "Anna", "Petr", "Ivan", "Oleg");
        Map<String, Integer> frequencyMap = new HashMap<>();
        for (String name : names) {
            frequencyMap.put(name, frequencyMap.getOrDefault(name, 0) + 1);
        }
        System.out.println("Уникальные имена:");
        for (Map.Entry<String, Integer> entry : frequencyMap.entrySet()) {
            if (entry.getValue() == 1) {
                System.out.println(entry.getKey());
            }
        }

        System.out.println("-----------------------------------------");
        System.out.println("Частоты имён:");
        for (Map.Entry<String, Integer> entry : frequencyMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
