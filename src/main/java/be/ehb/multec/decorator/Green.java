package be.ehb.multec.decorator;

import java.awt.*;

public class Green extends ColorDecorator{

    public Green(Lamp lamp) {
        super(lamp);
        color=new Color(0,255,0);
    }

    public String getDescription() {
        return super.getDescription() + ",Green";
    }

    @Override
    public Color color(){
        return color;
    }


}
