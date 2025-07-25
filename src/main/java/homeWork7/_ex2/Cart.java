package homeWork7._ex2;

import java.util.ArrayList;

public class Cart {

    private ArrayList<Product> products = new ArrayList<>();

    public void Product(Product product){
        products.add(product);
    }
    public void applyDiscounts(double percent) {
        for (Product product : products) {
           if (product instanceof Dicountable){
               ((Dicountable) product).applyDiscount(percent);
           }
        }
    }
    public double getTotalPrice(){
        double total = 0;
        for (Product product : products) {
            total += product.getPrice();
        }
        return total;
    }
    public void showProduct(){
        for(Product product : products){
            System.out.println(product.getName() + " - " + product.getPrice() + "$");
        }
    }
}