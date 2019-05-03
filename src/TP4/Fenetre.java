package TP4;

public class Fenetre {
    Rectangle rectangle;
    String text;
    String titre;

    Fenetre(Rectangle rectangle, String text, String titre){
        this.rectangle = rectangle;
        this.text = text;
        this.titre = titre;
    }

    public void deplacer(int deltax, int deltay){
        rectangle.deplacer(deltax,deltay);
    }
    public void agrandir(int deltax,int deltay){
        rectangle.zoom(deltax, deltay);
    }

}
