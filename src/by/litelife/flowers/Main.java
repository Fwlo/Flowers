package by.litelife.flowers;


import by.litelife.flowers.creator.Creator;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;


public class Main {
    static {
        new DOMConfigurator().doConfigure("log4j.xml", LogManager.getLoggerRepository());
    }
    private static Logger LOG = Logger.getLogger(Main.class);

    public static void main(String[] args) {
        LOG.debug("test");
        Creator creator = new Creator();
        creator.addTOBouquet();
        creator.bouquet1.sortShoppingFlowers();

        for (int i =0;i<creator.bouquet1.getBouquetOfShoppingFlowers().size();i++){
            LOG.info(creator.bouquet1.getBouquetOfShoppingFlowers().get(i).toString());
        }

        for (int i =0;i<creator.bouquet1.getBouquetOfAccessories().size();i++){
            LOG.info(creator.bouquet1.getBouquetOfAccessories().get(i).toString());
        }

        creator.bouquet1.findFlowers();

        for (int i =0;i<creator.bouquet1.getFindedFlowers().size();i++){
            LOG.info(creator.bouquet1.getFindedFlowers().get(i).toString());
        }
        LOG.debug(creator.bouquet1.getTotalPrice());

    }

}
