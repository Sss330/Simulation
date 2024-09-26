package actions.spawnActions;

import actions.Actions;
import entitys.Entity;
import entitys.staticObjects.Rock;
import entitys.staticObjects.resources.Grass;
import map.Map;

import java.util.Random;

public class RockSpawn extends Actions {
    private final Random random = new Random();
    Map map = new Map();
    private final int MAP_SIZE = map.getMapSize();
    private final int QUANTITY_ROCKS = MAP_SIZE/15;




    public void spawnRock(Map map,Actions actions) {
        for (int i = 0; i <= QUANTITY_ROCKS; i++) {
            map.setEntity(actions.getEmptyCoordinates(map, null), new Rock());
        }
    }
}



