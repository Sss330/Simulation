package actions.spawn_actions;

import actions.Actions;
import entities.static_objects.Tree;
import map.Map;

import java.util.Random;

public class TreeSpawn {



    public void spawnTree(Map map, Actions actions) {
        int mapSize = map.getMapSize();
        int quantityTree = mapSize / 15;

        for (int i = 0; i <= quantityTree; i++) {
            map.setEntity(actions.getRandomEmptyCoordinates(map, null), new Tree());
        }
    }
}