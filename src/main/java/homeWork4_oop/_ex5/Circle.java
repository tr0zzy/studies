package homeWork4_oop._ex5;
class Circle extends Shape{
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }
    @Override
    public double getArea(){
        return Math.PI * radius * radius;
    }
}
