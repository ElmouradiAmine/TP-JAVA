package TP6;

class Cellule extends Object implements Cloneable {
    int i = 0;
    int[] t = {1, 2};

//    public Object clone(){
//        try {
//            return super.clone();
//        }
//        catch (CloneNotSupportedException e){
//            throw new InternalError();
//        }
//    }

    public Cellule (Cellule x){
        this.i = x.i;
        for (int i=0; i<2; i++)
            this.t[i]=x.t[i];
    }
    public Cellule(){

    }


    public Object clone(){
        try {
            Cellule tmp = (Cellule) super.clone();
            tmp.t =  this.t.clone();  //clonage de this.t
            return tmp;
        }
        catch (CloneNotSupportedException e)
        {throw new InternalError(); }
    }
    public void afficher(){
        System.out.println(i +" "+ t[0]+" "+t[1]);
    }

    public void changeMe(){
        i = 10;
        t[0] = 11;
        t[1] = 12;
    }
}