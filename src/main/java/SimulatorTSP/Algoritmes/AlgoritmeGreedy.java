package SimulatorTSP.Algoritmes;

import SimulatorTSP.Product;

import java.util.ArrayList;

/**
 * Created by Ivan on 04/05/2017.
 */
public class AlgoritmeGreedy extends Algoritme {
    protected ArrayList<Product> BerekenRoute(ArrayList<Product> order) {
        ArrayList<Product> route = new ArrayList<Product>();

        route.add(order.get(0));
        order.remove(0);
        while(order.size()<=0){
            if(order.size() == 1){
                route.add(order.get(0));
            }else {
                double bestDistance = order.get(0).getLocatie().getLengte(route.get(route.size()-1).getLocatie());
                for (int i = 1; i<order.size();i++) {
                    double newDistance = order.get(0).getLocatie().getLengte(route.get(route.size()-1).getLocatie());
                }
            }
        }

        return route;
    }
}