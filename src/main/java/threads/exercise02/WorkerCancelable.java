package threads.exercise02;

class WorkerCancelable implements Runnable{
    boolean keepRunning = true;
    Thread thread;

    public void run() {
        int counter = 1;
        thread = Thread.currentThread();
        while(keepRunning){
            System.out.println("Hello (wait a second)");
            try {
                Thread.sleep(60000);
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted");
            }
            if (counter == 3) {
                cancel();
            }
            counter++;
        }
    }
    public void cancel() {
        keepRunning = false;
        thread.interrupt();
    }
}


