public class Pilot {

    private String name;
    private String rank;
    private String licenceNumber;

    public Pilot(String name, String rank, String licenceNumber) {
        this.name = name;
        this.rank = rank;
        this.licenceNumber = licenceNumber;
    }

    public String flyPlane(){
        return "Flying plane";
    }
}
