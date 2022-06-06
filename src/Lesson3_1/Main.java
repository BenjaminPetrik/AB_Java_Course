package Lesson3_1;

public class Main {
    public static void main(String[] args) {
        RealRobot1 robot1 = new RealRobot1();
        RealRobot2 robot2 = new RealRobot2();
        System.out.println("Robot 1 is dancing "+ robot1.getDanceType2() + "\nRobot 2 is dancing " + robot2.getDefaultDanceType());
    }
}
