package by.litelife.flowers.main;


import by.litelife.flowers.report.Report;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;


public class Main {
    static {
        new DOMConfigurator().doConfigure("log4j.xml", LogManager.getLoggerRepository());
    }
    private static Logger LOG = Logger.getLogger(Main.class);

    public static void main(String[] args) {
        Report report = new Report();
        report.createBouquet();
        report.showBouquet();
        report.showSortedBouquet();
        report.showFoundFlowers();
        report.showPriceOfBouquet();
        report.showBouquetWithoutRemovedFlowers();
        report.showBouquetWithoutRemovedAccessory();


    }

}
