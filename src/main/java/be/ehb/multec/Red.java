package be.ehb.multec;

import java.awt.*;

public class Red extends ColorDecorator{

    public Red(Lamp lamp) {
        super(lamp);
        color=new Color(255,0,0);
    }

    public String getDescription() {
        return super.getDescription() + ",Red";
    }

    @Override
    protected Color color(){
        return color;
    }
    
}
