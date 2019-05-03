package TP4;

public class Point {
    int x,y;

    public Point(){
        x = 0;
        y = 0;
    }
    public Point(int x,int y){
        this.x = x;
        this.y = y;
    }

    public Point(Point p){
        this.x = p.x;
        this.y = p.y;
    }

    @Override
    public String toString() {
        return " x = " + x + " and " + " y = " + y;
    }

    public void setX(int x){
        this.x = x;
    }

    public void setY(int y){
        this.y = y;

    }

    public int getX(){
        return x;
    }

    public int getY(){
        return y;
    }
    public void deplacerX(int d){
        setX(x+d);
    }

    public void deplacerY(int d){
        setY(y+d);
    }

    public void reset(){
        setX(0);
        setY(0);
    }

    public double distance(Point p){
        return Math.sqrt(Math.pow(getX()-p.getX(),2)+Math.pow(getY()-p.getY(),2));

    }
}
