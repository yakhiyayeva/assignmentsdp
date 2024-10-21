package command;

public class DimLights implements Command {
    private Light light;
    private int previousBrightness;
    private int brightness;

    public DimLights(Light light, int brightness) {
        this.light = light;
        this.brightness = brightness;
    }

    @Override
    public void execute() {
        previousBrightness = light.getBrightness();
        light.dim(brightness);
    }

    @Override
    public void undo() {
        light.dim(previousBrightness);
    }
}

