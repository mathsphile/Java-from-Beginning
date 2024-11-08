import java.util.Scanner;

public class VowelConsonantCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the string from user input
        System.out.print("Enter a string: ");
        String input = scanner.nextLine().toLowerCase();

        // Create thread for counting vowels
        VowelCounter vowelCounter = new VowelCounter(input);
        Thread vowelThread = new Thread(vowelCounter);

        // Create thread for counting consonants
        ConsonantCounter consonantCounter = new ConsonantCounter(input);
        Thread consonantThread = new Thread(consonantCounter);

        // Start both threads
        vowelThread.start();
        consonantThread.start();

        // Wait for both threads to complete
        try {
            vowelThread.join();
            consonantThread.join();
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted: " + e.getMessage());
        }

        // Display the results
        System.out.println("Number of vowels: " + vowelCounter.getVowelCount());
        System.out.println("Number of consonants: " + consonantCounter.getConsonantCount());
    }
}

// Thread class to count vowels
class VowelCounter implements Runnable {
    private String input;
    private int vowelCount = 0;

    public VowelCounter(String input) {
        this.input = input;
    }

    @Override
    public void run() {
        for (char c : input.toCharArray()) {
            if ("aeiou".indexOf(c) != -1) { // Check if the character is a vowel
                vowelCount++;
            }
        }
    }

    public int getVowelCount() {
        return vowelCount;
    }
}

// Thread class to count consonants
class ConsonantCounter implements Runnable {
    private String input;
    private int consonantCount = 0;

    public ConsonantCounter(String input) {
        this.input = input;
    }

    @Override
    public void run() {
        for (char c : input.toCharArray()) {
            if (Character.isLetter(c) && "aeiou".indexOf(c) == -1) { // Check if the character is a consonant
                consonantCount++;
            }
        }
    }

    public int getConsonantCount() {
        return consonantCount;
    }
}
