import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class QuizAppWithTimer {
    static boolean timeUp = false;

    // Question class
    static class Question {
        String question;
        String[] options;
        int correctAnswer;

        public Question(String question, String[] options, int correctAnswer) {
            this.question = question;
            this.options = options;
            this.correctAnswer = correctAnswer;
        }

        public boolean isCorrect(int answer) {
            return answer == correctAnswer;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Question[] questions = {
                new Question("What is the capital of France?",
                        new String[] { "1. Berlin", "2. Paris", "3. Madrid", "4. Rome" }, 2),
                new Question("Which planet is known as the Red Planet?",
                        new String[] { "1. Earth", "2. Mars", "3. Venus", "4. Jupiter" }, 2)
        };

        int score = 0;
        System.out.println("Welcome to the Java Quiz!");
        System.out.println("You have 10 seconds to answer each question.\n");

        for (Question q : questions) {
            System.out.println(q.question);
            for (String option : q.options) {
                System.out.println(option);
            }

            timeUp = false;

            Timer timer = new Timer();
            timer.schedule(new TimerTask() {
                public void run() {
                    timeUp = true;
                    System.out.println("\nTime's up!");
                }
            }, 10000); // 10 seconds

            int answer = -1;
            if (scanner.hasNextInt()) {
                answer = scanner.nextInt();
            }

            timer.cancel();

            if (!timeUp && q.isCorrect(answer)) {
                System.out.println("Correct!\n");
                score++;
            } else if (timeUp) {
                System.out.println("You ran out of time!\n");
            } else {
                System.out.println("Wrong answer!\n");
            }
        }

        System.out.println("Your final score: " + score + "/" + questions.length);
        scanner.close();
    }
}
