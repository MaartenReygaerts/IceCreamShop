package be.intecBrussel.sellers;

import be.intecBrussel.eatables.*;

public class IceCreamSalon implements IceCreamSeller {

    PriceList priceList;
    double totalProfit;


    //constructor


    public IceCreamSalon(PriceList priceList) {
        this.priceList = priceList;
    }

    //getters
    public double getTotalProfit() {
        return totalProfit;
    }


    //implement methods
    @Override
    public Cone orderCone(Flavor[] flavors) {
        Cone temp = new Cone(flavors);
        totalProfit += priceList.getBallPrice() * flavors.length;

        return temp;
    }

    @Override
    public IceRocket orderIceRocket() {
        IceRocket temp = new IceRocket();
        totalProfit += priceList.getRocketPrice();
        return temp;
    }

    @Override
    public Magnum orderMagnum(MagnumTypes magnum) {
        Magnum temp = new Magnum(magnum);
        totalProfit += priceList.getMagnumStandardPrice(magnum);
        return temp;
    }

    @Override
    public double getProfit() {

        return totalProfit;
    }

    //toString

    @Override
    public String toString() {
        return "";
    }
}
