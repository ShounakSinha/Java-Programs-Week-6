class MyThread extends Thread {
    public void run() {
        System.out.println("This thread is running!");
    }
}

public class Main {
    public static void main(String[] args) {
        MyThread thread = new MyThread(); // Create a new thread
        thread.start(); // Start the thread
        System.out.println("Main program is running!");
    }
}

