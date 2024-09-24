package simulation;

import actions.Actions;
import actions.spawnActions.GrassSpawn;
import actions.spawnActions.RockSpawn;
import entitys.Entity;
import entitys.staticObjects.resources.Grass;
import map.ConsoleMapRender;
import map.Map;

public class Simulation {



    public void startGame (ConsoleMapRender consoleMapRender){

        Map map = new Map ();
        GrassSpawn grassSpawn = new GrassSpawn();
        RockSpawn rockSpawn = new RockSpawn();
        Actions actions = new Actions();
        rockSpawn.spawnRock(map);
        grassSpawn.spawnGrass(map,actions);
        consoleMapRender.mapRender(map);

    }
}
