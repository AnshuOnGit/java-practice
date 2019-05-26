package anshu.goes.crazy.on.concurrency;

import java.util.Arrays;

public class Indeterministic {

	public Thread[] execute(int noOfThreads) {
		Thread[] threads = new Thread[noOfThreads];
		for (int i = 0; i < noOfThreads; i++) {
			Runnable runnable;

			runnable = new Runnable() {
				@Override
				public void run() {
					int resourceVal = Resource.INSTANCE.getValue();
					Resource.INSTANCE.setValue(resourceVal + 100);
				}
			};
			Thread thread = new Thread(runnable);
			thread.start();
			threads[i] = thread;
		}
		return threads;
	}

	public static void main(String args[]) {

		Indeterministic idm = new Indeterministic();
		Thread[] threads = idm.execute(10);
		/*
		 * Arrays.stream(threads).forEach(thread -> { try { thread.join(); } catch
		 * (InterruptedException e) { // TODO Auto-generated catch block
		 * e.printStackTrace(); } });
		 */
		System.out.println(Resource.INSTANCE.getValue());
	}

}
