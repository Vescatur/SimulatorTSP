package test;

import simulatorTSP.algoritmes.Algoritme;
import simulatorTSP.algoritmes.AlgoritmeGreedy;
import simulatorTSP.Locatie;
import simulatorTSP.Product;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

/**
 * Created by Ivan on 08/05/2017.
 */
public class TestGreedyAlgoritme {
    Algoritme algoritme;
    ArrayList<Product> order;

    @Before
    public void Initialize(){
        algoritme = new AlgoritmeGreedy();
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

    @Test
    public void BerekenStart_2(){
        order = new ArrayList<Product>();
        Product pr1 = new Product("doos",new Locatie(2,3),2);
        order.add(pr1);
        Product pr2 = new Product("doos",new Locatie(3,0),4);
        order.add(pr2);
        Product pr3 = new Product("doos",new Locatie(1,4),4);
        order.add(pr3);
        Product pr4 = new Product("doos",new Locatie(6,6),4);
        order.add(pr4);
        Product pr5 = new Product("doos",new Locatie(0,2),4);
        order.add(pr5);

        ArrayList<Product> route = algoritme.BerekenStart(order);

        int[] expected = {pr1.getId(),pr3.getId(),pr5.getId(),pr2.getId(),pr4.getId()};
        int[] actual = {route.get(0).getId(),route.get(1).getId(),route.get(2).getId(),route.get(3).getId(),route.get(4).getId()};
        Assert.assertArrayEquals(expected,actual);
    }
    @Test
    public void BerekenStart_3(){
        order = new ArrayList<Product>();
        Product pr1 = new Product("doos",new Locatie(0,0),4);
        order.add(pr1);
        Product pr2 = new Product("doos",new Locatie(3,2),2);
        order.add(pr2);
        Product pr3 = new Product("doos",new Locatie(6,1),4);
        order.add(pr3);
        Product pr4 = new Product("doos",new Locatie(2,1),2);
        order.add(pr4);
        Product pr5 = new Product("doos",new Locatie(1,3),4);
        order.add(pr5);
        Product pr6 = new Product("doos",new Locatie(2,4),4);
        order.add(pr6);

        ArrayList<Product> route = algoritme.BerekenStart(order);

        int[] expected = {pr1.getId(),pr4.getId(),pr2.getId(),pr6.getId(),pr5.getId(),pr3.getId()};
        int[] actual = {route.get(0).getId(),route.get(1).getId(),route.get(2).getId(),route.get(3).getId(),route.get(4).getId(),route.get(5).getId()};
        Assert.assertArrayEquals(expected,actual);
    }
}
