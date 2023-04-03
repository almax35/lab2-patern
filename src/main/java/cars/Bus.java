package cars;

import drivers.Driver;
import passengers.Passenger;

import java.util.ArrayList;
import java.util.List;

/*
concrete car
 */
public class Bus extends Car {
    int capacity;
    Driver driver;
    List<Passenger> passengers = new ArrayList<>();
    private static int busPassengerCount;

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public void addPassenger(Passenger passenger) {
        passengers.add(passenger);
        busPassengerCount++;
    }

    public int getCapacity() {
        return capacity;
    }
}