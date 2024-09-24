package actions.spawnActions;

import actions.Actions;
import entitys.Entity;
import entitys.staticObjects.resources.Grass;
import map.Map;

import java.util.Random;

public class RockSpawn extends Actions {
    private final Random random = new Random();
    private final int QUANTITY_GRASS = 5;
    Map map = new Map();
    Entity entity = new Entity() {
        public int hashCode() {
            return super.hashCode();
        }
    };


    public void spawnRock(Map map) {
        for (int i = 0; i < QUANTITY_GRASS; i++) {
            map.setEntity(actions.getEmptyCoordinates(map, entity), new Grass());
        }
    }
}



