package simulation;

import actions.Actions;
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

    public void startGame() {
        spawnEntities();
        int asd = 5;
        while (asd > 0) { // Основной цикл игры
            updateEntities(); // Обновляем состояние существ
            consoleMapRender.mapRender(map); // Отрисовываем карту
           asd--;
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

    private Coordinates getCoordinatesOfEntity(Entity targetEntity) {
        for (Coordinates coordinates : map.map.keySet()) {
            Entity currentEntity = map.getEntity(coordinates);
            if (currentEntity.equals(targetEntity)) {
                return coordinates; // Возвращаем координаты найденного объекта
            }
        }
        return null;
    }
}