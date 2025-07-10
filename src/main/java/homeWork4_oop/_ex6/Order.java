package homeWork4_oop._ex6;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private List<Product> products;

    public Order(){
        products = new ArrayList<>();
    }
    public void addProducts(Product product){
        products.add(product);
    }
    public double getTotalPrice(){
        double total = 0;
        for(Product product : products){
            total += product.getPrice();
        }
        return total;
    }
}
