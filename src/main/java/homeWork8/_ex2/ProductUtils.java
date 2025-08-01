package homeWork8._ex2;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ProductUtils {

    public static List<String> transfromProducts (List<Product> products, Function<Product, String> transformer){
        return products.stream()
                .map(transformer)
                .collect(Collectors.toList());
    }
    public static double calculateTotalCost (List<Product> products, Function<Product, Double> costFunction){
       return products.stream()
               .map(costFunction)
               .reduce(0.0, Double::sum);
    }

}
