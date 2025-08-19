import java.util.Random;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int score = 0;

        while (true) {
            int number = rand.nextInt(100) + 1;
            int attempts = 0, maxAttempts = 7;
            boolean guessed = false;

            System.out.println("Guess the number between 1 and 100!");
            while (attempts < maxAttempts && !guessed) {
                System.out.print("Enter your guess: ");
                int guess = sc.nextInt();
                attempts++;

                if (guess == number) {
                    System.out.println("Correct! You guessed in " + attempts + " attempts.");
                    score++;
                    guessed = true;
                } else if (guess < number) {
                    System.out.println("Too low!");
                } else {
                    System.out.println("Too high!");
                }
            }
            if (!guessed) {
                System.out.println("Out of attempts! The number was: " + number);
            }

            System.out.print("Play another round? (yes/no): ");
            String playAgain = sc.next().toLowerCase();
            if (!playAgain.equals("yes")) {
                break;
            }
        }
        System.out.println("Game over! Rounds won: " + score);
        sc.close();
    }
}
