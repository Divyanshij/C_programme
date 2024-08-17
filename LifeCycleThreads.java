public class LifeCycleThreads {

    public static void main(String[] args) {
        Thread th = new Thread(new MyRunnable());
        System.out.println("Thread state: " + th.getState());
        th.start();

        System.out.println("Thread state: " + th.getState());
    }
}
class MyRunnable implements Runnable {
    @Override
    public void run() {

        System.out.println("Thread state: " + Thread.currentThread().getState());
    }
}