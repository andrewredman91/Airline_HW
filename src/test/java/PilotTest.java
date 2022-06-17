import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PilotTest {

    Pilot pilot;

    @Before
    public void before(){
        pilot = new Pilot("Pete Matthews", "Lt", "Mav");
    }

    @Test
    public void flyPlane(){
        assertEquals("Flying plane", pilot.flyPlane());
    }
}
