package simulatorTSP.algoritmes;

import simulatorTSP.Locatie;
import simulatorTSP.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.*;

/**
 * Created by Ivan on 04/05/2017.
 */
public class _2Opt extends Algoritme{

    public double berekenTotaleAfstand(ArrayList<Locatie> order){
        //bewaarde lengtes van afstanden
        List<Double> lengtes = new ArrayList<Double>();

        //krijg lengtes van afstanden tussen locaties
        for (int x = 1; x < order.size(); x++) {
            lengtes.add((order.get(x).getLengte(order.get(x - 1))));
        }

        double totaleAfstand = 0;

        //voeg afstanden aan totaleAfstand toe
        for(double x : lengtes){
            totaleAfstand += x;
        }

        return totaleAfstand;
    }

    public ArrayList<Product> BerekenRoute(ArrayList<Product> order) {
        //bron: http://www.technical-recipes.com/2012/applying-c-implementations-of-2-opt-to-travelling-salesman-problems/
        ArrayList<Locatie> route = new ArrayList<Locatie>();
        for(Product p : order){
            Locatie locatie = p.getLocatie();
            route.add(locatie);
        }
        System.out.println("Locatie arraylist gemaakt");
        System.out.println(route.toString());

        int grootte = order.size();
        int counter = 0;
        int verbeter = 0;

        while (verbeter < 7) {
            double besteAfstand = berekenTotaleAfstand(route);
            for (int i = 0; i < grootte - 1; i++) {
                for (int k = i + 1; k < grootte; k++) {
                    System.out.println(counter++);

                    ArrayList<Locatie> nieuwe_route = new ArrayList<Locatie>();
                    System.out.println("Nieuwe route array List aangemaakt");
                    nieuwe_route = verwissel2Opt(route, i, k);
                    System.out.println("2opt route aangemaakt");


                    double nieuweAfstand = berekenTotaleAfstand(nieuwe_route);
                    System.out.println("Afstand van 2opt berekent");

                    if (nieuweAfstand < besteAfstand) {
                        verbeter = 0;
                        besteAfstand = nieuweAfstand;
                        System.out.println("\nVERBETERING\n");
                        System.out.println(nieuwe_route.toString());
                    }
                }
            }
            System.out.println("Klaar\n");
            verbeter++;
        }
        return null;
    }

    public ArrayList<Locatie> verwissel2Opt(ArrayList<Locatie> route, final int i, final int k){
        int size = route.size();
        ArrayList<Locatie> nieuwe_route = new ArrayList<Locatie>();

        boolean done = false;

        if(!done) {
            for (int c = 0; c <= i - 1; ++c) {
                Locatie locatie = route.get(c);
                nieuwe_route.add(locatie);
            }
            System.out.println("Stap 1 uitgevoerd");

            for (int c = k; c >= i; --c) {
                Locatie locatie = route.get(c);
                nieuwe_route.add(locatie);
            }
            System.out.println("Stap 2 uitgevoerd");

            for (int c = k + 1; c < size; ++c) {
                Locatie locatie = route.get(c);
                nieuwe_route.add(locatie);
            }
            System.out.println("Stap 3 uitgevoerd");
            done = true;
        }
        System.out.println("2opt uitgevoerd\n");
        return nieuwe_route;
    }

}

