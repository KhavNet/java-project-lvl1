package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Progression {
    private static final int MIN_SIZE_PROGRESSION = 5;
    private static final int MULTIPLIER_MAX_SIZE_PROGRESSION = 6;
    private static final int VAR_FOR_MAX_RANDOM_NUMBER = 50;
    private static final String GAME_TASK = "What number is missing in the progression?";
    public static void runGame() {
        Engine.letsPlay(getGameData());
    }
    private static String[][] getGameData() {
        String[][] dataGame = new String[Engine.RIGHT_ATTEMPTS][];
        for (int i = 0; i < Engine.RIGHT_ATTEMPTS; i++) {
            dataGame[i] = i == 0
                    ? new String[] {"", "", GAME_TASK}
                    : new String[] {"", ""};
            int firstNumberProgression = Utils.getRnd(VAR_FOR_MAX_RANDOM_NUMBER);
            int diffProgression = Utils.getRnd(VAR_FOR_MAX_RANDOM_NUMBER);
            int sizeProgression = Utils.getRnd(MULTIPLIER_MAX_SIZE_PROGRESSION, MIN_SIZE_PROGRESSION);
            int positionMask = Utils.getRnd(sizeProgression);
            String[] progression = getProgression(firstNumberProgression, sizeProgression, diffProgression);
            dataGame[i][1] = progression[positionMask];
            progression[positionMask] = "..";
            dataGame[i][0] = String.join(" ", progression);
        }
        return dataGame;
    }
    private static String[] getProgression(int firstNumber, int size, int diff) {
        String[] arrayProgression = new String[size];
        for (int i = 0; i < size; i++) {
            arrayProgression[i] = Integer.toString(firstNumber + i * diff);
        }
        return arrayProgression;
    }
}
