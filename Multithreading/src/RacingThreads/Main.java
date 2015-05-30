package RacingThreads;

public class Main {
    public static int counter = 0;
    public static Object obj = new Object();

    public static void main(String[] args) throws InterruptedException {
        Thread A = new Thread(new Runnable() {

            @Override
            public void run() {
                synchronized (obj) {
                    for (int i = 0; i < 2_000_000; i++) {
                        counter++;
                    }

                }

            }
        });
        Thread B = new Thread(new Runnable() {

            @Override
            public void run() {
                synchronized (obj) {
                    for (int i = 0; i < 2_000_000; i++) {
                        counter++;
                    }

                }

            }
        });
        long start = System.currentTimeMillis();

        A.start();
        A.join();
        B.start();
        B.join();

        long stop = System.currentTimeMillis();
        System.out.println(stop - start);
        System.out.println(counter);
    }

}
