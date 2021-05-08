package command;

import command.Command;
import command.Device;

public class TvVolDown implements Command {

    Device device;

    public TvVolDown (Device newDevice){

        device = newDevice;
    }

    @Override
    public void execute() {
        device.volDown();

    }
}
