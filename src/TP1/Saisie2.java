package TP1;

import java.util.Scanner;

public class Saisie2 {
    public static void main(String[] args){
        Scanner clavier = new Scanner(System.in);
        int age;
        String nom;
        double taille;

        System.out.print("Quelle est votre nom?:");
        nom = clavier.nextLine();
        System.out.print("Quelle est votre age?:");
        age = clavier.nextInt();
        System.out.print("Quelle est votre taille?:");
        taille = clavier.nextDouble();

        System.out.format("Bonjour %s !\nVous avez %d ans et vous mesurez %.2f metres.",nom,age,taille);



    }
}
