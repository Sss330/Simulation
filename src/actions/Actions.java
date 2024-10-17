package actions;

import entities.Entity;
import map.Coordinates;
import map.Map;

import java.util.Random;

public class Actions {
    
        private final Random random = new Random();

    public Coordinates getRandomEmptyCoordinates(Map map, Entity entity){
        while (true) {
                int firstRandomCoordinate = random.nextInt(map.getMapWidth());
                int secondRandomCoordinate = random.nextInt(map.getMapHeight());
            if (!map.getContainsKey(new Coordinates(firstRandomCoordinate,secondRandomCoordinate))) {
                return new Coordinates(firstRandomCoordinate,secondRandomCoordinate);
            }
        }
    }
}
