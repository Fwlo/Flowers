package by.litelife.flowers.entity.bouquet;

import by.litelife.flowers.actions.find.FindFlowers;
import by.litelife.flowers.actions.sort.SortFlowers;
import by.litelife.flowers.entity.accessories.Accessories;
import by.litelife.flowers.entity.flower.ShoppingFlower;
import org.apache.log4j.Logger;
import sun.rmi.runtime.Log;

import java.util.ArrayList;

/**
 * Created by Иван on 08.08.2016.
 */
public class Bouquet {
    private static Logger LOG = Logger.getLogger(Bouquet.class);

    private ArrayList<ShoppingFlower> bouquetOfShoppingFlowers = new ArrayList();
    private ArrayList<Accessories> bouquetOfAccessories = new ArrayList<>();
    private ArrayList<ShoppingFlower> findedFlowers = new ArrayList<>();
    private int totalPrice=0;



    public Bouquet() {

    }


    public void addToBouquetShoppingFlower(ShoppingFlower ShoppingFlower){
        bouquetOfShoppingFlowers.add(ShoppingFlower);
        totalPrice = totalPrice + ShoppingFlower.getPrice();
    }

    public void addToBouquetAccessories(Accessories Accessories){
        bouquetOfAccessories.add(Accessories);
        totalPrice = totalPrice + Accessories.getPrice();
    }

    public ArrayList<ShoppingFlower> getBouquetOfShoppingFlowers() {
        ArrayList<ShoppingFlower> shoppingFlowers = new ArrayList<>();
        for (int i = 0; i<bouquetOfShoppingFlowers.size(); i++){
            shoppingFlowers.add(bouquetOfShoppingFlowers.get(i));
        }
        return shoppingFlowers;
    }

    public ArrayList<Accessories> getBouquetOfAccessories() {
        ArrayList<Accessories> accessories = new ArrayList<>();
        for (int i = 0; i<bouquetOfAccessories.size(); i++){
            accessories.add(bouquetOfAccessories.get(i));
        }
        return accessories;

    }

    public void removeFlowerFromTheBouquet(int i){
        bouquetOfShoppingFlowers.remove(i);
    }

    public void removeAccessoriesFromTheBouquet(int i){
        bouquetOfAccessories.remove(i);
    }

    public int getTotalPrice() {
        return totalPrice;
    }

    public void sortShoppingFlowers(){
        SortFlowers sort = new SortFlowers();
        bouquetOfShoppingFlowers= sort.sortFlowersByFreshness(bouquetOfShoppingFlowers);
    }

    public void findFlowers(){
        FindFlowers find = new FindFlowers();
        findedFlowers = find.findFlowerByStemLength(bouquetOfShoppingFlowers);
    }

    public ArrayList<ShoppingFlower> getFindedFlowers() {
        ArrayList<ShoppingFlower> shoppingFlowers = new ArrayList<>();
        for (int i = 0; i<findedFlowers.size(); i++){
            shoppingFlowers.add(findedFlowers.get(i));
        }
        return shoppingFlowers;
    }

}
