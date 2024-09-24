package simulation;


import actions.Actions;
import entitys.Entity;
import map.ConsoleMapRender;
import map.Map;

public class Main {
    public static void main(String[] args) {
       Simulation simulation = new Simulation();
       ConsoleMapRender consoleMapRender = new ConsoleMapRender();

        simulation.startGame(consoleMapRender);

    }
}