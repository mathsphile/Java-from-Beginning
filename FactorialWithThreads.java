import java.math.BigInteger;
import java.util.Scanner;

public class FactorialWithThreads {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
       
        int number = sc.nextInt();

        BigInteger factorialResult = calculateFactorial(number);

        System.out.println("Factorial of " + number + " is: " + factorialResult);

        // Convert the factorial result to a string to get individual digits
        String resultString = factorialResult.toString();

        // Create and start a thread for each digit in the result
        for (int i = 0; i < resultString.length(); i++) {
            char digit = resultString.charAt(i);
            Thread digitThread = new Thread(new DigitPrinter(digit));
            digitThread.start();

            try {
                // Wait for the current thread to finish before starting the next one
                digitThread.join();
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted: " + e.getMessage());
            }
        }
    }

    // Method to calculate factorial of a number
    public static BigInteger calculateFactorial(int n) {
        BigInteger result = BigInteger.ONE;

        for (int i = 2; i <= n; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }

        return result;
    }
}

// Runnable class to print a digit
class DigitPrinter implements Runnable {
    private char digit;

    public DigitPrinter(char digit) {
        this.digit = digit;
    }

    @Override
    public void run() {
        System.out.print(digit + " ");
    }
}
