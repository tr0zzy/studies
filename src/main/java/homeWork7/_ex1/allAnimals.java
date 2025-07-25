package homeWork7._ex1;

import java.util.List;

public class allAnimals {
    public static void interactWithAnimals(List<Animal> animals){
        for(Animal animal :
                   animals){
            animal.makeSound();
            animal.move();
        }
        System.out.println();
    }
}
