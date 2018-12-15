public class NoCommand implements Command {
	public NoCommand() {}

	public void execute() {
		System.out.println("no functionality");
	}

	public void undo() {}
}