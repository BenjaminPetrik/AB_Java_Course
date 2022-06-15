package unit3.square;

public class Rectangle implements Shape {
    protected double a;
    protected double b;
    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }
    @Override
    public double getSquare() {
        return a * b;
    }

    @Override
    public double getPerimeter() {
        return (a + b) * 2;
    }

    public double[] getSides() {
        return new double[] {a, b};
    }
}
