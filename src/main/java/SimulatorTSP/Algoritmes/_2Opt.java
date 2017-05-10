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
//bron: http://www.technical-recipes.com/2012/applying-c-implementations-of-2-opt-to-travelling-salesman-problems/

    public ArrayList<Product> BerekenRoute(ArrayList<Product> order) {
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

        for(double x : lengtes){
            totaleAfstand += x;
        }

        int verbeter = 0;

        while(verbeter < 20){

            double besteAfstand = totaleAfstand;

            for(int i = 0; i < totaleAfstand-1; i++){
                for(int k = i + 1; k < totaleAfstand; k++){

                    wissel2Opt(i, k);

                    double nieuweAfstand = totaleAfstand;

                    //if()
                }
            }
        }

        return null;
        }

    public void wissel2Opt(int i, int k){

    }

    }

