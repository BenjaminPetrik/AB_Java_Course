package Lesson3_2;

public class Circle implements Shape{

    @Override
    public double getSquare(double r) {
        return r * r * Math.PI;
    }

    @Override
    public double getSquare(double a, double b) {
        return 0;
    }
}
