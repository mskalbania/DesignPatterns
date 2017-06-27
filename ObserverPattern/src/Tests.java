public class Tests {
    public static void main(String[] args) throws InterruptedException {

        WeatherData data = new WeatherData();
        //ALL THREE DISPLAYS ARE BEING NOTIFIED WHEN WEATHER IS CHANGED
        Display display1 = new StandardDisplay(data);
        Display display2 = new StandardDisplay(data);
        Display display3 = new StandardDisplay(data);

        WeatherConditions w1 = WeatherConditions.build()
                .withTemperature(50d)
                .withHumidity(200d)
                .withPressure(1500d)
                .get();

        WeatherConditions w2 = WeatherConditions.build()
                .withTemperature(200d)
                .get();

        WeatherConditions w3 = WeatherConditions.build()
                .withPressure(123d)
                .withHumidity(500d)
                .get();

        data.setWeatherConditions(w1);

        Thread.sleep(2000);

        data.setWeatherConditions(w2);

        Thread.sleep(2000);

        data.setWeatherConditions(w3);


    }
}
