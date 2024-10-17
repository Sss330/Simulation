package map;


import entities.Entity;

import java.util.HashMap;
import java.util.Set;



public class Map {
    private final int mapWidth;
    private final int mapHeight;


    public Map(int mapHeight, int mapWidth) {
        this.mapWidth = mapWidth;
        this.mapHeight = mapHeight;
    }

    private final HashMap<Coordinates, Entity> map = new HashMap<>();

    public int getMapWidth() {
        return mapWidth;
    }

    public int getMapHeight() {
        return mapHeight;
    }

    public void setEntity(Coordinates coordinates, Entity entity) {
        map.put(coordinates, entity);
    }

    public Boolean getContainsKey (Coordinates coordinates){
       return map.containsKey(coordinates);
    }

    public Set<Coordinates> getKeySet() {
        return map.keySet();
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
        return mapWidth * mapHeight;
    }
}
