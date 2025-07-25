package homeWork7._ex2;

public class Laptop implements Product{

    private String name;
    private double price;

    public Laptop(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getPrice() {
        return price;
    }
}
