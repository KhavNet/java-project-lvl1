package hexlet.code.games;


import hexlet.code.Engine;

public class Prime {
    private static final int SCOPE_RANDOM_NUMBERS = 10;
    private static final int START_FIND_PRIME = 3;
    public static void runGame() {
        Engine.letsPlay(getGameData());
    }
    private static String[][] getGameData() {
        int rightAttempts = Engine.getAttemptsCount();
        int volumeOfOneGameData = Engine.getVolumeOfOneGameData();
        String[][] dataGame = new String[rightAttempts][volumeOfOneGameData];
        for (int i = 0; i < rightAttempts; i++) {
            int randomNumber = (int) (1 + Math.random() * SCOPE_RANDOM_NUMBERS);
            dataGame[i][0] = Integer.toString(randomNumber);
            dataGame[i][1] = isItPrime(randomNumber);
            dataGame[i][2] = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
        }
        return dataGame;
    }
    private static String  isItPrime(int number) {
        if (number == 2) {
            return "yes";
        } else if ((number % 2 == 0) || (number == 1)) {
            return "no";
        } else {
            for (int i = START_FIND_PRIME; i * i <= number; i += 2) {
                if (number % i == 0) {
                    return "no";
                }
            }
            return "yes";
        }
    }
}
