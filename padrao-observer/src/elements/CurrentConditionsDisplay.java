package elements;

import interfaces.DisplayElement;
import interfaces.Subject;

import java.util.Observable;
import java.util.Observer;

import static java.lang.StringTemplate.STR;

public class CurrentConditionsDisplay implements Observer, DisplayElement {

    private Observable observable;

    private Double temperature;

    private Double humidity;

    private Subject weatherData;

    public CurrentConditionsDisplay(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    @Override
    public void update(Observable obs, Object arg) {
        if (obs instanceof WeatherData weatherData) {
            this.temperature = weatherData.getTemperatura();
            this.humidity = weatherData.getUmidade();
            display();
        }
    }

    @Override
    public void display() {
        System.out.println(STR."Condições Atuais: \{temperature} C graus e \{humidity}% de humidade");
    }
}
