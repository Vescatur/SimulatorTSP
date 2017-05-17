package simulatorTSP.algoritmes;

import simulatorTSP.Locatie;
import simulatorTSP.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.*;

public class _2Opt extends Algoritme {


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
        //snelste productroute
        ArrayList<Product> productroute = new ArrayList<Product>();

        ArrayList<Locatie> nieuwe_route = new ArrayList<Locatie>();

        //locaties van huidige route
        ArrayList<Locatie> route = new ArrayList<Locatie>();
        for(Product p : order){
            Locatie locatie = p.getLocatie();
            route.add(locatie);
        }

        int grootte = order.size();
        int counter = 0;
        int verbeter = 0;

        while (verbeter < 5) {
            double besteAfstand = berekenTotaleAfstand(route);
            besteAfstand = (int) Math.round(besteAfstand);
            for (int i = 0; i < grootte - 1; i++) {
                for (int k = i + 1; k < grootte; k++) {
                    System.out.println(counter++);

                    //ArrayList<Locatie> nieuwe_route = new ArrayList<Locatie>();
                    nieuwe_route = verwissel2Opt(route, i, k);

                    double nieuweAfstand = berekenTotaleAfstand(nieuwe_route);
                    nieuweAfstand = (int) Math.round(nieuweAfstand);

                    if (nieuweAfstand < besteAfstand) {
                        besteAfstand = nieuweAfstand;

                    } else if (nieuweAfstand == besteAfstand) {
                        break;
                    }
                }
            }
            verbeter++;
        }
        for(Locatie l: nieuwe_route){
            for(Product p: order){
                if(l == p.getLocatie()){
                    productroute.add(p);
                }
            }
        }
        return productroute;
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


            for (int c = k; c >= i; --c) {
                Locatie locatie = route.get(c);
                nieuwe_route.add(locatie);
            }


            for (int c = k + 1; c < size; ++c) {
                Locatie locatie = route.get(c);
                nieuwe_route.add(locatie);
            }

            done = true;
        }

        return nieuwe_route;
    }

}

