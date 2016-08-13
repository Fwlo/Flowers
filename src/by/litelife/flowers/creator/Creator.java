package by.litelife.flowers.creator;

import by.litelife.flowers.entity.Accessory;
import by.litelife.flowers.entity.ShoppingFlower;
import by.litelife.flowers.entity.Bouquet;


/**
 * Created by Иван on 08.08.2016.
 */
public class Creator {
    private static ShoppingFlower rose = new ShoppingFlower("Red","Rose",40,22,70);
    private static ShoppingFlower tulip = new ShoppingFlower("yellow","Tulip",35,13,60);
    private static ShoppingFlower carnation = new ShoppingFlower("Red","Carnation",43,15,55);
    private static ShoppingFlower chamomile = new ShoppingFlower("White","Chamomile",20,13,80);

    private static Accessory ribbon = new Accessory("Ribbon", 9, "Green");
    private static Accessory plasticButterfly = new Accessory("Butterfly", 13, "Blue");
    private static Accessory flowerPackaging = new Accessory("Flower packaging",15,"White");

    public Bouquet bouquet1 = new Bouquet();
    public void addTOBouquet(){
        bouquet1.addToBouquetShoppingFlower(rose);
        bouquet1.addToBouquetShoppingFlower(tulip);
        bouquet1.addToBouquetShoppingFlower(carnation);
        bouquet1.addToBouquetShoppingFlower(chamomile);

        bouquet1.addToBouquetAccessories(ribbon);
        bouquet1.addToBouquetAccessories(plasticButterfly);
        bouquet1.addToBouquetAccessories(flowerPackaging);
    }
}
