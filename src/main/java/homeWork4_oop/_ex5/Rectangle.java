package homeWork4_oop._ex5;

class Rectangle extends Shape{
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }
    @Override
    public double getArea(){
        return width * height;
    }
}
