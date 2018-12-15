public class ModelDuck extends Duck {
	public ModelDuck() {
		flyBehavior = new FlyWithWings();
		quackBehavior = new QuackNoWay();
	}

	public void display() {
		System.out.println("I am model duck ...\n");
	}
}