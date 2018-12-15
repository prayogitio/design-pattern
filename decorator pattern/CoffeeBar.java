public class CoffeeBar {
	public static void main(String[] args) {
		Beverage beverage = new Expresso();
		beverage = new Mocha(beverage);
		beverage = new Whip(beverage);
		beverage = new Soya(beverage);

		System.out.println("The cost for " + beverage.getDescription() + " $" + beverage.cost());

		Beverage beverage2 = new Tea();
		beverage2 = new Soya(beverage2);

		System.out.println("The cost for " + beverage2.getDescription() + " $" + beverage2.cost());
	}
}