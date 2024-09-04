package executors.exercise02;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {

        ExecutorService exec1 = Executors.newSingleThreadExecutor();

        Task1 task1 = new Task1();
        Task2 task2 = new Task2();
        Task3 task3 = new Task3();

        exec1.submit(task1);
        exec1.submit(task2);
        exec1.submit(task3);

    }
}