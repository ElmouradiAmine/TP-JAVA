package TP2;

class ExceptionPileUnderflow extends Exception {

    ExceptionPileUnderflow(){
    }

    ExceptionPileUnderflow(String s){
        super(s);
    }
}

class ExceptionPileOverflow extends Exception {

    ExceptionPileOverflow(){
    }
    ExceptionPileOverflow(String s){
        super(s);
    }
}