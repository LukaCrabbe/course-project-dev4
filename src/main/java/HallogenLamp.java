import java.awt.*;

public class HallogenLamp extends Lamp{

    public HallogenLamp() {
        setDescription("Hallogen Lamp");
        color=new Color(255,255,255);
    }


    @Override
    public Color color() {
        return color;
    }

}
