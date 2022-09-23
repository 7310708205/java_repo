class multiThreading1 implements Runnable {
    public void run()
    {
        try {
            System.out.println("Thread " + Thread.currentThread().getId() + " is running");
        }
        catch (Exception e) {
            System.out.println("Exception occurred");
        }
    }
}

public class MultiThreadingInterface {
    public static void main(String[] args)
    {
        int num=10;
        for (int i = 0; i < num; i++) {
            Thread thread = new Thread(new multiThreading1());
            thread.start();
        }
    }
}
