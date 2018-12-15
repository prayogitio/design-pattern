public class DuckSimulator {
	public static void main(String[] args) {
		Duck duckOne = new ModelDuck();
		duckOne.performFly();
		duckOne.setFlyBehavior(new FlyNoWay());
		duckOne.performFly();
		duckOne.performQuack();
		duckOne.display();
		duckOne.swim();
		Duck duckTwo = new ModelDuck();
		duckTwo.setFlyBehavior(new FlyWithWings());
		duckTwo.setQuackBehavior(new QuackNormally());
		duckTwo.performFly();
		duckTwo.performQuack();
	}
}