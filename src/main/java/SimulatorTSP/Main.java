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

        Locatie l1 = new Locatie(1, 1);
        Locatie l2 = new Locatie(2, 3);
        Locatie l3 = new Locatie(4, 4);
        Locatie l4 = new Locatie(3, 2);
        Locatie l5 = new Locatie(1, 4);
        Locatie l6 = new Locatie(2, 4);
        Locatie l7 = new Locatie(1, 2);
        Locatie l8 = new Locatie(2, 1);
        Locatie l9 = new Locatie(3, 4);
        Locatie l10 = new Locatie(4, 5);
        Locatie l11 = new Locatie(5, 3);
        Locatie l12 = new Locatie(6, 2);
        Locatie l13 = new Locatie(5, 4);
        Locatie l14 = new Locatie(3, 5);
        Locatie l15 = new Locatie(2, 2);
        Locatie l16 = new Locatie(4, 1);
        Locatie l17 = new Locatie(5, 5);
        Locatie l18 = new Locatie(6, 4);
        Locatie l19 = new Locatie(1, 5);
        Locatie l20 = new Locatie(3, 1);
        Locatie l21 = new Locatie(4, 2);
        Locatie l22 = new Locatie(5, 1);
        Locatie l23 = new Locatie(6, 1);
        Locatie l24 = new Locatie(5, 2);
        Locatie l25 = new Locatie(4, 3);
        Locatie l26 = new Locatie(6, 5);
        Locatie l27 = new Locatie(3, 3);
        Locatie l28 = new Locatie(2, 5);
        Locatie l29 = new Locatie(1, 3);


        Product p1 = new Product("A", l1, 10);
        Product p2 = new Product("B", l2, 10);
        Product p3 = new Product("C", l3, 10);
        Product p4 = new Product("D", l4, 10);
        Product p5 = new Product("E", l5, 10);
        Product p6 = new Product("F", l6, 10);

        Product p7 = new Product("G", l7, 10);

        Product p8 = new Product("H", l8, 10);
        Product p9 = new Product("I", l9, 10);
        Product p10 = new Product("J", l10, 10);
        Product p11 = new Product("K", l11, 10);
        Product p12 = new Product("L", l12, 10);
        Product p13 = new Product("M", l13, 10);
        Product p14 = new Product("N", l14, 10);
        Product p15 = new Product("O", l15, 10);
        Product p16 = new Product("P", l16, 10);
        Product p17 = new Product("B", l17, 10);
        Product p18 = new Product("C", l18, 10);
        Product p19 = new Product("D", l19, 10);
        Product p20 = new Product("E", l20, 10);
        Product p21 = new Product("F", l21, 10);
        Product p22 = new Product("G", l22, 10);
        Product p23 = new Product("H", l23, 10);
        Product p24 = new Product("I", l24, 10);
        Product p25 = new Product("J", l25, 10);
        Product p26 = new Product("K", l26, 10);
        Product p27 = new Product("L", l27, 10);
        Product p28 = new Product("M", l28, 10);
        Product p29 = new Product("N", l29, 10);


        producten.add(p1);
        producten.add(p2);
        producten.add(p3);
        producten.add(p4);
        producten.add(p5);
        producten.add(p6);
        producten.add(p7);

        producten.add(p8);
        producten.add(p9);
        producten.add(p10);
        producten.add(p11);
        producten.add(p12);
        producten.add(p13);
        producten.add(p14);
        producten.add(p15);
        producten.add(p16);
        producten.add(p17);
        producten.add(p18);
        producten.add(p19);
        producten.add(p20);
        producten.add(p21);
        producten.add(p22);
        producten.add(p23);
        producten.add(p24);
        producten.add(p25);
        producten.add(p26);
        producten.add(p27);
        producten.add(p28);
        producten.add(p29);


        _2Opt _2opt = new _2Opt();

        ArrayList<Locatie> locaties = new ArrayList<Locatie>();

        locaties.add(l1);
        locaties.add(l2);
        locaties.add(l3);
        locaties.add(l4);
        locaties.add(l5);
        locaties.add(l6);
        locaties.add(l7);

        locaties.add(l8);
        locaties.add(l9);
        locaties.add(l10);
        locaties.add(l11);
        locaties.add(l12);
        locaties.add(l13);
        locaties.add(l14);
        locaties.add(l15);
        locaties.add(l16);
        locaties.add(l17);
        locaties.add(l18);
        locaties.add(l19);
        locaties.add(l20);
        locaties.add(l21);
        locaties.add(l22);
        locaties.add(l23);
        locaties.add(l24);
        locaties.add(l25);
        locaties.add(l26);
        locaties.add(l27);
        locaties.add(l28);
        locaties.add(l29);


        System.out.println(_2opt.BerekenRoute(producten));

    }

}
