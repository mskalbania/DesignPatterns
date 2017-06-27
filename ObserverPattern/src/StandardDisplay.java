import java.util.Observable;
import java.util.Observer;

public class StandardDisplay implements Observer, Display {

    private WeatherData weatherData;
    private WeatherConditions weatherConditions;

    public StandardDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.addObserver(this);
    }

    @Override
    public void display() {
        System.out.println("T : " + weatherConditions.getTemperature() +
                "P : " + weatherConditions.getPressure() +
                "H : " + weatherConditions.getHumidity());
    }

    @Override
    public void update(Observable observable, Object o) {
        this.weatherConditions = ((WeatherConditions) o);
        display();
    }
}
