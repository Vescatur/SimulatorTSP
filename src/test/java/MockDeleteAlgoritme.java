import SimulatorTSP.Algoritmes.Algoritme;
import SimulatorTSP.Locatie;
import SimulatorTSP.Product;

import java.util.ArrayList;

/**
 * Created by Ivan on 08/05/2017.
 */
public class MockDeleteAlgoritme extends Algoritme {

    protected ArrayList<Product> BerekenRoute(ArrayList<Product> order) {
        while(order.size()>=1){
            order.remove(0);
        }

        return new ArrayList<Product>();
    }
}
