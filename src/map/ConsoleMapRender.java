package map;

import entitys.Entity;
import entitys.Herbivore;
import actions.Actions;
import entitys.Predator;
import entitys.staticObjects.resources.Grass;
import entitys.staticObjects.Rock;
import entitys.staticObjects.Tree;

public class ConsoleMapRender extends Actions {

    public static final String GROUND = "🟫 ";
    public static final String HERBIVORE = "🐷 ";
    public static final String PREDATOR = "🐯 ";
    public static final String GRASS = "🍀 ";
    public static final String ROCK = "🗻 ";
    public static final String TREE = "🌳 ";
    private static final String EMPTY = " . ";

    StringBuilder stringBuilder = new StringBuilder();

    // отрисовка карты
    public void mapRender(Map map) {
        for (int y = Map.MAP_HEIGHT - 1; y > -1; y--) {
            stringBuilder.setLength(0);
            for (int x = 0; x < Map.MAP_WIDTH; x++) {
                Coordinates coordinates = new Coordinates(x, y);
                if (map.isCellEmpty(coordinates)) {
                    stringBuilder.append(GROUND);
                } else {
                    stringBuilder.append(selectEmoji(map.getEntity(coordinates)));
                }
            }
            System.out.println(stringBuilder);
        }
    }

    // выбор эмоджи
    private String selectEmoji(Entity entity) {

        if (entity instanceof Herbivore) {
            return HERBIVORE;
        } else if (entity instanceof Predator) {
            return PREDATOR;
        } else if (entity instanceof Grass) {
            return GRASS;
        } else if (entity instanceof Rock) {
            return ROCK;
        } else if (entity instanceof Tree) {
            return TREE;
        }
        //нужно поменять GROUND на EMPTY
        return GROUND;
    }
}


