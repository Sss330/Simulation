package map;

public class Coordinates {
    private final Integer x;
    private final Integer y;


    public Coordinates(Integer x, Integer y) {
        this.x = 20;
        this.y = 20;
    }

    public Integer getY() {
        return y;
    }

    public  Integer getX() {
        return x;
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
