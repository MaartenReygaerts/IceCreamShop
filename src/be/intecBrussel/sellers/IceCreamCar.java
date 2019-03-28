package be.intecBrussel.sellers;

import be.intecBrussel.eatables.*;

/*
 * @author Maarten Reygaerts
 * @version 11
 * */
public class IceCreamCar implements IceCreamSeller {
    PriceList pricelist;
    Stock stock;
    double profit;

    //constructor
    public IceCreamCar(PriceList priceList, Stock stock) {
        this.pricelist = priceList;
        this.stock = stock;
    }

    /*@return returnt object cone naar de ordercone methode*/
    private Cone prepareCone(Flavor[] flavors) throws Exception {
        if (stock.getBalls() > 0 && stock.getCones() > 0) {
            Cone temp = new Cone(flavors);
            stock.setBalls(stock.getBalls() - flavors.length);
            stock.setCones(stock.getCones() - 1);
            return temp;
        } else {
            throw new NoMoreIceCreamException("Er zijn geen hoortjes of ijsbolletjes meer");
        }
    }

    /*@return returnt een object rocket naar de orderRocket methode*/
    private IceRocket prepareRocket() throws Exception {

        if (stock.getIceRockets() > 0) {
            IceRocket temp = new IceRocket();
            stock.setIceRockets(stock.getIceRockets() - 1);
            return temp;
        } else {
            throw new NoMoreIceCreamException("Er zijn geen rakketijsjes meer");
        }
    }

    /*@return returnt een object Magnum naar de orderMagnum methode*/
    private Magnum prepareMagnum(MagnumTypes magnum) throws Exception {
        if (stock.getMagni() > 0) {
            Magnum temp = new Magnum(magnum);
            stock.setMagni(stock.getMagni() - 1);
            return temp;
        } else {
            throw new NoMoreIceCreamException("Er zijn geen Magnums meer");
        }

    }

    /*return returnt een object,
     * veranderd de totaalprijs propertie*/
    //implement methods
    @Override
    public Cone orderCone(Flavor[] flavors) throws Exception {
        try {
            Cone temp = prepareCone(flavors);
            profit += pricelist.getBallPrice() * flavors.length;

            return temp;
            /*throws NoMoreIceCreamException*/
        } catch (NoMoreIceCreamException nice) {
            nice.getMessage();

        }
        throw new NoMoreIceCreamException("Er zijn geen hoorntjes of ijsbolletjes meer in stock");
    }

    @Override
    public IceRocket orderIceRocket() throws Exception {
        try {
            IceRocket temp = prepareRocket();
            profit += pricelist.getRocketPrice();
            return temp;
            /*throws NoMoreIceCreamException*/
        } catch (NoMoreIceCreamException nice) {
            nice.getMessage();


        }
        throw new NoMoreIceCreamException("Er zijn geen rakket ijsjes meer in stock");
    }


    @Override
    public Magnum orderMagnum(MagnumTypes magnum) throws Exception {
        try {
            Magnum temp = prepareMagnum(magnum);
            profit += pricelist.getMagnumStandardPrice(magnum);
            return temp;
            /*throws NoMoreIceCreamException*/
        } catch (NoMoreIceCreamException nice) {
            nice.getMessage();


        }
        throw new NoMoreIceCreamException("Er zijn geen magnums meer in stock");

    }

    /*printmethode*/
    @Override
    public double getProfit() {

        return profit;
    }
}
