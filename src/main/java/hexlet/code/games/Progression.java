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
        String[] questionAndAnswer = getProgression(firstNumberPogression,
                sizeProgression, diffProgression, positionMask);
        System.out.println("Question: " + questionAndAnswer[0]);
        var key = sc.next();
        if (key.equals(questionAndAnswer[1])) {
            result = true;
        } else {
            System.out.println("'" + key + "'" + " is wrong answer ;(. Correct answer was " + "'"
                    + questionAndAnswer[1] + "'");
            result = false;
        }
        return result;
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
