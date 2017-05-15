package simulatorTSP.algoritmes;

import simulatorTSP.Product;

import java.util.ArrayList;

/**
 * Created by Ivan on 04/05/2017.
 */
public class AlgoritmeBruteForce extends Algoritme {

    public double getLengte(double[][] lengteTable,int[] route){
        double lengte = 0;
        for(int i = 1; i<route.length;i++){
            lengte += lengteTable[route[i-1]][route[i]];
        }
        lengte += lengteTable[route[route.length-1]][route[0]];
        return lengte;

    }

    public boolean arrayContainsInt(int number, int[] array){
        for (int routePoint : array) {
            if(routePoint==number){
                return true;
            }
        }
        return false;
    }

    public int[] BerekenStap(double[][] lengteTable,int[] route,int stap){
        if(stap < route.length-1) {
            int[] bestRoute = route;
            double bestLengte = 100000;
            for (int i = 0; i < route.length; i++) {
                if(!arrayContainsInt(i,route)) {
                    int[] newRoute = route.clone();
                    newRoute[stap] = i;
                    int[] gegenereerdeRoute = BerekenStap(lengteTable, newRoute, stap + 1);
                    double lengte = getLengte(lengteTable, gegenereerdeRoute);
                    if (lengte <= bestLengte) {
                        bestLengte = lengte;
                        bestRoute = gegenereerdeRoute;
                    }
                }
            }
            return bestRoute;
        }else{
            for(int i = 0; i<route.length;i++){
                if(!arrayContainsInt(i,route)){
                    route[route.length-1] = i;
                    break;
                }
            }
            return route;
        }
    }

    public ArrayList<Product> BerekenRoute(ArrayList<Product> order) {
        double[][] lengteTable = new double[order.size()][order.size()];
        for(int Van = 0;Van < order.size();Van++){
            for(int Naar = 0;Naar < order.size();Naar++){
                if(Van==Naar){
                    lengteTable[Van][Naar] = 0;
                }else{
                    lengteTable[Van][Naar] = order.get(Van).getLocatie().getLengte(order.get(Naar).getLocatie());
                }
            }
        }
        int[] routeIndex = BerekenStap(lengteTable,new int[order.size()],0);
        ArrayList<Product> routeProduct = new ArrayList<Product>();
        for(int index: routeIndex){
            routeProduct.add(order.get(index));
        }
        return routeProduct;
    }
}
