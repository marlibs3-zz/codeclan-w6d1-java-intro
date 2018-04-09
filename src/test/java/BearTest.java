import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BearTest {
    private Bear myBear;
    private Bear myBear2;

    @Before
    public void  before(){
        myBear = new Bear ("Paddington", 23, 650.0, 'm');
        myBear2 = new Bear ("Heavy Bear", 25, 701.0, 'f');
    }

    @Test
    public void hasName(){
        assertEquals("Paddington", myBear.getName());
    }

    @Test
    public void hasAge(){
        assertEquals(23, myBear.getAge());
    }

    @Test
    public void hasWeight(){
        assertEquals(650.0, myBear.getWeight(), 0.01);
    }

    @Test
    public void isBearAbleToSleep(){
        assertEquals(false, myBear.isAsleep());
    }

    @Test
    public void isBearAbleToNotSleep(){
        assertEquals(true, myBear2.isAsleep());
    }

    @Test
    public void isBearMale(){
        assertEquals('m', myBear.getGender());
    }

    @Test
    public void isBearFemale(){
        assertEquals('f', myBear2.getGender());
    }
}
