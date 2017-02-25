package pl.sda.sortSingletonFactory;

import pl.sda.sort.Sort;
import pl.sda.sort.factory.SortFactory;
import pl.sda.sort.factory.SortTypeEnum;
import pl.sda.sort.impl.BubbleSort;
import pl.sda.sort.impl.CountSort;
import pl.sda.sort.impl.InsertSort;

/**
 * Created by RENT on 2017-02-25.
 */
public class SortSingletonFactory extends SortFactory {
    private static SortSingletonFactory instance = new SortSingletonFactory();

    public static SortSingletonFactory getInstance() {
        return instance;
    }

    public static Sort produce(SortTypeEnum type) {

        if (SortTypeEnum.BUBBLE.equals(type)) {
            return new BubbleSort();
        }
        if (SortTypeEnum.COUNT.equals(type)) {
            return new CountSort();
        }
        if (SortTypeEnum.INSERT.equals(type)) {
            return new InsertSort();
        }
        return null;
    }
}

