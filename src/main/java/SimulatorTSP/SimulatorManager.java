package SimulatorTSP;

import SimulatorTSP.Algoritmes.Algoritme;

import java.lang.reflect.Array;
import java.util.ArrayList;


/**
 * Created by Ivan on 03/05/2017.
 */
public class SimulatorManager {
    //VERIABLEN
    private Algoritme algoritme;
    private ArrayList<ArrayList<Product>> orderArray;

    //CONSTRUCTOR
    public SimulatorManager(){

    }

    //FUNCTIES
    public void setAlgoritme(Algoritme algoritme){
        this.algoritme = algoritme;
    }

    public void setOrder(ArrayList<ArrayList<Product>> order){
        orderArray = order;
    }

    public void BerekenStop(){

    }

    public ArrayList<RouteBerekening> BerekenStart(){
    //bereik routeberekening via algortime en orderArray

        for(ArrayList<Product> order: orderArray){
            algoritme.BerekenStart(order);

        }
        return new ArrayList<RouteBerekening>();
    }
}
