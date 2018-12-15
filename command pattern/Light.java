public class Light {
	private String name;

	public Light(String name) {
		this.name = name;
	}

	public void on() {
		System.out.println("Lignt " + this.name + " is ON");
	}

	public void off() {
		System.out.println("Light " + this.name + " is OFF");
	}

	public String getName() {
		return this.name;
	}
}