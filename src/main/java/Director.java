import builders.*;


public class Director {

    public static void manage(CarBuilder carBuilder) {
        new CarBuilder().build(carBuilder);
    }

}
