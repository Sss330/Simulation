package actions.spawn_actions;

import actions.Actions;
import entities.Predator;
import entities.static_objects.resources.Grass;
import map.Map;

import java.util.Random;

public class PredatorSpawn {


    public void spawnPredator(Map map, Actions actions) {
        int mapSize = map.getMapSize();
        int quantityPredator = mapSize / 9;

        for (int i = 0; i <= quantityPredator; i++) {
            map.setEntity(actions.getRandomEmptyCoordinates(map, null), new Predator());
        }
    }
}

