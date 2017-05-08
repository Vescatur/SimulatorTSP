import SimulatorTSP.Algoritmes.Algoritme;
import SimulatorTSP.Locatie;
import SimulatorTSP.Product;

import java.util.ArrayList;

/**
 * Created by Ivan on 04/05/2017.
 */
public class MockAlgoritme extends Algoritme {


    protected ArrayList<Product> BerekenRoute(ArrayList<Product> order) {
        Product product = new Product("hey",new Locatie(1,2),2);
        ArrayList<Product> arrayRoute = new ArrayList<Product>();
        arrayRoute.add(product);
        return arrayRoute;
    }
}
