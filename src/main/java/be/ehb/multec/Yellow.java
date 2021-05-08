package be.ehb.multec;

import java.awt.*;

public class Yellow extends ColorDecorator{

    public Yellow(Lamp lamp) {
        super(lamp);
        color=new Color(255,255,0);
    }

    public String getDescription() {
        return super.getDescription() + ",Yellow";
    }

    @Override
    protected Color color(){
        return color;
    }

}
