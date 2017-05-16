package simulatorTSP;

import simulatorTSP.algoritmes.Algoritme;
import simulatorTSP.algoritmes.AlgoritmeBruteForce;
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

        Locatie l1 = new Locatie(2, 2);
        Locatie l2 = new Locatie(4, 5);
        Locatie l3 = new Locatie(5, 4);
        Locatie l4 = new Locatie(5, 1);
        Locatie l5 = new Locatie(2, 4);
        Locatie l6 = new Locatie(4, 3);
        Locatie l7 = new Locatie(7, 4);
        /*
        Locatie l8 = new Locatie(7, 5);
        Locatie l9 = new Locatie(5, 0);
        Locatie l10 = new Locatie(2, 5);
        Locatie l11 = new Locatie(7, 2);
        Locatie l12 = new Locatie(4, 7);
        Locatie l13 = new Locatie(3, 1);
        Locatie l14 = new Locatie(8, 4);
        Locatie l15 = new Locatie(1, 4);
        Locatie l16 = new Locatie(5, 7);
        */

        Product p1 = new Product("A", l1, 10);
        Product p2 = new Product("B", l2, 10);
        Product p3 = new Product("C", l3, 10);
        Product p4 = new Product("D", l4, 10);
        Product p5 = new Product("E", l5, 10);
        Product p6 = new Product("F", l6, 10);
        Product p7 = new Product("G", l7, 10);
        /*
        Product p8 = new Product("A", l8, 10);
        Product p9 = new Product("B", l9, 10);
        Product p10 = new Product("C", l10, 10);
        Product p11 = new Product("D", l11, 10);
        Product p12 = new Product("E", l12, 10);
        Product p13 = new Product("F", l13, 10);
        Product p14 = new Product("G", l14, 10);
        Product p15 = new Product("F", l15, 10);
        Product p16 = new Product("G", l16, 10);
        */

        producten.add(p1);
        producten.add(p2);
        producten.add(p3);
        producten.add(p4);
        producten.add(p5);
        producten.add(p6);
        producten.add(p7);
        /*
        producten.add(p8);
        producten.add(p9);
        producten.add(p10);
        producten.add(p11);

        producten.add(p12);
        producten.add(p13);
        producten.add(p14);
        producten.add(p15);
        producten.add(p16);
        */

        AlgoritmeBruteForce algoritmeBruteForce = new AlgoritmeBruteForce();


        ArrayList<Locatie> locaties = new ArrayList<Locatie>();

        locaties.add(l1);
        locaties.add(l2);
        locaties.add(l3);
        locaties.add(l4);
        locaties.add(l5);
        locaties.add(l6);
        locaties.add(l7);
        /*
        locaties.add(l8);
        locaties.add(l9);
        locaties.add(l10);
        locaties.add(l11);

        locaties.add(l12);
        locaties.add(l13);
        locaties.add(l14);
        locaties.add(l15);
        locaties.add(l16);
        */

        System.out.println(algoritmeBruteForce.BerekenRoute(producten));
        //System.out.println(locaties);
    }

}
