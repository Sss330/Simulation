package actions.spawnActions;

import actions.Actions;
import entitys.staticObjects.resources.Grass;
import map.Coordinates;
import map.Map;

import java.util.Random;

public class GrassSpawn extends Actions {
    private final Random random = new Random();
    private final int QUANTITY_GRASS = 5;

    public void spawnGrass(Map map) {
        for (int i = 0; i < QUANTITY_GRASS; i++) {
            int firstRandomCoordinate = random.nextInt(20);
            int secondRandomCoordinate = random.nextInt(30);
            Coordinates coordinates = new Coordinates(firstRandomCoordinate, secondRandomCoordinate);

            if (map.isCellEmpty(coordinates)) {
                map.setEntity(coordinates, new Grass());
            }
        }
    }
}
