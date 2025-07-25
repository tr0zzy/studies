package homeWork5._ex1;

public abstract class Shape {

    protected String color;

    public Shape(String color) {
        this.color = color;
    }

    public abstract double getArea();

    public abstract double getPerimeter();

    public String getColor(){
        return color;
    }


}
