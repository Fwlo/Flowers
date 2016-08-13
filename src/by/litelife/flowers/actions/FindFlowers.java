package by.litelife.flowers.actions;

import by.litelife.flowers.entity.ShoppingFlower;
import by.litelife.flowers.exceptions.BouquetException;

import java.util.ArrayList;

/**
 * Created by Иван on 08.08.2016.
 */
public class FindFlowers {
    private final int MIN_STEM_LENGTH = 40;
    private final int MAX_STEM_LENGTH = 70;

    public ArrayList<ShoppingFlower> findFlowerByStemLength(ArrayList<ShoppingFlower> bouquet) throws BouquetException {

        if (bouquet.isEmpty()){
            throw new BouquetException("Bouquet is empty!");
        }

        ArrayList<ShoppingFlower> foundFlowers = new ArrayList<>();
        for (int i = 0 ; i < bouquet.size(); i++){
            if ((bouquet.get(i).getStemLength()>=MIN_STEM_LENGTH)&&(bouquet.get(i).getStemLength()<=MAX_STEM_LENGTH))
                foundFlowers.add(bouquet.get(i));
        }
        return foundFlowers;
    }

}
