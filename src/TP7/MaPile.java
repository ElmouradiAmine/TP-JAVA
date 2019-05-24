package TP7;

public class MaPile implements Pile {
    StringBuilder s;

    MaPile(){
        s = new StringBuilder(MAX);
    }

    @Override
    public void empiler(char c) {
        if (!pleine())
        s.append(c);

    }

    @Override
    public char sommet() {

        return s.charAt(s.length()-1);
    }

    @Override
    public void depiler() {
        if (!vide())
        s.deleteCharAt(s.length()-1);

    }

    @Override
    public boolean vide() {

        return s.length() == 0;
    }

    @Override
    public boolean pleine() {
        return s.length() >= MAX;
    }
}
