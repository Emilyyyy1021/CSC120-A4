public class Engine {

    private FuelType fuelType;
    private double fuelLevel;

    public Engine(FuelType fuelType, double fuelLevel) {
        this.fuelType = fuelType;
        this.fuelLevel = fuelLevel;
    } 

    double maxfuel = fuelLevel;

    /**
     * Setter for FuelLevel
     * @param refuel updated reset the `Engine`'s current fuel level to the maximum
     */
    public void refuel(double fuelLevel) {
        this.fuelLevel = maxfuel;
    }

    /**
     * Decrease the current fuel level, print fuel level
     * @return T/F: does account have sufficient balance to cover amt
     */
    public boolean go() {
        if (fuelLevel > 0) {
            System.out.println("Remaining fuel level: " + fuelLevel);
            fuelLevel -= 10; 
            return true;
        } else {
            return false;
        }
    }

    // Test code
    public static void main(String[] args) {
        Engine myEngine = new Engine(FuelType.ELECTRIC, 100.0);
        while (myEngine.go()) {
            System.out.println("Choo choo!");
        }
        System.out.println("Out of fuel.");
    }


}