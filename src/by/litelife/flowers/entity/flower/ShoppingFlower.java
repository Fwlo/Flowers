package by.litelife.flowers.entity.flower;

/**
 * Created by Иван on 08.08.2016.
 */
public class ShoppingFlower extends AbstractFlower {
    private int stemLength;
    private int price;
    private int freshness;

    public ShoppingFlower(String color, String name, int stemLength, int price, int freshness) {
        super(color,name);
        this.stemLength = stemLength;
        this.price = price;
        this.freshness = freshness;
    }

    public int getStemLength() {
        return stemLength;
    }

    public void setStemLength(int stemLength) {
        this.stemLength = stemLength;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getFreshness() {
        return freshness;
    }

    public void setFreshness(int freshness) {
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
