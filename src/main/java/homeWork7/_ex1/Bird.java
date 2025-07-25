package homeWork7._ex1;

public class Bird implements Animal{


    @Override
    public void makeSound() {
        System.out.println("Bird: Chick chick!");
    }

    @Override
    public void move() {
        System.out.println("Bird is flying...");
    }
}
