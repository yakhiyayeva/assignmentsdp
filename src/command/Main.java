package command;

public class Main {
    public static void main(String[] args) {
        // Create devices
        TV tv = new TV();
        Stereo stereo = new Stereo();
        Light light = new Light();

        // Create commands
        Command tvOn = new TurnTVOn(tv);
        Command tvOff = new TurnTVOff(tv);
        Command setStereoVolume = new SetVolume(stereo, 15);
        Command dimLights = new DimLights(light, 50);

        // Create remote control with 3 slots
        RemoteControl remote = new RemoteControl(3);

        // Assign commands to the remote slots
        remote.setCommand(0, tvOn, tvOff);
        remote.setCommand(1, setStereoVolume, null);
        remote.setCommand(2, dimLights, null);

        // Use the remote
        System.out.println("Pressing TV On button:");
        remote.pressOnButton(0);

        System.out.println("\nPressing TV Off button:");
        remote.pressOffButton(0);

        System.out.println("\nPressing undo button:");
        remote.pressUndoButton();

        System.out.println("\nPressing Stereo volume button:");
        remote.pressOnButton(1);

        System.out.println("\nPressing Lights dim button:");
        remote.pressOnButton(2);

        System.out.println("\nPressing undo button:");
        remote.pressUndoButton();
    }
}

