package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.Even;
import hexlet.code.games.Greet;

import java.util.Scanner;

public class Engine {
    private static final int RIGHT_ATTEMPTS = 3;
    private static boolean result;
    public static void runGame(String key, Scanner sc) {
        String name = Greet.getName(sc);
        switch (key) {
            case "2":
                System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
                break;
            case "3":
                System.out.println("What is the result of the expression?");
                break;
            default:
        }
        for (int i = 0; i < RIGHT_ATTEMPTS; i++) {
            switch (key) {
                case "2":
                    result = Even.getResult(sc);
                    break;
                case "3":
                    result = Calc.getResult(sc);
                    break;
                default:
            }
            if (!result) {
                System.out.println("Let's try again, " + name + "!");
                return;
            } else {
                System.out.println("Correct!");
            }
        }
        System.out.println("Congratulations, " + name + "!");
    }
}
