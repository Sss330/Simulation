package actions.moveActions;

import entitys.Creature;
import map.Coordinates;
import map.Map;
import searchPath.BreadthFirstSearch;

import java.util.List;

public class MoveEntitys {


    public void moveEntitys (BreadthFirstSearch breadthFirstSearch, Map map, Coordinates startCoordinates, Creature creature) {

       List<Coordinates> path = breadthFirstSearch.BFS(map,startCoordinates,creature);

       if (!path.isEmpty()){
        for (Coordinates nextCoordinate : path){
            map.setEntity(nextCoordinate, creature);
            map.deleteEntity(startCoordinates, creature);
            startCoordinates = nextCoordinate;
        }
       } else {
           System.out.println("путь не найден ");
       }



    }
}
