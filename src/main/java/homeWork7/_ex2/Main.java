package homeWork7._ex2;

public class Main {
    public static void main(String[] args) {
        Book book = new Book("Notebook", 99);
        Laptop laptop = new Laptop("Dell", 1000);
        Toy toy = new Toy("Car", 50);

        Cart cart = new Cart();
        cart.Product(book);
        cart.Product(laptop);
        cart.Product(toy);

        System.out.println("Before discount:");
        cart.showProduct();
        System.out.println("Total: " + cart.getTotalPrice() + "$");

        cart.applyDiscounts(10); // 10% скидка на Book и Toy

        System.out.println("\nAfter discount:");
        cart.showProduct();
        System.out.println("Total: " + cart.getTotalPrice() + "$");

    }
}
