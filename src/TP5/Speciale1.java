package TP5;

class Speciale1 extends Generale {
    public void qui() {
        // Implementation de qui()
        System.out.println("C'est la sous-classe Speciale1");
    }

    @Override
    public void moi() {
        System.out.println("Moi generale overridden");
    }
}