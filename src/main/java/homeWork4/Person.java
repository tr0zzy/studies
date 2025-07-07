package homeWork4;

public class Person {
    String name;
    int age;

    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }
    public void sayHello(){
        System.out.println("Hello, my name is "+ this.name + " and I am " + this.age + " years old");
    }
}
