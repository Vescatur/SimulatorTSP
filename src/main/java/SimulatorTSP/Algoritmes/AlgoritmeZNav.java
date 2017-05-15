package simulatorTSP.algoritmes;

import simulatorTSP.Product;

import java.util.ArrayList;

/**
 * Created by Ivan on 04/05/2017.
 */
public class AlgoritmeZNav extends Algoritme {

    private double BerekenLengte(ArrayList<Product> route){
        double lengte = 0;
        for(int i = 1;i<route.size();i++){
            lengte += route.get(i-1).getLocatie().getLengte(route.get(i).getLocatie());
        }
        lengte +=route.get(route.size()-1).getLocatie().getLengte(route.get(0).getLocatie());
        return lengte;
    }

    public ArrayList<Product> BerekenRoute(ArrayList<Product> order) {
        Algoritme ZAlgoritme = new AlgoritmeZAlgoritme();
        Algoritme Greedy = new AlgoritmeGreedy();
        ArrayList<Product> routeZAlgoritme = ZAlgoritme.BerekenStart(order);
        ArrayList<Product> routeGreedy = Greedy.BerekenStart(order);
        //20pt moet hier nog tussen.
        if(BerekenLengte(routeZAlgoritme)>=BerekenLengte(routeGreedy)){
            return routeGreedy;
        }else{
            return routeZAlgoritme;
        }
    }
}
