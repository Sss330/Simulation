package searchPath;

import entitys.Creature;
import map.Coordinates;
import map.Map;

import java.util.*;

public class BreadthFirstSearch {

    public List<Coordinates> BFS(Map map, Coordinates startCoordinates, Creature creature) {

        Queue<Coordinates> queue = new LinkedList<>();
        Set<Coordinates> checkedCells = new HashSet<>();
        HashMap<Coordinates, Coordinates> path = new HashMap<>();
        List<Coordinates> newPath = new ArrayList<>();

        queue.offer(startCoordinates);

        while (!queue.isEmpty()) {
            Coordinates currentCoordinate = queue.poll(); // currentCoordinate - текущие координаты

            if (creature.canEat(map, currentCoordinate)) {
                return recreatePath(currentCoordinate, path);
            }
            checkedCells.add(currentCoordinate);

            Coordinates[] directions = {
                    new Coordinates(currentCoordinate.getX() + 1, currentCoordinate.getY()),
                    new Coordinates(currentCoordinate.getX() - 1, currentCoordinate.getY()),
                    new Coordinates(currentCoordinate.getX(), currentCoordinate.getY() + 1),
                    new Coordinates(currentCoordinate.getX(), currentCoordinate.getY() - 1)
            };

            for (Coordinates nextCoordinate : directions) {
                if (areCoordinatesInMapBounds(nextCoordinate) &&
                        isCellExplorable(checkedCells, queue, nextCoordinate) &&
                        canMove(map, nextCoordinate)) {

                    queue.offer(nextCoordinate);
                    path.put(nextCoordinate, currentCoordinate);
                }
            }
        }
        return newPath;
    }

    private boolean areCoordinatesInMapBounds(Coordinates coordinates) {
        int x = coordinates.getX();
        int y = coordinates.getY();
        return x < Map.MAP_WIDTH && x >= 0 && y < Map.MAP_HEIGHT && y >= 0;
    }


    private boolean isCellExplorable(Set<Coordinates> checkedCells, Queue<Coordinates> queue, Coordinates nextCoordinate) {
        return !checkedCells.contains(nextCoordinate) && !queue.contains(nextCoordinate);
    }

    private boolean canMove(Map map, Coordinates nextCoordinate) {
        return map.isCellEmpty(nextCoordinate);
    }

    private List<Coordinates> recreatePath(Coordinates endCoordinate, HashMap<Coordinates, Coordinates> path) {
        List<Coordinates> newPath = new ArrayList<>();
        Coordinates current = endCoordinate;

        while (current != null) {
            newPath.add(current);
            current = path.get(current);
        }

        Collections.reverse(newPath);
        return newPath;
    }
}