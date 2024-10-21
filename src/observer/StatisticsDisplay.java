package observer;

public class StatisticsDisplay implements WeatherDisplay {
    private double totalTemperature;
    private int readings;

    @Override
    public void update(double temperature, double humidity, double pressure) {
        totalTemperature += temperature;
        readings++;
        double avgTemperature = totalTemperature / readings;
        System.out.println("Statistics: Avg Temperature = " + avgTemperature + "°C");
    }
}

