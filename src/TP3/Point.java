package TP3;

/*
    Classe Point
 */

public class Point {
    private int x;
    private int y;

    //Constructeur a partir de x et y
    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    public Point(){
        this(0,0);
    }

    public Point(int a){
        x = a;
        y = a;
    }

    public Point(Point p){
        this(p.x,p.y);
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double distance(Point p){
        return Math.sqrt(Math.pow(x-p.x,2)+Math.pow(y-p.y,2));
    }

    public double distance(Point a, Point b){
        return Math.sqrt(Math.pow(a.x-b.x,2)+Math.pow(b.y-a.y,2));
    }

    public void reset(){
        x = 0;
        y = 0;
    }

    public String toString() {
        return "x = " + x + " and y = " + y ;
    }

    public boolean equals(Point p) {
        return x == p.x && y == p.y;
    }
}
