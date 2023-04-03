package builders;

import cars.Car;
import cars.Taxi;
import cars.utilits.BabyChair;
import drivers.TaxiDriver;
import passengers.Adult;
import passengers.Child;

import java.util.Scanner;

public class TaxiBuilder extends CarBuilder {


    private final Taxi taxi = new Taxi();

    @Override
    public CarBuilder boardDriver() {
        taxi.setDriver(TaxiDriver.getInstance());
        return this;
    }

    @Override
    public CarBuilder boardPassengers() {
        System.out.print("Введите число взрослых пассажиров: ");
        Scanner scanner1 = new Scanner(System.in);
        int adultCount = scanner1.nextInt();

        System.out.print("Введите числов пассажиров-детей: ");
        int childCount = scanner1.nextInt();


        int currentAmountOfPassengers = 0;

        for (int i = 0; i < adultCount && currentAmountOfPassengers < taxi.getCapacity(); i++) {
            boardAdult();
            currentAmountOfPassengers++;
        }
        for (int i = 0; i < childCount && currentAmountOfPassengers < taxi.getCapacity(); i++) {
            boardChild();
        }

        scanner1.close();

        return this;
    }

    @Override
    public void boardBabyChair() {
        taxi.setBabyChair(new BabyChair());
        System.out.println("Детское кресло добавлено в такси");
    }

    @Override
    public void boardChild() {
        taxi.boardPassenger(new Child());
        System.out.println("Пассажир ребенок добавлен в такси");
        boardBabyChair();
    }

    @Override
    public void boardAdult() {
        taxi.boardPassenger(new Adult());
        System.out.println("Взрослый пассажир добавлен в такси");
    }

    @Override
    public CarBuilder setCapacity(int capacity) {
        taxi.setCapacity(capacity);
        return this;
    }

    public void build() {
        this
                .setCapacity(4)
                .boardDriver();
        this.boardPassengers();
    }
}