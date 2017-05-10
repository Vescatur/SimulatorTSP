package test;

import simulatorTSP.Locatie;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


/**
 * Created by Ivan on 04/05/2017.
 */
public class TestLocatie {
    private Locatie loc1;
    private Locatie loc2;

    @Before
    public void Initalize(){
        loc1 = new Locatie(0,0);
        loc2 = new Locatie(3,4);
    }

    @Test
    public void ConstructorXY(){
        int[] expected = {3,4};
        int[] actual = {loc2.getX(),loc2.getY()};
        Assert.assertArrayEquals(expected,actual);
    }

    @Test
    public void GetLengteStatic(){
        double expected = 5;
        double actual = Locatie.getLengte(loc1,loc2);
        Assert.assertEquals(expected,actual,0.001);
    }

    @Test
    public void GetLengteStaticReverse(){
        double expected = 5;
        double actual = Locatie.getLengte(loc2,loc1);
        Assert.assertEquals(expected,actual,0.001);
    }

    @Test
    public void GetLengteOnObject(){
        double expected = 5;
        double actual = loc1.getLengte(loc2);
        Assert.assertEquals(expected,actual,0.001);
    }

    @Test
    public void GetLengteOnObjectReverse(){
        double expected = 5;
        double actual = loc2.getLengte(loc1);
        Assert.assertEquals(expected,actual,0.001);
    }
}

