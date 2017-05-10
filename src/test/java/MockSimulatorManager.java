import simulatorTSP.Product;
import simulatorTSP.SimulatorManager;

import java.util.ArrayList;

/**
 * Created by Ivan on 09/05/2017.
 */
public class MockSimulatorManager extends SimulatorManager {

    public ArrayList<ArrayList<Product>> getOrder(){
        return orderArray;
    }
}
