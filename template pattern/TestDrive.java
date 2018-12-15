public class TestDrive {
	public static void main(String[] args) {
		CaffeineBeverage drink1 = new Tea();
		CaffeineBeverage drink2 = new Coffee();

		drink1.prepareRecipe();
		drink2.prepareRecipe();
	}
}