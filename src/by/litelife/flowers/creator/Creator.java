package by.litelife.flowers.creator;

import by.litelife.flowers.entity.accessories.Accessories;
import by.litelife.flowers.entity.flower.ShoppingFlower;
import by.litelife.flowers.entity.bouquet.Bouquet;


/**
 * Created by Иван on 08.08.2016.
 */
public class Creator {
    static ShoppingFlower rose = new ShoppingFlower("Red","Rose",40,22,70);
    static ShoppingFlower tulip = new ShoppingFlower("yellow","Tulip",35,13,60);
    static ShoppingFlower carnation = new ShoppingFlower("Red","Carnation",43,15,55);
    static ShoppingFlower chamomile = new ShoppingFlower("White","Chamomile",20,13,80);

    static Accessories ribbon = new Accessories("Ribbon", 9, "Green");
    static Accessories plasticButterfly = new Accessories("Butterfly", 13, "Blue");
    static Accessories flowerPackaging = new Accessories("Flower packaging",15,"White");

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
