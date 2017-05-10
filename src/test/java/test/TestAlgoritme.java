package test;

import mock.MockAlgoritme;
import mock.MockDeleteAlgoritme;
import mock.MockKopieAlgoritme;
import simulatorTSP.algoritmes.Algoritme;
import simulatorTSP.Locatie;
import simulatorTSP.Product;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

/**
 * Created by Ivan on 04/05/2017.
 */
public class TestAlgoritme {



    @Test
    public void ControleerOrder_Empty(){
        Algoritme algoritme = new MockAlgoritme();
        ArrayList<Product> order = new ArrayList<Product>(new ArrayList<Product>());
        ArrayList<Product> route = algoritme.BerekenStart(order);

        double expected = 0;
        double actual = route.size();
        Assert.assertEquals(expected,actual,0.001);
    }

    @Test
    public void CloneOrder_VerwijderProducten(){
        Algoritme algoritme = new MockDeleteAlgoritme();
        ArrayList<Product> order = new ArrayList<Product>();
        order.add(new Product("doos", new Locatie(1,2),1));
        order.add(new Product("doos", new Locatie(1,2),1));
        algoritme.BerekenStart(order);

        double expected = 2;
        double actual = order.size();
        Assert.assertEquals(expected,actual,0.001);
    }

    @Test
    public void CloneOrder_IDcontrolerenProducten1(){
        Algoritme algoritme = new MockKopieAlgoritme();
        ArrayList<Product> order = new ArrayList<Product>();
        order.add(new Product("doos", new Locatie(1,2),1));
        order.add(new Product("doos", new Locatie(1,2),1));
        order.add(new Product("doos", new Locatie(1,2),1));
        order.add(new Product("doos", new Locatie(1,2),1));
        order.add(new Product("doos", new Locatie(1,2),1));
        order.add(new Product("doos", new Locatie(1,2),1));

        ArrayList<Product> route = algoritme.BerekenStart(order);
        int[] expected = {order.get(0).getId(),order.get(1).getId(),order.get(2).getId(),order.get(3).getId(),order.get(4).getId(),order.get(5).getId()};
        int[] actual = {route.get(0).getId(),route.get(1).getId(),route.get(2).getId(),route.get(3).getId(),route.get(4).getId(),route.get(5).getId()};
        Assert.assertArrayEquals(expected,actual);
    }

    @Test
    public void CloneOrder_IDcontrolerenProducten2(){
        Algoritme algoritme = new MockKopieAlgoritme();
        ArrayList<Product> order = new ArrayList<Product>();
        order.add(new Product("doos", new Locatie(1,2),1));
        order.add(new Product("doos", new Locatie(1,2),1));
        order.add(new Product("doos", new Locatie(1,2),1));
        order.add(new Product("doos", new Locatie(1,2),1));
        order.add(new Product("doos", new Locatie(1,2),1));
        order.add(new Product("doos", new Locatie(1,2),1));

        ArrayList<Product> route = algoritme.BerekenStart(order);
        int[] expected = {order.get(0).getId(),order.get(1).getId(),order.get(2).getId(),order.get(3).getId(),order.get(4).getId(),order.get(5).getId()};
        int[] actual = {route.get(0).getId(),route.get(1).getId(),route.get(2).getId(),route.get(3).getId(),route.get(4).getId(),route.get(5).getId()};
        Assert.assertArrayEquals(expected,actual);
    }
}

