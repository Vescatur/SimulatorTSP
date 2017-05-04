package SimulatorTSP;

import SimulatorTSP.Algoritmes.Algoritme;

import java.util.ArrayList;

/**
 * Created by Ivan on 03/05/2017.
 */


public class Manager {
    //VARIABLEN
    private SimulatorManager simulatorManager;
    private ArrayList<RouteBerekening> routeBerekeningArray;

    //CONSTRUCTOR
    public Manager(SimulatorManager simulatorManager){
        this.simulatorManager = simulatorManager;
        routeBerekeningArray = new ArrayList<RouteBerekening>();
    }

    //FUNCTIES
    public Order LeesXmlOrder(/*file*/){return null;/* data*/}

    public ArrayList<RouteBerekening> getRouteBerekeningArray(){
        return routeBerekeningArray;
    }

    public RouteBerekening getRouteBerekeningEen(int index){
        return routeBerekeningArray.get(index);
    }

    public void setAlgoritme(AlgoritmeType algoritme){
        
    }

    public void BerekenStop(){
        SimulatorManager:BerekenStop();
    }

    public void BerekenStart(){
        SimulatorManager:BerekenStart();
    }



}
