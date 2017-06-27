public class WeatherConditionsBuilder {

    private double temperature;
    private double pressure;
    private double humidity;

    public WeatherConditionsBuilder withTemperature(double t) {
        this.temperature = t;
        return this;
    }

    public WeatherConditionsBuilder withPressure(double p) {
        this.pressure = p;
        return this;
    }

    public WeatherConditionsBuilder withHumidity(double h) {
        this.humidity = h;
        return this;
    }

    public WeatherConditions get() {
        return new WeatherConditions(temperature, pressure, humidity);
    }
}
