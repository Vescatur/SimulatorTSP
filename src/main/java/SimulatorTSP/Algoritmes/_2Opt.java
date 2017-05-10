package SimulatorTSP.Algoritmes;

import SimulatorTSP.Locatie;
import SimulatorTSP.Product;

import java.util.ArrayList;

/**
 * Created by Ivan on 04/05/2017.
 */
public class _2Opt extends Algoritme{


    public ArrayList<Product> BerekenRoute(ArrayList<Product> order) {
        ArrayList<Product> route = new ArrayList<Product>();

        for(Product product: order) {
            route.add(product);
            //while (/*kruising*/) {
            //route.add(/*zonderkruising*/);
            //}

            order.remove(product);

        }
        return route;
    }
}
