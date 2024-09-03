package threads.exercise01;

public class Task3 implements Runnable {

    @Override
    public void run() {
        for (int i = 10; i < 20; i++) {

            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(i);
        }
    }
}
