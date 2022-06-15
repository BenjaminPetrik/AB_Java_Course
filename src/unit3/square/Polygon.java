package unit3.square;

public class Polygon implements Shape {
    private final double[] lengths;

    public Polygon(double... lengths) {
        this.lengths = lengths;
    }

    @Override
    public double getSquare() {
        return 0;
    }

    @Override
    public double getPerimeter() {
        double perimeter = 0;

        for (var len: lengths) {
            perimeter += len;
        }

        return perimeter;
    }
}
