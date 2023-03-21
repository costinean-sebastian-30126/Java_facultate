package aut.isp.lab4.exercise1;

import static junit.framework.Assert.assertEquals;
import org.junit.Test;

public class AquariumControllerTest {
    //implement minimal tests
    @Test
    public void testSetCurrentTime(){
    AquariumController ac = new AquariumController("GGG", "FFF", 18f);
            assertEquals(18f,ac.getCurrentTime());
            ac.setCurrentTime(21.10f);
            assertEquals(21.10f,ac.getCurrentTime());
    }
}
