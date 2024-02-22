import java.util.*;

public class Car {

    private int maxCapacity;
    private ArrayList<Passenger> passengerList;

    public Car(int maxCapacity) {
        this.maxCapacity = maxCapacity;
        this.passengerList = new ArrayList<Passenger>();
    }


    /**
     * Getter for maximum capacity
     * @return the maximum capacity
     */
    public int getCapacity() {
        return this.maxCapacity;
    }


    /**
     * Getter for remaining seats
     * @return the remaining seats
     */
    public int seatsRemaining() {
        return this.maxCapacity - passengerList.size();
    }

    /**
     * Setter
     * Add a `Passenger` from the `Car`
     * @return T/F: return `True` if the operation was successful, and `False` otherwise
     */
    public boolean addPassenger(Passenger p) {
        if (!passengerList.contains(p) && passengerList.size() < maxCapacity) {
            passengerList.add(p);
            return true;
        }else {
            return false;
        }
    }

    /**
     * Setter
     * remove a `Passenger` from the `Car`
     * @return T/F: return `True` if the operation was successful, and `False` otherwise
     */
    public boolean removePassenger(Passenger p) {
        if (passengerList.contains(p)){
            passengerList.remove(p);
            return true;
        }else {
            return false;
        }

    }

    /**
     * Getter for a list of all `Passenger`s aboard the car
     * @return a list of all `Passenger`s aboard the car
     */
    public void printManifest() {
       if (passengerList.size() > 0){
            for (Passenger p : passengerList) {
                System.out.println(p);
       }
    } else {
        System.out.println("This car is EMPTY");
    }

    }
}