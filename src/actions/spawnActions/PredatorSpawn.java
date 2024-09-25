package actions.spawnActions;

import actions.Actions;
import entitys.Entity;
import entitys.Herbivore;
import entitys.Predator;
import map.Map;

import java.util.Random;

public class PredatorSpawn extends Actions {
        private final Random random = new Random();
        private final int QUANTITY_PREDATOR = 20;
        Map map = new Map();



        public void spawnPredator(Map map, Actions actions) {
            for (int i = 0; i <= QUANTITY_PREDATOR; i++) {
                map.setEntity(actions.getEmptyCoordinates(map, null), new Predator());
            }
        }
    }

