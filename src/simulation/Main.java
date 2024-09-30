package simulation;


import actions.Actions;
import actions.spawnActions.GrassSpawn;
import actions.spawnActions.RockSpawn;
import entitys.Entity;
import map.ConsoleMapRender;
import map.Map;

public class Main {
    public static void main(String[] args) {


        Map map = new Map();
        Simulation simulation = new Simulation();
        ConsoleMapRender consoleMapRender = new ConsoleMapRender();

        simulation.startGame();


    }
}
