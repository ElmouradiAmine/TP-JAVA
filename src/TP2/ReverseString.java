package TP2;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) throws ExceptionPileUnderflow,ExceptionPileOverflow{
        Pile pile = new Pile();
        Scanner clavier = new Scanner(System.in);
        String s = clavier.nextLine();
        for (int i = 0 ; i < s.length() ; i++)
            pile.empiler(s.charAt(i));
        while (!pile.estVide()){
            System.out.print(pile.depiler());
        }
    }
}
