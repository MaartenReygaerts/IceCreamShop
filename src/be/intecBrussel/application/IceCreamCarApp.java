package be.intecBrussel.application;

import be.intecBrussel.eatables.Eatable;
import be.intecBrussel.eatables.Flavor;
import be.intecBrussel.eatables.MagnumTypes;
import be.intecBrussel.sellers.IceCreamCar;
import be.intecBrussel.sellers.NoMoreIceCreamException;
import be.intecBrussel.sellers.PriceList;
import be.intecBrussel.sellers.Stock;

import java.util.Random;

/*
 * @author Maarten Reygaerts
 * @version 11
 * */
public class IceCreamCarApp {
    public static void main(String[] args) throws Exception {


        PriceList priceList = new PriceList();
        Stock stock = new Stock();
        IceCreamCar iceCreamCar = new IceCreamCar(priceList, stock);
        Eatable[] order1 = new Eatable[20];
        Random rand = new Random();

        try {
            for (int i = 0; i < 8; i++) {

                int random = rand.nextInt(3);

                if (random == 0) {
                    order1[i] = iceCreamCar.orderCone(new Flavor[]{createRandomFlavors(), createRandomFlavors(), createRandomFlavors()});
                } else if (random == 1) {
                    order1[i] = iceCreamCar.orderIceRocket();
                } else {
                    order1[i] = iceCreamCar.orderMagnum(createRandomMagnumType());
                }

            }

        } catch (NoMoreIceCreamException nice) {
            System.out.println(nice.getMessage());
        }

        for (Eatable i : order1) {
            if (i != null) {
                i.eat();
            }
        }
        System.out.println("De prijs van je bestelling is " + iceCreamCar.getProfit() + " euro");


    }

    //randomFlavor
    private static Flavor createRandomFlavors() {
        Flavor[] flavors = Flavor.values();
        int index = (int) Math.round(Math.random() * flavors.length - 1);
        index = index < 0 ? 0 : index;
        return flavors[index];
    }

    //randomMagnumType
    private static MagnumTypes createRandomMagnumType() {
        MagnumTypes[] magnumTypes = MagnumTypes.values();
        int index = (int) Math.round(Math.random() * magnumTypes.length - 1);
        index = index < 0 ? 0 : index;
        return magnumTypes[index];
    }
}
