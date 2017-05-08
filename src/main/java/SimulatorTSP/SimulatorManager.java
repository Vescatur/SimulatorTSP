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
    private AlgoritmeType algoritmeType;
    private ArrayList<ArrayList<Product>> orderArray;

    //CONSTRUCTOR
    public SimulatorManager(){

    }

    //FUNCTIES
    public void setAlgoritme(Algoritme algoritme){
        this.algoritme = algoritme;
    }

    public AlgoritmeType getAlgoritmeType(){
        return algoritmeType;
    }

    public void setOrder(ArrayList<ArrayList<Product>> order){
        orderArray = order;
    }

    public void BerekenStop(){
        
    }

    public ArrayList<RouteBerekening> BerekenStart(){
        ArrayList<RouteBerekening> berekeningen = new ArrayList<RouteBerekening>();

        for(ArrayList<Product> order: orderArray){
            ArrayList<Product> route = algoritme.BerekenStart(order);

            RouteBerekening berekening = new RouteBerekening(order, getAlgoritmeType(), route, 1);

            berekeningen.add(berekening);

        }
        return berekeningen;
    }
}
