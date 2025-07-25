package homeWork6._ex3;

import java.util.List;

public class Order {
    String customerName;
    List<Product> products;

    Order(String customerName, List<Product> products) {
        this.customerName = customerName;
        this.products = products;
    }

}
