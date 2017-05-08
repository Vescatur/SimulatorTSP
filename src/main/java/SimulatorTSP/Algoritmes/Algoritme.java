package SimulatorTSP.Algoritmes;

import SimulatorTSP.Product;

import java.util.ArrayList;

/**
 * Created by Ivan on 04/05/2017.
 */
public abstract class Algoritme {

    protected boolean ControleerOrder(ArrayList<Product> order){
        return order.size()!=0;
    }

    public ArrayList<Product> BerekenStart(ArrayList<Product> order){
        if(ControleerOrder(order)){
            return BerekenRoute(order);
        }
        return new ArrayList<Product>();
    }

    abstract protected ArrayList<Product>  BerekenRoute(ArrayList<Product> order);


}
