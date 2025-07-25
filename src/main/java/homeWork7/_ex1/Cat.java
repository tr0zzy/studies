package homeWork7._ex1;

public class Cat implements Animal{

  @Override
  public void makeSound(){
       System.out.println("Cat: Meow!");
   }

    @Override
    public void move() {
        System.out.println("Cat is eating...");
    }
}
