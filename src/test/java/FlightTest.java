import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class FlightTest {

    Flight flight;
    Passenger passenger1;
    Passenger passenger2;
    ArrayList<Passenger> bookedPassengers;
    CabinCrewMember cabinCrewMember;
    Pilot pilot;
    Plane plane;



    @Before
    public void before(){
        passenger1 = new Passenger("Stuart", 1);
        passenger2 = new Passenger("Meera", 2);
        bookedPassengers = new ArrayList<>();
        bookedPassengers.add(passenger1);
        bookedPassengers.add(passenger2);
        cabinCrewMember = new CabinCrewMember("Tom Kazansky", "Iceman");
        pilot = new Pilot("Pete Matthews", "Lt", "Mav");
        plane = new Plane(PlaneType.BOEING747, 10, 100);
        flight = new Flight(pilot, cabinCrewMember, bookedPassengers, plane, "1", "EDI", "Par", 0230);
    }

    @Test
    public void canGetNumberAvailableSeats(){
    assertEquals(8, flight.numberOfAvailableSeats());
}
    @Test
    public void bookAPassenger(){
        flight.bookPassenger(passenger2);
        flight.bookPassenger(passenger2);
        assertEquals(4, bookedPassengers.size());
    }
}
