package TP5;

public class TestCoureur {
    public static void main(String[] args) {
        Loisir[] mesLoisirs = {new Coureur(), new Marcheur()};
        for (Loisir loisir : mesLoisirs){
            loisir.courirOuMarcher();
        }

        Marcheur m = new Marcheur();
        Coureur c = new Coureur();
        c.courirOuMarcher();
        m.courirOuMarcher();
        c.courirMoins();
    }
}