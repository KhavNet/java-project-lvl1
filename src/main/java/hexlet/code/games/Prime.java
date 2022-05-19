package hexlet.code.games;


import hexlet.code.Engine;
import hexlet.code.Utils;

public class Prime {
    private static final int VAR_FOR_MAX_RANDOM_NUMBER = 10;
    private static final int START_FIND_PRIME = 3;
    private static final String GAME_TASK = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";

    public static void runGame() {
        Engine.letsPlay(getGameData(), GAME_TASK);
    }

    private static String[][] getGameData() {
        String[][] dataGame = new String[Engine.RIGHT_ATTEMPTS][2];

        for (int i = 0; i < Engine.RIGHT_ATTEMPTS; i++) {
            int randomNumber = Utils.getRnd(VAR_FOR_MAX_RANDOM_NUMBER, 1);

            dataGame[i][0] = Integer.toString(randomNumber);
            dataGame[i][1] = isPrime(randomNumber) ? "yes" : "no";
        }
        return dataGame;
    }

    private static boolean isPrime(int number) {
        if (number == 2) {
            return true;
        } else if ((number % 2 == 0) || (number == 1)) {
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
