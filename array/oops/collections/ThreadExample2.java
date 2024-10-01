package array.oops.collections;

class MyRunnable implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName() + " - Count: " + i);
            try {
                Thread.sleep(500); // Sleep for 500 milliseconds
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

public class ThreadExample2 {
    public static void main(String[] args) throws InterruptedException {
        MyRunnable newRun = new MyRunnable();

        // Create threads
        Thread t1 = new Thread(newRun);
        Thread t2 = new Thread(newRun);

        // Set priorities
        t2.setPriority(Thread.MAX_PRIORITY); // Highest priority for t2
        t1.setPriority(Thread.MIN_PRIORITY); // Lowest priority for t1

        // Start threads
        t2.start(); // Start the second thread first
        t2.join();
        t1.start(); // Start the first thread

        // Output thread status
        System.out.println("Active threads: " + Thread.activeCount());
        System.out.println("Is t1 alive? " + t1.isAlive());
        System.out.println("Is t2 alive? " + t2.isAlive());

        // Output current thread and t2 priority
        System.out.println("Current thread priority: " + Thread.currentThread().getPriority());
        System.out.println("t2 priority: " + t2.getPriority());
    }
}
