package elements;

import interfaces.DisplayElement;
import interfaces.Observer;
import interfaces.Subject;

public class ForecastDisplay implements Observer, DisplayElement {

    private Double temperatura;

    private Double prevTemperatura;

    private Subject weatherData;

    public ForecastDisplay(Subject weatherData) {
        this.temperatura = 0.00;
        this.prevTemperatura = 0.00;
        this.weatherData = weatherData;
        weatherData.addObserver(this);
    }

    @Override
    public void update(Double temp, Double humidity, Double pressure) {
        this.prevTemperatura = temp;
        this.temperatura = temp;
        display();
    }

    @Override
    public void display() {
        System.out.println(STR."Previsao para a proximo dado: \{temperatura * ((temperatura - prevTemperatura) / temperatura)} Graus");
    }

}
