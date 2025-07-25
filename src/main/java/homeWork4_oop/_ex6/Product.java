package homeWork4_oop._ex6;

public class Product {
    private String name;
    private double price;

    public Product(String name) {
        this.name = name;
    }

    public Product(String phone, double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}
