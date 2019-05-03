package TP4;

public class Robot extends Point{
    private int direction;

    public Robot(){
        super(0,0);
        direction = 2;
    }

    public void setDirection(int direction) {
        this.direction = direction;
    }

    public int getDirection() {
        return direction;
    }

    public void avancer(){
            switch (direction){
                case 1:
                    y++;
                    break;
                case 2:
                    x++;
                    break;
                case 3:
                    y--;
                    break;
                case 4:
                    x--;
                    break;
                    default:break;

            }
    }


}
