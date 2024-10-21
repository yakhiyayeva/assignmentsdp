package observer;

public class WeatherData {
    public static void main(String[] args) {
        WeatherStation weatherStation = new WeatherStation();

        // Create display devices
        CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay();
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay();
        ForecastDisplay forecastDisplay = new ForecastDisplay();

        // Register displays as observers
        weatherStation.registerObserver(currentDisplay);
        weatherStation.registerObserver(statisticsDisplay);
        weatherStation.registerObserver(forecastDisplay);

        // Simulate new weather data
        System.out.println("First update:");
        weatherStation.setWeatherData(25.0, 65.0, 1013.0);

        System.out.println("\nSecond update:");
        weatherStation.setWeatherData(22.5, 70.0, 1008.0);

        System.out.println("\nThird update:");
        weatherStation.setWeatherData(28.0, 60.0, 1010.0);
    }
}

