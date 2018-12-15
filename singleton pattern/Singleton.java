public class Singleton {
	public static Singleton uniqueInstance = new Singleton();

	private Singleton() {}

	public static Singleton getInstance() {
		return uniqueInstance;
	}
}