package by.litelife.flowers.entity;

import org.apache.log4j.Logger;

import java.util.ArrayList;

/**
 * Created by Иван on 08.08.2016.
 */
public class Bouquet {
    private static Logger LOG = Logger.getLogger(Bouquet.class);

    private ArrayList<ShoppingFlower> bouquetOfShoppingFlowers = new ArrayList();
    private ArrayList<Accessory> bouquetOfAccessories = new ArrayList<>();
    private int totalPrice=0;



    public Bouquet() {

    }


    public void addToBouquetShoppingFlower(ShoppingFlower ShoppingFlower){
        bouquetOfShoppingFlowers.add(ShoppingFlower);
        totalPrice = totalPrice + ShoppingFlower.getPrice();
    }

    public void addToBouquetAccessories(Accessory Accessories){
        bouquetOfAccessories.add(Accessories);
        totalPrice = totalPrice + Accessories.getPrice();
    }

    public ArrayList<ShoppingFlower> getBouquetOfShoppingFlowers() {
        ArrayList<ShoppingFlower> cloneShoppingFlowers = new ArrayList<>();
        cloneShoppingFlowers.addAll(bouquetOfShoppingFlowers);
        return cloneShoppingFlowers;
    }

    public ArrayList<Accessory> getBouquetOfAccessories() {
        ArrayList<Accessory> cloneAccessories = new ArrayList<>();
        cloneAccessories.addAll(bouquetOfAccessories);
        return cloneAccessories;

    }

    public void removeFlowerFromTheBouquet(int i){
        bouquetOfShoppingFlowers.remove(i);
    }

    public void removeAccessoryFromTheBouquet(int i){
        bouquetOfAccessories.remove(i);
    }

    public int getTotalPrice() {
        return totalPrice;
    }






}
