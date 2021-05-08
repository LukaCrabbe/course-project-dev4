package be.ehb.multec;

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
    protected Color color(){
        return color;
    }


}
