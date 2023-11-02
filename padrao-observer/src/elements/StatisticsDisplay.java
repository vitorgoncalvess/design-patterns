package elements;

import interfaces.DisplayElement;
import interfaces.Observer;
import interfaces.Subject;

public class StatisticsDisplay implements Observer, DisplayElement {

    private Double temperatura;

    private Double prevTemperatura;

    private Subject weatherData;

    public StatisticsDisplay(Subject weatherData) {
        this.temperatura = 0.00;
        this.prevTemperatura = 0.00;
        this.weatherData = weatherData;
        weatherData.addObserver(this);
    }

    @Override
    public void update(Double temp, Double humidity, Double pressure) {
        this.prevTemperatura = this.temperatura;
        this.temperatura = temp;
        display();
    }

    @Override
    public void display() {
        System.out.println(STR."\{((temperatura - prevTemperatura) / temperatura) * 100}% de diferença na temperatura atual para a antiga");
    }
}
