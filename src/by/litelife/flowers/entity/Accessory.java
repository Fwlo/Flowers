package by.litelife.flowers.entity;


import by.litelife.flowers.exceptions.AccessoryException;

public class Accessory {
    private String name;
    private int price;
    private String color;

    public Accessory(String name, int price, String color) throws AccessoryException {
        this.name = name;

        if (price<0) {
            throw new AccessoryException("Price accessory less 0! Change the price.");
        }

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

    public void setPrice(int price) throws AccessoryException {
        if (price<0) {
            throw new AccessoryException("Price accessory less 0! Change the price.");
        }
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
