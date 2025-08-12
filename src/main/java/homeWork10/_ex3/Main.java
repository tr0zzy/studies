package homeWork10._ex3;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    enum OrderStatus {
        NEW, PROCESSING, SHIPPED, DELIVERED, CANCELLED
    }

    static class Order {
        int id;
        OrderStatus status;

        Order(int id, OrderStatus status) {
            this.id = id;
            this.status = status;
        }

        @Override
        public String toString() {
            return "Order{id=" + id + ", status=" + status + "}";
        }
    }

    public static void main(String[] args) {
        // 1. Создаём список заказов с разными статусами
        List<Order> orders = Arrays.asList(
                new Order(1, OrderStatus.NEW),
                new Order(2, OrderStatus.PROCESSING),
                new Order(3, OrderStatus.SHIPPED),
                new Order(4, OrderStatus.DELIVERED),
                new Order(5, OrderStatus.CANCELLED),
                new Order(6, OrderStatus.SHIPPED),
                new Order(7, OrderStatus.CANCELLED)
        );

        // 2.1. Вывести заказы, которые ещё не доставлены
        List<Order> notDelivered = orders.stream()
                .filter(order -> order.status != OrderStatus.DELIVERED)
                .collect(Collectors.toList());

        System.out.println("Заказы, которые ещё не доставлены:");
        notDelivered.forEach(System.out::println);

        // 2.2. Посчитать количество отменённых заказов
        long cancelledCount = orders.stream()
                .filter(order -> order.status == OrderStatus.CANCELLED)
                .count();

        System.out.println("\nКоличество отменённых заказов: " + cancelledCount);
    }
}
