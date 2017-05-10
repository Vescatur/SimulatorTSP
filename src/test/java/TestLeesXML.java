import simulatorTSP.Locatie;
import simulatorTSP.Manager;
import simulatorTSP.Product;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.File;
import java.util.ArrayList;

/**
 * Created by Ivan on 09/05/2017.
 */
public class TestLeesXML {
    MockSimulatorManager simulatorManager;
    Manager manager;

    @Before
    public void initialize(){
        simulatorManager = new MockSimulatorManager();
        manager = new Manager(simulatorManager);
    }

    @Test
    public void LeesXML_EenProduct(){
        File file = new File("src/test/java/MockOrderEenProduct.xml");
        manager.LeesXmlOrder(file);

        ArrayList<ArrayList<Product>> actual = simulatorManager.getOrder();

        ArrayList<ArrayList<Product>> expected = new ArrayList<ArrayList<Product>>();
        ArrayList<Product> expectedOrder1 = new ArrayList<Product>();
        expectedOrder1.add(new Product("naam",new Locatie(1,2),6));
        expected.add(expectedOrder1);

        for(int i = 0; i<expected.size();i++){
            System.out.println("--");
            for(int b = 0; b<expected.get(i).size();b++){
                Assert.assertEquals(expected.get(i).get(b).getHoogte(),actual.get(i).get(b).getHoogte());
                Assert.assertEquals(expected.get(i).get(b).getLocatie().getX(),actual.get(i).get(b).getLocatie().getX());
                Assert.assertEquals(expected.get(i).get(b).getLocatie().getY(),actual.get(i).get(b).getLocatie().getY());

            }
        }

    }

    @Test
    public void LeesXML_EenOrder(){
        File file = new File("src/test/java/MockOrderEenOrder.xml");
        manager.LeesXmlOrder(file);
    }

    @Test
    public void LeesXML_MeerdereOrder(){
        File file = new File("src/test/java/MockOrderMeerdereOrder.xml");
        manager.LeesXmlOrder(file);
    }
}
