package command;

public class PlayRemote {

    public static void main(String [] args){
        Device newDevice = TvControler.getDevice();

        TvOn onCommand = new TvOn(newDevice);

        TheButton onPressed = new TheButton(onCommand);

        onPressed.press();




        TvVolUp volUpCommand = new TvVolUp(newDevice);

        onPressed = new TheButton(volUpCommand);

        onPressed.press();
        onPressed.press();




    }
}
