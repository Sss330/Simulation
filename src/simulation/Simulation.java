package simulation;

import actions.Actions;
import actions.moveActions.MoveEntitys;
import actions.spawnActions.*;
import entitys.Creature;
import entitys.Entity;
import map.ConsoleMapRender;
import map.Coordinates;
import map.Map;
import searchPath.BreadthFirstSearch;

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
    MoveEntitys moveEntitys = new MoveEntitys();

    public void startGame() {
        spawnEntities();

        int iterations = 100;
        while (iterations > 0) {
            updateEntities();


            List<Coordinates> creatureCoordinates = getAllCreatureCoordinates();


            for (Coordinates coordinates : creatureCoordinates) {
                Entity entity = map.getEntity(coordinates);
                if (entity instanceof Creature) {
                    moveEntitys.moveEntitys(breadthFirstSearch, map, coordinates, (Creature) entity);
                }
            }

            consoleMapRender.mapRender(map);
            System.out.println("\n\n");
            iterations--;
        }
    }

    public void spawnEntities() {
        predatorSpawn.spawnPredator(map, actions);
        rockSpawn.spawnRock(map, actions);
        grassSpawn.spawnGrass(map, actions);
        herbivoreSpawn.spawnHerbivore(map, actions);
        treeSpawn.spawnTree(map, actions);
        consoleMapRender.mapRender(map);
    }

    public void updateEntities() {

    }

    private List<Coordinates> getAllCreatureCoordinates() {
        List<Coordinates> coordinatesList = new ArrayList<>();
        for (Coordinates coordinates : map.map.keySet()) {
            Entity currentEntity = map.getEntity(coordinates);
            if (currentEntity instanceof Creature) {
                coordinatesList.add(coordinates);
            }
        }
        return coordinatesList;
    }
}