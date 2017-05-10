package test;

import simulatorTSP.algoritmes.Algoritme;
import simulatorTSP.algoritmes._2Opt;
import simulatorTSP.Locatie;
import simulatorTSP.Product;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

/**
 * Created by Ivan on 08/05/2017.
 */
public class Test_2Opt {
    Algoritme algoritme;
    ArrayList<Product> order;

    @Before
    public void Initialize(){
        algoritme = new _2Opt();
    }

    @Test
    public void BerekenStart_1(){
        order = new ArrayList<Product>();
        Product pr1 = new Product("doos",new Locatie(1,2),2);
        order.add(pr1);
        Product pr2 = new Product("doos",new Locatie(5,6),4);
        order.add(pr2);
        Product pr3 = new Product("doos",new Locatie(3,4),4);
        order.add(pr3);

        ArrayList<Product> route = algoritme.BerekenStart(order);

        int[] expected = {pr1.getId(),pr3.getId(),pr2.getId()};
        int[] actual = {route.get(0).getId(),route.get(1).getId(),route.get(2).getId()};
        Assert.assertArrayEquals(expected,actual);
    }

}
