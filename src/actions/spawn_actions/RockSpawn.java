package actions.spawn_actions;

import actions.Actions;
import entities.static_objects.Rock;
import map.Map;

import java.util.Random;

public class RockSpawn {


    public void spawnRock(Map map, Actions actions) {
        int mapSize = map.getMapSize();
        int quantityRock = mapSize / 15;
        for (int i = 0; i <= quantityRock; i++) {
            map.setEntity(actions.getRandomEmptyCoordinates(map, null), new Rock());
        }
    }
}
