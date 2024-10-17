package actions.spawn_actions;

import actions.Actions;
import entities.Herbivore;
import entities.static_objects.resources.Grass;
import map.Map;

public class HerbivoreSpawn {


    public void spawnHerbivore(Map map, Actions actions) {

        int mapSize = map.getMapSize();
        int quantityHerbivore = mapSize / 8;

        for (int i = 0; i <= quantityHerbivore; i++) {
            map.setEntity(actions.getRandomEmptyCoordinates(map, null), new Herbivore());
        }
    }
}



