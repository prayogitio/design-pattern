public class PontianakPizzaStore extends PizzaStore {
	public Pizza createPizza(String type) {
		if (type.equals("cheese")) {
			return new PontianakCheesePizza();
		} else if (type.equals("coffee")) {
			return new PontianakCoffeePizza();
		} else {
			return null;
		}
	}
}