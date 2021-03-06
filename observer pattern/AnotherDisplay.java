public class AnotherDisplay implements Observer, DisplayElement {
	private float temperature;
	private float pressure;
	private float humidity;
	private Subject weatherData;

	public AnotherDisplay(Subject weatherData) {
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}

	public void update(float temperature, float pressure, float humidity) {
		this.temperature = temperature;
		this.pressure = pressure;
		this.humidity = humidity;
		display();
	}

	public void display() {
		System.out.println("Another conditions: " + temperature + "F degrees and " + humidity + "% humidity and " + pressure + " pressure");
	}
}