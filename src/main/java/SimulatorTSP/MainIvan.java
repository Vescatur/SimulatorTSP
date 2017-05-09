package SimulatorTSP;

import SimulatorTSP.Algoritmes.Algoritme;
import SimulatorTSP.Algoritmes.AlgoritmeGreedy;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by Ivan on 04/05/2017.
 */
public class MainIvan {
    public static void main(String[] args){
        XMLReader reader = new XMLReader();
        ArrayList<ArrayList<Product>> orderArray = reader.ReadXmlFile(new File("namen.xml"));
        System.out.println(Arrays.toString(orderArray.toArray()));
    }
}
