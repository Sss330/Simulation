package entitys;
//живое существо
import map.Coordinates;

public class Creature extends Entity {
        String name;
        int hp;
        int speed;

    public Creature(Coordinates coordinates, Entity entity, String name) {
        super(coordinates, entity);
        this.name = name;
    }

    public Creature(String name, int coordinates) {
        super();
    }

}
