package actions.spawnActions;

import actions.Actions;
import entitys.Entity;
import entitys.Predator;
import entitys.staticObjects.Rock;
import entitys.staticObjects.resources.Grass;
import map.Coordinates;
import map.Map;

import java.util.Random;

public class GrassSpawn extends Actions {
    Map map = new Map();
    private final Random random = new Random();
    private final int MAP_SIZE = map.getMapSize();
    private final int QUANTITY_GRASS = MAP_SIZE/10;


        public void spawnGrass(Map map, Actions actions) {
            for (int i = 0; i <= QUANTITY_GRASS; i++) {
                map.setEntity(actions.getEmptyCoordinates(map, null), new Grass());
            }
        }
    }



