import java.util.Observable;

public class WeatherData extends Observable {

    private WeatherConditions weatherConditions;

    public void setWeatherConditions(WeatherConditions weatherConditions) {
        setChanged();
        notifyObservers(weatherConditions);
    }


}
