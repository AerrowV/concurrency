package threads.exercise01;

public class Task1 implements Runnable {

    @Override
    public void run() {
        long sum = 0;
        for (int i = 0; i < 1000000000; i++) {
            sum += i;

        }
        System.out.println(sum);
    }
}
