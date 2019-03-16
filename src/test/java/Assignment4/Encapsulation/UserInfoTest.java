package Assignment4.Encapsulation;

import junit.framework.Assert;
import org.junit.After;
import org.junit.Test;

import static org.junit.Assert.*;

public class UserInfoTest
{
    private  UserInfo info2;

    @After
    public void tearDown() throws Exception
    {
        info2 = new UserInfo();
    }



    @Test
    public String getName()
    {
        String result = info2.getName();
        assertEquals("Morgan", "Morgan" );

        return result;
    }



    @Test
    public String getEmail()
    {
        String result = info2.getEmail();
        assertEquals("gamil", "gmail");
        return result;

    }
}//closes class