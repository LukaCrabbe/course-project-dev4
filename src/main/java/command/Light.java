package command;

import command.Device;

public class Light implements Device {
    private int color = 0;



    @Override
    public void tvOn() {
        System.out.println("lamp is on");

    }

    @Override
    public void tvOff() {
        System.out.println("lamp is off");
    }


    @Override
    public void volUp() {
        color++;
        System.out.println("color = " + color);

    }

    @Override
    public void volDown() {
        color--;
        System.out.println("color = " + color);

    }

}
