package TP5;

abstract class Generale {
    public int x=2; // x variable d'instance (non considérée static)
    abstract public void qui(); // methode abstraite à implementer par les sous-classes
    public void moi(){
        System.out.println("Methode générale");
    }
}