package observer;

public class ForecastDisplay implements WeatherDisplay {
    private double lastPressure;

    @Override
    public void update(double temperature, double humidity, double pressure) {
        String forecast;
        if (pressure > lastPressure) {
            forecast = "Improving weather on the way!";
        } else if (pressure == lastPressure) {
            forecast = "More of the same.";
        } else {
            forecast = "Watch out for cooler, rainy weather.";
        }
        lastPressure = pressure;
        System.out.println("Forecast: " + forecast);
    }
}

