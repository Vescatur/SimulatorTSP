package simulatorTSP.algoritmes;

import simulatorTSP.Product;
import sun.dc.pr.PRError;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by Ivan on 04/05/2017.
 */
public class AlgoritmeZAlgoritme extends Algoritme {

    private ArrayList<Product> GetXMostProducts(ArrayList<Product> order) {
        ArrayList<Product> route = new ArrayList<Product>();
        route.add(order.get(0));
        if(order.size()>=1){
            for(Product product:order){
                if(product.getId()!=order.get(0).getId()) {
                    if (route.get(0).getLocatie().getX() <= product.getLocatie().getX()) {
                        if (route.get(0).getLocatie().getX() < product.getLocatie().getX()) {
                            route = new ArrayList<Product>();
                            route.add(product);
                        } else {
                            route.add(product);
                        }
                    }
                }
            }
        }
        return route;
    }
    private ArrayList<Product> SortProductOnX(ArrayList<Product> order){
        ArrayList<Product> route = new ArrayList<Product>();
        do{
            ArrayList<Product> newProducts = GetXMostProducts(order);
            for(Product product:newProducts){
                route.add(product);
                order.remove(product);
            }
        }while(order.size()!=0);
        return route;
    }



    public ArrayList<Product>  GetYMostProducts(ArrayList<Product> order){
        ArrayList<Product> route = new ArrayList<Product>();
        route.add(order.get(0));
        if(order.size()>=1){
            for(Product product:order){
                if(product.getId()!=order.get(0).getId()){
                    if (route.get(0).getLocatie().getY() <= product.getLocatie().getY()) {
                        if (route.get(0).getLocatie().getY() < product.getLocatie().getY()) {
                            route = new ArrayList<Product>();
                            route.add(product);
                        } else {
                            route.add(product);
                        }
                    }
                }
            }
        }
        return SortProductOnX(route);
    }




    public ArrayList<Product> BerekenRoute(ArrayList<Product> order) {
        ArrayList<Product> route = new ArrayList<Product>();
        do{
            ArrayList<Product> newProducts = GetYMostProducts(order);
            for(Product product:newProducts){
                route.add(product);
                order.remove(product);
            }
        }while(order.size()!=0);
        return route;
    }
}
