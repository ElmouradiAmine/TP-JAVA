package TP4bis;

class TestArticle {
    public static void main(String[] args){

        Article a = new Article () ;
        Article a2 = new Article(1, "Pomme", 10, 100 );
        Article a3 = new Article(a);
        System.out.println(a.getNumero());
        System.out.println(a.getDesignation());
        System.out.println(a.prixTTC());
        System.out.println(a.getQte());

        System.out.println(a2.getNumero());
        System.out.println(a2.getDesignation());
        System.out.println(a2.prixTTC());
        System.out.println(a2.getQte());

        System.out.println(a3.getNumero());
        System.out.println(a3.getDesignation());
        System.out.println(a3.prixTTC());
        System.out.println(a3.getQte());
    }
};