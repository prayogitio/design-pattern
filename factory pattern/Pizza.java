public abstract class Pizza {
	String name;

	void prepare() {
		System.out.println("Preparing " + name);
	}

	void bake() {
		System.out.println("baking pizza ...");
	}

	void cut() {
		System.out.println("cutting pizza into slices ...");
	}

	void box() {
		System.out.println("store pizza in box ...");
	}

	public String getName() {
		return this.name;
	}
}