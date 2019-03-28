package be.intecBrussel.sellers;

import be.intecBrussel.eatables.*;

/*
 * @author Maarten Reygaerts
 * @version 11
 * */
public interface IceCreamSeller extends Profitable {
    Cone orderCone(Flavor[] cone) throws Exception;

    IceRocket orderIceRocket() throws Exception;

    Magnum orderMagnum(MagnumTypes magnum) throws Exception;

}
