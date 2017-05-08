package SimulatorTSP;

import SimulatorTSP.Algoritmes.Algoritme;
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
        SimulatorManager:algoritmeType = algoritmeType;
    }

    public void BerekenStop(){
        SimulatorManager:BerekenStop();
    }

    public void BerekenStart(){
        SimulatorManager:BerekenStart();
    }



}
