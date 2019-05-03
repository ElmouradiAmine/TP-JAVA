package TP4bis;

public class ArticleLuxe extends Article{

    public ArticleLuxe() {
        super();
    }



    public ArticleLuxe(int n, String m, double p, int q) {
        super(n, m, p, q);
    }

    @Override
    public double prixTTC(){
        return prixHt * 1.25;
    }
}
