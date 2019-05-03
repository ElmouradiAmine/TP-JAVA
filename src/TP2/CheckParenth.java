package TP2;

import java.util.Scanner;

public class CheckParenth {
    public static void main(String[] args) throws ExceptionPileOverflow, ExceptionPileUnderflow {
        Pile pile = new Pile();
        Scanner clavier = new Scanner(System.in);
        String exp = clavier.nextLine();
        String openParenth = "<({[";
        String closedParenth = ">)}]";
        boolean bienParenth = true;
        try {
            for (int i =  0 ; i < exp.length() ; i++){
                if (openParenth.indexOf(exp.charAt(i))!= -1)pile.empiler(exp.charAt(i));
                else {
                    char c = pile.depiler();
                    if (openParenth.charAt(closedParenth.indexOf(exp.charAt(i)))!=c) {
                        bienParenth = false;
                        break;
                    }
                }
            }
        } catch (ExceptionPileOverflow | ExceptionPileUnderflow e){
            bienParenth = false;
        }

        if(!pile.estVide()) bienParenth = false;
        System.out.println(bienParenth);

    }

}
