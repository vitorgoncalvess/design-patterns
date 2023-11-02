import elements.CurrentConditionsDisplay;
import elements.ForecastDisplay;
import elements.StatisticsDisplay;
import elements.WeatherData;

public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);

        weatherData.setMeasurements(28.0, 65.0, 30.4);
        weatherData.setMeasurements(24.0, 70.0, 29.2);
        weatherData.setMeasurements(32.0, 65.0, 23.5);

    }
}