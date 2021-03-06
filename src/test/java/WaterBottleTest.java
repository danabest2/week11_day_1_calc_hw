import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class WaterBottleTest {

    WaterBottle waterbottle;

    @Before
    public void before(){
        waterbottle = new WaterBottle(100);
    }

    @Test
    public void hasVolume(){
        assertEquals(100, waterbottle.getVolume());
    }

    @Test
    public void hasAdddrink(){
        assertEquals( 110, waterbottle.getAdddrink());
    }

    @Test
    public void hasEmptyvolume(){
        assertEquals( 0, waterbottle.getEmptyvolume());
    }

    @Test
    public void hasFill(){
        assertEquals(100, watterbottle.getFill());
    }

}
