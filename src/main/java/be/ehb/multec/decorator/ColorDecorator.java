package be.ehb.multec;

import java.awt.*;

public abstract class ColorDecorator extends Lamp{

    protected Lamp lamp;

    protected ColorDecorator(Lamp lamp) {
        this.lamp=lamp;
    }

    protected Color color(){
        return lamp.color;
    }

    public String getDescription(){
        return lamp.getDescription();
    }

}
