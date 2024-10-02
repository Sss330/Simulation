package actions.spawn_actions;

import actions.Actions;
import entities.Herbivore;
import map.Map;

public class HerbivoreSpawn {
    Map map = new Map();
    private final int MAP_SIZE = map.getMapSize();
    private final int QUANTITY_HERBIVORE = MAP_SIZE/9;




    public void spawnHerbivore(Map map, Actions actions) {
        for (int i = 0; i <= QUANTITY_HERBIVORE; i++) {
            map.setEntity(actions.getEmptyCoordinates(map, null), new Herbivore());
        }
    }
}



