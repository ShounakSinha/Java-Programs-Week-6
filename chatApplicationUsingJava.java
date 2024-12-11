class MessageReceiver extends Thread {
    public void run() {
        while (true) {
            System.out.println("New message received!");
            try { Thread.sleep(2000); } catch (InterruptedException e) { }
        }
    }
}

class MessageSender extends Thread {
    public void run() {
        System.out.println("You can type and send messages.");
    }
}

public class ChatApp {
    public static void main(String[] args) {
        MessageReceiver receiver = new MessageReceiver();
        MessageSender sender = new MessageSender();
        receiver.start();
        sender.start();
    }
}

