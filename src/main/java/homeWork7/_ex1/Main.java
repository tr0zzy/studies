package homeWork7._ex1;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
       Animal dog = new Dog();
       Animal cat = new Cat();
       Animal bird = new Bird();

        List<Animal> animals = Arrays.asList( dog, cat, bird);
        allAnimals.interactWithAnimals(animals);

    }
}
