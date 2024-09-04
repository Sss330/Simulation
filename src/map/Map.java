package map;

import java.util.HashMap;

public class Map {
    private final HashMap <Coordinates, Entity> map = new HashMap<>();

    public void placeEntity(Coordinates coordinates, Entity entity){
         entity.coordinates = coordinates;
         map.put(coordinates,entity);
    }
    public void deleteEntity (Coordinates coordinates, Entity entity) {
        map.remove(coordinates,entity);
    }

    public boolean isEmpty (Coordinates coordinates, Entity entity){
        map.isEmpty();

        return true;
    }

    public static class Entity {
        //Корневой абстрактный класс для всех существ и объектов существующих в симуляции.
         String name;
         Coordinates coordinates;

        public Entity(Coordinates coordinates, String name) {
            this.coordinates = coordinates;
            this.name = name;
        }
    }
}
