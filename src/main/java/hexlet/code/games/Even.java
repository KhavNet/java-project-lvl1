package hexlet.code.games;

import hexlet.code.Engine;

public class Even {
    private static final int SCOPE_RANDOM_NUMBERS = 100;
    public static void runGame() {
        Engine.letsPlay(getGameData());
    }
    private static String[][] getGameData() {
        int volumeOfOneGameData = Engine.getVolumeOfOneGameData();
        int rightAttempts = Engine.getAttemptsCount();
        String[][] dataGame = new String[rightAttempts][volumeOfOneGameData];
        for (int i = 0; i < rightAttempts; i++) {
            int randomNumber = (int) (Math.random() * SCOPE_RANDOM_NUMBERS);
            dataGame[i][0] = Integer.toString(randomNumber);
            dataGame[i][1] = randomNumber % 2 == 0 ? "yes" : "no";
            dataGame[i][2] = "Answer 'yes' if the number is even, otherwise answer 'no'.";
        }
        return dataGame;
    }
}
