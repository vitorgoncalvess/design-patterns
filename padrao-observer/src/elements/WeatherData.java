package elements;

import java.util.Observable;

public class WeatherData extends Observable {

    private Double temperatura;

    private Double umidade;

    private Double pressao;

    public WeatherData() {
    }

    public void measurementsChanged() {
        setChanged();
        notifyObservers();
    }

    public void setMeasurements(Double temp, Double humidity, Double pressure) {
        this.temperatura = temp;
        this.umidade = humidity;
        this.pressao = pressure;
        measurementsChanged();
    }

    public Double getTemperatura() {
        return temperatura;
    }

    public Double getUmidade() {
        return umidade;
    }

    public Double getPressao() {
        return pressao;
    }

}
