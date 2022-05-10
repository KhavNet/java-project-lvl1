package hexlet.code.games;

import java.util.Scanner;

public class Prime {
    private static final int SCOPE_RANDOM_NUMBERS = 10;
    private static final int START_FIND_PRIME = 3;
    public static boolean getResult(Scanner sc) {
        boolean result;
        int randomNumber = (int) (1 + Math.random() * SCOPE_RANDOM_NUMBERS);
        System.out.println("Question: " + randomNumber);
        String key = sc.next();
        boolean rightAnswer1 = (key.equals("yes")) && (isItPrime(randomNumber));
        boolean rightAnswer2 = (key.equals("no")) && (!isItPrime(randomNumber));
        if (rightAnswer1 || rightAnswer2) {
            result = true;
        } else {
            String answerWas = isItPrime(randomNumber) ? "'yes'" : "'no'";
            System.out.println("'" + key + "'" + " is wrong answer ;(. Correct answer was " + answerWas);
            result = false;
        }
        return result;
    }
    private static boolean isItPrime(int number) {
        if (number <= 2) {
            return true;
        } else if (number % 2 == 0) {
            return false;
        } else {
            for (int i = START_FIND_PRIME; i * i <= number; i += 2) {
                if (number % i == 0) {
                    return false;
                }
            }
            return true;
        }
    }
}
