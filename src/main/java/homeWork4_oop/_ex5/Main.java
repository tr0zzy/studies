package homeWork4_oop._ex5;

public class Main {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[2];
        shapes[0] = new Circle(5.0);
        shapes[1] = new Rectangle(5, 6);
        for(Shape s1 : shapes) {
            System.out.println("Area: " + s1.getArea());
        }
    }
}
