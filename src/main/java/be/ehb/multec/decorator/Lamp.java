package be.ehb.multec.decorator;

import java.awt.*;

public abstract class Lamp {

    private String description;
    public Color color;



    public void setDescription(String description){
        this.description=description;
    }

    public String getDescription() {
        return description;
    }

    public abstract Color color();

    @Override
    public String toString() {
        return "color[" + color.getRed() + ", " + color.getGreen() + ", " + color.getBlue() + "]";
    }

}
