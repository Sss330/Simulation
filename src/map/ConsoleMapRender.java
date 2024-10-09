package map;

import entities.Entity;
import entities.Herbivore;
import actions.Actions;
import entities.Predator;
import entities.static_objects.resources.Grass;
import entities.static_objects.Rock;
import entities.static_objects.Tree;

public class ConsoleMapRender extends Actions {

    public static final String GROUND = "⬛";
    public static final String HERBIVORE = "🐷";
    public static final String PREDATOR = "🐯";
    public static final String GRASS = "🍀";
    public static final String ROCK = "🗻";
    public static final String TREE = "🌳";

    StringBuilder stringBuilder = new StringBuilder();

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
    private String selectEmoji(Entity entity) {

        switch (entity) {

            case Predator p -> {
                return PREDATOR;
            }
            case Herbivore h -> {
                return HERBIVORE;
            }
            case Grass g -> {
                return GRASS;
            }
            case Rock r -> {
                return ROCK;
            }
            case Tree t -> {
                return TREE;
            }
            default -> throw new IllegalStateException("Unexpected value: " + entity);
        }
    }
}


