package SimulatorTSP.Algoritmes;

import SimulatorTSP.Order;
import SimulatorTSP.Route;

/**
 * Created by Ivan on 04/05/2017.
 */
public abstract class Algoritme {
    public Route BerekenStart(Order order){
        return new Route();
    }
}
