package hexlet.code.games;

import java.util.Scanner;

public class Calc {
    public static final int SCOPE_RANDOM_NUMBERS = 100;
    public static final int SCOPE_RANDOM_NUMBERS2 = 3;
    private static int rightAnswer;
    public static boolean getResult(Scanner sc) {
        boolean result;
        int randomNumber1 = (int) (Math.random() * SCOPE_RANDOM_NUMBERS);
        int randomNumber2 = (int) (Math.random() * SCOPE_RANDOM_NUMBERS);
        int randomNumberForOperation = (int) (Math.random() * SCOPE_RANDOM_NUMBERS2);
        switch (randomNumberForOperation) {
            case 0:
                System.out.println("Question: " + randomNumber1 + " + " + randomNumber2);
                rightAnswer = randomNumber1 + randomNumber2;
                break;
            case 1:
                System.out.println("Question: " + randomNumber1 + " - " + randomNumber2);
                rightAnswer = randomNumber1 - randomNumber2;
                break;
            case 2:
                System.out.println("Question: " + randomNumber1 + " * " + randomNumber2);
                rightAnswer = randomNumber1 * randomNumber2;
                break;
            default:
                break;
        }
        var key = sc.next();
        if (key.equals(Integer.toString(rightAnswer))) {
            result = true;
        } else {
            System.out.println("'" + key + "'" + " is wrong answer ;(. Correct answer was " + "'" + rightAnswer + "'");
            result = false;
        }
        return result;
    }
}
