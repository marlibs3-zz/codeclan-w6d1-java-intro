import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BearTest {
    @Test
    public void hasName(){
        Bear myBear = new Bear("Yogi", 10, 650.0);
        assertEquals("Yogi", myBear.getName());
    }

    @Test
    public void hasAge(){
        Bear myBear = new Bear("Yogi", 10, 650.0);
        myBear.setAge(23);
        assertEquals(23, myBear.getAge());
    }

    @Test
    public void hasWeight(){
        Bear myBear = new Bear("Yogi", 10, 650.0);
        myBear.setWeight(720.0);
        assertEquals(720.0, myBear.getWeight(), 0.01);
    }
}
