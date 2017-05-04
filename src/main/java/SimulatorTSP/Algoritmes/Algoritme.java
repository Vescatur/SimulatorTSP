package SimulatorTSP.Algoritmes;

import SimulatorTSP.Order;
import SimulatorTSP.Product;
import SimulatorTSP.Route;
import SimulatorTSP.RouteBerekening;

import java.util.ArrayList;

/**
 * Created by Ivan on 04/05/2017.
 */
public abstract class Algoritme {

    protected boolean ControleerOrder(Order order){
        return order.getProducts().size()!=0;
    }

    public Route BerekenStart(Order order){
        if(ControleerOrder(order)){
            return BerekenRoute(order);
        }
        return new Route();
    }

    abstract protected Route BerekenRoute(Order order);


}
