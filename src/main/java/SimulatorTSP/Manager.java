package SimulatorTSP;

import SimulatorTSP.Algoritmes.*;

import java.io.File;
import javax.xml.parsers.*;

import org.w3c.dom.*;
import java.util.ArrayList;

/**
 * Created by Ivan on 03/05/2017.
 */


public class Manager {

    //VARIABLEN
    private SimulatorManager simulatorManager;
    private ArrayList<RouteBerekening> routeBerekeningArray;
    //File file = new File("some/path");

    //CONSTRUCTOR
    public Manager(SimulatorManager simulatorManager){
        this.simulatorManager = simulatorManager;
        routeBerekeningArray = new ArrayList<RouteBerekening>();
    }

    //FUNCTIES
    public ArrayList<Product> LeesXmlOrder(File file){
        //DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        //DocumentBuilder db = dbf.newDocumentBuilder();
        //Document doc = db.parse(file);
        return null;
    }

    public ArrayList<RouteBerekening> getRouteBerekeningArray(){
        return routeBerekeningArray;
    }

    public RouteBerekening getRouteBerekeningEen(int index){
        return routeBerekeningArray.get(index);
    }

    public void setAlgoritme(AlgoritmeType algoritmeType){
        switch(algoritmeType){
            case ZNAV:
                AlgoritmeZNav algoritmeZNav = new AlgoritmeZNav();
                simulatorManager.setAlgoritme(algoritmeZNav);
            break;

            case GREEDY:
                AlgoritmeGreedy algoritmeGreedy = new AlgoritmeGreedy();
                simulatorManager.setAlgoritme(algoritmeGreedy);
            break;

            case BRUTEFORCE:
                AlgoritmeBruteForce algoritmeBruteForce = new AlgoritmeBruteForce();
                simulatorManager.setAlgoritme(algoritmeBruteForce);
            break;

            case RANDOM2OPT:
                AlgoritmeRandom2Opt algoritmeRandom2Opt = new AlgoritmeRandom2Opt();
                simulatorManager.setAlgoritme(algoritmeRandom2Opt);
            break;
        }
        simulatorManager.setAlgoritmeType(algoritmeType);
    }

    public void berekenStop(){
        SimulatorManager:berekenStop();
    }

    public void berekenStart(){
        SimulatorManager:berekenStart();
    }



}
