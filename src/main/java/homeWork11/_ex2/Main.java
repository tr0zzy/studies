package homeWork11._ex2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ведите число: ");
        int num = scanner.nextInt();

        try {
            NumberChecker.checkNumber(num);
        }catch (NegativeNumberException e){
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
}
