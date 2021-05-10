package be.ehb.multec.decorator;

import java.awt.*;

public abstract class ColorDecorator extends Lamp{

    protected Lamp lamp;

    protected ColorDecorator(Lamp lamp) {
        this.lamp=lamp;
    }

    public Color color(){
        return lamp.color;
    }

    public String getDescription(){
        return lamp.getDescription();
    }

}
