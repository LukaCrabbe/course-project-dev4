package command;

public class TvOff implements Command {

    Device device;

    public TvOff (Device newDevice){

        device = newDevice;
    }

    @Override
    public void execute() {
        device.tvOff();

    }
}
