package simulatorTSP.algoritmes;

import simulatorTSP.Locatie;
import simulatorTSP.Product;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Ivan on 04/05/2017.
 */
public class _2Opt extends Algoritme{


    public ArrayList<Product> BerekenRoute(ArrayList<Product> order) {
        ArrayList<Locatie> productlocaties = new ArrayList<Locatie>();

        List<Double> lengtes = new ArrayList<Double>();

        //stop productlocaties in array
        for(Product product:order){
            Locatie locatie = product.getLocatie();
            productlocaties.add(locatie);
        }

        //krijg lengtes van locaties
        for(Locatie productlocatie: productlocaties){
            double lengte = productlocatie.getLengte();
        }




        int grootte = productlocaties.size();

        int verbeter = 0;

        while(verbeter < 20){
            double besteAfstand = productlocaties.size();

            for(int i = 0; i < grootte-1; i++){
                for(int k = i + 1; k < grootte; k++){
                    wissel2Opt(i, k);

                    double nieuweAfstand = productlocaties.
                }
            }
        }
        return null;
        }

    public void wissel2Opt(int i, int k){

    }

    }

