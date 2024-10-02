package actions.spawn_actions;

import actions.Actions;
import entities.static_objects.resources.Grass;
import map.Map;

import java.util.Random;

public class GrassSpawn {
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



