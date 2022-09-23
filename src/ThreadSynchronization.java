class MessageSender {
    public void send(String message) {
        System.out.println("Send the message" +message);

        try{
            Thread.sleep(1000);
        }
        catch(Exception e) {
            System.out.println("Exception occurred");
        }
    }
}

class ThreadSender extends Thread {
    final private String message;
    MessageSender messageSender;

    ThreadSender(String s, MessageSender ms) {
        message = s;
        messageSender = ms;
    }
    @Override
    public void run() {
        synchronized (messageSender) {
            messageSender.send(message);
        }
    }
}


public class ThreadSynchronization {
    public static void main(String[] args) {
        MessageSender message = new MessageSender();
        ThreadSender t1 = new ThreadSender("Sending thread 1", message);
        ThreadSender t2 = new ThreadSender("Sending thread 2", message);
        t1.start();
        t2.start();

        try{
            t1.join();
            t2.join();
        }
        catch(Exception e){
            System.out.println("Exception occurred");
        }

    }
}
