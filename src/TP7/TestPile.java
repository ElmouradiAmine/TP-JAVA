package TP7;

public class TestPile {
    static public void main(String[] args){
        MaPile p = new MaPile();
        p.empiler('c');
        p.empiler('d');
        p.empiler('e');
        p.depiler();
        System.out.println(p.sommet());

    }
}
