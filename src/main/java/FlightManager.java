public class FlightManager {

    private Flight flight;

    public FlightManager(Flight flight) {
        this.flight = flight;
    }

    public int calculateBaggageWeightAllowed() {
        int baggageWeight = baggageWeight();
        int planeCapacity = flight.getPlane().getPlaneType().getCapacity();
        return baggageWeight / planeCapacity;
    }

    private int baggageWeight() {
        return flight.getPlane().getPlaneType().getWeight();
    }

    public int calculateBaggageWeightBooked() {
        int baggageWeightPerPerson = calculateBaggageWeightAllowed();
        int numberOfPassengers = flight.getBookedPassengers().size();
        return baggageWeightPerPerson * numberOfPassengers;
    }

    public int calculateRemainingBaggageWeight() {
        int planeBaggageWeight = baggageWeight();
        int weightBooked = calculateBaggageWeightBooked();
        return planeBaggageWeight - weightBooked;
    }
}
