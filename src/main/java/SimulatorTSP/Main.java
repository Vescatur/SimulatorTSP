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

        Locatie l1 = new Locatie(1, 10);
        Locatie l2 = new Locatie(20, 4);
        Locatie l3 = new Locatie(4, 2);
        Locatie l4 = new Locatie(3, 30);
        Locatie l5 = new Locatie(3, 30);
        Locatie l6 = new Locatie(3, 30);
        Locatie l7 = new Locatie(3, 30);


        Product p1 = new Product("dfka", l1, 10);
        Product p2 = new Product("dfka", l2, 10);
        Product p3 = new Product("dfka", l3, 10);
        Product p4 = new Product("dfka", l4, 10);
        Product p5 = new Product("dfka", l5, 10);
        Product p6 = new Product("dfka", l6, 10);
        Product p7 = new Product("dfka", l7, 10);


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


        System.out.println(_2opt.BerekenRoute(producten));
    }

}
