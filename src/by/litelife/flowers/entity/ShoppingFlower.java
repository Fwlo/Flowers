package by.litelife.flowers.entity;

import by.litelife.flowers.exceptions.FreshnessException;
import by.litelife.flowers.exceptions.PriceException;
import by.litelife.flowers.exceptions.StemLengthException;

/**
 * Created by Иван on 08.08.2016.
 */
public class ShoppingFlower extends AbstractFlower {
    private int stemLength;
    private int price;
    private int freshness;

    public ShoppingFlower(String color, String name, int stemLength, int price, int freshness) throws StemLengthException, FreshnessException, PriceException {
        super(color,name);

        if (stemLength<0) throw new StemLengthException();

        this.stemLength = stemLength;

        if (price<0) throw new PriceException();

        this.price = price;

        if (freshness<0 || freshness>100) throw new FreshnessException();

        this.freshness = freshness;
    }

    public int getStemLength() {
        return stemLength;
    }

    public void setStemLength(int stemLength) throws StemLengthException {
        if (stemLength<0) throw new StemLengthException();

        this.stemLength = stemLength;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) throws PriceException {
        if (price<0) throw new PriceException();

        this.price = price;
    }

    public int getFreshness() {
        return freshness;
    }

    public void setFreshness(int freshness) throws FreshnessException {
        if (freshness<0 || freshness>100) throw new FreshnessException();
        this.freshness = freshness;
    }

    @Override
    public String toString() {
        return "ShoppingFlower{ Name = "+getName()+
                " stemLength = " + stemLength +
                ", price = " + price +
                ", freshness = " + freshness +
                " color = " +getColor()+" }";
    }
}
