package homeWork9._ex1;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5, 12, 8, 21, 3, 7, 14, 18);

        numbers.stream()
                .filter(n -> n % 2 == 0)
                .map(n -> n * 2)
                .forEach(System.out::println);
    }
}
