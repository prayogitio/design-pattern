public class DuckSimulator {
	public static void main(String[] args) {
		WildTurkey turkey = new WildTurkey();
		DuckInterface duckThree = new TurkeyAdapter(turkey);
		duckThree.quack();
		duckThree.fly();
	}
}