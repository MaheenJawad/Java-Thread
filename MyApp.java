public class MyApp {
    public static void main(String[] args) {
        Checker checker = new Checker();

        ThreadedCheck[] threads = {
                new ThreadedCheck(2, checker),
                new ThreadedCheck(4, checker),
                new ThreadedCheck(3, checker),
                new ThreadedCheck(7, checker)
        };

        startAndJoinThreads(threads);

        System.out.println("All checks completed.");
    }

    private static void startAndJoinThreads(Thread... threads) {
        for (Thread thread : threads) {
            thread.start();
        }
        for (Thread thread : threads) {
            try {
                thread.join();
            } catch (InterruptedException e) {
                System.out.println("Main thread interrupted: " + e.getMessage());
            }
        }
    }
}