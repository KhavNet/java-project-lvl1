package hexlet.code.games;

import java.util.Scanner;

public class GCD {
    public static final int SCOPE_RANDOM_NUMBERS = 100;
    public static boolean getResult(Scanner sc) {
        boolean result;
        int randomNumber1 = (int) (Math.random() * SCOPE_RANDOM_NUMBERS);
        int randomNumber2 = (int) (Math.random() * SCOPE_RANDOM_NUMBERS);
        System.out.println("Question: " + randomNumber1 + " " + randomNumber2);
        var key = sc.next();
        int rightAnswer = getGCD(randomNumber1, randomNumber2);
        if (key.equals(Integer.toString(rightAnswer))) {
            result = true;
        } else {
            System.out.println("'" + key + "'" + " is wrong answer ;(. Correct answer was " + "'" + rightAnswer + "'");
            result = false;
        }
        return result;
    }
    public static int getGCD(int number1, int number2) {
        if (number2 == 0) {
            return number1;
        }
        return getGCD(number2, number1 % number2);
    }
}

