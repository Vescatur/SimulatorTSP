package SimulatorTSP.Algoritmes;

import SimulatorTSP.Product;

import java.util.ArrayList;

/**
 * Created by Ivan on 04/05/2017.
 */
public class AlgoritmeGreedy extends Algoritme {
    protected ArrayList<Product> BerekenRoute(ArrayList<Product> order) {
        ArrayList<Product> products = (ArrayList<Product>) order.clone();
        ArrayList<Product> route = new ArrayList<Product>();

        route.add(order.get(1));
        order.remove(1);
        if(route.size()>1){
            while(route.size() !=1){

            }
        }

        return new ArrayList<Product>();
    }
}
