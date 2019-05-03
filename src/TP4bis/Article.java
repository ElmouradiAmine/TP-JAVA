package TP4bis;

public class Article {
        protected String designation;
        protected int numero;
        protected double prixHt;
        protected int qte;


        Article(){
            designation = "spécimen";
            numero = 222;
            prixHt = 1.1;
            qte = 0;

        }
    Article(Article a){
        designation = a.designation;
        numero = a.numero;
        prixHt = a.prixHt;
        qte = a.qte;
    }
    Article(int n, String m, double p, int q){
        designation = m;
        numero = n;
        prixHt = p;
        qte = q;
    }

    void ajouter(int q){
        qte += q;
    }

    String getDesignation(){
        return designation;
    }

    public int getNumero() {
        return numero;
    }

    public double getPrixHt() {
        return prixHt;
    }

    public int getQte() {
        return qte;
    }

    public double prixTTC(){
        return prixHt * 1.14;
    }
    void retirer(int q){
        qte -= q;
    }
}
