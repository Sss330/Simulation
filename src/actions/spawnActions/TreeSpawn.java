package actions.spawnActions;

import actions.Actions;
import entitys.staticObjects.Tree;
import entitys.staticObjects.resources.Grass;
import map.Map;

import java.util.Random;

public class TreeSpawn {

    Map map = new Map();
    private final Random random = new Random();
    private final int mapSize = map.getMapSize();
    private final int QUANTITY_TREE = mapSize/15;


    public void spawnTree(Map map, Actions actions) {
        for (int i = 0; i <= QUANTITY_TREE; i++) {
            map.setEntity(actions.getEmptyCoordinates(map, null), new Tree());
        }
    }
}