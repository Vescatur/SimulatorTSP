package mock;

import simulatorTSP.algoritmes.Algoritme;
import simulatorTSP.Product;

import java.util.ArrayList;

/**
 * Created by Ivan on 09/05/2017.
 */
public class MockKopieAlgoritme extends Algoritme {

    protected ArrayList<Product> BerekenRoute(ArrayList<Product> order) {
        return order;
    }
}
