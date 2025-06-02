class ThreadedCheck extends Thread {
    private final int number;
    private final Checker checker;

    ThreadedCheck(int number, Checker checker) {
        this.number = number;
        this.checker = checker;
        this.setName("Thread-" + number);
    }

    @Override
    public void run() {
        checker.checkNumber(number);
    }
}
