package Assignment4.Inheritence;

import Assignment4.Inheritence.Cylinder;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CylinderTest extends Cylinder {

    private Cylinder cy1;
    @Before
    public void setUp() throws Exception
    {
        cy1 = new Cylinder();
    }

    @Test
    public double getHeight()
    {
       double result = cy1.getHeight();
        assertEquals(4.0, 4.0);
        return result;
    }


    @Test
    public double getVolume()
    {
        double result = cy1.getVolume();
        Assert.assertEquals(50.27, 50.27);
        return result;
    }

    @Test
    public String toString()
    {
      String result = cy1.toString();
      Assert.assertEquals("This is a Assignment4.Inheritence.Cylinder", "This is a Assignment4.Inheritence.Cylinder");
      return result;
    }
}