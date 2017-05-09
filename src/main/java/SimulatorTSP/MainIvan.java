package SimulatorTSP;

import SimulatorTSP.Algoritmes.Algoritme;
import SimulatorTSP.Algoritmes.AlgoritmeGreedy;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by Ivan on 04/05/2017.
 */
public class MainIvan {
    public static void main(String[] args){
        XMLReader reader = new XMLReader();
        System.out.println(Arrays.toString(reader.getOrder().toArray()));
    }
}
