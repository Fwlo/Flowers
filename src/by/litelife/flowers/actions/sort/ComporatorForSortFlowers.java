package by.litelife.flowers.actions.sort;

import by.litelife.flowers.entity.flower.ShoppingFlower;

import java.util.Comparator;

/**
 * Created by Иван on 11.08.2016.
 */
public class ComporatorForSortFlowers implements Comparator<ShoppingFlower> {


    @Override
    public int compare(ShoppingFlower o1, ShoppingFlower o2) {
        int freshness1 = o1.getFreshness();
        int freshness2 = o2.getFreshness();

        if (freshness1>freshness2) return -1;
        else if (freshness1<freshness2) return 1;
        else return 0;
    }
}
