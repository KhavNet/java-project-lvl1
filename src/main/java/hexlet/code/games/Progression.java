package hexlet.code.games;

import hexlet.code.Engine;

public class Progression {
    private static final int MIN_SIZE_PROGRESSION = 5;
    private static final int MULTIPLIER_MAX_SIZE_PROGRESSION = 6;
    private static final int MULTIPLIER_FIRST_NUMBER_AND_DIFF_PROGRESSION = 50;
    public static void runGame() {
        Engine.letsPlay(getGameData());
    }
    private static String[][] getGameData() {
        int rightAttempts = Engine.getAttemptsCount();
        String[][] dataGame = new String[rightAttempts][];
        for (int i = 0; i < rightAttempts; i++) {
            dataGame[i] = i == 0
                    ? new String[] {"", "", "What number is missing in the progression?"}
                    : new String[] {"", ""};
            int firstNumberProgression = (int) (Math.random() * MULTIPLIER_FIRST_NUMBER_AND_DIFF_PROGRESSION);
            int diffProgression = (int) (Math.random() * MULTIPLIER_FIRST_NUMBER_AND_DIFF_PROGRESSION);
            int sizeProgression = (int) (MIN_SIZE_PROGRESSION + Math.random() * MULTIPLIER_MAX_SIZE_PROGRESSION);
            int positionMask = (int) (Math.random() * sizeProgression);
            String[] questionAndAnswer = getProgression(firstNumberProgression,
                    sizeProgression, diffProgression, positionMask);
            dataGame[i][0] = questionAndAnswer[0];
            dataGame[i][1] = questionAndAnswer[1];
        }
        return dataGame;
    }
    private static String[] getProgression(int firstNumber, int size, int diff, int mask) {
        int value = firstNumber;
        String[] resArrayProgressionAndMask = new String[2];
        String[] arrayProgression = new String[size];
        for (int i = 0; i < size; i++) {
            if (i == mask) {
                arrayProgression[i] = "..";
                resArrayProgressionAndMask[1] = Integer.toString(value);
            } else {
                arrayProgression[i] = Integer.toString(value);
            }
            value += diff;
        }
        resArrayProgressionAndMask[0] = String.join(" ", arrayProgression);
        return resArrayProgressionAndMask;
    }
}
