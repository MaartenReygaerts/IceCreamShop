package be.intecBrussel.eatables;

/*@author Maarten Reygaerts
 * @version 1
 * */
public class IceRocket implements Eatable {

    //constructor
    public IceRocket() {

    }

    @Override
    public void eat() {
        System.out.println("Je bent een rakketijsje aan het eten.");
    }
}
