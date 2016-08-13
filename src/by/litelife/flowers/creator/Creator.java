package by.litelife.flowers.creator;

import by.litelife.flowers.entity.Accessory;
import by.litelife.flowers.entity.ShoppingFlower;
import by.litelife.flowers.entity.Bouquet;
import by.litelife.flowers.exceptions.AccessoryException;
import by.litelife.flowers.exceptions.FlowerException;
import org.apache.log4j.Logger;


/**
 * Created by Иван on 08.08.2016.
 */
public class Creator {
    private static Logger LOG = Logger.getLogger(Creator.class);

    public Bouquet bouquet1 = new Bouquet();


    public void addTOBouquet()  {

        try {
            ShoppingFlower rose = new ShoppingFlower("Red", "Rose", 9, 22, 70);
            bouquet1.addToBouquetShoppingFlower(rose);
        } catch (FlowerException e){
            LOG.error(e.getMessage());
        }
        try {
            ShoppingFlower tulip = new ShoppingFlower("yellow", "Tulip", 35, 13, 60);
            bouquet1.addToBouquetShoppingFlower(tulip);
        } catch (FlowerException e){
            LOG.error(e.getMessage());
        }

        try {
            ShoppingFlower carnation = new ShoppingFlower("Red", "Carnation", 43, 15, 55);
            bouquet1.addToBouquetShoppingFlower(carnation);
        } catch (FlowerException e){
            LOG.error(e.getMessage());
        }

        try {
            ShoppingFlower chamomile = new ShoppingFlower("White", "Chamomile", 20, 13, 80);
            bouquet1.addToBouquetShoppingFlower(chamomile);
        } catch (FlowerException e){
            LOG.error(e.getMessage());
        }

        try {
            Accessory ribbon = new Accessory("Ribbon", 9, "Green");
            bouquet1.addToBouquetAccessories(ribbon);
        } catch (AccessoryException e){
            LOG.error(e.getMessage());
        }


        try {
            Accessory plasticButterfly = new Accessory("Butterfly", 13, "Blue");
            bouquet1.addToBouquetAccessories(plasticButterfly);
        } catch (AccessoryException e){
            LOG.error(e.getMessage());
        }


        try {
            Accessory flowerPackaging = new Accessory("Flower packaging",15,"White");
            bouquet1.addToBouquetAccessories(flowerPackaging);
        } catch (AccessoryException e){
            LOG.error(e.getMessage());
        }

    }
}
