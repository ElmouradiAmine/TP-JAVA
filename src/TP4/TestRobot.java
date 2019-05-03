package TP4;

public class TestRobot {
    static public void main(String[] args){
        Robot robot = new Robot();
        robot.avancer();
        robot.avancer();
        robot.setDirection(1);
        robot.avancer();
        System.out.println(robot.toString());

        Point p = new Point (6,7);
        System.out.println(p.toString());
        p = robot;
        System.out.println(p.toString());

    }

}
