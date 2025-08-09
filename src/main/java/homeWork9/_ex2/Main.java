package homeWork9._ex2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Анна", "Пётр", "Алексей", "Мария", "Дмитрий", "Андрей");

        List<String> result = names.stream()
                .filter(name -> name.startsWith("А"))
                .sorted()
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        System.out.println(result);
    }
}
