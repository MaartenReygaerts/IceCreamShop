package be.intecBrussel.sellers;

import be.intecBrussel.eatables.Magnum;
import be.intecBrussel.eatables.MagnumTypes;

public class PriceList {
    private double ballPrice;
    private double rocketPrice;
    private double magnumStandardPrice;

    //constructors

    public PriceList() {
        this.ballPrice = 1;
        this.rocketPrice = 1.5;
        this.magnumStandardPrice = 2.5;
    }

    public PriceList(double ballPrice, double rocketPrice, double magnumStandardPrice) {
        this.ballPrice = ballPrice;
        this.rocketPrice = rocketPrice;
        this.magnumStandardPrice = magnumStandardPrice;
    }

    //setters
    public void setBallPrice(double ballPrice) {
        this.ballPrice = ballPrice;
    }

    public void setRocketPrice(double rocketPrice) {
        this.rocketPrice = rocketPrice;
    }

    public void setMagnumStandardPrice(double magnumStandardPrice) {
        this.magnumStandardPrice = magnumStandardPrice;
    }

    //getters
    public double getBallPrice() {
        return ballPrice;
    }

    public double getRocketPrice() {
        return rocketPrice;
    }

    public double getMagnumStandardPrice(MagnumTypes magnumType) {
        //todo
        if(MagnumTypes.ALPINENUTS.equals(magnumType)){
            magnumStandardPrice = magnumStandardPrice * 1.5;

        }
        return magnumStandardPrice;
    }

}
