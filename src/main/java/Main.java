import builders.BusBuilder;
import builders.TaxiBuilder;
import cars.Bus;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Director.manage(new TaxiBuilder());
        Director.manage(new BusBuilder());
    }
}
