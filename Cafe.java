
public class Cafe extends Building {

    private int nCoffeeOunces; 
    private int nSugarPackets; // The number of sugar packets remaining in inventory
    private int nCreams; // The number of "splashes" of cream remaining in inventory
    private int nCups; // The number of cups remaining in inventory

    //constructor
    public Cafe(String name, String address, int nFloors) {
        super(name, address, nFloors);

        nCoffeeOunces = 8;
        nSugarPackets = 50;
        nCreams = 50;
        nCups = 100;
    }

    /**
     * Restocks the cafe's ingredients
     * @param addCoffeeOunces
     * @param addSugarPackets
     * @param addCreams
     * @param addCups
     */
    private void restock(int addCoffeeOunces, int addSugarPackets, int addCreams, int addCups) {
        nCoffeeOunces += addCoffeeOunces;
        nSugarPackets += addSugarPackets;
        nCreams += addCreams;
        nCups += addCups;
        System.out.println("Inventory restocked!");
    }

    /**
     * Removes ingredients from the inventory to "sell coffee"
     * @param size
     * @param sugars
     * @param creams
     */
    public void sellCoffee(int size, int sugars, int creams) {
        if (nCoffeeOunces >= size && nSugarPackets >= sugars && nCreams >= creams && nCups >= 1)  {
            nCoffeeOunces -= size;
            nSugarPackets -= sugars;
            nCreams -= creams;
            nCups -= 1;
            System.out.println(size + " ounce coffee with " + sugars + " sugars and " + creams + " creams " + "sold!");
        }
        else {
        restock(size, sugars, creams, 50);
        nCoffeeOunces -= size;
        nSugarPackets -= sugars;
        nCreams -= creams;
        nCups -= 1;
        System.out.println(size + " ounce coffee with " + sugars + " sugars and " + creams + " creams " + "sold!");
        }
    }

    /**
     * toString method for Cafe class
     */
    public String toString() {
        return this.name + " is a " + this.nFloors + "-story cafe located at " + this.address;
    }
    
    public static void main(String[] args) {
        Cafe compassCafe = new Cafe("Compass Cafe", "Smith campus", 1);
        compassCafe.sellCoffee(8, 2, 1);
        compassCafe.sellCoffee(8, 0, 0);
        compassCafe.sellCoffee(1000, 1002, 1000);
        System.out.println(compassCafe);

    }
    
}
