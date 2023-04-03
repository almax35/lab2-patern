package drivers;

/*
concrete driver
singleton pattern
 */
public class BusDriver extends Driver {
    private static BusDriver instance;

    private BusDriver() {
        category = "A";
    }

    public static BusDriver getInstance() {
        if (instance == null) {
            instance = new BusDriver();
        }
        return instance;
    }
}