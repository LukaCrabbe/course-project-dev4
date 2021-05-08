package be.ehb.multec;

import java.awt.*;

public class HallogenLamp extends Lamp{

    public HallogenLamp() {
        setDescription("Hallogen Lamp");
        color=new Color(255,255,255);
    }


    @Override
    protected Color color() {
        return color;
    }

}
