package be.intecBrussel.eatables;

/*@author Maarten Reygaerts
 * @version 1
 * */
public class Magnum implements Eatable {
    MagnumTypes type;


    //constructors
    public Magnum() {

    }

    public Magnum(MagnumTypes type) {
        this.type = type;
    }

    //getters en setters
    public MagnumTypes getType() {
        return type;
    }

    public void setType(MagnumTypes type) {
        this.type = type;
    }

    @Override
    public void eat() {
        System.out.println("je bent een " + type + " magnum aan het eten.");
    }
}
