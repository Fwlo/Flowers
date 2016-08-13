package by.litelife.flowers.actions;

import by.litelife.flowers.entity.ShoppingFlower;
import by.litelife.flowers.exceptions.BouquetException;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by Иван on 08.08.2016.
 */
public class SortFlowers {

    public ArrayList<ShoppingFlower> sortFlowersByFreshness(ArrayList<ShoppingFlower> bouquet) throws BouquetException {
        if (bouquet.isEmpty()) {
            throw new BouquetException("Bouquet is empty!");
        }
        Collections.sort(bouquet,new ComparatorForSortFlowers());
        return bouquet;
    }
}
