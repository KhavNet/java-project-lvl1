package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Even {

    private static final int VAR_FOR_MAX_RANDOM_NUMBER = 100;
    private static final String GAME_TASK = "Answer 'yes' if the number is even, otherwise answer 'no'.";

    public static void runGame() {
        Engine.letsPlay(getGameData(), GAME_TASK);
    }
    private static String[][] getGameData() {
        String[][] dataGame = new String[Engine.RIGHT_ATTEMPTS][2];

        for (int i = 0; i < Engine.RIGHT_ATTEMPTS; i++) {
            int randomNumber = Utils.getRnd(VAR_FOR_MAX_RANDOM_NUMBER);

            dataGame[i][0] = Integer.toString(randomNumber);
            dataGame[i][1] = randomNumber % 2 == 0 ? "yes" : "no";
        }
        return dataGame;
    }
}
