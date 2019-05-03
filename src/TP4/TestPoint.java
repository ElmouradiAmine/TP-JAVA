package TP4;/*
C'est la classe Point
 */

public class TestPoint {
    public static void main(String[] args){
        Point p = new Point();
        Point p2 = new Point();

        p.setX(5);
        p.setY(2);

        p2.setX(3);
        p2.setY(2);
        System.out.println("x :" + p.getX() + " and y :" + p.getY());
        System.out.println("distance entre p et p2: " + p.distance(p2));

        Point p3 = new Point();
        Point p4 = new Point();

        p3.setX(2);
        p3.setY(2);

        p4.setX(2);
        p4.setY(2);

        System.out.println(p3.equals(p4)); // true
        System.out.println(p3 == p4); //false


        //Constructeur
        Point p5 = new Point(2,3);
        System.out.println("x :" + p5.getX() + " and y :" + p5.getY());
    }
}
