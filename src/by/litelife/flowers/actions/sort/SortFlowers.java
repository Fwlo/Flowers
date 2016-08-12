package by.litelife.flowers.actions.sort;

import by.litelife.flowers.entity.flower.ShoppingFlower;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by Иван on 08.08.2016.
 */
public class SortFlowers {

    public ArrayList<ShoppingFlower> sortFlowersByFreshness(ArrayList<ShoppingFlower> bouquet){
        Collections.sort(bouquet,new ComporatorForSortFlowers());
        return bouquet;
    }
}
