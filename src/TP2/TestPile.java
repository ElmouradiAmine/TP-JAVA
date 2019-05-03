package TP2;

public class TestPile {
    public static void main(String[] args) throws ExceptionPileUnderflow ,ExceptionPileOverflow{
        Pile pile = new Pile();
        pile.empiler('a');
        pile.empiler('m');
        pile.empiler('i');
        pile.empiler('n');
        pile.empiler('e');
        while ( !pile.estVide()){
            System.out.println(pile.depiler());
        }
        try {
            System.out.println(pile.depiler());
        } catch (ExceptionPileUnderflow e){
            System.out.println("Impossible de depiler une pile vide.");
        }

    }
}
