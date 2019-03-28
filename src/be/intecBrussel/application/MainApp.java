package be.intecBrussel.application;

import be.intecBrussel.eatables.*;
import be.intecBrussel.sellers.IceCreamSalon;
import be.intecBrussel.sellers.PriceList;

/*
 * @author Maarten Reygaerts
 * @version 1
 * */
public class MainApp {
    public static void main(String[] args) {

        PriceList priceList = new PriceList();
        IceCreamSalon iceCreamSalon = new IceCreamSalon(priceList);


        Eatable[] order1 = new Eatable[]{iceCreamSalon.orderCone(
                new Flavor[]{Flavor.CHOCOLATE, Flavor.VANILLA, Flavor.LEMON}),
                iceCreamSalon.orderCone(
                        new Flavor[]{Flavor.PISTACHE, Flavor.VANILLA, Flavor.STRAWBERRY}),
                iceCreamSalon.orderMagnum(MagnumTypes.MILKCHOCOLATE),
                iceCreamSalon.orderIceRocket()

        };

        for (Eatable i : order1) {
            i.eat();
        }
        System.out.println("De prijs van je besteeling is " + iceCreamSalon.getProfit() + " euro");

        WaffleSeller waffleOuter = new WaffleSeller();
        waffleOuter.getWaffle();


    }

    //failed attempt to make a localClasse waffle
    public static class WaffleSeller {
        Object getWaffle() {

            class Waffle implements Eatable {
                @Override
                public void eat() {
                    System.out.println("Verkoop een wafel");
                }
            }
            return new Waffle();
        }
    }
}
