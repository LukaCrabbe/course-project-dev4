package command;

public class TvReciever implements Device {

    private int volume = 0;



    @Override
    public void tvOn() {
        System.out.println("tv is on");
    }

    @Override
    public void tvOff() {
        System.out.println("tv is off");
    }


    @Override
    public void volUp() {
        volume++;
        System.out.println("volume = " + volume);

    }

    @Override
    public void volDown() {
        volume--;
        System.out.println("volume = " + volume);

    }

    public static String recieved(){
        return "signal recieved";
    }


}
