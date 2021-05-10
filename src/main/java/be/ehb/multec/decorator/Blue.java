package be.ehb.multec.decorator;

import java.awt.*;

public class Blue extends ColorDecorator{

    public Blue(Lamp lamp) {
        super(lamp);
        color=new Color(0,0,255);
    }


    public String getDescription() {
        return super.getDescription() + ",Blue";
    }

    @Override
    public Color color(){
        return color;
    }


}
