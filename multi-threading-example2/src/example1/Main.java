package src.example1;


public class Main {
    public static void main(String[] args) {
        Thread thread = new newThread();
        thread.start();
    }

    private static class newThread extends Thread {
        @Override
        public void run(){
            //Code that executes on this thread
            System.out.println("Hello from " + Thread.currentThread().getName());
        }
    }
}
