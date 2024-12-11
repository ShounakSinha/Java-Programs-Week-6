class MyRunnable implements Runnable {
    public void run() {
        System.out.println("This thread is running!");
    }
}

public class Main {
    public static void main(String[] args) {
        MyRunnable myRunnable = new MyRunnable();
        Thread thread = new Thread(myRunnable); // Create a Thread object
        thread.start(); // Start the thread
        System.out.println("Main program is running!");
    }
}

