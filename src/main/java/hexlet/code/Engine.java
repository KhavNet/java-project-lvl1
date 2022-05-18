package hexlet.code;

import java.util.Scanner;

public class Engine {
    private static final int RIGHT_ATTEMPTS = 3;
    private static Scanner sc = new Scanner(System.in);
    public static void letsPlay(String[][] dataGame) {
        String name = getName();
        System.out.println(dataGame[0][2]);
        for (int i = 0; i < RIGHT_ATTEMPTS; i++) {
            System.out.println("Question: " + dataGame[i][0]);
            System.out.print("Your answer: ");
            String pressKey = sc.next();
            if (pressKey.equals(dataGame[i][1])) {
                System.out.println("Correct!");
            } else {
                System.out.println("'" + pressKey + "'" + " is wrong answer ;(. Correct answer was " + dataGame[i][1]);
                System.out.println("Let's try again, " + name + "!");
                return;
            }
        }
        System.out.println("Congratulations, " + name + "!");
    }
    public static String getName() {
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        String name = sc.next();
        System.out.println("Hello, " + name + "!");
        return name;
    }
    public static int getAttemptsCount() {
        return RIGHT_ATTEMPTS;
    }
}
