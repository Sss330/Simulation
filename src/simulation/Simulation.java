package simulation;

import actions.Actions;
import actions.spawnActions.*;
import entitys.Entity;
import entitys.Herbivore;
import entitys.staticObjects.resources.Grass;
import map.ConsoleMapRender;
import map.Map;

public class Simulation {



    public void startGame (ConsoleMapRender consoleMapRender){
        Map map = new Map ();
        Actions actions = new Actions();
        GrassSpawn grassSpawn = new GrassSpawn();
        RockSpawn rockSpawn = new RockSpawn();
        HerbivoreSpawn herbivoreSpawn = new HerbivoreSpawn();
        PredatorSpawn predatorSpawn = new PredatorSpawn();
        TreeSpawn treeSpawn = new TreeSpawn();

            predatorSpawn.spawnPredator(map,actions);
            rockSpawn.spawnRock(map,actions);
            grassSpawn.spawnGrass(map, actions);
            herbivoreSpawn.spawnHerbivore(map,actions);
            treeSpawn.spawnTree(map,actions);
            consoleMapRender.mapRender(map);

    }
}
