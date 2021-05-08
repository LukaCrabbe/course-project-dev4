package command;

import command.Command;
import command.Device;

public class TvVolUp implements Command {

    Device device;

    public TvVolUp (Device newDevice){

        device = newDevice;
    }

    @Override
    public void execute() {
        device.volUp();

    }
}
