package simulatorTSP;

import simulatorTSP.algoritmes.Algoritme;

import java.util.ArrayList;


/**
 * Created by Ivan on 03/05/2017.
 */
public class SimulatorManager {
    //VERIABLEN
    private Algoritme algoritme;
    private AlgoritmeType algoritmeType;
    protected ArrayList<ArrayList<Product>> orderArray;
    private boolean stoppen = false;

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

    public void berekenStop(){
        this.stoppen = false;
    }

    public ArrayList<RouteBerekening> berekenStart(){
            ArrayList<RouteBerekening> berekeningen = new ArrayList<RouteBerekening>();
            for (ArrayList<Product> order : orderArray) {
                if(stoppen){
                    break;
                }
                else {
                    ArrayList<Product> route = algoritme.BerekenStart(order);
                    RouteBerekening berekening = new RouteBerekening(order, getAlgoritmeType(), route, 1);
                    berekeningen.add(berekening);
                }
            }
            return berekeningen;
    }
}
