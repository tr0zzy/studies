package homeWork4_oop._ex6;

public class Main {
    public static void main(String[] args) {
        Order order = new Order();
        Product p1 = new Product("Phone", 999.0);
        Product p2 = new Product("Milk", 25.30);
        order.addProducts(p1);
        order.addProducts(p2);

        System.out.println("Total: " + order.getTotalPrice());

    }
}
