public class Building {

    protected String name = "<Name Unknown>";
    protected String address = "<Address Unknown>";
    protected int nFloors = 1;

    /**
     * Constructor for building class
     * @param name: the name of the building
     * @param address: the building's address
     * @param nFloors: the number of floors
     */
    public Building(String name, String address, int nFloors) {
        if (name != null) { this.name = name; }
        if (address != null) { this.address = address; } 
        if (nFloors < 1) {
            throw new RuntimeException("Cannot construct a building with fewer than 1 floor.");
        }
        this.nFloors = nFloors;
    }

    /**
     * Accessor for building's name
     * @return the name of the building
     */
    public String getName() {
        return this.name;
    }

    /**
     * Accessor for building's address
     * @return the building's address
     */
    public String getAddress() {
        return this.address;
    }

    /**
     * Accessor for building's floors
     * @return the number of floors the building has
     */
    public int getFloors() {
        return this.nFloors;
    }

    /**
     * toString method for Building class
     */
    public String toString() {
        return this.name + " is a " + this.nFloors + "-story building located at " + this.address;
    }

    public static void main(String[] args) {
        Building fordHall = new Building("Ford Hall", "100 Green Street Northampton, MA 01063", 4);
        System.out.println(fordHall);
    }

}
