public class Parallelogram implements Figure{

    private double baseSide;
    private double side;
    private double height;
    private final String name="Parallelogram";

    public Parallelogram(double baseSide, double side, double height) {
        this.baseSide = baseSide;
        this.side = side;
        this.height = height;
    }

    @Override
    public double getPerimeter() {
        return (2*baseSide)+(2*side);
    }

    @Override
    public double getArea() {
        return baseSide*height;
    }

    @Override
    public String getType() {
        return name;
    }
}
