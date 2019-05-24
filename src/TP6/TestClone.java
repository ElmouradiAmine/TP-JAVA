package TP6;

class TestClone {
    public static void main(String args[]){
        Cellule x = new Cellule();        // x Objet Cellule
        x.afficher();
        Cellule y = (Cellule) x.clone();  // y clone de x
        x.changeMe();
        x.afficher();
        y.afficher();
    }
}