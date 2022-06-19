import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class FlightManagerTest {

    Flight flight;
    Passenger passenger1;
    Passenger passenger2;
    ArrayList<Passenger> bookedPassengers;
    CabinCrewMember cabinCrewMember;
    Pilot pilot;
    Plane plane;
    FlightManager flightManager;

    @Before
    public void before() {
        passenger1 = new Passenger("Stuart", 1);
        passenger2 = new Passenger("Meera", 2);
        bookedPassengers = new ArrayList<>();
        bookedPassengers.add(passenger1);
        bookedPassengers.add(passenger2);
        cabinCrewMember = new CabinCrewMember("Tom Kazansky", "Iceman");
        pilot = new Pilot("Pete Matthews", "Lt", "Mav");
        plane = new Plane(PlaneType.BOEING747, 10, 100);
        flight = new Flight(pilot, cabinCrewMember, bookedPassengers, plane, "1", "EDI", "Par", 0230);
        flightManager = new FlightManager(flight);
    }

    @Test
    public void calculateHowMuchBaggageWeight(){
        assertEquals(10, flightManager.calculateBaggageWeightAllowed());
    }
    @Test
    public void calculateHowMuchBaggageWeightBooked(){
        assertEquals(20, flightManager.calculateBaggageWeightBooked());
    }
    @Test
    public void  calculateHowMuchOverallWeightRemains(){
        assertEquals(80, flightManager.calculateRemainingBaggageWeight());
    }
}
