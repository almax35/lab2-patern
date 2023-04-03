package cars;

import cars.utilits.BabyChair;
import drivers.Driver;
import passengers.Passenger;

import java.util.ArrayList;
import java.util.List;

/*
concrete car
 */
public class Taxi extends Car {
    BabyChair babyChair;
    int capacity;
    Driver driver;
    List<Passenger> passengers = new ArrayList<>();
    private static int taxiPassengerCount;

    public void setBabyChair(BabyChair babyChair) {
        this.babyChair = babyChair;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public void boardPassenger(Passenger passenger) {
        passengers.add(passenger);
        taxiPassengerCount++;
    }

    public int getCapacity() {
        return capacity;
    }
}