package unit9.square;

import unit9.exceptions.InvalidArgumentsException;

public class Rectangle implements Shape {
    protected double height;
    protected double width;
    public Rectangle(double height, double width) {
        try{
            validateArguments(height, width);
        } finally {
            System.out.println("Finally from Rectangle constructor!");
        }

        this.height = height;
        this.width = width;
    }

    private void validateArguments(double height, double width) {
        try {
            System.out.println("validateArguments 1");
            if (height <= 0) {
                throw new InvalidArgumentsException("Height is non positive!");
            }
            if (width <= 0) {
                throw new InvalidArgumentsException("Width is non positive!"); // another exception just for testing
            }
            //return;
            System.exit(1); // only way to NOT CALL FINALLY
        } finally {
            System.out.println("Finally from Rectangle.validateArguments");
        }
//        System.out.println("validateArguments 2");
    }

    @Override
    public double getSquare() {
        return height * width;
    }

    @Override
    public double getPerimeter() {
        return (height + width) * 2;
    }

    public double[] getSides() {
        return new double[] {height, width};
    }
}
