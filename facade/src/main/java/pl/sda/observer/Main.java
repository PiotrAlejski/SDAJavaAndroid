package pl.sda.observer;

import pl.sda.facade.SortFacade;

import java.util.Arrays;

/**
 * Created by RENT on 2017-02-25.
 */
public class Main {
    public static void main(String[] args) {
        Observer observer = new Observer();
        SortFacade sortFacade = new SortFacade(observer);

        int[] input = new int[]{4823, 432, 32424, 2342, 44, 45, -1};

        int[] result = sortFacade.sortUsingCountSort(input);
        System.out.println(Arrays.toString(result));
    }
}
