package hexlet.code.games;

import java.util.Scanner;

public class Even {
    public static final int SCOPE_RANDOM_NUMBERS = 100;
    public static boolean getResult(Scanner sc) {
        boolean result;
        int randomNumber = (int) (Math.random() * SCOPE_RANDOM_NUMBERS);
        System.out.println("Question: " + randomNumber);
        String key = sc.next();
        boolean rightAnswer1 = (key.equals("yes")) && (randomNumber % 2 == 0);
        boolean rightAnswer2 = (key.equals("no")) && (randomNumber % 2 != 0);
        if (rightAnswer1 || rightAnswer2) {
            result = true;
        } else {
            String answerWas = randomNumber % 2 == 0 ? "'yes'" : "'no'";
            System.out.println("'" + key + "'" + " is wrong answer ;(. Correct answer was " + answerWas);
            result = false;
        }
        return result;
    }
}
