package simulatorTSP.algoritmes;

import simulatorTSP.Locatie;
import simulatorTSP.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.*;


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
        ArrayList<Locatie> beste_route = new ArrayList<Locatie>();

        // Get tour size
        double size = order.size();

        // repeat until no improvement is made
        int improve = 0;

        while (improve < 5) {
            double besteAfstand = berekenTotaleAfstand(route);

            for ( int i = 0; i < size - 1; i++ )
            {
                for ( int k = i + 1; k < size; k++)
                {
                    ArrayList<Locatie> nieuwe_route = new ArrayList<Locatie>();

                    nieuwe_route = verwissel2Opt(route, i, k );


                    ArrayList<Locatie> new_distance_route = nieuwe_route;
                    double new_distance = berekenTotaleAfstand(new_distance_route);

                    if ( new_distance < besteAfstand )
                    {
                        // Improvement found so reset
                        improve = 0;
                        route = nieuwe_route;
                        besteAfstand = new_distance;
                        System.out.println("\nVERBETERING\n");
                        System.out.println(berekenTotaleAfstand(nieuwe_route));
                        System.out.println(nieuwe_route.toString());
                    } else {
                        System.out.println("Geen verbetering!\n");
                    }
                }
            }
            improve ++;
        }
        return null;
    }

    private ArrayList<Locatie> verwissel2Opt(ArrayList<Locatie> route, final int i, final int k){
        int size = route.size();
        ArrayList<Locatie> nieuwe_route = new ArrayList<Locatie>();

        for (int c = 0; c <= i - 1; c++) {
            Locatie locatie = route.get(c);
            nieuwe_route.add(locatie);
        }
        for (int c = k; c >= i; c--) {
            Locatie locatie = route.get(c);
            nieuwe_route.add(locatie);
        }
        for (int c = k + 1; c < size; c++) {
            Locatie locatie = route.get(c);
            nieuwe_route.add(locatie);
        }
        System.out.println("2opt uitgevoerd");
        return nieuwe_route;
    }

}

