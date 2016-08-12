package by.litelife.flowers.entity.flower;

/**
 * Created by Иван on 08.08.2016.
 */
public class WildFlowers extends AbstractFlower {
    private String soil;

    @Override
    public String toString() {
        return "WildFlowers{Name = "+getName()+" Color = "+getColor()+
                "Soil = " + soil+"}";
    }

    public String getsoil() {
        return soil;
    }

    public void setsoil(String soil) {
        this.soil = soil;
    }

    public WildFlowers(String color, String name, String soil) {

        super(color, name);
        this.soil = soil;
    }
}
