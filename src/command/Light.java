package command;

public class Light {
    private int brightness;

    public void dim(int brightness) {
        this.brightness = brightness;
        System.out.println("Lights dimmed to " + brightness + "% brightness");
    }

    public int getBrightness() {
        return brightness;
    }
}
