package by.litelife.flowers.entity.flower;

/**
 * Created by Иван on 08.08.2016.
 */
abstract public class AbstractFlower {
    private String color;
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public AbstractFlower(String color, String name) {

        this.color = color;
        this.name = name;
    }
}
