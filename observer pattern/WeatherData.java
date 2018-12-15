import java.util.ArrayList;

public class WeatherData implements Subject {
	private ArrayList observers;
	private float temperature;
	private float pressure;
	private float humidity;

	public WeatherData() {
		observers = new ArrayList();
	}

	public void registerObserver(Observer o) {
		observers.add(o);
	}

	public void removeObserver(Observer o) {
		int i = observers.indexOf(o);
		if (i >= 0) {
			observers.remove(i);
		}
	}

	public void notifyObservers() {
		int totalObservers = observers.size();
		for (int i = 0; i < totalObservers; i++) {
			Observer observer = (Observer) observers.get(i);
			observer.update(temperature, pressure, humidity);
		}
	}

	public void measurementsChanged() {
		notifyObservers();
	}

	public void setMeasurements(float temperature, float pressure, float humidity) {
		this.temperature = temperature;
		this.pressure = pressure;
		this.humidity = humidity;
		measurementsChanged();
	}
}