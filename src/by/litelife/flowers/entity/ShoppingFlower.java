package by.litelife.flowers.entity;

import by.litelife.flowers.exceptions.FlowerException;

/**
 * Created by Иван on 08.08.2016.
 */
public class ShoppingFlower extends AbstractFlower {
    private int stemLength;
    private int price;
    private int freshness;

    public ShoppingFlower(String color, String name, int stemLength, int price, int freshness) throws FlowerException {
        super(color,name);

        if (stemLength<0) {
            throw new FlowerException("Stem length flower less 0! Change the stem length.");
        }

        this.stemLength = stemLength;

        if (price<0) {
            throw new FlowerException("Price flower less 0! Change the price.");
        }

        this.price = price;

        if (freshness<0 || freshness>100) {
            throw new FlowerException("Freshness flower less 0 or more 100! Change the freshness.");
        }

        this.freshness = freshness;
    }

    public int getStemLength() {
        return stemLength;
    }

    public void setStemLength(int stemLength) throws FlowerException {
        if (stemLength<0) {
            throw new FlowerException("Stem length flower less 0! Change the stem length.");
        }

        this.stemLength = stemLength;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) throws FlowerException {
        if (price<0) {
            throw new FlowerException("Price flower less 0! Change the price.");
        }

        this.price = price;
    }

    public int getFreshness() {
        return freshness;
    }

    public void setFreshness(int freshness) throws FlowerException {
        if (freshness<0 || freshness>100) {
            throw new FlowerException("Freshness flower less 0 or more 100! Change the freshness.");
        }
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
