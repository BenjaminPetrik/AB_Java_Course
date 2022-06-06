package Lesson3_2;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle();
        Rectangle rectangle = new Rectangle();
        System.out.println("Square of the circle is " + circle.getSquare(12.2));
        System.out.println("Square of the rectangle is " + rectangle.getSquare(3.6,7.2));
    }
}
