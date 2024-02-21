public class Passenger {
    
    private String name;

    public Passenger(String name) {
        this.name = name;
    }

    /**
     * Board a given car.
     * @param c The car to board.
     * @return True if boarding is successful, false otherwise.
     */
    public void boardCar(Car c) {
        c.addPassenger(this);
    }

    /**
     * Get off a given car.
     * @param c The car to get off.
     * @return True if getting off is successful, false otherwise.
     */
    public void getOffCar(Car c) {
        c.removePassenger(this);
    }

}
