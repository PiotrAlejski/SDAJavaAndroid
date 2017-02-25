package pl.sda.facade;

import pl.sda.observer.Observer;
import pl.sda.sort.Sort;
import pl.sda.sort.impl.CountSort;
import pl.sda.sort.impl.InsertSort;

public class SortFacade {

    private Observer observer = null;

    public SortFacade() {
    }

    public SortFacade(Observer observer) {
        this.observer = observer;
    }

    public int[] sortThroughFacade(int[] arrayToSort) {
        Sort sort = new InsertSort();
        return sort.sort(arrayToSort);
    }

    public int[] sortUsingCountSort(int[] arrayToSort) {
        Sort sort = new CountSort();
        for (int val : arrayToSort) {
            if (val < 0 && observer != null) {
                val = 0;
                observer.react(val);
            }
        }
        return sort.sort(arrayToSort);
    }

}
