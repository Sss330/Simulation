package simulation;
import map.ConsoleMapRender;

public class Main {
    public static void main(String[] args) {


        Simulation simulation = new Simulation();
        new ConsoleMapRender();

        simulation.startGame();


    }
}
