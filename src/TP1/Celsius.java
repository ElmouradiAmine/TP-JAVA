package TP1;

import java.util.Scanner;

public class Celsius {
    public static void main(String[] args){
        Scanner clavier = new Scanner(System.in);
        double c,f;
        System.out.print("Donner une temperature en celsius:");
        c = clavier.nextDouble();
        f = c2f(c);
        System.out.format("%.2f C = %.2f F",c,f);
    }

    private static double c2f(double c){
        return 9./5*c + 32;
    }
}
