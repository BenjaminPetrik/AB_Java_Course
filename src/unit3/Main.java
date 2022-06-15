package unit3;

import unit3.robots.DancingRobot;
import unit3.robots.RealRobot1;
import unit3.robots.RealRobot2;
import unit3.square.Circle;
import unit3.square.Rectangle;
import unit3.square.Square;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        printRobotDanceType(new RealRobot1());
        printRobotDanceType(new RealRobot2());

        getCircleSquare(new Circle(1));
        getRectangleSquare(new Rectangle(5, 5));
        getSquareSquare(new Square(3));
    }
    private static void getSquareSquare(Square square) {
        System.out.println("Sides are " + Arrays.toString(square.getSides()));
        System.out.println("Side " + square.getSquareSide());
        System.out.println("Square " + square.getSquare());
    }
    private static void getCircleSquare(Circle circle) {
        System.out.println("==============");
        System.out.println("The radius is " + circle.getRadius());
        System.out.println("Square of the circle is r * r * PI = " + circle.getSquare());
        System.out.println("==============\n");
    }
    private static void getRectangleSquare(Rectangle rectangle) {
        System.out.println("==============");
        System.out.println("The rectangle A side is " + rectangle.getSides()[0]
                + " and B side is " + rectangle.getSides()[1]);
        System.out.println("Square of the rectangle is A * B = " + rectangle.getSquare());
        System.out.println("==============\n");
    }
    private static void printRobotDanceType(DancingRobot robot) {
        System.out.println("==============");
        System.out.println("Robot is dancing (dancetype1) "+ robot.getDanceType1());
        System.out.println("Robot is dancing (dancetype2) "+ robot.getDanceType2());
        System.out.println("Robot is dancing (defaultdance = dancetype1) "+ robot.getDefaultDanceType());
        System.out.println("==============\n");
    }
}
