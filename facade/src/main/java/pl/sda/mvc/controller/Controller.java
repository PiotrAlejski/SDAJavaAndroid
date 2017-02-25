package pl.sda.mvc.controller;

import pl.sda.mvc.model.Model;

import java.util.List;
import java.util.Random;

/**
 * Created by RENT on 2017-02-25.
 */
public class Controller {
    public int getFibValue(int n) {
        Random random = new Random();
        int val = random.nextInt(2000);
        Model.addValue(val);
        return val;
    }

    public double average() {
        double sum = 0;

        List<Integer> values = Model.getValues();

        for (int val : values) {
            sum = sum + val;
        }
        return sum / values.size();
    }
}
