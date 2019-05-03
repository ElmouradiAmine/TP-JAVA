package TP1;

public class Ellipse {
    public static void main(String[] args){
        int[] tableau = {5, 8, 7, 6};
        f('l',8,9,9,8);


    }

    private static void f(char c, int... p){
        System.out.println(c + " " + p.length);
        for (int e:p) System.out.println("  " + e);
    }



}
