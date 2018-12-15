public class ThreadTestDrive {
	public static void main(String[] args) {
		RunnableDemo r1 = new RunnableDemo("akar");
		RunnableDemo r2 = new RunnableDemo("benalu");
		r1.mulai();
		r2.mulai();
	}
}