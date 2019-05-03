package TP1;

import java.util.Calendar;
import java.util.Scanner;

public class Bissextile {
    public static void main(String[] args){
        Scanner clavier = new Scanner(System.in);
        int year;
        System.out.println("Saisir une annee");
        year = clavier.nextInt();

        Calendar date = Calendar.getInstance();
        date.set(year,1,28);
        date.add(Calendar.DAY_OF_MONTH,1);
        if(date.get(Calendar.DAY_OF_MONTH) == 29)
            System.out.format("%d est bissextile.",year);
        else System.out.format("%d n'est pas bissextile.",year);
    }
}
