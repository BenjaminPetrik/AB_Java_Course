package unit9.square;

import unit9.MyAnnotation;

@MyAnnotation(value = {"testMyAnnotation"}, myInt = 4)
public class Circle implements Shape {
    private final double r;
    public Circle(double r) {
        this.r = r;
    }
    @Override
    public double getSquare() {
        return r * r * Math.PI;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * r;
    }

    public double getRadius() {
        return r;
    }
}
