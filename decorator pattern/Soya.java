public class Soya extends CondimentDecorator {
	Beverage beverage;

	public Soya(Beverage beverage) {
		this.beverage = beverage;
	}

	public String getDescription() {
		return beverage.getDescription() + ", Soya";
	}

	public double cost() {
		return beverage.cost() + 0.1;
	}
}