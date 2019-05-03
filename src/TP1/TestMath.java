package TP1;

public class TestMath {
    public static void main(String[] args){
        System.out.println(" e = " + Math.E);
        System.out.println(" pi = " + Math.PI);
        int largeur = 3, longueur = 4;
        double w = Math.pow(largeur,2) + Math.pow(longueur, 2);
        double hypotenuse = Math.sqrt(w);
        System.out.println(" Hypotenuse = " + hypotenuse);
        for (int i = 0 ; i < 6 ; i++)
            System.out.println((int) (Math.random()*50));
    }
}
