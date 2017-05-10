package simulatorTSP.algoritmes;

import simulatorTSP.Product;

import java.util.ArrayList;

/**
 * Created by Ivan on 04/05/2017.
 */
public abstract class Algoritme {

    protected boolean ControleerOrder(ArrayList<Product> order){
        return order.size()!=0;
    }

    private ArrayList<Product> CloneOrder(ArrayList<Product> order){
        ArrayList<Product> orderClone = new ArrayList<Product>();
        for (Product item : order) orderClone.add(item.clone());
        return orderClone;
    }

    public ArrayList<Product> BerekenStart(ArrayList<Product> order){
        if(ControleerOrder(order)){
            ArrayList<Product> orderClone = CloneOrder(order);
            return BerekenRoute(orderClone);
        }
        return new ArrayList<Product>();
    }

    abstract protected ArrayList<Product>  BerekenRoute(ArrayList<Product> order);



}
