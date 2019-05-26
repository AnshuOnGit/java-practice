package anshu.goes.crazy.on.concurrency;

import java.util.Arrays;
import java.util.concurrent.Semaphore;

public class ProducerConsumerProblem {

    private static Semaphore semaphore = new Semaphore(1);

	public static void main(String[] args) throws InterruptedException {

		Thread[] producers = new Thread[10];

		for (int i = 0; i < 10; i++) {
			Thread producer = new Thread(new Runnable() {

				@Override
				public void run() {
					
					  try { semaphore.acquire(); } catch (InterruptedException e) { e.printStackTrace(); }					 
					int value = Resource.INSTANCE.getValue();
					Resource.INSTANCE.setValue(value + 20);
                    semaphore.release();
				}
			});
			producers[i] = producer;

		}

		Thread[] consumers = new Thread[10];
		for (int i = 0; i < 10; i++) {
			Thread consumer = new Thread(new Runnable() {

				@Override
				public void run() {
					
					try { semaphore.acquire(); } catch (InterruptedException e) {e.printStackTrace(); }
					int value = Resource.INSTANCE.getValue();
					Resource.INSTANCE.setValue(value - 10);
                   semaphore.release();
				}
			});
			consumers[i] = consumer;
		}

	    Arrays.stream(producers).forEach(producer -> producer.start());
	    Arrays.stream(consumers).forEach(producer -> producer.start());

		if (Arrays.stream(producers).anyMatch(producer -> producer.isAlive()) || Arrays.stream(consumers).anyMatch(producer -> producer.isAlive())) {
			Thread.sleep(1000);
		}
		System.out.println(Resource.INSTANCE.getValue());
	}

}
