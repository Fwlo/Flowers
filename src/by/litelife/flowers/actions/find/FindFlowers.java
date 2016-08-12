package by.litelife.flowers.actions.find;

import by.litelife.flowers.entity.flower.ShoppingFlower;

import java.util.ArrayList;

/**
 * Created by Иван on 08.08.2016.
 */
public class FindFlowers {
    final int MIN_STEM_LENGTH = 40;
    final int MAX_STEM_LENGTH = 70;

    public ArrayList<ShoppingFlower> findFlowerByStemLength(ArrayList<ShoppingFlower> bouquet){
        ArrayList<ShoppingFlower> findedFlowers = new ArrayList<>();
        for (int i = 0 ; i < bouquet.size(); i++){
            if ((bouquet.get(i).getStemLength()>MIN_STEM_LENGTH)&&(bouquet.get(i).getStemLength()<MAX_STEM_LENGTH))
                findedFlowers.add(bouquet.get(i));
        }
        return findedFlowers;
    }

}
