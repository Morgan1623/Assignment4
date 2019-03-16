package Assignment4.Polymorphism;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class DogTest extends Animal {

    private Animal dog;

    @Before
    public void setUp() throws Exception
    {
        dog = new Animal();
    }

    @Test
    public String sounds()
    {

        String result = dog.sounds();
        Assert.assertEquals("Any sound", "Meow");
        return result;

    }
}