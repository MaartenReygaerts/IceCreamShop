package be.intecBrussel.eatables;

import java.lang.reflect.Array;
import java.util.Arrays;

/*
 * @author Maarten Reygaerts
 * @version 11
 * */
public class Cone implements Eatable {
    Flavor[] balls = new Flavor[]{};

    //constructors
    public Cone() {

    }

    public Cone(Flavor[] flavor) {
        this.balls = flavor;
    }

    //getters en setters
    public Flavor[] getBalls() {
        return balls;
    }

    public void setBalls(Flavor[] balls) {
        this.balls = balls;
    }
    //methods

    @Override
    public void eat() {
        System.out.println("Je bent een ijsje aan het eten met de bollen: " + Arrays.toString(balls));
    }
}
