package by.litelife.flowers.report;

import by.litelife.flowers.actions.FindFlowers;
import by.litelife.flowers.actions.SortFlowers;
import by.litelife.flowers.creator.Creator;
import by.litelife.flowers.entity.ShoppingFlower;
import by.litelife.flowers.exceptions.BouquetException;
import org.apache.log4j.Logger;

import java.util.ArrayList;

/**
 * Created by Иван on 08.08.2016.
 */
public class Report {
    private static Logger LOG = Logger.getLogger(Report.class);
    private Creator creator = new Creator();

    public void createBouquet(){
        creator.addTOBouquet();
    }

    public void showBouquet(){
        LOG.info("Bouquet:");
        try {
            if (creator.bouquet1.getBouquetOfShoppingFlowers().isEmpty()){
                throw new BouquetException("There are not flowers in the bouquet!");
            }
        for (int i = 0; i < creator.bouquet1.getBouquetOfShoppingFlowers().size(); i++) {
            LOG.info(creator.bouquet1.getBouquetOfShoppingFlowers().get(i).toString());
        }
        }catch (BouquetException e){
            LOG.error(e.getMessage());
        }


        try {
            if (creator.bouquet1.getBouquetOfAccessories().isEmpty()){
                throw new BouquetException("There are not accessories in the bouquet!");
            }
            for (int i = 0; i < creator.bouquet1.getBouquetOfAccessories().size(); i++) {
                LOG.info(creator.bouquet1.getBouquetOfAccessories().get(i).toString());
            }
        }catch (BouquetException e){
            LOG.error(e.getMessage());
        }
    }

    public void showSortedBouquet(){
        LOG.info("Sorted bouquet: ");

        try {
            if (creator.bouquet1.getBouquetOfShoppingFlowers().isEmpty()){
                throw new BouquetException("There are not flowers in the bouquet!");
            }
            SortFlowers sortFlowers = new SortFlowers();
            ArrayList<ShoppingFlower> bouquetOfSortedFlowers = new ArrayList<>();
            bouquetOfSortedFlowers.addAll(sortFlowers.sortFlowersByFreshness(creator.bouquet1.getBouquetOfShoppingFlowers()));

            for (int i = 0; i < bouquetOfSortedFlowers.size(); i++) {
                LOG.info(bouquetOfSortedFlowers.get(i).toString());
            }
        }catch (BouquetException e){
            LOG.error(e.getMessage());
        }
    }

    public void showFoundFlowers(){
        LOG.info("Found flowers: ");
        try {
            if (creator.bouquet1.getBouquetOfShoppingFlowers().isEmpty()){
                throw new BouquetException("There are not flowers in the bouquet!");
            }
            SortFlowers sortFlowers = new SortFlowers();
            ArrayList<ShoppingFlower> bouquetOfSortedFlowers = new ArrayList<>();
            bouquetOfSortedFlowers.addAll(sortFlowers.sortFlowersByFreshness(creator.bouquet1.getBouquetOfShoppingFlowers()));

            for (int i = 0; i < bouquetOfSortedFlowers.size(); i++) {
                LOG.info(bouquetOfSortedFlowers.get(i).toString());
            }
            FindFlowers findFlowers = new FindFlowers();
            if (findFlowers.findFlowerByStemLength(creator.bouquet1.getBouquetOfShoppingFlowers()).isEmpty()){
                LOG.info("Flowers is not founded!");
            } else {
                ArrayList<ShoppingFlower> foundFlowers = new ArrayList<>();
                foundFlowers.addAll(findFlowers.findFlowerByStemLength(creator.bouquet1.getBouquetOfShoppingFlowers()));
                for (int i = 0; i < foundFlowers.size(); i++) {
                    LOG.info(foundFlowers.get(i).toString());
                }
            }
        }catch (BouquetException e){
            LOG.error(e.getMessage());
        }
    }

    public void showPriceOfBouquet(){
        LOG.info("Price of the bouquet: "+creator.bouquet1.getTotalPrice());
    }

    public void showBouquetWithoutRemovedFlowers(){
        try {
            if (creator.bouquet1.getBouquetOfShoppingFlowers().isEmpty()){
                throw new BouquetException("There are not flowers in the bouquet!");
            }
            creator.bouquet1.removeFlowerFromTheBouquet(0);
            LOG.info("Remove flower: ");
            for (int i = 0; i < creator.bouquet1.getBouquetOfShoppingFlowers().size(); i++) {
                LOG.info(creator.bouquet1.getBouquetOfShoppingFlowers().get(i).toString());
            }
        }catch (BouquetException e){
            LOG.error(e.getMessage());
        }


    }
    public void showBouquetWithoutRemovedAccessory(){
        try {
            if (creator.bouquet1.getBouquetOfAccessories().isEmpty()){
                throw new BouquetException("There are not accessories in the bouquet!");
            }
            creator.bouquet1.removeAccessoryFromTheBouquet(0);
            LOG.info("Remove accessory: ");
            for (int i = 0; i < creator.bouquet1.getBouquetOfAccessories().size(); i++) {
                LOG.info(creator.bouquet1.getBouquetOfAccessories().get(i).toString());
            }

        }catch (BouquetException e){
            LOG.error(e.getMessage());
        }


    }
}
