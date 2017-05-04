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
    public Manager(){};

    //FUNCTIES
    public Order LeesXmlOrder(/*file*/){return null;/* data*/}

    public RouteBerekening getRouteBerekeningArray(){return null;}

    public RouteBerekening getRouteBerekeningEen(){return null;}

    public void setAlgoritme(Algoritme algoritme){}

    public void BerekenStop(){
        SimulatorManager:BerekenStop();
    }

    public void BerekenStart(){
        SimulatorManager:BerekenStart();
    }



}
