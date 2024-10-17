package actions.spawn_actions;

import actions.Actions;
import entities.static_objects.resources.Grass;
import map.Map;

import java.util.Random;

public class GrassSpawn {


    public void spawnGrass(Map map, Actions actions) {
        int mapSize = map.getMapSize();
        int quantityGrass = mapSize / 10;
        for (int i = 0; i <= quantityGrass; i++) {
            map.setEntity(actions.getRandomEmptyCoordinates(map, null), new Grass());
        }
    }
}



