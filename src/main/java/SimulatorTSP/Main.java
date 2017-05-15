package simulatorTSP;

import simulatorTSP.algoritmes.Algoritme;
import simulatorTSP.algoritmes._2Opt;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Ivan on 03/05/2017.
 */
public class Main {
    //maak simulatorManager
    //Maak manager


    public static void main (String[] args){

        ArrayList<Product> producten = new ArrayList<Product>();

        Locatie l1 = new Locatie(1, 1);
        Locatie l2 = new Locatie(2, 1);
        Locatie l3 = new Locatie(3, 3);
        Locatie l4 = new Locatie(4, 2);
        Locatie l5 = new Locatie(3, 1);
        Locatie l6 = new Locatie(2, 3);
        Locatie l7 = new Locatie(1, 3);


        Product p1 = new Product("A", l1, 10);
        Product p2 = new Product("B", l2, 10);
        Product p3 = new Product("C", l3, 10);
        Product p4 = new Product("D", l4, 10);
        Product p5 = new Product("E", l5, 10);
        Product p6 = new Product("F", l6, 10);
        Product p7 = new Product("G", l7, 10);


        producten.add(p1);
        producten.add(p2);
        producten.add(p3);
        producten.add(p4);
        producten.add(p5);
        producten.add(p6);
        producten.add(p7);


        _2Opt _2opt = new _2Opt();

        ArrayList<Locatie> locaties = new ArrayList<Locatie>();

        locaties.add(l1);
        locaties.add(l2);
        locaties.add(l3);
        locaties.add(l4);
        locaties.add(l5);
        locaties.add(l6);
        locaties.add(l7);


        System.out.println(_2opt.BerekenRoute(producten));
        //System.out.println(locaties);
    }

}
