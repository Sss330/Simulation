package actions.spawn_actions;

import actions.Actions;
import entities.static_objects.Tree;
import map.Map;

import java.util.Random;

public class TreeSpawn {

    Map map = new Map();
    private final Random random = new Random();
    private final int mapSize = map.getMapSize();
    private final int QUANTITY_TREE = mapSize/15;


    public void spawnTree(Map map, Actions actions) {
        for (int i = 0; i <= QUANTITY_TREE; i++) {
            map.setEntity(actions.getRandomEmptyCoordinates(map, null), new Tree());
        }
    }
}