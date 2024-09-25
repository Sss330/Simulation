package actions;

import entitys.Entity;
import map.Coordinates;
import map.Map;

import java.util.Random;

public class Actions {


        private final Random random = new Random();

    public Coordinates getEmptyCoordinates(Map map, Entity entity){
        while (true) {
                int firstRandomCoordinate = random.nextInt(Map.MAP_WIDTH);
                int secondRandomCoordinate = random.nextInt(Map.MAP_HEIGHT);
            if (!map.map.containsKey(new Coordinates(firstRandomCoordinate,secondRandomCoordinate))) {
                return new Coordinates(firstRandomCoordinate,secondRandomCoordinate);
            }
        }
    }

}
