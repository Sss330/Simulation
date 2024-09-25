package actions.spawnActions;

import actions.Actions;
import entitys.Entity;
import entitys.Herbivore;
import entitys.Predator;
import entitys.staticObjects.Rock;
import entitys.staticObjects.resources.Grass;
import map.Coordinates;
import map.Map;

import java.util.Random;

public class HerbivoreSpawn extends Actions {
    private final Random random = new Random();
    private final int QUANTITY_HERBIVORE = 20;
    Map map = new Map();



    public void spawnHerbivore(Map map, Actions actions) {
        for (int i = 0; i <= QUANTITY_HERBIVORE; i++) {
            map.setEntity(actions.getEmptyCoordinates(map, null), new Herbivore());
        }
    }
}



