package TP4bis;

public class Vetement extends Article {
    int taille;
    String couleur;

    public Vetement() {
        super();
        taille = 0;
        couleur = "Noire";
    }

    public Vetement(int n, String m, double p, int q,int taille,String couleur) {
        super(n, m, p, q);
        this.taille = taille;
        this.couleur = couleur;
    }
}
