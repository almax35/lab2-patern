package builders;

import cars.Car;

/*
abstract builder
 */
public class CarBuilder {


    public CarBuilder boardDriver() {
        return this;
    }

    public CarBuilder boardPassengers() {
        return this;
    }

    public void boardBabyChair() {
    }

    public CarBuilder setCapacity(int capacity) {
        return this;
    }

    public void boardChild() {
    }

    public void boardAdult() {
    }

    public void boardPrivilegedPassenger() {
    }

    public void boardBaggage() {
    }

    public void build(CarBuilder carBuilder) {
        if (carBuilder instanceof BusBuilder) {
            BusBuilder b = (BusBuilder) carBuilder;
            b.build();
        }
        if (carBuilder instanceof TaxiBuilder) {
            TaxiBuilder t = (TaxiBuilder) carBuilder;
            t.build();
        }

    }

    ;
}