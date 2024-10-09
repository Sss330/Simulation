package actions.move_action;

import actions.Actions;
import entities.Creature;
import entities.Herbivore;
import entities.static_objects.resources.Grass;
import map.Coordinates;
import map.Map;
import search_path.BreadthFirstSearch;
import java.util.List;

public class MoveEntities {
    Coordinates coordinates = new Coordinates(null, null);

    public void moveEntities(BreadthFirstSearch breadthFirstSearch, Map map, Coordinates startCoordinates, Creature creature) {

        List<Coordinates> path = breadthFirstSearch.BFS(map, startCoordinates, creature);

        if (!path.isEmpty()){
            for (Coordinates nextCoordinate : path){
                map.setEntity(nextCoordinate, creature);
                map.deleteEntity(startCoordinates, creature);
                startCoordinates = nextCoordinate;
            }
        }
    }
}
