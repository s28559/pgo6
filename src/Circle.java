public class Circle implements Figure{

    private final double pi=3.14159;
    private double radius;
    private final String name="Circle";

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getPerimeter() {
        return 2*pi*radius;
    }

    @Override
    public double getArea() {
        return pi*radius*radius;
    }

    @Override
    public String getType() {
        return name;
    }
}