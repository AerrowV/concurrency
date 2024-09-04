package executors.exercise02;

public class Task3 implements Runnable {

    private boolean running = true;

    @Override
    public void run() {
        for (int i = 10; running; i++) {
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(i);
        }
    }
    public void cancel(){
        running = false;
    }
}
