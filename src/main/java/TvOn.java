public class TvOn implements Command {

    Device device;

    public TvOn (Device newDevice){

    device = newDevice;
}

    @Override
    public void execute() {
    device.tvOn();

    }
}
