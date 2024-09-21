package entitys;
//живое существо

import map.Coordinates;

public class Creature extends Entity {
     public int hp;
     public int speed;




    public Creature(int hp, int speed, int coordinates, String name) {
    }

    public boolean isAlive() {
        return hp > 0;
    }

    public void makeMove (){
       System.out.println();
    }
}
