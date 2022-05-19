package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class GCD {

    private static final int VAR_FOR_MAX_RANDOM_NUMBER = 100;
    private static final String GAME_TASK = "Find the greatest common divisor of given numbers.";

    public static void runGame() {
        Engine.letsPlay(getGameData(), GAME_TASK);
    }

    private static String[][] getGameData() {
        String[][] dataGame = new String[Engine.RIGHT_ATTEMPTS][2];

        for (int i = 0; i < Engine.RIGHT_ATTEMPTS; i++) {
            int randomNumber1 = Utils.getRnd(VAR_FOR_MAX_RANDOM_NUMBER);
            int randomNumber2 = Utils.getRnd(VAR_FOR_MAX_RANDOM_NUMBER);

            dataGame[i][0] = randomNumber1 + " " + randomNumber2;
            dataGame[i][1] = Integer.toString(gcd(randomNumber1, randomNumber2));
        }
        return dataGame;
    }

    private static int gcd(int number1, int number2) {
        if (number2 == 0) {
            return number1;
        }
        return gcd(number2, number1 % number2);
    }
}

