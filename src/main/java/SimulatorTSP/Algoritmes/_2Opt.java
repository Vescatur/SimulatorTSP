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

    public double berekenTotaleAfstand(ArrayList<Product> order){
        //bewaarde productlocaties
        ArrayList<Locatie> productlocaties = new ArrayList<Locatie>();

        //bewaarde lengtes van afstanden
        List<Double> lengtes = new ArrayList<Double>();

        //stop productlocaties in array
        for(Product product:order){
            Locatie locatie = product.getLocatie();
            productlocaties.add(locatie);
        }

        //krijg lengtes van afstanden tussen locaties
        for (int x = 1; x < productlocaties.size(); x++) {
            lengtes.add((productlocaties.get(x).getLengte(productlocaties.get(x - 1))));
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
        _2Opt _2opt = new _2Opt();

        int grootte = order.size();

        int verbeter = 0;

        while (verbeter < 20) {
            double besteAfstand = berekenTotaleAfstand(order);
                for (int i = 0; i < grootte - 1; i++) {
                    for (int k = i + 1; k < grootte; k++) ;

                    //nieuwe_route = verwissel2Opt(order, i, k);

                    double nieuweAfstand = berekenTotaleAfstand(order);

                    if (nieuweAfstand < besteAfstand) {
                        verbeter = 0;
                        //bestaande route = nieuwe route
                        nieuweAfstand = besteAfstand;
                    }
                }
                return null;
        }
        return null;
    }

}

