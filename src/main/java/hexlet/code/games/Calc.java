package hexlet.code.games;

import hexlet.code.Engine;

public class Calc {
    private static final int SCOPE_RANDOM_NUMBERS = 100;
    private static final int SCOPE_RANDOM_NUMBERS2 = 3;
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
            int randomNumberForOperation = (int) (Math.random() * SCOPE_RANDOM_NUMBERS2);
            switch (randomNumberForOperation) {
                case 0:
                    dataGame[i][0] = randomNumber1 + " + " + randomNumber2;
                    dataGame[i][1] = Integer.toString(randomNumber1 + randomNumber2);
                    break;
                case 1:
                    dataGame[i][0] = randomNumber1 + " - " + randomNumber2;
                    dataGame[i][1] = Integer.toString(randomNumber1 - randomNumber2);
                    break;
                case 2:
                    dataGame[i][0] = randomNumber1 + " * " + randomNumber2;
                    dataGame[i][1] = Integer.toString(randomNumber1 * randomNumber2);
                    break;
                default:
                    System.out.println("Unknown operation number:" + randomNumberForOperation);
                    break;
            }
            dataGame[i][2] = "What is the result of the expression?";
        }
        return dataGame;
    }
}
