import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CabinCrewMemberTest {

    CabinCrewMember cabinCrewMember;

    @Before
    public void before(){
        cabinCrewMember = new CabinCrewMember("Tom Kazansky", "Iceman");
    }

    @Test
    public void relayMessages(){
        assertEquals("In the case of evacuations emergency exits can be found at the front, middle and back of the plane.", cabinCrewMember.relayMessages());
    }
}
