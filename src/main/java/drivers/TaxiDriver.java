package drivers;

/*
concrete driver
singleton pattern
 */
public class TaxiDriver extends Driver {
    private static TaxiDriver instance;

    private TaxiDriver() {
        category = "B";
    }

    public static TaxiDriver getInstance() {
        if (instance == null) {
            instance = new TaxiDriver();
        }
        return instance;
    }
}