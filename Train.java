import java.util.ArrayList;

public class Train {

    private Engine engine;
    private ArrayList<Car> cars;

    public Train(FuelType fuelType, double fuelLevel, double maxfuel, int nCars, int passengerCapacity) {
        this.engine = new Engine(fuelType, fuelLevel, maxfuel);
        this.cars = new ArrayList<Car>();
        addCars(nCars, passengerCapacity);
    }

    private void addCars(int nCars, int passengerCapacity) {
        for (int i = 0; i < nCars; i++) {
            Car car = new Car(passengerCapacity);
            cars.add(car);
        }
    }

    /**
     * Getter for the train's engine
     * @return The engine of the train
     */
    public Engine getEngine() {
        return engine;
    }

    /**
     * Getter for a specific car in the train
     * @param i Index of the car in the train
     * @return the `i`th car
     */
    public Car getCar(int i) {
        return cars.get(i);
    }

    /**
     * Getter for the maximum capacity of the train
     * @return the maximum total capacity across all `Car`s
     */
    public int getMaxCapacity() {
        int maxCapacity = 0;
        for (Car car : cars) {
            maxCapacity += car.getCapacity();
        }
        return maxCapacity;

    }

    /**
     * Getter for the remaining seats in the train
     * @return the number of remaining open seats across all `Car`s
     */
    public int seatsRemaining() {
        int remainingSeats = 0;
        for (Car car : cars) {
            remainingSeats += car.seatsRemaining();
        }
        return remainingSeats;
    }

    /**
     * Getter for a list of all `Passenger`s aboard the train
     * @return a list of all `Passenger`s aboard the train
     */
    public void printManifest() {
        System.out.println("Passenger Manifest:");
        for (Car car : cars) {
            car.printManifest();
        }
    }

}
