package hexlet.code.games;

import hexlet.code.Engine;

public class GCD {
    private static final int SCOPE_RANDOM_NUMBERS = 100;
    public static void runGame() {
        Engine.letsPlay(getGameData());
    }
    private static String[][] getGameData() {
        int volumeOfOneGameData = Engine.getVolumeOfOneGameData();
        int rightAttempts = Engine.getAttemptsCount();
        String[][] dataGame = new String[rightAttempts][volumeOfOneGameData];
        for (int i = 0; i < rightAttempts; i++) {
            int randomNumber1 = (int) (Math.random() * SCOPE_RANDOM_NUMBERS);
            int randomNumber2 = (int) (Math.random() * SCOPE_RANDOM_NUMBERS);
            dataGame[i][0] = randomNumber1 + " " + randomNumber2;
            dataGame[i][1] = Integer.toString(getGCD(randomNumber1, randomNumber2));
            dataGame[i][2] = "Find the greatest common divisor of given numbers.";
        }
        return dataGame;
    }
    public static int getGCD(int number1, int number2) {
        if (number2 == 0) {
            return number1;
        }
        return getGCD(number2, number1 % number2);
    }
}

