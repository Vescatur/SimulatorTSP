package SimulatorTSP;

import java.util.ArrayList;

/**
 * Created by Ivan on 03/05/2017.
 */
public class Route {
    private ArrayList<Product> products;

    public Route() {
        this(new ArrayList<Product>());
    }

    public Route(ArrayList<Product> products) {
        this.products = products;
    }

    public ArrayList<Product> getProducts() {
        return products;
    }
}
