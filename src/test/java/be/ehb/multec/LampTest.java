package be.ehb.multec;

import org.junit.Test;

import static org.junit.Assert.*;

public class LampTest {

    @Test
    public void lampColor(){
        Lamp lamp=new HallogenLamp();
        lamp=new Blue(lamp);
        lamp=new Yellow(lamp);
        lamp=new Red(lamp);
        lamp=new Green(lamp);
        System.out.println(lamp.getDescription()+lamp.color());
    }





}