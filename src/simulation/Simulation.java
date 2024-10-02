package simulation;

import actions.Actions;
import actions.move_actions.MoveEntities;
import actions.spawn_actions.*;
import entities.Creature;
import entities.Entity;
import map.ConsoleMapRender;
import map.Coordinates;
import map.Map;
import search_path.BreadthFirstSearch;

import java.util.ArrayList;
import java.util.List;

public class Simulation {

    Map map = new Map();
    ConsoleMapRender consoleMapRender = new ConsoleMapRender();
    Actions actions = new Actions();
    GrassSpawn grassSpawn = new GrassSpawn();
    RockSpawn rockSpawn = new RockSpawn();
    HerbivoreSpawn herbivoreSpawn = new HerbivoreSpawn();
    PredatorSpawn predatorSpawn = new PredatorSpawn();
    TreeSpawn treeSpawn = new TreeSpawn();
    BreadthFirstSearch breadthFirstSearch = new BreadthFirstSearch();
    MoveEntities moveEntitys = new MoveEntities();

    public void startGame() {
        spawnEntities();

        int iterations = 100;
        while (iterations > 0) {

            List<Coordinates> creatureCoordinates = getAllCreatureCoordinates();

            for (Coordinates coordinates : creatureCoordinates) {
                Entity entity = map.getEntity(coordinates);
                if (entity instanceof Creature) {
                    moveEntitys.moveEntities(breadthFirstSearch, map, coordinates, (Creature) entity);
                }
            }

            consoleMapRender.mapRender(map);
            System.out.println("\n\n");
            iterations--;
        }
    }

    public void spawnEntities() {
        rockSpawn.spawnRock(map, actions);
        grassSpawn.spawnGrass(map, actions);
        treeSpawn.spawnTree(map, actions);
        predatorSpawn.spawnPredator(map, actions);
        herbivoreSpawn.spawnHerbivore(map, actions);
        consoleMapRender.mapRender(map);
    }



    private List<Coordinates> getAllCreatureCoordinates() {
        List<Coordinates> coordinatesList = new ArrayList<>();
        for (Coordinates coordinates : map.getKeySet()) {
            Entity currentEntity = map.getEntity(coordinates);
            if (currentEntity instanceof Creature) {
                coordinatesList.add(coordinates);
            }
        }
        return coordinatesList;
    }
}