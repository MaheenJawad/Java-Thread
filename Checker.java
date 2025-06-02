public class Checker {
    public void checkNumber(int number) {
        System.out.println("Checking number: " + number);
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted: " + e.getMessage());
        }
        if (number % 2 == 0) {
            System.out.println(number + " is Even");
        } else {
            System.out.println(number + " is Odd");
        }
    }
}