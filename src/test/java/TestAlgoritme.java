import SimulatorTSP.Algoritmes.Algoritme;
import SimulatorTSP.Order;
import SimulatorTSP.Product;
import SimulatorTSP.Route;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.Method;
import java.util.ArrayList;

/**
 * Created by Ivan on 04/05/2017.
 */
public class TestAlgoritme {

    Algoritme algoritme;

    @Before
    public void Initialize(){
        algoritme = new MockAlgoritme();
    }

    @Test
    public void ControleerOrderEmpty(){
        Order order = new Order(new ArrayList<Product>());
        Route route = algoritme.BerekenStart(order);

        double expected = 0;
        double actual = route.getProducts().size();
        Assert.assertEquals(expected,actual,0.001);
    }
}
