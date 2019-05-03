package TP4;
public class Rectangle {
    Point hg,bd;



    public Rectangle(){
        hg = new Point();
        bd = new Point();
    }

    public Rectangle(Point hg,Point bd){
        this.hg = new Point(hg);
        this.bd = new Point(bd);
    }

    public Rectangle(Rectangle rectangle){
        this.hg = new Point(hg);
        this.bd = new Point(bd);
    }
    public Point getHg() {
        return hg;
    }

    public void setHg(Point hg) {
        this.hg = hg;
    }

    public Point getBd() {
        return bd;
    }

    public void setBd(Point bd) {
        this.bd = bd;
    }
    public void afficher(){
        System.out.println("hg_x = " + hg.getX() );
        System.out.println("hg_y = " + hg.getY() );
        System.out.println("bd_x = " + bd.getX() );
        System.out.println("bd_y = " + bd.getY() );
    }

    public int surface(){
        return Math.abs((hg.getX()-bd.getX())*(hg.getY()-bd.getY()));
    }

    public void zoom(int deltax, int deltay){
        hg.setX(hg.getX()+deltax);
        hg.setY(hg.getY()+deltay);
        bd.setX(bd.getX()-deltax);
        bd.setY(bd.getY()-deltay);
    }

    public void deplacer(int deltax, int deltay){
        hg.setX(hg.getX()+deltax);
        hg.setY(hg.getY()+deltay);
        bd.setX(bd.getX()+deltax);
        bd.setY(bd.getY()+deltay);
    }



}
