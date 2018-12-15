public class PizzaStoreTestDrive {
	public static void main(String[] args) {
		PizzaStore store = new PontianakPizzaStore();
		Pizza pizza = store.orderPizza("cheese");
		System.out.println("You ordered " + pizza.getName());

		Pizza pizza2 = store.orderPizza("coffee");
		System.out.println("You ordered again " + pizza2.getName());
	}
}