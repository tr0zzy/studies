package homeWork5._ex1;

public class Main {
    public static void main(String[] args) {
        Shape[] shape = new Shape[3];
        shape[0] = new Circle("Blue", 5);
        shape[1] = new Rectangle("Red", 10, 14);
        shape[2] = new Triangle("Black", 10, 13, 15);
        for (Shape shapes : shape){
            System.out.println("Color: " + shapes.getColor());
            System.out.println("Area: " + shapes.getArea());
            System.out.println("Perimetr: " + shapes.getPerimeter());

        }
    }
}
