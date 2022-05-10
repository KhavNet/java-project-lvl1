package hexlet.code.games;

import java.util.Scanner;

public class Progression {
    private static final int MIN_SIZE_PROGRESSION = 5;
    private static final int MULTIPLIER_MAX_SIZE_PROGRESSION = 6;
    private static final int MULTIPLIER_FIRST_NUMBER_AND_DIFF_PROGRESSION = 50;
    public static boolean getResult(Scanner sc) {
        int firstNumberPogression = (int) (Math.random() * MULTIPLIER_FIRST_NUMBER_AND_DIFF_PROGRESSION);
        int diffProgression = (int) (Math.random() * MULTIPLIER_FIRST_NUMBER_AND_DIFF_PROGRESSION);
        int sizeProgression = (int) (MIN_SIZE_PROGRESSION + Math.random() * MULTIPLIER_MAX_SIZE_PROGRESSION);
        int positionMask = (int) (Math.random() * sizeProgression);
        boolean result;
        String[] rightAnswer = getProgression(firstNumberPogression, sizeProgression, diffProgression, positionMask);
        System.out.println("Question: " + rightAnswer[0]);
        var key = sc.next();
        if (key.equals(rightAnswer[1])) {
            result = true;
        } else {
            System.out.println("'" + key + "'" + " is wrong answer ;(. Correct answer was " + "'"
                    + rightAnswer[1] + "'");
            result = false;
        }
        return result;
    }
    private static String[] getProgression(int firstNumber, int size, int diff, int mask) {
        int value = firstNumber;
        String[] arrayProgressionAndMask = new String[2];
        String strProgression = "";
        for (int i = 0; i < size; i++) {
            if (i == mask) {
                strProgression = (strProgression + " .. ");
                arrayProgressionAndMask[1] = Integer.toString(value);
            } else {
                strProgression = (strProgression + " " + value + " ");
            }
            value += diff;
        }
        arrayProgressionAndMask[0] = strProgression;
        return arrayProgressionAndMask;
    }
}
