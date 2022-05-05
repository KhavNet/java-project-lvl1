package hexlet.code;

import java.util.Scanner;

public class Even {
    public static final int RIGHT_ATTEMPTS = 3;
    public static final int SCOPE_RANDOM_NUMBERS = 100;
    public static void isItParity(Scanner sc, String name) {
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        for (int i = 0; i < RIGHT_ATTEMPTS; i++) {
            int randomNumber = (int) (Math.random() * SCOPE_RANDOM_NUMBERS);
            System.out.println("Question: " + randomNumber);
            String key = sc.next();
            boolean rightAnswer1 = (key.equals("yes")) && (randomNumber % 2 == 0);
            boolean rightAnswer2 = (key.equals("no")) && (randomNumber % 2 != 0);
            if (rightAnswer1 || rightAnswer2) {
                System.out.println("Correct!");
            } else {
                String answerWas = randomNumber % 2 == 0 ? "'yes'" : "'no'";
                System.out.println("'" + key + "'" + " is wrong answer ;(. Correct answer was " + answerWas);
                System.out.println("Let's try again, " + name + "!");
                return;
            }
        }
        System.out.println("Congratulations, " + name + "!");
    }

}
