public class WeatherStation {
	public static void main(String[] args) {
		WeatherData weatherData = new WeatherData();
		CurrentConditionDisplay currentDisplay = new CurrentConditionDisplay(weatherData);
		AnotherDisplay anotherDisplay = new AnotherDisplay(weatherData);

		weatherData.setMeasurements(10, 20, 30);
		weatherData.setMeasurements(40, 50, 60);
		weatherData.removeObserver(anotherDisplay);
		weatherData.setMeasurements(80, 70, 90);
	}
}