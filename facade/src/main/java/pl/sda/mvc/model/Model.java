package pl.sda.mvc.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by RENT on 2017-02-25.
 */
public class Model {

    public static List<Integer> values = new ArrayList<>();

    public static List<Integer> getValues() {
        return values;
    }

    public static void addValue(int newValue) {
        values.add(newValue);
    }
}
