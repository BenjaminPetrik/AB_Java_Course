package Lesson3.square;

public class Circle implements Shape{
    private final double r;
    public Circle(double r) {
        this.r = r;
    }
    @Override
    public double getSquare() {
        return r * r * Math.PI;
    }
    public double getRadius() {
        return r;
    }
}
