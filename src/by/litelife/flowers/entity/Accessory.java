package by.litelife.flowers.entity;


import by.litelife.flowers.exceptions.PriceException;

import java.text.ParseException;

public class Accessory {
    private String name;
    private int price;
    private String color;

    public Accessory(String name, int price, String color) throws PriceException {
        this.name = name;

        if (price<0) throw new PriceException();

        this.price = price;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) throws PriceException {
        if (price<0) throw new PriceException();

        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Accessory{ " +
                "name = " + name + " price = " + price +
                " color = " + color +
                " }";
    }
}
