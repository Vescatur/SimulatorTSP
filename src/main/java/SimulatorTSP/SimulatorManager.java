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
    private ArrayList<Order> orderArray;

    //CONSTRUCTOR
    public SimulatorManager(){

    }

    //FUNCTIES
    public void setAlgoritme(Algoritme algoritme){
        this.algoritme = algoritme;
    }

    public void setOrder(Order order){
        orderArray = order;
    }

    public void BerekenStop(){

    }

    public ArrayList<RouteBerekening> BerekenStart(){
    //bereik routeberekening via algortime en orderArray

        for(Order order: orderArray){
            algoritme.BerekenStart(order);

        }
        return
    }
}
