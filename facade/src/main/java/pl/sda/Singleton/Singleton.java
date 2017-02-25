package pl.sda.Singleton;

/**
 * Created by RENT on 2017-02-25.
 */
public class Singleton {
    private static Singleton instance = new Singleton();
    private static int counter = 0;

    private Singleton() {
        counter++;
    }

    public static Singleton getInstance() {
        Singleton result = instance;
        if (instance != null) {
            result = instance;
        } else {
            result = new Singleton();
        }
        return result;
    }

    public static int getCounter() {
        return counter;
    }

    public String getName() {
        return "Singelton";
    }
}
