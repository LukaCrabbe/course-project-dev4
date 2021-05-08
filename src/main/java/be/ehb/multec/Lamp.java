package be.ehb.multec;

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

    protected abstract Color color();

}
