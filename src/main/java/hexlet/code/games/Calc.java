package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Calc {
    private static final int VAR_FOR_MAX_RANDOM_NUMBER1 = 100;
    private static final int VAR_FOR_MAX_RANDOM_NUMBER2 = 3;
    private static final String GAME_TASK = "What is the result of the expression?";
    public static void runGame() {
        Engine.letsPlay(getGameData());
    }
    private static String[][] getGameData() {
        String[][] dataGame = new String[Engine.RIGHT_ATTEMPTS][];
        for (int i = 0; i < Engine.RIGHT_ATTEMPTS; i++) {
            dataGame[i] = i == 0
                    ? new String[] {"", "", GAME_TASK}
                    : new String[] {"", ""};
            int randomNumber1 = Utils.getRnd(VAR_FOR_MAX_RANDOM_NUMBER1);
            int randomNumber2 = Utils.getRnd(VAR_FOR_MAX_RANDOM_NUMBER1);
            int randomNumberForOperation = Utils.getRnd(VAR_FOR_MAX_RANDOM_NUMBER2);
            switch (randomNumberForOperation) {
                case 0 -> {
                    dataGame[i][0] = randomNumber1 + " + " + randomNumber2;
                    dataGame[i][1] = Integer.toString(randomNumber1 + randomNumber2);
                }
                case 1 -> {
                    dataGame[i][0] = randomNumber1 + " - " + randomNumber2;
                    dataGame[i][1] = Integer.toString(randomNumber1 - randomNumber2);
                }
                case 2 -> {
                    dataGame[i][0] = randomNumber1 + " * " + randomNumber2;
                    dataGame[i][1] = Integer.toString(randomNumber1 * randomNumber2);
                }
                default -> throw new Error("Unknown operation number:" + randomNumberForOperation);
            }
        }
        return dataGame;
    }
}
