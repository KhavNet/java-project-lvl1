package hexlet.code.games;

public class Progression {
    private static final int MIN_SIZE_PROGRESSION = 5;
    private static final int MULTIPLIER_MAX_SIZE_PROGRESSION = 6;
    private static final int MULTIPLIER_FIRST_NUMBER_AND_DIFF_PROGRESSION = 50;
    public static String[] runGame() {
        int firstNumberPogression = (int) (Math.random() * MULTIPLIER_FIRST_NUMBER_AND_DIFF_PROGRESSION);
        int diffProgression = (int) (Math.random() * MULTIPLIER_FIRST_NUMBER_AND_DIFF_PROGRESSION);
        int sizeProgression = (int) (MIN_SIZE_PROGRESSION + Math.random() * MULTIPLIER_MAX_SIZE_PROGRESSION);
        int positionMask = (int) (Math.random() * sizeProgression);
        String[] dataGame = {"", "", ""};
        dataGame[2] = "What number is missing in the progression?";
        String[] questionAndAnswer = getProgression(firstNumberPogression,
                sizeProgression, diffProgression, positionMask);
        dataGame[0] = questionAndAnswer[0];
        dataGame[1] = questionAndAnswer[1];
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
