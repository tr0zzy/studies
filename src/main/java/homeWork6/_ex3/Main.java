package homeWork6._ex3;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Продукты
        Product apple = new Product("Apple", 1.0);
        Product bread = new Product("Bread", 2.5);
        Product milk = new Product("Milk", 1.5);
        Product meat = new Product("Meat", 8.0);

        // Заказы
        List<Order> orders = Arrays.asList(
                new Order("Alice", Arrays.asList(apple, milk, bread)),
                new Order("Bob", Arrays.asList(meat, milk)),
                new Order("Charlie", Arrays.asList(apple, apple, bread)),
                new Order("Alice", Arrays.asList(meat, milk, apple))
        );

        double totalRevenue = 0;
        Map<String, Double> customerSpending = new HashMap<>();
        Map<String, Integer> productCount = new HashMap<>();

        for (Order order : orders) {
            double orderTotal = 0;
            for (Product product : order.products) {
                orderTotal += product.price;

                // Подсчёт популярных товаров
                productCount.put(product.name, productCount.getOrDefault(product.name, 0) + 1);
            }

            // Общий доход
            totalRevenue += orderTotal;

            // Потрачено клиентом
            customerSpending.put(order.customerName,
                    customerSpending.getOrDefault(order.customerName, 0.0) + orderTotal);
        }

        // Самый дорогой клиент
        String topCustomer = Collections.max(customerSpending.entrySet(),
                Map.Entry.comparingByValue()).getKey();

        // Топ-3 популярных товаров
        List<Map.Entry<String, Integer>> popularProducts = new ArrayList<>(productCount.entrySet());
        popularProducts.sort((a, b) -> b.getValue() - a.getValue());

        // Вывод
        System.out.println("Общий доход магазина: " + totalRevenue + " $");
        System.out.println("Самый дорогой клиент: " + topCustomer);
        System.out.println("Топ-3 популярных товаров:");
        for (int i = 0; i < Math.min(3, popularProducts.size()); i++) {
            Map.Entry<String, Integer> entry = popularProducts.get(i);
            System.out.println((i + 1) + ". " + entry.getKey() + " — " + entry.getValue() + " покупок");
        }
    }
}
