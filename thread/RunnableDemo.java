public class RunnableDemo implements Runnable {
	private Thread t;
	private String tname;

	public RunnableDemo(String tname) {
		this.tname = tname;
		System.out.println("Creating " + tname);
	}

	public void run() {
		System.out.println("Running " + tname);
		for (int i = 0; i < 5; i++) {
			System.out.println("Thread " + tname + "-" + i);
		}
		System.out.println("Exiting " + tname);
	}

	public void mulai() {
		System.out.println("Starting " + tname);
		if (t == null) {
			t = new Thread(this, tname);
			t.start();
		}
	}
}