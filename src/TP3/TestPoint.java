package TP3;

public class TestPoint {
    public static void main(String[] args){
        Point p = new Point(2,4);
        p.setX(9);
        p.setY(10);
        System.out.println(p.getX());
        System.out.println(p.getY());

        p.reset();
        System.out.println(p.getX());
        System.out.println(p.getY());
        Point p2 = new Point(9,10);
        System.out.println(p.distance(p2));

    }
}
