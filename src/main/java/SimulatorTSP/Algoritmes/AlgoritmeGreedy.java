package SimulatorTSP.Algoritmes;

import SimulatorTSP.Order;
import SimulatorTSP.Product;
import SimulatorTSP.Route;

import java.util.ArrayList;

/**
 * Created by Ivan on 04/05/2017.
 */
public class AlgoritmeGreedy extends Algoritme {
    protected Route BerekenRoute(Order order) {
        ArrayList<Product> products = (ArrayList<Product>) order.getProducts().clone();
        ArrayList<Product> route = new ArrayList<Product>();
        route.add(order.getProducts().get(1));
        order.getProducts().remove(1);
        if(route.size()>1){
            while(route.size() !=1){

            }
        }
        return new Route(route);
    }
}
