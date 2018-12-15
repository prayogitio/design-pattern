public abstract class CaffeineBeverage {
	public void prepareRecipe() {
		boilWater();
		brew();
		pourInCup();
		addCondiments();
	}

	public void boilWater() {
		System.out.println("Boiling water");
	}

	public void pourInCup() {
		System.out.println("Pour into cup");
	}

	public abstract void brew();

	public abstract void addCondiments();
}