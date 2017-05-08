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



        System.out.println("------------------------------");
        Algoritme alg = new AlgoritmeGreedy();
        ArrayList<Product> order = new ArrayList<Product>();
        Product pr1 = new Product("doos",new Locatie(1,2),2);
        order.add(pr1);
        Product pr2 = new Product("doos",new Locatie(3,4),4);
        order.add(pr2);
        Product pr3 = new Product("doos",new Locatie(5,6),4);
        order.add(pr3);
        ArrayList<Product> route = alg.BerekenStart(order);
        System.out.println(Arrays.toString(route.toArray()));
        System.out.println("------------------------------");
        System.out.println(Arrays.toString(order.toArray()));
    }
}
