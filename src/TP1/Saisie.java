package TP1;

import java.util.Scanner;

public class Saisie {
    public static void main(String[] args){
        Scanner clavier = new Scanner(System.in);
        System.out.print("Donnez un entier :");
        int n = clavier.nextInt();
        System.out.println(n*2);
    }
}
