package threads.exercise02;

public class ThreadExercise02 {

    public static void main(String[] args) throws InterruptedException {
        WorkerCancelable worker = new WorkerCancelable();
        Thread t = new Thread(worker);

        t.start();
        Thread.sleep(4000);
        worker.cancel();
        System.out.println("DONE");




    }
}

