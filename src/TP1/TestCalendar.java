package TP1;

import java.util.Calendar;

public class TestCalendar {
    public static void main(String[] args){
        Calendar rightNow = Calendar.getInstance();
        rightNow.add(Calendar.DAY_OF_MONTH,2);
        int j = rightNow.get(Calendar.DAY_OF_MONTH);
        int m = rightNow.get(Calendar.MONTH);
        int a = rightNow.get(Calendar.YEAR);
        String jour = "";

        switch (rightNow.get(Calendar.DAY_OF_WEEK)){
            case 1:
                jour = "Dimanche";
                break;
            case 2:
                jour = "Lundi";
                break;
            case 3:
                jour = "Mardi";
                break;
            case 4:
                jour = "Mercredi";
                break;
            case 5:
                jour = "Jeudi";
                break;
            case 6:
                jour = "Vendredi";
                break;
            case 7:
                jour = "Samedi";
                break;
        }

//        System.out.format("On est le %s %d/%2d/%d",jour,j,m+1,a);
        System.out.format("\nApres demain est le %s %d/%2d/%d\n",jour,j,m+1,a);

        Calendar date = Calendar.getInstance();
        date.set(2016,2,28);
        date.add(Calendar.DAY_OF_MONTH,1);
        if ( date.get(Calendar.DAY_OF_MONTH )== 29)System.out.println("2016 est bissextile");
        else System.out.println("2016 n'est pas bissextile");

    }
}
