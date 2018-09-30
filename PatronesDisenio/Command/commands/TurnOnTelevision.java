package command.examples.devices.commands;

import command.examples.devices.devices.ElectronicDevice;


public class TurnOnTelevision implements Command {

    private ElectronicDevice device;

    public TurnOnTelevision(ElectronicDevice device){
        this.device = device;
    }

    @Override
    public void execute() {
        device.on();
    }

    @Override
    public void undo() {
        device.off();
    }
}
