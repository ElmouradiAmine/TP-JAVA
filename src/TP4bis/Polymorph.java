package TP4bis;

class PolyMorph {
    public static void main(String args[]){     Article[] chariot = new Article[3];
        chariot [0] = new Article(1, "Pomme", 10, 100 );
        chariot [1] = new ArticleLuxe(2, "iPhone", 200, 100);
        chariot [2] = new Vetement(3, "Chemise", 30, 100, 5, "Vert");
        double montant = 0;
        for (Article p:chariot) {
            montant += p.prixTTC();
        }
        System.out.println(montant);
    }
}