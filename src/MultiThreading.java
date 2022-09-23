class MultiThread extends Thread{
    public void run() {
        try {
            System.out.println("Thread " + Thread.currentThread().getId() + " is running");
        }
        catch (Exception e) {
            System.out.println("Exception occurred");
        }
    }
}

public class MultiThreading {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            MultiThread thread= new MultiThread();
            thread.start();
        }
    }
}
