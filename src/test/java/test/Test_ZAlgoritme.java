package test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import simulatorTSP.Locatie;
import simulatorTSP.Product;
import simulatorTSP.algoritmes.AlgoritmeZAlgoritme;

import java.util.ArrayList;

/**
 * Created by Ivan on 15/05/2017.
 */
public class Test_ZAlgoritme
{

    public Product CreateProduct(ArrayList<Product> order,String naam,int Xpos,int Ypos,int hoogte){
        Product product = new Product(naam,new Locatie(Xpos,Ypos),hoogte);
        order.add(product);
        return product;
    }

    AlgoritmeZAlgoritme algoritme;

    @Before
    public void initalize(){
        algoritme = new AlgoritmeZAlgoritme();
    }

    @Test
    public void GetYMostProducts_EenProduct1() {
        ArrayList<Product> order = new ArrayList<Product>();
        Product pr1 = CreateProduct(order,"doos",5,5,2);
        Product pr2 = CreateProduct(order,"doos",1,3,2);
        Product pr3 = CreateProduct(order,"doos",3,6,2);
        Product pr4 = CreateProduct(order,"doos",3,7,2);
        Product pr5 = CreateProduct(order,"doos",1,3,2);

        ArrayList<Product> route =  algoritme.GetYMostProducts(order);
        Assert.assertEquals(pr4,route.get(0));
    }

    @Test
    public void GetYMostProducts_EenProduct2() {
        ArrayList<Product> order = new ArrayList<Product>();
        Product pr1 = CreateProduct(order,"doos",1,7,2);
        Product pr2 = CreateProduct(order,"doos",6,2,2);
        Product pr3 = CreateProduct(order,"doos",3,4,2);
        Product pr4 = CreateProduct(order,"doos",7,2,2);
        Product pr5 = CreateProduct(order,"doos",3,6,2);

        ArrayList<Product> route =  algoritme.GetYMostProducts(order);
        Assert.assertEquals(pr1,route.get(0));
    }

    @Test
    public void GetYMostProducts_MeerdereProduct() {
        ArrayList<Product> order = new ArrayList<Product>();
        Product pr1 = CreateProduct(order,"doos",1,7,2);
        Product pr2 = CreateProduct(order,"doos",6,2,2);
        Product pr3 = CreateProduct(order,"doos",3,7,2);
        Product pr4 = CreateProduct(order,"doos",7,2,2);
        Product pr5 = CreateProduct(order,"doos",3,6,2);

        ArrayList<Product> route =  algoritme.GetYMostProducts(order);
        Assert.assertEquals(pr3,route.get(0));
        Assert.assertEquals(pr1,route.get(1));
    }

    @Test
    public void BerekenRoute_Product3() {
        ArrayList<Product> order = new ArrayList<Product>();
        Product pr1 = CreateProduct(order,"doos",1,6,2);
        Product pr2 = CreateProduct(order,"doos",6,3,2);
        Product pr3 = CreateProduct(order,"doos",4,6,2);
        Product pr4 = CreateProduct(order,"doos",7,3,2);
        Product pr5 = CreateProduct(order,"doos",3,2,2);

        ArrayList<Product> route =  algoritme.BerekenRoute(order);
        Assert.assertEquals(pr3,route.get(0));
        Assert.assertEquals(pr1,route.get(1));
        Assert.assertEquals(pr4,route.get(2));
        Assert.assertEquals(pr2,route.get(3));
        Assert.assertEquals(pr5,route.get(4));
    }

    @Test
    public void BerekenRoute_Product1() {
        ArrayList<Product> order = new ArrayList<Product>();
        Product pr1 = CreateProduct(order,"doos",10,4,2);
        Product pr2 = CreateProduct(order,"doos",2,3,2);
        Product pr3 = CreateProduct(order,"doos",3,10,2);
        Product pr4 = CreateProduct(order,"doos",3,2,2);
        Product pr5 = CreateProduct(order,"doos",2,9,2);

        ArrayList<Product> route =  algoritme.BerekenRoute(order);
        Assert.assertEquals(pr3,route.get(0));
        Assert.assertEquals(pr5,route.get(1));
        Assert.assertEquals(pr1,route.get(2));
        Assert.assertEquals(pr2,route.get(3));
        Assert.assertEquals(pr4,route.get(4));
    }

    @Test
    public void BerekenRoute_Product2() {
        ArrayList<Product> order = new ArrayList<Product>();
        Product pr1 = CreateProduct(order,"doos",4,9,2);
        Product pr2 = CreateProduct(order,"doos",10,3,2);
        Product pr3 = CreateProduct(order,"doos",9,1,2);
        Product pr4 = CreateProduct(order,"doos",9,6,2);
        Product pr5 = CreateProduct(order,"doos",3,1,2);

        ArrayList<Product> route =  algoritme.BerekenRoute(order);
        Assert.assertEquals(pr1,route.get(0));
        Assert.assertEquals(pr4,route.get(1));
        Assert.assertEquals(pr2,route.get(2));
        Assert.assertEquals(pr3,route.get(3));
        Assert.assertEquals(pr5,route.get(4));
    }
}
