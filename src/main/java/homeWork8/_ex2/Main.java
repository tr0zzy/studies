package homeWork8._ex2;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Product> products = Arrays.asList(
                new Product("Молоко", 20, 1),
                new Product("Хлеб", 11, 2),
                new Product("Печенья", 35, 4)
        );
        List<String> formatted = ProductUtils.transfromProducts(products,
                product -> product.getName() + ": " + product.getQuantity() + " шт. по " + product.getPrice() + " лей"
        );
        formatted.forEach(System.out::println);

        System.out.println("-------------------------------------------");

        double total = ProductUtils.calculateTotalCost(products,
                product -> product.getPrice() * product.getQuantity()
        );

        System.out.println("Общая сумма: " + total + " лей");
    }
}
