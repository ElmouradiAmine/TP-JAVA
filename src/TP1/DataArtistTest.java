package TP1;

public class DataArtistTest {
    public static void main(String[] args){
        DataArtist.draw(5);
        DataArtist.draw("Help me!");
        DataArtist.draw(2.98);
        DataArtist.draw(8,9.09);
    }
}

class DataArtist {
    static void draw(int i){
        System.out.println("Ceci est un entier :" + i);
    }
    static void draw(double f){
        System.out.println("Ceci est un double :" + f);
    }
    static void draw(String s){
        System.out.println("Ceci est une chaine de caratere : " + s);
    }
    static void draw(int i, double f){
        System.out.format("un entier %d et un double %f",i,f);
    }
}
