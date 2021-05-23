package command;

public class TvControler {

    public static Device getDevice(){

        return new TvReciever();
    }
    public static String recieved(){
        return "connection made";
    }


}
