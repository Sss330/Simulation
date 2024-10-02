package actions.move_actions;
import entities.Creature;
import map.Coordinates;
import map.Map;
import search_path.BreadthFirstSearch;
import java.util.List;

public class MoveEntities {

    public void moveEntities (BreadthFirstSearch breadthFirstSearch, Map map, Coordinates startCoordinates, Creature creature) {

       List<Coordinates> path = breadthFirstSearch.BFS(map,startCoordinates,creature);

       if (!path.isEmpty()){
        for (Coordinates nextCoordinate : path){
            map.setEntity(nextCoordinate, creature);
            map.deleteEntity(startCoordinates, creature);
            startCoordinates = nextCoordinate;
        }
       } else
           System.out.println("путь не найден ");
    }
}
