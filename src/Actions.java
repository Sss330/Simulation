public class Actions {


    public void initMap (){

    }

    public static class Herbivore extends Creature {

        public Herbivore(Coordinates coordinates, String name) {
            super(coordinates, name);
        }
    }

    public static class Creature extends Map.Entity {

       String name;
       int hp;

       public Creature(Coordinates coordinates, String name) {
          super(coordinates, name);
       }
    }
}
