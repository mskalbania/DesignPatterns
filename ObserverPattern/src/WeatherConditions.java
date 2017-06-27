public class WeatherConditions {

    private double temperature;
    private double pressure;
    private double humidity;

    public WeatherConditions(double temperature, double pressure, double humidity) {
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;
    }

    public double getTemperature() {
        return temperature;
    }

    public double getPressure() {
        return pressure;
    }

    public double getHumidity() {
        return humidity;
    }

    public static WeatherConditionsBuilder build(){
        return new WeatherConditionsBuilder();
    }

}
