package be.ehb.multec;

import be.ehb.multec.decorator.*;
import org.junit.Test;
import static org.junit.Assert.*;


public class LampTest {

    @Test
    public void lampBlue(){
        Lamp lamp=new HallogenLamp();
        lamp=new Blue(lamp);
        assertEquals("color[0, 0, 255]",lamp.toString());
        assertEquals("Hallogen Lamp,Blue",lamp.getDescription());
    }

    @Test
    public void lampGreen(){
        Lamp lamp=new HallogenLamp();
        lamp=new Green(lamp);
        assertEquals("color[0, 255, 0]",lamp.toString());
        assertEquals("Hallogen Lamp,Green",lamp.getDescription());
    }
    @Test
    public void lampRed(){
        Lamp lamp=new HallogenLamp();
        lamp=new Red(lamp);
        assertEquals("color[255, 0, 0]",lamp.toString());
        assertEquals("Hallogen Lamp,Red",lamp.getDescription());
    }

    @Test
    public void lampYellow(){
        Lamp lamp=new HallogenLamp();
        lamp=new Yellow(lamp);
        assertEquals("color[255, 255, 0]",lamp.toString());
        assertEquals("Hallogen Lamp,Yellow",lamp.getDescription());
    }

    @Test
    public void allColors(){
        Lamp lamp=new HallogenLamp();
        lamp=new Red(lamp);
        lamp=new Green(lamp);
        lamp=new Blue(lamp);
        lamp=new Yellow(lamp);
        assertEquals("color[255, 255, 0]",lamp.toString());
        assertEquals("Hallogen Lamp,Red,Green,Blue,Yellow",lamp.getDescription());
    }




}