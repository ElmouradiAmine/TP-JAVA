package TP2;

public class Pile {
    private char[] tableau;
    private int sommet;
    final static int MAX = 100;

    Pile(){
        tableau = new char[MAX];
        sommet = -1;
    }

    void empiler(char c) throws ExceptionPileOverflow{
        if (!estPleine())
            tableau[++sommet] = c;
        else
            throw new ExceptionPileOverflow();
    }
    char depiler() throws ExceptionPileUnderflow {
        if(!estVide())
            return tableau[sommet--];
        else
            throw new ExceptionPileUnderflow();
    }
    boolean estVide(){
        return sommet == -1;
    }
    boolean estPleine(){
        return sommet == MAX;
    }
    char sommet() throws ExceptionPileUnderflow{
        if(!estVide())
            return tableau[sommet];
        else
            throw new ExceptionPileUnderflow();
    }

}
