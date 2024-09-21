package simulation;

import actions.spawnActions.GrassSpawn;
import entitys.staticObjects.resources.Grass;
import map.ConsoleMapRender;
import map.Map;

public class Simulation {



    public void startGame (ConsoleMapRender consoleMapRender){

        Map map = new Map ();
        GrassSpawn grassSpawn = new GrassSpawn();
        grassSpawn.spawnGrass(map);
        consoleMapRender.mapRender(map);

    }

    public void gameLoop (){
   /* while (true) {

        }*/
    }

}
