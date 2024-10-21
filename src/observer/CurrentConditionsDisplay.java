package observer;

public class CurrentConditionsDisplay implements WeatherDisplay {
    @Override
    public void update(double temperature, double humidity, double pressure) {
        System.out.println("Current Conditions: Temperature = " + temperature + "°C, Humidity = " + humidity + "%, Pressure = " + pressure + " hPa");
    }
}

