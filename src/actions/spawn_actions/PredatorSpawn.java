package actions.spawn_actions;

import actions.Actions;
import entities.Predator;
import map.Map;

import java.util.Random;

public class PredatorSpawn {


        private final Random random = new Random();
        Map map = new Map();
        private final int MAP_SIZE = map.getMapSize();
        private final int QUANTITY_PREDATOR = MAP_SIZE/9;


        public void spawnPredator(Map map, Actions actions) {
            for (int i = 0; i <= QUANTITY_PREDATOR; i++) {
                map.setEntity(actions.getRandomEmptyCoordinates(map, null), new Predator());
            }
        }
    }

