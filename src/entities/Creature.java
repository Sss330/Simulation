package entities;
//живое существо

import entities.static_objects.resources.Grass;
import map.Coordinates;
import map.Map;

import java.util.ArrayList;
import java.util.List;

public class Creature extends Entity {


    public boolean canEat(Map map, Coordinates coordinates) {
        List<Coordinates> adjacentCoordinates = getAdjacentCoordinates(coordinates);

        for (Coordinates adjacentCoordinate : adjacentCoordinates) {
            Entity entity = map.getEntity(adjacentCoordinate);
            if (entity instanceof Grass||entity instanceof Herbivore) {
                return true;
            }
        }
        return false;
    }




    private static List<Coordinates> getAdjacentCoordinates(Coordinates coordinates) {
        List<Coordinates> adjacentCoordinates = new ArrayList<>();

        int x = coordinates.getX();
        int y = coordinates.getY();


        adjacentCoordinates.add(new Coordinates(x - 1, y));
        adjacentCoordinates.add(new Coordinates(x + 1, y));
        adjacentCoordinates.add(new Coordinates(x, y - 1));
        adjacentCoordinates.add(new Coordinates(x, y + 1));

        return adjacentCoordinates;
    }
}
