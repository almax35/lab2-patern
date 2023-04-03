package builders;

import cars.Bus;
import cars.Car;
import drivers.BusDriver;
import passengers.Adult;
import passengers.Child;
import passengers.PrivilegedPassenger;

import java.util.Scanner;

/*
concrete builder
 */
public class BusBuilder extends CarBuilder {


    private final Bus bus = new Bus();

    @Override
    public CarBuilder boardDriver() {
        bus.setDriver(BusDriver.getInstance());
        return this;
    }

    @Override
    public CarBuilder boardPassengers() {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число взрослых пассажиров в автобусе: ");
        int adultPassengerCount =    scanner.nextInt();

        System.out.print("Введите число пассажиров-детей в автобусе: ");
        int childPassengerCount = scanner.nextInt();

        System.out.print("Введите число пассажиров-льготников в автобусе: ");
        int privilegedPassengerCount = scanner.nextInt();

        int currentPassengerCount = 0;

        for (int i = 0; i < adultPassengerCount && currentPassengerCount < bus.getCapacity(); i++) {
            boardAdult();
            currentPassengerCount++;
        }
        for (int i = 0; i < childPassengerCount && currentPassengerCount < bus.getCapacity(); i++) {
            boardChild();
            currentPassengerCount++;
        }
        for (int i = 0; i < privilegedPassengerCount && currentPassengerCount < bus.getCapacity(); i++) {
            boardPrivilegedPassenger();
            currentPassengerCount++;
        }
        System.setOut(System.out);

        scanner.close();

        return this;
    }

    @Override
    public void boardChild() {
        bus.addPassenger(new Child());
        System.out.println("Пассажир ребенок добавлен в автобус");
    }

    @Override
    public void boardAdult() {
        bus.addPassenger(new Adult());
        System.out.println("Взрослый пассажир добавлен в автобус");
    }

    @Override
    public void boardPrivilegedPassenger() {
        bus.addPassenger(new PrivilegedPassenger());
        System.out.println("Пассажир-льготник добавлен в автобус");
    }

    @Override
    public CarBuilder setCapacity(int capacity) {
        bus.setCapacity(capacity);
        return this;
    }

    public void build() {
        this.setCapacity(40);
        this.boardDriver();
        this.boardPassengers();
    }
}