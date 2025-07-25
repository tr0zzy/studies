package homeWork7._ex2;

public class Book implements Product, Dicountable{

    private String name;
    private double price;

    public Book(String name, double price) {
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

    @Override
    public double applyDiscount(double percent) {
        price = price - (price * percent / 100);
        return price;
    }
}
