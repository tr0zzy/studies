package homeWork7._ex1;

public class Dog implements Animal{

    @Override
    public void makeSound() {
        System.out.println("Dog: Bark!");
    }
    @Override
    public void move(){
        System.out.println("Dog is runs...");
    }
}
