package TP7;

interface Pile {
    int MAX = 8;

    void empiler(char c);
    // Empile un char
    char sommet();
    // Retourne le sommet de la pile
    void depiler();
    // Retire le sommet de la pile
    boolean vide();
    // Teste si la pile est vide
    boolean pleine();
    // Teste si la pile est pleine
}
