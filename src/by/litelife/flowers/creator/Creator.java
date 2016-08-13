package by.litelife.flowers.creator;

import by.litelife.flowers.entity.Accessory;
import by.litelife.flowers.entity.ShoppingFlower;
import by.litelife.flowers.entity.Bouquet;
import by.litelife.flowers.exceptions.FreshnessException;
import by.litelife.flowers.exceptions.PriceException;
import by.litelife.flowers.exceptions.StemLengthException;


/**
 * Created by Иван on 08.08.2016.
 */
public class Creator {

    public Bouquet bouquet1 = new Bouquet();


    public void addTOBouquet() throws StemLengthException, FreshnessException, PriceException {
        ShoppingFlower rose = new ShoppingFlower("Red", "Rose", 9, 22, 70);
        ShoppingFlower tulip = new ShoppingFlower("yellow", "Tulip", 35, 13, 60);
        ShoppingFlower carnation = new ShoppingFlower("Red", "Carnation", 43, 15, 55);
        ShoppingFlower chamomile = new ShoppingFlower("White", "Chamomile", 20, 13, 80);

        Accessory ribbon = new Accessory("Ribbon", 9, "Green");
        Accessory plasticButterfly = new Accessory("Butterfly", 13, "Blue");
        Accessory flowerPackaging = new Accessory("Flower packaging",15,"White");

        bouquet1.addToBouquetShoppingFlower(rose);
        bouquet1.addToBouquetShoppingFlower(tulip);
        bouquet1.addToBouquetShoppingFlower(carnation);
        bouquet1.addToBouquetShoppingFlower(chamomile);

        bouquet1.addToBouquetAccessories(ribbon);
        bouquet1.addToBouquetAccessories(plasticButterfly);
        bouquet1.addToBouquetAccessories(flowerPackaging);
    }
}
