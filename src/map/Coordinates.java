package map;

import entities.Entity;

import java.util.Random;
import java.util.Scanner;

public class Coordinates {
    private final Integer x;
    private final Integer y;
    private final Random random = new Random();

    public Coordinates(Integer x, Integer y) {
        this.x = x;
        this.y = y;
    }
    public Integer getY() {
        return y;
    }

    public  Integer getX() {
        return x;
    }

    public Coordinates getEmptyCoordinates(Map map, Entity entity){
        while (true) {
            int firstRandomCoordinate = random.nextInt(Map.MAP_WIDTH);
            int secondRandomCoordinate = random.nextInt(Map.MAP_HEIGHT);
            if (!map.getContainsKey(new Coordinates(firstRandomCoordinate,secondRandomCoordinate))) {
                return new Coordinates(firstRandomCoordinate,secondRandomCoordinate);
            }
        }
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Coordinates that = (Coordinates) o;
        return x.equals(that.x) && y.equals(that.y);
    }
    @Override
    public int hashCode() {
        int result = x.hashCode();
        result = 31 * result + y.hashCode();
        return result;
    }
}
