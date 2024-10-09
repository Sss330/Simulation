package simulation;
import input_of_client.GameStarter;
import map.ConsoleMapRender;

public class Main {
    public static void main(String[] args) {

        GameStarter gameStarter = new GameStarter();
        Simulation simulation = new Simulation();

        gameStarter.startMenu();
        simulation.startGame();
    }
}
