package TP1;

import java.util.Scanner;

public class monChar {
    public static void main(String[] args){
        char monChar;
        Scanner clavier = new Scanner(System.in);
        monChar = clavier.next().charAt(0);
        System.out.println(monChar);
    }
}
