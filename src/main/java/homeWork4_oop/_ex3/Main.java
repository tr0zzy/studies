package homeWork4_oop._ex3;

public class Main {
    public static void main(String[] args) {
        Dog d1 = new Dog("Bobik");
        d1.makeSound();
        Cat c1 = new Cat("Barsik");
        c1.makeSound();
        Animal[] animals = new Animal[2];
        animals[0] = new Dog("Rex");
        animals[1] = new Cat("Mursik");
        for(Animal a2 : animals){
            a2.makeSound();
        }

    }
}
