public class CabinCrewMember {

    private String name;
    private String rank;

    public CabinCrewMember(String name, String rank) {
        this.name = name;
        this.rank = rank;
    }

    public String relayMessages(){
        return "In the case of evacuations emergency exits can be found at the front, middle and back of the plane.";
    }
}
