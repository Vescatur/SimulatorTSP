package test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import simulatorTSP.Locatie;
import simulatorTSP.Product;
import simulatorTSP.algoritmes.Algoritme;
import simulatorTSP.algoritmes.AlgoritmeGreedy;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by Ivan on 11/05/2017.
 */
public class TestBruteForceAlgoritme {
    private Algoritme algoritme;
    private ArrayList<Product> order;

    @Before
    public void Initialize(){
        algoritme = new AlgoritmeGreedy();
    }

    public Product CreateProduct(ArrayList<Product> order,String naam,int Xpos,int Ypos,int hoogte){
        Product product = new Product(naam,new Locatie(Xpos,Ypos),hoogte);
        order.add(product);
        return product;
    }

    public int[] GetActual(ArrayList<Product> route){
        int[] actual = new int[route.size()];
        for(int i = 0;i<route.size();i++){
            actual[i] = route.get(i).getId();
        }
        return actual;
    }

    @Test
    public void BerekenStart_5Producten(){
        order = new ArrayList<Product>();
        Product pr1 = CreateProduct(order,"doos",0,1,2);
        Product pr2 = CreateProduct(order,"doos",3,0,2);
        Product pr3 = CreateProduct(order,"doos",3,3,2);
        Product pr4 = CreateProduct(order,"doos",3,5,2);
        Product pr5 = CreateProduct(order,"doos",5,3,2);

        ArrayList<Product> route = algoritme.BerekenStart(order);

        System.out.println("------------------------------");
        System.out.println(Arrays.toString(route.toArray()));

        int[] expected = {pr1.getId(),pr2.getId(),pr3.getId(),pr5.getId(),pr4.getId()};
        int[] actual = GetActual(route);
        Assert.assertArrayEquals(expected,actual);
    }


    @Test
    public void BerekenStart_9Producten(){
        order = new ArrayList<Product>();
        Product pr1 = CreateProduct(order,"doos",0,1,2);
        Product pr2 = CreateProduct(order,"doos",3,0,2);
        Product pr3 = CreateProduct(order,"doos",2,5,2);
        Product pr4 = CreateProduct(order,"doos",5,5,2);
        Product pr5 = CreateProduct(order,"doos",3,3,2);
        Product pr6 = CreateProduct(order,"doos",2,2,2);
        Product pr7 = CreateProduct(order,"doos",5,1,2);
        Product pr8 = CreateProduct(order,"doos",6,2,2);
        Product pr9 = CreateProduct(order,"doos",1,4,2);
        Product pr10 = CreateProduct(order,"doos",4,3,2);

        ArrayList<Product> route = algoritme.BerekenStart(order);


        System.out.println("------------------------------");
        System.out.println(Arrays.toString(route.toArray()));

        int[] expected = {pr1.getId(),pr6.getId(),pr5.getId(),pr10.getId(),pr8.getId(),pr7.getId(),pr2.getId(),pr9.getId(),pr3.getId(),pr4.getId()};
        int[] actual = GetActual(route);
        Assert.assertArrayEquals(expected,actual);
    }
}
