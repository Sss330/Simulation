package map;

import entitys.Entity;

import java.util.HashMap;


public class Map {
    public static final int MAP_WIDTH = 40;
    public static final int MAP_HEIGHT = 20;

    public final HashMap<Coordinates, Entity> map = new HashMap<>();

    public void setEntity(Coordinates coordinates, Entity entity) {
        map.put(coordinates, entity);
    }
    public Entity getEntity(Coordinates coordinates) {
        return map.get(coordinates);
    }

    public void deleteEntity(Coordinates coordinates, Entity entity) {
        map.remove(coordinates, entity);
    }

    public boolean isCellEmpty(Coordinates coordinates) {
        return !map.containsKey(coordinates);
    }

    public int getMapSize() {
        return MAP_WIDTH * MAP_HEIGHT;
    }
}
