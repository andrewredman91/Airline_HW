public class Plane {

    private PlaneType planeType;
    private int numberOfSeats;
    private int totalWeight;

    public Plane(PlaneType planeType, int numberOfSeats, int totalWeight) {
        this.planeType = planeType;
        this.numberOfSeats = numberOfSeats;
        this.totalWeight = totalWeight;
    }

    public PlaneType getPlaneType() {
        return planeType;
    }
}
