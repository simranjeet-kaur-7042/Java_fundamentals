//Experiment 20 :Write a program to declare a volatile variable and explain its use in multithreading.

class SharedResource {
    volatile boolean flag = true;
}

public class Exp_20 {
    public static void main(String[] args) throws InterruptedException {
        SharedResource resource = new SharedResource();
        Thread t1 = new Thread(() -> {
            System.out.println("Thread started.");
            while (resource.flag) {
            }
            System.out.println("Thread stopped.");
        });

        t1.start();
        Thread.sleep(1000);
        resource.flag = false;
        System.out.println("Main thread changed flag to false.");
    }
}
